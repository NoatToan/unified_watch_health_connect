package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ncw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f42899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42901c;
    private long e;

    public long d() {
        return ((Long) lst.d(Long.valueOf(this.f42900b))).longValue();
    }

    public void b(long j) {
        this.f42900b = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long b() {
        return ((Long) lst.d(Long.valueOf(this.f42901c))).longValue();
    }

    public void c(long j) {
        this.f42901c = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public List<Integer> a() {
        return (List) lst.d(this.f42899a);
    }

    public void c(List<Integer> list) {
        this.f42899a = (List) lst.d(list);
    }

    public long c() {
        return ((Long) lst.d(Long.valueOf(this.e))).longValue();
    }

    public void e(long j) {
        this.e = ((Long) lst.d(Long.valueOf(j))).longValue();
    }
}
