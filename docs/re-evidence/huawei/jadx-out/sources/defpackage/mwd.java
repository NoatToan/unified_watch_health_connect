package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class mwd extends Handler {
    private WeakReference<mvx> d;

    mwd(mvx mvxVar) {
        this.d = new WeakReference<>(mvxVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            LogUtil.j("HwGpsMgrHandler", "message is null");
            return;
        }
        super.handleMessage(message);
        mvx mvxVar = this.d.get();
        if (mvxVar == null) {
            LogUtil.j("HwGpsMgrHandler", "hwGpsLocationManager is null");
            return;
        }
        LogUtil.a("HwGpsMgrHandler", "handleMessage message ", Integer.valueOf(message.what));
        int i = message.what;
        if (i == 1) {
            mvxVar.j();
            return;
        }
        if (i == 2) {
            if (message.obj instanceof DeviceInfo) {
                mvxVar.c((DeviceInfo) message.obj);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                LogUtil.j("HwGpsMgrHandler", "handleMessage default");
                return;
            } else {
                mvxVar.g();
                mvxVar.a();
                return;
            }
        }
        int i2 = message.arg1;
        if (i2 == 1) {
            mvu.a().e();
        } else if (i2 != 0) {
            LogUtil.j("HwGpsMgrHandler", "handleMessage() unknown status");
        } else {
            mvu.a().c();
        }
    }
}
