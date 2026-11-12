package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf5/b1;", "Lf5/y0;", "measurable", "Lg6/a;", "constraints", "Lf5/a1;", "invoke-3p2s80s", "(Lf5/b1;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class d extends p005kotlin.jvm.internal.w implements e23.q<f5.b1, f5.y0, g6.a, f5.a1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f149071a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0 l0Var) {
        super(3);
        this.f149071a = l0Var;
    }

    @Override // e23.q
    public final f5.a1 invoke(f5.b1 b1Var, f5.y0 y0Var, g6.a aVar) {
        f5.v1 v1VarQ = y0Var.Q(aVar.f75988a);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new c(v1VarQ, this.f149071a));
    }
}
