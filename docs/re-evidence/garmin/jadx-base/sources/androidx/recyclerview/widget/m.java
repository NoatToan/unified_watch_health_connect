package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i.d f10541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f10544d;

    public m(i iVar, i.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view2) {
        this.f10544d = iVar;
        this.f10541a = dVar;
        this.f10542b = viewPropertyAnimator;
        this.f10543c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10542b.setListener(null);
        View view2 = this.f10543c;
        view2.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        i.d dVar = this.f10541a;
        RecyclerView.f0 f0Var = dVar.f10495a;
        i iVar = this.f10544d;
        iVar.h(f0Var);
        iVar.f10488r.remove(dVar.f10495a);
        iVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.f0 f0Var = this.f10541a.f10495a;
        this.f10544d.getClass();
    }
}
