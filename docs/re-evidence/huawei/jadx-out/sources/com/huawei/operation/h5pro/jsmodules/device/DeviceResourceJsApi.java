package com.huawei.operation.h5pro.jsmodules.device;

import android.webkit.JavascriptInterface;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cjk;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DeviceResourceJsApi extends JsBaseModule {
    private static final int DOWNLOAD_RESOURCE_FAIL = 100010;
    private static final int DOWNLOAD_RESOURCE_NETWORK_ERROR = 100008;
    private static final String TAG = "DeviceResourceJsApi";

    @JavascriptInterface
    public void downloadResource(final long j, String str) {
        ReleaseLogUtil.c(TAG, "downloadResource callbackId ", Long.valueOf(j));
        String devicePairInfo = DevicePairUtils.getDevicePairInfo(str);
        List<String> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(devicePairInfo);
            if (jSONObject.has("uuids")) {
                arrayList = (List) HiJsonUtil.d(jSONObject.optString("uuids"), List.class);
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "isReconnect error");
        }
        cjk.b().downloadIndexByUuidList(arrayList, new DownloadDeviceInfoCallBack() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceResourceJsApi.1
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onSuccess() {
                DeviceResourceJsApi.this.onCompleteCallback(j, "", 0);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onFailure(int i) {
                DeviceResourceJsApi.this.onFailureCallback(j, "", DeviceResourceJsApi.DOWNLOAD_RESOURCE_FAIL);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void netWorkError() {
                DeviceResourceJsApi.this.onFailureCallback(j, "", DeviceResourceJsApi.DOWNLOAD_RESOURCE_NETWORK_ERROR);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onDownload(int i) {
                DeviceResourceJsApi.this.onSuccessCallback(j, Integer.valueOf(i));
            }
        });
    }

    @JavascriptInterface
    public void getPairDescription(long j, String str) {
        ReleaseLogUtil.c(TAG, "enter getPairDescription, callbackId: ", Long.valueOf(j));
        cjk.b().getPairDescription("");
        HashMap map = new HashMap();
        map.put("deviceShape", 1);
        onSuccessCallback(j, HiJsonUtil.d(map));
    }

    @JavascriptInterface
    public void getValueFeature(long j, String str) {
        ReleaseLogUtil.c(TAG, "enter getValueFeature, callbackId: ", Long.valueOf(j));
        cjk.b().getValueFeature("");
        onSuccessCallback(j, new ArrayList());
    }
}
