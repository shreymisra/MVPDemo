package org.company.mvpdemo.Presenter;




import org.company.mvpdemo.Contract.MainActivityContract;
import org.company.mvpdemo.Model.MainActivityModel;

/**
 * Created by shrey on 25/4/18.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View mview;
    private MainActivityModel model;

    public MainActivityPresenter(MainActivityContract.View view){
        mview=view;
        initPresenter();
    }
    private void initPresenter(){
        model=new MainActivityModel();
        mview.initview();
    }
    @Override
    public void onClick(android.view.View view)
    {
        String  data=model.getData();
        mview.setviewData(data);
    }
}
