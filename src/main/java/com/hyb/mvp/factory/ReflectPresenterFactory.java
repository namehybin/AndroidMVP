package com.hyb.mvp.factory;

import com.hyb.mvp.presenter.Presenter;

/**
 * @title:
 * @description:
 * @author: youbinHuang
 * @version:
 * @created: 2016-04-02 15:58
 */
public class ReflectPresenterFactory<P extends Presenter> implements PresenterFactory<P> {

    private Class<P> presenterClass;

    public ReflectPresenterFactory(Class<P> presenterClass) {
        this.presenterClass = presenterClass;
    }

    /**
     * 根据V对应的注解获取P
     *
     * @param pClass V
     * @param <P>
     * @return
     */
    public static <P extends Presenter> ReflectPresenterFactory<P> fromViewClass(Class<P> pClass) {
        RequiresPresenter annotation = pClass.getAnnotation(RequiresPresenter.class);
        Class<P> presenterClass = annotation == null ? null : (Class<P>) annotation.value();
        return presenterClass == null ? null : new ReflectPresenterFactory<>(presenterClass);
    }

    @Override
    public P createPresenter() {
        try {
            return presenterClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
