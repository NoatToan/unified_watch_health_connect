package ik1;

import am.l1;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w1;
import b5.a0;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import ca0.q1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivitiesActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsPrivacyActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.courses.filter.CourseSortFilterActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.PregnancyHistoryActivity;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import com.garmin.android.apps.connectmobile.settings.autodetect.DeviceAutoDetectActivity;
import com.garmin.android.apps.connectmobile.settings.autodetect.DeviceAutoDetectActivity.b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import db1.m;
import e23.p;
import f4.w;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.d6;
import i3.e5;
import i3.f2;
import i3.i7;
import i3.mh;
import i3.v5;
import ix.i;
import j02.f0;
import j02.i0;
import j02.j0;
import j02.m0;
import j02.x;
import j23.t;
import j92.e;
import j92.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import lc.v0;
import m92.h0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p008y1.b2;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.m1;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.z1;
import r53.p2;
import v.h;
import yr0.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93913b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f93912a = i14;
        this.f93913b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        PregnancyHistoryActivity pregnancyHistoryActivity = (PregnancyHistoryActivity) this.f93913b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        PregnancyHistoryActivity.a aVar = PregnancyHistoryActivity.f40886b;
        dialogInterface.getClass();
        dialogInterface.dismiss();
        try {
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b) pregnancyHistoryActivity.getSupportFragmentManager().G("PreviousPregnancyDetailsFragment");
            if (bVar != null) {
                m mVar = bVar.f40916i;
                if (mVar == null) {
                    s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate originalDueDate = mVar.getOriginalDueDate();
                if (originalDueDate != null) {
                    kb1.a aVar2 = bVar.f40917j;
                    if (aVar2 == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    aVar2.O1(originalDueDate);
                }
            }
        } catch (Exception e4) {
            PregnancyHistoryActivity.f40887c.error("error trying to find previousPregnancyDetailsFragment", (Throwable) e4);
            pregnancyHistoryActivity.da();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    private final Object b(Object obj, Object obj2) {
        ArrayList arrayList;
        i53.c cVarD;
        Float fValueOf;
        i53.d<Float, Float> dVar;
        fc1.a aVar = (fc1.a) this.f93913b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            j.f22691a.getClass();
            j.b bVar = j.f22695e;
            h4.d.f81522a.getClass();
            z zVarA = y.a(bVar, h4.d.a.f81536n, mVar, 6);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = k.c(rVarD, mVar);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            i53.c cVarD2 = null;
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
            g.a.b bVar2 = g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            if (aVar == null || (dVar = aVar.f70396d) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(dVar.size());
                for (Map.Entry<Float, Float> entry : dVar.entrySet()) {
                    arrayList.add(new h0.e.a(entry.getKey().floatValue(), entry.getValue().floatValue()));
                }
            }
            if (arrayList == null) {
                mVar.C(959513295);
                mVar.f();
                cVarD = null;
            } else {
                mVar.C(308046706);
                cVarD = kc1.b.d(arrayList, mVar);
                mVar.f();
            }
            if (cVarD != null) {
                Iterator<E> it = cVarD.iterator();
                if (it.hasNext()) {
                    float fMin = ((h0.e.c) it.next()).f117350a.f117347b;
                    while (it.hasNext()) {
                        fMin = Math.min(fMin, ((h0.e.c) it.next()).f117350a.f117347b);
                    }
                    fValueOf = Float.valueOf(fMin);
                } else {
                    fValueOf = null;
                }
            } else {
                fValueOf = null;
            }
            i53.d<Float, Float> dVar2 = aVar != null ? aVar.f70396d : null;
            if (dVar2 == null || dVar2.isEmpty()) {
                mVar.C(960529042);
                String strQ = gl1.y.Q(mVar, R.string.common_no_data);
                r rVarA = l.A(x2.f(r.S, 1.0f), 0.0f, 0.0f, 3);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, mVar), mVar, 48, 0, 131068);
                mVar = mVar;
                mVar.f();
            } else {
                mVar.C(959665940);
                r.a aVar3 = r.S;
                r rVarA2 = b0Var.a(x2.f(aVar3, 1.0f), 1.0f, true);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC2 = l.C(rVarA2, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                x1 x1Var2 = n.f135158a;
                int iHashCode2 = Long.hashCode(mVar.getU());
                i2 i2VarX2 = mVar.x();
                r rVarC3 = k.c(rVarC2, mVar);
                g.V.getClass();
                e0.a aVar4 = g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar4);
                } else {
                    mVar.c();
                }
                b4.c(g.a.f81810g, z0VarD, mVar);
                b4.c(g.a.f81809f, i2VarX2, mVar);
                g.a.b bVar3 = g.a.f81813j;
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    h.z(iHashCode2, mVar, iHashCode2, bVar3);
                }
                b4.c(g.a.f81807d, rVarC3, mVar);
                u uVar = u.f22885a;
                r rVarD2 = x2.d(aVar3, 1.0f);
                if (arrayList == null) {
                    mVar.C(605219118);
                } else {
                    mVar.C(1820638515);
                    cVarD2 = kc1.b.d(arrayList, mVar);
                }
                mVar.f();
                if (cVarD2 == null) {
                    cVarD2 = j53.l.b();
                }
                m92.u.a(rVarD2, cVarD2, Float.valueOf(24.0f), true, fValueOf, Float.valueOf(101.0f), 0.0f, gl1.y.Q(mVar, R.string.common_no_data), mVar, 27654, 7810);
                mVar.y();
                mVar.f();
            }
            String strQ2 = gl1.y.Q(mVar, R.string.mct_lbl_today);
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            e eVar = j92.b.f97899b;
            r rVarC4 = l.C(rVarF, 0.0f, eVar.f97917b, 0.0f, eVar.f97920e, 5);
            d92.b.f58624b.getClass();
            p3.m mVar2 = mVar;
            mh.c(strQ2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, mVar), mVar2, 0, 0, 131068);
            mVar2.y();
            x1 x1Var3 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        kh0.g.f((ih0.n) this.f93913b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        kh0.g.d((dh0.n) this.f93913b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        kh0.g.e((DateTime) this.f93913b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        fi1.a aVar = (fi1.a) this.f93913b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            wf.f.a aVar2 = new wf.f.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar2.f184930c = aVar.f71763c;
            wf.g.a(aVar2);
            wf.f fVarA = aVar2.a();
            t4.d dVarA = n5.c.a(2131231969, mVar, 0);
            t4.d dVarA2 = n5.c.a(2131231969, mVar, 0);
            r.a aVar3 = r.S;
            float f14 = 48;
            g6.f.a aVar4 = g6.f.f75994b;
            jf.r.b(fVarA, "", x2.u(x2.h(aVar3, f14), f14), dVarA, dVarA2, null, null, null, null, null, null, null, mVar, 432, 0, 32736);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0498  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:161:0x0518  */
    /* JADX WARN: Code duplicated, block: B:235:0x0705  */
    /* JADX WARN: Code duplicated, block: B:250:0x077b  */
    /* JADX WARN: Code duplicated, block: B:267:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:272:0x0800  */
    /* JADX WARN: Code duplicated, block: B:277:0x081c  */
    /* JADX WARN: Code duplicated, block: B:400:0x0bee  */
    /* JADX WARN: Code duplicated, block: B:48:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x022b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v112, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        js0.c cVar;
        boolean zQ;
        Object value;
        long j8;
        boolean zC;
        j02.g gVarC;
        Object obj3;
        Object obj4;
        Object obj5;
        Object value2;
        float f14;
        f2.p0 p0Var;
        c2 c2Var;
        Object next;
        float fIntBitsToFloat;
        Integer num;
        Integer numValueOf;
        List list;
        int i14 = this.f93912a;
        float f15 = 0.0f;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 3;
        boolean z14 = false;
        final int i16 = 1;
        Object obj6 = this.f93913b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                d.b((hk1.d) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ManageTripsActivity manageTripsActivity = (ManageTripsActivity) obj6;
                js0.g gVar = (js0.g) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                gVar.getClass();
                int i17 = ManageTripsActivity.b.f36994b[gVar.ordinal()];
                if (i17 == 1) {
                    cVar = manageTripsActivity.f36988c;
                } else if (i17 == 2) {
                    cVar = manageTripsActivity.f36989d;
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    cVar = manageTripsActivity.f36990e;
                }
                o oVar = cVar != null ? (o) cVar.f100618e.get(iIntValue) : null;
                ns0.a aVar3 = ns0.a.f127811a;
                if (oVar != null) {
                    ns0.b.f127812a.getClass();
                    zQ = ns0.b.q(oVar);
                } else {
                    zQ = false;
                }
                d6 d6Var = new d6(manageTripsActivity, 16, gVar, oVar);
                ag0.a aVar4 = new ag0.a(cVar, iIntValue, 9);
                aVar3.getClass();
                ns0.a.a(manageTripsActivity, zQ, d6Var, aVar4).show(manageTripsActivity.getSupportFragmentManager(), (String) null);
                return Unit.INSTANCE;
            case 2:
                gv0.d dVar = (gv0.d) obj6;
                pu0.b bVar = (pu0.b) obj;
                pu0.b bVar2 = (pu0.b) obj2;
                bVar.getClass();
                bVar2.getClass();
                dVar.getClass();
                ge1.b.T(v1.a(dVar), null, null, new gv0.u(dVar, bVar, bVar2, null), 3);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i18 = iv1.d.f95211i;
                ((iv1.d) obj6).g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                BodyBatteryReportsActivity bodyBatteryReportsActivity = (BodyBatteryReportsActivity) obj6;
                w1 w1Var = bodyBatteryReportsActivity.f30938a;
                p3.m mVar = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i19 = BodyBatteryReportsActivity.f30937b;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    p1 p1VarC = s9.c.c(((ix.j) w1Var.getValue()).f95628h, mVar);
                    bodyBatteryReportsActivity.setRequestedOrientation((((ix.l) p1VarC.getF182175a()).f95664d || !((ix.l) p1VarC.getF182175a()).f95668h) ? 5 : -1);
                    boolean z15 = ((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 1;
                    p2 p2Var = ((ix.j) w1Var.getValue()).f95627g;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, ix.l.a((ix.l) value, false, null, null, false, false, false, z15, false, null, 447)));
                    ix.j jVar = (ix.j) w1Var.getValue();
                    boolean zR = mVar.r(bodyBatteryReportsActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new f2(bodyBatteryReportsActivity, 13);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f2(bodyBatteryReportsActivity, 13);
                            mVar.K(objQ);
                        }
                    }
                    i.a(jVar, (e23.a) objQ, mVar, 0);
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.b.a((iy0.f) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                a0Var.a();
                j02.s<?> sVar = ((j02.m) obj6).f96111a;
                long j14 = ((n4.c) obj2).f123544a;
                z53.b bVar3 = sVar.f96135j;
                j0 j0Var = sVar.f96131f;
                j02.i<?> iVar = sVar.f96126a;
                c2 c2Var2 = sVar.f96138m;
                c2Var2.setValue(n4.c.a(n4.c.j(((n4.c) c2Var2.getF182175a()).f123544a, j14)));
                j02.g<?> gVarD = sVar.d();
                if (gVarD != null) {
                    long jI = sVar.i(sVar.h(sVar.e()));
                    long jD = gVarD.d();
                    g6.k.a aVar5 = g6.k.f76003b;
                    long j15 = n4.c.j((((long) Float.floatToRawIntBits((int) (jD & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jD >> 32))) << 32), jI);
                    long jD2 = j02.p.d(j15, g6.n.c(gVarD.a()));
                    f0 f0VarC = iVar.c();
                    j02.a aVar6 = sVar.f96130e;
                    aVar6.getClass();
                    j02.b.a aVar7 = j02.b.f96025c;
                    b2 orientation = f0VarC.getOrientation();
                    boolean zC2 = f0VarC.c();
                    aVar7.getClass();
                    i0 i0VarB = f0VarC.b(j02.b.a.a(orientation, aVar6, zC2));
                    float f16 = i0VarB.f96071a;
                    float f17 = i0VarB.f96072b;
                    boolean z16 = iVar.c().f96068a.getF62555o() || (sVar.f96132g == g6.o.Rtl && sVar.f() == b2.Horizontal);
                    if (z16) {
                        j8 = n4.c.i(jD2, sVar.f96142q);
                    } else {
                        if (z16) {
                            u0.r();
                            return null;
                        }
                        j8 = n4.c.j(j15, sVar.f96142q);
                    }
                    long jB = j02.p.b(g6.k.f76003b, sVar.f(), iVar.c().f96068a.b());
                    long j16 = n4.c.j(j8, (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32));
                    float fC = j02.p.c(sVar.f(), j16) - f16;
                    if (fC < 0.0f) {
                        fC = 0.0f;
                    }
                    float fC2 = f17 - j02.p.c(sVar.f(), j16);
                    if (fC2 < 0.0f) {
                        fC2 = 0.0f;
                    }
                    float f18 = sVar.f96129d;
                    if (fC < f18) {
                        zC = j0Var.c(j0.b.BACKWARD, (1 - t.d((fC + f18) / (f18 * 2), 0.0f, 1.0f)) * 10, new j02.q(sVar, 0), new j02.y(sVar, null));
                    } else if (fC2 < f18) {
                        zC = j0Var.c(j0.b.FORWARD, (1 - t.d((fC2 + f18) / (f18 * 2), 0.0f, 1.0f)) * 10, new j02.q(sVar, 1), new j02.z(sVar, null));
                    } else {
                        ge1.b.T(j0Var.f96074b, null, null, new m0(j0Var, null), 3);
                        zC = false;
                    }
                    if (bVar3.f()) {
                        o53.c2 c2Var3 = j0Var.f96076d;
                        if ((c2Var3 != null && c2Var3.isActive()) || zC || (gVarC = j02.s.c(sVar, g8.i.f(j15, jD2), iVar.c().e(), null, new iz1.f(gVarD, 3), 4)) == null) {
                            obj3 = null;
                        } else {
                            obj3 = null;
                            ge1.b.T(sVar.f96127b, null, null, new x(sVar, gVarD, gVarC, null), 3);
                        }
                        bVar3.e(obj3);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                GroupSettingsActivitiesActivity groupSettingsActivitiesActivity = (GroupSettingsActivitiesActivity) obj6;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                GroupSettingsActivitiesActivity.a aVar8 = GroupSettingsActivitiesActivity.f31417b;
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        GroupDTO groupDTO = groupSettingsActivitiesActivity.f31418a;
                        if (groupDTO == null) {
                            s.m("groupDTO");
                            throw null;
                        }
                        ArrayList arrayList = groupDTO.f31573p;
                        arrayList.getClass();
                        com.garmin.android.apps.connectmobile.connections.groups.services.model.e[] eVarArr = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.connections.groups.services.model.e[0]);
                        Object[] objArrCopyOf = Arrays.copyOf(eVarArr, eVarArr.length);
                        w wVar = new w();
                        wVar.addAll(p13.u.m0(objArrCopyOf));
                        mVar2.K(wVar);
                        objQ2 = wVar;
                    }
                    w wVar2 = (w) objQ2;
                    Object objQ3 = mVar2.q();
                    Object obj7 = objQ3;
                    if (objQ3 == c2565a) {
                        GroupDTO groupDTO2 = groupSettingsActivitiesActivity.f31418a;
                        if (groupDTO2 == null) {
                            s.m("groupDTO");
                            throw null;
                        }
                        c2 c2VarN = p0.n(groupDTO2.f31574q);
                        mVar2.K(c2VarN);
                        obj7 = c2VarN;
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(785128343, new j10.e(groupSettingsActivitiesActivity, wVar2, (p1) obj7, z14 ? 1 : 0), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 8:
                GroupSettingsPrivacyActivity groupSettingsPrivacyActivity = (GroupSettingsPrivacyActivity) obj6;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                GroupSettingsPrivacyActivity.a aVar9 = GroupSettingsPrivacyActivity.f31458b;
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    Object objQ4 = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ4 == c2565a2) {
                        objQ4 = p0.n(groupSettingsPrivacyActivity.da().f31567j);
                        mVar3.K(objQ4);
                    }
                    p1 p1Var = (p1) objQ4;
                    Object objQ5 = mVar3.q();
                    if (objQ5 == c2565a2) {
                        objQ5 = p0.n(groupSettingsPrivacyActivity.da().f31568k);
                        mVar3.K(objQ5);
                    }
                    p1 p1Var2 = (p1) objQ5;
                    z02.b.a(false, null, null, null, false, z3.f.c(48453245, new j10.o(groupSettingsPrivacyActivity, p1Var, p1Var2, z14 ? 1 : 0), mVar3), mVar3, 196608, 31);
                    boolean zR2 = mVar3.r(groupSettingsPrivacyActivity);
                    Object objQ6 = mVar3.q();
                    if (zR2 || objQ6 == c2565a2) {
                        objQ6 = new j10.p(groupSettingsPrivacyActivity, p1Var, p1Var2, z14 ? 1 : 0);
                        mVar3.K(objQ6);
                    }
                    c.w.a(0, 1, (e23.a) objQ6, mVar3, false);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 9:
                final CourseSortFilterActivity courseSortFilterActivity = (CourseSortFilterActivity) obj6;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                CourseSortFilterActivity.a aVar10 = CourseSortFilterActivity.f32768c;
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    c2 c2Var4 = courseSortFilterActivity.f32769a;
                    if (c2Var4 == null) {
                        s.m("courseSortFilter");
                        throw null;
                    }
                    k30.n nVar = (k30.n) c2Var4.getF182175a();
                    boolean zR3 = mVar4.r(courseSortFilterActivity);
                    Object objQ7 = mVar4.q();
                    if (zR3) {
                        objQ7 = new f2(courseSortFilterActivity, 18);
                        mVar4.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new f2(courseSortFilterActivity, 18);
                            mVar4.K(objQ7);
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ7;
                    boolean zR4 = mVar4.r(courseSortFilterActivity);
                    Object objQ8 = mVar4.q();
                    if (zR4) {
                        final int i24 = z14 ? 1 : 0;
                        objQ8 = new e23.l() { // from class: j30.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj8) {
                                int i25 = i24;
                                CourseSortFilterActivity courseSortFilterActivity2 = courseSortFilterActivity;
                                switch (i25) {
                                    case 0:
                                        k30.m mVar5 = (k30.m) obj8;
                                        CourseSortFilterActivity.a aVar12 = CourseSortFilterActivity.f32768c;
                                        mVar5.getClass();
                                        c2 c2Var5 = courseSortFilterActivity2.f32769a;
                                        if (c2Var5 != null) {
                                            c2Var5.setValue(k30.n.b((k30.n) c2Var5.getF182175a(), mVar5, null, 14));
                                            return Unit.INSTANCE;
                                        }
                                        s.m("courseSortFilter");
                                        throw null;
                                    default:
                                        i53.c cVar2 = (i53.c) obj8;
                                        CourseSortFilterActivity.a aVar13 = CourseSortFilterActivity.f32768c;
                                        cVar2.getClass();
                                        c2 c2Var6 = courseSortFilterActivity2.f32769a;
                                        if (c2Var6 != null) {
                                            c2Var6.setValue(k30.n.b((k30.n) c2Var6.getF182175a(), null, cVar2, 13));
                                            return Unit.INSTANCE;
                                        }
                                        s.m("courseSortFilter");
                                        throw null;
                                }
                            }
                        };
                        mVar4.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            final int i25 = z14 ? 1 : 0;
                            objQ8 = new e23.l() { // from class: j30.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj8) {
                                    int i26 = i25;
                                    CourseSortFilterActivity courseSortFilterActivity2 = courseSortFilterActivity;
                                    switch (i26) {
                                        case 0:
                                            k30.m mVar5 = (k30.m) obj8;
                                            CourseSortFilterActivity.a aVar12 = CourseSortFilterActivity.f32768c;
                                            mVar5.getClass();
                                            c2 c2Var5 = courseSortFilterActivity2.f32769a;
                                            if (c2Var5 != null) {
                                                c2Var5.setValue(k30.n.b((k30.n) c2Var5.getF182175a(), mVar5, null, 14));
                                                return Unit.INSTANCE;
                                            }
                                            s.m("courseSortFilter");
                                            throw null;
                                        default:
                                            i53.c cVar2 = (i53.c) obj8;
                                            CourseSortFilterActivity.a aVar13 = CourseSortFilterActivity.f32768c;
                                            cVar2.getClass();
                                            c2 c2Var6 = courseSortFilterActivity2.f32769a;
                                            if (c2Var6 != null) {
                                                c2Var6.setValue(k30.n.b((k30.n) c2Var6.getF182175a(), null, cVar2, 13));
                                                return Unit.INSTANCE;
                                            }
                                            s.m("courseSortFilter");
                                            throw null;
                                    }
                                }
                            };
                            mVar4.K(objQ8);
                        }
                    }
                    e23.l lVar = (e23.l) objQ8;
                    boolean zR5 = mVar4.r(courseSortFilterActivity);
                    Object objQ9 = mVar4.q();
                    if (zR5) {
                        objQ9 = new e23.l() { // from class: j30.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj8) {
                                int i26 = i16;
                                CourseSortFilterActivity courseSortFilterActivity2 = courseSortFilterActivity;
                                switch (i26) {
                                    case 0:
                                        k30.m mVar5 = (k30.m) obj8;
                                        CourseSortFilterActivity.a aVar12 = CourseSortFilterActivity.f32768c;
                                        mVar5.getClass();
                                        c2 c2Var5 = courseSortFilterActivity2.f32769a;
                                        if (c2Var5 != null) {
                                            c2Var5.setValue(k30.n.b((k30.n) c2Var5.getF182175a(), mVar5, null, 14));
                                            return Unit.INSTANCE;
                                        }
                                        s.m("courseSortFilter");
                                        throw null;
                                    default:
                                        i53.c cVar2 = (i53.c) obj8;
                                        CourseSortFilterActivity.a aVar13 = CourseSortFilterActivity.f32768c;
                                        cVar2.getClass();
                                        c2 c2Var6 = courseSortFilterActivity2.f32769a;
                                        if (c2Var6 != null) {
                                            c2Var6.setValue(k30.n.b((k30.n) c2Var6.getF182175a(), null, cVar2, 13));
                                            return Unit.INSTANCE;
                                        }
                                        s.m("courseSortFilter");
                                        throw null;
                                }
                            }
                        };
                        mVar4.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new e23.l() { // from class: j30.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj8) {
                                    int i26 = i16;
                                    CourseSortFilterActivity courseSortFilterActivity2 = courseSortFilterActivity;
                                    switch (i26) {
                                        case 0:
                                            k30.m mVar5 = (k30.m) obj8;
                                            CourseSortFilterActivity.a aVar12 = CourseSortFilterActivity.f32768c;
                                            mVar5.getClass();
                                            c2 c2Var5 = courseSortFilterActivity2.f32769a;
                                            if (c2Var5 != null) {
                                                c2Var5.setValue(k30.n.b((k30.n) c2Var5.getF182175a(), mVar5, null, 14));
                                                return Unit.INSTANCE;
                                            }
                                            s.m("courseSortFilter");
                                            throw null;
                                        default:
                                            i53.c cVar2 = (i53.c) obj8;
                                            CourseSortFilterActivity.a aVar13 = CourseSortFilterActivity.f32768c;
                                            cVar2.getClass();
                                            c2 c2Var6 = courseSortFilterActivity2.f32769a;
                                            if (c2Var6 != null) {
                                                c2Var6.setValue(k30.n.b((k30.n) c2Var6.getF182175a(), null, cVar2, 13));
                                                return Unit.INSTANCE;
                                            }
                                            s.m("courseSortFilter");
                                            throw null;
                                    }
                                }
                            };
                            mVar4.K(objQ9);
                        }
                    }
                    j30.i.b(nVar, aVar11, lVar, (e23.l) objQ9, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 10:
                RunningToleranceReportsActivity runningToleranceReportsActivity = (RunningToleranceReportsActivity) obj6;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                RunningToleranceReportsActivity.a aVar12 = RunningToleranceReportsActivity.f41161b;
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    lc.m0 m0VarI = gl1.y.I(new v0[0], mVar5);
                    String str = com.garmin.android.apps.connectmobile.running_tolerance.presentation.c.C0781c.f41171b.f41168a;
                    boolean zR6 = mVar5.r(runningToleranceReportsActivity) | mVar5.r(m0VarI);
                    Object objQ10 = mVar5.q();
                    if (zR6) {
                        obj4 = objQ10;
                        hy.h hVar = new hy.h(29, runningToleranceReportsActivity, m0VarI);
                        mVar5.K(hVar);
                        obj4 = hVar;
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj4 = objQ10;
                            hy.h hVar2 = new hy.h(29, runningToleranceReportsActivity, m0VarI);
                            mVar5.K(hVar2);
                            obj4 = hVar2;
                        }
                    }
                    obj4 = objQ10;
                    nc.y.b(m0VarI, str, null, null, null, null, null, null, (e23.l) obj4, mVar5, 0, 1020);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 11:
                DeviceAutoDetectActivity deviceAutoDetectActivity = (DeviceAutoDetectActivity) obj6;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                DeviceAutoDetectActivity.a aVar13 = DeviceAutoDetectActivity.f41730c;
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    p1 p1VarC2 = s9.c.c(r53.s.d(((jg1.c) deviceAutoDetectActivity.f41731a.getValue()).f98729a), mVar6);
                    Boolean bool = (Boolean) p1VarC2.getF182175a();
                    boolean zB = mVar6.B(p1VarC2) | mVar6.r(deviceAutoDetectActivity);
                    Object objQ11 = mVar6.q();
                    if (zB) {
                        obj5 = objQ11;
                        DeviceAutoDetectActivity.b bVar4 = deviceAutoDetectActivity.new b(p1VarC2, null);
                        mVar6.K(bVar4);
                        obj5 = bVar4;
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            obj5 = objQ11;
                            DeviceAutoDetectActivity.b bVar5 = deviceAutoDetectActivity.new b(p1VarC2, null);
                            mVar6.K(bVar5);
                            obj5 = bVar5;
                        }
                    }
                    obj5 = objQ11;
                    l0.e((p) obj5, bool, mVar6);
                    z02.b.a(false, null, null, null, false, z3.f.c(-1728610399, new l1(p1VarC2, 17, z14 ? (byte) 1 : (byte) 0), mVar6), mVar6, 196608, 31);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 12:
                jk1.f fVar = (jk1.f) obj6;
                Map map = (Map) obj;
                fVar.f99404h = (List) obj2;
                p2 p2Var2 = fVar.f99406j;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, jk1.e.a((jk1.e) value2, false, null, i53.a.k(map), null, 478)));
                return Unit.INSTANCE;
            case 13:
                pt1.x xVar = (pt1.x) obj6;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    i7.a(n5.c.a(xVar.f141015l ? 2131233508 : 2131233507, mVar7, 0), null, null, ds.e0.b(d92.b.f58623a, mVar7), mVar7, 48, 4);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                sy0.f fVar2 = (sy0.f) obj6;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r.a aVar14 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar8.getU());
                    i2 i2VarX = mVar8.x();
                    r rVarC = k.c(aVar14, mVar8);
                    g.V.getClass();
                    e0.a aVar15 = g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar15);
                    } else {
                        mVar8.c();
                    }
                    b4.c(g.a.f81810g, z0VarD, mVar8);
                    b4.c(g.a.f81809f, i2VarX, mVar8);
                    g.a.b bVar6 = g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar8, iHashCode, bVar6);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar8);
                    u uVar = u.f22885a;
                    u4.d dVar2 = fVar2.f161217g.f4362e;
                    long jB2 = ds.e0.b(d92.b.f58623a, mVar8);
                    String strT = gl1.d.T(fVar2.f161217g.f4360c, mVar8, 0);
                    d92.b.f58625c.getClass();
                    i7.b(dVar2, strT, x2.q(aVar14, j92.b.f97901d.f97905d), jB2, mVar8, 0, 0);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 15:
                jy0.h hVar3 = (jy0.h) obj6;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    hVar3.L();
                } else {
                    hVar3.f4(zBooleanValue2);
                }
                return Unit.INSTANCE;
            case 16:
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj6;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    g6.f.a aVar16 = g6.f.f75994b;
                    i7.b(activityListItemDTO.f29265g.f4362e, null, l.A(r.S, 10, 0.0f, 2), 0L, mVar9, 432, 8);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                k02.d dVar3 = (k02.d) obj6;
                a0 a0Var2 = (a0) obj;
                a0Var2.getClass();
                a0Var2.a();
                long j17 = ((n4.c) obj2).f123544a;
                f2.p0 p0Var2 = dVar3.f102106a;
                c2 c2Var5 = dVar3.f102110e;
                c2Var5.setValue(n4.c.a(n4.c.j(((n4.c) c2Var5.getF182175a()).f123544a, j17)));
                f2.m mVarA = dVar3.a();
                if (mVarA != null) {
                    long jD3 = mVarA.getF68169v();
                    g6.k.a aVar17 = g6.k.f76003b;
                    long j18 = n4.c.j((((long) Float.floatToRawIntBits((int) (jD3 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jD3 >> 32))) << 32), dVar3.b());
                    long jC = g6.n.c(mVarA.getF68168u());
                    int i26 = (int) (j18 & 4294967295L);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jC >> 32)) + Float.intBitsToFloat((int) (j18 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jC & 4294967295L)) + Float.intBitsToFloat(i26))) & 4294967295L);
                    long j19 = n4.c.j(j18, n4.c.c(2.0f, n4.c.i(jFloatToRawIntBits, j18)));
                    Iterator<T> it = p0Var2.i().e().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            f2.m mVar10 = (f2.m) next;
                            f14 = f15;
                            p0Var = p0Var2;
                            int iD = (int) (mVar10.getF68169v() >> 32);
                            c2Var = c2Var5;
                            int iC = (int) (k02.d.c(mVar10) >> 32);
                            long j24 = j19;
                            int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j24 >> 32));
                            if (iD <= iIntBitsToFloat && iIntBitsToFloat <= iC) {
                                int iD2 = (int) (mVar10.getF68169v() & 4294967295L);
                                int iC2 = (int) (k02.d.c(mVar10) & 4294967295L);
                                int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (j24 & 4294967295L));
                                if (iD2 > iIntBitsToFloat2 || iIntBitsToFloat2 > iC2 || mVarA.getF62559a() == mVar10.getF62559a()) {
                                }
                            }
                            j19 = j24;
                            c2Var5 = c2Var;
                            f15 = f14;
                            p0Var2 = p0Var;
                        } else {
                            f14 = f15;
                            p0Var = p0Var2;
                            c2Var = c2Var5;
                            next = null;
                        }
                    }
                    f2.m mVar11 = (f2.m) next;
                    if (mVar11 != null) {
                        if (mVar11.getF62559a() == p0Var.g()) {
                            numValueOf = Integer.valueOf(mVarA.getF62559a());
                        } else {
                            if (mVarA.getF62559a() == p0Var.g()) {
                                numValueOf = Integer.valueOf(mVar11.getF62559a());
                            } else {
                                num = null;
                            }
                            if (num != null) {
                                ge1.b.T(dVar3.f102107b, null, null, new k02.c(dVar3, num, mVarA, mVar11, null), 3);
                            } else {
                                dVar3.f102108c.invoke(Integer.valueOf(mVarA.getF62559a()), Integer.valueOf(mVar11.getF62559a()));
                            }
                            dVar3.f102109d.setValue(Integer.valueOf(mVar11.getF62559a()));
                        }
                        num = numValueOf;
                        if (num != null) {
                            ge1.b.T(dVar3.f102107b, null, null, new k02.c(dVar3, num, mVarA, mVar11, null), 3);
                        } else {
                            dVar3.f102108c.invoke(Integer.valueOf(mVarA.getF62559a()), Integer.valueOf(mVar11.getF62559a()));
                        }
                        dVar3.f102109d.setValue(Integer.valueOf(mVar11.getF62559a()));
                    } else {
                        if (Float.intBitsToFloat((int) (((n4.c) c2Var.getF182175a()).f123544a & 4294967295L)) > f14) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) - p0Var.i().getF68338o();
                            if (fIntBitsToFloat < f14) {
                                fIntBitsToFloat = f14;
                            }
                        } else if (Float.intBitsToFloat((int) (((n4.c) c2Var.getF182175a()).f123544a & 4294967295L)) < f14) {
                            fIntBitsToFloat = Float.intBitsToFloat(i26) - p0Var.i().getF68337n();
                            if (fIntBitsToFloat > f14) {
                                fIntBitsToFloat = f14;
                            }
                        } else {
                            fIntBitsToFloat = f14;
                        }
                        if (fIntBitsToFloat != f14) {
                            dVar3.f102112g.i(Float.valueOf(fIntBitsToFloat));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                k11.a0.e((b11.i.b) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                k20.d.a aVar18 = k20.d.f102434j;
                ((DialogInterface) obj).getClass();
                g20.i iVarV6 = ((k20.d) obj6).v6();
                l20.a aVar19 = iVarV6.f75341e;
                if (aVar19 != null) {
                    iVarV6.B4(com.garmin.android.apps.connectmobile.contacts.b.j(aVar19));
                    return Unit.INSTANCE;
                }
                s.m("contactDTO");
                throw null;
            case 20:
                com.garmin.android.apps.connectmobile.developer.tutorials.b bVar7 = (com.garmin.android.apps.connectmobile.developer.tutorials.b) obj6;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar20 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    Object objQ12 = mVar12.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ12 == c2565a3) {
                        objQ12 = new z1(0.0f);
                        mVar12.K(objQ12);
                    }
                    m1 m1Var = (m1) objQ12;
                    Object objQ13 = mVar12.q();
                    if (objQ13 == c2565a3) {
                        objQ13 = new q1(m1Var, i15);
                        mVar12.K(objQ13);
                    }
                    o13.p pVar = new o13.p(m1Var, (e23.l) objQ13);
                    z02.b.a(false, null, null, null, true, z3.f.c(-116257440, new jt1.m((m1) pVar.f128594a, 7, bVar7, (e23.l) pVar.f128595b), mVar12), mVar12, 221184, 15);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 21:
                k80.l lVar2 = (k80.l) obj6;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    mVar13.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar13);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(ta0.x.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar13, 0), null);
                    mVar13.R();
                    ta0.x xVar2 = (ta0.x) u1VarResolveViewModel;
                    p1 p1VarC3 = s9.c.c(xVar2.f163469m, mVar13);
                    o13.q qVar = (o13.q) p1VarC3.getF182175a();
                    if (qVar == null) {
                        mVar13.C(-782108252);
                        mVar13.f();
                    } else {
                        mVar13.C(-782108251);
                        Object obj8 = qVar.f128597a;
                        if (obj8 instanceof o13.q.b) {
                            obj8 = null;
                        }
                        Collection collection = (Collection) obj8;
                        if (collection == null || collection.isEmpty()) {
                            mVar13.C(1387113101);
                            boolean zR7 = mVar13.r(lVar2);
                            Object objQ14 = mVar13.q();
                            if (zR7) {
                                objQ14 = new k80.i(lVar2, i16);
                                mVar13.K(objQ14);
                            } else {
                                aVar.getClass();
                                if (objQ14 == p3.m.a.f135155b) {
                                    objQ14 = new k80.i(lVar2, i16);
                                    mVar13.K(objQ14);
                                }
                            }
                            og2.k.d(xVar2, (e23.a) objQ14, mVar13, ta0.x.B);
                            mVar13.f();
                        } else {
                            mVar13.C(1387255329);
                            mVar13.f();
                        }
                        mVar13.f();
                    }
                    o13.q qVar2 = (o13.q) p1VarC3.getF182175a();
                    if (qVar2 != null) {
                        Object obj9 = qVar2.f128597a;
                        if (obj9 instanceof o13.q.b) {
                            obj9 = null;
                        }
                        list = (List) obj9;
                    } else {
                        list = null;
                    }
                    Object objQ15 = mVar13.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a4 = p3.m.a.f135155b;
                    if (objQ15 == c2565a4) {
                        objQ15 = p0.n(Boolean.FALSE);
                        mVar13.K(objQ15);
                    }
                    p1 p1Var3 = (p1) objQ15;
                    Object objQ16 = mVar13.q();
                    if (objQ16 == c2565a4) {
                        objQ16 = p0.n(null);
                        mVar13.K(objQ16);
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(1661626301, new k80.j(lVar2, p1Var3, (p1) objQ16, list, xVar2), mVar13), mVar13, 196608, 31);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 22:
                LanguageSelectionActivity languageSelectionActivity = (LanguageSelectionActivity) obj6;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                LanguageSelectionActivity.a aVar21 = LanguageSelectionActivity.f40328b;
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    String strQ = gl1.y.Q(mVar14, R.string.device_setting_language);
                    boolean zR8 = mVar14.r(languageSelectionActivity);
                    Object objQ17 = mVar14.q();
                    if (zR8) {
                        objQ17 = new jx0.e(languageSelectionActivity, 14);
                        mVar14.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new jx0.e(languageSelectionActivity, 14);
                            mVar14.K(objQ17);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ17, null, strQ, mVar14, null);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 23:
                return a(obj, obj2);
            case 24:
                return b(obj, obj2);
            case 25:
                return c(obj, obj2);
            case 26:
                return d(obj, obj2);
            case 27:
                return e(obj, obj2);
            case 28:
                return f(obj, obj2);
            default:
                fj2.f fVar3 = (fj2.f) obj6;
                p3.m mVar15 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r.a aVar22 = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar15, 0);
                    int iHashCode2 = Long.hashCode(mVar15.getU());
                    i2 i2VarX2 = mVar15.x();
                    r rVarC2 = k.c(aVar22, mVar15);
                    g.V.getClass();
                    e0.a aVar23 = g.a.f81805b;
                    if (mVar15.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar23);
                    } else {
                        mVar15.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar15);
                    b4.c(g.a.f81809f, i2VarX2, mVar15);
                    g.a.b bVar8 = g.a.f81813j;
                    if (mVar15.getT() || !s.g(mVar15.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar15, iHashCode2, bVar8);
                    }
                    b4.c(g.a.f81807d, rVarC2, mVar15);
                    b0 b0Var = b0.f22601a;
                    g6.f.a aVar24 = g6.f.f75994b;
                    mh.c(e5.g(fVar3.getText(), StringUtils.SPACE, fVar3.getDescription()), l.C(aVar22, 0.0f, 0.0f, 0.0f, 2, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar15, 48, 0, 262140);
                    d92.b.f58623a.getClass();
                    v5.a(0.0f, 0, 3, d92.b.a(mVar15).e().f(), null, mVar15);
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(Object obj, int i14, int i15) {
        this.f93912a = i15;
        this.f93913b = obj;
    }
}
