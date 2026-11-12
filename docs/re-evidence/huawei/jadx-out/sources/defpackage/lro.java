package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.BadParcelableException;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lro {
    public static boolean d() {
        LogUtil.a("DeviceCapabilityUtils", "isSupportFloor enter");
        Object systemService = BaseApplication.getContext().getApplicationContext().getSystemService("sensor");
        try {
            if (systemService instanceof SensorManager) {
                if (((SensorManager) systemService).getDefaultSensor(6) == null) {
                    LogUtil.j("DeviceCapabilityUtils", "isSupportFloor is false");
                    return false;
                }
                LogUtil.a("DeviceCapabilityUtils", "isSupportFloor is true");
                return true;
            }
        } catch (BadParcelableException unused) {
            LogUtil.e("DeviceCapabilityUtils", "isSupportFloor exceptionTwo");
        } catch (ClassCastException unused2) {
            LogUtil.e("DeviceCapabilityUtils", "isSupportFloor exceptionOne");
        }
        LogUtil.j("DeviceCapabilityUtils", "object can not cast to SensorManager");
        return false;
    }

    public static boolean d(Context context) {
        SensorManager sensorManager;
        if (context == null) {
            LogUtil.j("DeviceCapabilityUtils", "isSupportStandStepCounter context is null");
            return false;
        }
        Object systemService = context.getSystemService("sensor");
        try {
            sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        } catch (BadParcelableException unused) {
            LogUtil.e("DeviceCapabilityUtils", "isSupportStandStepCounter exceptionTwo");
        } catch (ClassCastException unused2) {
            LogUtil.e("DeviceCapabilityUtils", "isSupportStandStepCounter exceptionOne");
        }
        if (sensorManager != null && sensorManager.getDefaultSensor(19) != null) {
            LogUtil.a("DeviceCapabilityUtils", "supportStandStepCounter true");
            return true;
        }
        LogUtil.a("supportStandStepCounter", "supportStandStepCounter false");
        return false;
    }
}
