package dh1;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.v1;
import c2.b0;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityCustomShareFragment;
import com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareFragment;
import com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment;
import com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment.a;
import com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment.b;
import com.garmin.android.apps.connectmobile.activity.details.presentation.share.SelectRatioFragment;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsActivity;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity;
import ds.z;
import e63.y;
import et1.b2;
import ew0.g0;
import ew1.b3;
import ew1.c2;
import ew1.d1;
import ew1.d2;
import ew1.d3;
import ew1.e1;
import ew1.f1;
import ew1.r1;
import ew1.s1;
import ew1.u2;
import f4.v;
import f5.z0;
import f62.o0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l72.i3;
import lc.u0;
import o53.f0;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import qr.t;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59625b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f59624a = i14;
        this.f59625b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        xw1.h hVar;
        xw1.h hVar2;
        d3 d3Var = (d3) this.f59625b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        d3.a aVar = d3.f66394d;
        int maxWorkoutsPerWeek = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarG = f0.G(d3Var.y6().j6(), mVar);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                jv1.s sVar = (jv1.s) p1VarG.getF182175a();
                objQ = p0.n(sVar != null ? sVar.f101141t : null);
                mVar.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            jv1.s sVar2 = (jv1.s) p1VarG.getF182175a();
            int minWorkoutsPerWeek = (sVar2 == null || (hVar2 = sVar2.f101130i) == null) ? 1 : hVar2.getMinWorkoutsPerWeek();
            jv1.s sVar3 = (jv1.s) p1VarG.getF182175a();
            if (sVar3 != null && (hVar = sVar3.f101130i) != null) {
                maxWorkoutsPerWeek = hVar.getMaxWorkoutsPerWeek();
            }
            Integer num = (Integer) p1Var.getF182175a();
            List<Integer> listB1 = h0.b1(new j23.l(minWorkoutsPerWeek, maxWorkoutsPerWeek));
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new b2(p1Var, 11);
                mVar.K(objQ2);
            }
            e23.l<? super Integer, Unit> lVar = (e23.l) objQ2;
            boolean zR5 = d3Var.y6().R5();
            int iC5 = d3Var.y6().C5("FBTWorkoutsPerWeekSelectionFragment");
            int iY5 = d3Var.y6().Y5();
            boolean z14 = ((Integer) p1Var.getF182175a()) != null;
            boolean zR = mVar.r(d3Var);
            Object objQ3 = mVar.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new c2(p1Var, d3Var, 8);
                mVar.K(objQ3);
            }
            d3Var.w6(num, listB1, lVar, zR5, iC5, iY5, z14, (e23.a) objQ3, mVar, 384);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        Set setC0;
        v vVar = (v) this.f59625b;
        Set set = (Set) obj;
        AtomicReference<Object> atomicReference = vVar.f68814b;
        while (true) {
            Object obj3 = atomicReference.get();
            if (obj3 == null) {
                setC0 = set;
            } else if (obj3 instanceof Set) {
                setC0 = x.k(obj3, set);
            } else {
                if (!(obj3 instanceof List)) {
                    p3.n.b("Unexpected notification");
                    o2.c.f();
                    return null;
                }
                setC0 = h0.C0((Collection) obj3, w.c(set));
            }
            do {
                if (atomicReference.compareAndSet(obj3, setC0)) {
                    if (vVar.c()) {
                        vVar.f68813a.invoke(new e40.d(vVar, 22));
                    }
                    return Unit.INSTANCE;
                }
            } while (atomicReference.get() == obj3);
        }
    }

    private final Object c(Object obj, Object obj2) {
        WorkoutEditNotesActivity workoutEditNotesActivity = (WorkoutEditNotesActivity) this.f59625b;
        WorkoutEditNotesActivity.a aVar = WorkoutEditNotesActivity.f48867c;
        ((w52.e) workoutEditNotesActivity.f48869b.getValue()).f182502b = (File) obj2;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 h0VarCa = workoutEditNotesActivity.ca();
        ge1.b.T(v1.a(h0VarCa), null, null, new o0((com.garmin.android.apps.connectmobile.workouts.data.model.a) obj, h0VarCa, null), 3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, o13.l] */
    private final Object d(Object obj, Object obj2) {
        RespirationReportsActivity respirationReportsActivity = (RespirationReportsActivity) this.f59625b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = RespirationReportsActivity.f41143b;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            fe1.n nVar = (fe1.n) respirationReportsActivity.f41144a.getValue();
            boolean zR = mVar.r(respirationReportsActivity);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new e40.d(respirationReportsActivity, 29);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e40.d(respirationReportsActivity, 29);
                    mVar.K(objQ);
                }
            }
            fe1.m.a(nVar, (e23.a) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX WARN: Code duplicated, block: B:180:0x051c  */
    /* JADX WARN: Code duplicated, block: B:195:0x056e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:210:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:237:0x061a  */
    /* JADX WARN: Code duplicated, block: B:242:0x0639  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:383:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:390:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:395:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:39:0x0125  */
    /* JADX WARN: Code duplicated, block: B:400:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:415:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0165  */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x020a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0225  */
    /* JADX WARN: Code duplicated, block: B:84:0x0250  */
    /* JADX WARN: Code duplicated, block: B:89:0x026f  */
    /* JADX WARN: Code duplicated, block: B:94:0x029d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        List<fs.e> listA;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        jr.h hVar;
        fw1.a aVar;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        int i14 = this.f59624a;
        Object obj25 = null;
        p3.m.a aVar2 = p3.m.f135153a;
        final int iCompareTo = 0;
        iCompareTo = 0;
        Object obj26 = this.f59625b;
        final int i15 = 1;
        switch (i14) {
            case 0:
                b bVar = (b) obj26;
                zb0.a aVar3 = (zb0.a) obj;
                zb0.a aVar4 = (zb0.a) obj2;
                int i16 = b.f59626f;
                if (aVar3 != null && aVar4 != null) {
                    String strB = bVar.b(aVar3.f203418a);
                    String strB2 = bVar.b(aVar4.f203418a);
                    strB2.getClass();
                    iCompareTo = strB.compareTo(strB2);
                }
                return Integer.valueOf(iCompareTo);
            case 1:
                ActivityCustomShareFragment activityCustomShareFragment = (ActivityCustomShareFragment) obj26;
                ?? r14 = activityCustomShareFragment.f30115a;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(((t) r14.getValue()).f146509c2, mVar);
                    if (((Uri) p1VarC.getF182175a()) != null) {
                        mVar.C(-1726434436);
                        t tVar = (t) r14.getValue();
                        Context contextRequireContext = activityCustomShareFragment.requireContext();
                        contextRequireContext.getClass();
                        Bitmap bitmapA = is.d.a(contextRequireContext, (Uri) p1VarC.getF182175a());
                        Object objQ = mVar.q();
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new dh0.j(4);
                            mVar.K(objQ);
                        }
                        ds.j.a(tVar, bitmapA, (e23.a) objQ, mVar, 384);
                        mVar.f();
                    } else {
                        mVar.C(-1726308545);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ActivityShareFragment activityShareFragment = (ActivityShareFragment) obj26;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    t tVar2 = (t) activityShareFragment.f30125b.getValue();
                    boolean zR = mVar2.r(activityShareFragment);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new cq0.g(activityShareFragment, 23);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cq0.g(activityShareFragment, 23);
                            mVar2.K(objQ2);
                        }
                    }
                    ds.j.a(tVar2, null, (e23.a) objQ2, mVar2, 48);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                final EditCustomImageFragment editCustomImageFragment = (EditCustomImageFragment) obj26;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    t tVarU6 = editCustomImageFragment.u6();
                    p3.c2 c2Var = editCustomImageFragment.f30133b;
                    p3.c2 c2Var2 = editCustomImageFragment.f30134c;
                    p1 p1VarC2 = s9.c.c(tVarU6.f146509c2, mVar3);
                    p1 p1VarC3 = s9.c.c(editCustomImageFragment.u6().Y, mVar3);
                    p1 p1VarC4 = s9.c.c(editCustomImageFragment.u6().f146530j2, mVar3);
                    p1 p1VarC5 = s9.c.c(editCustomImageFragment.u6().f146521g2, mVar3);
                    Integer numValueOf = Integer.valueOf(((Number) p1VarC4.getF182175a()).intValue());
                    List list = (List) p1VarC3.getF182175a();
                    boolean zR2 = mVar3.r(editCustomImageFragment) | mVar3.B(p1VarC3) | mVar3.B(p1VarC4);
                    Object objQ3 = mVar3.q();
                    if (zR2) {
                        obj3 = objQ3;
                        EditCustomImageFragment.a aVar5 = editCustomImageFragment.new a(p1VarC3, p1VarC4, null);
                        mVar3.K(aVar5);
                        obj3 = aVar5;
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            obj3 = objQ3;
                            EditCustomImageFragment.a aVar6 = editCustomImageFragment.new a(p1VarC3, p1VarC4, null);
                            mVar3.K(aVar6);
                            obj3 = aVar6;
                        }
                    }
                    obj3 = objQ3;
                    l0.f(numValueOf, list, (e23.p) obj3, mVar3);
                    nr.p0 p0Var = (nr.p0) c2Var2.getF182175a();
                    nr.p0.a aVar7 = p0Var != null ? p0Var.f127286e : null;
                    nr.p0.a.c cVar = aVar7 instanceof nr.p0.a.c ? (nr.p0.a.c) aVar7 : null;
                    if (cVar == null || (hVar = cVar.f127293e) == null || (listA = hVar.a()) == null) {
                        listA = j0.f134944a;
                    }
                    T f182175a = c2Var.getF182175a();
                    boolean zR3 = mVar3.r(editCustomImageFragment) | mVar3.B(p1VarC5) | mVar3.r(listA);
                    Object objQ4 = mVar3.q();
                    if (zR3) {
                        obj4 = objQ4;
                        EditCustomImageFragment.b bVar2 = editCustomImageFragment.new b(listA, p1VarC5, null);
                        mVar3.K(bVar2);
                        obj4 = bVar2;
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj4 = objQ4;
                            EditCustomImageFragment.b bVar3 = editCustomImageFragment.new b(listA, p1VarC5, null);
                            mVar3.K(bVar3);
                            obj4 = bVar3;
                        }
                    }
                    obj4 = objQ4;
                    l0.e((e23.p) obj4, f182175a, mVar3);
                    if (((Uri) p1VarC2.getF182175a()) != null) {
                        mVar3.C(1290164329);
                        t tVarU7 = editCustomImageFragment.u6();
                        nr.p0 p0Var2 = (nr.p0) c2Var2.getF182175a();
                        Context contextRequireContext2 = editCustomImageFragment.requireContext();
                        contextRequireContext2.getClass();
                        Bitmap bitmapA2 = is.d.a(contextRequireContext2, (Uri) p1VarC2.getF182175a());
                        boolean zR4 = mVar3.r(editCustomImageFragment);
                        Object objQ5 = mVar3.q();
                        if (zR4) {
                            obj5 = objQ5;
                            e23.a aVar8 = new e23.a() { // from class: ds.t
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (iCompareTo) {
                                        case 0:
                                            EditCustomImageFragment editCustomImageFragment2 = editCustomImageFragment;
                                            p3.c2 c2Var3 = editCustomImageFragment2.f30134c;
                                            nr.p0 p0Var3 = (nr.p0) c2Var3.getF182175a();
                                            if (p0Var3 != null) {
                                                nr.p0.a.c cVar2 = (nr.p0.a.c) p0Var3.f127286e;
                                                jr.h hVar2 = cVar2.f127293e;
                                                c2Var3.setValue(nr.p0.a(p0Var3, nr.p0.a.c.a(cVar2, jr.x.a(hVar2, !hVar2.getF100059a(), hVar2.a()))));
                                            }
                                            editCustomImageFragment2.u6().L5(true);
                                            break;
                                        default:
                                            editCustomImageFragment.u6().L5(true);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(aVar8);
                            obj5 = aVar8;
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                obj5 = objQ5;
                                e23.a aVar9 = new e23.a() { // from class: ds.t
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (iCompareTo) {
                                            case 0:
                                                EditCustomImageFragment editCustomImageFragment2 = editCustomImageFragment;
                                                p3.c2 c2Var3 = editCustomImageFragment2.f30134c;
                                                nr.p0 p0Var3 = (nr.p0) c2Var3.getF182175a();
                                                if (p0Var3 != null) {
                                                    nr.p0.a.c cVar2 = (nr.p0.a.c) p0Var3.f127286e;
                                                    jr.h hVar2 = cVar2.f127293e;
                                                    c2Var3.setValue(nr.p0.a(p0Var3, nr.p0.a.c.a(cVar2, jr.x.a(hVar2, !hVar2.getF100059a(), hVar2.a()))));
                                                }
                                                editCustomImageFragment2.u6().L5(true);
                                                break;
                                            default:
                                                editCustomImageFragment.u6().L5(true);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(aVar9);
                                obj5 = aVar9;
                            }
                        }
                        obj5 = objQ5;
                        e23.a aVar10 = (e23.a) obj5;
                        n4.d dVar = (n4.d) c2Var.getF182175a();
                        boolean zR5 = mVar3.r(editCustomImageFragment);
                        Object objQ6 = mVar3.q();
                        if (zR5) {
                            obj6 = objQ6;
                            com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l lVar = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(editCustomImageFragment, 29);
                            mVar3.K(lVar);
                            obj6 = lVar;
                        } else {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                obj6 = objQ6;
                                com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l lVar2 = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(editCustomImageFragment, 29);
                                mVar3.K(lVar2);
                                obj6 = lVar2;
                            }
                        }
                        obj6 = objQ6;
                        e23.l lVar3 = (e23.l) obj6;
                        boolean zR6 = mVar3.r(editCustomImageFragment);
                        Object objQ7 = mVar3.q();
                        if (zR6) {
                            obj7 = objQ7;
                            e23.a aVar11 = new e23.a() { // from class: ds.t
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            EditCustomImageFragment editCustomImageFragment2 = editCustomImageFragment;
                                            p3.c2 c2Var3 = editCustomImageFragment2.f30134c;
                                            nr.p0 p0Var3 = (nr.p0) c2Var3.getF182175a();
                                            if (p0Var3 != null) {
                                                nr.p0.a.c cVar2 = (nr.p0.a.c) p0Var3.f127286e;
                                                jr.h hVar2 = cVar2.f127293e;
                                                c2Var3.setValue(nr.p0.a(p0Var3, nr.p0.a.c.a(cVar2, jr.x.a(hVar2, !hVar2.getF100059a(), hVar2.a()))));
                                            }
                                            editCustomImageFragment2.u6().L5(true);
                                            break;
                                        default:
                                            editCustomImageFragment.u6().L5(true);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(aVar11);
                            obj7 = aVar11;
                        } else {
                            aVar2.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                obj7 = objQ7;
                                e23.a aVar12 = new e23.a() { // from class: ds.t
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                EditCustomImageFragment editCustomImageFragment2 = editCustomImageFragment;
                                                p3.c2 c2Var3 = editCustomImageFragment2.f30134c;
                                                nr.p0 p0Var3 = (nr.p0) c2Var3.getF182175a();
                                                if (p0Var3 != null) {
                                                    nr.p0.a.c cVar2 = (nr.p0.a.c) p0Var3.f127286e;
                                                    jr.h hVar2 = cVar2.f127293e;
                                                    c2Var3.setValue(nr.p0.a(p0Var3, nr.p0.a.c.a(cVar2, jr.x.a(hVar2, !hVar2.getF100059a(), hVar2.a()))));
                                                }
                                                editCustomImageFragment2.u6().L5(true);
                                                break;
                                            default:
                                                editCustomImageFragment.u6().L5(true);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(aVar12);
                                obj7 = aVar12;
                            }
                        }
                        obj7 = objQ7;
                        ds.v.a(tVarU7, p0Var2, bitmapA2, aVar10, dVar, lVar3, (e23.a) obj7, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(1291292543);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                SelectRatioFragment selectRatioFragment = (SelectRatioFragment) obj26;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z.a((t) selectRatioFragment.f30154a.getValue(), mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                ds.n nVar = (ds.n) obj26;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar13, 0.0f, j92.b.f97899b.f97918c, 1);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar5);
                    u uVar = u.f22885a;
                    i7.b(nVar.f61021e, null, z.b(aVar13, mVar5), u0.f(mVar5), mVar5, 48, 0);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                dv0.o.a((yu0.f) obj26, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                z20.e eVar = (z20.e) obj26;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    i7.a(n5.c.a(eVar.f201899c.f32981c, mVar6, 0), null, e60.c.b(h4.r.S, mVar6), ds.e0.b(d92.b.f58623a, mVar6), mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj26;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    u4.d dVar2 = h0Var.f48193h.f116772h;
                    h4.r.a aVar15 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVar2, null, x2.q(aVar15, j92.b.f97901d.f97906e), u0.f(mVar7), mVar7, 48, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Iterator it = ((y) obj26).f63281c.iterator();
                while (it.hasNext()) {
                    e63.m mVar8 = (e63.m) it.next();
                    mVar8.getF25051a().c(obj, Boolean.valueOf(zBooleanValue != p005kotlin.jvm.internal.s.g(mVar8.getF25051a().f63274a.get((Object) obj), Boolean.TRUE)));
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                et.c.a aVar16 = et.c.f65235g;
                ((et.c) obj26).g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                us1.e eVar2 = (us1.e) obj26;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar9, eVar2.f172386a);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar9), mVar9, 0, 0, 131070);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 12:
                us1.o oVar = (us1.o) obj26;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97917b;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.r.a aVar17 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar18 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(iVarI, aVar18, mVar10, 0);
                    int iHashCode2 = Long.hashCode(mVar10.getU());
                    i2 i2VarX2 = mVar10.x();
                    h4.r rVarC2 = h4.k.c(aVar17, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar19);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar10);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar10, iHashCode2, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar10);
                    b0 b0Var = b0.f22601a;
                    int i17 = oVar.f172456a;
                    Integer num = oVar.f172457b;
                    String strQ2 = gl1.y.Q(mVar10, i17);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, b0Var.b(aVar17, aVar18), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar10), mVar10, 0, 0, 131068);
                    if (num != null) {
                        mVar10.C(-1876547631);
                        mh.c(gl1.y.Q(mVar10, num.intValue()), b0Var.b(aVar17, aVar18), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar10), mVar10, 0, 0, 131068);
                        mVar10.f();
                    } else {
                        mVar10.C(-1876251674);
                        mVar10.f();
                    }
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 13:
                gk1.b bVar6 = (gk1.b) obj26;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                ((g0) obj2).getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "EXIT")) {
                    bVar6.invoke();
                }
                return Unit.INSTANCE;
            case 14:
                ew1.g gVar = (ew1.g) obj26;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ew1.g.a aVar20 = ew1.g.f66460d;
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    aw1.h hVarW6 = gVar.w6();
                    jv1.s sVarI6 = hVarW6.i6();
                    if ((sVarI6 != null ? sVarI6.N : null) != null) {
                        obj25 = hv1.a.ADD_EXISTING_COURSE;
                    } else {
                        jv1.s sVarI7 = hVarW6.i6();
                        if ((sVarI7 != null ? sVarI7.K : null) != null) {
                            obj25 = hv1.a.ADD_COURSE_PROFILE;
                        }
                    }
                    hv1.a aVar21 = obj25;
                    boolean zR7 = mVar11.r(gVar);
                    Object objQ8 = mVar11.q();
                    if (zR7) {
                        objQ8 = new e40.d(gVar, 11);
                        mVar11.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new e40.d(gVar, 11);
                            mVar11.K(objQ8);
                        }
                    }
                    e23.a aVar22 = (e23.a) objQ8;
                    boolean zR8 = mVar11.r(gVar);
                    Object objQ9 = mVar11.q();
                    if (zR8) {
                        objQ9 = new ds0.g(gVar, 13);
                        mVar11.K(objQ9);
                    } else {
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new ds0.g(gVar, 13);
                            mVar11.K(objQ9);
                        }
                    }
                    cw1.l.b(aVar21, aVar22, (e23.l) objQ9, !gVar.w6().f13385r1, gVar.w6().C5("FBTAddCourseFragment"), gVar.w6().Y5(), mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 15:
                ew1.r rVar = (ew1.r) obj26;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ew1.r.a aVar23 = ew1.r.f66699d;
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    boolean zR9 = mVar12.r(rVar);
                    Object objQ10 = mVar12.q();
                    if (zR9) {
                        objQ10 = new ew1.q(rVar, i15);
                        mVar12.K(objQ10);
                    } else {
                        aVar2.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ew1.q(rVar, i15);
                            mVar12.K(objQ10);
                        }
                    }
                    rVar.y6((e23.a) objQ10, mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 16:
                e1 e1Var = (e1) obj26;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e1.a aVar24 = e1.f66409d;
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    boolean zR10 = e1Var.y6().R5();
                    boolean zR11 = mVar13.r(e1Var);
                    Object objQ11 = mVar13.q();
                    if (zR11) {
                        objQ11 = new d1(e1Var, i15);
                        mVar13.K(objQ11);
                    } else {
                        aVar2.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new d1(e1Var, i15);
                            mVar13.K(objQ11);
                        }
                    }
                    e1Var.w6(zR10, (e23.a) objQ11, mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 17:
                f1 f1Var = (f1) obj26;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                f1.a aVar25 = f1.f66451c;
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    boolean zR12 = f1Var.z6().R5();
                    int iC5 = f1Var.z6().C5("FBTNameYourPlanFragCompose");
                    int iY5 = f1Var.z6().Y5();
                    boolean zR13 = mVar14.r(f1Var);
                    Object objQ12 = mVar14.q();
                    if (zR13) {
                        objQ12 = new e40.d(f1Var, 14);
                        mVar14.K(objQ12);
                    } else {
                        aVar2.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new e40.d(f1Var, 14);
                            mVar14.K(objQ12);
                        }
                    }
                    f1Var.w6(iC5, iY5, 0, (e23.a) objQ12, mVar14, zR12);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 18:
                s1 s1Var = (s1) obj26;
                p3.m mVar15 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                s1.a aVar26 = s1.f66734c;
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1908858048, new r1(iCompareTo, f0.G(s1Var.u6().f13373g1, mVar15), s1Var), mVar15), mVar15, 196608, 31);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 19:
                d2 d2Var = (d2) obj26;
                p3.m mVar16 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                d2.a aVar27 = d2.f66384d;
                if (mVar16.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    Object[] objArr = new Object[0];
                    Object objQ13 = mVar16.q();
                    aVar2.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new e51.c(27);
                        mVar16.K(objQ13);
                    }
                    p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ13, mVar16, 48);
                    p1Var.setValue(Boolean.TRUE);
                    z02.b.a(false, null, null, null, false, z3.f.c(-207938026, new r1(i15, p1Var, d2Var), mVar16), mVar16, 196608, 31);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 20:
                u2 u2Var = (u2) obj26;
                p3.m mVar17 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                u2.a aVar28 = u2.f66789c;
                if (mVar17.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    boolean zR14 = u2Var.y6().R5();
                    boolean zR15 = mVar17.r(u2Var);
                    Object objQ14 = mVar17.q();
                    if (zR15) {
                        objQ14 = new e40.d(u2Var, 18);
                        mVar17.K(objQ14);
                    } else {
                        aVar2.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new e40.d(u2Var, 18);
                            mVar17.K(objQ14);
                        }
                    }
                    u2Var.w6(zR14, (e23.a) objQ14, mVar17, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 21:
                b3 b3Var = (b3) obj26;
                p3.m mVar18 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                b3.a aVar29 = b3.f66335d;
                if (mVar18.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    p1 p1VarG = f0.G(b3Var.F6().M0, mVar18);
                    p1 p1VarG2 = f0.G(b3Var.F6().M4(), mVar18);
                    p1 p1VarG3 = f0.G(b3Var.F6().I1, mVar18);
                    Object objQ15 = mVar18.q();
                    aVar2.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = p0.n(null);
                        mVar18.K(objQ15);
                    }
                    p1<fg0.k> p1Var2 = (p1) objQ15;
                    g3<fw1.a> g3Var = (g3) p1VarG.getF182175a();
                    int i18 = g3.f35299g;
                    int i19 = i18 | 48;
                    b3Var.y6(g3Var, p1Var2, mVar18, i19);
                    b3Var.z6((g3) p1VarG2.getF182175a(), p1Var2, mVar18, i19);
                    g3<fg0.k> g3Var2 = (g3) p1VarG3.getF182175a();
                    g3 g3Var3 = (g3) p1VarG.getF182175a();
                    if (g3Var3 == null || (aVar = (fw1.a) g3Var3.f35301b) == null) {
                        aVar = new fw1.a(null, null, null, null, null, 28, null);
                    }
                    b3Var.w6(g3Var2, aVar, mVar18, i18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 22:
                return a(obj, obj2);
            case 23:
                ((Integer) obj2).getClass();
                ey.u.b((xx.c) obj26, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                return b(obj, obj2);
            case 25:
                f62.k kVar = (f62.k) obj26;
                InlineUnitsTextFieldView.a aVar30 = (InlineUnitsTextFieldView.a) obj;
                Number number = (Number) obj2;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar31 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                aVar30.getClass();
                kVar.invoke(number != null ? new f62.i((Double) number, (m52.j) aVar30) : null);
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ((f62.r) obj26).b((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                return c(obj, obj2);
            case 28:
                return d(obj, obj2);
            default:
                ActivitiesListActivity activitiesListActivity = (ActivitiesListActivity) obj26;
                p3.m mVar19 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ActivitiesListActivity.a aVar32 = ActivitiesListActivity.f29099d;
                if (mVar19.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    p1 p1VarC6 = s9.c.c(activitiesListActivity.da().f72421f, mVar19);
                    zc.d dVarA = zc.g.a(activitiesListActivity.da().f72422g, mVar19);
                    p1 p1VarB = s9.c.b(activitiesListActivity.da().f72423h, null, mVar19, 48);
                    g.h hVar2 = new g.h();
                    boolean zR16 = mVar19.r(activitiesListActivity) | mVar19.r(dVarA);
                    Object objQ16 = mVar19.q();
                    if (zR16) {
                        obj8 = objQ16;
                        e52.b bVar7 = new e52.b(21, activitiesListActivity, dVarA);
                        mVar19.K(bVar7);
                        obj8 = bVar7;
                    } else {
                        aVar2.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            obj8 = objQ16;
                            e52.b bVar8 = new e52.b(21, activitiesListActivity, dVarA);
                            mVar19.K(bVar8);
                            obj8 = bVar8;
                        }
                    }
                    obj8 = objQ16;
                    c.q qVarC = c.w.c(hVar2, (e23.l) obj8, mVar19, 0);
                    az0.c.a aVar33 = (az0.c.a) p1VarB.getF182175a();
                    fo.q qVar = (fo.q) p1VarC6.getF182175a();
                    i53.f fVarJ = i53.a.j(activitiesListActivity.da().f72416a.f64754d);
                    fo.r rVarDa = activitiesListActivity.da();
                    boolean zR17 = mVar19.r(rVarDa);
                    Object objQ17 = mVar19.q();
                    if (zR17) {
                        obj9 = objQ17;
                        ActivitiesListActivity.b bVar9 = new ActivitiesListActivity.b(rVarDa);
                        mVar19.K(bVar9);
                        obj9 = bVar9;
                    } else {
                        aVar2.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            obj9 = objQ17;
                            ActivitiesListActivity.b bVar10 = new ActivitiesListActivity.b(rVarDa);
                            mVar19.K(bVar10);
                            obj9 = bVar10;
                        }
                    }
                    obj9 = objQ17;
                    k23.g gVar2 = (k23.g) obj9;
                    fo.r rVarDa2 = activitiesListActivity.da();
                    boolean zR18 = mVar19.r(rVarDa2);
                    Object objQ18 = mVar19.q();
                    if (zR18) {
                        obj10 = objQ18;
                        ActivitiesListActivity.f fVar = new ActivitiesListActivity.f(rVarDa2);
                        mVar19.K(fVar);
                        obj10 = fVar;
                    } else {
                        aVar2.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            obj10 = objQ18;
                            ActivitiesListActivity.f fVar2 = new ActivitiesListActivity.f(rVarDa2);
                            mVar19.K(fVar2);
                            obj10 = fVar2;
                        }
                    }
                    obj10 = objQ18;
                    k23.g gVar3 = (k23.g) obj10;
                    fo.r rVarDa3 = activitiesListActivity.da();
                    boolean zR19 = mVar19.r(rVarDa3);
                    Object objQ19 = mVar19.q();
                    if (zR19) {
                        obj11 = objQ19;
                        ActivitiesListActivity.g gVar4 = new ActivitiesListActivity.g(rVarDa3);
                        mVar19.K(gVar4);
                        obj11 = gVar4;
                    } else {
                        aVar2.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            obj11 = objQ19;
                            ActivitiesListActivity.g gVar5 = new ActivitiesListActivity.g(rVarDa3);
                            mVar19.K(gVar5);
                            obj11 = gVar5;
                        }
                    }
                    obj11 = objQ19;
                    k23.g gVar6 = (k23.g) obj11;
                    fo.r rVarDa4 = activitiesListActivity.da();
                    boolean zR20 = mVar19.r(rVarDa4);
                    Object objQ20 = mVar19.q();
                    if (zR20) {
                        obj12 = objQ20;
                        ActivitiesListActivity.h hVar3 = new ActivitiesListActivity.h(rVarDa4);
                        mVar19.K(hVar3);
                        obj12 = hVar3;
                    } else {
                        aVar2.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            obj12 = objQ20;
                            ActivitiesListActivity.h hVar4 = new ActivitiesListActivity.h(rVarDa4);
                            mVar19.K(hVar4);
                            obj12 = hVar4;
                        }
                    }
                    obj12 = objQ20;
                    k23.g gVar7 = (k23.g) obj12;
                    fo.r rVarDa5 = activitiesListActivity.da();
                    boolean zR21 = mVar19.r(rVarDa5);
                    Object objQ21 = mVar19.q();
                    if (zR21) {
                        obj13 = objQ21;
                        ActivitiesListActivity.i iVar = new ActivitiesListActivity.i(rVarDa5);
                        mVar19.K(iVar);
                        obj13 = iVar;
                    } else {
                        aVar2.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            obj13 = objQ21;
                            ActivitiesListActivity.i iVar2 = new ActivitiesListActivity.i(rVarDa5);
                            mVar19.K(iVar2);
                            obj13 = iVar2;
                        }
                    }
                    obj13 = objQ21;
                    k23.g gVar8 = (k23.g) obj13;
                    fo.r rVarDa6 = activitiesListActivity.da();
                    boolean zR22 = mVar19.r(rVarDa6);
                    Object objQ22 = mVar19.q();
                    if (zR22) {
                        obj14 = objQ22;
                        ActivitiesListActivity.j jVar2 = new ActivitiesListActivity.j(rVarDa6);
                        mVar19.K(jVar2);
                        obj14 = jVar2;
                    } else {
                        aVar2.getClass();
                        if (objQ22 == p3.m.a.f135155b) {
                            obj14 = objQ22;
                            ActivitiesListActivity.j jVar3 = new ActivitiesListActivity.j(rVarDa6);
                            mVar19.K(jVar3);
                            obj14 = jVar3;
                        }
                    }
                    obj14 = objQ22;
                    k23.g gVar9 = (k23.g) obj14;
                    fo.r rVarDa7 = activitiesListActivity.da();
                    boolean zR23 = mVar19.r(rVarDa7);
                    Object objQ23 = mVar19.q();
                    if (zR23) {
                        obj15 = objQ23;
                        ActivitiesListActivity.k kVar2 = new ActivitiesListActivity.k(rVarDa7);
                        mVar19.K(kVar2);
                        obj15 = kVar2;
                    } else {
                        aVar2.getClass();
                        if (objQ23 == p3.m.a.f135155b) {
                            obj15 = objQ23;
                            ActivitiesListActivity.k kVar3 = new ActivitiesListActivity.k(rVarDa7);
                            mVar19.K(kVar3);
                            obj15 = kVar3;
                        }
                    }
                    obj15 = objQ23;
                    k23.g gVar10 = (k23.g) obj15;
                    fo.r rVarDa8 = activitiesListActivity.da();
                    boolean zR24 = mVar19.r(rVarDa8);
                    Object objQ24 = mVar19.q();
                    if (zR24) {
                        obj16 = objQ24;
                        ActivitiesListActivity.l lVar4 = new ActivitiesListActivity.l(rVarDa8);
                        mVar19.K(lVar4);
                        obj16 = lVar4;
                    } else {
                        aVar2.getClass();
                        if (objQ24 == p3.m.a.f135155b) {
                            obj16 = objQ24;
                            ActivitiesListActivity.l lVar5 = new ActivitiesListActivity.l(rVarDa8);
                            mVar19.K(lVar5);
                            obj16 = lVar5;
                        }
                    }
                    obj16 = objQ24;
                    k23.g gVar11 = (k23.g) obj16;
                    fo.r rVarDa9 = activitiesListActivity.da();
                    boolean zR25 = mVar19.r(rVarDa9);
                    Object objQ25 = mVar19.q();
                    if (zR25) {
                        obj17 = objQ25;
                        ActivitiesListActivity.m mVar20 = new ActivitiesListActivity.m(rVarDa9);
                        mVar19.K(mVar20);
                        obj17 = mVar20;
                    } else {
                        aVar2.getClass();
                        if (objQ25 == p3.m.a.f135155b) {
                            obj17 = objQ25;
                            ActivitiesListActivity.m mVar21 = new ActivitiesListActivity.m(rVarDa9);
                            mVar19.K(mVar21);
                            obj17 = mVar21;
                        }
                    }
                    obj17 = objQ25;
                    k23.g gVar12 = (k23.g) obj17;
                    fo.r rVarDa10 = activitiesListActivity.da();
                    boolean zR26 = mVar19.r(rVarDa10);
                    Object objQ26 = mVar19.q();
                    if (zR26) {
                        obj18 = objQ26;
                        ActivitiesListActivity.c cVar2 = new ActivitiesListActivity.c(rVarDa10);
                        mVar19.K(cVar2);
                        obj18 = cVar2;
                    } else {
                        aVar2.getClass();
                        if (objQ26 == p3.m.a.f135155b) {
                            obj18 = objQ26;
                            ActivitiesListActivity.c cVar3 = new ActivitiesListActivity.c(rVarDa10);
                            mVar19.K(cVar3);
                            obj18 = cVar3;
                        }
                    }
                    obj18 = objQ26;
                    k23.g gVar13 = (k23.g) obj18;
                    fo.r rVarDa11 = activitiesListActivity.da();
                    boolean zR27 = mVar19.r(rVarDa11);
                    Object objQ27 = mVar19.q();
                    if (zR27) {
                        obj19 = objQ27;
                        ActivitiesListActivity.d dVar3 = new ActivitiesListActivity.d(rVarDa11);
                        mVar19.K(dVar3);
                        obj19 = dVar3;
                    } else {
                        aVar2.getClass();
                        if (objQ27 == p3.m.a.f135155b) {
                            obj19 = objQ27;
                            ActivitiesListActivity.d dVar4 = new ActivitiesListActivity.d(rVarDa11);
                            mVar19.K(dVar4);
                            obj19 = dVar4;
                        }
                    }
                    obj19 = objQ27;
                    k23.g gVar14 = (k23.g) obj19;
                    fo.r rVarDa12 = activitiesListActivity.da();
                    boolean zR28 = mVar19.r(rVarDa12);
                    Object objQ28 = mVar19.q();
                    if (zR28) {
                        obj20 = objQ28;
                        ActivitiesListActivity.e eVar3 = new ActivitiesListActivity.e(rVarDa12);
                        mVar19.K(eVar3);
                        obj20 = eVar3;
                    } else {
                        aVar2.getClass();
                        if (objQ28 == p3.m.a.f135155b) {
                            obj20 = objQ28;
                            ActivitiesListActivity.e eVar4 = new ActivitiesListActivity.e(rVarDa12);
                            mVar19.K(eVar4);
                            obj20 = eVar4;
                        }
                    }
                    obj20 = objQ28;
                    k23.g gVar15 = (k23.g) obj20;
                    boolean zR29 = mVar19.r(activitiesListActivity);
                    Object objQ29 = mVar19.q();
                    if (zR29) {
                        obj21 = objQ29;
                        fo.a aVar34 = new fo.a(activitiesListActivity, 2);
                        mVar19.K(aVar34);
                        obj21 = aVar34;
                    } else {
                        aVar2.getClass();
                        if (objQ29 == p3.m.a.f135155b) {
                            obj21 = objQ29;
                            fo.a aVar35 = new fo.a(activitiesListActivity, 2);
                            mVar19.K(aVar35);
                            obj21 = aVar35;
                        }
                    }
                    obj21 = objQ29;
                    e23.a aVar36 = (e23.a) obj21;
                    e23.l lVar6 = (e23.l) gVar2;
                    e23.l lVar7 = (e23.l) gVar3;
                    e23.a aVar37 = (e23.a) gVar6;
                    e23.a aVar38 = (e23.a) gVar7;
                    boolean zR30 = mVar19.r(activitiesListActivity) | mVar19.r(qVarC);
                    Object objQ30 = mVar19.q();
                    if (zR30) {
                        obj22 = objQ30;
                        r1 r1Var = new r1(15, activitiesListActivity, qVarC);
                        mVar19.K(r1Var);
                        obj22 = r1Var;
                    } else {
                        aVar2.getClass();
                        if (objQ30 == p3.m.a.f135155b) {
                            obj22 = objQ30;
                            r1 r1Var2 = new r1(15, activitiesListActivity, qVarC);
                            mVar19.K(r1Var2);
                            obj22 = r1Var2;
                        }
                    }
                    obj22 = objQ30;
                    e23.p pVar = (e23.p) obj22;
                    e23.l lVar8 = (e23.l) gVar8;
                    boolean zR31 = mVar19.r(activitiesListActivity);
                    Object objQ31 = mVar19.q();
                    if (zR31) {
                        obj23 = objQ31;
                        fo.a aVar39 = new fo.a(activitiesListActivity, 3);
                        mVar19.K(aVar39);
                        obj23 = aVar39;
                    } else {
                        aVar2.getClass();
                        if (objQ31 == p3.m.a.f135155b) {
                            obj23 = objQ31;
                            fo.a aVar310 = new fo.a(activitiesListActivity, 3);
                            mVar19.K(aVar310);
                            obj23 = aVar310;
                        }
                    }
                    obj23 = objQ31;
                    e23.a aVar40 = (e23.a) obj23;
                    e23.a aVar41 = (e23.a) gVar9;
                    e23.a aVar42 = (e23.a) gVar10;
                    e23.l lVar9 = (e23.l) gVar11;
                    e23.a aVar43 = (e23.a) gVar12;
                    boolean zR32 = mVar19.r(activitiesListActivity);
                    Object objQ32 = mVar19.q();
                    if (zR32) {
                        obj24 = objQ32;
                        fo.a aVar44 = new fo.a(activitiesListActivity, 4);
                        mVar19.K(aVar44);
                        obj24 = aVar44;
                    } else {
                        aVar2.getClass();
                        if (objQ32 == p3.m.a.f135155b) {
                            obj24 = objQ32;
                            fo.a aVar45 = new fo.a(activitiesListActivity, 4);
                            mVar19.K(aVar45);
                            obj24 = aVar45;
                        }
                    }
                    obj24 = objQ32;
                    fo.p.a(aVar33, qVar, fVarJ, dVarA, aVar36, lVar6, lVar7, aVar37, aVar38, pVar, lVar8, aVar40, aVar41, aVar42, lVar9, aVar43, (e23.a) obj24, (e23.a) gVar13, (e23.l) gVar14, (e23.l) gVar15, mVar19, 4096);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, int i14, int i15) {
        this.f59624a = i15;
        this.f59625b = obj;
    }
}
