package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12984c = new a();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f12985a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Activity> f12986b = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (d) {
            for (Activity activity2 : this.f12986b) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f12986b.add(activity);
        }
    }

    public void b(Activity activity) {
        synchronized (d) {
            this.f12986b.remove(activity);
        }
    }

    public void a(boolean z) {
        this.f12985a.set(z);
    }

    public AtomicBoolean a() {
        return this.f12985a;
    }
}
