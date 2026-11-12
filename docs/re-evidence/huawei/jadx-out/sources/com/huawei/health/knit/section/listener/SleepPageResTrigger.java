package com.huawei.health.knit.section.listener;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.health.knit.section.model.MarketingIdInfo;
import com.huawei.ui.commonui.floatview.SleepCheckFloatButton;
import com.huawei.ui.commonui.utils.ScrollUtil;

/* JADX INFO: loaded from: classes29.dex */
public class SleepPageResTrigger extends BasePageResTrigger {
    public SleepPageResTrigger(Context context, int i, MarketingIdInfo marketingIdInfo) {
        super(context, i, marketingIdInfo);
    }

    @Override // com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageCreated(final Activity activity, View view) {
        super.onPageCreated(activity, view);
        ScrollUtil.b(view, new ScrollUtil.ScrollStateListener() { // from class: com.huawei.health.knit.section.listener.SleepPageResTrigger.3
            @Override // com.huawei.ui.commonui.utils.ScrollUtil.ScrollStateListener
            public void stopScroll() {
                SleepCheckFloatButton.c(activity).b();
            }

            @Override // com.huawei.ui.commonui.utils.ScrollUtil.ScrollStateListener
            public void swipUp() {
                SleepCheckFloatButton.c(activity).c();
            }

            @Override // com.huawei.ui.commonui.utils.ScrollUtil.ScrollStateListener
            public void swipDown() {
                SleepCheckFloatButton.c(activity).c();
            }
        });
        SleepCheckFloatButton.c(activity).a();
    }

    @Override // com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
    public void onDestroy(Activity activity) {
        super.onDestroy(activity);
        if (activity == null) {
            return;
        }
        SleepCheckFloatButton.c(activity).e(activity);
    }
}
