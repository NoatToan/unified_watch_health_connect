package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class BindingFailedResolveMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final BindingFailedResolveMgr f12960b = new BindingFailedResolveMgr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f12961c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Activity> f12962a = new ArrayList(1);

    BindingFailedResolveMgr() {
    }

    void a(Activity activity) {
        synchronized (f12961c) {
            for (Activity activity2 : this.f12962a) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f12962a.add(activity);
        }
    }

    void b(Activity activity) {
        synchronized (f12961c) {
            this.f12962a.remove(activity);
        }
    }
}
