package defpackage;

import com.github.mikephil.charting.components.YAxis;

/* JADX INFO: loaded from: classes4.dex */
public class r7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f32287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f32288b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public YAxis.AxisDependency h;
    public float i;
    public float j;

    public r7c(float f, float f2, float f3, float f4, int i, int i2, YAxis.AxisDependency axisDependency) {
        this(f, f2, f3, f4, i, axisDependency);
        this.g = i2;
    }

    public boolean a(r7c r7cVar) {
        return r7cVar != null && this.f == r7cVar.f && this.f32287a == r7cVar.f32287a && this.g == r7cVar.g && this.e == r7cVar.e;
    }

    public YAxis.AxisDependency b() {
        return this.h;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public float e() {
        return this.i;
    }

    public float f() {
        return this.j;
    }

    public int g() {
        return this.g;
    }

    public float h() {
        return this.f32287a;
    }

    public float i() {
        return this.c;
    }

    public float j() {
        return this.f32288b;
    }

    public float k() {
        return this.d;
    }

    public void l(int i) {
        this.e = i;
    }

    public void m(float f, float f2) {
        this.i = f;
        this.j = f2;
    }

    public String toString() {
        return "Highlight, x: " + this.f32287a + ", y: " + this.f32288b + ", dataSetIndex: " + this.f + ", stackIndex (only stacked barentry): " + this.g;
    }

    public r7c(float f, int i, int i2) {
        this(f, Float.NaN, i);
        this.g = i2;
    }

    public r7c(float f, float f2, int i, int i2) {
        this.g = -1;
        this.f32287a = f;
        this.f32288b = f2;
        this.f = i;
        this.e = i2;
    }

    public r7c(float f, float f2, int i) {
        this.g = -1;
        this.f32287a = f;
        this.f32288b = f2;
        this.f = i;
        this.e = -1;
    }

    public r7c(float f, float f2, float f3, float f4, int i, YAxis.AxisDependency axisDependency) {
        this.e = -1;
        this.g = -1;
        this.f32287a = f;
        this.f32288b = f2;
        this.c = f3;
        this.d = f4;
        this.f = i;
        this.h = axisDependency;
    }
}
