package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f40653b;
    private Map<String, Object> e;

    public Map<String, Object> d() {
        return this.e;
    }

    public void a(Map<String, Object> map) {
        this.e = map;
    }

    public void d(double d) {
        this.f40653b = d;
    }

    public double a() {
        return this.f40653b;
    }

    public void a(int i) {
        this.f40652a = i;
    }

    public int c() {
        return this.f40652a;
    }

    public String toString() {
        return "AtmosphereInfo{pressure=" + this.f40653b + ", pressureUnit=" + this.f40652a + ", hagReportBiMap=" + this.e + '}';
    }
}
