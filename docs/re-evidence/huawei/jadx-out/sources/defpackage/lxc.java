package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class lxc {
    public static boolean e() {
        DeviceInfo deviceInfoD = mgg.d("DeviceFamilyModeUtils");
        if (deviceInfoD == null) {
            LogUtil.j("DeviceFamilyModeUtils", "isSupportFamilyModeHeart deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 49);
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceFamilyModeUtils", "isSupportFamilyModeHeart deviceIdentify is empty");
            return false;
        }
        DeviceInfo deviceInfoC = mgg.c(str, "DeviceFamilyModeUtils");
        if (deviceInfoC == null) {
            LogUtil.j("DeviceFamilyModeUtils", "isSupportFamilyModeHeart target deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoC, 49);
    }

    public static boolean c() {
        DeviceInfo deviceInfoD = mgg.d("DeviceFamilyModeUtils");
        if (deviceInfoD == null) {
            LogUtil.j("DeviceFamilyModeUtils", "isSupportFamilyModeUserInfo deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 48);
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceFamilyModeUtils", "isSupportFamilyModeUserInfo deviceIdentify is empty");
            return false;
        }
        DeviceInfo deviceInfoC = mgg.c(str, "DeviceFamilyModeUtils");
        if (deviceInfoC == null) {
            LogUtil.j("DeviceFamilyModeUtils", "isSupportFamilyModeUserInfo target deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoC, 48);
    }

    public static boolean a(String str) {
        return mgb.d(str) == 2;
    }

    public static void e(int i, UserInfomation userInfomation) {
        LogUtil.a("DeviceFamilyModeUtils", "Enter saveStudentInfoToStorage.");
        if (userInfomation == null) {
            LogUtil.j("DeviceFamilyModeUtils", "saveStudentInfoToStorage userInformation is null.");
            return;
        }
        LogUtil.d("DeviceFamilyModeUtils", "Enter saveStudentInfoToStorage userInformation = ", userInfomation.toString());
        if (i == 1) {
            d(userInfomation.getGender());
            return;
        }
        if (i == 2) {
            e(userInfomation.getBirthday());
            a(userInfomation.getAge());
        } else if (i == 3) {
            e(userInfomation.getHeight());
        } else if (i == 4) {
            c(userInfomation.getWeight());
        } else {
            LogUtil.j("DeviceFamilyModeUtils", "saveStudentInfoToStorage studentInfoType is unknown.");
        }
    }

    public static void c(UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("DeviceFamilyModeUtils", "saveStudentInfoToStorage userInformation is null.");
            return;
        }
        d(userInfomation.getGender());
        e(userInfomation.getBirthday());
        e(userInfomation.getHeight());
        c(userInfomation.getWeight());
        a(userInfomation.getAge());
    }

    public static UserInfomation b() throws Throwable {
        LogUtil.a("DeviceFamilyModeUtils", "Enter queryStudentInfoFromStorage.");
        UserInfomation userInfomation = new UserInfomation(0);
        String strB = KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_gender_key", new StorageParams(1));
        if (!TextUtils.isEmpty(strB)) {
            userInfomation.setGender(Integer.valueOf(CommonUtil.b(strB, 10)));
        }
        String strB2 = KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_birthday_key", new StorageParams(1));
        if (!TextUtils.isEmpty(strB2)) {
            userInfomation.setBirthday(strB2);
        }
        String strB3 = KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_height_key", new StorageParams(1));
        if (!TextUtils.isEmpty(strB3)) {
            userInfomation.setHeight(CommonUtil.b(strB3, 10));
        }
        String strB4 = KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_weight_key", new StorageParams(1));
        if (!TextUtils.isEmpty(strB4)) {
            try {
                userInfomation.setWeight(Float.parseFloat(strB4));
                return userInfomation;
            } catch (NumberFormatException unused) {
                LogUtil.e("DeviceFamilyModeUtils", "queryStudentInfoFromStorage NumberFormatException.");
            }
        }
        return userInfomation;
    }

    private static void d(int i) {
        KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_gender_key", String.valueOf(i), new StorageParams(1));
    }

    private static void e(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_birthday_key", str, new StorageParams(1));
    }

    private static void e(int i) {
        KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_height_key", String.valueOf(i), new StorageParams(1));
    }

    private static void c(float f) {
        KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_weight_key", String.valueOf(f), new StorageParams(1));
    }

    public static void a(int i) {
        KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_age_key", String.valueOf(i), new StorageParams(1));
    }

    public static void a() {
        ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).resetHeartZoneData();
        d();
    }

    public static void d() {
        ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getStudentHeartRateData().setStudentHeartDataToSp();
    }
}
