package com.huawei.hianalytics;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.util.Pair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public static void a() {
        if (!l.a().d) {
            HiLog.i("UC", "app usage is disable");
            return;
        }
        try {
            Context appContext = EnvUtils.getAppContext();
            Pair pairA = l.a();
            pairA.getClass();
            try {
                long jA = c2.a("global_v2", "lastCollectTime", 0L);
                if (jA == 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    pairA = Pair.create(Long.valueOf(jCurrentTimeMillis - pairA.g), Long.valueOf(jCurrentTimeMillis));
                } else {
                    pairA = Pair.create(Long.valueOf(jA), Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable unused) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                pairA = Pair.create(Long.valueOf(jCurrentTimeMillis2 - pairA.g), Long.valueOf(jCurrentTimeMillis2));
            }
            HashMap mapA = new i2().a(((UsageStatsManager) appContext.getSystemService("usagestats")).queryEvents(((Long) pairA.first).longValue(), ((Long) pairA.second).longValue()));
            JSONArray jSONArray = new JSONArray();
            for (f fVar : mapA.values()) {
                if (fVar.g != 0 && fVar.d != 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("start", pairA.first);
                    jSONObject.put(TtmlNode.END, pairA.second);
                    jSONObject.put("packageName", fVar.f11488a);
                    jSONObject.put("firstTimeStamp", fVar.f11489b);
                    jSONObject.put("lastTimeStamp", fVar.f11490c);
                    jSONObject.put("launchCount", fVar.g);
                    jSONObject.put("totalTime", fVar.d);
                    jSONArray.put(jSONObject);
                }
            }
            HiLog.d("UC", "collect range " + pairA + ", size " + jSONArray.length());
            if (jSONArray.length() == 0) {
                return;
            }
            HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
            if (instanceByTag != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("usages", jSONArray);
                jSONObject2.put("version", "v2");
                instanceByTag.onEventSync(0, "102", jSONObject2);
            }
            l.a().getClass();
            c2.b("global_v2", "lastCollectTime", System.currentTimeMillis());
        } catch (Throwable th) {
            HiLog.sw("UC", "collect " + th.getMessage());
        }
    }
}
