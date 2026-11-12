package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12987b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f12988c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Activity> f12989a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f12988c) {
            for (Activity activity2 : this.f12989a) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f12989a.add(activity);
        }
    }

    public void b(Activity activity) {
        synchronized (f12988c) {
            this.f12989a.remove(activity);
        }
    }
}
