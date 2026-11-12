package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lwg {
    private static volatile lwg d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40961a = new Object();
    private List<IBaseResponseCallback> e = new ArrayList(16);

    public static lwg d() {
        if (d == null) {
            synchronized (lwg.class) {
                if (d == null) {
                    d = new lwg();
                }
            }
        }
        return d;
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (this.f40961a) {
            if (!this.e.contains(iBaseResponseCallback)) {
                this.e.add(iBaseResponseCallback);
            }
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (this.f40961a) {
            this.e.remove(iBaseResponseCallback);
        }
    }

    public void a(String str) {
        synchronized (this.f40961a) {
            if (!njy.e(this.e)) {
                Iterator<IBaseResponseCallback> it = this.e.iterator();
                while (it.hasNext()) {
                    it.next().a(1, str);
                }
            }
        }
    }

    public boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeleteDeviceManager", "isUpdate, deviceId is null");
            return false;
        }
        DeviceInfo deviceInfoB = mgg.b(str, "DeleteDeviceManager");
        if (deviceInfoB == null || !((deviceInfoB.getDeviceConnectState() == 2 || deviceInfoB.getDeviceConnectState() == 1) && maq.b().c(str) == 6)) {
            return false;
        }
        LogUtil.j("DeleteDeviceManager", "Enter unbind ，device is OTAing");
        return true;
    }
}
