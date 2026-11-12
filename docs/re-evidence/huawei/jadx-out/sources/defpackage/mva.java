package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<mvb> f42479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42480b;
    private DeviceInfo d;

    public int a() {
        return this.f42480b;
    }

    public void e(int i) {
        this.f42480b = i;
    }

    public DeviceInfo e() {
        return this.d;
    }

    public void e(DeviceInfo deviceInfo) {
        this.d = deviceInfo;
    }

    public List<mvb> c() {
        return this.f42479a;
    }

    public void d(List<mvb> list) {
        this.f42479a = list;
    }

    public String toString() {
        return "{mDigitTypeId:" + this.f42480b + this.f42479a + "}";
    }
}
