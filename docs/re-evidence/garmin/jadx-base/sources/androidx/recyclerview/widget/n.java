package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i.d f10554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f10557d;

    public n(i iVar, i.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view2) {
        this.f10557d = iVar;
        this.f10554a = dVar;
        this.f10555b = viewPropertyAnimator;
        this.f10556c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10555b.setListener(null);
        View view2 = this.f10556c;
        view2.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        i.d dVar = this.f10554a;
        RecyclerView.f0 f0Var = dVar.f10496b;
        i iVar = this.f10557d;
        iVar.h(f0Var);
        iVar.f10488r.remove(dVar.f10496b);
        iVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.f0 f0Var = this.f10554a.f10496b;
        this.f10557d.getClass();
    }
}
