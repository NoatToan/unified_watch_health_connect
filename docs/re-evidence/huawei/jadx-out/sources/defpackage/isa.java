package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes9.dex */
public class isa {
    public static boolean d() {
        return !e();
    }

    public static boolean e() {
        return (a() && VersionControlUtil.isSupportOperationAccount()) ? false : true;
    }

    public static boolean a() {
        if (!Utils.o()) {
            return true;
        }
        boolean zB = pjg.b("1");
        boolean zB2 = pjg.b("3");
        LogUtil.a("VipPageABTestUtil", "isShowVipTab functionMeVip is ", Boolean.valueOf(zB), "functionVipTab is ", Boolean.valueOf(zB2));
        return zB && zB2;
    }
}
