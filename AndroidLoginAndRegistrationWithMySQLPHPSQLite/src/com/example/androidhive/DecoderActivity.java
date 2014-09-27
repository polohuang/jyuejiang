package com.example.androidhive;

import java.io.InputStream;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.ImageView;
import android.widget.TextView;

import com.dlazaro66.qrcodereaderview.QRCodeReaderView;
import com.dlazaro66.qrcodereaderview.QRCodeReaderView.OnQRCodeReadListener;
import com.example.androidhive.library.DatabaseHandler;
import com.example.androidhive.library.JSONParser;

public class DecoderActivity extends Activity implements OnQRCodeReadListener {

    private TextView myTextView;
	private QRCodeReaderView mydecoderview;
	private ImageView line_image;
	private JSONParser jsonParser;
	private static String loginURL = "http://140.117.71.65/android_login_api/Level.php";
	private String email="";

	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoder);
        if (android.os.Build.VERSION.SDK_INT > 8) 
	    {
	        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
	        StrictMode.setThreadPolicy(policy);
	    }
        
        mydecoderview = (QRCodeReaderView) findViewById(R.id.qrdecoderview);
        mydecoderview.setOnQRCodeReadListener(this);
        
        myTextView = (TextView) findViewById(R.id.exampleTextView);
        
        /*line_image = (ImageView) findViewById(R.id.red_line_image);
        
        TranslateAnimation mAnimation = new TranslateAnimation(
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f);
       mAnimation.setDuration(1000);
       mAnimation.setRepeatCount(-1);
       mAnimation.setRepeatMode(Animation.REVERSE);
       mAnimation.setInterpolator(new LinearInterpolator());
       line_image.setAnimation(mAnimation);*/
        
    }

    
    // Called when a QR is decoded
    // "text" : the text encoded in QR
    // "points" : points where QR control points are placed
	@Override
	public void onQRCodeRead(String text, PointF[] points) {
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		InputStream is=null;
		Intent i=null;
		DatabaseHandler db = new DatabaseHandler(getApplicationContext());
		email = db.getEmail();
		switch(text){
			case "1":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level1"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 1.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "2":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level2"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 2.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "3":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level3"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 3.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "4":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level4"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 4.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "5":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level5"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 5.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "6":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level6"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 6.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "7":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level7"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 7.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "8":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level8"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 8.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
			case "9":
				nameValuePairs.add(new BasicNameValuePair("email",email));
				nameValuePairs.add(new BasicNameValuePair("level","level9"));
				try{
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpPost httpPost = new HttpPost("http://140.117.71.65/level/Level.php");
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
					HttpResponse httpResponse = httpClient.execute(httpPost);
				}catch(Exception e){
					e.printStackTrace();
				}
				myTextView.setText("This is 9.");
				i = new Intent(DecoderActivity.this,DashboardActivity.class);
				startActivity(i);
				DecoderActivity.this.finish();
				break;
		}
	}

	
	// Called when your device have no camera
	@Override
	public void cameraNotFound() {
		
	}

	// Called when there's no QR codes in the camera preview image
	@Override
	public void QRCodeNotFoundOnCamImage() {
		
	}
    
	@Override
	protected void onResume() {
		super.onResume();
		mydecoderview.getCameraManager().startPreview();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		mydecoderview.getCameraManager().stopPreview();
	}
}
