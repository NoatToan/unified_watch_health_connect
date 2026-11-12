package com.huawei.hms.mlkit.common.ha;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsApi;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class HianalyticsLogProvider {
    public static volatile HashMap h = new HashMap();
    public static final HashMap i = new HashMap();
    public static volatile HianalyticsLogProvider j = new HianalyticsLogProvider();
    public Context d;
    public a e;
    public GrsBaseInfo f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f14314a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f14315b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14316c = null;
    public final HashMap g = new HashMap();

    /* JADX WARN: Code duplicated, block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: Exception -> 0x006f, TRY_ENTER, TryCatch #0 {Exception -> 0x006f, blocks: (B:18:0x0057, B:19:0x005d), top: B:29:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:18:0x0057, B:19:0x005d), top: B:29:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static boolean b(Context context) {
        Pair pair;
        boolean z;
        String str;
        ?? r0 = "HaLogProvider";
        try {
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (listQueryIntentServices.size() != 0) {
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                if (it.hasNext()) {
                    ResolveInfo next = it.next();
                    pair = new Pair(next.serviceInfo.applicationInfo.packageName, next);
                }
                z = false;
                if (pair == null) {
                    return false;
                }
                str = (String) pair.first;
                try {
                    if (context == null) {
                        b.a("HaLogProvider", "Context not initialized");
                        r0 = r0;
                    } else {
                        r0 = 1;
                        r0 = 1;
                        if ((context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & 1) != 0) {
                            z = true;
                        }
                    }
                } catch (Exception e) {
                    String str2 = "isPackageInternal Exception e: " + e;
                    int i2 = b.f14320a;
                    if (!TextUtils.isEmpty(str2)) {
                        Log.w((String) r0, b.a(str2));
                    }
                }
                return z;
            }
        } catch (Exception e2) {
            b.a("HaLogProvider", "RuntimeException " + e2.getMessage());
        }
        pair = null;
        z = false;
        if (pair == null) {
            return false;
        }
        str = (String) pair.first;
        if (context == null) {
            b.a("HaLogProvider", "Context not initialized");
            r0 = r0;
        } else {
            r0 = 1;
            r0 = 1;
            if ((context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & 1) != 0) {
                z = true;
            }
        }
        return z;
    }

    public static HianalyticsLogProvider getInstance() {
        return j;
    }

    public final void a(HianalyticsLog hianalyticsLog) {
        String str = hianalyticsLog.r;
        Map map = (Map) this.g.get(str);
        Map map2 = map;
        if (map == null) {
            HashMap map3 = new HashMap();
            map3.put("allCnt", 0L);
            map3.put("costTimeAll", 0L);
            this.g.put(str, map3);
            map2 = map3;
        }
        map2.put("allCnt", Long.valueOf((map2.get("allCnt") == null ? 0L : ((Long) map2.get("allCnt")).longValue()) + 1));
        long jLongValue = map2.get("failCnt") == null ? 0L : ((Long) map2.get("failCnt")).longValue();
        if (!hianalyticsLog.k) {
            map2.put("failCnt", Long.valueOf(jLongValue + 1));
        }
        map2.put("costTimeAll", Long.valueOf((map2.get("costTimeAll") != null ? ((Long) map2.get("costTimeAll")).longValue() : 0L) + (System.currentTimeMillis() - Long.parseLong(hianalyticsLog.g))));
        this.g.put(str, map2);
    }

    public String getTransId() {
        String str = this.f14316c;
        return str == null ? "" : str;
    }

    public void initTimer(String str) {
        if (this.f14316c == null) {
            this.f14316c = UUID.randomUUID().toString();
        }
        HashMap map = i;
        if (((Timer) map.get(str)) == null) {
            Timer timer = new Timer();
            timer.schedule(new d(), 0L, 5000L);
            map.put(str, timer);
            b.b("HaLogProvider", "init timer, timer=" + timer + ",moduleName=" + str);
        }
        if (this.g.containsKey(str)) {
            this.g.remove(str);
        }
    }

    public HianalyticsLog logBegin(Context context, Bundle bundle) {
        this.d = context.getApplicationContext();
        this.e = c.a(context, bundle);
        HianalyticsLog hianalyticsLog = new HianalyticsLog();
        Log.i("HaLogProvider", "in common ha, BUILD_MODE is: APK");
        if (a() || !a(context)) {
            return hianalyticsLog;
        }
        hianalyticsLog.g = String.valueOf(System.currentTimeMillis());
        return hianalyticsLog;
    }

    public void logEnd(HianalyticsLog hianalyticsLog) {
        try {
            Log.i("HaLogProvider", "in common ha, BUILD_MODE is: APK");
            if (a()) {
                b.b("HaLogProvider", "in logEnd, HA is forbiddenHiLog");
                return;
            }
            if (hianalyticsLog == null) {
                b.a("HaLogProvider", "in logEnd, haLog is null");
                return;
            }
            if (hianalyticsLog.g == null) {
                b.b("HaLogProvider", "in logEnd, initlizeHaSdk is not well, so HA is forbiddenHiLog");
                return;
            }
            a(hianalyticsLog);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = hianalyticsLog.r;
            if (h != null) {
                Long l = (Long) h.get(str);
                if (l == null) {
                    l = 0L;
                    h.put(str, l);
                }
                if (this.f14315b || jCurrentTimeMillis - l.longValue() > 1000) {
                    a(hianalyticsLog, jCurrentTimeMillis - Long.parseLong(hianalyticsLog.g));
                    LinkedHashMap<String, String> linkedHashMapA = c.a(hianalyticsLog);
                    a(str, linkedHashMapA);
                    Context context = this.d;
                    b.b("HaLogExecutor", "type 1 mapValue:" + linkedHashMapA);
                    HiAnalyticsUtils.getInstance().onNewEvent(context, "60001", linkedHashMapA, 1);
                    Context context2 = this.d;
                    b.b("HaLogExecutor", "type 0 mapValue:" + linkedHashMapA);
                    HiAnalyticsUtils.getInstance().onNewEvent(context2, "60001", linkedHashMapA, 0);
                    this.f14315b = false;
                    b.a("HaLogProvider", linkedHashMapA.toString());
                    h.put(str, Long.valueOf(jCurrentTimeMillis));
                    if (this.g.containsKey(str)) {
                        this.g.remove(str);
                    }
                }
            }
            Log.i("HaLogProvider", "success HA logEnd, module name is: " + str);
        } catch (Exception unused) {
            Log.e("HaLogProvider", "logEnd: GetNullException");
        }
    }

    public void postEvent(Context context, int i2, BaseInfoGatherEvent baseInfoGatherEvent) {
        this.d = context.getApplicationContext();
        if (this.f14316c == null) {
            this.f14316c = UUID.randomUUID().toString();
        }
        if (baseInfoGatherEvent == null) {
            return;
        }
        this.e = c.a(context, baseInfoGatherEvent.getAppInfo());
        Log.i("HaLogProvider", "in common ha, BUILD_MODE is: APK");
        if (a()) {
            b.b("HaLogProvider", "HA is forbidden!");
            return;
        }
        if (!a(context)) {
            b.a("HaLogProvider", "HA initializ fail!");
            return;
        }
        if ((i2 & 1) == 1) {
            String eventId = baseInfoGatherEvent.getEventId();
            LinkedHashMap<String, String> eventData = baseInfoGatherEvent.getEventData(context);
            b.b("HaLogExecutor", "type 1 mapValue:" + eventData);
            HiAnalyticsUtils.getInstance().onNewEvent(context, eventId, eventData, 1);
        }
        if ((i2 & 2) == 2) {
            String eventId2 = baseInfoGatherEvent.getEventId();
            LinkedHashMap<String, String> eventData2 = baseInfoGatherEvent.getEventData(context);
            b.b("HaLogExecutor", "type 0 mapValue:" + eventData2);
            HiAnalyticsUtils.getInstance().onNewEvent(context, eventId2, eventData2, 0);
        }
        if ((i2 & 4) == 4) {
            String eventId3 = baseInfoGatherEvent.getEventId();
            LinkedHashMap<String, String> eventData3 = baseInfoGatherEvent.getEventData(context);
            b.b("HaLogExecutor", "type 2 mapValue:" + eventData3);
            HiAnalyticsUtils.getInstance().onNewEvent(context, eventId3, eventData3, 2);
        }
    }

    public void reportAndCancelTimer() {
    }

    public void reportAndCancelTimer(String str) {
        if (this.f14316c != null) {
            this.f14316c = null;
        }
        this.f14315b = true;
        h.clear();
        HashMap map = i;
        Timer timer = (Timer) map.get(str);
        if (timer != null) {
            Log.i("HaLogProvider", "in common ha, BUILD_MODE is: APK");
            if (!a()) {
                HmsHiAnalyticsUtils.onReport();
            }
            b.b("HaLogProvider", "cancel timer, timer=" + timer + ",moduleName=" + str);
            timer.cancel();
            map.remove(str);
        }
    }

    public boolean sdkForbiddenHiLog(Context context) {
        if (!b(context) || this.e == null) {
            Log.i("HaLogProvider", "hms core do not exist or appInfo is null, sdkForbiddenHiLog");
            return false;
        }
        b.a("HaLogProvider", "forbiddenHiLog openHa = " + this.e.e);
        return a();
    }

    public final boolean a(Context context) {
        Log.i("HaLogProvider", "in common ha, BUILD_MODE is: APK");
        if (a() || this.f14314a) {
            return true;
        }
        b.a("HaLogProvider", "initlizeHaSdk APK mode,BUILD_MODE=APK");
        if (this.f == null) {
            this.f = new GrsBaseInfo();
            String str = this.e.f;
            b.b("HaLogProvider", "initGrsBaseInfo CountryCode = " + str);
            if (str != null && !str.isEmpty() && !"UNKNOWN".equals(str)) {
                this.f.setSerCountry(str.toUpperCase(Locale.ENGLISH));
            }
        }
        GrsApi.grsSdkInit(context, this.f);
        String strSynGetGrsUrl = GrsApi.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOT");
        b.a("HaLogProvider", "GrsApi.synGetGrsUrl=" + strSynGetGrsUrl + ",BuildConfig.HIA_MODE=com.huawei.cloud.mlkithianalytics");
        this.f14314a = true;
        if (strSynGetGrsUrl != null && !strSynGetGrsUrl.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(strSynGetGrsUrl);
            if (context != null && !arrayList.isEmpty()) {
                Log.i("HaLogExecutor", "start initBI");
                HMSBIInitializer.getInstance(context.getApplicationContext()).initBI();
                Log.i("HaLogExecutor", "end initBI");
                HiAnalyticsUtils.getInstance().enableLog();
                b.b("HaLogExecutor", "HianalyticsLogExecutor executeInitialize init success");
                return true;
            }
            b.a("HaLogExecutor", "HianalyticsLogExecutor executeInitialize failed, context or haServiceUrls is empty.");
            return false;
        }
        b.a("HaLogProvider", "grs get url is empty");
        if (this.f.getSerCountry() != null) {
            b.a("HaLogProvider", "grs get url is empty, countryCode = " + this.f.getSerCountry());
        }
        return false;
    }

    public final boolean a() {
        String property;
        String str = "UNKNOWN";
        if ("HONOR".equals(Build.BRAND)) {
            property = SystemPropUtils.getProperty("get", CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP_HN, "android.os.SystemProperties", "UNKNOWN");
        } else {
            property = SystemPropUtils.getProperty("get", CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP, "android.os.SystemProperties", "UNKNOWN");
        }
        if (!"eu".equalsIgnoreCase(property) && !"la".equalsIgnoreCase(property)) {
            str = property;
        }
        b.a("HaLogProvider", "forbiddenHiLog.getVenderCountry=" + str);
        if ("CN".equalsIgnoreCase(str)) {
            Log.i("HaLogProvider", "no HaForbidden, ha data up directly");
            return false;
        }
        if (this.e != null) {
            b.a("HaLogProvider", "forbiddenHiLog openHa = " + this.e.e);
            return !this.e.e;
        }
        b.a("HaLogProvider", "forbiddenHiLog openHa is empty, appInfo is null");
        return true;
    }

    public final void a(HianalyticsLog hianalyticsLog, long j2) {
        hianalyticsLog.f = String.valueOf(j2);
        a aVar = this.e;
        hianalyticsLog.f14311a = aVar.f14317a;
        hianalyticsLog.f14312b = aVar.f14318b;
        hianalyticsLog.f14313c = aVar.f14319c;
        hianalyticsLog.m = aVar.d;
        Context context = this.d;
        int i2 = c.f14321a;
        hianalyticsLog.i = context == null ? "" : ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        hianalyticsLog.o = Build.MODEL;
        hianalyticsLog.p = c.a();
        hianalyticsLog.q = Build.VERSION.RELEASE;
        hianalyticsLog.t = "";
        hianalyticsLog.d = "MLKit";
        hianalyticsLog.n = this.e.f;
        hianalyticsLog.s = "";
        hianalyticsLog.h = this.f14316c;
        hianalyticsLog.j = c.a(this.d);
    }

    public final void a(String str, LinkedHashMap<String, String> linkedHashMap) {
        Map map = (Map) this.g.get(str);
        if (map != null) {
            long jLongValue = map.get("allCnt") == null ? 0L : ((Long) map.get("allCnt")).longValue();
            linkedHashMap.put("allCnt", String.valueOf(jLongValue));
            long jLongValue2 = map.get("failCnt") == null ? 0L : ((Long) map.get("failCnt")).longValue();
            linkedHashMap.put("failCnt", String.valueOf(jLongValue2));
            linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(jLongValue != 0 ? (map.get("costTimeAll") == null ? 0L : ((Long) map.get("costTimeAll")).longValue()) / jLongValue : 0L));
            linkedHashMap.put("lastCallTime", String.valueOf(System.currentTimeMillis()));
            linkedHashMap.put("result", String.format("{0:%s}", String.valueOf(jLongValue - jLongValue2)));
        }
    }
}
