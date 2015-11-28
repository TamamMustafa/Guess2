package com.example.majd.guess;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

        import java.util.Random;

public class MainActivity extends Activity {

    int mRandomNumber, mEnteredNumber;
    Random r;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r= new Random();
        mRandomNumber = r.nextInt(101);
        mEditText = (EditText)(findViewById(R.id.number));
    }


    public void check(View view)
    {
        mEnteredNumber = Integer.parseInt(String.valueOf(mEditText.getText()));
        if(mEnteredNumber == mRandomNumber)
            Toast.makeText(this, "Correct number, Congrates", Toast.LENGTH_SHORT).show();
        else if(mEnteredNumber > mRandomNumber)
            Toast.makeText(this, "Incorrect, try smaller number", Toast.LENGTH_SHORT).show();
        else if(mEnteredNumber < mRandomNumber)
            Toast.makeText(this, "Incorrect, try bigger number", Toast.LENGTH_SHORT).show();
    }
}
