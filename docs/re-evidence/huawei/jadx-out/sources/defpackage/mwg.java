package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class mwg implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42561a;
    private long d = 0;
    private int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42562b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42563c = 0;
    private int f = 0;

    public long b() {
        return this.d;
    }

    public void a(long j) {
        this.d = j;
    }

    public int e() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public int c() {
        return this.f42562b;
    }

    public void c(int i) {
        this.f42562b = i;
    }

    public int j() {
        return this.f42563c;
    }

    public void e(int i) {
        this.f42563c = i;
    }

    public int d() {
        return this.f42561a;
    }

    public void a(int i) {
        this.f42561a = i;
    }

    public int a() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public String toString() {
        return "HiAiSleepData{mTs=" + this.d + ", mX=" + this.e + ", mY=" + this.f42562b + ", mZ=" + this.f42563c + ", mLs=" + this.f42561a + '}';
    }
}
