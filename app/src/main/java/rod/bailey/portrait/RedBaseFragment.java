package rod.bailey.portrait;

import java.io.PrintWriter;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RedBaseFragment extends Fragment {

	public static final String TAG = "TAG_RED";

	private static final String LOG = RedBaseFragment.class.getSimpleName();

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.i(LOG, "ENTER: onActivityCreated");
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Log.i(LOG, "ENTER: onAttach");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(LOG, "ENTER: onDestroy");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.i(LOG, "ENTER: onDetach");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(LOG, "ENTER: onPause");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(LOG, "ENTER: onStart");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(LOG, "ENTER: onResume");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(LOG, "ENTER: onStop");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View fragmentView = inflater.inflate(R.layout.red_fragment, container, false);
		Log.i(LOG, "ENTER: onCreateView");

		Button dumpButton = (Button) fragmentView.findViewById(R.id.dump_button);
		dumpButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				getFragmentManager().dump("", null, new PrintWriter(System.out, true), null);

			}
		});

		Button invokeButton = (Button) fragmentView.findViewById(R.id.invoke_dialog_button);
		invokeButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				replaceBlueFragment();
			}
		});

		return fragmentView;
	}

	private void replaceBlueFragment() {
		Log.d(LOG, "About to REPLACE BlueDialogFragment into blue_fragment_container");

		BlueDialogFragment oldBlueFragment = (BlueDialogFragment) getFragmentManager().findFragmentByTag(BlueDialogFragment.TAG);

		Log.d(LOG, "Existinginstance of BlueDialogFragment is " + oldBlueFragment);

		if (oldBlueFragment == null) {
			BlueDialogFragment blueFragment = new BlueDialogFragment();
			FragmentTransaction tran = getFragmentManager().beginTransaction();
			tran.replace(R.id.blue_fragment_container, blueFragment, BlueDialogFragment.TAG);
			tran.commit();
		}
		else {
			Log.d(LOG,
					"Reusing existing instance of BlueDialogFragment which is "
							+ Integer.toHexString(oldBlueFragment.hashCode()));
			oldBlueFragment.dump("oldBlueFragment:", null, new PrintWriter(System.out, true), null);
			getFragmentManager().dump("", null, new PrintWriter(System.err, true), null);
		}

	}

}
