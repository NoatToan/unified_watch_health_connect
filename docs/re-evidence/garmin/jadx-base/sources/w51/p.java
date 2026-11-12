package w51;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class p implements e23.l<String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f182342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b63.o f182343b;

    public p(h0 h0Var, b63.o oVar) {
        this.f182342a = h0Var;
        this.f182343b = oVar;
    }

    @Override // e23.l
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        h0 h0Var = this.f182342a;
        h0Var.getClass();
        b63.o oVar = this.f182343b;
        oVar.getClass();
        ge1.b.T(v1.a(h0Var), null, null, new c0(h0Var, oVar, str2, null), 3);
        return Unit.INSTANCE;
    }
}
