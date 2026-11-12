package defpackage;

import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class mgq {
    public static int a() {
        String string = Settings.System.getString(BaseApplication.getContext().getContentResolver(), "time_12_24");
        LogUtil.a("SettingUtil", "getSystemTimeFormat() timeFormat :", string);
        if (string != null) {
            return "24".equals(string) ? 2 : 1;
        }
        boolean zIs24HourFormat = DateFormat.is24HourFormat(BaseApplication.getContext());
        LogUtil.a("SettingUtil", "getSystemTimeFormat() is24HourFormat :", Boolean.valueOf(zIs24HourFormat));
        return zIs24HourFormat ? 2 : 1;
    }

    public static int e() {
        String string = Settings.System.getString(BaseApplication.getContext().getContentResolver(), "date_format");
        LogUtil.a("SettingUtil", "getSystemDateFormat() dateFormat :", string);
        if (string == null || string.length() < 2 || "yy".equals(string.substring(0, 2))) {
            return 1;
        }
        if ("MM".equals(string.substring(0, 2))) {
            return 2;
        }
        if ("dd".equals(string.substring(0, 2))) {
            return 3;
        }
        LogUtil.a("SettingUtil", "getSystemDateFormat other dataType");
        return 1;
    }

    public static boolean b() {
        if (!Utils.h()) {
            return true;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).getIsLogined() && d()) {
            return true;
        }
        LogUtil.a("SettingUtil", "no login return.");
        return false;
    }

    private static boolean d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        return !TextUtils.isEmpty(accountInfo) && HiHealthManager.d(BaseApplication.getContext()).checkHiHealthLogin(accountInfo);
    }
}
