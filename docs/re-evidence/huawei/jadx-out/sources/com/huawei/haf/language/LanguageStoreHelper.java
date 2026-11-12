package com.huawei.haf.language;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileFilterUtils;
import com.huawei.haf.common.os.FileLockHelper;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import health.compact.a.LogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class LanguageStoreHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f5974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LanguageInfo f5975c;
    private int d;
    private String e;

    LanguageStoreHelper(LanguageInfo languageInfo) {
        this.f5975c = languageInfo;
        File file = new File(e(), BaseApplication.i());
        FileUtils.c(file);
        this.f5974b = new File(file, "base-all.lpk");
        this.d = 1;
    }

    static void c() {
        FileUtils.a(e(), new FileFilterUtils.FileNotEqualsCollectFilter(BaseApplication.i()));
    }

    boolean e(String str, Locale locale) {
        a(locale);
        b(str, locale);
        File fileB = b(locale);
        if (!b(fileB)) {
            b(!b(), fileB);
            if (!fileB.exists()) {
                return false;
            }
        }
        if (b()) {
            return false;
        }
        return LanguageInstallHelper.addResources("HAF_LanguageStore", BaseApplication.b(), fileB);
    }

    void d(String str, Configuration configuration) {
        b(str, configuration.locale);
        int size = configuration.getLocales().size();
        if (this.d != size) {
            b(configuration.getLocales());
            this.d = size;
        }
    }

    File d(Locale locale) {
        if (b()) {
            return null;
        }
        return b(locale);
    }

    private File b(Locale locale) {
        return this.f5974b;
    }

    private boolean b() {
        return this.f5973a;
    }

    private void a(Locale locale) {
        String languageUuid = this.f5975c.getLanguageUuid(locale);
        this.e = this.f5975c.getLanguageName(languageUuid, locale);
        this.f5973a = this.f5975c.isStorePresetLanguage(languageUuid);
    }

    private void b(LocaleList localeList) {
        for (int i = 0; i < localeList.size(); i++) {
            Locale locale = localeList.get(i);
            if (locale != null) {
                File fileB = b(locale);
                if (!b(fileB)) {
                    b(false, fileB);
                }
            }
        }
    }

    private void b(String str, Locale locale) {
        boolean zB = b();
        LogUtil.b("HAF_LanguageStore", str, ", isPreset=", Boolean.valueOf(zB), ", language=", this.e, ", tag=", locale.toLanguageTag(), ", locale=", locale.toString(), ", display=", locale.getDisplayLanguage(), ", sdkVersion=", Integer.valueOf(Build.VERSION.SDK_INT));
    }

    private static boolean b(File file) {
        if (!file.exists()) {
            return false;
        }
        File fileE = e(file);
        if (!fileE.exists()) {
            return false;
        }
        if ((!file.canWrite() && fileE.lastModified() == file.lastModified()) || LanguageInstallHelper.checkUsedResources(file)) {
            return true;
        }
        LogUtil.e("HAF_LanguageStore", "Detected attacks and sabotage, file '" + file.getName() + "' has been illegally modified.");
        return false;
    }

    private static boolean e(File file, String str, File file2) {
        File[] fileArrListFiles = file.listFiles(new FileFilterUtils.FilePrefixCollectFilter(str));
        if (CollectionUtils.d(fileArrListFiles)) {
            return true;
        }
        boolean z = true;
        for (File file3 : fileArrListFiles) {
            if (!file3.equals(file2)) {
                z = FileUtils.b(file3) && z;
            }
        }
        return z;
    }

    private static File e() {
        return AppInfoUtils.g("language_plugins");
    }

    private static File e(File file) {
        String strValueOf = BaseLanguageInfo.f5977a.d;
        if (TextUtils.isEmpty(strValueOf)) {
            strValueOf = String.valueOf(Math.abs(AppInfoUtils.b() - 1588291688888L));
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(file.getName());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(strValueOf);
        sb.append(".done");
        return new File(file.getParentFile(), sb.toString());
    }

    private static File d(File file) {
        return new File(file.getParentFile(), file.getName() + ".lock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z, final File file) {
        if (!z) {
            ThreadPoolManager.c().b("HAF_LanguageStore", new Runnable() { // from class: com.huawei.haf.language.LanguageStoreHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    LanguageStoreHelper.b(true, file);
                }
            });
            return;
        }
        File fileD = d(file);
        FileLockHelper fileLockHelperD = null;
        try {
            fileLockHelperD = FileLockHelper.d(fileD);
            for (int i = 0; i < 3 && !e(file, fileD); i++) {
            }
        } catch (IOException e) {
            LogUtil.e("HAF_LanguageStore", "extractLanguages getFileLock fail, ex=", LogUtil.c(e));
            e(file, fileD);
        } finally {
            FileUtils.a(fileLockHelperD);
        }
    }

    private static boolean e(File file, File file2) {
        synchronized (LanguageStoreHelper.class) {
            boolean z = true;
            if (b(file)) {
                return true;
            }
            File fileE = e(file);
            boolean z2 = false;
            try {
                try {
                    File parentFile = fileE.getParentFile();
                    if (file.exists() || fileE.exists()) {
                        String name = file.getName();
                        LogUtil.b("HAF_LanguageStore", "delete old or bad file ", name, ", result=", Boolean.valueOf(e(parentFile, name, file2)));
                    } else {
                        FileUtils.c(parentFile);
                    }
                    if (!a(file)) {
                        z = false;
                    } else if (FileUtils.d(fileE, true)) {
                        fileE.setLastModified(file.lastModified());
                    } else {
                        LogUtil.e("HAF_LanguageStore", "extractLanguages createNewFile fail.");
                        z = false;
                    }
                    if (!z) {
                        FileUtils.b(file);
                        FileUtils.b(fileE);
                    }
                    z2 = z;
                } catch (Exception e) {
                    LogUtil.d("HAF_LanguageStore", "extract package ", file.getPath(), " file fail. exception:", LogUtil.c(e));
                    FileUtils.b(file);
                    FileUtils.b(fileE);
                }
                return z2;
            } catch (Throwable th) {
                FileUtils.b(file);
                FileUtils.b(fileE);
                throw th;
            }
        }
    }

    private static boolean a(File file) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context contextB = BaseApplication.b();
        BaseLanguageInfo baseLanguageInfo = BaseLanguageInfo.f5977a;
        InputStream inputStreamOpen = contextB.getAssets().open("language_plugins/base-all.lpk");
        try {
            long jD = FileUtils.d(inputStreamOpen, file);
            FileUtils.f(file);
            boolean z = true;
            if (baseLanguageInfo.c(file)) {
                LogUtil.b("HAF_LanguageStore", "decode language package from assets, result=", true, ", times=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", fileSize=", Long.valueOf(file.length()), ", valid=", Boolean.valueOf(baseLanguageInfo.f5978c > 0));
            } else {
                LogUtil.e("HAF_LanguageStore", "decode language package from assets, result=", false, ", times=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", fileSize=", Long.valueOf(file.length()), ", decodeSize=", Long.valueOf(jD), ", hopeSize=", Long.valueOf(baseLanguageInfo.f5978c));
                z = false;
            }
            return z;
        } finally {
            FileUtils.a(inputStreamOpen);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class BaseLanguageInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final BaseLanguageInfo f5977a = e(BaseApplication.b());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f5978c;
        private final String d;

        private BaseLanguageInfo(long j, String str) {
            this.f5978c = j;
            this.d = str;
        }

        boolean c(File file) {
            if (!file.exists()) {
                return false;
            }
            long j = this.f5978c;
            if (j > 0 && j != file.length()) {
                return false;
            }
            if (TextUtils.isEmpty(this.d)) {
                return true;
            }
            return this.d.equals(SecurityUtils.d(file));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0055  */
        /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v7 */
        static BaseLanguageInfo e(Context context) throws Throwable {
            Throwable e;
            InputStream inputStreamOpen;
            ?? r0 = 0;
            BaseLanguageInfo baseLanguageInfo = null;
            try {
                try {
                    inputStreamOpen = context.getAssets().open("language_plugins/base-all.json");
                    try {
                        JSONObject jSONObject = new JSONObject(FileUtils.e(inputStreamOpen, CacheDataSink.DEFAULT_FRAGMENT_SIZE));
                        BaseLanguageInfo baseLanguageInfo2 = new BaseLanguageInfo(jSONObject.getLong("fileSize"), jSONObject.getString("digest"));
                        FileUtils.a(inputStreamOpen);
                        baseLanguageInfo = baseLanguageInfo2;
                        context = inputStreamOpen;
                    } catch (IOException e2) {
                        e = e2;
                        LogUtil.e("HAF_LanguageStore", "readBaseLanguageInfo fail, ex=", LogUtil.c(e));
                        FileUtils.a(inputStreamOpen);
                        context = inputStreamOpen;
                    } catch (JSONException e3) {
                        e = e3;
                        LogUtil.e("HAF_LanguageStore", "readBaseLanguageInfo fail, ex=", LogUtil.c(e));
                        FileUtils.a(inputStreamOpen);
                        context = inputStreamOpen;
                    }
                } catch (Throwable th) {
                    r0 = context;
                    th = th;
                    FileUtils.a((Closeable) r0);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                e = e;
                inputStreamOpen = null;
                LogUtil.e("HAF_LanguageStore", "readBaseLanguageInfo fail, ex=", LogUtil.c(e));
                FileUtils.a(inputStreamOpen);
                context = inputStreamOpen;
                if (baseLanguageInfo != null) {
                    return baseLanguageInfo;
                }
                return new BaseLanguageInfo(0L, "");
            } catch (JSONException e5) {
                e = e5;
                e = e;
                inputStreamOpen = null;
                LogUtil.e("HAF_LanguageStore", "readBaseLanguageInfo fail, ex=", LogUtil.c(e));
                FileUtils.a(inputStreamOpen);
                context = inputStreamOpen;
                if (baseLanguageInfo != null) {
                    return baseLanguageInfo;
                }
                return new BaseLanguageInfo(0L, "");
            } catch (Throwable th2) {
                th = th2;
                FileUtils.a((Closeable) r0);
                throw th;
            }
            if (baseLanguageInfo != null) {
                return baseLanguageInfo;
            }
            return new BaseLanguageInfo(0L, "");
        }
    }
}
