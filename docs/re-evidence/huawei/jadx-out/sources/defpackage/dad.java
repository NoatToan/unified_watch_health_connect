package defpackage;

import com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi;
import com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback;
import com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class dad extends AppBundlePluginProxy<PluginWearOtaApi> implements PluginWearOtaApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile dad f31571c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31572b;
    private String d;
    private PluginWearOtaApi e;

    private dad() {
        super("PluginWearOtaProxy", "PluginWearAbility", "com.huawei.health.pluginwearota.PluginWearOtaApiImpl");
        this.e = createPluginApi();
    }

    public static dad c() {
        dad dadVar;
        if (f31571c == null) {
            synchronized (dad.class) {
                if (f31571c == null) {
                    f31571c = new dad();
                }
                dadVar = f31571c;
            }
            return dadVar;
        }
        return f31571c;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(PluginWearOtaApi pluginWearOtaApi) {
        pluginWearOtaApi.initDueSdk(this.d, this.f31572b, null);
        this.e = pluginWearOtaApi;
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void initDueSdk(String str, String str2, InitCallback initCallback) {
        this.d = str;
        this.f31572b = str2;
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.initDueSdk(str, str2, initCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "init loadPlugin");
            loadPlugin();
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void checkNewVersion(String str, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.checkNewVersion(str, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "checkNewVersion mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void getNewVersion(String str, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.getNewVersion(str, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "getNewVersion mPluginWearOtaApi is null");
            loadPlugin();
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void silentUpgrade(String str, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.silentUpgrade(str, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "silentUpgrade mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void setSettingSwitch(String str, String str2) {
        this.d = str;
        this.f31572b = str2;
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.setSettingSwitch(str, str2);
        } else {
            LogUtil.j("PluginWearOtaProxy", "setSettingSwitch mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void getSettingSwitch(String str, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.getSettingSwitch(str, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "getSettingSwitch mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void getDeviceNewVersion(String str, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.getDeviceNewVersion(str, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "getDeviceNewVersion mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void doUpgrade(String str, String str2, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.doUpgrade(str, str2, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "doUpgrade mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void getUpgradeStatus(String str, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.getUpgradeStatus(str, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "getUpgradeStatus mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void registerUpgradeListener(String str, CompleteCallback completeCallback) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.registerUpgradeListener(str, completeCallback);
        } else {
            LogUtil.j("PluginWearOtaProxy", "registerUpgradeListener mPluginWearOtaApi is null");
        }
    }

    @Override // com.huawei.fullscenarioservice.pluginwearota.PluginWearOtaApi
    public void unRegisterUpgradeListener(String str) {
        PluginWearOtaApi pluginWearOtaApi = this.e;
        if (pluginWearOtaApi != null) {
            pluginWearOtaApi.unRegisterUpgradeListener(str);
        } else {
            LogUtil.j("PluginWearOtaProxy", "unRegisterUpgradeListener mPluginWearOtaApi is null");
        }
    }
}
