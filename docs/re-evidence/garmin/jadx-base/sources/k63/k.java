package k63;

import ch.qos.logback.core.CoreConstants;
import d53.w;
import m63.q1;
import m63.r1;
import p005kotlin.Unit;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final q1 a(String str, d dVar) {
        dVar.getClass();
        if (w.J(str)) {
            vb.h.s("Blank serial names are prohibited");
            return null;
        }
        r1.a(str);
        return new q1(str, dVar);
    }

    public static final n b(String str, e eVar) {
        eVar.getClass();
        if (w.J(str)) {
            vb.h.s("Blank serial names are prohibited");
            return null;
        }
        if (!str.equals(eVar.getF103257a())) {
            if (eVar.getF103234b() instanceof d) {
                r1.a(str);
            }
            return new n(str, eVar);
        }
        StringBuilder sbL = hb.a.l("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
        sbL.append(eVar.getF103257a());
        sbL.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    public static final f c(String str, e[] eVarArr, e23.l lVar) {
        if (w.J(str)) {
            vb.h.s("Blank serial names are prohibited");
            return null;
        }
        a aVar = new a(str);
        lVar.invoke(aVar);
        return new f(str, m.a.f103253a, aVar.f103214c.size(), u.i0(eVarArr), aVar);
    }

    public static f d(String str, e[] eVarArr) {
        if (w.J(str)) {
            vb.h.s("Blank serial names are prohibited");
            return null;
        }
        a aVar = new a(str);
        Unit unit = Unit.INSTANCE;
        return new f(str, m.a.f103253a, aVar.f103214c.size(), u.i0(eVarArr), aVar);
    }

    public static final f e(String str, l lVar, e[] eVarArr, e23.l lVar2) {
        lVar.getClass();
        if (w.J(str)) {
            vb.h.s("Blank serial names are prohibited");
            return null;
        }
        if (lVar.equals(m.a.f103253a)) {
            vb.h.s("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        a aVar = new a(str);
        lVar2.invoke(aVar);
        return new f(str, lVar, aVar.f103214c.size(), u.i0(eVarArr), aVar);
    }

    public static f f(String str, l lVar, e[] eVarArr) {
        lVar.getClass();
        if (w.J(str)) {
            vb.h.s("Blank serial names are prohibited");
            return null;
        }
        if (lVar.equals(m.a.f103253a)) {
            vb.h.s("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        a aVar = new a(str);
        Unit unit = Unit.INSTANCE;
        return new f(str, lVar, aVar.f103214c.size(), u.i0(eVarArr), aVar);
    }
}
