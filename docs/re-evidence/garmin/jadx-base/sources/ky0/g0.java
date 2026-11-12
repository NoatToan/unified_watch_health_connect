package ky0;

import androidx.lifecycle.ViewModelStoreOwner;
import c2.x2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107321a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.g f107322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f107323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f107324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f107325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f107326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f107327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f107328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o13.h f107329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o13.h f107330j;

    public /* synthetic */ g0(b63.o oVar, o82.g gVar, boolean z14, ug2.x xVar, ug2.x xVar2, ug2.x xVar3, ug2.x xVar4, ug2.x xVar5, e23.a aVar) {
        this.f107325e = oVar;
        this.f107322b = gVar;
        this.f107323c = z14;
        this.f107326f = xVar;
        this.f107327g = xVar2;
        this.f107328h = xVar3;
        this.f107329i = xVar4;
        this.f107330j = xVar5;
        this.f107324d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:262:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0211  */
    /* JADX WARN: Code duplicated, block: B:89:0x0228  */
    /* JADX WARN: Code duplicated, block: B:95:0x0235  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sy0.n nVar;
        ArrayList arrayListI;
        boolean z14;
        mm1.b bVar;
        List<mm1.c> listB;
        sy0.n nVar2;
        ArrayList arrayListG;
        boolean z15;
        mm1.b bVar2;
        List<mm1.c> listB2;
        Integer num;
        DateTime dateTime;
        e23.l lVar;
        q71.d dVar;
        boolean z16;
        boolean z17;
        mm1.b bVar3;
        mm1.b bVar4;
        int i14 = this.f107321a;
        p3.m.a aVar = p3.m.f135153a;
        o13.h hVar = this.f107330j;
        o13.h hVar2 = this.f107329i;
        Object obj5 = this.f107328h;
        Object obj6 = this.f107327g;
        Object obj7 = this.f107326f;
        Object obj8 = this.f107325e;
        int i15 = 0;
        switch (i14) {
            case 0:
                o82.a aVar2 = (o82.a) obj8;
                i53.d dVar2 = (i53.d) obj7;
                hy0.a aVar3 = (hy0.a) obj6;
                sy0.o oVar = (sy0.o) obj5;
                e23.l lVar2 = (e23.l) hVar2;
                e23.l lVar3 = (e23.l) hVar;
                c2.t tVar = (c2.t) obj;
                u82.f fVar = (u82.f) obj2;
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Integer num2 = 0;
                tVar.getClass();
                fVar.getClass();
                int i16 = (iIntValue & 6) == 0 ? (mVar.B(tVar) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i16 |= (iIntValue & 64) == 0 ? mVar.B(fVar) : mVar.r(fVar) ? 32 : 16;
                }
                if (mVar.n(i16 & 1, (i16 & 147) != 146)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    i2.f36769a.getClass();
                    i2.a.a(com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY, "Epic Reports UI - interval:" + aVar2);
                    DateTime dateTimeAtStartOfDay = g22.l.h(aVar2.f130843a).toDateTimeAtStartOfDay();
                    DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar2.f130844b).toDateTimeAtStartOfDay();
                    sy0.n nVar3 = (sy0.n) fVar.a();
                    boolean zB = mVar.B((nVar3 == null || (bVar4 = nVar3.f161259a) == null) ? null : bVar4.b());
                    Object objQ = mVar.q();
                    if (zB) {
                        nVar = (sy0.n) fVar.a();
                        if (nVar != null) {
                            arrayListI = null;
                        } else {
                            arrayListI = null;
                        }
                        if (arrayListI != null) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        objQ = Boolean.valueOf(!z14);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            nVar = (sy0.n) fVar.a();
                            if (nVar != null || (bVar = nVar.f161259a) == null || (listB = bVar.b()) == null) {
                                arrayListI = null;
                            } else {
                                arrayListI = vm1.a.i(listB);
                            }
                            if (arrayListI != null || arrayListI.isEmpty()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objQ = Boolean.valueOf(!z14);
                            mVar.K(objQ);
                        }
                    }
                    boolean zBooleanValue = ((Boolean) objQ).booleanValue();
                    sy0.n nVar4 = (sy0.n) fVar.a();
                    boolean zB2 = mVar.B((nVar4 == null || (bVar3 = nVar4.f161259a) == null) ? null : bVar3.b());
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        nVar2 = (sy0.n) fVar.a();
                        if (nVar2 != null) {
                            arrayListG = null;
                        } else {
                            arrayListG = null;
                        }
                        if (arrayListG != null) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        objQ2 = Boolean.valueOf(!z15);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            nVar2 = (sy0.n) fVar.a();
                            if (nVar2 != null || (bVar2 = nVar2.f161259a) == null || (listB2 = bVar2.b()) == null) {
                                arrayListG = null;
                            } else {
                                arrayListG = vm1.a.g(listB2);
                            }
                            if (arrayListG != null || arrayListG.isEmpty()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objQ2 = Boolean.valueOf(!z15);
                            mVar.K(objQ2);
                        }
                    }
                    boolean zBooleanValue2 = ((Boolean) objQ2).booleanValue();
                    h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    p3.i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
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
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    mVar.C(-643033058);
                    Iterator it = dVar2.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            int i17 = i0.a.f107357a[((a2) entry.getKey()).ordinal()];
                            o82.g gVar = this.f107322b;
                            switch (i17) {
                                case 1:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    lVar3 = lVar3;
                                    mVar.C(1114823807);
                                    if (!zBooleanValue) {
                                        mVar.f();
                                    } else {
                                        sy0.n nVar5 = (sy0.n) fVar.a();
                                        mm1.b bVar6 = nVar5 != null ? nVar5.f161259a : null;
                                        if (bVar6 == null) {
                                            mVar.C(1114996445);
                                            mVar.f();
                                            lVar = lVar2;
                                        } else {
                                            mVar.C(1114996446);
                                            dateTimeAtStartOfDay.getClass();
                                            dateTime.getClass();
                                            lVar = lVar2;
                                            DateTime dateTime2 = dateTimeAtStartOfDay;
                                            z3.e eVarJ = aVar3.j(bVar6, dateTime2, dateTime, oVar.f161269c, i53.a.a(rl1.i.RESTING_HEART_RATE, rl1.i.OVERNIGHT_HRV), lVar);
                                            dateTimeAtStartOfDay = dateTime2;
                                            dateTime = dateTime;
                                            eVarJ.invoke(mVar, num);
                                            Unit unit = Unit.INSTANCE;
                                            mVar.f();
                                        }
                                        mVar.f();
                                    }
                                    dateTimeAtStartOfDay2 = dateTime;
                                    lVar2 = lVar;
                                    num2 = num;
                                    lVar3 = lVar3;
                                    it = it;
                                    break;
                                case 2:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    lVar3 = lVar3;
                                    mVar.C(1115994429);
                                    if (!zBooleanValue2) {
                                        mVar.f();
                                    } else {
                                        sy0.n nVar6 = (sy0.n) fVar.a();
                                        mm1.b bVar7 = nVar6 != null ? nVar6.f161259a : null;
                                        if (bVar7 == null) {
                                            mVar.C(1116169950);
                                            mVar.f();
                                        } else {
                                            mVar.C(1116169951);
                                            h4.r.a aVar6 = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.q(aVar6, j92.b.f97899b.f97918c), mVar);
                                            LocalDate localDate = dateTimeAtStartOfDay.toLocalDate();
                                            localDate.getClass();
                                            LocalDate localDate2 = dateTime.toLocalDate();
                                            localDate2.getClass();
                                            aVar3.f(bVar7, localDate, localDate2).invoke(mVar, num);
                                            Unit unit2 = Unit.INSTANCE;
                                            mVar.f();
                                        }
                                        mVar.f();
                                    }
                                    break;
                                case 3:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    lVar3 = lVar3;
                                    mVar.C(1117166539);
                                    sy0.n nVar7 = (sy0.n) fVar.a();
                                    i53.d<q71.e, q71.c> dVar3 = (nVar7 == null || (dVar = nVar7.f161260b) == null) ? null : dVar.f143238a;
                                    if (dVar3 == null) {
                                        mVar.C(1117166538);
                                        mVar.f();
                                    } else {
                                        mVar.C(1117166539);
                                        h4.r.a aVar7 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        j92.e eVar = j92.b.f97899b;
                                        c2.l.f(x2.q(aVar7, eVar.f97918c), mVar);
                                        h4.r rVarA = c2.l.A(aVar7, eVar.f97920e, 0.0f, 2);
                                        dateTimeAtStartOfDay.getClass();
                                        dateTime.getClass();
                                        aVar3.e(rVarA, dVar3, dateTimeAtStartOfDay, dateTime).invoke(mVar, num);
                                        Unit unit3 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                    break;
                                case 4:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    lVar3 = lVar3;
                                    mVar.C(1118087363);
                                    sy0.n nVar8 = (sy0.n) fVar.a();
                                    i53.c<oz1.b> cVar = nVar8 != null ? nVar8.f161264f : null;
                                    if (cVar == null) {
                                        mVar.C(1118087362);
                                        mVar.f();
                                    } else {
                                        mVar.C(1118087363);
                                        h4.r.a aVar8 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c2.l.f(x2.q(aVar8, j92.b.f97899b.f97918c), mVar);
                                        dateTimeAtStartOfDay.getClass();
                                        dateTime.getClass();
                                        aVar3.a(cVar, dateTimeAtStartOfDay, dateTime).invoke(mVar, num);
                                        Unit unit4 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                    break;
                                case 5:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    mVar.C(1118902880);
                                    sy0.n nVar9 = (sy0.n) fVar.a();
                                    i53.c<com.garmin.android.apps.connectmobile.performance.model.c> cVar2 = nVar9 != null ? nVar9.f161263e : null;
                                    if (cVar2 == null) {
                                        mVar.C(1118902879);
                                        mVar.f();
                                    } else {
                                        mVar.C(1118902880);
                                        h4.r.a aVar9 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c2.l.f(x2.q(aVar9, j92.b.f97899b.f97918c), mVar);
                                        dateTimeAtStartOfDay.getClass();
                                        dateTime.getClass();
                                        aVar3.c(dateTimeAtStartOfDay, dateTime, cVar2, gVar, oVar.f161270d, lVar3).invoke(mVar, num);
                                        Unit unit5 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                    break;
                                case 6:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    mVar.C(1119976844);
                                    bv.b.f21239a.getClass();
                                    bv.b.a();
                                    if (com.garmin.android.apps.connectmobile.k1.f37122a.y()) {
                                        mVar.C(867421800);
                                        sy0.n nVar10 = (sy0.n) fVar.a();
                                        gy0.k kVar = nVar10 != null ? nVar10.f161265g : null;
                                        if (kVar == null) {
                                            mVar.C(1120272025);
                                            mVar.f();
                                        } else {
                                            mVar.C(1120272026);
                                            n61.f fVar2 = gVar == o82.g.f130851d ? kVar.f80184b : kVar.f80183a;
                                            if (fVar2 != null) {
                                                mVar.C(1086169898);
                                                h4.r.a aVar10 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c2.l.f(x2.q(aVar10, j92.b.f97899b.f97918c), mVar);
                                                dateTimeAtStartOfDay.getClass();
                                                dateTime.getClass();
                                                aVar3.b(dateTimeAtStartOfDay, dateTime, gVar, fVar2).invoke(mVar, num);
                                                mVar.f();
                                            } else {
                                                mVar.C(1086879116);
                                                mVar.f();
                                            }
                                            Unit unit6 = Unit.INSTANCE;
                                            mVar.f();
                                        }
                                        mVar.f();
                                    } else {
                                        mVar.C(1121305566);
                                        mVar.f();
                                    }
                                    mVar.f();
                                    Unit unit7 = Unit.INSTANCE;
                                    lVar3 = lVar3;
                                    break;
                                case 7:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    mVar.C(1121614822);
                                    sy0.n nVar11 = (sy0.n) fVar.a();
                                    i53.c<r61.a> cVar3 = nVar11 != null ? nVar11.f161266h : null;
                                    if (cVar3 == null) {
                                        mVar.C(1121614821);
                                        mVar.f();
                                    } else {
                                        mVar.C(1121614822);
                                        h4.r.a aVar11 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c2.l.f(x2.q(aVar11, j92.b.f97899b.f97918c), mVar);
                                        aVar3.i(cVar3, aVar2).invoke(mVar, num);
                                        Unit unit8 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                    lVar3 = lVar3;
                                    break;
                                case 8:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    mVar.C(1122296202);
                                    sy0.n nVar12 = (sy0.n) fVar.a();
                                    i53.c<x61.e> cVar4 = nVar12 != null ? nVar12.f161261c : null;
                                    if (cVar4 == null) {
                                        mVar.C(1122296201);
                                        mVar.f();
                                    } else {
                                        mVar.C(1122296202);
                                        if (cVar4.isEmpty()) {
                                            z16 = false;
                                        } else {
                                            Iterator<x61.e> it3 = cVar4.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    Integer heatAcclimationPercentage = it3.next().getHeatAcclimationPercentage();
                                                    if (heatAcclimationPercentage != null && heatAcclimationPercentage.intValue() > 0) {
                                                        z16 = true;
                                                    }
                                                } else {
                                                    z16 = false;
                                                }
                                            }
                                        }
                                        if (z16) {
                                            mVar.C(-1976147212);
                                            h4.r.a aVar12 = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.q(aVar12, j92.b.f97899b.f97918c), mVar);
                                            LocalDate localDate3 = dateTimeAtStartOfDay.toLocalDate();
                                            localDate3.getClass();
                                            LocalDate localDate4 = dateTime.toLocalDate();
                                            localDate4.getClass();
                                            aVar3.d(cVar4, localDate3, localDate4).invoke(mVar, num);
                                            mVar.f();
                                        } else {
                                            mVar.C(-1975543704);
                                            mVar.f();
                                        }
                                        Unit unit9 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                    lVar3 = lVar3;
                                    break;
                                case 9:
                                    it = it;
                                    num = num2;
                                    dateTime = dateTimeAtStartOfDay2;
                                    mVar.C(1123346978);
                                    sy0.n nVar13 = (sy0.n) fVar.a();
                                    i53.c<x61.e> cVar5 = nVar13 != null ? nVar13.f161261c : null;
                                    if (cVar5 == null) {
                                        mVar.C(1123346977);
                                        mVar.f();
                                    } else {
                                        mVar.C(1123346978);
                                        if (cVar5.isEmpty()) {
                                            z17 = false;
                                        } else {
                                            Iterator<x61.e> it4 = cVar5.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    Integer altitudeAcclimationMeters = it4.next().getAltitudeAcclimationMeters();
                                                    if (altitudeAcclimationMeters != null && altitudeAcclimationMeters.intValue() > 0) {
                                                        z17 = true;
                                                    }
                                                } else {
                                                    z17 = false;
                                                }
                                            }
                                        }
                                        if (z17) {
                                            mVar.C(1910033134);
                                            h4.r.a aVar13 = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.q(aVar13, j92.b.f97899b.f97918c), mVar);
                                            LocalDate localDate5 = dateTimeAtStartOfDay.toLocalDate();
                                            localDate5.getClass();
                                            LocalDate localDate6 = dateTime.toLocalDate();
                                            localDate6.getClass();
                                            aVar3.h(cVar5, localDate5, localDate6).invoke(mVar, num);
                                            mVar.f();
                                        } else {
                                            mVar.C(1910643369);
                                            mVar.f();
                                        }
                                        Unit unit10 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                    lVar3 = lVar3;
                                    break;
                                case 10:
                                    mVar.C(1124315170);
                                    if (this.f107323c) {
                                        mVar.C(867559297);
                                        sy0.n nVar14 = (sy0.n) fVar.a();
                                        k61.b bVar8 = nVar14 != null ? nVar14.f161262d : null;
                                        if (bVar8 == null) {
                                            mVar.C(1124534432);
                                            mVar.f();
                                            num = num2;
                                            dateTime = dateTimeAtStartOfDay2;
                                        } else {
                                            mVar.C(1124534433);
                                            h4.r.a aVar14 = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.q(aVar14, j92.b.f97899b.f97918c), mVar);
                                            h4.r rVarE2 = u1.n.e(aVar14, d92.b.a(mVar).c().c(), o4.m1.f128891a);
                                            dateTimeAtStartOfDay.getClass();
                                            dateTimeAtStartOfDay2.getClass();
                                            DateTime dateTime3 = dateTimeAtStartOfDay2;
                                            DateTime dateTime4 = dateTimeAtStartOfDay;
                                            num = num2;
                                            dateTimeAtStartOfDay = dateTime4;
                                            dateTime = dateTime3;
                                            aVar3.g(rVarE2, bVar8, gVar, dateTime4, dateTime3).invoke(mVar, num);
                                            Unit unit11 = Unit.INSTANCE;
                                            mVar.f();
                                        }
                                        mVar.f();
                                    } else {
                                        it = it;
                                        num = num2;
                                        dateTime = dateTimeAtStartOfDay2;
                                        mVar.C(1125284478);
                                        mVar.f();
                                    }
                                    mVar.f();
                                    Unit unit12 = Unit.INSTANCE;
                                    lVar3 = lVar3;
                                    break;
                                default:
                                    throw n23.j.m(mVar, 867252151);
                            }
                        } else {
                            it = it;
                            num = num2;
                            dateTime = dateTimeAtStartOfDay2;
                            lVar3 = lVar3;
                        }
                        lVar = lVar2;
                        dateTimeAtStartOfDay2 = dateTime;
                        lVar2 = lVar;
                        num2 = num;
                        lVar3 = lVar3;
                        it = it;
                    }
                    mVar.f();
                    l72.f0.a aVar15 = l72.f0.a.f111000a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23360ca);
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarZ = c2.l.z(aVar16, eVar2.f97920e, eVar2.f97918c);
                    e23.a aVar17 = this.f107324d;
                    boolean zB3 = mVar.B(aVar17);
                    Object objQ3 = mVar.q();
                    if (zB3) {
                        objQ3 = new ku1.a(aVar17, 11);
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ku1.a(aVar17, 11);
                            mVar.K(objQ3);
                        }
                    }
                    aVar15.j(strW, rVarZ, false, (e23.a) objQ3, mVar, 0, 4);
                    mVar.y();
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                b63.o oVar2 = (b63.o) obj8;
                ug2.x xVar = (ug2.x) obj7;
                ug2.x xVar2 = (ug2.x) obj6;
                ug2.x xVar3 = (ug2.x) obj5;
                ug2.x xVar4 = (ug2.x) hVar2;
                ug2.x xVar5 = (ug2.x) hVar;
                lc.v vVar = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                boolean zR = mVar2.r(oVar2);
                o82.g gVar2 = this.f107322b;
                boolean zK = zR | mVar2.k(gVar2 == null ? -1 : gVar2.ordinal());
                Object objQ4 = mVar2.q();
                if (zK) {
                    objQ4 = new vv0.n(i15, oVar2, gVar2);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new vv0.n(i15, oVar2, gVar2);
                        mVar2.K(objQ4);
                    }
                }
                e23.a aVar18 = (e23.a) objQ4;
                mVar2.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(gw0.u.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar18);
                mVar2.R();
                gw0.u uVar = (gw0.u) u1VarResolveViewModel;
                p3.p1 p1VarC = s9.c.c(vVar.a().d(Boolean.FALSE, "REFRESH_DATA"), mVar2);
                Boolean bool = (Boolean) p1VarC.getF182175a();
                bool.booleanValue();
                boolean zB4 = mVar2.B(p1VarC) | mVar2.r(uVar) | mVar2.r(vVar);
                Object objQ5 = mVar2.q();
                if (zB4) {
                    objQ5 = new vv0.s(uVar, vVar, p1VarC, null);
                    mVar2.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new vv0.s(uVar, vVar, p1VarC, null);
                        mVar2.K(objQ5);
                    }
                }
                p3.l0.e((e23.p) objQ5, bool, mVar2);
                gw0.t.c(uVar, this.f107323c, xVar, xVar2, xVar3, xVar4, xVar5, this.f107324d, mVar2, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g0(o82.a aVar, i53.d dVar, e23.a aVar2, boolean z14, hy0.a aVar3, sy0.o oVar, e23.l lVar, o82.g gVar, e23.l lVar2) {
        this.f107325e = aVar;
        this.f107326f = dVar;
        this.f107324d = aVar2;
        this.f107323c = z14;
        this.f107327g = aVar3;
        this.f107328h = oVar;
        this.f107329i = lVar;
        this.f107322b = gVar;
        this.f107330j = lVar2;
    }
}
