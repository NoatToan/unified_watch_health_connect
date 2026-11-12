package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42718c;
    private long d;
    private long e;
    private List<myx> h;

    public long a() {
        return this.e;
    }

    public void c(long j) {
        this.e = j;
    }

    public long b() {
        return this.d;
    }

    public void b(long j) {
        this.d = j;
    }

    public void d(int i) {
        this.f42718c = i;
    }

    public void e(int i) {
        this.f42717b = i;
    }

    public List<myx> c() {
        return this.h;
    }

    public void a(List<myx> list) {
        this.h = list;
    }

    public int d() {
        return this.f42716a;
    }

    public void c(int i) {
        this.f42716a = i;
    }

    public String toString() {
        return "BloodOxygenDownRemindStruct{mBloodOxygenDownRemindStartTime=" + this.e + ", mBloodOxygenDownRemindEndTime=" + this.d + ", mBloodOxygenDownRemindMinNumber=" + this.f42718c + ", mBloodOxygenDownRemindMaxNumber=" + this.f42717b + ", mBloodOxygenDownValueStructs=" + this.h + ", mBloodOxygenDownThresholdNumber=" + this.f42716a + '}';
    }
}
