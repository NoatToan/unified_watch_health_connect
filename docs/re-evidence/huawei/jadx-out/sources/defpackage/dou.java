package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32165a;
    private long d;
    private List<Integer> e;

    public long a() {
        return ((Long) lst.d(Long.valueOf(this.f32165a))).longValue();
    }

    public void e(long j) {
        this.f32165a = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long c() {
        return ((Long) lst.d(Long.valueOf(this.d))).longValue();
    }

    public void d(long j) {
        this.d = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public List<Integer> b() {
        return (List) lst.d(this.e);
    }

    public void e(List<Integer> list) {
        this.e = (List) lst.d(list);
    }
}
