package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i22<T extends Animator> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mnq.a f20684b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20683a = 350;
    public T c = (T) a();

    public i22(mnq.a aVar) {
        this.f20684b = aVar;
    }

    public abstract T a();

    public i22 b(long j) {
        this.f20683a = j;
        T t = this.c;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    public void c() {
        T t = this.c;
        if (t == null || !t.isStarted()) {
            return;
        }
        this.c.end();
    }

    /* JADX INFO: renamed from: d */
    public abstract i22 m(float f);

    public void e() {
        T t = this.c;
        if (t == null || t.isRunning()) {
            return;
        }
        this.c.start();
    }
}
