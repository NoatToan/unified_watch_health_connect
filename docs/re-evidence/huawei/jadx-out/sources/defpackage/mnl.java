package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class mnl implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mnl f41998c;
    private static final Object d = new Object();

    private mnl() {
    }

    public static mnl d() {
        mnl mnlVar;
        synchronized (d) {
            LogUtil.a("HwFileServicesManagerQueue", "getInstance() instance = ", f41998c);
            if (f41998c == null) {
                f41998c = new mnl();
            }
            mnlVar = f41998c;
        }
        return mnlVar;
    }

    private static void e() {
        synchronized (d) {
            f41998c = null;
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwFileServicesManagerQueue", "getResult.");
        mnk.e().b(bArr, deviceInfo);
    }

    public void a() {
        mnk.e().c();
        e();
    }
}
