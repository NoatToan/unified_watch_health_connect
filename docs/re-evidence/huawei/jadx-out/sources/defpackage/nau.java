package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class nau {
    private nap e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42839c = 0;

    /* JADX INFO: loaded from: classes11.dex */
    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final nau f42840b = new nau();
    }

    public void a(int i) {
        this.f42839c = i;
    }

    public static nau c() {
        return c.f42840b;
    }

    public void a() {
        this.e = new nap();
    }

    public void e() {
        edc.e().registerDeviceSampleListener("hw.sport.linkage.app", this.e);
        ReleaseLogUtil.d("LINKAGE_ReverseLinkageManager", "register linkage success.");
    }

    public void c(LinkageDeviceCommandListener linkageDeviceCommandListener) {
        nap napVar = this.e;
        if (napVar == null) {
            ReleaseLogUtil.d("R_LINKAGE_ReverseLinkageManager", "registerDeviceCommandListener mLinkageEventChannel null");
        } else {
            napVar.d(linkageDeviceCommandListener);
        }
    }

    public void e(IBaseCallback iBaseCallback) {
        LogUtil.a("LINKAGE_ReverseLinkageManager", "registerLinkageDeviceDataListener: ", iBaseCallback);
        nap napVar = this.e;
        if (napVar == null) {
            ReleaseLogUtil.d("R_LINKAGE_ReverseLinkageManager", "registerDeviceCommandListener mLinkageEventChannel null");
        } else {
            napVar.d(iBaseCallback);
        }
    }

    public void b(DeviceInfo deviceInfo, int i) {
        nap napVar = this.e;
        if (napVar == null) {
            ReleaseLogUtil.d("R_LINKAGE_ReverseLinkageManager", "sendSampleEventToDevice mLinkageEventChannel null");
        } else {
            napVar.d(deviceInfo, i, this.f42839c);
        }
    }

    public void b(DeviceInfo deviceInfo, int i, String str) {
        nap napVar = this.e;
        if (napVar == null) {
            ReleaseLogUtil.d("R_LINKAGE_ReverseLinkageManager", "replySampleEventToDevice mLinkageEventChannel null");
        } else {
            napVar.e(deviceInfo, i, str, this.f42839c);
        }
    }
}
