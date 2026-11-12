package defpackage;

import com.huawei.devicesdk.callback.FrameReceiver;
import com.huawei.devicesdk.entity.DeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public class cmn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameReceiver f1788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1789c;
    private cmm d;
    private DeviceInfo e;
    private long f;

    public cmn(FrameReceiver frameReceiver, DeviceInfo deviceInfo, cmm cmmVar, int i) {
        this.f1788b = frameReceiver;
        this.e = deviceInfo;
        this.d = cmmVar;
        this.f1789c = i;
    }

    public void d(long j, int i) {
        this.f = j;
        this.f1787a = i;
    }

    public long g() {
        return this.f;
    }

    public int d() {
        return this.f1787a;
    }

    public FrameReceiver c() {
        return this.f1788b;
    }

    public DeviceInfo b() {
        return this.e;
    }

    public cmm e() {
        return this.d;
    }

    public int a() {
        return this.f1789c;
    }
}
