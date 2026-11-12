package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eaw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeightInsertStatusCallback f32623b;
    private dnj e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f32622a = new double[6];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double[] f32624c = new double[6];

    private static boolean b(double d, double d2, double d3) {
        return d <= d3 && d >= d2;
    }

    public int e(int i) {
        if (i >= 1 && i <= 29) {
            return 1;
        }
        if (i <= 29 || i >= 60) {
            return (i < 60 || i >= 80) ? 4 : 3;
        }
        return 2;
    }

    public eaw(dnj dnjVar, WeightInsertStatusCallback weightInsertStatusCallback) {
        this.e = dnjVar;
        this.f32623b = weightInsertStatusCallback;
    }

    private void b(double d, HiHealthData hiHealthData, String str) {
        if (a(str, d)) {
            hiHealthData.putDouble(str, d);
        } else {
            ReleaseLogUtil.e("R_Weight_WiFiWeightSaveHandler", "setData key:", str);
            dyg.d(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler setData value:", Double.valueOf(d));
        }
    }

    private HiHealthData a(HiHealthData hiHealthData) {
        double d;
        double d2;
        if (hiHealthData == null) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertData data is null");
            return null;
        }
        if (this.e == null) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertData mCurrentUser is null");
            return null;
        }
        hiHealthData.setType(10006);
        dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler DeviceUUID is ", dyg.b(hiHealthData.getDeviceUuid()));
        dyg.a(true, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler starTime is ", Long.valueOf(hiHealthData.getStartTime()));
        double d3 = hiHealthData.getDouble("bodyWeight");
        double d4 = hiHealthData.getDouble(BleConstants.IMPEDANCE);
        double d5 = hiHealthData.getDouble(IndoorEquipManagerApi.KEY_HEART_RATE);
        dyg.a(false, "WiFiWeightSaveHandler", "weight is ", Double.valueOf(d3), " impedance:", Double.valueOf(d4), "mHeartRate: ", Double.valueOf(d5));
        float f = (float) d3;
        this.e.e(f);
        MultiUsersManager.INSTANCE.saveUser(this.e, new IBaseResponseCallback() { // from class: eaw.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
            }
        });
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        String strI2 = this.e.i();
        if (strI == null || strI.equals(strI2)) {
            hiHealthData.setMetaData("0");
        } else {
            hiHealthData.setMetaData(strI2);
        }
        LogUtil.a("WiFiWeightSaveHandler", "getMetaData = ", hiHealthData.getMetaData());
        dnb dnbVar = new dnb();
        b(this.e.c(), hiHealthData, "age");
        b(this.e.e(), hiHealthData, "height");
        b(this.e.d(), hiHealthData, CommonConstant.KEY_GENDER);
        boolean zB = dxm.b(hiHealthData);
        if (hiHealthData.getInt("pole") == 2) {
            g(hiHealthData);
            dsq.a(hiHealthData, dnbVar, c(hiHealthData, dnbVar, zB));
            dnbVar.c(this.f32622a);
            dnbVar.o(d5);
        } else if (hiHealthData.getInt("pole") == 1) {
            if (d4 == 0.0d) {
                double d6 = hiHealthData.getDouble("lfrfImpedance");
                LogUtil.a("WiFiWeightSaveHandler", "impedance from left leg right leg:", Double.valueOf(d6));
                dsq.a(true);
                d2 = d6;
            } else {
                d2 = d4;
            }
            dsq.c(hiHealthData, dnbVar, a(hiHealthData, d2, dnbVar, zB));
            dnbVar.o(d5);
        } else {
            if (d4 > 0.0d) {
                double dB = b(f, (float) d4);
                b(dB, hiHealthData, BleConstants.BODY_FAT_RATE);
                d = dB;
            } else {
                d = 0.0d;
            }
            if (d > 0.5d && d4 > 0.0d) {
                a(hiHealthData, d4, d5, (float) d, dnbVar);
            }
            dnbVar.d(d);
        }
        if (dor.e(hiHealthData.getDeviceUuid(), this.e.c())) {
            dnbVar.o(0.0d);
            dnbVar.d(0.0d);
            dnbVar.v(0.0d);
        }
        dnbVar.d(hiHealthData.getInt("trackdata_deviceType"));
        dnbVar.e(hiHealthData.getStartTime());
        dnbVar.d(hiHealthData.getEndTime());
        dnbVar.af(d3);
        dnbVar.e(this.e.c());
        dnbVar.c(this.e.e());
        dnbVar.c(this.e.d());
        MultiUsersManager.INSTANCE.setCurrentUser(this.e);
        WeightDataManager.INSTANCE.setMapData(dnbVar, strI2);
        ReleaseLogUtil.d("R_Weight_WiFiWeightSaveHandler", "endTime is ", Long.valueOf(hiHealthData.getEndTime()));
        return hiHealthData;
    }

    private dyh a(HiHealthData hiHealthData, double d, dnb dnbVar, boolean z) {
        if (z) {
            g(hiHealthData);
            dnbVar.c(this.f32622a);
            c(hiHealthData);
            dnbVar.d(this.f32624c);
            dnbVar.a(2);
            return new dyh(this.e.e(), this.e.r(), dne.a(this.e.d()), this.e.c(), this.e.j(), 4, this.f32622a, 1, this.f32624c);
        }
        b(0, d);
        return new dyh(this.e.e(), this.e.r(), dne.a(this.e.d()), this.e.c(), this.e.j(), this.f32622a[0]);
    }

    private dyh c(HiHealthData hiHealthData, dnb dnbVar, boolean z) {
        if (z) {
            c(hiHealthData);
            dnbVar.d(this.f32624c);
            dnbVar.a(2);
            return new dyh(this.e.e(), this.e.r(), dne.a(this.e.d()), this.e.c(), this.e.j(), 8, this.f32622a, 2, this.f32624c);
        }
        return new dyh(this.e.e(), this.e.r(), dne.a(this.e.d()), this.e.c(), this.e.j(), this.f32622a);
    }

    private void g(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return;
        }
        String[] strArr = {"lfrfImpedance", "lhrhImpedance", "lhlfImpedance", "lhrfImpedance", "rhlfImpedance", "rhrfImpedance"};
        for (int i = 0; i < 6; i++) {
            b(i, hiHealthData.getDouble(strArr[i]));
        }
    }

    private void c(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return;
        }
        String[] strArr = {"lfrfHfImpedance", "lhrhHfImpedance", "lhlfHfImpedance", "lhrfHfImpedance", "rhlfHfImpedance", "rhrfHfImpedance"};
        for (int i = 0; i < 6; i++) {
            e(i, hiHealthData.getDouble(strArr[i]));
        }
    }

    private void e(int i, double d) {
        if (i >= 0) {
            double[] dArr = this.f32624c;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = d;
        }
    }

    private void b(int i, double d) {
        if (i >= 0) {
            double[] dArr = this.f32622a;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = d;
        }
    }

    private void a(HiHealthData hiHealthData, double d, double d2, float f, dnb dnbVar) {
        eac eacVar = new eac(this.e.e(), this.e.r(), dne.a(this.e.d()), this.e.c(), f, d);
        b(eacVar.a(), hiHealthData, BleConstants.BMI);
        b(eacVar.b(), hiHealthData, BleConstants.BASAL_METABOLISM);
        b(eacVar.c(), hiHealthData, BleConstants.BODY_AGE);
        b(eacVar.g(), hiHealthData, BleConstants.BODY_SCORE);
        b(eacVar.d(), hiHealthData, BleConstants.BONE_SALT);
        b(eacVar.i(), hiHealthData, BleConstants.MUSCLE_MASS);
        b(eacVar.e(), hiHealthData, "protein");
        b(eacVar.h(), hiHealthData, BleConstants.MOISTURE_RATE);
        b(eacVar.l(), hiHealthData, BleConstants.VISCERAL_FAT_LEVEL);
        b(eacVar.j(), hiHealthData, BleConstants.IMPEDANCE);
        b(eacVar.f(), hiHealthData, "skeletalMusclelMass");
        dnbVar.a(eacVar.c());
        dnbVar.j(eacVar.g());
        dnbVar.s(eacVar.e());
        dnbVar.c(eacVar.a());
        dnbVar.b(eacVar.b());
        dnbVar.p(eacVar.i());
        dnbVar.l(eacVar.l());
        dnbVar.h(eacVar.d());
        dnbVar.ag(eacVar.h());
        dnbVar.o(d2);
        dnbVar.ab(eacVar.f());
    }

    private double b(float f, float f2) {
        double dC;
        wj wjVar = new wj();
        wjVar.b(this.e.e(), f, dne.a(this.e.d()), this.e.c(), f2);
        dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertData checkCode == ", Integer.valueOf(wjVar.d(this.e.e(), f, dne.a(this.e.d()), this.e.c(), f2)));
        try {
            dC = wjVar.c();
        } catch (wk e) {
            dyg.c(true, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertData getBFR: ", e.getMessage());
            dC = 0.0d;
        }
        dyg.e(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler bodyfatvalue is ", Double.valueOf(dC));
        return dC;
    }

    public void c(List<HiHealthData> list) {
        if (njy.e(list)) {
            dyg.d(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler onDataChanged parameter is empty");
            return;
        }
        final ArrayList arrayList = new ArrayList(16);
        final ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        for (HiHealthData hiHealthData : list) {
            hiHealthData.setModifiedTime(hiHealthData.getModifiedTime() + 1);
            arrayList.add(hiHealthData.copyData());
            arrayList2.add(hiHealthData.copyData());
            HiHealthData hiHealthDataA = a(hiHealthData);
            if (hiHealthDataA != null) {
                hiHealthDataA.setOwnerId(0);
                arrayList3.add(hiHealthDataA);
            } else {
                dyg.d(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler onDataChanged weightData is null");
            }
        }
        if (njy.e(arrayList3)) {
            dyg.d(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler onDataChanged weightDataList is empty");
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList3);
        HiHealthManager.d(dxw.d()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: eaw.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler type is ", Integer.valueOf(i), ", obj =", obj);
                if (eaw.this.f32623b == null) {
                    dyg.d(false, "WiFiWeightSaveHandler", "onDataChanged insertHiHealthData mInsertStatusCallback is null");
                } else {
                    if (i == 0) {
                        eaw.this.d((List<HiHealthData>) arrayList);
                        eaw.this.b((List<HiHealthData>) arrayList2);
                        eaw.this.f32623b.isSuccess(true);
                        return;
                    }
                    eaw.this.f32623b.isSuccess(false);
                }
            }
        });
    }

    public static boolean a(String str, double d) {
        if (BleConstants.BMI.equals(str)) {
            return b(d, 1.0d, 200.0d);
        }
        if ("bodyWeight".equals(str)) {
            return b(d, 1.0d, 500.0d);
        }
        if (BleConstants.BODY_FAT_RATE.equals(str)) {
            return b(d, 0.0d, 100.0d);
        }
        if (BleConstants.MOISTURE.equals(str)) {
            return b(d, 0.0d, 100.0d);
        }
        if (BleConstants.MOISTURE_RATE.equals(str)) {
            return b(d, 0.0d, 100.0d);
        }
        if (BleConstants.VISCERAL_FAT_LEVEL.equals(str)) {
            return b(d, 1.0d, 59.0d);
        }
        if (BleConstants.MUSCLE_MASS.equals(str)) {
            return b(d, 1.0d, 150.0d);
        }
        if (BleConstants.BONE_SALT.equals(str)) {
            return b(d, 1.0d, 4.0d);
        }
        if ("protein".equals(str)) {
            return b(d, 0.0d, 100.0d);
        }
        if (BleConstants.BODY_AGE.equals(str)) {
            return b(d, 18.0d, 99.0d);
        }
        if (BleConstants.BODY_SCORE.equals(str)) {
            return b(d, 0.0d, 100.0d);
        }
        if (IndoorEquipManagerApi.KEY_HEART_RATE.equals(str)) {
            return b(d, 0.0d, 300.0d);
        }
        if ("pressure".equals(str)) {
            return b(d, 1.0d, 99.0d);
        }
        if (BleConstants.IMPEDANCE.equals(str)) {
            return b(d, 1.0d, 100000.0d);
        }
        if ("skeletalMusclelMass".equals(str)) {
            return b(d, 1.0d, 150.0d);
        }
        if ("age".equals(str)) {
            return b(d, 0.0d, 150.0d);
        }
        if (CommonConstant.KEY_GENDER.equals(str)) {
            return b(d, -1.0d, 2.0d);
        }
        if ("height".equals(str)) {
            return b(d, 1.0d, 300.0d);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list) {
        if (njy.e(list)) {
            dyg.d(false, "WiFiWeightSaveHandler", "setMainUserHeartRate dataList is empty");
            return;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }

    public void e(HiHealthData hiHealthData) {
        final HiHealthData hiHealthDataB = b(hiHealthData);
        if (hiHealthDataB != null) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.addData(hiHealthDataB);
            hiHealthDataB.setOwnerId(0);
            HiHealthManager.d(dxw.d()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: eaw.4
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i, Object obj) {
                    dyg.a(false, "WiFiWeightSaveHandler", "setMainUserHeartRate type is ", Integer.valueOf(i));
                    if (i == 0) {
                        dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler setMainUserHeartRate insertHiHealthData success ");
                    } else {
                        dyg.a(false, "WiFiWeightSaveHandler", "setMainUserHeartRate insertHiHealthData not correct obj =", obj);
                        dyg.a(false, "WiFiWeightSaveHandler", "setMainUserHeartRate fail start time:", Long.valueOf(hiHealthDataB.getStartTime()));
                    }
                }
            });
        }
    }

    private HiHealthData b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertHeartRateData data is null");
            return null;
        }
        if (this.e == null) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertHeartRateData mCurrentUser is null");
            return null;
        }
        dyg.a(false, "WiFiWeightSaveHandler", "convertHeartRateData DeviceUUID is ", dyg.b(hiHealthData.getDeviceUuid()));
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        String strI2 = this.e.i();
        if (strI == null) {
            if (!"0".equals(strI2)) {
                dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertHeartRateData mCurrentUserId is 0");
                return null;
            }
        } else if (!strI.equals(strI2) && !"0".equals(strI2)) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertHeartRateData mCurrentUser is not mainUser");
            return null;
        }
        hiHealthData.setType(2002);
        double d = hiHealthData.getDouble(IndoorEquipManagerApi.KEY_HEART_RATE);
        dyg.e(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertHeartRateData mHeartRate is : ", Double.valueOf(d));
        d(hiHealthData, (int) d, 0, 300);
        if (hiHealthData.getValue() > 0.0d) {
            return hiHealthData;
        }
        dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertHeartRateData verifyHeartRateData is less zero");
        return null;
    }

    private void d(HiHealthData hiHealthData, int i, int i2, int i3) {
        if (i <= 0) {
            dyg.e(false, "WiFiWeightSaveHandler", "verifyHeartRateData value:", Integer.valueOf(i));
        } else {
            hiHealthData.setValue(i);
        }
        if (i > i3) {
            hiHealthData.setValue(i3);
        } else if (i >= i2) {
            dyg.a(false, "WiFiWeightSaveHandler", "value is error ");
        } else {
            hiHealthData.setValue(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list) {
        if (njy.e(list)) {
            dyg.d(false, "WiFiWeightSaveHandler", "setMainUserPressure dataList is empty");
            return;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
    }

    private void i(HiHealthData hiHealthData) {
        String deviceUuid = hiHealthData.getDeviceUuid();
        if (TextUtils.isEmpty(deviceUuid)) {
            deviceUuid = "-1";
        }
        HiStressMetaData hiStressMetaDataD = d(hiHealthData);
        if (hiStressMetaDataD != null) {
            d(deviceUuid, hiStressMetaDataD, new IBaseResponseCallback() { // from class: eaw.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    dyg.a(false, "WiFiWeightSaveHandler", "setStressData errorCode = ", Integer.valueOf(i));
                }
            });
        }
    }

    public void d(String str, HiStressMetaData hiStressMetaData, IBaseResponseCallback iBaseResponseCallback) {
        if (hiStressMetaData == null) {
            return;
        }
        LogUtil.d("WiFiWeightSaveHandler", "setStressData uuid = ", str);
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setValue(hiStressMetaData.fetchStressScore());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setTimeInterval(hiStressMetaData.fetchStressStartTime(), hiStressMetaData.fetchStressEndTime());
        hiHealthData.setType(2034);
        LogUtil.d("WiFiWeightSaveHandler", "setStressData metaData = ", hiStressMetaData.toString(), ",setStressData HiJsonUtil.toJson(metaData) = ", HiJsonUtil.d(hiStressMetaData));
        hiHealthData.setMetaData(HiJsonUtil.d(hiStressMetaData));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        b(iBaseResponseCallback, hiDataInsertOption);
    }

    private void b(final IBaseResponseCallback iBaseResponseCallback, HiDataInsertOption hiDataInsertOption) {
        HiHealthNativeApi.a(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: eaw.3
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("WiFiWeightSaveHandler", "errorCode = ", Integer.valueOf(i), "obj = ", HiJsonUtil.d(obj));
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(i, obj);
                }
            }
        });
    }

    private HiStressMetaData d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertPressureData data is null");
            return null;
        }
        if (this.e == null) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertPressureData mCurrentUser is null");
            return null;
        }
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        String strI2 = this.e.i();
        if (strI == null || strI2 == null) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertPressureData don't recognition user ,", "so don't insert pressure data");
            return null;
        }
        if (!strI.equals(strI2)) {
            dyg.a(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertPressureData mCurrentUser is not mainUser");
            return null;
        }
        double d = hiHealthData.getDouble("pressure");
        dyg.e(false, "WiFiWeightSaveHandler", "WiFiWeightSaveHandler convertPressureData mPressure is : ", Double.valueOf(d));
        if (!a("pressure", d)) {
            return null;
        }
        dyg.a(false, "WiFiWeightSaveHandler", "convert pressure data start");
        HiStressMetaData hiStressMetaData = new HiStressMetaData();
        hiStressMetaData.configStressStartTime(hiHealthData.getStartTime());
        hiStressMetaData.configStressEndTime(hiHealthData.getEndTime());
        hiStressMetaData.configStressMeasureType(0);
        int i = (int) d;
        hiStressMetaData.configStressScore(i);
        hiStressMetaData.configStressGrade(e(i));
        return hiStressMetaData;
    }
}
