package com.huawei.operation.h5pro.jsmodules;

import android.util.SparseArray;
import android.webkit.JavascriptInterface;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.IntentDataRecord;
import defpackage.dyb;
import defpackage.ecu;
import defpackage.edc;
import defpackage.eec;
import defpackage.eef;
import defpackage.eeg;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.lsy;
import defpackage.njy;
import defpackage.pfi;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class PpgJsModule extends JsBaseModule {
    private static final int ACTION_MODIFY = 1;
    private static final int ACTION_QUERY = 2;
    private static final String ARRHYTHMIA_AUTOMATIC_ANALYSIS = "ARRHYTHMIA_AUTOMATIC_ANALYSIS";
    private static final String ARRHYTHMIA_PPG_NOTIFY = "ARRHYTHMIA_PPG_NOTIFY";
    private static final int CLOSED = 0;
    private static final String CONFIG_CE_DEVICE_INFO_QUERY = "queryCE";
    private static final String CONFIG_CE_DEVICE_INFO_UPDATE = "updateCE";
    private static final String CONFIG_DATA_PREFIX_SWITCH = "01010";
    private static final long CONFIG_ID_ACTIVE_SWITCH = 900300004;
    private static final long CONFIG_ID_ARRHYTHMIA_ANALYSIS_CE = 900300058;
    private static final long CONFIG_ID_ARRHYTHMIA_ANALYSIS_NMPA = 900300064;
    private static final long CONFIG_ID_MEASURE_SWITCH = 900300003;
    private static final long CONFIG_ID_NOTIFY_SWITCH = 900300009;
    private static final long CONFIG_ID_PERIOD_SWITCH = 900300002;
    private static final String CONFIG_MISSION_MODIFY_ACTIVE = "modifyActiveSwitch";
    private static final String CONFIG_MISSION_QUERY_ACTIVE = "queryActiveSwitch";
    private static final String CONFIG_MISSION_START_MEASURE = "startMeasure";
    private static final String CONFIG_MISSION_STOP_MEASURE = "stopMeasure";
    private static final String CONFIG_NMPA_DEVICE_INFO_QUERY = "queryNMPA";
    private static final String CONFIG_NMPA_DEVICE_INFO_UPDATE = "updateNMPA";
    private static final int OPENED = 1;
    private static final String SIGNAL_BLUETOOTH_DISCONNECT = "125004";
    private static final String SIGNAL_GOOD = "126102";
    private static final String SIGNAL_START_FAIL = "125006";
    private static final String SRC_PCK_NAME = "hw.health.ppgjsmodule";
    private static final int TYPE_PPG_MEASURE_SUCCESS = 126104;
    private static final String WEAR_PCK_NAME = "hw.watch.health.arrhythmia";
    private edc mCommandProxy;
    private List<Integer> mUnSubscribeList = new ArrayList();

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.mCommandProxy = edc.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    @JavascriptInterface
    public void sendSampleConfigCommand(long j, String str) {
        byte b2;
        LogUtil.a(this.TAG, "send sample config");
        eef eefVarStructSampleConfig = structSampleConfig(str);
        if (eefVarStructSampleConfig == null) {
            onFailureCallback(j, "SampleConfig with invalid params");
            return;
        }
        eeg firstSampleConfigInfo = getFirstSampleConfigInfo(eefVarStructSampleConfig);
        if (firstSampleConfigInfo == null) {
            onFailureCallback(j, "SampleConfig is missing params");
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        if (firstSampleConfigInfo.c() == CONFIG_ID_ACTIVE_SWITCH) {
            setAndPpgActiveStatus(eefVarStructSampleConfig, firstSampleConfigInfo, deviceInfo, j);
            return;
        }
        String configMission = getConfigMission(firstSampleConfigInfo);
        configMission.hashCode();
        switch (configMission) {
            case "queryNMPA":
                b2 = 0;
                break;
            case "stopMeasure":
                b2 = 1;
                break;
            case "queryCE":
                b2 = 2;
                break;
            case "startMeasure":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            getCEDeviceInfo(j);
        } else if (b2 == 1) {
            LogUtil.a(this.TAG, "sendSampleConfigCommand manually stop measure");
            this.mCommandProxy.unRegisterDeviceSampleListener(SRC_PCK_NAME);
        } else if (b2 == 2) {
            getCEDeviceInfo(j);
        } else if (b2 != 3) {
            LogUtil.a(this.TAG, "sendSampleConfigCommand directly send command");
        } else {
            LogUtil.a(this.TAG, "sendSampleConfigCommand manually start measure");
            this.mCommandProxy.registerDeviceSampleListener(SRC_PCK_NAME, new ManuallyStartCallbackHandler(j));
        }
        if (!this.mCommandProxy.sendSampleConfigCommand(deviceInfo, eefVarStructSampleConfig, this.TAG)) {
            callbackFailureAndUnregisterProxy("sendSampleConfigCommand", "SampleConfig with invalid params", j);
            if (CONFIG_MISSION_START_MEASURE.equals(configMission)) {
                onCompleteCallback(j, deviceInfo.getDeviceConnectState() == 2 ? SIGNAL_START_FAIL : SIGNAL_BLUETOOTH_DISCONNECT, 0);
                return;
            }
            return;
        }
        if (CONFIG_MISSION_QUERY_ACTIVE.equals(configMission) || CONFIG_MISSION_START_MEASURE.equals(configMission) || CONFIG_CE_DEVICE_INFO_QUERY.equals(configMission) || CONFIG_NMPA_DEVICE_INFO_QUERY.equals(configMission)) {
            return;
        }
        onSuccessCallback(j, structResult(0, "Command sent"));
    }

    private void setAndPpgActiveStatus(eef eefVar, eeg eegVar, DeviceInfo deviceInfo, final long j) {
        int iD = eegVar.d();
        LogUtil.a(this.TAG, "enter send set command: action: ", Integer.valueOf(iD));
        if (iD != 2) {
            boolean zSendSampleConfigCommand = this.mCommandProxy.sendSampleConfigCommand(deviceInfo, eefVar, this.TAG);
            LogUtil.a(this.TAG, "enter send set command issuccess: ", Boolean.valueOf(zSendSampleConfigCommand));
            if (zSendSampleConfigCommand) {
                onSuccessCallback(j, structResult(0, "Command sent"));
                int iV = CommonUtil.v(getFirstTlv(HEXUtils.a(eegVar.e())).b());
                dyb.e(eegVar, iV, "ppgActiveSwitch");
                LogUtil.a(this.TAG, "PPG STATUS: ", Integer.valueOf(iV));
                return;
            }
            LogUtil.a(this.TAG, "enter send set command error");
            onFailureCallback(j, "send command error");
            return;
        }
        dyb.d(deviceInfo, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0 || !(obj instanceof Integer)) {
                    PpgJsModule.this.onFailureCallback(j, "get status error");
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                PpgJsModule ppgJsModule = PpgJsModule.this;
                ppgJsModule.onSuccessCallback(j, ppgJsModule.structResult(0, String.valueOf(iIntValue)));
            }
        });
    }

    private void getCEDeviceInfo(long j) {
        LogUtil.a(this.TAG, "sendSampleConfigCommand query CE device info");
        this.mCommandProxy.registerDeviceSampleListener(SRC_PCK_NAME, new CEDeviceInfoCallbackHandler(this.mCommandProxy, j, this));
    }

    private eef structSampleConfig(String str) {
        try {
            eef eefVar = new eef();
            JSONObject jSONObject = new JSONObject(str);
            eefVar.setSrcPkgName(jSONObject.getString(IntentDataRecord.SRC_PKG_NAME));
            eefVar.setWearPkgName(jSONObject.getString("wearPkgName"));
            eeg eegVar = new eeg();
            JSONObject jSONObject2 = jSONObject.getJSONArray("configInfoList").getJSONObject(0);
            eegVar.b(jSONObject2.getLong("configId"));
            eegVar.b(jSONObject2.getInt("configAction"));
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("byteConfigData");
            if (jSONArrayOptJSONArray != null) {
                byte[] bArr = new byte[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    bArr[i] = (byte) jSONArrayOptJSONArray.getInt(i);
                }
                eegVar.d(bArr);
            }
            eegVar.c(Long.valueOf(System.currentTimeMillis()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(eegVar);
            eefVar.setConfigInfoList(arrayList);
            return eefVar;
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "structSampleConfig JSONException");
            return null;
        }
    }

    private String getConfigMission(eeg eegVar) {
        long jC = eegVar.c();
        if (jC == CONFIG_ID_ACTIVE_SWITCH) {
            return eegVar.d() == 2 ? CONFIG_MISSION_QUERY_ACTIVE : CONFIG_MISSION_MODIFY_ACTIVE;
        }
        if (jC != CONFIG_ID_MEASURE_SWITCH) {
            if (jC == CONFIG_ID_ARRHYTHMIA_ANALYSIS_CE) {
                return eegVar.d() == 2 ? CONFIG_CE_DEVICE_INFO_QUERY : CONFIG_CE_DEVICE_INFO_UPDATE;
            }
            if (jC == CONFIG_ID_ARRHYTHMIA_ANALYSIS_NMPA) {
                return eegVar.d() == 2 ? CONFIG_NMPA_DEVICE_INFO_QUERY : CONFIG_NMPA_DEVICE_INFO_UPDATE;
            }
            return "";
        }
        String strA = HEXUtils.a(eegVar.e());
        strA.hashCode();
        if (strA.equals("010100")) {
            return CONFIG_MISSION_STOP_MEASURE;
        }
        if (!strA.equals("010101")) {
            return "";
        }
        return CONFIG_MISSION_START_MEASURE;
    }

    class ActiveSwitchQueryCallbackHandler implements DataReceiveCallback {
        private final long mCallbackId;

        ActiveSwitchQueryCallbackHandler(long j) {
            this.mCallbackId = j;
            LogUtil.a(PpgJsModule.this.TAG, "generate callback for query active switch");
        }

        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
            if (!(eecVar instanceof eef)) {
                PpgJsModule.this.callbackFailureAndUnregisterProxy("callbackHandlerActiveSwitchQuery", "SampleConfig in invalid format", this.mCallbackId);
                return;
            }
            eeg firstSampleConfigInfo = PpgJsModule.this.getFirstSampleConfigInfo((eef) eecVar);
            if (firstSampleConfigInfo == null) {
                PpgJsModule.this.callbackFailureAndUnregisterProxy("callbackHandlerActiveSwitchQuery", "SampleConfig is missing params", this.mCallbackId);
                return;
            }
            String strA = HEXUtils.a(firstSampleConfigInfo.e());
            LogUtil.a(PpgJsModule.this.TAG, "callbackHandlerActiveSwitchQuery Received byteConfigData=", strA);
            int iV = CommonUtil.v(PpgJsModule.this.getFirstTlv(strA).b());
            LogUtil.a(PpgJsModule.this.TAG, "callbackHandlerActiveSwitchQuery active switch status receive success with value: ", Integer.valueOf(iV));
            if (iV == -1) {
                PpgJsModule.this.callbackFailureAndUnregisterProxy("callbackHandlerActiveSwitchQuery", "Switch status invalid", this.mCallbackId);
                return;
            }
            PpgJsModule ppgJsModule = PpgJsModule.this;
            ppgJsModule.onSuccessCallback(this.mCallbackId, ppgJsModule.structResult(0, String.valueOf(iV)));
            PpgJsModule.this.mCommandProxy.unRegisterDeviceSampleListener(PpgJsModule.SRC_PCK_NAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackFailureAndUnregisterProxy(String str, String str2, long j) {
        if (str != null) {
            LogUtil.e(this.TAG, str + " " + str2);
        }
        onFailureCallback(j, str2);
        this.mCommandProxy.unRegisterDeviceSampleListener(SRC_PCK_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public eeg getFirstSampleConfigInfo(eef eefVar) {
        LogUtil.a(this.TAG, "get first sample config info in sample config");
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (configInfoList == null) {
            return null;
        }
        return configInfoList.get(0);
    }

    class ManuallyStartCallbackHandler implements DataReceiveCallback {
        private final long mCallbackId;
        private String mReceiveCode = null;

        ManuallyStartCallbackHandler(long j) {
            this.mCallbackId = j;
            LogUtil.a(PpgJsModule.this.TAG, "generate callback for start measure");
        }

        private void errorAndFail(String str) {
            PpgJsModule.this.callbackFailureAndUnregisterProxy("manuallyStartCallbackHandler", str, this.mCallbackId);
        }

        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
            if (eecVar instanceof eef) {
                eeg firstSampleConfigInfo = PpgJsModule.this.getFirstSampleConfigInfo((eef) eecVar);
                if (firstSampleConfigInfo == null) {
                    errorAndFail("SampleConfig with invalid params");
                    return;
                }
                String strA = HEXUtils.a(firstSampleConfigInfo.e());
                LogUtil.a(PpgJsModule.this.TAG, "manuallyStartCallbackHandler Received byteConfigData=", strA);
                int iV = CommonUtil.v(PpgJsModule.this.getFirstTlv(strA).b());
                if (iV == -1) {
                    errorAndFail("Data received an invalid error code");
                    return;
                }
                String strValueOf = String.valueOf(iV);
                if (this.mReceiveCode != null) {
                    LogUtil.a(PpgJsModule.this.TAG, "manuallyStartCallbackHandler completed");
                    PpgJsModule.this.onCompleteCallback(this.mCallbackId, strValueOf, 0);
                    PpgJsModule.this.mCommandProxy.unRegisterDeviceSampleListener(PpgJsModule.SRC_PCK_NAME);
                    return;
                }
                PpgJsModule ppgJsModule = PpgJsModule.this;
                ppgJsModule.onSuccessCallback(this.mCallbackId, ppgJsModule.structResult(0, strValueOf));
                this.mReceiveCode = strValueOf;
                LogUtil.a(PpgJsModule.this.TAG, "manuallyStartCallbackHandler [CODE ", this.mReceiveCode, "] received and updated");
                if (this.mReceiveCode.equals(PpgJsModule.SIGNAL_GOOD)) {
                    return;
                }
                LogUtil.a(PpgJsModule.this.TAG, "manuallyStartCallbackHandler signal unqualified, receiveCode: ", strValueOf, ", terminating");
                PpgJsModule.this.mCommandProxy.unRegisterDeviceSampleListener(PpgJsModule.SRC_PCK_NAME);
                return;
            }
            errorAndFail("SampleConfig in invalid format");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public eew getFirstTlv(String str) {
        eew eewVar = new eew();
        try {
            return new eet().b(str).e().get(0);
        } catch (eeu unused) {
            LogUtil.e(this.TAG, "getFirstTlv TlvException");
            return eewVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> JSONObject structResult(int i, T t) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("resultCode", i);
            jSONObject2.put("resultDesc", t);
            jSONObject.put("data", jSONObject2);
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "structResult JSONException");
        }
        LogUtil.a(this.TAG, "structResult constructed json with resultCode: ", Integer.valueOf(i));
        return jSONObject;
    }

    @JavascriptInterface
    public void setPeriodSwitchState(long j, int i) {
        if (!setPeriodSwitch(i)) {
            LogUtil.a(this.TAG, "setAutoPeriodSwitchState isSuccess false, isOpened ", Integer.valueOf(i));
            onFailureCallback(j, "Not connecting correct device or targetState invalid");
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey(ARRHYTHMIA_AUTOMATIC_ANALYSIS);
        hiUserPreference.setValue(String.valueOf(i));
        boolean userPreference = HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        LogUtil.a(this.TAG, "setAutoPeriodSwitchState isSuccess ", Boolean.valueOf(userPreference), ", isOpened ", Integer.valueOf(i));
        if (!userPreference) {
            setPeriodSwitch(0);
            onFailureCallback(j, "Change local setting failed");
        } else {
            onSuccessCallback(j, structResult(0, 0));
        }
    }

    private boolean setPeriodSwitch(int i) {
        if (i != 1 && i != 0) {
            return false;
        }
        eef eefVar = new eef();
        eefVar.setSrcPkgName(SRC_PCK_NAME);
        eefVar.setWearPkgName(WEAR_PCK_NAME);
        eeg eegVar = new eeg();
        eegVar.b(CONFIG_ID_PERIOD_SWITCH);
        eegVar.b(1);
        eegVar.d(HEXUtils.a(CONFIG_DATA_PREFIX_SWITCH + i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return edc.e().sendSampleConfigCommand(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG), eefVar, this.TAG);
    }

    private int getSwitchState(String str) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference(str);
        if (userPreference != null) {
            return CommonUtil.v(userPreference.getValue());
        }
        return 0;
    }

    @JavascriptInterface
    public void getPeriodSwitchState(long j) {
        try {
            int switchState = getSwitchState(ARRHYTHMIA_AUTOMATIC_ANALYSIS);
            if (switchState == -1) {
                LogUtil.e(this.TAG, "getPeriodSwitchState NumberFormatException");
                onFailureCallback(j, "NumberFormatException in database");
            }
            LogUtil.a(this.TAG, "getPeriodSwitchState result ", Integer.valueOf(switchState));
            onSuccessCallback(j, Integer.valueOf(switchState));
        } catch (NumberFormatException unused) {
            LogUtil.e(this.TAG, "getAutoPeriodSwitchState NumberFormatException");
            onFailureCallback(j, "NumberFormatException in database");
        }
    }

    @JavascriptInterface
    public void setNotifySwitchState(long j, int i) {
        if (!sendSetSwitchConfigCommand(i)) {
            LogUtil.e(this.TAG, "setNotifySwitchState isSuccess false, isOpened ", Integer.valueOf(i));
            onFailureCallback(j, "Not connecting correct device or targetState invalid");
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey(ARRHYTHMIA_PPG_NOTIFY);
        hiUserPreference.setValue(String.valueOf(i));
        boolean userPreference = HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        LogUtil.a(this.TAG, "setNotifySwitchState isSuccess ", Boolean.valueOf(userPreference), ", isOpened ", Integer.valueOf(i));
        if (!userPreference) {
            sendSetSwitchConfigCommand(0);
            onFailureCallback(j, "Change local setting failed");
        } else {
            onSuccessCallback(j, structResult(0, 0));
        }
    }

    private boolean sendSetSwitchConfigCommand(int i) {
        if (i != 1 && i != 0) {
            return false;
        }
        eef eefVar = new eef();
        eefVar.setSrcPkgName(SRC_PCK_NAME);
        eefVar.setWearPkgName(WEAR_PCK_NAME);
        eeg eegVar = new eeg();
        eegVar.b(CONFIG_ID_NOTIFY_SWITCH);
        eegVar.b(1);
        eegVar.d(HEXUtils.a(CONFIG_DATA_PREFIX_SWITCH + i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return edc.e().sendSampleConfigCommand(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG), eefVar, this.TAG);
    }

    @JavascriptInterface
    public void getNotifySwitchState(long j) {
        int switchState = getSwitchState(ARRHYTHMIA_PPG_NOTIFY);
        if (switchState == -1) {
            LogUtil.e(this.TAG, "getNotifySwitchState NumberFormatException");
            onFailureCallback(j, "NumberFormatException in database");
        }
        LogUtil.a(this.TAG, "getNotifySwitchState result ", Integer.valueOf(switchState));
        onSuccessCallback(j, Integer.valueOf(switchState));
    }

    @JavascriptInterface
    public void hasHistoryData(final long j) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()});
        hiDataReadOption.setCount(1);
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        HiHealthManager.d(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(1).b(), new HiDataReadResultListener() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                try {
                    if (!(obj instanceof SparseArray)) {
                        PpgJsModule.this.onFailureCallback(j, "hasHistoryData Received a result with wrong type");
                        return;
                    }
                    List list = (List) ((SparseArray) obj).get(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value());
                    boolean z = false;
                    LogUtil.a(PpgJsModule.this.TAG, "hasHistoryData onResult list size = ", Integer.valueOf(list == null ? 0 : list.size()));
                    PpgJsModule ppgJsModule = PpgJsModule.this;
                    long j2 = j;
                    if (list != null && !list.isEmpty()) {
                        z = true;
                    }
                    ppgJsModule.onSuccessCallback(j2, Boolean.valueOf(z));
                } catch (ClassCastException unused) {
                    LogUtil.e(PpgJsModule.this.TAG, "hasHistoryData onResult ClassCastException");
                    PpgJsModule.this.onFailureCallback(j, "hasHistoryData Receive data with wrong format");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                PpgJsModule.this.onFailureCallback(j, "hasHistoryData onResultIntent");
            }
        });
    }

    private List<JSONObject> toJsonList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        try {
            LogUtil.a(this.TAG, "toJsonList rawList size=", Integer.valueOf(jSONArray.length()));
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getJSONObject(i));
            }
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "toJsonList JSONException", e.getMessage());
        }
        return arrayList;
    }

    @JavascriptInterface
    public void setProductModelPara(long j, String str) {
        try {
            LogUtil.a(this.TAG, "setProductModelPara");
            JSONObject jSONObject = new JSONObject(str);
            onSuccessCallback(j, Integer.valueOf(pfi.c().setProductModelPara(jSONObject.getInt("maxPpgAmpRange"), jSONObject.getInt("minPpgAmpRange"))));
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "setProductModelPara JSONException");
            onFailureCallback(j, "JSONException: invalid json string input");
        }
    }

    @JavascriptInterface
    public void getSqiResult(long j, String str) {
        try {
            LogUtil.a(this.TAG, "getSqiResult");
            JSONObject jSONObject = new JSONObject(str);
            List<JSONObject> list = (List) HiJsonUtil.d(jSONObject.getString("atrialDataStructList"), new TypeToken<List<JSONObject>>() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule.3
            }.getType());
            onSuccessCallback(j, Integer.valueOf(pfi.c().getSqiResult(list, list.size(), jSONObject.getInt("firstFlag"))));
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "getSqiResult JSONException");
            onFailureCallback(j, "JSONException: invalid json string input");
        }
    }

    @JavascriptInterface
    public void getDrawData(long j, String str) {
        try {
            LogUtil.a(this.TAG, "getDrawData start");
            JSONObject jSONObject = new JSONObject(str);
            List<JSONObject> jsonList = toJsonList(jSONObject.getJSONArray("ppgSamplePointClonesList"));
            List<JSONObject> jsonList2 = toJsonList(jSONObject.getJSONArray("deviceMeasureRstBeanList"));
            LogUtil.a(this.TAG, "getDrawData ppgSamplePointClonesList size=", Integer.valueOf(jsonList.size()), ", deviceMeasureRstBeanList size=", Integer.valueOf(jsonList2.size()));
            onSuccessCallback(j, pfi.c().getDrawData(jsonList, jsonList2, jsonList.size(), jsonList2.size()));
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getDrawData JSONException", e.getMessage());
            onFailureCallback(j, "JSONException: invalid json string input");
        }
    }

    @JavascriptInterface
    public void setPpgAccData(long j, String str) {
        pfi.c().setPpgAccData(str);
    }

    @JavascriptInterface
    public void startPpgAlgorithm(final long j) {
        pfi.c().startPpgAlgorithm(new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1580x4ac4b64b(j, i, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startPpgAlgorithm$0$com-huawei-operation-h5pro-jsmodules-PpgJsModule, reason: not valid java name */
    /* synthetic */ void m1580x4ac4b64b(long j, int i, JSONObject jSONObject) {
        LogUtil.a(this.TAG, "measure responseCallback", "jsonObject:", jSONObject.toString(), "resultCode:", Integer.valueOf(i));
        if (i == 0) {
            onSuccessCallback(j, jSONObject);
            try {
                if (jSONObject.getInt("resultDesc") == TYPE_PPG_MEASURE_SUCCESS) {
                    onCompleteCallback(j, String.valueOf(TYPE_PPG_MEASURE_SUCCESS), i);
                    return;
                }
                return;
            } catch (JSONException unused) {
                LogUtil.e(this.TAG, "jsonException resultDesc not exist");
                onFailureCallback(j, "jsonException resultDesc not exist");
                return;
            }
        }
        onFailureCallback(j, jSONObject.toString());
    }

    @JavascriptInterface
    public void getPeriodMeasureResult(final long j, final String str) {
        lsy.a(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1579xfccab095(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getPeriodMeasureResult$2$com-huawei-operation-h5pro-jsmodules-PpgJsModule, reason: not valid java name */
    /* synthetic */ void m1579xfccab095(String str, long j) {
        LogUtil.d(this.TAG, "getPeriodMeasureResult", str);
        try {
            HiHealthData hiHealthData = new HiHealthData();
            JSONObject jSONObject = new JSONObject(str);
            hiHealthData.setStartTime(jSONObject.getLong("mStartTime"));
            hiHealthData.setEndTime(jSONObject.getLong("mEndTime"));
            hiHealthData.setType(jSONObject.getInt("mType"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("mValueHolder").getJSONObject("mMap");
            hiHealthData.setSequenceData(jSONObject2.getString("detail_data"));
            hiHealthData.setDeviceUuid(jSONObject2.getString("device_uniquecode"));
            hiHealthData.setMetaData(jSONObject2.getJSONObject("meta_data").toString());
            HiHealthData periodMeasureResult = pfi.c().getPeriodMeasureResult(hiHealthData);
            periodMeasureResult.setDeviceUuid(hiHealthData.getDeviceUuid());
            String simpleData = periodMeasureResult.getSimpleData();
            ArrayList arrayList = new ArrayList();
            arrayList.add(periodMeasureResult);
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(arrayList);
            HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule$$ExternalSyntheticLambda2
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    this.f$0.m1578xb210a76(i, obj);
                }
            });
            LogUtil.d(this.TAG, "drawData:", simpleData);
            onSuccessCallback(j, simpleData);
        } catch (JSONException unused) {
            LogUtil.a(this.TAG, "getPeriodMeasureResult jsonSyntaxException");
        }
    }

    /* JADX INFO: renamed from: lambda$getPeriodMeasureResult$1$com-huawei-operation-h5pro-jsmodules-PpgJsModule, reason: not valid java name */
    /* synthetic */ void m1578xb210a76(int i, Object obj) {
        health.compact.a.util.LogUtil.a(this.TAG, "save dataResult errorCode:", Integer.valueOf(i), "message：", obj);
    }

    @JavascriptInterface
    public void stopPpgAlgorithm(long j) {
        pfi.c().stopPpgAlgorithm();
    }

    @JavascriptInterface
    public void subscribePpgHiHealthData(final long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()));
        LogUtil.a(this.TAG, "subscribePpgHiHealthData", arrayList.toString());
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new HiSubscribeListener() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule.4
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                if (njy.b(list)) {
                    PpgJsModule.this.mUnSubscribeList.addAll(list);
                    LogUtil.a(PpgJsModule.this.TAG, "successList.toString():", list.toString());
                }
                if (njy.b(list2)) {
                    LogUtil.a(PpgJsModule.this.TAG, "failList.toString():", list2.toString());
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j2) {
                LogUtil.a(PpgJsModule.this.TAG, "onChange", Integer.valueOf(i));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", 0);
                    PpgJsModule.this.onSuccessCallback(j, jSONObject.toString());
                } catch (JSONException unused) {
                    LogUtil.a(PpgJsModule.this.TAG, "jsonException");
                }
            }
        });
    }

    @JavascriptInterface
    public void unSubscribePpgHiHealthData(long j) {
        LogUtil.a(this.TAG, "unSubscribePpgHiHealthData", "callbackId:", Long.valueOf(j));
        if (njy.e(this.mUnSubscribeList)) {
            LogUtil.j(this.TAG, "mSuccessList isEmpty");
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.mUnSubscribeList, new HiUnSubscribeListener() { // from class: com.huawei.operation.h5pro.jsmodules.PpgJsModule$$ExternalSyntheticLambda1
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    this.f$0.m1581xf4eeb1b(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$unSubscribePpgHiHealthData$3$com-huawei-operation-h5pro-jsmodules-PpgJsModule, reason: not valid java name */
    /* synthetic */ void m1581xf4eeb1b(boolean z) {
        LogUtil.a(this.TAG, "unSubscribeHiHealthData isSuccess = ", Boolean.valueOf(z));
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(this.TAG, "onDestroy");
        pfi.c().stopPpgAlgorithm();
        unSubscribePpgHiHealthData(0L);
    }
}
