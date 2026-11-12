package v2;

import android.graphics.PointF;
import kotlin.a4;
import p006l2.i3;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static final long a(long j8, CharSequence charSequence) {
        s5.w0.a aVar = s5.w0.f157315b;
        int iCharCount = (int) (j8 >> 32);
        int iCharCount2 = (int) (4294967295L & j8);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (n(iCodePointBefore) && (m(iCodePointAt) || l(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (n(iCodePointBefore));
            return og.a.l(iCharCount, iCharCount2);
        }
        if (!n(iCodePointAt)) {
            return j8;
        }
        if (!m(iCodePointBefore) && !l(iCodePointBefore)) {
            return j8;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (n(iCodePointAt));
        return og.a.l(iCharCount, iCharCount2);
    }

    public static final long b(s5.q0 q0Var, long j8, long j14, f5.c0 c0Var, a4 a4Var) {
        if (q0Var != null) {
            s5.o oVar = q0Var.f157281b;
            if (c0Var != null) {
                long jO = c0Var.o(j8);
                long jO2 = c0Var.o(j14);
                int iH = h(oVar, jO, a4Var);
                int iH2 = h(oVar, jO2, a4Var);
                if (iH != -1) {
                    if (iH2 != -1) {
                        iH = Math.min(iH, iH2);
                    }
                    iH2 = iH;
                } else if (iH2 == -1) {
                    s5.w0.f157315b.getClass();
                    return s5.w0.f157316c;
                }
                float fB = (oVar.b(iH2) + oVar.f(iH2)) / 2;
                int i14 = (int) (jO >> 32);
                int i15 = (int) (jO2 >> 32);
                n4.d dVar = new n4.d(Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), fB - 0.1f, Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), fB + 0.1f);
                s5.m0.f157245b.getClass();
                s5.n0.f157248u0.getClass();
                return oVar.h(dVar, 0, s5.n0.a.f157250b);
            }
        }
        s5.w0.f157315b.getClass();
        return s5.w0.f157316c;
    }

    public static final long c(p006l2.b2 b2Var, n4.d dVar, n4.d dVar2, int i14, s5.n0 n0Var) {
        long j8 = j(b2Var, dVar, i14, n0Var);
        if (s5.w0.e(j8)) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        long j14 = j(b2Var, dVar2, i14, n0Var);
        if (s5.w0.e(j14)) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        int i15 = (int) (j8 >> 32);
        int i16 = (int) (j14 & 4294967295L);
        return og.a.l(Math.min(i15, i15), Math.max(i16, i16));
    }

    public static final long d(g2 g2Var, n4.d dVar, n4.d dVar2, int i14, s5.n0 n0Var) {
        long jK = k(g2Var, dVar, i14, n0Var);
        if (s5.w0.e(jK)) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        long jK2 = k(g2Var, dVar2, i14, n0Var);
        if (s5.w0.e(jK2)) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        int i15 = (int) (jK >> 32);
        int i16 = (int) (jK2 & 4294967295L);
        return og.a.l(Math.min(i15, i15), Math.max(i16, i16));
    }

    public static final boolean e(s5.q0 q0Var, int i14) {
        s5.o oVar = q0Var.f157281b;
        int iD = oVar.d(i14);
        return i14 == q0Var.i(iD) || i14 == oVar.c(iD, false) ? q0Var.j(i14) != q0Var.a(i14) : q0Var.a(i14) != q0Var.a(i14 - 1);
    }

    public static final long f(int i14, CharSequence charSequence) {
        int iCharCount = i14;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!m(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i14 < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i14);
            if (!m(iCodePointAt)) {
                break;
            }
            i14 += Character.charCount(iCodePointAt);
        }
        return og.a.l(iCharCount, i14);
    }

    public static final long g(PointF pointF) {
        float f14 = pointF.x;
        float f15 = pointF.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final int h(s5.o oVar, long j8, a4 a4Var) {
        float fA = a4Var != null ? a4Var.a() : 0.0f;
        int i14 = (int) (4294967295L & j8);
        int iE = oVar.e(Float.intBitsToFloat(i14));
        if (Float.intBitsToFloat(i14) < oVar.f(iE) - fA || Float.intBitsToFloat(i14) > oVar.b(iE) + fA) {
            return -1;
        }
        int i15 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i15) < (-fA) || Float.intBitsToFloat(i15) > oVar.f157255d + fA) {
            return -1;
        }
        return iE;
    }

    public static final int i(s5.o oVar, long j8, f5.c0 c0Var, a4 a4Var) {
        long jO;
        int iH;
        if (c0Var == null || (iH = h(oVar, (jO = c0Var.o(j8)), a4Var)) == -1) {
            return -1;
        }
        return oVar.g(n4.c.b((oVar.b(iH) + oVar.f(iH)) / 2.0f, jO, 1));
    }

    public static final long j(p006l2.b2 b2Var, n4.d dVar, int i14, s5.n0 n0Var) {
        s5.q0 q0Var;
        i3 i3VarD = b2Var.d();
        s5.o oVar = (i3VarD == null || (q0Var = i3VarD.f108575a) == null) ? null : q0Var.f157281b;
        f5.c0 c0VarC = b2Var.c();
        if (oVar == null || c0VarC == null) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        n4.c.f123541b.getClass();
        return oVar.h(dVar.o(c0VarC.o(0L)), i14, n0Var);
    }

    public static final long k(g2 g2Var, n4.d dVar, int i14, s5.n0 n0Var) {
        s5.q0 q0VarC = g2Var.c();
        s5.o oVar = q0VarC != null ? q0VarC.f157281b : null;
        f5.c0 c0VarE = g2Var.e();
        if (oVar == null || c0VarE == null) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        n4.c.f123541b.getClass();
        return oVar.h(dVar.o(c0VarE.o(0L)), i14, n0Var);
    }

    public static final boolean l(int i14) {
        int type = Character.getType(i14);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean m(int i14) {
        return Character.isWhitespace(i14) || i14 == 160;
    }

    public static final boolean n(int i14) {
        int type;
        return (!m(i14) || (type = Character.getType(i14)) == 14 || type == 13 || i14 == 10) ? false : true;
    }
}
