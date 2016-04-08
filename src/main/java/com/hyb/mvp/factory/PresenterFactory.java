package com.hyb.mvp.factory;

import com.hyb.mvp.presenter.Presenter;

/**
 * @title:
 * @description:
 * @author: youbinHuang
 * @version:
 * @created: 2016-04-02 15:55
 */
public interface PresenterFactory<P extends Presenter> {
    P createPresenter();
}
