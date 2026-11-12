package ou0;

import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final f a(ge2.e eVar) {
        b bVar;
        if (eVar == null) {
            return new f(null, null, null, null, null, null, 63, null);
        }
        Boolean bool = eVar.f77025d;
        Boolean bool2 = eVar.f77023b;
        Boolean bool3 = eVar.f77026e;
        if (bool3 == null && bool == null) {
            bVar = null;
        } else if (s.g(bool3, Boolean.FALSE)) {
            bVar = b.c.f133963a;
        } else {
            bVar = s.g(bool, Boolean.TRUE) ? b.a.f133961a : b.C2540b.f133962a;
        }
        return new f(bool2, bVar, null, eVar.f77024c, eVar.f77022a, eVar.f77027f, 4, null);
    }
}
