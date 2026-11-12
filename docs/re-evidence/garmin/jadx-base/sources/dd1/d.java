package dd1;

import a11.a0;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b11.t;
import b21.a5;
import b21.z8;
import b63.v;
import b82.t0;
import c.q;
import c2.x2;
import c2.z;
import c22.j0;
import c22.o2;
import c22.x0;
import c80.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import f72.ca;
import g21.f0;
import g21.h;
import g21.u;
import gl1.y;
import gv0.w0;
import h4.r;
import i11.i;
import i3.b3;
import i3.bc;
import i3.f2;
import i3.l3;
import i3.m8;
import i3.mc;
import i3.mh;
import i3.w2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jl1.g;
import kotlin.m3;
import l3.e0;
import l72.h3;
import l72.i3;
import l72.p2;
import lc.m0;
import m4.b0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.w;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import qb0.o;
import r1.c0;
import r1.u0;
import sg0.q0;
import t70.a1;
import ta0.e1;
import tb0.x;
import tn.k;
import u1.a2;
import v62.s6;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f59197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f59198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f59199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f59200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f59201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f59202i;

    public /* synthetic */ d(r rVar, String str, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, i53.c cVar, l lVar, e23.a aVar, int i14) {
        this.f59194a = 21;
        this.f59196c = rVar;
        this.f59197d = str;
        this.f59198e = localDate;
        this.f59199f = localDate2;
        this.f59200g = localDate3;
        this.f59195b = cVar;
        this.f59202i = lVar;
        this.f59201h = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0175  */
    private final Object a(Object obj, Object obj2) {
        int i14;
        int i15;
        i53.c cVarA;
        i53.f fVarJ;
        x01.e eVar = (x01.e) this.f59196c;
        e23.a aVar = (e23.a) this.f59197d;
        e23.a aVar2 = (e23.a) this.f59198e;
        e23.a aVar3 = (e23.a) this.f59199f;
        e23.a aVar4 = (e23.a) this.f59200g;
        p pVar = (p) this.f59201h;
        Context context = (Context) this.f59195b;
        x01.a aVar5 = (x01.a) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean z14 = eVar.f188256e;
            x01.f fVar = eVar.f188255d;
            if (z14) {
                i14 = -1085412002;
                i15 = R.string.set_up_nutrition;
            } else {
                i14 = -1085309020;
                i15 = R.string.edit_profile_frame_non_subscriber_join_gcp;
            }
            i3 i3Var = new i3("NUTRITION_SETUP", sn.a.h(mVar, i14, i15, mVar), false, (u4.d) null, (String) null, 28, (j) null);
            x01.f fVar2 = x01.f.ACTIVE;
            if (fVar == fVar2 || eVar.f188254c == fVar2) {
                mVar.C(-1084966346);
                s62.a.f157643a.getClass();
                cVarA = i53.a.a(new i3("NUTRITION_PLUS", y.Q(mVar, R.string.calories_edit_button), false, s6.a(t62.b.f162798a), (String) null, 20, (j) null));
                mVar.f();
            } else {
                mVar.C(-1084549675);
                mVar.f();
                cVarA = j53.l.b();
            }
            if (fVar == fVar2) {
                mVar.C(-1084358746);
                fVarJ = i53.a.a(new i3("SETTINGS", y.Q(mVar, R.string.lbl_settings), false, (u4.d) null, (String) null, 28, (j) null), new i3("HELP", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (j) null));
                mVar.f();
            } else {
                mVar.C(-1083802606);
                q13.b bVarB = w.b();
                if (eVar.f188256e || !eVar.f188258g) {
                    bVarB.add(i3Var);
                }
                bVarB.add(new i3("HELP", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (j) null));
                fVarJ = i53.a.j(w.a(bVarB));
                mVar.f();
            }
            i53.f fVar3 = fVarJ;
            String strQ = y.Q(mVar, R.string.lbl_more);
            boolean zB = mVar.B(aVar) | mVar.B(aVar2) | mVar.r(eVar) | mVar.B(aVar3) | mVar.B(aVar4) | mVar.B(pVar) | mVar.r(context) | mVar.B(aVar5);
            Object objQ = mVar.q();
            if (zB) {
                a5 a5Var = new a5(aVar, aVar2, eVar, aVar3, aVar4, pVar, context, aVar5, 3);
                mVar.K(a5Var);
                objQ = a5Var;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    a5 a5Var2 = new a5(aVar, aVar2, eVar, aVar3, aVar4, pVar, context, aVar5, 3);
                    mVar.K(a5Var2);
                    objQ = a5Var2;
                }
            }
            h3.a(null, cVarA, fVar3, strQ, (l) objQ, mVar, 576);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        w2.a((Long) this.f59196c, (l) this.f59202i, (e0) this.f59197d, (j23.l) this.f59198e, (l3) this.f59199f, (bc) this.f59200g, (b3) this.f59201h, (b0) this.f59195b, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        iv0.e.a((pu0.b) this.f59196c, (Long) this.f59197d, (Boolean) this.f59198e, (gv0.y) this.f59199f, (p) this.f59200g, (l) this.f59202i, (p) this.f59201h, (hl.a) this.f59195b, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2) {
        i53.c cVar = (i53.c) this.f59195b;
        g gVar = (g) this.f59196c;
        kl1.a aVar = (kl1.a) this.f59197d;
        p1 p1Var = (p1) this.f59198e;
        e23.a aVar2 = (e23.a) this.f59199f;
        p1 p1Var2 = (p1) this.f59200g;
        n1 n1Var = (n1) this.f59201h;
        p1 p1Var3 = (p1) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zB = mVar.B(cVar) | mVar.r(gVar);
            Object objQ = mVar.q();
            m.a aVar3 = m.f135153a;
            if (zB) {
                objQ = new jl1.f.C1912f(2, cVar, gVar, null);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new jl1.f.C1912f(2, cVar, gVar, null);
                    mVar.K(objQ);
                }
            }
            w02.r rVarY = w02.b0.y(null, 0.0f, (e23.r) objQ, mVar, 3);
            boolean z14 = cVar.size() > 1;
            boolean zB2 = mVar.B(cVar) | mVar.r(aVar) | mVar.h(z14) | mVar.r(gVar) | mVar.B(p1Var);
            Object objQ2 = mVar.q();
            if (zB2) {
                z8 z8Var = new z8(3, cVar, aVar, gVar, p1Var2, p1Var, n1Var, z14);
                mVar.K(z8Var);
                objQ2 = z8Var;
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    z8 z8Var2 = new z8(3, cVar, aVar, gVar, p1Var2, p1Var, n1Var, z14);
                    mVar.K(z8Var2);
                    objQ2 = z8Var2;
                }
            }
            w02.m.a(null, rVarY, null, null, null, null, false, null, (l) objQ2, mVar, 0, 509);
            if (((jl1.d) p1Var.getF182175a()).f99479b) {
                mVar.C(-357855101);
                boolean zR = mVar.r(gVar);
                Object objQ3 = mVar.q();
                if (zR) {
                    objQ3 = new f2(gVar, 26);
                    mVar.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new f2(gVar, 26);
                        mVar.K(objQ3);
                    }
                }
                jl1.f.a((e23.a) objQ3, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-357734976);
                mVar.f();
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                mVar.C(-357696350);
                boolean zB3 = mVar.B(aVar2);
                Object objQ4 = mVar.q();
                if (zB3) {
                    objQ4 = new a0(aVar2, p1Var3, 18);
                    mVar.K(objQ4);
                } else {
                    aVar3.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new a0(aVar2, p1Var3, 18);
                        mVar.K(objQ4);
                    }
                }
                e23.a aVar4 = (e23.a) objQ4;
                Object objQ5 = mVar.q();
                aVar3.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new i(p1Var3, 28);
                    mVar.K(objQ5);
                }
                jl1.f.b(aVar4, (e23.a) objQ5, mVar, 48);
                mVar.f();
            } else {
                mVar.C(-357452256);
                mVar.f();
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar.C(-357410933);
                Object objQ6 = mVar.q();
                aVar3.getClass();
                if (objQ6 == m.a.f135155b) {
                    objQ6 = new i(p1Var2, 29);
                    mVar.K(objQ6);
                }
                jl1.f.c((e23.a) objQ6, mVar, 6);
                mVar.f();
            } else {
                mVar.C(-357329248);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0208  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x02d8  */
    private final Object e(Object obj, Object obj2) {
        b11.l next;
        String strA;
        String str;
        m.a aVar;
        v21.e eVar;
        int i14;
        g21.p next2;
        l11.m mVar = (l11.m) this.f59196c;
        mc mcVar = (mc) this.f59197d;
        l11.n nVar = (l11.n) this.f59198e;
        v21.e eVar2 = (v21.e) this.f59199f;
        o53.b0 b0Var = (o53.b0) this.f59200g;
        l lVar = (l) this.f59202i;
        e23.a aVar2 = (e23.a) this.f59201h;
        p1 p1Var = (p1) this.f59195b;
        m mVar2 = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (mVar != null) {
                mVar2.C(214345359);
                l11.l lVar2 = mVar.f108184a;
                b11.a.b bVar = lVar2.f108179a;
                i53.c<b11.l> cVar = lVar2.f108182d;
                h hVar = lVar2.f108181c;
                boolean z14 = lVar2.f108183e;
                b11.f fVarB = v21.a.b(bVar);
                Long l14 = bVar.f14227c;
                r rVarB = a2.b(c2.l.D(u1.n.e(r.S, k.a(d92.b.f58623a, mVar2), m1.f128891a)), a2.a(mVar2), true);
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar2, 48);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                r rVarC = h4.k.c(rVarB, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar4);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar2);
                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.b0 b0Var2 = c2.b0.f22601a;
                String str2 = bVar.f14232h;
                t tVar = bVar.f14230f;
                String str3 = tVar.f14379b;
                if (str3 == null && (str3 = tVar.f14378a) == null) {
                    str3 = tVar.f14380c;
                }
                i11.e.a(24624, z3.f.c(-445580467, new ix.h(5, mVar, bVar, nVar, aVar2, p1Var), mVar2), null, null, str2, str3, mVar2);
                Iterator<b11.l> it = cVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    long j8 = next.f14331a;
                    if (l14 != null && j8 == l14.longValue()) {
                        break;
                    }
                }
                b11.l lVar3 = next;
                if (lVar3 == null) {
                    mVar2.C(-171162679);
                    mVar2.f();
                    strA = null;
                } else {
                    mVar2.C(825762616);
                    strA = lVar3.a(w2.a0.s(mVar2));
                    mVar2.f();
                }
                if (strA == null) {
                    mVar2.C(825764029);
                    strA = y.Q(mVar2, b11.c.SNACKS.f14251b);
                } else {
                    mVar2.C(825762293);
                }
                mVar2.f();
                boolean z15 = mVar.f108187d;
                m.a aVar5 = m.f135153a;
                if (z15) {
                    mVar2.C(-170992116);
                    r.a aVar6 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    c2.l.f(x2.h(aVar6, eVar3.f97920e), mVar2);
                    if (z14) {
                        aVar = aVar5;
                        i14 = 1;
                        mVar2.C(-170520110);
                        mVar2.f();
                    } else {
                        mVar2.C(-170875680);
                        Long l15 = bVar.f14227c;
                        boolean zR = mVar2.r(nVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            aVar = aVar5;
                        } else {
                            aVar5.getClass();
                            aVar = aVar5;
                            if (objQ != m.a.f135155b) {
                                i14 = 1;
                            }
                            y01.p.a(null, cVar, l15, (l) objQ, false, mVar2, 0, 17);
                            mVar2.f();
                        }
                        i14 = 1;
                        objQ = new k11.t(nVar, i14);
                        mVar2.K(objQ);
                        y01.p.a(null, cVar, l15, (l) objQ, false, mVar2, 0, 17);
                        mVar2.f();
                    }
                    v vVar = lVar2.f108180b;
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    boolean zR2 = mVar2.r(nVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new k11.t(nVar, 2);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new k11.t(nVar, 2);
                            mVar2.K(objQ2);
                        }
                    }
                    eVar = eVar2;
                    String str4 = strA;
                    y01.n.a(eVar, vVar, str4, boolValueOf, (l) objQ2, mVar2, 0);
                    str = str4;
                    mVar2 = mVar2;
                    c2.l.f(x2.h(aVar6, eVar3.f97920e), mVar2);
                    mVar2.f();
                } else {
                    str = strA;
                    aVar = aVar5;
                    eVar = eVar2;
                    i14 = 1;
                    mVar2.C(-170063790);
                    mVar2.f();
                }
                r.a aVar7 = r.S;
                r rVarE = u1.n.e(aVar7, vb.h.e(d92.b.f58623a, mVar2), m1.f128891a);
                d92.b.f58625c.getClass();
                j92.e eVar4 = j92.b.f97899b;
                r rVarY = c2.l.y(rVarE, eVar4.f97920e);
                f0 f0VarG = fVarB.g();
                float f14 = eVar4.f97921f;
                i53.c cVarB = mVar.f108188e;
                if (cVarB == null) {
                    cVarB = j53.l.b();
                }
                v21.e eVar5 = eVar;
                y01.r.a(rVarY, eVar5, f0VarG, f14, false, cVarB, mVar2, 0, 16);
                p2 p2Var = p2.f111205a;
                String strQ = y.Q(mVar2, R.string.view_full_nutrition);
                boolean zR3 = mVar2.r(b0Var) | mVar2.B(mcVar);
                Object objQ3 = mVar2.q();
                if (zR3) {
                    objQ3 = new cn1.t(b0Var, mcVar, 25);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new cn1.t(b0Var, mcVar, 25);
                        mVar2.K(objQ3);
                    }
                }
                p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ3, mVar2, 0, 254);
                i53.c<b11.v> cVar2 = bVar.f14233i;
                boolean zB = mVar2.B(lVar);
                Object objQ4 = mVar2.q();
                if (zB) {
                    objQ4 = new k11.n(lVar, i14);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new k11.n(lVar, i14);
                        mVar2.K(objQ4);
                    }
                }
                k11.y.a(cVar2, eVar5, (l) objQ4, mVar2, 0);
                c2.l.f(x2.h(aVar7, eVar4.f97920e), mVar2);
                Iterator<g21.p> it3 = hVar.f75430g.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    long j14 = next2.f75473a.f14331a;
                    if (l14 != null && j14 == l14.longValue()) {
                        break;
                    }
                }
                g21.p pVar = next2;
                u uVar = hVar.f75428e;
                f0 f0VarG2 = hVar.f75429f.g();
                u uVar2 = pVar != null ? pVar.f75475c : null;
                f0 f0Var = pVar != null ? pVar.f75474b : null;
                m mVar3 = mVar2;
                f0 f0VarG3 = fVarB.g();
                i53.c cVarB2 = mVar.f108189f;
                if (cVarB2 == null) {
                    cVarB2 = j53.l.b();
                }
                z01.f.a(eVar5, uVar, f0VarG2, str, f0Var, uVar2, f0VarG3, cVarB2, mVar3, 0);
                mVar3.y();
                c0.e(mcVar.e(), null, u0.l(), null, null, z3.f.c(-1701213870, new fb0.b(mcVar, b0Var, fVarB, eVar5, 18), mVar3), mVar3, 196992, 26);
                mVar3.f();
            } else {
                mVar2.C(220945507);
                mVar2.f();
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        kj2.e.a((String) this.f59196c, (String) this.f59197d, (String) this.f59198e, (String) this.f59199f, (String) this.f59200g, (String) this.f59201h, (e23.a) this.f59195b, (e23.a) this.f59202i, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0127  */
    /* JADX WARN: Code duplicated, block: B:31:0x019d  */
    /* JADX WARN: Code duplicated, block: B:39:0x020b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2) {
        m21.g gVar = (m21.g) this.f59196c;
        e23.a aVar = (e23.a) this.f59197d;
        e23.a aVar2 = (e23.a) this.f59198e;
        e23.a aVar3 = (e23.a) this.f59199f;
        e23.a aVar4 = (e23.a) this.f59200g;
        e23.a aVar5 = (e23.a) this.f59201h;
        e23.a aVar6 = (e23.a) this.f59195b;
        p1 p1Var = (p1) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m21.b bVar = gVar.f116108a;
            boolean z14 = bVar instanceof m21.b.e;
            m.a aVar7 = m.f135153a;
            if (z14) {
                mVar.C(-1340350770);
                String strQ = y.Q(mVar, R.string.find_food);
                boolean zB = mVar.B(aVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new ku1.a(aVar, 17);
                    mVar.K(objQ);
                } else {
                    aVar7.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ku1.a(aVar, 17);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar8 = (e23.a) objQ;
                String strQ2 = y.Q(mVar, R.string.lbl_empty_string);
                String strG = k.g(y.Q(mVar, R.string.lbl_scan_food), y.Q(mVar, R.string.lbl_scan_barcode));
                s62.a.f157643a.getClass();
                i53.f fVarA = i53.a.a(new i3("IMAGE", strQ2, false, ca.a(t62.c.f162799a), strG, 4, (j) null));
                mVar.C(1757901830);
                i53.c<m21.c> cVar = ((m21.e) p1Var.getF182175a()).f116091h;
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                for (m21.c cVar2 : cVar) {
                    arrayList.add(new i3(cVar2.f116080a, gl1.d.T(cVar2.f116081b, mVar, 0), false, (u4.d) null, (String) null, 28, (j) null));
                }
                mVar.f();
                i53.f fVarJ = i53.a.j(arrayList);
                boolean zB2 = mVar.B(aVar2) | mVar.B(aVar3) | mVar.B(aVar4) | mVar.B(aVar5) | mVar.B(aVar6);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new jv0.c(aVar2, aVar3, aVar4, aVar5, aVar6, 3);
                    mVar.K(objQ2);
                } else {
                    aVar7.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new jv0.c(aVar2, aVar3, aVar4, aVar5, aVar6, 3);
                        mVar.K(objQ2);
                    }
                }
                z02.f.d(strQ, null, null, aVar8, fVarA, fVarJ, (l) objQ2, mVar, 2359296, 22);
                mVar.f();
            } else if (bVar instanceof m21.b.a) {
                mVar.C(-1338203307);
                String strQ3 = y.Q(mVar, R.string.calories_edit_button);
                String strQ4 = y.Q(mVar, R.string.lbl_empty_string);
                String strG2 = k.g(y.Q(mVar, R.string.lbl_scan_food), y.Q(mVar, R.string.lbl_scan_barcode));
                s62.a.f157643a.getClass();
                i53.f fVarA2 = i53.a.a(new i3("IMAGE", strQ4, false, ca.a(t62.c.f162799a), strG2, 4, (j) null));
                boolean zB3 = mVar.B(aVar2);
                Object objQ3 = mVar.q();
                if (zB3) {
                    objQ3 = new m8(aVar2, 12);
                    mVar.K(objQ3);
                } else {
                    aVar7.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new m8(aVar2, 12);
                        mVar.K(objQ3);
                    }
                }
                z02.f.e(strQ3, null, aVar, fVarA2, (l) objQ3, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                mVar.f();
            } else if (bVar instanceof m21.b.c) {
                mVar.C(-1337106186);
                x0.f23314a.getClass();
                String strW = gl1.d.W(x0.f23745zd);
                String strQ5 = y.Q(mVar, R.string.lbl_empty_string);
                String strG3 = k.g(y.Q(mVar, R.string.lbl_scan_food), y.Q(mVar, R.string.lbl_scan_barcode));
                s62.a.f157643a.getClass();
                i53.f fVarA3 = i53.a.a(new i3("IMAGE", strQ5, false, ca.a(t62.c.f162799a), strG3, 4, (j) null));
                boolean zB4 = mVar.B(aVar2);
                Object objQ4 = mVar.q();
                if (zB4) {
                    objQ4 = new m8(aVar2, 13);
                    mVar.K(objQ4);
                } else {
                    aVar7.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new m8(aVar2, 13);
                        mVar.K(objQ4);
                    }
                }
                z02.f.e(strW, null, aVar, fVarA3, (l) objQ4, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                mVar.f();
            } else {
                if (!(bVar instanceof m21.b.C2206b)) {
                    throw n23.j.m(mVar, 1757878912);
                }
                mVar.C(-1336020845);
                String strQ6 = y.Q(mVar, R.string.find_food);
                i53.f fVarA4 = i53.a.a(new i3("DONE", y.Q(mVar, R.string.lbl_done), false, (u4.d) null, (String) null, 28, (j) null));
                boolean zB5 = mVar.B(aVar);
                Object objQ5 = mVar.q();
                if (zB5) {
                    objQ5 = new m8(aVar, 14);
                    mVar.K(objQ5);
                } else {
                    aVar7.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new m8(aVar, 14);
                        mVar.K(objQ5);
                    }
                }
                z02.f.b(null, null, strQ6, null, aVar, fVarA4, null, (l) objQ5, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 75);
                mVar.f();
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    /* JADX WARN: Code duplicated, block: B:17:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2) {
        PreviewCatalogActivity previewCatalogActivity = (PreviewCatalogActivity) this.f59196c;
        m0 m0Var = (m0) this.f59197d;
        o53.b0 b0Var = (o53.b0) this.f59198e;
        p1 p1Var = (p1) this.f59199f;
        m72.i iVar = (m72.i) this.f59200g;
        mc mcVar = (mc) this.f59201h;
        x72.e eVar = (x72.e) this.f59195b;
        l lVar = (l) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = PreviewCatalogActivity.f49781a;
        int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zR = mVar.r(b0Var) | mVar.B(p1Var);
            Object objQ = mVar.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new et1.p(b0Var, p1Var, i15);
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new et1.p(b0Var, p1Var, i15);
                    mVar.K(objQ);
                }
            }
            previewCatalogActivity.L9(m0Var, (e23.a) objQ, iVar, mVar, 0);
            boolean zR2 = mVar.r(b0Var) | mVar.B(mcVar) | mVar.B(p1Var);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new fo.j(b0Var, mcVar, p1Var, 4);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new fo.j(b0Var, mcVar, p1Var, 4);
                    mVar.K(objQ2);
                }
            }
            e23.a aVar2 = (e23.a) objQ2;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(74939112);
                l72.w wVar = l72.w.f111301a;
                m72.h.f117107a.getClass();
                z3.e eVar2 = m72.h.f117108b;
                z3.e eVarC = z3.f.c(-649094612, new ll1.g(aVar2, 6), mVar);
                boolean zB = mVar.B(aVar2);
                Object objQ3 = mVar.q();
                if (zB) {
                    objQ3 = new ll0.a(aVar2, 9);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new ll0.a(aVar2, 9);
                        mVar.K(objQ3);
                    }
                }
                wVar.f("Theme Picker", null, eVar2, eVarC, (e23.a) objQ3, mcVar, false, new m70.k(29), z3.f.c(513040578, new fb0.b((Object) eVar, (Object) b0Var, lVar, aVar2, 28), mVar), mVar, 805309830, 194);
                mVar.f();
            } else {
                mVar.C(75850140);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:27:0x0100  */
    /* JADX WARN: Code duplicated, block: B:28:0x010b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0146  */
    /* JADX WARN: Code duplicated, block: B:32:0x014f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0155  */
    /* JADX WARN: Code duplicated, block: B:39:0x0173  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x021c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0223  */
    /* JADX WARN: Code duplicated, block: B:55:0x025c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0263  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b8  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj, Object obj2) {
        mp.a aVar;
        sp.c cVar;
        h5.g.a.f fVar;
        mp.a aVar2;
        am.x0 x0Var;
        ub1.l lVarU;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        boolean zR;
        Object objQ;
        m.a aVar3;
        i53.f fVar2;
        op.a aVar4;
        q qVarB;
        mp.a aVar5;
        boolean zB;
        Object objQ2;
        boolean zB2;
        Object objQ3;
        op.a aVar6 = (op.a) this.f59198e;
        n82.f fVar3 = (n82.f) this.f59197d;
        Object obj3 = (np.c) this.f59199f;
        mp.a aVar7 = (mp.a) this.f59200g;
        Object obj4 = (Context) this.f59201h;
        i53.f fVar4 = (i53.f) this.f59196c;
        sp.c cVar2 = (sp.c) this.f59195b;
        p1 p1Var = (p1) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar8 = r.S;
            r rVarD = x2.d(aVar8, 1.0f);
            long jE = vb.h.e(d92.b.f58623a, mVar);
            m1.a aVar9 = m1.f128891a;
            r rVarE = u1.n.e(rVarD, jE, aVar9);
            h4.d.f81522a.getClass();
            h4.g.a aVar10 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            z zVarA2 = c2.y.a(kVar, aVar10, mVar, 48);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC2 = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar11 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar11);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT()) {
                aVar = aVar7;
                cVar = cVar2;
            } else {
                cVar = cVar2;
                aVar = aVar7;
                if (!s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                g1 g1Var = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
                s0 s0Var = s0.ACTIVITY_REPORTS;
                aVar2 = ((qp.d) p1Var.getF182175a()).f146012f;
                if (aVar2 != null) {
                    x0Var = aVar2.f119946a.f119948a;
                } else {
                    x0Var = null;
                }
                lVarU = g1.u(g1Var, s0Var, new ks.b(x0Var), 4);
                if (lVarU == null) {
                    mVar.C(280132841);
                    mVar.f();
                } else {
                    mVar.C(280132842);
                    r rVarE2 = u1.n.e(x2.f(aVar8, 1.0f), d92.b.a(mVar).c().b(), aVar9);
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarE2, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar11);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    d92.b.f58625c.getClass();
                    lVarU.a(c2.l.y(aVar8, j92.b.f97899b.f97920e), mVar, 0);
                    mVar.y();
                    Unit unit = Unit.INSTANCE;
                    mVar.f();
                }
                d92.b.f58625c.getClass();
                j92.e eVar2 = j92.b.f97899b;
                c2.l.f(c2.l.C(aVar8, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), mVar);
                zR = mVar.r(aVar6) | mVar.B(fVar3) | mVar.r(obj3);
                objQ = mVar.q();
                aVar3 = m.f135153a;
                if (zR) {
                    objQ = new na0.a(fVar4, aVar6, fVar3, obj3, 7);
                    fVar2 = fVar4;
                    aVar4 = aVar6;
                    mVar.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new na0.a(fVar4, aVar6, fVar3, obj3, 7);
                        fVar2 = fVar4;
                        aVar4 = aVar6;
                        mVar.K(objQ);
                    } else {
                        fVar2 = fVar4;
                        aVar4 = aVar6;
                    }
                }
                qVarB = aVar4.b((p) objQ, mVar);
                r rVarC3 = c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, eVar2.f97918c, 7);
                boolean zR2 = mVar.r(aVar4) | mVar.r(obj4) | mVar.r(qVarB);
                aVar5 = aVar;
                zB = zR2 | mVar.B(aVar5) | mVar.B(fVar3) | mVar.r(obj3);
                objQ2 = mVar.q();
                if (zB) {
                    Object pVar = new aa2.p(aVar4, obj4, qVarB, aVar5, fVar3, obj3, 18);
                    aVar5 = aVar5;
                    obj3 = obj3;
                    fVar3 = fVar3;
                    mVar.K(pVar);
                    objQ2 = pVar;
                } else {
                    aVar3.getClass();
                    if (objQ2 == m.a.f135155b) {
                        Object pVar2 = new aa2.p(aVar4, obj4, qVarB, aVar5, fVar3, obj3, 18);
                        aVar5 = aVar5;
                        obj3 = obj3;
                        fVar3 = fVar3;
                        mVar.K(pVar2);
                        objQ2 = pVar2;
                    }
                }
                pp.d.a(rVarC3, aVar5, (l) objQ2, mVar, 0);
                i53.c cVarE = i53.a.e(o2.b(fVar2, mVar));
                int iIndexOf = fVar2.indexOf(fVar3.f124961b.a());
                zB2 = mVar.B(fVar3);
                objQ3 = mVar.q();
                if (zB2) {
                    objQ3 = new a42.f0(fVar3, fVar2, 10);
                    mVar.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new a42.f0(fVar3, fVar2, 10);
                        mVar.K(objQ3);
                    }
                }
                t82.c.a(cVarE, null, iIndexOf, 0.0f, (l) objQ3, mVar, 0, 26);
                q82.a.a(x2.f(aVar8, 1.0f), new n82.n(fVar3, cVar), null, mVar, 6, 4);
                n82.c.a(b0Var.a(aVar8, 1.0f, true), fVar3, 3, false, z3.f.c(447197351, new i91.e(obj3, 17, aVar4, p1Var), mVar), mVar, 24960, 8);
                mVar.y();
            }
            v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            g1 g1Var2 = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
            s0 s0Var2 = s0.ACTIVITY_REPORTS;
            aVar2 = ((qp.d) p1Var.getF182175a()).f146012f;
            if (aVar2 != null) {
                x0Var = aVar2.f119946a.f119948a;
            } else {
                x0Var = null;
            }
            lVarU = g1.u(g1Var2, s0Var2, new ks.b(x0Var), 4);
            if (lVarU == null) {
                mVar.C(280132841);
                mVar.f();
            } else {
                mVar.C(280132842);
                r rVarE3 = u1.n.e(x2.f(aVar8, 1.0f), d92.b.a(mVar).c().b(), aVar9);
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarE3, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar11);
                } else {
                    mVar.c();
                }
                b4.c(eVar, zVarA, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                } else {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar);
                d92.b.f58625c.getClass();
                lVarU.a(c2.l.y(aVar8, j92.b.f97899b.f97920e), mVar, 0);
                mVar.y();
                Unit unit2 = Unit.INSTANCE;
                mVar.f();
            }
            d92.b.f58625c.getClass();
            j92.e eVar3 = j92.b.f97899b;
            c2.l.f(c2.l.C(aVar8, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), mVar);
            zR = mVar.r(aVar6) | mVar.B(fVar3) | mVar.r(obj3);
            objQ = mVar.q();
            aVar3 = m.f135153a;
            if (zR) {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.a(fVar4, aVar6, fVar3, obj3, 7);
                    fVar2 = fVar4;
                    aVar4 = aVar6;
                    mVar.K(objQ);
                } else {
                    fVar2 = fVar4;
                    aVar4 = aVar6;
                }
            } else {
                objQ = new na0.a(fVar4, aVar6, fVar3, obj3, 7);
                fVar2 = fVar4;
                aVar4 = aVar6;
                mVar.K(objQ);
            }
            qVarB = aVar4.b((p) objQ, mVar);
            r rVarC4 = c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7);
            boolean zR3 = mVar.r(aVar4) | mVar.r(obj4) | mVar.r(qVarB);
            aVar5 = aVar;
            zB = zR3 | mVar.B(aVar5) | mVar.B(fVar3) | mVar.r(obj3);
            objQ2 = mVar.q();
            if (zB) {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    Object pVar3 = new aa2.p(aVar4, obj4, qVarB, aVar5, fVar3, obj3, 18);
                    aVar5 = aVar5;
                    obj3 = obj3;
                    fVar3 = fVar3;
                    mVar.K(pVar3);
                    objQ2 = pVar3;
                }
            } else {
                Object pVar4 = new aa2.p(aVar4, obj4, qVarB, aVar5, fVar3, obj3, 18);
                aVar5 = aVar5;
                obj3 = obj3;
                fVar3 = fVar3;
                mVar.K(pVar4);
                objQ2 = pVar4;
            }
            pp.d.a(rVarC4, aVar5, (l) objQ2, mVar, 0);
            i53.c cVarE2 = i53.a.e(o2.b(fVar2, mVar));
            int iIndexOf2 = fVar2.indexOf(fVar3.f124961b.a());
            zB2 = mVar.B(fVar3);
            objQ3 = mVar.q();
            if (zB2) {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a42.f0(fVar3, fVar2, 10);
                    mVar.K(objQ3);
                }
            } else {
                objQ3 = new a42.f0(fVar3, fVar2, 10);
                mVar.K(objQ3);
            }
            t82.c.a(cVarE2, null, iIndexOf2, 0.0f, (l) objQ3, mVar, 0, 26);
            q82.a.a(x2.f(aVar8, 1.0f), new n82.n(fVar3, cVar), null, mVar, 6, 4);
            n82.c.a(b0Var2.a(aVar8, 1.0f, true), fVar3, 3, false, z3.f.c(447197351, new i91.e(obj3, 17, aVar4, p1Var), mVar), mVar, 24960, 8);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0080  */
    /* JADX WARN: Code duplicated, block: B:17:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj, Object obj2) {
        DateTime dateTime = (DateTime) this.f59196c;
        qo0.a aVar = (qo0.a) this.f59197d;
        p1 p1Var = (p1) this.f59198e;
        gs1.t tVar = (gs1.t) this.f59199f;
        p1 p1Var2 = (p1) this.f59200g;
        CustomLineChart customLineChart = (CustomLineChart) this.f59201h;
        tz.a aVar2 = (tz.a) this.f59195b;
        String str = (String) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            tf0.i iVar = aVar.f145927l;
            r rVarH = x2.h(x2.f(r.S, 1.0f), oo0.g.f133125a);
            boolean zR = mVar.r(aVar) | mVar.r(dateTime);
            Object objQ = mVar.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ = new oe.j(8, aVar, dateTime);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new oe.j(8, aVar, dateTime);
                    mVar.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean zR2 = mVar.r(aVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new nw0.f(aVar, 17);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new nw0.f(aVar, 17);
                    mVar.K(objQ2);
                }
            }
            tf0.r.a(zBooleanValue, localDate, iVar, rVarH, aVar4, (l) objQ2, z3.f.c(-1606510141, new hl1.j(aVar, tVar, p1Var2, customLineChart, aVar2, str, 28), mVar), mVar, (tf0.i.f164439d << 6) | 1575936);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0082  */
    /* JADX WARN: Code duplicated, block: B:17:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2) {
        DateTime dateTime = (DateTime) this.f59196c;
        ix.j jVar = (ix.j) this.f59197d;
        p1 p1Var = (p1) this.f59198e;
        String str = (String) this.f59199f;
        gs1.t tVar = (gs1.t) this.f59200g;
        p1 p1Var2 = (p1) this.f59201h;
        jx.a aVar = (jx.a) this.f59195b;
        gt.a aVar2 = (gt.a) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            tf0.i iVar = jVar.f95626f;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(r.S, 1.0f), 350);
            boolean zR = mVar.r(jVar) | mVar.r(dateTime);
            Object objQ = mVar.q();
            m.a aVar4 = m.f135153a;
            if (zR) {
                objQ = new oe.j(24, jVar, dateTime);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new oe.j(24, jVar, dateTime);
                    mVar.K(objQ);
                }
            }
            e23.a aVar5 = (e23.a) objQ;
            boolean zR2 = mVar.r(jVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new nw0.f(jVar, 27);
                mVar.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new nw0.f(jVar, 27);
                    mVar.K(objQ2);
                }
            }
            tf0.r.a(zBooleanValue, localDate, iVar, rVarH, aVar5, (l) objQ2, z3.f.c(-1878943575, new hl1.j(str, tVar, jVar, p1Var2, aVar, aVar2), mVar), mVar, (tf0.i.f164439d << 6) | 1575936);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        pa0.g.b((pa0.h) this.f59196c, (String) this.f59197d, (e23.a) this.f59198e, (e23.a) this.f59199f, (l) this.f59202i, (e23.a) this.f59200g, (e23.a) this.f59201h, (e23.a) this.f59195b, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object n(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        o.a((qb0.b) this.f59196c, (d90.f) this.f59197d, (String) this.f59198e, (o90.a) this.f59199f, (e23.a) this.f59200g, (e23.a) this.f59201h, (l) this.f59202i, (e23.a) this.f59195b, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object o(Object obj, Object obj2) {
        String str = (String) this.f59196c;
        l lVar = (l) this.f59202i;
        String strH = (String) this.f59197d;
        e23.a aVar = (e23.a) this.f59198e;
        p1 p1Var = (p1) this.f59199f;
        p1 p1Var2 = (p1) this.f59200g;
        p1 p1Var3 = (p1) this.f59201h;
        p1 p1Var4 = (p1) this.f59195b;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            t0 t0Var = t0.f16792a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.f23443ha);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            x5.v.f188954b.getClass();
            int i14 = x5.v.f188955c;
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = new qe2.c(lVar, 6);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new qe2.c(lVar, 6);
                    mVar.K(objQ);
                }
            }
            t0Var.i(null, strW, str2, 62, false, (l) objQ, null, i14, 0, null, mVar, 12610560, 833);
            Calendar calendar = (Calendar) p1Var.getF182175a();
            String strA = calendar != null ? j0.a(new DateTime(calendar.getTimeInMillis(), DateTimeZone.getDefault()), 'S') : null;
            if (strA == null) {
                mVar.C(1269716171);
                strA = gl1.d.W(x0.Xa);
            } else {
                mVar.C(1269707987);
            }
            mVar.f();
            String str3 = strA;
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(mVar, R.string.lbl_start_date);
            qy0.b.f148467a.getClass();
            z3.e eVar = qy0.b.f148468b;
            Object objQ2 = mVar.q();
            aVar2.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new qk0.m(p1Var2, 8);
                mVar.K(objQ2);
            }
            p2Var.h(strQ, str3, null, null, null, false, false, null, eVar, null, (e23.a) objQ2, mVar, 100663296, 6, 764);
            Calendar calendar2 = (Calendar) p1Var3.getF182175a();
            String strA2 = calendar2 != null ? j0.a(new DateTime(calendar2.getTimeInMillis(), DateTimeZone.getDefault()), 'S') : null;
            if (strA2 == null) {
                mVar.C(1269751817);
                strA2 = gl1.d.W(x0.Va);
            } else {
                mVar.C(1269743726);
            }
            mVar.f();
            String str4 = strA2;
            String strQ2 = y.Q(mVar, R.string.common_end_date);
            z3.e eVar2 = qy0.b.f148469c;
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = new qk0.m(p1Var4, 9);
                mVar.K(objQ3);
            }
            p2Var.h(strQ2, str4, null, null, null, false, false, null, eVar2, null, (e23.a) objQ3, mVar, 100663296, 6, 764);
            String strQ3 = y.Q(mVar, R.string.title_course);
            if (strH == null) {
                strH = sn.a.h(mVar, 1269782590, R.string.pacepro_lbl_select_course, mVar);
            } else {
                mVar.C(1269781908);
                mVar.f();
            }
            String str5 = strH;
            z3.e eVar3 = qy0.b.f148470d;
            boolean zB2 = mVar.B(aVar);
            Object objQ4 = mVar.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new qk0.o(aVar, 3);
                mVar.K(objQ4);
            }
            p2Var.h(strQ3, str5, null, null, null, false, false, null, eVar3, null, (e23.a) objQ4, mVar, 100663296, 0, 764);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object q(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        rp.d.a((rp.e) this.f59196c, (o82.g) this.f59197d, (b63.o) this.f59198e, (np.c) this.f59199f, (e23.a) this.f59200g, (l) this.f59202i, (p) this.f59201h, (e23.a) this.f59195b, (m) obj, p0.t(7));
        return Unit.INSTANCE;
    }

    private final Object r(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        rv1.c.a((r) this.f59196c, (String) this.f59197d, (LocalDate) this.f59198e, (LocalDate) this.f59199f, (LocalDate) this.f59200g, (i53.c) this.f59195b, (l) this.f59202i, (e23.a) this.f59201h, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object s(Object obj, Object obj2) {
        ve2.e eVar = (ve2.e) this.f59196c;
        String str = (String) this.f59197d;
        o53.b0 b0Var = (o53.b0) this.f59198e;
        mc mcVar = (mc) this.f59199f;
        e23.q qVar = (e23.q) this.f59200g;
        l lVar = (l) this.f59202i;
        n1 n1Var = (n1) this.f59201h;
        p1 p1Var = (p1) this.f59195b;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            mVar.N(-1923307966, Integer.valueOf(n1Var.getIntValue()));
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new rk0.w(p1Var, 26);
                mVar.K(objQ);
            }
            e23.a aVar = (e23.a) objQ;
            boolean zR = mVar.r(b0Var) | mVar.B(mcVar) | mVar.B(qVar);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ew0.s(b0Var, qVar, mcVar);
                mVar.K(objQ2);
            }
            e23.q qVar2 = (e23.q) objQ2;
            boolean zB = mVar.B(lVar);
            Object objQ3 = mVar.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new qe2.c(lVar, 22);
                mVar.K(objQ3);
            }
            l lVar2 = (l) objQ3;
            boolean zR2 = mVar.r(b0Var) | mVar.B(mcVar);
            Object objQ4 = mVar.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new nw0.n(b0Var, mcVar, 8);
                mVar.K(objQ4);
            }
            sg0.h.b(eVar, str, aVar, qVar2, lVar2, (e23.a) objQ4, mVar, 384);
            mVar.Q();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b1  */
    private final Object u(Object obj, Object obj2) {
        String str = (String) this.f59196c;
        e23.a aVar = (e23.a) this.f59197d;
        p1 p1Var = (p1) this.f59198e;
        p1 p1Var2 = (p1) this.f59199f;
        p1 p1Var3 = (p1) this.f59200g;
        p1 p1Var4 = (p1) this.f59201h;
        p pVar = (p) this.f59195b;
        p1 p1Var5 = (p1) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = new q0(aVar, 11);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new q0(aVar, 11);
                    mVar.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            i53.f fVarA = i53.a.a(new i3("SAVE", y.Q(mVar, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (j) null));
            boolean zB2 = mVar.B(p1Var) | mVar.B(p1Var2) | mVar.B(p1Var3) | mVar.B(p1Var4) | mVar.B(pVar) | mVar.B(p1Var5);
            Object objQ2 = mVar.q();
            if (zB2) {
                aa2.p pVar2 = new aa2.p(pVar, p1Var, p1Var2, p1Var3, p1Var4, p1Var5, 27);
                mVar.K(pVar2);
                objQ2 = pVar2;
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    aa2.p pVar3 = new aa2.p(pVar, p1Var, p1Var2, p1Var3, p1Var4, p1Var5, 27);
                    mVar.K(pVar3);
                    objQ2 = pVar3;
                }
            }
            z02.f.e(str, null, aVar3, fVarA, (l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x023a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object v(Object obj, Object obj2) {
        boolean z14;
        Double dF;
        u21.c cVar = (u21.c) this.f59196c;
        o53.b0 b0Var = (o53.b0) this.f59197d;
        mc mcVar = (mc) this.f59198e;
        l lVar = (l) this.f59202i;
        v21.e eVar = (v21.e) this.f59199f;
        l lVar2 = (l) this.f59200g;
        l lVar3 = (l) this.f59201h;
        p1 p1Var = (p1) this.f59195b;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            s21.a aVar = cVar.f167911e;
            r.a aVar2 = r.S;
            r rVarB = a2.b(c2.l.p(x2.d(aVar2, 1.0f)), a2.a(mVar), true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97921f;
            float f15 = eVar2.f97920e;
            r rVarC = c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, f14, 7);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            r rVarA = c2.l.A(c2.l.C(aVar2, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), f15, 0.0f, 2);
            String strQ = y.Q(mVar, R.string.lbl_select_your_baseline_activity_level);
            d6.h.f57752b.getClass();
            int i14 = d6.h.f57755e;
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
            mh.c(y.Q(mVar, R.string.msg_select_an_activity_level_option), c2.l.A(c2.l.C(aVar2, 0.0f, eVar2.f97918c, 0.0f, eVar2.f97921f, 5), f15, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 130044);
            String str = cVar.f167907a;
            l22.a aVar5 = eVar.f175325b;
            String string = (str == null || (dF = d53.s.f(str)) == null) ? aVar5.getString(R.string.lbl_empty_string) : c22.l3.a.H(c22.l3.f23124b, aVar5, dF.doubleValue(), false);
            boolean z15 = aVar == s21.a.ACTIVE_CALORIES;
            boolean zB = mVar.B(lVar2);
            Object objQ = mVar.q();
            m.a aVar6 = m.f135153a;
            if (zB) {
                z14 = true;
                objQ = new sq1.e(lVar2, 1);
                mVar.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    z14 = true;
                    objQ = new sq1.e(lVar2, 1);
                    mVar.K(objQ);
                } else {
                    z14 = true;
                }
            }
            t21.b.a(0, (e23.a) objQ, string, mVar, z15);
            String strQ2 = y.Q(mVar, R.string.lbl_custom_active_calories);
            boolean z16 = aVar == s21.a.CUSTOM_ACTIVE_CALORIES ? z14 : false;
            boolean zB2 = mVar.B(lVar2);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new sq1.e(lVar2, 2);
                mVar.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new sq1.e(lVar2, 2);
                    mVar.K(objQ2);
                }
            }
            t21.b.b(strQ2, null, null, z16, false, (e23.a) objQ2, mVar, 0, 22);
            String strQ3 = y.Q(mVar, R.string.txt_activity_level_title);
            boolean z17 = aVar == s21.a.ACTIVITY_MULTIPLIER ? z14 : false;
            boolean zB3 = mVar.B(lVar2);
            Object objQ3 = mVar.q();
            if (zB3) {
                objQ3 = new sq1.e(lVar2, 3);
                mVar.K(objQ3);
            } else {
                aVar6.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new sq1.e(lVar2, 3);
                    mVar.K(objQ3);
                }
            }
            t21.b.b(strQ3, null, null, z17, false, (e23.a) objQ3, mVar, 0, 22);
            c2.l.f(x2.h(aVar2, f15), mVar);
            String str2 = cVar.f167908b;
            l01.a aVar7 = cVar.f167912f;
            boolean z18 = cVar.f167909c;
            Object objQ4 = mVar.q();
            aVar6.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = new sg0.l(p1Var, 18);
                mVar.K(objQ4);
            }
            t21.b.f(null, eVar, aVar, str2, z18, aVar7, lVar3, (e23.a) objQ4, mVar, 12582912);
            mVar.y();
            boolean zR = mVar.r(b0Var) | mVar.B(mcVar);
            Object objQ5 = mVar.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new fo.j(b0Var, mcVar, p1Var, 17);
                mVar.K(objQ5);
            }
            e23.a aVar8 = (e23.a) objQ5;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(-132005265);
                l01.a aVar9 = cVar.f167912f;
                boolean zB4 = mVar.B(lVar) | mVar.B(aVar8);
                Object objQ6 = mVar.q();
                if (zB4 || objQ6 == c2565a) {
                    objQ6 = new et1.g1(6, aVar8, lVar);
                    mVar.K(objQ6);
                }
                l lVar4 = (l) objQ6;
                boolean zB5 = mVar.B(aVar8);
                Object objQ7 = mVar.q();
                if (zB5 || objQ7 == c2565a) {
                    objQ7 = new t21.a(aVar8, 1);
                    mVar.K(objQ7);
                }
                r21.a.a(mcVar, aVar9, lVar4, (e23.a) objQ7, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-131518999);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x019c  */
    /* JADX WARN: Code duplicated, block: B:41:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x024c  */
    private final Object w(Object obj, Object obj2) {
        z3.e eVarC;
        m4.q qVar = (m4.q) this.f59196c;
        m3 m3Var = (m3) this.f59197d;
        String str = (String) this.f59198e;
        l lVar = (l) this.f59202i;
        List list = (List) this.f59199f;
        l lVar2 = (l) this.f59200g;
        l lVar3 = (l) this.f59201h;
        e23.a aVar = (e23.a) this.f59195b;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(c2.l.A(rVarD, eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            Unit unit = Unit.INSTANCE;
            boolean zR = mVar.r(qVar) | mVar.B(m3Var);
            Object objQ = mVar.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ = new e1.a(qVar, m3Var);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e1.a(qVar, m3Var);
                    mVar.K(objQ);
                }
            }
            r rVarB = b5.s0.b(rVarC, unit, (PointerInputEventHandler) objQ);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC2 = h4.k.c(rVarB, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            if (d53.w.J(str)) {
                mVar.C(1776495901);
                da0.a0.a(0, 12, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), y.Q(mVar, R.string.startup_compatible_devices), null, mVar, null);
                mVar.f();
            } else {
                mVar.C(1776777474);
                mVar.f();
            }
            float f14 = j92.b.f97900c.f97911c;
            r rVarB2 = l4.k.b(aVar2, k2.i.a(f14));
            String strQ = y.Q(mVar, R.string.lbl_search);
            if (d53.w.J(str)) {
                mVar.C(1777724214);
                mVar.f();
                eVarC = null;
            } else {
                mVar.C(1777347874);
                eVarC = z3.f.c(-1418181156, new b71.n(lVar, 18, (byte) 0), mVar);
                mVar.f();
            }
            ta0.f.f163310a.getClass();
            z3.e eVar2 = ta0.f.f163311b;
            boolean zB = mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zB) {
                objQ2 = new ta0.j(lVar, 5);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ta0.j(lVar, 5);
                    mVar.K(objQ2);
                }
            }
            l72.p1.a(str, rVarB2, strQ, null, false, false, null, 0L, null, eVarC, eVar2, null, null, (l) objQ2, mVar, 0, 6, 14840);
            i0 i0VarA = k0.a(0, 0, 3, mVar);
            boolean zB2 = mVar.B(str) | mVar.B(i0VarA);
            Object objQ3 = mVar.q();
            if (zB2) {
                objQ3 = new e1.b(str, i0VarA, null);
                mVar.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new e1.b(str, i0VarA, null);
                    mVar.K(objQ3);
                }
            }
            l0.e((p) objQ3, str, mVar);
            r rVarB3 = l4.k.b(u1.n.e(c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), com.nimbusds.jose.shaded.gson.internal.a.c(mVar), k2.i.a(f14)), k2.i.a(f14));
            boolean zR2 = mVar.r(list) | mVar.B(lVar2) | mVar.B(lVar3) | mVar.B(aVar);
            Object objQ4 = mVar.q();
            if (zR2) {
                t42.l lVar4 = new t42.l(list, lVar2, lVar3, aVar, 2);
                mVar.K(lVar4);
                objQ4 = lVar4;
            } else {
                aVar3.getClass();
                if (objQ4 == m.a.f135155b) {
                    t42.l lVar5 = new t42.l(list, lVar2, lVar3, aVar, 2);
                    mVar.K(lVar5);
                    objQ4 = lVar5;
                }
            }
            e2.c.b(rVarB3, i0VarA, null, null, null, null, false, null, (l) objQ4, mVar, 0, 508);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object x(Object obj, Object obj2) {
        x xVar = (x) this.f59196c;
        String str = (String) this.f59197d;
        o90.a aVar = (o90.a) this.f59198e;
        l lVar = (l) this.f59202i;
        e23.a aVar2 = (e23.a) this.f59199f;
        tb0.y yVar = (tb0.y) this.f59200g;
        p1 p1Var = (p1) this.f59201h;
        x3 x3Var = (x3) this.f59195b;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (((tb0.a0) p1Var.getF182175a()).f163589a) {
                mVar.C(-524778024);
                mVar.f();
            } else {
                boolean z14 = ((tb0.a0) p1Var.getF182175a()).f163590b;
                m.a aVar3 = m.f135153a;
                if (z14 || xVar == null) {
                    mVar.C(-524645685);
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a1(aVar2, 8);
                        mVar.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new a1(aVar2, 8);
                            mVar.K(objQ);
                        }
                    }
                    ub0.d.a(str, aVar, lVar, (e23.a) objQ, mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(-524351743);
                    ub0.l lVar2 = (ub0.l) x3Var.getF182175a();
                    boolean zR = mVar.r(yVar);
                    Object objQ2 = mVar.q();
                    if (zR) {
                        objQ2 = new s70.b0(yVar, 26);
                        mVar.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new s70.b0(yVar, 26);
                            mVar.K(objQ2);
                        }
                    }
                    tb0.l.c(lVar2, xVar, str, aVar2, (l) objQ2, lVar, mVar, 0);
                    mVar.f();
                }
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object y(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        tb0.m.a((String) this.f59196c, (String) this.f59197d, (String) this.f59198e, (o90.a) this.f59199f, (d90.i) this.f59200g, (e23.a) this.f59201h, (e23.a) this.f59195b, (l) this.f59202i, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    private final Object z(Object obj, Object obj2) {
        e23.a aVar = (e23.a) this.f59196c;
        i3 i3Var = (i3) this.f59197d;
        i3 i3Var2 = (i3) this.f59198e;
        x3 x3Var = (x3) this.f59199f;
        e23.a aVar2 = (e23.a) this.f59200g;
        e23.a aVar3 = (e23.a) this.f59201h;
        x3 x3Var2 = (x3) this.f59195b;
        p1 p1Var = (p1) this.f59202i;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.f23441h8);
            i53.c cVarA = ((Boolean) x3Var2.getF182175a()).booleanValue() ? i53.a.a(i3Var, i3Var2) : j53.l.b();
            boolean zB = mVar.B(x3Var) | mVar.B(aVar2) | mVar.B(aVar3);
            Object objQ = mVar.q();
            if (zB) {
                t42.l lVar = new t42.l(aVar2, aVar3, x3Var, p1Var, 10);
                mVar.K(lVar);
                objQ = lVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    t42.l lVar2 = new t42.l(aVar2, aVar3, x3Var, p1Var, 10);
                    mVar.K(lVar2);
                    objQ = lVar2;
                }
            }
            z02.f.d(strW, null, null, aVar, null, cVarA, (l) objQ, mVar, 2097152, 54);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x032c  */
    /* JADX WARN: Code duplicated, block: B:138:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x0505  */
    /* JADX WARN: Code duplicated, block: B:148:0x0524  */
    /* JADX WARN: Code duplicated, block: B:153:0x0543  */
    /* JADX WARN: Code duplicated, block: B:164:0x0622  */
    /* JADX WARN: Code duplicated, block: B:214:0x083f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0842  */
    /* JADX WARN: Code duplicated, block: B:218:0x0850  */
    /* JADX WARN: Code duplicated, block: B:221:0x085a  */
    /* JADX WARN: Code duplicated, block: B:225:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:229:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:232:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x0907  */
    /* JADX WARN: Code duplicated, block: B:236:0x0921  */
    /* JADX WARN: Code duplicated, block: B:237:0x092d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0987  */
    /* JADX WARN: Code duplicated, block: B:241:0x0997  */
    /* JADX WARN: Code duplicated, block: B:243:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:244:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:247:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:248:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:251:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:252:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0a8f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:259:0x0ad0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:263:0x0b11 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:267:0x0b52 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:271:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:273:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:276:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:277:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:27:0x012d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:282:0x0c24 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:285:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:288:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0c6b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:295:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0c80  */
    /* JADX WARN: Code duplicated, block: B:301:0x0c98 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x0c9a  */
    /* JADX WARN: Code duplicated, block: B:333:0x0e03  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        b11.f fVar;
        String str;
        String str2;
        boolean zR;
        Object objQ;
        p1 p1Var;
        boolean z14;
        Double d14;
        String strH;
        Object objQ2;
        m.a.C2565a c2565a;
        g01.c cVar;
        String strB;
        String str3;
        Object objQ3;
        p1 p1Var2;
        b11.f fVar2;
        Integer num;
        Double dValueOf;
        boolean zR2;
        Object objQ4;
        boolean zR3;
        Object objQ5;
        boolean zR4;
        Object objQ6;
        boolean zR5;
        Object objQ7;
        int i14;
        int i15;
        Object objQ8;
        p1 p1Var3;
        y22.x xVar;
        i53.c cVarB;
        boolean zR6;
        Object objQ9;
        Object objQ10;
        boolean zR7;
        Object objQ11;
        boolean zR8;
        Object objQ12;
        i53.c cVarB2;
        r.a aVar;
        int i16 = this.f59194a;
        m.a aVar2 = m.f135153a;
        Object obj3 = this.f59202i;
        Object obj4 = this.f59195b;
        Object obj5 = this.f59201h;
        Object obj6 = this.f59200g;
        Object obj7 = this.f59199f;
        Object obj8 = this.f59198e;
        Object obj9 = this.f59197d;
        Object obj10 = this.f59196c;
        switch (i16) {
            case 0:
                i53.f fVar3 = (i53.f) obj10;
                n82.f fVar4 = (n82.f) obj9;
                n82.b bVar = fVar4.f124961b;
                ed1.a aVar3 = (ed1.a) obj8;
                u82.d dVar = (u82.d) obj7;
                u82.d dVar2 = (u82.d) obj6;
                u82.d dVar3 = (u82.d) obj5;
                i53.c cVar2 = (i53.c) obj4;
                l lVar = (l) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar4 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar4, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarE, mVar);
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
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    i53.c cVarE = i53.a.e(o2.b(fVar3, mVar));
                    int iIndexOf = fVar3.indexOf(bVar.a());
                    boolean zB = mVar.B(fVar4);
                    Object objQ13 = mVar.q();
                    if (zB) {
                        objQ13 = new a42.f0(fVar4, fVar3, 3);
                        mVar.K(objQ13);
                    } else {
                        aVar2.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new a42.f0(fVar4, fVar3, 3);
                            mVar.K(objQ13);
                        }
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (l) objQ13, mVar, 0, 26);
                    if (bVar.a() != o82.g.f130849b) {
                        mVar.C(-1360841379);
                        q82.a.a(x2.f(aVar4, 1.0f), new n82.n(fVar4, aVar3), null, mVar, 6, 4);
                        mVar.f();
                    } else {
                        mVar.C(-1360632842);
                        mVar.f();
                    }
                    n82.c.a(b0Var.a(aVar4, 1.0f, true), fVar4, 3, false, z3.f.c(393821258, new a42.c0((Object) dVar, (Object) dVar2, (Object) dVar3, (Object) cVar2, lVar, 11), mVar), mVar, 24960, 8);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                d11.a aVar6 = (d11.a) obj10;
                final f11.a aVar7 = (f11.a) obj9;
                i53.c cVar3 = (i53.c) obj4;
                v21.e eVar = (v21.e) obj8;
                p1 p1Var4 = (p1) obj7;
                p1 p1Var5 = (p1) obj6;
                p1 p1Var6 = (p1) obj5;
                e01.a aVar8 = (e01.a) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (aVar6 != null) {
                        mVar2.C(-1693881905);
                        final d11.c cVar4 = aVar6.f57040a;
                        r.a aVar9 = r.S;
                        r rVarB = a2.b(c2.l.D(u1.n.e(aVar9, k.a(d92.b.f58623a, mVar2), m1.f128891a)), a2.a(mVar2), true);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar10 = h4.d.a.f81536n;
                        c2.j.f22691a.getClass();
                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar10, mVar2, 48);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        r rVarC2 = h4.k.c(rVarB, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar11 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        String strQ = y.Q(mVar2, R.string.required_field_star);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97932i, mVar2);
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97920e;
                        float f15 = eVar2.f97917b;
                        mh.c(strQ, c2.l.y(aVar9, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                        String strQ2 = y.Q(mVar2, R.string.food_info);
                        s5.x0 x0Var = j92.f.f97934k;
                        mh.c(strQ2, c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar2.f97917b, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                        t0 t0Var = t0.f16792a;
                        String strQ3 = y.Q(mVar2, R.string.brand_name);
                        String str4 = cVar4.f57050c;
                        b11.f fVar5 = cVar4.f57054g;
                        String str5 = str4 == null ? "" : str4;
                        boolean zR9 = mVar2.r(aVar7);
                        Object objQ14 = mVar2.q();
                        if (zR9) {
                            fVar = fVar5;
                        } else {
                            aVar2.getClass();
                            fVar = fVar5;
                            if (objQ14 == m.a.f135155b) {
                            }
                            x5.v.f188954b.getClass();
                            int i17 = x5.v.f188955c;
                            t0Var.i(null, strQ3, str5, 75, false, (l) objQ14, null, i17, 0, null, mVar2, 12610560, 833);
                            boolean zContains = cVar3.contains(v01.c.MISSING_FOOD_NAME);
                            String strG = k.g(y.Q(mVar2, R.string.food_name), Marker.ANY_MARKER);
                            str = cVar4.f57049b;
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            zR = mVar2.r(aVar7);
                            objQ = mVar2.q();
                            if (zR) {
                                p1Var = p1Var5;
                            } else {
                                aVar2.getClass();
                                p1Var = p1Var5;
                                if (objQ == m.a.f135155b) {
                                }
                                t0Var.i(null, strG, str2, 75, zContains, (l) objQ, null, i17, 0, z3.f.c(-299076998, new e11.g(b0Var2, zContains, 0), mVar2), mVar2, 817892352, 321);
                                c2.l.f(x2.h(aVar9, f15), mVar2);
                                mh.c(y.Q(mVar2, R.string.servings), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                                if (!cVar3.contains(v01.c.MISSING_SERVING_SIZE) || cVar3.contains(v01.c.INVALID_SERVING_SIZE)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                p2 p2Var = p2.f111205a;
                                String strG2 = k.g(y.Q(mVar2, R.string.lbl_nutrition_amount), Marker.ANY_MARKER);
                                d14 = cVar4.f57051d;
                                if (d14 != null) {
                                    double dDoubleValue = d14.doubleValue();
                                    eVar.getClass();
                                    strH = v21.e.h(dDoubleValue);
                                } else {
                                    strH = "";
                                }
                                z3.e eVarC = z3.f.c(-996080604, new e11.g(b0Var2, z14, 1), mVar2);
                                objQ2 = mVar2.q();
                                aVar2.getClass();
                                c2565a = m.a.f135155b;
                                if (objQ2 == c2565a) {
                                    objQ2 = new dv0.f(p1Var4, 4);
                                    mVar2.K(objQ2);
                                }
                                p2Var.h(strG2, strH, null, null, null, false, false, null, eVarC, null, (e23.a) objQ2, mVar2, 100663296, 6, 764);
                                c0.c(b0Var2, z14, null, null, null, null, z3.f.c(1797618009, new aa2.f(28, cVar3, eVar), mVar2), mVar2, 1572870, 30);
                                boolean zContains2 = cVar3.contains(v01.c.MISSING_SERVING_UNIT);
                                String strG3 = k.g(y.Q(mVar2, R.string.unit), Marker.ANY_MARKER);
                                cVar = cVar4.f57053f;
                                if (cVar == null) {
                                    mVar2.C(-542276602);
                                    mVar2.f();
                                    strB = null;
                                } else {
                                    mVar2.C(675243867);
                                    g01.c.INSTANCE.getClass();
                                    strB = g01.c.Companion.b(cVar, 0.0d, mVar2, 1);
                                    mVar2.f();
                                }
                                if (strB == null) {
                                    str3 = "";
                                } else {
                                    str3 = strB;
                                }
                                z3.e eVarC2 = z3.f.c(2127398221, new e11.g(b0Var2, zContains2, 2), mVar2);
                                objQ3 = mVar2.q();
                                if (objQ3 == c2565a) {
                                    p1Var2 = p1Var;
                                    objQ3 = new dv0.f(p1Var2, 5);
                                    mVar2.K(objQ3);
                                } else {
                                    p1Var2 = p1Var;
                                }
                                p2Var.h(strG3, str3, null, null, null, false, false, null, eVarC2, null, (e23.a) objQ3, mVar2, 100663296, 6, 764);
                                e11.b.f61856a.getClass();
                                c0.c(b0Var2, zContains2, null, null, null, null, e11.b.f61860e, mVar2, 1572870, 30);
                                c2.l.f(x2.h(aVar9, f15), mVar2);
                                mh.c(y.Q(mVar2, R.string.nutrition_info), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                                String strQ4 = y.Q(mVar2, R.string.lbl_calories);
                                fVar2 = fVar;
                                num = fVar2.f14266a;
                                if (num != null) {
                                    dValueOf = Double.valueOf(num.intValue());
                                } else {
                                    dValueOf = null;
                                }
                                boolean zContains3 = cVar3.contains(v01.c.MISSING_CALORIES);
                                String strQ5 = y.Q(mVar2, R.string.calories_required);
                                zR2 = mVar2.r(aVar7) | mVar2.r(cVar4);
                                objQ4 = mVar2.q();
                                if (zR2 || objQ4 == c2565a) {
                                    final int i18 = 2;
                                    objQ4 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i18) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar12 = (c11.a) obj11;
                                                    aVar12.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d15 = aVar12.f22494a;
                                                    Double d16 = aVar12.f22495b;
                                                    Double d17 = aVar12.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar12.f22499f, aVar12.f22500g, aVar12.f22501h, d15, aVar12.f22497d, d17, d16, aVar12.f22498e, aVar12.f22502i, aVar12.f22508o, aVar12.f22503j, aVar12.f22504k, aVar12.f22505l, aVar12.f22506m, aVar12.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d18 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ4);
                                }
                                c11.e.a(strQ4, null, dValueOf, true, false, zContains3, strQ5, eVar, false, (l) objQ4, mVar2, 27648, 258);
                                String strQ6 = y.Q(mVar2, R.string.protein);
                                String strQ7 = y.Q(mVar2, R.string.lbl_grams_abr);
                                Double d15 = fVar2.f14268c;
                                zR3 = mVar2.r(aVar7) | mVar2.r(cVar4);
                                objQ5 = mVar2.q();
                                if (zR3 || objQ5 == c2565a) {
                                    final int i19 = 3;
                                    objQ5 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i19) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar12 = (c11.a) obj11;
                                                    aVar12.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d16 = aVar12.f22494a;
                                                    Double d17 = aVar12.f22495b;
                                                    Double d18 = aVar12.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar12.f22499f, aVar12.f22500g, aVar12.f22501h, d16, aVar12.f22497d, d18, d17, aVar12.f22498e, aVar12.f22502i, aVar12.f22508o, aVar12.f22503j, aVar12.f22504k, aVar12.f22505l, aVar12.f22506m, aVar12.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d19 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d19 != null ? Integer.valueOf((int) d19.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ5);
                                }
                                c11.e.a(strQ6, strQ7, d15, false, true, false, null, eVar, false, (l) objQ5, mVar2, 224256, 320);
                                String strQ8 = y.Q(mVar2, R.string.fat);
                                String strQ9 = y.Q(mVar2, R.string.lbl_grams_abr);
                                Double d16 = fVar2.f14269d;
                                zR4 = mVar2.r(aVar7) | mVar2.r(cVar4);
                                objQ6 = mVar2.q();
                                if (zR4 || objQ6 == c2565a) {
                                    final int i24 = 4;
                                    objQ6 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i24) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar12 = (c11.a) obj11;
                                                    aVar12.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d17 = aVar12.f22494a;
                                                    Double d18 = aVar12.f22495b;
                                                    Double d19 = aVar12.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar12.f22499f, aVar12.f22500g, aVar12.f22501h, d17, aVar12.f22497d, d19, d18, aVar12.f22498e, aVar12.f22502i, aVar12.f22508o, aVar12.f22503j, aVar12.f22504k, aVar12.f22505l, aVar12.f22506m, aVar12.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d110 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d110 != null ? Integer.valueOf((int) d110.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ6);
                                }
                                c11.e.a(strQ8, strQ9, d16, false, true, false, null, eVar, false, (l) objQ6, mVar2, 224256, 320);
                                String strQ10 = y.Q(mVar2, R.string.carbs);
                                String strQ11 = y.Q(mVar2, R.string.lbl_grams_abr);
                                Double d17 = fVar2.f14267b;
                                zR5 = mVar2.r(aVar7) | mVar2.r(cVar4);
                                objQ7 = mVar2.q();
                                if (zR5 || objQ7 == c2565a) {
                                    final int i25 = 0;
                                    objQ7 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i25) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar12 = (c11.a) obj11;
                                                    aVar12.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d18 = aVar12.f22494a;
                                                    Double d19 = aVar12.f22495b;
                                                    Double d110 = aVar12.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar12.f22499f, aVar12.f22500g, aVar12.f22501h, d18, aVar12.f22497d, d110, d19, aVar12.f22498e, aVar12.f22502i, aVar12.f22508o, aVar12.f22503j, aVar12.f22504k, aVar12.f22505l, aVar12.f22506m, aVar12.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d111 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d111 != null ? Integer.valueOf((int) d111.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ7);
                                }
                                c11.e.a(strQ10, strQ11, d17, false, true, false, null, eVar, false, (l) objQ7, mVar2, 224256, 320);
                                l72.f0 f0Var = l72.f0.f110999a;
                                if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                                    i14 = -537920884;
                                    i15 = R.string.show_less_data_sentence_case;
                                } else {
                                    i14 = -538027028;
                                    i15 = R.string.show_more_data_sentence_case;
                                }
                                String strH2 = sn.a.h(mVar2, i14, i15, mVar2);
                                objQ8 = mVar2.q();
                                if (objQ8 == c2565a) {
                                    p1Var3 = p1Var6;
                                    objQ8 = new dv0.f(p1Var3, 3);
                                    mVar2.K(objQ8);
                                } else {
                                    p1Var3 = p1Var6;
                                }
                                f0Var.k(strH2, null, false, (e23.a) objQ8, mVar2, 3072, 6);
                                if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                    mVar2.C(-537608404);
                                    c11.a aVar12 = new c11.a(fVar2.f14273h, fVar2.f14276k, fVar2.f14275j, fVar2.f14274i, fVar2.f14277l, fVar2.f14270e, fVar2.f14271f, fVar2.f14272g, fVar2.f14278m, fVar2.f14280o, fVar2.f14281p, fVar2.f14282q, fVar2.f14283r, fVar2.f14284t, fVar2.f14279n);
                                    zR8 = mVar2.r(aVar7) | mVar2.r(cVar4);
                                    objQ12 = mVar2.q();
                                    if (zR8 || objQ12 == c2565a) {
                                        final int i26 = 1;
                                        objQ12 = new l() { // from class: e11.e
                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                switch (i26) {
                                                    case 0:
                                                        aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                        break;
                                                    case 1:
                                                        c11.a aVar13 = (c11.a) obj11;
                                                        aVar13.getClass();
                                                        b11.f fVar6 = cVar4.f57054g;
                                                        Double d18 = aVar13.f22494a;
                                                        Double d19 = aVar13.f22495b;
                                                        Double d110 = aVar13.f22496c;
                                                        aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d18, aVar13.f22497d, d110, d19, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                        break;
                                                    case 2:
                                                        Double d111 = (Double) obj11;
                                                        aVar7.y4(b11.f.b(cVar4.f57054g, d111 != null ? Integer.valueOf((int) d111.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                        break;
                                                    case 3:
                                                        aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                        break;
                                                    default:
                                                        aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ12);
                                    }
                                    jg.b.g(aVar12, eVar, (l) objQ12, mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-535112687);
                                    mVar2.f();
                                }
                                String strQ12 = y.Q(mVar2, R.string.lbl_add_photo);
                                xVar = aVar6.f57042c;
                                if (xVar != null || (cVarB = i53.a.a(xVar)) == null) {
                                    cVarB = j53.l.b();
                                }
                                i53.c cVar5 = cVarB;
                                zR6 = mVar2.r(aVar7);
                                objQ9 = mVar2.q();
                                if (zR6 || objQ9 == c2565a) {
                                    final int i27 = 0;
                                    objQ9 = new l() { // from class: e11.f
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            d11.c cVar6;
                                            d11.c cVar7;
                                            switch (i27) {
                                                case 0:
                                                    List list = (List) obj11;
                                                    list.getClass();
                                                    f11.a aVar13 = aVar7;
                                                    aVar13.getClass();
                                                    y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                    if (xVar2 != null) {
                                                        r53.p2 p2Var2 = aVar13.f67884d;
                                                        d11.a aVar14 = (d11.a) p2Var2.getValue();
                                                        p2Var2.setValue(aVar14 != null ? d11.a.a(aVar14, null, xVar2, 11) : null);
                                                    }
                                                    break;
                                                case 1:
                                                    ((y22.x) obj11).getClass();
                                                    r53.p2 p2Var3 = aVar7.f67884d;
                                                    d11.a aVar15 = (d11.a) p2Var3.getValue();
                                                    p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, null, 11) : null);
                                                    break;
                                                case 2:
                                                    String str6 = (String) obj11;
                                                    str6.getClass();
                                                    f11.a aVar16 = aVar7;
                                                    aVar16.getClass();
                                                    r53.p2 p2Var4 = aVar16.f67884d;
                                                    d11.a aVar17 = (d11.a) p2Var4.getValue();
                                                    if (aVar17 != null && (cVar6 = aVar17.f57040a) != null) {
                                                        d11.c cVarA = d11.c.a(cVar6, null, str6, null, null, null, null, null, 509);
                                                        d11.a aVar18 = (d11.a) p2Var4.getValue();
                                                        p2Var4.setValue(aVar18 != null ? d11.a.a(aVar18, cVarA, null, 14) : null);
                                                        aVar16.x4(v01.c.MISSING_FOOD_NAME);
                                                    }
                                                    break;
                                                default:
                                                    String str7 = (String) obj11;
                                                    str7.getClass();
                                                    f11.a aVar19 = aVar7;
                                                    aVar19.getClass();
                                                    r53.p2 p2Var5 = aVar19.f67884d;
                                                    d11.a aVar20 = (d11.a) p2Var5.getValue();
                                                    if (aVar20 != null && (cVar7 = aVar20.f57040a) != null) {
                                                        d11.c cVarA2 = d11.c.a(cVar7, null, null, str7, null, null, null, null, 507);
                                                        d11.a aVar21 = (d11.a) p2Var5.getValue();
                                                        p2Var5.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ9);
                                }
                                l lVar2 = (l) objQ9;
                                objQ10 = mVar2.q();
                                if (objQ10 == c2565a) {
                                    objQ10 = new d50.b(28);
                                    mVar2.K(objQ10);
                                }
                                p pVar = (p) objQ10;
                                zR7 = mVar2.r(aVar7);
                                objQ11 = mVar2.q();
                                if (zR7 || objQ11 == c2565a) {
                                    final int i28 = 1;
                                    objQ11 = new l() { // from class: e11.f
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            d11.c cVar6;
                                            d11.c cVar7;
                                            switch (i28) {
                                                case 0:
                                                    List list = (List) obj11;
                                                    list.getClass();
                                                    f11.a aVar13 = aVar7;
                                                    aVar13.getClass();
                                                    y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                    if (xVar2 != null) {
                                                        r53.p2 p2Var2 = aVar13.f67884d;
                                                        d11.a aVar14 = (d11.a) p2Var2.getValue();
                                                        p2Var2.setValue(aVar14 != null ? d11.a.a(aVar14, null, xVar2, 11) : null);
                                                    }
                                                    break;
                                                case 1:
                                                    ((y22.x) obj11).getClass();
                                                    r53.p2 p2Var3 = aVar7.f67884d;
                                                    d11.a aVar15 = (d11.a) p2Var3.getValue();
                                                    p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, null, 11) : null);
                                                    break;
                                                case 2:
                                                    String str6 = (String) obj11;
                                                    str6.getClass();
                                                    f11.a aVar16 = aVar7;
                                                    aVar16.getClass();
                                                    r53.p2 p2Var4 = aVar16.f67884d;
                                                    d11.a aVar17 = (d11.a) p2Var4.getValue();
                                                    if (aVar17 != null && (cVar6 = aVar17.f57040a) != null) {
                                                        d11.c cVarA = d11.c.a(cVar6, null, str6, null, null, null, null, null, 509);
                                                        d11.a aVar18 = (d11.a) p2Var4.getValue();
                                                        p2Var4.setValue(aVar18 != null ? d11.a.a(aVar18, cVarA, null, 14) : null);
                                                        aVar16.x4(v01.c.MISSING_FOOD_NAME);
                                                    }
                                                    break;
                                                default:
                                                    String str7 = (String) obj11;
                                                    str7.getClass();
                                                    f11.a aVar19 = aVar7;
                                                    aVar19.getClass();
                                                    r53.p2 p2Var5 = aVar19.f67884d;
                                                    d11.a aVar20 = (d11.a) p2Var5.getValue();
                                                    if (aVar20 != null && (cVar7 = aVar20.f57040a) != null) {
                                                        d11.c cVarA2 = d11.c.a(cVar7, null, null, str7, null, null, null, null, 507);
                                                        d11.a aVar21 = (d11.a) p2Var5.getValue();
                                                        p2Var5.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ11);
                                }
                                y22.d.a(strQ12, cVar5, 1, lVar2, pVar, (l) objQ11, mVar2, (y22.x.f194327d << 3) | 24960);
                                mVar2.y();
                                c0.e(((Boolean) p1Var4.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1390886287, new a42.y(cVar4, aVar8, aVar7, p1Var4, 20), mVar2), mVar2, 196608, 30);
                                c0.e(((Boolean) p1Var2.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(2105636856, new a42.y(cVar4, aVar6, aVar7, p1Var2, 21), mVar2), mVar2, 196608, 30);
                                mVar2.f();
                            }
                            final int i29 = 2;
                            objQ = new l() { // from class: e11.f
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.c cVar6;
                                    d11.c cVar7;
                                    switch (i29) {
                                        case 0:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.a aVar13 = aVar7;
                                            aVar13.getClass();
                                            y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                            if (xVar2 != null) {
                                                r53.p2 p2Var2 = aVar13.f67884d;
                                                d11.a aVar14 = (d11.a) p2Var2.getValue();
                                                p2Var2.setValue(aVar14 != null ? d11.a.a(aVar14, null, xVar2, 11) : null);
                                            }
                                            break;
                                        case 1:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var3 = aVar7.f67884d;
                                            d11.a aVar15 = (d11.a) p2Var3.getValue();
                                            p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, null, 11) : null);
                                            break;
                                        case 2:
                                            String str6 = (String) obj11;
                                            str6.getClass();
                                            f11.a aVar16 = aVar7;
                                            aVar16.getClass();
                                            r53.p2 p2Var4 = aVar16.f67884d;
                                            d11.a aVar17 = (d11.a) p2Var4.getValue();
                                            if (aVar17 != null && (cVar6 = aVar17.f57040a) != null) {
                                                d11.c cVarA = d11.c.a(cVar6, null, str6, null, null, null, null, null, 509);
                                                d11.a aVar18 = (d11.a) p2Var4.getValue();
                                                p2Var4.setValue(aVar18 != null ? d11.a.a(aVar18, cVarA, null, 14) : null);
                                                aVar16.x4(v01.c.MISSING_FOOD_NAME);
                                            }
                                            break;
                                        default:
                                            String str7 = (String) obj11;
                                            str7.getClass();
                                            f11.a aVar19 = aVar7;
                                            aVar19.getClass();
                                            r53.p2 p2Var5 = aVar19.f67884d;
                                            d11.a aVar20 = (d11.a) p2Var5.getValue();
                                            if (aVar20 != null && (cVar7 = aVar20.f57040a) != null) {
                                                d11.c cVarA2 = d11.c.a(cVar7, null, null, str7, null, null, null, null, 507);
                                                d11.a aVar21 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                            t0Var.i(null, strG, str2, 75, zContains, (l) objQ, null, i17, 0, z3.f.c(-299076998, new e11.g(b0Var2, zContains, 0), mVar2), mVar2, 817892352, 321);
                            c2.l.f(x2.h(aVar9, f15), mVar2);
                            mh.c(y.Q(mVar2, R.string.servings), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                            if (cVar3.contains(v01.c.MISSING_SERVING_SIZE)) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            p2 p2Var2 = p2.f111205a;
                            String strG4 = k.g(y.Q(mVar2, R.string.lbl_nutrition_amount), Marker.ANY_MARKER);
                            d14 = cVar4.f57051d;
                            if (d14 != null) {
                                double dDoubleValue2 = d14.doubleValue();
                                eVar.getClass();
                                strH = v21.e.h(dDoubleValue2);
                            } else {
                                strH = "";
                            }
                            z3.e eVarC3 = z3.f.c(-996080604, new e11.g(b0Var2, z14, 1), mVar2);
                            objQ2 = mVar2.q();
                            aVar2.getClass();
                            c2565a = m.a.f135155b;
                            if (objQ2 == c2565a) {
                                objQ2 = new dv0.f(p1Var4, 4);
                                mVar2.K(objQ2);
                            }
                            p2Var2.h(strG4, strH, null, null, null, false, false, null, eVarC3, null, (e23.a) objQ2, mVar2, 100663296, 6, 764);
                            c0.c(b0Var2, z14, null, null, null, null, z3.f.c(1797618009, new aa2.f(28, cVar3, eVar), mVar2), mVar2, 1572870, 30);
                            boolean zContains4 = cVar3.contains(v01.c.MISSING_SERVING_UNIT);
                            String strG5 = k.g(y.Q(mVar2, R.string.unit), Marker.ANY_MARKER);
                            cVar = cVar4.f57053f;
                            if (cVar == null) {
                                mVar2.C(-542276602);
                                mVar2.f();
                                strB = null;
                            } else {
                                mVar2.C(675243867);
                                g01.c.INSTANCE.getClass();
                                strB = g01.c.Companion.b(cVar, 0.0d, mVar2, 1);
                                mVar2.f();
                            }
                            if (strB == null) {
                                str3 = "";
                            } else {
                                str3 = strB;
                            }
                            z3.e eVarC4 = z3.f.c(2127398221, new e11.g(b0Var2, zContains4, 2), mVar2);
                            objQ3 = mVar2.q();
                            if (objQ3 == c2565a) {
                                p1Var2 = p1Var;
                                objQ3 = new dv0.f(p1Var2, 5);
                                mVar2.K(objQ3);
                            } else {
                                p1Var2 = p1Var;
                            }
                            p2Var2.h(strG5, str3, null, null, null, false, false, null, eVarC4, null, (e23.a) objQ3, mVar2, 100663296, 6, 764);
                            e11.b.f61856a.getClass();
                            c0.c(b0Var2, zContains4, null, null, null, null, e11.b.f61860e, mVar2, 1572870, 30);
                            c2.l.f(x2.h(aVar9, f15), mVar2);
                            mh.c(y.Q(mVar2, R.string.nutrition_info), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                            String strQ13 = y.Q(mVar2, R.string.lbl_calories);
                            fVar2 = fVar;
                            num = fVar2.f14266a;
                            if (num != null) {
                                dValueOf = Double.valueOf(num.intValue());
                            } else {
                                dValueOf = null;
                            }
                            boolean zContains5 = cVar3.contains(v01.c.MISSING_CALORIES);
                            String strQ14 = y.Q(mVar2, R.string.calories_required);
                            zR2 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ4 = mVar2.q();
                            if (zR2) {
                                final int i110 = 2;
                                objQ4 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i110) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d18 = aVar13.f22494a;
                                                Double d19 = aVar13.f22495b;
                                                Double d110 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d18, aVar13.f22497d, d110, d19, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d111 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d111 != null ? Integer.valueOf((int) d111.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ4);
                            } else {
                                final int i111 = 2;
                                objQ4 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i111) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d18 = aVar13.f22494a;
                                                Double d19 = aVar13.f22495b;
                                                Double d110 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d18, aVar13.f22497d, d110, d19, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d111 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d111 != null ? Integer.valueOf((int) d111.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ4);
                            }
                            c11.e.a(strQ13, null, dValueOf, true, false, zContains5, strQ14, eVar, false, (l) objQ4, mVar2, 27648, 258);
                            String strQ15 = y.Q(mVar2, R.string.protein);
                            String strQ16 = y.Q(mVar2, R.string.lbl_grams_abr);
                            Double d18 = fVar2.f14268c;
                            zR3 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ5 = mVar2.q();
                            if (zR3) {
                                final int i112 = 3;
                                objQ5 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i112) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d19 = aVar13.f22494a;
                                                Double d110 = aVar13.f22495b;
                                                Double d111 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d19, aVar13.f22497d, d111, d110, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d112 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d112 != null ? Integer.valueOf((int) d112.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ5);
                            } else {
                                final int i113 = 3;
                                objQ5 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i113) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d19 = aVar13.f22494a;
                                                Double d110 = aVar13.f22495b;
                                                Double d111 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d19, aVar13.f22497d, d111, d110, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d112 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d112 != null ? Integer.valueOf((int) d112.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ5);
                            }
                            c11.e.a(strQ15, strQ16, d18, false, true, false, null, eVar, false, (l) objQ5, mVar2, 224256, 320);
                            String strQ17 = y.Q(mVar2, R.string.fat);
                            String strQ18 = y.Q(mVar2, R.string.lbl_grams_abr);
                            Double d19 = fVar2.f14269d;
                            zR4 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ6 = mVar2.q();
                            if (zR4) {
                                final int i210 = 4;
                                objQ6 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i210) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d110 = aVar13.f22494a;
                                                Double d111 = aVar13.f22495b;
                                                Double d112 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d110, aVar13.f22497d, d112, d111, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d113 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d113 != null ? Integer.valueOf((int) d113.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ6);
                            } else {
                                final int i211 = 4;
                                objQ6 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i211) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d110 = aVar13.f22494a;
                                                Double d111 = aVar13.f22495b;
                                                Double d112 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d110, aVar13.f22497d, d112, d111, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d113 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d113 != null ? Integer.valueOf((int) d113.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ6);
                            }
                            c11.e.a(strQ17, strQ18, d19, false, true, false, null, eVar, false, (l) objQ6, mVar2, 224256, 320);
                            String strQ19 = y.Q(mVar2, R.string.carbs);
                            String strQ110 = y.Q(mVar2, R.string.lbl_grams_abr);
                            Double d110 = fVar2.f14267b;
                            zR5 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ7 = mVar2.q();
                            if (zR5) {
                                final int i212 = 0;
                                objQ7 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i212) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d111 = aVar13.f22494a;
                                                Double d112 = aVar13.f22495b;
                                                Double d113 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d111, aVar13.f22497d, d113, d112, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d114 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d114 != null ? Integer.valueOf((int) d114.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            } else {
                                final int i213 = 0;
                                objQ7 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i213) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar13 = (c11.a) obj11;
                                                aVar13.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d111 = aVar13.f22494a;
                                                Double d112 = aVar13.f22495b;
                                                Double d113 = aVar13.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar13.f22499f, aVar13.f22500g, aVar13.f22501h, d111, aVar13.f22497d, d113, d112, aVar13.f22498e, aVar13.f22502i, aVar13.f22508o, aVar13.f22503j, aVar13.f22504k, aVar13.f22505l, aVar13.f22506m, aVar13.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d114 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d114 != null ? Integer.valueOf((int) d114.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            }
                            c11.e.a(strQ19, strQ110, d110, false, true, false, null, eVar, false, (l) objQ7, mVar2, 224256, 320);
                            l72.f0 f0Var2 = l72.f0.f110999a;
                            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                                i14 = -538027028;
                                i15 = R.string.show_more_data_sentence_case;
                            } else {
                                i14 = -537920884;
                                i15 = R.string.show_less_data_sentence_case;
                            }
                            String strH3 = sn.a.h(mVar2, i14, i15, mVar2);
                            objQ8 = mVar2.q();
                            if (objQ8 == c2565a) {
                                p1Var3 = p1Var6;
                                objQ8 = new dv0.f(p1Var3, 3);
                                mVar2.K(objQ8);
                            } else {
                                p1Var3 = p1Var6;
                            }
                            f0Var2.k(strH3, null, false, (e23.a) objQ8, mVar2, 3072, 6);
                            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                mVar2.C(-537608404);
                                c11.a aVar13 = new c11.a(fVar2.f14273h, fVar2.f14276k, fVar2.f14275j, fVar2.f14274i, fVar2.f14277l, fVar2.f14270e, fVar2.f14271f, fVar2.f14272g, fVar2.f14278m, fVar2.f14280o, fVar2.f14281p, fVar2.f14282q, fVar2.f14283r, fVar2.f14284t, fVar2.f14279n);
                                zR8 = mVar2.r(aVar7) | mVar2.r(cVar4);
                                objQ12 = mVar2.q();
                                if (zR8) {
                                    final int i214 = 1;
                                    objQ12 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i214) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar14 = (c11.a) obj11;
                                                    aVar14.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d111 = aVar14.f22494a;
                                                    Double d112 = aVar14.f22495b;
                                                    Double d113 = aVar14.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d111, aVar14.f22497d, d113, d112, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d114 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d114 != null ? Integer.valueOf((int) d114.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ12);
                                } else {
                                    final int i215 = 1;
                                    objQ12 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i215) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar14 = (c11.a) obj11;
                                                    aVar14.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d111 = aVar14.f22494a;
                                                    Double d112 = aVar14.f22495b;
                                                    Double d113 = aVar14.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d111, aVar14.f22497d, d113, d112, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d114 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d114 != null ? Integer.valueOf((int) d114.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ12);
                                }
                                jg.b.g(aVar13, eVar, (l) objQ12, mVar2, 0);
                                mVar2.f();
                            } else {
                                mVar2.C(-535112687);
                                mVar2.f();
                            }
                            String strQ111 = y.Q(mVar2, R.string.lbl_add_photo);
                            xVar = aVar6.f57042c;
                            if (xVar != null) {
                                cVarB = j53.l.b();
                            } else {
                                cVarB = j53.l.b();
                            }
                            i53.c cVar6 = cVarB;
                            zR6 = mVar2.r(aVar7);
                            objQ9 = mVar2.q();
                            if (zR6) {
                                final int i216 = 0;
                                objQ9 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar7;
                                        d11.c cVar8;
                                        switch (i216) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar14 = aVar7;
                                                aVar14.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var3 = aVar14.f67884d;
                                                    d11.a aVar15 = (d11.a) p2Var3.getValue();
                                                    p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var4 = aVar7.f67884d;
                                                d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar17 = aVar7;
                                                aVar17.getClass();
                                                r53.p2 p2Var5 = aVar17.f67884d;
                                                d11.a aVar18 = (d11.a) p2Var5.getValue();
                                                if (aVar18 != null && (cVar7 = aVar18.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar7, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar19 = (d11.a) p2Var5.getValue();
                                                    p2Var5.setValue(aVar19 != null ? d11.a.a(aVar19, cVarA, null, 14) : null);
                                                    aVar17.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar110 = aVar7;
                                                aVar110.getClass();
                                                r53.p2 p2Var6 = aVar110.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var6.getValue();
                                                if (aVar20 != null && (cVar8 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar8, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ9);
                            } else {
                                final int i217 = 0;
                                objQ9 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar7;
                                        d11.c cVar8;
                                        switch (i217) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar14 = aVar7;
                                                aVar14.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var3 = aVar14.f67884d;
                                                    d11.a aVar15 = (d11.a) p2Var3.getValue();
                                                    p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var4 = aVar7.f67884d;
                                                d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar17 = aVar7;
                                                aVar17.getClass();
                                                r53.p2 p2Var5 = aVar17.f67884d;
                                                d11.a aVar18 = (d11.a) p2Var5.getValue();
                                                if (aVar18 != null && (cVar7 = aVar18.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar7, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar19 = (d11.a) p2Var5.getValue();
                                                    p2Var5.setValue(aVar19 != null ? d11.a.a(aVar19, cVarA, null, 14) : null);
                                                    aVar17.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar110 = aVar7;
                                                aVar110.getClass();
                                                r53.p2 p2Var6 = aVar110.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var6.getValue();
                                                if (aVar20 != null && (cVar8 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar8, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ9);
                            }
                            l lVar3 = (l) objQ9;
                            objQ10 = mVar2.q();
                            if (objQ10 == c2565a) {
                                objQ10 = new d50.b(28);
                                mVar2.K(objQ10);
                            }
                            p pVar2 = (p) objQ10;
                            zR7 = mVar2.r(aVar7);
                            objQ11 = mVar2.q();
                            if (zR7) {
                                final int i218 = 1;
                                objQ11 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar7;
                                        d11.c cVar8;
                                        switch (i218) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar14 = aVar7;
                                                aVar14.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var3 = aVar14.f67884d;
                                                    d11.a aVar15 = (d11.a) p2Var3.getValue();
                                                    p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var4 = aVar7.f67884d;
                                                d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar17 = aVar7;
                                                aVar17.getClass();
                                                r53.p2 p2Var5 = aVar17.f67884d;
                                                d11.a aVar18 = (d11.a) p2Var5.getValue();
                                                if (aVar18 != null && (cVar7 = aVar18.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar7, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar19 = (d11.a) p2Var5.getValue();
                                                    p2Var5.setValue(aVar19 != null ? d11.a.a(aVar19, cVarA, null, 14) : null);
                                                    aVar17.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar110 = aVar7;
                                                aVar110.getClass();
                                                r53.p2 p2Var6 = aVar110.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var6.getValue();
                                                if (aVar20 != null && (cVar8 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar8, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ11);
                            } else {
                                final int i219 = 1;
                                objQ11 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar7;
                                        d11.c cVar8;
                                        switch (i219) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar14 = aVar7;
                                                aVar14.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var3 = aVar14.f67884d;
                                                    d11.a aVar15 = (d11.a) p2Var3.getValue();
                                                    p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var4 = aVar7.f67884d;
                                                d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar17 = aVar7;
                                                aVar17.getClass();
                                                r53.p2 p2Var5 = aVar17.f67884d;
                                                d11.a aVar18 = (d11.a) p2Var5.getValue();
                                                if (aVar18 != null && (cVar7 = aVar18.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar7, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar19 = (d11.a) p2Var5.getValue();
                                                    p2Var5.setValue(aVar19 != null ? d11.a.a(aVar19, cVarA, null, 14) : null);
                                                    aVar17.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar110 = aVar7;
                                                aVar110.getClass();
                                                r53.p2 p2Var6 = aVar110.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var6.getValue();
                                                if (aVar20 != null && (cVar8 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar8, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ11);
                            }
                            y22.d.a(strQ111, cVar6, 1, lVar3, pVar2, (l) objQ11, mVar2, (y22.x.f194327d << 3) | 24960);
                            mVar2.y();
                            c0.e(((Boolean) p1Var4.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1390886287, new a42.y(cVar4, aVar8, aVar7, p1Var4, 20), mVar2), mVar2, 196608, 30);
                            c0.e(((Boolean) p1Var2.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(2105636856, new a42.y(cVar4, aVar6, aVar7, p1Var2, 21), mVar2), mVar2, 196608, 30);
                            mVar2.f();
                        }
                        final int i30 = 3;
                        objQ14 = new l() { // from class: e11.f
                            @Override // e23.l
                            public final Object invoke(Object obj11) {
                                d11.c cVar7;
                                d11.c cVar8;
                                switch (i30) {
                                    case 0:
                                        List list = (List) obj11;
                                        list.getClass();
                                        f11.a aVar14 = aVar7;
                                        aVar14.getClass();
                                        y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                        if (xVar2 != null) {
                                            r53.p2 p2Var3 = aVar14.f67884d;
                                            d11.a aVar15 = (d11.a) p2Var3.getValue();
                                            p2Var3.setValue(aVar15 != null ? d11.a.a(aVar15, null, xVar2, 11) : null);
                                        }
                                        break;
                                    case 1:
                                        ((y22.x) obj11).getClass();
                                        r53.p2 p2Var4 = aVar7.f67884d;
                                        d11.a aVar16 = (d11.a) p2Var4.getValue();
                                        p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, null, 11) : null);
                                        break;
                                    case 2:
                                        String str6 = (String) obj11;
                                        str6.getClass();
                                        f11.a aVar17 = aVar7;
                                        aVar17.getClass();
                                        r53.p2 p2Var5 = aVar17.f67884d;
                                        d11.a aVar18 = (d11.a) p2Var5.getValue();
                                        if (aVar18 != null && (cVar7 = aVar18.f57040a) != null) {
                                            d11.c cVarA = d11.c.a(cVar7, null, str6, null, null, null, null, null, 509);
                                            d11.a aVar19 = (d11.a) p2Var5.getValue();
                                            p2Var5.setValue(aVar19 != null ? d11.a.a(aVar19, cVarA, null, 14) : null);
                                            aVar17.x4(v01.c.MISSING_FOOD_NAME);
                                        }
                                        break;
                                    default:
                                        String str7 = (String) obj11;
                                        str7.getClass();
                                        f11.a aVar110 = aVar7;
                                        aVar110.getClass();
                                        r53.p2 p2Var6 = aVar110.f67884d;
                                        d11.a aVar20 = (d11.a) p2Var6.getValue();
                                        if (aVar20 != null && (cVar8 = aVar20.f57040a) != null) {
                                            d11.c cVarA2 = d11.c.a(cVar8, null, null, str7, null, null, null, null, 507);
                                            d11.a aVar21 = (d11.a) p2Var6.getValue();
                                            p2Var6.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ14);
                        x5.v.f188954b.getClass();
                        int i114 = x5.v.f188955c;
                        t0Var.i(null, strQ3, str5, 75, false, (l) objQ14, null, i114, 0, null, mVar2, 12610560, 833);
                        boolean zContains6 = cVar3.contains(v01.c.MISSING_FOOD_NAME);
                        String strG6 = k.g(y.Q(mVar2, R.string.food_name), Marker.ANY_MARKER);
                        str = cVar4.f57049b;
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        zR = mVar2.r(aVar7);
                        objQ = mVar2.q();
                        if (zR) {
                            aVar2.getClass();
                            p1Var = p1Var5;
                            if (objQ == m.a.f135155b) {
                            }
                            t0Var.i(null, strG6, str2, 75, zContains6, (l) objQ, null, i114, 0, z3.f.c(-299076998, new e11.g(b0Var2, zContains6, 0), mVar2), mVar2, 817892352, 321);
                            c2.l.f(x2.h(aVar9, f15), mVar2);
                            mh.c(y.Q(mVar2, R.string.servings), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                            if (cVar3.contains(v01.c.MISSING_SERVING_SIZE)) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            p2 p2Var3 = p2.f111205a;
                            String strG7 = k.g(y.Q(mVar2, R.string.lbl_nutrition_amount), Marker.ANY_MARKER);
                            d14 = cVar4.f57051d;
                            if (d14 != null) {
                                double dDoubleValue3 = d14.doubleValue();
                                eVar.getClass();
                                strH = v21.e.h(dDoubleValue3);
                            } else {
                                strH = "";
                            }
                            z3.e eVarC5 = z3.f.c(-996080604, new e11.g(b0Var2, z14, 1), mVar2);
                            objQ2 = mVar2.q();
                            aVar2.getClass();
                            c2565a = m.a.f135155b;
                            if (objQ2 == c2565a) {
                                objQ2 = new dv0.f(p1Var4, 4);
                                mVar2.K(objQ2);
                            }
                            p2Var3.h(strG7, strH, null, null, null, false, false, null, eVarC5, null, (e23.a) objQ2, mVar2, 100663296, 6, 764);
                            c0.c(b0Var2, z14, null, null, null, null, z3.f.c(1797618009, new aa2.f(28, cVar3, eVar), mVar2), mVar2, 1572870, 30);
                            boolean zContains7 = cVar3.contains(v01.c.MISSING_SERVING_UNIT);
                            String strG8 = k.g(y.Q(mVar2, R.string.unit), Marker.ANY_MARKER);
                            cVar = cVar4.f57053f;
                            if (cVar == null) {
                                mVar2.C(-542276602);
                                mVar2.f();
                                strB = null;
                            } else {
                                mVar2.C(675243867);
                                g01.c.INSTANCE.getClass();
                                strB = g01.c.Companion.b(cVar, 0.0d, mVar2, 1);
                                mVar2.f();
                            }
                            if (strB == null) {
                                str3 = "";
                            } else {
                                str3 = strB;
                            }
                            z3.e eVarC6 = z3.f.c(2127398221, new e11.g(b0Var2, zContains7, 2), mVar2);
                            objQ3 = mVar2.q();
                            if (objQ3 == c2565a) {
                                p1Var2 = p1Var;
                                objQ3 = new dv0.f(p1Var2, 5);
                                mVar2.K(objQ3);
                            } else {
                                p1Var2 = p1Var;
                            }
                            p2Var3.h(strG8, str3, null, null, null, false, false, null, eVarC6, null, (e23.a) objQ3, mVar2, 100663296, 6, 764);
                            e11.b.f61856a.getClass();
                            c0.c(b0Var2, zContains7, null, null, null, null, e11.b.f61860e, mVar2, 1572870, 30);
                            c2.l.f(x2.h(aVar9, f15), mVar2);
                            mh.c(y.Q(mVar2, R.string.nutrition_info), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                            String strQ112 = y.Q(mVar2, R.string.lbl_calories);
                            fVar2 = fVar;
                            num = fVar2.f14266a;
                            if (num != null) {
                                dValueOf = Double.valueOf(num.intValue());
                            } else {
                                dValueOf = null;
                            }
                            boolean zContains8 = cVar3.contains(v01.c.MISSING_CALORIES);
                            String strQ113 = y.Q(mVar2, R.string.calories_required);
                            zR2 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ4 = mVar2.q();
                            if (zR2) {
                                final int i115 = 2;
                                objQ4 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i115) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d111 = aVar14.f22494a;
                                                Double d112 = aVar14.f22495b;
                                                Double d113 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d111, aVar14.f22497d, d113, d112, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d114 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d114 != null ? Integer.valueOf((int) d114.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ4);
                            } else {
                                final int i116 = 2;
                                objQ4 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i116) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d111 = aVar14.f22494a;
                                                Double d112 = aVar14.f22495b;
                                                Double d113 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d111, aVar14.f22497d, d113, d112, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d114 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d114 != null ? Integer.valueOf((int) d114.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ4);
                            }
                            c11.e.a(strQ112, null, dValueOf, true, false, zContains8, strQ113, eVar, false, (l) objQ4, mVar2, 27648, 258);
                            String strQ114 = y.Q(mVar2, R.string.protein);
                            String strQ115 = y.Q(mVar2, R.string.lbl_grams_abr);
                            Double d111 = fVar2.f14268c;
                            zR3 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ5 = mVar2.q();
                            if (zR3) {
                                final int i117 = 3;
                                objQ5 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i117) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d112 = aVar14.f22494a;
                                                Double d113 = aVar14.f22495b;
                                                Double d114 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d112, aVar14.f22497d, d114, d113, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d115 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d115 != null ? Integer.valueOf((int) d115.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ5);
                            } else {
                                final int i118 = 3;
                                objQ5 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i118) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d112 = aVar14.f22494a;
                                                Double d113 = aVar14.f22495b;
                                                Double d114 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d112, aVar14.f22497d, d114, d113, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d115 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d115 != null ? Integer.valueOf((int) d115.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ5);
                            }
                            c11.e.a(strQ114, strQ115, d111, false, true, false, null, eVar, false, (l) objQ5, mVar2, 224256, 320);
                            String strQ116 = y.Q(mVar2, R.string.fat);
                            String strQ117 = y.Q(mVar2, R.string.lbl_grams_abr);
                            Double d112 = fVar2.f14269d;
                            zR4 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ6 = mVar2.q();
                            if (zR4) {
                                final int i2110 = 4;
                                objQ6 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i2110) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d113 = aVar14.f22494a;
                                                Double d114 = aVar14.f22495b;
                                                Double d115 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d113, aVar14.f22497d, d115, d114, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d116 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d116 != null ? Integer.valueOf((int) d116.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ6);
                            } else {
                                final int i2111 = 4;
                                objQ6 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i2111) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d113 = aVar14.f22494a;
                                                Double d114 = aVar14.f22495b;
                                                Double d115 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d113, aVar14.f22497d, d115, d114, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d116 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d116 != null ? Integer.valueOf((int) d116.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ6);
                            }
                            c11.e.a(strQ116, strQ117, d112, false, true, false, null, eVar, false, (l) objQ6, mVar2, 224256, 320);
                            String strQ118 = y.Q(mVar2, R.string.carbs);
                            String strQ119 = y.Q(mVar2, R.string.lbl_grams_abr);
                            Double d113 = fVar2.f14267b;
                            zR5 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ7 = mVar2.q();
                            if (zR5) {
                                final int i2112 = 0;
                                objQ7 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i2112) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d114 = aVar14.f22494a;
                                                Double d115 = aVar14.f22495b;
                                                Double d116 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d114, aVar14.f22497d, d116, d115, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d117 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d117 != null ? Integer.valueOf((int) d117.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            } else {
                                final int i2113 = 0;
                                objQ7 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i2113) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar14 = (c11.a) obj11;
                                                aVar14.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d114 = aVar14.f22494a;
                                                Double d115 = aVar14.f22495b;
                                                Double d116 = aVar14.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar14.f22499f, aVar14.f22500g, aVar14.f22501h, d114, aVar14.f22497d, d116, d115, aVar14.f22498e, aVar14.f22502i, aVar14.f22508o, aVar14.f22503j, aVar14.f22504k, aVar14.f22505l, aVar14.f22506m, aVar14.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d117 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d117 != null ? Integer.valueOf((int) d117.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            }
                            c11.e.a(strQ118, strQ119, d113, false, true, false, null, eVar, false, (l) objQ7, mVar2, 224256, 320);
                            l72.f0 f0Var3 = l72.f0.f110999a;
                            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                                i14 = -538027028;
                                i15 = R.string.show_more_data_sentence_case;
                            } else {
                                i14 = -537920884;
                                i15 = R.string.show_less_data_sentence_case;
                            }
                            String strH4 = sn.a.h(mVar2, i14, i15, mVar2);
                            objQ8 = mVar2.q();
                            if (objQ8 == c2565a) {
                                p1Var3 = p1Var6;
                                objQ8 = new dv0.f(p1Var3, 3);
                                mVar2.K(objQ8);
                            } else {
                                p1Var3 = p1Var6;
                            }
                            f0Var3.k(strH4, null, false, (e23.a) objQ8, mVar2, 3072, 6);
                            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                mVar2.C(-537608404);
                                c11.a aVar14 = new c11.a(fVar2.f14273h, fVar2.f14276k, fVar2.f14275j, fVar2.f14274i, fVar2.f14277l, fVar2.f14270e, fVar2.f14271f, fVar2.f14272g, fVar2.f14278m, fVar2.f14280o, fVar2.f14281p, fVar2.f14282q, fVar2.f14283r, fVar2.f14284t, fVar2.f14279n);
                                zR8 = mVar2.r(aVar7) | mVar2.r(cVar4);
                                objQ12 = mVar2.q();
                                if (zR8) {
                                    final int i2114 = 1;
                                    objQ12 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i2114) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar15 = (c11.a) obj11;
                                                    aVar15.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d114 = aVar15.f22494a;
                                                    Double d115 = aVar15.f22495b;
                                                    Double d116 = aVar15.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d114, aVar15.f22497d, d116, d115, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d117 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d117 != null ? Integer.valueOf((int) d117.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ12);
                                } else {
                                    final int i2115 = 1;
                                    objQ12 = new l() { // from class: e11.e
                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            switch (i2115) {
                                                case 0:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                    break;
                                                case 1:
                                                    c11.a aVar15 = (c11.a) obj11;
                                                    aVar15.getClass();
                                                    b11.f fVar6 = cVar4.f57054g;
                                                    Double d114 = aVar15.f22494a;
                                                    Double d115 = aVar15.f22495b;
                                                    Double d116 = aVar15.f22496c;
                                                    aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d114, aVar15.f22497d, d116, d115, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                                    break;
                                                case 2:
                                                    Double d117 = (Double) obj11;
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, d117 != null ? Integer.valueOf((int) d117.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                    break;
                                                case 3:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                    break;
                                                default:
                                                    aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ12);
                                }
                                jg.b.g(aVar14, eVar, (l) objQ12, mVar2, 0);
                                mVar2.f();
                            } else {
                                mVar2.C(-535112687);
                                mVar2.f();
                            }
                            String strQ1110 = y.Q(mVar2, R.string.lbl_add_photo);
                            xVar = aVar6.f57042c;
                            if (xVar != null) {
                                cVarB = j53.l.b();
                            } else {
                                cVarB = j53.l.b();
                            }
                            i53.c cVar7 = cVarB;
                            zR6 = mVar2.r(aVar7);
                            objQ9 = mVar2.q();
                            if (zR6) {
                                final int i2116 = 0;
                                objQ9 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar8;
                                        d11.c cVar9;
                                        switch (i2116) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar15 = aVar7;
                                                aVar15.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var4 = aVar15.f67884d;
                                                    d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                    p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var5 = aVar7.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar18 = aVar7;
                                                aVar18.getClass();
                                                r53.p2 p2Var6 = aVar18.f67884d;
                                                d11.a aVar19 = (d11.a) p2Var6.getValue();
                                                if (aVar19 != null && (cVar8 = aVar19.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar8, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar110 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar110 != null ? d11.a.a(aVar110, cVarA, null, 14) : null);
                                                    aVar18.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar111 = aVar7;
                                                aVar111.getClass();
                                                r53.p2 p2Var7 = aVar111.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var7.getValue();
                                                if (aVar20 != null && (cVar9 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar9, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var7.getValue();
                                                    p2Var7.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ9);
                            } else {
                                final int i2117 = 0;
                                objQ9 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar8;
                                        d11.c cVar9;
                                        switch (i2117) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar15 = aVar7;
                                                aVar15.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var4 = aVar15.f67884d;
                                                    d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                    p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var5 = aVar7.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar18 = aVar7;
                                                aVar18.getClass();
                                                r53.p2 p2Var6 = aVar18.f67884d;
                                                d11.a aVar19 = (d11.a) p2Var6.getValue();
                                                if (aVar19 != null && (cVar8 = aVar19.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar8, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar110 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar110 != null ? d11.a.a(aVar110, cVarA, null, 14) : null);
                                                    aVar18.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar111 = aVar7;
                                                aVar111.getClass();
                                                r53.p2 p2Var7 = aVar111.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var7.getValue();
                                                if (aVar20 != null && (cVar9 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar9, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var7.getValue();
                                                    p2Var7.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ9);
                            }
                            l lVar4 = (l) objQ9;
                            objQ10 = mVar2.q();
                            if (objQ10 == c2565a) {
                                objQ10 = new d50.b(28);
                                mVar2.K(objQ10);
                            }
                            p pVar3 = (p) objQ10;
                            zR7 = mVar2.r(aVar7);
                            objQ11 = mVar2.q();
                            if (zR7) {
                                final int i2118 = 1;
                                objQ11 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar8;
                                        d11.c cVar9;
                                        switch (i2118) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar15 = aVar7;
                                                aVar15.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var4 = aVar15.f67884d;
                                                    d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                    p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var5 = aVar7.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar18 = aVar7;
                                                aVar18.getClass();
                                                r53.p2 p2Var6 = aVar18.f67884d;
                                                d11.a aVar19 = (d11.a) p2Var6.getValue();
                                                if (aVar19 != null && (cVar8 = aVar19.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar8, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar110 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar110 != null ? d11.a.a(aVar110, cVarA, null, 14) : null);
                                                    aVar18.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar111 = aVar7;
                                                aVar111.getClass();
                                                r53.p2 p2Var7 = aVar111.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var7.getValue();
                                                if (aVar20 != null && (cVar9 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar9, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var7.getValue();
                                                    p2Var7.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ11);
                            } else {
                                final int i2119 = 1;
                                objQ11 = new l() { // from class: e11.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.c cVar8;
                                        d11.c cVar9;
                                        switch (i2119) {
                                            case 0:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.a aVar15 = aVar7;
                                                aVar15.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var4 = aVar15.f67884d;
                                                    d11.a aVar16 = (d11.a) p2Var4.getValue();
                                                    p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, xVar2, 11) : null);
                                                }
                                                break;
                                            case 1:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var5 = aVar7.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, null, 11) : null);
                                                break;
                                            case 2:
                                                String str6 = (String) obj11;
                                                str6.getClass();
                                                f11.a aVar18 = aVar7;
                                                aVar18.getClass();
                                                r53.p2 p2Var6 = aVar18.f67884d;
                                                d11.a aVar19 = (d11.a) p2Var6.getValue();
                                                if (aVar19 != null && (cVar8 = aVar19.f57040a) != null) {
                                                    d11.c cVarA = d11.c.a(cVar8, null, str6, null, null, null, null, null, 509);
                                                    d11.a aVar110 = (d11.a) p2Var6.getValue();
                                                    p2Var6.setValue(aVar110 != null ? d11.a.a(aVar110, cVarA, null, 14) : null);
                                                    aVar18.x4(v01.c.MISSING_FOOD_NAME);
                                                }
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                f11.a aVar111 = aVar7;
                                                aVar111.getClass();
                                                r53.p2 p2Var7 = aVar111.f67884d;
                                                d11.a aVar20 = (d11.a) p2Var7.getValue();
                                                if (aVar20 != null && (cVar9 = aVar20.f57040a) != null) {
                                                    d11.c cVarA2 = d11.c.a(cVar9, null, null, str7, null, null, null, null, 507);
                                                    d11.a aVar21 = (d11.a) p2Var7.getValue();
                                                    p2Var7.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ11);
                            }
                            y22.d.a(strQ1110, cVar7, 1, lVar4, pVar3, (l) objQ11, mVar2, (y22.x.f194327d << 3) | 24960);
                            mVar2.y();
                            c0.e(((Boolean) p1Var4.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1390886287, new a42.y(cVar4, aVar8, aVar7, p1Var4, 20), mVar2), mVar2, 196608, 30);
                            c0.e(((Boolean) p1Var2.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(2105636856, new a42.y(cVar4, aVar6, aVar7, p1Var2, 21), mVar2), mVar2, 196608, 30);
                            mVar2.f();
                        } else {
                            p1Var = p1Var5;
                        }
                        final int i220 = 2;
                        objQ = new l() { // from class: e11.f
                            @Override // e23.l
                            public final Object invoke(Object obj11) {
                                d11.c cVar8;
                                d11.c cVar9;
                                switch (i220) {
                                    case 0:
                                        List list = (List) obj11;
                                        list.getClass();
                                        f11.a aVar15 = aVar7;
                                        aVar15.getClass();
                                        y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                        if (xVar2 != null) {
                                            r53.p2 p2Var4 = aVar15.f67884d;
                                            d11.a aVar16 = (d11.a) p2Var4.getValue();
                                            p2Var4.setValue(aVar16 != null ? d11.a.a(aVar16, null, xVar2, 11) : null);
                                        }
                                        break;
                                    case 1:
                                        ((y22.x) obj11).getClass();
                                        r53.p2 p2Var5 = aVar7.f67884d;
                                        d11.a aVar17 = (d11.a) p2Var5.getValue();
                                        p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, null, 11) : null);
                                        break;
                                    case 2:
                                        String str6 = (String) obj11;
                                        str6.getClass();
                                        f11.a aVar18 = aVar7;
                                        aVar18.getClass();
                                        r53.p2 p2Var6 = aVar18.f67884d;
                                        d11.a aVar19 = (d11.a) p2Var6.getValue();
                                        if (aVar19 != null && (cVar8 = aVar19.f57040a) != null) {
                                            d11.c cVarA = d11.c.a(cVar8, null, str6, null, null, null, null, null, 509);
                                            d11.a aVar110 = (d11.a) p2Var6.getValue();
                                            p2Var6.setValue(aVar110 != null ? d11.a.a(aVar110, cVarA, null, 14) : null);
                                            aVar18.x4(v01.c.MISSING_FOOD_NAME);
                                        }
                                        break;
                                    default:
                                        String str7 = (String) obj11;
                                        str7.getClass();
                                        f11.a aVar111 = aVar7;
                                        aVar111.getClass();
                                        r53.p2 p2Var7 = aVar111.f67884d;
                                        d11.a aVar20 = (d11.a) p2Var7.getValue();
                                        if (aVar20 != null && (cVar9 = aVar20.f57040a) != null) {
                                            d11.c cVarA2 = d11.c.a(cVar9, null, null, str7, null, null, null, null, 507);
                                            d11.a aVar21 = (d11.a) p2Var7.getValue();
                                            p2Var7.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                        t0Var.i(null, strG6, str2, 75, zContains6, (l) objQ, null, i114, 0, z3.f.c(-299076998, new e11.g(b0Var2, zContains6, 0), mVar2), mVar2, 817892352, 321);
                        c2.l.f(x2.h(aVar9, f15), mVar2);
                        mh.c(y.Q(mVar2, R.string.servings), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                        if (cVar3.contains(v01.c.MISSING_SERVING_SIZE)) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        p2 p2Var4 = p2.f111205a;
                        String strG9 = k.g(y.Q(mVar2, R.string.lbl_nutrition_amount), Marker.ANY_MARKER);
                        d14 = cVar4.f57051d;
                        if (d14 != null) {
                            double dDoubleValue4 = d14.doubleValue();
                            eVar.getClass();
                            strH = v21.e.h(dDoubleValue4);
                        } else {
                            strH = "";
                        }
                        z3.e eVarC7 = z3.f.c(-996080604, new e11.g(b0Var2, z14, 1), mVar2);
                        objQ2 = mVar2.q();
                        aVar2.getClass();
                        c2565a = m.a.f135155b;
                        if (objQ2 == c2565a) {
                            objQ2 = new dv0.f(p1Var4, 4);
                            mVar2.K(objQ2);
                        }
                        p2Var4.h(strG9, strH, null, null, null, false, false, null, eVarC7, null, (e23.a) objQ2, mVar2, 100663296, 6, 764);
                        c0.c(b0Var2, z14, null, null, null, null, z3.f.c(1797618009, new aa2.f(28, cVar3, eVar), mVar2), mVar2, 1572870, 30);
                        boolean zContains9 = cVar3.contains(v01.c.MISSING_SERVING_UNIT);
                        String strG10 = k.g(y.Q(mVar2, R.string.unit), Marker.ANY_MARKER);
                        cVar = cVar4.f57053f;
                        if (cVar == null) {
                            mVar2.C(-542276602);
                            mVar2.f();
                            strB = null;
                        } else {
                            mVar2.C(675243867);
                            g01.c.INSTANCE.getClass();
                            strB = g01.c.Companion.b(cVar, 0.0d, mVar2, 1);
                            mVar2.f();
                        }
                        if (strB == null) {
                            str3 = "";
                        } else {
                            str3 = strB;
                        }
                        z3.e eVarC8 = z3.f.c(2127398221, new e11.g(b0Var2, zContains9, 2), mVar2);
                        objQ3 = mVar2.q();
                        if (objQ3 == c2565a) {
                            p1Var2 = p1Var;
                            objQ3 = new dv0.f(p1Var2, 5);
                            mVar2.K(objQ3);
                        } else {
                            p1Var2 = p1Var;
                        }
                        p2Var4.h(strG10, str3, null, null, null, false, false, null, eVarC8, null, (e23.a) objQ3, mVar2, 100663296, 6, 764);
                        e11.b.f61856a.getClass();
                        c0.c(b0Var2, zContains9, null, null, null, null, e11.b.f61860e, mVar2, 1572870, 30);
                        c2.l.f(x2.h(aVar9, f15), mVar2);
                        mh.c(y.Q(mVar2, R.string.nutrition_info), c2.l.C(c2.l.A(aVar9, f14, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                        String strQ1111 = y.Q(mVar2, R.string.lbl_calories);
                        fVar2 = fVar;
                        num = fVar2.f14266a;
                        if (num != null) {
                            dValueOf = Double.valueOf(num.intValue());
                        } else {
                            dValueOf = null;
                        }
                        boolean zContains10 = cVar3.contains(v01.c.MISSING_CALORIES);
                        String strQ1112 = y.Q(mVar2, R.string.calories_required);
                        zR2 = mVar2.r(aVar7) | mVar2.r(cVar4);
                        objQ4 = mVar2.q();
                        if (zR2) {
                            final int i119 = 2;
                            objQ4 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i119) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d114 = aVar15.f22494a;
                                            Double d115 = aVar15.f22495b;
                                            Double d116 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d114, aVar15.f22497d, d116, d115, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d117 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d117 != null ? Integer.valueOf((int) d117.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        } else {
                            final int i1110 = 2;
                            objQ4 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i1110) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d114 = aVar15.f22494a;
                                            Double d115 = aVar15.f22495b;
                                            Double d116 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d114, aVar15.f22497d, d116, d115, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d117 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d117 != null ? Integer.valueOf((int) d117.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                        c11.e.a(strQ1111, null, dValueOf, true, false, zContains10, strQ1112, eVar, false, (l) objQ4, mVar2, 27648, 258);
                        String strQ1113 = y.Q(mVar2, R.string.protein);
                        String strQ1114 = y.Q(mVar2, R.string.lbl_grams_abr);
                        Double d114 = fVar2.f14268c;
                        zR3 = mVar2.r(aVar7) | mVar2.r(cVar4);
                        objQ5 = mVar2.q();
                        if (zR3) {
                            final int i1111 = 3;
                            objQ5 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i1111) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d115 = aVar15.f22494a;
                                            Double d116 = aVar15.f22495b;
                                            Double d117 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d115, aVar15.f22497d, d117, d116, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d118 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d118 != null ? Integer.valueOf((int) d118.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ5);
                        } else {
                            final int i1112 = 3;
                            objQ5 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i1112) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d115 = aVar15.f22494a;
                                            Double d116 = aVar15.f22495b;
                                            Double d117 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d115, aVar15.f22497d, d117, d116, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d118 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d118 != null ? Integer.valueOf((int) d118.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ5);
                        }
                        c11.e.a(strQ1113, strQ1114, d114, false, true, false, null, eVar, false, (l) objQ5, mVar2, 224256, 320);
                        String strQ1115 = y.Q(mVar2, R.string.fat);
                        String strQ1116 = y.Q(mVar2, R.string.lbl_grams_abr);
                        Double d115 = fVar2.f14269d;
                        zR4 = mVar2.r(aVar7) | mVar2.r(cVar4);
                        objQ6 = mVar2.q();
                        if (zR4) {
                            final int i21110 = 4;
                            objQ6 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i21110) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d116 = aVar15.f22494a;
                                            Double d117 = aVar15.f22495b;
                                            Double d118 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d116, aVar15.f22497d, d118, d117, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d119 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d119 != null ? Integer.valueOf((int) d119.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ6);
                        } else {
                            final int i21111 = 4;
                            objQ6 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i21111) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d116 = aVar15.f22494a;
                                            Double d117 = aVar15.f22495b;
                                            Double d118 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d116, aVar15.f22497d, d118, d117, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d119 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d119 != null ? Integer.valueOf((int) d119.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ6);
                        }
                        c11.e.a(strQ1115, strQ1116, d115, false, true, false, null, eVar, false, (l) objQ6, mVar2, 224256, 320);
                        String strQ1117 = y.Q(mVar2, R.string.carbs);
                        String strQ1118 = y.Q(mVar2, R.string.lbl_grams_abr);
                        Double d116 = fVar2.f14267b;
                        zR5 = mVar2.r(aVar7) | mVar2.r(cVar4);
                        objQ7 = mVar2.q();
                        if (zR5) {
                            final int i21112 = 0;
                            objQ7 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i21112) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d117 = aVar15.f22494a;
                                            Double d118 = aVar15.f22495b;
                                            Double d119 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d117, aVar15.f22497d, d119, d118, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d1110 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d1110 != null ? Integer.valueOf((int) d1110.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ7);
                        } else {
                            final int i21113 = 0;
                            objQ7 = new l() { // from class: e11.e
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    switch (i21113) {
                                        case 0:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                            break;
                                        case 1:
                                            c11.a aVar15 = (c11.a) obj11;
                                            aVar15.getClass();
                                            b11.f fVar6 = cVar4.f57054g;
                                            Double d117 = aVar15.f22494a;
                                            Double d118 = aVar15.f22495b;
                                            Double d119 = aVar15.f22496c;
                                            aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar15.f22499f, aVar15.f22500g, aVar15.f22501h, d117, aVar15.f22497d, d119, d118, aVar15.f22498e, aVar15.f22502i, aVar15.f22508o, aVar15.f22503j, aVar15.f22504k, aVar15.f22505l, aVar15.f22506m, aVar15.f22507n, 15));
                                            break;
                                        case 2:
                                            Double d1110 = (Double) obj11;
                                            aVar7.y4(b11.f.b(cVar4.f57054g, d1110 != null ? Integer.valueOf((int) d1110.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                            break;
                                        case 3:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                            break;
                                        default:
                                            aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ7);
                        }
                        c11.e.a(strQ1117, strQ1118, d116, false, true, false, null, eVar, false, (l) objQ7, mVar2, 224256, 320);
                        l72.f0 f0Var4 = l72.f0.f110999a;
                        if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                            i14 = -538027028;
                            i15 = R.string.show_more_data_sentence_case;
                        } else {
                            i14 = -537920884;
                            i15 = R.string.show_less_data_sentence_case;
                        }
                        String strH5 = sn.a.h(mVar2, i14, i15, mVar2);
                        objQ8 = mVar2.q();
                        if (objQ8 == c2565a) {
                            p1Var3 = p1Var6;
                            objQ8 = new dv0.f(p1Var3, 3);
                            mVar2.K(objQ8);
                        } else {
                            p1Var3 = p1Var6;
                        }
                        f0Var4.k(strH5, null, false, (e23.a) objQ8, mVar2, 3072, 6);
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            mVar2.C(-537608404);
                            c11.a aVar15 = new c11.a(fVar2.f14273h, fVar2.f14276k, fVar2.f14275j, fVar2.f14274i, fVar2.f14277l, fVar2.f14270e, fVar2.f14271f, fVar2.f14272g, fVar2.f14278m, fVar2.f14280o, fVar2.f14281p, fVar2.f14282q, fVar2.f14283r, fVar2.f14284t, fVar2.f14279n);
                            zR8 = mVar2.r(aVar7) | mVar2.r(cVar4);
                            objQ12 = mVar2.q();
                            if (zR8) {
                                final int i21114 = 1;
                                objQ12 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i21114) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar16 = (c11.a) obj11;
                                                aVar16.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d117 = aVar16.f22494a;
                                                Double d118 = aVar16.f22495b;
                                                Double d119 = aVar16.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar16.f22499f, aVar16.f22500g, aVar16.f22501h, d117, aVar16.f22497d, d119, d118, aVar16.f22498e, aVar16.f22502i, aVar16.f22508o, aVar16.f22503j, aVar16.f22504k, aVar16.f22505l, aVar16.f22506m, aVar16.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d1110 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d1110 != null ? Integer.valueOf((int) d1110.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ12);
                            } else {
                                final int i21115 = 1;
                                objQ12 = new l() { // from class: e11.e
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        switch (i21115) {
                                            case 0:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285));
                                                break;
                                            case 1:
                                                c11.a aVar16 = (c11.a) obj11;
                                                aVar16.getClass();
                                                b11.f fVar6 = cVar4.f57054g;
                                                Double d117 = aVar16.f22494a;
                                                Double d118 = aVar16.f22495b;
                                                Double d119 = aVar16.f22496c;
                                                aVar7.y4(b11.f.b(fVar6, null, null, null, null, aVar16.f22499f, aVar16.f22500g, aVar16.f22501h, d117, aVar16.f22497d, d119, d118, aVar16.f22498e, aVar16.f22502i, aVar16.f22508o, aVar16.f22503j, aVar16.f22504k, aVar16.f22505l, aVar16.f22506m, aVar16.f22507n, 15));
                                                break;
                                            case 2:
                                                Double d1110 = (Double) obj11;
                                                aVar7.y4(b11.f.b(cVar4.f57054g, d1110 != null ? Integer.valueOf((int) d1110.doubleValue()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286));
                                                break;
                                            case 3:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283));
                                                break;
                                            default:
                                                aVar7.y4(b11.f.b(cVar4.f57054g, null, null, null, (Double) obj11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ12);
                            }
                            jg.b.g(aVar15, eVar, (l) objQ12, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-535112687);
                            mVar2.f();
                        }
                        String strQ1119 = y.Q(mVar2, R.string.lbl_add_photo);
                        xVar = aVar6.f57042c;
                        if (xVar != null) {
                            cVarB = j53.l.b();
                        } else {
                            cVarB = j53.l.b();
                        }
                        i53.c cVar8 = cVarB;
                        zR6 = mVar2.r(aVar7);
                        objQ9 = mVar2.q();
                        if (zR6) {
                            final int i21116 = 0;
                            objQ9 = new l() { // from class: e11.f
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.c cVar9;
                                    d11.c cVar10;
                                    switch (i21116) {
                                        case 0:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.a aVar16 = aVar7;
                                            aVar16.getClass();
                                            y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                            if (xVar2 != null) {
                                                r53.p2 p2Var5 = aVar16.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, xVar2, 11) : null);
                                            }
                                            break;
                                        case 1:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var6 = aVar7.f67884d;
                                            d11.a aVar18 = (d11.a) p2Var6.getValue();
                                            p2Var6.setValue(aVar18 != null ? d11.a.a(aVar18, null, null, 11) : null);
                                            break;
                                        case 2:
                                            String str6 = (String) obj11;
                                            str6.getClass();
                                            f11.a aVar19 = aVar7;
                                            aVar19.getClass();
                                            r53.p2 p2Var7 = aVar19.f67884d;
                                            d11.a aVar110 = (d11.a) p2Var7.getValue();
                                            if (aVar110 != null && (cVar9 = aVar110.f57040a) != null) {
                                                d11.c cVarA = d11.c.a(cVar9, null, str6, null, null, null, null, null, 509);
                                                d11.a aVar111 = (d11.a) p2Var7.getValue();
                                                p2Var7.setValue(aVar111 != null ? d11.a.a(aVar111, cVarA, null, 14) : null);
                                                aVar19.x4(v01.c.MISSING_FOOD_NAME);
                                            }
                                            break;
                                        default:
                                            String str7 = (String) obj11;
                                            str7.getClass();
                                            f11.a aVar112 = aVar7;
                                            aVar112.getClass();
                                            r53.p2 p2Var8 = aVar112.f67884d;
                                            d11.a aVar20 = (d11.a) p2Var8.getValue();
                                            if (aVar20 != null && (cVar10 = aVar20.f57040a) != null) {
                                                d11.c cVarA2 = d11.c.a(cVar10, null, null, str7, null, null, null, null, 507);
                                                d11.a aVar21 = (d11.a) p2Var8.getValue();
                                                p2Var8.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ9);
                        } else {
                            final int i21117 = 0;
                            objQ9 = new l() { // from class: e11.f
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.c cVar9;
                                    d11.c cVar10;
                                    switch (i21117) {
                                        case 0:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.a aVar16 = aVar7;
                                            aVar16.getClass();
                                            y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                            if (xVar2 != null) {
                                                r53.p2 p2Var5 = aVar16.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, xVar2, 11) : null);
                                            }
                                            break;
                                        case 1:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var6 = aVar7.f67884d;
                                            d11.a aVar18 = (d11.a) p2Var6.getValue();
                                            p2Var6.setValue(aVar18 != null ? d11.a.a(aVar18, null, null, 11) : null);
                                            break;
                                        case 2:
                                            String str6 = (String) obj11;
                                            str6.getClass();
                                            f11.a aVar19 = aVar7;
                                            aVar19.getClass();
                                            r53.p2 p2Var7 = aVar19.f67884d;
                                            d11.a aVar110 = (d11.a) p2Var7.getValue();
                                            if (aVar110 != null && (cVar9 = aVar110.f57040a) != null) {
                                                d11.c cVarA = d11.c.a(cVar9, null, str6, null, null, null, null, null, 509);
                                                d11.a aVar111 = (d11.a) p2Var7.getValue();
                                                p2Var7.setValue(aVar111 != null ? d11.a.a(aVar111, cVarA, null, 14) : null);
                                                aVar19.x4(v01.c.MISSING_FOOD_NAME);
                                            }
                                            break;
                                        default:
                                            String str7 = (String) obj11;
                                            str7.getClass();
                                            f11.a aVar112 = aVar7;
                                            aVar112.getClass();
                                            r53.p2 p2Var8 = aVar112.f67884d;
                                            d11.a aVar20 = (d11.a) p2Var8.getValue();
                                            if (aVar20 != null && (cVar10 = aVar20.f57040a) != null) {
                                                d11.c cVarA2 = d11.c.a(cVar10, null, null, str7, null, null, null, null, 507);
                                                d11.a aVar21 = (d11.a) p2Var8.getValue();
                                                p2Var8.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ9);
                        }
                        l lVar5 = (l) objQ9;
                        objQ10 = mVar2.q();
                        if (objQ10 == c2565a) {
                            objQ10 = new d50.b(28);
                            mVar2.K(objQ10);
                        }
                        p pVar4 = (p) objQ10;
                        zR7 = mVar2.r(aVar7);
                        objQ11 = mVar2.q();
                        if (zR7) {
                            final int i21118 = 1;
                            objQ11 = new l() { // from class: e11.f
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.c cVar9;
                                    d11.c cVar10;
                                    switch (i21118) {
                                        case 0:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.a aVar16 = aVar7;
                                            aVar16.getClass();
                                            y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                            if (xVar2 != null) {
                                                r53.p2 p2Var5 = aVar16.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, xVar2, 11) : null);
                                            }
                                            break;
                                        case 1:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var6 = aVar7.f67884d;
                                            d11.a aVar18 = (d11.a) p2Var6.getValue();
                                            p2Var6.setValue(aVar18 != null ? d11.a.a(aVar18, null, null, 11) : null);
                                            break;
                                        case 2:
                                            String str6 = (String) obj11;
                                            str6.getClass();
                                            f11.a aVar19 = aVar7;
                                            aVar19.getClass();
                                            r53.p2 p2Var7 = aVar19.f67884d;
                                            d11.a aVar110 = (d11.a) p2Var7.getValue();
                                            if (aVar110 != null && (cVar9 = aVar110.f57040a) != null) {
                                                d11.c cVarA = d11.c.a(cVar9, null, str6, null, null, null, null, null, 509);
                                                d11.a aVar111 = (d11.a) p2Var7.getValue();
                                                p2Var7.setValue(aVar111 != null ? d11.a.a(aVar111, cVarA, null, 14) : null);
                                                aVar19.x4(v01.c.MISSING_FOOD_NAME);
                                            }
                                            break;
                                        default:
                                            String str7 = (String) obj11;
                                            str7.getClass();
                                            f11.a aVar112 = aVar7;
                                            aVar112.getClass();
                                            r53.p2 p2Var8 = aVar112.f67884d;
                                            d11.a aVar20 = (d11.a) p2Var8.getValue();
                                            if (aVar20 != null && (cVar10 = aVar20.f57040a) != null) {
                                                d11.c cVarA2 = d11.c.a(cVar10, null, null, str7, null, null, null, null, 507);
                                                d11.a aVar21 = (d11.a) p2Var8.getValue();
                                                p2Var8.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ11);
                        } else {
                            final int i21119 = 1;
                            objQ11 = new l() { // from class: e11.f
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.c cVar9;
                                    d11.c cVar10;
                                    switch (i21119) {
                                        case 0:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.a aVar16 = aVar7;
                                            aVar16.getClass();
                                            y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                            if (xVar2 != null) {
                                                r53.p2 p2Var5 = aVar16.f67884d;
                                                d11.a aVar17 = (d11.a) p2Var5.getValue();
                                                p2Var5.setValue(aVar17 != null ? d11.a.a(aVar17, null, xVar2, 11) : null);
                                            }
                                            break;
                                        case 1:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var6 = aVar7.f67884d;
                                            d11.a aVar18 = (d11.a) p2Var6.getValue();
                                            p2Var6.setValue(aVar18 != null ? d11.a.a(aVar18, null, null, 11) : null);
                                            break;
                                        case 2:
                                            String str6 = (String) obj11;
                                            str6.getClass();
                                            f11.a aVar19 = aVar7;
                                            aVar19.getClass();
                                            r53.p2 p2Var7 = aVar19.f67884d;
                                            d11.a aVar110 = (d11.a) p2Var7.getValue();
                                            if (aVar110 != null && (cVar9 = aVar110.f57040a) != null) {
                                                d11.c cVarA = d11.c.a(cVar9, null, str6, null, null, null, null, null, 509);
                                                d11.a aVar111 = (d11.a) p2Var7.getValue();
                                                p2Var7.setValue(aVar111 != null ? d11.a.a(aVar111, cVarA, null, 14) : null);
                                                aVar19.x4(v01.c.MISSING_FOOD_NAME);
                                            }
                                            break;
                                        default:
                                            String str7 = (String) obj11;
                                            str7.getClass();
                                            f11.a aVar112 = aVar7;
                                            aVar112.getClass();
                                            r53.p2 p2Var8 = aVar112.f67884d;
                                            d11.a aVar20 = (d11.a) p2Var8.getValue();
                                            if (aVar20 != null && (cVar10 = aVar20.f57040a) != null) {
                                                d11.c cVarA2 = d11.c.a(cVar10, null, null, str7, null, null, null, null, 507);
                                                d11.a aVar21 = (d11.a) p2Var8.getValue();
                                                p2Var8.setValue(aVar21 != null ? d11.a.a(aVar21, cVarA2, null, 14) : null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ11);
                        }
                        y22.d.a(strQ1119, cVar8, 1, lVar5, pVar4, (l) objQ11, mVar2, (y22.x.f194327d << 3) | 24960);
                        mVar2.y();
                        c0.e(((Boolean) p1Var4.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1390886287, new a42.y(cVar4, aVar8, aVar7, p1Var4, 20), mVar2), mVar2, 196608, 30);
                        c0.e(((Boolean) p1Var2.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(2105636856, new a42.y(cVar4, aVar6, aVar7, p1Var2, 21), mVar2), mVar2, 196608, 30);
                        mVar2.f();
                    } else {
                        mVar2.C(-1679073856);
                        mVar2.f();
                    }
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                x3 x3Var = (x3) obj10;
                final f11.g gVar = (f11.g) obj9;
                v21.e eVar3 = (v21.e) obj8;
                l lVar6 = (l) obj3;
                l lVar7 = (l) obj7;
                x3 x3Var2 = (x3) obj6;
                x3 x3Var3 = (x3) obj5;
                x3 x3Var4 = (x3) obj4;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    d11.b bVar4 = (d11.b) x3Var.getF182175a();
                    if (bVar4 != null) {
                        mVar3.C(-1148343273);
                        d11.d dVar4 = bVar4.f57044a;
                        r.a aVar16 = r.S;
                        long jA = k.a(d92.b.f58623a, mVar3);
                        m1.a aVar17 = m1.f128891a;
                        r rVarC3 = wz1.i.c(a2.b(c2.l.D(u1.n.e(aVar16, jA, aVar17)), a2.a(mVar3), true), mVar3);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar18 = h4.d.a.f81536n;
                        c2.j.f22691a.getClass();
                        z zVarA3 = c2.y.a(c2.j.f22694d, aVar18, mVar3, 48);
                        int iHashCode3 = Long.hashCode(mVar3.getU());
                        i2 i2VarX3 = mVar3.x();
                        r rVarC4 = h4.k.c(rVarC3, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar19 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar19);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA3, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar3, iHashCode3, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        String strQ20 = y.Q(mVar3, R.string.required_field_star);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97932i, mVar3);
                        d92.b.f58625c.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        float f16 = eVar4.f97920e;
                        mh.c(strQ20, c2.l.y(aVar16, f16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 131068);
                        boolean zContains11 = ((i53.c) x3Var2.getF182175a()).contains(v01.f.MISSING_MEAL_NAME);
                        t0 t0Var2 = t0.f16792a;
                        String strG11 = k.g(y.Q(mVar3, R.string.meal_name), Marker.ANY_MARKER);
                        String str6 = dVar4.f57058b;
                        String str7 = str6 == null ? "" : str6;
                        boolean zR10 = mVar3.r(gVar);
                        Object objQ15 = mVar3.q();
                        if (zR10) {
                            final int i34 = 0;
                            objQ15 = new l() { // from class: e11.z
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.d dVar5;
                                    Iterable iterable;
                                    d11.d dVar6;
                                    d11.d dVar7;
                                    switch (i34) {
                                        case 0:
                                            String str8 = (String) obj11;
                                            str8.getClass();
                                            f11.g gVar2 = gVar;
                                            gVar2.getClass();
                                            r53.p2 p2Var5 = gVar2.f67932d;
                                            d11.b bVar6 = (d11.b) p2Var5.getValue();
                                            if (bVar6 != null && (dVar5 = bVar6.f57044a) != null) {
                                                d11.d dVarA = d11.d.a(dVar5, null, str8, null, 5);
                                                d11.b bVar7 = (d11.b) p2Var5.getValue();
                                                p2Var5.setValue(bVar7 != null ? d11.b.a(bVar7, dVarA, null, 14) : null);
                                                gVar2.x4(v01.f.MISSING_MEAL_NAME);
                                            }
                                            break;
                                        case 1:
                                            b11.v vVar = (b11.v) obj11;
                                            vVar.getClass();
                                            f11.g gVar3 = gVar;
                                            gVar3.getClass();
                                            r53.p2 p2Var6 = gVar3.f67932d;
                                            d11.b bVar8 = (d11.b) p2Var6.getValue();
                                            if (bVar8 == null || (dVar7 = bVar8.f57044a) == null || (iterable = dVar7.f57059c) == null) {
                                                iterable = p13.j0.f134944a;
                                            }
                                            ArrayList arrayListY0 = p13.h0.y0(iterable, vVar);
                                            d11.b bVar9 = (d11.b) p2Var6.getValue();
                                            if (bVar9 != null && (dVar6 = bVar9.f57044a) != null) {
                                                d11.d dVarA2 = d11.d.a(dVar6, null, null, i53.a.e(arrayListY0), 3);
                                                d11.b bVar10 = (d11.b) p2Var6.getValue();
                                                p2Var6.setValue(bVar10 != null ? d11.b.a(bVar10, dVarA2, null, 14) : null);
                                            }
                                            break;
                                        case 2:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.g gVar4 = gVar;
                                            gVar4.getClass();
                                            y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                            if (xVar2 != null) {
                                                r53.p2 p2Var7 = gVar4.f67932d;
                                                d11.b bVar11 = (d11.b) p2Var7.getValue();
                                                p2Var7.setValue(bVar11 != null ? d11.b.a(bVar11, null, xVar2, 13) : null);
                                            }
                                            break;
                                        default:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var8 = gVar.f67932d;
                                            d11.b bVar12 = (d11.b) p2Var8.getValue();
                                            p2Var8.setValue(bVar12 != null ? d11.b.a(bVar12, null, null, 13) : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ15);
                        } else {
                            aVar2.getClass();
                            if (objQ15 == m.a.f135155b) {
                                final int i35 = 0;
                                objQ15 = new l() { // from class: e11.z
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.d dVar5;
                                        Iterable iterable;
                                        d11.d dVar6;
                                        d11.d dVar7;
                                        switch (i35) {
                                            case 0:
                                                String str8 = (String) obj11;
                                                str8.getClass();
                                                f11.g gVar2 = gVar;
                                                gVar2.getClass();
                                                r53.p2 p2Var5 = gVar2.f67932d;
                                                d11.b bVar6 = (d11.b) p2Var5.getValue();
                                                if (bVar6 != null && (dVar5 = bVar6.f57044a) != null) {
                                                    d11.d dVarA = d11.d.a(dVar5, null, str8, null, 5);
                                                    d11.b bVar7 = (d11.b) p2Var5.getValue();
                                                    p2Var5.setValue(bVar7 != null ? d11.b.a(bVar7, dVarA, null, 14) : null);
                                                    gVar2.x4(v01.f.MISSING_MEAL_NAME);
                                                }
                                                break;
                                            case 1:
                                                b11.v vVar = (b11.v) obj11;
                                                vVar.getClass();
                                                f11.g gVar3 = gVar;
                                                gVar3.getClass();
                                                r53.p2 p2Var6 = gVar3.f67932d;
                                                d11.b bVar8 = (d11.b) p2Var6.getValue();
                                                if (bVar8 == null || (dVar7 = bVar8.f57044a) == null || (iterable = dVar7.f57059c) == null) {
                                                    iterable = p13.j0.f134944a;
                                                }
                                                ArrayList arrayListY0 = p13.h0.y0(iterable, vVar);
                                                d11.b bVar9 = (d11.b) p2Var6.getValue();
                                                if (bVar9 != null && (dVar6 = bVar9.f57044a) != null) {
                                                    d11.d dVarA2 = d11.d.a(dVar6, null, null, i53.a.e(arrayListY0), 3);
                                                    d11.b bVar10 = (d11.b) p2Var6.getValue();
                                                    p2Var6.setValue(bVar10 != null ? d11.b.a(bVar10, dVarA2, null, 14) : null);
                                                }
                                                break;
                                            case 2:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.g gVar4 = gVar;
                                                gVar4.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var7 = gVar4.f67932d;
                                                    d11.b bVar11 = (d11.b) p2Var7.getValue();
                                                    p2Var7.setValue(bVar11 != null ? d11.b.a(bVar11, null, xVar2, 13) : null);
                                                }
                                                break;
                                            default:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var8 = gVar.f67932d;
                                                d11.b bVar12 = (d11.b) p2Var8.getValue();
                                                p2Var8.setValue(bVar12 != null ? d11.b.a(bVar12, null, null, 13) : null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ15);
                            }
                        }
                        x5.v.f188954b.getClass();
                        t0Var2.i(null, strG11, str7, 75, zContains11, (l) objQ15, null, x5.v.f188955c, 0, z3.f.c(-846707326, new e11.g(b0Var3, zContains11, 4), mVar3), mVar3, 817892352, 321);
                        c2.l.f(x2.h(aVar16, eVar4.f97917b), mVar3);
                        i53.c<b11.v> cVar9 = dVar4.f57059c;
                        Set set = (Set) x3Var3.getF182175a();
                        boolean zContains12 = ((i53.c) x3Var2.getF182175a()).contains(v01.f.NO_FOOD);
                        boolean zB2 = mVar3.B(lVar6);
                        Object objQ16 = mVar3.q();
                        if (zB2) {
                            objQ16 = new ci0.f(lVar6, 14);
                            mVar3.K(objQ16);
                        } else {
                            aVar2.getClass();
                            if (objQ16 == m.a.f135155b) {
                                objQ16 = new ci0.f(lVar6, 14);
                                mVar3.K(objQ16);
                            }
                        }
                        l lVar8 = (l) objQ16;
                        boolean zB3 = mVar3.B(lVar7);
                        Object objQ17 = mVar3.q();
                        if (zB3) {
                            objQ17 = new ci0.f(lVar7, 15);
                            mVar3.K(objQ17);
                        } else {
                            aVar2.getClass();
                            if (objQ17 == m.a.f135155b) {
                                objQ17 = new ci0.f(lVar7, 15);
                                mVar3.K(objQ17);
                            }
                        }
                        l lVar9 = (l) objQ17;
                        boolean zR11 = mVar3.r(gVar);
                        Object objQ18 = mVar3.q();
                        if (zR11) {
                            final int i36 = 1;
                            objQ18 = new l() { // from class: e11.z
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.d dVar5;
                                    Iterable iterable;
                                    d11.d dVar6;
                                    d11.d dVar7;
                                    switch (i36) {
                                        case 0:
                                            String str8 = (String) obj11;
                                            str8.getClass();
                                            f11.g gVar2 = gVar;
                                            gVar2.getClass();
                                            r53.p2 p2Var5 = gVar2.f67932d;
                                            d11.b bVar6 = (d11.b) p2Var5.getValue();
                                            if (bVar6 != null && (dVar5 = bVar6.f57044a) != null) {
                                                d11.d dVarA = d11.d.a(dVar5, null, str8, null, 5);
                                                d11.b bVar7 = (d11.b) p2Var5.getValue();
                                                p2Var5.setValue(bVar7 != null ? d11.b.a(bVar7, dVarA, null, 14) : null);
                                                gVar2.x4(v01.f.MISSING_MEAL_NAME);
                                            }
                                            break;
                                        case 1:
                                            b11.v vVar = (b11.v) obj11;
                                            vVar.getClass();
                                            f11.g gVar3 = gVar;
                                            gVar3.getClass();
                                            r53.p2 p2Var6 = gVar3.f67932d;
                                            d11.b bVar8 = (d11.b) p2Var6.getValue();
                                            if (bVar8 == null || (dVar7 = bVar8.f57044a) == null || (iterable = dVar7.f57059c) == null) {
                                                iterable = p13.j0.f134944a;
                                            }
                                            ArrayList arrayListY0 = p13.h0.y0(iterable, vVar);
                                            d11.b bVar9 = (d11.b) p2Var6.getValue();
                                            if (bVar9 != null && (dVar6 = bVar9.f57044a) != null) {
                                                d11.d dVarA2 = d11.d.a(dVar6, null, null, i53.a.e(arrayListY0), 3);
                                                d11.b bVar10 = (d11.b) p2Var6.getValue();
                                                p2Var6.setValue(bVar10 != null ? d11.b.a(bVar10, dVarA2, null, 14) : null);
                                            }
                                            break;
                                        case 2:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.g gVar4 = gVar;
                                            gVar4.getClass();
                                            y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                            if (xVar2 != null) {
                                                r53.p2 p2Var7 = gVar4.f67932d;
                                                d11.b bVar11 = (d11.b) p2Var7.getValue();
                                                p2Var7.setValue(bVar11 != null ? d11.b.a(bVar11, null, xVar2, 13) : null);
                                            }
                                            break;
                                        default:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var8 = gVar.f67932d;
                                            d11.b bVar12 = (d11.b) p2Var8.getValue();
                                            p2Var8.setValue(bVar12 != null ? d11.b.a(bVar12, null, null, 13) : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ18);
                        } else {
                            aVar2.getClass();
                            if (objQ18 == m.a.f135155b) {
                                final int i37 = 1;
                                objQ18 = new l() { // from class: e11.z
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.d dVar5;
                                        Iterable iterable;
                                        d11.d dVar6;
                                        d11.d dVar7;
                                        switch (i37) {
                                            case 0:
                                                String str8 = (String) obj11;
                                                str8.getClass();
                                                f11.g gVar2 = gVar;
                                                gVar2.getClass();
                                                r53.p2 p2Var5 = gVar2.f67932d;
                                                d11.b bVar6 = (d11.b) p2Var5.getValue();
                                                if (bVar6 != null && (dVar5 = bVar6.f57044a) != null) {
                                                    d11.d dVarA = d11.d.a(dVar5, null, str8, null, 5);
                                                    d11.b bVar7 = (d11.b) p2Var5.getValue();
                                                    p2Var5.setValue(bVar7 != null ? d11.b.a(bVar7, dVarA, null, 14) : null);
                                                    gVar2.x4(v01.f.MISSING_MEAL_NAME);
                                                }
                                                break;
                                            case 1:
                                                b11.v vVar = (b11.v) obj11;
                                                vVar.getClass();
                                                f11.g gVar3 = gVar;
                                                gVar3.getClass();
                                                r53.p2 p2Var6 = gVar3.f67932d;
                                                d11.b bVar8 = (d11.b) p2Var6.getValue();
                                                if (bVar8 == null || (dVar7 = bVar8.f57044a) == null || (iterable = dVar7.f57059c) == null) {
                                                    iterable = p13.j0.f134944a;
                                                }
                                                ArrayList arrayListY0 = p13.h0.y0(iterable, vVar);
                                                d11.b bVar9 = (d11.b) p2Var6.getValue();
                                                if (bVar9 != null && (dVar6 = bVar9.f57044a) != null) {
                                                    d11.d dVarA2 = d11.d.a(dVar6, null, null, i53.a.e(arrayListY0), 3);
                                                    d11.b bVar10 = (d11.b) p2Var6.getValue();
                                                    p2Var6.setValue(bVar10 != null ? d11.b.a(bVar10, dVarA2, null, 14) : null);
                                                }
                                                break;
                                            case 2:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.g gVar4 = gVar;
                                                gVar4.getClass();
                                                y22.x xVar2 = (y22.x) p13.h0.d0(list);
                                                if (xVar2 != null) {
                                                    r53.p2 p2Var7 = gVar4.f67932d;
                                                    d11.b bVar11 = (d11.b) p2Var7.getValue();
                                                    p2Var7.setValue(bVar11 != null ? d11.b.a(bVar11, null, xVar2, 13) : null);
                                                }
                                                break;
                                            default:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var8 = gVar.f67932d;
                                                d11.b bVar12 = (d11.b) p2Var8.getValue();
                                                p2Var8.setValue(bVar12 != null ? d11.b.a(bVar12, null, null, 13) : null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ18);
                            }
                        }
                        e11.e0.b(cVar9, set, zContains12, eVar3, lVar8, lVar9, (l) objQ18, mVar3, 0);
                        r rVarA = c2.l.A(c2.l.C(x2.f(aVar16, 1.0f), 0.0f, eVar4.f97917b, 0.0f, eVar4.f97920e, 5), f16, 0.0f, 2);
                        String strP = y.P(R.string.you_can_add_between_value_value_foods, new Object[]{1, 20}, mVar3);
                        d6.h.f57752b.getClass();
                        mh.c(strP, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 130044);
                        y01.r.a(c2.l.y(u1.n.e(aVar16, d92.b.a(mVar3).c().c(), aVar17), f16), eVar3, dVar4.b().g(), eVar4.f97921f, false, (i53.c) x3Var4.getF182175a(), mVar3, 0, 16);
                        String strQ21 = y.Q(mVar3, R.string.lbl_add_photo);
                        y22.x xVar2 = bVar4.f57045b;
                        if (xVar2 == null || (cVarB2 = i53.a.a(xVar2)) == null) {
                            cVarB2 = j53.l.b();
                        }
                        i53.c cVar10 = cVarB2;
                        boolean zR12 = mVar3.r(gVar);
                        Object objQ19 = mVar3.q();
                        if (zR12) {
                            final int i38 = 2;
                            objQ19 = new l() { // from class: e11.z
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.d dVar5;
                                    Iterable iterable;
                                    d11.d dVar6;
                                    d11.d dVar7;
                                    switch (i38) {
                                        case 0:
                                            String str8 = (String) obj11;
                                            str8.getClass();
                                            f11.g gVar2 = gVar;
                                            gVar2.getClass();
                                            r53.p2 p2Var5 = gVar2.f67932d;
                                            d11.b bVar6 = (d11.b) p2Var5.getValue();
                                            if (bVar6 != null && (dVar5 = bVar6.f57044a) != null) {
                                                d11.d dVarA = d11.d.a(dVar5, null, str8, null, 5);
                                                d11.b bVar7 = (d11.b) p2Var5.getValue();
                                                p2Var5.setValue(bVar7 != null ? d11.b.a(bVar7, dVarA, null, 14) : null);
                                                gVar2.x4(v01.f.MISSING_MEAL_NAME);
                                            }
                                            break;
                                        case 1:
                                            b11.v vVar = (b11.v) obj11;
                                            vVar.getClass();
                                            f11.g gVar3 = gVar;
                                            gVar3.getClass();
                                            r53.p2 p2Var6 = gVar3.f67932d;
                                            d11.b bVar8 = (d11.b) p2Var6.getValue();
                                            if (bVar8 == null || (dVar7 = bVar8.f57044a) == null || (iterable = dVar7.f57059c) == null) {
                                                iterable = p13.j0.f134944a;
                                            }
                                            ArrayList arrayListY0 = p13.h0.y0(iterable, vVar);
                                            d11.b bVar9 = (d11.b) p2Var6.getValue();
                                            if (bVar9 != null && (dVar6 = bVar9.f57044a) != null) {
                                                d11.d dVarA2 = d11.d.a(dVar6, null, null, i53.a.e(arrayListY0), 3);
                                                d11.b bVar10 = (d11.b) p2Var6.getValue();
                                                p2Var6.setValue(bVar10 != null ? d11.b.a(bVar10, dVarA2, null, 14) : null);
                                            }
                                            break;
                                        case 2:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.g gVar4 = gVar;
                                            gVar4.getClass();
                                            y22.x xVar3 = (y22.x) p13.h0.d0(list);
                                            if (xVar3 != null) {
                                                r53.p2 p2Var7 = gVar4.f67932d;
                                                d11.b bVar11 = (d11.b) p2Var7.getValue();
                                                p2Var7.setValue(bVar11 != null ? d11.b.a(bVar11, null, xVar3, 13) : null);
                                            }
                                            break;
                                        default:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var8 = gVar.f67932d;
                                            d11.b bVar12 = (d11.b) p2Var8.getValue();
                                            p2Var8.setValue(bVar12 != null ? d11.b.a(bVar12, null, null, 13) : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ19);
                        } else {
                            aVar2.getClass();
                            if (objQ19 == m.a.f135155b) {
                                final int i39 = 2;
                                objQ19 = new l() { // from class: e11.z
                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        d11.d dVar5;
                                        Iterable iterable;
                                        d11.d dVar6;
                                        d11.d dVar7;
                                        switch (i39) {
                                            case 0:
                                                String str8 = (String) obj11;
                                                str8.getClass();
                                                f11.g gVar2 = gVar;
                                                gVar2.getClass();
                                                r53.p2 p2Var5 = gVar2.f67932d;
                                                d11.b bVar6 = (d11.b) p2Var5.getValue();
                                                if (bVar6 != null && (dVar5 = bVar6.f57044a) != null) {
                                                    d11.d dVarA = d11.d.a(dVar5, null, str8, null, 5);
                                                    d11.b bVar7 = (d11.b) p2Var5.getValue();
                                                    p2Var5.setValue(bVar7 != null ? d11.b.a(bVar7, dVarA, null, 14) : null);
                                                    gVar2.x4(v01.f.MISSING_MEAL_NAME);
                                                }
                                                break;
                                            case 1:
                                                b11.v vVar = (b11.v) obj11;
                                                vVar.getClass();
                                                f11.g gVar3 = gVar;
                                                gVar3.getClass();
                                                r53.p2 p2Var6 = gVar3.f67932d;
                                                d11.b bVar8 = (d11.b) p2Var6.getValue();
                                                if (bVar8 == null || (dVar7 = bVar8.f57044a) == null || (iterable = dVar7.f57059c) == null) {
                                                    iterable = p13.j0.f134944a;
                                                }
                                                ArrayList arrayListY0 = p13.h0.y0(iterable, vVar);
                                                d11.b bVar9 = (d11.b) p2Var6.getValue();
                                                if (bVar9 != null && (dVar6 = bVar9.f57044a) != null) {
                                                    d11.d dVarA2 = d11.d.a(dVar6, null, null, i53.a.e(arrayListY0), 3);
                                                    d11.b bVar10 = (d11.b) p2Var6.getValue();
                                                    p2Var6.setValue(bVar10 != null ? d11.b.a(bVar10, dVarA2, null, 14) : null);
                                                }
                                                break;
                                            case 2:
                                                List list = (List) obj11;
                                                list.getClass();
                                                f11.g gVar4 = gVar;
                                                gVar4.getClass();
                                                y22.x xVar3 = (y22.x) p13.h0.d0(list);
                                                if (xVar3 != null) {
                                                    r53.p2 p2Var7 = gVar4.f67932d;
                                                    d11.b bVar11 = (d11.b) p2Var7.getValue();
                                                    p2Var7.setValue(bVar11 != null ? d11.b.a(bVar11, null, xVar3, 13) : null);
                                                }
                                                break;
                                            default:
                                                ((y22.x) obj11).getClass();
                                                r53.p2 p2Var8 = gVar.f67932d;
                                                d11.b bVar12 = (d11.b) p2Var8.getValue();
                                                p2Var8.setValue(bVar12 != null ? d11.b.a(bVar12, null, null, 13) : null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ19);
                            }
                        }
                        l lVar10 = (l) objQ19;
                        Object objQ20 = mVar3.q();
                        aVar2.getClass();
                        m.a.C2565a c2565a2 = m.a.f135155b;
                        if (objQ20 == c2565a2) {
                            objQ20 = new e11.w(1);
                            mVar3.K(objQ20);
                        }
                        p pVar5 = (p) objQ20;
                        boolean zR13 = mVar3.r(gVar);
                        Object objQ21 = mVar3.q();
                        if (zR13 || objQ21 == c2565a2) {
                            final int i44 = 3;
                            objQ21 = new l() { // from class: e11.z
                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    d11.d dVar5;
                                    Iterable iterable;
                                    d11.d dVar6;
                                    d11.d dVar7;
                                    switch (i44) {
                                        case 0:
                                            String str8 = (String) obj11;
                                            str8.getClass();
                                            f11.g gVar2 = gVar;
                                            gVar2.getClass();
                                            r53.p2 p2Var5 = gVar2.f67932d;
                                            d11.b bVar6 = (d11.b) p2Var5.getValue();
                                            if (bVar6 != null && (dVar5 = bVar6.f57044a) != null) {
                                                d11.d dVarA = d11.d.a(dVar5, null, str8, null, 5);
                                                d11.b bVar7 = (d11.b) p2Var5.getValue();
                                                p2Var5.setValue(bVar7 != null ? d11.b.a(bVar7, dVarA, null, 14) : null);
                                                gVar2.x4(v01.f.MISSING_MEAL_NAME);
                                            }
                                            break;
                                        case 1:
                                            b11.v vVar = (b11.v) obj11;
                                            vVar.getClass();
                                            f11.g gVar3 = gVar;
                                            gVar3.getClass();
                                            r53.p2 p2Var6 = gVar3.f67932d;
                                            d11.b bVar8 = (d11.b) p2Var6.getValue();
                                            if (bVar8 == null || (dVar7 = bVar8.f57044a) == null || (iterable = dVar7.f57059c) == null) {
                                                iterable = p13.j0.f134944a;
                                            }
                                            ArrayList arrayListY0 = p13.h0.y0(iterable, vVar);
                                            d11.b bVar9 = (d11.b) p2Var6.getValue();
                                            if (bVar9 != null && (dVar6 = bVar9.f57044a) != null) {
                                                d11.d dVarA2 = d11.d.a(dVar6, null, null, i53.a.e(arrayListY0), 3);
                                                d11.b bVar10 = (d11.b) p2Var6.getValue();
                                                p2Var6.setValue(bVar10 != null ? d11.b.a(bVar10, dVarA2, null, 14) : null);
                                            }
                                            break;
                                        case 2:
                                            List list = (List) obj11;
                                            list.getClass();
                                            f11.g gVar4 = gVar;
                                            gVar4.getClass();
                                            y22.x xVar3 = (y22.x) p13.h0.d0(list);
                                            if (xVar3 != null) {
                                                r53.p2 p2Var7 = gVar4.f67932d;
                                                d11.b bVar11 = (d11.b) p2Var7.getValue();
                                                p2Var7.setValue(bVar11 != null ? d11.b.a(bVar11, null, xVar3, 13) : null);
                                            }
                                            break;
                                        default:
                                            ((y22.x) obj11).getClass();
                                            r53.p2 p2Var8 = gVar.f67932d;
                                            d11.b bVar12 = (d11.b) p2Var8.getValue();
                                            p2Var8.setValue(bVar12 != null ? d11.b.a(bVar12, null, null, 13) : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ21);
                        }
                        y22.d.a(strQ21, cVar10, 1, lVar10, pVar5, (l) objQ21, mVar3, (y22.x.f194327d << 3) | 24960);
                        mVar3.y();
                        mVar3.f();
                    } else {
                        mVar3.C(-1144166767);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar20 = (e23.a) obj10;
                bt1.u uVar = (bt1.u) obj9;
                bt1.u uVar2 = (bt1.u) obj8;
                f4.s sVar = (f4.s) obj7;
                f4.s sVar2 = (f4.s) obj6;
                f4.s sVar3 = (f4.s) obj5;
                f4.s sVar4 = (f4.s) obj4;
                p1 p1Var7 = (p1) obj3;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    String strQ22 = y.Q(mVar4, R.string.lbl_filters);
                    i53.f fVarA = i53.a.a(new i3("menu_item_reset_all", y.Q(mVar4, R.string.trail_filters_reset_all), false, (u4.d) null, (String) null, 28, (j) null));
                    boolean zB4 = mVar4.B(uVar) | mVar4.B(uVar2) | mVar4.B(sVar) | mVar4.B(sVar2) | mVar4.B(sVar3) | mVar4.B(sVar4);
                    Object objQ22 = mVar4.q();
                    if (zB4) {
                        objQ22 = new b82.l0((Object) uVar, (Object) uVar2, p1Var7, (Object) sVar, (Object) sVar2, (Object) sVar3, (Object) sVar4, 3);
                        mVar4.K(objQ22);
                    } else {
                        aVar2.getClass();
                        if (objQ22 == m.a.f135155b) {
                            objQ22 = new b82.l0((Object) uVar, (Object) uVar2, p1Var7, (Object) sVar, (Object) sVar2, (Object) sVar3, (Object) sVar4, 3);
                            mVar4.K(objQ22);
                        }
                    }
                    z02.f.d(strQ22, null, null, aVar20, fVarA, null, (l) objQ22, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                w0.a((gv0.d) obj10, (yu0.f) obj9, (e23.a) obj8, (l) obj3, (e23.a) obj7, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                return a(obj, obj2);
            case 6:
                ((Integer) obj2).getClass();
                h21.y.b((r) obj10, (v21.e) obj9, (u) obj8, (i53.c) obj4, (f0) obj7, (g21.t) obj6, (List) obj5, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                return b(obj, obj2);
            case 8:
                return c(obj, obj2);
            case 9:
                return d(obj, obj2);
            case 10:
                return e(obj, obj2);
            case 11:
                return f(obj, obj2);
            case 12:
                return g(obj, obj2);
            case 13:
                return h(obj, obj2);
            case 14:
                return i(obj, obj2);
            case 15:
                return j(obj, obj2);
            case 16:
                return k(obj, obj2);
            case 17:
                return l(obj, obj2);
            case 18:
                return n(obj, obj2);
            case 19:
                return o(obj, obj2);
            case 20:
                return q(obj, obj2);
            case 21:
                return r(obj, obj2);
            case 22:
                return s(obj, obj2);
            case 23:
                return u(obj, obj2);
            case 24:
                return v(obj, obj2);
            case 25:
                return w(obj, obj2);
            case 26:
                return x(obj, obj2);
            case 27:
                return y(obj, obj2);
            case 28:
                return z(obj, obj2);
            default:
                i53.f fVar6 = (i53.f) obj10;
                n82.f fVar7 = (n82.f) obj9;
                b63.o oVar = (b63.o) obj8;
                b63.o oVar2 = (b63.o) obj7;
                yd1.a aVar21 = (yd1.a) obj6;
                p1 p1Var8 = (p1) obj5;
                p1 p1Var9 = (p1) obj4;
                qr1.d dVar5 = (qr1.d) obj3;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar22 = r.S;
                    r rVarL = c2.l.l(u1.n.e(x2.d(aVar22, 1.0f), vb.h.e(d92.b.f58623a, mVar5), m1.f128891a));
                    h4.d.f81522a.getClass();
                    h4.g.a aVar23 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA4 = c2.y.a(c2.j.f22694d, aVar23, mVar5, 48);
                    int iHashCode4 = Long.hashCode(mVar5.getU());
                    i2 i2VarX4 = mVar5.x();
                    r rVarC5 = h4.k.c(rVarL, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar24 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar24);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar5);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar5, iHashCode4, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar5);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    if (((qr1.c) p1Var8.getF182175a()).f146898c) {
                        mVar5.C(1682196339);
                        d92.b.f58625c.getClass();
                        aVar = aVar22;
                        c2.l.f(c2.l.C(aVar22, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar5);
                        i53.c cVarE2 = i53.a.e(o2.b(fVar6, mVar5));
                        int iIndexOf2 = fVar6.indexOf(fVar7.f124961b.a());
                        boolean zB5 = mVar5.B(fVar7) | mVar5.r(oVar) | mVar5.r(oVar2);
                        Object objQ23 = mVar5.q();
                        if (zB5) {
                            objQ23 = new sy.h(fVar7, fVar6, oVar, oVar2, 1);
                            mVar5.K(objQ23);
                        } else {
                            aVar2.getClass();
                            if (objQ23 == m.a.f135155b) {
                                objQ23 = new sy.h(fVar7, fVar6, oVar, oVar2, 1);
                                mVar5.K(objQ23);
                            }
                        }
                        t82.c.a(cVarE2, null, iIndexOf2, 0.0f, (l) objQ23, mVar5, 0, 26);
                        q82.a.a(x2.f(aVar, 1.0f), new n82.n(fVar7, aVar21), null, mVar5, 6, 4);
                        mVar5 = mVar5;
                        mVar5.f();
                    } else {
                        aVar = aVar22;
                        mVar5.C(1682939192);
                        mVar5.f();
                    }
                    m mVar6 = mVar5;
                    n82.c.a(b0Var4.a(aVar, 1.0f, true), fVar7, 3, ((qr1.c) p1Var8.getF182175a()).f146898c || ((Boolean) p1Var9.getF182175a()).booleanValue(), z3.f.c(-928692020, new qw.b(dVar5, fVar7, p1Var9, p1Var8, 6), mVar5), mVar6, 24960, 0);
                    mVar6.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(gv0.d dVar, yu0.f fVar, e23.a aVar, l lVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, int i14) {
        this.f59194a = 4;
        this.f59196c = dVar;
        this.f59197d = fVar;
        this.f59198e = aVar;
        this.f59202i = lVar;
        this.f59199f = aVar2;
        this.f59200g = aVar3;
        this.f59201h = aVar4;
        this.f59195b = aVar5;
    }

    public /* synthetic */ d(d11.a aVar, f11.a aVar2, i53.c cVar, v21.e eVar, p1 p1Var, p1 p1Var2, p1 p1Var3, e01.a aVar3) {
        this.f59194a = 1;
        this.f59196c = aVar;
        this.f59197d = aVar2;
        this.f59195b = cVar;
        this.f59198e = eVar;
        this.f59199f = p1Var;
        this.f59200g = p1Var2;
        this.f59201h = p1Var3;
        this.f59202i = aVar3;
    }

    public /* synthetic */ d(r rVar, v21.e eVar, u uVar, i53.c cVar, f0 f0Var, g21.t tVar, List list, l lVar, int i14) {
        this.f59194a = 6;
        this.f59196c = rVar;
        this.f59197d = eVar;
        this.f59198e = uVar;
        this.f59195b = cVar;
        this.f59199f = f0Var;
        this.f59200g = tVar;
        this.f59201h = list;
        this.f59202i = lVar;
    }

    public /* synthetic */ d(i53.c cVar, g gVar, kl1.a aVar, p1 p1Var, e23.a aVar2, p1 p1Var2, n1 n1Var, p1 p1Var3) {
        this.f59194a = 9;
        this.f59195b = cVar;
        this.f59196c = gVar;
        this.f59197d = aVar;
        this.f59198e = p1Var;
        this.f59199f = aVar2;
        this.f59200g = p1Var2;
        this.f59201h = n1Var;
        this.f59202i = p1Var3;
    }

    public /* synthetic */ d(Long l14, l lVar, e0 e0Var, j23.l lVar2, l3 l3Var, bc bcVar, b3 b3Var, b0 b0Var, int i14) {
        this.f59194a = 7;
        this.f59196c = l14;
        this.f59202i = lVar;
        this.f59197d = e0Var;
        this.f59198e = lVar2;
        this.f59199f = l3Var;
        this.f59200g = bcVar;
        this.f59201h = b3Var;
        this.f59195b = b0Var;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, l lVar, Object obj4, Object obj5, Object obj6, Object obj7, int i14) {
        this.f59194a = i14;
        this.f59196c = obj;
        this.f59197d = obj2;
        this.f59198e = obj3;
        this.f59202i = lVar;
        this.f59199f = obj4;
        this.f59200g = obj5;
        this.f59201h = obj6;
        this.f59195b = obj7;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, l lVar, Object obj6, p1 p1Var, int i14) {
        this.f59194a = i14;
        this.f59196c = obj;
        this.f59197d = obj2;
        this.f59198e = obj3;
        this.f59199f = obj4;
        this.f59200g = obj5;
        this.f59202i = lVar;
        this.f59201h = obj6;
        this.f59195b = p1Var;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i14) {
        this.f59194a = i14;
        this.f59196c = obj;
        this.f59197d = obj2;
        this.f59198e = obj3;
        this.f59199f = obj4;
        this.f59200g = obj5;
        this.f59201h = obj6;
        this.f59195b = obj7;
        this.f59202i = obj8;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, o13.h hVar, l lVar, p pVar, Object obj5, int i14, int i15) {
        this.f59194a = i15;
        this.f59196c = obj;
        this.f59197d = obj2;
        this.f59198e = obj3;
        this.f59199f = obj4;
        this.f59200g = hVar;
        this.f59202i = lVar;
        this.f59201h = pVar;
        this.f59195b = obj5;
    }

    public /* synthetic */ d(String str, l lVar, String str2, e23.a aVar, p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4) {
        this.f59194a = 19;
        this.f59196c = str;
        this.f59202i = lVar;
        this.f59197d = str2;
        this.f59198e = aVar;
        this.f59199f = p1Var;
        this.f59200g = p1Var2;
        this.f59201h = p1Var3;
        this.f59195b = p1Var4;
    }

    public /* synthetic */ d(String str, String str2, String str3, Object obj, Object obj2, Object obj3, e23.a aVar, o13.h hVar, int i14, int i15) {
        this.f59194a = i15;
        this.f59196c = str;
        this.f59197d = str2;
        this.f59198e = str3;
        this.f59199f = obj;
        this.f59200g = obj2;
        this.f59201h = obj3;
        this.f59195b = aVar;
        this.f59202i = hVar;
    }

    public /* synthetic */ d(op.a aVar, n82.f fVar, np.c cVar, mp.a aVar2, Context context, i53.f fVar2, sp.c cVar2, p1 p1Var) {
        this.f59194a = 14;
        this.f59198e = aVar;
        this.f59197d = fVar;
        this.f59199f = cVar;
        this.f59200g = aVar2;
        this.f59201h = context;
        this.f59196c = fVar2;
        this.f59195b = cVar2;
        this.f59202i = p1Var;
    }

    public /* synthetic */ d(pa0.h hVar, String str, e23.a aVar, e23.a aVar2, l lVar, e23.a aVar3, e23.a aVar4, e23.a aVar5, int i14) {
        this.f59194a = 17;
        this.f59196c = hVar;
        this.f59197d = str;
        this.f59198e = aVar;
        this.f59199f = aVar2;
        this.f59202i = lVar;
        this.f59200g = aVar3;
        this.f59201h = aVar4;
        this.f59195b = aVar5;
    }

    public /* synthetic */ d(qb0.b bVar, d90.f fVar, String str, o90.a aVar, e23.a aVar2, e23.a aVar3, l lVar, e23.a aVar4, int i14) {
        this.f59194a = 18;
        this.f59196c = bVar;
        this.f59197d = fVar;
        this.f59198e = str;
        this.f59199f = aVar;
        this.f59200g = aVar2;
        this.f59201h = aVar3;
        this.f59202i = lVar;
        this.f59195b = aVar4;
    }
}
