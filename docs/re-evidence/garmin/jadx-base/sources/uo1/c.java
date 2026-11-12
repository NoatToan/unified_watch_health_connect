package uo1;

import android.animation.Animator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luo1/c;", "Landroid/animation/Animator$AnimatorListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f172120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animator f172121b;

    public c(d dVar, Animator animator) {
        this.f172120a = dVar;
        this.f172121b = animator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f172120a.post(new b(this.f172121b));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
