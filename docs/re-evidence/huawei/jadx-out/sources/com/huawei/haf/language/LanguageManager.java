package com.huawei.haf.language;

import android.content.Context;
import android.content.res.Configuration;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.download.DownloadPluginCallback;
import health.compact.a.LogUtil;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LanguageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LanguageCloudHelper f5965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LanguageStoreHelper f5966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static LanguageInfo f5967c;
    private static LanguageMonitor d;
    private static Locale e = Locale.getDefault();

    private LanguageManager() {
    }

    public static boolean e() {
        return LanguagePackage.f5969a;
    }

    public static boolean a() {
        return LanguagePackage.f5970c;
    }

    public static String e(Locale locale, boolean z) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        LanguageInfo languageInfoB = b();
        String languageUuid = languageInfoB.getLanguageUuid(locale);
        if (languageUuid == null) {
            LogUtil.e("HAF_LanguageManager", "getSupportLanguageName is null, locale=", locale.toString());
            if (z) {
                return languageUuid;
            }
        }
        return languageInfoB.getLanguageName(languageUuid, locale);
    }

    public static void d(LanguagePackage languagePackage) {
        if (languagePackage == null) {
            throw new IllegalArgumentException("install argument is illegal");
        }
        if (d != null) {
            LogUtil.e("HAF_LanguageManager", "language package feature is enabled.");
            return;
        }
        if (!e() && !a()) {
            LogUtil.b("HAF_LanguageManager", "language package feature not supported.");
            return;
        }
        LogUtil.b("HAF_LanguageManager", "install language package feature, support list(", Boolean.valueOf(e()), ", ", Boolean.valueOf(a()), ").");
        d = new LanguageMonitor(languagePackage.e());
        f5967c = languagePackage.b();
        if (e()) {
            f5966b = new LanguageStoreHelper(f5967c);
        }
        if (a()) {
            f5965a = new LanguageCloudHelper(languagePackage);
        }
        b("locale reInit", Locale.getDefault());
    }

    public static LanguageInfo b() {
        LanguageInfo languageInfo = f5967c;
        return languageInfo == null ? DefaultLanguageInfo.d() : languageInfo;
    }

    public static void a(boolean z) {
        LanguageCloudHelper languageCloudHelper = f5965a;
        if (languageCloudHelper != null) {
            languageCloudHelper.a(z);
        }
    }

    public static boolean c() {
        LanguageCloudHelper languageCloudHelper = f5965a;
        if (languageCloudHelper != null) {
            return languageCloudHelper.c();
        }
        return true;
    }

    public static int a(int i, DownloadPluginCallback downloadPluginCallback) {
        LanguageCloudHelper languageCloudHelper = f5965a;
        if (languageCloudHelper != null) {
            return languageCloudHelper.d(h(), i, downloadPluginCallback);
        }
        return 0;
    }

    public static void c(String str) {
        LanguageCloudHelper languageCloudHelper = f5965a;
        if (languageCloudHelper == null || !languageCloudHelper.a(h(), str)) {
            return;
        }
        f();
    }

    public static void d() {
        if (f5966b != null) {
            LanguageStoreHelper.c();
        }
        LanguageCloudHelper languageCloudHelper = f5965a;
        if (languageCloudHelper != null) {
            languageCloudHelper.d();
        }
    }

    static void a(Context context) {
        if (context == null) {
            return;
        }
        LanguageStoreHelper languageStoreHelper = f5966b;
        File fileD = languageStoreHelper != null ? languageStoreHelper.d(h()) : null;
        LanguageCloudHelper languageCloudHelper = f5965a;
        LanguageInstallHelper.checkOrUpdateResources("HAF_LanguageManager", context, fileD, languageCloudHelper != null ? languageCloudHelper.b(h()) : null);
    }

    static void d(Configuration configuration, boolean z) {
        LanguageMonitor languageMonitor;
        if (configuration == null) {
            LogUtil.d("HAF_LanguageManager", "newConfig == null");
            return;
        }
        if (configuration.locale == null) {
            LogUtil.d("HAF_LanguageManager", "newConfig.locale == null");
            return;
        }
        if (z && (languageMonitor = d) != null) {
            languageMonitor.a();
        }
        if (configuration.locale.equals(e)) {
            LanguageStoreHelper languageStoreHelper = f5966b;
            if (languageStoreHelper != null) {
                languageStoreHelper.d("locale not changed", configuration);
            }
            LanguageCloudHelper languageCloudHelper = f5965a;
            if (languageCloudHelper != null) {
                languageCloudHelper.d("locale not changed", configuration);
            }
            a(BaseApplication.b());
            return;
        }
        b("locale changed", configuration.locale);
    }

    private static Locale h() {
        return e;
    }

    private static void b(String str, Locale locale) {
        e = locale;
        LanguageStoreHelper languageStoreHelper = f5966b;
        boolean zE = languageStoreHelper != null ? languageStoreHelper.e(str, locale) : false;
        LanguageCloudHelper languageCloudHelper = f5965a;
        boolean zD = languageCloudHelper != null ? languageCloudHelper.d(str, locale) : false;
        if (zE || zD) {
            f();
        }
    }

    private static void f() {
        LanguageMonitor.e();
        LogUtil.b("HAF_LanguageManager", "sendUpdateLanguageReadyBroadcast");
    }
}
