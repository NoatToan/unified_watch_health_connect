package k41;

import android.content.DialogInterface;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.v1;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancySegmentedButton;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutsActivity;
import db1.u;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import hk1.a0;
import i3.i7;
import i3.mc;
import j20.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k2.i;
import kd0.j3;
import kd0.x0;
import kq.g0;
import kq.o0;
import ky0.v0;
import ky0.z1;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import r53.p2;
import u1.w;
import v.h;
import v62.e1;
import v62.o7;
import vt1.o;
import w52.a1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102871c;

    public /* synthetic */ e(int i14, Object obj, Object obj2) {
        this.f102869a = i14;
        this.f102870b = obj;
        this.f102871c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x046b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0499  */
    /* JADX WARN: Code duplicated, block: B:155:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:160:0x0518  */
    /* JADX WARN: Code duplicated, block: B:176:0x059e  */
    /* JADX WARN: Code duplicated, block: B:290:0x084c  */
    /* JADX WARN: Code duplicated, block: B:307:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:323:0x0931  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        u weightGoalUserInputs;
        Object value;
        Object value2;
        int i14 = this.f102869a;
        int i15 = 5;
        m.a aVar = m.f135153a;
        int i16 = 3;
        boolean z14 = false;
        int i17 = 0;
        final int i18 = 1;
        Object obj3 = this.f102871c;
        Object obj4 = this.f102870b;
        switch (i14) {
            case 0:
                String str = (String) obj4;
                h41.g gVar = (h41.g) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    boolean zB = mVar.B(str);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new jl0.e(str, i15);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new jl0.e(str, i15);
                            mVar.K(objQ);
                        }
                    }
                    r rVarC = v.c((l) objQ, rVarD, false);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC2 = k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    b0 b0Var = b0.f22601a;
                    if (gVar == null || gVar.f81621d == null) {
                        mVar.C(-1686120316);
                        g.b(mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-1686196514);
                        g.a(b0Var, gVar, mVar, 6);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                List<WorkoutDTO> list = (List) obj4;
                Object obj5 = (k62.k) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    for (WorkoutDTO workoutDTO : list) {
                        r.a aVar3 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        r rVarE = u1.n.e(l4.k.b(c2.l.z(aVar3, eVar.f97920e, eVar.f97918c), i.a(j92.b.f97900c.f97911c)), x.b(mVar2), m1.f128891a);
                        boolean zB2 = mVar2.B(obj5) | mVar2.r(workoutDTO);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new k11.h(i16, obj5, workoutDTO);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new k11.h(i16, obj5, workoutDTO);
                                mVar2.K(objQ2);
                            }
                        }
                        a1.a(workoutDTO, rVarE, (e23.a) objQ2, null, mVar2, WorkoutDTO.P0 | 3072);
                    }
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                Long l14 = (Long) obj4;
                MyWorkoutsActivity myWorkoutsActivity = (MyWorkoutsActivity) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                MyWorkoutsActivity.a aVar4 = MyWorkoutsActivity.f49529a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    boolean zR = mVar3.r(myWorkoutsActivity);
                    Object objQ3 = mVar3.q();
                    if (zR) {
                        objQ3 = new jx0.e(myWorkoutsActivity, 12);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new jx0.e(myWorkoutsActivity, 12);
                            mVar3.K(objQ3);
                        }
                    }
                    g8.i.e(l14, (e23.a) objQ3, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                g8.i.e((Long) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                com.garmin.android.apps.connectmobile.developer.tutorials.b bVar2 = (com.garmin.android.apps.connectmobile.developer.tutorials.b) obj4;
                l<? super Float, Unit> lVar = (l) obj3;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar5 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    bVar2.w6((com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b) bVar2.f33723a.getValue(), lVar, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                k82.c.d(p0.t(49), (p) obj3, (r) obj4, (m) obj);
                return Unit.INSTANCE;
            case 6:
                fc1.a aVar6 = (fc1.a) obj3;
                String str2 = (String) obj4;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    kc1.b.c(aVar6 != null ? aVar6.f70394b : null, g8.i.E(aVar6 != null ? aVar6.f70394b : null), aVar6 != null ? aVar6.f70395c : null, str2, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                fc1.g gVar2 = (fc1.g) obj3;
                String str3 = (String) obj4;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    Integer num = gVar2.f70409b;
                    kc1.b.c(num, g8.i.E(num), gVar2.f70410c, str3, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                int i19 = x0.f104416e;
                ((x0) obj4).l((mc) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ((j3) obj4).b((nk0.l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ih0.s sVar = (ih0.s) obj4;
                dh0.a aVar7 = (dh0.a) obj3;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    t60.a aVar8 = ih0.s.f93481l;
                    sVar.getClass();
                    kh0.g.d(ih0.s.y4(aVar7, true), mVar7, 0);
                    kh0.g.f(sVar.x4(aVar7), mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 11:
                ArrayList<dh0.d> arrayList = (ArrayList) obj4;
                ih0.i iVar = (ih0.i) obj3;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    for (dh0.d dVar : arrayList) {
                        Double d14 = dVar.f59565b;
                        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                        int i24 = kh0.s.a.f104763a[dVar.f59564a.ordinal()];
                        if (i24 == 1) {
                            mVar8.C(-1207297213);
                            kh0.s.a(dDoubleValue, iVar, mVar8, 64);
                            mVar8.f();
                        } else if (i24 == 2) {
                            mVar8.C(-1207300281);
                            kh0.s.c(dDoubleValue, iVar, mVar8, 64);
                            mVar8.f();
                        } else if (i24 == 3) {
                            mVar8.C(-1207293963);
                            kh0.s.j(mVar8, 0);
                            mVar8.f();
                        } else if (i24 == 4) {
                            mVar8.C(-1207291047);
                            kh0.s.l(mVar8, 0);
                            mVar8.f();
                        } else {
                            if (i24 != 5) {
                                throw n23.j.m(mVar8, -1207302483);
                            }
                            mVar8.C(-1207288183);
                            kh0.s.h(dDoubleValue, iVar, mVar8, 64);
                            mVar8.f();
                        }
                    }
                    x1 x1Var10 = n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ki1.k.f((fi1.b) obj4, (fi1.b) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                a0 a0Var = (a0) obj4;
                e23.a aVar9 = (e23.a) obj3;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    z02.f.c(0, 54, null, aVar9, null, a0Var.o(), mVar9, null);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                km0.d dVar2 = (km0.d) obj4;
                e23.a aVar10 = (e23.a) obj3;
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    if (dVar2 == km0.d.f105310g) {
                        mVar10.C(-1921325546);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = o7.a(t62.b.f162798a);
                        String strQ = gl1.y.Q(mVar10, R.string.lbl_search);
                        long jB = ds.e0.b(d92.b.f58623a, mVar10);
                        r.a aVar11 = r.S;
                        d92.b.f58625c.getClass();
                        r rVarQ = x2.q(c2.l.A(aVar11, j92.b.f97899b.f97920e, 0.0f, 2), j92.b.f97901d.f97905d);
                        boolean zB3 = mVar10.B(aVar10);
                        Object objQ4 = mVar10.q();
                        if (zB3) {
                            objQ4 = new kb0.p(aVar10, 13);
                            mVar10.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new kb0.p(aVar10, 13);
                                mVar10.K(objQ4);
                            }
                        }
                        i7.b(dVarA, strQ, w.d(rVarQ, false, null, null, (e23.a) objQ4, 15), jB, mVar10, 0, 0);
                        mVar10.f();
                    } else {
                        mVar10.C(-1920827066);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                h82.r rVar = (h82.r) obj4;
                final kq.f fVar = (kq.f) obj3;
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i25 = kq.f.f106067f;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    boolean zR2 = mVar11.r(fVar);
                    Object objQ5 = mVar11.q();
                    if (zR2) {
                        final int i26 = z14 ? 1 : 0;
                        objQ5 = new e23.a() { // from class: kq.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = i26;
                                f fVar2 = fVar;
                                switch (i27) {
                                    case 0:
                                        int i28 = f.f106067f;
                                        fVar2.e("TRACKING_ACTION");
                                        break;
                                    default:
                                        int i29 = f.f106067f;
                                        fVar2.e("TIMERS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar11.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            final int i27 = z14 ? 1 : 0;
                            objQ5 = new e23.a() { // from class: kq.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i27;
                                    f fVar2 = fVar;
                                    switch (i28) {
                                        case 0:
                                            int i29 = f.f106067f;
                                            fVar2.e("TRACKING_ACTION");
                                            break;
                                        default:
                                            int i210 = f.f106067f;
                                            fVar2.e("TIMERS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar11.K(objQ5);
                        }
                    }
                    rVar.B(R.string.hiit_tracking_help_label, null, false, (e23.a) objQ5, mVar11, 0, 6);
                    boolean zR3 = mVar11.r(fVar);
                    Object objQ6 = mVar11.q();
                    if (zR3) {
                        objQ6 = new e23.a() { // from class: kq.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i18;
                                f fVar2 = fVar;
                                switch (i28) {
                                    case 0:
                                        int i29 = f.f106067f;
                                        fVar2.e("TRACKING_ACTION");
                                        break;
                                    default:
                                        int i210 = f.f106067f;
                                        fVar2.e("TIMERS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar11.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new e23.a() { // from class: kq.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i18;
                                    f fVar2 = fVar;
                                    switch (i28) {
                                        case 0:
                                            int i29 = f.f106067f;
                                            fVar2.e("TRACKING_ACTION");
                                            break;
                                        default:
                                            int i210 = f.f106067f;
                                            fVar2.e("TIMERS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar11.K(objQ6);
                        }
                    }
                    rVar.B(R.string.hiit_timers_help_label, null, false, (e23.a) objQ6, mVar11, 0, 6);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 16:
                h82.r rVar2 = (h82.r) obj4;
                final kq.k kVar2 = (kq.k) obj3;
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i28 = kq.k.f106092f;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    boolean zR4 = mVar12.r(kVar2);
                    Object objQ7 = mVar12.q();
                    if (zR4) {
                        objQ7 = new e23.a() { // from class: kq.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i18;
                                k kVar3 = kVar2;
                                switch (i29) {
                                    case 0:
                                        int i30 = k.f106092f;
                                        kVar3.e("TRACKING_ACTION");
                                        break;
                                    default:
                                        int i34 = k.f106092f;
                                        kVar3.e("OPTIONS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new e23.a() { // from class: kq.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i18;
                                    k kVar3 = kVar2;
                                    switch (i29) {
                                        case 0:
                                            int i30 = k.f106092f;
                                            kVar3.e("TRACKING_ACTION");
                                            break;
                                        default:
                                            int i34 = k.f106092f;
                                            kVar3.e("OPTIONS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ7);
                        }
                    }
                    rVar2.B(R.string.lbl_breathwork_options, null, false, (e23.a) objQ7, mVar12, 0, 6);
                    boolean zR5 = mVar12.r(kVar2);
                    Object objQ8 = mVar12.q();
                    if (zR5) {
                        final int i29 = z14 ? 1 : 0;
                        objQ8 = new e23.a() { // from class: kq.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i29;
                                k kVar3 = kVar2;
                                switch (i210) {
                                    case 0:
                                        int i30 = k.f106092f;
                                        kVar3.e("TRACKING_ACTION");
                                        break;
                                    default:
                                        int i34 = k.f106092f;
                                        kVar3.e("OPTIONS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            final int i210 = z14 ? 1 : 0;
                            objQ8 = new e23.a() { // from class: kq.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i211 = i210;
                                    k kVar3 = kVar2;
                                    switch (i211) {
                                        case 0:
                                            int i30 = k.f106092f;
                                            kVar3.e("TRACKING_ACTION");
                                            break;
                                        default:
                                            int i34 = k.f106092f;
                                            kVar3.e("OPTIONS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ8);
                        }
                    }
                    rVar2.B(R.string.lbl_tracking_breathwork, null, false, (e23.a) objQ8, mVar12, 0, 6);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int i30 = g0.f106072g;
                ((g0) obj4).h((List) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                int i34 = g0.f106072g;
                ((g0) obj4).g((g0.b) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                h82.r rVar3 = (h82.r) obj4;
                o0 o0Var = (o0) obj3;
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i35 = o0.f106115f;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    c22.x0.f23314a.getClass();
                    rVar3.s(0, 2, gl1.d.W(c22.x0.f23558o9), null, mVar13);
                    rVar3.q(gl1.d.W(c22.x0.F9), mVar13, 0);
                    o0Var.h(mVar13, h82.c.f82429e);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 20:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                String str4 = (String) obj4;
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    j.f22691a.getClass();
                    j.k kVar3 = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar3, h4.d.a.f81536n, mVar14, 0);
                    int iHashCode2 = Long.hashCode(mVar14.getU());
                    i2 i2VarX2 = mVar14.x();
                    r rVarC3 = k.c(rVarF, mVar14);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar12);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar14);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar14.getT() || !s.g(mVar14.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar14, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar14);
                    b0 b0Var2 = b0.f22601a;
                    List list2 = (List) linkedHashMap.get(str4);
                    if (list2 == null) {
                        mVar14.C(-543327083);
                        mVar14.f();
                    } else {
                        mVar14.C(-543327082);
                        for (Object obj6 : list2) {
                            int i36 = i17 + 1;
                            if (i17 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj6;
                            e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                            r.a aVar13 = r.S;
                            e3Var.v(3462, activityListItemDTO, null, x2.f(aVar13, 1.0f), mVar14, true);
                            if (i17 < list2.size() - 1) {
                                mVar14.C(1133093789);
                                r rVarF2 = x2.f(aVar13, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                c2.l.f(x2.h(rVarF2, j92.b.f97899b.f97920e), mVar14);
                                mVar14.f();
                            } else {
                                mVar14.C(1133235056);
                                mVar14.f();
                            }
                            i17 = i36;
                        }
                        mVar14.f();
                    }
                    mVar14.y();
                    x1 x1Var17 = n.f135158a;
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ku1.d.a((o) obj4, (LinkedHashMap) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 22:
                u uVar = (u) obj4;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                uVar.j(false);
                tb1.e.f163745a.getClass();
                uVar.i(tb1.e.a.c());
                androidx.fragment.app.v fragmentManager = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a) obj3).getFragmentManager();
                if (fragmentManager != null) {
                    try {
                        pb1.l lVar2 = (pb1.l) fragmentManager.G("PregnancySettingsTopFragment");
                        if (lVar2 != null) {
                            GCMPregnancySegmentedButton gCMPregnancySegmentedButton = lVar2.f136867e;
                            if (gCMPregnancySegmentedButton == null) {
                                s.m("mWeightGainGoalsButton");
                                throw null;
                            }
                            SwitchCompat switchCompat = gCMPregnancySegmentedButton.f41018f;
                            if (switchCompat != null) {
                                switchCompat.setChecked(false);
                            }
                            db1.m mVar15 = lVar2.v6().f107065h;
                            if (mVar15 != null && (weightGoalUserInputs = mVar15.getWeightGoalUserInputs()) != null) {
                                weightGoalUserInputs.i(tb1.e.a.c());
                                lVar2.w6(weightGoalUserInputs);
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e4) {
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39032u1.error("error trying to find pregnancySettingsTopFragment", (Throwable) e4);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 23:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar14 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a) obj4;
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                dialogInterface2.getClass();
                w1 w1Var = aVar14.f39067q1;
                ((y0) ((qb1.f) w1Var.getValue()).f144061e.getValue()).f(aVar14.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.e(new jt1.d(17, aVar14, (androidx.fragment.app.m) obj3)));
                qb1.f fVar2 = (qb1.f) w1Var.getValue();
                ge1.b.T(v1.a(fVar2), null, null, new qb1.s(aVar14.f39035b, fVar2, null), 3);
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                v0.a((l22.b) obj4, (sy0.c) obj3, (m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                z1.b((i53.d) obj4, (p) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                p006l2.r.Function0 function0 = p006l2.r.Function0.f108746a;
                ((p006l2.r.Function0) obj4).a((z3.e) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 27:
                f01.j jVar = (f01.j) obj4;
                f01.j jVar2 = (f01.j) obj3;
                m mVar16 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    if (jVar == jVar2) {
                        mVar16.C(280893491);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), gl1.y.Q(mVar16, R.string.selected), null, ds.e0.b(d92.b.f58623a, mVar16), mVar16, 0, 4);
                        mVar16.f();
                    } else {
                        mVar16.C(281162416);
                        mVar16.f();
                    }
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 28:
                m21.g gVar3 = (m21.g) obj4;
                p1 p1Var = (p1) obj3;
                String str5 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str5.getClass();
                if (zBooleanValue) {
                    gVar3.N4(str5, ((m21.e) p1Var.getF182175a()).f116093j);
                } else {
                    gVar3.getClass();
                    p2 p2Var = gVar3.f116124q;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, m21.e.a((m21.e) value, str5, false, false, null, null, false, null, null, false, false, null, null, false, null, null, null, 1048574)));
                    if (((m21.e) p2Var.getValue()).f116093j == k21.a.ALL) {
                        gVar3.G4(str5);
                    }
                    gVar3.f116121n = "";
                    if (str5.length() == 0) {
                        do {
                            value2 = p2Var.getValue();
                        } while (!p2Var.b(value2, m21.e.a((m21.e) value2, null, false, false, null, null, false, null, null, false, false, null, null, false, null, null, null, 1048573)));
                        gVar3.R4(f01.j.DEFAULT);
                        gVar3.S4(((m21.e) p2Var.getValue()).f116093j);
                    }
                }
                return Unit.INSTANCE;
            default:
                List list3 = (List) obj4;
                CreateCourseActivity createCourseActivity = (CreateCourseActivity) obj3;
                int iIntValue16 = ((Integer) obj).intValue();
                int iIntValue17 = ((Integer) obj2).intValue();
                ClimbDTO climbDTO = (ClimbDTO) h0.e0(iIntValue16, list3);
                if (climbDTO != null) {
                    CreateCourseActivity.a aVar15 = CreateCourseActivity.f32989g;
                    l30.z zVarEa = createCourseActivity.ea();
                    zVarEa.getClass();
                    zVarEa.z4(new n30.c.x(climbDTO));
                }
                ClimbDTO climbDTO2 = (ClimbDTO) h0.e0(iIntValue17, list3);
                if (climbDTO2 != null) {
                    CreateCourseActivity.a aVar16 = CreateCourseActivity.f32989g;
                    l30.z zVarEa2 = createCourseActivity.ea();
                    zVarEa2.getClass();
                    zVarEa2.z4(new n30.c.o(climbDTO2));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i14, String str, Object obj) {
        this.f102869a = i14;
        this.f102871c = obj;
        this.f102870b = str;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i14, int i15) {
        this.f102869a = i15;
        this.f102870b = obj;
        this.f102871c = obj2;
    }
}
