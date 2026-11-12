package com.huawei.hianalytics;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends e2 {
    public static long d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11485c;

    public e(m0 m0Var, String str) {
        super(m0Var, str);
        this.f11485c = new ArrayList();
    }

    @Override // com.huawei.hianalytics.e2
    public final void a() {
    }

    public final /* synthetic */ void b(Bundle bundle) {
        try {
            String string = bundle.getString("toPackage");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            a(bundle.getString("fromPackage"), string);
        } catch (Throwable th) {
            HiLog.i("CC1", "cache " + th.getMessage());
        }
    }

    @Override // com.huawei.hianalytics.e2
    public final void a(final Bundle bundle) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - d > 5000) {
            d = jCurrentTimeMillis;
            if (!r1.a()) {
                j1.a().b();
                this.f11486a.removeMessages(5);
                this.f11486a.sendEmptyMessage(5);
            }
        }
        if (System.currentTimeMillis() - c2.a("global_v2", "lastReportTime", 0L) >= l.a().g) {
            this.f11486a.removeMessages(4);
            this.f11486a.sendEmptyMessageDelayed(4, ((long) new Random().nextInt(30)) * 1000);
        }
        if (g0.f11539a[0].equals(this.f11487b) && l.a().f11571b) {
            TaskThread.getRecordThread().addToQueue(new Runnable() { // from class: com.huawei.hianalytics.e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(bundle);
                }
            });
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.f11485c.isEmpty()) {
                return;
            }
            try {
                HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
                if (instanceByTag != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (d dVar : this.f11485c) {
                        dVar.getClass();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("from", dVar.f11480a);
                        jSONObject.put("to", dVar.f11481b);
                        jSONObject.put("time", dVar.f11482c);
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("apps", jSONArray);
                    jSONObject2.put("version", "v2");
                    instanceByTag.onEventSync(0, "100", jSONObject2);
                }
            } catch (Throwable th) {
                HiLog.i("CC1", "flush fail: " + th.getMessage());
            }
            this.f11485c.clear();
        }
    }

    public final void a(String str, String str2) {
        synchronized (this) {
            this.f11486a.removeMessages(3);
            this.f11485c.add(new d(str, str2, System.currentTimeMillis()));
            if (this.f11485c.size() >= l.a().j) {
                b();
            } else {
                this.f11486a.sendEmptyMessageDelayed(3, l.a().k);
            }
        }
    }
}
