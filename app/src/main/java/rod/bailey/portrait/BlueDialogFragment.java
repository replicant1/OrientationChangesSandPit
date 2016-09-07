package rod.bailey.portrait;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlueDialogFragment extends Fragment {
	
	public static final String TAG = "TAG_BLUE";
	
	private static final String LOG = BlueDialogFragment.class.getSimpleName();
	
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
		View fragmentView = inflater.inflate(R.layout.blue_fragment, container, false);
		Log.i(LOG, "ENTER: onCreateView");
		
		return fragmentView;
	}

}
