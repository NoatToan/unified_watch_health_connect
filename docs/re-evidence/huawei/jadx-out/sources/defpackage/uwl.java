package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes19.dex */
public class uwl {
    public static uwh c(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("HealthDataInteractorUtil", "data is null");
            return null;
        }
        long endTime = hiHealthData.getEndTime();
        int type = hiHealthData.getType();
        double dDoubleValue = new BigDecimal(String.valueOf(hiHealthData.getDouble("point_value"))).setScale(1, RoundingMode.HALF_UP).doubleValue();
        uwh uwhVar = new uwh();
        uwhVar.e(endTime);
        uwhVar.b(hiHealthData.getModifiedTime());
        uwhVar.c(type);
        uwhVar.e(dDoubleValue);
        uwhVar.b(hiHealthData.getDouble("point_value"));
        uwhVar.c(hiHealthData.getMetaData());
        uwhVar.c(hiHealthData.getInt("trackdata_deviceType"));
        uwhVar.b(hiHealthData.getString("device_uniquecode"));
        uwhVar.d(hiHealthData.getClientId());
        LogUtil.d("HealthDataInteractorUtil", "bloodsugarData.time = ", Long.valueOf(uwhVar.g()));
        LogUtil.d("HealthDataInteractorUtil", "bloodsugarData.value1 = ", Double.valueOf(uwhVar.m()));
        LogUtil.d("HealthDataInteractorUtil", "bloodsugarData.value2 = ", Double.valueOf(uwhVar.o()));
        LogUtil.d("HealthDataInteractorUtil", "bloodsugarData.value3 = ", Double.valueOf(uwhVar.l()));
        return uwhVar;
    }

    public static uwh d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("HealthDataInteractorUtil", "hiHealthData is null");
            return null;
        }
        LogUtil.d("HealthDataInteractorUtil", "addWeightData");
        uwh uwhVar = new uwh();
        uwhVar.e(hiHealthData.getStartTime());
        uwhVar.c(hiHealthData.getDouble("bodyWeight"));
        uwhVar.e(hiHealthData.getDouble(BleConstants.BODY_FAT_RATE));
        LogUtil.a("HealthDataInteractorUtil", Integer.valueOf(hiHealthData.getInt("trackdata_deviceType")));
        uwhVar.a(hiHealthData.getInt("trackdata_deviceType"));
        uwhVar.g(hiHealthData.getDouble(BleConstants.BMI));
        uwhVar.f(hiHealthData.getDouble(BleConstants.BASAL_METABOLISM));
        uwhVar.h(hiHealthData.getDouble(BleConstants.BODY_SCORE));
        uwhVar.i(hiHealthData.getDouble(BleConstants.BONE_SALT));
        uwhVar.n(hiHealthData.getDouble(BleConstants.MOISTURE));
        uwhVar.k(hiHealthData.getDouble(BleConstants.MOISTURE_RATE));
        uwhVar.l(hiHealthData.getDouble(BleConstants.MUSCLE_MASS));
        uwhVar.j(hiHealthData.getDouble(BleConstants.VISCERAL_FAT_LEVEL));
        uwhVar.o(etn.a(hiHealthData));
        return uwhVar;
    }
}
