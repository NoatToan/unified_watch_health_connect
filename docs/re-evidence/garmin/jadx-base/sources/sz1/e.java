package sz1;

import com.google.android.exoplayer2.C;
import o4.d0;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(final Float f14, oz1.u uVar, final float f15, final float f16, final h4.r rVar, final z3.e eVar, p3.m mVar, final int i14) {
        int i15;
        o0 o0Var;
        long j8;
        long j14;
        long j15;
        long jC;
        boolean z14;
        d0 d0VarA;
        long jC2;
        final oz1.u uVar2 = uVar;
        o0 o0VarE = mVar.E(-1477919824);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(uVar2 == null ? -1 : uVar2.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.i(f16) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(rVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        boolean z15 = true;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            boolean z16 = f14 != null || (uVar2 != null && uVar2.equals(oz1.u.POOR));
            boolean z17 = f14 != null || (uVar2 != null && uVar2.equals(oz1.u.LOW));
            boolean z18 = f14 != null || (uVar2 != null && uVar2.equals(oz1.u.MODERATE));
            boolean z19 = f14 != null || (uVar2 != null && uVar2.equals(oz1.u.HIGH));
            if (f14 == null && (uVar2 == null || !uVar2.equals(oz1.u.PRIME))) {
                z15 = false;
            }
            f02.e.f67730a.getClass();
            long jC3 = f02.e.c(o0VarE);
            if (z16) {
                o0VarE.C(1353257146);
                oz1.u.a aVar = oz1.u.f134627e;
                oz1.u uVar3 = oz1.u.POOR;
                aVar.getClass();
                long jC4 = oz1.u.a.c(uVar3, o0VarE);
                o0VarE.g0(false);
                j8 = jC4;
            } else {
                o0VarE.C(1353257653);
                o0VarE.g0(false);
                j8 = jC3;
            }
            boolean z24 = z17;
            z72.l lVar = new z72.l(25.0f, j8, null);
            if (z24) {
                o0VarE.C(1353263418);
                oz1.u.a aVar2 = oz1.u.f134627e;
                oz1.u uVar4 = oz1.u.LOW;
                aVar2.getClass();
                long jC5 = oz1.u.a.c(uVar4, o0VarE);
                o0VarE.g0(false);
                j14 = jC5;
            } else {
                o0VarE.C(1353263925);
                o0VarE.g0(false);
                j14 = jC3;
            }
            z72.l lVar2 = new z72.l(25.0f, j14, null);
            if (z18) {
                o0VarE.C(1353270170);
                oz1.u.a aVar3 = oz1.u.f134627e;
                oz1.u uVar5 = oz1.u.MODERATE;
                aVar3.getClass();
                long jC6 = oz1.u.a.c(uVar5, o0VarE);
                o0VarE.g0(false);
                j15 = jC6;
            } else {
                o0VarE.C(1353270677);
                o0VarE.g0(false);
                j15 = jC3;
            }
            z72.l lVar3 = new z72.l(25.0f, j15, null);
            if (z19) {
                o0VarE.C(1353276538);
                oz1.u.a aVar4 = oz1.u.f134627e;
                oz1.u uVar6 = oz1.u.HIGH;
                aVar4.getClass();
                jC = oz1.u.a.c(uVar6, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1353277045);
                o0VarE.g0(false);
                jC = jC3;
            }
            z72.l lVar4 = new z72.l(20.0f, jC, null);
            if (z15) {
                o0VarE.C(1353283002);
                oz1.u.a aVar5 = oz1.u.f134627e;
                oz1.u uVar7 = oz1.u.PRIME;
                aVar5.getClass();
                jC3 = oz1.u.a.c(uVar7, o0VarE);
                z14 = false;
            } else {
                z14 = false;
                o0VarE.C(1353283509);
            }
            o0VarE.g0(z14);
            i53.f fVarA = i53.a.a(lVar, lVar2, lVar3, lVar4, new z72.l(5.0f, jC3, null));
            if (uVar == null) {
                o0VarE.C(-997730265);
                o0VarE.g0(z14);
                uVar2 = uVar;
                d0VarA = null;
            } else {
                o0VarE.C(1353288474);
                oz1.u.f134627e.getClass();
                uVar2 = uVar;
                long jC7 = oz1.u.a.c(uVar2, o0VarE);
                o0VarE.g0(z14);
                d0VarA = d0.a(jC7);
            }
            if (d0VarA == null) {
                o0VarE.C(1353289416);
                jC2 = f02.e.c(o0VarE);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(1353288269);
                o0VarE.g0(z14);
                jC2 = d0VarA.f128833a;
            }
            int i16 = i15 << 9;
            o0Var = o0VarE;
            z72.k.a(rVar, fVarA, f14 != null ? Float.valueOf(f14.floatValue() / 100.0f) : null, d0.a(jC2), null, f15, f16, false, false, z3.f.c(-936949892, new aa2.k(eVar, 12), o0VarE), o0Var, ((i15 >> 12) & 14) | C.ENCODING_PCM_32BIT | (458752 & i16) | (i16 & 3670016), 400);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: sz1.d
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.a(f14, uVar2, f15, f16, rVar, eVar, (p3.m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
