package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base;

import defpackage.tvu;

/* JADX INFO: loaded from: classes19.dex */
public abstract class CommonBaseMvpActivity<V, P extends tvu<V>> extends CommonBaseActivity {
    public P mPresenter;

    protected abstract P createPresenter();

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseActivity
    public void initPresenter(CommonBaseView commonBaseView) {
        super.initPresenter(commonBaseView);
        P p = (P) createPresenter();
        this.mPresenter = p;
        p.c(this);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
