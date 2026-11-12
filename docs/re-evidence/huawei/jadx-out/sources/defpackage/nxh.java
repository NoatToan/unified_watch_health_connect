package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes12.dex */
public class nxh extends nxd {
    @Override // defpackage.nxd, com.huawei.health.device.base.AbstractFitnessClient
    public void connectByMac(boolean z, String str) {
        LogUtil.a("Track_IDEQ_BackgroundFitnessClient", "mac connectByMac:address", str);
        this.f43878a = str;
        try {
            this.f43879c = this.d.getRemoteDevice(str);
            a(this.f43879c);
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.a("Track_IDEQ_BackgroundFitnessClient", "mac IllegalArgumentException");
        }
    }
}
