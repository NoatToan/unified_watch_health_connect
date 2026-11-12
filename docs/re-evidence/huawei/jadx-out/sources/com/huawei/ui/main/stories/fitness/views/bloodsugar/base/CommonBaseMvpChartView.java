package com.huawei.ui.main.stories.fitness.views.bloodsugar.base;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface;
import defpackage.tvu;

/* JADX INFO: loaded from: classes19.dex */
public abstract class CommonBaseMvpChartView<P extends tvu<LineChartViewInterface>> extends CommonBaseChartView implements LineChartViewInterface {
    private static final String TAG = "CommonBaseMvpChartView";
    public P mPresenter;

    protected abstract P createPresenter();

    public CommonBaseMvpChartView(Context context) {
        super(context);
        init();
    }

    public CommonBaseMvpChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CommonBaseMvpChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void init() {
        Log.d(TAG, "constructor");
        P p = (P) createPresenter();
        this.mPresenter = p;
        if (p != null) {
            p.c(this);
        }
    }

    public void onDestroy() {
        this.mPresenter.d();
    }
}
