package da0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.ConnectionResult;
import f5.z0;
import i3.i7;
import kotlin.o3;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s1.n0;
import u1.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, h4.r rVar, String str, p3.m mVar) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1481157937);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            final long jD = hb.a.d(d92.b.f58623a, o0VarE);
            wf.f.a aVar = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar.f184930c = str;
            wf.g.a(aVar);
            wf.f fVarA = aVar.a();
            f5.k.f68985a.getClass();
            f5.k.a.c cVar = f5.k.a.f68989d;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            t4.d dVarA = n5.c.a(R.drawable.devices, o0VarE, 0);
            t4.d dVarA2 = n5.c.a(R.drawable.devices, o0VarE, 0);
            h4.r rVarC = o3.c(rVar, "device_image");
            o4.e0 e0Var = (o4.e0) p1Var.getF182175a();
            boolean zL = o0VarE.l(jD);
            Object objQ2 = o0VarE.q();
            if (zL || objQ2 == c2565a) {
                objQ2 = new e23.l() { // from class: da0.e
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                ((jf.d.c.C1893c) obj).getClass();
                                p1Var.setValue(o4.e0.a.a(o4.e0.f128843b, jD));
                                break;
                            default:
                                ((jf.d.c.b) obj).getClass();
                                p1Var.setValue(o4.e0.a.a(o4.e0.f128843b, jD));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            e23.l lVar = (e23.l) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new a11.m(p1Var, 14);
                o0VarE.K(objQ3);
            }
            e23.l lVar2 = (e23.l) objQ3;
            boolean zL2 = o0VarE.l(jD);
            Object objQ4 = o0VarE.q();
            if (zL2 || objQ4 == c2565a) {
                final int i17 = 1;
                objQ4 = new e23.l() { // from class: da0.e
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                ((jf.d.c.C1893c) obj).getClass();
                                p1Var.setValue(o4.e0.a.a(o4.e0.f128843b, jD));
                                break;
                            default:
                                ((jf.d.c.b) obj).getClass();
                                p1Var.setValue(o4.e0.a.a(o4.e0.f128843b, jD));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            }
            o0Var = o0VarE;
            jf.r.b(fVarA, null, rVarC, dVarA, dVarA2, null, lVar, lVar2, (e23.l) objQ4, gVar, cVar, e0Var, o0Var, 817889328, 6, 26656);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.d(str, rVar, i14);
        }
    }

    public static final void b(o90.a aVar, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        Integer num = aVar.f130963b;
        o0 o0VarE = mVar.E(77306389);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (num != null) {
                o0VarE.C(932309094);
                t4.d dVarA = n5.c.a(num.intValue(), o0VarE, 0);
                h4.d.f81522a.getClass();
                y0.a(dVarA, null, o3.c(rVar, "device_image"), h4.d.a.f81528f, null, 0.0f, null, o0VarE, 3120, 112);
                o0VarE.g0(false);
            } else {
                o0VarE.C(932577337);
                a(i15 & 112, rVar, aVar.f130962a, o0VarE);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(aVar, rVar, i14, 1);
        }
    }

    public static final void c(o90.a aVar, int i14, long j8, h4.r rVar, p3.m mVar, int i15) {
        h4.r rVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(674000475);
        int i16 = i15 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            rVar2 = rVar;
            h4.r rVarC = h4.k.c(rVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar3 = h4.r.S;
            b(aVar, x2.c(aVar3, 1.0f), o0VarE, (i16 & 14) | 48);
            t4.d dVarA = n5.c.a(i14, o0VarE, (i16 >> 3) & 14);
            d92.b.f58623a.getClass();
            long j14 = d92.b.a(o0VarE).f().f63508c;
            h4.r rVarC2 = uVar.c(aVar3, h4.d.a.f81532j);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarG = c2.l.g(x2.c(u1.n.e(l4.k.b(c2.l.C(rVarC2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), k2.i.f102406a), j8, m1.f128891a), 0.25f), 1.0f);
            bVar2.getClass();
            i7.a(dVarA, null, c2.l.y(rVarG, eVar.f97920e), j14, o0VarE, 48, 0);
            o0VarE.g0(true);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.m(aVar, i14, j8, rVar2, i15);
        }
    }

    public static final void d(o90.a aVar, u4.d dVar, long j8, h4.r rVar, p3.m mVar, int i14) {
        h4.r rVar2;
        aVar.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(75052268);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            rVar2 = rVar;
            h4.r rVarC = h4.k.c(rVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar3 = h4.r.S;
            b(aVar, x2.c(aVar3, 1.0f), o0VarE, (i15 & 14) | 48);
            d92.b.f58623a.getClass();
            long j14 = d92.b.a(o0VarE).f().f63508c;
            h4.r rVarC2 = uVar.c(aVar3, h4.d.a.f81532j);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarG = c2.l.g(x2.c(u1.n.e(l4.k.b(c2.l.C(rVarC2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), k2.i.f102406a), j8, m1.f128891a), 0.25f), 1.0f);
            bVar2.getClass();
            i7.b(dVar, null, c2.l.y(rVarG, eVar.f97920e), j14, o0VarE, ((i15 >> 3) & 14) | 48, 0);
            o0VarE.g0(true);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(aVar, dVar, j8, rVar2, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(o90.a aVar, h4.r rVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1532695125);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            n0.a aVarA = s1.p0.a(s1.p0.c(null, o0VarE, 1), 0.0f, 360.0f, s1.l.a(s1.l.d(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, s1.e0.f155563d, 2), s1.y0.Restart, 4), null, o0VarE, 4536, 8);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar3 = h4.r.S;
            b(aVar, x2.c(aVar3, 0.8f), o0VarE, (i15 & 14) | 48);
            t4.d dVarA = n5.c.a(2131233341, o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.default_image_view_content_description);
            h4.r rVarG = l4.k.g(x2.c(aVar3, 1.0f), ((Number) aVarA.f155651d.getF182175a()).floatValue());
            f5.k.f68985a.getClass();
            y0.a(dVarA, strQ, rVarG, null, f5.k.a.f68987b, 0.0f, null, o0VarE, 24576, 104);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(aVar, rVar, i14, 0);
        }
    }
}
