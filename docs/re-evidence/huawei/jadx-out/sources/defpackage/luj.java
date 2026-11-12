package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
class luj {
    luj() {
    }

    public void a() {
        b(d());
        LogUtil.a("AutoSetUp", "execute auto_send_command. end");
    }

    private DeviceInfo d() {
        DeviceInfo deviceInfoD = mgg.d("AutoSetUp");
        return deviceInfoD != null ? deviceInfoD : mgi.d("AutoSetUp");
    }

    private void b(DeviceInfo deviceInfo) {
        if (mgq.b()) {
            mfe.d().d(deviceInfo);
            lzi.a().e(deviceInfo);
            mfd.a().d(deviceInfo);
            mes.b().a(deviceInfo);
            mev.d().e(deviceInfo);
            lvu.b().c(deviceInfo);
            lvx.d().c(deviceInfo);
        }
    }
}
