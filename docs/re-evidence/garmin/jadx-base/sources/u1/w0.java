package u1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {114}, m = "emitExit", v = 1)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f167704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f167704b = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167703a = obj;
        this.f167705c |= Integer.MIN_VALUE;
        return x0.V1(this.f167704b, this);
    }
}
