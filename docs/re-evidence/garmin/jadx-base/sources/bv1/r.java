package bv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import kotlin.t1;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.g4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbv1/r;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/view/LayoutInflater;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f21431b;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_activity_view, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f21431b = (ComposeView) this.f21420a.findViewById(R.id.composable_container);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:52:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x020c  */
    public final void c(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) throws Throwable {
        Throwable th3;
        h5.g.a.f fVar;
        int i15;
        h4.g.b bVar;
        h4.r.a aVar2;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        o0 o0VarE = mVar.E(-461259512);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.r rVarF = x2.f(rVar, 1.0f);
            long jF = d92.b.a(o0VarE).c().f();
            bVar2.getClass();
            h4.r rVarE = u1.n.e(rVarF, jF, k2.i.a(j92.b.f97900c.f97911c));
            bVar2.getClass();
            h4.r rVarY = c2.l.y(rVarE, eVar.f97920e);
            boolean z15 = (i16 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new as.n(aVar, 23);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new as.n(aVar, 23);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarY, true, null, null, (e23.a) objQ, 14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                th3 = null;
            } else {
                th3 = null;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (z14) {
                    i15 = R.string.final_report;
                } else {
                    i15 = R.string.progress_report;
                }
                if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5d) {
                    bVar = h4.d.a.f81533k;
                } else {
                    bVar = h4.d.a.f81534l;
                }
                aVar2 = h4.r.S;
                s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                bVar2.getClass();
                h4.r rVarC3 = c2.l.C(aVar2, 0.0f, 0.0f, eVar.f97919d, 0.0f, 11);
                s62.a.f157643a.getClass();
                u4.d dVarA = g4.a(t62.b.f162798a);
                long j8 = d92.b.a(o0VarE).f().f63508c;
                gl.c.f77766a.getClass();
                long jB = gl.c.a(o0VarE).b();
                bVar2.getClass();
                g02.i.a(rVarC3, dVarA, j8, jB, j92.b.f97901d.f97906e, 0.0f, null, o0VarE, 0, 224);
                String strQ = gl1.y.Q(o0VarE, i15);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
                d6.p.f57793b.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 0, 0, null, x0VarB, o0VarE, 0, 384, 126974);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (z14) {
                i15 = R.string.final_report;
            } else {
                i15 = R.string.progress_report;
            }
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5d) {
                bVar = h4.d.a.f81533k;
            } else {
                bVar = h4.d.a.f81534l;
            }
            aVar2 = h4.r.S;
            s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            bVar2.getClass();
            h4.r rVarC4 = c2.l.C(aVar2, 0.0f, 0.0f, eVar.f97919d, 0.0f, 11);
            s62.a.f157643a.getClass();
            u4.d dVarA2 = g4.a(t62.b.f162798a);
            long j14 = d92.b.a(o0VarE).f().f63508c;
            gl.c.f77766a.getClass();
            long jB2 = gl.c.a(o0VarE).b();
            bVar2.getClass();
            g02.i.a(rVarC4, dVarA2, j14, jB2, j92.b.f97901d.f97906e, 0.0f, null, o0VarE, 0, 224);
            String strQ2 = gl1.y.Q(o0VarE, i15);
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            d6.p.f57793b.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 0, 0, null, x0VarB2, o0VarE, 0, 384, 126974);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) this, (Object) rVar, z14, (Object) aVar, i14, 5);
        }
    }
}
