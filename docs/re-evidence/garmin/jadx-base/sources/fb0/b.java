package fb0;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.v4;
import c2.a0;
import c2.b0;
import c2.l2;
import c2.s2;
import c2.t;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import d91.s;
import da0.i;
import e2.i0;
import e23.q;
import f5.g0;
import f5.k2;
import f5.v1;
import f5.z0;
import g02.s0;
import g22.k;
import gg1.o0;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import hw1.j;
import i3.bf;
import i3.cf;
import i3.d6;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.u;
import i3.v5;
import ii0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.h4;
import kotlin.t1;
import lc.u0;
import li0.d0;
import ly0.o;
import o13.p;
import o4.m1;
import o4.w;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p006l2.b2;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p5.v;
import pt1.l;
import r1.q2;
import s5.w0;
import s5.x0;
import u1.a2;
import v.h;
import v62.h1;
import v62.ja;
import v62.k1;
import v62.l9;
import x5.c0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f70189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f70190e;

    public /* synthetic */ b(r rVar, l lVar, p1 p1Var, e23.a aVar) {
        this.f70186a = 8;
        this.f70188c = rVar;
        this.f70189d = lVar;
        this.f70190e = p1Var;
        this.f70187b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        m mVar;
        DateTime dateTime;
        c.q qVar;
        Unit unit;
        boolean zE0;
        boolean z14;
        c.q qVar2;
        int i14;
        boolean z15;
        int i15;
        int i16;
        String str = (String) this.f70187b;
        List list = (List) this.f70188c;
        com.garmin.android.apps.connectmobile.training.fbtap.workouts.a aVar = (com.garmin.android.apps.connectmobile.training.fbtap.workouts.a) this.f70189d;
        c.q qVar3 = (c.q) this.f70190e;
        e2.d dVar = (e2.d) obj;
        m mVar2 = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.C0878a c0878a = com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.f45566c;
        dVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(dVar) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, eVar.f97918c, 5);
            d92.b.f58624b.getClass();
            int i17 = 1;
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131068);
            iw1.a aVar2 = (iw1.a) h0.d0(list);
            if (aVar2 != null) {
                mVar = mVar2;
                dateTime = aVar2.f95330q;
            } else {
                mVar = mVar2;
                dateTime = null;
            }
            ArrayList arrayListG = tu1.a.g(list, dateTime);
            boolean z16 = arrayListG.size() > 1;
            List<iw1.a> listF = tu1.a.f(list, dateTime);
            boolean z17 = listF.size() > 1;
            int i18 = 0;
            int i19 = 0;
            int i24 = 0;
            for (Object obj4 : list) {
                int i25 = i18 + 1;
                if (i18 < 0) {
                    x.q();
                    throw null;
                }
                iw1.a aVar3 = (iw1.a) obj4;
                DateTime dateTime2 = aVar3.f95330q;
                boolean z18 = aVar3.f95335x;
                boolean z19 = (dateTime2 == null || k.k(dateTime2) != i17) ? 0 : i17;
                if (aVar3.f95321i) {
                    mVar.C(-1360347393);
                    String str2 = aVar3.f95325l;
                    if (str2 == null) {
                        str2 = "";
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    j.a(null, str2, d92.c.f(j92.f.f97933j, mVar), null, mVar, 0, 9);
                    mVar.f();
                } else if (aVar3.f95322j) {
                    mVar.C(-1359870799);
                    String strQ = y.Q(mVar, R.string.end_of_plan);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    j.a(null, strQ, d92.c.f(j92.f.f97933j, mVar), null, mVar, 0, 9);
                    mVar.f();
                } else {
                    if (aVar3.f95320h) {
                        mVar.C(-1359464637);
                        if (z18) {
                            i16 = R.string.scheduled_rest_day;
                        } else {
                            tw1.m mVar3 = aVar.u6().S0;
                            if (mVar3 != null ? mVar3.p0() : false) {
                                i16 = R.string.scheduled_rest_day;
                            } else {
                                i16 = R.string.lbl_rest_day;
                            }
                        }
                        j.a(null, y.Q(mVar, i16), null, null, mVar, 0, 13);
                        mVar.f();
                    } else if (aVar3.f95318f) {
                        mVar.C(-1358516037);
                        if (z18) {
                            mVar.C(-1358562072);
                            j.a(null, y.Q(mVar, R.string.workout_stay_tuned_for_details), null, null, mVar, 0, 13);
                            mVar.f();
                            i17 = i17;
                            qVar = qVar3;
                        } else if (aVar3.f95316d != null) {
                            mVar.C(-1358211245);
                            if (z17) {
                                mVar.C(-1357883017);
                                if (listF.contains(aVar3)) {
                                    mVar.C(-1357812523);
                                    if (i24 == 0) {
                                        mVar.C(-1357734341);
                                        z15 = false;
                                        gw1.k.a(listF, z19, i18 < list.size() - i17 ? i17 : 0, mVar, 0);
                                        mVar.f();
                                        i15 = i17;
                                    } else {
                                        z15 = false;
                                        mVar.C(-1357150053);
                                        mVar.f();
                                        i15 = i24;
                                    }
                                    mVar.f();
                                    i24 = i15;
                                } else {
                                    z15 = false;
                                    mVar.C(-1356943872);
                                    gw1.k.c(aVar3, z19, i18 < list.size() - i17 ? i17 : 0, mVar, 0);
                                    mVar.f();
                                }
                                mVar.f();
                            } else {
                                z15 = false;
                                mVar.C(-1356044779);
                                gw1.k.c(aVar3, z19, i18 < list.size() - i17 ? i17 : 0, mVar, 0);
                                mVar.f();
                            }
                            mVar.f();
                            i17 = i17;
                            qVar = qVar3;
                        } else {
                            mVar.C(-1355421462);
                            if (z16) {
                                mVar.C(-1355111462);
                                if (i19 == 0) {
                                    mVar.C(-1355039046);
                                    boolean z24 = z19;
                                    androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                                    mVarRequireActivity.getClass();
                                    tw1.m mVar4 = aVar.u6().S0;
                                    boolean zP0 = mVar4 != null ? mVar4.p0() : false;
                                    tw1.m mVar5 = aVar.u6().S0;
                                    m mVar6 = mVar;
                                    qVar2 = qVar3;
                                    gw1.k.b(arrayListG, z24, mVarRequireActivity, zP0, mVar5 != null ? mVar5.e0() : false, qVar2, mVar6, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                                    mVar = mVar6;
                                    mVar.f();
                                    i14 = i17;
                                } else {
                                    qVar2 = qVar3;
                                    mVar.C(-1354177029);
                                    mVar.f();
                                    i14 = i19;
                                }
                                mVar.f();
                                i19 = i14;
                                qVar = qVar2;
                            } else {
                                boolean z25 = z19;
                                c.q qVar4 = qVar3;
                                mVar.C(-1353776571);
                                boolean z26 = i18 < list.size() - i17 ? i17 : 0;
                                androidx.fragment.app.m mVarRequireActivity2 = aVar.requireActivity();
                                mVarRequireActivity2.getClass();
                                tw1.m mVar7 = aVar.u6().S0;
                                boolean zP1 = mVar7 != null ? mVar7.p0() : false;
                                tw1.m mVar8 = aVar.u6().S0;
                                if (mVar8 != null) {
                                    z14 = false;
                                    zE0 = mVar8.e0();
                                } else {
                                    zE0 = false;
                                    z14 = false;
                                }
                                gw1.k.d(aVar3, z25, z26, mVarRequireActivity2, zP1, zE0, qVar4, mVar, 2097152);
                                qVar = qVar4;
                                mVar = mVar;
                                mVar.f();
                            }
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        i17 = i17;
                        boolean z27 = z19;
                        qVar = qVar3;
                        int i26 = 0;
                        if (aVar3.f95332t) {
                            mVar.C(-1352559325);
                            fg0.k kVar = aVar3.E;
                            if (kVar == null) {
                                mVar.C(-1352548600);
                                mVar.f();
                                unit = null;
                            } else {
                                mVar.C(-1352548599);
                                z3.e eVarC = z3.f.c(-1739958790, new gw1.e(aVar, i26, kVar, y.Q(mVar, aVar3.f95319g ? R.string.supporting_event : R.string.primary_event)), mVar);
                                int i27 = i18;
                                m mVar9 = mVar;
                                hw1.b.a(null, z27, 0.0f, 0L, null, eVarC, mVar9, 196608);
                                mVar = mVar9;
                                if (i27 < list.size() - 1) {
                                    mVar.C(714745309);
                                    r.a aVar4 = r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    c2.l.f(x2.h(aVar4, j92.b.f97899b.f97918c), mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(714901952);
                                    mVar.f();
                                }
                                mVar.f();
                                unit = Unit.INSTANCE;
                            }
                            if (unit == null) {
                                mVar.C(-1349933873);
                                j.a(null, com.nimbusds.jose.shaded.gson.internal.a.h(y.Q(mVar, R.string.lbl_workout), " - ", y.Q(mVar, R.string.lbl_stay_tuned_for_details), "."), null, null, mVar, 0, 13);
                                mVar.f();
                            } else {
                                mVar.C(1064747711);
                                mVar.f();
                            }
                            mVar.f();
                        } else {
                            mVar.C(-1349535461);
                            mVar.f();
                        }
                    }
                    i18 = i25;
                    qVar3 = qVar;
                    i17 = i17;
                }
                i17 = i17;
                qVar = qVar3;
                i18 = i25;
                qVar3 = qVar;
                i17 = i17;
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        z3.e eVar;
        e23.r rVar = (e23.r) this.f70187b;
        s sVar = (s) this.f70188c;
        p1 p1Var = (p1) this.f70189d;
        p1 p1Var2 = (p1) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new bf(25);
                mVar.K(objQ);
            }
            r rVarC = v.c((e23.l) objQ, aVar, false);
            i91.a.f92320a.getClass();
            z3.e eVar2 = i91.a.f92321b;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new i31.e(14);
                mVar.K(objQ2);
            }
            u.b(eVar2, (e23.a) objQ2, rVarC, null, null, false, null, null, mVar, 196662, 472);
            m mVar2 = mVar;
            for (d91.f fVar : d91.f.f58530i) {
                Integer num = fVar.f58531a;
                if (!fVar.f58533c || num == null) {
                    mVar2.C(-1996705229);
                    mVar2.f();
                } else {
                    mVar2.C(-2000353185);
                    if (fVar == d91.f.f58527f) {
                        mVar2.C(-2000388277);
                        r.a aVar2 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        v5.a(0.0f, 0, 2, q2.f(mVar2), c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97918c, 1), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-2000073069);
                        mVar2.f();
                    }
                    u4.d dVar = fVar.f58532b;
                    int i14 = 5;
                    z3.e eVarC = null;
                    if (dVar == null) {
                        mVar2.C(-1998568888);
                        mVar2.f();
                        eVar = null;
                    } else {
                        mVar2.C(-1998568887);
                        z3.e eVarC2 = z3.f.c(1971866726, new b82.k(dVar, 5), mVar2);
                        mVar2.f();
                        eVar = eVarC2;
                    }
                    if (fVar == d91.f.f58525d || fVar == d91.f.f58526e) {
                        mVar2.C(-1997888716);
                        eVarC = z3.f.c(-1517100538, new i20.b(i14, sVar, fVar), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1996866057);
                        mVar2.f();
                    }
                    z3.e eVar3 = eVarC;
                    z3.e eVarC3 = z3.f.c(-158244294, new i20.b(6, num, fVar), mVar2);
                    boolean zK = mVar2.k(fVar.ordinal()) | mVar2.B(rVar) | mVar2.r(sVar);
                    Object objQ3 = mVar2.q();
                    if (zK || objQ3 == m.a.f135155b) {
                        v4 v4Var = new v4(fVar, rVar, sVar, p1Var, p1Var2, 11);
                        mVar2.K(v4Var);
                        objQ3 = v4Var;
                    }
                    m mVar3 = mVar2;
                    u.b(eVarC3, (e23.a) objQ3, null, eVar, eVar3, true, null, null, mVar3, 196614, 452);
                    mVar2 = mVar3;
                    mVar2.f();
                }
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        i53.c cVar = (i53.c) this.f70188c;
        Context context = (Context) this.f70190e;
        e23.l lVar = (e23.l) this.f70189d;
        e23.a aVar = (e23.a) this.f70187b;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarC = l4.k.c(x2.d(aVar2, 1.0f));
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC2 = h4.k.c(rVarC, mVar);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(g.a.f81810g, z0VarD, mVar);
            b4.c(g.a.f81809f, i2VarX, mVar);
            g.a.b bVar = g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC2, mVar);
            c2.u uVar = c2.u.f22885a;
            i.a(0.0f, mVar, 6);
            r rVarD = x2.d(aVar2, 1.0f);
            f2.b.C1415b c1415b = new f2.b.C1415b(3);
            boolean zB = mVar.B(cVar) | mVar.r(context) | mVar.B(lVar) | mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                ev2.f fVar = new ev2.f(cVar, context, lVar, aVar, 13);
                mVar.K(fVar);
                objQ = fVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    ev2.f fVar2 = new ev2.f(cVar, context, lVar, aVar, 13);
                    mVar.K(fVar2);
                    objQ = fVar2;
                }
            }
            f2.j.a(c1415b, rVarD, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 48, 0, 1020);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        mi0.f.c cVar = (mi0.f.c) this.f70187b;
        c.q qVar = (c.q) this.f70188c;
        gi0.a aVar = (gi0.a) this.f70189d;
        Context context = (Context) this.f70190e;
        e2.d dVar = (e2.d) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(dVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Integer num = cVar.f118785a;
            List<d0> list = cVar.f118786b;
            r rVarC = e2.d.c(dVar, r.S);
            boolean zR = mVar.r(qVar) | mVar.r(aVar) | mVar.r(context);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new d6(qVar, 13, aVar, context);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d6(qVar, 13, aVar, context);
                    mVar.K(objQ);
                }
            }
            ii0.x.c(num, list, rVarC, (e23.a) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0098  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2, Object obj3) {
        zc.d dVar = (zc.d) this.f70187b;
        i0 i0Var = (i0) this.f70188c;
        li0.f fVar = (li0.f) this.f70189d;
        p1 p1Var = (p1) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            if (((Boolean) p1Var.getF182175a()).booleanValue() || dVar.b() != 0) {
                mVar.C(-1563445600);
                r rVarD = x2.d(r.S, 1.0f);
                boolean zR = mVar.r(dVar) | mVar.r(fVar);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new z(dVar, fVar, 1);
                    mVar.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new z(dVar, fVar, 1);
                        mVar.K(objQ);
                    }
                }
                e2.c.b(rVarD, i0Var, null, null, null, null, false, null, (e23.l) objQ, mVar, 6, 508);
                mVar.f();
            } else {
                mVar.C(-1563729467);
                s62.a.f157643a.getClass();
                b82.n.c(l9.a(t62.b.f162798a), y.Q(mVar, R.string.msg_no_suggestions_title), y.Q(mVar, R.string.msg_no_suggestions_description), null, null, mVar, 0, 24);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005a  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        i0 i0Var = (i0) this.f70187b;
        k2 k2Var = (k2) this.f70188c;
        v1 v1Var = (v1) this.f70190e;
        e23.l lVar = (e23.l) this.f70189d;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            boolean zB = mVar.B(k2Var) | mVar.r(v1Var) | mVar.B(lVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new p003ji0.c(lVar, k2Var, v1Var, 0);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new p003ji0.c(lVar, k2Var, v1Var, 0);
                    mVar.K(objQ);
                }
            }
            e2.c.b(rVarD, i0Var, null, null, null, null, false, null, (e23.l) objQ, mVar, 6, 508);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2, Object obj3) {
        kl1.a aVar = (kl1.a) this.f70187b;
        jl1.g gVar = (jl1.g) this.f70188c;
        p1 p1Var = (p1) this.f70189d;
        n1 n1Var = (n1) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            i53.d<il1.a, List<zf2.d>> dVar = ((jl1.d) p1Var.getF182175a()).f99484g;
            int intValue = n1Var.getIntValue();
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new a11.h0(n1Var, 19);
                mVar.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = mVar.r(gVar);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new iz1.f(gVar, 9);
                mVar.K(objQ2);
            }
            il1.c.a(dVar, aVar, true, intValue, lVar, null, (e23.l) objQ2, mVar, 24960, 32);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        i53.c<sy0.f> cVar = (i53.c) this.f70187b;
        Context context = (Context) this.f70188c;
        sy0.f fVar = (sy0.f) this.f70190e;
        e23.l lVar = (e23.l) this.f70189d;
        int iIntValue = ((Integer) obj).intValue();
        m mVar = (m) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= mVar.k(iIntValue) ? 4 : 2;
        }
        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            ArrayList<sy0.f> arrayList = null;
            if (iIntValue == jy0.g.MY_COURSES.ordinal()) {
                mVar.C(-2001408744);
                r rVarB = a2.b(r.S, a2.a(mVar), true);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                r rVarC = h4.k.c(rVarB, mVar);
                g.V.getClass();
                e0.a aVar = g.a.f81805b;
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
                b4.c(g.a.f81810g, zVarA, mVar);
                b4.c(g.a.f81809f, i2VarX, mVar);
                g.a.b bVar = g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, mVar);
                b0 b0Var = b0.f22601a;
                if (cVar == null) {
                    mVar.C(367988428);
                    mVar.f();
                } else {
                    mVar.C(367988429);
                    for (sy0.f fVar2 : cVar) {
                        jy0.i.a(context, fVar2, p005kotlin.jvm.internal.s.g(fVar2.f161211a, fVar != null ? fVar.f161211a : null), lVar, mVar, 0);
                    }
                    mVar.f();
                }
                mVar.y();
                mVar.f();
            } else if (iIntValue == jy0.g.FAVORITES.ordinal()) {
                mVar.C(-2000811901);
                r rVarB2 = a2.b(r.S, a2.a(mVar), true);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar, 0);
                int iHashCode2 = Long.hashCode(mVar.getU());
                i2 i2VarX2 = mVar.x();
                r rVarC2 = h4.k.c(rVarB2, mVar);
                g.V.getClass();
                e0.a aVar2 = g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar2);
                } else {
                    mVar.c();
                }
                b4.c(g.a.f81810g, zVarA2, mVar);
                b4.c(g.a.f81809f, i2VarX2, mVar);
                g.a.b bVar2 = g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    h.z(iHashCode2, mVar, iHashCode2, bVar2);
                }
                b4.c(g.a.f81807d, rVarC2, mVar);
                b0 b0Var2 = b0.f22601a;
                if (cVar != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : cVar) {
                        if (((sy0.f) obj4).f161212b) {
                            arrayList.add(obj4);
                        }
                    }
                }
                if (arrayList == null) {
                    mVar.C(984582696);
                    mVar.f();
                } else {
                    mVar.C(984582697);
                    for (sy0.f fVar3 : arrayList) {
                        jy0.i.a(context, fVar3, p005kotlin.jvm.internal.s.g(fVar3, fVar), lVar, mVar, 0);
                    }
                    mVar.f();
                }
                mVar.y();
                mVar.f();
            } else {
                mVar.C(-2000256009);
                mVar.f();
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        mc mcVar = (mc) this.f70187b;
        o53.b0 b0Var = (o53.b0) this.f70188c;
        b11.i.b bVar = (b11.i.b) this.f70189d;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = n.f135158a;
        i11.m.a(mcVar, b0Var, bVar.f14312h.f14375d.f(bVar.f14308d), (v21.e) this.f70190e, (m) obj2, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    private final Object j(Object obj, Object obj2, Object obj3) {
        List<p> list = (List) this.f70187b;
        e23.l lVar = (e23.l) this.f70189d;
        p1 p1Var = (p1) this.f70188c;
        p1 p1Var2 = (p1) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        byte b14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            for (p pVar : list) {
                z3.e eVarC = z3.f.c(1488226433, new kj2.g(pVar, b14, b14), mVar);
                boolean zB = mVar.B(lVar) | mVar.B(pVar);
                Object objQ = mVar.q();
                if (zB) {
                    ho.d0 d0Var = new ho.d0(lVar, pVar, p1Var, p1Var2, 15);
                    mVar.K(d0Var);
                    objQ = d0Var;
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        ho.d0 d0Var2 = new ho.d0(lVar, pVar, p1Var, p1Var2, 15);
                        mVar.K(d0Var2);
                        objQ = d0Var2;
                    }
                }
                m mVar2 = mVar;
                u.b(eVarC, (e23.a) objQ, null, null, null, false, null, null, mVar2, 6, 508);
                b14 = b14;
                mVar = mVar2;
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:6:0x0044  */
    private final Object k(Object obj, Object obj2, Object obj3) {
        Object objF;
        w wVar = (w) this.f70187b;
        b2 b2Var = (b2) this.f70188c;
        l0 l0Var = (l0) this.f70189d;
        c0 c0Var = (c0) this.f70190e;
        r rVar = (r) obj;
        m mVar = (m) obj2;
        ((Integer) obj3).getClass();
        mVar.C(-84507373);
        x1 x1Var = n.f135158a;
        boolean zBooleanValue = ((Boolean) mVar.A(t1.f91506x)).booleanValue();
        boolean zH = mVar.h(zBooleanValue);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (zH) {
            objQ = new v2.e0(zBooleanValue);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new v2.e0(zBooleanValue);
                mVar.K(objQ);
            }
        }
        v2.e0 e0Var = (v2.e0) objQ;
        boolean z14 = ((wVar instanceof o4.t1) && ((o4.t1) wVar).f129007b == 16) ? false : true;
        if (((h4) mVar.A(t1.f91503u)).a() && b2Var.b() && w0.e(l0Var.f188879b) && z14) {
            mVar.C(-707487962);
            s5.c cVar = l0Var.f188878a;
            w0 w0VarA = w0.a(l0Var.f188879b);
            boolean zR = mVar.r(e0Var);
            Object objQ2 = mVar.q();
            if (zR) {
                objQ2 = new p006l2.q2(e0Var, null);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new p006l2.q2(e0Var, null);
                    mVar.K(objQ2);
                }
            }
            p3.l0.f(cVar, w0VarA, (e23.p) objQ2, mVar);
            boolean zR2 = mVar.r(e0Var) | mVar.r(c0Var) | mVar.B(l0Var) | mVar.r(b2Var) | mVar.B(wVar);
            Object objQ3 = mVar.q();
            if (zR2) {
                jv0.c cVar2 = new jv0.c(e0Var, c0Var, l0Var, b2Var, wVar, 2);
                mVar.K(cVar2);
                objQ3 = cVar2;
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    jv0.c cVar3 = new jv0.c(e0Var, c0Var, l0Var, b2Var, wVar, 2);
                    mVar.K(cVar3);
                    objQ3 = cVar3;
                }
            }
            objF = l4.k.f(rVar, (e23.l) objQ3);
            mVar.f();
        } else {
            mVar.C(-705473241);
            mVar.f();
            objF = r.S;
        }
        mVar.f();
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    private final Object l(Object obj, Object obj2, Object obj3) {
        z3.e eVar = (z3.e) this.f70187b;
        o53.b0 b0Var = (o53.b0) this.f70188c;
        cf cfVar = (cf) this.f70189d;
        p1 p1Var = (p1) this.f70190e;
        m mVar = (m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = n.f135158a;
        boolean zR = mVar.r(b0Var) | mVar.r(cfVar);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new l72.i2(b0Var, cfVar, p1Var, 0);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new l72.i2(b0Var, cfVar, p1Var, 0);
                mVar.K(objQ);
            }
        }
        eVar.invoke((e23.a) objQ, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    private final Object n(Object obj, Object obj2, Object obj3) {
        i0 i0Var = (i0) this.f70187b;
        zc.d dVar = (zc.d) this.f70188c;
        li0.f fVar = (li0.f) this.f70189d;
        yc.s sVar = (yc.s) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            boolean zR = mVar.r(dVar) | mVar.r(fVar) | mVar.r(sVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new k62.k(dVar, 24, sVar, fVar);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k62.k(dVar, 24, sVar, fVar);
                    mVar.K(objQ);
                }
            }
            e2.c.b(rVarD, i0Var, null, null, null, null, false, null, (e23.l) objQ, mVar, 6, 508);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object o(Object obj, Object obj2, Object obj3) {
        p1 p1Var = (p1) this.f70187b;
        e23.l lVar = (e23.l) this.f70189d;
        String str = (String) this.f70188c;
        p1 p1Var2 = (p1) this.f70190e;
        m mVar = (m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = n.f135158a;
        Boolean bool = (Boolean) p1Var.getF182175a();
        bool.getClass();
        h4.d.f81522a.getClass();
        h4.g gVar = h4.d.a.f81528f;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new li0.x(11);
            mVar.K(objQ);
        }
        r1.b.a(bool, null, (e23.l) objQ, gVar, "", null, z3.f.c(-1232542746, new i91.e(lVar, str, p1Var2), mVar), mVar, 1600896, 34);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    /* JADX WARN: Code duplicated, block: B:44:0x020c  */
    /* JADX WARN: Code duplicated, block: B:49:0x025b  */
    /* JADX WARN: Code duplicated, block: B:54:0x027d  */
    private final Object q(Object obj, Object obj2, Object obj3) {
        String strH;
        o oVar = (o) this.f70187b;
        fy0.e eVar = (fy0.e) this.f70188c;
        o53.b0 b0Var = (o53.b0) this.f70189d;
        x3 x3Var = (x3) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            boolean zR = mVar.r(oVar);
            Object objQ = mVar.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new ly0.d(oVar, 2);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ly0.d(oVar, 2);
                    mVar.K(objQ);
                }
            }
            r rVarF = g0.f(aVar, (e23.l) objQ);
            float f14 = (float) (((double) ((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a)).screenHeightDp) * 0.4d);
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarJ = x2.j(rVarF, 0.0f, f14, 1);
            long jA = tn.k.a(d92.b.f58623a, mVar);
            m1.a aVar4 = m1.f128891a;
            r rVarE = u1.n.e(rVarJ, jA, aVar4);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarE, mVar);
            g.V.getClass();
            e0.a aVar5 = g.a.f81805b;
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
            g.a.e eVar3 = g.a.f81810g;
            b4.c(eVar3, zVarA, mVar);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            g.a.b bVar = g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                h.z(iHashCode, mVar, iHashCode, bVar);
            }
            g.a.f fVar = g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            b0 b0Var2 = b0.f22601a;
            r rVarY = c2.l.y(u1.n.e(aVar, d92.b.a(mVar).c().e(), aVar4), eVar2.f97920e);
            s2 s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC2 = h4.k.c(rVarY, mVar);
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
            b4.c(eVar3, s2VarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            u2 u2Var = u2.f22900a;
            if (((i53.c) x3Var.getF182175a()).size() > 1) {
                mVar.C(1753398605);
                strH = y.P(R.string.lbl_common_number_of_activities, new Object[]{Integer.valueOf(((i53.c) x3Var.getF182175a()).size())}, mVar);
                mVar.f();
            } else {
                strH = sn.a.h(mVar, 1753555279, R.string.device_screen_activity, mVar);
            }
            String str = strH;
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar, 0, 0, 131070);
            c2.l.f(u2Var.a(aVar, 0.1f, true), mVar);
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.n1.a(t62.b.f162798a);
            boolean zR2 = mVar.r(oVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new ly0.e(oVar, 0);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ly0.e(oVar, 0);
                    mVar.K(objQ2);
                }
            }
            i7.b(dVarA, null, u1.w.d(aVar, false, null, null, (e23.a) objQ2, 15), u0.f(mVar), mVar, 48, 0);
            mVar.y();
            i53.c cVar = (i53.c) x3Var.getF182175a();
            r rVarE2 = u1.n.e(aVar, d92.b.a(mVar).c().b(), aVar4);
            boolean zR3 = mVar.r(oVar);
            Object objQ3 = mVar.q();
            if (zR3) {
                objQ3 = new ly0.d(oVar, 3);
                mVar.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new ly0.d(oVar, 3);
                    mVar.K(objQ3);
                }
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR4 = mVar.r(b0Var) | mVar.r(oVar);
            Object objQ4 = mVar.q();
            if (zR4) {
                objQ4 = new l30.i0(19, b0Var, oVar);
                mVar.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new l30.i0(19, b0Var, oVar);
                    mVar.K(objQ4);
                }
            }
            ly0.g.b(eVar, cVar, rVarE2, lVar, (e23.a) objQ4, mVar, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        n30.f fVar = (n30.f) this.f70187b;
        e23.l lVar = (e23.l) this.f70189d;
        n1 n1Var = (n1) this.f70188c;
        n1 n1Var2 = (n1) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            w20.a aVar = fVar.f123456d;
            if (aVar != null) {
                mVar.C(-1762905165);
                r.a aVar2 = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                r rVarC = h4.k.c(aVar2, mVar);
                g.V.getClass();
                e0.a aVar3 = g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(g.a.f81810g, zVarA, mVar);
                b4.c(g.a.f81809f, i2VarX, mVar);
                g.a.b bVar = g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, mVar);
                b0 b0Var = b0.f22601a;
                com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
                eVar.getClass();
                n50.e eVar2 = new n50.e(Double.valueOf(eVar.q()), Double.valueOf(eVar.r()), Double.valueOf(eVar.s()));
                Object objQ = mVar.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new a11.h0(n1Var, 23);
                    mVar.K(objQ);
                }
                ge1.b.b(eVar2, (e23.l) objQ, mVar, 48);
                n30.b bVar2 = new n30.b(fVar.f123465m, fVar.f123464l);
                n50.g gVarN = jg.b.n(aVar, fVar.f123461i);
                n50.d dVarM = jg.b.m(aVar, fVar.f123463k);
                Object objQ2 = mVar.q();
                if (objQ2 == c2565a) {
                    objQ2 = new a11.h0(n1Var2, 24);
                    mVar.K(objQ2);
                }
                m30.d.a(bVar2, gVarN, dVarM, lVar, (e23.l) objQ2, mVar, 24576);
                mVar.y();
                mVar.f();
            } else {
                mVar.C(-1762015279);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        n30.l lVar = (n30.l) this.f70187b;
        e23.l lVar2 = (e23.l) this.f70189d;
        n1 n1Var = (n1) this.f70188c;
        n1 n1Var2 = (n1) this.f70190e;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(aVar, mVar);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            Double d14 = null;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(g.a.f81810g, zVarA, mVar);
            b4.c(g.a.f81809f, i2VarX, mVar);
            g.a.b bVar = g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            n30.k kVar2 = (n30.k) h0.n0(lVar.f123528d);
            n30.e eVar = kVar2 != null ? kVar2.f123524c : null;
            if (eVar != null) {
                Double dValueOf = Double.valueOf(eVar.f123450e);
                List<w20.a> listB = lVar.b();
                if (listB != null && !listB.isEmpty()) {
                    d14 = dValueOf;
                }
            }
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new a11.h0(n1Var, 25);
                mVar.K(objQ);
            }
            m30.q.a(d14, (e23.l) objQ, mVar, 48);
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new a11.h0(n1Var2, 26);
                mVar.K(objQ2);
            }
            m30.p.a(lVar, lVar2, (e23.l) objQ2, mVar, 384);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    private final Object u(Object obj, Object obj2, Object obj3) {
        x72.e eVar = (x72.e) this.f70188c;
        o53.b0 b0Var = (o53.b0) this.f70190e;
        e23.l lVar = (e23.l) this.f70189d;
        e23.a aVar = (e23.a) this.f70187b;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = PreviewCatalogActivity.f49781a;
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            boolean zR = mVar.r(b0Var) | mVar.B(lVar) | mVar.B(aVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new ls0.h(b0Var, 5, aVar, lVar);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ls0.h(b0Var, 5, aVar, lVar);
                    mVar.K(objQ);
                }
            }
            x72.n.e(eVar, (e23.l) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:167:0x0532  */
    /* JADX WARN: Code duplicated, block: B:254:0x0819  */
    /* JADX WARN: Code duplicated, block: B:329:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:354:0x0c60  */
    /* JADX WARN: Code duplicated, block: B:366:0x0d08  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i53.f<gb0.b> fVarA;
        long jC;
        long jC2;
        long jC3;
        long jC4;
        t2 t2Var;
        m mVar;
        u4.d dVarA;
        int i14 = this.f70186a;
        m.a aVar = m.f135153a;
        int i15 = 16;
        Object obj4 = this.f70190e;
        Object obj5 = this.f70189d;
        Object obj6 = this.f70188c;
        Object obj7 = this.f70187b;
        switch (i14) {
            case 0:
                e23.a aVar2 = (e23.a) obj7;
                o0 o0Var = (o0) obj6;
                e23.l lVar = (e23.l) obj5;
                gb0.a aVar3 = (gb0.a) obj4;
                a0 a0Var = (a0) obj;
                m mVar2 = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(a0Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(x2.h(aVar4, eVar.f97923h), mVar2);
                    boolean zB = mVar2.B(aVar2);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new eu.a(aVar2, 11);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new eu.a(aVar2, 11);
                            mVar2.K(objQ);
                        }
                    }
                    r rVarY = c2.l.y(u1.n.e(u1.w.d(aVar4, false, null, null, (e23.a) objQ, 15), com.nimbusds.jose.shaded.gson.internal.a.c(mVar2), k2.i.a(j92.b.f97900c.f97912d)), eVar.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(rVarY, mVar2);
                    g.V.getClass();
                    e0.a aVar5 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, s2VarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    mVar2.C(-1339036265);
                    aVar3.getClass();
                    if (aVar3 instanceof gb0.a.b) {
                        fVarA = i53.a.a(new gb0.b((int) ((gb0.a.b) aVar3).f76637b, R.string.lbl_cm, R.string.lbl_centimeters));
                    } else {
                        if (!(aVar3 instanceof gb0.a.c)) {
                            u0.r();
                            return null;
                        }
                        gb0.a.c cVar = (gb0.a.c) aVar3;
                        fVarA = i53.a.a(new gb0.b(cVar.f76639b, R.string.lbl_foot, R.string.common_feet_string), new gb0.b(cVar.f76640c, R.string.lbl_inch, R.string.lbl_inches));
                    }
                    for (gb0.b bVar2 : fVarA) {
                        r.a aVar6 = r.S;
                        u2Var.getClass();
                        f5.p pVar = f5.b.f68892a;
                        r rVarD = u2Var.d(aVar6, pVar);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        r rVarC2 = c2.l.C(rVarD, 0.0f, 0.0f, eVar2.f97917b, 0.0f, 11);
                        String strValueOf = String.valueOf(bVar2.f76642a);
                        d92.b.f58624b.getClass();
                        mh.c(strValueOf, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97926c, mVar2), mVar2, 0, 0, 131068);
                        Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                        r rVarC3 = c2.l.C(u2Var.d(aVar6, pVar), 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11);
                        boolean zR = mVar2.r(context) | mVar2.B(bVar2);
                        Object objQ2 = mVar2.q();
                        if (zR) {
                            objQ2 = new e52.b(i15, context, bVar2);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new e52.b(i15, context, bVar2);
                                mVar2.K(objQ2);
                            }
                        }
                        mh.c(y.Q(mVar2, bVar2.f76643b), v.c((e23.l) objQ2, rVarC3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131068);
                    }
                    mVar2.f();
                    mVar2.y();
                    r.a aVar7 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY2 = c2.l.y(aVar7, j92.b.f97899b.f97918c);
                    w13.c cVar2 = o0.f77290i;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj8 : cVar2) {
                        if (((o0) obj8) != o0.STATUTE_UK) {
                            arrayList.add(obj8);
                        }
                    }
                    c2.j.f22691a.getClass();
                    c2.j.c cVar3 = c2.j.f22696f;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97933j;
                    x0 x0VarB = d92.c.b(x0Var, mVar2);
                    e11.a aVar8 = new e11.a(16);
                    boolean zB2 = mVar2.B(lVar);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new ci0.f(lVar, 29);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new ci0.f(lVar, 29);
                            mVar2.K(objQ3);
                        }
                    }
                    da0.t.a(rVarY2, cVar3, 0, o0Var, arrayList, x0VarB, aVar8, (e23.l) objQ3, mVar2, 48);
                    r.a aVar9 = r.S;
                    c2.l.f(a0Var.a(aVar9, 1.0f, true), mVar2);
                    mh.c(y.Q(mVar2, R.string.msg_profile_information_privacy), x2.f(aVar9, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 48, 0, 131068);
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j jVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j) obj7;
                List list = (List) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                t2 t2Var2 = (t2) obj;
                m mVar3 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.b bVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.f40667v;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    int i16 = iIntValue2 & 14;
                    jVar.u6(t2Var2, (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.a) h0.e0(0, list), str, str2, mVar3, i16);
                    jVar.u6(t2Var2, (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.a) h0.e0(1, list), str, str2, mVar3, i16);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                g3 g3Var = (g3) obj6;
                e23.l lVar2 = (e23.l) obj5;
                e23.a aVar10 = (e23.a) obj7;
                p1 p1Var = (p1) obj4;
                m mVar4 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    fw.p pVar2 = g3Var != null ? g3Var.f35300a : null;
                    int i17 = pVar2 == null ? -1 : fs.j.f.f73412a[pVar2.ordinal()];
                    if (i17 == -1) {
                        mVar4.C(-1395336177);
                        r.a aVar11 = r.S;
                        r rVarD2 = x2.d(aVar11, 1.0f);
                        if (u1.n.h(mVar4)) {
                            mVar4.C(-599194608);
                            d92.b.f58623a.getClass();
                            jC = d92.b.a(mVar4).c().c();
                            mVar4.f();
                        } else {
                            mVar4.C(-599193710);
                            mVar4.f();
                            gl.c.f77766a.getClass();
                            jC = gl.c.f77767b.f77783h;
                        }
                        r rVarE = u1.n.e(rVarD2, jC, m1.f128891a);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode2 = Long.hashCode(mVar4.getU());
                        i2 i2VarX2 = mVar4.x();
                        r rVarC4 = h4.k.c(rVarE, mVar4);
                        g.V.getClass();
                        e0.a aVar12 = g.a.f81805b;
                        if (mVar4.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar12);
                        } else {
                            mVar4.c();
                        }
                        b4.c(g.a.f81810g, z0VarD, mVar4);
                        b4.c(g.a.f81809f, i2VarX2, mVar4);
                        g.a.b bVar4 = g.a.f81813j;
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                            h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                        }
                        b4.c(g.a.f81807d, rVarC4, mVar4);
                        c2.u uVar = c2.u.f22885a;
                        l72.s sVar = l72.s.f111232a;
                        l72.s.b bVar5 = l72.s.b.ALERT;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC5 = uVar.c(c2.l.A(aVar11, j92.b.f97899b.f97918c, 0.0f, 2), h4.d.a.f81531i);
                        s62.a.f157643a.getClass();
                        sVar.d(rVarC5, bVar5, ja.a(t62.b.f162798a), y.Q(mVar4, R.string.txt_something_went_wrong_try_again), null, null, null, null, mVar4, 48, 496);
                        mVar4.y();
                        mVar4.f();
                        Unit unit = Unit.INSTANCE;
                    } else if (i17 == 1) {
                        mVar4.C(-1397783844);
                        r rVarD3 = x2.d(r.S, 1.0f);
                        if (u1.n.h(mVar4)) {
                            mVar4.C(-599273200);
                            d92.b.f58623a.getClass();
                            jC2 = d92.b.a(mVar4).c().c();
                            mVar4.f();
                        } else {
                            mVar4.C(-599272302);
                            mVar4.f();
                            gl.c.f77766a.getClass();
                            jC2 = gl.c.f77767b.f77783h;
                        }
                        r rVarE2 = u1.n.e(rVarD3, jC2, m1.f128891a);
                        h4.d.f81522a.getClass();
                        z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode3 = Long.hashCode(mVar4.getU());
                        i2 i2VarX3 = mVar4.x();
                        r rVarC6 = h4.k.c(rVarE2, mVar4);
                        g.V.getClass();
                        e0.a aVar13 = g.a.f81805b;
                        if (mVar4.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar13);
                        } else {
                            mVar4.c();
                        }
                        b4.c(g.a.f81810g, z0VarD2, mVar4);
                        b4.c(g.a.f81809f, i2VarX3, mVar4);
                        g.a.b bVar6 = g.a.f81813j;
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                            h.z(iHashCode3, mVar4, iHashCode3, bVar6);
                        }
                        b4.c(g.a.f81807d, rVarC6, mVar4);
                        c2.u uVar2 = c2.u.f22885a;
                        boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                        fs.a.f73352a.getClass();
                        s0.a(null, zBooleanValue, fs.a.f73353b, mVar4, 384, 1);
                        mVar4.y();
                        mVar4.f();
                        Unit unit2 = Unit.INSTANCE;
                    } else if (i17 == 2) {
                        mVar4.C(-1397378581);
                        p1Var.setValue(Boolean.FALSE);
                        List list2 = (List) g3Var.f35301b;
                        if (list2 == null) {
                            list2 = j0.f134944a;
                        }
                        r rVarD4 = x2.d(r.S, 1.0f);
                        if (u1.n.h(mVar4)) {
                            mVar4.C(-599257680);
                            d92.b.f58623a.getClass();
                            jC3 = d92.b.a(mVar4).c().c();
                            mVar4.f();
                        } else {
                            mVar4.C(-599256782);
                            mVar4.f();
                            gl.c.f77766a.getClass();
                            jC3 = gl.c.f77767b.f77783h;
                        }
                        r rVarE3 = u1.n.e(rVarD4, jC3, m1.f128891a);
                        g6.f.a aVar14 = g6.f.f75994b;
                        l2 l2VarA = c2.l.a(16);
                        boolean zR2 = mVar4.r(list2) | mVar4.B(lVar2) | mVar4.B(aVar10);
                        Object objQ4 = mVar4.q();
                        if (zR2) {
                            objQ4 = new fs.i(list2, lVar2, aVar10, 0);
                            mVar4.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new fs.i(list2, lVar2, aVar10, 0);
                                mVar4.K(objQ4);
                            }
                        }
                        e2.c.b(rVarE3, null, l2VarA, null, null, null, false, null, (e23.l) objQ4, mVar4, 384, 506);
                        mVar4.f();
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        if (i17 != 3) {
                            throw n23.j.m(mVar4, -599278035);
                        }
                        mVar4.C(-1396055625);
                        r.a aVar15 = r.S;
                        r rVarD5 = x2.d(aVar15, 1.0f);
                        if (u1.n.h(mVar4)) {
                            mVar4.C(-599217808);
                            d92.b.f58623a.getClass();
                            jC4 = d92.b.a(mVar4).c().c();
                            mVar4.f();
                        } else {
                            mVar4.C(-599216910);
                            mVar4.f();
                            gl.c.f77766a.getClass();
                            jC4 = gl.c.f77767b.f77783h;
                        }
                        r rVarE4 = u1.n.e(rVarD5, jC4, m1.f128891a);
                        h4.d.f81522a.getClass();
                        z0 z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode4 = Long.hashCode(mVar4.getU());
                        i2 i2VarX4 = mVar4.x();
                        r rVarC7 = h4.k.c(rVarE4, mVar4);
                        g.V.getClass();
                        e0.a aVar16 = g.a.f81805b;
                        if (mVar4.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar16);
                        } else {
                            mVar4.c();
                        }
                        b4.c(g.a.f81810g, z0VarD3, mVar4);
                        b4.c(g.a.f81809f, i2VarX4, mVar4);
                        g.a.b bVar7 = g.a.f81813j;
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                            h.z(iHashCode4, mVar4, iHashCode4, bVar7);
                        }
                        b4.c(g.a.f81807d, rVarC7, mVar4);
                        c2.u uVar3 = c2.u.f22885a;
                        l72.s sVar2 = l72.s.f111232a;
                        l72.s.b bVar8 = l72.s.b.ALERT;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC8 = uVar3.c(c2.l.A(aVar15, j92.b.f97899b.f97918c, 0.0f, 2), h4.d.a.f81531i);
                        s62.a.f157643a.getClass();
                        sVar2.d(rVarC8, bVar8, ja.a(t62.b.f162798a), y.Q(mVar4, R.string.txt_no_internet_connection), null, null, null, null, mVar4, 48, 496);
                        mVar4.y();
                        mVar4.f();
                        Unit unit4 = Unit.INSTANCE;
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                p pVar3 = (p) obj7;
                String str3 = (String) obj6;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f) obj5;
                String str4 = (String) obj4;
                t2 t2Var3 = (t2) obj;
                m mVar5 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.f46045f;
                t2Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.B(t2Var3) ? 4 : 2;
                }
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    String str5 = (String) pVar3.f128594a;
                    if (str5 == null) {
                        mVar5.C(-1474206133);
                        mVar5.f();
                        t2Var = t2Var3;
                        mVar = mVar5;
                    } else {
                        mVar5.C(-1474206132);
                        l72.x0.f111346a.a((iIntValue4 & 14) | (l72.x0.f111348c << 24), 116, null, t2Var3, null, null, str5, fVar.getString(R.string.overall_distance), (String) pVar3.f128595b, null, mVar5);
                        t2Var = t2Var3;
                        mVar = mVar5;
                        mVar.f();
                    }
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    b92.a aVarA = wz1.a.a(str3);
                    String string = fVar.getString(R.string.overall_goal_time);
                    int i18 = b92.a.f16960b;
                    x0Var2.a((iIntValue4 & 14) | (l72.x0.f111348c << 24), 60, aVarA, t2Var, null, null, str4, string, null, null, mVar);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 4:
                Integer num = (Integer) obj7;
                String str6 = (String) obj6;
                Integer num2 = (Integer) obj5;
                p1 p1Var2 = (p1) obj4;
                m mVar6 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar9 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    c2.j.d dVar = c2.j.f22693c;
                    r.a aVar18 = r.S;
                    r rVarF = x2.f(aVar18, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    r rVarC9 = c2.l.C(rVarF, 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11);
                    s2 s2VarA2 = c2.q2.a(dVar, bVar9, mVar6, 54);
                    int iHashCode5 = Long.hashCode(mVar6.getU());
                    i2 i2VarX5 = mVar6.x();
                    r rVarC10 = h4.k.c(rVarC9, mVar6);
                    g.V.getClass();
                    e0.a aVar19 = g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar19);
                    } else {
                        mVar6.c();
                    }
                    b4.c(g.a.f81810g, s2VarA2, mVar6);
                    b4.c(g.a.f81809f, i2VarX5, mVar6);
                    g.a.b bVar10 = g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode5))) {
                        h.z(iHashCode5, mVar6, iHashCode5, bVar10);
                    }
                    b4.c(g.a.f81807d, rVarC10, mVar6);
                    c2.l.f(u2.f22900a.a(aVar18, 1.0f, true), mVar6);
                    d52.e eVar4 = (d52.e) p1Var2.getF182175a();
                    int iIntValue6 = num != null ? num.intValue() : 0;
                    eVar4.getClass();
                    String strB = d52.e.b(iIntValue6);
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar6);
                    r rVarC11 = c2.l.C(aVar18, 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11);
                    boolean zB3 = mVar6.B(str6);
                    Object objQ5 = mVar6.q();
                    if (zB3) {
                        objQ5 = new b82.b0(2, str6, p1Var2);
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new b82.b0(2, str6, p1Var2);
                            mVar6.K(objQ5);
                        }
                    }
                    mh.c(strB, v.c((e23.l) objQ5, rVarC11, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar6, 0, 0, 131068);
                    float f14 = 36;
                    g6.f.a aVar20 = g6.f.f75994b;
                    c02.h.e(x2.r(aVar18, f14, f14), num != null ? Double.valueOf(num.intValue()) : null, num2 != null ? Double.valueOf(num2.intValue()) : null, mVar6, 3078);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 5:
                List<us1.k> list3 = (List) obj7;
                e23.l lVar3 = (e23.l) obj5;
                p1 p1Var3 = (p1) obj6;
                us1.k kVar = (us1.k) obj4;
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    for (us1.k kVar2 : list3) {
                        z3.e eVarC = z3.f.c(1847942925, new fp0.l(kVar2, 7), mVar7);
                        boolean zB4 = mVar7.B(lVar3) | mVar7.k(kVar2.ordinal());
                        Object objQ6 = mVar7.q();
                        if (zB4) {
                            objQ6 = new fk0.a(lVar3, 14, kVar2, p1Var3);
                            mVar7.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == m.a.f135155b) {
                                objQ6 = new fk0.a(lVar3, 14, kVar2, p1Var3);
                                mVar7.K(objQ6);
                            }
                        }
                        u.b(eVarC, (e23.a) objQ6, null, z3.f.c(1669192144, new g80.e(4, kVar, kVar2), mVar7), null, false, null, null, mVar7, 3078, 500);
                    }
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 6:
                return a(obj, obj2, obj3);
            case 7:
                a0 a0Var2 = (a0) obj7;
                String str7 = (String) obj6;
                String str8 = (String) obj5;
                p1 p1Var4 = (p1) obj4;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    r.a aVar21 = r.S;
                    r rVarA = a0Var2.a(aVar21, 1.0f, true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar3, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode6 = Long.hashCode(mVar8.getU());
                    i2 i2VarX6 = mVar8.x();
                    r rVarC12 = h4.k.c(rVarA, mVar8);
                    g.V.getClass();
                    e0.a aVar22 = g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar22);
                    } else {
                        mVar8.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar8);
                    b4.c(g.a.f81809f, i2VarX6, mVar8);
                    g.a.b bVar11 = g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode6))) {
                        h.z(iHashCode6, mVar8, iHashCode6, bVar11);
                    }
                    b4.c(g.a.f81807d, rVarC12, mVar8);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar8), mVar8, 0, 0, 131070);
                    if (((Boolean) p1Var4.getF182175a()).booleanValue() || str8 == null || !(!d53.w.J(str8))) {
                        mVar8.C(1295205466);
                        mVar8.f();
                    } else {
                        mVar8.C(1294917321);
                        x0 x0VarF = d92.c.f(j92.f.f97933j, mVar8);
                        d6.p.f57793b.getClass();
                        mh.c(str8, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0VarF, mVar8, 0, 24960, 110590);
                        mVar8.f();
                    }
                    mVar8.y();
                    if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        s62.a.f157643a.getClass();
                        dVarA = k1.a(t62.b.f162798a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA = h1.a(t62.b.f162798a);
                    }
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, "", x2.q(c2.l.C(aVar21, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97904c), sn.a.b(mVar8), mVar8, 48, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                r rVar = (r) obj6;
                l lVar4 = (l) obj5;
                p1 p1Var5 = (p1) obj4;
                e23.a aVar23 = (e23.a) obj7;
                m mVar9 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    ht1.w.e(rVar, lVar4.f140888o, p1Var5, aVar23, mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                r rVar2 = (r) obj7;
                String str9 = (String) obj6;
                String str10 = (String) obj5;
                p1 p1Var6 = (p1) obj4;
                m mVar10 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var11 = n.f135158a;
                    ht1.w.i(rVar2, str9, str10, p1Var6, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                return b(obj, obj2, obj3);
            case 11:
                return c(obj, obj2, obj3);
            case 12:
                return d(obj, obj2, obj3);
            case 13:
                return e(obj, obj2, obj3);
            case 14:
                return f(obj, obj2, obj3);
            case 15:
                return g(obj, obj2, obj3);
            case 16:
                return h(obj, obj2, obj3);
            case 17:
                b11.i.a aVar24 = (b11.i.a) obj5;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var12 = n.f135158a;
                i11.m.a((mc) obj7, (o53.b0) obj6, aVar24.f14302h.f14375d.f(aVar24.f14298d), (v21.e) obj4, (m) obj2, 0);
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var13 = n.f135158a;
                i11.m.a((mc) obj7, (o53.b0) obj6, (b11.f) obj5, (v21.e) obj4, (m) obj2, 0);
                return Unit.INSTANCE;
            case 19:
                return i(obj, obj2, obj3);
            case 20:
                return j(obj, obj2, obj3);
            case 21:
                return k(obj, obj2, obj3);
            case 22:
                return l(obj, obj2, obj3);
            case 23:
                return n(obj, obj2, obj3);
            case 24:
                return o(obj, obj2, obj3);
            case 25:
                return q(obj, obj2, obj3);
            case 26:
                return r(obj, obj2, obj3);
            case 27:
                return s(obj, obj2, obj3);
            case 28:
                return u(obj, obj2, obj3);
            default:
                r rVar3 = (r) obj7;
                e23.p pVar4 = (e23.p) obj6;
                z3.e eVar5 = (z3.e) obj5;
                r rVar4 = (r) obj4;
                m mVar11 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var14 = n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar4, h4.d.a.f81536n, mVar11, 0);
                    int iHashCode7 = Long.hashCode(mVar11.getU());
                    i2 i2VarX7 = mVar11.x();
                    r rVarC13 = h4.k.c(rVar3, mVar11);
                    g.V.getClass();
                    e0.a aVar25 = g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar25);
                    } else {
                        mVar11.c();
                    }
                    b4.c(g.a.f81810g, zVarA2, mVar11);
                    b4.c(g.a.f81809f, i2VarX7, mVar11);
                    g.a.b bVar12 = g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode7))) {
                        h.z(iHashCode7, mVar11, iHashCode7, bVar12);
                    }
                    b4.c(g.a.f81807d, rVarC13, mVar11);
                    b0 b0Var2 = b0.f22601a;
                    if (pVar4 == null) {
                        mVar11.C(-2100495088);
                    } else {
                        mVar11.C(-1037589231);
                        pVar4.invoke(mVar11, 0);
                    }
                    mVar11.f();
                    eVar5.invoke(rVar4, mVar11, 48);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(g3 g3Var, e23.l lVar, e23.a aVar, p1 p1Var) {
        this.f70186a = 2;
        this.f70188c = g3Var;
        this.f70189d = lVar;
        this.f70187b = aVar;
        this.f70190e = p1Var;
    }

    public /* synthetic */ b(Object obj, e23.l lVar, Object obj2, Object obj3, int i14) {
        this.f70186a = i14;
        this.f70187b = obj;
        this.f70189d = lVar;
        this.f70188c = obj2;
        this.f70190e = obj3;
    }

    public /* synthetic */ b(Object obj, Object obj2, e23.l lVar, e23.a aVar, int i14) {
        this.f70186a = i14;
        this.f70188c = obj;
        this.f70190e = obj2;
        this.f70189d = lVar;
        this.f70187b = aVar;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, e23.l lVar, int i14) {
        this.f70186a = i14;
        this.f70187b = obj;
        this.f70188c = obj2;
        this.f70190e = obj3;
        this.f70189d = lVar;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f70186a = i14;
        this.f70187b = obj;
        this.f70188c = obj2;
        this.f70189d = obj3;
        this.f70190e = obj4;
    }
}
