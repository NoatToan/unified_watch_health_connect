package g4;

import java.util.ArrayList;
import java.util.List;
import p1.i0;
import p1.q0;
import p13.j0;
import p3.o0;
import p3.y2;
import p3.z2;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [g4.b, g4.t] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [s3.b] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List a(s3.l lVar, Integer num, int i14, Integer num2) {
        int iG;
        int iS;
        Object objT;
        q0<Object> q0VarB;
        if (lVar.f156385w || lVar.p() == 0) {
            return j0.f134944a;
        }
        ?? tVar = new t(lVar);
        if (num2 != null) {
            iG = num2.intValue();
        } else {
            iG = lVar.f156384v;
            if (iG < 0) {
                iG = lVar.G(i14, lVar.f156364b);
            }
        }
        if (num == 0) {
            int iP = lVar.f156371i - lVar.P(lVar.r(i14), lVar.f156364b);
            i0<q0<Object>> i0Var = lVar.f156381s;
            num = Integer.valueOf(iP + ((i0Var == null || (q0VarB = i0Var.b(i14)) == null) ? 0 : q0VarB.f134668b));
        }
        int iR = lVar.r(i14) * 5;
        int[] iArr = lVar.f156364b;
        if (iR < iArr.length) {
            iS = lVar.s(i14);
        } else {
            int iG2 = iG >= 0 ? lVar.G(iG, iArr) : iG;
            iS = lVar.s(iG);
            int i15 = iG;
            iG = iG2;
            i14 = i15;
        }
        while (i14 >= 0) {
            if ((lVar.f156364b[(lVar.r(i14) * 5) + 1] & 536870912) != 0) {
                objT = lVar.t(i14);
            } else {
                p3.m.f135153a.getClass();
                objT = p3.m.a.f135155b;
            }
            tVar.d(iS, objT, lVar.Q(i14), num);
            num = lVar.b(i14);
            if (iG >= 0) {
                int iG3 = lVar.G(iG, lVar.f156364b);
                iS = lVar.s(iG);
                int i16 = iG;
                iG = iG3;
                i14 = i16;
            } else {
                i14 = iG;
            }
        }
        return tVar.f75732a;
    }

    public static final Integer b(s3.h hVar, p3.p pVar, int i14, int i15) {
        Integer numB;
        int[] iArr = hVar.f156335b;
        while (true) {
            if (i14 >= i15) {
                return null;
            }
            int iA = s3.k.a(i14, iArr) + i14;
            if (hVar.j(i14) && hVar.i(i14) == 206 && p005kotlin.jvm.internal.s.g(hVar.p(i14, iArr), p3.n.f135162e)) {
                Object objH = hVar.h(i14, 0);
                z2 z2Var = objH instanceof z2 ? (z2) objH : null;
                y2 f135269a = z2Var != null ? z2Var.getF135269a() : null;
                o0.a aVar = f135269a instanceof o0.a ? (o0.a) f135269a : null;
                if (aVar != null && p005kotlin.jvm.internal.s.g(aVar.f135202a, pVar)) {
                    return Integer.valueOf(i14);
                }
            }
            if (hVar.d(i14) && (numB = b(hVar, pVar, i14 + 1, iA)) != null) {
                return Integer.valueOf(numB.intValue());
            }
            i14 = iA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g4.b, g4.q] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList c(s3.h hVar, int i14, Integer num) {
        Object objP;
        ?? qVar = new q(hVar);
        i14 = hVar.q(i14);
        s3.b bVarA = hVar.a(i14);
        while (i14 >= 0) {
            if (hVar.k(i14)) {
                objP = hVar.p(i14, hVar.f156335b);
            } else {
                p3.m.f135153a.getClass();
                objP = p3.m.a.f135155b;
            }
            qVar.d(hVar.i(i14), objP, hVar.f156334a.j(i14), num);
            if (i14 >= 0) {
                s3.b bVar = bVarA;
                bVarA = hVar.a(i14);
                i14 = hVar.q(i14);
                num = bVar;
            } else {
                num = bVarA;
            }
        }
        return qVar.f75732a;
    }
}
