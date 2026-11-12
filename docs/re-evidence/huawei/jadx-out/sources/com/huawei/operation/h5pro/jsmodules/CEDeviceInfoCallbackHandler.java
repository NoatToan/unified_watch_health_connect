package com.huawei.operation.h5pro.jsmodules;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.edc;
import defpackage.eec;
import defpackage.eef;
import defpackage.eeg;
import defpackage.njy;
import health.compact.a.HEXUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class CEDeviceInfoCallbackHandler implements DataReceiveCallback {
    private static final String SRC_PCK_NAME = "hw.health.ppgjsmodule";
    private static final String TAG = "CEDeviceInfoCallbackHandler";
    private final long mCallbackId;
    private edc mCommandProxy;
    private PpgJsModule ppgJsModule;

    public CEDeviceInfoCallbackHandler(edc edcVar, long j, PpgJsModule ppgJsModule) {
        this.ppgJsModule = ppgJsModule;
        this.mCommandProxy = edcVar;
        this.mCallbackId = j;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (!(eecVar instanceof eef)) {
            handleFailed("CEDevice SampleConfig in invalid format");
            return;
        }
        eeg firstSampleConfigInfo = getFirstSampleConfigInfo((eef) eecVar);
        if (firstSampleConfigInfo == null) {
            handleFailed("CEDevice SampleConfig with invalid params");
            return;
        }
        String strB = HEXUtils.b(HEXUtils.a(firstSampleConfigInfo.e()));
        LogUtil.a(TAG, "hexToString is ", strB);
        JSONObject jSONObjectStructResult = structResult(strB);
        LogUtil.a(TAG, "jsonObject is ", jSONObjectStructResult);
        this.ppgJsModule.onSuccessCallback(this.mCallbackId, jSONObjectStructResult);
        this.mCommandProxy.unRegisterDeviceSampleListener(SRC_PCK_NAME);
    }

    private void handleFailed(String str) {
        this.ppgJsModule.onFailureCallback(this.mCallbackId, str);
        this.mCommandProxy.unRegisterDeviceSampleListener(SRC_PCK_NAME);
    }

    private eeg getFirstSampleConfigInfo(eef eefVar) {
        LogUtil.a(TAG, "get first sample config info in sample config");
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (njy.e(configInfoList)) {
            return null;
        }
        return configInfoList.get(0);
    }

    public JSONObject structResult(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("resultCode", 0);
            jSONObject2.put("resultDesc", str);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e(TAG, "structResult JSONException");
            return jSONObject;
        }
    }
}
