package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import defpackage.u8g;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    u8g a();

    boolean b();

    void c(u8g u8gVar);

    int d();

    AnimatorSet e();

    void f(ExtendedFloatingActionButton.j jVar);

    void g();

    void h();

    List<Animator.AnimatorListener> i();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);
}
