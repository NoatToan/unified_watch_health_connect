package be;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f17676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17677b;

    public c(d dVar, d.a aVar) {
        this.f17677b = dVar;
        this.f17676a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.f17677b;
        d.a aVar = this.f17676a;
        dVar.a(1.0f, aVar, true);
        aVar.f17697k = aVar.f17691e;
        aVar.f17698l = aVar.f17692f;
        aVar.f17699m = aVar.f17693g;
        aVar.a((aVar.f17696j + 1) % aVar.f17695i.length);
        if (!dVar.f17686f) {
            dVar.f17685e += 1.0f;
            return;
        }
        dVar.f17686f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.f17700n) {
            aVar.f17700n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17677b.f17685e = 0.0f;
    }
}
