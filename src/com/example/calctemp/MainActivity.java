package com.example.calctemp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText edtValor;
	private TextView lblResultado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtValor = (EditText)findViewById(R.id.edtValor);
		lblResultado = (TextView)findViewById(R.id.lblResultado);
	
	}
	
	public void calculaTemperatura(View v){
		
		Double fahrenheit = 0.0;
		Double celcius = Double.parseDouble(edtValor.getText().toString());
		
		fahrenheit = celcius * 1.8 + 32;
		lblResultado.setText(String.valueOf(fahrenheit)+" graus Fahrenheit");
		
	}
}
