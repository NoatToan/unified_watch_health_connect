package com.huawei.openalliance.ad.utils;

import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ih;
import com.huawei.openalliance.ad.ij;
import com.huawei.openalliance.ad.ik;
import com.huawei.openalliance.ad.im;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.is;
import com.huawei.openalliance.ad.it;
import com.huawei.openalliance.ad.iy;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pl;
import com.huawei.opendevice.open.TransparencyStatementActivity;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public abstract class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f20423a;

    public static boolean j() {
        return true;
    }

    private static float r(Context context) {
        try {
            return Settings.System.getFloat(context.getContentResolver(), "font_scale", -1.0f);
        } catch (Throwable th) {
            hw.c("HiAdTools", "get font err: %s", th.getClass().getSimpleName());
            return -1.0f;
        }
    }

    public static boolean q(Context context) {
        return d.c(context) >= 600;
    }

    public static boolean p(Context context) {
        if (b(context)) {
            return fp.b(context).bf();
        }
        return false;
    }

    public static boolean o(Context context) {
        return m(context) >= 1.3f;
    }

    public static boolean n(Context context) {
        return m(context) >= 1.75f;
    }

    public static float m(Context context) {
        Configuration configuration;
        if (context == null) {
            return -1.0f;
        }
        float fR = r(context);
        if (fR > 0.0f) {
            return fR;
        }
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return -1.0f;
        }
        return configuration.fontScale;
    }

    public static boolean l(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 29) {
            Object systemService = context.getSystemService("uimode");
            if ((systemService instanceof UiModeManager) && ((UiModeManager) systemService).getNightMode() == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        try {
            Intent intent = new Intent(Constants.GMS_AD_SETTING_ACTION);
            intent.addFlags(268435456);
            intent.setPackage("com.google.android.gms");
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            hw.d("HiAdTools", "open GMS ads setting exception.");
            return false;
        }
    }

    public static boolean k() {
        return dg.a(com.huawei.openalliance.ad.e.a(), -111111) >= 30482100;
    }

    public static boolean j(Context context) {
        String strL = d.l(context);
        Integer numJ = dg.j(strL);
        if (numJ != null && numJ.intValue() >= 40000300) {
            return true;
        }
        hw.b("HiAdTools", "hms not installed or low version, current version: %s", strL);
        return false;
    }

    public static boolean i() {
        return dg.a(com.huawei.openalliance.ad.e.a(), -111111) >= 30476300;
    }

    public static void i(Context context) {
        if (context != null && com.huawei.openalliance.ad.cc.b(context)) {
            na.a(context).a(RTCMethods.REMOVE_EXSPLASH_BLOCK, null, null, null);
        }
    }

    public static boolean h() {
        return dg.a(com.huawei.openalliance.ad.e.a(), -111111) >= 30470106;
    }

    public static int h(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID);
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable th) {
            hw.c("HiAdTools", "getStatusBarHeight err: %s", th.getClass().getSimpleName());
            return 0;
        }
    }

    public static boolean g() {
        return !TextUtils.isEmpty(com.huawei.openalliance.ad.e.a());
    }

    public static Integer g(Context context) {
        Integer numA = bt.a(context, context.getApplicationContext().getPackageName(), "hw_ads_sdk_type");
        if (hw.a()) {
            hw.a("HiAdTools", "sdkType:%s", numA);
        }
        return numA;
    }

    private static boolean f(Context context, String str) {
        String str2;
        if (context == null) {
            str2 = "processWhyEvent context is null, return";
        } else {
            if (!com.huawei.openalliance.ad.cc.a(context).d()) {
                if (Constants.WHY_THIS_AD_DEFAULT_URL.equalsIgnoreCase(str)) {
                    str = Constants.THIRD_ADINFO_DP + context.getPackageName();
                }
                if (dg.b(str)) {
                    String str3 = Constants.THIRD_ADINFO_DP + context.getPackageName();
                    hw.a("HiAdTools", "processWhyEvent cloud download url is empty, use default!");
                    return d(context, str3);
                }
                hw.a("HiAdTools", "processWhyEvent url = %s", str);
                return dg.l(str) ? a(context, str) : d(context, str);
            }
            str2 = "china rom should not call gotoWhyThisAdPage method";
        }
        hw.c("HiAdTools", str2);
        return false;
    }

    public static boolean f() {
        boolean z = cr.b(Constants.NETWORK_CLIENT_CLASS) && cr.b(Constants.NETWORK_REQ_BODY_PROVIDER);
        if (z) {
            return z;
        }
        return cr.c(Constants.NETWORK_CLIENT_CLASS) && cr.c(Constants.NETWORK_REQ_BODY_PROVIDER);
    }

    public static Integer f(Context context) {
        Integer numA = bt.a(context, k.e(context.getApplicationContext()), "ppskit_ver_code");
        if (hw.a()) {
            hw.a("HiAdTools", "ppsKitVerCode:%s", numA);
        }
        return numA;
    }

    private static boolean e(Context context, String str) {
        if (!dg.l(str)) {
            hw.c("HiAdTools", "url is invalid");
            return false;
        }
        Boolean boolO = HiAd.a(context).o();
        if (boolO != null && boolO.booleanValue()) {
            hw.a("HiAdTools", "try open in browser");
            if (c(context, str)) {
                hw.a("HiAdTools", "open in browser success");
                return true;
            }
        }
        SafeIntent safeIntent = new SafeIntent(new Intent());
        safeIntent.setPackage(context.getPackageName());
        safeIntent.setClass(context, TransparencyStatementActivity.class);
        safeIntent.putExtra(MapKeyNames.DSA_URL, str);
        safeIntent.setFlags(268435456);
        dk.a(context, safeIntent);
        return true;
    }

    public static boolean e(Context context) {
        if (context == null) {
            return false;
        }
        Integer numF = f(context);
        if (numF != null && numF.intValue() >= 30466100) {
            return true;
        }
        hw.b("HiAdTools", "hms version is too low to support query ins app.");
        return false;
    }

    public static boolean e() {
        return cr.c(Constants.CONSENT_SDK) && cr.a(Constants.CONSENT_SDK, Constants.CONSENT_SYNC, (Class<?>[]) null);
    }

    private static boolean d(Context context, String str) {
        String str2;
        if (dg.b(str)) {
            str2 = "openLinkByDeepLink deepLinkUrl is null, return";
        } else {
            try {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setPackage(context.getPackageName());
                intent.setData(Uri.parse(str));
                intent.setClipData(Constants.CLIP_DATA);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                str2 = "openLinkByDeepLink " + th.getClass().getSimpleName();
            }
        }
        hw.c("HiAdTools", str2);
        return false;
    }

    public static boolean d(Context context) {
        if (context == null) {
            return false;
        }
        Integer numF = f(context);
        if (numF != null && numF.intValue() >= 30462300) {
            return true;
        }
        hw.b("HiAdTools", "hms version is too low to support kit preload.");
        return false;
    }

    public static boolean d() {
        try {
            return new av().a();
        } catch (Throwable th) {
            hw.d("HiAdTools", "check okhttp error:%s", th.getClass().getSimpleName());
            return false;
        }
    }

    private static String d(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable unused) {
            hw.c("HiAdTools", "decode failed");
            return "";
        }
    }

    public static int d(Context context, float f) {
        if (context == null || f <= 0.0f) {
            return 0;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private static boolean c(Context context, String str) {
        String str2;
        if (context == null || !dg.l(str)) {
            str2 = "param is error, return";
        } else {
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return false;
                }
                if (bm.a(packageManager.queryIntentActivities(intent, 65536))) {
                    hw.c("HiAdTools", "No any browser installed");
                    return false;
                }
                intent.setFlags(268468224);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                str2 = "openLinkInBrowser " + th.getClass().getSimpleName();
            }
        }
        hw.c("HiAdTools", str2);
        return false;
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        Integer numF = f(context);
        if (numF != null && numF.intValue() >= 30445100) {
            return true;
        }
        hw.b("HiAdTools", "hms version is too low to support switch next install way.");
        return false;
    }

    public static String c(String str) {
        if (hw.a()) {
            hw.a("HiAdTools", "filterUrl, originUrl: %s", str);
        }
        return TextUtils.isEmpty(str) ? str : str.replace(" ", "");
    }

    public static long c() {
        return System.currentTimeMillis();
    }

    public static int c(Context context, float f) {
        if (context != null && f > 0.0f) {
            return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        }
        return 0;
    }

    public static boolean b(Context context, String str) {
        if (dg.b(str)) {
            hw.c("HiAdTools", "openHmsSetting, deepLink is empty.");
        }
        try {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setPackage(k.e(context));
            intent.setData(Uri.parse(str));
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            hw.c("HiAdTools", "openHmsSetting error: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean b(Context context, Uri uri) {
        boolean z = false;
        if (context != null && uri != null) {
            PackageManager packageManager = context.getPackageManager();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
            if (providerInfoResolveContentProvider != null) {
                ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
                if (applicationInfo != null) {
                    String str = applicationInfo.packageName;
                    hw.b("HiAdTools", "Target provider service's package name is : " + str);
                    if (str != null) {
                        z = packageManager.checkSignatures(context.getPackageName(), str) == 0 || (applicationInfo.flags & 1) == 1;
                        if (!z) {
                            String strE = k.e(context, str);
                            boolean zIsEmpty = TextUtils.isEmpty(strE);
                            hw.b("HiAdTools", "is sign empty: %s", Boolean.valueOf(zIsEmpty));
                            if (!zIsEmpty) {
                                return WhiteListPkgList.isTrustApp(context, str, strE);
                            }
                        }
                    }
                }
                return z;
            }
            hw.d("HiAdTools", "Invalid param");
        }
        return false;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (com.huawei.openalliance.ad.cc.a(context).d() || !com.huawei.openalliance.ad.cc.b(context)) {
            return true;
        }
        String strA = d.a(context, k.e(context));
        Integer numJ = dg.j(strA);
        if (numJ != null && numJ.intValue() >= 40000300) {
            return true;
        }
        hw.b("HiAdTools", "hms is not installed or hms version is too low, version is: " + strA);
        return false;
    }

    public static String b(String str) {
        return a(str).format(new Date());
    }

    private static String b(ContentRecord contentRecord) {
        String strAm = contentRecord.am();
        if (TextUtils.isEmpty(strAm)) {
            strAm = contentRecord.ab();
        }
        return d(strAm);
    }

    public static long b() {
        long jMaxMemory = Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        if (hw.a()) {
            hw.a("HiAdTools", "unUsedMemory is: %s", String.valueOf(jMaxMemory));
        }
        return jMaxMemory;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    private static int b(boolean z, String str) {
        int i;
        if (dg.b(str)) {
            i = 0;
        } else {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length == 2) {
                try {
                    i = Integer.parseInt(strArrSplit[1]);
                } catch (NumberFormatException unused) {
                    hw.c("HiAdTools", "get emui version error!");
                    i = 0;
                }
            } else {
                i = 0;
            }
        }
        if (z && i > 4) {
            return 11;
        }
        if (z) {
            Map<Integer, Integer> map = f20423a;
            if (map.containsKey(Integer.valueOf(i))) {
                return map.get(Integer.valueOf(i)).intValue();
            }
        }
        return i;
    }

    public static int b(Context context, float f) {
        if (context == null || f <= 0.0f) {
            return 0;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean a(int[] iArr, int i) {
        return iArr != null && iArr.length == i;
    }

    public static boolean a(boolean z, boolean z2, String str) {
        return z && z2 && !dg.b(str);
    }

    public static boolean a(boolean z, String str) {
        hw.b("HiAdTools", "dsa switch on:%s, url:%s", Boolean.valueOf(z), ds.a(str));
        return z && !dg.b(str);
    }

    public static boolean a(VideoInfo videoInfo) {
        return videoInfo != null && 3 == videoInfo.getVideoPlayMode();
    }

    public static boolean a(AdLandingPageData adLandingPageData) {
        return (adLandingPageData == null || !adLandingPageData.isShowPageTitle() || pa.f(adLandingPageData.f()) != 3 || adLandingPageData.getAppInfo() == null || TextUtils.isEmpty(adLandingPageData.getAppInfo().getAppName())) ? false : true;
    }

    public static boolean a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        return contentRecord.aQ() == 3 || contentRecord.F() == 99;
    }

    public static boolean a(Context context, String str, List<INativeAd> list, int i, List<INativeAd> list2) {
        if (bm.a(list)) {
            a(context, str, list.size(), list2.size());
            hw.b("HiAdTools", "nativeAdList is null");
            return false;
        }
        for (INativeAd iNativeAd : list) {
            if (a(pl.a((com.huawei.openalliance.ad.inter.data.e) iNativeAd))) {
                list2.add(iNativeAd);
            }
        }
        if (list2.size() >= i) {
            return true;
        }
        hw.b("HiAdTools", "satisfyAdList.size is %s, not enough", Integer.valueOf(list2.size()));
        a(context, str, list.size(), list2.size());
        return false;
    }

    public static boolean a(Context context, String str) {
        String str2;
        if (dg.l(str)) {
            try {
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setData(Uri.parse(str));
                intent.setFlags(268468224);
                dk.a(context, intent);
                return true;
            } catch (Throwable th) {
                str2 = "openLinkInBrowser " + th.getClass().getSimpleName();
            }
        } else {
            str2 = "url is error, return";
        }
        hw.c("HiAdTools", str2);
        return false;
    }

    public static boolean a(Context context, IAd iAd) {
        if (context == null || iAd == null) {
            return false;
        }
        boolean zIsTransparencyOpen = iAd.isTransparencyOpen();
        String transparencyTplUrl = iAd.getTransparencyTplUrl();
        return a(zIsTransparencyOpen, transparencyTplUrl) ? e(context, transparencyTplUrl) : f(context, a(iAd));
    }

    public static boolean a(Context context, ContentRecord contentRecord) {
        if (context == null || contentRecord == null) {
            return false;
        }
        boolean zBf = contentRecord.bf();
        String strBe = contentRecord.be();
        return a(zBf, strBe) ? e(context, strBe) : f(context, b(contentRecord));
    }

    private static void a(final Context context, final String str, final int i, final int i2) {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.as.1
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context).a(str, i, i2);
            }
        });
    }

    public static Map<String, List<INativeAd>> a(Context context, Map<String, List<INativeAd>> map) {
        try {
            Map<String, String> mapAv = fp.b(context).av();
            if (!br.a(mapAv) && !br.a(map)) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, List<INativeAd>> entry : map.entrySet()) {
                    if (mapAv.containsKey(entry.getKey())) {
                        hw.b("HiAdTools", "slot is special");
                        arrayList.clear();
                        int iIntValue = dg.j(mapAv.get(entry.getKey())) == null ? 0 : dg.j(mapAv.get(entry.getKey())).intValue();
                        if (a(context, entry.getKey(), entry.getValue(), iIntValue, arrayList)) {
                            map.put(entry.getKey(), arrayList.subList(0, Math.min(iIntValue, arrayList.size())));
                        } else {
                            arrayList.clear();
                            map.put(entry.getKey(), arrayList);
                        }
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            hw.d("HiAdTools", "handleSpecialSlot err: %s", th.getClass().getSimpleName());
            return map;
        }
    }

    public static List<ActivityManager.RunningTaskInfo> a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        return activityManager.getRunningTasks(10);
    }

    public static Date a(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.get(5) - i);
        calendar.set(11, 24);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static SimpleDateFormat a(String str) {
        try {
            return new SimpleDateFormat(str, Locale.ENGLISH);
        } catch (Throwable unused) {
            return new SimpleDateFormat(str);
        }
    }

    private static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile(str).matcher(str2);
            if (matcher.find()) {
                return matcher.group(0);
            }
            hw.c("HiAdTools", "can not find versionName: %s by pattern: %s", str2, str);
            return "";
        } catch (RuntimeException e) {
            hw.d("HiAdTools", "getVersionByPattern RuntimeException: %s", e.getClass().getSimpleName());
            return "";
        } catch (Exception e2) {
            hw.d("HiAdTools", "getVersionByPattern Exception: %s", e2.getClass().getSimpleName());
            return "";
        }
    }

    private static String a(IAd iAd) {
        String adChoiceUrl = iAd.getAdChoiceUrl();
        if (TextUtils.isEmpty(adChoiceUrl)) {
            adChoiceUrl = iAd.getWhyThisAd();
        }
        return d(adChoiceUrl);
    }

    public static String a(Context context, VideoInfo videoInfo, iy iyVar, String str) {
        ij ijVar;
        if (context == null || videoInfo == null || !f()) {
            return null;
        }
        hw.a("HiAdTools", "getProxyUrl for: %s", ds.a(videoInfo.g()));
        Context applicationContext = context.getApplicationContext();
        try {
            is.a(applicationContext);
            im.a().b();
            it itVar = new it(new ih(applicationContext, str), new com.huawei.openalliance.ad.dl(applicationContext, str));
            itVar.a();
            ik ikVar = new ik(applicationContext, itVar, is.a(), iyVar);
            ikVar.a(applicationContext);
            ijVar = new ij(applicationContext, itVar, ikVar);
        } catch (Throwable th) {
            hw.c("HiAdTools", "CreativeHttpServer boot failed, error: %s", th.getClass().getSimpleName());
            ijVar = null;
        }
        if (ijVar == null) {
            return null;
        }
        return ijVar.a(videoInfo);
    }

    public static String a(Context context, VideoInfo videoInfo, iy iyVar) {
        return a(context, videoInfo, iyVar, Constants.NATIVE_CACHE);
    }

    public static String a(Context context, VideoInfo videoInfo) {
        if (context == null || videoInfo == null || TextUtils.isEmpty(videoInfo.getVideoDownloadUrl())) {
            return null;
        }
        String videoDownloadUrl = videoInfo.getVideoDownloadUrl();
        if (videoDownloadUrl.startsWith(Scheme.CONTENT.toString())) {
            hw.b("HiAdTools", "start with content");
            return videoDownloadUrl;
        }
        com.huawei.openalliance.ad.dn dnVarA = com.huawei.openalliance.ad.dk.a(context, "normal");
        String strC = dnVarA.c(dnVarA.e(videoInfo.getVideoDownloadUrl()));
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        com.huawei.openalliance.ad.dn dnVarA2 = com.huawei.openalliance.ad.dk.a(context, Constants.UIENGINE_CACHE);
        String strC2 = dnVarA2.c(dnVarA2.e(videoInfo.getVideoDownloadUrl()));
        if (!TextUtils.isEmpty(strC2)) {
            return strC2;
        }
        com.huawei.openalliance.ad.dn dnVarA3 = com.huawei.openalliance.ad.dk.a(context, Constants.TPLATE_CACHE);
        return dnVarA3.c(dnVarA3.e(videoInfo.getVideoDownloadUrl()));
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public static Cursor a(Context context, Uri uri) {
        if (context == null || uri == null || !b(context, uri)) {
            return null;
        }
        return context.getContentResolver().query(uri, null, null, null, null);
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (context == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, 2) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static int a(Context context, float f) {
        if (context != null && f > 0.0f) {
            return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static int a(Context context) {
        StringBuilder sb;
        try {
            String strA = dk.a("ro.build.version.emui");
            if (TextUtils.isEmpty(strA)) {
                return 0;
            }
            String strA2 = a("^EmotionUI_[0-9]+", strA);
            return !TextUtils.isEmpty(strA2) ? b(false, strA2) : b(true, a("^MagicUI_[0-9]+", strA));
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("getEmuiVersion RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.d("HiAdTools", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("getEmuiVersion Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.d("HiAdTools", sb.toString());
        }
    }

    static {
        HashMap map = new HashMap();
        f20423a = map;
        map.put(2, 9);
        map.put(3, 10);
        map.put(4, 11);
    }
}
