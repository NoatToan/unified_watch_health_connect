package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes10.dex */
public class mfz {
    public static void d(int i, boolean z) {
        LogUtil.a("ContainAppLogUtil", "settingContainAppLog type= ", Integer.valueOf(i), ",isContain=", Boolean.valueOf(z));
        SharedPreferenceManager.a(String.valueOf(10), "contain_app_log", z);
    }
}
