package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.transport.Utils;
import com.huawei.hianalytics.framework.listener.IHAEventListener;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements IHAEventListener {
    public static void a(HiAnalyticsInstance hiAnalyticsInstance, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = c2.a("global_v2", a(str, "send_retry_info"));
        if (TextUtils.isEmpty(strA)) {
            c2.a("global_v2", a(str, "send_retry_info"), jCurrentTimeMillis + ",1");
            return;
        }
        String[] strArrSplit = strA.split(",");
        long stringToLong = Utils.parseStringToLong(strArrSplit[0]);
        String str3 = strArrSplit[1];
        if (jCurrentTimeMillis - stringToLong <= 43200000) {
            long stringToLong2 = Utils.parseStringToLong(str3);
            c2.a("global_v2", a(str, "send_retry_info"), stringToLong + "," + (stringToLong2 + 1));
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("$content", str3);
        linkedHashMap.put("$tag", str);
        hiAnalyticsInstance.onEvent(1, str2, linkedHashMap);
        c2.a("global_v2", a(str, "send_retry_info"), jCurrentTimeMillis + ",0");
    }

    @Override // com.huawei.hianalytics.framework.listener.IHAEventListener
    public final void metricReport(String str) {
        m0 m0Var;
        try {
            if (j1.a().r.contains(str) && (m0Var = f0.f11493c) != null && f0.b() && !r1.a()) {
                m0Var.removeMessages(5);
                m0Var.sendEmptyMessage(5);
            }
        } catch (Throwable unused) {
            HiLog.w("HAEL", "metric report failed");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    @Override // com.huawei.hianalytics.framework.listener.IHAEventListener
    public final void onEvent(String str, String str2, String str3) {
        HiAnalyticsInstance instanceByTag;
        byte b2;
        if ("ha_default_collection".equals(str) || (instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection")) == null) {
            return;
        }
        try {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1403792647) {
                if (iHashCode == 1274936771 && str2.equals("$discard_list")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("$retry_list")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    return;
                }
                a(instanceByTag, str, str2);
            } else {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("$content", str3);
                linkedHashMap.put("$tag", str);
                instanceByTag.onEvent(1, str2, linkedHashMap);
            }
        } catch (Exception unused) {
            HiLog.w("HAEL", "fail to on ha event");
        }
    }

    @Override // com.huawei.hianalytics.framework.listener.IHAEventListener
    public final void onReport(String str) {
        if ("ha_default_collection".equals(str)) {
            return;
        }
        try {
            if (System.currentTimeMillis() - c2.a("global_v2", a(str, "report_ha_event_time"), 0L) < 43200000) {
                HiLog.d("HAEL", "report ha event interval is greater than 12 hours. tag:" + str);
            } else {
                HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
                if (instanceByTag == null) {
                    return;
                }
                instanceByTag.onReport(1);
                c2.b("global_v2", a(str, "report_ha_event_time"), System.currentTimeMillis());
            }
        } catch (Exception unused) {
            HiLog.w("HAEL", "fail to report ha event");
        }
    }

    @Override // com.huawei.hianalytics.framework.listener.IHAEventListener
    public final void reportAppEvent() {
        m0 m0Var = f0.f11492b;
        if (m0Var == null) {
            return;
        }
        if (System.currentTimeMillis() - c2.a("global_v2", "lastReportTime", 0L) < l.a().i) {
            return;
        }
        m0Var.removeMessages(4);
        m0Var.sendEmptyMessage(4);
    }

    public static String a(String str, String str2) {
        return str + "_" + str2;
    }
}
