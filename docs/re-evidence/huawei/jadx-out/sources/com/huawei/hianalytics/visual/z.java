package com.huawei.hianalytics.visual;

import android.app.Activity;
import com.huawei.hianalytics.visual.autocollect.EventType;

/* JADX INFO: loaded from: classes33.dex */
public final class z implements g0 {
    @Override // com.huawei.hianalytics.visual.g0
    public final void a(Activity activity) {
        if (w.a().a(EventType.APP_NOTICE)) {
            return;
        }
        u0.a().a(activity.getIntent());
    }

    @Override // com.huawei.hianalytics.visual.g0
    public final void onActivityStarted(Activity activity) {
        if (w.a().a(EventType.APP_NOTICE)) {
            return;
        }
        u0.a().a(activity.getIntent());
    }
}
