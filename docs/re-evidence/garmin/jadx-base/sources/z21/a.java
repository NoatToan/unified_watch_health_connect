package z21;

import android.content.DialogInterface;
import androidx.room.a0;
import b.u;
import c2.l;
import c2.x2;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceActivity;
import com.github.mikephil.charting.data.Entry;
import e23.p;
import f5.z0;
import f72.fe;
import f72.l2;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.ve;
import k72.d0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import tn.k;
import u1.q;
import v62.a6;
import v62.e1;
import v62.e4;
import v62.e5;
import v62.h2;
import v62.j6;
import v62.w8;
import z41.j;
import zo1.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201985a;

    public /* synthetic */ a(int i14) {
        this.f201985a = 25;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0444  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201985a;
        m.a aVar = m.f135153a;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f201986a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = l2.a(t62.c.f162799a);
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
                    r.a aVar2 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(aVar2, j92.b.f97901d.f97905d), jA, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f201986a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = l2.a(t62.c.f162799a);
                    long jA2 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar2);
                    r.a aVar3 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, null, x2.q(aVar3, j92.b.f97901d.f97905d), jA2, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                b bVar3 = b.f201986a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = l2.a(t62.c.f162799a);
                    long jA3 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar3);
                    r.a aVar4 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, null, x2.q(aVar4, j92.b.f97901d.f97905d), jA3, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                b bVar4 = b.f201986a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    t4.d dVarA4 = n5.c.a(R.drawable.hydration, mVar4, 0);
                    long jA4 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar4);
                    r.a aVar5 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA4, null, x2.q(aVar5, j92.b.f97901d.f97905d), jA4, mVar4, 48, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                b bVar5 = b.f201986a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    t4.d dVarA5 = n5.c.a(R.drawable.carbohydrate, mVar5, 0);
                    long jA5 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar5);
                    r.a aVar6 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA5, null, x2.q(aVar6, j92.b.f97901d.f97905d), jA5, mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                b bVar6 = b.f201986a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = w8.a(t62.b.f162798a);
                    long jA6 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar6);
                    r.a aVar7 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA6, null, x2.q(aVar7, j92.b.f97901d.f97905d), jA6, mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                b bVar7 = b.f201986a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    s62.a.f157643a.getClass();
                    t62.c.f162799a.getClass();
                    u4.d dVarA7 = d0.a(fe.f69560a);
                    long jA7 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar7);
                    r.a aVar8 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA7, null, x2.q(aVar8, j92.b.f97901d.f97905d), jA7, mVar7, 48, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                b bVar8 = b.f201986a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    t4.d dVarA8 = n5.c.a(R.drawable.check, mVar8, 0);
                    String strQ = y.Q(mVar8, R.string.lbl_selected);
                    long jA8 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar8);
                    r.a aVar9 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA8, strQ, x2.q(aVar9, j92.b.f97901d.f97905d), jA8, mVar8, 0, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                b bVar9 = b.f201986a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r.a aVar10 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar10, j92.b.f97899b.f97920e), mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                z41.a aVar11 = z41.a.f202332a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(e4.a(t62.b.f162798a), null, null, 0L, mVar10, 48, 12);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                z41.b bVar10 = z41.b.f202334a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(e4.a(t62.b.f162798a), null, null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar11), mVar11, 48, 4);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                z41.c cVar = z41.c.f202336a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    String strQ2 = y.Q(mVar12, R.string.lbl_distance);
                    u uVar = (u) mVar12.A(g02.d.f74342a);
                    boolean zR = mVar12.r(uVar);
                    Object objQ = mVar12.q();
                    if (zR) {
                        objQ = new z41.c.a(uVar);
                        mVar12.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new z41.c.a(uVar);
                            mVar12.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ), null, strQ2, mVar12, null);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                z41.c cVar2 = z41.c.f202336a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r.a aVar12 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ = x2.q(aVar12, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, rVarQ, a0.c(mVar13), mVar13, 48, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                z41.c cVar3 = z41.c.f202336a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r.a aVar13 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ2 = x2.q(aVar13, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, rVarQ2, a0.c(mVar14), mVar14, 48, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                z50.a aVar14 = z50.a.f202446a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA9 = h2.a(t62.b.f162798a);
                    r.a aVar15 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar4 = j92.b.f97901d;
                    i7.b(dVarA9, null, x2.u(x2.h(aVar15, cVar4.f97905d), cVar4.f97905d), 0L, mVar15, 48, 8);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                z50.a aVar16 = z50.a.f202446a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA10 = y62.a.a(e5.f175862a);
                    r.a aVar17 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar5 = j92.b.f97901d;
                    i7.b(dVarA10, null, x2.u(x2.h(aVar17, cVar5.f97905d), cVar5.f97905d), 0L, mVar16, 48, 8);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                z60.a aVar18 = z60.a.f202752a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new h70.a(new a70.c((r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class))));
            case 17:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                z60.a aVar19 = z60.a.f202752a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new g70.a((h70.a) parametersHolder2.elementAt(0, s0.f105811a.b(h70.a.class)));
            case 18:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                za0.g gVar = za0.g.f203243a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    String strQ3 = y.Q(mVar17, R.string.lbl_notification_access);
                    s62.a.f157643a.getClass();
                    u4.d dVarA11 = a6.a(t62.b.f162798a);
                    String strQ4 = y.Q(mVar17, R.string.smart_notifications_permission_explanation);
                    String strQ5 = y.Q(mVar17, R.string.lbl_allow_notification_access);
                    Object objQ2 = mVar17.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new j(21);
                        mVar17.K(objQ2);
                    }
                    e23.a aVar20 = (e23.a) objQ2;
                    Object objQ3 = mVar17.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new j(22);
                        mVar17.K(objQ3);
                    }
                    e23.a aVar21 = (e23.a) objQ3;
                    Object objQ4 = mVar17.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new j(23);
                        mVar17.K(objQ4);
                    }
                    za0.h.a("", strQ3, dVarA11, strQ4, strQ5, false, aVar20, aVar21, (e23.a) objQ4, mVar17, 115015686);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                za0.g gVar2 = za0.g.f203243a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, k.a(d92.b.f58623a, mVar18), 0L, 0.0f, 0.0f, null, za0.g.f203245c, mVar18, 12582918, 122);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                zj1.d dVar = zj1.d.f204911a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r.a aVar22 = r.S;
                    g6.f.a aVar23 = g6.f.f75994b;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ3 = x2.q(l.C(aVar22, j92.b.f97899b.f97920e, 179, 0.0f, 0.0f, 12), j92.b.f97901d.f97907f);
                    long jC = d92.b.a(mVar19).c().c();
                    k2.h hVar = k2.i.f102406a;
                    r rVarE = u1.n.e(q.b(2, jC, rVarQ3, hVar), d92.b.a(mVar19).e().h(), hVar);
                    h4.d.f81522a.getClass();
                    h4.g gVar3 = h4.d.a.f81528f;
                    z0 z0VarD = c2.q.d(gVar3, false);
                    int iHashCode = Long.hashCode(mVar19.getU());
                    i2 i2VarX = mVar19.x();
                    r rVarC = h4.k.c(rVarE, mVar19);
                    h5.g.V.getClass();
                    e0.a aVar24 = h5.g.a.f81805b;
                    if (mVar19.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar19.z();
                    if (mVar19.getT()) {
                        mVar19.M(aVar24);
                    } else {
                        mVar19.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar19);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar19);
                    h5.g.a.b bVar11 = h5.g.a.f81813j;
                    if (mVar19.getT() || !s.g(mVar19.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar19, iHashCode, bVar11);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar19);
                    c2.u uVar2 = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    i7.b(j6.a(t62.b.f162798a), null, uVar2.c(x2.q(aVar22, 32), gVar3), d92.b.a(mVar19).f().f63508c, mVar19, 48, 0);
                    mVar19.y();
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 21:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar25 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 22:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar26 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 23:
                rm1.m mVar20 = (rm1.m) obj;
                rm1.m mVar21 = (rm1.m) obj2;
                int i15 = zl1.a.f205187e;
                mVar20.getClass();
                mVar21.getClass();
                String str = mVar20.f153626a;
                DateTimeZone dateTimeZone = DateTimeZone.UTC;
                DateTime dateTimeL = j0.L(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", dateTimeZone);
                DateTime dateTimeL2 = j0.L(mVar21.f153626a, "yyyy-MM-dd'T'HH:mm:ss.SSS", dateTimeZone);
                return Long.valueOf((dateTimeL == null || dateTimeL2 == null) ? Long.MAX_VALUE : dateTimeL2.getMillis() - dateTimeL.getMillis());
            case 24:
                int i16 = zm.c.f205201y;
                return Integer.valueOf(Double.compare(((Entry) obj).getX(), ((Entry) obj2).getX()));
            case 25:
                ((Integer) obj2).getClass();
                r0.f((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                NewFitPayUpdateDeviceActivity.a aVar27 = NewFitPayUpdateDeviceActivity.f51718o;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 27:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 28:
                DialogInterface dialogInterface5 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                dialogInterface5.getClass();
                dialogInterface5.dismiss();
                return Unit.INSTANCE;
            default:
                DialogInterface dialogInterface6 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                dialogInterface6.getClass();
                dialogInterface6.dismiss();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(byte b14, int i14) {
        this.f201985a = i14;
    }
}
