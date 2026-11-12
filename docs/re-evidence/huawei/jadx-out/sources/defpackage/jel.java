package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public class jel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38488b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile jel f38489c;
    private int f = 0;
    private long i = 0;
    private float e = 0.0f;
    private float h = 0.0f;
    private int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38490a = 0;
    private boolean g = false;

    private jel() {
    }

    public static jel b() {
        if (f38489c == null) {
            synchronized (f38488b) {
                if (f38489c == null) {
                    f38489c = new jel();
                }
            }
        }
        return f38489c;
    }

    public void b(int i) {
        this.f = i;
    }

    public int j() {
        return this.f;
    }

    public void c(long j) {
        this.i = j;
    }

    public void e(float f) {
        this.e = f;
    }

    public float a() {
        return this.e;
    }

    public void d(float f) {
        this.h = f;
    }

    public void c(int i) {
        this.d = i;
    }

    public int e() {
        return this.d;
    }

    public void a(int i) {
        this.f38490a = i;
    }

    public int c() {
        return this.f38490a;
    }

    public void c(Bundle bundle, int i, int i2, int i3) {
        if (jem.f()) {
            if (bundle != null) {
                b(bundle.getInt("sportState"));
                c(bundle.getInt("duration"));
                e(bundle.getInt("distance") / 1000.0f);
                d((bundle.getFloat("speed") * 3600.0f) / 1000.0f);
                c(bundle.getInt("calorie") / 1000);
            }
            if (this.g && this.f == 2) {
                jau.c().b();
                jau.c().e();
            }
            int i4 = this.f;
            if (i4 == 2 || i4 == 3) {
                this.g = false;
                return;
            }
            this.g = true;
            a(i);
            if (i > 0) {
                jeh.e().f38474c = i;
                jeh.e().f38472a.add(Integer.valueOf(i));
            }
            if (this.h > 0.0f) {
                jeh.e().d(this.h);
                jeh.e().a(this.h);
            }
            if (i2 > 0) {
                jeh.e().e(i2, i3);
            }
            jeh.e().c(this.i * 1000);
        }
    }

    public void d() {
        g();
    }

    private void g() {
        synchronized (f38488b) {
            f38489c = null;
        }
    }
}
