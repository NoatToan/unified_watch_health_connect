package defpackage;

import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes8.dex */
public class gyl {
    public static boolean d() {
        if (CommonUtil.bu()) {
            return true;
        }
        return SharedPreferenceManager.b(Integer.toString(CapabilityStatus.AWA_CAP_CODE_DARK_MODE), "share_level", true);
    }

    public static boolean e() {
        if (CommonUtil.bu()) {
            return true;
        }
        return SharedPreferenceManager.b(Integer.toString(CapabilityStatus.AWA_CAP_CODE_DARK_MODE), "share_medal", true);
    }
}
