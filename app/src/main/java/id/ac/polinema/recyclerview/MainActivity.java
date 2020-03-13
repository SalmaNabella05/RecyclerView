package id.ac.polinema.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleSimpleButton(View view) {
		Intent intent = new Intent(this, SimpleActivity.class);
		startActivity(intent);
	}

	public void handleLogoButton(View view) {
		Intent intent = new Intent(this, LogoActivity.class);
		startActivity(intent);
	}

	public void handleGridButton(View view) {
		Intent intent = new Intent(this, GridActivity.class);
		startActivity(intent);
	}

	public void handleViewTypeButton(View view) {
		Intent intent = new Intent(this, ViewTypeActivity.class);
		startActivity(intent);
	}

    public void handleExerciseButton(View view) {
        Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);
    }

    public void handleFastAdapterButton(View view) {
        Intent intent = new Intent(this, FastAdapterActivity.class);
        startActivity(intent);
    }
}
