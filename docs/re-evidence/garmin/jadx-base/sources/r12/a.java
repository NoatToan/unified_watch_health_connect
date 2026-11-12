package r12;

import android.app.Application;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.text.format.DateFormat;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import b82.g1;
import c2.j;
import c2.k3;
import c2.n3;
import c2.q3;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.service.model.r;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListActivity.b;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersActivity;
import e23.l;
import e23.p;
import g22.k;
import gl1.y;
import ht.s;
import i3.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import l72.x0;
import o13.u;
import o53.c2;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.y3;
import qr.t;
import r22.e0;
import r22.i;
import r22.x;
import r53.p2;
import rg0.g;
import rk0.g0;
import rk0.h0;
import rk0.k0;
import rk0.u0;
import u1.a2;
import u1.d2;
import uu.q;
import v.h;
import w52.w1;
import yw1.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149400b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f149399a = i14;
        this.f149400b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0599  */
    /* JADX WARN: Code duplicated, block: B:173:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:178:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:183:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:256:0x085c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v152, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, o13.l] */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object obj3;
        k3 k3VarB;
        Object obj4;
        int i14 = this.f149399a;
        m.a aVar = m.f135153a;
        int i15 = 2;
        boolean z14 = false;
        int i16 = 3;
        final int i17 = 1;
        Object obj5 = this.f149400b;
        switch (i14) {
            case 0:
                FollowMutedUsersActivity followMutedUsersActivity = (FollowMutedUsersActivity) obj5;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FollowMutedUsersActivity.a aVar2 = FollowMutedUsersActivity.f47085b;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    f fVar = (f) followMutedUsersActivity.f47086a.getValue();
                    boolean zR = mVar.r(followMutedUsersActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new FollowMutedUsersActivity.b(followMutedUsersActivity);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new FollowMutedUsersActivity.b(followMutedUsersActivity);
                            mVar.K(objQ);
                        }
                    }
                    e.a(fVar, (e23.a) objQ, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                r rVar = (r) obj5;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    String strQ = y.Q(mVar2, rVar.f30668b);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                i.a((q) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                x xVar = (x) obj5;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    xVar.u6(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                e0.a aVar3 = e0.f149637b;
                ((e0) obj5).u6((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                long jLongValue = ((Long) obj).longValue();
                d31.d dVar = (d31.d) obj2;
                dVar.getClass();
                s sVar = s.f85508a;
                jt.a aVar4 = new jt.a(dVar.f57377a, "OnboardingFeatureIgnored");
                sVar.getClass();
                s.a(aVar4);
                s31.c cVar = ((com.garmin.android.apps.connectmobile.onboarding.presentation.a) obj5).f39735a;
                ge1.b.T(cVar, null, null, new s31.a(cVar, jLongValue, dVar, null), 3);
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a aVar5 = (com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a) obj5;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a.C0939a c0939a = com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a.f48009b;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r42.b.a((r42.d) aVar5.f48010a.getValue(), mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                r42.b.a((r42.d) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                r52.e eVar = (r52.e) obj5;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    e23.a<? extends r52.b<? super UIStateType, ? super r52.f>> aVar6 = eVar.f150501n;
                    r53.i<v52.c<ActionStateType>> iVar = eVar.f150489b;
                    r53.i<v52.c<UIStateType>> iVar2 = eVar.f150488a;
                    ArrayList arrayList = eVar.f150495h;
                    r52.b bVar = (r52.b) eVar.f150500m.invoke();
                    ArrayList arrayList2 = eVar.f150499l;
                    r52.b bVar2 = (r52.b) eVar.f150491d.invoke(eVar.f150496i, eVar.f150497j, eVar.f150498k, eVar.f150492e, eVar.f150493f, eVar.f150494g);
                    ActionsType actionstype = eVar.f150490c;
                    e23.a<Unit> aVar7 = eVar.f150502o;
                    l<? super ActionStateType, Unit> lVar = eVar.f150503p;
                    e23.a<Unit> aVar8 = eVar.f150504q;
                    o13.p<? extends e23.a<? extends r52.b<? super UIStateType, ? super r52.d>>, ? extends e23.a<Unit>> pVar = eVar.f150505r;
                    w1.a(aVar6, iVar, iVar2, arrayList, bVar, arrayList2, bVar2, actionstype, aVar7, lVar, aVar8, (e23.a) pVar.f128594a, (e23.a) pVar.f128595b, eVar.f150506s, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar2 = (com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj5;
                b0.a aVar9 = (b0.a) obj2;
                ((n0) obj).getClass();
                aVar9.getClass();
                dVar2.getClass();
                if (com.garmin.android.apps.connectmobile.dashboard.presentation.d.f.f33576a[aVar9.ordinal()] == 1) {
                    if (!k.g(dVar2.f33557n, LocalDate.now())) {
                        dVar2.z4(o70.s.ON_RESUME_AFTER_DAY, true);
                    }
                    LocalDate localDateNow = LocalDate.now();
                    localDateNow.getClass();
                    dVar2.f33557n = localDateNow;
                }
                return Unit.INSTANCE;
            case 10:
                return KoinExtKt.androidContext$lambda$2$lambda$0((Application) obj5, (Scope) obj, (ParametersHolder) obj2);
            case 11:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                PregnancyStopTrackingActivity.a aVar10 = PregnancyStopTrackingActivity.f41001d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                PregnancyStopTrackingActivity.ea((PregnancyStopTrackingActivity) obj5);
                return Unit.INSTANCE;
            case 12:
                AuthorizedUserConsentActivity authorizedUserConsentActivity = (AuthorizedUserConsentActivity) obj5;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                AuthorizedUserConsentActivity.a aVar11 = AuthorizedUserConsentActivity.f34946c;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    boolean zR2 = mVar6.r(authorizedUserConsentActivity);
                    Object objQ2 = mVar6.q();
                    if (zR2) {
                        objQ2 = new rg0.e(authorizedUserConsentActivity, i17);
                        mVar6.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new rg0.e(authorizedUserConsentActivity, i17);
                            mVar6.K(objQ2);
                        }
                    }
                    e23.a aVar12 = (e23.a) objQ2;
                    boolean zR3 = mVar6.r(authorizedUserConsentActivity);
                    Object objQ3 = mVar6.q();
                    if (zR3) {
                        objQ3 = new rg0.e(authorizedUserConsentActivity, i15);
                        mVar6.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new rg0.e(authorizedUserConsentActivity, i15);
                            mVar6.K(objQ3);
                        }
                    }
                    e23.a aVar13 = (e23.a) objQ3;
                    boolean zR4 = mVar6.r(authorizedUserConsentActivity);
                    Object objQ4 = mVar6.q();
                    if (zR4) {
                        objQ4 = new rg0.e(authorizedUserConsentActivity, i16);
                        mVar6.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new rg0.e(authorizedUserConsentActivity, i16);
                            mVar6.K(objQ4);
                        }
                    }
                    e23.a aVar14 = (e23.a) objQ4;
                    boolean zR5 = mVar6.r(authorizedUserConsentActivity);
                    Object objQ5 = mVar6.q();
                    if (zR5) {
                        objQ5 = new rg0.e(authorizedUserConsentActivity, 4);
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new rg0.e(authorizedUserConsentActivity, 4);
                            mVar6.K(objQ5);
                        }
                    }
                    g.a(aVar12, aVar13, aVar14, (e23.a) objQ5, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 13:
                b12.b bVar3 = (b12.b) obj5;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    b12.k.b(null, null, j92.b.f97901d.f97906e, bVar3, mVar7, b12.b.f14385f << 9, 19);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                h0 h0Var = (h0) obj5;
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                h0Var.getClass();
                ReentrantLock reentrantLock = h0Var.f153153h;
                reentrantLock.lock();
                try {
                    c2 c2Var = h0Var.f153152g;
                    if (c2Var == null || !c2Var.isActive()) {
                        p2 p2Var = h0Var.f153149d;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, g0.a((g0) value, null, null, null, u0.InProgress, null, null, false, false, 247)));
                        h0Var.f153152g = ge1.b.T(v1.a(h0Var), null, null, new k0(h0Var, str, null), 3);
                        Unit unit = Unit.INSTANCE;
                        break;
                    }
                    return Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            case 15:
                mm1.f fVar2 = (mm1.f) obj5;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    final mm1.e overallStats = fVar2 != null ? fVar2.getOverallStats() : null;
                    if (overallStats != null) {
                        mVar8.C(1594999543);
                        y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                        final b10.d dVar3 = new b10.d((Context) mVar8.A(y3Var));
                        final b10.b bVar4 = new b10.b((Context) mVar8.A(y3Var));
                        h4.r.a aVar15 = h4.r.S;
                        j.f22691a.getClass();
                        j.k kVar = j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar8, 0);
                        int iHashCode = Long.hashCode(mVar8.getU());
                        i2 i2VarX = mVar8.x();
                        h4.r rVarC = h4.k.c(aVar15, mVar8);
                        h5.g.V.getClass();
                        h5.e0.a aVar16 = h5.g.a.f81805b;
                        if (mVar8.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar8.z();
                        if (mVar8.getT()) {
                            mVar8.M(aVar16);
                        } else {
                            mVar8.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar8);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar8);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                            h.z(iHashCode, mVar8, iHashCode, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar8);
                        c2.b0 b0Var = c2.b0.f22601a;
                        x0 x0Var = x0.f111346a;
                        final int i18 = z14 ? 1 : 0;
                        z3.e eVarC = z3.f.c(2034848088, new e23.q() { // from class: rn1.m
                            @Override // e23.q
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                int iIntValue9;
                                int i19 = i18;
                                b10.b bVar6 = bVar4;
                                b10.d dVar4 = dVar3;
                                mm1.e eVar2 = overallStats;
                                switch (i19) {
                                    case 0:
                                        l22.a aVar17 = dVar4.f14215a;
                                        t2 t2Var = (t2) obj6;
                                        p3.m mVar9 = (p3.m) obj7;
                                        int iIntValue10 = ((Integer) obj8).intValue();
                                        t2Var.getClass();
                                        if ((iIntValue10 & 6) == 0) {
                                            iIntValue10 |= mVar9.B(t2Var) ? 4 : 2;
                                        }
                                        if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                                            x1 x1Var9 = p3.n.f135158a;
                                            Integer averageSleepScore = eVar2.getAverageSleepScore();
                                            int iIntValue11 = averageSleepScore != null ? averageSleepScore.intValue() : -1;
                                            x0 x0Var2 = x0.f111346a;
                                            String strValueOf = iIntValue11 >= 0 ? String.valueOf(iIntValue11) : dVar4.b();
                                            String string = aVar17.getString(R.string.lbl_average_stress_level_score);
                                            b92.a aVarB = c.b(bVar6.b(iIntValue11));
                                            int i24 = b92.a.f16960b;
                                            int i25 = (iIntValue10 & 14) | (x0.f111348c << 24);
                                            x0Var2.a(i25, 60, aVarB, t2Var, null, null, strValueOf, string, null, null, mVar9);
                                            Integer averageHighSleepScore = eVar2.getAverageHighSleepScore();
                                            iIntValue9 = averageHighSleepScore != null ? averageHighSleepScore.intValue() : -1;
                                            String strValueOf2 = iIntValue9 >= 0 ? String.valueOf(iIntValue9) : dVar4.b();
                                            String string2 = aVar17.getString(R.string.lbl_avg_highest_score);
                                            String string3 = bVar6.f14208b.getString(R.string.lbl_highest_score);
                                            x0Var2.a(i25, 60, c.b(iIntValue9 >= 0 ? org.apache.commons.lang3.e.d(iIntValue9, StringUtils.SPACE, bVar6.g(string3)) : bVar6.h(string3)), t2Var, null, null, strValueOf2, string2, null, null, mVar9);
                                        } else {
                                            mVar9.e();
                                        }
                                        break;
                                    default:
                                        t2 t2Var2 = (t2) obj6;
                                        p3.m mVar10 = (p3.m) obj7;
                                        int iIntValue12 = ((Integer) obj8).intValue();
                                        t2Var2.getClass();
                                        if ((iIntValue12 & 6) == 0) {
                                            iIntValue12 |= mVar10.B(t2Var2) ? 4 : 2;
                                        }
                                        if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                                            x1 x1Var10 = p3.n.f135158a;
                                            Integer averageLowSleepScore = eVar2.getAverageLowSleepScore();
                                            iIntValue9 = averageLowSleepScore != null ? averageLowSleepScore.intValue() : -1;
                                            x0 x0Var3 = x0.f111346a;
                                            String strValueOf3 = iIntValue9 >= 0 ? String.valueOf(iIntValue9) : dVar4.b();
                                            String string4 = dVar4.f14215a.getString(R.string.lbl_avg_lowest_score);
                                            String string5 = bVar6.f14208b.getString(R.string.lbl_lowest_score);
                                            b92.a aVarB2 = c.b(iIntValue9 >= 0 ? org.apache.commons.lang3.e.d(iIntValue9, StringUtils.SPACE, bVar6.g(string5)) : bVar6.h(string5));
                                            int i26 = iIntValue12 & 14;
                                            int i27 = b92.a.f16960b;
                                            int i28 = x0.f111348c;
                                            x0Var3.a(i26 | (i28 << 24), 60, aVarB2, t2Var2, null, null, strValueOf3, string4, null, null, mVar10);
                                            x0Var3.h(t2Var2, mVar10, i26 | (i28 << 3));
                                        } else {
                                            mVar10.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar8);
                        int i19 = (x0.f111348c << 6) | 48;
                        x0Var.e(null, eVarC, mVar8, i19, 1);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        x0Var.e(c2.l.C(aVar15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), z3.f.c(-1768389375, new e23.q() { // from class: rn1.m
                            @Override // e23.q
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                int iIntValue9;
                                int i110 = i17;
                                b10.b bVar6 = bVar4;
                                b10.d dVar4 = dVar3;
                                mm1.e eVar2 = overallStats;
                                switch (i110) {
                                    case 0:
                                        l22.a aVar17 = dVar4.f14215a;
                                        t2 t2Var = (t2) obj6;
                                        p3.m mVar9 = (p3.m) obj7;
                                        int iIntValue10 = ((Integer) obj8).intValue();
                                        t2Var.getClass();
                                        if ((iIntValue10 & 6) == 0) {
                                            iIntValue10 |= mVar9.B(t2Var) ? 4 : 2;
                                        }
                                        if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                                            x1 x1Var9 = p3.n.f135158a;
                                            Integer averageSleepScore = eVar2.getAverageSleepScore();
                                            int iIntValue11 = averageSleepScore != null ? averageSleepScore.intValue() : -1;
                                            x0 x0Var2 = x0.f111346a;
                                            String strValueOf = iIntValue11 >= 0 ? String.valueOf(iIntValue11) : dVar4.b();
                                            String string = aVar17.getString(R.string.lbl_average_stress_level_score);
                                            b92.a aVarB = c.b(bVar6.b(iIntValue11));
                                            int i24 = b92.a.f16960b;
                                            int i25 = (iIntValue10 & 14) | (x0.f111348c << 24);
                                            x0Var2.a(i25, 60, aVarB, t2Var, null, null, strValueOf, string, null, null, mVar9);
                                            Integer averageHighSleepScore = eVar2.getAverageHighSleepScore();
                                            iIntValue9 = averageHighSleepScore != null ? averageHighSleepScore.intValue() : -1;
                                            String strValueOf2 = iIntValue9 >= 0 ? String.valueOf(iIntValue9) : dVar4.b();
                                            String string2 = aVar17.getString(R.string.lbl_avg_highest_score);
                                            String string3 = bVar6.f14208b.getString(R.string.lbl_highest_score);
                                            x0Var2.a(i25, 60, c.b(iIntValue9 >= 0 ? org.apache.commons.lang3.e.d(iIntValue9, StringUtils.SPACE, bVar6.g(string3)) : bVar6.h(string3)), t2Var, null, null, strValueOf2, string2, null, null, mVar9);
                                        } else {
                                            mVar9.e();
                                        }
                                        break;
                                    default:
                                        t2 t2Var2 = (t2) obj6;
                                        p3.m mVar10 = (p3.m) obj7;
                                        int iIntValue12 = ((Integer) obj8).intValue();
                                        t2Var2.getClass();
                                        if ((iIntValue12 & 6) == 0) {
                                            iIntValue12 |= mVar10.B(t2Var2) ? 4 : 2;
                                        }
                                        if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                                            x1 x1Var10 = p3.n.f135158a;
                                            Integer averageLowSleepScore = eVar2.getAverageLowSleepScore();
                                            iIntValue9 = averageLowSleepScore != null ? averageLowSleepScore.intValue() : -1;
                                            x0 x0Var3 = x0.f111346a;
                                            String strValueOf3 = iIntValue9 >= 0 ? String.valueOf(iIntValue9) : dVar4.b();
                                            String string4 = dVar4.f14215a.getString(R.string.lbl_avg_lowest_score);
                                            String string5 = bVar6.f14208b.getString(R.string.lbl_lowest_score);
                                            b92.a aVarB2 = c.b(iIntValue9 >= 0 ? org.apache.commons.lang3.e.d(iIntValue9, StringUtils.SPACE, bVar6.g(string5)) : bVar6.h(string5));
                                            int i26 = iIntValue12 & 14;
                                            int i27 = b92.a.f16960b;
                                            int i28 = x0.f111348c;
                                            x0Var3.a(i26 | (i28 << 24), 60, aVarB2, t2Var2, null, null, strValueOf3, string4, null, null, mVar10);
                                            x0Var3.h(t2Var2, mVar10, i26 | (i28 << 3));
                                        } else {
                                            mVar10.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar8), mVar8, i19, 0);
                        mVar8.y();
                        mVar8.f();
                    } else {
                        mVar8.C(1596761056);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 16:
                rr.f fVar3 = (rr.f) obj5;
                ?? r14 = fVar3.f154161a;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    Object objA = mVar9.A(c.n.f22332a);
                    objA.getClass();
                    androidx.fragment.app.m mVar10 = (androidx.fragment.app.m) objA;
                    Object objQ6 = mVar9.q();
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        obj3 = objQ6;
                        w13.c cVar2 = rr.k.f154190e;
                        ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
                        Iterator<T> it = cVar2.iterator();
                        while (it.hasNext()) {
                            String string = mVar10.getString(((rr.k) it.next()).f154191a);
                            string.getClass();
                            arrayList3.add(new g1(string, null, null, null, 14, null));
                        }
                        i53.f fVarJ = i53.a.j(arrayList3);
                        mVar9.K(fVarJ);
                        obj3 = fVarJ;
                    }
                    obj3 = objQ6;
                    i53.f fVar4 = (i53.f) obj3;
                    p1 p1VarC = s9.c.c(((t) r14.getValue()).P1, mVar9);
                    p1 p1VarC2 = s9.c.c(((t) r14.getValue()).Q1, mVar9);
                    p1 p1VarC3 = s9.c.c(((t) r14.getValue()).R1, mVar9);
                    Object objQ7 = mVar9.q();
                    m.a.C2565a c2565a = m.a.f135155b;
                    Object obj6 = objQ7;
                    if (objQ7 == c2565a) {
                        Boolean boolValueOf = Boolean.valueOf(mVar10.getResources().getConfiguration().orientation == 1);
                        mVar9.K(boolValueOf);
                        obj6 = boolValueOf;
                    }
                    boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                    Object objQ8 = mVar9.q();
                    Object obj7 = objQ8;
                    if (objQ8 == c2565a) {
                        im.k kVar2 = new im.k(mVar10, zBooleanValue, ((nr.t.a) p1VarC.getF182175a()).f127324d);
                        mVar9.K(kVar2);
                        obj7 = kVar2;
                    }
                    im.k kVar3 = (im.k) obj7;
                    d2 d2VarA = a2.a(mVar9);
                    boolean zB = mVar9.B(d2VarA) | mVar9.r(fVar3);
                    Object objQ9 = mVar9.q();
                    Object obj8 = objQ9;
                    if (zB || objQ9 == c2565a) {
                        rr.f.a aVar17 = new rr.f.a(d2VarA, fVar3, null);
                        mVar9.K(aVar17);
                        obj8 = aVar17;
                    }
                    l0.e((p) obj8, d2VarA, mVar9);
                    i17 = ((Configuration) mVar9.A(AndroidCompositionLocals_androidKt.f6041a)).orientation != 2 ? 0 : 1;
                    h4.r rVarS = i17 != 0 ? c2.l.s(c2.l.l(h4.r.S)) : h4.r.S;
                    rr.k kVar4 = (rr.k) p1VarC2.getF182175a();
                    boolean zBooleanValue2 = ((Boolean) p1VarC3.getF182175a()).booleanValue();
                    if (i17 != 0) {
                        mVar9.C(1965545794);
                        int i24 = k3.f22728a;
                        k3VarB = q3.c(mVar9);
                        mVar9.f();
                    } else {
                        mVar9.C(1965614087);
                        mVar9.f();
                        g6.f.a aVar18 = g6.f.f75994b;
                        k3VarB = n3.b(0, 0.0f, 0.0f, 0.0f, 14);
                    }
                    k3 k3Var = k3VarB;
                    boolean zR6 = mVar9.r(fVar3);
                    Object objQ10 = mVar9.q();
                    Object obj9 = objQ10;
                    if (zR6 || objQ10 == c2565a) {
                        qw0.y yVar = new qw0.y(fVar3, 21);
                        mVar9.K(yVar);
                        obj9 = yVar;
                    }
                    rr.j.a(fVar4, kVar4, zBooleanValue2, (l) obj9, z3.f.c(1057823123, new qy0.d(d2VarA, kVar3, p1VarC2, p1VarC), mVar9), rVarS, k3Var, mVar9, 24576);
                    x1 x1Var10 = n.f135158a;
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                ir0.a aVar19 = (ir0.a) obj5;
                m mVar11 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    int i25 = aVar19.f94775l;
                    int i26 = aVar19.f94776m;
                    rr0.j.a(Integer.valueOf(i25), Integer.valueOf(i26), Integer.valueOf((i26 * 2) + aVar19.f94775l), mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                rv1.b.b((yw1.d) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                rv1.b.a((yw1.c) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                rv1.d.c((o) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                rv1.d.b((yw1.n) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                rv1.i.a((u) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                rv1.m.a((vv1.d) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                rv1.n.a((yw1.u) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                final com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar20 = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a) obj5;
                Calendar calendar = (Calendar) obj;
                final boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                calendar.getClass();
                TimePickerDialog timePickerDialog = new TimePickerDialog(aVar20.requireContext(), R.style.GCMTimePicker, new lo.n(calendar, aVar20), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(aVar20.requireContext()));
                timePickerDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rw.b
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface2) {
                        com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar21;
                        View view2;
                        com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a2 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                        if (!zBooleanValue3 || (view2 = (aVar21 = aVar20).getView()) == null) {
                            return;
                        }
                        view2.postDelayed(new po.g(aVar21, 16), 50L);
                    }
                });
                timePickerDialog.show();
                Context contextRequireContext = aVar20.requireContext();
                contextRequireContext.getClass();
                og.a.W(timePickerDialog, contextRequireContext);
                Context contextRequireContext2 = aVar20.requireContext();
                contextRequireContext2.getClass();
                og.a.w(timePickerDialog, contextRequireContext2);
                return Unit.INSTANCE;
            case 26:
                k3 k3Var2 = (k3) obj5;
                m mVar12 = (m) obj;
                ((Integer) obj2).getClass();
                mVar12.C(-1305632026);
                x1 x1Var12 = n.f135158a;
                mVar12.f();
                return k3Var2;
            case 27:
                cy0.o oVar = (cy0.o) obj5;
                m mVar13 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    String url = oVar.getUrl();
                    f5.k.f68985a.getClass();
                    jf.r.a(url, null, x2.d(h4.r.S, 1.0f), null, null, f5.k.a.f68987b, null, mVar13, 1573296, 1976);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 28:
                MultiDayActivitiesListActivity multiDayActivitiesListActivity = (MultiDayActivitiesListActivity) obj5;
                m mVar14 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                MultiDayActivitiesListActivity.a aVar21 = MultiDayActivitiesListActivity.f39318c;
                if (mVar14.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    p1 p1VarC4 = s9.c.c(((ry0.j) multiDayActivitiesListActivity.f39320b.getValue()).f155123z, mVar14);
                    Boolean bool = (Boolean) p1VarC4.getF182175a();
                    boolean zB2 = mVar14.B(p1VarC4) | mVar14.r(multiDayActivitiesListActivity);
                    Object objQ11 = mVar14.q();
                    if (zB2) {
                        obj4 = objQ11;
                        MultiDayActivitiesListActivity.b bVar6 = multiDayActivitiesListActivity.new b(p1VarC4, null);
                        mVar14.K(bVar6);
                        obj4 = bVar6;
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            obj4 = objQ11;
                            MultiDayActivitiesListActivity.b bVar7 = multiDayActivitiesListActivity.new b(p1VarC4, null);
                            mVar14.K(bVar7);
                            obj4 = bVar7;
                        }
                    }
                    obj4 = objQ11;
                    l0.e((p) obj4, bool, mVar14);
                    z02.b.a(false, null, null, null, true, z3.f.c(992067104, new ry0.e(p1VarC4, multiDayActivitiesListActivity), mVar14), mVar14, 221184, 15);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((s1.n0) obj5).a((m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, int i14, int i15) {
        this.f149399a = i15;
        this.f149400b = obj;
    }
}
