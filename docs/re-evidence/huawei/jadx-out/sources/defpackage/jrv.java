package defpackage;

import android.graphics.Bitmap;
import android.util.Pair;

/* JADX INFO: loaded from: classes10.dex */
public class jrv {
    private String d;
    private boolean f;
    private boolean h;
    private boolean i;
    private int k;
    private Bitmap g = null;
    private jpg j = null;
    private Pair<Float, Float> e = new Pair<>(Float.valueOf(0.5f), Float.valueOf(1.0f));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38955b = 90.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38956c = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38954a = 0.0f;
    private double l = 1.0d;
    private boolean o = true;

    public jrv() {
        this.f = false;
        this.k = 10;
        this.i = false;
        this.f = false;
        this.k = 10;
        this.i = false;
    }

    public Pair<Float, Float> a() {
        return this.e;
    }

    public jrv c(float f, float f2) {
        this.e = new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        return this;
    }

    public jrv d(Pair<Float, Float> pair) {
        if (pair == null) {
            return this;
        }
        this.e = new Pair<>((Float) pair.first, (Float) pair.second);
        return this;
    }

    public boolean i() {
        return this.f;
    }

    public Bitmap b() {
        return this.g;
    }

    public jrv c(Bitmap bitmap) {
        this.g = bitmap;
        return this;
    }

    public jpg e() {
        return this.j;
    }

    public jrv d(jpg jpgVar) {
        this.j = jpgVar;
        return this;
    }

    public int c() {
        return this.k;
    }

    public jrv b(int i) {
        this.k = i;
        return this;
    }

    public boolean h() {
        return this.i;
    }

    public jrv a(boolean z) {
        this.i = z;
        return this;
    }

    public jrv c(boolean z) {
        this.h = z;
        return this;
    }

    public void e(String str) {
        this.d = str;
    }

    public String d() {
        return this.d;
    }

    public void e(double d) {
        this.l = d;
    }

    public boolean f() {
        return this.o;
    }

    public jrv d(boolean z) {
        this.o = z;
        return this;
    }
}
