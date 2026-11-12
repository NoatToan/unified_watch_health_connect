package ng2;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import e23.p;
import e23.q;
import h2.c0;
import h2.u;
import h4.r;
import h5.e0;
import i3.o1;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import l72.v2;
import mg2.w;
import mt0.s1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r53.o2;
import rf2.l;
import yg2.h0;
import yg2.i0;
import yg2.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:190:0x0290  */
    /* JADX WARN: Code duplicated, block: B:192:0x029c  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:196:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:199:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:235:0x037d  */
    public static final void a(r rVar, final List<ag2.c> list, final Map<ag2.c.a, ah2.e> map, final Integer num, final o2<Boolean> o2Var, final o2<Boolean> o2Var2, final boolean z14, final o oVar, final h0 h0Var, final l lVar, final boolean z15, final bg2.h hVar, final zf2.d dVar, final boolean z16, final boolean z17, final q<? super ag2.c.a, ? super Double, ? super Boolean, String> qVar, final e23.l<? super qg2.c, Unit> lVar2, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final p<? super String, ? super bg2.h, Unit> pVar, m mVar, final int i14, final int i15, final int i16) {
        r rVar2;
        int i17;
        Map<ag2.c.a, ah2.e> map2;
        Integer num2;
        o2<Boolean> o2Var3;
        int i18;
        r rVar3;
        o0 o0Var;
        int i19;
        List list2;
        int i24;
        r rVarJ;
        r rVarK;
        float f14;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        int iNextIndex;
        boolean z26;
        boolean z27;
        List<cg2.a> listI;
        List<cg2.a> listK;
        list.getClass();
        map.getClass();
        o2Var.getClass();
        o2Var2.getClass();
        oVar.getClass();
        dVar.getClass();
        qVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-468917510);
        p3.c<?> cVar = o0VarE.f135177b;
        int i25 = i16 & 1;
        if (i25 != 0) {
            i17 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            map2 = map;
            i17 |= o0VarE.r(map2) ? 256 : 128;
        } else {
            map2 = map;
        }
        if ((i14 & 3072) == 0) {
            num2 = num;
            i17 |= o0VarE.B(num2) ? 2048 : 1024;
        } else {
            num2 = num;
        }
        if ((i14 & 24576) == 0) {
            o2Var3 = o2Var;
            i17 |= o0VarE.r(o2Var3) ? 16384 : 8192;
        } else {
            o2Var3 = o2Var;
        }
        if ((i14 & 196608) == 0) {
            i17 |= o0VarE.r(o2Var2) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= o0VarE.h(z14) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.r(oVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= o0VarE.r(h0Var) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.B(lVar) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i18 = i15 | (o0VarE.h(z15) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.r(hVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.k(dVar.ordinal()) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.h(z16) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.h(z17) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i18 |= o0VarE.r(qVar) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i18 |= o0VarE.r(lVar2) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i18 |= o0VarE.r(pVar) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 306783379) == 306783378) ? false : true)) {
            r rVar4 = i25 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            if (list.isEmpty()) {
                rVar3 = rVar4;
                o0 o0Var2 = o0VarE;
                o0Var2.C(2024862024);
                o0Var2.g0(false);
                o0Var = o0Var2;
            } else {
                o0VarE.C(2008451027);
                int i26 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).orientation;
                if (dVar == zf2.d.f204583b2 || dVar == zf2.d.f204585c2) {
                    i19 = 1;
                    list2 = list;
                } else {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z24 = false;
                                break;
                            } else if (((ag2.c) it.next()).a() == ag2.c.a.HEART_RATE_ZONE) {
                                z24 = true;
                                break;
                            }
                        }
                    } else {
                        z24 = false;
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!z24 && (h0Var != null || lVar != null)) {
                        arrayList.add(new ag2.c(ag2.c.a.HEART_RATE_ZONE.f3218a));
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (h0Var != null) {
                        if (h0Var.getExerciseName() == null || h0Var.getCategory() == null) {
                            i19 = 1;
                            z26 = h0Var.getDuration() != null;
                            if (h0Var.getPrimaryTarget() != null) {
                                z27 = z26;
                                if (h0Var.getPrimaryTarget().f114870a != mt2.i.NONE) {
                                    arrayList.add(new ag2.c(ag2.c.a.PRIMARY_TARGET.f3218a));
                                }
                                if (h0Var.getPrimaryTarget().f114870a == mt2.i.HEART_RATE_ZONE) {
                                    linkedHashSet.add(new ag2.c(ag2.c.a.HEART_RATE_ZONE.f3218a));
                                }
                            } else {
                                z27 = z26;
                            }
                            if (h0Var.getSecondaryTarget() != null) {
                                if (h0Var.getSecondaryTarget().f114870a != mt2.i.NONE) {
                                    arrayList.add(new ag2.c(ag2.c.a.SECONDARY_TARGET.f3218a));
                                }
                                if (h0Var.getSecondaryTarget().f114870a == mt2.i.HEART_RATE_ZONE) {
                                    linkedHashSet.add(new ag2.c(ag2.c.a.HEART_RATE_ZONE.f3218a));
                                }
                            }
                            listI = h0Var.i();
                            if ((listI == null && !listI.isEmpty()) || ((listK = h0Var.k()) != null && !listK.isEmpty())) {
                                arrayList.add(new ag2.c(ag2.c.a.MUSCLE_MAP.f3218a));
                            }
                            z25 = z27;
                        } else {
                            i19 = 1;
                            arrayList.add(0, new ag2.c(ag2.c.a.ANIMATED_WORKOUT.f3218a));
                        }
                        if (h0Var.getPrimaryTarget() != null) {
                            z27 = z26;
                            if (h0Var.getPrimaryTarget().f114870a != mt2.i.NONE) {
                                arrayList.add(new ag2.c(ag2.c.a.PRIMARY_TARGET.f3218a));
                            }
                            if (h0Var.getPrimaryTarget().f114870a == mt2.i.HEART_RATE_ZONE) {
                                linkedHashSet.add(new ag2.c(ag2.c.a.HEART_RATE_ZONE.f3218a));
                            }
                        } else {
                            z27 = z26;
                        }
                        if (h0Var.getSecondaryTarget() != null) {
                            if (h0Var.getSecondaryTarget().f114870a != mt2.i.NONE) {
                                arrayList.add(new ag2.c(ag2.c.a.SECONDARY_TARGET.f3218a));
                            }
                            if (h0Var.getSecondaryTarget().f114870a == mt2.i.HEART_RATE_ZONE) {
                                linkedHashSet.add(new ag2.c(ag2.c.a.HEART_RATE_ZONE.f3218a));
                            }
                        }
                        listI = h0Var.i();
                        if (listI == null) {
                            arrayList.add(new ag2.c(ag2.c.a.MUSCLE_MAP.f3218a));
                        } else {
                            arrayList.add(new ag2.c(ag2.c.a.MUSCLE_MAP.f3218a));
                        }
                        z25 = z27;
                    } else {
                        i19 = 1;
                        z25 = false;
                    }
                    ArrayList arrayListD1 = p13.h0.d1(p13.h0.z0(p13.h0.C0(list, arrayList), linkedHashSet));
                    list2 = arrayListD1;
                    if (z25) {
                        ListIterator listIterator = arrayListD1.listIterator(arrayListD1.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                ag2.c.a aVarA = ((ag2.c) listIterator.previous()).a();
                                if (aVarA != null) {
                                    switch (og2.i.a.f132041a[aVarA.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            iNextIndex = listIterator.nextIndex();
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            } else {
                                iNextIndex = -1;
                            }
                        }
                        arrayListD1.add(iNextIndex + 1, new ag2.c(ag2.c.a.STEP_DURATION.f3218a));
                        list2 = arrayListD1;
                    }
                }
                boolean zR = o0VarE.r(list2);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new ad.b(list2, 10);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ad.b(list2, 10);
                        o0VarE.K(objQ);
                    }
                }
                h2.b bVarB = h2.o0.b(0, (e23.a) objQ, o0VarE, 6, 2);
                boolean z28 = bVarB.o() > i19;
                r rVarC = x2.c(rVar4, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                rVar3 = rVar4;
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                final List list3 = list2;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                boolean z29 = z28;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                if (z17) {
                    r.a aVar4 = r.S;
                    w.f118432a.getClass();
                    fVar = fVar;
                    rVarK = x2.k(aVar4, w.f118434c);
                    i24 = 1;
                } else {
                    if (z29) {
                        r rVarA = b0Var.a(r.S, 1.0f, false);
                        w.f118432a.getClass();
                        i24 = 1;
                        rVarJ = x2.j(rVarA, 0.0f, w.f118434c, 1);
                    } else {
                        i24 = 1;
                        r.a aVar5 = r.S;
                        w.f118432a.getClass();
                        rVarJ = x2.j(aVar5, 0.0f, w.f118434c, 1);
                    }
                    rVarK = rVarJ;
                }
                if (i26 == i24) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97918c;
                } else {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97920e;
                }
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f15 = eVar2.f97920e;
                bVar2.getClass();
                float f16 = f14;
                final o2<Boolean> o2Var4 = o2Var3;
                final Integer num3 = num2;
                h5.g.a.f fVar2 = fVar;
                o0 o0Var3 = o0VarE;
                final Map<ag2.c.a, ah2.e> map3 = map2;
                u.a(bVarB, rVarK, c2.l.e(f15, 0.0f, eVar2.f97920e, 0.0f, 10), null, 1, f16, null, null, false, null, null, null, null, z3.f.c(1791231912, new e23.r() { // from class: ng2.g
                    /* JADX WARN: Code duplicated, block: B:29:0x0103  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, r53.o2] */
                    @Override // e23.r
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws FileNotFoundException {
                        qg2.c cVar2;
                        boolean z34;
                        h0 h0Var2;
                        boolean z35;
                        int i27;
                        h0 h0Var3;
                        Map map4;
                        i53.c<nt2.e> cVar3;
                        nt2.e eVar3;
                        int i28;
                        bg2.o oVar2;
                        String video;
                        String str;
                        i53.c<nt2.e> cVar4;
                        nt2.e eVar4;
                        String strH;
                        h0 h0Var4;
                        lt2.b primaryTarget;
                        int iIntValue = ((Integer) obj2).intValue();
                        m mVar2 = (m) obj3;
                        ((Integer) obj4).getClass();
                        ((c0) obj).getClass();
                        x1 x1Var3 = n.f135158a;
                        ag2.c.a aVarA2 = ((ag2.c) list3.get(iIntValue)).a();
                        if (aVarA2 == null) {
                            mVar2.C(1916705601);
                            mVar2.f();
                        } else {
                            mVar2.C(1916705602);
                            qg2.c.f144676b.getClass();
                            switch (qg2.c.a.C2728a.f144687a[aVarA2.ordinal()]) {
                                case 1:
                                    cVar2 = qg2.c.ELEVATION;
                                    break;
                                case 2:
                                    cVar2 = qg2.c.HEART_RATE;
                                    break;
                                case 3:
                                    cVar2 = qg2.c.SPEED;
                                    break;
                                case 4:
                                    cVar2 = qg2.c.POWER;
                                    break;
                                case 5:
                                    cVar2 = qg2.c.ROW_PACE;
                                    break;
                                case 6:
                                    cVar2 = qg2.c.GRADE_ADJUSTED_PACE;
                                    break;
                                case 7:
                                    cVar2 = qg2.c.PACE;
                                    break;
                                default:
                                    cVar2 = null;
                                    break;
                            }
                            Map map5 = map3;
                            boolean z36 = z14;
                            zf2.d dVar2 = dVar;
                            if (cVar2 == null) {
                                mVar2.C(1433758512);
                                mVar2.f();
                            } else {
                                mVar2.C(1433758513);
                                String str2 = cVar2.f144686a;
                                pg2.c cVar5 = new pg2.c(cVar2, o2Var4, o2Var2);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                pg2.b bVar3 = (pg2.b) v9.b.a(s0.f105811a.b(pg2.b.class), viewModelStoreOwnerA, str2, cVar5, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, mVar2);
                                r rVarC3 = x2.c(r.S, 1.0f);
                                ah2.e eVar5 = (ah2.e) map5.get(aVarA2);
                                rg2.b.f152669a.getClass();
                                String strA = rg2.b.a(aVarA2, z36, dVar2, mVar2);
                                og2.l lVar3 = (og2.l) p0.c(bVar3.f137620d.f132111f, mVar2, 0).getF182175a();
                                pg2.a aVar6 = (pg2.a) p0.c(bVar3.f137619c, mVar2, 0).getF182175a();
                                e23.l lVar4 = lVar2;
                                boolean zB = mVar2.B(lVar4) | mVar2.k(cVar2.ordinal());
                                Object objQ2 = mVar2.q();
                                if (zB) {
                                    objQ2 = new s1(14, lVar4, cVar2);
                                    mVar2.K(objQ2);
                                } else {
                                    m.f135153a.getClass();
                                    if (objQ2 == m.a.f135155b) {
                                        objQ2 = new s1(14, lVar4, cVar2);
                                        mVar2.K(objQ2);
                                    }
                                }
                                og2.c.a(rVarC3, cVar2, eVar5, strA, lVar3, aVar6, (e23.a) objQ2, mVar2, 6);
                                mVar2 = mVar2;
                                Unit unit = Unit.INSTANCE;
                                mVar2.f();
                            }
                            ag2.c.a aVar7 = ag2.c.a.MUSCLE_MAP;
                            h0 h0Var5 = h0Var;
                            if (aVarA2 == aVar7) {
                                mVar2.C(1434852162);
                                cg2.b.a(x2.c(r.S, 1.0f), h0Var5 != null ? h0Var5.i() : null, h0Var5 != null ? h0Var5.k() : null, mVar2, 6);
                                mVar2.f();
                            } else {
                                mVar2.C(1435150072);
                                mVar2.f();
                            }
                            ag2.c.a aVar8 = ag2.c.a.PRIMARY_TARGET;
                            Integer num4 = num3;
                            q qVar2 = qVar;
                            if (aVarA2 == aVar8) {
                                mVar2.C(-1616266854);
                                if (h0Var5 != null) {
                                    primaryTarget = h0Var5.getPrimaryTarget();
                                    h0Var4 = h0Var5;
                                } else {
                                    h0Var4 = h0Var5;
                                    primaryTarget = null;
                                }
                                if (primaryTarget == null) {
                                    mVar2.C(1435335079);
                                    mVar2.f();
                                    qVar2 = qVar2;
                                    z34 = z36;
                                    h0Var2 = h0Var4;
                                    num4 = num4;
                                } else {
                                    mt2.i iVar = primaryTarget.f114870a;
                                    mVar2.C(1435335080);
                                    if (iVar == mt2.i.POWER_ZONE || iVar == mt2.i.HEART_RATE_ZONE) {
                                        qVar2 = qVar2;
                                        z34 = z36;
                                        h0Var2 = h0Var4;
                                        num4 = num4;
                                        mVar2.C(211175099);
                                        ag2.c.a aVarF = zg2.f.f(iVar, dVar2);
                                        if (aVarF == null) {
                                            mVar2.C(211175098);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(211175099);
                                            sg2.r.b(x2.c(r.S, 1.0f), primaryTarget, (ah2.e) map5.get(aVarF), aVarF, dVar2, mVar2, 6);
                                            Unit unit2 = Unit.INSTANCE;
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    } else {
                                        mVar2.C(211879047);
                                        ag2.c.a aVarF2 = zg2.f.f(iVar, dVar2);
                                        if (aVarF2 == null) {
                                            mVar2.C(211879046);
                                            mVar2.f();
                                            z34 = z36;
                                            h0Var2 = h0Var4;
                                        } else {
                                            mVar2.C(211879047);
                                            r rVarC4 = x2.c(r.S, 1.0f);
                                            ah2.e eVar6 = (ah2.e) map5.get(aVarF2);
                                            rg2.b.f152669a.getClass();
                                            m mVar3 = mVar2;
                                            h0Var2 = h0Var4;
                                            sg2.r.a(rVarC4, primaryTarget, eVar6, num4, aVarF2, z36, rg2.b.a(aVarF2, z36, dVar2, mVar2), qVar2, mVar3, 6);
                                            z34 = z36;
                                            mVar2 = mVar3;
                                            Unit unit3 = Unit.INSTANCE;
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    }
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                qVar2 = qVar2;
                                z34 = z36;
                                h0Var2 = h0Var5;
                                num4 = num4;
                                mVar2.C(1437371160);
                                mVar2.f();
                            }
                            if (aVarA2 == ag2.c.a.SECONDARY_TARGET) {
                                mVar2.C(-1616195078);
                                lt2.b secondaryTarget = h0Var2 != null ? h0Var2.getSecondaryTarget() : null;
                                if (secondaryTarget == null) {
                                    mVar2.C(1437560135);
                                    mVar2.f();
                                    z35 = z34;
                                } else {
                                    mt2.i iVar2 = secondaryTarget.f114870a;
                                    mVar2.C(1437560136);
                                    if (iVar2 == mt2.i.POWER_ZONE || iVar2 == mt2.i.HEART_RATE_ZONE) {
                                        z35 = z34;
                                        mVar2.C(707356698);
                                        ag2.c.a aVarF3 = zg2.f.f(iVar2, dVar2);
                                        if (aVarF3 == null) {
                                            mVar2.C(707356697);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(707356698);
                                            sg2.r.b(x2.c(r.S, 1.0f), secondaryTarget, (ah2.e) map5.get(aVarF3), aVarF3, dVar2, mVar2, 6);
                                            Unit unit4 = Unit.INSTANCE;
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    } else {
                                        mVar2.C(708060646);
                                        ag2.c.a aVarF4 = zg2.f.f(iVar2, dVar2);
                                        if (aVarF4 == null) {
                                            mVar2.C(708060645);
                                            mVar2.f();
                                            z35 = z34;
                                        } else {
                                            mVar2.C(708060646);
                                            r rVarC5 = x2.c(r.S, 1.0f);
                                            ah2.e eVar7 = (ah2.e) map5.get(aVarF4);
                                            rg2.b.f152669a.getClass();
                                            String strA2 = rg2.b.a(aVarF4, z34, dVar2, mVar2);
                                            Integer num5 = num4;
                                            m mVar4 = mVar2;
                                            boolean z37 = z34;
                                            sg2.r.a(rVarC5, secondaryTarget, eVar7, num5, aVarF4, z37, strA2, qVar2, mVar4, 6);
                                            z35 = z37;
                                            mVar2 = mVar4;
                                            Unit unit5 = Unit.INSTANCE;
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    }
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                z35 = z34;
                                mVar2.C(1439596216);
                                mVar2.f();
                            }
                            ag2.c.a aVar9 = ag2.c.a.STEP_DURATION;
                            boolean z38 = z15;
                            if (aVarA2 == aVar9) {
                                mVar2.C(-1616123049);
                                lt2.a duration = h0Var2 != null ? h0Var2.getDuration() : null;
                                if (duration == null) {
                                    mVar2.C(1439793034);
                                    mVar2.f();
                                } else {
                                    mt2.c cVar6 = duration.f114866a;
                                    mVar2.C(1439793035);
                                    if (cVar6 == mt2.c.HEART_RATE || cVar6 == mt2.c.POWER) {
                                        mVar2.C(-2125380539);
                                        ag2.c.a aVarE = cVar6 != null ? zg2.f.e(cVar6, z38) : null;
                                        if (aVarE == null) {
                                            mVar2.C(-2125380540);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-2125380539);
                                            r rVarC6 = x2.c(r.S, 1.0f);
                                            ah2.e eVar8 = (ah2.e) map5.get(aVarE);
                                            rg2.b.f152669a.getClass();
                                            sg2.r.c(rVarC6, duration, eVar8, aVarE, rg2.b.a(aVarE, z35, dVar2, mVar2), mVar2, 6);
                                            Unit unit6 = Unit.INSTANCE;
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-2124384354);
                                        ag2.c.a aVarE2 = cVar6 != null ? zg2.f.e(cVar6, z38) : null;
                                        if (aVarE2 == null) {
                                            mVar2.C(-2124384355);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-2124384354);
                                            if (cVar6 == mt2.c.LAP_BUTTON) {
                                                strH = sn.a.h(mVar2, 1367666656, R.string.until_lap_button_press, mVar2);
                                            } else {
                                                mVar2.C(1367905852);
                                                mVar2.f();
                                                i0 i0Var = h0Var2.f197040g;
                                                if (i0Var == null || (cVar4 = i0Var.f197055c) == null || (eVar4 = (nt2.e) p13.h0.d0(cVar4)) == null) {
                                                    str = null;
                                                } else {
                                                    strH = eVar4.f127844a;
                                                }
                                                r rVarC7 = x2.c(r.S, 1.0f);
                                                ah2.e eVar9 = (ah2.e) map5.get(aVarE2);
                                                rg2.b.f152669a.getClass();
                                                m mVar5 = mVar2;
                                                sg2.o.a(rVarC7, duration, eVar9, str, aVarE2, rg2.b.a(aVarE2, z35, dVar2, mVar5), mVar5, 6);
                                                mVar2 = mVar5;
                                                Unit unit7 = Unit.INSTANCE;
                                                mVar2.f();
                                            }
                                            str = strH;
                                            r rVarC8 = x2.c(r.S, 1.0f);
                                            ah2.e eVar10 = (ah2.e) map5.get(aVarE2);
                                            rg2.b.f152669a.getClass();
                                            m mVar6 = mVar2;
                                            sg2.o.a(rVarC8, duration, eVar10, str, aVarE2, rg2.b.a(aVarE2, z35, dVar2, mVar6), mVar6, 6);
                                            mVar2 = mVar6;
                                            Unit unit8 = Unit.INSTANCE;
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    }
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                mVar2.C(1442379768);
                                mVar2.f();
                            }
                            if (aVarA2 == ag2.c.a.ANIMATED_WORKOUT) {
                                mVar2.C(-1616031995);
                                if (h0Var2 == null) {
                                    mVar2.C(1442615708);
                                    mVar2.f();
                                    i27 = 6;
                                } else {
                                    mVar2.C(1442615709);
                                    bg2.h hVar2 = hVar;
                                    if (hVar2 != null) {
                                        mVar2.C(1200748052);
                                        List<bg2.o> listI2 = hVar2.i();
                                        if (listI2 == null || (oVar2 = (bg2.o) p13.h0.d0(listI2)) == null || (video = oVar2.getVideo()) == null) {
                                            i28 = 6;
                                            mVar2.f();
                                        } else {
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
                                            r rVarC9 = x2.c(r.S, 1.0f);
                                            i iVar3 = new i(h0Var2, 0, pVar, hVar2);
                                            boolean z39 = z16;
                                            i28 = 6;
                                            o1.a(v2.a(rVarC9, z39, iVar3, mVar2, 6), hVarA, null, null, z3.f.c(1393916411, new j(video, z39), mVar2), mVar2, 196608, 28);
                                            mVar2.f();
                                            Unit unit9 = Unit.INSTANCE;
                                        }
                                        i27 = i28;
                                    } else {
                                        i27 = 6;
                                        mVar2.C(1202217824);
                                        lt2.a duration2 = h0Var2.getDuration();
                                        if (duration2 == null) {
                                            mVar2.C(1202217823);
                                            mVar2.f();
                                            i27 = 6;
                                        } else {
                                            mt2.c cVar7 = duration2.f114866a;
                                            mVar2.C(1202217824);
                                            if (cVar7 == mt2.c.HEART_RATE || cVar7 == mt2.c.POWER) {
                                                mVar2.C(-1701613961);
                                                ag2.c.a aVarE3 = cVar7 != null ? zg2.f.e(cVar7, z38) : null;
                                                if (aVarE3 == null) {
                                                    mVar2.C(-1701613962);
                                                    mVar2.f();
                                                } else {
                                                    mVar2.C(-1701613961);
                                                    r rVarC10 = x2.c(r.S, 1.0f);
                                                    ah2.e eVar11 = (ah2.e) map5.get(aVarE3);
                                                    rg2.b.f152669a.getClass();
                                                    sg2.r.c(rVarC10, duration2, eVar11, aVarE3, rg2.b.a(aVarE3, z35, dVar2, mVar2), mVar2, 6);
                                                    Unit unit10 = Unit.INSTANCE;
                                                    mVar2.f();
                                                }
                                                mVar2.f();
                                            } else {
                                                mVar2.C(-1700509493);
                                                ag2.c.a aVarE4 = cVar7 != null ? zg2.f.e(cVar7, z38) : null;
                                                if (aVarE4 == null) {
                                                    mVar2.C(-1700509494);
                                                    mVar2.f();
                                                } else {
                                                    mVar2.C(-1700509493);
                                                    r rVarC11 = x2.c(r.S, 1.0f);
                                                    ah2.e eVar12 = (ah2.e) map5.get(aVarE4);
                                                    i0 i0Var2 = h0Var2.f197040g;
                                                    String str3 = (i0Var2 == null || (cVar3 = i0Var2.f197055c) == null || (eVar3 = (nt2.e) p13.h0.d0(cVar3)) == null) ? null : eVar3.f127844a;
                                                    rg2.b.f152669a.getClass();
                                                    m mVar7 = mVar2;
                                                    sg2.o.a(rVarC11, duration2, eVar12, str3, aVarE4, rg2.b.a(aVarE4, z35, dVar2, mVar7), mVar7, 6);
                                                    mVar2 = mVar7;
                                                    Unit unit11 = Unit.INSTANCE;
                                                    mVar2.f();
                                                }
                                                mVar2.f();
                                            }
                                            Unit unit12 = Unit.INSTANCE;
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    }
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                i27 = 6;
                                mVar2.C(1446630488);
                                mVar2.f();
                            }
                            if (aVarA2 == ag2.c.a.HEART_RATE_ZONE) {
                                mVar2.C(1446705043);
                                sg2.s.a(x2.c(r.S, 1.0f), (ah2.e) map5.get(aVarA2), mVar2, i27);
                                mVar2.f();
                            } else {
                                mVar2.C(1446925112);
                                mVar2.f();
                            }
                            if (aVarA2 == ag2.c.a.BREATHWORK) {
                                mVar2.C(1447001558);
                                m mVar8 = mVar2;
                                h0Var3 = h0Var2;
                                sg2.b.a(x2.c(r.S, 1.0f), oVar, h0Var3, map5, (fg2.c) KoinJavaComponent.get$default(fg2.c.class, null, null, i27, null), aVar, mVar8, 6);
                                map4 = map5;
                                mVar2 = mVar8;
                                mVar2.f();
                            } else {
                                h0Var3 = h0Var2;
                                map4 = map5;
                                mVar2.C(1447434008);
                                mVar2.f();
                            }
                            if (aVarA2 == ag2.c.a.MEDITATION_CARD) {
                                mVar2.C(1447535657);
                                m mVar9 = mVar2;
                                sg2.l.a(x2.c(r.S, 1.0f), map4, h0Var3, aVar2, mVar9, 6);
                                mVar2 = mVar9;
                                mVar2.f();
                            } else {
                                mVar2.C(1447817912);
                                mVar2.f();
                            }
                            Unit unit13 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var3), o0Var3, 24576, 24576, 16328);
                r.a aVar6 = r.S;
                bVar2.getClass();
                c2.l.f(x2.k(aVar6, eVar2.f97918c), o0Var3);
                if (z29) {
                    o0Var3.C(-93876141);
                    r rVarF = x2.f(x2.x(aVar6, null, 3), 1.0f);
                    s2 s2VarA = q2.a(c2.j.f22696f, h4.d.a.f81535m, o0Var3, 54);
                    x1 x1Var3 = n.f135158a;
                    int iHashCode2 = Long.hashCode(o0Var3.U);
                    i2 i2VarA1 = o0Var3.a0();
                    r rVarC3 = h4.k.c(rVarF, o0Var3);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar3);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(eVar, s2VarA, o0Var3);
                    b4.c(c1623g, i2VarA1, o0Var3);
                    if (o0Var3.T || !s.g(o0Var3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var3, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC3, o0Var3);
                    u2 u2Var = u2.f22900a;
                    p82.e.a(bVarB, null, bVarB.o(), 0, 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0Var3, 0, 1018);
                    z19 = true;
                    o0Var3.g0(true);
                    z18 = false;
                    o0Var3.g0(false);
                } else {
                    z18 = false;
                    z19 = true;
                    o0Var3.C(-93409095);
                    o0Var3.g0(false);
                }
                bVar2.getClass();
                c2.l.f(x2.k(aVar6, eVar2.f97918c), o0Var3);
                o0Var3.g0(z19);
                o0Var3.g0(z18);
                o0Var = o0Var3;
            }
        } else {
            o0 o0Var4 = o0VarE;
            o0Var4.e();
            rVar3 = rVar2;
            o0Var = o0Var4;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final r rVar5 = rVar3;
            p2VarI0.f135219d = new p() { // from class: ng2.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    k.a(rVar5, list, map, num, o2Var, o2Var2, z14, oVar, h0Var, lVar, z15, hVar, dVar, z16, z17, qVar, lVar2, aVar, aVar2, pVar, (m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
