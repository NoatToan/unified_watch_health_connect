package defpackage;

import android.text.TextUtils;
import com.huawei.haf.language.LanguageManager;
import com.huawei.haf.language.LanguagePlugin;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginmgr.EzPluginConfigBase;

/* JADX INFO: loaded from: classes.dex */
public final class pjk extends EzPluginConfigBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45494a;

    public pjk(String str, String str2) {
        super(str2);
        this.f45494a = str;
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getPluginConfigId() {
        return this.f45494a;
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getPluginQueryString(String str) {
        String str2 = "version=" + getVersion();
        if (TextUtils.isEmpty(str) || !LanguageManager.b().isCloudSecondLanguage(str)) {
            return str2;
        }
        return str2 + "&type=second";
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getIndexFileFiled() {
        return "plugin_index_languages_version";
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getIndexSaveKey() {
        return LanguagePlugin.INDEX_LANGUAGE_DIR + getVersion();
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getPluginSaveKey(String str) {
        return str + Constants.LINK + getVersion();
    }
}
