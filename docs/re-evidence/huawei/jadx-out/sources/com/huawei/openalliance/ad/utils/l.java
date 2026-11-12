package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class l {
    private static boolean b(AppInfo appInfo, Integer num) {
        if (appInfo == null) {
            return false;
        }
        return appInfo.a(num);
    }

    private static boolean b(AppInfo appInfo) {
        if (appInfo == null) {
            return true;
        }
        return appInfo.isCheckSha256() && TextUtils.isEmpty(appInfo.getSha256());
    }

    public static int b(String str, AppInfo appInfo) {
        if (appInfo == null || dg.b(str)) {
            return 1;
        }
        if (a(appInfo)) {
            return 3;
        }
        return a(str) ? 2 : 1;
    }

    private static boolean a(String str) {
        return Constants.FAST_APP_PKG.equalsIgnoreCase(str) || Constants.FAST_APP_DEV_PKG.equalsIgnoreCase(str);
    }

    public static boolean a(AppInfo appInfo, Integer num) {
        String str;
        if (appInfo == null) {
            str = " download app info is empty";
        } else if (TextUtils.isEmpty(appInfo.getPackageName())) {
            str = "app packageName is empty";
        } else {
            if ("11".equals(appInfo.getPriorInstallWay()) || b(appInfo, num) || a(appInfo) || (!TextUtils.isEmpty(appInfo.getDownloadUrl()) && !b(appInfo) && appInfo.getFileSize() > 0)) {
                return false;
            }
            str = " download app info is invalid";
        }
        hw.b("AppDownloadUtils", str);
        return true;
    }

    public static boolean a(AppInfo appInfo, Boolean bool) {
        if (appInfo != null) {
            return (appInfo.c() == 1 || appInfo.c() == 2) && Boolean.TRUE.equals(bool);
        }
        return false;
    }

    public static boolean a(AppInfo appInfo) {
        return (appInfo == null || TextUtils.isEmpty(appInfo.J())) ? false : true;
    }

    public static boolean a(Context context, String str, AppDownloadTask appDownloadTask) {
        if (str == null || appDownloadTask == null || appDownloadTask.B() == null) {
            hw.c("AppDownloadUtils", "auto open invalid para.");
            return false;
        }
        if (fp.b(context).cs()) {
            hw.b("AppDownloadUtils", "media forbidden auto open after install.");
            return false;
        }
        if (appDownloadTask.B().C() != 1 && !a(appDownloadTask.B(), Boolean.valueOf(appDownloadTask.V()))) {
            hw.b("AppDownloadUtils", "no need auto open.");
            return false;
        }
        if (!dk.o(context)) {
            hw.b("AppDownloadUtils", "no need auto open due to caller background.");
            return false;
        }
        hw.a("AppDownloadUtils", "can auto open!");
        return true;
    }

    public static String a(String str, String str2) {
        return (TextUtils.isEmpty(str) || (!(dk.g() && "zh-CN".equalsIgnoreCase(d.c())) && dk.g())) ? str2 : str;
    }

    public static String a(String str, AppInfo appInfo) {
        if (appInfo == null || dg.b(str)) {
            return "app";
        }
        if (a(appInfo)) {
            return ClickDestination.APPMARKET;
        }
        return a(str) ? ClickDestination.FASTAPP : "app";
    }

    public static String a(Context context, AppInfo appInfo, boolean z) {
        String strK;
        String string;
        if (context == null || appInfo == null) {
            return "";
        }
        if (!TextUtils.isEmpty(appInfo.m())) {
            return appInfo.m();
        }
        int i = R.string.hiad_download_download;
        if (z) {
            int i2 = R.string.hiad_preinstall_restore_and_open;
            strK = appInfo.d();
            string = context.getString(i2);
        } else {
            if ("11".equals(appInfo.getPriorInstallWay())) {
                i = appInfo.C() == 1 ? R.string.hiad_preinstall_restore_and_open : R.string.hiad_download_install;
            }
            strK = appInfo.k();
            string = context.getString(i);
        }
        return a(strK, string);
    }

    private static String a(Context context, AppInfo appInfo, String str, int i) {
        return !TextUtils.isEmpty(appInfo.n()) ? appInfo.n() : a(str, context.getString(i));
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.utils.l$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20667a;

        static {
            int[] iArr = new int[com.huawei.openalliance.ad.download.e.values().length];
            f20667a = iArr;
            try {
                iArr[com.huawei.openalliance.ad.download.e.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20667a[com.huawei.openalliance.ad.download.e.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20667a[com.huawei.openalliance.ad.download.e.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20667a[com.huawei.openalliance.ad.download.e.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20667a[com.huawei.openalliance.ad.download.e.DOWNLOADED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20667a[com.huawei.openalliance.ad.download.e.INSTALLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20667a[com.huawei.openalliance.ad.download.e.INSTALLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20667a[com.huawei.openalliance.ad.download.e.WAITING_FOR_WIFI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static String a(Context context, AppInfo appInfo, int i) {
        if (context == null || appInfo == null) {
            return "";
        }
        String strL = appInfo.l();
        if (a(appInfo)) {
            return i == 1 ? context.getString(R.string.hiad_app_preordered) : a(context, appInfo, strL, R.string.hiad_app_preorder);
        }
        return a(context, appInfo, strL, R.string.hiad_download_open);
    }

    public static AppStatus a(AppDownloadTask appDownloadTask) {
        switch (AnonymousClass1.f20667a[appDownloadTask.i().ordinal()]) {
            case 1:
                return appDownloadTask.l() > 0 ? AppStatus.PAUSE : AppStatus.DOWNLOAD;
            case 2:
                return AppStatus.WAITING;
            case 3:
                return AppStatus.DOWNLOADING;
            case 4:
                return AppStatus.PAUSE;
            case 5:
                return AppStatus.INSTALL;
            case 6:
                return AppStatus.INSTALLING;
            case 7:
                return AppStatus.INSTALLED;
            case 8:
                return AppStatus.WAITING_FOR_WIFI;
            default:
                return AppStatus.DOWNLOAD;
        }
    }
}
