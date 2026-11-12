package u1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {106}, m = "emitEnter", v = 1)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.e f167692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f167693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f167694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f167695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, t13.d<? super v0> dVar) {
        super(dVar);
        this.f167694c = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167693b = obj;
        this.f167695d |= Integer.MIN_VALUE;
        return x0.U1(this.f167694c, this);
    }
}
