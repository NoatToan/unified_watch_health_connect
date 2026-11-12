package defpackage;

import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class dol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f32130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32131b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32132c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private float m;
    private int n;

    public boolean o() {
        return ((Boolean) dym.d(Boolean.valueOf(this.f32131b))).booleanValue();
    }

    public void b(boolean z) {
        this.f32131b = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    public float a() {
        return ((Float) dym.d(Float.valueOf(this.f32130a))).floatValue();
    }

    public void a(float f) {
        this.f32130a = ((Float) dym.d(Float.valueOf(f))).floatValue();
    }

    public float j() {
        return ((Float) dym.d(Float.valueOf(this.m))).floatValue();
    }

    public void c(float f) {
        this.m = ((Float) dym.d(Float.valueOf(f))).floatValue();
    }

    public int i() {
        return ((Integer) dym.d(Integer.valueOf(this.i))).intValue();
    }

    public void a(int i) {
        this.i = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int f() {
        return ((Integer) dym.d(Integer.valueOf(this.n))).intValue();
    }

    public void i(int i) {
        this.n = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int d() {
        return ((Integer) dym.d(Integer.valueOf(this.j))).intValue();
    }

    public void b(int i) {
        this.j = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int c() {
        return ((Integer) dym.d(Integer.valueOf(this.d))).intValue();
    }

    public void c(int i) {
        this.d = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) dym.d(Integer.valueOf(this.e))).intValue();
    }

    public void e(int i) {
        this.e = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) dym.d(Integer.valueOf(this.f32132c))).intValue();
    }

    public void d(int i) {
        this.f32132c = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int g() {
        return ((Integer) dym.d(Integer.valueOf(this.h))).intValue();
    }

    public void f(int i) {
        this.h = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public void j(int i) {
        this.f = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public String h() {
        return (String) dym.d(this.g);
    }

    public void b(String str) {
        this.g = (String) dym.d(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("fat measure test result.test time:");
        stringBuffer.append(this.n).append(Constants.LINK).append(this.j).append(Constants.LINK).append(this.d);
        stringBuffer.append(" ").append(this.e).append(":").append(this.f32132c).append(":").append(this.h);
        return stringBuffer.toString();
    }
}
