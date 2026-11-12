package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base;

import android.util.Log;
import defpackage.tvu;

/* JADX INFO: loaded from: classes43.dex */
public abstract class CommonBaseMvpFragment<V, P extends tvu<V>> extends CommonBaseFragment {
    private static final String TAG = "BaseMvpFragment";
    protected P mPresenter;

    protected abstract P createPresenter();

    public CommonBaseMvpFragment() {
        Log.d(TAG, "constructor");
        P p = (P) createPresenter();
        this.mPresenter = p;
        p.c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mPresenter.d();
    }
}
