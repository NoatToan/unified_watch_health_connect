package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes5.dex */
public class ad1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animator f891a;

    public void a() {
        Animator animator = this.f891a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f891a = null;
    }

    public void c(Animator animator) {
        a();
        this.f891a = animator;
    }
}
