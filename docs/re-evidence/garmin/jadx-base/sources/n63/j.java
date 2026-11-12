package n63;

import m63.j0;
import m63.k1;
import m63.y1;
import o63.d0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f123935a;

    static {
        x0.f105818a.getClass();
        f123935a = k1.a("kotlinx.serialization.json.JsonUnquotedLiteral", y1.f117048a);
    }

    public static final z a(i iVar) {
        z zVar = iVar instanceof z ? (z) iVar : null;
        if (zVar != null) {
            return zVar;
        }
        org.apache.commons.lang3.e.r("Element ", s0.f105811a.b(iVar.getClass()), " is not a JsonPrimitive");
        return null;
    }

    public static final long b(z zVar) {
        d0 d0Var = new d0(zVar.getF123941c());
        long jH = d0Var.h();
        if (d0Var.e() == 10) {
            return jH;
        }
        int i14 = d0Var.f129815a;
        int i15 = i14 - 1;
        String str = d0Var.f129846e;
        o63.a.m(d0Var, am.j.m("Expected input to contain a single valid number, but got '", (i14 == str.length() || i15 < 0) ? "EOF" : String.valueOf(str.charAt(i15)), "' after it"), i15, null, 4);
        throw null;
    }
}
