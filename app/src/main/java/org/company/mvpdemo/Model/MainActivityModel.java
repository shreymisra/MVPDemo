package org.company.mvpdemo.Model;

import org.company.mvpdemo.Contract.MainActivityContract;

/**
 * Created by shrey on 25/4/18.
 */

public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData(){
        return "Hello World";
    }
}
