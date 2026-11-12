package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yho extends p8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zho f40191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a8o f40192b;
    public xho c;

    public yho() {
        zho zhoVar = new zho();
        this.f40191a = zhoVar;
        this.c = zhoVar;
    }

    @Override // defpackage.p8g
    public float a() {
        return this.c.a();
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        zho zhoVar = this.f40191a;
        this.c = zhoVar;
        zhoVar.d(f, f2, f3, f4, f5, f6);
    }

    public boolean c() {
        return this.c.b();
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f40192b == null) {
            this.f40192b = new a8o();
        }
        a8o a8oVar = this.f40192b;
        this.c = a8oVar;
        a8oVar.d(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
