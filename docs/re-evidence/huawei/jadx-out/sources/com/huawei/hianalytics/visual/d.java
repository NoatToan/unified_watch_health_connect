package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.view.ViewGroup;
import com.huawei.hianalytics.core.log.HiLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f11628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f11629b;

    public d(Activity activity, JSONObject jSONObject) {
        this.f11628a = activity;
        this.f11629b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f11628a.getWindow() == null) {
                return;
            }
            this.f11629b.put("$browse_depth", v1.a(v1.a((ViewGroup) this.f11628a.getWindow().getDecorView()), this.f11628a));
            i1.b(this.f11628a, this.f11629b);
            w.a().a("$AppViewExit", this.f11629b);
        } catch (Exception unused) {
            HiLog.w("ActivityPageStateMonitor", "fail to report page exit event");
        }
    }
}
