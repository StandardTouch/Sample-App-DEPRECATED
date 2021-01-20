package mgks.os.webview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);

//		int SPLASH_TIME_OUT = 1000;

		new Handler().postDelayed(new Runnable() {


//			  Showing splash screen with a timer. This will be useful when you
//			  want to show case your app logo / company


			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent i = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(i);
				finish();
			}
		}, 1000);
	}
}


//picked up from internet
	/*	Handler handler = new Handler();

		final Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent i = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(i);
				finish();
			}
		};
		handler.postDelayed(runnable, 10);
	}*/




//----------------code picked up from internet by me------------------------
/*public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}

}*/

//--------code for autorefresh-------
/*private final Handler handler = new Handler();

private void doTheAutoRefresh() {
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				// Write code for your refresh logic

				doTheAutoRefresh();
			}
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_main);

				doTheAutoRefresh();
			}
		}, 5000);
	}
*/


//----------------second code picked up from internet------------------------
/*public class SplashScreen extends Activity implements Runnable {

	Thread mThread;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.splashScreen);
		mThread = new Thread(this);

		mThread.start();
	}

	@Override
	public void run(){
		try {
			Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			startActivity(new Intent(getApplicationContext(), MainActivity.class));

			finish();
		}
	}
}
*/

