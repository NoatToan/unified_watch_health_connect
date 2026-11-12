package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n7d<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o7d f27616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f27617b;
    public final int[] c;

    public n7d(int i) {
        this.f27617b = new float[i * 2];
        this.c = new int[i];
    }

    public abstract void a();

    public float b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void c();

    public abstract void d(cb1 cb1Var);

    public void e(o7d o7dVar) {
        this.f27616a = o7dVar;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}
