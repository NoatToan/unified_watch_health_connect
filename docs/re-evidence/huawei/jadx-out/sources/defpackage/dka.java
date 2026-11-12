package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginmgr.EzPluginConfigBase;

/* JADX INFO: loaded from: classes26.dex */
final class dka extends EzPluginConfigBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31838a;
    private final String d;

    dka(String str, String str2, boolean z) {
        super(str2);
        this.f31838a = str;
        this.d = z ? "Beta_plugin_index_bundle_version" : "plugin_index_bundle_version";
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getPluginConfigId() {
        return this.f31838a;
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getPluginQueryString(String str) {
        return "version=" + getVersion();
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getIndexFileFiled() {
        return this.d;
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getIndexSaveKey() {
        return "index_bundle_" + getVersion();
    }

    @Override // com.huawei.pluginmgr.EzPluginConfigBase
    public String getPluginSaveKey(String str) {
        return "appbundle-" + str + Constants.LINK + getVersion();
    }
}
