package b82;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import com.garmin.android.apps.connectmobile.view.BottomNavigationLayout;
import f72.da;
import f72.z2;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import v62.b3;
import v62.e8;
import v62.f4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16581c;

    public /* synthetic */ g0(String str, boolean z14, int i14) {
        this.f16579a = 1;
        this.f16580b = str;
        this.f16581c = z14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:204:0x0630  */
    /* JADX WARN: Code duplicated, block: B:205:0x0661  */
    /* JADX WARN: Instruction removed from duplicated block: B:204:0x0630, please report this as an issue */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        long jC2;
        t4.d dVarA;
        long jA;
        int i14 = this.f16579a;
        String str = this.f16580b;
        boolean z14 = this.f16581c;
        boolean z15 = false;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                t0 t0Var = t0.f16792a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    String str2 = this.f16580b;
                    if (z14) {
                        mVar.C(-2053112781);
                        s62.a.f157643a.getClass();
                        i7.b(e8.a(t62.b.f162798a), str2, null, 0L, mVar, 0, 12);
                        mVar.f();
                    } else {
                        mVar.C(-2053227853);
                        s62.a.f157643a.getClass();
                        i7.b(f4.a(t62.b.f162798a), str2, null, 0L, mVar, 0, 12);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                f10.d.c(p3.p0.t(1), str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                f40.f.a(p3.p0.t(1), str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 3:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                o72.z zVar = o72.z.f130696a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    boolean z16 = this.f16581c;
                    if (z16) {
                        mVar2.C(-1236567025);
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(mVar2).k().b();
                    } else {
                        mVar2.C(-1236565830);
                        d92.b.f58623a.getClass();
                        jC = o4.d0.c(0.5f, d92.b.a(mVar2).k().b(), 14);
                    }
                    mVar2.f();
                    long j8 = jC;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97933j;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58625c.getClass();
                    mh.c(this.f16580b, c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), j8, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131064);
                    s62.a.f157643a.getClass();
                    o72.l.d(v62.h1.a(t62.b.f162798a), d92.b.a(mVar2).f().b(), z16, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                o72.z zVar2 = o72.z.f130696a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    boolean z17 = this.f16581c;
                    if (z17) {
                        mVar3.C(-930571441);
                        d92.b.f58623a.getClass();
                        jC2 = d92.b.a(mVar3).k().b();
                    } else {
                        mVar3.C(-930570246);
                        d92.b.f58623a.getClass();
                        jC2 = o4.d0.c(0.5f, d92.b.a(mVar3).k().b(), 14);
                    }
                    mVar3.f();
                    long j14 = jC2;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var2 = j92.f.f97933j;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58625c.getClass();
                    mh.c(this.f16580b, c2.l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), j14, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar3, 0, 0, 131064);
                    s62.a.f157643a.getClass();
                    o72.l.d(b3.a(t62.b.f162798a), d92.b.a(mVar3).f().b(), z17, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    if (z14) {
                        mVar4.C(-2061959884);
                        h4.r.a aVar3 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarA = c2.l.A(aVar3, j92.b.f97899b.f97918c, 0.0f, 2);
                        c2.j.f22691a.getClass();
                        c2.j.c cVar = c2.j.f22696f;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(cVar, h4.d.a.f81537o, mVar4, 54);
                        int iHashCode = Long.hashCode(mVar4.getU());
                        i2 i2VarX = mVar4.x();
                        h4.r rVarC = h4.k.c(rVarA, mVar4);
                        h5.g.V.getClass();
                        h5.e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar4.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar4);
                        } else {
                            mVar4.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar4);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar4);
                        c2.b0 b0Var = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        mh.c(this.f16580b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar4, 0, 0, 131070);
                        mVar4.y();
                        mVar4.f();
                    } else {
                        mVar4.C(-2062073499);
                        h4.r.a aVar5 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.u(aVar5, j92.b.f97899b.f97920e), mVar4);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i15 = BottomNavigationLayout.f47390d;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-936265467, new g0(str, z14, 7, z15 ? (byte) 1 : (byte) 0), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i16 = BottomNavigationLayout.f47390d;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    com.garmin.android.apps.connectmobile.navigation.h.f39377a.getClass();
                    str.getClass();
                    mVar6.C(1703669866);
                    int i17 = R.drawable.stopwatch_outline;
                    switch (str) {
                        case "MY_DEVICE_CUSTOMIZABLE":
                            mVar6.C(400771822);
                            dVarA = n5.c.a(R.drawable.devices, mVar6, 0);
                            mVar6.f();
                            break;
                        case "NUTRITION":
                            mVar6.C(403916152);
                            s62.a.f157643a.getClass();
                            dVarA = u4.p.b(da.a(t62.c.f162799a), mVar6);
                            mVar6.f();
                            break;
                        case "ACTIVITIES":
                            mVar6.C(401986309);
                            f12.l.f68084a.getClass();
                            dVarA = n5.c.a(f12.l.a.a().B3() ? R.drawable.icon_para_activity_default : R.drawable.other_activity, mVar6, 0);
                            mVar6.f();
                            break;
                        case "LIFESTYLE_LOGGING":
                            mVar6.C(403811992);
                            s62.a.f157643a.getClass();
                            dVarA = u4.p.b(z2.a(t62.c.f162799a), mVar6);
                            mVar6.f();
                            break;
                        case "GARMIN_DIVE":
                            mVar6.C(403451338);
                            dVarA = n5.c.a(R.drawable.garmin_dive, mVar6, 0);
                            mVar6.f();
                            break;
                        case "GARMIN_GOLF":
                            mVar6.C(403363050);
                            dVarA = n5.c.a(R.drawable.garmin_golf, mVar6, 0);
                            mVar6.f();
                            break;
                        case "NEWS_FEED":
                            mVar6.C(401221260);
                            dVarA = n5.c.a(z14 ? R.drawable.newsfeed_filled : R.drawable.newsfeed, mVar6, 0);
                            mVar6.f();
                            break;
                        case "MY_DEVICE":
                            mVar6.C(400771822);
                            dVarA = n5.c.a(R.drawable.devices, mVar6, 0);
                            mVar6.f();
                            break;
                        case "CIQ_STORE":
                            mVar6.C(403277645);
                            dVarA = n5.c.a(R.drawable.iq_store, mVar6, 0);
                            mVar6.f();
                            break;
                        case "TRAINING_AND_PLANNING":
                            mVar6.C(402452611);
                            if (z14) {
                                i17 = R.drawable.stopwatch_solid;
                            }
                            dVarA = n5.c.a(i17, mVar6, 0);
                            mVar6.f();
                            break;
                        case "PACEPRO":
                            mVar6.C(403030606);
                            dVarA = n5.c.a(R.drawable.pacepro, mVar6, 0);
                            mVar6.f();
                            break;
                        case "HOME":
                            mVar6.C(400626897);
                            dVarA = n5.c.a(R.drawable.home, mVar6, 0);
                            mVar6.f();
                            break;
                        case "MORE":
                            mVar6.C(401460487);
                            dVarA = n5.c.a(z14 ? R.drawable.more_selected : R.drawable.more_unselected, mVar6, 0);
                            mVar6.f();
                            break;
                        case "GOLF_SCORECARD":
                            mVar6.C(401709603);
                            dVarA = n5.c.a(R.drawable.scorecard_selected, mVar6, 0);
                            mVar6.f();
                            break;
                        case "GOLF_COURSES":
                            mVar6.C(401805579);
                            dVarA = n5.c.a(R.drawable.range_view, mVar6, 0);
                            mVar6.f();
                            break;
                        case "MENSTRUAL_CYCLE":
                            mVar6.C(403627108);
                            dVarA = n5.c.a(R.drawable.menstral_tracking, mVar6, 0);
                            mVar6.f();
                            break;
                        case "CALENDAR":
                            mVar6.C(400977228);
                            dVarA = n5.c.a(z14 ? R.drawable.calendar_filled : R.drawable.calendar, mVar6, 0);
                            mVar6.f();
                            break;
                        case "PERFORMANCE":
                            mVar6.C(402349195);
                            dVarA = n5.c.a(R.drawable.charts_bar, mVar6, 0);
                            mVar6.f();
                            break;
                        case "GARMIN_COACH":
                            mVar6.C(403540432);
                            dVarA = n5.c.a(R.drawable.coach, mVar6, 0);
                            mVar6.f();
                            break;
                        case "WORKOUTS":
                            mVar6.C(402704579);
                            if (z14) {
                                i17 = R.drawable.stopwatch_solid;
                            }
                            dVarA = n5.c.a(i17, mVar6, 0);
                            mVar6.f();
                            break;
                        case "CHALLENGES":
                            mVar6.C(400886987);
                            dVarA = n5.c.a(R.drawable.challenges, mVar6, 0);
                            mVar6.f();
                            break;
                        case "INSIGHTS":
                            mVar6.C(403194317);
                            dVarA = n5.c.a(R.drawable.insights, mVar6, 0);
                            mVar6.f();
                            break;
                        case "PREGNANCY":
                            mVar6.C(403719116);
                            dVarA = n5.c.a(R.drawable.pregnancy, mVar6, 0);
                            mVar6.f();
                            break;
                        case "COURSES":
                            mVar6.C(402950254);
                            dVarA = n5.c.a(R.drawable.courses, mVar6, 0);
                            mVar6.f();
                            break;
                        case "SEGMENTS":
                            mVar6.C(403111981);
                            dVarA = n5.c.a(R.drawable.segments, mVar6, 0);
                            mVar6.f();
                            break;
                        case "GOLF_STATS":
                            mVar6.C(401891914);
                            dVarA = n5.c.a(R.drawable.charts_line, mVar6, 0);
                            mVar6.f();
                            break;
                        case "HEALTH":
                            mVar6.C(402259977);
                            dVarA = n5.c.a(R.drawable.health_stats, mVar6, 0);
                            mVar6.f();
                            break;
                        default:
                            mVar6.C(404006052);
                            com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar6.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "NavigationUtil", "Icon for NavigationScreen with ID " + str + " is not set! FIX ME");
                            dVarA = n5.c.a(R.drawable.help, mVar6, 0);
                            mVar6.f();
                            break;
                    }
                    mVar6.f();
                    o4.e0.a aVar7 = o4.e0.f128843b;
                    if (z14) {
                        mVar6.C(-2102938933);
                        d92.b.f58623a.getClass();
                        jA = d92.b.a(mVar6).f().a();
                    } else {
                        mVar6.C(-2102938514);
                        jA = n5.a.a(mVar6, R.color.gcm_icon_secondary);
                    }
                    mVar6.f();
                    u1.y0.a(dVarA, null, rVarF, null, null, 0.0f, o4.e0.a.a(aVar7, jA), mVar6, 432, 56);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    if (z14) {
                        mVar7.C(-358890139);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarA2 = c2.l.A(aVar8, j92.b.f97899b.f97918c, 0.0f, 2);
                        c2.j.f22691a.getClass();
                        c2.j.c cVar2 = c2.j.f22696f;
                        h4.d.f81522a.getClass();
                        c2.z zVarA2 = c2.y.a(cVar2, h4.d.a.f81537o, mVar7, 54);
                        int iHashCode2 = Long.hashCode(mVar7.getU());
                        i2 i2VarX2 = mVar7.x();
                        h4.r rVarC2 = h4.k.c(rVarA2, mVar7);
                        h5.g.V.getClass();
                        h5.e0.a aVar9 = h5.g.a.f81805b;
                        if (mVar7.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar9);
                        } else {
                            mVar7.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar7);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar7);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar7, iHashCode2, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar7);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        mh.c(this.f16580b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar7, 0, 0, 131070);
                        mVar7.y();
                        mVar7.f();
                    } else {
                        mVar7.C(-359003754);
                        h4.r.a aVar10 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.u(aVar10, j92.b.f97899b.f97920e), mVar7);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    if (z14) {
                        mVar8.C(1342426019);
                        wf.f.a aVar11 = new wf.f.a((Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b));
                        aVar11.f184930c = str;
                        wf.g.a(aVar11);
                        wf.f fVarA = aVar11.a();
                        f5.k.f68985a.getClass();
                        f5.k.a.C1427a c1427a = f5.k.a.f68987b;
                        h4.r.a aVar12 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        jf.r.a(fVarA, null, l4.k.b(x2.q(aVar12, j92.b.f97901d.f97906e), k2.i.f102406a), null, null, c1427a, null, mVar8, 1572912, 1976);
                        mVar8.f();
                    } else {
                        mVar8.C(1343041741);
                        wf.f.a aVar13 = new wf.f.a((Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b));
                        aVar13.f184930c = str;
                        wf.g.a(aVar13);
                        wf.f fVarA2 = aVar13.a();
                        f5.k.f68985a.getClass();
                        f5.k.a.C1427a c1427a2 = f5.k.a.f68987b;
                        h4.r.a aVar14 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        jf.r.a(fVarA2, null, c2.l.y(u1.n.e(l4.k.b(x2.q(aVar14, j92.b.f97901d.f97906e), k2.i.f102406a), fb1.c.i(gl.c.f77766a, mVar8), o4.m1.f128891a), j92.b.f97899b.f97918c), null, null, c1427a2, o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar8).c().a()), mVar8, 1572912, 1720);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                TimingGatesActivity.a aVar15 = TimingGatesActivity.f29952c;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    h4.r.a aVar16 = h4.r.S;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar9, 48);
                    int iHashCode3 = Long.hashCode(mVar9.getU());
                    i2 i2VarX3 = mVar9.x();
                    h4.r rVarC3 = h4.k.c(aVar16, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar17);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar9);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar9, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar9);
                    u2 u2Var = u2.f22900a;
                    if (z14) {
                        mVar9.C(2041060430);
                        yq.f.a(0.0f, 0L, mVar9, 0, 3);
                        mVar9.f();
                    } else {
                        mVar9.C(2041111363);
                        mVar9.f();
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97932i, mVar9);
                    d6.p.f57793b.getClass();
                    mh.c(this.f16580b, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57794c, false, Integer.MAX_VALUE, 0, null, x0VarB, mVar9, 0, 24960, 110590);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g0(String str, boolean z14, int i14, byte b14) {
        this.f16579a = i14;
        this.f16580b = str;
        this.f16581c = z14;
    }

    public /* synthetic */ g0(boolean z14, String str, int i14) {
        this.f16579a = 2;
        this.f16581c = z14;
        this.f16580b = str;
    }

    public /* synthetic */ g0(boolean z14, String str, int i14, byte b14) {
        this.f16579a = i14;
        this.f16581c = z14;
        this.f16580b = str;
    }
}
