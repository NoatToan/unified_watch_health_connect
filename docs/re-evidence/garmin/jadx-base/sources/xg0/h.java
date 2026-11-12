package xg0;

import android.animation.Animator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxg0/h;", "Landroid/animation/Animator$AnimatorListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f190767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animator f190768b;

    public h(i iVar, Animator animator) {
        this.f190767a = iVar;
        this.f190768b = animator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f190767a.itemView.post(new g(this.f190768b));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
