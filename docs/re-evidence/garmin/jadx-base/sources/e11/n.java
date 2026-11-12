package e11;

import am.l1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import b63.o;
import c2.h2;
import c2.k3;
import c2.m3;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.s0;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.garmin.proto.generated.GDIDataTypes;
import com.google.android.exoplayer2.C;
import et1.a2;
import ew1.c2;
import g22.k;
import i3.b3;
import i3.ba;
import i3.c5;
import i3.fe;
import i3.h7;
import i3.i7;
import i3.j2;
import i3.k2;
import i3.l3;
import i3.mh;
import i3.na;
import i3.ph;
import i3.qh;
import i3.ri;
import i3.s7;
import i3.sg;
import i3.v2;
import i3.w4;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import lc.m0;
import m92.n0;
import mt0.k4;
import n3.f1;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p006l2.z1;
import p008y1.e1;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p3.y3;
import r53.p2;
import rk0.c1;
import rk0.d1;
import rk0.w0;
import s5.x0;
import tn2.q0;
import ty1.g2;
import vd0.l0;
import wn.g;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f61925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f61927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f61928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f61929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f61930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f61931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f61932i;

    public /* synthetic */ n(Context context, r0 r0Var, rs.c cVar, rs.d dVar, wg0.a aVar, wg0.d dVar2, xg0.n nVar, boolean z14) {
        this.f61924a = 23;
        this.f61927d = nVar;
        this.f61928e = aVar;
        this.f61929f = context;
        this.f61930g = r0Var;
        this.f61925b = z14;
        this.f61931h = cVar;
        this.f61932i = dVar;
        this.f61926c = dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01e3  */
    private final Object a(Object obj, Object obj2) {
        String str = (String) this.f61927d;
        wn.a aVar = (wn.a) this.f61928e;
        sn.h hVar = (sn.h) this.f61929f;
        im.b bVar = (im.b) this.f61930g;
        e23.a aVar2 = (e23.a) this.f61931h;
        final Context context = (Context) this.f61932i;
        final l22.a aVar3 = (l22.a) this.f61926c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarF = x2.f(aVar4, 1.0f);
            int i14 = k3.f22728a;
            m3.f22753w.getClass();
            c2.g gVar = m3.a.c(mVar).f22756b;
            p3.f22815b.getClass();
            h4.r rVarX = c2.l.x(rVarF, n3.c(n3.d(gVar, p3.f22826m), mVar));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarX, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar);
            float f14 = 16;
            g6.f.a aVar6 = g6.f.f75994b;
            mh.c(str, c2.l.C(aVar4, f14, f14, f14, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
            mVar.C(-1332078888);
            final wn.g gVarB = aVar.b(1, hVar);
            final wn.g gVarB2 = aVar.b(2, hVar);
            l72.x0 x0Var = l72.x0.f111346a;
            h4.r rVarY = c2.l.y(aVar4, f14);
            final int i15 = 0;
            z3.e eVarC = z3.f.c(-1264046597, new e23.q() { // from class: vn.b
                @Override // e23.q
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    int i16 = i15;
                    g gVar2 = gVarB2;
                    l22.a aVar7 = aVar3;
                    Context context2 = context;
                    g gVar3 = gVarB;
                    switch (i16) {
                        case 0:
                            t2 t2Var = (t2) obj3;
                            m mVar2 = (m) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            t2Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var2 = n.f135158a;
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                c0235a.f16962a.put("merge", c.b(gVar3, context2, aVar7));
                                b92.a aVarB = c0235a.b();
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                c0235a2.f16962a.put("merge", c.b(gVar2, context2, aVar7));
                                b92.a aVarB2 = c0235a2.b();
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                String strC = c.c(gVar3, context2);
                                String str10 = (gVar3 == null || (str5 = gVar3.f186102c) == null) ? "" : str5;
                                String str11 = (gVar3 == null || (str4 = gVar3.f186101b) == null) ? "" : str4;
                                int i17 = b92.a.f16960b;
                                int i18 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                                x0Var2.a(i18, 52, aVarB, t2Var, null, null, strC, str10, str11, null, mVar2);
                                x0Var2.a(i18, 52, aVarB2, t2Var, null, null, c.c(gVar2, context2), (gVar2 == null || (str3 = gVar2.f186102c) == null) ? "" : str3, (gVar2 == null || (str2 = gVar2.f186101b) == null) ? "" : str2, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj3;
                            m mVar3 = (m) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            t2Var2.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                x1 x1Var3 = n.f135158a;
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                c0235a3.f16962a.put("merge", c.b(gVar3, context2, aVar7));
                                b92.a aVarB3 = c0235a3.b();
                                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                c0235a4.f16962a.put("merge", c.b(gVar2, context2, aVar7));
                                b92.a aVarB4 = c0235a4.b();
                                l72.x0 x0Var3 = l72.x0.f111346a;
                                String strC2 = c.c(gVar3, context2);
                                String str12 = (gVar3 == null || (str9 = gVar3.f186102c) == null) ? "" : str9;
                                String str13 = (gVar3 == null || (str8 = gVar3.f186101b) == null) ? "" : str8;
                                int i19 = b92.a.f16960b;
                                int i24 = (iIntValue3 & 14) | (l72.x0.f111348c << 24);
                                x0Var3.a(i24, 52, aVarB3, t2Var2, null, null, strC2, str12, str13, null, mVar3);
                                x0Var3.a(i24, 52, aVarB4, t2Var2, null, null, c.c(gVar2, context2), (gVar2 == null || (str7 = gVar2.f186102c) == null) ? "" : str7, (gVar2 == null || (str6 = gVar2.f186101b) == null) ? "" : str6, null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, mVar);
            int i16 = l72.x0.f111348c;
            x0Var.e(rVarY, eVarC, mVar, (i16 << 6) | 54, 0);
            mVar.f();
            if (this.f61925b) {
                mVar.C(-1330800231);
                final wn.g gVarB3 = aVar.b(3, hVar);
                final wn.g gVarB4 = aVar.b(4, hVar);
                h4.r rVarY2 = c2.l.y(aVar4, f14);
                final int i17 = 1;
                x0Var.e(rVarY2, z3.f.c(932680946, new e23.q() { // from class: vn.b
                    @Override // e23.q
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        String str2;
                        String str3;
                        String str4;
                        String str5;
                        String str6;
                        String str7;
                        String str8;
                        String str9;
                        int i18 = i17;
                        g gVar2 = gVarB4;
                        l22.a aVar7 = aVar3;
                        Context context2 = context;
                        g gVar3 = gVarB3;
                        switch (i18) {
                            case 0:
                                t2 t2Var = (t2) obj3;
                                m mVar2 = (m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                t2Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x1 x1Var2 = n.f135158a;
                                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                    c0235a.f16962a.put("merge", c.b(gVar3, context2, aVar7));
                                    b92.a aVarB = c0235a.b();
                                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                    c0235a2.f16962a.put("merge", c.b(gVar2, context2, aVar7));
                                    b92.a aVarB2 = c0235a2.b();
                                    l72.x0 x0Var2 = l72.x0.f111346a;
                                    String strC = c.c(gVar3, context2);
                                    String str10 = (gVar3 == null || (str5 = gVar3.f186102c) == null) ? "" : str5;
                                    String str11 = (gVar3 == null || (str4 = gVar3.f186101b) == null) ? "" : str4;
                                    int i19 = b92.a.f16960b;
                                    int i110 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                                    x0Var2.a(i110, 52, aVarB, t2Var, null, null, strC, str10, str11, null, mVar2);
                                    x0Var2.a(i110, 52, aVarB2, t2Var, null, null, c.c(gVar2, context2), (gVar2 == null || (str3 = gVar2.f186102c) == null) ? "" : str3, (gVar2 == null || (str2 = gVar2.f186101b) == null) ? "" : str2, null, mVar2);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                t2 t2Var2 = (t2) obj3;
                                m mVar3 = (m) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                t2Var2.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= mVar3.B(t2Var2) ? 4 : 2;
                                }
                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    x1 x1Var3 = n.f135158a;
                                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                    c0235a3.f16962a.put("merge", c.b(gVar3, context2, aVar7));
                                    b92.a aVarB3 = c0235a3.b();
                                    b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                    c0235a4.f16962a.put("merge", c.b(gVar2, context2, aVar7));
                                    b92.a aVarB4 = c0235a4.b();
                                    l72.x0 x0Var3 = l72.x0.f111346a;
                                    String strC2 = c.c(gVar3, context2);
                                    String str12 = (gVar3 == null || (str9 = gVar3.f186102c) == null) ? "" : str9;
                                    String str13 = (gVar3 == null || (str8 = gVar3.f186101b) == null) ? "" : str8;
                                    int i111 = b92.a.f16960b;
                                    int i24 = (iIntValue3 & 14) | (l72.x0.f111348c << 24);
                                    x0Var3.a(i24, 52, aVarB3, t2Var2, null, null, strC2, str12, str13, null, mVar3);
                                    x0Var3.a(i24, 52, aVarB4, t2Var2, null, null, c.c(gVar2, context2), (gVar2 == null || (str7 = gVar2.f186102c) == null) ? "" : str7, (gVar2 == null || (str6 = gVar2.f186101b) == null) ? "" : str6, null, mVar3);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar), mVar, (i16 << 6) | 54, 0);
                mVar.f();
            } else {
                mVar.C(-1329598981);
                mVar.f();
            }
            if (bVar != null) {
                List<o20.a> list = bVar.f94122l;
                list.getClass();
                if (list.isEmpty()) {
                    mVar.C(-1329334117);
                    mVar.f();
                } else {
                    mVar.C(-1329468657);
                    vn.a.a(bVar, aVar2, mVar, 0);
                    c2.l.f(x2.h(aVar4, f14), mVar);
                    mVar.f();
                }
            } else {
                mVar.C(-1329334117);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:28:0x0106  */
    /* JADX WARN: Code duplicated, block: B:33:0x0134  */
    /* JADX WARN: Code duplicated, block: B:38:0x015c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        final zt0.c cVar = (zt0.c) this.f61927d;
        final zc.d dVar = (zc.d) this.f61928e;
        final p1 p1Var = (p1) this.f61929f;
        p1 p1Var2 = (p1) this.f61930g;
        x3 x3Var = (x3) this.f61931h;
        p1 p1Var3 = (p1) this.f61932i;
        e2.i0 i0Var = (e2.i0) this.f61926c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        final int i14 = 1;
        final int i15 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            vt0.a aVar2 = (vt0.a) p1Var2.getF182175a();
            boolean zR = mVar.r(cVar) | mVar.r(dVar);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new g2(23, cVar, dVar);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g2(23, cVar, dVar);
                    mVar.K(objQ);
                }
            }
            vt0.f.c(aVar2, (e23.l) objQ, mVar, 0);
            boolean zR2 = mVar.r(cVar) | mVar.B(p1Var) | mVar.r(dVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new e23.l() { // from class: vt0.e
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        switch (i15) {
                            case 0:
                                o82.a aVar4 = (o82.a) obj3;
                                aVar4.getClass();
                                o oVar = aVar4.f130843a;
                                k4 k4Var = k4.CurrentWeek;
                                LocalDate localDate = gg.b.D(k4Var).toLocalDate();
                                localDate.getClass();
                                boolean zG = s.g(oVar, k.t(localDate));
                                p2 p2Var = cVar.f206959g;
                                if (zG) {
                                    p2Var.k(null, k4Var);
                                } else {
                                    p2Var.setValue(k4.LastWeek);
                                }
                                p1Var.setValue(Boolean.TRUE);
                                dVar.e();
                                break;
                            default:
                                b bVar2 = (b) obj3;
                                bVar2.getClass();
                                cVar.f206957e.k(null, bVar2);
                                p1Var.setValue(Boolean.TRUE);
                                dVar.e();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.l() { // from class: vt0.e
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i15) {
                                case 0:
                                    o82.a aVar4 = (o82.a) obj3;
                                    aVar4.getClass();
                                    o oVar = aVar4.f130843a;
                                    k4 k4Var = k4.CurrentWeek;
                                    LocalDate localDate = gg.b.D(k4Var).toLocalDate();
                                    localDate.getClass();
                                    boolean zG = s.g(oVar, k.t(localDate));
                                    p2 p2Var = cVar.f206959g;
                                    if (zG) {
                                        p2Var.k(null, k4Var);
                                    } else {
                                        p2Var.setValue(k4.LastWeek);
                                    }
                                    p1Var.setValue(Boolean.TRUE);
                                    dVar.e();
                                    break;
                                default:
                                    b bVar2 = (b) obj3;
                                    bVar2.getClass();
                                    cVar.f206957e.k(null, bVar2);
                                    p1Var.setValue(Boolean.TRUE);
                                    dVar.e();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                }
            }
            vt0.f.a(cVar, (e23.l) objQ2, mVar, 0);
            vt0.b bVar2 = (vt0.b) x3Var.getF182175a();
            boolean zR3 = mVar.r(cVar) | mVar.B(p1Var) | mVar.r(dVar);
            Object objQ3 = mVar.q();
            if (zR3) {
                objQ3 = new e23.l() { // from class: vt0.e
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        switch (i14) {
                            case 0:
                                o82.a aVar4 = (o82.a) obj3;
                                aVar4.getClass();
                                o oVar = aVar4.f130843a;
                                k4 k4Var = k4.CurrentWeek;
                                LocalDate localDate = gg.b.D(k4Var).toLocalDate();
                                localDate.getClass();
                                boolean zG = s.g(oVar, k.t(localDate));
                                p2 p2Var = cVar.f206959g;
                                if (zG) {
                                    p2Var.k(null, k4Var);
                                } else {
                                    p2Var.setValue(k4.LastWeek);
                                }
                                p1Var.setValue(Boolean.TRUE);
                                dVar.e();
                                break;
                            default:
                                b bVar3 = (b) obj3;
                                bVar3.getClass();
                                cVar.f206957e.k(null, bVar3);
                                p1Var.setValue(Boolean.TRUE);
                                dVar.e();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new e23.l() { // from class: vt0.e
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i14) {
                                case 0:
                                    o82.a aVar4 = (o82.a) obj3;
                                    aVar4.getClass();
                                    o oVar = aVar4.f130843a;
                                    k4 k4Var = k4.CurrentWeek;
                                    LocalDate localDate = gg.b.D(k4Var).toLocalDate();
                                    localDate.getClass();
                                    boolean zG = s.g(oVar, k.t(localDate));
                                    p2 p2Var = cVar.f206959g;
                                    if (zG) {
                                        p2Var.k(null, k4Var);
                                    } else {
                                        p2Var.setValue(k4.LastWeek);
                                    }
                                    p1Var.setValue(Boolean.TRUE);
                                    dVar.e();
                                    break;
                                default:
                                    b bVar3 = (b) obj3;
                                    bVar3.getClass();
                                    cVar.f206957e.k(null, bVar3);
                                    p1Var.setValue(Boolean.TRUE);
                                    dVar.e();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                }
            }
            vt0.f.b(bVar2, (e23.l) objQ3, mVar, 0);
            boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
            boolean zR4 = mVar.r(dVar);
            Object objQ4 = mVar.q();
            if (zR4) {
                objQ4 = new ii0.y(dVar, p1Var3, 3);
                mVar.K(objQ4);
            } else {
                aVar3.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new ii0.y(dVar, p1Var3, 3);
                    mVar.K(objQ4);
                }
            }
            m3.l.b(zBooleanValue, (e23.a) objQ4, null, null, null, null, z3.f.c(2056659802, new d62.f(this.f61925b, i0Var, dVar, x3Var, p1Var2), mVar), mVar, 1572864, 60);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2) {
        p3.m mVar;
        e23.a aVar = (e23.a) this.f61927d;
        c42.b bVar = (c42.b) this.f61928e;
        m0 m0Var = (m0) this.f61929f;
        q71.e eVar = (q71.e) this.f61930g;
        e23.a aVar2 = (e23.a) this.f61931h;
        c.q qVar = (c.q) this.f61932i;
        p1 p1Var = (p1) this.f61926c;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zBooleanValue) {
                mVar2.C(-252261628);
                g82.c cVar = g82.c.f76436a;
                c22.x0.f23314a.getClass();
                String strW = gl1.d.W(c22.x0.f23627sb);
                String strW2 = gl1.d.W(c22.x0.Db);
                String strQ = gl1.y.Q(mVar2, R.string.lbl_ok);
                boolean zB = mVar2.B(aVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new p40.j0(aVar, p1Var, 27);
                    mVar2.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new p40.j0(aVar, p1Var, 27);
                        mVar2.K(objQ);
                    }
                }
                cVar.c(null, strW, strW2, 0, strQ, (e23.a) objQ, null, null, false, null, mVar2, 905969664, 201);
                mVar = mVar2;
                mVar.f();
            } else {
                mVar = mVar2;
                mVar.C(-251777935);
                mVar.f();
            }
            Object cVar2 = (!this.f61925b || bVar == null) ? w32.d.INSTANCE : new c42.n.c(bVar);
            boolean zK = mVar.k(eVar == null ? -1 : eVar.ordinal()) | mVar.r(context) | mVar.r(m0Var) | mVar.B(aVar2) | mVar.r(bVar) | mVar.r(qVar);
            Object objQ2 = mVar.q();
            if (zK) {
                q0 q0Var = new q0(eVar, aVar2, bVar, m0Var, context, qVar);
                mVar.K(q0Var);
                objQ2 = q0Var;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    q0 q0Var2 = new q0(eVar, aVar2, bVar, m0Var, context, qVar);
                    mVar.K(q0Var2);
                    objQ2 = q0Var2;
                }
            }
            nc.y.a(m0Var, cVar2, null, null, null, null, null, null, null, (e23.l) objQ2, mVar, 0, 2044);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0063  */
    private final Object d(Object obj, Object obj2) {
        xg0.n nVar = (xg0.n) this.f61927d;
        wg0.a aVar = (wg0.a) this.f61928e;
        Context context = (Context) this.f61929f;
        r0 r0Var = (r0) this.f61930g;
        rs.c cVar = (rs.c) this.f61931h;
        rs.d dVar = (rs.d) this.f61932i;
        wg0.d dVar2 = (wg0.d) this.f61926c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            boolean zR = mVar.r(nVar) | mVar.r(aVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new wz1.c(23, nVar, aVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wz1.c(23, nVar, aVar);
                    mVar.K(objQ);
                }
            }
            p002j6.c.a(new gt1.j(context, r0Var, cVar, dVar, aVar, dVar2, nVar, this.f61925b), u1.w.d(rVarD, false, null, null, (e23.a) objQ, 15), null, new s0(r0Var, 14), new s0(r0Var, 13), mVar, 0, 4);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p0.t(1);
        yg2.f0.f((yg2.h) this.f61927d, (String) this.f61928e, (GDIDataTypes.MeasurementUnit) this.f61929f, this.f61925b, (e23.a) this.f61930g, (e23.l) this.f61926c, (u1.u) this.f61931h, (k2.h) this.f61932i, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:111:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:116:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:121:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:123:0x0502  */
    /* JADX WARN: Code duplicated, block: B:124:0x0506  */
    /* JADX WARN: Code duplicated, block: B:129:0x0523  */
    /* JADX WARN: Code duplicated, block: B:132:0x057d  */
    /* JADX WARN: Code duplicated, block: B:134:0x059f  */
    /* JADX WARN: Code duplicated, block: B:136:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0618  */
    /* JADX WARN: Code duplicated, block: B:146:0x061c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0639  */
    /* JADX WARN: Code duplicated, block: B:150:0x0643  */
    /* JADX WARN: Code duplicated, block: B:152:0x0651  */
    /* JADX WARN: Code duplicated, block: B:205:0x0877  */
    /* JADX WARN: Code duplicated, block: B:234:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:235:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:238:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:241:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:242:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:245:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:250:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:253:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:254:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:257:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:262:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:265:0x0b41  */
    /* JADX WARN: Code duplicated, block: B:266:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:269:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:270:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:273:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:277:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:278:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:280:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:283:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:284:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0b83  */
    /* JADX WARN: Code duplicated, block: B:288:0x0b86  */
    /* JADX WARN: Code duplicated, block: B:291:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:292:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:295:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:297:0x0c0f  */
    /* JADX WARN: Code duplicated, block: B:298:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:303:0x0c30  */
    /* JADX WARN: Code duplicated, block: B:306:0x0c43  */
    /* JADX WARN: Code duplicated, block: B:310:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:314:0x0cfa  */
    /* JADX WARN: Code duplicated, block: B:316:0x0d50  */
    /* JADX WARN: Code duplicated, block: B:59:0x026c  */
    /* JADX WARN: Code duplicated, block: B:64:0x02a1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p3.m.a aVar;
        h5.g.a.f fVar;
        float f14;
        Locale locale;
        long j8;
        long jD;
        long jC;
        long j14;
        long jA;
        long jC2;
        long jG;
        long j15;
        long j16;
        long jA2;
        long j17;
        long jA3;
        long jD2;
        j2 j2VarA;
        ph phVar;
        long j18;
        long j19;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        boolean z14;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        boolean zB;
        Object objQ2;
        boolean zB2;
        Object objQ3;
        long jB;
        e23.p pVar;
        u4.d dVar;
        h5.g.a.f fVar2;
        int i14;
        float f15;
        float f16;
        c2.z zVarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        boolean z15;
        s2 s2VarA2;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        int i15 = this.f61924a;
        boolean z16 = this.f61925b;
        int i16 = 8;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj3 = this.f61932i;
        Object obj4 = this.f61931h;
        Object obj5 = this.f61930g;
        Object obj6 = this.f61929f;
        Object obj7 = this.f61928e;
        int i17 = 9;
        Object obj8 = this.f61926c;
        Object obj9 = this.f61927d;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                x.h((v21.e) obj9, (Double) obj7, (a11.r) obj6, (g01.c) obj5, (i53.c) obj4, this.f61925b, (e23.p) obj3, (e23.l) obj8, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                e2.c.a((h4.r) obj9, (e2.i0) obj7, (h2) obj6, (c2.j.l) obj5, (h4.d.b) obj4, (e1) obj3, this.f61925b, (e23.l) obj8, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj9;
                ri riVar = (ri) obj7;
                p1 p1Var = (p1) obj6;
                e23.a aVar3 = (e23.a) obj5;
                String str2 = (String) obj4;
                e23.p pVar2 = (e23.p) obj3;
                String str3 = (String) obj8;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    h4.r rVarE = u1.n.e(aVar4, d92.b.a(mVar).c().g(), m1.f128891a);
                    float f17 = 16;
                    g6.f.a aVar5 = g6.f.f75994b;
                    h4.r rVarZ = c2.l.z(rVarE, f17, f17);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(cVar, h4.d.a.f81537o, mVar, 54);
                    int iHashCode4 = Long.hashCode(mVar.getU());
                    i2 i2VarX4 = mVar.x();
                    h4.r rVarC4 = h4.k.c(rVarZ, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar6);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX4, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC4, mVar);
                        c2.b0 b0Var = c2.b0.f22601a;
                        float f18 = 8;
                        f14 = 24;
                        h4.r rVarC5 = c2.l.C(x2.f(aVar4, 1.0f), f18, 0.0f, 0.0f, f14, 6);
                        locale = Locale.ROOT;
                        String upperCase = str.toUpperCase(locale);
                        upperCase.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var = j92.f.f97934k;
                        long jA4 = zl.a.a(mVar);
                        d6.h.f57752b.getClass();
                        mh.c(upperCase, rVarC5, jA4, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0Var, mVar, 48, 0, 130040);
                        if (d92.b.d(mVar)) {
                            j8 = 4283519313L;
                        } else {
                            j8 = 4294967295L;
                        }
                        jD = o4.f0.d(j8);
                        jC = o4.d0.c(0.2f, d92.b.a(mVar).e().e(), 14);
                        qh qhVar = qh.f89468a;
                        j14 = d92.b.a(mVar).k().f63527d;
                        jA = zl.a.a(mVar);
                        jC2 = androidx.room.a0.c(mVar);
                        jG = d92.b.a(mVar).c().g();
                        gl.c.f77766a.getClass();
                        gl.e eVar2 = gl.c.f77767b;
                        j15 = eVar2.f77785i;
                        j16 = d92.b.a(mVar).e().f63499d;
                        jA2 = zl.a.a(mVar);
                        j17 = eVar2.f77797o;
                        jA3 = zl.a.a(mVar);
                        jD2 = d92.b.a(mVar).k().d();
                        qhVar.getClass();
                        s7.f89624a.getClass();
                        j2VarA = s7.a(mVar);
                        phVar = j2VarA.f88500o0;
                        if (phVar == null) {
                            f1.f122826a.getClass();
                            long jD3 = k2.d(j2VarA, f1.f122827b);
                            long jD4 = k2.d(j2VarA, f1.f122830e);
                            long jD5 = k2.d(j2VarA, f1.f122835j);
                            long jD6 = k2.d(j2VarA, f1.f122832g);
                            long jD7 = k2.d(j2VarA, f1.f122836k);
                            long jD8 = k2.d(j2VarA, f1.f122840o);
                            long jD9 = k2.d(j2VarA, f1.f122842q);
                            o4.d0.f128823b.getClass();
                            phVar = new ph(jD3, jD6, jD7, jD8, jD4, jD5, jD9, o4.d0.f128831j, k2.d(j2VarA, f1.f122843r), k2.d(j2VarA, f1.f122844s), k2.d(j2VarA, f1.f122851z), k2.d(j2VarA, f1.B), k2.d(j2VarA, f1.A), k2.d(j2VarA, f1.C), null);
                            j2VarA.f88500o0 = phVar;
                        }
                        if (jD != 16) {
                            j18 = jD;
                        } else {
                            j18 = phVar.f89331a;
                        }
                        if (jC2 != 16) {
                            j19 = jC2;
                        } else {
                            j19 = phVar.f89332b;
                        }
                        if (jG != 16) {
                            j24 = jG;
                        } else {
                            j24 = phVar.f89333c;
                        }
                        if (j15 != 16) {
                            j25 = j15;
                        } else {
                            j25 = phVar.f89334d;
                        }
                        if (j14 != 16) {
                            j26 = j14;
                        } else {
                            j26 = phVar.f89335e;
                        }
                        if (jA != 16) {
                            j27 = jA;
                        } else {
                            j27 = phVar.f89336f;
                        }
                        if (jC != 16) {
                            j28 = jC;
                        } else {
                            j28 = phVar.f89337g;
                        }
                        if (j16 != 16) {
                            j29 = j16;
                        } else {
                            j29 = phVar.f89338h;
                        }
                        if (jA2 != 16) {
                            j34 = jA2;
                        } else {
                            j34 = phVar.f89339i;
                        }
                        if (j17 != 16) {
                            j35 = j17;
                        } else {
                            j35 = phVar.f89340j;
                        }
                        if (jC != 16) {
                            j36 = jC;
                        } else {
                            j36 = phVar.f89341k;
                        }
                        if (jD != 16) {
                            j37 = jD;
                        } else {
                            j37 = phVar.f89342l;
                        }
                        if (jA3 != 16) {
                            j38 = jA3;
                        } else {
                            j38 = phVar.f89343m;
                        }
                        if (jD2 != 16) {
                            j39 = jD2;
                        } else {
                            j39 = phVar.f89344n;
                        }
                        ph phVar2 = new ph(j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, null);
                        y3 y3Var = t1.f91490h;
                        n2 n2VarC = y3Var.c(new g6.d(((g6.c) mVar.A(y3Var)).getF75991a(), 1.0f));
                        z14 = this.f61925b;
                        p3.v.a(n2VarC, z3.f.c(1001061269, new ad0.g(z14, riVar, phVar2, p1Var, 13), mVar), mVar, 56);
                        h4.r rVarC6 = c2.l.C(x2.f(aVar4, 1.0f), 0.0f, f18, f18, 0.0f, 9);
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar, 48);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarC6, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar6);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, s2VarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar);
                        u2 u2Var = u2.f22900a;
                        objQ = mVar.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new a2(p1Var, 28);
                            mVar.K(objQ);
                        }
                        h7.a((e23.a) objQ, null, !z14, null, null, z3.f.c(-1936200745, new l1(p1Var, 9, (byte) 0), mVar), mVar, 1572870, 58);
                        c2.l.f(u2Var.a(aVar4, 1.0f, true), mVar);
                        zB = mVar.B(aVar3);
                        objQ2 = mVar.q();
                        if (zB || objQ2 == c2565a) {
                            objQ2 = new g02.h0(aVar3, 16);
                            mVar.K(objQ2);
                        }
                        h4.r rVarC7 = c2.l.C(u1.w.d(aVar4, false, null, null, (e23.a) objQ2, 15), 0.0f, 0.0f, f14, 0.0f, 11);
                        String upperCase2 = str2.toUpperCase(locale);
                        upperCase2.getClass();
                        x0 x0Var2 = j92.f.f97933j;
                        mh.c(upperCase2, rVarC7, zl.a.a(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var2), mVar, 0, 0, 131064);
                        zB2 = mVar.B(pVar2) | mVar.r(riVar);
                        objQ3 = mVar.q();
                        if (zB2 || objQ3 == c2565a) {
                            objQ3 = new c2(27, pVar2, riVar);
                            mVar.K(objQ3);
                        }
                        h4.r rVarD = u1.w.d(aVar4, false, null, null, (e23.a) objQ3, 15);
                        String upperCase3 = str3.toUpperCase(locale);
                        upperCase3.getClass();
                        mh.c(upperCase3, rVarD, zl.a.a(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var2), mVar, 0, 0, 131064);
                        mVar.y();
                        mVar.y();
                    }
                    v.h.z(iHashCode4, mVar, iHashCode4, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC4, mVar);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    float f19 = 8;
                    f14 = 24;
                    h4.r rVarC8 = c2.l.C(x2.f(aVar4, 1.0f), f19, 0.0f, 0.0f, f14, 6);
                    locale = Locale.ROOT;
                    String upperCase4 = str.toUpperCase(locale);
                    upperCase4.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var3 = j92.f.f97934k;
                    long jA5 = zl.a.a(mVar);
                    d6.h.f57752b.getClass();
                    mh.c(upperCase4, rVarC8, jA5, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0Var3, mVar, 48, 0, 130040);
                    if (d92.b.d(mVar)) {
                        j8 = 4283519313L;
                    } else {
                        j8 = 4294967295L;
                    }
                    jD = o4.f0.d(j8);
                    jC = o4.d0.c(0.2f, d92.b.a(mVar).e().e(), 14);
                    qh qhVar2 = qh.f89468a;
                    j14 = d92.b.a(mVar).k().f63527d;
                    jA = zl.a.a(mVar);
                    jC2 = androidx.room.a0.c(mVar);
                    jG = d92.b.a(mVar).c().g();
                    gl.c.f77766a.getClass();
                    gl.e eVar3 = gl.c.f77767b;
                    j15 = eVar3.f77785i;
                    j16 = d92.b.a(mVar).e().f63499d;
                    jA2 = zl.a.a(mVar);
                    j17 = eVar3.f77797o;
                    jA3 = zl.a.a(mVar);
                    jD2 = d92.b.a(mVar).k().d();
                    qhVar2.getClass();
                    s7.f89624a.getClass();
                    j2VarA = s7.a(mVar);
                    phVar = j2VarA.f88500o0;
                    if (phVar == null) {
                        f1.f122826a.getClass();
                        long jD10 = k2.d(j2VarA, f1.f122827b);
                        long jD11 = k2.d(j2VarA, f1.f122830e);
                        long jD12 = k2.d(j2VarA, f1.f122835j);
                        long jD13 = k2.d(j2VarA, f1.f122832g);
                        long jD14 = k2.d(j2VarA, f1.f122836k);
                        long jD15 = k2.d(j2VarA, f1.f122840o);
                        long jD16 = k2.d(j2VarA, f1.f122842q);
                        o4.d0.f128823b.getClass();
                        phVar = new ph(jD10, jD13, jD14, jD15, jD11, jD12, jD16, o4.d0.f128831j, k2.d(j2VarA, f1.f122843r), k2.d(j2VarA, f1.f122844s), k2.d(j2VarA, f1.f122851z), k2.d(j2VarA, f1.B), k2.d(j2VarA, f1.A), k2.d(j2VarA, f1.C), null);
                        j2VarA.f88500o0 = phVar;
                    }
                    if (jD != 16) {
                        j18 = jD;
                    } else {
                        j18 = phVar.f89331a;
                    }
                    if (jC2 != 16) {
                        j19 = jC2;
                    } else {
                        j19 = phVar.f89332b;
                    }
                    if (jG != 16) {
                        j24 = jG;
                    } else {
                        j24 = phVar.f89333c;
                    }
                    if (j15 != 16) {
                        j25 = j15;
                    } else {
                        j25 = phVar.f89334d;
                    }
                    if (j14 != 16) {
                        j26 = j14;
                    } else {
                        j26 = phVar.f89335e;
                    }
                    if (jA != 16) {
                        j27 = jA;
                    } else {
                        j27 = phVar.f89336f;
                    }
                    if (jC != 16) {
                        j28 = jC;
                    } else {
                        j28 = phVar.f89337g;
                    }
                    if (j16 != 16) {
                        j29 = j16;
                    } else {
                        j29 = phVar.f89338h;
                    }
                    if (jA2 != 16) {
                        j34 = jA2;
                    } else {
                        j34 = phVar.f89339i;
                    }
                    if (j17 != 16) {
                        j35 = j17;
                    } else {
                        j35 = phVar.f89340j;
                    }
                    if (jC != 16) {
                        j36 = jC;
                    } else {
                        j36 = phVar.f89341k;
                    }
                    if (jD != 16) {
                        j37 = jD;
                    } else {
                        j37 = phVar.f89342l;
                    }
                    if (jA3 != 16) {
                        j38 = jA3;
                    } else {
                        j38 = phVar.f89343m;
                    }
                    if (jD2 != 16) {
                        j39 = jD2;
                    } else {
                        j39 = phVar.f89344n;
                    }
                    ph phVar3 = new ph(j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, null);
                    y3 y3Var2 = t1.f91490h;
                    n2 n2VarC2 = y3Var2.c(new g6.d(((g6.c) mVar.A(y3Var2)).getF75991a(), 1.0f));
                    z14 = this.f61925b;
                    p3.v.a(n2VarC2, z3.f.c(1001061269, new ad0.g(z14, riVar, phVar3, p1Var, 13), mVar), mVar, 56);
                    h4.r rVarC9 = c2.l.C(x2.f(aVar4, 1.0f), 0.0f, f19, f19, 0.0f, 9);
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar, 48);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarC9, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar6);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, s2VarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    u2 u2Var2 = u2.f22900a;
                    objQ = mVar.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new a2(p1Var, 28);
                        mVar.K(objQ);
                    }
                    h7.a((e23.a) objQ, null, !z14, null, null, z3.f.c(-1936200745, new l1(p1Var, 9, (byte) 0), mVar), mVar, 1572870, 58);
                    c2.l.f(u2Var2.a(aVar4, 1.0f, true), mVar);
                    zB = mVar.B(aVar3);
                    objQ2 = mVar.q();
                    if (zB) {
                        objQ2 = new g02.h0(aVar3, 16);
                        mVar.K(objQ2);
                    } else {
                        objQ2 = new g02.h0(aVar3, 16);
                        mVar.K(objQ2);
                    }
                    h4.r rVarC10 = c2.l.C(u1.w.d(aVar4, false, null, null, (e23.a) objQ2, 15), 0.0f, 0.0f, f14, 0.0f, 11);
                    String upperCase5 = str2.toUpperCase(locale);
                    upperCase5.getClass();
                    x0 x0Var4 = j92.f.f97933j;
                    mh.c(upperCase5, rVarC10, zl.a.a(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var4), mVar, 0, 0, 131064);
                    zB2 = mVar.B(pVar2) | mVar.r(riVar);
                    objQ3 = mVar.q();
                    if (zB2) {
                        objQ3 = new c2(27, pVar2, riVar);
                        mVar.K(objQ3);
                    } else {
                        objQ3 = new c2(27, pVar2, riVar);
                        mVar.K(objQ3);
                    }
                    h4.r rVarD2 = u1.w.d(aVar4, false, null, null, (e23.a) objQ3, 15);
                    String upperCase6 = str3.toUpperCase(locale);
                    upperCase6.getClass();
                    mh.c(upperCase6, rVarD2, zl.a.a(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var4), mVar, 0, 0, 131064);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                gw0.t.c((gw0.u) obj9, this.f61925b, (ug2.x) obj7, (ug2.x) obj6, (ug2.x) obj5, (ug2.x) obj4, (ug2.x) obj3, (e23.a) obj8, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                zc.d dVar2 = (zc.d) obj9;
                h62.m mVar2 = (h62.m) obj7;
                h62.l lVar = (h62.l) obj6;
                e23.a aVar7 = (e23.a) obj5;
                e23.a aVar8 = (e23.a) obj4;
                e23.a aVar9 = (e23.a) obj3;
                e23.l lVar2 = (e23.l) obj8;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z17 = (dVar2.d().f196385a instanceof z0.b) && dVar2.b() != 0;
                    boolean zR = mVar3.r(mVar2);
                    Object objQ4 = mVar3.q();
                    if (zR) {
                        objQ4 = new h62.j(mVar2, 0);
                        mVar3.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new h62.j(mVar2, 0);
                            mVar3.K(objQ4);
                        }
                    }
                    m3.l.b(z17, (e23.a) objQ4, null, null, null, null, z3.f.c(432024240, new g82.d(dVar2, lVar, mVar2, this.f61925b, aVar7, aVar8, aVar9, lVar2), mVar3), mVar3, 1572864, 60);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                w4.a((c5) obj9, (h4.r) obj7, (l3) obj6, (b3) obj5, (e23.p) obj3, (e23.p) obj4, this.f61925b, (m4.b0) obj8, (p3.m) obj, p0.t(1794049));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                k82.c.f((h4.r) obj9, (k82.e) obj6, this.f61925b, (Double) obj7, (Double) obj5, (String) obj4, (Double) obj3, (o72.x3) obj8, (p3.m) obj, p0.t(1797553));
                return Unit.INSTANCE;
            case 7:
                p1 p1Var2 = (p1) obj9;
                e23.l lVar3 = (e23.l) obj8;
                p006l2.a2 a2Var = (p006l2.a2) obj7;
                z1 z1Var = (z1) obj6;
                p1 p1Var3 = (p1) obj5;
                p1 p1Var4 = (p1) obj4;
                e23.a aVar10 = (e23.a) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    Object objQ5 = mVar4.q();
                    aVar2.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ5 == c2565a2) {
                        objQ5 = new v2(p1Var3, 28);
                        mVar4.K(objQ5);
                    }
                    h4.r rVarF2 = f5.g0.f(rVarF, (e23.l) objQ5);
                    float f22 = 1;
                    g6.f.a aVar11 = g6.f.f75994b;
                    if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        mVar4.C(-148435125);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(mVar4).f().f();
                        mVar4.f();
                    } else {
                        mVar4.C(-148342869);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(mVar4).f().b();
                        mVar4.f();
                    }
                    u1.u uVarA = u1.n.a(f22, jB);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f24 = j92.b.f97899b.f97917b;
                    h4.r rVarE2 = u1.n.e(u1.q.c(uVarA.f167683a, rVarF2, uVarA.f167684b, k2.i.b(f24, f24, f24, f24)), j20.x.b(mVar4), m1.f128891a);
                    String str4 = (String) p1Var2.getF182175a();
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = str4;
                    j92.f.f97924a.getClass();
                    x0 x0Var5 = j92.f.f97931h;
                    ba baVar = ba.f87580a;
                    long jA6 = d92.b.a(mVar4).d().a().a();
                    baVar.getClass();
                    sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jA6, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mVar4, 2147483391);
                    boolean zB3 = mVar4.B(p1Var2) | mVar4.B(lVar3);
                    Object objQ6 = mVar4.q();
                    if (zB3 || objQ6 == c2565a2) {
                        objQ6 = new a11.b0(lVar3, p1Var2, 16);
                        mVar4.K(objQ6);
                    }
                    na.a(str5, (e23.l) objQ6, rVarE2, false, false, x0Var5, z3.f.c(-1038122615, new a42.e(z16, aVar10, i16), mVar4), null, a2Var, z1Var, true, 0, 0, null, sgVarC, mVar4, C.ENCODING_PCM_32BIT, 12582912, 0, 3964376);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                e23.p pVar3 = (e23.p) obj3;
                e23.p pVar4 = (e23.p) obj9;
                String str6 = (String) obj7;
                String str7 = (String) obj6;
                u4.d dVar3 = (u4.d) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj8;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l72.p2 p2Var = l72.p2.f111205a;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    float f25 = 16;
                    g6.f.a aVar13 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar12, f25);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    s2 s2VarA3 = q2.a(c0343j, bVar2, mVar5, 48);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    h4.r rVarC11 = h4.k.c(rVarY, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, s2VarA3, mVar5);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX5, mVar5);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar5.getT()) {
                        pVar = pVar4;
                        dVar = dVar3;
                    } else {
                        dVar = dVar3;
                        pVar = pVar4;
                        if (!p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC11, mVar5);
                        u2 u2Var3 = u2.f22900a;
                        if (pVar3 == null) {
                            mVar5.C(-2113713643);
                            mVar5.f();
                        } else {
                            v.h.D(mVar5, -1038015636, pVar3, mVar5, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        if (pVar3 != null) {
                            f15 = f25;
                            i14 = 0;
                        } else {
                            i14 = 0;
                            f15 = 0;
                        }
                        if (pVar != null) {
                            f16 = f25;
                        } else {
                            f16 = i14;
                        }
                        h4.r rVarC12 = c2.l.C(u2Var3.a(aVar12, 1.0f, true), f15, 0.0f, f16, 0.0f, 10);
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, i14);
                        iHashCode2 = Long.hashCode(mVar5.getU());
                        i2VarX2 = mVar5.x();
                        rVarC2 = h4.k.c(rVarC12, mVar5);
                        if (mVar5.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar14);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar4, zVarA, mVar5);
                        b4.c(c1623g2, i2VarX2, mVar5);
                        if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar5, iHashCode2, bVar3);
                        }
                        b4.c(fVar2, rVarC2, mVar5);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, mVar5);
                        z15 = this.f61925b;
                        mh.c(str7, l72.v2.b(l72.v2.a(aVar12, !z15, new l72.q(9), mVar5, 6), str6, new b82.i(14), mVar5, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar5, 0, 0, 131068);
                        if (dVar != null) {
                            mVar5.C(1990541387);
                            s2VarA2 = q2.a(c0343j, bVar2, mVar5, 48);
                            iHashCode3 = Long.hashCode(mVar5.getU());
                            i2VarX3 = mVar5.x();
                            rVarC3 = h4.k.c(aVar12, mVar5);
                            if (mVar5.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar5.z();
                            if (mVar5.getT()) {
                                mVar5.M(aVar14);
                            } else {
                                mVar5.c();
                            }
                            b4.c(eVar4, s2VarA2, mVar5);
                            b4.c(c1623g2, i2VarX3, mVar5);
                            if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar5, iHashCode3, bVar3);
                            }
                            b4.c(fVar2, rVarC3, mVar5);
                            long jD17 = d92.b.a(mVar5).f().d();
                            d92.b.f58625c.getClass();
                            i7.b(dVar, null, c2.l.C(x2.q(aVar12, j92.b.f97901d.f97903b), 0.0f, 0.0f, 4, 0.0f, 11), jD17, mVar5, 48, 0);
                            l72.p2.f111205a.c(3072, str8, str9, mVar5, z15);
                            mVar5 = mVar5;
                            mVar5.y();
                            mVar5.f();
                        } else {
                            mVar5.C(1991162875);
                            l72.p2.f111205a.c(3072, str8, str9, mVar5, z15);
                            mVar5.f();
                        }
                        mVar5.y();
                        if (pVar == null) {
                            mVar5.C(-2111943915);
                            mVar5.f();
                        } else {
                            v.h.D(mVar5, -1037958548, pVar, mVar5, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        mVar5.y();
                    }
                    v.h.z(iHashCode5, mVar5, iHashCode5, bVar3);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC11, mVar5);
                    u2 u2Var4 = u2.f22900a;
                    if (pVar3 == null) {
                        mVar5.C(-2113713643);
                        mVar5.f();
                    } else {
                        v.h.D(mVar5, -1038015636, pVar3, mVar5, 0);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (pVar3 != null) {
                        f15 = f25;
                        i14 = 0;
                    } else {
                        i14 = 0;
                        f15 = 0;
                    }
                    if (pVar != null) {
                        f16 = f25;
                    } else {
                        f16 = i14;
                    }
                    h4.r rVarC13 = c2.l.C(u2Var4.a(aVar12, 1.0f, true), f15, 0.0f, f16, 0.0f, 10);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, i14);
                    iHashCode2 = Long.hashCode(mVar5.getU());
                    i2VarX2 = mVar5.x();
                    rVarC2 = h4.k.c(rVarC13, mVar5);
                    if (mVar5.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar4, zVarA, mVar5);
                    b4.c(c1623g2, i2VarX2, mVar5);
                    if (mVar5.getT()) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar3);
                    } else {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar3);
                    }
                    b4.c(fVar2, rVarC2, mVar5);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar5);
                    z15 = this.f61925b;
                    mh.c(str7, l72.v2.b(l72.v2.a(aVar12, !z15, new l72.q(9), mVar5, 6), str6, new b82.i(14), mVar5, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar5, 0, 0, 131068);
                    if (dVar != null) {
                        mVar5.C(1990541387);
                        s2VarA2 = q2.a(c0343j, bVar2, mVar5, 48);
                        iHashCode3 = Long.hashCode(mVar5.getU());
                        i2VarX3 = mVar5.x();
                        rVarC3 = h4.k.c(aVar12, mVar5);
                        if (mVar5.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar14);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar4, s2VarA2, mVar5);
                        b4.c(c1623g2, i2VarX3, mVar5);
                        if (mVar5.getT()) {
                            v.h.z(iHashCode3, mVar5, iHashCode3, bVar3);
                        } else {
                            v.h.z(iHashCode3, mVar5, iHashCode3, bVar3);
                        }
                        b4.c(fVar2, rVarC3, mVar5);
                        long jD18 = d92.b.a(mVar5).f().d();
                        d92.b.f58625c.getClass();
                        i7.b(dVar, null, c2.l.C(x2.q(aVar12, j92.b.f97901d.f97903b), 0.0f, 0.0f, 4, 0.0f, 11), jD18, mVar5, 48, 0);
                        l72.p2.f111205a.c(3072, str8, str9, mVar5, z15);
                        mVar5 = mVar5;
                        mVar5.y();
                        mVar5.f();
                    } else {
                        mVar5.C(1991162875);
                        l72.p2.f111205a.c(3072, str8, str9, mVar5, z15);
                        mVar5.f();
                    }
                    mVar5.y();
                    if (pVar == null) {
                        mVar5.C(-2111943915);
                        mVar5.f();
                    } else {
                        v.h.D(mVar5, -1037958548, pVar, mVar5, 0);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                n0.a((h4.r) obj9, (m92.m0) obj7, (Float) obj6, (Float) obj5, (Float) obj4, (m92.e0) obj3, this.f61925b, (String) obj8, (p3.m) obj, p0.t(113443207));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ov1.m.a aVar15 = ov1.m.f134192b;
                ((ov1.m) obj9).u6((String) obj7, (String) obj6, (jv1.c) obj5, (List) obj4, this.f61925b, (e23.l) obj8, (e23.a) obj3, (p3.m) obj, p0.t(196609));
                return Unit.INSTANCE;
            case 11:
                p005kotlin.jvm.internal.m0 m0Var = (p005kotlin.jvm.internal.m0) obj9;
                ComposeView composeView = (ComposeView) obj7;
                List list = (List) obj6;
                ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) obj5;
                yo1.f fVar3 = (yo1.f) obj4;
                String str10 = (String) obj3;
                ComposeView composeView2 = (ComposeView) obj8;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i18 = ActivityDetailsFragment.I;
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (m0Var.f105804a) {
                        mVar6.C(512635426);
                        z02.b.a(false, null, null, null, false, z3.f.c(-1194665033, new defpackage.d(list, activityDetailChartDTO, fVar3, str10, this.f61925b, composeView2, m0Var), mVar6), mVar6, 196608, 31);
                        mVar6.f();
                    } else {
                        mVar6.C(513395019);
                        mVar6.f();
                        composeView.setVisibility(8);
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                r11.j.b(this.f61925b, (v21.e) obj9, (b63.v) obj7, (List) obj6, (Long) obj5, (e23.l) obj8, (e23.a) obj4, (c3) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                zc.d dVar4 = (zc.d) obj9;
                p1 p1Var5 = (p1) obj7;
                Context context = (Context) obj6;
                d1 d1Var = (d1) obj5;
                w0 w0Var = (w0) obj4;
                c.q qVar = (c.q) obj3;
                e23.l lVar4 = (e23.l) obj8;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    m3.s sVarE = m3.l.e(mVar7);
                    if (z16) {
                        return Unit.INSTANCE;
                    }
                    boolean z18 = dVar4.d().f196385a instanceof z0.b;
                    e2.i0 i0VarA = e2.k0.a(0, 0, 3, mVar7);
                    boolean zB4 = mVar7.B(((c1) p1Var5.getF182175a()).f153083c);
                    Object objQ7 = mVar7.q();
                    if (zB4) {
                        List listC = p13.w.c(null);
                        uk0.i iVar = uk0.i.f171830a;
                        List<am.x0> list2 = ((c1) p1Var5.getF182175a()).f153083c;
                        iVar.getClass();
                        objQ7 = i53.a.e(p13.h0.C0(listC, uk0.i.i(context, list2)));
                        mVar7.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            List listC2 = p13.w.c(null);
                            uk0.i iVar2 = uk0.i.f171830a;
                            List<am.x0> list3 = ((c1) p1Var5.getF182175a()).f153083c;
                            iVar2.getClass();
                            objQ7 = i53.a.e(p13.h0.C0(listC2, uk0.i.i(context, list3)));
                            mVar7.K(objQ7);
                        }
                    }
                    i53.c cVar2 = (i53.c) objQ7;
                    boolean zR2 = mVar7.r(dVar4);
                    Object objQ8 = mVar7.q();
                    if (zR2) {
                        objQ8 = new et1.s0(dVar4, 6);
                        mVar7.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new et1.s0(dVar4, 6);
                            mVar7.K(objQ8);
                        }
                    }
                    m3.l.b(z18, (e23.a) objQ8, null, sVarE, null, z3.f.c(676431801, new p003ji0.e(z18, sVarE, i17), mVar7), z3.f.c(-1363031686, new ak0.g(i0VarA, p1Var5, cVar2, d1Var, w0Var, dVar4, qVar, lVar4, 6), mVar7), mVar7, 1769472, 20);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                sg2.r.a((h4.r) obj9, (lt2.b) obj7, (ah2.e) obj6, (Integer) obj5, (ag2.c.a) obj4, this.f61925b, (String) obj3, (e23.q) obj8, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                t21.b.f((h4.r) obj7, (v21.e) obj9, (s21.a) obj6, (String) obj5, this.f61925b, (l01.a) obj4, (e23.l) obj8, (e23.a) obj3, (p3.m) obj, p0.t(12582913));
                return Unit.INSTANCE;
            case 16:
                e23.a aVar16 = (e23.a) obj9;
                u70.b bVar4 = (u70.b) obj7;
                e23.a aVar17 = (e23.a) obj6;
                x3 x3Var = (x3) obj5;
                e23.l lVar5 = (e23.l) obj8;
                p1 p1Var6 = (p1) obj4;
                p1 p1Var7 = (p1) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    b82.c.c(z3.f.c(-1678075313, new u70.f(bVar4, aVar17, this.f61925b, aVar16, x3Var, lVar5, p1Var6, p1Var7), mVar8), z3.f.c(66018325, new ry0.g(26, bVar4, p1Var7), mVar8), mVar8, 54);
                    if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                        mVar8.C(-465308676);
                        Object objQ9 = mVar8.q();
                        aVar2.getClass();
                        p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                        if (objQ9 == c2565a3) {
                            objQ9 = new tn.h(p1Var6, i16);
                            mVar8.K(objQ9);
                        }
                        e23.a aVar18 = (e23.a) objQ9;
                        boolean zB5 = mVar8.B(aVar16);
                        Object objQ10 = mVar8.q();
                        if (zB5 || objQ10 == c2565a3) {
                            objQ10 = new p40.j0(aVar16, p1Var6, 14);
                            mVar8.K(objQ10);
                        }
                        u70.g.a(aVar18, (e23.a) objQ10, mVar8, 6);
                        mVar8.f();
                    } else {
                        mVar8.C(-465061699);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ux1.d.a((fe) obj9, (dy1.c) obj7, this.f61925b, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (e23.l) obj8, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                l0.b((oe0.l) obj9, this.f61925b, (e23.a) obj7, (e23.a) obj6, (e23.l) obj8, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 19:
                return a(obj, obj2);
            case 20:
                return b(obj, obj2);
            case 21:
                ((Integer) obj2).getClass();
                w11.d.f(this.f61925b, (x11.a) obj9, (e23.l) obj8, (e23.a) obj7, (e23.a) obj6, (e23.l) obj5, (e23.l) obj4, (h4.r) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                return c(obj, obj2);
            case 23:
                return d(obj, obj2);
            case 24:
                return e(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                zo1.r0.i((yo1.h) obj9, (e23.l) obj8, (e23.l) obj7, (zo1.q) obj6, (String) obj5, this.f61925b, (String) obj4, (e23.l) obj3, (p3.m) obj, p0.t(441));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(e23.a aVar, u70.b bVar, e23.a aVar2, boolean z14, p1 p1Var, e23.l lVar, p1 p1Var2, p1 p1Var3) {
        this.f61924a = 16;
        this.f61927d = aVar;
        this.f61928e = bVar;
        this.f61929f = aVar2;
        this.f61925b = z14;
        this.f61930g = p1Var;
        this.f61926c = lVar;
        this.f61931h = p1Var2;
        this.f61932i = p1Var3;
    }

    public /* synthetic */ n(e23.p pVar, e23.p pVar2, boolean z14, String str, String str2, u4.d dVar, String str3, String str4) {
        this.f61924a = 8;
        this.f61932i = pVar;
        this.f61927d = pVar2;
        this.f61925b = z14;
        this.f61928e = str;
        this.f61929f = str2;
        this.f61930g = dVar;
        this.f61931h = str3;
        this.f61926c = str4;
    }

    public /* synthetic */ n(gw0.u uVar, boolean z14, ug2.x xVar, ug2.x xVar2, ug2.x xVar3, ug2.x xVar4, ug2.x xVar5, e23.a aVar, int i14) {
        this.f61924a = 3;
        this.f61927d = uVar;
        this.f61925b = z14;
        this.f61928e = xVar;
        this.f61929f = xVar2;
        this.f61930g = xVar3;
        this.f61931h = xVar4;
        this.f61932i = xVar5;
        this.f61926c = aVar;
    }

    public /* synthetic */ n(h4.r rVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z14, Object obj6, int i14, int i15) {
        this.f61924a = i15;
        this.f61927d = rVar;
        this.f61928e = obj;
        this.f61929f = obj2;
        this.f61930g = obj3;
        this.f61931h = obj4;
        this.f61932i = obj5;
        this.f61925b = z14;
        this.f61926c = obj6;
    }

    public /* synthetic */ n(h4.r rVar, k82.e eVar, boolean z14, Double d14, Double d15, String str, Double d16, o72.x3 x3Var, int i14) {
        this.f61924a = 6;
        this.f61927d = rVar;
        this.f61929f = eVar;
        this.f61925b = z14;
        this.f61928e = d14;
        this.f61930g = d15;
        this.f61931h = str;
        this.f61932i = d16;
        this.f61926c = x3Var;
    }

    public /* synthetic */ n(h4.r rVar, v21.e eVar, s21.a aVar, String str, boolean z14, l01.a aVar2, e23.l lVar, e23.a aVar3, int i14) {
        this.f61924a = 15;
        this.f61928e = rVar;
        this.f61927d = eVar;
        this.f61929f = aVar;
        this.f61930g = str;
        this.f61925b = z14;
        this.f61931h = aVar2;
        this.f61926c = lVar;
        this.f61932i = aVar3;
    }

    public /* synthetic */ n(c5 c5Var, h4.r rVar, l3 l3Var, b3 b3Var, e23.p pVar, e23.p pVar2, boolean z14, m4.b0 b0Var, int i14) {
        this.f61924a = 5;
        this.f61927d = c5Var;
        this.f61928e = rVar;
        this.f61929f = l3Var;
        this.f61930g = b3Var;
        this.f61932i = pVar;
        this.f61931h = pVar2;
        this.f61925b = z14;
        this.f61926c = b0Var;
    }

    public /* synthetic */ n(fe feVar, dy1.c cVar, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar, e23.a aVar4, int i14) {
        this.f61924a = 17;
        this.f61927d = feVar;
        this.f61928e = cVar;
        this.f61925b = z14;
        this.f61929f = aVar;
        this.f61930g = aVar2;
        this.f61931h = aVar3;
        this.f61926c = lVar;
        this.f61932i = aVar4;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z14, Object obj7, int i14) {
        this.f61924a = i14;
        this.f61927d = obj;
        this.f61928e = obj2;
        this.f61929f = obj3;
        this.f61930g = obj4;
        this.f61931h = obj5;
        this.f61932i = obj6;
        this.f61925b = z14;
        this.f61926c = obj7;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z14, Object obj6, o13.h hVar, int i14, int i15) {
        this.f61924a = i15;
        this.f61927d = obj;
        this.f61928e = obj2;
        this.f61929f = obj3;
        this.f61930g = obj4;
        this.f61931h = obj5;
        this.f61925b = z14;
        this.f61932i = obj6;
        this.f61926c = hVar;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, e23.a aVar, Object obj5, Object obj6, int i14) {
        this.f61924a = i14;
        this.f61927d = obj;
        this.f61928e = obj2;
        this.f61929f = obj3;
        this.f61925b = z14;
        this.f61930g = obj4;
        this.f61931h = aVar;
        this.f61932i = obj5;
        this.f61926c = obj6;
    }

    public /* synthetic */ n(Object obj, boolean z14, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i14) {
        this.f61924a = i14;
        this.f61927d = obj;
        this.f61925b = z14;
        this.f61928e = obj2;
        this.f61929f = obj3;
        this.f61930g = obj4;
        this.f61931h = obj5;
        this.f61932i = obj6;
        this.f61926c = obj7;
    }

    public /* synthetic */ n(oe0.l lVar, boolean z14, e23.a aVar, e23.a aVar2, e23.l lVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, int i14) {
        this.f61924a = 18;
        this.f61927d = lVar;
        this.f61925b = z14;
        this.f61928e = aVar;
        this.f61929f = aVar2;
        this.f61926c = lVar2;
        this.f61930g = aVar3;
        this.f61931h = aVar4;
        this.f61932i = aVar5;
    }

    public /* synthetic */ n(ov1.m mVar, String str, String str2, jv1.c cVar, List list, boolean z14, e23.l lVar, e23.a aVar, int i14) {
        this.f61924a = 10;
        this.f61927d = mVar;
        this.f61928e = str;
        this.f61929f = str2;
        this.f61930g = cVar;
        this.f61931h = list;
        this.f61925b = z14;
        this.f61926c = lVar;
        this.f61932i = aVar;
    }

    public /* synthetic */ n(p1 p1Var, e23.l lVar, p006l2.a2 a2Var, z1 z1Var, p1 p1Var2, p1 p1Var3, boolean z14, e23.a aVar) {
        this.f61924a = 7;
        this.f61927d = p1Var;
        this.f61926c = lVar;
        this.f61928e = a2Var;
        this.f61929f = z1Var;
        this.f61930g = p1Var2;
        this.f61931h = p1Var3;
        this.f61925b = z14;
        this.f61932i = aVar;
    }

    public /* synthetic */ n(yg2.h hVar, String str, GDIDataTypes.MeasurementUnit measurementUnit, boolean z14, e23.a aVar, e23.l lVar, u1.u uVar, k2.h hVar2, int i14) {
        this.f61924a = 24;
        this.f61927d = hVar;
        this.f61928e = str;
        this.f61929f = measurementUnit;
        this.f61925b = z14;
        this.f61930g = aVar;
        this.f61926c = lVar;
        this.f61931h = uVar;
        this.f61932i = hVar2;
    }

    public /* synthetic */ n(yo1.h hVar, e23.l lVar, e23.l lVar2, zo1.q qVar, String str, boolean z14, String str2, e23.l lVar3, int i14) {
        this.f61924a = 25;
        this.f61927d = hVar;
        this.f61926c = lVar;
        this.f61928e = lVar2;
        this.f61929f = qVar;
        this.f61930g = str;
        this.f61925b = z14;
        this.f61931h = str2;
        this.f61932i = lVar3;
    }

    public /* synthetic */ n(boolean z14, v21.e eVar, b63.v vVar, List list, Long l14, e23.l lVar, e23.a aVar, c3 c3Var, int i14) {
        this.f61924a = 12;
        this.f61925b = z14;
        this.f61927d = eVar;
        this.f61928e = vVar;
        this.f61929f = list;
        this.f61930g = l14;
        this.f61926c = lVar;
        this.f61931h = aVar;
        this.f61932i = c3Var;
    }

    public /* synthetic */ n(boolean z14, x11.a aVar, e23.l lVar, e23.a aVar2, e23.a aVar3, e23.l lVar2, e23.l lVar3, h4.r rVar, int i14) {
        this.f61924a = 21;
        this.f61925b = z14;
        this.f61927d = aVar;
        this.f61926c = lVar;
        this.f61928e = aVar2;
        this.f61929f = aVar3;
        this.f61930g = lVar2;
        this.f61931h = lVar3;
        this.f61932i = rVar;
    }

    public /* synthetic */ n(boolean z14, zc.d dVar, p1 p1Var, Context context, d1 d1Var, w0 w0Var, c.q qVar, e23.l lVar) {
        this.f61924a = 13;
        this.f61925b = z14;
        this.f61927d = dVar;
        this.f61928e = p1Var;
        this.f61929f = context;
        this.f61930g = d1Var;
        this.f61931h = w0Var;
        this.f61932i = qVar;
        this.f61926c = lVar;
    }
}
