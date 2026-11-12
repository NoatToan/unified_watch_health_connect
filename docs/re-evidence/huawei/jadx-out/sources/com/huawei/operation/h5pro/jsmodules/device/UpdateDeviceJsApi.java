package com.huawei.operation.h5pro.jsmodules.device;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cjk;
import health.compact.a.ReleaseLogUtil;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateDeviceJsApi extends JsBaseModule {
    private static final String TAG = "UpdateDeviceJsApi";
    private static final String TAG_RELEASE = "DEVMGR_UpdateDeviceJsApi";

    @JavascriptInterface
    public void getUpdatePageContent(long j, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(TAG_RELEASE, "getUpdatePageContent JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "getUpdatePageContent jsonObject is null");
            onFailureCallback(j, "jsonObject is null", -1);
            return;
        }
        Map<String, Boolean> updatePageContent = cjk.e().getUpdatePageContent(jSONObject.optString(MatterDataContans.KEY_MAC_ADDRESS));
        if (updatePageContent == null || updatePageContent.isEmpty()) {
            LogUtil.j(TAG, "getUpdatePageContent updateStatus is error");
            onFailureCallback(j, "updateStatus is error", -1);
        } else {
            String strD = HiJsonUtil.d(updatePageContent);
            LogUtil.a(TAG, "getUpdatePageContent result:", strD);
            onSuccessCallback(j, strD);
        }
    }

    @JavascriptInterface
    public void setUpdateStatus(final long j, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(TAG_RELEASE, "setUpdateStatus JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "setUpdateStatus jsonObject is null");
            onFailureCallback(j, "jsonObject is null", -1);
            return;
        }
        String strOptString = jSONObject.optString(MatterDataContans.KEY_MAC_ADDRESS);
        String strOptString2 = jSONObject.optString("content");
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.j(TAG, "setUpdateStatus deviceMac is error");
            onFailureCallback(j, "deviceMac is error", -1);
            return;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            LogUtil.j(TAG, "setUpdateStatus updateStatus is error");
            onFailureCallback(j, "updateStatus is error", -1);
            return;
        }
        Map<String, Boolean> map = (Map) HiJsonUtil.d(strOptString2, Map.class);
        if (map == null || map.isEmpty()) {
            LogUtil.j(TAG, "setUpdateStatus statusMap is null");
            onFailureCallback(j, "H5 param is error", -1);
        } else {
            cjk.e().setUpdateStatus(map, strOptString, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.UpdateDeviceJsApi.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a(UpdateDeviceJsApi.TAG, "setUpdateStatus errorCode :", Integer.valueOf(i));
                    if (i == 0) {
                        UpdateDeviceJsApi.this.responseSuccess(j, obj);
                    } else {
                        UpdateDeviceJsApi.this.onFailureCallback(j, "setUpdateStatus error", -1);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void responseSuccess(long j, Object obj) {
        if (obj instanceof Map) {
            String strD = HiJsonUtil.d((Map) obj);
            LogUtil.a(TAG, "responseSuccess result:", strD);
            onSuccessCallback(j, strD);
        } else {
            ReleaseLogUtil.c(TAG_RELEASE, "responseSuccess error");
            onFailureCallback(j, "request error", -1);
        }
    }

    @JavascriptInterface
    public void isShowOtaPrivacy(long j, String str) {
        LogUtil.a(TAG, "enter isShowOtaPrivacy");
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            ReleaseLogUtil.c(TAG_RELEASE, "isShowOtaPrivacy,get mac error");
            onFailureCallback(j, "get mac error", -1);
        } else {
            onSuccessCallback(j, Boolean.valueOf(cjk.e().isShowOtaPrivacy(deviceMac)));
        }
    }
}
