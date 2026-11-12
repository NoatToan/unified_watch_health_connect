package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
class mhq {
    mhq() {
    }

    public static void d(String str, String str2, int i) {
        ReleaseLogUtil.d("DEVMGR_SwitchLocalStorageUtil", "setSwitchSettingToLocal switchKey = ", str, ",switchSetting = ", str2);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwitchLocalStorageUtil", "setSwitchSettingToLocal switchKey is null");
        } else {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(i), str, str2, new StorageParams(0));
        }
    }

    public static String b(String str, int i) {
        ReleaseLogUtil.d("DEVMGR_SwitchLocalStorageUtil", "getSwitchSettingFromLocal switchKey = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwitchLocalStorageUtil", "getSwitchSettingFromLocal switchKey is null");
            return "";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(i), str);
        ReleaseLogUtil.d("DEVMGR_SwitchLocalStorageUtil", "getSwitchSettingFromLocal switchSetting = ", strE);
        return strE;
    }

    public static void e(String str, String str2) {
        ReleaseLogUtil.d("DEVMGR_SwitchLocalStorageUtil", "setSwitchSettingToDb switchKey = ", str, ",switchSetting = ", CommonUtil.n(str2));
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwitchLocalStorageUtil", "setSwitchSettingToDb switchKey is null");
        } else {
            KeyValDbManager.d(BaseApplication.getContext()).b(str, str2);
        }
    }

    public static String c(String str) {
        ReleaseLogUtil.d("DEVMGR_SwitchLocalStorageUtil", "getSwitchSettingFromDb switchKey = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwitchLocalStorageUtil", "getSwitchSettingFromDb switchKey is null");
            return "";
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c(str);
        ReleaseLogUtil.d("DEVMGR_SwitchLocalStorageUtil", "getSwitchSettingFromDb switchSetting = ", CommonUtil.n(strC));
        return strC;
    }
}
