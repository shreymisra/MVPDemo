package org.company.mvpdemo.Contract;

import android.view.View;

/**
 * Created by shrey on 25/4/18.
 */

public interface MainActivityContract {

    interface View{
        void initview();
        void setviewData(String data);
    }
    interface Model{
        String getData();
    }
    interface Presenter{
        void onClick(android.view.View view);
    }
}
