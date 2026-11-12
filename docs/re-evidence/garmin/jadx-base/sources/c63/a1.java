package c63;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f24945a = p13.h0.C0(p13.h0.A0(new j23.c('a', 'z'), new j23.c('A', 'Z')), p13.x.k('[', ']', Character.valueOf(CoreConstants.SINGLE_QUOTE_CHAR)));

    public static final z0.b a(char c14, int i14) {
        switch (c14) {
            case 'A':
                return new z0.b.c.f.C0367b(i14);
            case 'B':
            case 'C':
            case 'I':
            case 'J':
            case 'K':
            case 'P':
            case 'R':
            case 'T':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'b':
            case 'f':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'o':
            case 'p':
            case 't':
            default:
                return new b1(c14, i14);
            case 'D':
                return new z0.b.a.d(i14);
            case 'E':
                return new z0.b.a.C0362b(i14);
            case 'F':
                return new z0.b.a.c(i14);
            case 'G':
                return new z0.b.d.C0369b(i14);
            case 'H':
                return new z0.b.c.C0366c(i14);
            case 'L':
                return new z0.b.d.f(i14);
            case 'M':
                return new z0.b.d.c(i14);
            case 'N':
                return new z0.b.c.f.C0368c(i14);
            case 'O':
                return new z0.b.AbstractC0363b.a(i14);
            case 'Q':
                return new z0.b.d.C0370d(i14);
            case 'S':
                return new z0.b.c.f.a(i14);
            case 'U':
                return new z0.b.d.a(i14);
            case 'V':
                return new z0.b.e.C0371b(i14);
            case 'W':
                return new z0.b.a.i(i14);
            case 'X':
                return new z0.b.AbstractC0363b.C0364b(i14);
            case 'Y':
                return new z0.b.a.h(i14);
            case 'Z':
                return new z0.b.AbstractC0363b.d(i14);
            case 'a':
                return new z0.b.c.C0365b(i14);
            case 'c':
                return new z0.b.a.g(i14);
            case 'd':
                return new z0.b.a.C0361a(i14);
            case 'e':
                return new z0.b.a.e(i14);
            case 'g':
                return new z0.b.a.f(i14);
            case 'h':
                return new z0.b.c.a(i14);
            case 'm':
                return new z0.b.c.d(i14);
            case 'n':
                return new z0.b.c.f.d(i14);
            case 'q':
                return new z0.b.d.g(i14);
            case 'r':
                return new z0.b.d.e(i14);
            case 's':
                return new z0.b.c.e.a(i14);
            case 'u':
                return new z0.b.d.h(i14);
            case 'v':
                return new z0.b.e.a(i14);
            case 'w':
                return new z0.b.a.j(i14);
            case 'x':
                return new z0.b.AbstractC0363b.c(i14);
            case 'y':
                return new z0.b.d.i(i14);
            case 'z':
                return new z0.b.e.c(i14);
        }
    }

    public static final void b(z0.b bVar) {
        throw new IllegalArgumentException("Unknown length " + bVar.getF24949c() + " for the " + bVar.getF24948b() + " directive");
    }

    public static final void c(z0.b.d dVar, int i14) {
        StringBuilder sbI = b71.i.i(i14, "Padding do ", " digits is not supported for the ");
        sbI.append(dVar.getF24948b());
        sbI.append(" directive");
        throw new UnsupportedOperationException(sbI.toString());
    }

    public static final void d(s sVar, z0 z0Var) {
        if (z0Var instanceof z0.e) {
            sVar.q(((z0.e) z0Var).f25162b);
            return;
        }
        if (z0Var instanceof z0.d) {
            Iterator<T> it = ((z0.d) z0Var).f25161b.iterator();
            while (it.hasNext()) {
                d(sVar, (z0) it.next());
            }
            return;
        }
        if (z0Var instanceof z0.c) {
            t.a(sVar, new e23.l[]{new n(7)}, new b41.a((z0.c) z0Var, 19));
            return;
        }
        if (!(z0Var instanceof z0.b)) {
            lc.u0.r();
            return;
        }
        z0.b bVar = (z0.b) z0Var;
        if (bVar instanceof z0.b.c) {
            if (sVar instanceof s.d) {
                ((z0.b.c) z0Var).c((s.d) sVar);
                return;
            } else {
                androidx.core.view.j.s("A time-based directive ", z0Var, " was used in a format builder that doesn't support time components");
                return;
            }
        }
        if (bVar instanceof z0.b.d) {
            if (sVar instanceof s.f) {
                ((z0.b.d) z0Var).d((s.f) sVar);
                return;
            } else {
                androidx.core.view.j.s("A year-month-based directive ", z0Var, " was used in a format builder that doesn't support year-month components");
                return;
            }
        }
        if (bVar instanceof z0.b.a) {
            if (sVar instanceof s.a) {
                ((z0.b.a) z0Var).c((s.a) sVar);
                return;
            } else {
                androidx.core.view.j.s("A date-based directive ", z0Var, " was used in a format builder that doesn't support date components");
                return;
            }
        }
        if (bVar instanceof z0.b.e) {
            if (sVar instanceof s.c) {
                ((z0.b.e) z0Var).c((s.c) sVar);
                return;
            } else {
                androidx.core.view.j.s("A time-zone-based directive ", z0Var, " was used in a format builder that doesn't support time-zone components");
                return;
            }
        }
        if (bVar instanceof z0.b.AbstractC0363b) {
            if (sVar instanceof s.e) {
                ((z0.b.AbstractC0363b) z0Var).c((s.e) sVar);
                return;
            } else {
                androidx.core.view.j.s("A UTC-offset-based directive ", z0Var, " was used in a format builder that doesn't support UTC offset components");
                return;
            }
        }
        if (bVar instanceof b1) {
            org.apache.commons.lang3.e.l("The meaning of the directive '", z0Var, "' is unknown");
        } else {
            lc.u0.r();
        }
    }

    public static final void e(z0.b bVar, String str) {
        StringBuilder sb3 = new StringBuilder("The directive '");
        sb3.append(bVar);
        sb3.append("' is locale-dependent, but locales are not supported in Kotlin");
        sb3.append(str != null ? ". ".concat(str) : "");
        throw new IllegalArgumentException(sb3.toString());
    }

    public static final void f(String str, String str2) {
        throw new UnsupportedOperationException(am.j.o(str2 != null ? str2.concat(StringUtils.SPACE) : "", "Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues", hb.a.l("kotlinx.datetime formatting does not support the ", str, " field. ")));
    }
}
