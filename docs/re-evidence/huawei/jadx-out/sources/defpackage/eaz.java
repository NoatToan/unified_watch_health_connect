package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eaz implements Runnable {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<eau> f32638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeightInsertStatusCallback f32639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dnj f32640c;
    private String e;
    private int j;
    private double[] f = new double[6];
    private double[] i = new double[6];
    private int h = 1;
    private e g = new e();

    static /* synthetic */ int j(eaz eazVar) {
        int i = eazVar.j;
        eazVar.j = i + 1;
        return i;
    }

    class e extends Handler {
        private e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("SaveClaimWeightDataTask", "SaveHandler msg is null");
                return;
            }
            int i = message.what;
            if (i == 5) {
                sendEmptyMessage(7);
                return;
            }
            if (i == 7) {
                eaz.this.e();
            } else if (i == 8) {
                eaz.this.d();
            } else {
                LogUtil.j("SaveClaimWeightDataTask", "SaveHandler what is error");
            }
        }
    }

    public eaz(ArrayList<eau> arrayList, dnj dnjVar, String str, WeightInsertStatusCallback weightInsertStatusCallback) {
        this.f32638a = arrayList;
        this.f32640c = dnjVar;
        this.e = str;
        this.f32639b = weightInsertStatusCallback;
    }

    public static int[] c() {
        return new int[]{2004, 2001, 2031, Constants.START_TO_MAIN_ACTIVITY, 2022, 2023, 2024, 2025, 2033, 2026, 2027, 2028, 2029, 2030, 2051, 2052, 2053, 2054, GLMapStaticValue.MAP_PARAMETERNAME_POLYGON_FILL_CONTROL, GLMapStaticValue.AM_PARAMETERNAME_TEXT_GL_UNIT, 2057, 2058, 2059, 2060, 2061, 2062, 2063, 2064, 2065, 2066, 2067, 2068, 2069, 2070, 2071, 2072, 2073, 2074, 2075, 2076, 2077, 2078, 2079, 2080, 2081};
    }

    private HiHealthData a() {
        HiHealthData hiHealthDataA = this.f32638a.get(0).a();
        for (eau eauVar : this.f32638a) {
            if (eauVar.a().getStartTime() > hiHealthDataA.getStartTime()) {
                hiHealthDataA = eauVar.a();
            }
        }
        LogUtil.d("SaveClaimWeightDataTask", "getWeightData data", Double.valueOf(hiHealthDataA.getDouble("bodyWeight")));
        return hiHealthDataA;
    }

    private String d(dnj dnjVar) {
        if (dnjVar == null || dnjVar.i() == null || "-1".equals(dnjVar.i()) || "0".equals(dnjVar.i())) {
            return "0";
        }
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        if (strI != null && strI.equals(dnjVar.i())) {
            return "0";
        }
        return dnjVar.i();
    }

    private float a(int i, HiHealthData hiHealthData, float f, String str) {
        boolean zB = dxm.b(hiHealthData);
        if (i == 2) {
            e(hiHealthData);
            return a(hiHealthData, f, zB, str).j();
        }
        if (i == 1) {
            return a(hiHealthData, f, zB).n();
        }
        double d2 = hiHealthData.getDouble(BleConstants.IMPEDANCE);
        if (d2 <= 0.0d) {
            return 0.0f;
        }
        wj wjVar = new wj();
        wjVar.b(this.f32640c.e(), f, dne.a(this.f32640c.d()), this.f32640c.c(), (float) d2);
        try {
            return wjVar.c();
        } catch (wk unused) {
            LogUtil.e("SaveClaimWeightDataTask", "getBodyFatRate NoAuthException");
            return 0.0f;
        }
    }

    private dyh a(HiHealthData hiHealthData, float f, boolean z) {
        if (z) {
            e(hiHealthData);
            a(hiHealthData);
            this.h = 1;
            return new dyh(this.f32640c.e(), f, dne.a(this.f32640c.d()), this.f32640c.c(), this.f32640c.j(), 4, this.f, this.h, this.i);
        }
        this.f[0] = hiHealthData.getDouble(BleConstants.IMPEDANCE);
        return new dyh(this.f32640c.e(), f, dne.a(this.f32640c.d()), this.f32640c.c(), this.f32640c.j(), this.f[0]);
    }

    private dyh a(HiHealthData hiHealthData, float f, boolean z, String str) {
        float f2 = e(str, 43) ? (float) hiHealthData.getDouble(BleConstants.BODY_FAT_RATE) : 0.0f;
        if (z) {
            a(hiHealthData);
            this.h = 2;
            return new dyh(this.f32640c.e(), f, dne.a(this.f32640c.d()), this.f32640c.c(), this.f32640c.j(), 8, this.f, f2, this.h, this.i);
        }
        return new dyh(this.f32640c.e(), f, dne.a(this.f32640c.d()), this.f32640c.c(), this.f32640c.j(), this.f, f2);
    }

    private void e(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return;
        }
        String[] strArr = {"lfrfImpedance", "lhrhImpedance", "lhlfImpedance", "lhrfImpedance", "rhlfImpedance", "rhrfImpedance"};
        for (int i = 0; i < 6; i++) {
            this.f[i] = hiHealthData.getDouble(strArr[i]);
        }
    }

    private void a(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return;
        }
        String[] strArr = {"lfrfHfImpedance", "lhrhHfImpedance", "lhlfHfImpedance", "lhrfHfImpedance", "rhlfHfImpedance", "rhrfHfImpedance"};
        for (int i = 0; i < 6; i++) {
            this.i[i] = hiHealthData.getDouble(strArr[i]);
        }
    }

    private Map<String, String> c(String str, HiHealthData hiHealthData, String str2, String str3) {
        HashMap map = new HashMap(16);
        d(str, str3, map);
        double d2 = hiHealthData.getDouble("bodyWeight");
        map.put("isDelete", String.valueOf(0));
        int i = hiHealthData.getInt("pole");
        LogUtil.a("SaveClaimWeightDataTask", "getSendCloudData pole:", Integer.valueOf(i));
        float fA = (float) hiHealthData.getDouble(BleConstants.BODY_FAT_RATE);
        if (fA <= 0.0f) {
            fA = a(i, hiHealthData, (float) d2, str3);
        }
        if (fA > 0.0f) {
            map.put("currentFat", String.format(Locale.ENGLISH, "%.1f", Float.valueOf(fA * 10.0f)));
        }
        if (dxm.ag(str2)) {
            map.put("currentWeight", String.valueOf(((float) d2) * 100.0f));
            if (i == 2) {
                map.put("bodyRes_Z12", String.valueOf(hiHealthData.getDouble("lhrhImpedance") * 10.0d));
                map.put("bodyRes_Z13", String.valueOf(hiHealthData.getDouble("lhlfImpedance") * 10.0d));
                map.put("bodyRes_Z14", String.valueOf(hiHealthData.getDouble("lhrfImpedance") * 10.0d));
                map.put("bodyRes_Z23", String.valueOf(hiHealthData.getDouble("rhlfImpedance") * 10.0d));
                map.put("bodyRes_Z24", String.valueOf(hiHealthData.getDouble("rhrfImpedance") * 10.0d));
                map.put("bodyRes_Z34", String.valueOf(hiHealthData.getDouble("lfrfImpedance") * 10.0d));
            } else {
                map.put("bodyRes", String.valueOf(hiHealthData.getDouble(BleConstants.IMPEDANCE) * 10.0d));
            }
        } else {
            map.put("currentWeight", String.valueOf(((float) d2) * 10.0f));
            map.put("bodyRes", String.valueOf(hiHealthData.getDouble(BleConstants.IMPEDANCE)));
        }
        a(map, hiHealthData, str3);
        return map;
    }

    private void d(String str, String str2, Map<String, String> map) {
        map.put("id", this.e);
        map.put("uid", str);
        map.put(CommonConstant.KEY_GENDER, String.valueOf((int) dne.a(this.f32640c.d())));
        map.put("age", String.valueOf(dor.a(this.f32640c.j(), this.f32640c.c())));
        map.put("height", String.valueOf(this.f32640c.e()));
        if (dor.b(str2)) {
            LogUtil.a("SaveClaimWeightDataTask", "enter setUserBaseInfo supportChildren");
            map.put("month", String.valueOf(dor.e(this.f32640c.j())));
        }
    }

    private void a(Map<String, String> map, HiHealthData hiHealthData, String str) {
        if (!e(str, 43)) {
            LogUtil.j("SaveClaimWeightDataTask", "no support smooth impedance");
            return;
        }
        String[] strArr = {"lhrhHfImpedance", "lhlfHfImpedance", "lhrfHfImpedance", "rhlfHfImpedance", "rhrfHfImpedance", "lfrfHfImpedance"};
        String[] strArr2 = {"res_LHRH_HF", "res_LHLF_HF", "res_LHRF_HF", "res_RHLF_HF", "res_RHRF_HF", "res_LFRF_HF"};
        for (int i = 0; i < 6; i++) {
            map.put(strArr2[i], String.valueOf(hiHealthData.getDouble(strArr[i]) * 10.0d));
        }
        e(map, hiHealthData);
    }

    private void e(Map<String, String> map, HiHealthData hiHealthData) {
        String string = hiHealthData.getString("metadata");
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("SaveClaimWeightDataTask", "setUserInfoTimestamp metaDataJsonArray is null or empty");
            return;
        }
        try {
            List list = (List) new Gson().fromJson(string, new TypeToken<List<eav>>() { // from class: com.huawei.health.device.wifi.control.claim.SaveClaimWeightDataTask$1
            }.getType());
            if (njy.e(list)) {
                LogUtil.j("SaveClaimWeightDataTask", "setUserInfoTimestamp conflictingUserList is empty");
                return;
            }
            int iE = ((eav) list.get(0)).e();
            if ((2 != iE || list.size() >= 3) && 5 != iE) {
                return;
            }
            LogUtil.a("SaveClaimWeightDataTask", "setUserInfoTimestamp userInfoMap put timestamp");
            map.put("dateTime", String.valueOf(hiHealthData.getLong("start_time")));
        } catch (JsonSyntaxException | IllegalStateException unused) {
            LogUtil.e("SaveClaimWeightDataTask", "setUserInfoTimestamp catch JsonSyntaxException or IllegalStateException");
        }
    }

    private boolean b(DeviceServiceInfo deviceServiceInfo, String str) {
        eby ebyVar = (eby) drw.e().c(str);
        if (ebyVar != null) {
            String sid = deviceServiceInfo.getSid();
            if (sid.indexOf("_") >= 0) {
                if (ebyVar.a().m() == 2) {
                    return true;
                }
                deviceServiceInfo.setSid(sid.substring(0, sid.indexOf("_")));
                return true;
            }
            if (ebyVar.a().m() != 2) {
                return true;
            }
            deviceServiceInfo.setSid(sid + "_" + this.e);
            return true;
        }
        LogUtil.a("SaveClaimWeightDataTask", "device is null");
        this.g.obtainMessage(5).sendToTarget();
        return false;
    }

    private boolean e(String str, int i) {
        if (ean.e(str, i) == 1) {
            return true;
        }
        return drk.b(str, i);
    }

    private void d(HiHealthData hiHealthData, String str, String str2, final String str3) {
        LogUtil.a("SaveClaimWeightDataTask", "enter saveSingleCloudData");
        dnj dnjVar = this.f32640c;
        if (dnjVar == null || hiHealthData == null) {
            LogUtil.j("SaveClaimWeightDataTask", "saveSingleCloudData params is null");
            return;
        }
        String strD = d(dnjVar);
        Map<String, String> mapC = c(strD, hiHealthData, str2, str);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        deviceServiceInfo.setData(mapC);
        if (strD.equals("0")) {
            deviceServiceInfo.setSid(ece.f32732a);
        } else {
            deviceServiceInfo.setSid(this.f32640c.g());
        }
        if (b(deviceServiceInfo, str3)) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(deviceServiceInfo);
            WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
            wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
            wifiDeviceControlDataModelReq.setDevId(str3);
            lqo.b(BaseApplication.getContext()).e(wifiDeviceControlDataModelReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: eaz.4
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void operationResult(CloudCommonReponse cloudCommonReponse, String str4, boolean z) {
                    LogUtil.a("SaveClaimWeightDataTask", "saveSingleCloudData isSuccess,", Boolean.valueOf(z));
                    if (z) {
                        eaz.this.g.obtainMessage(5).sendToTarget();
                        return;
                    }
                    if (cloudCommonReponse != null) {
                        Integer resultCode = cloudCommonReponse.getResultCode();
                        int iIntValue = resultCode.intValue();
                        LogUtil.a("SaveClaimWeightDataTask", "saveSingleCloudData syncWifiDeviceControl errorCode,", resultCode, ",errorDesc,", cloudCommonReponse.getResultDesc());
                        if (iIntValue == 112000000) {
                            ean.k(str3);
                            eaz.this.g.obtainMessage(5).sendToTarget();
                            return;
                        }
                    }
                    if (eaz.this.f32639b != null) {
                        eaz.this.f32639b.isSuccess(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ArrayList<eby> arrayListD = drw.e().d();
        if (njy.e(arrayListD)) {
            LogUtil.j("SaveClaimWeightDataTask", "saveCloudData devices is null or empty");
            this.g.obtainMessage(5).sendToTarget();
            return;
        }
        HiHealthData hiHealthDataA = a();
        MeasurableDevice measurableDeviceA = dmp.d().a(hiHealthDataA.getString("device_uniquecode"), false);
        if (measurableDeviceA == null) {
            LogUtil.j("SaveClaimWeightDataTask", "saveCloudData device is null");
            this.g.obtainMessage(5).sendToTarget();
            return;
        }
        for (eby ebyVar : arrayListD) {
            String address = ebyVar.getAddress();
            if (address != null && address.equals(measurableDeviceA.getAddress())) {
                d(hiHealthDataA, measurableDeviceA.getUniqueId(), measurableDeviceA.getProductId(), ebyVar.e());
                return;
            }
        }
        LogUtil.a("SaveClaimWeightDataTask", "saveCloudData device address no wifi device");
        this.g.obtainMessage(5).sendToTarget();
    }

    @Override // java.lang.Runnable
    public void run() {
        e eVar = this.g;
        if (eVar == null) {
            LogUtil.j("SaveClaimWeightDataTask", "run mHandler is null");
        } else {
            eVar.obtainMessage(8).sendToTarget();
        }
    }

    public static ArrayList<HiTimeInterval> c(ArrayList<eau> arrayList) {
        ArrayList<HiTimeInterval> arrayList2 = new ArrayList<>(16);
        if (arrayList == null) {
            LogUtil.j("SaveClaimWeightDataTask", "getDeleteData dataBeans is null");
            return arrayList2;
        }
        LogUtil.a("SaveClaimWeightDataTask", "getDeleteData in Data size:", Integer.valueOf(arrayList.size()));
        for (eau eauVar : arrayList) {
            HiTimeInterval hiTimeInterval = new HiTimeInterval();
            hiTimeInterval.setStartTime(eauVar.a().getStartTime());
            hiTimeInterval.setEndTime(eauVar.a().getEndTime());
            arrayList2.add(hiTimeInterval);
        }
        return arrayList2;
    }

    public static void b(List<HiTimeInterval> list, HiDataOperateListener hiDataOperateListener) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(list);
        hiDataDeleteOption.setTypes(c());
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthData(hiDataDeleteOption, hiDataOperateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (njy.e(this.f32638a)) {
            LogUtil.j("SaveClaimWeightDataTask", "saveData mBeans is null or empty");
            return;
        }
        HashSet<String> hashSet = new HashSet(16);
        Iterator<eau> it = this.f32638a.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a().getDeviceUuid());
        }
        if (njy.e(hashSet)) {
            LogUtil.j("SaveClaimWeightDataTask", "saveData deviceUuids is null or empty");
            return;
        }
        for (String str : hashSet) {
            ArrayList arrayList = new ArrayList(16);
            for (eau eauVar : this.f32638a) {
                if (str.equals(eauVar.a().getDeviceUuid())) {
                    arrayList.add(eauVar.a());
                }
            }
            b(arrayList, hashSet.size());
        }
    }

    private void b(List<HiHealthData> list, final int i) {
        if (njy.e(list)) {
            LogUtil.j("SaveClaimWeightDataTask", "saveClaimWeightData hiHealthData is null or empty");
        } else {
            new eaw(this.f32640c, new WeightInsertStatusCallback() { // from class: eaz.3
                @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
                public void isSuccess(boolean z) {
                    LogUtil.a("SaveClaimWeightDataTask", "saveClaimWeightData WiFiWeightSaveHandler isSuccess,", Boolean.valueOf(z));
                    if (eaz.this.f32639b != null) {
                        synchronized (eaz.d) {
                            eaz.j(eaz.this);
                            if (eaz.this.j == i) {
                                eaz.this.f32639b.isSuccess(z);
                                eaz.this.j = 0;
                            }
                        }
                        return;
                    }
                    LogUtil.j("SaveClaimWeightDataTask", "saveClaimWeightData mCallback is null");
                }
            }).c(list);
        }
    }
}
