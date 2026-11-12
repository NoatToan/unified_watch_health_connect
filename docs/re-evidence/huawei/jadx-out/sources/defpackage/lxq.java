package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lxq {
    private static boolean d = false;

    public static void a(boolean z) {
        LogUtil.a("StressUtil", "StressUtil setIsManualSync isSync = ", Boolean.valueOf(z));
        d = z;
    }
}
