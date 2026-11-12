package ei;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import r53.c2;
import vh.g0;
import vh.n0;
import vh.s0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lei/s;", "Lki/a;", "Lbi/a;", "store", "<init>", "(Lbi/a;)V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class s implements ki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bi.a f64169a;

    public s(bi.a aVar) {
        aVar.getClass();
        this.f64169a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ki.a
    public final r53.i a(vh.e eVar, ki.c cVar) {
        eVar.getClass();
        n0 n0Var = eVar.f178288a;
        g0 g0Var = eVar.f178290c;
        bi.p pVar = (bi.p) g0Var.b(bi.p.f18006d);
        if (pVar == null) {
            return cVar.a(eVar);
        }
        if (!(n0Var instanceof s0)) {
            vb.h.z("It's impossible to watch a mutation or subscription");
            return null;
        }
        g0.b bVarB = g0Var.b(z.f178396e);
        bVarB.getClass();
        z zVar = (z) bVarB;
        r0 r0Var = new r0();
        s0.a aVar = pVar.f18007b;
        bi.a aVar2 = this.f64169a;
        r0Var.f105810a = aVar != null ? ci.l.a(aVar2.d(n0Var, aVar, zVar).values()) : 0;
        return new r53.z(new c2(new t(new p(new o(aVar2.getF64117d(), r0Var), cVar, eVar, r0Var, this, zVar), null)), new r(pVar, null));
    }
}
