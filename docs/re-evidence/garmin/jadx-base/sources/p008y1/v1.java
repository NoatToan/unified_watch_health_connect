package p008y1;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {150}, m = "userScroll", v = 1)
public final class v1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f193680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f193681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(n1 n1Var, d<? super v1> dVar) {
        super(dVar);
        this.f193681b = n1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193680a = obj;
        this.f193682c |= Integer.MIN_VALUE;
        return this.f193681b.h(null, null, this);
    }
}
