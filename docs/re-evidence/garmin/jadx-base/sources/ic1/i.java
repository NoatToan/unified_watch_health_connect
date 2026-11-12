package ic1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b21.p9;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import ew1.o1;
import f2.o;
import gl1.y;
import h4.r;
import i3.bf;
import java.util.List;
import l72.u1;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lic1/i;", "Lh82/c;", "<init>", "()V", "a", "Lhc1/b;", "pulseOxSupportedDevice", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f92620g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f92621f = true;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ic1/i$b", "Lbc1/b;", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements bc1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<hc1.b> f92622a;

        public b(p1<hc1.b> p1Var) {
            this.f92622a = p1Var;
        }

        @Override // bc1.b
        public final void a(hc1.b bVar) {
            a aVar = i.f92620g;
            this.f92622a.setValue(bVar);
        }
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1981466004);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f92621f = bundle.getBoolean("SHOW_PULSE_OX_SETTINGS_EXTRA", true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, bundle, i14, 28);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        String strE = a0.e(R.string.lbl_help, context);
        final int i14 = 0;
        final int i15 = 1;
        return x.k(new h82.c.b("DEFAULT_ACTION", strE, null, new z3.e(-1658451368, true, new q(this) { // from class: ic1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f92619b;

            {
                this.f92619b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i14;
                i iVar = this.f92619b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i.a aVar = i.f92620g;
                switch (i16) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            iVar.g(0, 1, mVar, false);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            iVar.g(6, 0, mVar, true);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null), new h82.c.b("BLOOD_EFFICIENCY_ACTION", strE, null, new z3.e(-1394754343, true, new q(this) { // from class: ic1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f92619b;

            {
                this.f92619b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i15;
                i iVar = this.f92619b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i.a aVar = i.f92620g;
                switch (i16) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            iVar.g(0, 1, mVar, false);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            iVar.g(6, 0, mVar, true);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null));
    }

    public final void g(int i14, int i15, p3.m mVar, boolean z14) {
        int i16;
        o0 o0VarE = mVar.E(1416842207);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            if (i17 != 0) {
                z14 = false;
            }
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1733726700, new p9(z14, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), this, 6), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(this, z14, i14, i15);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-813974739);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        boolean z14 = true;
        boolean z15 = false;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            y0 y0Var = new y0(jg.b.z(bc1.a.f17414a));
            o0VarE.C(-545670110);
            hc1.a aVar = hc1.a.NORMAL;
            String strP = y.P(R.string.string_line_string_pattern, new Object[]{y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.I(aVar))}, o0VarE), y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.J(aVar))}, o0VarE)}, o0VarE);
            o0VarE.g0(false);
            o0VarE.C(-545657918);
            hc1.a aVar2 = hc1.a.MODERATE;
            String strP2 = y.P(R.string.string_line_string_pattern, new Object[]{y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.I(aVar2))}, o0VarE), y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.J(aVar2))}, o0VarE)}, o0VarE);
            o0VarE.g0(false);
            o0VarE.C(-545645886);
            hc1.a aVar3 = hc1.a.LOW;
            String strP3 = y.P(R.string.string_line_string_pattern, new Object[]{y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.I(aVar3))}, o0VarE), y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.J(aVar3))}, o0VarE)}, o0VarE);
            o0VarE.g0(false);
            List listK = x.k(strP, strP2, strP3, e0.f(ge1.b.I(hc1.a.HARMFUL) + 1, "< ", "%"));
            float f14 = 1.0f;
            g6.f.a aVar4 = g6.f.f75994b;
            r rVarZ = c2.l.z(x2.d(r.S, 1.0f), 32, 16);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o0VarE.C(1377575502);
            int i17 = 0;
            while (i17 < i15) {
                long jA = n5.a.a(o0VarE, ((Number) y0Var.get(i17)).intValue());
                String str = (String) listK.get(i17);
                r rVarF = x2.f(r.S, f14);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new bf(29);
                    o0VarE.K(objQ);
                }
                r rVarC2 = v.c((e23.l) objQ, rVarF, z14);
                boolean zR = o0VarE.r(this) | o0VarE.r(context) | o0VarE.B(str);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new a42.b(this, context, str);
                    o0VarE.K(objQ2);
                }
                r rVarB = v.b(rVarC2, (e23.l) objQ2);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC3 = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar6 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                p3.c<?> cVar2 = cVar;
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                u1.d(u2.f22900a, d0.a(jA), str, 1.0f, o0VarE, 3078, 0);
                o0VarE.g0(true);
                i17++;
                context = context;
                z14 = true;
                cVar = cVar2;
                i15 = 4;
                z15 = false;
                f14 = 1.0f;
            }
            o0VarE.g0(z15);
            o0VarE.g0(z14);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fp0.l(this, i14, 26);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lic1/i$a;", "", "<init>", "()V", "", "MAYO_CLINIC_LINK", "Ljava/lang/String;", "BLOOD_EFFICIENCY_ACTION", "SHOW_PULSE_OX_SETTINGS_EXTRA", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
