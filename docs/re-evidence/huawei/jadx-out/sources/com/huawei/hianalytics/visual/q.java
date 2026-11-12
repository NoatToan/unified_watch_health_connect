package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.view.ViewGroup;
import com.huawei.hianalytics.core.log.HiLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f11682b;

    public q(Object obj, JSONObject jSONObject) {
        this.f11681a = obj;
        this.f11682b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Activity activityA = t.a(this.f11681a);
            if (activityA.getWindow() != null) {
                this.f11682b.put("$browse_depth", v1.a(v1.a((ViewGroup) activityA.getWindow().getDecorView()), activityA));
                i1.b(this.f11681a, this.f11682b);
                w.a().a("$AppViewExit", this.f11682b);
            }
        } catch (Exception unused) {
            HiLog.w("HAFPExit", "fail to report page exit event");
        }
    }
}
