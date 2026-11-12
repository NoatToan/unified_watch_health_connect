package ka0;

import android.os.Parcelable;
import c2.j;
import c2.t2;
import c2.x2;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import e23.l;
import e23.p;
import gs1.t;
import h4.k;
import h4.r;
import h5.e0;
import i3.k8;
import i3.mc;
import i3.mh;
import java.util.List;
import java.util.Set;
import l72.i3;
import l72.n2;
import lc.m0;
import lc.y;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p40.r0;
import p5.v;
import rr0.u;
import s1.f0;
import s1.t1;
import s1.w1;
import s5.x0;
import s70.r1;
import sg0.q0;
import sm1.a0;
import ta0.h0;
import tb0.x;
import tg1.o;
import w52.l0;
import w52.v0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f103735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f103736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f103737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f103738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f103739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f103740g;

    public /* synthetic */ e(int i14, e23.a aVar, e23.a aVar2, b0 b0Var, mc mcVar, p1 p1Var) {
        this.f103734a = 16;
        this.f103735b = i14;
        this.f103739f = aVar;
        this.f103740g = aVar2;
        this.f103736c = b0Var;
        this.f103737d = mcVar;
        this.f103738e = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0248  */
    /* JADX WARN: Code duplicated, block: B:49:0x02df  */
    /* JADX WARN: Code duplicated, block: B:82:0x0499  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        i53.f fVarA;
        int i14 = this.f103734a;
        m.a aVar = m.f135153a;
        int i15 = this.f103735b;
        Object obj3 = this.f103739f;
        Object obj4 = this.f103738e;
        Object obj5 = this.f103740g;
        Object obj6 = this.f103737d;
        Object obj7 = this.f103736c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                f.b((List) obj7, (p) obj6, (l) obj4, (e23.a) obj3, (e23.a) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                lj2.f.a((String) obj7, (y) obj6, (nj2.a) obj4, (String) obj3, (String) obj5, (m) obj, p0.t(24577), this.f103735b);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                lm0.e.a((Set) obj7, (String) obj6, (l) obj4, (l) obj3, (l) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i16 = PreviewCatalogActivity.f49781a;
                ((PreviewCatalogActivity) obj6).N9((m0) obj4, (String) obj5, (e23.a) obj3, (List) obj7, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                mc1.d.a((dc1.a) obj7, (DateTime) obj6, (tf0.i) obj3, (l) obj4, (l) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ml0.h.h((ml0.l) obj7, (l) obj4, (e23.a) obj3, (l) obj6, (l) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 6:
                String str = (String) obj7;
                i53.f fVar = (i53.f) obj6;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj5;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarD = x2.d(aVar2, 1.0f);
                    boolean zB = mVar.B(str);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new n2(str, 23);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new n2(str, 23);
                            mVar.K(objQ);
                        }
                    }
                    r rVarC = v.c((l) objQ, rVarD, false);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    j.f22691a.getClass();
                    z zVarA = c2.y.a(j.f22698h, aVar3, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC2 = k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
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
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    z72.k.b(i15 / 100.0f, yz1.y.g(mVar), 3.0f, 102236160, SyslogConstants.LOG_LOCAL2, fb1.c.i(gl.c.f77766a, mVar), z3.f.c(1149829028, new j21.p(str2, 11), mVar), x2.h(aVar2, yz1.y.k(mVar)), fVar, mVar, false);
                    r rVarX = x2.x(x2.f(aVar2, 1.0f), null, 3);
                    z zVarA2 = c2.y.a(j.f22694d, h4.d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC3 = k.c(rVarX, mVar);
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
                    b4.c(eVar, zVarA2, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC3, mVar);
                    r rVarX2 = x2.x(x2.f(aVar2, 1.0f), null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    mh.c(str3, rVarX2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 48, 0, 131068);
                    String strQ = gl1.y.Q(mVar, R.string.gcm_body_battery_lbl_charged);
                    r rVarX3 = x2.x(x2.f(aVar2, 1.0f), null, 3);
                    x0 x0Var2 = j92.f.f97933j;
                    mh.c(strQ, rVarX3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar), mVar, 48, 0, 131068);
                    r rVarX4 = x2.x(x2.f(aVar2, 1.0f), null, 3);
                    d92.b.f58625c.getClass();
                    mh.c(str4, c2.l.C(rVarX4, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar, R.string.gcm_body_battery_lbl_drained), x2.x(x2.f(aVar2, 1.0f), null, 3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar), mVar, 48, 0, 131068);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.f((m52.k) obj7, (j0) obj6, (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b) obj3, (p62.f) obj5, (l) obj4, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.h((j0) obj7, (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b) obj6, (com.garmin.android.apps.connectmobile.repcounting.model.c) obj3, (l) obj4, (l) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).intValue();
                r0.c((q40.b) obj7, (e23.a) obj3, (e23.a) obj5, (l) obj4, (l) obj6, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                q81.e.a(p0.t(1), this.f103735b, (e23.a) obj3, (String) obj7, (String) obj6, (String) obj4, (String) obj5, (m) obj);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).intValue();
                qk0.r.d((i53.d) obj7, (i53.e) obj6, (qk0.c) obj3, (qk0.i) obj5, (l) obj4, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                qx.f.a((mc) obj7, (b0) obj6, (bx.b) obj4, (t) obj3, (ix.j) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                u.c((ir0.e) obj7, (String) obj6, (DateTime) obj4, (DateTime) obj3, (o13.p) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                w1.a((t1) obj7, (t1.d) obj6, this.f103738e, this.f103739f, (f0) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                r1.b((b0) obj7, (r70.z) obj6, (mc) obj4, (e23.a) obj3, (e23.a) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 16:
                e23.a aVar5 = (e23.a) obj3;
                e23.a aVar6 = (e23.a) obj5;
                b0 b0Var2 = (b0) obj7;
                mc mcVar = (mc) obj6;
                p1 p1Var = (p1) obj4;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    String strQ2 = gl1.y.Q(mVar2, i15);
                    boolean zB2 = mVar2.B(aVar5);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new q0(aVar5, 21);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new q0(aVar5, 21);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ2;
                    if (((a0) p1Var.getF182175a()).f160086b) {
                        mVar2.C(1297763335);
                        fVarA = i53.a.a(new i3("HELP", gl1.y.Q(mVar2, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("EDIT_SLEEP_TIMES", gl1.y.Q(mVar2, R.string.lbl_edit_sleep_times), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar2.f();
                    } else {
                        mVar2.C(1298130840);
                        fVarA = i53.a.a(new i3("HELP", gl1.y.Q(mVar2, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar2.f();
                    }
                    i53.f fVar3 = fVarA;
                    boolean zB3 = mVar2.B(aVar6) | mVar2.r(b0Var2) | mVar2.B(mcVar);
                    Object objQ3 = mVar2.q();
                    if (zB3) {
                        objQ3 = new k8(aVar6, b0Var2, mcVar);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new k8(aVar6, b0Var2, mcVar);
                            mVar2.K(objQ3);
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar7, null, fVar3, (l) objQ3, mVar2, 2097152, 54);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                t82.d.b((r) obj7, (String) obj6, (t82.e) obj3, (b92.a) obj5, (l) obj4, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ta0.m.c((t2) obj7, (String) obj6, (m4.b0) obj5, this.f103735b, (l) obj4, (e23.a) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                h0.b((String) obj7, (t4.d) obj6, (l) obj4, (e23.a) obj3, (e23.a) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).intValue();
                tb0.l.b((c2.a0) obj7, (String) obj6, (x) obj3, (ub0.l) obj5, (l) obj4, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                tg1.e.a((sg1.d) obj7, (e23.a) obj3, (pg1.d) obj6, (l) obj4, (pg1.d) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                o.c((sg1.d) obj7, (l) obj4, (e23.a) obj3, (e23.a) obj5, (pg1.d) obj6, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.r) obj6).v6((String) obj3, (List) obj7, (gg0.f) obj5, (l) obj4, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.race_time_prediction.presentation.b.a((uc1.f) obj7, (fg0.k) obj6, (y) obj4, (e23.a) obj3, (e23.a) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).intValue();
                uj1.z.e((yj1.b) obj7, (e23.a) obj3, (e23.a) obj5, (e23.a) obj6, (l) obj4, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                uk0.h.a((b63.o) obj7, (l) obj4, (e23.a) obj3, (b63.o) obj6, (b63.o) obj5, (m) obj, p0.t(1), this.f103735b);
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                vz1.s.a((oz1.a) obj7, (oz1.b) obj6, (sz1.t) obj4, (mc) obj3, (b0) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                w51.v.b((z51.h) obj7, (r) obj6, (l) obj4, (l) obj3, (l) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                l0.j((v0) obj7, (Integer) obj6, (Double) obj4, (m52.b) obj3, (m52.j) obj5, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Parcelable parcelable, Object obj, Object obj2, l lVar, l lVar2, int i14, int i15) {
        this.f103734a = i15;
        this.f103736c = parcelable;
        this.f103737d = obj;
        this.f103739f = obj2;
        this.f103738e = lVar;
        this.f103740g = lVar2;
        this.f103735b = i14;
    }

    public /* synthetic */ e(b63.o oVar, l lVar, e23.a aVar, b63.o oVar2, b63.o oVar3, int i14, int i15) {
        this.f103734a = 26;
        this.f103736c = oVar;
        this.f103738e = lVar;
        this.f103739f = aVar;
        this.f103737d = oVar2;
        this.f103740g = oVar3;
        this.f103735b = i15;
    }

    public /* synthetic */ e(t2 t2Var, String str, m4.b0 b0Var, int i14, l lVar, e23.a aVar, int i15) {
        this.f103734a = 18;
        this.f103736c = t2Var;
        this.f103737d = str;
        this.f103740g = b0Var;
        this.f103735b = i14;
        this.f103738e = lVar;
        this.f103739f = aVar;
    }

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.traininginitiative.ui.r rVar, String str, List list, gg0.f fVar, l lVar, int i14) {
        this.f103734a = 23;
        this.f103737d = rVar;
        this.f103739f = str;
        this.f103736c = list;
        this.f103740g = fVar;
        this.f103738e = lVar;
        this.f103735b = i14;
    }

    public /* synthetic */ e(PreviewCatalogActivity previewCatalogActivity, m0 m0Var, String str, e23.a aVar, List list, int i14) {
        this.f103734a = 3;
        this.f103737d = previewCatalogActivity;
        this.f103738e = m0Var;
        this.f103740g = str;
        this.f103739f = aVar;
        this.f103736c = list;
        this.f103735b = i14;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, l lVar, int i14, int i15) {
        this.f103734a = i15;
        this.f103736c = obj;
        this.f103737d = obj2;
        this.f103739f = obj3;
        this.f103740g = obj4;
        this.f103738e = lVar;
        this.f103735b = i14;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14, int i15) {
        this.f103734a = i15;
        this.f103736c = obj;
        this.f103737d = obj2;
        this.f103738e = obj3;
        this.f103739f = obj4;
        this.f103740g = obj5;
        this.f103735b = i14;
    }

    public /* synthetic */ e(String str, i53.f fVar, int i14, String str2, String str3, String str4) {
        this.f103734a = 6;
        this.f103736c = str;
        this.f103737d = fVar;
        this.f103735b = i14;
        this.f103738e = str2;
        this.f103739f = str3;
        this.f103740g = str4;
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, e23.a aVar, int i14, int i15) {
        this.f103734a = 10;
        this.f103736c = str;
        this.f103737d = str2;
        this.f103738e = str3;
        this.f103740g = str4;
        this.f103739f = aVar;
        this.f103735b = i15;
    }

    public /* synthetic */ e(String str, y yVar, nj2.a aVar, String str2, String str3, int i14, int i15) {
        this.f103734a = 1;
        this.f103736c = str;
        this.f103737d = yVar;
        this.f103738e = aVar;
        this.f103739f = str2;
        this.f103740g = str3;
        this.f103735b = i15;
    }

    public /* synthetic */ e(ml0.l lVar, l lVar2, e23.a aVar, l lVar3, l lVar4, int i14) {
        this.f103734a = 5;
        this.f103736c = lVar;
        this.f103738e = lVar2;
        this.f103739f = aVar;
        this.f103737d = lVar3;
        this.f103740g = lVar4;
        this.f103735b = i14;
    }

    public /* synthetic */ e(q40.b bVar, e23.a aVar, e23.a aVar2, l lVar, l lVar2, int i14) {
        this.f103734a = 9;
        this.f103736c = bVar;
        this.f103739f = aVar;
        this.f103740g = aVar2;
        this.f103738e = lVar;
        this.f103737d = lVar2;
        this.f103735b = i14;
    }

    public /* synthetic */ e(sg1.d dVar, e23.a aVar, pg1.d dVar2, l lVar, pg1.d dVar3, int i14) {
        this.f103734a = 21;
        this.f103736c = dVar;
        this.f103739f = aVar;
        this.f103737d = dVar2;
        this.f103738e = lVar;
        this.f103740g = dVar3;
        this.f103735b = i14;
    }

    public /* synthetic */ e(sg1.d dVar, l lVar, e23.a aVar, e23.a aVar2, pg1.d dVar2, int i14) {
        this.f103734a = 22;
        this.f103736c = dVar;
        this.f103738e = lVar;
        this.f103739f = aVar;
        this.f103740g = aVar2;
        this.f103737d = dVar2;
        this.f103735b = i14;
    }

    public /* synthetic */ e(yj1.b bVar, e23.a aVar, e23.a aVar2, e23.a aVar3, l lVar, int i14) {
        this.f103734a = 25;
        this.f103736c = bVar;
        this.f103739f = aVar;
        this.f103740g = aVar2;
        this.f103737d = aVar3;
        this.f103738e = lVar;
        this.f103735b = i14;
    }
}
