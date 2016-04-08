package com.hyb.mvp.factory;

import com.hyb.mvp.presenter.Presenter;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @title:
 * @description:
 * @author: youbinHuang
 * @version:
 * @created: 2016-04-02 15:50
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPresenter {
    Class<? extends Presenter> value();
}
