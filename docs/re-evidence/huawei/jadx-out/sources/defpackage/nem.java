package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f43001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f43002b;
    private volatile boolean e;

    private nem() {
        this.e = true;
        this.f43002b = new d();
    }

    public boolean c() {
        return this.e;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        this.f43001a = iBaseResponseCallback;
    }

    public void d(List<DeviceInfo> list) {
        if (!list.isEmpty() || ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isNoneHonourAm16BondedDevice()) {
            return;
        }
        this.e = true;
        this.f43002b.sendEmptyMessageDelayed(2, 30000L);
    }

    public void e(int i) {
        this.f43002b.removeMessages(i);
    }

    public static nem d() {
        return a.f43003b;
    }

    /* JADX INFO: loaded from: classes11.dex */
    public class d extends Handler {
        public d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("RamOptimizationManager", "ProcessKillHandler get msg:", Integer.valueOf(message.what));
            if (message.what == 2) {
                if (nem.this.f43001a != null) {
                    nem.this.f43001a.a(2, "no device");
                    return;
                }
                return;
            }
            LogUtil.d("RamOptimizationManager", "handle other branches");
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static nem f43003b = new nem();
    }
}
