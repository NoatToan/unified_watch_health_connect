package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/e3;", "Lh82/c;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e3 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11927f = 0;

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1390233697, true, new b3(this, 0)), 4, null));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0140  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:54:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cd  */
    public final void g(final int i14, int i15, int i16, p3.m mVar, final int i17) {
        int i18;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        final int i19 = i15;
        final int i24 = i16;
        p3.o0 o0VarE = mVar.E(-1380664401);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i17 & 6) == 0) {
            i18 = (o0VarE.k(i14) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= o0VarE.k(i19) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i18 |= o0VarE.k(i24) ? 256 : 128;
        }
        if (o0VarE.n(i18 & 1, (i18 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.u2 u2Var = c2.u2.f22900a;
                t4.d dVarA = n5.c.a(i14, o0VarE, i18 & 14);
                String strQ = gl1.y.Q(o0VarE, i19);
                h4.g.b bVar3 = h4.d.a.f81534l;
                h4.r rVarC3 = u2Var.c(aVar, bVar3);
                bVar.getClass();
                u1.y0.a(dVarA, strQ, c2.x2.u(rVarC3, j92.b.f97901d.f97904c), null, null, 0.0f, null, o0VarE, 0, 120);
                h4.r rVarC4 = u2Var.c(aVar, bVar3);
                bVar.getClass();
                zVarA = c2.y.a(c2.j.i(eVar.f97917b), h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                i19 = i15;
                String strQ2 = gl1.y.Q(o0VarE, i19);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                i24 = i16;
                String strQ3 = gl1.y.Q(o0VarE, i24);
                fVar2.getClass();
                mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u2 u2Var2 = c2.u2.f22900a;
            t4.d dVarA2 = n5.c.a(i14, o0VarE, i18 & 14);
            String strQ4 = gl1.y.Q(o0VarE, i19);
            h4.g.b bVar4 = h4.d.a.f81534l;
            h4.r rVarC5 = u2Var2.c(aVar, bVar4);
            bVar.getClass();
            u1.y0.a(dVarA2, strQ4, c2.x2.u(rVarC5, j92.b.f97901d.f97904c), null, null, 0.0f, null, o0VarE, 0, 120);
            h4.r rVarC6 = u2Var2.c(aVar, bVar4);
            bVar.getClass();
            zVarA = c2.y.a(c2.j.i(eVar.f97917b), h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC6, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            i19 = i15;
            String strQ5 = gl1.y.Q(o0VarE, i19);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            mh.c(strQ5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            i24 = i16;
            String strQ6 = gl1.y.Q(o0VarE, i24);
            fVar3.getClass();
            mh.c(strQ6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: aq.d3
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    int i25 = e3.f11927f;
                    this.f11915a.g(i14, i19, i24, mVar2, p3.p0.t(i17 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void h(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(750823732);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.r rVar = h82.r.f82497a;
            rVar.D(R.string.ski_slope_difficulty_region_classification_2, o0VarE, 48);
            rVar.c(o0VarE, 6);
            int i16 = (h82.c.f82429e << 9) | ((i15 << 9) & 7168);
            g(R.drawable.ski_difficulty_green, R.string.lbl_green_color, R.string.difficulty_level_beginner, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_blue, R.string.lbl_blue_color, R.string.difficulty_level_intermediate, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_red, R.string.lbl_red_color, R.string.difficulty_level_advanced, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_black, R.string.lbl_black_color, R.string.difficulty_level_expert, o0VarE, i16);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c3(this, i14, 1);
        }
    }

    public final void i(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(187209596);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.r rVar = h82.r.f82497a;
            rVar.D(R.string.ski_slope_difficulty_region_classification_3, o0VarE, 48);
            rVar.c(o0VarE, 6);
            int i16 = (h82.c.f82429e << 9) | ((i15 << 9) & 7168);
            g(R.drawable.ski_difficulty_green, R.string.lbl_green_color, R.string.difficulty_level_beginner, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_red, R.string.lbl_red_color, R.string.difficulty_level_intermediate, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_black, R.string.lbl_black_color, R.string.difficulty_level_advanced, o0VarE, i16);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c3(this, i14, 3);
        }
    }

    public final void j(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(370734939);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(338549294, new b3(this, 1), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c3(this, i14, 0);
        }
    }

    public final void k(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1242963045);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.r rVar = h82.r.f82497a;
            rVar.D(R.string.ski_slope_difficulty_region_classification_1, o0VarE, 48);
            rVar.c(o0VarE, 6);
            int i16 = (h82.c.f82429e << 9) | ((i15 << 9) & 7168);
            g(R.drawable.ski_difficulty_green, R.string.lbl_green_color, R.string.difficulty_level_easy_beginner, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_blue, R.string.lbl_blue_color, R.string.difficulty_level_intermediate, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_black, R.string.lbl_black_color, R.string.difficulty_level_advanced, o0VarE, i16);
            rVar.c(o0VarE, 6);
            g(R.drawable.ski_difficulty_double_black, R.string.ski_difficulty_level_double_black, R.string.difficulty_level_expert, o0VarE, i16);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c3(this, i14, 2);
        }
    }
}
