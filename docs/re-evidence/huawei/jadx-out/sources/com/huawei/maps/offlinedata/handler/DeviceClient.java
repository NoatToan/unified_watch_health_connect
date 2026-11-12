package com.huawei.maps.offlinedata.handler;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.maps.offlinedata.handler.dto.device.CancelTransmitRequest;
import com.huawei.maps.offlinedata.handler.dto.device.DeleteMapInfoRequest;
import com.huawei.maps.offlinedata.handler.dto.device.DownloadTypeRequest;
import com.huawei.maps.offlinedata.handler.dto.device.TransmitRequest;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.jsbridge.a;
import com.huawei.maps.offlinedata.service.device.f;
import com.huawei.maps.offlinedata.service.device.tlvtools.b;
import com.huawei.maps.offlinedata.utils.c;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.maps.offlinedata.utils.j;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class DeviceClient extends JsBaseModule {
    private static final int QUERY_DOWNLOAD_TYPE = 2;
    private static final String TAG = "DeviceClient";

    static /* synthetic */ void lambda$queryDevicePing$0(long j, int i) {
        g.c(TAG, "onPingResult code:" + i);
        if (i == 202) {
            a.a().a(Boolean.TRUE, j);
        } else {
            a.a().a(Boolean.FALSE, j);
        }
    }

    @JavascriptInterface
    public void cancelTransmitMap(long j, String str) {
        g.c(TAG, "call cancelTransmitMap start");
        if (TextUtils.isEmpty(str)) {
            g.d(TAG, "cancelTransmitMap receive invalid params");
            a.a().a(-1, "invalid param", j);
            return;
        }
        CancelTransmitRequest cancelTransmitRequest = (CancelTransmitRequest) d.a(str, CancelTransmitRequest.class);
        if (cancelTransmitRequest != null) {
            com.huawei.maps.offlinedata.service.device.d.a().a(cancelTransmitRequest.getRequestId().longValue(), j, cancelTransmitRequest.getContinueTransmit().booleanValue(), 0);
        } else {
            g.d(TAG, "cancelTransmitRequest: params is null");
            a.a().a(-1, "invalid param", j);
        }
    }

    @JavascriptInterface
    public void checkDeviceStatus(long j) {
        a.a().a(Boolean.valueOf(com.huawei.maps.offlinedata.utils.a.a() == 1), j);
    }

    @JavascriptInterface
    public void deleteDeviceMap(long j, String str) {
        try {
            g.c(TAG, "call deleteDeviceMap start, params:" + str);
            if (TextUtils.isEmpty(str)) {
                g.d(TAG, "deleteMap receive invalid params");
                a.a().a(-1, "invalid params.", j);
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) d.a(str, new TypeToken<ArrayList<DeleteMapInfoRequest>>() { // from class: com.huawei.maps.offlinedata.handler.DeviceClient.1
                }.getType());
                if (arrayList != null && !arrayList.isEmpty()) {
                    g.c(TAG, "deleteMapInfos size is " + arrayList.size() + ", deleteMapInfos: " + new Gson().toJson(arrayList));
                    int size = arrayList.size();
                    int i = size % 40 == 0 ? size / 40 : (size / 40) + 1;
                    int iA = b.a();
                    if (arrayList.size() <= 40) {
                        com.huawei.maps.offlinedata.service.device.d.a().a(arrayList, i, 0, iA, j, arrayList.size());
                        return;
                    }
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < size) {
                        int i4 = i2 + 40;
                        com.huawei.maps.offlinedata.service.device.d.a().a(arrayList.subList(i2, Math.min(size, i4)), i, i3, iA, j, arrayList.size());
                        i3++;
                        i2 = i4;
                    }
                    return;
                }
                g.d(TAG, "parse deleteMapInfos is null or empty.");
                a.a().a(-1, "invalid params.", j);
            } catch (Exception e) {
                e = e;
                g.b(TAG, "deleteDeviceMap exception:" + e.getMessage());
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @JavascriptInterface
    public void getOrSetDeviceDownloadType(long j, String str) {
        g.c(TAG, "getOrSetDeviceDownloadType start, params: " + str);
        DownloadTypeRequest downloadTypeRequest = (DownloadTypeRequest) d.a(str, DownloadTypeRequest.class);
        if (downloadTypeRequest == null) {
            g.c(TAG, "getOrSetDeviceDownloadType: params is null");
            return;
        }
        if (com.huawei.maps.offlinedata.utils.a.a() == 1) {
            g.c(TAG, "call getOrSetDeviceDownloadType start");
            com.huawei.maps.offlinedata.service.device.d.a().a(j, downloadTypeRequest.getType(), downloadTypeRequest.getStatus());
        } else if (downloadTypeRequest.getType() == 2) {
            int iA = j.a("autoDownloadStatus" + com.huawei.maps.offlinedata.utils.a.c(), 0, com.huawei.maps.offlinedata.utils.a.b());
            g.c(TAG, "getOrSetDeviceDownloadType status: " + iA);
            a.a().a(Integer.valueOf(iA), j);
        }
    }

    @JavascriptInterface
    public void queryDecompressFile(long j, String str) {
        g.c(TAG, "call queryDecompressFile from h5");
        a.a().a(Boolean.valueOf(c.b(new File(str))), j);
    }

    @JavascriptInterface
    public void queryDeviceAvailableStorage() {
        g.c(TAG, "call queryDeviceAvailableStorage start");
        com.huawei.maps.offlinedata.service.device.d.a().b();
    }

    @JavascriptInterface
    public void queryDeviceDownloadedMapInfo(long j) {
        g.c(TAG, "call queryDeviceDownloadedMapInfo from h5.");
        com.huawei.maps.offlinedata.service.device.d.a().a(j, (Integer) null);
    }

    @JavascriptInterface
    public void queryDevicePing(final long j) {
        g.c(TAG, "call queryDevicePing from h5.");
        com.huawei.maps.offlinedata.service.device.d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.handler.DeviceClient$$ExternalSyntheticLambda0
            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback
            public final void onPingResult(int i) {
                DeviceClient.lambda$queryDevicePing$0(j, i);
            }
        });
    }

    @JavascriptInterface
    public void queryTransmitMap(long j) {
        g.c(TAG, "call queryTransmitMap from h5");
        a.a().a(((OfflineDataTaskEntity) f.b().c().get()).getTaskId(), j);
    }

    @JavascriptInterface
    public void transmitMap(long j, String str) {
        g.c(TAG, "call transmitFile start");
        if (TextUtils.isEmpty(str)) {
            g.d(TAG, "transmitMap receive invalid params");
            a.a().a(-1, "invalid param", j);
            return;
        }
        TransmitRequest transmitRequest = (TransmitRequest) d.a(str, TransmitRequest.class);
        if (transmitRequest == null) {
            g.d(TAG, "transmitMap: params is null");
            a.a().a(-1, "invalid param", j);
            return;
        }
        OfflineDataTaskEntity offlineDataTaskEntityC = com.huawei.maps.offlinedata.service.persist.b.e().c(String.valueOf(transmitRequest.getRequestId()));
        if (offlineDataTaskEntityC == null) {
            g.d(TAG, "transmitMap: task is null");
            a.a().a(-1, "invalid task", j);
        } else if (c.b(new File(transmitRequest.getFileDecompressDir()))) {
            f.b().c(offlineDataTaskEntityC);
            f.b().a(transmitRequest, j);
        } else {
            g.d(TAG, "transmitMap: file not exist");
            a.a().a(-2, "file not exist", j);
        }
    }
}
