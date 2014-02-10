package com.example.tdd_february;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity implements OnClickListener {

	private Button buttonZero;
	private Button buttonOne;
	private Button buttonTwo;
	private Button buttonThree;
	private Button buttonFour;
	private Button buttonFive;
	private Button buttonSix;
	private Button buttonSeven;
	private Button buttonEigth;
	private Button buttonNine;

	private Button buttonAddition;
	private Button buttonSubtraction;
	private Button buttonMultiplication;
	private Button buttonDivision;

	private Button buttonClear;
	private Button buttonEqual;

	private EditText inputField;
	
	private String showNumberToUser;
	
	private int firstNumber;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);

		this.inputField = (EditText) this.findViewById(R.id.input_field);

		this.buttonZero = (Button) this.findViewById(R.id.buttonZero);
		this.buttonOne = (Button) this.findViewById(R.id.buttonOne);
		this.buttonTwo = (Button) this.findViewById(R.id.buttonTwo);
		this.buttonThree = (Button) this.findViewById(R.id.buttonThree);
		this.buttonFour = (Button) this.findViewById(R.id.buttonFour);
		this.buttonFive = (Button) this.findViewById(R.id.buttonFive);
		this.buttonSix = (Button) this.findViewById(R.id.buttonSix);
		this.buttonSeven = (Button) this.findViewById(R.id.buttonSeven);
		this.buttonEigth = (Button) this.findViewById(R.id.buttonEigth);
		this.buttonNine = (Button) this.findViewById(R.id.buttonNine);

		this.buttonAddition = (Button) this.findViewById(R.id.buttonPlus);
		this.buttonSubtraction = (Button) this.findViewById(R.id.buttonMinus);
		this.buttonMultiplication = (Button) this
				.findViewById(R.id.buttonMultiplication);
		this.buttonDivision = (Button) this.findViewById(R.id.buttonDivision);

		this.buttonClear = (Button) this.findViewById(R.id.buttonClear);
		this.buttonEqual = (Button) this.findViewById(R.id.buttonEqual);

		this.buttonZero.setOnClickListener(this);
		this.buttonOne.setOnClickListener(this);
		this.buttonTwo.setOnClickListener(this);
		this.buttonThree.setOnClickListener(this);
		this.buttonFour.setOnClickListener(this);
		this.buttonFive.setOnClickListener(this);
		this.buttonSix.setOnClickListener(this);
		this.buttonSeven.setOnClickListener(this);
		this.buttonEigth.setOnClickListener(this);
		this.buttonNine.setOnClickListener(this);

		this.buttonAddition.setOnClickListener(this);
		this.buttonSubtraction.setOnClickListener(this);
		this.buttonMultiplication.setOnClickListener(this);
		this.buttonDivision.setOnClickListener(this);

		this.buttonClear.setOnClickListener(this);
		this.buttonEqual.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		Button ButtonClicked = (Button) arg0;

		if (ButtonClicked.getId() == this.buttonAddition.getId()) {
			this.firstNumber = Integer.valueOf(this.inputField.getText().toString());
			this.inputField.setText("");

		} else if (ButtonClicked.getId() == this.buttonSubtraction.getId()) {
			this.firstNumber = Integer.valueOf(this.inputField.getText().toString());
			this.inputField.setText("");

		} else if (ButtonClicked.getId() == this.buttonMultiplication.getId()) {
			this.firstNumber = Integer.valueOf(this.inputField.getText().toString());
			this.inputField.setText("");

		} else if (ButtonClicked.getId() == this.buttonDivision.getId()) {
			this.firstNumber = Integer.valueOf(this.inputField.getText().toString());
			this.inputField.setText("");

		} else if (ButtonClicked.getId() == this.buttonClear.getId()) {

		} else if (ButtonClicked.getId() == this.buttonEqual.getId()) {
			
			int result, secondNumber = 0;
			
			secondNumber = Integer.valueOf(this.inputField.getText().toString());
			
			result = this.firstNumber + secondNumber;
			
			this.inputField.setText(String.valueOf(result));
			
			
		} else {
			this.showNumberToUser = this.inputField.getText().toString();
			this.showNumberToUser += ButtonClicked.getText().toString();
			this.inputField.setText(this.showNumberToUser);
		}

	}

}
