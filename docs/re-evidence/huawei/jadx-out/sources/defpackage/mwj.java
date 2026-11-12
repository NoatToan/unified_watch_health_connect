package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class mwj implements Serializable {
    private static final long serialVersionUID = 1;
    private int e;
    private int h;
    private int i;
    private int j;
    private long g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42568a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42570c = 0;
    private int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42569b = 0;

    public long f() {
        return this.g;
    }

    public void d(long j) {
        this.g = j;
    }

    public int b() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int e() {
        return this.j;
    }

    public void i(int i) {
        this.j = i;
    }

    public int i() {
        return this.h;
    }

    public void j(int i) {
        this.h = i;
    }

    public int g() {
        return this.i;
    }

    public void h(int i) {
        this.i = i;
    }

    public int c() {
        return this.f42568a;
    }

    public void c(int i) {
        this.f42568a = i;
    }

    public int d() {
        return this.f42570c;
    }

    public void d(int i) {
        this.f42570c = i;
    }

    public int a() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public void e(int i) {
        this.f42569b = i;
    }

    public String toString() {
        return "HiAiSleepData{timeStamp=" + this.g + ", sensorX=" + this.j + ", sensorY=" + this.h + ", sensorZ=" + this.i + ", differentialX=" + this.f42568a + ", differentialY=" + this.f42570c + ", differentialZ=" + this.d + ", max=" + this.f42569b + ", lightStatus=" + this.e + '}';
    }
}
