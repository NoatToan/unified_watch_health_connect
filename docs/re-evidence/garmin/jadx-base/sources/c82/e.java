package c82;

import b63.o;
import b63.z;
import c2.a0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.w;
import c2.x2;
import c42.d0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDISimpleSetup;
import da0.u;
import e23.l;
import e23.q;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f25724c;

    public /* synthetic */ e(List list, l lVar, int i14) {
        this.f25722a = i14;
        this.f25723b = list;
        this.f25724c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x015b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0229  */
    /* JADX WARN: Code duplicated, block: B:50:0x0262  */
    /* JADX WARN: Code duplicated, block: B:55:0x029e  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x033e  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15 = this.f25722a;
        m.a aVar = m.f135153a;
        l lVar = this.f25724c;
        List<i> list = this.f25723b;
        switch (i15) {
            case 0:
                w wVar = (w) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(wVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    float fJ = wVar.j();
                    if (list.isEmpty()) {
                        mVar.C(-1276217847);
                        mVar.f();
                    } else {
                        mVar.C(-1277904402);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f14 = j92.b.f97899b.f97920e * 2;
                        g6.f.a aVar2 = g6.f.f75994b;
                        float f15 = ((fJ - f14) - 4) / 7;
                        r rVarF = x2.f(r.S, 1.0f);
                        Object objQ = mVar.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new c63.n(22);
                            mVar.K(objQ);
                        }
                        r rVarB = v.b(rVarF, (l) objQ);
                        c2.j.f22691a.getClass();
                        c2.j.g gVar = c2.j.f22698h;
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, mVar, 6);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        r rVarC = k.c(rVarB, mVar);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
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
                        b4.c(h5.g.a.f81810g, s2VarA, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar);
                        u2 u2Var = u2.f22900a;
                        z.INSTANCE.getClass();
                        o oVarF = b63.b.f(b63.a.C0229a.f16171a, z.Companion.a());
                        mVar.C(-493060334);
                        for (i iVar : list) {
                            o oVar = iVar.f25737a;
                            b63.j jVarB = oVar.b();
                            jVarB.getClass();
                            switch (jVarB.ordinal() + 1) {
                                case 1:
                                    i14 = R.string.gak_day_of_week_monday_initial;
                                    break;
                                case 2:
                                    i14 = R.string.gak_day_of_week_tuesday_initial;
                                    break;
                                case 3:
                                    i14 = R.string.gak_day_of_week_wednesday_initial;
                                    break;
                                case 4:
                                    i14 = R.string.lbl_day_of_week_thursday_initial;
                                    break;
                                case 5:
                                    i14 = R.string.lbl_day_of_week_friday_initial;
                                    break;
                                case 6:
                                    i14 = R.string.lbl_day_of_week_saturday_initial;
                                    break;
                                case 7:
                                    i14 = R.string.lbl_day_of_week_sunday_initial;
                                    break;
                                default:
                                    i14 = -1;
                                    break;
                            }
                            if (lVar != null) {
                                mVar.C(1365235485);
                                r rVarW = x2.w(r.S, 0.0f, f15, 1);
                                boolean zF = g.f(oVarF, oVar);
                                h hVar = iVar.f25738b;
                                String strQ = y.Q(mVar, i14);
                                boolean z14 = iVar.f25739c;
                                boolean zB = mVar.B(lVar) | mVar.r(iVar);
                                Object objQ2 = mVar.q();
                                if (zB || objQ2 == m.a.f135155b) {
                                    objQ2 = new bb0.d(26, lVar, iVar);
                                    mVar.K(objQ2);
                                }
                                g.d(rVarW, zF, hVar, strQ, null, z14, (e23.a) objQ2, mVar, 0, 16);
                                mVar.f();
                            } else {
                                mVar.C(1365738026);
                                g.d(x2.w(r.S, 0.0f, f15, 1), g.f(oVarF, oVar), iVar.f25738b, y.Q(mVar, i14), null, iVar.f25739c, null, mVar, 0, 80);
                                mVar.f();
                            }
                        }
                        mVar.f();
                        mVar.y();
                        mVar.f();
                    }
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zB2 = mVar2.B(lVar);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new fb0.d(lVar, 12);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new fb0.d(lVar, 12);
                            mVar2.K(objQ3);
                        }
                    }
                    ha0.f.a(list, (l) objQ3, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    boolean zB3 = mVar3.B(lVar);
                    Object objQ4 = mVar3.q();
                    if (zB3) {
                        objQ4 = new fb0.d(lVar, 13);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new fb0.d(lVar, 13);
                            mVar3.K(objQ4);
                        }
                    }
                    ha0.f.a(list, (l) objQ4, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    String strQ2 = y.Q(mVar4, R.string.bic_popular_profiles_sensor_selection);
                    r.a aVar4 = r.S;
                    r rVarF2 = x2.f(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarC2 = c2.l.C(rVarF2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar4), mVar4, 0, 0, 131068);
                    c2.l.f(x2.h(aVar4, eVar.f97920e), mVar4);
                    boolean zContains = list.contains(GDISimpleSetup.SensorType.HEART_RATE);
                    String strQ3 = y.Q(mVar4, R.string.lbl_heart_rate_monitor);
                    float f16 = u.f58858a;
                    k2.h hVarC = k2.i.c(f16, f16, 0.0f, 0.0f, 12);
                    boolean zB4 = mVar4.B(lVar);
                    Object objQ5 = mVar4.q();
                    if (zB4) {
                        objQ5 = new gt1.k(lVar, 23);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new gt1.k(lVar, 23);
                            mVar4.K(objQ5);
                        }
                    }
                    u.a(null, zContains, strQ3, null, hVarC, (e23.a) objQ5, mVar4, 0, 9);
                    boolean zContains2 = list.contains(GDISimpleSetup.SensorType.POWER);
                    String strQ4 = y.Q(mVar4, R.string.lbl_power_meter);
                    m1.a aVar5 = m1.f128891a;
                    boolean zB5 = mVar4.B(lVar);
                    Object objQ6 = mVar4.q();
                    if (zB5) {
                        objQ6 = new gt1.k(lVar, 24);
                        mVar4.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new gt1.k(lVar, 24);
                            mVar4.K(objQ6);
                        }
                    }
                    u.a(null, zContains2, strQ4, null, aVar5, (e23.a) objQ6, mVar4, 24576, 9);
                    boolean zContains3 = list.contains(GDISimpleSetup.SensorType.CADENCE);
                    String strQ5 = y.Q(mVar4, R.string.lbl_cadence_sensor);
                    k2.h hVarC2 = k2.i.c(0.0f, 0.0f, f16, f16, 3);
                    boolean zB6 = mVar4.B(lVar);
                    Object objQ7 = mVar4.q();
                    if (zB6) {
                        objQ7 = new gt1.k(lVar, 25);
                        mVar4.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new gt1.k(lVar, 25);
                            mVar4.K(objQ7);
                        }
                    }
                    u.a(null, zContains3, strQ5, null, hVarC2, (e23.a) objQ7, mVar4, 0, 9);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar6 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar6, j92.b.f97899b.f97918c), mVar5);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sg1.c cVar = (sg1.c) it.next();
                        r rVarF3 = x2.f(r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                        boolean z15 = cVar.f159210h;
                        String str = cVar.f159203a;
                        String str2 = cVar.f159205c;
                        String str3 = cVar.f159204b;
                        boolean zB7 = mVar5.B(lVar) | mVar5.r(cVar);
                        Object objQ8 = mVar5.q();
                        if (zB7) {
                            objQ8 = new ph1.d(11, lVar, cVar);
                            mVar5.K(objQ8);
                        } else {
                            aVar.getClass();
                            if (objQ8 == m.a.f135155b) {
                                objQ8 = new ph1.d(11, lVar, cVar);
                                mVar5.K(objQ8);
                            }
                        }
                        da0.v.a(rVarC3, z15, false, str, str2, str3, null, (l) objQ8, mVar5, 0, 68);
                    }
                    x1 x1Var7 = n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var8 = n.f135158a;
                    String strQ6 = y.Q(mVar6, R.string.epoch_select_device_title);
                    r.a aVar7 = r.S;
                    r rVarF4 = x2.f(aVar7, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarY = c2.l.y(rVarF4, eVar2.f97920e);
                    d92.b.f58624b.getClass();
                    mh.c(strQ6, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar6), mVar6, 0, 0, 131068);
                    r rVarC4 = c2.l.C(x2.f(aVar7, 1.0f), 0.0f, 0.0f, 0.0f, eVar2.f97923h, 7);
                    boolean zR = mVar6.r(list) | mVar6.B(lVar);
                    Object objQ9 = mVar6.q();
                    if (zR) {
                        objQ9 = new d0(list, lVar, 6);
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new d0(list, lVar, 6);
                            mVar6.K(objQ9);
                        }
                    }
                    e2.c.b(rVarC4, null, null, null, null, null, false, null, (l) objQ9, mVar6, 0, 510);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }
}
