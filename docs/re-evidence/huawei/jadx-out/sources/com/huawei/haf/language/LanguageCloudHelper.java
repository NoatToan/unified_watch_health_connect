package com.huawei.haf.language;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.download.DownloadPluginCallback;
import health.compact.a.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class LanguageCloudHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5962b;
    private boolean d;
    private final LanguagePackage h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5963c = false;
    private int e = 1;

    LanguageCloudHelper(LanguagePackage languagePackage) {
        this.h = languagePackage;
    }

    void a(boolean z) {
        this.f5963c = z;
    }

    boolean c() {
        if (e()) {
            return true;
        }
        return this.f5961a;
    }

    int d(Locale locale, int i, DownloadPluginCallback downloadPluginCallback) {
        if (c()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(1);
        b(locale, arrayList);
        if (arrayList.isEmpty()) {
            LogUtil.b("HAF_LanguageCloud", "updateLanguagePackage uuids is empty.");
            return 0;
        }
        LanguagePackage languagePackage = this.h;
        if (downloadPluginCallback == null) {
            downloadPluginCallback = new DefaultDownloadPluginCallback();
        }
        return languagePackage.c(arrayList, i, downloadPluginCallback);
    }

    void d() {
        this.h.e(null);
    }

    boolean d(String str, Locale locale) {
        c(locale);
        e(str, locale);
        if (e()) {
            return false;
        }
        String languageUuid = this.h.b().getLanguageUuid(locale);
        if (languageUuid == null) {
            LogUtil.e("HAF_LanguageCloud", "current locale is not support language package plugin.");
            this.f5961a = true;
            return false;
        }
        boolean zC = c(locale, languageUuid);
        if (!c() && b()) {
            LogUtil.b("HAF_LanguageCloud", "begin download language package, fileId=", languageUuid, ", taskNo=", Integer.valueOf(this.h.c(Collections.singletonList(languageUuid), -1, new DefaultDownloadPluginCallback())));
        }
        return zC;
    }

    void d(String str, Configuration configuration) {
        e(str, configuration.locale);
        int size = configuration.getLocales().size();
        if (this.e == size || !b()) {
            return;
        }
        d(configuration.getLocales());
        this.e = size;
    }

    boolean a(Locale locale, String str) {
        if (c() || str == null || !str.equals(this.h.b().getLanguageUuid(locale))) {
            return false;
        }
        return c(locale, str);
    }

    File b(Locale locale) {
        if (e() || !c()) {
            return null;
        }
        String languageUuid = this.h.b().getLanguageUuid(locale);
        if (languageUuid == null) {
            LogUtil.e("HAF_LanguageCloud", "current locale is not support language package plugin.");
            return null;
        }
        return d(locale, languageUuid);
    }

    private File d(Locale locale, String str) {
        File fileC = this.h.c(str);
        return fileC == null ? e(locale, str) : fileC;
    }

    private File e(Locale locale, String str) {
        File fileA = AppInfoUtils.a((String) null);
        if (fileA == null) {
            LogUtil.d("HAF_LanguageCloud", "cacheDir is null");
            return null;
        }
        File file = new File(fileA, this.h.c(str, locale));
        if (file.exists() && file.isFile()) {
            return file;
        }
        return null;
    }

    private boolean c(Locale locale, String str) {
        File fileD = d(locale, str);
        if (fileD == null) {
            this.f5961a = false;
            return false;
        }
        LanguageInstallHelper.addResources("HAF_LanguageCloud", BaseApplication.b(), fileD);
        boolean zExists = fileD.exists();
        this.f5961a = zExists;
        return zExists;
    }

    private boolean e() {
        return this.d;
    }

    private boolean b() {
        if (!this.f5963c) {
            return false;
        }
        if (NetworkUtil.i()) {
            return true;
        }
        LogUtil.e("HAF_LanguageCloud", "isNetworkAvailable=false");
        return false;
    }

    private void c(Locale locale) {
        String languageUuid = this.h.b().getLanguageUuid(locale);
        this.f5962b = this.h.b().getLanguageName(languageUuid, locale);
        this.d = this.h.b().isCloudPresetLanguage(languageUuid);
    }

    private void b(Locale locale, List<String> list) {
        String languageUuid = this.h.b().getLanguageUuid(locale);
        if (languageUuid == null) {
            LogUtil.e("HAF_LanguageCloud", "locale is not language package plugin, locale=", locale.toString());
        } else if (!this.h.b().isCloudPresetLanguage(languageUuid) && this.h.c(languageUuid) == null) {
            LogUtil.b("HAF_LanguageCloud", "need download fileId=", languageUuid, ", language=", this.h.b().getLanguageName(languageUuid, locale), ", locale=", locale.toString());
            list.add(languageUuid);
        }
    }

    private void d(LocaleList localeList) {
        Locale locale;
        if (localeList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(localeList.size());
        if (!c() && (locale = localeList.get(0)) != null) {
            b(locale, arrayList);
        }
        for (int i = 1; i < localeList.size(); i++) {
            Locale locale2 = localeList.get(i);
            if (locale2 != null) {
                b(locale2, arrayList);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        LogUtil.b("HAF_LanguageCloud", "begin download language package, uuids=", Integer.valueOf(arrayList.size()), ", taskNo=", Integer.valueOf(this.h.c(arrayList, -1, new DefaultDownloadPluginCallback())));
    }

    private void e(String str, Locale locale) {
        boolean zE = e();
        LogUtil.b("HAF_LanguageCloud", str, ", isPreset=", Boolean.valueOf(zE), ", language=", this.f5962b, ", tag=", locale.toLanguageTag(), ", locale=", locale.toString(), ", display=", locale.getDisplayLanguage(), ", sdkVersion=", Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class DefaultDownloadPluginCallback implements DownloadPluginCallback {
        private DefaultDownloadPluginCallback() {
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public boolean onDownloadPluginResult(int i, String str, int i2) {
            LogUtil.b("HAF_LanguageCloud", "onDownloadPluginResult taskNo=", Integer.valueOf(i), ", fileId=", str, ", result=", Integer.valueOf(i2));
            LanguageManager.c(str);
            return false;
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void startDownloadProgress(int i) {
            LogUtil.b("HAF_LanguageCloud", "startDownloadProgress taskNo=", Integer.valueOf(i));
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void showDownloadProgress(int i, int i2, int i3) {
            LogUtil.b("HAF_LanguageCloud", "showDownloadProgress taskNo=", Integer.valueOf(i), ", progress=", Integer.valueOf(i3));
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void onDownloadResult(int i, int i2) {
            LogUtil.b("HAF_LanguageCloud", "onDownloadResult taskNo=", Integer.valueOf(i), ", reason=", Integer.valueOf(i2));
        }
    }
}
