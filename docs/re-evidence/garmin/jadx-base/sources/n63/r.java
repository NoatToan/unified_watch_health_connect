package n63;

import m63.g2;
import m63.q1;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln63/r;", "Li63/c;", "Ln63/q;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements i63.c<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f123942a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f123943b = k63.k.a("kotlinx.serialization.json.JsonLiteral", k63.d.i.f103232a);

    private r() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        i iVarI = g8.i.n(eVar).i();
        if (iVarI instanceof q) {
            return (q) iVarI;
        }
        StringBuilder sb3 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw gg.b.h(iVarI.toString(), -1, p6.b.h(s0.f105811a, iVarI.getClass(), sb3));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f123943b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        Boolean bool;
        q qVar = (q) obj;
        qVar.getClass();
        String str = qVar.f123941c;
        g8.i.l(fVar);
        if (qVar.f123939a) {
            fVar.p(str);
            return;
        }
        k63.e eVar = qVar.f123940b;
        if (eVar != null) {
            fVar.g(eVar).p(str);
            return;
        }
        Long lJ = d53.t.j(str);
        if (lJ != null) {
            fVar.s(lJ.longValue());
            return;
        }
        o13.z zVarV = zf.b.V(str);
        if (zVarV != null) {
            long j8 = zVarV.f128619a;
            o13.z.f128618b.getClass();
            g2.f116952a.getClass();
            fVar.g(g2.f116953b).s(j8);
            return;
        }
        Double dF = d53.s.f(str);
        if (dF != null) {
            fVar.A(dF.doubleValue());
            return;
        }
        if (str.equals(BooleanUtils.TRUE)) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals(BooleanUtils.FALSE) ? Boolean.FALSE : null;
        }
        if (bool != null) {
            fVar.i(bool.booleanValue());
        } else {
            fVar.p(str);
        }
    }
}
