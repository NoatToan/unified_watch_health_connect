package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.f0 f10518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f10519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f10521d;

    public k(i iVar, RecyclerView.f0 f0Var, View view2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10521d = iVar;
        this.f10518a = f0Var;
        this.f10519b = view2;
        this.f10520c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f10519b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10520c.setListener(null);
        i iVar = this.f10521d;
        RecyclerView.f0 f0Var = this.f10518a;
        iVar.h(f0Var);
        iVar.f10485o.remove(f0Var);
        iVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10521d.getClass();
    }
}
