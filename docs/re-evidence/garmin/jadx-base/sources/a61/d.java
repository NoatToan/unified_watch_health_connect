package a61;

import android.content.DialogInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import aq.k2;
import b21.s4;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.racepredictor.presentation.activity.RacePredictorTrendsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewCompatibleActivityListActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewMultisportWorkoutActivity;
import i3.mh;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o4.v0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.c1;
import p3.p0;
import p3.x1;
import r53.p2;
import u1.y0;
import uf2.r0;
import w52.u0;
import yr.o0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1559b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f1558a = i14;
        this.f1559b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:215:0x063e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0648  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:264:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:269:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:323:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0652 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14;
        Object value;
        u21.m mVar;
        ArrayList arrayList;
        int i14;
        int i15;
        Object value2;
        Set set;
        Object value3;
        boolean z15;
        int i16;
        ArrayList arrayList2;
        Object value4;
        int i17 = 5;
        int i18 = 10;
        int iCompareTo = 0;
        iCompareTo = 0;
        iCompareTo = 0;
        iCompareTo = 0;
        iCompareTo = 0;
        iCompareTo = 0;
        iCompareTo = 0;
        boolean z16 = true;
        switch (this.f1558a) {
            case 0:
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.f1559b;
                o61.i iVar = (o61.i) obj;
                o61.i iVar2 = (o61.i) obj2;
                e eVar = e.f1563a;
                iVar.getClass();
                iVar2.getClass();
                try {
                    String str = iVar.f129595a;
                    String str2 = iVar2.f129595a;
                    if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                        Date date = simpleDateFormat.parse(str);
                        Date date2 = simpleDateFormat.parse(str2);
                        if (date != null && date2 != null) {
                            iCompareTo = date.compareTo(date2);
                        }
                    }
                    break;
                } catch (ParseException e4) {
                    i2.a.j(i2.f36769a, "PerformanceStatsUtil", "HRV Score Sort: " + e4.getMessage());
                }
                return Integer.valueOf(iCompareTo);
            case 1:
                ((Integer) obj2).getClass();
                af0.f.b((af0.h) this.f1559b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ak0.g0.a((com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.c) this.f1559b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                aq.c0 c0Var = (aq.c0) this.f1559b;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i19 = aq.c0.f11852i;
                p3.m.a aVar = p3.m.f135153a;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (p005kotlin.jvm.internal.s.g(o53.f0.G(c0Var.v6().f11999j, mVar2).getF182175a(), Boolean.TRUE)) {
                        mVar2.C(-1624151591);
                        Double d14 = c0Var.v6().f12003n;
                        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                        boolean zY = ((f12.l) c0Var.f11853a.getValue()).y();
                        aq.i0 i0VarV6 = c0Var.v6();
                        boolean zR = mVar2.r(i0VarV6);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new aq.g0(i0VarV6);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new aq.g0(i0VarV6);
                                mVar2.K(objQ);
                            }
                        }
                        e23.l lVar = (e23.l) ((k23.g) objQ);
                        aq.i0 i0VarV7 = c0Var.v6();
                        boolean zR2 = mVar2.r(i0VarV7);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new aq.h0(i0VarV7);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new aq.h0(i0VarV7);
                                mVar2.K(objQ2);
                            }
                        }
                        k2.a(dDoubleValue, zY, lVar, (e23.a) ((k23.g) objQ2), mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-1623827734);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                at.e.a((vs.e) this.f1559b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                au0.z zVar = (au0.z) this.f1559b;
                rs2.c cVar = (rs2.c) obj;
                kk2.a aVar2 = (kk2.a) obj2;
                int i24 = au0.z.f13001t;
                cVar.getClass();
                aVar2.getClass();
                of2.c0 c0Var2 = zVar.f13003b;
                r0 r0Var = new r0(cVar, aVar2, c0Var2.f131773b, c0Var2.f131774c);
                Set<Integer> configurationFlags = cVar.getConfigurationFlags();
                if ((configurationFlags instanceof Collection) && configurationFlags.isEmpty()) {
                    return null;
                }
                Iterator<T> it = configurationFlags.iterator();
                while (it.hasNext()) {
                    if (r0Var.f170479j.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                        return r0Var;
                    }
                }
                return null;
            case 6:
                ((Integer) obj2).getClass();
                au0.m0.b bVar = au0.m0.f12967d;
                ((au0.m0) this.f1559b).u6((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                aw.d dVar = (aw.d) this.f1559b;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i25 = aw.d.f13318f;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar3, R.string.device_settings_vector_code_low_battery_title);
                    String strQ2 = gl1.y.Q(mVar3, R.string.sensor_indicator_low_battery_description);
                    int i26 = h82.c.f82429e << 15;
                    dVar.h(strQ, strQ2, null, 0, null, mVar3, i26);
                    dVar.h(gl1.y.Q(mVar3, R.string.sensor_indicator_updating), gl1.y.Q(mVar3, R.string.sensor_indicator_updating_description), null, 0, null, mVar3, i26);
                    dVar.h(gl1.y.Q(mVar3, R.string.sensor_indicator_successful_update), gl1.y.Q(mVar3, R.string.sensor_indicator_successful_update_description), null, 0, null, mVar3, i26);
                    dVar.h(gl1.y.Q(mVar3, R.string.sensor_indicator_unsuccessful_update), gl1.y.Q(mVar3, R.string.sensor_indicator_unsuccessful_update_description), null, 0, null, mVar3, i26);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                u21.n nVar = (u21.n) this.f1559b;
                int iIntValue3 = ((Integer) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                p2 p2Var = nVar.f168044b;
                if (!zBooleanValue) {
                    List<s21.i> list = ((u21.m) p2Var.getValue()).f168038a;
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        i15 = 0;
                        while (it3.hasNext()) {
                            if (((s21.i) it3.next()).f156128d && (i15 = i15 + 1) < 0) {
                                p13.x.p();
                                throw null;
                            }
                        }
                    } else {
                        i15 = 0;
                    }
                    z14 = true;
                    Object[] objArr = i15 == 1;
                    if (nVar.f168043a || !objArr == true) {
                        do {
                            value = p2Var.getValue();
                            mVar = (u21.m) value;
                            List<s21.i> list2 = mVar.f168038a;
                            arrayList = new ArrayList(p13.y.r(list2, 10));
                            for (s21.i iVar3 : list2) {
                                i14 = iVar3.f156125a;
                                if (i14 == iIntValue3) {
                                    iVar3 = new s21.i(i14, iVar3.f156126b, iVar3.f156127c, zBooleanValue);
                                }
                                arrayList.add(iVar3);
                            }
                        } while (!p2Var.b(value, u21.m.a(mVar, arrayList, false, false, 6)));
                    } else {
                        while (true) {
                            Object value5 = p2Var.getValue();
                            if (!p2Var.b(value5, u21.m.a((u21.m) value5, null, z14, false, 5))) {
                                z14 = true;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                z14 = true;
                if (nVar.f168043a) {
                    do {
                        value = p2Var.getValue();
                        mVar = (u21.m) value;
                        List<s21.i> list3 = mVar.f168038a;
                        arrayList = new ArrayList(p13.y.r(list3, 10));
                        while (r5.hasNext()) {
                            i14 = iVar3.f156125a;
                            if (i14 == iIntValue3) {
                                iVar3 = new s21.i(i14, iVar3.f156126b, iVar3.f156127c, zBooleanValue);
                            }
                            arrayList.add(iVar3);
                        }
                    } while (!p2Var.b(value, u21.m.a(mVar, arrayList, false, false, 6)));
                } else {
                    do {
                        value = p2Var.getValue();
                        mVar = (u21.m) value;
                        List<s21.i> list4 = mVar.f168038a;
                        arrayList = new ArrayList(p13.y.r(list4, 10));
                        while (r5.hasNext()) {
                            i14 = iVar3.f156125a;
                            if (i14 == iIntValue3) {
                                iVar3 = new s21.i(i14, iVar3.f156126b, iVar3.f156127c, zBooleanValue);
                            }
                            arrayList.add(iVar3);
                        }
                    } while (!p2Var.b(value, u21.m.a(mVar, arrayList, false, false, 6)));
                }
                return Unit.INSTANCE;
            case 9:
                f11.f fVar = (f11.f) this.f1559b;
                Double d15 = (Double) obj;
                d15.getClass();
                a11.r rVar = (a11.r) obj2;
                rVar.getClass();
                p2 p2Var2 = fVar.f67921f;
                while (true) {
                    Object value6 = p2Var2.getValue();
                    d11.i iVar4 = (d11.i) value6;
                    p2 p2Var3 = p2Var2;
                    if (p2Var3.b(value6, d11.i.a(iVar4, d11.g.a(iVar4.f57080b, null, null, null, d15, null, 23), null, null, rVar, d11.e.a(iVar4.f57084f, false, false, false, false, false, false, false, 125), null, false, false, false, false, null, 4045))) {
                        fVar.f67920e.A(rVar);
                        return Unit.INSTANCE;
                    }
                    p2Var2 = p2Var3;
                }
                break;
            case 10:
                i21.d dVar2 = (i21.d) this.f1559b;
                b11.i iVar5 = (b11.i) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                iVar5.getClass();
                String f14315a = iVar5.getF14315a();
                if (f14315a != null) {
                    dVar2.getClass();
                    p2 p2Var4 = dVar2.f87287t;
                    do {
                        value2 = p2Var4.getValue();
                        set = (Set) value2;
                    } while (!p2Var4.b(value2, zBooleanValue2 ? c1.i(set, f14315a) : c1.f(set, f14315a)));
                }
                return Unit.INSTANCE;
            case 11:
                x11.l lVar2 = (x11.l) this.f1559b;
                v11.b.e eVar2 = (v11.b.e) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                eVar2.getClass();
                v11.c cVar2 = eVar2.f174678c;
                LinkedHashMap linkedHashMap = lVar2.f188440g;
                Iterable<v11.b.e> iterable = (List) linkedHashMap.get(cVar2);
                if (iterable == null) {
                    iterable = p13.j0.f134944a;
                }
                ArrayList arrayList3 = new ArrayList(p13.y.r(iterable, 10));
                for (v11.b.e eVarA : iterable) {
                    if (eVarA.f174679d.equals(eVar2.f174679d) && p005kotlin.jvm.internal.s.g(eVarA.f174676a.getF14238e().f14253a, eVar2.f174676a.getF14238e().f14253a)) {
                        eVarA = v11.b.e.a(eVarA, null, zBooleanValue3, 13);
                    }
                    arrayList3.add(eVarA);
                }
                linkedHashMap.put(cVar2, arrayList3);
                p2 p2Var5 = lVar2.f188442i;
                do {
                    value3 = p2Var5.getValue();
                } while (!p2Var5.b(value3, x11.k.a((x11.k) value3, false, lVar2.B4(), lVar2.y4(), 3)));
                return Unit.INSTANCE;
            case 12:
                q21.b bVar2 = (q21.b) this.f1559b;
                long jLongValue = ((Long) obj).longValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                p2 p2Var6 = bVar2.f142215f;
                while (true) {
                    Object value7 = p2Var6.getValue();
                    q21.a aVarA = (q21.a) value7;
                    Integer num = aVarA.f142202a;
                    if (num != null) {
                        int iIntValue5 = num.intValue();
                        List<o21.d> list5 = aVarA.f142203b;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list5, i18));
                        for (o21.d dVarA : list5) {
                            if (dVarA.f128658a == jLongValue) {
                                arrayList2 = arrayList4;
                                i16 = iIntValue5;
                                dVarA = o21.d.a(dVarA, iIntValue4, null, null, null, null, 123);
                            } else {
                                i16 = iIntValue5;
                                arrayList2 = arrayList4;
                            }
                            arrayList2.add(dVarA);
                            arrayList4 = arrayList2;
                            iIntValue5 = i16;
                            z16 = z16;
                        }
                        z15 = z16;
                        ArrayList arrayListX4 = bVar2.x4(iIntValue5, arrayList4);
                        ArrayList arrayList5 = new ArrayList(p13.y.r(arrayListX4, 10));
                        Iterator it4 = arrayListX4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(Integer.valueOf(((o21.d) it4.next()).f128660c));
                        }
                        aVarA = q21.a.a(aVarA, arrayListX4, false, false, false, !arrayList5.equals(bVar2.f142210a), 29);
                    } else {
                        z15 = z16;
                    }
                    if (p2Var6.b(value7, aVarA)) {
                        return Unit.INSTANCE;
                    }
                    z16 = z15;
                    i18 = 10;
                }
                break;
            case 13:
                u21.c0 c0Var3 = (u21.c0) this.f1559b;
                s21.n nVar2 = (s21.n) obj;
                String str3 = (String) obj2;
                nVar2.getClass();
                str3.getClass();
                v21.f.f175333a.getClass();
                Double dV = v21.f.v(str3);
                List<s21.n> list6 = ((u21.a0) c0Var3.f167916d.getValue()).f167892b.f156160b;
                ArrayList arrayList6 = new ArrayList(p13.y.r(list6, 10));
                for (s21.n nVarB : list6) {
                    if (p005kotlin.jvm.internal.s.g(nVarB, nVar2)) {
                        nVarB = s21.n.b(nVarB, false, dV, 0, 55);
                    }
                    arrayList6.add(nVarB);
                }
                c0Var3.y4(arrayList6, false);
                return Unit.INSTANCE;
            case 14:
                u21.l lVar3 = (u21.l) this.f1559b;
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                p2 p2Var7 = lVar3.f168026b;
                ArrayList arrayListD1 = p13.h0.d1(((u21.i) p2Var7.getValue()).f168000a);
                if (iIntValue6 >= 0 && iIntValue6 < arrayListD1.size() && iIntValue7 >= 0 && iIntValue7 < arrayListD1.size()) {
                    arrayListD1.add(iIntValue7, arrayListD1.remove(iIntValue6));
                    do {
                        value4 = p2Var7.getValue();
                    } while (!p2Var7.b(value4, u21.i.a((u21.i) value4, u21.l.x4(u21.l.z4(u21.l.y4(arrayListD1))), null, false, null, null, 30)));
                }
                return Unit.INSTANCE;
            case 15:
                b82.j.a aVar3 = (b82.j.a) this.f1559b;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                b82.j jVar = b82.j.f16611a;
                if (mVar4.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String str4 = aVar3.f16614c;
                    if (str4 == null) {
                        str4 = aVar3.f16613b;
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 16:
                RacePredictorTrendsActivity racePredictorTrendsActivity = (RacePredictorTrendsActivity) this.f1559b;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i27 = RacePredictorTrendsActivity.f41087a;
                if (mVar5.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    mVar5.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar5);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(gd1.a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar5, 0), null);
                    mVar5.R();
                    gd1.a aVar4 = (gd1.a) u1VarResolveViewModel;
                    z02.b.a(false, null, null, null, false, z3.f.c(492497184, new bd1.a(racePredictorTrendsActivity, aVar4, s9.c.c(aVar4.f76968e, mVar5)), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 17:
                bk0.f fVar2 = (bk0.f) this.f1559b;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    v0 v0Var = fVar2.f18482e;
                    if (v0Var == null) {
                        mVar6.C(1634875998);
                        mVar6.f();
                    } else {
                        mVar6.C(1634875999);
                        h4.r rVarQ = x2.q(h4.r.S, wz1.b.f188181a);
                        f5.k.f68985a.getClass();
                        y0.c(v0Var, null, rVarQ, f5.k.a.f68987b, mVar6, 24624, 232);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                bl2.b bVar3 = (bl2.b) this.f1559b;
                Long l14 = (Long) obj;
                long jLongValue2 = l14.longValue();
                long jLongValue3 = ((Long) obj2).longValue();
                wk2.i iVar6 = bVar3.f18603d;
                iVar6.getClass();
                if (iVar6.getF205153c() != null) {
                    zk2.k kVar = iVar6 instanceof zk2.k ? (zk2.k) iVar6 : null;
                    if (kVar != null) {
                        kVar.f205165o = jLongValue2;
                    }
                }
                bl2.o oVar = bVar3.f18607h;
                wk2.i iVar7 = bVar3.f18603d;
                bl2.o.b bVar4 = oVar.f18693a;
                iVar7.getClass();
                if (oVar.f18695c.compareAndSet(false, true)) {
                    bVar4.k(iVar7, new s4(oVar, 17));
                }
                bVar4.m(iVar7, jLongValue2, jLongValue3);
                bl2.z zVar2 = bVar3.f18609j;
                synchronized (zVar2.f18754c) {
                    if (zVar2.f18757f == null) {
                        zVar2.f18757f = l14;
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                bp0.a.a((ap0.g) this.f1559b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                lr2.d dVar3 = (lr2.d) this.f1559b;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                br2.c cVar3 = br2.c.f19585a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                dVar3.invoke();
                return Unit.INSTANCE;
            case 21:
                ij0.b bVar5 = (ij0.b) this.f1559b;
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                br2.c cVar4 = br2.c.f19585a;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                bVar5.invoke();
                return Unit.INSTANCE;
            case 22:
                ij0.b bVar6 = (ij0.b) this.f1559b;
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                br2.c cVar5 = br2.c.f19585a;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                bVar6.invoke();
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                bv1.e.b((av1.b) this.f1559b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                vu1.w wVar = (vu1.w) this.f1559b;
                long jLongValue4 = ((Long) obj).longValue();
                hv1.c cVar6 = (hv1.c) obj2;
                cVar6.getClass();
                wVar.D0(jLongValue4, cVar6);
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                bv2.n.a((o0) this.f1559b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                h4.d dVar4 = (h4.d) this.f1559b;
                g6.m.f76012b.getClass();
                return g6.k.a(dVar4.a(0L, ((g6.m) obj).f76013a, (g6.o) obj2));
            case 27:
                com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) this.f1559b;
                ((Long) obj).getClass();
                ((com.garmin.android.apps.connectmobile.courses.model.f) obj2).getClass();
                return gVar;
            case 28:
                ViewCompatibleActivityListActivity viewCompatibleActivityListActivity = (ViewCompatibleActivityListActivity) this.f1559b;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ViewCompatibleActivityListActivity.a aVar5 = ViewCompatibleActivityListActivity.f48480a;
                if (mVar7.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar7, R.string.compatible_activities_title);
                    boolean zR3 = mVar7.r(viewCompatibleActivityListActivity);
                    Object objQ3 = mVar7.q();
                    if (zR3) {
                        objQ3 = new c32.k(viewCompatibleActivityListActivity, i17);
                        mVar7.K(objQ3);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new c32.k(viewCompatibleActivityListActivity, i17);
                            mVar7.K(objQ3);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ3, null, strQ3, mVar7, null);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            default:
                ViewMultisportWorkoutActivity viewMultisportWorkoutActivity = (ViewMultisportWorkoutActivity) this.f1559b;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ViewMultisportWorkoutActivity.a aVar6 = ViewMultisportWorkoutActivity.f48481g;
                if (mVar8.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    u0.f(z3.f.c(1334884758, new aa2.f(14, viewMultisportWorkoutActivity, gl1.y.I(new lc.v0[0], mVar8)), mVar8), mVar8, 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Object obj, int i14, int i15) {
        this.f1558a = i15;
        this.f1559b = obj;
    }
}
