package rod.bailey.portrait;

import java.io.PrintWriter;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private static final String LOG = MainActivity.class.getSimpleName();

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(LOG, "ENTER: onDestroy");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(LOG, "ENTER: onPause");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(LOG, "ENTER: onRestart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(LOG, "ENTER: onResume");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(LOG, "ENTER: onStart");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();

		Log.i(LOG, "ENTER: onStop");
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.i(LOG, "ENTER: onCreate");
		setContentView(R.layout.activity_main);

		replaceRedFragment();

	}

	private void replaceRedFragment() {
		Log.d(LOG, "About to REPLACE RedBaseFragment into red_fragment_container");

		RedBaseFragment oldRedFragment = (RedBaseFragment) getFragmentManager().findFragmentByTag(RedBaseFragment.TAG);

		Log.d(LOG, "Existing instance of RedBaseFragment is " + oldRedFragment);

		if (oldRedFragment == null) {
			RedBaseFragment redFragment = new RedBaseFragment();
			Log.d(LOG, "Creating a new instance of RedBaseFragment " + Integer.toHexString(redFragment.hashCode()));
			FragmentTransaction tran = getFragmentManager().beginTransaction();
			tran.replace(R.id.red_fragment_container, redFragment, RedBaseFragment.TAG);
			tran.commit();
		}
		else {
			Log.d(LOG,
					"Reusing existing instance of RedBaseFragment which is "
							+ Integer.toHexString(oldRedFragment.hashCode()));
			Log.d(LOG, String.format("Reused instance of RedBaseFragment has isInLayout():%s, isRemoving():%s ",
					oldRedFragment.isInLayout(), oldRedFragment.isRemoving()));
			oldRedFragment.dump("oldRedFragment:", null, new PrintWriter(System.out, true), null);
			getFragmentManager().dump("", null, new PrintWriter(System.err, true), null);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
