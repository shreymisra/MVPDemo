package org.company.mvpdemo.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.company.mvpdemo.Contract.MainActivityContract;
import org.company.mvpdemo.Presenter.MainActivityPresenter;
import org.company.mvpdemo.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private TextView text;
    private Button btn;
    private MainActivityPresenter  presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new MainActivityPresenter(this);
    }


    @Override
    public void initview() {
        text=(TextView)findViewById(R.id.text);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onClick(view);
            }
        });

    }

    @Override
    public void setviewData(String data) {
        text.setText(data);
    }
}
