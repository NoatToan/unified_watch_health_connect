package defpackage;

import android.os.IBinder;
import com.huawei.wearengine.core.device.VirtualDevice;
import com.huawei.wearengine.device.Device;

/* JADX INFO: loaded from: classes46.dex */
public class yix {
    private volatile VirtualDevice d;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final yix f53404b = new yix();
    }

    private yix() {
        this.d = new yjd();
    }

    public static yix b() {
        return a.f53404b;
    }

    public VirtualDevice[] a() {
        this.d.initModule();
        return new VirtualDevice[]{this.d};
    }

    public VirtualDevice e(Device device) {
        if (device == null || device.getProductType() != 0) {
            return null;
        }
        this.d.initModule();
        return this.d;
    }

    public void e(String str, IBinder iBinder) {
        yit.e("DevicePolicyManager", "setHiWearEngineService enter");
        this.d.setBinder(str, iBinder);
    }
}
