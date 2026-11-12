package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.f0 f10509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f10512d;

    public j(i iVar, RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view2) {
        this.f10512d = iVar;
        this.f10509a = f0Var;
        this.f10510b = viewPropertyAnimator;
        this.f10511c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10510b.setListener(null);
        this.f10511c.setAlpha(1.0f);
        i iVar = this.f10512d;
        RecyclerView.f0 f0Var = this.f10509a;
        iVar.h(f0Var);
        iVar.f10487q.remove(f0Var);
        iVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10512d.getClass();
    }
}
