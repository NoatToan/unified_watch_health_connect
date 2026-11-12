package kotlin;

import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession", v = 1)
public final class g1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f91190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f91191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, d<? super g1> dVar) {
        super(dVar);
        this.f91191b = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91190a = obj;
        this.f91192c |= Integer.MIN_VALUE;
        return this.f91191b.a(null, null, this);
    }
}
