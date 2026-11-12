package zz2;

import a3.i1;
import i3.s7;
import i3.ve;
import o4.r1;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzz2/b;", "", "<init>", "()V", "flexible-bottomsheet-material3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f207647a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f207648b;

    static {
        d0.f207657a.getClass();
        f207648b = d0.f207658b;
    }

    private b() {
    }

    public final void a(h4.r rVar, float f14, float f15, r1 r1Var, long j8, p3.m mVar, int i14) {
        h4.r rVar2;
        float f16;
        float f17;
        r1 r1Var2;
        long jC;
        o0 o0Var;
        float f18;
        r1 r1Var3;
        long j14;
        h4.r rVar3;
        o0 o0VarE = mVar.E(677171593);
        if (((i14 | 9654) & 46811) == 9362 && o0VarE.b()) {
            o0VarE.e();
            rVar3 = rVar;
            f16 = f14;
            f18 = f15;
            r1Var3 = r1Var;
            j14 = j8;
            o0Var = o0VarE;
        } else {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = h4.r.S;
                d0 d0Var = d0.f207657a;
                d0Var.getClass();
                f16 = d0.f207660d;
                d0Var.getClass();
                f17 = d0.f207659c;
                s7 s7Var = s7.f89624a;
                s7Var.getClass();
                k2.a aVar = s7.b(o0VarE).f87994e;
                s7Var.getClass();
                r1Var2 = aVar;
                jC = o4.d0.c(0.4f, s7.a(o0VarE).f88503r, 14);
            } else {
                o0VarE.e();
                rVar2 = rVar;
                f16 = f14;
                f17 = f15;
                r1Var2 = r1Var;
                jC = j8;
            }
            o0VarE.h0();
            o0Var = o0VarE;
            ve.a(p5.v.c(new zw.b(9), c2.l.A(rVar2, 0.0f, c.f207652a, 1), false), r1Var2, jC, 0L, 0.0f, 0.0f, null, z3.f.b(1878645646, new a(f16, f17), o0VarE), o0Var, 12582912, 120);
            f18 = f17;
            r1Var3 = r1Var2;
            j14 = jC;
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(this, rVar3, f16, f18, r1Var3, j14, i14, 2);
        }
    }
}
