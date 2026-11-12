package z1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {114}, m = "fling", v = 1)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l f200835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f200836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f200837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f200838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f200837c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f200836b = obj;
        this.f200838d |= Integer.MIN_VALUE;
        return this.f200837c.d(null, 0.0f, null, this);
    }
}
