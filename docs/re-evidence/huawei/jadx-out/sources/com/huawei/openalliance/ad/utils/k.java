package com.huawei.openalliance.ad.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.huawei.android.hms.ppskit.RemoteInstallReq;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.IntentFailError;
import com.huawei.openalliance.ad.download.DownloadFileProvider;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.IHiAd;
import com.huawei.openalliance.ad.nc;
import com.huawei.openalliance.ad.pe;
import com.huawei.openalliance.ad.rc;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.net.URISyntaxException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, List<String>> f20658a;

    private static byte[] h(Context context, String str) {
        StringBuilder sb;
        PackageInfo packageInfo;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null && packageInfo.signatures.length > 0) {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
                    try {
                        byte[] encoded = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream2).getEncoded();
                        df.a((Closeable) byteArrayInputStream2);
                        return encoded;
                    } catch (RuntimeException e2) {
                        e = e2;
                        byteArrayInputStream = byteArrayInputStream2;
                        sb = new StringBuilder("getPackageSignatureBytes RuntimeException:");
                        sb.append(e.getClass().getSimpleName());
                        hw.d("ApkUtil", sb.toString());
                        df.a((Closeable) byteArrayInputStream);
                        hw.b("ApkUtil", "Failed to get application signature certificate fingerprint.");
                        return new byte[0];
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream = byteArrayInputStream2;
                        sb = new StringBuilder("getPackageSignatureBytes Exception:");
                        sb.append(th.getClass().getSimpleName());
                        hw.d("ApkUtil", sb.toString());
                        df.a((Closeable) byteArrayInputStream);
                        hw.b("ApkUtil", "Failed to get application signature certificate fingerprint.");
                        return new byte[0];
                    }
                }
            } catch (Throwable th2) {
                df.a((Closeable) byteArrayInputStream);
                throw th2;
            }
        } catch (RuntimeException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
        df.a((Closeable) byteArrayInputStream);
        hw.b("ApkUtil", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    public static boolean g(Context context, String str) {
        return a(f20658a.get(str), e(context, str));
    }

    public static int f(Context context, String str) {
        try {
            PackageInfo packageInfoB = b(context, str);
            if (packageInfoB == null) {
                return 0;
            }
            return packageInfoB.versionCode;
        } catch (AndroidRuntimeException | Exception unused) {
            hw.c("ApkUtil", "getAppVersionCode fail");
            return 0;
        }
    }

    public static String e(Context context, String str) {
        byte[] bArrH = h(context, str);
        if (bArrH == null || bArrH.length == 0) {
            return null;
        }
        return ar.a(db.a(bArrH));
    }

    public static String e(Context context) {
        if (a(context, "com.huawei.hwid")) {
            return "com.huawei.hwid";
        }
        if (a(context, "com.huawei.hms")) {
            return "com.huawei.hms";
        }
        return a(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    public static String d(Context context) {
        String strE = e(context);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        if (a(f20658a.get(strE), e(context, strE))) {
            return strE;
        }
        return null;
    }

    public static ApplicationInfo d(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getApplicationInfo(str, 128);
            }
            hw.b("ApkUtil", "pm is null");
            return null;
        } catch (Throwable th) {
            hw.c("ApkUtil", "getApplicationInfo " + th.getClass().getSimpleName());
            return null;
        }
    }

    public static boolean c(Context context) {
        return !TextUtils.isEmpty(d(context));
    }

    private static String c(Context context, String str, com.huawei.openalliance.ad.utils.dcservice.c cVar) {
        IHiAd.IIntentProcessor intentProcessor = HiAd.getInstance(context).getIntentProcessor();
        String strB = fp.b(context).b(ConfigMapKeys.NEED_REPLACE_INTENT, "1");
        if (intentProcessor == null || !strB.equals("1")) {
            return str;
        }
        hw.a("ApkUtil", "needReplaceIntentUri");
        String strProcess = intentProcessor.process(str);
        cs.a(context, cVar, str, strProcess);
        return strProcess;
    }

    public static String c(Context context, String str) {
        String str2;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return a(packageManager, str);
            }
            return null;
        } catch (RuntimeException unused) {
            str2 = "getAppName RuntimeException";
            hw.c("ApkUtil", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "getAppName Exception";
            hw.c("ApkUtil", str2);
            return null;
        }
    }

    public static void b(Context context, Intent intent, com.huawei.openalliance.ad.utils.dcservice.c cVar) {
        if (cVar != null && dg.b(cVar.f())) {
            cVar.a(b(context, intent));
        }
        if (context == null || intent == null) {
            return;
        }
        try {
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
            com.huawei.openalliance.ad.utils.dcservice.a.a(context, cVar);
        } catch (Throwable th) {
            hw.c("ApkUtil", "start activity error");
            new com.huawei.openalliance.ad.analysis.c(context).a(cVar, th.getMessage());
            throw th;
        }
    }

    public static String b(Context context, String str, com.huawei.openalliance.ad.utils.dcservice.c cVar) {
        hw.b("ApkUtil", "open app main page for result");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return IntentFailError.CAN_NOT_GET_PKG_MANAGER;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                cs.a(context, cVar, IntentFailError.DO_OPEN_MAIN_PAGE_GET_INTENT_ERROR);
                return IntentFailError.DO_OPEN_MAIN_PAGE_GET_INTENT_ERROR;
            }
            launchIntentForPackage.addFlags(268435456);
            launchIntentForPackage.setPackage(str);
            if (cVar != null) {
                cVar.b(null);
            }
            b(context, launchIntentForPackage, cVar);
            return "success";
        } catch (Throwable th) {
            hw.c("ApkUtil", "openAppMainPageGetResult err: %s", th.getClass().getSimpleName());
            return th.getClass().getSimpleName();
        }
    }

    public static String b(Context context, Intent intent) {
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            return null;
        }
        return resolveInfoResolveActivity.activityInfo.packageName;
    }

    public static Integer b(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(e(context), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("ppskit_ver_code")) == null) {
                return null;
            }
            String string = obj.toString();
            if (hw.a()) {
                hw.a("ApkUtil", "ppsKitVerCode:%s", string);
            }
            return dg.j(string);
        } catch (Throwable th) {
            hw.b("ApkUtil", "getPpsKitVerCode ex: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static PackageInfo b(Context context, String str) {
        String str2;
        if (hw.a()) {
            hw.a("ApkUtil", "getPackageInfo, packageName:%s", str);
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, 128);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "getPackageInfo NameNotFoundException";
                hw.c("ApkUtil", str2);
            } catch (Throwable unused2) {
                str2 = "getPackageInfo Exception";
                hw.c("ApkUtil", str2);
            }
        }
        return null;
    }

    private static boolean a(List<String> list, String str) {
        if (list == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(List<ResolveInfo> list) {
        if (bm.a(list)) {
            return false;
        }
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.exported) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        return "com.huawei.hwid".equals(str) || "com.huawei.hms".equals(str) || "com.huawei.hwid.tv".equals(str);
    }

    public static boolean a(Intent intent, String str) {
        ComponentName component;
        if (intent == null || TextUtils.isEmpty(str) || (component = intent.getComponent()) == null) {
            return true;
        }
        String packageName = component.getPackageName();
        return TextUtils.isEmpty(packageName) || str.equalsIgnoreCase(packageName);
    }

    public static boolean a(Context context, String str, String str2, com.huawei.openalliance.ad.utils.dcservice.c cVar) {
        hw.b("ApkUtil", "openApp intent");
        try {
            if (context.getPackageManager() == null) {
                cs.a(context, cVar, IntentFailError.CAN_NOT_GET_PKG_MANAGER);
                return false;
            }
            Intent intentA = a(context, str2, str, cVar, true);
            if (intentA == null) {
                return false;
            }
            intentA.addFlags(268435456);
            if (cVar != null) {
                cVar.a(intentA);
            }
            a(context, intentA, cVar);
            return true;
        } catch (ActivityNotFoundException unused) {
            hw.c("ApkUtil", "activity not exist");
            cs.a(context, cVar, IntentFailError.ACTIVITY_NOT_FOUND_EXP);
        } catch (Exception e2) {
            cs.a(context, cVar, "unknown exception:" + e2.getClass().getSimpleName());
            hw.c("ApkUtil", "handle intent url fail");
        }
    }

    public static boolean a(Context context, String str, com.huawei.openalliance.ad.utils.dcservice.c cVar) {
        hw.b("ApkUtil", "open app main page");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                cs.a(context, cVar, IntentFailError.DO_OPEN_MAIN_PAGE_GET_INTENT_ERROR);
                return false;
            }
            launchIntentForPackage.addFlags(268435456);
            launchIntentForPackage.setPackage(str);
            if (cVar != null) {
                cVar.b(null);
            }
            a(context, launchIntentForPackage, cVar);
            return true;
        } catch (Throwable th) {
            hw.c("ApkUtil", "openAppMainPage err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        return b(context, str) != null;
    }

    public static void a(AppDownloadTask appDownloadTask, EventType eventType, int i) {
        rc rcVarC;
        if (appDownloadTask == null || (rcVarC = appDownloadTask.C()) == null) {
            return;
        }
        if (EventType.APPINSTALLSTART == eventType) {
            rcVarC.b(Integer.valueOf(i), appDownloadTask.F(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
        } else if (EventType.APPINSTALLFAIL == eventType) {
            rcVarC.c(Integer.valueOf(i), appDownloadTask.F(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
        }
    }

    public static void a(Intent intent) {
        intent.addFlags(536870912);
        intent.addFlags(32768);
        hw.b("ApkUtil", "addFlagsToIntent: Success");
    }

    public static void a(Context context, String str, String str2, pe.a aVar) {
        String str3;
        Uri uriFromFile;
        hw.a("ApkUtil", "installApkViaHsf, packageName: %s", str2);
        d dVar = new d(aVar, context, str, str2);
        String str4 = Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE;
        PackageInfo packageInfoB = b(context, Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE);
        if (packageInfoB == null) {
            str4 = Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE_NEW;
            packageInfoB = b(context, Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE_NEW);
        }
        if (packageInfoB == null) {
            dVar.a();
            return;
        }
        try {
            if (packageInfoB.versionCode >= 90000300) {
                uriFromFile = DownloadFileProvider.a(context, context.getPackageName() + ".hiad.fileprovider", new File(str));
            } else {
                uriFromFile = Uri.fromFile(new File(str));
            }
            context.getApplicationContext().grantUriPermission(str4, uriFromFile, 1);
            com.huawei.openalliance.ad.hsf.a aVarA = com.huawei.openalliance.ad.hsf.a.a(context);
            if (aVar != null) {
                aVar.a();
            }
            aVarA.a(str2, uriFromFile.toString(), dVar);
        } catch (IllegalArgumentException unused) {
            str3 = "installApkViaHsf IllegalArgumentException";
            hw.c("ApkUtil", str3);
            dVar.a();
        } catch (Exception e2) {
            str3 = "installApkViaHsf " + e2.getClass().getSimpleName();
            hw.c("ApkUtil", str3);
            dVar.a();
        }
    }

    public static void a(Context context, String str, String str2) {
        String str3;
        hw.a("ApkUtil", "installApkManually, packageName: %s", str2);
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            if (a(context, Constants.SYSTEM_PKG_INSTALLER)) {
                intent.setPackage(Constants.SYSTEM_PKG_INSTALLER);
            }
            Uri uriA = DownloadFileProvider.a(context, context.getPackageName() + ".hiad.fileprovider", new File(str));
            intent.addFlags(1);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.addFlags(32768);
            intent.setDataAndType(uriA, "application/vnd.android.package-archive");
            if (!dk.b(context, intent)) {
                hw.b("ApkUtil", "system package installer is unavailable");
                intent.setPackage(null);
            }
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            str3 = "installApkManually ActivityNotFoundException";
            hw.c("ApkUtil", str3);
        } catch (Exception e2) {
            str3 = "installApkManually " + e2.getClass().getSimpleName();
            hw.c("ApkUtil", str3);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20660b;

        public int hashCode() {
            String str = this.f20659a;
            return str != null ? str.hashCode() : super.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f20659a;
            return str != null && str.equals(aVar.f20659a);
        }

        public String b() {
            return this.f20660b;
        }

        public String a() {
            return this.f20659a;
        }
    }

    public static void a(Context context, RemoteInstallReq remoteInstallReq, String str, String str2, pe.a aVar) {
        String simpleName;
        hw.a("ApkUtil", "installApkViaHMS, packageName: %s", str2);
        e eVar = new e(aVar, context, str, str2);
        if (b(context, e(context)) == null) {
            eVar.a("HMS is not found");
            return;
        }
        try {
            Uri uriA = DownloadFileProvider.a(context, context.getPackageName() + ".hiad.fileprovider", new File(str));
            context.getApplicationContext().grantUriPermission(e(context), uriA, 1);
            a(context, remoteInstallReq, uriA, aVar, eVar);
        } catch (IllegalArgumentException unused) {
            hw.c("ApkUtil", "installApkViaHMS IllegalArgumentException");
            simpleName = "IllegalArgumentException";
            eVar.a(simpleName);
        } catch (Exception e2) {
            hw.c("ApkUtil", "installApkViaHMS " + e2.getClass().getSimpleName());
            simpleName = e2.getClass().getSimpleName();
            eVar.a(simpleName);
        }
    }

    static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pe.a f20661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f20662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f20663c;
        private final String d;

        protected abstract int d();

        void a(final int i) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.k.b.1
                @Override // java.lang.Runnable
                public void run() {
                    hw.a("ApkUtil", "App install failed, reason :%d", Integer.valueOf(i));
                    AppDownloadTask appDownloadTaskB = com.huawei.openalliance.ad.download.app.e.h().a(b.this.d);
                    if (appDownloadTaskB != null) {
                        rc rcVarC = appDownloadTaskB.C();
                        if (rcVarC != null) {
                            rcVarC.c(Integer.valueOf(b.this.d()), appDownloadTaskB.F(), appDownloadTaskB.P(), appDownloadTaskB.Q(), appDownloadTaskB.G());
                        }
                        if (5 == i && com.huawei.openalliance.ad.download.e.INSTALLING == appDownloadTaskB.i()) {
                            if (b.this.f20661a != null) {
                                b.this.f20661a.a(i);
                                return;
                            }
                            return;
                        }
                    }
                    if (1 == i) {
                        if (b.this.f20661a != null) {
                            b.this.f20661a.a(i);
                        }
                    } else {
                        b bVar = b.this;
                        bVar.a(bVar.d, b.this.f20663c, appDownloadTaskB, b.this.f20661a);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, AppDownloadTask appDownloadTask, pe.a aVar) {
            if (aVar != null) {
                aVar.b();
            }
            if (appDownloadTask != null) {
                k.a(appDownloadTask, EventType.APPINSTALLSTART, 2);
                appDownloadTask.d(2);
            }
            k.a(this.f20662b, str2, str);
        }

        b(pe.a aVar, Context context, String str, String str2) {
            this.f20661a = aVar;
            this.f20662b = context;
            this.f20663c = str;
            this.d = str2;
        }
    }

    private static void a(Context context, RemoteInstallReq remoteInstallReq, Uri uri, pe.a aVar, e eVar) {
        hw.b("ApkUtil", "installViaHmsAidl");
        nc ncVarA = nc.a(context);
        if (aVar != null) {
            aVar.a();
        }
        ncVarA.a(remoteInstallReq, uri, eVar);
    }

    public static void a(Context context, Intent intent, com.huawei.openalliance.ad.utils.dcservice.c cVar) {
        if (cVar != null && dg.b(cVar.f())) {
            cVar.a(b(context, intent));
        }
        if (context == null || intent == null) {
            return;
        }
        try {
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
            com.huawei.openalliance.ad.utils.dcservice.a.a(context, cVar);
        } catch (Throwable th) {
            hw.c("ApkUtil", "start activity error");
            new com.huawei.openalliance.ad.analysis.c(context).a(cVar, th.getMessage());
        }
    }

    public static Set<a> a(Context context, Intent intent) {
        StringBuilder sb;
        String string;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                if (!a(listQueryIntentActivities)) {
                    hw.c("ApkUtil", "queryIntentActivities, activity not exists or not exported.");
                    return null;
                }
                if (!listQueryIntentActivities.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                        if (resolveInfo != null && resolveInfo.activityInfo != null) {
                            a aVar = new a();
                            aVar.f20659a = resolveInfo.activityInfo.packageName;
                            if (!TextUtils.isEmpty(aVar.f20659a)) {
                                aVar.f20660b = a(packageManager, aVar.f20659a);
                                hashSet.add(aVar);
                            }
                        }
                    }
                    return hashSet;
                }
            }
        } catch (ActivityNotFoundException unused) {
            string = "queryIntentActivities, activity not exist";
            hw.c("ApkUtil", string);
        } catch (RuntimeException e2) {
            e = e2;
            sb = new StringBuilder("queryIntentActivities RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            string = sb.toString();
            hw.c("ApkUtil", string);
        } catch (Exception e3) {
            e = e3;
            sb = new StringBuilder("queryIntentActivities Exception:");
            sb.append(e.getClass().getSimpleName());
            string = sb.toString();
            hw.c("ApkUtil", string);
        }
        return null;
    }

    static class d extends b implements com.huawei.openalliance.ad.hsf.a.b {
        @Override // com.huawei.openalliance.ad.utils.k.b
        protected int d() {
            return 3;
        }

        @Override // com.huawei.openalliance.ad.hsf.a.b
        public void c() {
            hw.b("HsfPackageInstallResult", "onInstallFailed");
            a(4);
        }

        @Override // com.huawei.openalliance.ad.hsf.a.b
        public void b() {
            hw.b("HsfPackageInstallResult", "onInstallSuccess");
        }

        @Override // com.huawei.openalliance.ad.hsf.a.b
        public void a() {
            hw.b("HsfPackageInstallResult", "onServiceBindFail");
            a(2);
        }

        d(pe.a aVar, Context context, String str, String str2) {
            super(aVar, context, str, str2);
        }
    }

    private static String a(PackageManager packageManager, String str) {
        String str2;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return packageManager.getApplicationLabel(applicationInfo).toString();
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "getAppName NameNotFoundException";
            hw.c("ApkUtil", str2);
            return null;
        } catch (Exception e2) {
            str2 = "getAppName Exception:" + e2.getClass().getSimpleName();
            hw.c("ApkUtil", str2);
            return null;
        }
    }

    static class e extends nc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f20666a;

        @Override // com.huawei.android.hms.ppskit.c
        public void a(boolean z, int i) {
            hw.b("ApkUtil", "HMS - onInstallResult: " + z + " reason: " + i);
            if (z) {
                return;
            }
            this.f20666a.a(i);
        }

        @Override // com.huawei.openalliance.ad.nc.a
        public void a(String str) {
            c cVar;
            int i;
            hw.c("ApkUtil", "HMS - onServiceCallFailed: " + str);
            if (Constants.FAIL_REASON_SERVICE_DISCONNET.equals(str)) {
                cVar = this.f20666a;
                i = 5;
            } else {
                cVar = this.f20666a;
                i = 2;
            }
            cVar.a(i);
        }

        e(pe.a aVar, Context context, String str, String str2) {
            this.f20666a = new c(aVar, context, str, str2);
        }
    }

    public static String a(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            str = "getPackageInfo NameNotFoundException";
            hw.c("ApkUtil", str);
        } catch (Throwable unused2) {
            str = "getPackageInfo Exception";
            hw.c("ApkUtil", str);
        }
        return null;
    }

    public static PackageInfo a(PackageManager packageManager, String str, int i) {
        if (packageManager == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    static class c extends b {
        @Override // com.huawei.openalliance.ad.utils.k.b
        protected int d() {
            return 4;
        }

        c(pe.a aVar, Context context, String str, String str2) {
            super(aVar, context, str, str2);
        }
    }

    public static Intent a(Context context, String str, String str2, com.huawei.openalliance.ad.utils.dcservice.c cVar, boolean z) {
        String str3;
        try {
            if (TextUtils.isEmpty(str)) {
                cs.a(context, cVar, IntentFailError.INTENT_URI_EMPTY);
                return null;
            }
            boolean z2 = true;
            hw.a("ApkUtil", "need replace intentUri: %s", Boolean.valueOf(z));
            String strDecode = Uri.decode(str);
            if (z) {
                strDecode = c(context, strDecode, cVar);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent uri = Intent.parseUri(strDecode, 1);
                if (!a(uri, str2)) {
                    cs.a(context, cVar, IntentFailError.NOT_SAME_PACKAGE);
                    return null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    uri.setPackage(str2);
                }
                if (uri.getData() != null) {
                    uri = uri.setDataAndTypeAndNormalize(uri.getData(), uri.getType());
                }
                if (Build.VERSION.SDK_INT < 30 || context.getApplicationInfo().targetSdkVersion < 30 || cj.a(context, "android.permission.QUERY_ALL_PACKAGES")) {
                    z2 = false;
                } else {
                    hw.a("ApkUtil", "has no QUERY_ALL_PACKAGES permission");
                    cs.a(context, cVar, IntentFailError.NO_PERMISSION);
                }
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(uri, 0);
                if (bm.a(listQueryIntentActivities)) {
                    if (z2) {
                        return null;
                    }
                    hw.c("ApkUtil", "can not find the activity");
                    cs.a(context, cVar, IntentFailError.ACTIVITY_NOT_FOUND);
                    return null;
                }
                if (!a(listQueryIntentActivities)) {
                    hw.c("ApkUtil", "parseAndCheckIntent, activity not exists or not exported.");
                    cs.a(context, cVar, IntentFailError.ACTIVITY_NOT_EXPORTED);
                    return null;
                }
                if (fp.b(context).a(uri.getPackage())) {
                    a(uri);
                }
                if (!listQueryIntentActivities.isEmpty()) {
                    return uri;
                }
            } else {
                cs.a(context, cVar, IntentFailError.CAN_NOT_GET_PKG_MANAGER);
            }
            return null;
        } catch (ActivityNotFoundException unused) {
            cs.a(context, cVar, IntentFailError.ACTIVITY_NOT_FOUND_EXP);
            str3 = "parseAndCheckIntent, activity not exist";
            hw.c("ApkUtil", str3);
        } catch (URISyntaxException unused2) {
            cs.a(context, cVar, IntentFailError.PARSE_INTENT_ERROR);
            str3 = "parseAndCheckIntent, parse uri fail";
            hw.c("ApkUtil", str3);
        } catch (Exception e2) {
            cs.a(context, cVar, "unknown exception:" + e2.getClass().getSimpleName());
            str3 = "handle intent url fail";
            hw.c("ApkUtil", str3);
        }
    }

    static {
        HashMap map = new HashMap();
        f20658a = map;
        map.put("com.huawei.hwid", Arrays.asList("b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"));
        map.put("com.huawei.hms", Arrays.asList("e49d5c2c0e11b3b1b96ca56c6de2a14ec7dab5ccc3b5f300d03e5b4dba44f539"));
        map.put("com.huawei.hwid.tv", Arrays.asList("3517262215d8d3008cbf888750b6418edc4d562ac33ed6874e0d73aba667bc3c"));
    }
}
