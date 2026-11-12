package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dyb {
    private static boolean c(long j, long j2, int i, int i2) {
        if (j > j2) {
            return (j2 == 0 && i2 == i && i2 == 1) ? false : true;
        }
        return (j2 != j || j2 == 0 || i == i2) ? false : true;
    }

    private static boolean d(long j, long j2, int i) {
        if (j < j2) {
            return true;
        }
        return j2 == j && j2 == 0 && i == 1;
    }

    public static void a(final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        c();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(String.valueOf(900300005L));
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: dyb.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.b("HwMedicalUtils", "getECGStatusFromCloud errorCode: ", Integer.valueOf(i));
                dyb.b(deviceInfo, dyb.e(obj), iBaseResponseCallback);
            }
        });
    }

    public static void c() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HiSampleConfig e(Object obj) {
        if (!coq.e(obj, HiSampleConfig.class)) {
            LogUtil.e("HwMedicalUtils", "get result data is error");
            return null;
        }
        List list = (List) obj;
        if (coq.d(list)) {
            LogUtil.e("HwMedicalUtils", "list is empty");
            return null;
        }
        return (HiSampleConfig) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final DeviceInfo deviceInfo, final HiSampleConfig hiSampleConfig, final IBaseResponseCallback iBaseResponseCallback) {
        eef eefVarE = e("hw.health.ecganalysis", "hw.watch.health.ecganalysis", 900300006L);
        edc.e().registerDeviceSampleListener("hw.health.ecganalysis", new DataReceiveCallback() { // from class: dyb.4
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                LogUtil.b("HwMedicalUtils", "getECGFromDevice: ", Integer.valueOf(i));
                eeg eegVarC = dyb.c(eecVar);
                edc.e().unRegisterDeviceSampleListener("hw.health.ecganalysis");
                dyb.d(hiSampleConfig, eegVarC, iBaseResponseCallback, deviceInfo);
            }
        });
        if (edc.e().sendSampleConfigCommand(deviceInfo, eefVarE, "HwMedicalUtils")) {
            return;
        }
        edc.e().unRegisterDeviceSampleListener("hw.health.ecganalysis");
        d(hiSampleConfig, null, iBaseResponseCallback, deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(HiSampleConfig hiSampleConfig, eeg eegVar, IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        if (hiSampleConfig == null && eegVar == null) {
            LogUtil.b("HwMedicalUtils", "getECGFromDevice, hiSampleConfig and sampleConfigInfo is null");
            a(iBaseResponseCallback, -1);
            return;
        }
        int iB = eegVar != null ? b(eegVar) : -1;
        long jE = eegVar != null ? e(eegVar) : 0L;
        int iE = hiSampleConfig != null ? e(hiSampleConfig, "authoricationSwitch") : -1;
        long modifiedTime = hiSampleConfig != null ? hiSampleConfig.getModifiedTime() : 0L;
        if (b(modifiedTime, jE, iE, iB)) {
            a(iBaseResponseCallback, -1);
            return;
        }
        if (c(modifiedTime, jE, iE, iB)) {
            int i = iE;
            if (edc.e().sendSampleConfigCommand(deviceInfo, a("hw.health.ecganalysis", "hw.watch.health.ecganalysis", 900300005L, modifiedTime, i), "HwMedicalUtils")) {
                a(iBaseResponseCallback, i);
                return;
            } else {
                a(iBaseResponseCallback, iB);
                return;
            }
        }
        if (d(modifiedTime, jE, iB)) {
            e(eegVar, iB, "authoricationSwitch");
        }
        a(iBaseResponseCallback, iB);
    }

    private static long e(eeg eegVar) {
        Long lB = eegVar.b();
        if (lB == null) {
            return 0L;
        }
        return lB.longValue();
    }

    private static void a(IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback != null) {
            if (i == -1) {
                iBaseResponseCallback.a(-1, Integer.valueOf(i));
            } else {
                iBaseResponseCallback.a(0, Integer.valueOf(i));
            }
        }
    }

    private static boolean b(long j, long j2, int i, int i2) {
        LogUtil.b("HwMedicalUtils", "cloudTime: ", Long.valueOf(j), "  deviceTime: ", Long.valueOf(j2), "  cloudStatus: ", Integer.valueOf(i), "  deviceStatus: ", Integer.valueOf(i2));
        if (i2 == -1 && (j2 > j || (j2 == 0 && j2 == j))) {
            return true;
        }
        if (i == -1) {
            return j2 < j || (j2 != 0 && j2 == j);
        }
        return false;
    }

    private static eef e(String str, String str2, long j) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName(str);
        eefVar.setWearPkgName(str2);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(j);
        eegVar.b(2);
        byte[] bArrC = new byte[0];
        if (j == 900300007) {
            String strD = eeq.d(1);
            bArrC = eeq.c(eeq.d(1) + eeq.b(strD.length() / 2) + strD);
        }
        eegVar.d(bArrC);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static eeg c(eec eecVar) {
        if (!(eecVar instanceof eef)) {
            LogUtil.e("HwMedicalUtils", "message is not sampleConfig");
            return null;
        }
        List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
        if (coq.d(configInfoList)) {
            LogUtil.e("HwMedicalUtils", "message is not sampleConfig");
            return null;
        }
        return configInfoList.get(0);
    }

    private static int b(eeg eegVar) {
        byte[] bArrE = eegVar.e();
        int iV = -1;
        if (bArrE == null) {
            LogUtil.e("HwMedicalUtils", "byteConfigData == null");
            return -1;
        }
        String strE = eeq.e(bArrE);
        LogUtil.e("HwMedicalUtils", "getDeviceStatus dataHex :", strE);
        try {
            List<eew> listE = new eet().b(strE).e();
            if (listE != null && listE.size() > 0) {
                for (eew eewVar : listE) {
                    if (CommonUtil.v(eewVar.e()) == 1) {
                        iV = CommonUtil.v(eewVar.b());
                        break;
                    }
                }
                LogUtil.b("HwMedicalUtils", "getDeviceStatus result :", Integer.valueOf(iV));
                return iV;
            }
            LogUtil.e("HwMedicalUtils", "parseConfigData tlvList is null or empty");
            return -1;
        } catch (eeu unused) {
            LogUtil.d("HwMedicalUtils", "tlvException");
            return -1;
        }
    }

    private static int e(HiSampleConfig hiSampleConfig, String str) {
        if (hiSampleConfig == null) {
            return -1;
        }
        return lsk.a(ffv.a(hiSampleConfig.getConfigData(), str), 10);
    }

    private static eef a(String str, String str2, long j, long j2, int i) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName(str);
        eefVar.setWearPkgName(str2);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(j);
        eegVar.b(1);
        String strD = eeq.d(i);
        String str3 = eeq.d(1) + eeq.b(strD.length() / 2) + strD;
        if (j == 900300005) {
            String strA = eeq.a("hw.health.ecganalysis");
            str3 = str3 + eeq.d(2) + eeq.b(strA.length() / 2) + strA;
        }
        eegVar.d(eeq.c(str3));
        eegVar.c(Long.valueOf(j2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    public static void e(eeg eegVar, int i, String str) {
        if (eegVar == null || TextUtils.isEmpty(str)) {
            LogUtil.b("HwMedicalUtils", "updateCloudStatus info is null or key is null");
            return;
        }
        long jC = eegVar.c();
        if (jC == 900300006) {
            jC = 900300005;
        }
        long jE = e(eegVar);
        if (jE == 0) {
            jE = System.currentTimeMillis();
        }
        long j = jE;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, String.valueOf(i));
            jSONObject.put("time", j);
            qhq.d(MatterDataContans.TYPE_HEALTH, String.valueOf(jC), jSONObject.toString(), new HiDataOperateListener() { // from class: dyb.1
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    LogUtil.b("HwMedicalUtils", "checkAndSetConfig errorCode: ", Integer.valueOf(i2), " ", obj.toString());
                    if (i2 == 0) {
                        dyb.c();
                    }
                }
            }, j);
        } catch (JSONException unused) {
            LogUtil.d("HwMedicalUtils", "updateCloudStatus, json exception");
        }
    }

    public static void d(final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        c();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(String.valueOf(900300004L));
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: dyb.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.b("HwMedicalUtils", "getAndUpdatePpgStatus errorCode: ", Integer.valueOf(i));
                dyb.f(deviceInfo, dyb.e(obj), iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(final DeviceInfo deviceInfo, final HiSampleConfig hiSampleConfig, final IBaseResponseCallback iBaseResponseCallback) {
        eef eefVarE = e("hw.health.ppgjsmodule", "hw.watch.health.arrhythmia", 900300004L);
        edc.e().registerDeviceSampleListener("hw.health.ppgjsmodule", new DataReceiveCallback() { // from class: dyb.2
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                LogUtil.b("HwMedicalUtils", "getPpgFromDevice: ", Integer.valueOf(i));
                eeg eegVarC = dyb.c(eecVar);
                edc.e().unRegisterDeviceSampleListener("hw.health.ppgjsmodule");
                dyb.f(hiSampleConfig, eegVarC, iBaseResponseCallback, deviceInfo);
            }
        });
        if (edc.e().sendSampleConfigCommand(deviceInfo, eefVarE, "HwMedicalUtils")) {
            return;
        }
        edc.e().unRegisterDeviceSampleListener("hw.health.ppgjsmodule");
        f(hiSampleConfig, null, iBaseResponseCallback, deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(HiSampleConfig hiSampleConfig, eeg eegVar, IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        if (hiSampleConfig == null && eegVar == null) {
            a(iBaseResponseCallback, -1);
            return;
        }
        int iB = eegVar != null ? b(eegVar) : -1;
        long jE = eegVar != null ? e(eegVar) : 0L;
        int iE = e(hiSampleConfig, "ppgActiveSwitch");
        long modifiedTime = hiSampleConfig != null ? hiSampleConfig.getModifiedTime() : 0L;
        if (b(modifiedTime, jE, iE, iB)) {
            a(iBaseResponseCallback, -1);
            return;
        }
        if (c(modifiedTime, jE, iE, iB)) {
            if (edc.e().sendSampleConfigCommand(deviceInfo, a("hw.health.ppgjsmodule", "hw.watch.health.arrhythmia", 900300004L, modifiedTime, iE), "HwMedicalUtils")) {
                a(iBaseResponseCallback, iE);
                return;
            } else {
                a(iBaseResponseCallback, iB);
                return;
            }
        }
        if (d(modifiedTime, jE, iB)) {
            e(eegVar, iB, "ppgActiveSwitch");
        }
        a(iBaseResponseCallback, iB);
    }

    public static void e(final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        c();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(String.valueOf(900300010L));
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: dyb.9
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.b("HwMedicalUtils", "getPwvStatusFromCloud errorCode: ", Integer.valueOf(i));
                dyb.i(deviceInfo, dyb.e(obj), iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(final DeviceInfo deviceInfo, final HiSampleConfig hiSampleConfig, final IBaseResponseCallback iBaseResponseCallback) {
        eef eefVarE = e("hw.health.pwv", "com.huawei.health.pwv", 900300010L);
        edc.e().registerDeviceSampleListener("hw.health.pwv", new DataReceiveCallback() { // from class: dyb.6
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                LogUtil.b("HwMedicalUtils", "getPwvFromDevice: ", Integer.valueOf(i));
                eeg eegVarC = dyb.c(eecVar);
                edc.e().unRegisterDeviceSampleListener("hw.health.pwv");
                dyb.h(hiSampleConfig, eegVarC, iBaseResponseCallback, deviceInfo);
            }
        });
        if (edc.e().sendSampleConfigCommand(deviceInfo, eefVarE, "HwMedicalUtils")) {
            return;
        }
        edc.e().unRegisterDeviceSampleListener("hw.health.pwv");
        h(hiSampleConfig, null, iBaseResponseCallback, deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(HiSampleConfig hiSampleConfig, eeg eegVar, IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        if (hiSampleConfig == null && eegVar == null) {
            a(iBaseResponseCallback, -1);
            return;
        }
        int iB = eegVar != null ? b(eegVar) : -1;
        long jE = eegVar != null ? e(eegVar) : 0L;
        int iE = e(hiSampleConfig, "pwvActiveSwitch");
        long modifiedTime = hiSampleConfig != null ? hiSampleConfig.getModifiedTime() : 0L;
        if (b(modifiedTime, jE, iE, iB)) {
            a(iBaseResponseCallback, -1);
            return;
        }
        if (c(modifiedTime, jE, iE, iB)) {
            if (edc.e().sendSampleConfigCommand(deviceInfo, a("hw.health.pwv", "com.huawei.health.pwv", 900300010L, modifiedTime, iE), "HwMedicalUtils")) {
                a(iBaseResponseCallback, iE);
                return;
            } else {
                a(iBaseResponseCallback, iB);
                return;
            }
        }
        if (d(modifiedTime, jE, iB)) {
            e(eegVar, iB, "pwvActiveSwitch");
        }
        a(iBaseResponseCallback, iB);
    }

    public static void b(final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        c();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(String.valueOf(900300007L));
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: dyb.7
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.b("HwMedicalUtils", "getOsaStatusFromCloud errorCode: ", Integer.valueOf(i));
                dyb.g(deviceInfo, dyb.e(obj), iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(final DeviceInfo deviceInfo, final HiSampleConfig hiSampleConfig, final IBaseResponseCallback iBaseResponseCallback) {
        eef eefVarE = e("hw.health.apneajsmodule", "hw.watch.health.osa", 900300007L);
        edc.e().registerDeviceSampleListener("hw.health.apneajsmodule", new DataReceiveCallback() { // from class: dyb.8
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                LogUtil.b("HwMedicalUtils", "getOsaFromDevice: ", Integer.valueOf(i));
                dyb.j(hiSampleConfig, dyb.c(eecVar), iBaseResponseCallback, deviceInfo);
            }
        });
        if (edc.e().sendSampleConfigCommand(deviceInfo, eefVarE, "HwMedicalUtils")) {
            return;
        }
        j(hiSampleConfig, null, iBaseResponseCallback, deviceInfo);
        edc.e().unRegisterDeviceSampleListener("hw.health.apneajsmodule");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(HiSampleConfig hiSampleConfig, eeg eegVar, IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        if (eegVar != null && eegVar.c() != 900300007) {
            LogUtil.b("HwMedicalUtils", "other config");
            return;
        }
        edc.e().unRegisterDeviceSampleListener("hw.health.apneajsmodule");
        if (eegVar == null && hiSampleConfig == null) {
            LogUtil.b("HwMedicalUtils", "updateOsaStatus, device and cloud info is error");
            a(iBaseResponseCallback, -1);
            return;
        }
        int iB = eegVar != null ? b(eegVar) : -1;
        long jE = eegVar != null ? e(eegVar) : 0L;
        int iE = e(hiSampleConfig, "osaActiveSwitch");
        long modifiedTime = hiSampleConfig != null ? hiSampleConfig.getModifiedTime() : 0L;
        if (b(modifiedTime, jE, iE, iB)) {
            a(iBaseResponseCallback, -1);
            return;
        }
        if (c(modifiedTime, jE, iE, iB)) {
            if (edc.e().sendSampleConfigCommand(deviceInfo, a("hw.health.apneajsmodule", "hw.watch.health.osa", 900300007L, modifiedTime, iE), "HwMedicalUtils")) {
                a(iBaseResponseCallback, iE);
                return;
            } else {
                a(iBaseResponseCallback, iB);
                return;
            }
        }
        if (d(modifiedTime, jE, iB)) {
            e(eegVar, iB, "osaActiveSwitch");
        }
        a(iBaseResponseCallback, iB);
    }
}
