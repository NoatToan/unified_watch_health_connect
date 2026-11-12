package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li3/tj;", "Lf5/o0;", "Li5/n2;", "", "visible", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(ZLe23/l;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tj extends kotlin.n2 implements f5.o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f89836c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89837b;

    public tj(boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        super(lVar);
        this.f89837b = z14;
    }

    public final boolean equals(Object obj) {
        tj tjVar = obj instanceof tj ? (tj) obj : null;
        return tjVar != null && this.f89837b == tjVar.f89837b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89837b);
    }

    @Override // f5.o0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo0measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ = y0Var.Q(j8);
        return !this.f89837b ? f5.b1.h0(b1Var, 0, 0, new bf(9)) : f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 16));
    }
}
