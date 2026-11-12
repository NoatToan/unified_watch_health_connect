package com.huawei.haf.language;

import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.download.DownloadPluginCallback;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.BuildConfigProperties;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LanguagePackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f5969a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f5970c;
    private final LanguageInfo d;
    private final LanguagePlugin e;

    static {
        f5969a = AppBundleBuildConfig.o() || BuildConfigProperties.a("SUPPORT_STORE_LANGUAGE", false);
        f5970c = BuildConfigProperties.a("SUPPORT_CLOUD_LANGUAGE", false);
    }

    public LanguagePackage(LanguagePlugin languagePlugin) {
        this(null, languagePlugin);
    }

    public LanguagePackage(LanguageInfo languageInfo, LanguagePlugin languagePlugin) {
        this.d = languageInfo == null ? DefaultLanguageInfo.d() : languageInfo;
        this.e = languagePlugin;
    }

    public boolean e() {
        return this.e != null;
    }

    public LanguageInfo b() {
        return this.d;
    }

    public int c(List<String> list, int i, DownloadPluginCallback downloadPluginCallback) {
        LanguagePlugin languagePlugin = this.e;
        if (languagePlugin != null) {
            return languagePlugin.startUpdateTask(list, i, downloadPluginCallback);
        }
        return 0;
    }

    public File c(String str) {
        LanguagePlugin languagePlugin = this.e;
        if (languagePlugin != null) {
            return languagePlugin.getPluginFile(str);
        }
        return null;
    }

    public void e(String str) {
        LanguagePlugin languagePlugin = this.e;
        if (languagePlugin == null) {
            return;
        }
        if (this.d instanceof DefaultLanguageInfo) {
            if (TextUtils.isEmpty(str)) {
                str = this.e.getVersion();
            }
            this.e.deleteExpiredPlugins(new OtherLanguagePackageFilter(this.d.getAllLanguageUuid(false), str));
            return;
        }
        languagePlugin.deleteExpiredPlugins(null);
    }

    public String c(String str, Locale locale) {
        StringBuilder sb = new StringBuilder(32);
        sb.append("language-");
        sb.append(this.d.getLanguageName(str, locale));
        sb.append(".lpk");
        return sb.toString();
    }

    static class OtherLanguagePackageFilter implements FilenameFilter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection<String> f5971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5972c;
        private final int d;
        private final String e;

        OtherLanguagePackageFilter(Collection<String> collection, String str) {
            this.e = str;
            this.f5972c = Constants.LINK + str;
            this.f5971b = collection;
            this.d = collection.isEmpty() ? 0 : collection.iterator().next().length();
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (this.d <= 0 || str == null) {
                return false;
            }
            int length = str.length();
            int i = this.d;
            if (length <= i) {
                if (str.startsWith(this.e, 15)) {
                    return false;
                }
                return str.startsWith(LanguagePlugin.INDEX_LANGUAGE_DIR);
            }
            if (str.startsWith(this.f5972c, i)) {
                return false;
            }
            return this.f5971b.contains(str.substring(0, this.d));
        }
    }
}
