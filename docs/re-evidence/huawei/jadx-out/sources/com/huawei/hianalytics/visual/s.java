package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.EventType;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class s implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11692a = new HashMap();

    @Override // com.huawei.hianalytics.visual.y
    public final void a(View view, Object obj) {
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void b(Object obj) {
        if (obj == null) {
            return;
        }
        d(obj);
    }

    public final void c(Object obj) {
        if (obj == null) {
            return;
        }
        if (w.a().a(EventType.PAGE_EXIT)) {
            return;
        }
        if (!w.a().b(obj.getClass())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enter_fragment_timestamp", SystemClock.elapsedRealtime());
                String canonicalName = obj.getClass().getCanonicalName();
                jSONObject.put("$current_page", canonicalName);
                jSONObject.put("$last_page", o0.f11672a);
                i1.a(t.a((Activity) null, obj), jSONObject);
                this.f11692a.put(Integer.valueOf(obj.hashCode()), jSONObject);
                o0.f11672a = canonicalName;
            } catch (Exception unused) {
                HiLog.w("HAFPExit", "fail to acquire fragment property");
            }
        }
    }

    public final void d(Object obj) {
        if (w.a().f() || obj == null) {
            return;
        }
        if (w.a().a(EventType.PAGE_EXIT)) {
            return;
        }
        if (!w.a().b(obj.getClass())) {
            int iHashCode = obj.hashCode();
            if (this.f11692a.containsKey(Integer.valueOf(iHashCode))) {
                try {
                    JSONObject jSONObject = (JSONObject) this.f11692a.get(Integer.valueOf(iHashCode));
                    if (jSONObject == null) {
                        return;
                    }
                    long jOptLong = jSONObject.optLong("enter_fragment_timestamp");
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    HashSet hashSet = i1.f11653a;
                    long j = jElapsedRealtime - jOptLong;
                    if (j < 0 || j > 86400000) {
                        j = 0;
                    }
                    if (j < 50) {
                        return;
                    }
                    jSONObject.put("$event_duration", j);
                    jSONObject.remove("enter_fragment_timestamp");
                    i1.a(obj, jSONObject);
                    h1.a().execute(new q(obj, jSONObject));
                    this.f11692a.remove(Integer.valueOf(iHashCode));
                } catch (Exception unused) {
                    HiLog.w("HAFPExit", "fail to report fragment exit");
                }
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void a(Object obj) {
        if (t.f(obj)) {
            c(obj);
        }
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void b(Object obj, boolean z) {
        if (t.f(obj)) {
            c(obj);
        } else {
            d(obj);
        }
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void a(Object obj, boolean z) {
        if (t.f(obj)) {
            c(obj);
        } else {
            d(obj);
        }
    }
}
