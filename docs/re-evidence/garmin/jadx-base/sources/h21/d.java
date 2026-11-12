package h21;

import c2.b0;
import c2.x2;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import f21.o0;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o4.m1;
import p005kotlin.Unit;
import p13.j0;
import p13.k0;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81038a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.a f81039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i21.d f81040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i21.c f81041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x01.e f81042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v21.e f81043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o82.a f81044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pi0.e f81045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n82.f f81046i;

    public /* synthetic */ d(i21.d dVar, i21.c cVar, x01.e eVar, v21.e eVar2, o82.a aVar, o82.a aVar2, pi0.e eVar3, n82.f fVar) {
        this.f81040c = dVar;
        this.f81041d = cVar;
        this.f81042e = eVar;
        this.f81043f = eVar2;
        this.f81039b = aVar;
        this.f81044g = aVar2;
        this.f81045h = eVar3;
        this.f81046i = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x0411  */
    /* JADX WARN: Code duplicated, block: B:251:0x041a  */
    /* JADX WARN: Code duplicated, block: B:252:0x041e  */
    /* JADX WARN: Code duplicated, block: B:257:0x043b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0450  */
    /* JADX WARN: Code duplicated, block: B:263:0x0478  */
    /* JADX WARN: Code duplicated, block: B:265:0x0488  */
    /* JADX WARN: Code duplicated, block: B:267:0x048f  */
    /* JADX WARN: Code duplicated, block: B:269:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:272:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:273:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:276:0x0516  */
    /* JADX WARN: Code duplicated, block: B:278:0x0538  */
    /* JADX WARN: Code duplicated, block: B:280:0x053f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0556  */
    /* JADX WARN: Code duplicated, block: B:285:0x055d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0575  */
    /* JADX WARN: Code duplicated, block: B:290:0x057c  */
    /* JADX WARN: Code duplicated, block: B:292:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:294:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:296:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:300:0x060e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0665  */
    /* JADX WARN: Code duplicated, block: B:304:0x0674  */
    /* JADX WARN: Code duplicated, block: B:306:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:308:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:310:0x070b  */
    /* JADX WARN: Code duplicated, block: B:313:0x071a  */
    /* JADX WARN: Code duplicated, block: B:486:0x0994  */
    /* JADX WARN: Code duplicated, block: B:488:0x099d  */
    /* JADX WARN: Code duplicated, block: B:489:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:494:0x09be  */
    /* JADX WARN: Code duplicated, block: B:497:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:498:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:504:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:507:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:512:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:513:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:515:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:526:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:536:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:542:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:546:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:548:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:550:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:553:0x0b16  */
    /* JADX WARN: Code duplicated, block: B:555:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:558:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:560:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:562:0x0b77  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:570:0x0bab  */
    /* JADX WARN: Code duplicated, block: B:572:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:576:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:582:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:585:0x0cc5  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        List list;
        List<l42.b> listB;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        List list2;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        o82.a aVar;
        g21.d dVar;
        g21.v vVar;
        k01.f fVar2;
        List<l42.b> listB2;
        List list3;
        k01.f fVar3;
        k01.k kVar;
        l42.g totalAverage;
        Integer num;
        Double weight;
        Double bmi;
        Double bodyFat;
        v21.e eVar;
        x01.e eVar2;
        x01.e eVar3;
        k01.f fVar4;
        k01.k kVar2;
        boolean zR;
        Object objQ;
        o82.a aVar2;
        v21.e eVar4;
        k01.c cVar;
        k01.f fVar5;
        k01.c cVar2;
        boolean zR2;
        Object objQ2;
        boolean zR3;
        Object objQ3;
        boolean zR4;
        Object objQ4;
        l42.k kVar3;
        k01.c cVar3;
        boolean zR5;
        Object objQ5;
        int i14;
        l42.k kVar4;
        l42.k kVar5;
        k01.c cVar4;
        Map linkedHashMap;
        Map linkedHashMap2;
        boolean z24;
        l42.g weightAverageDto;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean z36;
        o82.a aVar3;
        g21.a aVar4;
        h5.g.a.f fVar6;
        c2.z zVarA2;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        pi0.e eVar5;
        o82.a aVar5;
        int i15;
        v21.e eVar6;
        x01.e eVar7;
        x01.e eVar8;
        boolean zR6;
        Object objQ6;
        ArrayList arrayList;
        v21.e eVar9;
        pi0.e eVar10;
        n82.f fVar7;
        boolean zB;
        Object objQ7;
        boolean zR7;
        Object objQ8;
        boolean zR8;
        Object objQ9;
        boolean zR9;
        Object objQ10;
        boolean zR10;
        Object objQ11;
        l42.e eVar11;
        List<l42.f> listB3;
        k01.l lVar;
        k01.e eVar12;
        List<k01.l> list4;
        k01.e eVar13;
        l42.e eVar14;
        k01.e eVar15;
        k01.e eVar16;
        int i16 = this.f81038a;
        p3.m.a aVar6 = p3.m.f135153a;
        o82.a aVar7 = this.f81044g;
        i21.c cVar5 = this.f81041d;
        switch (i16) {
            case 0:
                List<k01.j> list5 = null;
                u82.f fVar8 = (u82.f) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c2.t) obj).getClass();
                fVar8.getClass();
                x1 x1Var = p3.n.f135158a;
                k01.f fVar9 = (k01.f) fVar8.a();
                if (fVar9 == null || (cVar4 = fVar9.f102054a) == null || (list = cVar4.f102019d) == null) {
                    list = j0.f134944a;
                }
                List list6 = list;
                k01.f fVar10 = (k01.f) fVar8.a();
                if (fVar10 == null || (kVar5 = fVar10.f102055b) == null || (listB = kVar5.b()) == null) {
                    listB = j0.f134944a;
                }
                k01.f fVar11 = (k01.f) fVar8.a();
                List<s21.n> list7 = fVar11 != null ? fVar11.f102056c : null;
                i21.d dVar2 = this.f81040c;
                dVar2.getClass();
                list6.getClass();
                listB.getClass();
                if (list6.isEmpty()) {
                    z14 = false;
                } else {
                    Iterator it = list6.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            k01.h hVar = (k01.h) it.next();
                            k01.k kVar6 = hVar.f102061b;
                            if ((kVar6 != null ? kVar6.f102072a : null) == null) {
                                k01.d dVar3 = hVar.f102062c;
                                if ((dVar3 != null ? dVar3.f102023b : null) != null) {
                                }
                            }
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                }
                if (listB.isEmpty()) {
                    z15 = false;
                } else {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            l42.c cVarF = ((l42.b) it3.next()).f();
                            if (cVarF != null && (cVarF.getWeight() != null || cVarF.getBmi() != null || cVarF.getBodyFat() != null)) {
                                z15 = true;
                            }
                        } else {
                            z15 = false;
                        }
                    }
                }
                boolean z37 = z14 || z15;
                if (list6.isEmpty()) {
                    z16 = false;
                } else {
                    Iterator it4 = list6.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            k01.k kVar7 = ((k01.h) it4.next()).f102061b;
                            if (kVar7 != null && (kVar7.f102074c != null || kVar7.f102073b != null || kVar7.f102075d != null || kVar7.f102072a != null)) {
                                z16 = true;
                            }
                        } else {
                            z16 = false;
                        }
                    }
                }
                if (list6.isEmpty()) {
                    z17 = false;
                } else {
                    Iterator it5 = list6.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            k01.d dVar4 = ((k01.h) it5.next()).f102062c;
                            if (dVar4 != null && (dVar4.f102025d != null || dVar4.f102024c != null || dVar4.f102026e != null)) {
                                z17 = true;
                            }
                        } else {
                            z17 = false;
                        }
                    }
                }
                boolean z38 = z16 || z17;
                if (list6.isEmpty()) {
                    z18 = false;
                } else {
                    Iterator it6 = list6.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            k01.k kVar8 = ((k01.h) it6.next()).f102061b;
                            if (kVar8 != null && (kVar8.f102078g != null || kVar8.f102080i != null || kVar8.f102081j != null || kVar8.f102088q != null || kVar8.f102090s != null || kVar8.f102092u != null || kVar8.f102089r != null)) {
                                z18 = true;
                            }
                        } else {
                            z18 = false;
                        }
                    }
                }
                if (list6.isEmpty()) {
                    z19 = false;
                } else {
                    Iterator it7 = list6.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            k01.d dVar5 = ((k01.h) it7.next()).f102062c;
                            if (dVar5 != null && (dVar5.f102031j != null || dVar5.f102033l != null || dVar5.f102034m != null || dVar5.f102041t != null || dVar5.f102043v != null || dVar5.f102045x != null || dVar5.f102042u != null)) {
                                z19 = true;
                            }
                        } else {
                            z19 = false;
                        }
                    }
                }
                boolean z39 = z18 || z19;
                g21.r rVar = cVar5.f87254i;
                boolean z44 = (list7 == null || list7.isEmpty() || rVar == null) ? false : true;
                String str = cVar5.f87258m;
                h4.r.a aVar8 = h4.r.S;
                h4.r rVarB = a2.b(c2.l.D(x2.f(aVar8, 1.0f)), a2.a(mVar), true);
                c2.j.f22691a.getClass();
                c2.j.k kVar9 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                h4.g.a aVar9 = h4.d.a.f81536n;
                boolean z45 = z39;
                c2.z zVarA3 = c2.y.a(kVar9, aVar9, mVar, 0);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode3 = Long.hashCode(mVar.getU());
                List<s21.n> list8 = list7;
                i2 i2VarX3 = mVar.x();
                h4.r rVarC3 = h4.k.c(rVarB, mVar);
                h5.g.V.getClass();
                e0.a aVar10 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar10);
                } else {
                    mVar.c();
                }
                h5.g.a.e eVar17 = h5.g.a.f81810g;
                b4.c(eVar17, zVarA3, mVar);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX3, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                boolean z46 = z37;
                if (!mVar.getT()) {
                    list2 = list6;
                    if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar);
                    b0 b0Var = b0.f22601a;
                    h4.r rVarE = u1.n.e(aVar8, vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                    zVarA = c2.y.a(kVar9, aVar9, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarE, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar10);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar17, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    aVar = this.f81039b;
                    b63.o oVar = aVar.f130843a;
                    b63.o oVar2 = aVar.f130844b;
                    dVar = cVar5.f87247b;
                    if (dVar != null) {
                        vVar = dVar.f75405a;
                    } else {
                        vVar = null;
                    }
                    fVar2 = (k01.f) fVar8.a();
                    if (fVar2 != null || (kVar4 = fVar2.f102055b) == null) {
                        listB2 = null;
                    } else {
                        listB2 = kVar4.b();
                    }
                    list3 = list2;
                    f21.m.a(oVar, oVar2, z46, list3, vVar, listB2, mVar, 0);
                    if (z46) {
                        mVar.C(-1656395579);
                        zR5 = mVar.r(dVar2);
                        objQ5 = mVar.q();
                        if (zR5) {
                            i14 = 0;
                            objQ5 = new h(dVar2, 0);
                            mVar.K(objQ5);
                        } else {
                            aVar6.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                i14 = 0;
                                objQ5 = new h(dVar2, 0);
                                mVar.K(objQ5);
                            } else {
                                i14 = 0;
                            }
                        }
                        lg.d.b(cVar5, (e23.l) objQ5, mVar, i14);
                        mVar.f();
                    } else {
                        mVar.C(-1656111123);
                        mVar.f();
                    }
                    fVar3 = (k01.f) fVar8.a();
                    if (fVar3 != null || (cVar3 = fVar3.f102054a) == null) {
                        kVar = null;
                    } else {
                        kVar = cVar3.f102020e;
                    }
                    if (fVar3 != null || (kVar3 = fVar3.f102055b) == null) {
                        totalAverage = null;
                    } else {
                        totalAverage = kVar3.getTotalAverage();
                    }
                    if (kVar != null) {
                        num = kVar.f102072a;
                    } else {
                        num = null;
                    }
                    if (totalAverage != null) {
                        weight = totalAverage.getWeight();
                    } else {
                        weight = null;
                    }
                    if (totalAverage != null) {
                        bmi = totalAverage.getBmi();
                    } else {
                        bmi = null;
                    }
                    if (totalAverage != null) {
                        bodyFat = totalAverage.getBodyFat();
                    } else {
                        bodyFat = null;
                    }
                    g21.a aVar11 = new g21.a(num, weight, bmi, bodyFat);
                    eVar = this.f81043f;
                    f21.c.a(aVar11, eVar, mVar, 0);
                    if (str == null) {
                        mVar.C(-1655839502);
                        mVar.f();
                    } else {
                        mVar.C(-1655839501);
                        h4.r rVarF = x2.f(aVar8, 1.0f);
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                        String strW = gl1.d.W(str);
                        d92.b.f58624b.getClass();
                        mh.c(strW, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar, 0, 0, 131068);
                        Unit unit = Unit.INSTANCE;
                        mVar.f();
                    }
                    eVar2 = this.f81042e;
                    if (z44) {
                        mVar.C(-1655414367);
                        List<g21.x> list9 = cVar5.f87251f;
                        g21.x xVar = cVar5.f87249d;
                        zR2 = mVar.r(dVar2);
                        objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new h(dVar2, 1);
                            mVar.K(objQ2);
                        } else {
                            aVar6.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new h(dVar2, 1);
                                mVar.K(objQ2);
                            }
                        }
                        e23.l lVar2 = (e23.l) objQ2;
                        k01.f fVar12 = (k01.f) fVar8.a();
                        List<g21.l> list10 = cVar5.f87253h;
                        g21.l lVar3 = cVar5.f87252g;
                        zR3 = mVar.r(dVar2);
                        objQ3 = mVar.q();
                        if (zR3) {
                            objQ3 = new h(dVar2, 2);
                            mVar.K(objQ3);
                        } else {
                            aVar6.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new h(dVar2, 2);
                                mVar.K(objQ3);
                            }
                        }
                        e23.l lVar4 = (e23.l) objQ3;
                        zR4 = mVar.r(dVar2);
                        objQ4 = mVar.q();
                        if (zR4) {
                            objQ4 = new h(dVar2, 3);
                            mVar.K(objQ4);
                        } else {
                            aVar6.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new h(dVar2, 3);
                                mVar.K(objQ4);
                            }
                        }
                        j.b(eVar2, aVar, list9, xVar, lVar2, list3, fVar12, z38, list10, lVar3, lVar4, list8, z45, rVar, (e23.l) objQ4, eVar, cVar5.f87256k, mVar, 0);
                        eVar3 = eVar2;
                        mVar.f();
                        eVar4 = eVar;
                        aVar2 = aVar;
                    } else {
                        eVar3 = eVar2;
                        boolean z47 = z38;
                        mVar.C(-1653870443);
                        x01.f fVar13 = eVar3.f188255d;
                        g21.l lVar5 = cVar5.f87252g;
                        w13.c cVar6 = g21.l.f75452g;
                        fVar4 = (k01.f) fVar8.a();
                        if (fVar4 != null || (cVar = fVar4.f102054a) == null) {
                            kVar2 = null;
                        } else {
                            kVar2 = cVar.f102020e;
                        }
                        g21.b bVarS = gl1.y.S(kVar2);
                        Integer num2 = cVar5.f87256k;
                        zR = mVar.r(dVar2);
                        objQ = mVar.q();
                        if (zR) {
                            objQ = new h(dVar2, 4);
                            mVar.K(objQ);
                        } else {
                            aVar6.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new h(dVar2, 4);
                                mVar.K(objQ);
                            }
                        }
                        j.c(fVar13, aVar, list3, z47, lVar5, cVar6, bVarS, num2, eVar, (e23.l) objQ, mVar, 0);
                        aVar2 = aVar;
                        eVar4 = eVar;
                        mVar.f();
                    }
                    mVar.y();
                    if (eVar3.f188255d != x01.f.NEVER) {
                        mVar.C(-1079813231);
                        String strQ = gl1.y.Q(mVar, R.string.lbl_meal_breakdown);
                        d92.b.f58624b.getClass();
                        x0 x0VarE = d92.c.e(j92.f.f97931h);
                        d92.b.f58625c.getClass();
                        j92.e eVar18 = j92.b.f97899b;
                        float f14 = eVar18.f97920e;
                        mh.c(strQ, c2.l.B(aVar8, f14, eVar18.f97922g, f14, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, mVar, 0, 0, 131068);
                        fVar5 = (k01.f) fVar8.a();
                        if (fVar5 != null && (cVar2 = fVar5.f102054a) != null) {
                            list5 = cVar2.f102018c;
                        }
                        f21.w.b(i21.d.I4(list5), eVar4, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-1079242397);
                        mVar.f();
                    }
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_daily_breakdown);
                    d92.b.f58624b.getClass();
                    x0 x0VarE2 = d92.c.e(j92.f.f97931h);
                    d92.b.f58625c.getClass();
                    j92.e eVar19 = j92.b.f97899b;
                    float f15 = eVar19.f97920e;
                    mh.c(strQ2, c2.l.B(aVar8, f15, eVar19.f97922g, f15, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE2, mVar, 0, 0, 131068);
                    j.a(new o82.a((b63.o) r13.b.d(aVar2.f130843a, aVar7.f130843a), (b63.o) r13.b.e(aVar2.f130844b, aVar7.f130844b)), i53.a.j(list3), this.f81045h, eVar4, this.f81046i, dVar2, mVar, 512);
                    mVar.y();
                    return Unit.INSTANCE;
                }
                list2 = list6;
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, mVar);
                b0 b0Var2 = b0.f22601a;
                h4.r rVarE2 = u1.n.e(aVar8, vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                zVarA = c2.y.a(kVar9, aVar9, mVar, 0);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarE2, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar10);
                } else {
                    mVar.c();
                }
                b4.c(eVar17, zVarA, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                } else {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar);
                aVar = this.f81039b;
                b63.o oVar3 = aVar.f130843a;
                b63.o oVar4 = aVar.f130844b;
                dVar = cVar5.f87247b;
                if (dVar != null) {
                    vVar = dVar.f75405a;
                } else {
                    vVar = null;
                }
                fVar2 = (k01.f) fVar8.a();
                if (fVar2 != null) {
                    listB2 = null;
                } else {
                    listB2 = null;
                }
                list3 = list2;
                f21.m.a(oVar3, oVar4, z46, list3, vVar, listB2, mVar, 0);
                if (z46) {
                    mVar.C(-1656395579);
                    zR5 = mVar.r(dVar2);
                    objQ5 = mVar.q();
                    if (zR5) {
                        aVar6.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            i14 = 0;
                            objQ5 = new h(dVar2, 0);
                            mVar.K(objQ5);
                        } else {
                            i14 = 0;
                        }
                    } else {
                        i14 = 0;
                        objQ5 = new h(dVar2, 0);
                        mVar.K(objQ5);
                    }
                    lg.d.b(cVar5, (e23.l) objQ5, mVar, i14);
                    mVar.f();
                } else {
                    mVar.C(-1656111123);
                    mVar.f();
                }
                fVar3 = (k01.f) fVar8.a();
                if (fVar3 != null) {
                    kVar = null;
                } else {
                    kVar = null;
                }
                if (fVar3 != null) {
                    totalAverage = null;
                } else {
                    totalAverage = null;
                }
                if (kVar != null) {
                    num = kVar.f102072a;
                } else {
                    num = null;
                }
                if (totalAverage != null) {
                    weight = totalAverage.getWeight();
                } else {
                    weight = null;
                }
                if (totalAverage != null) {
                    bmi = totalAverage.getBmi();
                } else {
                    bmi = null;
                }
                if (totalAverage != null) {
                    bodyFat = totalAverage.getBodyFat();
                } else {
                    bodyFat = null;
                }
                g21.a aVar12 = new g21.a(num, weight, bmi, bodyFat);
                eVar = this.f81043f;
                f21.c.a(aVar12, eVar, mVar, 0);
                if (str == null) {
                    mVar.C(-1655839502);
                    mVar.f();
                } else {
                    mVar.C(-1655839501);
                    h4.r rVarF2 = x2.f(aVar8, 1.0f);
                    d92.b.f58625c.getClass();
                    h4.r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                    String strW2 = gl1.d.W(str);
                    d92.b.f58624b.getClass();
                    mh.c(strW2, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar, 0, 0, 131068);
                    Unit unit2 = Unit.INSTANCE;
                    mVar.f();
                }
                eVar2 = this.f81042e;
                if (z44) {
                    mVar.C(-1655414367);
                    List<g21.x> list11 = cVar5.f87251f;
                    g21.x xVar2 = cVar5.f87249d;
                    zR2 = mVar.r(dVar2);
                    objQ2 = mVar.q();
                    if (zR2) {
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h(dVar2, 1);
                            mVar.K(objQ2);
                        }
                    } else {
                        objQ2 = new h(dVar2, 1);
                        mVar.K(objQ2);
                    }
                    e23.l lVar6 = (e23.l) objQ2;
                    k01.f fVar14 = (k01.f) fVar8.a();
                    List<g21.l> list12 = cVar5.f87253h;
                    g21.l lVar7 = cVar5.f87252g;
                    zR3 = mVar.r(dVar2);
                    objQ3 = mVar.q();
                    if (zR3) {
                        aVar6.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new h(dVar2, 2);
                            mVar.K(objQ3);
                        }
                    } else {
                        objQ3 = new h(dVar2, 2);
                        mVar.K(objQ3);
                    }
                    e23.l lVar8 = (e23.l) objQ3;
                    zR4 = mVar.r(dVar2);
                    objQ4 = mVar.q();
                    if (zR4) {
                        aVar6.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new h(dVar2, 3);
                            mVar.K(objQ4);
                        }
                    } else {
                        objQ4 = new h(dVar2, 3);
                        mVar.K(objQ4);
                    }
                    j.b(eVar2, aVar, list11, xVar2, lVar6, list3, fVar14, z38, list12, lVar7, lVar8, list8, z45, rVar, (e23.l) objQ4, eVar, cVar5.f87256k, mVar, 0);
                    eVar3 = eVar2;
                    mVar.f();
                    eVar4 = eVar;
                    aVar2 = aVar;
                } else {
                    eVar3 = eVar2;
                    boolean z48 = z38;
                    mVar.C(-1653870443);
                    x01.f fVar15 = eVar3.f188255d;
                    g21.l lVar9 = cVar5.f87252g;
                    w13.c cVar7 = g21.l.f75452g;
                    fVar4 = (k01.f) fVar8.a();
                    if (fVar4 != null) {
                        kVar2 = null;
                    } else {
                        kVar2 = null;
                    }
                    g21.b bVarS2 = gl1.y.S(kVar2);
                    Integer num3 = cVar5.f87256k;
                    zR = mVar.r(dVar2);
                    objQ = mVar.q();
                    if (zR) {
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h(dVar2, 4);
                            mVar.K(objQ);
                        }
                    } else {
                        objQ = new h(dVar2, 4);
                        mVar.K(objQ);
                    }
                    j.c(fVar15, aVar, list3, z48, lVar9, cVar7, bVarS2, num3, eVar, (e23.l) objQ, mVar, 0);
                    aVar2 = aVar;
                    eVar4 = eVar;
                    mVar.f();
                }
                mVar.y();
                if (eVar3.f188255d != x01.f.NEVER) {
                    mVar.C(-1079813231);
                    String strQ3 = gl1.y.Q(mVar, R.string.lbl_meal_breakdown);
                    d92.b.f58624b.getClass();
                    x0 x0VarE3 = d92.c.e(j92.f.f97931h);
                    d92.b.f58625c.getClass();
                    j92.e eVar110 = j92.b.f97899b;
                    float f16 = eVar110.f97920e;
                    mh.c(strQ3, c2.l.B(aVar8, f16, eVar110.f97922g, f16, f16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE3, mVar, 0, 0, 131068);
                    fVar5 = (k01.f) fVar8.a();
                    if (fVar5 != null) {
                        list5 = cVar2.f102018c;
                    }
                    f21.w.b(i21.d.I4(list5), eVar4, mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(-1079242397);
                    mVar.f();
                }
                String strQ4 = gl1.y.Q(mVar, R.string.lbl_daily_breakdown);
                d92.b.f58624b.getClass();
                x0 x0VarE4 = d92.c.e(j92.f.f97931h);
                d92.b.f58625c.getClass();
                j92.e eVar111 = j92.b.f97899b;
                float f17 = eVar111.f97920e;
                mh.c(strQ4, c2.l.B(aVar8, f17, eVar111.f97922g, f17, f17), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE4, mVar, 0, 0, 131068);
                j.a(new o82.a((b63.o) r13.b.d(aVar2.f130843a, aVar7.f130843a), (b63.o) r13.b.e(aVar2.f130844b, aVar7.f130844b)), i53.a.j(list3), this.f81045h, eVar4, this.f81046i, dVar2, mVar, 512);
                mVar.y();
                return Unit.INSTANCE;
            default:
                u82.f fVar16 = (u82.f) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c2.t) obj).getClass();
                fVar16.getClass();
                x1 x1Var3 = p3.n.f135158a;
                k01.g gVar = (k01.g) fVar16.a();
                g21.b bVarS3 = gl1.y.S((gVar == null || (eVar16 = gVar.f102057a) == null) ? null : eVar16.f102052e);
                k01.g gVar2 = (k01.g) fVar16.a();
                k01.k kVar10 = (gVar2 == null || (eVar15 = gVar2.f102057a) == null) ? null : eVar15.f102052e;
                l42.g weightAverageDto2 = (gVar2 == null || (eVar14 = gVar2.f102058b) == null) ? null : eVar14.getWeightAverageDto();
                g21.a aVar13 = new g21.a(kVar10 != null ? kVar10.f102072a : null, weightAverageDto2 != null ? weightAverageDto2.getWeight() : null, weightAverageDto2 != null ? weightAverageDto2.getBmi() : null, weightAverageDto2 != null ? weightAverageDto2.getBodyFat() : null);
                k01.g gVar3 = (k01.g) fVar16.a();
                List<k01.j> list13 = (gVar3 == null || (eVar13 = gVar3.f102057a) == null) ? null : eVar13.f102050c;
                k01.g gVar4 = (k01.g) fVar16.a();
                List<s21.n> list14 = gVar4 != null ? gVar4.f102059c : null;
                o82.a aVar14 = this.f81039b;
                b63.o oVar5 = aVar14.f130843a;
                boolean zB2 = mVar2.B(aVar14);
                Object objQ12 = mVar2.q();
                if (zB2) {
                    objQ12 = new i(aVar14, 1);
                    mVar2.K(objQ12);
                } else {
                    aVar6.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new i(aVar14, 1);
                        mVar2.K(objQ12);
                    }
                }
                List listS = c0.s(c53.q.e((e23.l) objQ12, oVar5));
                k01.g gVar5 = (k01.g) fVar16.a();
                if (gVar5 == null || (eVar12 = gVar5.f102057a) == null || (list4 = eVar12.f102051d) == null) {
                    linkedHashMap = k0.f134949a;
                    linkedHashMap.getClass();
                } else {
                    int iA = t0.a(p13.y.r(list4, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj5 : list4) {
                        linkedHashMap.put(((k01.l) obj5).f102094a, obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(listS, 10));
                Iterator it8 = listS.iterator();
                while (true) {
                    g21.b bVar2 = bVarS3;
                    if (!it8.hasNext()) {
                        List<k01.j> list15 = list13;
                        k01.g gVar6 = (k01.g) fVar16.a();
                        if (gVar6 == null || (eVar11 = gVar6.f102058b) == null || (listB3 = eVar11.b()) == null) {
                            linkedHashMap2 = k0.f134949a;
                            linkedHashMap2.getClass();
                        } else {
                            int iA2 = t0.a(p13.y.r(listB3, 10));
                            linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                            for (Object obj6 : listB3) {
                                linkedHashMap2.put(((l42.f) obj6).getStartDate(), obj6);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(p13.y.r(listS, 10));
                        Iterator it9 = listS.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add((l42.f) linkedHashMap2.get(g22.l.h((b63.o) it9.next()).toDateTimeAtStartOfDay()));
                        }
                        i21.d dVar6 = this.f81040c;
                        dVar6.getClass();
                        if (arrayList2.isEmpty()) {
                            z24 = false;
                        } else {
                            Iterator it10 = arrayList2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    k01.l lVar10 = (k01.l) it10.next();
                                    k01.k kVar11 = lVar10.f102096c;
                                    if ((kVar11 != null ? kVar11.f102072a : null) == null) {
                                        k01.k kVar12 = lVar10.f102097d;
                                        if ((kVar12 != null ? kVar12.f102072a : null) != null) {
                                        }
                                    }
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            z25 = false;
                        } else {
                            Iterator it11 = arrayList3.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    l42.f fVar17 = (l42.f) it11.next();
                                    if (fVar17 != null && (weightAverageDto = fVar17.getWeightAverageDto()) != null && (weightAverageDto.getWeight() != null || weightAverageDto.getBmi() != null || weightAverageDto.getBodyFat() != null)) {
                                        z25 = true;
                                    }
                                } else {
                                    z25 = false;
                                }
                            }
                        }
                        boolean z49 = z24 || z25;
                        if (arrayList2.isEmpty()) {
                            z26 = false;
                        } else {
                            Iterator it12 = arrayList2.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    k01.k kVar13 = ((k01.l) it12.next()).f102096c;
                                    if (kVar13 != null && (kVar13.f102074c != null || kVar13.f102073b != null || kVar13.f102075d != null || kVar13.f102072a != null)) {
                                        z26 = true;
                                    }
                                } else {
                                    z26 = false;
                                }
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            z27 = z26;
                            z28 = false;
                        } else {
                            Iterator it13 = arrayList2.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    k01.k kVar14 = ((k01.l) it13.next()).f102097d;
                                    z27 = z26;
                                    if (kVar14 == null || (kVar14.f102074c == null && kVar14.f102073b == null && kVar14.f102075d == null)) {
                                        z26 = z27;
                                    } else {
                                        z28 = true;
                                    }
                                } else {
                                    z27 = z26;
                                    z28 = false;
                                }
                            }
                        }
                        boolean z54 = z27 || z28;
                        if (arrayList2.isEmpty()) {
                            z29 = z54;
                            z34 = false;
                        } else {
                            Iterator it14 = arrayList2.iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    k01.k kVar15 = ((k01.l) it14.next()).f102096c;
                                    z29 = z54;
                                    if (kVar15 == null || (kVar15.f102078g == null && kVar15.f102080i == null && kVar15.f102081j == null && kVar15.f102088q == null && kVar15.f102090s == null && kVar15.f102092u == null && kVar15.f102089r == null)) {
                                        z54 = z29;
                                    } else {
                                        z34 = true;
                                    }
                                } else {
                                    z29 = z54;
                                    z34 = false;
                                }
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            z35 = z34;
                            z36 = false;
                        } else {
                            Iterator it15 = arrayList2.iterator();
                            while (true) {
                                if (it15.hasNext()) {
                                    k01.k kVar16 = ((k01.l) it15.next()).f102097d;
                                    z35 = z34;
                                    if (kVar16 == null || (kVar16.f102078g == null && kVar16.f102080i == null && kVar16.f102081j == null && kVar16.f102088q == null && kVar16.f102090s == null && kVar16.f102092u == null && kVar16.f102089r == null)) {
                                        z34 = z35;
                                    } else {
                                        z36 = true;
                                    }
                                } else {
                                    z35 = z34;
                                    z36 = false;
                                }
                            }
                        }
                        boolean z55 = z35 || z36;
                        g21.r rVar2 = cVar5.f87254i;
                        boolean z56 = (list14 == null || list14.isEmpty() || rVar2 == null) ? false : true;
                        boolean z57 = z55;
                        String str2 = cVar5.f87259n;
                        h4.r.a aVar15 = h4.r.S;
                        List<s21.n> list16 = list14;
                        h4.r rVarB2 = a2.b(c2.l.D(x2.f(aVar15, 1.0f)), a2.a(mVar2), true);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar17 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        h4.g.a aVar16 = h4.d.a.f81536n;
                        c2.z zVarA4 = c2.y.a(kVar17, aVar16, mVar2, 0);
                        x1 x1Var4 = p3.n.f135158a;
                        int iHashCode4 = Long.hashCode(mVar2.getU());
                        boolean z58 = z56;
                        i2 i2VarX4 = mVar2.x();
                        h4.r rVarC4 = h4.k.c(rVarB2, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar17 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        boolean z59 = z49;
                        h5.g.a.e eVar20 = h5.g.a.f81810g;
                        b4.c(eVar20, zVarA4, mVar2);
                        h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                        b4.c(c1623g2, i2VarX4, mVar2);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (!mVar2.getT()) {
                            aVar4 = aVar13;
                            aVar3 = aVar7;
                            if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            }
                            fVar6 = h5.g.a.f81807d;
                            b4.c(fVar6, rVarC4, mVar2);
                            b0 b0Var3 = b0.f22601a;
                            h4.r rVarE3 = u1.n.e(aVar15, vb.h.e(d92.b.f58623a, mVar2), m1.f128891a);
                            zVarA2 = c2.y.a(kVar17, aVar16, mVar2, 0);
                            iHashCode2 = Long.hashCode(mVar2.getU());
                            i2VarX2 = mVar2.x();
                            rVarC2 = h4.k.c(rVarE3, mVar2);
                            if (mVar2.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar17);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar20, zVarA2, mVar2);
                            b4.c(c1623g2, i2VarX2, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                            }
                            b4.c(fVar6, rVarC2, mVar2);
                            b63.o oVar6 = aVar14.f130843a;
                            b63.o oVar7 = aVar14.f130844b;
                            i53.f fVarJ = i53.a.j(arrayList2);
                            g21.d dVar7 = cVar5.f87247b;
                            g21.v vVar2 = dVar7 != null ? dVar7.f75405a : null;
                            i53.f fVarJ2 = i53.a.j(arrayList3);
                            int i17 = (l42.f.f109941g << 15) | 2097152;
                            eVar5 = this.f81045h;
                            aVar5 = aVar14;
                            g21.a aVar18 = aVar4;
                            o0.a(oVar6, oVar7, z59, fVarJ, vVar2, fVarJ2, eVar5, mVar2, i17);
                            if (z59) {
                                mVar2.C(-1987523989);
                                zR10 = mVar2.r(dVar6);
                                objQ11 = mVar2.q();
                                if (zR10) {
                                    objQ11 = new h(dVar6, 6);
                                    mVar2.K(objQ11);
                                } else {
                                    aVar6.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new h(dVar6, 6);
                                        mVar2.K(objQ11);
                                    }
                                }
                                i15 = 0;
                                lg.d.b(cVar5, (e23.l) objQ11, mVar2, 0);
                                mVar2.f();
                            } else {
                                i15 = 0;
                                mVar2.C(-1987239533);
                                mVar2.f();
                            }
                            eVar6 = this.f81043f;
                            f21.c.a(aVar18, eVar6, mVar2, i15);
                            if (str2 == null) {
                                mVar2.C(-1986982792);
                                mVar2.f();
                            } else {
                                mVar2.C(-1986982791);
                                h4.r rVarF3 = x2.f(aVar15, 1.0f);
                                d92.b.f58625c.getClass();
                                h4.r rVarY3 = c2.l.y(rVarF3, j92.b.f97899b.f97920e);
                                String strW3 = gl1.d.W(str2);
                                d92.b.f58624b.getClass();
                                mh.c(strW3, rVarY3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar2), mVar2, 0, 0, 131068);
                                Unit unit3 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            eVar7 = this.f81042e;
                            if (z58) {
                                mVar2.C(-1986534965);
                                List<g21.x> list17 = cVar5.f87251f;
                                g21.x xVar3 = cVar5.f87249d;
                                k01.g gVar7 = (k01.g) fVar16.a();
                                List<g21.l> list18 = cVar5.f87253h;
                                g21.l lVar11 = cVar5.f87252g;
                                Integer num4 = cVar5.f87257l;
                                zR7 = mVar2.r(dVar6);
                                objQ8 = mVar2.q();
                                if (zR7) {
                                    objQ8 = new h(dVar6, 7);
                                    mVar2.K(objQ8);
                                } else {
                                    aVar6.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new h(dVar6, 7);
                                        mVar2.K(objQ8);
                                    }
                                }
                                e23.l lVar12 = (e23.l) objQ8;
                                zR8 = mVar2.r(dVar6);
                                objQ9 = mVar2.q();
                                if (zR8) {
                                    objQ9 = new h(dVar6, 8);
                                    mVar2.K(objQ9);
                                } else {
                                    aVar6.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new h(dVar6, 8);
                                        mVar2.K(objQ9);
                                    }
                                }
                                e23.l lVar13 = (e23.l) objQ9;
                                zR9 = mVar2.r(dVar6);
                                objQ10 = mVar2.q();
                                if (zR9) {
                                    objQ10 = new h(dVar6, 9);
                                    mVar2.K(objQ10);
                                } else {
                                    aVar6.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new h(dVar6, 9);
                                        mVar2.K(objQ10);
                                    }
                                }
                                a0.c(eVar7, aVar5, list17, xVar3, lVar12, arrayList2, gVar7, z29, list18, lVar11, lVar13, z57, list16, rVar2, (e23.l) objQ10, eVar6, eVar5, num4, mVar2, 0);
                                eVar8 = eVar7;
                                mVar2.f();
                                arrayList = arrayList2;
                                eVar9 = eVar6;
                                eVar10 = eVar5;
                            } else {
                                eVar8 = eVar7;
                                boolean z64 = z29;
                                mVar2.C(-1984966799);
                                x01.f fVar18 = eVar8.f188255d;
                                g21.l lVar14 = cVar5.f87252g;
                                List<g21.l> list19 = cVar5.f87253h;
                                Integer num5 = cVar5.f87257l;
                                zR6 = mVar2.r(dVar6);
                                objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new h(dVar6, 10);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar6.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new h(dVar6, 10);
                                        mVar2.K(objQ6);
                                    }
                                }
                                a0.b(fVar18, aVar5, arrayList2, z64, lVar14, list19, bVar2, eVar6, eVar5, num5, (e23.l) objQ6, mVar2, 134217728);
                                aVar5 = aVar5;
                                arrayList = arrayList2;
                                eVar9 = eVar6;
                                eVar10 = eVar5;
                                mVar2.f();
                            }
                            mVar2.y();
                            if (eVar8.f188255d != x01.f.NEVER) {
                                mVar2.C(-1122961440);
                                String strQ5 = gl1.y.Q(mVar2, R.string.lbl_meal_breakdown);
                                d92.b.f58624b.getClass();
                                x0 x0VarE5 = d92.c.e(j92.f.f97931h);
                                d92.b.f58625c.getClass();
                                j92.e eVar21 = j92.b.f97899b;
                                float f18 = eVar21.f97920e;
                                mh.c(strQ5, c2.l.B(aVar15, f18, eVar21.f97922g, f18, f18), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE5, mVar2, 0, 0, 131068);
                                f21.w.b(i21.d.I4(list15), eVar9, mVar2, 0);
                                mVar2.f();
                            } else {
                                mVar2.C(-1122430007);
                                mVar2.f();
                            }
                            if (arrayList.isEmpty()) {
                                mVar2.C(-1121408247);
                                mVar2.f();
                            } else {
                                mVar2.C(-1122344261);
                                String strQ6 = gl1.y.Q(mVar2, R.string.lbl_weekly_breakdown);
                                d92.b.f58624b.getClass();
                                x0 x0VarE6 = d92.c.e(j92.f.f97931h);
                                d92.b.f58625c.getClass();
                                j92.e eVar22 = j92.b.f97899b;
                                float f19 = eVar22.f97920e;
                                mh.c(strQ6, c2.l.B(aVar15, f19, eVar22.f97922g, f19, f19), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE6, mVar2, 0, 0, 131068);
                                o82.a aVar19 = aVar3;
                                o82.a aVar20 = new o82.a((b63.o) r13.b.d(aVar5.f130843a, aVar19.f130843a), (b63.o) r13.b.e(aVar5.f130844b, aVar19.f130844b));
                                i53.f fVarJ3 = i53.a.j(arrayList);
                                fVar7 = this.f81046i;
                                zB = mVar2.B(fVar7);
                                objQ7 = mVar2.q();
                                if (zB) {
                                    objQ7 = new d52.k(fVar7, 3);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar6.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new d52.k(fVar7, 3);
                                        mVar2.K(objQ7);
                                    }
                                }
                                a0.a(aVar20, fVarJ3, eVar9, eVar10, (e23.l) objQ7, mVar2, 4096);
                                mVar2.f();
                            }
                            mVar2.y();
                            return Unit.INSTANCE;
                        }
                        aVar3 = aVar7;
                        aVar4 = aVar13;
                        v.h.z(iHashCode4, mVar2, iHashCode4, bVar3);
                        fVar6 = h5.g.a.f81807d;
                        b4.c(fVar6, rVarC4, mVar2);
                        b0 b0Var4 = b0.f22601a;
                        h4.r rVarE4 = u1.n.e(aVar15, vb.h.e(d92.b.f58623a, mVar2), m1.f128891a);
                        zVarA2 = c2.y.a(kVar17, aVar16, mVar2, 0);
                        iHashCode2 = Long.hashCode(mVar2.getU());
                        i2VarX2 = mVar2.x();
                        rVarC2 = h4.k.c(rVarE4, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar20, zVarA2, mVar2);
                        b4.c(c1623g2, i2VarX2, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                        } else {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                        }
                        b4.c(fVar6, rVarC2, mVar2);
                        b63.o oVar8 = aVar14.f130843a;
                        b63.o oVar9 = aVar14.f130844b;
                        i53.f fVarJ4 = i53.a.j(arrayList2);
                        g21.d dVar8 = cVar5.f87247b;
                        if (dVar8 != null) {
                        }
                        i53.f fVarJ5 = i53.a.j(arrayList3);
                        int i18 = (l42.f.f109941g << 15) | 2097152;
                        eVar5 = this.f81045h;
                        aVar5 = aVar14;
                        g21.a aVar110 = aVar4;
                        o0.a(oVar8, oVar9, z59, fVarJ4, vVar2, fVarJ5, eVar5, mVar2, i18);
                        if (z59) {
                            mVar2.C(-1987523989);
                            zR10 = mVar2.r(dVar6);
                            objQ11 = mVar2.q();
                            if (zR10) {
                                aVar6.getClass();
                                if (objQ11 == p3.m.a.f135155b) {
                                    objQ11 = new h(dVar6, 6);
                                    mVar2.K(objQ11);
                                }
                            } else {
                                objQ11 = new h(dVar6, 6);
                                mVar2.K(objQ11);
                            }
                            i15 = 0;
                            lg.d.b(cVar5, (e23.l) objQ11, mVar2, 0);
                            mVar2.f();
                        } else {
                            i15 = 0;
                            mVar2.C(-1987239533);
                            mVar2.f();
                        }
                        eVar6 = this.f81043f;
                        f21.c.a(aVar110, eVar6, mVar2, i15);
                        if (str2 == null) {
                            mVar2.C(-1986982792);
                            mVar2.f();
                        } else {
                            mVar2.C(-1986982791);
                            h4.r rVarF4 = x2.f(aVar15, 1.0f);
                            d92.b.f58625c.getClass();
                            h4.r rVarY4 = c2.l.y(rVarF4, j92.b.f97899b.f97920e);
                            String strW4 = gl1.d.W(str2);
                            d92.b.f58624b.getClass();
                            mh.c(strW4, rVarY4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar2), mVar2, 0, 0, 131068);
                            Unit unit4 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        eVar7 = this.f81042e;
                        if (z58) {
                            mVar2.C(-1986534965);
                            List<g21.x> list110 = cVar5.f87251f;
                            g21.x xVar4 = cVar5.f87249d;
                            k01.g gVar8 = (k01.g) fVar16.a();
                            List<g21.l> list111 = cVar5.f87253h;
                            g21.l lVar15 = cVar5.f87252g;
                            Integer num6 = cVar5.f87257l;
                            zR7 = mVar2.r(dVar6);
                            objQ8 = mVar2.q();
                            if (zR7) {
                                aVar6.getClass();
                                if (objQ8 == p3.m.a.f135155b) {
                                    objQ8 = new h(dVar6, 7);
                                    mVar2.K(objQ8);
                                }
                            } else {
                                objQ8 = new h(dVar6, 7);
                                mVar2.K(objQ8);
                            }
                            e23.l lVar16 = (e23.l) objQ8;
                            zR8 = mVar2.r(dVar6);
                            objQ9 = mVar2.q();
                            if (zR8) {
                                aVar6.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    objQ9 = new h(dVar6, 8);
                                    mVar2.K(objQ9);
                                }
                            } else {
                                objQ9 = new h(dVar6, 8);
                                mVar2.K(objQ9);
                            }
                            e23.l lVar17 = (e23.l) objQ9;
                            zR9 = mVar2.r(dVar6);
                            objQ10 = mVar2.q();
                            if (zR9) {
                                aVar6.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new h(dVar6, 9);
                                    mVar2.K(objQ10);
                                }
                            } else {
                                objQ10 = new h(dVar6, 9);
                                mVar2.K(objQ10);
                            }
                            a0.c(eVar7, aVar5, list110, xVar4, lVar16, arrayList2, gVar8, z29, list111, lVar15, lVar17, z57, list16, rVar2, (e23.l) objQ10, eVar6, eVar5, num6, mVar2, 0);
                            eVar8 = eVar7;
                            mVar2.f();
                            arrayList = arrayList2;
                            eVar9 = eVar6;
                            eVar10 = eVar5;
                        } else {
                            eVar8 = eVar7;
                            boolean z65 = z29;
                            mVar2.C(-1984966799);
                            x01.f fVar19 = eVar8.f188255d;
                            g21.l lVar18 = cVar5.f87252g;
                            List<g21.l> list112 = cVar5.f87253h;
                            Integer num7 = cVar5.f87257l;
                            zR6 = mVar2.r(dVar6);
                            objQ6 = mVar2.q();
                            if (zR6) {
                                aVar6.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new h(dVar6, 10);
                                    mVar2.K(objQ6);
                                }
                            } else {
                                objQ6 = new h(dVar6, 10);
                                mVar2.K(objQ6);
                            }
                            a0.b(fVar19, aVar5, arrayList2, z65, lVar18, list112, bVar2, eVar6, eVar5, num7, (e23.l) objQ6, mVar2, 134217728);
                            aVar5 = aVar5;
                            arrayList = arrayList2;
                            eVar9 = eVar6;
                            eVar10 = eVar5;
                            mVar2.f();
                        }
                        mVar2.y();
                        if (eVar8.f188255d != x01.f.NEVER) {
                            mVar2.C(-1122961440);
                            String strQ7 = gl1.y.Q(mVar2, R.string.lbl_meal_breakdown);
                            d92.b.f58624b.getClass();
                            x0 x0VarE7 = d92.c.e(j92.f.f97931h);
                            d92.b.f58625c.getClass();
                            j92.e eVar23 = j92.b.f97899b;
                            float f110 = eVar23.f97920e;
                            mh.c(strQ7, c2.l.B(aVar15, f110, eVar23.f97922g, f110, f110), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE7, mVar2, 0, 0, 131068);
                            f21.w.b(i21.d.I4(list15), eVar9, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-1122430007);
                            mVar2.f();
                        }
                        if (arrayList.isEmpty()) {
                            mVar2.C(-1122344261);
                            String strQ8 = gl1.y.Q(mVar2, R.string.lbl_weekly_breakdown);
                            d92.b.f58624b.getClass();
                            x0 x0VarE8 = d92.c.e(j92.f.f97931h);
                            d92.b.f58625c.getClass();
                            j92.e eVar24 = j92.b.f97899b;
                            float f111 = eVar24.f97920e;
                            mh.c(strQ8, c2.l.B(aVar15, f111, eVar24.f97922g, f111, f111), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE8, mVar2, 0, 0, 131068);
                            o82.a aVar111 = aVar3;
                            o82.a aVar21 = new o82.a((b63.o) r13.b.d(aVar5.f130843a, aVar111.f130843a), (b63.o) r13.b.e(aVar5.f130844b, aVar111.f130844b));
                            i53.f fVarJ6 = i53.a.j(arrayList);
                            fVar7 = this.f81046i;
                            zB = mVar2.B(fVar7);
                            objQ7 = mVar2.q();
                            if (zB) {
                                aVar6.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new d52.k(fVar7, 3);
                                    mVar2.K(objQ7);
                                }
                            } else {
                                objQ7 = new d52.k(fVar7, 3);
                                mVar2.K(objQ7);
                            }
                            a0.a(aVar21, fVarJ6, eVar9, eVar10, (e23.l) objQ7, mVar2, 4096);
                            mVar2.f();
                        } else {
                            mVar2.C(-1121408247);
                            mVar2.f();
                        }
                        mVar2.y();
                        return Unit.INSTANCE;
                    }
                    b63.o oVar10 = (b63.o) it8.next();
                    k01.l lVar19 = (k01.l) linkedHashMap.get(oVar10);
                    if (lVar19 == null) {
                        b63.i.INSTANCE.getClass();
                        lVar = new k01.l(oVar10, b63.q.e(oVar10, 6, b63.i.f16190d), (k01.k) null, (k01.k) null, 12, (p005kotlin.jvm.internal.j) null);
                    } else {
                        lVar = lVar19;
                    }
                    arrayList2.add(lVar);
                    bVarS3 = bVar2;
                    list13 = list13;
                }
                break;
        }
    }

    public /* synthetic */ d(o82.a aVar, i21.d dVar, i21.c cVar, x01.e eVar, v21.e eVar2, o82.a aVar2, pi0.e eVar3, n82.f fVar) {
        this.f81039b = aVar;
        this.f81040c = dVar;
        this.f81041d = cVar;
        this.f81042e = eVar;
        this.f81043f = eVar2;
        this.f81044g = aVar2;
        this.f81045h = eVar3;
        this.f81046i = fVar;
    }
}
