package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qvm {
    public static String c(List<HiUserPreference> list, String str) {
        LogUtil.a("HeartRateUiUtils", "getSettingItem enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HeartRateUiUtils", "getSettingItem key is null");
            return null;
        }
        if (list == null) {
            LogUtil.j("HeartRateUiUtils", "getSettingItem userPreferenceList is null");
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            HiUserPreference hiUserPreference = list.get(i);
            if (hiUserPreference == null) {
                LogUtil.j("HeartRateUiUtils", "getSettingItem userPreference error");
            } else if (str.equals(hiUserPreference.getKey())) {
                LogUtil.a("HeartRateUiUtils", "userPreference is:", hiUserPreference.toString());
                return hiUserPreference.getValue();
            }
        }
        return null;
    }

    public static String b(int i) {
        String strE = UnitUtil.e(i, 1, 0);
        LogUtil.a("HeartRateUiUtils", "languageLocalNumber ", strE);
        return strE;
    }
}
