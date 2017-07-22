package com.BloodPressure;

import java.util.Map;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 
 * @name ?????????????
 * @descripation BluetoothHC503
 * @author ??????
 * @date 2014-3-22
 * @version 1.0
 */
public class BloodPressureHandler extends Handler {
	
	private Context context;
	private EditText txtHighBlood; // ??(mmHg)1
	private EditText txtLowBlood; // ??(mmHg)2
	private EditText txtRate; // ????
	
	public BloodPressureHandler(Context context){
		this.context = context;	
	}
	public void handleMessage(Message msg) {
		//???????��????obj??Map<> bluetoothMeasureData
		Map<String, String> bluetoothMeasureData = (Map) msg.obj;
		if (bluetoothMeasureData == null || bluetoothMeasureData.isEmpty())
			return;
		String errorInfo = bluetoothMeasureData.get("errorInfo");
		Log.i("??????????????", bluetoothMeasureData.get("highBloodMeasure"));
		Log.i("??????????????", bluetoothMeasureData.get("lowBloodMeasure"));
		Log.i("????????????", bluetoothMeasureData.get("pulseRate"));
		Log.i("???????", bluetoothMeasureData.get("errorInfo"));
	}

}
