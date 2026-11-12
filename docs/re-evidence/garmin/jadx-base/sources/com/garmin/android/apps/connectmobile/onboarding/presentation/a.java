package com.garmin.android.apps.connectmobile.onboarding.presentation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import h4.d;
import h4.k;
import h5.e0;
import h5.g;
import i3.mh;
import j92.e;
import j92.f;
import java.util.List;
import lc.u0;
import o60.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.h0;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import p90.h;
import r70.q;
import r70.r;
import s31.c;
import s9.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/presentation/a;", "Lr70/r;", "Ls31/c;", "stateHolder", "<init>", "(Ls31/c;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39735a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.onboarding.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/onboarding/presentation/a$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0717a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f39736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f39737b;

        public C0717a(n0 n0Var, k0 k0Var) {
            this.f39736a = n0Var;
            this.f39737b = k0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f39736a.getF158016a().d(this.f39737b);
        }
    }

    public a(c cVar) {
        cVar.getClass();
        this.f39735a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    @Override // r70.r
    public final void a(final h4.r rVar, final q qVar, m mVar, final int i14) {
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        String strP;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -839225550);
        int i15 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            List<k31.a> list = (List) s9.c.b(this.f39735a.f156453a, null, o0VarQ, 48).getF182175a();
            if (list == null || list.isEmpty()) {
                p2VarI0 = o0VarQ.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new p(this) { // from class: r31.k

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.onboarding.presentation.a f150037b;

                    {
                        this.f150037b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = i16;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i17) {
                            case 0:
                                this.f150037b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                            default:
                                this.f150037b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                n0 n0Var = (n0) o0VarQ.A(j.f158018a);
                boolean zR = o0VarQ.r(list) | o0VarQ.r(this) | o0VarQ.r(n0Var);
                Object objQ = o0VarQ.q();
                m.a aVar = m.f135153a;
                if (zR) {
                    objQ = new h(n0Var, 21, list, this);
                    o0VarQ.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new h(n0Var, 21, list, this);
                        o0VarQ.K(objQ);
                    }
                }
                l0.a(n0Var, (l) objQ, o0VarQ);
                int size = list.size();
                Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
                if (size == 1) {
                    o0VarQ.C(-362811719);
                    strP = y.P(R.string.lbl_num_item_singular, new Object[]{Integer.valueOf(size)}, o0VarQ);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(-362719494);
                    strP = y.P(R.string.lbl_num_items_plural, new Object[]{Integer.valueOf(size)}, o0VarQ);
                    o0VarQ.g0(false);
                }
                String strP2 = oi0.c.P(x.k(y.Q(o0VarQ, R.string.lbl_device_setup), y.Q(o0VarQ, R.string.lbl_carousel), strP));
                boolean zB = o0VarQ.B(strP2);
                Object objQ2 = o0VarQ.q();
                if (zB) {
                    objQ2 = new b(strP2, 16);
                    o0VarQ.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new b(strP2, 16);
                        o0VarQ.K(objQ2);
                    }
                }
                h4.r rVarC = v.c((l) objQ2, rVar, false);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, d.a.f81536n, o0VarQ, 0);
                int iHashCode = Long.hashCode(o0VarQ.U);
                i2 i2VarA0 = o0VarQ.a0();
                h4.r rVarC2 = k.c(rVarC, o0VarQ);
                g.V.getClass();
                e0.a aVar2 = g.a.f81805b;
                if (o0VarQ.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarQ.z();
                if (o0VarQ.T) {
                    o0VarQ.M(aVar2);
                } else {
                    o0VarQ.c();
                }
                b4.c(g.a.f81810g, zVarA, o0VarQ);
                b4.c(g.a.f81809f, i2VarA0, o0VarQ);
                g.a.b bVar = g.a.f81813j;
                if (o0VarQ.T || !s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarQ, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC2, o0VarQ);
                b0 b0Var = b0.f22601a;
                String strQ = y.Q(o0VarQ, R.string.lbl_device_setup);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar2.getClass();
                float f15 = eVar.f97920e;
                bVar2.getClass();
                h4.r rVarC3 = c2.l.C(aVar3, f14, f15, eVar.f97920e, 0.0f, 8);
                Object objQ3 = o0VarQ.q();
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new qv1.l(19);
                    o0VarQ.K(objQ3);
                }
                h4.r rVarC4 = v.c((l) objQ3, rVarC3, false);
                d6.h.f57752b.getClass();
                d6.h hVarA = d6.h.a(d6.h.f57757g);
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(f.f97930g), o0VarQ), o0VarQ, 0, 0, 130044);
                o0VarQ = o0VarQ;
                o0VarQ.C(-1542644884);
                for (k31.a aVar4 : list) {
                    boolean zR2 = o0VarQ.r(context);
                    Object objQ4 = o0VarQ.q();
                    if (zR2 || objQ4 == m.a.f135155b) {
                        objQ4 = new ot.c(context, 8);
                        o0VarQ.K(objQ4);
                    }
                    l lVar = (l) objQ4;
                    boolean zR3 = o0VarQ.r(context) | o0VarQ.r(aVar4);
                    Object objQ5 = o0VarQ.q();
                    if (zR3 || objQ5 == m.a.f135155b) {
                        objQ5 = new ph1.d(28, context, aVar4);
                        o0VarQ.K(objQ5);
                    }
                    l lVar2 = (l) objQ5;
                    boolean zR4 = o0VarQ.r(this);
                    Object objQ6 = o0VarQ.q();
                    if (zR4 || objQ6 == m.a.f135155b) {
                        objQ6 = new r12.a(this, 5);
                        o0VarQ.K(objQ6);
                    }
                    r31.n.a(b0Var, aVar4, lVar, lVar2, (p) objQ6, o0VarQ, 6);
                }
                o0VarQ.g0(false);
                o0VarQ.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarQ.e();
        p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new p(this) { // from class: r31.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.onboarding.presentation.a f150037b;

                {
                    this.f150037b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            this.f150037b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            this.f150037b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
