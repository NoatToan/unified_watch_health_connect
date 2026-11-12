package f2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf2/v;", "Lf2/d0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f68311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0 f68312h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z14, l0 l0Var, int i14, int i15, u uVar, n0 n0Var) {
        super(z14, l0Var, i14, i15, uVar, n0Var);
        this.f68311g = z14;
        this.f68312h = l0Var;
    }

    @Override // f2.d0
    public final c0 b(int i14, a0[] a0VarArr, List<c> list, int i15) {
        return new c0(i14, a0VarArr, this.f68312h, list, this.f68311g, i15);
    }
}
