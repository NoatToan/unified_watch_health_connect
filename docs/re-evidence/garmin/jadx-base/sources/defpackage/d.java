package defpackage;

import a42.c0;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import b21.o9;
import b21.v4;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import com.google.firebase.perf.FirebasePerformance;
import e23.a;
import e23.l;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.g;
import hl1.i;
import i.c;
import i3.e9;
import i3.h1;
import i3.mc;
import i3.mh;
import i53.f;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.m3;
import l72.f0;
import l72.i3;
import l72.s;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p13.w;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p5.v;
import q13.b;
import qm1.k;
import r53.o2;
import s21.e0;
import s70.b1;
import sg0.w0;
import tn2.s0;
import u1.d2;
import ug2.q;
import v.h;
import v21.e;
import vd0.x0;
import wx1.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f56976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f56978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f56979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f56980h;

    public /* synthetic */ d(int i14, l lVar, l lVar2, r rVar, e0 e0Var, e0 e0Var2, e eVar, boolean z14) {
        this.f56973a = 12;
        this.f56976d = z14;
        this.f56978f = e0Var;
        this.f56975c = e0Var2;
        this.f56979g = eVar;
        this.f56974b = rVar;
        this.f56980h = lVar;
        this.f56977e = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x014d  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fd  */
    private final Object a(Object obj, Object obj2) {
        String str;
        dy1.r rVar = (dy1.r) this.f56974b;
        a aVar = (a) this.f56977e;
        c cVar = (c) this.f56978f;
        p1 p1Var = (p1) this.f56975c;
        p1 p1Var2 = (p1) this.f56979g;
        p1 p1Var3 = (p1) this.f56980h;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean z14 = this.f56976d;
            m.a aVar2 = m.f135153a;
            if (z14) {
                mVar.C(1326910604);
                str = rVar != null ? rVar.f61609a : null;
                mVar.C(-1896853335);
                b bVarB = w.b();
                bVarB.add(new i3("HELP", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (j) null));
                if (rVar == null || !rVar.f61622n) {
                    mVar.C(782888963);
                    mVar.f();
                } else {
                    mVar.C(782743852);
                    bVarB.add(new i3("RESTART_PLAN", y.Q(mVar, R.string.lbl_repeat_plan), false, (u4.d) null, (String) null, 28, (j) null));
                    mVar.f();
                }
                if (rVar == null || !rVar.f61623o) {
                    mVar.C(783126051);
                    mVar.f();
                } else {
                    mVar.C(782972291);
                    bVarB.add(new i3("SKIP_DELOAD_WEEK", y.Q(mVar, R.string.lbl_skip_deload_week), false, (u4.d) null, (String) null, 28, (j) null));
                    mVar.f();
                }
                if (rVar == null || !rVar.f61621m) {
                    mVar.C(783359729);
                    bVarB.add(new i3("QUIT_PLAN", y.Q(mVar, R.string.atp_quit_plan), false, (u4.d) null, (String) null, 28, (j) null));
                    mVar.f();
                } else {
                    mVar.C(783205101);
                    bVarB.add(new i3("REMOVE_PLAN", y.Q(mVar, R.string.itp_remove_plan), false, (u4.d) null, (String) null, 28, (j) null));
                    mVar.f();
                }
                Unit unit = Unit.INSTANCE;
                b bVarA = w.a(bVarB);
                mVar.f();
                f fVarJ = i53.a.j(bVarA);
                boolean zR = mVar.r(rVar) | mVar.r(cVar);
                Object objQ = mVar.q();
                if (zR) {
                    q qVar = new q((Object) rVar, (Object) cVar, p1Var, p1Var2, (Object) p1Var3, 2);
                    mVar.K(qVar);
                    objQ = qVar;
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        q qVar2 = new q((Object) rVar, (Object) cVar, p1Var, p1Var2, (Object) p1Var3, 2);
                        mVar.K(qVar2);
                        objQ = qVar2;
                    }
                }
                z02.f.d(str, null, null, aVar, null, fVarJ, (l) objQ, mVar, 2097152, 54);
                mVar.f();
            } else {
                mVar.C(1328736380);
                str = rVar != null ? rVar.f61609a : null;
                mVar.C(-1896796521);
                b bVarB2 = w.b();
                bVarB2.add(new i3("HELP", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (j) null));
                if (rVar == null || !rVar.f61621m) {
                    mVar.C(-1256465217);
                    bVarB2.add(new i3("QUIT_PLAN", y.Q(mVar, R.string.atp_quit_plan), false, (u4.d) null, (String) null, 28, (j) null));
                    mVar.f();
                } else {
                    mVar.C(-1256619845);
                    bVarB2.add(new i3("REMOVE_PLAN", y.Q(mVar, R.string.itp_remove_plan), false, (u4.d) null, (String) null, 28, (j) null));
                    mVar.f();
                }
                Unit unit2 = Unit.INSTANCE;
                b bVarA2 = w.a(bVarB2);
                mVar.f();
                f fVarJ2 = i53.a.j(bVarA2);
                boolean zR2 = mVar.r(rVar);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new s0(rVar, 9, p1Var, p1Var3);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new s0(rVar, 9, p1Var, p1Var3);
                        mVar.K(objQ2);
                    }
                }
                z02.f.b(null, null, str, null, null, null, fVarJ2, (l) objQ2, mVar, 2097152, 59);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x008b  */
    private final Object b(Object obj, Object obj2) {
        a aVar = (a) this.f56977e;
        p1 p1Var = (p1) this.f56974b;
        b0 b0Var = (b0) this.f56978f;
        x0 x0Var = (x0) this.f56975c;
        l lVar = (l) this.f56979g;
        a aVar2 = (a) this.f56980h;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(mVar, R.string.edit_profile_image_title);
            f fVarA = i53.a.a(new i3("save", y.Q(mVar, R.string.save), this.f56976d, (u4.d) null, (String) null, 24, (j) null));
            boolean zB = mVar.B(p1Var) | mVar.r(b0Var) | mVar.r(x0Var) | mVar.B(lVar) | mVar.B(aVar2);
            Object objQ = mVar.q();
            if (zB) {
                q qVar = new q(b0Var, aVar2, p1Var, x0Var, lVar);
                mVar.K(qVar);
                objQ = qVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    q qVar2 = new q(b0Var, aVar2, p1Var, x0Var, lVar);
                    mVar.K(qVar2);
                    objQ = qVar2;
                }
            }
            z02.f.e(strQ, null, aVar, fVarA, (l) objQ, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p0.t(1);
        u.a(this.f56976d, (i53.c) this.f56974b, (mx1.d) this.f56978f, (l) this.f56975c, (a) this.f56977e, (a) this.f56979g, (a) this.f56980h, (m) obj, iT);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0503  */
    /* JADX WARN: Code duplicated, block: B:144:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:164:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:180:0x0864  */
    /* JADX WARN: Code duplicated, block: B:181:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:183:0x090d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0916  */
    /* JADX WARN: Code duplicated, block: B:186:0x091a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0937  */
    /* JADX WARN: Code duplicated, block: B:225:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:227:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:230:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:235:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:239:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:240:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:275:0x0c72  */
    /* JADX WARN: Code duplicated, block: B:278:0x0c82  */
    /* JADX WARN: Code duplicated, block: B:280:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:50:0x022b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0298  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14;
        String str;
        g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        u2 u2Var;
        z zVarA;
        int iHashCode2;
        i2 i2VarX2;
        r rVarC2;
        i53.c<qm1.n> cVar;
        int i14;
        DateTime dateTimeWithMillisOfSecond;
        Iterable iterableK;
        Integer num;
        i53.c cVarE;
        i3 i3Var;
        int i15 = this.f56973a;
        boolean z15 = this.f56976d;
        m.a aVar = m.f135153a;
        Object obj3 = this.f56977e;
        Object obj4 = this.f56980h;
        Object obj5 = this.f56979g;
        Object obj6 = this.f56975c;
        Object obj7 = this.f56978f;
        Object obj8 = this.f56974b;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                e.a((r) obj8, (s.a) obj7, (String) obj6, (String) obj5, (String) obj4, this.f56976d, (a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ba2.j.a((r) obj8, (String) obj6, this.f56976d, (d2) obj7, (l) obj5, (a) obj3, (a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj8;
                k kVar = (k) obj7;
                Context context = (Context) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarF = x2.f(aVar2, 1.0f);
                    boolean zB = mVar.B(str2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new c82.b(str2, 27);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new c82.b(str2, 27);
                            mVar.K(objQ);
                        }
                    }
                    r rVarC3 = v.c((l) objQ, rVarF, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81536n;
                    z zVarA2 = c2.y.a(kVar2, aVar3, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    r rVarC4 = h4.k.c(rVarC3, mVar);
                    g.V.getClass();
                    h5.e0.a aVar4 = g.a.f81805b;
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
                    g.a.e eVar = g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar);
                    g.a.C1623g c1623g = g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar.getT()) {
                        z14 = z15;
                        str = str4;
                    } else {
                        z14 = z15;
                        str = str4;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = g.a.f81807d;
                        b4.c(fVar, rVarC4, mVar);
                        c2.b0 b0Var = c2.b0.f22601a;
                        if (z14) {
                            mVar.C(-1053831174);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0Var = j92.f.f97930g;
                            g02.c.a(str3, null, 0L, null, 0, false, 0, d92.c.b(x0Var, mVar), 0.0d, mVar, 0, 382);
                            String strQ = y.Q(mVar, R.string.lbl_duration);
                            s5.x0 x0Var2 = j92.f.f97933j;
                            g02.c.a(strQ, null, 0L, null, 0, false, 0, d92.c.f(x0Var2, mVar), 0.0d, mVar, 0, 382);
                            g02.c.a(str, null, 0L, null, 0, false, 0, d92.c.b(x0Var, mVar), 0.0d, mVar, 0, 382);
                            g02.c.a(y.Q(mVar, R.string.sleep_lbl_bedtime), null, 0L, null, 0, false, 0, d92.c.f(x0Var2, mVar), 0.0d, mVar, 0, 382);
                            g02.c.a(str5, null, 0L, null, 0, false, 0, d92.c.b(x0Var, mVar), 0.0d, mVar, 0, 382);
                            g02.c.a(y.Q(mVar, R.string.sleep_lbl_wake_time), null, 0L, null, 0, false, 0, d92.c.f(x0Var2, mVar), 0.0d, mVar, 0, 382);
                            mVar.f();
                        } else {
                            mVar.C(-1052589965);
                            r rVarF2 = x2.f(aVar2, 1.0f);
                            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 48);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF2, mVar);
                            if (mVar.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar4);
                            } else {
                                mVar.c();
                            }
                            b4.c(eVar, s2VarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                                h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(fVar, rVarC, mVar);
                            u2Var = u2.f22900a;
                            if (kVar != null || (num = kVar.f145622c) == null || num.intValue() <= 0) {
                                mVar.C(-4786065);
                                r rVarA = u2Var.a(aVar2, 1.0f, true);
                                zVarA = c2.y.a(kVar2, aVar3, mVar, 0);
                                iHashCode2 = Long.hashCode(mVar.getU());
                                i2VarX2 = mVar.x();
                                rVarC2 = h4.k.c(rVarA, mVar);
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
                                b4.c(eVar, zVarA, mVar);
                                b4.c(c1623g, i2VarX2, mVar);
                                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                                    h.z(iHashCode2, mVar, iHashCode2, bVar);
                                }
                                b4.c(fVar, rVarC2, mVar);
                                String strQ2 = y.Q(mVar, R.string.lbl_no_sleep_legacy);
                                d6.h.f57752b.getClass();
                                d6.h hVarA = d6.h.a(d6.h.f57755e);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                g02.c.a(strQ2, null, 0L, hVarA, 0, false, 0, d92.c.f(j92.f.f97933j, mVar), 0.0d, mVar, 0, 374);
                                mVar.y();
                                mVar.f();
                            } else {
                                mVar.C(-5943636);
                                if (kVar.f145627h) {
                                    mVar.C(-5864896);
                                    r rVarA2 = u2Var.a(aVar2, 1.0f, true);
                                    Integer num2 = kVar.f145621b;
                                    String strValueOf = num2 != null ? String.valueOf(num2.intValue()) : null;
                                    if (strValueOf == null) {
                                        strValueOf = sn.a.h(mVar, 276910428, R.string.no_value, mVar);
                                    } else {
                                        mVar.C(276909188);
                                        mVar.f();
                                    }
                                    String str6 = strValueOf;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    g02.c.a(str6, rVarA2, 0L, null, 0, false, 1, d92.c.b(j92.f.f97930g, mVar), 0.0d, mVar, 1572864, 316);
                                    mVar.f();
                                } else {
                                    mVar.C(-5485332);
                                    mVar.f();
                                }
                                r rVarA3 = u2Var.a(aVar2, 1.0f, true);
                                z zVarA3 = c2.y.a(kVar2, aVar3, mVar, 0);
                                int iHashCode4 = Long.hashCode(mVar.getU());
                                i2 i2VarX4 = mVar.x();
                                r rVarC5 = h4.k.c(rVarA3, mVar);
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
                                b4.c(eVar, zVarA3, mVar);
                                b4.c(c1623g, i2VarX4, mVar);
                                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                                    h.z(iHashCode4, mVar, iHashCode4, bVar);
                                }
                                b4.c(fVar, rVarC5, mVar);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                g02.c.a(str3, null, 0L, null, 0, false, 1, d92.c.b(j92.f.f97931h, mVar), 0.0d, mVar, 1572864, 318);
                                g02.c.a(y.Q(mVar, R.string.lbl_duration), null, 0L, null, 0, false, 1, d92.c.f(j92.f.f97933j, mVar), 0.0d, mVar, 1572864, 318);
                                mVar.y();
                                mVar.f();
                            }
                            mVar.y();
                            if (kVar != null) {
                                cVar = kVar.f145623d;
                            } else {
                                cVar = null;
                            }
                            if (cVar != null || kVar.f145623d.isEmpty()) {
                                mVar.C(-1047978684);
                                mVar.f();
                            } else {
                                mVar.C(-1050663718);
                                r rVarA4 = b0Var.a(x2.f(aVar2, 1.0f), 1.0f, true);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar2 = j92.b.f97899b;
                                r rVarC6 = c2.l.C(rVarA4, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                                int iHashCode5 = Long.hashCode(mVar.getU());
                                i2 i2VarX5 = mVar.x();
                                r rVarC7 = h4.k.c(rVarC6, mVar);
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
                                b4.c(eVar, z0VarD, mVar);
                                b4.c(c1623g, i2VarX5, mVar);
                                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode5))) {
                                    h.z(iHashCode5, mVar, iHashCode5, bVar);
                                }
                                b4.c(fVar, rVarC7, mVar);
                                c2.u uVar = c2.u.f22885a;
                                m92.u.a(x2.d(aVar2, 1.0f), qm1.l.f(context, kVar.f145623d, kVar.f145626g), null, false, Float.valueOf(0.0f), Float.valueOf(4.0f), 0.0f, y.Q(mVar, R.string.common_no_data), mVar, 1769478, 7834);
                                mVar.y();
                                o13.p<Long, Long> pVar = kVar.f145624e;
                                if (pVar == null) {
                                    mVar.C(-1049470839);
                                    mVar.f();
                                } else {
                                    mVar.C(-1049470838);
                                    Long l14 = pVar.f128594a;
                                    if (l14 != null) {
                                        i14 = 0;
                                        dateTimeWithMillisOfSecond = new DateTime(l14.longValue()).withSecondOfMinute(0).withMillisOfSecond(0);
                                    } else {
                                        i14 = 0;
                                        dateTimeWithMillisOfSecond = null;
                                    }
                                    Long l15 = pVar.f128595b;
                                    DateTime dateTimeWithMillisOfSecond2 = l15 != null ? new DateTime(l15.longValue()).withSecondOfMinute(i14).withMillisOfSecond(i14) : null;
                                    if (dateTimeWithMillisOfSecond == null || dateTimeWithMillisOfSecond2 == null) {
                                        mVar.C(-431679696);
                                        iterableK = x.k(y.Q(mVar, R.string.no_value), y.Q(mVar, R.string.no_value));
                                        mVar.f();
                                    } else {
                                        mVar.C(-432223901);
                                        mVar.f();
                                        iterableK = gl1.d.a0(j00.f.a(j00.f.f95974a, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, i14, 28), context, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, null, 56);
                                    }
                                    cn1.b.a(c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), i53.a.j(iterableK), true, mVar, 384, 0);
                                    Unit unit = Unit.INSTANCE;
                                    mVar.f();
                                }
                                mVar.f();
                            }
                            mVar.f();
                        }
                        mVar.y();
                    }
                    h.z(iHashCode3, mVar, iHashCode3, bVar);
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC4, mVar);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (z14) {
                        mVar.C(-1053831174);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0Var3 = j92.f.f97930g;
                        g02.c.a(str3, null, 0L, null, 0, false, 0, d92.c.b(x0Var3, mVar), 0.0d, mVar, 0, 382);
                        String strQ3 = y.Q(mVar, R.string.lbl_duration);
                        s5.x0 x0Var4 = j92.f.f97933j;
                        g02.c.a(strQ3, null, 0L, null, 0, false, 0, d92.c.f(x0Var4, mVar), 0.0d, mVar, 0, 382);
                        g02.c.a(str, null, 0L, null, 0, false, 0, d92.c.b(x0Var3, mVar), 0.0d, mVar, 0, 382);
                        g02.c.a(y.Q(mVar, R.string.sleep_lbl_bedtime), null, 0L, null, 0, false, 0, d92.c.f(x0Var4, mVar), 0.0d, mVar, 0, 382);
                        g02.c.a(str5, null, 0L, null, 0, false, 0, d92.c.b(x0Var3, mVar), 0.0d, mVar, 0, 382);
                        g02.c.a(y.Q(mVar, R.string.sleep_lbl_wake_time), null, 0L, null, 0, false, 0, d92.c.f(x0Var4, mVar), 0.0d, mVar, 0, 382);
                        mVar.f();
                    } else {
                        mVar.C(-1052589965);
                        r rVarF3 = x2.f(aVar2, 1.0f);
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 48);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarF3, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, s2VarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT()) {
                            h.z(iHashCode, mVar, iHashCode, bVar);
                        } else {
                            h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar);
                        u2Var = u2.f22900a;
                        if (kVar != null) {
                            mVar.C(-4786065);
                            r rVarA5 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(kVar2, aVar3, mVar, 0);
                            iHashCode2 = Long.hashCode(mVar.getU());
                            i2VarX2 = mVar.x();
                            rVarC2 = h4.k.c(rVarA5, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX2, mVar);
                            if (mVar.getT()) {
                                h.z(iHashCode2, mVar, iHashCode2, bVar);
                            } else {
                                h.z(iHashCode2, mVar, iHashCode2, bVar);
                            }
                            b4.c(fVar, rVarC2, mVar);
                            String strQ4 = y.Q(mVar, R.string.lbl_no_sleep_legacy);
                            d6.h.f57752b.getClass();
                            d6.h hVarA2 = d6.h.a(d6.h.f57755e);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            g02.c.a(strQ4, null, 0L, hVarA2, 0, false, 0, d92.c.f(j92.f.f97933j, mVar), 0.0d, mVar, 0, 374);
                            mVar.y();
                            mVar.f();
                        } else {
                            mVar.C(-4786065);
                            r rVarA6 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(kVar2, aVar3, mVar, 0);
                            iHashCode2 = Long.hashCode(mVar.getU());
                            i2VarX2 = mVar.x();
                            rVarC2 = h4.k.c(rVarA6, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX2, mVar);
                            if (mVar.getT()) {
                                h.z(iHashCode2, mVar, iHashCode2, bVar);
                            } else {
                                h.z(iHashCode2, mVar, iHashCode2, bVar);
                            }
                            b4.c(fVar, rVarC2, mVar);
                            String strQ5 = y.Q(mVar, R.string.lbl_no_sleep_legacy);
                            d6.h.f57752b.getClass();
                            d6.h hVarA3 = d6.h.a(d6.h.f57755e);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            g02.c.a(strQ5, null, 0L, hVarA3, 0, false, 0, d92.c.f(j92.f.f97933j, mVar), 0.0d, mVar, 0, 374);
                            mVar.y();
                            mVar.f();
                        }
                        mVar.y();
                        if (kVar != null) {
                            cVar = kVar.f145623d;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            mVar.C(-1047978684);
                            mVar.f();
                        } else {
                            mVar.C(-1047978684);
                            mVar.f();
                        }
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                cq0.v.a((String) obj6, (String) obj5, (String) obj4, (List) obj8, (String) obj7, (a) obj3, this.f56976d, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                e11.e0.b((i53.c) obj8, (Set) obj7, this.f56976d, (e) obj6, (l) obj5, (l) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                String str7 = (String) obj6;
                Context context2 = (Context) obj8;
                String str8 = (String) obj5;
                p1 p1Var = (p1) obj7;
                f4.s sVar = (f4.s) obj4;
                p1 p1Var2 = (p1) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                eu.c cVar2 = eu.c.f66055a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(-540270854);
                        l72.w wVar = l72.w.f111301a;
                        boolean z16 = this.f56976d;
                        boolean zH = mVar2.h(z16) | mVar2.r(context2) | mVar2.B(str8);
                        Object objQ2 = mVar2.q();
                        if (zH) {
                            objQ2 = new o9(z16, sVar, context2, str8, p1Var2);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new o9(z16, sVar, context2, str8, p1Var2);
                                mVar2.K(objQ2);
                            }
                        }
                        wVar.j(0, (a) objQ2, str7, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-539781054);
                        String upperCase = str7.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF = d92.c.f(d92.c.e(j92.f.f97935l), mVar2);
                        r.a aVar5 = r.S;
                        d92.b.f58625c.getClass();
                        mh.c(upperCase, c2.l.y(aVar5, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ho.w.c((String) obj6, this.f56976d, (i53.c) obj8, (i53.c) obj7, (mc) obj5, (a) obj3, (l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                p1 p1Var3 = (p1) obj8;
                a aVar6 = (a) obj3;
                zc.d dVar = (zc.d) obj7;
                mi0.a aVar7 = (mi0.a) obj6;
                p1 p1Var4 = (p1) obj5;
                p1 p1Var5 = (p1) obj4;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    z02.d.a(((Boolean) p1Var3.getF182175a()).booleanValue(), z3.f.c(-232882193, new i(aVar6, 6), mVar3), null, null, null, z3.f.c(345268979, new ck0.h(dVar, aVar7, this.f56976d, aVar6, p1Var4, p1Var5, 12), mVar3), mVar3, 196656, 28);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                is.h.b((r) obj8, (nr.p0) obj7, (ds.n) obj6, this.f56976d, (a) obj3, (a) obj5, (a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                Context context3 = (Context) obj8;
                a aVar8 = (a) obj3;
                m4.q qVar = (m4.q) obj7;
                m3 m3Var = (m3) obj6;
                c.q qVar2 = (c.q) obj5;
                p1 p1Var6 = (p1) obj4;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                        mVar4.C(-1249711644);
                        boolean zR = mVar4.r(context3) | mVar4.B(aVar8) | mVar4.r(qVar) | mVar4.B(m3Var) | mVar4.r(qVar2);
                        Object objQ3 = mVar4.q();
                        if (zR) {
                            objQ3 = new v4(context3, qVar2, aVar8, qVar, m3Var, 20);
                            mVar4.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new v4(context3, qVar2, aVar8, qVar, m3Var, 20);
                                mVar4.K(objQ3);
                            }
                        }
                        lm0.b.f113519a.getClass();
                        h1.c((a) objQ3, null, false, null, null, null, null, null, lm0.b.f113520b, mVar4, C.ENCODING_PCM_32BIT, 510);
                        mVar4.f();
                    } else if (z15) {
                        mVar4.C(-1248067528);
                        String strQ6 = y.Q(mVar4, R.string.msg_error_group_location_too_long);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF2 = d92.c.f(j92.f.f97933j, mVar4);
                        r.a aVar9 = r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        mh.c(strQ6, c2.l.z(aVar9, eVar3.f97920e, eVar3.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar4, 0, 0, 131068);
                        mVar4.f();
                    } else {
                        mVar4.C(-1247728574);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                mk1.f.c((mk1.h) obj8, (String) obj6, this.f56976d, (dk1.a) obj7, (l) obj5, (a) obj3, (a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                nw0.q.h((String) obj6, this.f56976d, (String) obj5, (l) obj8, (a) obj3, (a) obj7, (a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                p21.g.e(p0.t(24577), (l) obj4, (l) obj3, (r) obj8, (m) obj, (e0) obj7, (e0) obj6, (e) obj5, this.f56976d);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                p50.e.a((mc) obj8, (b0) obj7, (a01.a) obj6, this.f56976d, (Double) obj5, (p) obj4, (a) obj3, (m) obj, p0.t(1572865));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                pg2.g.a((r) obj8, (qg2.c) obj7, (a) obj3, (a) obj6, this.f56976d, (o2) obj5, (o2) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                List list = (List) obj8;
                ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) obj7;
                yo1.f fVar2 = (yo1.f) obj5;
                String str9 = (String) obj6;
                ComposeView composeView = (ComposeView) obj4;
                m0 m0Var = (m0) obj3;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i16 = ActivityDetailsFragment.I;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    cq.u.e(list, activityDetailChartDTO, fVar2, e9.f(true, null, mVar5, 6, 2), true, str9, this.f56976d, new ph1.d(15, composeView, m0Var), mVar5, (yo1.f.f198451e << 6) | 24576);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                b1.a((String) obj6, (String) obj5, (r) obj8, this.f56976d, (p) obj7, (p) obj4, (a) obj3, (m) obj, p0.t(1769473));
                return Unit.INSTANCE;
            case 17:
                String str10 = (String) obj6;
                com.garmin.android.apps.connectmobile.activities.health.presentation.c cVar3 = (com.garmin.android.apps.connectmobile.activities.health.presentation.c) obj8;
                Context context4 = (Context) obj7;
                r0 r0Var = (r0) obj5;
                lc.m0 m0Var2 = (lc.m0) obj4;
                p1 p1Var7 = (p1) obj3;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i17 = com.garmin.android.apps.connectmobile.activities.health.presentation.c.f29045e;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    boolean zR2 = mVar6.r(cVar3);
                    Object objQ4 = mVar6.q();
                    if (zR2) {
                        objQ4 = new w0(cVar3, 22);
                        mVar6.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new w0(cVar3, 22);
                            mVar6.K(objQ4);
                        }
                    }
                    a aVar10 = (a) objQ4;
                    sn.h hVar = (sn.h) r0Var.f105810a;
                    if (!z15 || hVar == null) {
                        cVarE = null;
                    } else {
                        String string = context4.getString(R.string.lbl_edit_snapshot_name);
                        string.getClass();
                        i3 i3Var2 = new i3("EDIT_NAME", string, false, (u4.d) null, (String) null, 28, (j) null);
                        if (oc.b.y()) {
                            String string2 = context4.getString(R.string.lbl_download_pdf);
                            string2.getClass();
                            i3Var = new i3("DOWNLOAD_PDF", string2, false, (u4.d) null, (String) null, 28, (j) null);
                        } else {
                            i3Var = null;
                        }
                        String string3 = context4.getString(R.string.lbl_help);
                        string3.getClass();
                        i3 i3Var3 = new i3("HELP", string3, false, (u4.d) null, (String) null, 28, (j) null);
                        String string4 = context4.getString(R.string.lbl_delete_snapshot);
                        string4.getClass();
                        cVarE = i53.a.e(p13.u.C(new i3[]{i3Var2, i3Var, i3Var3, new i3(FirebasePerformance.HttpMethod.DELETE, string4, false, (u4.d) null, (String) null, 28, (j) null)}));
                    }
                    z02.f.d(str10, null, null, aVar10, null, cVarE, new jv0.c(r0Var, context4, cVar3, m0Var2, p1Var7, 27), mVar6, 2097152, 54);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                u70.b bVar2 = (u70.b) obj8;
                a aVar11 = (a) obj3;
                x3 x3Var = (x3) obj7;
                l lVar = (l) obj6;
                p1 p1Var8 = (p1) obj5;
                p1 p1Var9 = (p1) obj4;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    f0 f0Var = f0.f110999a;
                    String strQ7 = y.Q(mVar7, bVar2.f169394d);
                    r rVarF4 = x2.f(r.S, 1.0f);
                    boolean zB2 = mVar7.B(bVar2) | mVar7.B(aVar11) | mVar7.B(x3Var) | mVar7.B(lVar);
                    Object objQ5 = mVar7.q();
                    if (zB2) {
                        ck0.j jVar = new ck0.j(bVar2, aVar11, x3Var, p1Var8, p1Var9, lVar, 15);
                        mVar7.K(jVar);
                        objQ5 = jVar;
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            ck0.j jVar2 = new ck0.j(bVar2, aVar11, x3Var, p1Var8, p1Var9, lVar, 15);
                            mVar7.K(jVar2);
                            objQ5 = jVar2;
                        }
                    }
                    f0Var.d(384, 1, (a) objQ5, rVarF4, strQ7, mVar7, null, this.f56976d);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ub1.f.d((String) obj6, (String) obj5, (String) obj4, (r) obj8, this.f56976d, (p) obj7, (a) obj3, (m) obj, p0.t(100663297));
                return Unit.INSTANCE;
            case 20:
                n82.f fVar3 = (n82.f) obj8;
                yd1.a aVar12 = (yd1.a) obj7;
                u82.d dVar2 = (u82.d) obj6;
                l lVar2 = (l) obj5;
                l lVar3 = (l) obj4;
                a aVar13 = (a) obj3;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r.a aVar14 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar14, 1.0f), vb.h.e(d92.b.f58623a, mVar8), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA4 = c2.y.a(kVar3, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode6 = Long.hashCode(mVar8.getU());
                    i2 i2VarX6 = mVar8.x();
                    r rVarC8 = h4.k.c(rVarE, mVar8);
                    g.V.getClass();
                    h5.e0.a aVar15 = g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar15);
                    } else {
                        mVar8.c();
                    }
                    b4.c(g.a.f81810g, zVarA4, mVar8);
                    b4.c(g.a.f81809f, i2VarX6, mVar8);
                    g.a.b bVar3 = g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode6))) {
                        h.z(iHashCode6, mVar8, iHashCode6, bVar3);
                    }
                    b4.c(g.a.f81807d, rVarC8, mVar8);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    q82.a.a(x2.f(aVar14, 1.0f), new n82.n(fVar3, aVar12), null, mVar8, 6, 4);
                    n82.c.a(b0Var3.a(aVar14, 1.0f, true), fVar3, 3, this.f56976d, z3.f.c(-1603532366, new c0((Object) dVar2, (Object) fVar3, lVar2, lVar3, aVar13, 28), mVar8), mVar8, 24960, 0);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 21:
                return a(obj, obj2);
            case 22:
                return b(obj, obj2);
            case 23:
                ((Integer) obj2).getClass();
                w12.c.a(this.f56976d, (com.garmin.android.apps.connectmobile.userprofile.presentation.d) obj8, (w12.d) obj7, (p) obj6, (l) obj5, (a) obj3, (l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                w70.e.e((n70.g) obj8, (r70.z) obj7, (w70.g) obj6, this.f56976d, (l) obj5, (a) obj3, (a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                return c(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                yg2.f0.c((yg2.h) obj8, (vf2.e) obj7, (vf2.e) obj6, this.f56976d, (List) obj5, (List) obj4, (lc.y) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Context context, a aVar, m4.q qVar, m3 m3Var, c.q qVar2, boolean z14, p1 p1Var) {
        this.f56973a = 9;
        this.f56974b = context;
        this.f56977e = aVar;
        this.f56978f = qVar;
        this.f56975c = m3Var;
        this.f56979g = qVar2;
        this.f56976d = z14;
        this.f56980h = p1Var;
    }

    public /* synthetic */ d(a aVar, boolean z14, p1 p1Var, b0 b0Var, x0 x0Var, l lVar, a aVar2) {
        this.f56973a = 22;
        this.f56977e = aVar;
        this.f56976d = z14;
        this.f56974b = p1Var;
        this.f56978f = b0Var;
        this.f56975c = x0Var;
        this.f56979g = lVar;
        this.f56980h = aVar2;
    }

    public /* synthetic */ d(r rVar, s.a aVar, String str, String str2, String str3, boolean z14, a aVar2, int i14) {
        this.f56973a = 0;
        this.f56974b = rVar;
        this.f56978f = aVar;
        this.f56975c = str;
        this.f56979g = str2;
        this.f56980h = str3;
        this.f56976d = z14;
        this.f56977e = aVar2;
    }

    public /* synthetic */ d(r rVar, nr.p0 p0Var, ds.n nVar, boolean z14, a aVar, a aVar2, a aVar3, int i14) {
        this.f56973a = 8;
        this.f56974b = rVar;
        this.f56978f = p0Var;
        this.f56975c = nVar;
        this.f56976d = z14;
        this.f56977e = aVar;
        this.f56979g = aVar2;
        this.f56980h = aVar3;
    }

    public /* synthetic */ d(r rVar, qg2.c cVar, a aVar, a aVar2, boolean z14, o2 o2Var, o2 o2Var2, int i14) {
        this.f56973a = 14;
        this.f56974b = rVar;
        this.f56978f = cVar;
        this.f56977e = aVar;
        this.f56975c = aVar2;
        this.f56976d = z14;
        this.f56979g = o2Var;
        this.f56980h = o2Var2;
    }

    public /* synthetic */ d(i53.c cVar, Set set, boolean z14, e eVar, l lVar, l lVar2, l lVar3, int i14) {
        this.f56973a = 4;
        this.f56974b = cVar;
        this.f56978f = set;
        this.f56976d = z14;
        this.f56975c = eVar;
        this.f56979g = lVar;
        this.f56980h = lVar2;
        this.f56977e = lVar3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, Object obj5, Object obj6, int i14, int i15) {
        this.f56973a = i15;
        this.f56974b = obj;
        this.f56978f = obj2;
        this.f56975c = obj3;
        this.f56976d = z14;
        this.f56979g = obj4;
        this.f56980h = obj5;
        this.f56977e = obj6;
    }

    public /* synthetic */ d(Object obj, String str, boolean z14, Object obj2, l lVar, a aVar, a aVar2, int i14, int i15) {
        this.f56973a = i15;
        this.f56974b = obj;
        this.f56975c = str;
        this.f56976d = z14;
        this.f56978f = obj2;
        this.f56979g = lVar;
        this.f56977e = aVar;
        this.f56980h = aVar2;
    }

    public /* synthetic */ d(String str, com.garmin.android.apps.connectmobile.activities.health.presentation.c cVar, Context context, boolean z14, r0 r0Var, lc.m0 m0Var, p1 p1Var) {
        this.f56973a = 17;
        this.f56975c = str;
        this.f56974b = cVar;
        this.f56978f = context;
        this.f56976d = z14;
        this.f56979g = r0Var;
        this.f56980h = m0Var;
        this.f56977e = p1Var;
    }

    public /* synthetic */ d(String str, String str2, r rVar, boolean z14, p pVar, p pVar2, a aVar, int i14) {
        this.f56973a = 16;
        this.f56975c = str;
        this.f56979g = str2;
        this.f56974b = rVar;
        this.f56976d = z14;
        this.f56978f = pVar;
        this.f56980h = pVar2;
        this.f56977e = aVar;
    }

    public /* synthetic */ d(String str, String str2, String str3, r rVar, boolean z14, p pVar, a aVar, int i14) {
        this.f56973a = 19;
        this.f56975c = str;
        this.f56979g = str2;
        this.f56980h = str3;
        this.f56974b = rVar;
        this.f56976d = z14;
        this.f56978f = pVar;
        this.f56977e = aVar;
    }

    public /* synthetic */ d(String str, String str2, String str3, List list, String str4, a aVar, boolean z14, int i14) {
        this.f56973a = 3;
        this.f56975c = str;
        this.f56979g = str2;
        this.f56980h = str3;
        this.f56974b = list;
        this.f56978f = str4;
        this.f56977e = aVar;
        this.f56976d = z14;
    }

    public /* synthetic */ d(String str, boolean z14, Context context, String str2, p1 p1Var, f4.s sVar, p1 p1Var2) {
        this.f56973a = 5;
        this.f56975c = str;
        this.f56976d = z14;
        this.f56974b = context;
        this.f56979g = str2;
        this.f56978f = p1Var;
        this.f56980h = sVar;
        this.f56977e = p1Var2;
    }

    public /* synthetic */ d(String str, boolean z14, i53.c cVar, i53.c cVar2, mc mcVar, a aVar, l lVar, int i14) {
        this.f56973a = 6;
        this.f56975c = str;
        this.f56976d = z14;
        this.f56974b = cVar;
        this.f56978f = cVar2;
        this.f56979g = mcVar;
        this.f56977e = aVar;
        this.f56980h = lVar;
    }

    public /* synthetic */ d(String str, boolean z14, String str2, l lVar, a aVar, a aVar2, a aVar3, int i14) {
        this.f56973a = 11;
        this.f56975c = str;
        this.f56976d = z14;
        this.f56979g = str2;
        this.f56974b = lVar;
        this.f56977e = aVar;
        this.f56978f = aVar2;
        this.f56980h = aVar3;
    }

    public /* synthetic */ d(String str, boolean z14, String str2, String str3, String str4, k kVar, Context context) {
        this.f56973a = 2;
        this.f56975c = str;
        this.f56976d = z14;
        this.f56979g = str2;
        this.f56980h = str3;
        this.f56974b = str4;
        this.f56978f = kVar;
        this.f56977e = context;
    }

    public /* synthetic */ d(List list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, String str, boolean z14, ComposeView composeView, m0 m0Var) {
        this.f56973a = 15;
        this.f56974b = list;
        this.f56978f = activityDetailChartDTO;
        this.f56979g = fVar;
        this.f56975c = str;
        this.f56976d = z14;
        this.f56980h = composeView;
        this.f56977e = m0Var;
    }

    public /* synthetic */ d(n70.g gVar, r70.z zVar, w70.g gVar2, boolean z14, l lVar, a aVar, a aVar2, int i14) {
        this.f56973a = 24;
        this.f56974b = gVar;
        this.f56978f = zVar;
        this.f56975c = gVar2;
        this.f56976d = z14;
        this.f56979g = lVar;
        this.f56977e = aVar;
        this.f56980h = aVar2;
    }

    public /* synthetic */ d(n82.f fVar, yd1.a aVar, boolean z14, u82.d dVar, l lVar, l lVar2, a aVar2) {
        this.f56973a = 20;
        this.f56974b = fVar;
        this.f56978f = aVar;
        this.f56976d = z14;
        this.f56975c = dVar;
        this.f56979g = lVar;
        this.f56980h = lVar2;
        this.f56977e = aVar2;
    }

    public /* synthetic */ d(p1 p1Var, a aVar, zc.d dVar, mi0.a aVar2, boolean z14, p1 p1Var2, p1 p1Var3) {
        this.f56973a = 7;
        this.f56974b = p1Var;
        this.f56977e = aVar;
        this.f56978f = dVar;
        this.f56975c = aVar2;
        this.f56976d = z14;
        this.f56979g = p1Var2;
        this.f56980h = p1Var3;
    }

    public /* synthetic */ d(u70.b bVar, boolean z14, a aVar, x3 x3Var, l lVar, p1 p1Var, p1 p1Var2) {
        this.f56973a = 18;
        this.f56974b = bVar;
        this.f56976d = z14;
        this.f56977e = aVar;
        this.f56978f = x3Var;
        this.f56975c = lVar;
        this.f56979g = p1Var;
        this.f56980h = p1Var2;
    }

    public /* synthetic */ d(boolean z14, com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar, w12.d dVar2, p pVar, l lVar, a aVar, l lVar2, int i14) {
        this.f56973a = 23;
        this.f56976d = z14;
        this.f56974b = dVar;
        this.f56978f = dVar2;
        this.f56975c = pVar;
        this.f56979g = lVar;
        this.f56977e = aVar;
        this.f56980h = lVar2;
    }

    public /* synthetic */ d(boolean z14, dy1.r rVar, a aVar, c cVar, p1 p1Var, p1 p1Var2, p1 p1Var3) {
        this.f56973a = 21;
        this.f56976d = z14;
        this.f56974b = rVar;
        this.f56977e = aVar;
        this.f56978f = cVar;
        this.f56975c = p1Var;
        this.f56979g = p1Var2;
        this.f56980h = p1Var3;
    }

    public /* synthetic */ d(boolean z14, i53.c cVar, mx1.d dVar, l lVar, a aVar, a aVar2, a aVar3, int i14) {
        this.f56973a = 25;
        this.f56976d = z14;
        this.f56974b = cVar;
        this.f56978f = dVar;
        this.f56975c = lVar;
        this.f56977e = aVar;
        this.f56979g = aVar2;
        this.f56980h = aVar3;
    }
}
