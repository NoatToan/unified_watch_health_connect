package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.device.api.ConverResisToWeightDataUtilApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.WiFiWeightSaveHandlerApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class enw implements IHealthDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f33247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeightInsertStatusCallback f33249c;
    private dnj d;

    @Override // com.huawei.health.device.callback.IHealthDeviceCallback
    public void onFailed(HealthDevice healthDevice, int i) {
    }

    @Override // com.huawei.health.device.callback.IHealthDeviceCallback
    public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
    }

    @Override // com.huawei.health.device.callback.IHealthDeviceCallback
    public void onStatusChanged(HealthDevice healthDevice, int i) {
    }

    public enw(int i) {
        this(null, i);
    }

    public enw(dnj dnjVar, int i) {
        this.d = dnjVar;
        this.f33248b = i;
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        this.f33247a = iBaseResponseCallback;
    }

    public void b(dnj dnjVar) {
        this.d = dnjVar;
    }

    public void e(WeightInsertStatusCallback weightInsertStatusCallback) {
        this.f33249c = weightInsertStatusCallback;
    }

    private List<HiHealthData> b(HealthData healthData, HealthDevice healthDevice) {
        if (healthData == null) {
            return Collections.EMPTY_LIST;
        }
        HiHealthData hiHealthData = new HiHealthData(this.f33248b);
        long time = new Date().getTime();
        if (healthData.getStartTime() == 0 || healthData.getEndTime() == 0) {
            healthData.setStartTime(time);
            healthData.setEndTime(time);
        }
        hiHealthData.setStartTime(healthData.getStartTime());
        hiHealthData.setEndTime(healthData.getEndTime());
        if (healthDevice instanceof MeasurableDevice) {
            MeasurableDevice measurableDevice = (MeasurableDevice) healthDevice;
            String productId = measurableDevice.getProductId();
            String uniqueId = measurableDevice.getUniqueId();
            HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
            String deviceSerialNumberByUniqueId = honourDeviceConstantsApi.getDeviceSerialNumberByUniqueId(uniqueId);
            boolean z = (TextUtils.isEmpty(deviceSerialNumberByUniqueId) || "0".equals(deviceSerialNumberByUniqueId)) ? false : true;
            if (honourDeviceConstantsApi.isDualModeProduct(productId) && z) {
                hiHealthData.setDeviceUuid(deviceSerialNumberByUniqueId);
            } else {
                hiHealthData.setDeviceUuid(healthDevice.getUniqueId());
            }
        } else {
            hiHealthData.setDeviceUuid(healthDevice.getUniqueId());
        }
        ReleaseLogUtil.d("R_PluginDevice_IHealthDataHandler", "IHealthDataHandler endTime is ", Long.valueOf(hiHealthData.getEndTime()), ", deviceUuid is ", CommonUtil.n(hiHealthData.getDeviceUuid()));
        ArrayList arrayList = new ArrayList(16);
        d(hiHealthData, healthData, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    private void d(HiHealthData hiHealthData, HealthData healthData, List<HiHealthData> list) {
        int i = this.f33248b;
        if (i == 2002) {
            if (healthData instanceof enb) {
                LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler current device is heartRate device");
                hiHealthData.setValue(((enb) healthData).getHeartRate());
                LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler heartRate is ***");
            }
        } else if (i == 10006) {
            LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler HiHealthDataType.DATA_SET_WEIGHT_EX");
            if (healthData instanceof dso) {
                ((ConverResisToWeightDataUtilApi) Services.b("PluginDevice", ConverResisToWeightDataUtilApi.class)).convertWeightAndFatRateData(hiHealthData, (dso) healthData, this.d);
            }
        } else if (i == 50001) {
            hiHealthData.putString("realtime_merge_mode", "instantaneousMode");
            if (healthData instanceof enb) {
                LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler current device is heartRate device");
                hiHealthData.setValue(((enb) healthData).getHeartRate());
                LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler heartRate is ***");
            }
        } else if (i != 2103) {
            if (i != 2104) {
                if (i != 10001) {
                    if (i == 10002 && (healthData instanceof eni)) {
                        e(hiHealthData, (eni) healthData);
                    }
                } else if (healthData instanceof emq) {
                    c(hiHealthData, (emq) healthData);
                }
            } else if (healthData instanceof emp) {
                d(hiHealthData, (emp) healthData);
            }
        } else if (healthData instanceof emt) {
            a(hiHealthData, (emt) healthData);
        }
        list.add(hiHealthData);
    }

    private void e(HiHealthData hiHealthData, eni eniVar) {
        hiHealthData.putShort("BLOOD_PRESSURE_DIASTOLIC", eniVar.getDiastolic());
        hiHealthData.putShort("BLOOD_PRESSURE_SYSTOLIC", eniVar.getSystolic());
        hiHealthData.putShort(BleConstants.BLOODPRESSURE_SPHYGMUS, eniVar.getHeartRate());
    }

    private void c(HiHealthData hiHealthData, emq emqVar) {
        float bloodSugar = emqVar.getBloodSugar();
        if ("dnurse".equals(emqVar.getRecordId())) {
            LogUtil.a("PluginDevice_IHealthDataHandler", "HealthDHealthDataHandler endTime is ataHandler current device is dnurse bloodSugar type = ", Integer.valueOf(emqVar.getType()));
            hiHealthData.setType(emqVar.getType());
            hiHealthData.setValue(bloodSugar);
        } else {
            LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler current device is johnson");
            long startTime = emqVar.getStartTime();
            LogUtil.a("PluginDevice_IHealthDataHandler", "getStartTime " + startTime);
            hiHealthData.setType(emq.d(startTime));
            hiHealthData.setValue(bloodSugar);
        }
        HiBloodSugarMetaData hiBloodSugarMetaData = new HiBloodSugarMetaData();
        hiBloodSugarMetaData.setConfirmed(true);
        hiHealthData.setMetaData(HiJsonUtil.d(hiBloodSugarMetaData));
    }

    private void d(HiHealthData hiHealthData, emp empVar) {
        hiHealthData.setValue(empVar.c());
    }

    private void a(HiHealthData hiHealthData, emt emtVar) {
        hiHealthData.setValue(emtVar.e());
    }

    private void e(final HealthDevice healthDevice, final HiDataInsertOption hiDataInsertOption, final WeightInsertStatusCallback weightInsertStatusCallback, final IBaseResponseCallback iBaseResponseCallback, final int i) {
        if (d(hiDataInsertOption, i)) {
            LogUtil.j("PluginDevice_IHealthDataHandler", "IHealthDataHandler insertWithRetry params is invalid");
            return;
        }
        LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler insertWithRetry, retryTimes ", Integer.valueOf(i));
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        HiDataInsertOption hiDataInsertOptionC = c(hiDataInsertOption, arrayList, arrayList2);
        b(hiDataInsertOptionC);
        HiHealthManager.d(dxw.d()).insertHiHealthData(hiDataInsertOptionC, new HiDataOperateListener() { // from class: enx
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                this.e.d(hiDataInsertOption, arrayList, arrayList2, iBaseResponseCallback, weightInsertStatusCallback, healthDevice, i, i2, obj);
            }
        });
    }

    /* synthetic */ void d(HiDataInsertOption hiDataInsertOption, List list, List list2, IBaseResponseCallback iBaseResponseCallback, WeightInsertStatusCallback weightInsertStatusCallback, HealthDevice healthDevice, int i, int i2, Object obj) {
        LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler insertWithRetry ", i2 == 0 ? "success" : ParamConstants.CallbackMethod.ON_FAIL, " response Code:", Integer.valueOf(i2));
        if (i2 == 0) {
            e();
            a(hiDataInsertOption.getDatas());
            e((List<HiHealthData>) list, (List<HiHealthData>) list2, iBaseResponseCallback, weightInsertStatusCallback, i2);
            return;
        }
        if (i2 == 10 && (healthDevice instanceof MeasurableDevice)) {
            if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isDualModeProduct(((MeasurableDevice) healthDevice).getProductId())) {
                c(healthDevice, hiDataInsertOption);
            }
        }
        if (i > 1) {
            a(healthDevice, hiDataInsertOption, weightInsertStatusCallback, iBaseResponseCallback, i);
            return;
        }
        if (weightInsertStatusCallback != null) {
            weightInsertStatusCallback.isSuccess(false);
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i2, obj);
        }
    }

    private HiDataInsertOption c(HiDataInsertOption hiDataInsertOption, List<HiHealthData> list, List<HiHealthData> list2) {
        for (HiHealthData hiHealthData : hiDataInsertOption.getDatas()) {
            if (hiHealthData.getType() == 2018) {
                list2.add(hiHealthData);
            } else if (hiHealthData.getType() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()) {
                HashMap map = new HashMap(3);
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()), Double.valueOf(hiHealthData.getShort("BLOOD_PRESSURE_SYSTOLIC")));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value()), Double.valueOf(hiHealthData.getShort("BLOOD_PRESSURE_DIASTOLIC")));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()), Double.valueOf(hiHealthData.getShort(BleConstants.BLOODPRESSURE_SPHYGMUS)));
                hiHealthData.setFieldsValue(HiJsonUtil.d(map));
                list.add(hiHealthData);
            } else {
                list.add(hiHealthData);
            }
        }
        HiDataInsertOption hiDataInsertOption2 = new HiDataInsertOption();
        hiDataInsertOption2.setDatas(list);
        return hiDataInsertOption2;
    }

    private void b(HiDataInsertOption hiDataInsertOption) {
        if (hiDataInsertOption == null) {
            return;
        }
        List<HiHealthData> datas = hiDataInsertOption.getDatas();
        if (njy.e(datas)) {
            LogUtil.j("PluginDevice_IHealthDataHandler", "logHfImpedance datas is null or empty");
            return;
        }
        HiHealthData hiHealthData = datas.get(0);
        LogUtil.a("PluginDevice_IHealthDataHandler", "save weight data param : ", CommonUtil.n(hiHealthData.getDeviceUuid()), " owner : ", Integer.valueOf(hiHealthData.getOwnerId()));
        for (HiHealthData hiHealthData2 : datas) {
            if (hiHealthData2 != null) {
                double d = hiHealthData2.getDouble("lhrhHfImpedance");
                double d2 = hiHealthData2.getDouble("lhlfHfImpedance");
                double d3 = hiHealthData2.getDouble("lhrfHfImpedance");
                double d4 = hiHealthData2.getDouble("rhlfHfImpedance");
                double d5 = hiHealthData2.getDouble("rhrfHfImpedance");
                double d6 = hiHealthData2.getDouble("lfrfHfImpedance");
                if (d6 > 0.0d) {
                    LogUtil.a("PluginDevice_IHealthDataHandler", "insertHiHealthData hiDataInsertOption : lhrhhfimpedance is " + d + " , lhlfhfimpedance is " + d2 + " , lhrfhfimpedance is " + d3 + " , rhlfhfimpedance is " + d4 + " , rhrfhfimpedance is " + d5 + " , lfrfhfimpedance is " + d6);
                }
            }
        }
    }

    private void a(HealthDevice healthDevice, HiDataInsertOption hiDataInsertOption, WeightInsertStatusCallback weightInsertStatusCallback, IBaseResponseCallback iBaseResponseCallback, int i) {
        e(healthDevice, hiDataInsertOption, weightInsertStatusCallback, iBaseResponseCallback, i - 1);
    }

    private boolean d(HiDataInsertOption hiDataInsertOption, int i) {
        if (hiDataInsertOption == null || njy.e(hiDataInsertOption.getDatas())) {
            LogUtil.j("PluginDevice_IHealthDataHandler", "IHealthDataHandler insert data is null");
            return true;
        }
        if (i > 0) {
            return false;
        }
        LogUtil.j("PluginDevice_IHealthDataHandler", "IHealthDataHandler insert illegal retryTimes");
        return true;
    }

    private void e(List<HiHealthData> list, List<HiHealthData> list2, IBaseResponseCallback iBaseResponseCallback, WeightInsertStatusCallback weightInsertStatusCallback, int i) {
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(list2);
        if (list.size() > 0 && list.get(0).getType() == 10002 && list2.size() > 0) {
            LogUtil.a("PluginDevice_IHealthDataHandler", "doSuccessResponse heartListJson:", new Gson().toJson(list2));
            e(hiDataInsertOption, iBaseResponseCallback, 3);
            return;
        }
        if (weightInsertStatusCallback != null) {
            weightInsertStatusCallback.isSuccess(true);
        }
        if (iBaseResponseCallback != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(true);
            iBaseResponseCallback.a(i, arrayList);
        }
    }

    private void e(final HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback, final int i) {
        HiHealthManager.d(dxw.d()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: enu
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                this.f33244c.d(iBaseResponseCallback, i, hiDataInsertOption, i2, obj);
            }
        });
    }

    /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, HiDataInsertOption hiDataInsertOption, int i2, Object obj) {
        if (i2 == 0) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i2, obj);
                return;
            }
            return;
        }
        LogUtil.j("PluginDevice_IHealthDataHandler", "insertBloodPressHeartRate onResult else ", Integer.valueOf(i2));
        if (i > 1) {
            e(hiDataInsertOption, iBaseResponseCallback, i - 1);
        } else if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i2, obj);
        }
    }

    private void c(HealthDevice healthDevice, HiDataInsertOption hiDataInsertOption) {
        LogUtil.a("PluginDevice_IHealthDataHandler", "enter setErrorNoFindClient");
        List<HiHealthData> datas = hiDataInsertOption.getDatas();
        if (njy.e(datas)) {
            LogUtil.j("PluginDevice_IHealthDataHandler", "setErrorNoFindClient listDatas is null or empty");
            return;
        }
        for (HiHealthData hiHealthData : datas) {
            if (hiHealthData != null) {
                String deviceUuid = hiHealthData.getDeviceUuid();
                if (TextUtils.isEmpty(deviceUuid)) {
                    LogUtil.a("PluginDevice_IHealthDataHandler", "setErrorNoFindClient isEmpty uuid");
                    hiHealthData.setDeviceUuid(healthDevice.getUniqueId());
                } else if (!deviceUuid.contains(":")) {
                    LogUtil.a("PluginDevice_IHealthDataHandler", "setErrorNoFindClient uuid no contains");
                    hiHealthData.setDeviceUuid(healthDevice.getUniqueId());
                }
            }
        }
    }

    @Override // com.huawei.health.device.callback.IHealthDeviceCallback
    public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
        if (healthDevice == null || healthData == null) {
            LogUtil.a("PluginDevice_IHealthDataHandler", "IHealthDataHandler onDataChanged parameter is null");
            return;
        }
        List<HiHealthData> listB = b(healthData, healthDevice);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        for (HiHealthData hiHealthData : listB) {
            hiHealthData.setOwnerId(0);
            hiDataInsertOption.addData(hiHealthData);
        }
        e(healthDevice, hiDataInsertOption, this.f33249c, this.f33247a, 3);
    }

    @Override // com.huawei.health.device.callback.IHealthDeviceCallback
    public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PluginDevice_IHealthDataHandler", "IHealthDataHandler onDataChanged empty dataList");
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        Iterator<HealthData> it = list.iterator();
        while (it.hasNext()) {
            for (HiHealthData hiHealthData : b(it.next(), healthDevice)) {
                hiHealthData.setOwnerId(0);
                hiDataInsertOption.addData(hiHealthData);
            }
        }
        e(healthDevice, hiDataInsertOption, this.f33249c, this.f33247a, 3);
    }

    private void a(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PluginDevice_IHealthDataHandler", "IHealthDataHandler setMainUserHeartRate data is empty");
        } else if (!eny.a().c() && !eny.a().d()) {
            LogUtil.j("PluginDevice_IHealthDataHandler", "IHealthDataHandler setMainUserHeartRate is not haiget or ICommon product!");
        } else {
            ((WiFiWeightSaveHandlerApi) Services.b("PluginDevice", WiFiWeightSaveHandlerApi.class)).setMainUserHeartRate(list);
        }
    }

    private void e() {
        int i = this.f33248b;
        if (i == 10001 || i == 10002 || i == 10006) {
            HiSyncOption hiSyncOption = new HiSyncOption();
            hiSyncOption.setSyncModel(2);
            hiSyncOption.setSyncAction(0);
            hiSyncOption.setSyncDataType(20000);
            hiSyncOption.setSyncMethod(2);
            hiSyncOption.setSyncScope(1);
            HiHealthNativeApi.a(dxw.d()).synCloud(hiSyncOption, null);
        }
    }
}
