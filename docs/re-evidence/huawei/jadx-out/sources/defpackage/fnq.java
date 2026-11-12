package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fnq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f34276b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE"};
    private static final String[] e = {"android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE"};

    public static boolean c(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.e("Login_PermissionCheck", e2.getMessage());
        }
    }

    public static boolean c() {
        try {
            Class<?> cls = Class.forName("android.telephony.HwTelephonyManager");
            Field declaredField = cls.getDeclaredField("SUPPORT_SYSTEMAPP_GET_DEVICEID");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField.getInt(cls) == 1;
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException e2) {
            LogUtil.e("Login_PermissionCheck", "supportNewPermissionCheck", e2.getMessage());
        }
        return false;
    }

    public static boolean e() {
        ReflectiveOperationException reflectiveOperationException;
        String str;
        String str2;
        String str3 = "";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            Object objInvoke = declaredMethod.invoke(cls.newInstance(), "ro.product.locale.language");
            str2 = objInvoke instanceof String ? (String) objInvoke : "";
            try {
                LogUtil.d("Login_PermissionCheck", "isChinaRom: langObject ", objInvoke);
                Object objInvoke2 = declaredMethod.invoke(cls.newInstance(), "ro.product.locale.region");
                str3 = objInvoke2 instanceof String ? (String) objInvoke2 : "";
                LogUtil.d("Login_PermissionCheck", "isChinaRom: regionObject ", objInvoke2);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                reflectiveOperationException = e2;
                str = str3;
                str3 = str2;
                LogUtil.e("Login_PermissionCheck", "isChinaRom", reflectiveOperationException.getMessage());
                str2 = str3;
                str3 = str;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
            reflectiveOperationException = e3;
            str = "";
        }
        return MLAsrConstants.LAN_ZH.equalsIgnoreCase(str2) && "cn".equalsIgnoreCase(str3);
    }

    public static boolean a() {
        if (PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.READ_PHONE_STATE"})) {
            return false;
        }
        return d(tfn.a().k());
    }

    private static boolean d(List<DeviceInfo> list) {
        if (list == null) {
            return false;
        }
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && deviceInfo.getDeviceBluetoothType() == 2) {
                return true;
            }
        }
        return false;
    }

    public static String[] c(boolean z) {
        if (z) {
            return (String[]) f34276b.clone();
        }
        return (String[]) e.clone();
    }
}
