package n23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln23/l4;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l4 f122528a = new l4();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122529a;

        static {
            int[] iArr = new int[k23.k.a.values().length];
            try {
                iArr[k23.k.a.INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k23.k.a.CONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k23.k.a.EXTENSION_RECEIVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k23.k.a.VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f122529a = iArr;
        }
    }

    private l4() {
    }

    public static void a(StringBuilder sb3, k23.c cVar) throws IOException {
        cVar.getClass();
        List<k23.k> parameters = cVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((k23.k) obj).getKind() == k23.k.a.CONTEXT) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        p13.h0.j0(arrayList, sb3, null, "context(", ") ", e4.f122436a, 50);
    }

    public static void b(StringBuilder sb3, k23.c cVar) {
        cVar.getClass();
        List<k23.k> listV = ((y3) cVar).v();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            k23.k kVar = (k23.k) obj;
            if (kVar.getKind() == k23.k.a.INSTANCE || kVar.getKind() == k23.k.a.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        k23.k kVar2 = (k23.k) p13.h0.e0(0, arrayList);
        l4 l4Var = f122528a;
        if (kVar2 != null) {
            l4Var.getClass();
            sb3.append(l4Var.f(kVar2.getType(), false));
            sb3.append(".");
        }
        k23.k kVar3 = (k23.k) p13.h0.e0(1, arrayList);
        if (kVar3 != null) {
            sb3.append("(");
            l4Var.getClass();
            sb3.append(l4Var.f(kVar3.getType(), false));
            sb3.append(".");
            sb3.append(")");
        }
    }

    public static String c(k23.g gVar) throws IOException {
        gVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        l4 l4Var = f122528a;
        l4Var.getClass();
        a(sb3, gVar);
        sb3.append("fun ");
        b(sb3, gVar);
        sb3.append(xy2.b.F(x33.f.e(gVar.getF122483i())));
        p13.h0.j0(l23.b.a(gVar), sb3, ", ", "(", ")", f4.f122467a, 48);
        sb3.append(": ");
        sb3.append(l4Var.f(gVar.getReturnType(), false));
        return sb3.toString();
    }

    public static String d(k23.l lVar) throws IOException {
        lVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        l4 l4Var = f122528a;
        l4Var.getClass();
        a(sb3, lVar);
        sb3.append(lVar instanceof k23.h ? "var " : "val ");
        b(sb3, lVar);
        sb3.append(xy2.b.F(x33.f.e(lVar.getF122483i())));
        sb3.append(": ");
        sb3.append(l4Var.f(lVar.getReturnType(), false));
        return sb3.toString();
    }

    public static void e(StringBuilder sb3, k23.d dVar, x33.d dVar2, List list, boolean z14, boolean z15) throws IOException {
        StringBuilder sb4;
        boolean z16;
        if (dVar.getTypeParameters().size() >= list.size() || dh.b.u(dVar).getDeclaringClass() == null) {
            sb4 = sb3;
            z16 = z15;
            sb4.append(xy2.b.H(x33.d.f(dVar2)));
        } else {
            Class<?> declaringClass = dh.b.u(dVar).getDeclaringClass();
            declaringClass.getClass();
            sb4 = sb3;
            z16 = z15;
            e(sb4, p005kotlin.jvm.internal.s0.f105811a.b(declaringClass), dVar2.e(), p13.h0.U(list, dVar.getTypeParameters().size()), false, z16);
            sb4.append(".");
            sb4.append(xy2.b.F(dVar2.g()));
        }
        h(sb4, p13.h0.S0(list, dVar.getTypeParameters().size()), z14, z16);
    }

    public static /* synthetic */ String g(l4 l4Var, k23.p pVar) {
        return l4Var.f(pVar, false);
    }

    public static void h(StringBuilder sb3, List list, boolean z14, boolean z15) throws IOException {
        StringBuilder sb4;
        if (list.isEmpty()) {
            sb4 = sb3;
        } else {
            sb4 = sb3;
            p13.h0.j0(list, sb4, null, "<", ">", new i4(z15), 50);
        }
        if (z14) {
            sb4.append(CallerData.NA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
    public final String f(k23.p pVar, boolean z14) throws IOException {
        x33.d dVar;
        pVar.getClass();
        b53.a aVar = (b53.a) pVar;
        if (aVar.getF16135d()) {
            b53.a aVarE = aVar.getF16133b();
            aVarE.getClass();
            return f(aVarE, true);
        }
        b53.a aVarE2 = aVar.getF16133b();
        b53.a aVarH = aVar.getF16134c();
        if (aVarE2 != null && aVarH != null) {
            String strG = g(this, aVarE2);
            String strG2 = g(this, aVarH);
            if (p005kotlin.jvm.internal.s.g(strG, d53.u.v(strG2, CallerData.NA, "", false))) {
                return d53.u.v(strG2, CallerData.NA, "!", false);
            }
            if (d53.u.p(strG2, CallerData.NA, false)) {
                if ((strG + '?').equals(strG2)) {
                    return strG + '!';
                }
            }
            if (("(" + strG + ")?").equals(strG2)) {
                return am.j.m("(", strG, ")!");
            }
            String strG3 = xy2.b.G(strG, strG2, new j4(strG), new k4(strG), a43.j0.f1159a);
            if (strG3 != null) {
                return strG3;
            }
            return "(" + strG + CallerDataConverter.DEFAULT_RANGE_DELIMITER + strG2 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        StringBuilder sb3 = new StringBuilder();
        k23.p f16157f = aVar.getF16157f();
        if (f16157f != null) {
            sb3.append(f16157f);
            sb3.append(" /* = ");
        }
        k23.e f105782a = pVar.getF105782a();
        boolean z15 = f105782a instanceof k23.q;
        l4 l4Var = f122528a;
        if (z15) {
            String f105820c = ((k23.q) f105782a).getF122625c();
            l4Var.getClass();
            sb3.append(xy2.b.F(x33.f.e(f105820c)));
            if (pVar.getF16155d()) {
                sb3.append(CallerData.NA);
            } else if (aVar.getF16158g()) {
                sb3.append(" & Any");
            }
        } else if (f105782a instanceof k23.d) {
            k23.d<?> dVar2 = (k23.d) f105782a;
            l4Var.getClass();
            if (aVar.getF16159h()) {
                dVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105871c;
            } else {
                k23.d<?> dVarE = aVar.e();
                if (dVarE == null) {
                    dVarE = dVar2;
                }
                String strW = dVarE.w();
                dVar = strW != null ? new x33.d(strW) : null;
            }
            if (dVar == null) {
                dVar = new x33.d(((f2) dVar2).f122441d.getName());
            }
            if (dVar.h(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105859k) && p005kotlin.jvm.internal.s.g(p005kotlin.reflect.jvm.internal.impl.builtins.c.e(dVar), r23.f.a.f149959c)) {
                List<k23.r> listH = pVar.h();
                k23.r.f102461c.getClass();
                if (listH.contains(k23.r.f102462d)) {
                    e(sb3, dVar2, dVar, pVar.h(), pVar.getF16155d(), z14);
                } else {
                    if (aVar.getF16155d()) {
                        sb3.append("(");
                    }
                    if (aVar.getF16160i()) {
                        sb3.append("suspend ");
                    }
                    p13.h0.j0(p13.h0.V(1, aVar.h()), sb3, null, "(", ") -> ", null, 114);
                    sb3.append(p13.h0.m0(aVar.h()));
                    if (aVar.getF16155d()) {
                        sb3.append(")?");
                    }
                }
            } else {
                e(sb3, dVar2, dVar, pVar.h(), pVar.getF16155d(), z14);
            }
        } else if (f105782a instanceof r3) {
            x33.d dVar3 = ((r3) f105782a).f122596a.f188596a;
            dVar3.getClass();
            p13.h0.j0(x33.d.f(dVar3), sb3, ".", null, null, h4.f122497a, 60);
            sb3 = sb3;
            List<k23.r> listH2 = pVar.h();
            boolean f16155d = pVar.getF16155d();
            l4Var.getClass();
            h(sb3, listH2, f16155d, z14);
        } else {
            sb3.append("???");
        }
        if (aVar.getF16157f() != null) {
            sb3.append(" */");
        }
        return sb3.toString();
    }
}
