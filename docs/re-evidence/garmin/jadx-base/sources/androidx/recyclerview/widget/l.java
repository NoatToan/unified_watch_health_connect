package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.f0 f10529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f10534f;

    public l(i iVar, RecyclerView.f0 f0Var, int i14, View view2, int i15, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10534f = iVar;
        this.f10529a = f0Var;
        this.f10530b = i14;
        this.f10531c = view2;
        this.f10532d = i15;
        this.f10533e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i14 = this.f10530b;
        View view2 = this.f10531c;
        if (i14 != 0) {
            view2.setTranslationX(0.0f);
        }
        if (this.f10532d != 0) {
            view2.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10533e.setListener(null);
        i iVar = this.f10534f;
        RecyclerView.f0 f0Var = this.f10529a;
        iVar.h(f0Var);
        iVar.f10486p.remove(f0Var);
        iVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10534f.getClass();
    }
}
