package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fhf {

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fhf f34049b = new fhf();
    }

    private fhf() {
    }

    public static final fhf b() {
        return a.f34049b;
    }

    public void a(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthLibInteractor", "insertHeartRateIntoHihealthLib jsonObject is null");
            return;
        }
        fhd fhdVar = (fhd) new Gson().fromJson(CommonUtil.ac(jSONObject.toString()), fhd.class);
        long jA = fhdVar.a();
        int iC = fhdVar.c();
        if (jA == 0 || iC == 0) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthLibInteractor", "insertHeartRateIntoHihealthLib HeartRateData error.");
            return;
        }
        DeviceInfo deviceInfoD = d();
        if (deviceInfoD == null) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthLibInteractor", "insertHeartRateIntoHihealthLib connectedDeviceInfo is null.");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(i);
        b(iC, hiHealthData, deviceInfoD.getSecurityUuid() + "#ANDROID21");
        hiHealthData.setStartTime(jA);
        hiHealthData.setValue(iC);
        hiHealthData.setEndTime(jA);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        hiHealthData.putString("realtime_merge_mode", "instantaneousMode");
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhf.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "IHealthDataHandler type is " + i2);
            }
        });
    }

    private void b(int i, HiHealthData hiHealthData, String str) {
        if (i == 255) {
            hiHealthData.setDataSource(String.valueOf(-1));
            hiHealthData.setDeviceUuid(String.valueOf(-1));
        } else {
            hiHealthData.setDeviceUuid(str);
        }
    }

    public void e(Object obj) {
        if (!(obj instanceof String)) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthLibInteractor", "insertRealTimeHeartRateForMerge srcObject is not String");
            return;
        }
        njw njwVar = (njw) new Gson().fromJson(CommonUtil.ac(obj.toString()), njw.class);
        int iJ = njwVar.j();
        String strP = njwVar.p();
        if (iJ == 0) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthLibInteractor", "insertRealTimeHeartRateForMerge HeartRateData error.");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(50001);
        b(iJ, hiHealthData, strP);
        hiHealthData.setStartTime(new Date().getTime());
        hiHealthData.setValue(iJ);
        hiHealthData.setEndTime(new Date().getTime());
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertRealTimeHeartRateForMerge hr ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        hiHealthData.putString("realtime_merge_mode", "instantaneousMode");
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhf.3
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj2) {
                LogUtil.a("HealthLibInteractor", "insertRealTimeHeartRateForMerge type is ", Integer.valueOf(i), ".obj = ", obj2);
            }
        });
    }

    public void a(njw njwVar) {
        int iJ = njwVar.j();
        String strP = njwVar.p();
        if (iJ == 0) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthLibInteractor", "insertRealTimeHeartRateForMerge HeartRateData error.");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(50001);
        b(iJ, hiHealthData, strP);
        hiHealthData.setStartTime(new Date().getTime());
        hiHealthData.setValue(iJ);
        hiHealthData.setEndTime(new Date().getTime());
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertRealTimeHeartRateForMerge hr ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        hiHealthData.putString("realtime_merge_mode", "instantaneousMode");
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhp
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertRealTimeHeartRateByReal type is ", Integer.valueOf(i), ".obj = ", obj);
            }
        });
    }

    public void b(Object obj) {
        LogUtil.a("HealthLibInteractor", "insertAllSportData enter");
        if (!(obj instanceof String)) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthLibInteractor", "insertAllSportData srcObject is not JSONObject");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.APP_MISMATCH_ERROR);
        njw njwVar = (njw) new Gson().fromJson(CommonUtil.ac(obj.toString()), njw.class);
        b(njwVar.j(), hiHealthData, njwVar.p());
        hiHealthData.setMetaData(obj.toString());
        LogUtil.a("HealthLibInteractor", "insertAllSportData MetaData = ", obj.toString());
        hiHealthData.setStartTime(new Date().getTime());
        hiHealthData.setEndTime(new Date().getTime());
        hiHealthData.setOwnerId(0);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhf.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj2) {
                LogUtil.a("HealthLibInteractor", "insertAllSportData type is ", Integer.valueOf(i), ".obj = ", obj2);
            }
        });
    }

    public void g(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.APP_NOT_ENABLED_ERROR);
        hiHealthData.setStartTime(new Date().getTime());
        hiHealthData.setEndTime(new Date().getTime());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertRealTimePowerByReal pwoer ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhj
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertRealTimePowerByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void a(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA.value());
        hiHealthData.setStartTime(new Date().getTime());
        hiHealthData.setEndTime(new Date().getTime());
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_CADENCE.value()), Double.valueOf(i));
        hiHealthData.putString("realtime_back_data_interval", fkn.b((Set<Integer>) linkedHashMap.keySet()));
        hiHealthData.setFieldsValue(HiJsonUtil.d(linkedHashMap));
        hiHealthData.setDeviceUuid(str);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertCyclingCadenceByReal CyclingCadence ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhr
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertCyclingCadenceByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void j(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.POLYMERIZED_NOT_SUPPORTED_ERROR);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertInclinationByReal inclination ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhq
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertInclinationByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void b(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.API_EXCEPTION_ERROR);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertAnalogPowerByReal analogPower ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhm
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertAnalogPowerByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void d(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(50017);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertAnalogCadenceByReal analogCadence ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhk
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertAnalogCadenceByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void c(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.NONEXISTENT_DATA_COLLECTOR_ERROR);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertAvgCadenceByReal avgCadence ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhu
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertAvgCadenceByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void e(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.SAMPLE_SET_TIMESTAMP_ERROR);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertAvgAnalogCadenceByReal avgAnalogCadence ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhn
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertAvgAnalogCadenceByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void k(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.UNSUPPORTED_ACCOUNT_ERROR);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertThreeSecPowerByReal threeSecPower ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fho
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertThreeSecPowerByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void f(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.BLUETOOTH_FORBIDDEN_ERROR);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertThreeSecAnalogPowerByReal threeSecAnalogPower ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhv
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertThreeSecAnalogPowerByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void h(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.MISMATCH_PACKAGE_NAME_ERROR);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertThreeSecAnalogPowerByReal realAvgPower ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhl
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertThreeSecAnalogPowerByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void i(String str, int i) {
        HiHealthData hiHealthData = new HiHealthData(50016);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setValue(i);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.a("HealthLibInteractor", "insertThreeSecAnalogPowerByReal realAvgAnalogPower ", Double.valueOf(hiHealthData.getValue()), " startTime ", Long.valueOf(hiHealthData.getStartTime()), " endTime ", Long.valueOf(hiHealthData.getEndTime()));
        hiHealthData.setOwnerId(0);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhs
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertThreeSecAnalogPowerByReal type is ", Integer.valueOf(i2), ".obj = ", obj);
            }
        });
    }

    public void e(njw njwVar) {
        LogUtil.a("HealthLibInteractor", "insertAllSportDataByReal enter");
        HiHealthData hiHealthData = new HiHealthData(HiHealthStatusCodes.APP_MISMATCH_ERROR);
        b(njwVar.j(), hiHealthData, njwVar.p());
        String json = new Gson().toJson(njwVar);
        hiHealthData.setMetaData(json);
        LogUtil.a("HealthLibInteractor", "insertAllSportDataByReal MetaData = ", json);
        hiHealthData.setStartTime(new Date().getTime());
        hiHealthData.setEndTime(new Date().getTime());
        hiHealthData.setOwnerId(0);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(dxw.d()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fht
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                LogUtil.a("HealthLibInteractor", "insertAllSportDataByReal type is ", Integer.valueOf(i), ".obj = ", obj);
            }
        });
    }

    public void a(DeviceInfo deviceInfo, String str, String str2) {
        if (deviceInfo == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("HWhealthLinkage_Posture_", "insertRunPostureData failed, object or deviceInfo is null.");
            return;
        }
        LogUtil.a("Posture_", "insertRunPostureDataDic, fieldsValueJson: ", str);
        HiHealthData hiHealthData = new HiHealthData(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA.value());
        hiHealthData.setStartTime(new Date().getTime());
        hiHealthData.setEndTime(new Date().getTime());
        hiHealthData.setDeviceUuid(deviceInfo.getSecurityUuid() + "#ANDROID21");
        hiHealthData.setOwnerId(0);
        hiHealthData.setFieldsValue(str);
        hiHealthData.putString("realtime_back_data_interval", str2);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(BaseApplication.b()).insertRealTimeHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: fhf.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("Posture_", "insertRunPostureDataDic type is ", Integer.valueOf(i), ".obj = ", obj);
            }
        });
    }

    public void e(List<DeviceInfo> list) {
        if (njy.e(list)) {
            LogUtil.j("HealthLibInteractor", "addSupportDevices failed, deviceInfos is empty.");
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            try {
                HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(mga.e(deviceInfo.getProductType()));
                hiDeviceInfo.setDeviceUniqueCode(deviceInfo.getDeviceIdentify());
                hiDeviceInfo.setDeviceName(deviceInfo.getDeviceName());
                ArrayList arrayList = new ArrayList(10);
                arrayList.add(0);
                HiHealthManager.d(dxw.d()).registerDataClient(hiDeviceInfo, arrayList, null);
            } catch (IllegalArgumentException unused) {
                LogUtil.j("HealthLibInteractor", "get HiDeviceInfo failed, ProductType = ", Integer.valueOf(deviceInfo.getProductType()));
            }
        }
    }

    public DeviceInfo e() {
        DeviceInfo deviceInfoD = mgi.d("HealthLibInteractor");
        if (deviceInfoD == null || deviceInfoD.getAutoDetectSwitchStatus() != 1) {
            return null;
        }
        return deviceInfoD;
    }

    private DeviceInfo d() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HealthLibInteractor");
        if (deviceInfo != null) {
            return deviceInfo;
        }
        LogUtil.j("HealthLibInteractor", "getHeartRateDevice connectedDeviceInfo is null");
        return null;
    }
}
