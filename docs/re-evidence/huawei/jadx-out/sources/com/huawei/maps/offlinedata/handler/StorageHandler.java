package com.huawei.maps.offlinedata.handler;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.maps.offlinedata.handler.dto.StorageConfig;
import com.huawei.maps.offlinedata.service.storage.a;
import com.huawei.maps.offlinedata.utils.c;
import com.huawei.maps.offlinedata.utils.d;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class StorageHandler extends JsBaseModule {
    @JavascriptInterface
    public void deleteFile(String str) {
        c.c(new File(str));
    }

    @JavascriptInterface
    public long getAvailableStorageSize() {
        return a.e().a();
    }

    @JavascriptInterface
    public String getStorageConfig() {
        StorageConfig storageConfig = new StorageConfig();
        storageConfig.setDownloadDir(a.e().d());
        storageConfig.setDecompressDir(a.e().c());
        return d.a(storageConfig);
    }
}
