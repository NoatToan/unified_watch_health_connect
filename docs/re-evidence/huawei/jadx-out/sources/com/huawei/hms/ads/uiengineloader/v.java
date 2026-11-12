package com.huawei.hms.ads.uiengineloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.dynamic.DynamicModule;
import com.huawei.openalliance.ad.constant.SpKeys;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12937a = "ads_KitLoadStrategy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12938b = "content://com.huawei.hwid.pps.apiprovider/check_uiengine";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12939c = 30472100;
    private static final byte[] d = new byte[0];

    private static void c(Context context, String str, int i, String str2) {
        int loaderEngin2KitUpdate;
        long kitloaderLastCheckTime;
        int loaderEngineInterval;
        try {
            af.b(f12937a, "start queryModule: ".concat(String.valueOf(str)));
            c.a(1, Integer.valueOf(i), null);
            if (DynamicModule.getSpHandler() != null) {
                loaderEngin2KitUpdate = DynamicModule.getSpHandler().getLoaderEngin2KitUpdate(str2);
            } else {
                af.d("LoaderHandler", "DynamicModule.spHandler is null");
                loaderEngin2KitUpdate = 60000;
            }
            af.a(f12937a, "interval: ".concat(String.valueOf(loaderEngin2KitUpdate)));
            synchronized (d) {
                if (DynamicModule.getSpHandler() != null) {
                    kitloaderLastCheckTime = DynamicModule.getSpHandler().getKitloaderLastCheckTime();
                } else {
                    af.d("LoaderHandler", "DynamicModule.spHandler is null");
                    kitloaderLastCheckTime = 0;
                }
                af.a(f12937a, "lastCheckTime: ".concat(String.valueOf(kitloaderLastCheckTime)));
                if (kitloaderLastCheckTime <= 0 || System.currentTimeMillis() - kitloaderLastCheckTime >= loaderEngin2KitUpdate) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (DynamicModule.getSpHandler() != null) {
                        DynamicModule.getSpHandler().setKitloaderLastCheckTime(jCurrentTimeMillis);
                    } else {
                        af.d("LoaderHandler", "DynamicModule.spHandler is null");
                    }
                    if (DynamicModule.getSpHandler() != null) {
                        loaderEngineInterval = DynamicModule.getSpHandler().getLoaderEngineInterval(str2);
                    } else {
                        af.d("LoaderHandler", "DynamicModule.spHandler is null");
                        loaderEngineInterval = 10080000;
                    }
                    af.a(f12937a, "engineInterval: ".concat(String.valueOf(loaderEngineInterval)));
                    c.a(2, Integer.valueOf(i), null);
                    Bundle bundleA = a(context, str, loaderEngineInterval);
                    int i2 = bundleA.getInt("module_version");
                    Integer numValueOf = Integer.valueOf(i2);
                    numValueOf.getClass();
                    if (i2 == 0) {
                        af.c(f12937a, "the query module:" + str + " is not existed in PPSKit.");
                        af.c(f12937a, "start call HMSLoadStrategy");
                        t.a(context, str, i);
                        return;
                    }
                    numValueOf.getClass();
                    if (i >= i2) {
                        af.b(f12937a, "no update,localVersion: " + i + " reomoteVersion: " + numValueOf);
                        return;
                    }
                    c.a(3, Integer.valueOf(i), numValueOf);
                    af.b(f12937a, "Ready to cp module.");
                    boolean zA = x.a(context, bundleA);
                    af.b(f12937a, "cp remote version by module name:" + str + " ,result:" + zA);
                    if (!zA) {
                        throw new com.huawei.hms.ads.dynamicloader.j("KitLoadStrategy copy module error");
                    }
                    c.a(4, Integer.valueOf(i), numValueOf);
                    af.a(f12937a, "bundle info: moduleName:" + str + ", moduleVersion:" + numValueOf);
                    af.b(f12937a, "end queryModule: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            c.a(5, Integer.valueOf(i), null);
            af.c(f12937a, "checkRemoteVersion error: " + th.getMessage());
            af.c(f12937a, "start call HMSLoadStrategy");
            t.a(context, str, i);
        }
    }

    static /* synthetic */ void b(Context context, String str, int i, String str2) {
        int loaderEngin2KitUpdate;
        long kitloaderLastCheckTime;
        int loaderEngineInterval;
        try {
            af.b(f12937a, "start queryModule: ".concat(String.valueOf(str)));
            c.a(1, Integer.valueOf(i), null);
            if (DynamicModule.getSpHandler() != null) {
                loaderEngin2KitUpdate = DynamicModule.getSpHandler().getLoaderEngin2KitUpdate(str2);
            } else {
                af.d("LoaderHandler", "DynamicModule.spHandler is null");
                loaderEngin2KitUpdate = 60000;
            }
            af.a(f12937a, "interval: ".concat(String.valueOf(loaderEngin2KitUpdate)));
            synchronized (d) {
                if (DynamicModule.getSpHandler() != null) {
                    kitloaderLastCheckTime = DynamicModule.getSpHandler().getKitloaderLastCheckTime();
                } else {
                    af.d("LoaderHandler", "DynamicModule.spHandler is null");
                    kitloaderLastCheckTime = 0;
                }
                af.a(f12937a, "lastCheckTime: ".concat(String.valueOf(kitloaderLastCheckTime)));
                if (kitloaderLastCheckTime <= 0 || System.currentTimeMillis() - kitloaderLastCheckTime >= loaderEngin2KitUpdate) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (DynamicModule.getSpHandler() != null) {
                        DynamicModule.getSpHandler().setKitloaderLastCheckTime(jCurrentTimeMillis);
                    } else {
                        af.d("LoaderHandler", "DynamicModule.spHandler is null");
                    }
                    if (DynamicModule.getSpHandler() != null) {
                        loaderEngineInterval = DynamicModule.getSpHandler().getLoaderEngineInterval(str2);
                    } else {
                        af.d("LoaderHandler", "DynamicModule.spHandler is null");
                        loaderEngineInterval = 10080000;
                    }
                    af.a(f12937a, "engineInterval: ".concat(String.valueOf(loaderEngineInterval)));
                    c.a(2, Integer.valueOf(i), null);
                    Bundle bundleA = a(context, str, loaderEngineInterval);
                    int i2 = bundleA.getInt("module_version");
                    Integer numValueOf = Integer.valueOf(i2);
                    numValueOf.getClass();
                    if (i2 == 0) {
                        af.c(f12937a, "the query module:" + str + " is not existed in PPSKit.");
                        af.c(f12937a, "start call HMSLoadStrategy");
                        t.a(context, str, i);
                        return;
                    }
                    numValueOf.getClass();
                    if (i >= i2) {
                        af.b(f12937a, "no update,localVersion: " + i + " reomoteVersion: " + numValueOf);
                        return;
                    }
                    c.a(3, Integer.valueOf(i), numValueOf);
                    af.b(f12937a, "Ready to cp module.");
                    boolean zA = x.a(context, bundleA);
                    af.b(f12937a, "cp remote version by module name:" + str + " ,result:" + zA);
                    if (!zA) {
                        throw new com.huawei.hms.ads.dynamicloader.j("KitLoadStrategy copy module error");
                    }
                    c.a(4, Integer.valueOf(i), numValueOf);
                    af.a(f12937a, "bundle info: moduleName:" + str + ", moduleVersion:" + numValueOf);
                    af.b(f12937a, "end queryModule: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            c.a(5, Integer.valueOf(i), null);
            af.c(f12937a, "checkRemoteVersion error: " + th.getMessage());
            af.c(f12937a, "start call HMSLoadStrategy");
            t.a(context, str, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huawei.hms.ads.uiengineloader.v$1] */
    public static void a(final Context context, final String str, final int i, final String str2) {
        new Thread() { // from class: com.huawei.hms.ads.uiengineloader.v.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                if (e.a(context) < v.f12939c) {
                    af.b(v.f12937a, "PPSKit is below need version");
                    t.a(context, str, i);
                    return;
                }
                String str3 = str2;
                if (DynamicModule.getSpHandler() == null) {
                    af.d("LoaderHandler", "DynamicModule.spHandler is null");
                } else if (DynamicModule.getSpHandler().getLoaderEngineUpdate(str3)) {
                    v.b(context, str, i, str2);
                    return;
                }
                af.b(v.f12937a, "engineUpdate is close");
                t.a(context, str, i);
            }
        }.start();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[DONT_INVERT, PHI: r4
      0x0073: PHI (r4v3 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v5 boolean) binds: [B:18:0x0043, B:20:0x005a, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:3:0x0004, B:6:0x000c, B:9:0x001d, B:11:0x0021, B:13:0x0032, B:15:0x003d, B:19:0x0045, B:21:0x005c, B:23:0x0062, B:24:0x006b, B:26:0x0075, B:28:0x0099, B:30:0x00a4, B:31:0x00ac, B:32:0x00ad, B:33:0x00b2, B:34:0x00b9), top: B:38:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:3:0x0004, B:6:0x000c, B:9:0x001d, B:11:0x0021, B:13:0x0032, B:15:0x003d, B:19:0x0045, B:21:0x005c, B:23:0x0062, B:24:0x006b, B:26:0x0075, B:28:0x0099, B:30:0x00a4, B:31:0x00ac, B:32:0x00ad, B:33:0x00b2, B:34:0x00b9), top: B:38:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:3:0x0004, B:6:0x000c, B:9:0x001d, B:11:0x0021, B:13:0x0032, B:15:0x003d, B:19:0x0045, B:21:0x005c, B:23:0x0062, B:24:0x006b, B:26:0x0075, B:28:0x0099, B:30:0x00a4, B:31:0x00ac, B:32:0x00ad, B:33:0x00b2, B:34:0x00b9), top: B:38:0x0004 }] */
    private static Bundle a(Context context, String str, int i) throws com.huawei.hms.ads.dynamicloader.j {
        Cursor cursorQuery;
        try {
            Uri uri = Uri.parse(f12938b);
            if (context != null && uri != null) {
                PackageManager packageManager = context.getPackageManager();
                ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
                if (providerInfoResolveContentProvider != null) {
                    ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
                    if (applicationInfo != null) {
                        String str2 = applicationInfo.packageName;
                        af.b("HiAdTools", "Target provider service's package name is : ".concat(String.valueOf(str2)));
                        if (str2 != null) {
                            boolean zIsTrustApp = packageManager.checkSignatures(context.getPackageName(), str2) == 0 || (applicationInfo.flags & 1) == 1;
                            if (!zIsTrustApp) {
                                String strB = aa.b(context, str2);
                                boolean zIsEmpty = TextUtils.isEmpty(strB);
                                af.b("HiAdTools", "is sign empty: ".concat(String.valueOf(zIsEmpty)));
                                if (zIsEmpty) {
                                    if (zIsTrustApp) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(SpKeys.LOADER_ENGINE_ENGINE_INTERVAL, i);
                                        cursorQuery = context.getContentResolver().query(Uri.parse(f12938b), null, str, new String[]{jSONObject.toString()}, "");
                                        if (cursorQuery == null) {
                                            throw new com.huawei.hms.ads.dynamicloader.j("query ret is null");
                                        }
                                        af.b(f12937a, "query success.");
                                        return cursorQuery.getExtras();
                                    }
                                } else if (DynamicModule.getCommonInter() != null) {
                                    zIsTrustApp = DynamicModule.getCommonInter().isTrustApp(str2, strB);
                                    if (zIsTrustApp) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(SpKeys.LOADER_ENGINE_ENGINE_INTERVAL, i);
                                        cursorQuery = context.getContentResolver().query(Uri.parse(f12938b), null, str, new String[]{jSONObject2.toString()}, "");
                                        if (cursorQuery == null) {
                                            throw new com.huawei.hms.ads.dynamicloader.j("query ret is null");
                                        }
                                        af.b(f12937a, "query success.");
                                        return cursorQuery.getExtras();
                                    }
                                } else {
                                    af.d("LoaderHandler", "DynamicModule.commonInter is null");
                                }
                            } else if (zIsTrustApp) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put(SpKeys.LOADER_ENGINE_ENGINE_INTERVAL, i);
                                cursorQuery = context.getContentResolver().query(Uri.parse(f12938b), null, str, new String[]{jSONObject3.toString()}, "");
                                if (cursorQuery == null) {
                                    throw new com.huawei.hms.ads.dynamicloader.j("query ret is null");
                                }
                                af.b(f12937a, "query success.");
                                return cursorQuery.getExtras();
                            }
                        }
                    }
                } else {
                    af.d("HiAdTools", "Invalid param");
                }
            }
            throw new com.huawei.hms.ads.dynamicloader.j("apiProvider uri is invalid");
        } catch (Exception e) {
            af.c(f12937a, "Failed to call checkNewModule: " + e.getMessage());
            throw new com.huawei.hms.ads.dynamicloader.j("call PPSKit checkNewModule error");
        }
    }
}
