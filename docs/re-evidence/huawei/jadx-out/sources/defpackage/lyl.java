package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;

/* JADX INFO: loaded from: classes10.dex */
public class lyl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41125b;
    private DeviceInfo d;
    private int j;
    private int i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41126c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41124a = 0;
    private int e = 0;

    public int i() {
        return this.j;
    }

    public void h(int i) {
        this.j = i;
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.f41126c))).intValue();
    }

    public void i(int i) {
        this.f41126c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void c(int i) {
        this.f41126c += i;
    }

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.f41124a))).intValue();
    }

    public void a(int i) {
        this.f41124a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void e(int i) {
        this.f41124a += i;
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void b(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void d(int i) {
        this.e += i;
    }

    public long a() {
        return ((Long) lst.d(Long.valueOf(this.f41125b))).longValue();
    }

    public void b(long j) {
        this.f41125b = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public DeviceInfo e() {
        return this.d;
    }

    public void b(DeviceInfo deviceInfo) {
        this.d = deviceInfo;
    }

    public String toString() {
        return "LastTotalValue{sportType=" + this.i + ", lastTotalSteps=" + this.f41126c + ", lastTotalCalories=" + this.f41124a + ", lastTotalDistance=" + this.e + ", lastTimeStamp=" + this.f41125b + '}';
    }
}
