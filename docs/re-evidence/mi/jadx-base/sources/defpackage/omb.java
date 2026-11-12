package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.miui.circulate.api.protocol.headset.HeadsetDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.miui.headset.api.HeadsetHost;
import com.miui.headset.api.HeadsetInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class omb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile omb f29293b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, HeadsetDeviceInfo> f29294a = new ConcurrentHashMap();

    public static omb f() {
        if (f29293b == null) {
            synchronized (omb.class) {
                try {
                    if (f29293b == null) {
                        f29293b = new omb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29293b;
    }

    public void a(HeadsetDeviceInfo headsetDeviceInfo) {
        if (headsetDeviceInfo == null) {
            return;
        }
        tpe.f("HeadsetDeviceManager", "add bluetooth deivce, name=" + headsetDeviceInfo.c);
        this.f29294a.put(headsetDeviceInfo.f10300b, headsetDeviceInfo);
    }

    public void b() {
        this.f29294a.clear();
    }

    public final int c(int i) {
        int i2 = -1;
        if (i != -1) {
            i2 = 2;
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? -2 : 1;
                }
                return 0;
            }
        }
        return i2;
    }

    public HeadsetDeviceInfo d(HeadsetHost headsetHost, Context context) {
        if (headsetHost == null || headsetHost.getHeadsetInfo() == null) {
            return null;
        }
        HeadsetInfo headsetInfo = headsetHost.getHeadsetInfo();
        HeadsetDeviceInfo headsetDeviceInfo = new HeadsetDeviceInfo();
        headsetDeviceInfo.c = headsetInfo.getName();
        headsetDeviceInfo.f10300b = headsetInfo.getAddress();
        headsetDeviceInfo.f10299a = headsetInfo.getAddress();
        headsetDeviceInfo.e = headsetInfo.getVolume();
        headsetDeviceInfo.f = headsetInfo.getPowers();
        headsetDeviceInfo.h = c(headsetInfo.getMode());
        headsetDeviceInfo.i = false;
        headsetDeviceInfo.d = headsetInfo.getDeviceId();
        if (!headsetHost.getHostId().equals("local_device_id") || context == null) {
            headsetDeviceInfo.g = false;
        } else {
            headsetDeviceInfo.g = t33.a(context);
        }
        tpe.f("HeadsetDeviceManager", "convert to BluetoothDevice, result: " + headsetDeviceInfo);
        return headsetDeviceInfo;
    }

    public CirculateServiceInfo e(HeadsetInfo headsetInfo, hyc hycVar) {
        CirculateServiceInfo circulateServiceInfoA = CirculateServiceInfo.a(393216);
        if (headsetInfo != null) {
            tpe.f("HeadsetDeviceManager", "convert to BluetoothService, empty HeadsetInfo");
            circulateServiceInfoA.f10304a = headsetInfo.getAddress();
            circulateServiceInfoA.d = 2;
            circulateServiceInfoA.g(headsetInfo.getDeviceId());
        } else {
            circulateServiceInfoA.d = 0;
        }
        circulateServiceInfoA.h(hycVar);
        return circulateServiceInfoA;
    }

    public HeadsetDeviceInfo g(String str) {
        if (TextUtils.isEmpty(str) || !this.f29294a.containsKey(str)) {
            return null;
        }
        return this.f29294a.get(str);
    }

    public void h(HeadsetDeviceInfo headsetDeviceInfo) {
        if (headsetDeviceInfo == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("remove bluetooth device, name=");
        sb.append(headsetDeviceInfo.c);
        sb.append(tpe.e(", id=" + headsetDeviceInfo.f10300b));
        tpe.f("HeadsetDeviceManager", sb.toString());
        this.f29294a.remove(headsetDeviceInfo.f10300b);
    }
}
