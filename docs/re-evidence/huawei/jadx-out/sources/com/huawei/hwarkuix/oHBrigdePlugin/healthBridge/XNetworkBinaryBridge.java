package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.ble.BleConstants;
import com.tencent.open.utils.HttpUtils;
import defpackage.oet;
import defpackage.peh;
import health.compact.a.util.LogUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;

/* JADX INFO: loaded from: classes10.dex */
public class XNetworkBinaryBridge extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_XNetworkBinaryBridge";
    private static final String TAG = "ArkUIX_XNetworkBinaryBridge";

    public XNetworkBinaryBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public XNetworkBinaryBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public XNetworkBinaryBridge(Context context, String str, BridgeManager bridgeManager, BridgePlugin.BridgeType bridgeType) {
        super(context, str, bridgeManager, bridgeType);
    }

    public void get(final long j, Object obj) {
        LogUtil.a(TAG, "get enter, callbackId ", Long.valueOf(j), " param:", obj);
        if (!NetworkUtil.i()) {
            ohProOnFailure(j, HttpUtils.NetworkUnavailableException.ERROR_INFO);
        } else if (obj instanceof String) {
            Request request = (Request) peh.b((String) obj, Request.class);
            oet.d().e(request.url, request.headers, request.data == null ? Collections.EMPTY_MAP : peh.b(HiJsonUtil.d(request.data)), byte[].class, new ResultCallback<byte[]>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBinaryBridge.1
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(byte[] bArr) {
                    LogUtil.a(XNetworkBinaryBridge.TAG, "callbackId:", Long.valueOf(j), "success", bArr);
                    XNetworkBinaryBridge.this.ohProOnSuccess(j, ByteBuffer.wrap(bArr));
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    long j2 = j;
                    ReleaseLogUtil.b(XNetworkBinaryBridge.R_TAG, "callbackId:", Long.valueOf(j2), ExceptionUtils.c(th));
                    XNetworkBinaryBridge.this.ohProOnFailure(j, "callHttpGet Failure");
                }
            });
        } else {
            LogUtil.d(TAG, "params not valid");
            ohProOnFailure(j, "params not valid");
        }
    }

    public void getUnsupportedDevicesImg(long j, String str) {
        ohProOnFailure(j, "getUnsupportedDevicesImg deviceBridgeApi is null");
    }

    /* JADX INFO: loaded from: classes37.dex */
    class Request {

        @SerializedName("data")
        Object data;

        @SerializedName("headers")
        Map<String, String> headers;

        @SerializedName("method")
        String method;

        @SerializedName(BleConstants.KEY_PATH)
        String path;

        @SerializedName("timeout")
        int timeout;

        @SerializedName("url")
        String url;

        Request() {
        }

        public String toString() {
            return "Request{method='" + this.method + "', url='" + this.url + "', data='" + this.data + "', timeout=" + this.timeout + ", headers=" + this.headers + '}';
        }
    }
}
