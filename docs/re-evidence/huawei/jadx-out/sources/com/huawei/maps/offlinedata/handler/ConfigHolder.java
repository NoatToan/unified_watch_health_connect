package com.huawei.maps.offlinedata.handler;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.maps.offlinedata.handler.dto.ConfigParams;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.jsbridge.a;
import com.huawei.maps.offlinedata.logpush.b;
import com.huawei.maps.offlinedata.service.cloud.utils.e;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class ConfigHolder extends JsBaseModule {
    private static final String TAG = "ConfigHolder";

    @JavascriptInterface
    public void accessTraceLogPusher(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            a.a().a(-1, "invalid param", j);
            return;
        }
        com.huawei.maps.offlinedata.logpush.dto.a aVar = (com.huawei.maps.offlinedata.logpush.dto.a) d.a(str, com.huawei.maps.offlinedata.logpush.dto.a.class);
        if (aVar == null) {
            a.a().a(-1, "invalid param", j);
        } else {
            b.b(aVar);
        }
    }

    @JavascriptInterface
    public String getConfig() {
        int i;
        if (com.huawei.maps.offlinedata.service.config.a.h().d().size() == 0) {
            com.huawei.maps.offlinedata.service.init.a.a().b();
        }
        ConfigParams configParams = new ConfigParams();
        configParams.setApiKey(com.huawei.maps.offlinedata.service.config.a.h().b());
        configParams.setDeviceType(com.huawei.maps.offlinedata.service.config.a.h().g());
        configParams.setDataTypes(com.huawei.maps.offlinedata.service.config.a.h().d());
        configParams.setCloudServiceUrl(com.huawei.maps.offlinedata.service.config.a.h().e());
        configParams.setPolitical(com.huawei.maps.offlinedata.service.config.a.h().k());
        configParams.setDeviceName(com.huawei.maps.offlinedata.service.config.a.h().f());
        configParams.setVersionCode(String.valueOf(e.a()));
        configParams.setRecommendCityIds(com.huawei.maps.offlinedata.service.config.a.h().l());
        configParams.setNewDevice(com.huawei.maps.offlinedata.service.config.a.h().j());
        boolean zIsSmartWatchApMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode();
        boolean zIsSmartWatchMcuMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchMcuMode();
        g.c(TAG, "getConfig--isSmartWatchApMode--" + zIsSmartWatchApMode);
        g.c(TAG, "getConfig--isSmartWatchMcuMode--" + zIsSmartWatchMcuMode);
        if (zIsSmartWatchApMode) {
            i = 1;
        } else {
            i = zIsSmartWatchMcuMode ? 2 : 0;
        }
        configParams.setSmartModeType(i);
        configParams.setAutoDownload(com.huawei.maps.offlinedata.service.config.a.h().c());
        configParams.setMapSki(com.huawei.maps.offlinedata.service.config.a.h().i());
        return d.a(configParams);
    }

    @JavascriptInterface
    public void getLocation(long j) {
        g.c(TAG, "H5 call getLocation start");
        com.huawei.maps.offlinedata.service.location.a.a().a(j);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        com.huawei.maps.offlinedata.jsbridge.b.a().a(this.mH5ProInstance.getWebView());
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        if (com.huawei.maps.offlinedata.service.download.b.b().d().isEmpty() && com.huawei.maps.offlinedata.service.download.b.b().e().isEmpty()) {
            com.huawei.maps.offlinedata.service.network.b.a().c();
        }
    }

    @JavascriptInterface
    public void queryNetwork() {
        if (com.huawei.maps.offlinedata.service.network.b.a().b()) {
            return;
        }
        com.huawei.maps.offlinedata.jsbridge.b.a().a("configHolder.network", String.valueOf(NetworkUtil.getNetworkType(com.huawei.maps.offlinedata.utils.a.b())));
    }
}
