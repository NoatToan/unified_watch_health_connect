package defpackage;

import health.compact.a.UnitUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vqn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f51467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51468b;
    private Map<String, Double> d;

    public vqn() {
        this.d = new HashMap();
        this.f51467a = 0L;
    }

    public vqn(Map<String, Double> map, int i, long j) {
        new HashMap();
        this.d = map;
        this.f51468b = i;
        this.f51467a = j;
    }

    public void b(Map<String, Double> map) {
        this.d = map;
    }

    public Map<String, Double> a() {
        return this.d;
    }

    public int e() {
        return this.f51468b;
    }

    public void c(int i) {
        this.f51468b = i;
    }

    public long c() {
        return this.f51467a;
    }

    public void d(long j) {
        this.f51467a = j;
    }

    public String b() {
        return UnitUtil.a(new Date(this.f51467a), 52);
    }

    public boolean d() {
        Map<String, Double> map = this.d;
        return map == null || map.isEmpty();
    }
}
