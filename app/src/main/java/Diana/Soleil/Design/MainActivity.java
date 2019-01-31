package Diana.Soleil.Design;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.CountDownTimer;
import android.provider.ContactsContract;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    // Rounded Image
    //
/*    imageView = (ImageView) findViewById(R.id.imageView);
    Resources res = getResources();
    Bitmap src = BitmapFactory.decodeResource(res, R.raw.bart);
    RoundedBitmapDrawable dr =
            RoundedBitmapDrawableFactory.create(res, src);
        dr.setCircular(true);
    //dr.setCornerRadius(Math.min(dr.getMinimumWidth(), dr.getMinimumHeight()) / 2.0f);
        imageView.setImageDrawable(dr);*/


    // Timer CountDown
    //
/*    textView = (TextView) findViewById(R.id.textView);
        new CountDownTimer(30000, 1000) {

        public void onTick(long millisUntilFinished) {
            textView.setText(String.valueOf(millisUntilFinished / 1000));
        }

        public void onFinish() {
            textView.setText("done!");
        }
    }.start();*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
