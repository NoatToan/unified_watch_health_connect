package ph;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes7.dex */
public class g extends j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f137657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, k kVar) {
        super(null);
        this.f137658b = jVar;
        this.f137657a = kVar;
    }

    @Override // ph.j.a, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f137657a.c();
        this.f137658b.f137668f = false;
    }
}
