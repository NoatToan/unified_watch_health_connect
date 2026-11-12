package com.huawei.ui.main.stories.fitness.activity.coresleep.utils;

import android.content.Context;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.listener.HealthPageResTrigger;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepBootMaskingLayerView;
import defpackage.lsy;
import defpackage.uck;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseBootPagerHelper {
    protected SleepBootMaskingLayerView mBootPageView;
    protected LinearLayout mContainer;
    protected Context mContext;
    protected HealthPageResTrigger mHealthPageResTrigger;

    protected abstract void configBootPage(LinearLayout linearLayout);

    protected abstract String getSharePreferenceString();

    public BaseBootPagerHelper(Context context) {
        this.mContext = context;
    }

    public void showBootPage(final LinearLayout linearLayout) {
        if (linearLayout == null && this.mContainer == null) {
            return;
        }
        lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper.1
            @Override // java.lang.Runnable
            public void run() {
                String sharePreferenceString = BaseBootPagerHelper.this.getSharePreferenceString();
                String strC = uck.c(BaseBootPagerHelper.this.mContext, sharePreferenceString);
                if (!"default_value".equals(strC) && !String.valueOf(true).equals(strC)) {
                    if (BaseBootPagerHelper.this.mHealthPageResTrigger != null) {
                        BaseBootPagerHelper.this.mHealthPageResTrigger.setIsFirstEntryNoDataSleep(false);
                    }
                } else {
                    BaseBootPagerHelper.this.showBootPageInner(linearLayout);
                    uck.d(BaseBootPagerHelper.this.mContext, sharePreferenceString, String.valueOf(false));
                }
            }
        });
    }

    public void showBootPageInner(final LinearLayout linearLayout) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper.5
                @Override // java.lang.Runnable
                public void run() {
                    BaseBootPagerHelper.this.showBootPageInner(linearLayout);
                }
            });
            return;
        }
        if (this.mContainer == null) {
            configBootPage(linearLayout);
        }
        SleepBootMaskingLayerView sleepBootMaskingLayerView = this.mBootPageView;
        if (sleepBootMaskingLayerView != null) {
            sleepBootMaskingLayerView.setVisibility(0);
        }
    }

    public void setHealthPageResTrigger(HealthPageResTrigger healthPageResTrigger) {
        this.mHealthPageResTrigger = healthPageResTrigger;
    }
}
