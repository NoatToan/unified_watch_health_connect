package ov1;

import android.app.RemoteAction;
import android.content.Context;
import android.content.DialogInterface;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import com.garmin.android.apps.connectmobile.devices.sensors.SensorsActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.onboarding.komoot.KomootConsentActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.follow.block.FollowBlockedUsersActivity;
import com.google.accompanist.drawablepainter.DrawablePainter2Kt;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import cw1.d1;
import f4.h0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l72.p2;
import o4.d0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import ov1.r.d;
import p005kotlin.Unit;
import p1.h1;
import p1.i1;
import p1.t0;
import p1.u0;
import p3.b4;
import p3.f3;
import p3.i2;
import p3.k1;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.s2;
import p3.x1;
import p3.z2;
import p40.o0;
import po.h.b;
import qb1.a0;
import u1.y0;
import v62.s9;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f134212b;

    public /* synthetic */ q(Object obj, int i14) {
        this.f134211a = i14;
        this.f134212b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        jn0.a aVar = (jn0.a) this.f134212b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar2, mVar);
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
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.valueOf(aVar.c()));
                mVar.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            p2 p2Var = p2.f111205a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(mVar, R.string.lbl_health_status_outliers);
            z3.e eVarC = z3.f.c(108010206, new li0.w(p1Var, 25), mVar);
            boolean zR = mVar.r(aVar);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new o0(29, aVar, p1Var);
                mVar.K(objQ2);
            }
            p2Var.g(strQ, rVarC2, null, null, eVarC, false, false, (e23.a) objQ2, mVar, 24576, 236);
            String strQ2 = gl1.y.Q(mVar, R.string.msg_health_status_outliers_notification_info);
            d92.b.f58624b.getClass();
            mh.c(strQ2, c2.l.z(aVar2, eVar.f97920e, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x033f  */
    /* JADX WARN: Code duplicated, block: B:130:0x035b  */
    /* JADX WARN: Code duplicated, block: B:151:0x040e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0629 A[Catch: all -> 0x0627, TryCatch #2 {all -> 0x0627, blocks: (B:230:0x05d3, B:232:0x05e3, B:234:0x05e9, B:237:0x05f6, B:239:0x0602, B:241:0x060c, B:243:0x0612, B:245:0x061b, B:250:0x0629, B:251:0x062c, B:254:0x0635, B:264:0x065d, B:255:0x0639, B:256:0x063f, B:258:0x0645, B:260:0x064d, B:263:0x0659), top: B:471:0x05d3 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0633 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0635 A[Catch: all -> 0x0627, LOOP:3: B:237:0x05f6->B:254:0x0635, LOOP_END, TryCatch #2 {all -> 0x0627, blocks: (B:230:0x05d3, B:232:0x05e3, B:234:0x05e9, B:237:0x05f6, B:239:0x0602, B:241:0x060c, B:243:0x0612, B:245:0x061b, B:250:0x0629, B:251:0x062c, B:254:0x0635, B:264:0x065d, B:255:0x0639, B:256:0x063f, B:258:0x0645, B:260:0x064d, B:263:0x0659), top: B:471:0x05d3 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x06c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:287:0x06c9 A[Catch: all -> 0x0700, LOOP:6: B:277:0x069d->B:287:0x06c9, LOOP_END, TryCatch #0 {all -> 0x0700, blocks: (B:274:0x0688, B:277:0x069d, B:279:0x06a9, B:281:0x06b3, B:283:0x06b9, B:284:0x06c1, B:287:0x06c9, B:288:0x06cc, B:291:0x06d7, B:293:0x06e3, B:295:0x06ed, B:297:0x06f3, B:300:0x0702, B:303:0x070a, B:304:0x070d), top: B:467:0x0688 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x0708 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x070a A[Catch: all -> 0x0700, LOOP:8: B:291:0x06d7->B:303:0x070a, LOOP_END, TryCatch #0 {all -> 0x0700, blocks: (B:274:0x0688, B:277:0x069d, B:279:0x06a9, B:281:0x06b3, B:283:0x06b9, B:284:0x06c1, B:287:0x06c9, B:288:0x06cc, B:291:0x06d7, B:293:0x06e3, B:295:0x06ed, B:297:0x06f3, B:300:0x0702, B:303:0x070a, B:304:0x070d), top: B:467:0x0688 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:415:0x095b  */
    /* JADX WARN: Code duplicated, block: B:430:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:455:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a6d  */
    /* JADX WARN: Code duplicated, block: B:481:0x065d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x06cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x070d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v192, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [int] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r14v11, types: [int] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14;
        boolean z15;
        i53.c cVarE;
        i53.c cVarE2;
        List<String> list;
        List<String> list2;
        List<String> list3;
        int i14;
        d0 d0VarA;
        q71.a aVar;
        Integer num;
        int i15 = 7;
        numValueOf = null;
        Integer numValueOf = null;
        wVar = null;
        wVar = null;
        wVar = null;
        q53.w<? super Unit> wVar = null;
        o53.j<Unit> jVarC = null;
        cVarE = null;
        i53.c cVarE3 = null;
        int i16 = 2;
        boolean z16 = false;
        int i17 = 3;
        boolean z17 = true;
        switch (this.f134211a) {
            case 0:
                r rVar = (r) this.f134212b;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                r.a aVar2 = r.f134213c;
                p3.m.a aVar3 = p3.m.f135153a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(rVar.u6().O0, mVar);
                    p1 p1VarC2 = p0.c(rVar.u6().f141490b1, mVar, 0);
                    Unit unit = Unit.INSTANCE;
                    boolean zR = mVar.r(rVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = rVar.new d(null);
                        mVar.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = rVar.new d(null);
                            mVar.K(objQ);
                        }
                    }
                    l0.e((e23.p) objQ, unit, mVar);
                    g3 g3Var = (g3) p1VarC2.getF182175a();
                    fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                    int i18 = pVar == null ? -1 : r.b.f134216a[pVar.ordinal()];
                    if (i18 == 1) {
                        mVar.C(-1582822772);
                        mVar.f();
                        g22.e.l(rVar);
                    } else if (i18 == 2) {
                        mVar.C(-1822809564);
                        mVar.f();
                        g22.e.f(rVar);
                        g22.e.a(rVar, null);
                    } else if (i18 != 3) {
                        mVar.C(-1821212010);
                        mVar.f();
                    } else {
                        mVar.C(-1822630942);
                        g22.e.f(rVar);
                        h4.r rVarD = x2.d(h4.r.S, 1.0f);
                        mv1.a aVar4 = (mv1.a) p1VarC.getF182175a();
                        tw1.k kVar = aVar4 != null ? aVar4.f121163a : null;
                        g3 g3Var2 = (g3) p1VarC2.getF182175a();
                        tw1.k kVar2 = g3Var2 != null ? (tw1.k) g3Var2.f35301b : null;
                        vt1.o oVar = rVar.u6().Y;
                        jv1.h hVarC5 = rVar.u6().c5();
                        vt1.o oVar2 = rVar.u6().Y;
                        mv1.a aVar5 = (mv1.a) p1VarC.getF182175a();
                        if (aVar5 != null) {
                            z15 = true;
                            if (aVar5.f121165c) {
                                z14 = false;
                            } else {
                                z14 = false;
                                z15 = false;
                            }
                        } else {
                            z14 = false;
                            z15 = false;
                        }
                        int iJ = tu1.a.j(hVarC5, oVar2, z14, z15);
                        String strQ = gl1.y.Q(mVar, R.string.changes_may_require_plan_updates);
                        Integer numValueOf2 = Integer.valueOf(iJ);
                        boolean zR2 = mVar.r(rVar);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new nw0.f(rVar, 22);
                            mVar.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new nw0.f(rVar, 22);
                                mVar.K(objQ2);
                            }
                        }
                        d1.a(rVarD, kVar, kVar2, true, strQ, false, oVar, 0, 0, numValueOf2, (e23.l) objQ2, mVar, 113445894);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                w wVar2 = (w) this.f134212b;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                w.a aVar6 = w.f134236b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    pv1.b bVar = (pv1.b) wVar2.f134237a.getValue();
                    String strQ2 = gl1.y.Q(mVar2, R.string.long_workout_day);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_rest_day);
                    strQ2.getClass();
                    strQ3.getClass();
                    mv1.b bVar2 = (mv1.b) bVar.R0.getValue();
                    if (bVar2 == null || (list3 = bVar2.f121173b) == null) {
                        cVarE = null;
                    } else {
                        ArrayList arrayList = new ArrayList(p13.y.r(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList);
                        }
                        cVarE = i53.a.e(arrayList);
                    }
                    if (bVar2 == null || (list2 = bVar2.f121174c) == null) {
                        cVarE2 = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            wr.g.z(wt1.q.f187120f, (String) it3.next(), arrayList2);
                        }
                        cVarE2 = i53.a.e(arrayList2);
                    }
                    if (bVar2 != null && (list = bVar2.f121172a) != null) {
                        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            wr.g.z(wt1.q.f187120f, (String) it4.next(), arrayList3);
                        }
                        cVarE3 = i53.a.e(arrayList3);
                    }
                    w13.c cVar = wt1.q.f187129o;
                    ArrayList arrayList4 = new ArrayList(p13.y.r(cVar, 10));
                    Iterator it5 = cVar.iterator();
                    while (it5.hasNext()) {
                        wt1.q qVar = (wt1.q) it5.next();
                        boolean z18 = (cVarE3 == null || !cVarE3.contains(qVar)) ? z17 : false;
                        boolean zContains = cVarE != null ? cVarE.contains(qVar) : false;
                        boolean zContains2 = cVarE2 != null ? cVarE2.contains(qVar) : false;
                        boolean z19 = z17;
                        String str = z18 ? strQ3 : zContains ? strQ2 : "";
                        String str2 = bVar.f141496h1;
                        arrayList4.add(new mv1.f(qVar, str, zContains2, (str2 == null || str2.length() == 0 || !z18) ? z19 : false));
                        it5 = it5;
                        z17 = z19;
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    boolean zR3 = mVar2.r(wVar2);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new u(wVar2, 0);
                        mVar2.K(objQ3);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new u(wVar2, 0);
                            mVar2.K(objQ3);
                        }
                    }
                    wVar2.u6(arrayList5, (e23.a) objQ3, mVar2, 432);
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                oy0.i iVar = (oy0.i) this.f134212b;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar3, iVar.f134417a);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                q21.a aVar7 = (q21.a) this.f134212b;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (aVar7.f142209h) {
                        mVar4.C(1587658383);
                        mVar4.f();
                    } else {
                        mVar4.C(1587391380);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarQ = x2.q(aVar8, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, mVar4, 48, 120);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                z3.l lVar = (z3.l) this.f134212b;
                ((Integer) obj).getClass();
                if (obj2 instanceof p3.i) {
                    p3.i iVar2 = (p3.i) obj2;
                    u0<p3.i> u0VarA = lVar.f202113h;
                    if (u0VarA == null) {
                        u0VarA = i1.a();
                        lVar.f202113h = u0VarA;
                    }
                    u0VarA.j(iVar2);
                    lVar.f202111f.b(iVar2);
                }
                if (obj2 instanceof z2) {
                    lVar.e((z2) obj2);
                }
                if (obj2 instanceof p3.p2) {
                    ((p3.p2) obj2).d();
                }
                return Unit.INSTANCE;
            case 5:
                k1 k1Var = (k1) this.f134212b;
                Set set = (Set) obj;
                synchronized (k1Var.f135131a) {
                    try {
                        t0<Object, Object> t0Var = k1Var.f135137b;
                        o50.a aVar9 = new o50.a(19, set, k1Var);
                        p005kotlin.jvm.internal.y0.e(1, aVar9);
                        Object[] objArr = t0Var.f134721b;
                        long[] jArr = t0Var.f134720a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i19 = 0;
                            while (true) {
                                long j8 = jArr[i19];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i24 = 8 - ((~(i19 - length)) >>> 31);
                                    for (int i25 = 0; i25 < i24; i25++) {
                                        if ((j8 & 255) < 128) {
                                            aVar9.invoke(objArr[(i19 << 3) + i25]);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i24 == 8) {
                                        if (i19 != length) {
                                            i19++;
                                        }
                                    }
                                } else if (i19 != length) {
                                    i19++;
                                }
                            }
                        }
                        u0<q53.w<Unit>> u0Var = k1Var.f135139d;
                        Object[] objArr2 = u0Var.f134733b;
                        long[] jArr2 = u0Var.f134732a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i26 = 0;
                            while (true) {
                                long j14 = jArr2[i26];
                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                    for (int i28 = 0; i28 < i27; i28++) {
                                        if ((j14 & 255) < 128) {
                                            ((q53.w) objArr2[(i26 << 3) + i28]).i(Unit.INSTANCE);
                                        }
                                        j14 >>= 8;
                                    }
                                    if (i27 == 8) {
                                        if (i26 != length2) {
                                            i26++;
                                        }
                                    }
                                } else if (i26 != length2) {
                                    i26++;
                                }
                            }
                        }
                        k1Var.f135139d.e();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                s2 s2Var = (s2) this.f134212b;
                Set set2 = (Set) obj;
                synchronized (s2Var.f135276c) {
                    try {
                        if (((s2.d) s2Var.f135294u.getValue()).compareTo(s2.d.Idle) >= 0) {
                            u0<Object> u0Var2 = s2Var.f135281h;
                            if (set2 instanceof q3.e) {
                                h1 h1Var = ((q3.e) set2).f142365a;
                                Object[] objArr3 = h1Var.f134733b;
                                long[] jArr3 = h1Var.f134732a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j15 = jArr3[i29];
                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length3)) >>> 31);
                                            for (?? r14 = z16; r14 < i30; r14++) {
                                                if ((j15 & 255) < 128) {
                                                    Object obj3 = objArr3[(i29 << 3) + r14];
                                                    if (obj3 instanceof h0) {
                                                        int i34 = f4.d.f68726b;
                                                        if (((h0) obj3).A(1)) {
                                                            u0Var2.d(obj3);
                                                        }
                                                    } else {
                                                        u0Var2.d(obj3);
                                                    }
                                                }
                                                j15 >>= 8;
                                            }
                                            if (i30 == 8) {
                                                if (i29 != length3) {
                                                    i29++;
                                                    z16 = false;
                                                }
                                            }
                                        } else if (i29 != length3) {
                                            i29++;
                                            z16 = false;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set2) {
                                    if (obj4 instanceof h0) {
                                        int i35 = f4.d.f68726b;
                                        if (!((h0) obj4).A(1)) {
                                        }
                                    }
                                    u0Var2.d(obj4);
                                }
                            }
                            jVarC = s2Var.C();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                if (jVarC != null) {
                    int i36 = o13.q.f128596b;
                    ((o53.k) jVarC).resumeWith(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 7:
                f3 f3Var = (f3) this.f134212b;
                Set set3 = (Set) obj;
                synchronized (f3Var.f135131a) {
                    try {
                        u0<Object> u0Var3 = f3Var.f135081d;
                        if (u0Var3 != null) {
                            Object[] objArr4 = u0Var3.f134733b;
                            long[] jArr4 = u0Var3.f134732a;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i37 = 0;
                                while (true) {
                                    long j16 = jArr4[i37];
                                    if ((((~j16) << i15) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                        int i39 = 0;
                                        while (true) {
                                            if (i39 < i38) {
                                                if ((j16 & 255) < 128 && set3.contains(objArr4[(i37 << 3) + i39])) {
                                                    wVar = f3Var.f135083f;
                                                }
                                                j16 >>= 8;
                                                i39++;
                                                i15 = i15;
                                            } else {
                                                i14 = i15;
                                                if (i38 == 8) {
                                                }
                                            }
                                        }
                                    } else {
                                        i14 = i15;
                                    }
                                    if (i37 != length4) {
                                        i37++;
                                        i15 = i14;
                                    }
                                }
                            }
                        } else if (p13.h0.R(set3, f3Var.f135079b)) {
                            wVar = f3Var.f135083f;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                if (wVar != null) {
                    q53.m.a(wVar.i(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            case 8:
                pb1.l lVar2 = (pb1.l) this.f134212b;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                pb1.l.a aVar10 = pb1.l.f136861l;
                dialogInterface.getClass();
                db1.m mVar5 = lVar2.v6().f107065h;
                if (mVar5 != null) {
                    PregnancyStopTrackingActivity.a aVar11 = PregnancyStopTrackingActivity.f41001d;
                    Context contextRequireContext = lVar2.requireContext();
                    contextRequireContext.getClass();
                    aVar11.getClass();
                    PregnancyStopTrackingActivity.a.a(contextRequireContext, mVar5);
                }
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 9:
                gf0.c cVar2 = (gf0.c) this.f134212b;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                EcgDetailActivity.a aVar12 = EcgDetailActivity.f34869p;
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    wf.f.a aVar13 = new wf.f.a((Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b));
                    com.garmin.android.apps.connectmobile.devices.model.l device = cVar2.getDevice();
                    aVar13.f184930c = device != null ? device.getF143520j() : null;
                    wf.g.a(aVar13);
                    jf.r.b(aVar13.a(), "", x2.q(h4.r.S, wz1.b.f188181a), n5.c.a(2131231969, mVar6, 0), n5.c.a(2131231969, mVar6, 0), null, null, null, null, null, null, null, mVar6, 48, 0, 32736);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 10:
                po.h hVar = (po.h) this.f134212b;
                int i44 = po.h.E1;
                return ((am.d) KoinJavaComponent.get(am.d.class)).z(hVar.f138857p.f29448a, hVar.new b());
            case 11:
                co0.c cVar3 = (co0.c) this.f134212b;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    no0.a.a(cVar3 != null ? Integer.valueOf(cVar3.d()) : null, cVar3 != null ? Integer.valueOf(cVar3.b()) : null, gl1.y.Q(mVar7, R.string.activities_average_resting_lbl), gl1.y.Q(mVar7, R.string.lbl_avg_high), mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                FollowBlockedUsersActivity followBlockedUsersActivity = (FollowBlockedUsersActivity) this.f134212b;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                FollowBlockedUsersActivity.a aVar14 = FollowBlockedUsersActivity.f47079b;
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    q12.e eVar = (q12.e) followBlockedUsersActivity.f47080a.getValue();
                    boolean zR4 = mVar8.r(followBlockedUsersActivity);
                    Object objQ4 = mVar8.q();
                    if (zR4) {
                        objQ4 = new FollowBlockedUsersActivity.b(followBlockedUsersActivity);
                        mVar8.K(objQ4);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new FollowBlockedUsersActivity.b(followBlockedUsersActivity);
                            mVar8.K(objQ4);
                        }
                    }
                    q12.d.a(eVar, (e23.a) objQ4, mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                o2.e eVar2 = (o2.e) this.f134212b;
                p3.m mVar9 = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar9.C(666084174);
                x1 x1Var9 = p3.n.f135158a;
                String str3 = eVar2.f128626b;
                mVar9.f();
                return str3;
            case 14:
                TextClassification textClassification = (TextClassification) this.f134212b;
                p3.m mVar10 = (p3.m) obj;
                ((Integer) obj2).getClass();
                q2.u uVar = q2.u.f142195a;
                mVar10.C(950061013);
                x1 x1Var10 = p3.n.f135158a;
                String strValueOf = String.valueOf(textClassification.getLabel());
                mVar10.f();
                return strValueOf;
            case 15:
                RemoteAction remoteAction = (RemoteAction) this.f134212b;
                p3.m mVar11 = (p3.m) obj;
                ((Integer) obj2).getClass();
                q2.u uVar2 = q2.u.f142195a;
                mVar11.C(-1376593684);
                x1 x1Var11 = p3.n.f135158a;
                String string = remoteAction.getTitle().toString();
                mVar11.f();
                return string;
            case 16:
                KomootConsentActivity komootConsentActivity = (KomootConsentActivity) this.f134212b;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                KomootConsentActivity.a aVar15 = KomootConsentActivity.f39717c;
                p3.m.a aVar16 = p3.m.f135153a;
                if (mVar12.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    boolean z24 = komootConsentActivity.f39719b;
                    boolean zR5 = mVar12.r(komootConsentActivity);
                    Object objQ5 = mVar12.q();
                    if (zR5) {
                        objQ5 = new q31.d(komootConsentActivity, i16);
                        mVar12.K(objQ5);
                    } else {
                        aVar16.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new q31.d(komootConsentActivity, i16);
                            mVar12.K(objQ5);
                        }
                    }
                    e23.a aVar17 = (e23.a) objQ5;
                    boolean zR6 = mVar12.r(komootConsentActivity);
                    Object objQ6 = mVar12.q();
                    if (zR6) {
                        objQ6 = new q31.d(komootConsentActivity, i17);
                        mVar12.K(objQ6);
                    } else {
                        aVar16.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new q31.d(komootConsentActivity, i17);
                            mVar12.K(objQ6);
                        }
                    }
                    q31.e.a(false, z24, aVar17, (e23.a) objQ6, mVar12, 6);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 17:
                o32.a aVar18 = (o32.a) this.f134212b;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strValueOf2 = (aVar18 == null || (num = aVar18.f128797c) == null) ? null : String.valueOf(num.intValue());
                    w13.c cVar4 = q71.a.f143226i;
                    ArrayList arrayList6 = new ArrayList(p13.y.r(cVar4, 10));
                    Iterator it6 = cVar4.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(Float.valueOf(((q71.a) it6.next()).f143228b));
                    }
                    i53.c cVarE4 = i53.a.e(arrayList6);
                    Float f14 = aVar18 != null ? aVar18.f128798d : null;
                    q71.a aVar19 = aVar18 != null ? aVar18.f128796b : null;
                    if (aVar19 == null) {
                        mVar13.C(1388783868);
                        mVar13.f();
                        d0VarA = null;
                    } else {
                        mVar13.C(1568820133);
                        long jB = aVar19.b(mVar13);
                        mVar13.f();
                        d0VarA = d0.a(jB);
                    }
                    if (aVar18 != null && (aVar = aVar18.f128796b) != null) {
                        numValueOf = Integer.valueOf(aVar.f143227a);
                    }
                    c02.i.a(rVarF, strValueOf2, cVarE4, f14, d0VarA, numValueOf, mVar13, 6, 0);
                    x1 x1Var14 = p3.n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                int i45 = q70.b.f143217h;
                ((q70.b) this.f134212b).g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                q72.h.g((q72.b) this.f134212b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                qb1.e eVar3 = (qb1.e) this.f134212b;
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                int i46 = qb1.e.f144043e;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                qb1.f fVarU6 = eVar3.u6();
                MaterialCalendarView materialCalendarView = eVar3.f144044a;
                if (materialCalendarView == null) {
                    p005kotlin.jvm.internal.s.m("mCalendar");
                    throw null;
                }
                xz2.b selectedDate = materialCalendarView.getSelectedDate();
                selectedDate.getClass();
                fVarU6.C.d(new LocalDate(selectedDate.f192861a, selectedDate.f192862b + 1, selectedDate.f192863c));
                a0 a0Var = eVar3.f144046c;
                if (a0Var != null) {
                    a0Var.E8();
                }
                return Unit.INSTANCE;
            case 21:
                SensorsActivity sensorsActivity = (SensorsActivity) this.f134212b;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i47 = SensorsActivity.f34344b;
                if (mVar14.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    qc0.d dVar = (qc0.d) sensorsActivity.f34345a.getValue();
                    boolean zR7 = mVar14.r(sensorsActivity);
                    Object objQ7 = mVar14.q();
                    if (zR7) {
                        objQ7 = new q42.d(sensorsActivity, i15);
                        mVar14.K(objQ7);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new q42.d(sensorsActivity, i15);
                            mVar14.K(objQ7);
                        }
                    }
                    qc0.b.a(dVar, (e23.a) objQ7, mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.settings.lte.b bVar3 = (com.garmin.android.apps.connectmobile.settings.lte.b) this.f134212b;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.lte.b.a aVar20 = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                ((DialogInterface) obj).getClass();
                androidx.fragment.app.m activity = bVar3.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.INSTANCE;
            case 23:
                qm.y yVar = (qm.y) this.f134212b;
                zm.p pVar2 = yVar.f145466b;
                p3.m mVar15 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-846115796, new q72.f(i17, yVar, new ep.e(i53.a.e(ep.a.a(pVar2.m0())), i53.a.e(ep.d.a(pVar2.W3())), n5.a.a(mVar15, R.color.gds_data_viz_blue_secondary), n5.a.a(mVar15, R.color.gds_data_viz_neutral_secondary), null)), mVar15), mVar15, 196608, 31);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 24:
                return a(obj, obj2);
            case 25:
                BloodPressureReportsActivity bloodPressureReportsActivity = (BloodPressureReportsActivity) this.f134212b;
                p3.m mVar16 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i48 = BloodPressureReportsActivity.f30903b;
                if (mVar16.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    qw.g gVar = (qw.g) bloodPressureReportsActivity.f30904a.getValue();
                    boolean zR8 = mVar16.r(bloodPressureReportsActivity);
                    Object objQ8 = mVar16.q();
                    if (zR8) {
                        objQ8 = new q42.d(bloodPressureReportsActivity, 24);
                        mVar16.K(objQ8);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new q42.d(bloodPressureReportsActivity, 24);
                            mVar16.K(objQ8);
                        }
                    }
                    qw.f.a(gVar, (e23.a) objQ8, mVar16, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                qw1.c.a((qw1.b) this.f134212b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                qx.a aVar21 = (qx.a) this.f134212b;
                p3.m mVar17 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    t4.d dVarRememberDrawablePainter = DrawablePainter2Kt.rememberDrawablePainter(aVar21.f148389c, mVar17, 0);
                    d0.f128823b.getClass();
                    i7.a(dVarRememberDrawablePainter, "", null, d0.f128832k, mVar17, 3120, 4);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 28:
                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = (MultiDayActivitiesEditActivity) this.f134212b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                MultiDayActivitiesEditActivity.a aVar22 = MultiDayActivitiesEditActivity.f39291b;
                if (zBooleanValue) {
                    multiDayActivitiesEditActivity.ca().L();
                } else {
                    multiDayActivitiesEditActivity.ca().f4(zBooleanValue2);
                }
                return Unit.INSTANCE;
            default:
                r02.m mVar18 = (r02.m) this.f134212b;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                int i49 = r02.m.f148892q;
                mVar18.f148902j.i(fFloatValue);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(Object obj, int i14, int i15) {
        this.f134211a = i15;
        this.f134212b = obj;
    }
}
