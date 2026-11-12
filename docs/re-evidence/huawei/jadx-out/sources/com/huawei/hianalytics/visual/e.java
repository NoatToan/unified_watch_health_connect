package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.hianalytics.visual.autocollect.instrument.ParamCollectorInstrumentation;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class e implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11631a;

    public e() {
        HandlerThread handlerThread = new HandlerThread("COLLECT_APP_EVENT");
        handlerThread.start();
        this.f11631a = new c(handlerThread.getLooper());
    }

    @Override // com.huawei.hianalytics.visual.g0
    public final void b(final Activity activity) {
        this.f11631a.post(new Runnable() { // from class: com.huawei.hianalytics.visual.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ParamCollectorInstrumentation.setActivityTag(activity);
            }
        });
    }

    @Override // com.huawei.hianalytics.visual.g0
    public final void onActivityPaused(Activity activity) {
        JSONObject jSONObject;
        if (w.a().c(activity.getClass().getCanonicalName())) {
            return;
        }
        if (w.a().i(activity.getClass())) {
            return;
        }
        if (w.a().a(EventType.PAGE_EXIT)) {
            return;
        }
        u uVar = u.f11699c;
        if (uVar.f11701b == null) {
            jSONObject = null;
        } else {
            uVar.f11701b.getClass();
            jSONObject = (JSONObject) b.e.get(Integer.valueOf(activity.hashCode()));
        }
        if (jSONObject == null) {
            return;
        }
        try {
            long jOptLong = jSONObject.optLong("activity_onResume_timestamp");
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
            jSONObject.remove("activity_onResume_timestamp");
            i1.a(activity, jSONObject);
            h1.a().execute(new d(activity, jSONObject));
        } catch (Exception unused) {
            HiLog.w("ActivityPageStateMonitor", "fail to report page exit event");
        }
    }

    @Override // com.huawei.hianalytics.visual.g0
    public final void onActivityResumed(Activity activity) {
        String str;
        JSONObject jSONObjectB;
        if (w.a().c(activity.getClass().getCanonicalName())) {
            return;
        }
        if (w.a().i(activity.getClass())) {
            return;
        }
        JSONObject jSONObjectB2 = null;
        if (!w.a().a(EventType.PAGE_ENTER)) {
            u uVar = u.f11699c;
            if (uVar.f11701b == null || (str = uVar.f11701b.d) == null) {
                str = "";
            }
            try {
                jSONObjectB = o0.b(activity);
                jSONObjectB.put("$current_page", activity.getClass().getCanonicalName());
                jSONObjectB.put("$last_page", str);
                i1.a(activity, jSONObjectB);
            } catch (JSONException unused) {
                HiLog.w("PageEventFactory", "build page enter data failed, JSONException");
                jSONObjectB = null;
            }
            if (jSONObjectB == null) {
                HiLog.d("ActivityPageStateMonitor", "report activity enter failed, JSONException");
            } else {
                i1.b(activity, jSONObjectB);
                w.a().a("$AppViewScreen", jSONObjectB);
            }
        }
        if (w.a().a(EventType.DEEP_LINK)) {
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null && CommonConstant.ACTION.HWID_SCHEME_URL.equals(intent.getAction()) && intent.getData() != null) {
            try {
                if (!intent.getBooleanExtra("ha_deep_link_parsed", false)) {
                    intent.putExtra("ha_deep_link_parsed", true);
                    jSONObjectB2 = o0.b(activity);
                }
            } catch (Throwable th) {
                HiLog.e("PageEventFactory", "isDeepLinkParsed error: " + th.getMessage());
            }
        }
        if (jSONObjectB2 == null) {
            return;
        }
        i1.b(activity, jSONObjectB2);
        w.a().a("$DeepLink", jSONObjectB2);
    }
}
