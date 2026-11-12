package com.huawei.maps.offlinedata.logpush;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.maps.offlinedata.logpush.utils.d;
import com.huawei.maps.offlinedata.service.cloud.GrsMapClient;
import com.huawei.maps.offlinedata.service.cloud.utils.e;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f17846a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadPoolExecutor f17847b = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HiAnalyticsInstance f17848c;

    protected a() {
        if (d()) {
            return;
        }
        f17847b.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.logpush.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        if (d() || com.huawei.maps.offlinedata.utils.a.b() == null) {
            return;
        }
        String haAddress = GrsMapClient.getInstance().getHaAddress();
        g.c("AbstractLogPusher", "hiAnalyticsUrl--" + haAddress);
        if (TextUtils.isEmpty(haAddress)) {
            return;
        }
        HiAnalyticTools.enableLog(com.huawei.maps.offlinedata.utils.a.b());
        HiAnalyticsInstance hiAnalyticsInstanceCreate = new HiAnalyticsInstance.Builder(com.huawei.maps.offlinedata.utils.a.b()).setMaintConf(new HiAnalyticsConfig.Builder().setCollectURL(haAddress).build()).create("offlinedata");
        f17848c = hiAnalyticsInstanceCreate;
        if (hiAnalyticsInstanceCreate != null) {
            hiAnalyticsInstanceCreate.setAppid("com.huawei.hwid");
        }
        g.c("AbstractLogPusher", "initHiAnalytics()--initialize success.");
        f17846a = true;
    }

    private boolean c() {
        if (!d()) {
            g.c("AbstractLogPusher", "HA SDK init is false");
            return false;
        }
        if (a(com.huawei.maps.offlinedata.utils.a.b().getApplicationContext())) {
            return true;
        }
        g.c(a(), "log push is not allow");
        return false;
    }

    public static boolean d() {
        return f17846a;
    }

    protected abstract String a();

    protected void a(String str, LinkedHashMap linkedHashMap) {
        g.c("AbstractLogPusher", "onEvent--" + linkedHashMap);
        if (!c() || TextUtils.isEmpty(str) || f17848c == null) {
            return;
        }
        g.c("AbstractLogPusher", "onEvent--start");
        f17848c.onEvent(1, str, (LinkedHashMap<String, String>) linkedHashMap);
    }

    protected void e() {
        g.c("AbstractLogPusher", "onReport");
        if (c() && f17848c != null) {
            g.c("AbstractLogPusher", "onReport--start");
            f17848c.onReport(1);
        }
    }

    protected boolean a(Context context) {
        if (!d.b()) {
            return true;
        }
        if (context == null) {
            return false;
        }
        return com.huawei.maps.offlinedata.logpush.utils.b.a(context);
    }

    protected LinkedHashMap a(com.huawei.maps.offlinedata.logpush.dto.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("package", com.huawei.maps.offlinedata.utils.a.b().getApplicationContext().getPackageName());
        linkedHashMap.put("appId", com.huawei.maps.offlinedata.service.cloud.utils.b.a(com.huawei.maps.offlinedata.utils.a.b()));
        linkedHashMap.put("version", e.b());
        linkedHashMap.put("apiLevel", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("mapProvider", Constants.LINK);
        linkedHashMap.put("callFrom", String.valueOf(!d.b() ? 1 : 0));
        linkedHashMap.put("service", "hmsmap");
        if (cVar != null && cVar.a() != null) {
            linkedHashMap.put("ext", cVar.a().toString());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.b())) {
            linkedHashMap.put("extra_01", cVar.b());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.c())) {
            linkedHashMap.put("extra_02", cVar.c());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.d())) {
            linkedHashMap.put("extra_03", cVar.d());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.e())) {
            linkedHashMap.put("extra_04", cVar.e());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.f())) {
            linkedHashMap.put("extra_05", cVar.f());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.g())) {
            linkedHashMap.put("extra_06", cVar.g());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.h())) {
            linkedHashMap.put("extra_07", cVar.h());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.i())) {
            linkedHashMap.put("extra_08", cVar.i());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.j())) {
            linkedHashMap.put("extra_09", cVar.j());
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.k())) {
            linkedHashMap.put("extra_10", cVar.k());
        }
        return linkedHashMap;
    }
}
