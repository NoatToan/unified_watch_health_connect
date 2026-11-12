package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiDeviceInfo;
import health.compact.a.util.LogUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class lkv {
    private static boolean d(String str) {
        return str != null;
    }

    public static boolean a(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo == null) {
            return false;
        }
        boolean zD = d(hiDeviceInfo.getDeviceUniqueCode());
        if (e(hiDeviceInfo.getSubProdId())) {
            return zD;
        }
        LogUtil.a("HiH_HiDeviceValid", "the subProdId is invalid:", hiDeviceInfo.getSubProdId());
        return false;
    }

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.length() != 2) {
            return false;
        }
        return Pattern.compile("[0-9A-Fa-f]{2}").matcher(str).find();
    }
}
