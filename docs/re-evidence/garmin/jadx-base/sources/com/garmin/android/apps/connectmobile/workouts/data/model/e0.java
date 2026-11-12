package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcelable;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import cw1.o0;
import f5.z0;
import g02.s0;
import i3.i7;
import i3.mh;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p1.t0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48159a;

    public /* synthetic */ e0(int i14) {
        this.f48159a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0174 A[LOOP:0: B:36:0x012d->B:49:0x0174, LOOP_END] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m52.b bVar = null;
        switch (this.f48159a) {
            case 0:
                l52.r rVar = (l52.r) obj;
                l52.i.a aVar = (l52.i.a) obj2;
                Parcelable.Creator<WorkoutDetailsDTO> creator = WorkoutDetailsDTO.CREATOR;
                rVar.getClass();
                aVar.getClass();
                j0 j0Var = (j0) aVar.getData();
                if (j0Var.f48217c != m52.d.WALK) {
                    m52.a aVar2 = j0Var.f48227l;
                    if (aVar2 == m52.a.f116649e) {
                        bVar = m52.b.DISTANCE_ESTIMATED;
                    } else if (aVar2 == m52.a.f116650f) {
                        bVar = m52.b.TIME_ESTIMATED;
                    }
                }
                if (bVar != null) {
                    Boolean bool = Boolean.TRUE;
                    int i14 = o13.q.f128596b;
                    rVar.a(bool);
                }
                return Unit.INSTANCE;
            case 1:
                h0 h0Var = (h0) obj;
                h0 h0Var2 = (h0) obj2;
                Parcelable.Creator<WorkoutDetailsDTO> creator2 = WorkoutDetailsDTO.CREATOR;
                return Integer.valueOf((h0Var2 != null ? h0Var2.getSegmentOrder() : 0) - (h0Var != null ? h0Var.getSegmentOrder() : 0));
            case 2:
                l52.i.a aVar3 = (l52.i.a) obj;
                l52.i.a aVar4 = (l52.i.a) obj2;
                h0.a aVar5 = h0.f48185j;
                aVar3.getClass();
                aVar4.getClass();
                return Integer.valueOf(((j0) aVar3.getData()).f48215a - ((j0) aVar4.getData()).f48215a);
            case 3:
                l52.i.a aVar6 = (l52.i.a) obj;
                l52.i.a aVar7 = (l52.i.a) obj2;
                h0.a aVar8 = h0.f48185j;
                aVar6.getClass();
                aVar7.getClass();
                return Integer.valueOf(((j0) aVar6.getData()).f48215a - ((j0) aVar7.getData()).f48215a);
            case 4:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                cp1.a aVar9 = cp1.a.f54895a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    cp1.e.e(mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                cp1.e.e((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                FitPayAddressManagementFragment.b bVar2 = FitPayAddressManagementFragment.f51413t;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 7:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                FitPayAddressManagementFragment.b bVar3 = FitPayAddressManagementFragment.f51413t;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 8:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                FitPayAddressManagementFragment.b bVar4 = FitPayAddressManagementFragment.f51413t;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 9:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                cp2.f.a aVar10 = cp2.f.f54931p;
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 10:
                DialogInterface dialogInterface5 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                cp2.f.a aVar11 = cp2.f.f54931p;
                dialogInterface5.getClass();
                dialogInterface5.dismiss();
                return Unit.INSTANCE;
            case 11:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                cr.a aVar12 = cr.a.f55249a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.chevron_down, mVar2, 0);
                    long jB = ds.e0.b(d92.b.f58623a, mVar2);
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, null, x2.q(c2.l.C(aVar13, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), j92.b.f97901d.f97904c), jB, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                cr.b bVar5 = cr.b.f55251a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar14, j92.b.f97901d.f97905d);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(rVarQ, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar15);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    s0.b(c2.u.f22885a.c(aVar14, h4.d.a.f81528f), 0.0f, mVar3, 0, 2);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                cr.b bVar7 = cr.b.f55251a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, cr.b.f55252b, mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 14:
                Context context = (Context) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                context.getClass();
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachTrainingStatusView");
                ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).N(context, zBooleanValue);
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                cv1.e.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                cw1.d dVar = cw1.d.f56011a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    zd0.e.c(0.0f, 0, 14, 0L, c2.l.C(aVar16, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                cw1.d dVar2 = cw1.d.f56011a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                cw1.d dVar3 = cw1.d.f56011a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                    String strQ = gl1.y.Q(mVar7, R.string.event_type_enum_cycling);
                    String strQ2 = gl1.y.Q(mVar7, R.string.garmin_cycling_coach);
                    String strP = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar7, R.string.lbl_cycling))}, mVar7);
                    Object objQ = mVar7.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.accompanist.drawablepainter.a(17);
                        mVar7.K(objQ);
                    }
                    cw1.c.c(null, 2131232840, null, null, dVarA2, strQ, strQ2, strP, null, null, null, null, "6-52 weeks | 6-7 days/week", true, true, null, (e23.a) objQ, mVar7, 0, 102263808, 171549);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                cw1.f fVar = cw1.f.f56032a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                cw1.g gVar = cw1.g.f56037a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strQ3 = gl1.y.Q(mVar9, R.string.lbl_enter_custom_elevation);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar9), mVar9, 48, 0, 131068);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                cw1.g gVar2 = cw1.g.f56037a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar10, 0), gl1.y.Q(mVar10, R.string.lbl_clear), null, 0L, mVar10, 0, 12);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                cw1.h hVar = cw1.h.f56044a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                cw1.f0.e((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                o0.b((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                d4.d dVar4 = (d4.d) obj2;
                Map<Object, Map<String, List<Object>>> map = dVar4.f57435a;
                t0<Object, d4.f> t0Var = dVar4.f57436b;
                Object[] objArr = t0Var.f134721b;
                Object[] objArr2 = t0Var.f134722c;
                long[] jArr = t0Var.f134720a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j8 = jArr[i15];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((255 & j8) < 128) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj3 = objArr[i18];
                                    Map<String, List<Object>> mapB = ((d4.f) objArr2[i18]).b();
                                    if (mapB.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapB);
                                    }
                                }
                                j8 >>= 8;
                            }
                            if (i16 == 8) {
                                if (i15 != length) {
                                    i15++;
                                }
                            }
                        } else if (i15 != length) {
                            i15++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 26:
                return obj2;
            case 27:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                d50.a aVar17 = d50.a.f57509a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = f72.t0.a(t62.c.f162799a);
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar12);
                    h4.r.a aVar18 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, null, x2.q(aVar18, j92.b.f97901d.f97905d), jA, mVar12, 48, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                d50.c cVar = d50.c.f57512a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar13, R.string.lbl_help);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar13), mVar13, 0, 0, 131070);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                d50.c cVar2 = d50.c.f57512a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar14, R.string.lbl_reposition_course_on_map);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar14), mVar14, 0, 0, 131070);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
        }
    }
}
