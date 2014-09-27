/**
 * Author: Ravi Tamada
 * URL: www.androidhive.info
 * twitter: http://twitter.com/ravitamada
 * */
package com.example.androidhive;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableRow;

import com.example.androidhive.library.UserFunctions;

import android.content.Context;

public class DashboardActivity extends Activity {
	UserFunctions userFunctions;
	Button btnLogout;
	List<ImageView> images;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /**
         * Dashboard Screen for the application
         * */        
        // Check login status in database
        userFunctions = new UserFunctions();
        if(userFunctions.isUserLoggedIn(getApplicationContext())){
        	setContentView(R.layout.dashboard);
        	btnLogout = (Button) findViewById(R.id.btnLogout);
        	
        	btnLogout.setOnClickListener(new View.OnClickListener() {
    			
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				userFunctions.logoutUser(getApplicationContext());
    				Intent login = new Intent(getApplicationContext(), LoginActivity.class);
    	        	login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    	        	startActivity(login);
    	        	// Closing dashboard screen
    	        	finish();
    			}
    		});

        	Integer l1=0,l2=0,l3=0,l4=0,l5=0,l6=0,l7=0,l8=0,l9=0;
        	try{
        		UserFunctions userFunction = new UserFunctions();
        		JSONObject levels = userFunction.userLevel(getApplicationContext());
        		l1 = Integer.parseInt(levels.getString("level1"));
        		l2 = Integer.parseInt(levels.getString("level2"));
        		l3 = Integer.parseInt(levels.getString("level3"));
        		l4 = Integer.parseInt(levels.getString("level4"));
        		l5 = Integer.parseInt(levels.getString("level5"));
        		l6 = Integer.parseInt(levels.getString("level6"));
        		l7 = Integer.parseInt(levels.getString("level7"));
        		l8 = Integer.parseInt(levels.getString("level8"));
        		l9 = Integer.parseInt(levels.getString("level9"));
        	}catch(JSONException e){
        		e.printStackTrace();
        	}
			
        	TableRow tr1 = (TableRow)findViewById(R.id.tableRow1);
        	if(l1==0){
        		ImageView img1= (ImageView) tr1.getChildAt(0);
        		img1.setImageResource(R.drawable.ic_action_secure);
        		img1.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	if(l2==0){
        		ImageView img2= (ImageView) tr1.getChildAt(1);
        		img2.setImageResource(R.drawable.ic_action_secure);
        		img2.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	if(l3==0){
        		ImageView img3= (ImageView) tr1.getChildAt(2);
        		img3.setImageResource(R.drawable.ic_action_secure);
        		img3.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	TableRow tr2 = (TableRow)findViewById(R.id.tableRow2);
        	if(l4==0){
        		ImageView img4= (ImageView) tr2.getChildAt(0);
        		img4.setImageResource(R.drawable.ic_action_secure);
        		img4.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	if(l5==0){
        		ImageView img5= (ImageView) tr2.getChildAt(1);
        		img5.setImageResource(R.drawable.ic_action_secure);
        		img5.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	if(l6==0){
        		ImageView img6= (ImageView) tr2.getChildAt(2);
        		img6.setImageResource(R.drawable.ic_action_secure);
        		img6.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	TableRow tr3 = (TableRow)findViewById(R.id.tableRow3);
        	if(l7==0){
        		ImageView img7= (ImageView) tr3.getChildAt(0);
        		img7.setImageResource(R.drawable.ic_action_secure);
        		img7.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	if(l8==0){
        		ImageView img8= (ImageView) tr3.getChildAt(1);
        		img8.setImageResource(R.drawable.ic_action_secure);
        		img8.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	if(l9==0){
        		ImageView img9= (ImageView) tr3.getChildAt(2);
        		img9.setImageResource(R.drawable.ic_action_secure);
        		img9.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(DashboardActivity.this,DecoderActivity.class);
						startActivity(intent);
						DashboardActivity.this.finish();
					}
				});
        	}
        	
        }else{
        	// user is not logged in show login screen
        	Intent login = new Intent(getApplicationContext(), LoginActivity.class);
        	login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        	startActivity(login);
        	// Closing dashboard screen
        	finish();
        }
        
        
       
    }
}