package s5;

import o4.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/u0;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f157305a = new u0();

    private u0() {
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o4.y] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static void a(o4.y yVar, q0 q0Var) {
        boolean z14;
        ?? r14;
        Throwable th3;
        ?? r15;
        long f57707b;
        o4.y yVar2;
        float f57706c;
        boolean zE = q0Var.e();
        p0 p0Var = q0Var.f157280a;
        if (zE) {
            int i14 = p0Var.f157270f;
            d6.p.f57793b.getClass();
            if (i14 == d6.p.f57796e) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        boolean z15 = z14;
        if (z15) {
            long j8 = q0Var.f157282c;
            n4.c.f123541b.getClass();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j8 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j8 & 4294967295L))) & 4294967295L);
            n4.g.a aVar = n4.g.f123559b;
            r14 = 0;
            n4.d dVarG = g8.i.g(0L, jFloatToRawIntBits);
            yVar.l();
            o4.y.f(yVar, dVarG);
        }
        i0 i0Var = p0Var.f157266b.f157322a;
        d6.i iVar = i0Var.background;
        d6.l lVar = i0Var.f157211a;
        if (iVar == null) {
            d6.i.f57760b.getClass();
            iVar = d6.i.f57761c;
        }
        d6.i iVar2 = iVar;
        q1 q1Var = i0Var.shadow;
        if (q1Var == null) {
            q1.f128956d.getClass();
            q1Var = q1.f128957e;
        }
        q1 q1Var2 = q1Var;
        q4.g gVar = i0Var.drawStyle;
        if (gVar == null) {
            gVar = q4.j.f142560a;
        }
        q4.g gVar2 = gVar;
        try {
            o4.w wVarE = lVar.e();
            try {
                if (wVarE != null) {
                    if (lVar != d6.l.b.f57774b) {
                        try {
                            f57706c = lVar.getF57706c();
                        } catch (Throwable th4) {
                            th3 = th4;
                            r15 = yVar;
                        }
                    } else {
                        f57706c = 1.0f;
                    }
                    o4.y yVar3 = yVar;
                    o.l(q0Var.f157281b, yVar3, wVarE, f57706c, q1Var2, iVar2, gVar2);
                    yVar2 = yVar3;
                    if (z15) {
                        yVar2.i();
                        return;
                    }
                    return;
                }
                o4.y yVar4 = yVar;
                if (lVar != d6.l.b.f57774b) {
                    f57707b = lVar.getF57707b();
                } else {
                    try {
                        o4.d0.f128823b.getClass();
                        f57707b = o4.d0.f128824c;
                    } catch (Throwable th5) {
                        th3 = th5;
                        r15 = yVar4;
                    }
                }
                o.j(q0Var.f157281b, yVar4, f57707b, q1Var2, iVar2, gVar2, 0, 32);
                yVar2 = yVar4;
                if (z15) {
                    yVar2.i();
                    return;
                }
                return;
            } catch (Throwable th6) {
                th = th6;
                th3 = th;
                r15 = r14;
            }
        } catch (Throwable th7) {
            th = th7;
            r14 = yVar;
        }
        th3 = th;
        r15 = r14;
        if (!z15) {
            throw th3;
        }
        r15.i();
        throw th3;
    }
}
