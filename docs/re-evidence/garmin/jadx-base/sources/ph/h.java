package ph;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes7.dex */
public class h extends j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f137659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f137660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f137661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, k kVar, String str) {
        super(null);
        this.f137661c = jVar;
        this.f137659a = kVar;
        this.f137660b = str;
    }

    @Override // ph.j.a, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        k kVar = this.f137659a;
        j jVar = this.f137661c;
        jVar.removeView(kVar);
        jVar.f137671i.b(this.f137660b);
        jVar.f137668f = false;
    }
}
