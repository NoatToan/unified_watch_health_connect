package z1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {174}, m = "tryApproach", v = 1)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f200851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f200852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f200853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f200852b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f200851a = obj;
        this.f200853c |= Integer.MIN_VALUE;
        return o.c(this.f200852b, null, 0.0f, 0.0f, null, this);
    }
}
