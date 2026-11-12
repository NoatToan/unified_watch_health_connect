package vp1;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.t0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model.LactateSummaryMeasurementsDTO;
import e23.p;
import f5.z0;
import f72.qa;
import g02.s0;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import l72.u1;
import o61.g;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;
import v62.g4;
import vy0.i;
import w51.o0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179384a;

    public /* synthetic */ a(int i14) {
        this.f179384a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f179384a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f179385a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    qp1.a.C2751a c2751a = qp1.a.f146016c;
                    qp1.a aVar = qp1.a.USB_CONNECTED;
                    c2751a.getClass();
                    u1.b(R.string.lbl_usb_connected, R.string.lbl_usb_connected_message, 0, 2, qp1.a.C2751a.a(aVar), mVar, false);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f179385a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    qp1.a.C2751a c2751a2 = qp1.a.f146016c;
                    qp1.a aVar2 = qp1.a.BATTERY_FULL;
                    c2751a2.getClass();
                    u1.b(R.string.lbl_battery_full, R.string.lbl_battery_full_message, 0, 2, qp1.a.C2751a.a(aVar2), mVar2, false);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                b bVar3 = b.f179385a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    qp1.a.C2751a c2751a3 = qp1.a.f146016c;
                    qp1.a aVar3 = qp1.a.BATTERY_COLD;
                    c2751a3.getClass();
                    u1.b(R.string.lbl_battery_cold, R.string.lbl_battery_cold_message, 0, 2, qp1.a.C2751a.a(aVar3), mVar3, false);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                b bVar4 = b.f179385a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    qp1.a.C2751a c2751a4 = qp1.a.f146016c;
                    qp1.a aVar4 = qp1.a.BATTERY_HOT;
                    c2751a4.getClass();
                    u1.b(R.string.lbl_battery_hot, R.string.lbl_battery_hot_message, 0, 2, qp1.a.C2751a.a(aVar4), mVar4, false);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                g gVar = (g) obj;
                g gVar2 = (g) obj2;
                int i14 = LactateSummaryMeasurementsDTO.f37138g;
                gVar.getClass();
                gVar2.getClass();
                DateTime dateTime = gVar.f129584c;
                return Integer.valueOf(dateTime != null ? dateTime.compareTo((ReadableInstant) gVar2.f129584c) : -1);
            case 5:
                g gVar3 = (g) obj;
                g gVar4 = (g) obj2;
                int i15 = LactateSummaryMeasurementsDTO.f37138g;
                gVar3.getClass();
                gVar4.getClass();
                DateTime dateTime2 = gVar3.f129584c;
                return Integer.valueOf(dateTime2 != null ? dateTime2.compareTo((ReadableInstant) gVar4.f129584c) : -1);
            case 6:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                vu1.a aVar5 = vu1.a.f180257a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                vy0.a aVar6 = vy0.a.f180671a;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar7 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    q.a(x2.q(aVar7, j92.b.f97901d.f97905d), mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                vy0.b bVar5 = vy0.b.f180690a;
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    i.a(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                vy0.b bVar6 = vy0.b.f180690a;
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                vy0.b bVar7 = vy0.b.f180690a;
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = g4.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar9);
                    r.a aVar8 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(aVar8, j92.b.f97901d.f97905d), jA, mVar9, 48, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                i.a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                vz1.d dVar = vz1.d.f180898a;
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                vz1.e eVar = vz1.e.f180900a;
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    r.a aVar9 = r.S;
                    d92.b.f58623a.getClass();
                    r rVarE = u1.n.e(aVar9, d92.b.a(mVar11).c().g(), k2.i.f102406a);
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    r rVarQ = x2.q(rVarE, cVar.f97907f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar11.getU());
                    i2 i2VarX = mVar11.x();
                    r rVarC = k.c(rVarQ, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar10);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar11);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar11.getT() || !s.g(mVar11.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar11, iHashCode, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar11);
                    u uVar = u.f22885a;
                    s62.a.f157643a.getClass();
                    i7.b(qa.a(t62.c.f162799a), null, uVar.c(x2.q(aVar9, cVar.f97906e), h4.d.a.f81528f), sn.a.b(mVar11), mVar11, 48, 0);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                vz1.q.a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                w12.b.a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                w12.g.a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                w21.m.c((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                w40.a aVar11 = w40.a.f181920a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar12 = h4.d.a.f81537o;
                    r.a aVar13 = r.S;
                    j.f22691a.getClass();
                    z zVarA = y.a(j.f22694d, aVar12, mVar12, 48);
                    int iHashCode2 = Long.hashCode(mVar12.getU());
                    i2 i2VarX2 = mVar12.x();
                    r rVarC2 = k.c(aVar13, mVar12);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar14);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar12);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar12.getT() || !s.g(mVar12.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar12, iHashCode2, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar12);
                    b0 b0Var = b0.f22601a;
                    r20.e.b(mVar12, 0);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                w40.a aVar15 = w40.a.f181920a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r20.f.a(null, 0, mVar13, 1);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                w40.a aVar16 = w40.a.f181920a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r.a aVar17 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ2 = x2.q(aVar17, j92.b.f97901d.f97905d);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar14.getU());
                    i2 i2VarX3 = mVar14.x();
                    r rVarC3 = k.c(rVarQ2, mVar14);
                    h5.g.V.getClass();
                    e0.a aVar18 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar18);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar14);
                    h5.g.a.b bVar10 = h5.g.a.f81813j;
                    if (mVar14.getT() || !s.g(mVar14.q(), Integer.valueOf(iHashCode3))) {
                        h.z(iHashCode3, mVar14, iHashCode3, bVar10);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar14);
                    s0.b(u.f22885a.c(aVar17, h4.d.a.f81528f), 0.0f, mVar14, 0, 2);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                w51.b bVar11 = w51.b.f182219a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    l72.s sVar = l72.s.f111232a;
                    r.a aVar19 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = l.y(aVar19, j92.b.f97899b.f97920e);
                    s62.a.f157643a.getClass();
                    sVar.d(rVarY, null, v62.a.a(t62.b.f162798a), gl1.y.Q(mVar15, R.string.lbl_missing_data), gl1.y.Q(mVar15, R.string.msg_unavailable_data), null, null, null, mVar15, 0, 482);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 22:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                w51.b bVar12 = w51.b.f182219a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    String strQ = gl1.y.Q(mVar16, R.string.lbl_all_activity_types);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar16), mVar16, 0, 0, 131070);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                w51.b bVar13 = w51.b.f182219a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    j.f22691a.getClass();
                    j.c cVar2 = j.f22696f;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    t0.a(l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1), cVar2, null, null, 0, 0, w51.b.f182222d, mVar17, 1572912, 60);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 24:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                w51.c cVar3 = w51.c.f182234a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    r.a aVar20 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.u(aVar20, j92.b.f97899b.f97920e), mVar18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                w51.c cVar4 = w51.c.f182234a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r.a aVar21 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.u(aVar21, j92.b.f97899b.f97920e), mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                w51.c cVar5 = w51.c.f182234a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    r.a aVar22 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.u(aVar22, j92.b.f97899b.f97920e), mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 27:
                ((Float) obj).floatValue();
                ((com.garmin.android.library.mapsdkadapter.i.d) obj2).getClass();
                return Float.valueOf(5.0f);
            case 28:
                ((Integer) obj2).getClass();
                o0.o((m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                w52.i iVar = w52.i.f182537a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(int i14, int i15) {
        this.f179384a = i15;
    }
}
