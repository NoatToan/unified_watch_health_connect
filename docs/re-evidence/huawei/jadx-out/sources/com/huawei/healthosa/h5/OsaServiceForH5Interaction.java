package com.huawei.healthosa.h5;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.study.apnea.model.bean.algorithm.OsaAppInputS;
import com.study.apnea.utils.jni.OsaCalUtils;
import defpackage.dyb;
import defpackage.ecu;
import defpackage.edc;
import defpackage.eec;
import defpackage.eef;
import defpackage.eeg;
import defpackage.eeq;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.eey;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class OsaServiceForH5Interaction extends JsBaseModule {
    public static final int ACTION_MODIFY = 1;
    public static final int ACTION_QUERY = 2;
    private static final int BIT_CONVERT_BYTE = 2;
    private static final int COMMAND_LENGTH = 1;
    private static final int COMMAND_TYPE = 1;
    private static final long CONFIG_ID = 900300008;
    private static final long CONFIG_ID_ACTIVE_SWITCH = 900300007;
    private static final int DEFAULT_ACTION = 1;
    private static final int DEFAULT_ERROR = -1;
    private static final Object LOCK = new Object();
    private static final String RELEASE_TAG = "R_OsaServiceForH5Interaction";
    private static final int SETTING_COMMEND = 1;
    private static final String SRC_PCK_NAME = "hw.health.apneajsmodule";
    private static final int TASK_STATUS_FAILURE = 0;
    private static final int TYPE_ACTIVE = 1;
    private static final String WEAR_PCK_NAME = "hw.watch.health.osa";
    private static OsaServiceForH5Interaction mInteraction;
    private long activeCallBackId;
    private DataReceiveCallback receiveCallback = new DataReceiveCallback() { // from class: com.huawei.healthosa.h5.OsaServiceForH5Interaction.3
        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
            LogUtil.b(OsaServiceForH5Interaction.this.TAG, "errorCode=", Integer.valueOf(i));
            if (!(eecVar instanceof eef)) {
                LogUtil.e(OsaServiceForH5Interaction.this.TAG, "message error");
                return;
            }
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (njy.e(configInfoList)) {
                OsaServiceForH5Interaction osaServiceForH5Interaction = OsaServiceForH5Interaction.this;
                osaServiceForH5Interaction.onFailureCallback(osaServiceForH5Interaction.activeCallBackId, "listInfo isEmpty", -1);
                LogUtil.e(OsaServiceForH5Interaction.this.TAG, "listInfo isEmpty");
            } else {
                eeg eegVar = configInfoList.get(0);
                if (eegVar != null) {
                    LogUtil.b(OsaServiceForH5Interaction.this.TAG, eegVar.toString());
                }
                OsaServiceForH5Interaction.this.getOsaActiveResult(eegVar);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void getOsaActiveResult(eeg eegVar) {
        JSONException e;
        int iV;
        eeu e2;
        if (eegVar == null) {
            LogUtil.e(this.TAG, "info ==null");
            return;
        }
        if (eegVar.c() != CONFIG_ID_ACTIVE_SWITCH) {
            LogUtil.e(this.TAG, "byteConfigData == null");
            return;
        }
        byte[] bArrE = eegVar.e();
        if (bArrE == null) {
            LogUtil.e(this.TAG, "byteConfigData == null");
            onFailureCallback(this.activeCallBackId, "byteConfigData == null", -1);
            return;
        }
        String strE = eeq.e(bArrE);
        try {
            List<eew> listE = new eet().b(strE).e();
            if (listE != null && listE.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                Iterator<eew> it = listE.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iV = -1;
                        break;
                    }
                    eew next = it.next();
                    if (CommonUtil.v(next.e()) == 1) {
                        iV = CommonUtil.v(next.b());
                        try {
                            jSONObject.put("result", iV);
                            break;
                        } catch (eeu e3) {
                            e2 = e3;
                            onFailureCallback(this.activeCallBackId, e2.getMessage(), -1);
                            LogUtil.d(this.TAG, "tlvException");
                        } catch (JSONException e4) {
                            e = e4;
                            onFailureCallback(this.activeCallBackId, e.getMessage(), -1);
                            LogUtil.d(this.TAG, "jsonException");
                        }
                    }
                }
                onSuccessCallback(this.activeCallBackId, jSONObject);
                LogUtil.b(this.TAG, "dataHex=", strE, "result=", Integer.valueOf(iV));
                return;
            }
            onFailureCallback(this.activeCallBackId, "tlvList is null or empty", -1);
            LogUtil.e(this.TAG, "parseConfigData tlvList is null or empty");
        } catch (eeu e5) {
            e2 = e5;
            iV = -1;
        } catch (JSONException e6) {
            e = e6;
            iV = -1;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        edc.e();
    }

    public static OsaServiceForH5Interaction getInstance() {
        synchronized (LOCK) {
            if (mInteraction == null) {
                mInteraction = new OsaServiceForH5Interaction();
            }
        }
        return mInteraction;
    }

    @JavascriptInterface
    public void getOsaOutput(long j, String str) {
        LogUtil.c(this.TAG, "getOsaOutput in", str);
        String json = "";
        if (str == null || "".equals(str)) {
            onFailureCallback(j, "", 0);
            return;
        }
        try {
            Gson gson = new Gson();
            json = gson.toJson(OsaCalUtils.getInstance().osaCalAppResult((OsaAppInputS) gson.fromJson(str, OsaAppInputS.class)));
            LogUtil.c(this.TAG, "getOsaOutput out", json);
            onSuccessCallback(j, json);
        } catch (IllegalStateException e) {
            LogUtil.d(this.TAG, "getOsaOutput is exception : ", e.getMessage());
            onFailureCallback(j, json, 0);
        }
    }

    @JavascriptInterface
    public void isSupportOsaOffload(long j) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        if (deviceInfo == null) {
            LogUtil.e(this.TAG, "deviceInfo==null");
            onFailureCallback(j, "deviceInfo==null", -1);
            return;
        }
        boolean zD = eey.d(deviceInfo, 107);
        LogUtil.b(this.TAG, "isSupportSleepApnea", Boolean.valueOf(zD));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zD);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException unused) {
            LogUtil.d(this.TAG, "jsonException");
        }
    }

    @JavascriptInterface
    public void setSleepApneaActiveState(long j, String str) {
        this.activeCallBackId = j;
        LogUtil.b(this.TAG, "jsonString:", str);
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        if (deviceInfo == null) {
            LogUtil.e(this.TAG, "DeviceInfo==null");
            onFailureCallback(j, "DeviceInfo==null", -1);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.has("action") ? jSONObject.getInt("action") : 1;
            int i2 = jSONObject.has("state") ? jSONObject.getInt("state") : 1;
            if (i == 2) {
                getOsaStatus(deviceInfo, j);
            } else {
                sendDeviceCommand(i2, i, deviceInfo, j);
            }
        } catch (JSONException unused) {
            LogUtil.d(this.TAG, "jsonException");
            onFailureCallback(j, TrackConstants$Events.EXCEPTION, -1);
        }
    }

    private void sendDeviceCommand(int i, int i2, DeviceInfo deviceInfo, long j) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName(SRC_PCK_NAME);
        eefVar.setWearPkgName(WEAR_PCK_NAME);
        eeg eegVar = new eeg();
        eegVar.b(CONFIG_ID_ACTIVE_SWITCH);
        eegVar.b(i2);
        eegVar.c(Long.valueOf(System.currentTimeMillis()));
        String strD = eeq.d(i);
        eegVar.d(eeq.c(eeq.d(1) + eeq.b(strD.length() / 2) + strD));
        ArrayList arrayList = new ArrayList();
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        edc.e().registerDeviceSampleListener(SRC_PCK_NAME, this.receiveCallback);
        boolean zSendSampleConfigCommand = edc.e().sendSampleConfigCommand(deviceInfo, eefVar, this.TAG);
        if (!zSendSampleConfigCommand) {
            onFailureCallback(j, "isValid == false", -1);
        } else if (i2 == 1) {
            dyb.e(eegVar, i, "osaActiveSwitch");
        }
        LogUtil.b(this.TAG, "isValid:" + zSendSampleConfigCommand);
    }

    private void getOsaStatus(DeviceInfo deviceInfo, final long j) {
        LogUtil.b(this.TAG, "ENTER getOsaStatus");
        dyb.b(deviceInfo, new IBaseResponseCallback() { // from class: com.huawei.healthosa.h5.OsaServiceForH5Interaction.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.b(OsaServiceForH5Interaction.this.TAG, "getOsaStatus: ", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof Integer)) {
                    OsaServiceForH5Interaction.this.onFailureCallback(j, "get status error", -1);
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("result", iIntValue);
                } catch (JSONException unused) {
                    LogUtil.e(OsaServiceForH5Interaction.this.TAG, "get json is error");
                }
                OsaServiceForH5Interaction.this.onSuccessCallback(j, jSONObject);
            }
        });
    }

    private eef constructSampleConfig(int i) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName(SRC_PCK_NAME);
        eefVar.setWearPkgName(WEAR_PCK_NAME);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(CONFIG_ID);
        eegVar.d(eeq.c(eeq.d(1) + eeq.d(1) + eeq.d(i)));
        eegVar.b(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    @JavascriptInterface
    public void sendSleepBreatheCommand(long j, int i) {
        LogUtil.b(this.TAG, "sendSleepBreatheCommand switchStatus:", Integer.valueOf(i));
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        if (deviceInfo == null) {
            LogUtil.e(this.TAG, "DeviceInfo==null");
            onFailureCallback(j, "DeviceInfo==null", -1);
            return;
        }
        boolean zSendSampleConfigCommand = edc.e().sendSampleConfigCommand(deviceInfo, constructSampleConfig(i), this.TAG);
        LogUtil.b(this.TAG, "sendSampleConfigCommand isValid:", Boolean.valueOf(zSendSampleConfigCommand));
        if (!zSendSampleConfigCommand) {
            onFailureCallback(j, "sendSampleConfigCommand isValid == false", -1);
        } else {
            onSuccessCallback(j, "sendSampleConfigCommand success");
        }
    }

    @JavascriptInterface
    public void startSleepBreatheDetectionPage(long j) {
        LogUtil.b(this.TAG, "startSleepBreatheDetectionPage");
        try {
            ecu.d().startSleepBreatheDetectionPage();
            onSuccessCallback(j, "Start sleep breathe detection page success");
        } catch (Exception e) {
            ReleaseLogUtil.b(RELEASE_TAG, "startSleepBreatheDetectionPage Exception:", ExceptionUtils.c(e));
            onFailureCallback(j, "startSleepBreatheDetectionPage exception", -1);
        }
    }

    @JavascriptInterface
    public void setSleepBreatheDetectionState(final long j, boolean z) {
        ecu.d().setSleepBreatheDetectionState(z, new IBaseResponseCallback() { // from class: kkc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f39313b.m1338xc0bb71e7(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setSleepBreatheDetectionState$0$com-huawei-healthosa-h5-OsaServiceForH5Interaction, reason: not valid java name */
    public /* synthetic */ void m1338xc0bb71e7(long j, int i, Object obj) {
        if (i == 0) {
            LogUtil.b(this.TAG, "setSleepBreatheDetectionState success");
            onSuccessCallback(j, "Set sleep breathe detection success");
        } else {
            LogUtil.b(this.TAG, "setSleepBreatheDetectionState failed");
            onFailureCallback(j, "Set sleep breathe detection failed", -1);
        }
    }

    @JavascriptInterface
    public void getSleepBreatheDetectionState(final long j) {
        ecu.d().getSleepBreatheDetectionState(new IBaseResponseCallback() { // from class: kjz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.m1337xbe4312d2(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSleepBreatheDetectionState$1$com-huawei-healthosa-h5-OsaServiceForH5Interaction, reason: not valid java name */
    public /* synthetic */ void m1337xbe4312d2(long j, int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            LogUtil.b(this.TAG, "Get sleep breathe detection success: ", str);
            onSuccessCallback(j, Boolean.valueOf(Boolean.parseBoolean(str)));
        } else {
            LogUtil.b(this.TAG, "getSleepBreatheDetectionState failed");
            onFailureCallback(j, "Get sleep breathe detection failed", -1);
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        edc.e().unRegisterDeviceSampleListener(SRC_PCK_NAME);
    }
}
