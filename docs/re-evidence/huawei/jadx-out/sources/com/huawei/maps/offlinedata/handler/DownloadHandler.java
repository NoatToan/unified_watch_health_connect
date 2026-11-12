package com.huawei.maps.offlinedata.handler;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.maps.offlinedata.handler.dto.DownloadRequest;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.service.download.a;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class DownloadHandler extends JsBaseModule {
    private static final String TAG = "DownloadHandler";

    @JavascriptInterface
    public boolean cancel(String str) {
        return a.a().a(Long.parseLong(str));
    }

    @JavascriptInterface
    public String download(String str) {
        DownloadRequest downloadRequest = (DownloadRequest) d.a(str, DownloadRequest.class);
        if (downloadRequest != null) {
            return a.a().a(downloadRequest, (OfflineDataTaskEntity) null);
        }
        g.c(TAG, "startOfflineDataDownload: params is null");
        return "";
    }

    @JavascriptInterface
    public boolean pause(String str) {
        return a.a().b(Long.parseLong(str));
    }

    @JavascriptInterface
    public boolean resume(String str) {
        return a.a().a(Long.parseLong(str), (OfflineDataTaskEntity) null);
    }
}
