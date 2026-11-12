package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;

/* JADX INFO: loaded from: classes11.dex */
public class mqg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f42174b;
    private long d;
    private int f;
    private int h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42175c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42173a = 0;
    private int e = 0;

    public int j() {
        return this.f;
    }

    public void f(int i) {
        this.f = i;
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.f42175c))).intValue();
    }

    public void h(int i) {
        this.f42175c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void a(int i) {
        this.f42175c += i;
    }

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.f42173a))).intValue();
    }

    public void c(int i) {
        this.f42173a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void d(int i) {
        this.f42173a += i;
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void e(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void b(int i) {
        this.e += i;
    }

    public long a() {
        return ((Long) lst.d(Long.valueOf(this.d))).longValue();
    }

    public void e(long j) {
        this.d = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public DeviceInfo e() {
        return this.f42174b;
    }

    public void a(DeviceInfo deviceInfo) {
        this.f42174b = deviceInfo;
    }

    public String toString() {
        return "LastTotalValue{sportType=" + this.h + ", lastTotalSteps=" + this.f42175c + ", lastTotalCalories=" + this.f42173a + ", lastTotalDistance=" + this.e + ", lastTimeStamp=" + this.d + '}';
    }
}
