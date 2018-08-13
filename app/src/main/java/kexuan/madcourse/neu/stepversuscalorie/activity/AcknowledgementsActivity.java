package kexuan.madcourse.neu.stepversuscalorie.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.orhanobut.logger.Logger;

import java.util.List;

import kexuan.madcourse.neu.stepversuscalorie.R;


public class AcknowledgementsActivity extends AppCompatActivity {
    private Button buttonClose;
    private ListView listView;
    private ImageView iv_left;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Acknowledgements");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acknowledgements);


        Resources res = getResources();
        String[] acknowledgements = res.getStringArray(R.array.acknowledgementsList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AcknowledgementsActivity.this,
                R.layout.activity_acknowlist, acknowledgements);

        listView = (ListView) findViewById(R.id.acknowledgementsList);
        listView.setFastScrollEnabled(true);
        listView.setAdapter(adapter);

        buttonClose = (Button) findViewById(R.id.buttonClose);
        // close and return to dictionary page
        buttonClose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

        iv_left = (ImageView) findViewById(R.id.iv_left);
        iv_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }



}
