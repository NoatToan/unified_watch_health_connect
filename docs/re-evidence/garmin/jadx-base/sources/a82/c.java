package a82;

import android.annotation.SuppressLint;
import c2.l;
import e23.p;
import h4.r;
import i3.b1;
import i3.c1;
import i3.j2;
import i3.k2;
import i3.s7;
import n3.l0;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La82/c;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1991a = new c();

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o13.e
    public final void a(p pVar, String str, @SuppressLint({"ModifierParameter"}) r rVar, boolean z14, e23.a aVar, m mVar, int i14) {
        p pVar2;
        int i15;
        r rVar2;
        o0 o0VarL = h.l(502710452, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            pVar2 = pVar;
            i15 = (o0VarL.r(pVar2) ? 4 : 2) | i14;
        } else {
            pVar2 = pVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarL.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            rVar2 = rVar;
            i15 |= o0VarL.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarL.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarL.r(aVar) ? 16384 : 8192;
        }
        if (o0VarL.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            long j8 = ((d0) d92.b.a(o0VarL).d().b().f76497a.getF182175a()).f128833a;
            long jE = hb.a.e(o0VarL);
            c1 c1Var = c1.f87691a;
            long jC = d0.c(0.5f, j8, 14);
            c1Var.getClass();
            d0.f128823b.getClass();
            long j14 = d0.f128832k;
            s7.f89624a.getClass();
            j2 j2VarA = s7.a(o0VarL);
            b1 b1Var = j2VarA.X;
            if (b1Var == null) {
                d0.f128823b.getClass();
                long j15 = d0.f128831j;
                l0.f123085a.getClass();
                b1Var = new b1(j15, k2.d(j2VarA, l0.f123088d), j15, d0.c(l0.f123087c, k2.d(j2VarA, l0.f123086b), 14), null);
                j2VarA.X = b1Var;
            }
            b1 b1VarA = b1Var.a(j14, j14, j14, jC);
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            float f15 = 8;
            f.a(pVar2, str, rVar2, z14, b1VarA, j8, jE, l.d(f14, f15, f14, f15), aVar, o0VarL, (i15 & 14) | 12582912 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | ((i15 << 12) & 234881024));
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(this, pVar, str, rVar, z14, aVar, i14, 0);
        }
    }

    @o13.e
    public final void b(String str, @SuppressLint({"ModifierParameter"}) r rVar, boolean z14, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        r rVar2;
        boolean z15;
        o0 o0VarL = h.l(-186613741, aVar, str, mVar);
        int i16 = (o0VarL.B(str) ? 4 : 2) | i14;
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarL.B(rVar) ? 32 : 16;
        }
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarL.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarL.r(aVar) ? 2048 : 1024;
        }
        int i19 = i16 | (o0VarL.B(this) ? 16384 : 8192);
        if (o0VarL.n(i19 & 1, (i19 & 9363) != 9362)) {
            if (i17 != 0) {
                rVar = r.S;
            }
            z15 = i18 != 0 ? true : z14;
            x1 x1Var = n.f135158a;
            int i24 = i19 << 3;
            rVar2 = rVar;
            a(null, str, rVar2, z15, aVar, o0VarL, (i24 & 112) | 6 | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752));
        } else {
            o0VarL.e();
            rVar2 = rVar;
            z15 = z14;
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(this, str, rVar2, z15, aVar, i14, i15, 0);
        }
    }
}
