package health.compact.a;

import com.huawei.haf.download.DownloadPluginCallback;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.haf.language.LanguageInfo;
import com.huawei.haf.language.LanguagePlugin;
import com.huawei.pluginmgr.EzPluginConfigBase;
import defpackage.pia;
import defpackage.pjk;
import defpackage.pjl;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LanguageDownloader implements LanguagePlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EzPluginConfigBase f36592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DownloadPluginUrl f36593b;
    private pjl e;

    public LanguageDownloader(DownloadPluginUrl downloadPluginUrl, String str) {
        this.f36593b = downloadPluginUrl;
        this.f36592a = new pjk("com.huawei.health_languages_one", str);
    }

    @Override // com.huawei.haf.language.LanguagePlugin
    public String getVersion() {
        return this.f36592a.getVersion();
    }

    @Override // com.huawei.haf.language.LanguagePlugin
    public String getCloudDownloadUrl(LanguageInfo languageInfo, String str) {
        String downloadPluginUrl = this.f36593b.getDownloadPluginUrl(null, true);
        StringBuilder sb = new StringBuilder(256);
        sb.append(downloadPluginUrl);
        sb.append(this.f36592a.getPluginConfigId());
        sb.append('?');
        sb.append(this.f36592a.getPluginQueryString(str));
        return sb.toString();
    }

    @Override // com.huawei.haf.language.LanguagePlugin
    public int startUpdateTask(List<String> list, int i, DownloadPluginCallback downloadPluginCallback) {
        return e().d(list, i, downloadPluginCallback, this.f36593b);
    }

    @Override // com.huawei.haf.language.LanguagePlugin
    public void cancelUpdateTask(int i) {
        e().c(i);
    }

    @Override // com.huawei.haf.language.LanguagePlugin
    public File getPluginFile(String str) {
        return e().e(str);
    }

    @Override // com.huawei.haf.language.LanguagePlugin
    public void deleteExpiredPlugins(FilenameFilter filenameFilter) {
        pia.b(filenameFilter);
    }

    private pjl e() {
        if (this.e == null) {
            this.e = new pjl(this.f36592a);
        }
        return this.e;
    }
}
