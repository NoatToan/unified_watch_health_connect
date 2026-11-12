package ao1;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import e23.p;
import e23.q;
import e23.r;
import i3.f2;
import i3.fe;
import lc.m0;
import lc.v;
import lc.w;
import lc.y;
import mt0.p0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p006l2.v0;
import p3.l0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import pt1.x;
import r1.l;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11557c;

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f11555a = i14;
        this.f11556b = obj;
        this.f11557c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o13.l] */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        RunningToleranceReportsActivity runningToleranceReportsActivity = (RunningToleranceReportsActivity) this.f11556b;
        m0 m0Var = (m0) this.f11557c;
        m mVar = (m) obj3;
        ((Integer) obj4).getClass();
        RunningToleranceReportsActivity.a aVar = RunningToleranceReportsActivity.f41161b;
        ((l) obj).getClass();
        ((v) obj2).getClass();
        x1 x1Var = n.f135158a;
        jf1.b bVar = (jf1.b) runningToleranceReportsActivity.f41162a.getValue();
        boolean zR = mVar.r(runningToleranceReportsActivity);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new f2(runningToleranceReportsActivity, 23);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new f2(runningToleranceReportsActivity, 23);
                mVar.K(objQ);
            }
        }
        com.garmin.android.apps.connectmobile.running_tolerance.presentation.b.a(bVar, m0Var, (e23.a) objQ, mVar, 0);
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        jf1.b bVar = (jf1.b) this.f11556b;
        p1 p1Var = (p1) this.f11557c;
        o82.g gVar = (o82.g) obj;
        o82.a aVar = (o82.a) obj2;
        m mVar = (m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar) ? 32 : 16;
        }
        if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            int i15 = com.garmin.android.apps.connectmobile.running_tolerance.presentation.b.a.f41167a[gVar.ordinal()];
            if (i15 == 1) {
                mVar.C(-212792613);
                u82.a aVar2 = bVar.f98701d;
                jf1.a.f98696a.getClass();
                u82.e.b(aVar, aVar2, null, false, jf1.a.f98697b, mVar, ((i14 >> 3) & 14) | 24576, 12);
                mVar.f();
            } else if (i15 == 2 || i15 == 3) {
                mVar.C(-212426472);
                u82.e.b(aVar, bVar.f98702e, null, false, z3.f.c(-2076780811, new i91.e(aVar, 8, gVar, p1Var), mVar), mVar, ((i14 >> 3) & 14) | 24576, 12);
                mVar.f();
            } else {
                mVar.C(962989560);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        x xVar = (x) this.f11556b;
        q qVar = (q) this.f11557c;
        int iIntValue = ((Integer) obj2).intValue();
        m mVar = (m) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((e2.d) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
        }
        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            x1 x1Var = n.f135158a;
            kt1.b bVar = xVar.f141012i.get(iIntValue);
            boolean zB = mVar.B(qVar) | ((iIntValue2 & 112) == 32) | mVar.r(xVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new a83.a(qVar, iIntValue, xVar, 8);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a83.a(qVar, iIntValue, xVar, 8);
                    mVar.K(objQ);
                }
            }
            jt1.k.c(bVar, null, (e23.a) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX WARN: Code duplicated, block: B:6:0x0035  */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        GroupCreationActivity groupCreationActivity = (GroupCreationActivity) this.f11556b;
        m0 m0Var = (m0) this.f11557c;
        m mVar = (m) obj3;
        ((Integer) obj4).getClass();
        int i14 = GroupCreationActivity.f36131b;
        ((l) obj).getClass();
        ((v) obj2).getClass();
        x1 x1Var = n.f135158a;
        km0.i iVarDa = groupCreationActivity.da();
        boolean zR = mVar.r(groupCreationActivity);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (zR) {
            objQ = new jx0.e(groupCreationActivity, 20);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new jx0.e(groupCreationActivity, 20);
                mVar.K(objQ);
            }
        }
        e23.a aVar2 = (e23.a) objQ;
        boolean zR2 = mVar.r(groupCreationActivity);
        Object objQ2 = mVar.q();
        if (zR2) {
            objQ2 = new a6.c(groupCreationActivity, 10);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new a6.c(groupCreationActivity, 10);
                mVar.K(objQ2);
            }
        }
        r rVar = (r) objQ2;
        boolean zR3 = mVar.r(m0Var);
        Object objQ3 = mVar.q();
        if (zR3) {
            objQ3 = new k62.j(m0Var, 3);
            mVar.K(objQ3);
        } else {
            aVar.getClass();
            if (objQ3 == m.a.f135155b) {
                objQ3 = new k62.j(m0Var, 3);
                mVar.K(objQ3);
            }
        }
        km0.h.a(iVarDa, aVar2, rVar, (e23.a) objQ3, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        Long l14;
        m mVar;
        Object gVar;
        int i14;
        u41.a aVar;
        Intent intent;
        Parcelable parcelable;
        Double dValueOf;
        Parcelable parcelable2;
        boolean z14;
        Boolean boolValueOf;
        y yVar = (y) this.f11556b;
        l51.j jVar = (l51.j) this.f11557c;
        v vVar = (v) obj2;
        m mVar2 = (m) obj3;
        q2.t((Integer) obj4, (l) obj, vVar);
        x1 x1Var = n.f135158a;
        Activity activity = (Activity) mVar2.A(c.n.f22332a);
        b0 f158016a = ((n0) mVar2.A(s9.j.f158018a)).getF158016a();
        Object objQ = mVar2.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = ((n51.b.C2324b) w.a(vVar, s0.f105811a.b(n51.b.C2324b.class))).f123771b;
            if (objQ == null) {
                if (activity == null || (intent = activity.getIntent()) == null) {
                    l14 = null;
                    aVar = null;
                } else {
                    l2.f37135b.getClass();
                    Bundle bundleA = l2.a.a(intent);
                    if (bundleA != null) {
                        u41.a.INSTANCE.getClass();
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 >= 33) {
                            parcelable = (Parcelable) bundleA.getParcelable("paceband_summary_key", com.garmin.android.apps.connectmobile.pacepro.data.dto.b.class);
                        } else {
                            Parcelable parcelable3 = bundleA.getParcelable("paceband_summary_key");
                            if (!(parcelable3 instanceof com.garmin.android.apps.connectmobile.pacepro.data.dto.b)) {
                                parcelable3 = null;
                            }
                            parcelable = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) parcelable3;
                        }
                        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) parcelable;
                        String string = bundleA.getString("course_id_key");
                        if (bundleA.containsKey("distance_in_meters_key")) {
                            l14 = null;
                            dValueOf = Double.valueOf(bundleA.getDouble("distance_in_meters_key", 0.0d));
                        } else {
                            l14 = null;
                            dValueOf = null;
                        }
                        Long lValueOf = bundleA.containsKey("time_key") ? Long.valueOf(bundleA.getLong("time_key", 0L)) : l14;
                        if (i15 >= 33) {
                            parcelable2 = (Parcelable) bundleA.getParcelable("distance_unit_type_key", t41.a.class);
                        } else {
                            Object parcelable4 = bundleA.getParcelable("distance_unit_type_key");
                            if (!(parcelable4 instanceof t41.a)) {
                                parcelable4 = l14;
                            }
                            parcelable2 = (t41.a) parcelable4;
                        }
                        t41.a aVar2 = (t41.a) parcelable2;
                        Boolean boolValueOf2 = bundleA.containsKey("is_distance_other_selected_key") ? Boolean.valueOf(bundleA.getBoolean("is_distance_other_selected_key")) : l14;
                        String string2 = bundleA.getString("event_name_key");
                        if (bundleA.containsKey("event_distance_match_course_key")) {
                            z14 = true;
                            boolValueOf = Boolean.valueOf(bundleA.getBoolean("event_distance_match_course_key", true));
                        } else {
                            z14 = true;
                            boolValueOf = l14;
                        }
                        aVar = new u41.a(bVar, string, dValueOf, lValueOf, aVar2, boolValueOf2, string2, boolValueOf, bundleA.containsKey("should_return_to_pace_pro_list_key") ? bundleA.getBoolean("should_return_to_pace_pro_list_key", z14) : true, false, 512, (p005kotlin.jvm.internal.j) null);
                    } else {
                        l14 = null;
                        aVar = null;
                    }
                }
                objQ = aVar == null ? new u41.a((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) null, (String) null, (Double) null, (Long) null, (t41.a) null, (Boolean) null, (String) null, (Boolean) null, false, false, 1023, (p005kotlin.jvm.internal.j) null) : aVar;
            } else {
                l14 = null;
            }
            mVar2.K(objQ);
        } else {
            l14 = null;
        }
        u41.a aVar3 = (u41.a) objQ;
        boolean zR = mVar2.r(aVar3);
        Object objQ2 = mVar2.q();
        if (zR || objQ2 == c2565a) {
            objQ2 = new v0(aVar3, 3);
            mVar2.K(objQ2);
        }
        e23.a aVar4 = (e23.a) objQ2;
        mVar2.L(-1614864554);
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return l14;
        }
        int i16 = 0;
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.b.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar4);
        mVar2.R();
        final p51.b bVar2 = (p51.b) u1VarResolveViewModel;
        m51.a aVar5 = new m51.a();
        boolean zR2 = mVar2.r(bVar2);
        Object objQ3 = mVar2.q();
        if (zR2 || objQ3 == c2565a) {
            objQ3 = new l51.a(bVar2, i16);
            mVar2.K(objQ3);
        }
        c.q qVarC = c.w.c(aVar5, (e23.l) objQ3, mVar2, 0);
        g.h hVar = new g.h();
        boolean zR3 = mVar2.r(bVar2);
        Object objQ4 = mVar2.q();
        if (zR3 || objQ4 == c2565a) {
            objQ4 = new l51.a(bVar2, 1);
            mVar2.K(objQ4);
        }
        c.q qVarC2 = c.w.c(hVar, (e23.l) objQ4, mVar2, 0);
        p1 p1VarC = s9.c.c(bVar2.f136137n, mVar2);
        Object[] objArr = new Object[0];
        Object objQ5 = mVar2.q();
        if (objQ5 == c2565a) {
            objQ5 = new l01.b(25);
            mVar2.K(objQ5);
        }
        final p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ5, mVar2, 48);
        Object[] objArr2 = new Object[0];
        Object objQ6 = mVar2.q();
        if (objQ6 == c2565a) {
            objQ6 = new l01.b(26);
            mVar2.K(objQ6);
        }
        p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ6, mVar2, 48);
        Object[] objArr3 = new Object[0];
        Object objQ7 = mVar2.q();
        if (objQ7 == c2565a) {
            objQ7 = new l01.b(27);
            mVar2.K(objQ7);
        }
        final p1 p1Var3 = (p1) d4.a.e(objArr3, (e23.a) objQ7, mVar2, 48);
        Object objQ8 = mVar2.q();
        if (objQ8 == c2565a) {
            objQ8 = new fe();
            mVar2.K(objQ8);
        }
        fe feVar = (fe) objQ8;
        o51.f fVar = (o51.f) p1VarC.getF182175a();
        boolean zR4 = mVar2.r(bVar2);
        Object objQ9 = mVar2.q();
        if (zR4 || objQ9 == c2565a) {
            objQ9 = new l51.f(bVar2);
            mVar2.K(objQ9);
        }
        z41.h.a(fVar, feVar, (e23.l) ((k23.g) objQ9), mVar2, 48);
        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
            mVar2.C(-442155578);
            boolean z15 = ((o51.f) p1VarC.getF182175a()).f129236a == null;
            boolean zB = mVar2.B(p1Var) | mVar2.r(bVar2);
            Object objQ10 = mVar2.q();
            if (zB || objQ10 == c2565a) {
                final int i17 = 0;
                objQ10 = new e23.a() { // from class: l51.b
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                p1Var.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.k(false, 1, null));
                                break;
                            case 1:
                                p1Var.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.m(new w41.b.a(false)));
                                break;
                            default:
                                p1Var.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.k(false, 1, null));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar2.K(objQ10);
            }
            e23.a aVar6 = (e23.a) objQ10;
            boolean zB2 = mVar2.B(p1Var) | mVar2.r(bVar2);
            Object objQ11 = mVar2.q();
            if (zB2 || objQ11 == c2565a) {
                final int i18 = 1;
                objQ11 = new e23.a() { // from class: l51.b
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                p1Var.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.k(false, 1, null));
                                break;
                            case 1:
                                p1Var.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.m(new w41.b.a(false)));
                                break;
                            default:
                                p1Var.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.k(false, 1, null));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar2.K(objQ11);
            }
            zf.b.a(z15, aVar6, (e23.a) objQ11, mVar2, 0);
            mVar2.f();
        } else {
            mVar2.C(-441558797);
            mVar2.f();
        }
        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
            mVar2.C(-441508887);
            o51.f fVar2 = (o51.f) p1VarC.getF182175a();
            boolean zB3 = mVar2.B(p1Var2);
            Object objQ12 = mVar2.q();
            if (zB3 || objQ12 == c2565a) {
                i14 = 0;
                objQ12 = new l51.c(p1Var2, 0);
                mVar2.K(objQ12);
            } else {
                i14 = 0;
            }
            a51.j.a(fVar2, (e23.a) objQ12, mVar2, i14);
            mVar2.f();
        } else {
            mVar2.C(-441314765);
            mVar2.f();
        }
        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
            mVar2.C(-441266684);
            boolean zB4 = mVar2.B(p1Var3) | mVar2.r(bVar2);
            Object objQ13 = mVar2.q();
            if (zB4 || objQ13 == c2565a) {
                final int i19 = 2;
                objQ13 = new e23.a() { // from class: l51.b
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                p1Var3.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.k(false, 1, null));
                                break;
                            case 1:
                                p1Var3.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.m(new w41.b.a(false)));
                                break;
                            default:
                                p1Var3.setValue(Boolean.FALSE);
                                bVar2.y4(new w41.a.k(false, 1, null));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar2.K(objQ13);
            }
            jg.b.e((e23.a) objQ13, mVar2, 0);
            mVar2.f();
        } else {
            mVar2.C(-441006253);
            mVar2.f();
        }
        Unit unit = Unit.INSTANCE;
        boolean zR5 = mVar2.r(vVar) | mVar2.r(bVar2) | mVar2.r(f158016a) | mVar2.r(yVar) | mVar2.r(activity) | mVar2.r(qVarC) | mVar2.r(qVarC2) | mVar2.r(aVar3) | mVar2.B(jVar) | mVar2.B(p1Var) | mVar2.B(p1Var2) | mVar2.B(p1Var3);
        Object objQ14 = mVar2.q();
        if (zR5 || objQ14 == c2565a) {
            mVar = mVar2;
            gVar = new l51.g(vVar, bVar2, f158016a, yVar, activity, qVarC, qVarC2, feVar, aVar3, jVar, p1Var, p1Var2, p1Var3, null);
            mVar.K(gVar);
        } else {
            gVar = objQ14;
            mVar = mVar2;
        }
        l0.e((p) gVar, unit, mVar);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:6:0x002e  */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        m0 m0Var = (m0) this.f11556b;
        p51.c cVar = (p51.c) this.f11557c;
        m mVar = (m) obj3;
        ((Integer) obj4).getClass();
        ((l) obj).getClass();
        ((v) obj2).getClass();
        x1 x1Var = n.f135158a;
        boolean zR = mVar.r(m0Var);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (zR) {
            objQ = new k62.j(m0Var, 8);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new k62.j(m0Var, 8);
                mVar.K(objQ);
            }
        }
        e23.a aVar2 = (e23.a) objQ;
        boolean zR2 = mVar.r(m0Var) | mVar.r(cVar);
        Object objQ2 = mVar.q();
        if (zR2) {
            objQ2 = new l3.p1(9, m0Var, cVar);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new l3.p1(9, m0Var, cVar);
                mVar.K(objQ2);
            }
        }
        n51.a.a(aVar2, (e23.l) objQ2, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        n82.f fVar = (n82.f) this.f11556b;
        e23.l lVar = (e23.l) this.f11557c;
        o82.g gVar = (o82.g) obj;
        o82.a aVar = (o82.a) obj2;
        m mVar = (m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar) ? 32 : 16;
        }
        if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean zB = mVar.B(fVar) | ((i14 & 112) == 32) | mVar.B(lVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new p0.b(fVar, aVar, lVar, null);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new p0.b(fVar, aVar, lVar, null);
                    mVar.K(objQ);
                }
            }
            l0.e((p) objQ, gVar, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x031a  */
    /* JADX WARN: Code duplicated, block: B:145:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:189:0x0532  */
    /* JADX WARN: Code duplicated, block: B:190:0x053c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0615  */
    /* JADX WARN: Code duplicated, block: B:237:0x0696  */
    /* JADX WARN: Code duplicated, block: B:244:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:252:0x074e  */
    /* JADX WARN: Code duplicated, block: B:269:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:322:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:332:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:337:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:350:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:355:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:360:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:367:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:390:0x0bd1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v116, types: [java.lang.Object, o13.l] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v100 java.lang.Object, still in use, count: 2, list:
          (r1v100 java.lang.Object) from 0x052e: PHI (r1 I:??) = (r1v96 java.lang.Object), (r1v100 java.lang.Object) binds: [B:186:0x052d, B:423:0x052e] A[DONT_GENERATE, DONT_INLINE]
          (r1v100 java.lang.Object) from 0x051e: CHECK_CAST (h82.c$b) (r1v100 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // e23.r
    public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 3312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao1.f.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
