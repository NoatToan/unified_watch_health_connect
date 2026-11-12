package yc;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f196054a = new Object();

    public static final void a(List list, Object obj, p4 p4Var, p4 p4Var2, int i14, int i15) {
        list.getClass();
        int[] iArrA1 = p4Var != null ? p4Var.f196318a : null;
        int[] iArr = p4Var2 != null ? p4Var2.f196318a : null;
        if (iArrA1 != null && iArr != null) {
            int[] iArrS = p13.s.s(iArrA1, iArr);
            LinkedHashSet linkedHashSet = new LinkedHashSet(p13.t0.a(iArrS.length));
            for (int i16 : iArrS) {
                linkedHashSet.add(Integer.valueOf(i16));
            }
            iArrA1 = p13.h0.a1(p13.h0.M0(p13.h0.b1(linkedHashSet)));
        } else if (iArrA1 == null && iArr != null) {
            iArrA1 = iArr;
        } else if (iArrA1 == null || iArr != null) {
            vb.h.s("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
            return;
        }
        if (obj == null) {
            return;
        }
        list.add(new p4(iArrA1, p13.w.c(obj), i14, p13.w.c(Integer.valueOf(i15))));
    }

    public static final v2 b(v2 v2Var, e23.p pVar) {
        v2Var.getClass();
        return new v2(new e3(v2Var.f196538a, pVar), v2Var.f196539b, v2Var.f196540c, null, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b0 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(yc.p4 r10, e23.q r11, v13.c r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.i0.c(yc.p4, e23.q, v13.c):java.lang.Object");
    }

    public static v2 d(v2 v2Var, e23.q qVar) {
        o4 o4Var = o4.FULLY_COMPLETE;
        o4Var.getClass();
        r53.i<m1<T>> iVar = v2Var.f196538a;
        iVar.getClass();
        return new v2(new a4(iVar, new v3(o4Var, new b4(qVar, null))), v2Var.f196539b, v2Var.f196540c, null, 8, null);
    }

    public static final v2 e(v2 v2Var, e23.p pVar) {
        v2Var.getClass();
        return new v2(new f3(v2Var.f196538a, pVar), v2Var.f196539b, v2Var.f196540c, null, 8, null);
    }

    public static final boolean f(t4 t4Var, t4 t4Var2, c1 c1Var) {
        t4Var.getClass();
        c1Var.getClass();
        if (t4Var2 == null) {
            return true;
        }
        if ((t4Var2 instanceof t4.b) && (t4Var instanceof t4.a)) {
            return true;
        }
        if ((t4Var instanceof t4.b) && (t4Var2 instanceof t4.a)) {
            return false;
        }
        return (t4Var.f196489c == t4Var2.f196489c && t4Var.f196490d == t4Var2.f196490d && t4Var2.a(c1Var) <= t4Var.a(c1Var)) ? false : true;
    }
}
