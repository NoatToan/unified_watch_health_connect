package ad0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j1;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import b21.c1;
import b21.p9;
import b82.t0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.LiveTrackServiceProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import d53.w;
import e11.c0;
import e2.f0;
import e23.q;
import ew1.e3;
import h2.j0;
import i3.fe;
import i3.wd;
import i3.zd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.z;
import l72.a3;
import l72.i3;
import lc.m0;
import lc.v;
import lc.y;
import nc.n;
import ne2.t;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p006l2.v0;
import p13.u0;
import p3.i0;
import p3.p1;
import p3.x3;
import p3.y3;
import p5.h0;
import p5.k0;
import p5.p;
import pj1.s;
import r53.p2;
import u62.c5;
import u62.f3;
import v.e0;
import v62.v7;
import vt1.o;
import w2.a0;
import wd2.m1;
import wt1.r;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2734d;

    public /* synthetic */ f(boolean z14, as2.f fVar, String str) {
        this.f2731a = 1;
        this.f2732b = z14;
        this.f2734d = fVar;
        this.f2733c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        List<xw1.h> list;
        List<tw1.c> list2;
        ff2.a aVar;
        Object next;
        j1 j1VarA;
        j1 j1VarA2;
        String string;
        Object value;
        Object value2;
        int i14 = this.f2731a;
        int i15 = 13;
        final int i16 = 5;
        final int i17 = 4;
        final int i18 = 7;
        final int i19 = 6;
        final int i24 = 2;
        final int i25 = 3;
        tj1.e eVar = null;
        final int i26 = 0;
        final int i27 = 1;
        final boolean z14 = this.f2732b;
        Object obj2 = this.f2734d;
        Object obj3 = this.f2733c;
        switch (i14) {
            case 0:
                String str = (String) obj3;
                String str2 = (String) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                if (!z14) {
                    str = str2;
                }
                h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 1:
                as2.f fVar = (as2.f) obj2;
                String str3 = (String) obj3;
                if (z14) {
                    fVar.f12702c = fVar.f12700a.getBy(str3);
                } else {
                    Logger logger = as2.f.f12699e;
                }
                return Unit.INSTANCE;
            case 2:
                ((i0) obj).getClass();
                return new c1(z14, (fe) obj3, (i21.d) obj2);
            case 3:
                return LiveTrackServiceProtobufRequestHandler.processAutoStartUpdate$lambda$0$0((LiveTrackServiceProtobufRequestHandler) obj3, (m1) obj2, z14, ((Boolean) obj).booleanValue());
            case 4:
                final e3 e3Var = (e3) obj3;
                final androidx.fragment.app.m mVar = (androidx.fragment.app.m) obj2;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                if (z14) {
                    f0.b(f0Var, null, new z3.e(573740546, true, new q() { // from class: ew1.g0
                        /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                        /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                        /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                        /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                            i53.c cVarB;
                            i53.c cVarB2;
                            String strQ;
                            String strP;
                            int i28 = i18;
                            final int i29 = 4;
                            p3.m.a aVar2 = p3.m.f135153a;
                            Object obj7 = null;
                            final e3 e3Var2 = e3Var;
                            final int i30 = 1;
                            switch (i28) {
                                case 0:
                                    xw1.o oVar = e3Var2.f66429j;
                                    p3.m mVar2 = (p3.m) obj5;
                                    int iIntValue = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p3.x1 x1Var = p3.n.f135158a;
                                        Integer numValueOf = oVar != null ? Integer.valueOf(oVar.getVideoDuration()) : null;
                                        vt1.o oVar2 = vt1.o.f180180k;
                                        u4.d dVarA = oVar2.a();
                                        String strQ2 = gl1.y.Q(mVar2, oVar2.f180186c);
                                        c22.x0.f23314a.getClass();
                                        String strW = gl1.d.W(c22.x0.Mb);
                                        String strW2 = gl1.d.W(c22.x0.Nb);
                                        String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                        s62.a.f157643a.getClass();
                                        i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                        boolean z15 = e3Var2.F;
                                        e23.a<Unit> aVar3 = e3Var2.f66434o;
                                        if (oVar != null) {
                                            mVar2.C(-1743304039);
                                            boolean zR = mVar2.r(e3Var2);
                                            Object objQ = mVar2.q();
                                            if (zR) {
                                                objQ = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i30) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar2.K(objQ);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ == p3.m.a.f135155b) {
                                                    objQ = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i30) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ);
                                                }
                                            }
                                            mVar2.f();
                                            obj7 = (e23.a) objQ;
                                        } else {
                                            mVar2.C(-1743204715);
                                            mVar2.f();
                                        }
                                        cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar3 = (p3.m) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        xw1.o oVar3 = e3Var2.f66426g;
                                        boolean z16 = e3Var2.f66445z;
                                        ?? ValueOf = oVar3 != null ? Integer.valueOf(oVar3.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                        String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                        String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                        String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                        y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                        fy1.i.a aVar4 = fy1.i.f73924a;
                                        Context context = (Context) mVar3.A(y3Var);
                                        String str4 = z16 ? "3-7" : "5-7";
                                        aVar4.getClass();
                                        String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                        if (z16) {
                                            mVar3.C(-2033264162);
                                            mVar3.f();
                                            cVarB = j53.l.b();
                                        } else {
                                            mVar3.C(-2033266767);
                                            cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                            mVar3.f();
                                        }
                                        i53.c cVar = cVarB;
                                        if (z16) {
                                            mVar3.C(-2033258658);
                                            mVar3.f();
                                            cVarB2 = j53.l.b();
                                        } else {
                                            mVar3.C(-2033260767);
                                            cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                            mVar3.f();
                                        }
                                        i53.c cVar2 = cVarB2;
                                        i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                        boolean z17 = e3Var2.C;
                                        e23.a<Unit> aVar5 = e3Var2.f66431l;
                                        boolean zR2 = mVar3.r(e3Var2);
                                        Object objQ2 = mVar3.q();
                                        if (zR2) {
                                            final int i34 = 2;
                                            objQ2 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i34) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ2);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                final int i35 = 2;
                                                objQ2 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i35) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ2);
                                            }
                                        }
                                        cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    p3.m mVar4 = (p3.m) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        xw1.o oVar4 = e3Var2.f66425f;
                                        ?? ValueOf2 = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA3 = f3.a(t62.a.f162797a);
                                        String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                        String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                        String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                        y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                        String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                        boolean z18 = e3Var2.C;
                                        e23.a<Unit> aVar6 = e3Var2.f66430k;
                                        boolean zR3 = mVar4.r(e3Var2);
                                        Object objQ3 = mVar4.q();
                                        if (zR3) {
                                            final int i36 = 3;
                                            objQ3 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i36) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar4.K(objQ3);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                final int i37 = 3;
                                                objQ3 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i37) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar4.K(objQ3);
                                            }
                                        }
                                        cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                case 3:
                                    p3.m mVar5 = (p3.m) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        p3.x1 x1Var4 = p3.n.f135158a;
                                        xw1.o oVar5 = e3Var2.f66428i;
                                        ?? ValueOf3 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                        String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                        String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                        String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                        y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                        String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                        i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                        boolean z19 = e3Var2.C;
                                        boolean z24 = e3Var2.E;
                                        e23.a<Unit> aVar7 = e3Var2.f66433n;
                                        boolean zR4 = mVar5.r(e3Var2);
                                        Object objQ4 = mVar5.q();
                                        if (zR4) {
                                            objQ4 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i29) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar5.K(objQ4);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i29) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar5.K(objQ4);
                                            }
                                        }
                                        cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                                case 4:
                                    p3.m mVar6 = (p3.m) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        p3.x1 x1Var5 = p3.n.f135158a;
                                        jv1.f fVar2 = e3Var2.f66420a;
                                        if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                            mVar6.C(-1833681348);
                                            strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                            mVar6.f();
                                        } else {
                                            mVar6.C(-1833571019);
                                            mVar6.f();
                                            strQ = "";
                                        }
                                        if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                            strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                        } else if (strQ.length() == 0) {
                                            strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                        } else {
                                            mVar6.C(-1833180977);
                                            strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                            mVar6.f();
                                        }
                                        String str5 = strP;
                                        h4.r.a aVar8 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                                case 5:
                                    p3.m mVar7 = (p3.m) obj5;
                                    int iIntValue6 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        p3.x1 x1Var6 = p3.n.f135158a;
                                        cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                    } else {
                                        mVar7.e();
                                    }
                                    break;
                                case 6:
                                    p3.m mVar8 = (p3.m) obj5;
                                    int iIntValue7 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        p3.x1 x1Var7 = p3.n.f135158a;
                                        xw1.o oVar6 = e3Var2.f66427h;
                                        ?? ValueOf4 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA5 = c5.a(t62.a.f162797a);
                                        String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                        String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                        String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                        y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                        fy1.i.a aVar9 = fy1.i.f73924a;
                                        Context context2 = (Context) mVar8.A(y3Var4);
                                        aVar9.getClass();
                                        String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                        i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                        boolean z25 = e3Var2.C;
                                        e23.a<Unit> aVar10 = e3Var2.f66432m;
                                        boolean zR5 = mVar8.r(e3Var2);
                                        Object objQ5 = mVar8.q();
                                        if (zR5) {
                                            final int i38 = false ? 1 : 0;
                                            objQ5 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i38) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ5);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ5 == p3.m.a.f135155b) {
                                                final int i39 = false ? 1 : 0;
                                                objQ5 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i39) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ5);
                                            }
                                        }
                                        cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                    } else {
                                        mVar8.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar9 = (p3.m) obj5;
                                    int iIntValue8 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        p3.x1 x1Var8 = p3.n.f135158a;
                                        String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                        h4.r.a aVar11 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    o oVar = e3Var.f66440u;
                    switch (oVar == null ? -1 : ew1.i0.a.f66512a[oVar.ordinal()]) {
                        case 1:
                            f0.b(f0Var, null, new z3.e(-863336768, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i28 = i24;
                                    final int i29 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var2 = e3Var;
                                    final int i30 = 1;
                                    switch (i28) {
                                        case 0:
                                            xw1.o oVar2 = e3Var2.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                                vt1.o oVar3 = vt1.o.f180180k;
                                                u4.d dVarA = oVar3.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var2.F;
                                                e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                if (oVar2 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var2);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i30) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar4 = e3Var2.f66426g;
                                                boolean z16 = e3Var2.f66445z;
                                                ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var2.C;
                                                e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                boolean zR2 = mVar3.r(e3Var2);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i35 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i35) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i36 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i36) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var2.f66425f;
                                                ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var2.C;
                                                e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                boolean zR3 = mVar4.r(e3Var2);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i37 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i38 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var2.f66428i;
                                                ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var2.C;
                                                boolean z24 = e3Var2.E;
                                                e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                boolean zR4 = mVar5.r(e3Var2);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i29) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar2 = e3Var2.f66420a;
                                                if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var2.f66427h;
                                                ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var2.C;
                                                e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                boolean zR5 = mVar8.r(e3Var2);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i39 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i39) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i310 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i310) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            break;
                        case 2:
                            f0.b(f0Var, null, new z3.e(1763245348, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i28 = i27;
                                    final int i29 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var2 = e3Var;
                                    final int i30 = 1;
                                    switch (i28) {
                                        case 0:
                                            xw1.o oVar2 = e3Var2.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                                vt1.o oVar3 = vt1.o.f180180k;
                                                u4.d dVarA = oVar3.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var2.F;
                                                e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                if (oVar2 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var2);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i30) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar4 = e3Var2.f66426g;
                                                boolean z16 = e3Var2.f66445z;
                                                ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var2.C;
                                                e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                boolean zR2 = mVar3.r(e3Var2);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i36 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i36) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i37 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var2.f66425f;
                                                ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var2.C;
                                                e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                boolean zR3 = mVar4.r(e3Var2);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i38 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i39 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i39) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var2.f66428i;
                                                ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var2.C;
                                                boolean z24 = e3Var2.E;
                                                e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                boolean zR4 = mVar5.r(e3Var2);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i29) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar2 = e3Var2.f66420a;
                                                if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var2.f66427h;
                                                ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var2.C;
                                                e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                boolean zR5 = mVar8.r(e3Var2);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i310 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i310) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i311 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i311) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            break;
                        case 3:
                            f0.b(f0Var, null, new z3.e(1000486786, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i28 = i19;
                                    final int i29 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var2 = e3Var;
                                    final int i30 = 1;
                                    switch (i28) {
                                        case 0:
                                            xw1.o oVar2 = e3Var2.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                                vt1.o oVar3 = vt1.o.f180180k;
                                                u4.d dVarA = oVar3.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var2.F;
                                                e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                if (oVar2 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var2);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i30) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar4 = e3Var2.f66426g;
                                                boolean z16 = e3Var2.f66445z;
                                                ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var2.C;
                                                e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                boolean zR2 = mVar3.r(e3Var2);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i37 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i38 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var2.f66425f;
                                                ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var2.C;
                                                e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                boolean zR3 = mVar4.r(e3Var2);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i39 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i39) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i310 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i310) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var2.f66428i;
                                                ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var2.C;
                                                boolean z24 = e3Var2.E;
                                                e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                boolean zR4 = mVar5.r(e3Var2);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i29) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar2 = e3Var2.f66420a;
                                                if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var2.f66427h;
                                                ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var2.C;
                                                e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                boolean zR5 = mVar8.r(e3Var2);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i311 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i311) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i312 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i312) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            break;
                        case 4:
                            f0.b(f0Var, null, new z3.e(1365447913, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i28 = i25;
                                    final int i29 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var2 = e3Var;
                                    final int i30 = 1;
                                    switch (i28) {
                                        case 0:
                                            xw1.o oVar2 = e3Var2.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                                vt1.o oVar3 = vt1.o.f180180k;
                                                u4.d dVarA = oVar3.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var2.F;
                                                e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                if (oVar2 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var2);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i30) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar4 = e3Var2.f66426g;
                                                boolean z16 = e3Var2.f66445z;
                                                ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var2.C;
                                                e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                boolean zR2 = mVar3.r(e3Var2);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i38 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i39 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i39) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var2.f66425f;
                                                ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var2.C;
                                                e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                boolean zR3 = mVar4.r(e3Var2);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i310 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i310) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i311 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i311) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var2.f66428i;
                                                ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var2.C;
                                                boolean z24 = e3Var2.E;
                                                e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                boolean zR4 = mVar5.r(e3Var2);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i29) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar2 = e3Var2.f66420a;
                                                if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var2.f66427h;
                                                ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var2.C;
                                                e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                boolean zR5 = mVar8.r(e3Var2);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i312 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i312) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i313 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i313) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            break;
                        case 5:
                            f0.b(f0Var, null, new z3.e(-398688503, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i28 = i26;
                                    final int i29 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var2 = e3Var;
                                    final int i30 = 1;
                                    switch (i28) {
                                        case 0:
                                            xw1.o oVar2 = e3Var2.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                                vt1.o oVar3 = vt1.o.f180180k;
                                                u4.d dVarA = oVar3.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var2.F;
                                                e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                if (oVar2 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var2);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i30) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar4 = e3Var2.f66426g;
                                                boolean z16 = e3Var2.f66445z;
                                                ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var2.C;
                                                e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                boolean zR2 = mVar3.r(e3Var2);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i39 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i39) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i310 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i310) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var2.f66425f;
                                                ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var2.C;
                                                e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                boolean zR3 = mVar4.r(e3Var2);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i311 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i311) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i312 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i312) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var2.f66428i;
                                                ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var2.C;
                                                boolean z24 = e3Var2.E;
                                                e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                boolean zR4 = mVar5.r(e3Var2);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i29) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar2 = e3Var2.f66420a;
                                                if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var2.f66427h;
                                                ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var2.C;
                                                e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                boolean zR5 = mVar8.r(e3Var2);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i313 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i313) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i314 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i314) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            break;
                        case 6:
                            if (e3Var.B) {
                                f0.b(f0Var, null, new z3.e(1365447913, true, new q() { // from class: ew1.g0
                                    /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                    /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                    /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                    /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                    @Override // e23.q
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                        i53.c cVarB;
                                        i53.c cVarB2;
                                        String strQ;
                                        String strP;
                                        int i28 = i25;
                                        final int i29 = 4;
                                        p3.m.a aVar2 = p3.m.f135153a;
                                        Object obj7 = null;
                                        final e3 e3Var2 = e3Var;
                                        final int i30 = 1;
                                        switch (i28) {
                                            case 0:
                                                xw1.o oVar2 = e3Var2.f66429j;
                                                p3.m mVar2 = (p3.m) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    p3.x1 x1Var = p3.n.f135158a;
                                                    Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                                    vt1.o oVar3 = vt1.o.f180180k;
                                                    u4.d dVarA = oVar3.a();
                                                    String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                                    c22.x0.f23314a.getClass();
                                                    String strW = gl1.d.W(c22.x0.Mb);
                                                    String strW2 = gl1.d.W(c22.x0.Nb);
                                                    String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                    s62.a.f157643a.getClass();
                                                    i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                    boolean z15 = e3Var2.F;
                                                    e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                    if (oVar2 != null) {
                                                        mVar2.C(-1743304039);
                                                        boolean zR = mVar2.r(e3Var2);
                                                        Object objQ = mVar2.q();
                                                        if (zR) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        } else {
                                                            aVar2.getClass();
                                                            if (objQ == p3.m.a.f135155b) {
                                                                objQ = new e23.a() { // from class: ew1.f0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i30) {
                                                                            case 0:
                                                                                e3 e3Var3 = e3Var2;
                                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var4 = e3Var2;
                                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                                break;
                                                                            case 2:
                                                                                e3 e3Var5 = e3Var2;
                                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                                break;
                                                                            case 3:
                                                                                e3 e3Var6 = e3Var2;
                                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                                break;
                                                                            default:
                                                                                e3 e3Var7 = e3Var2;
                                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar2.K(objQ);
                                                            }
                                                        }
                                                        mVar2.f();
                                                        obj7 = (e23.a) objQ;
                                                    } else {
                                                        mVar2.C(-1743204715);
                                                        mVar2.f();
                                                    }
                                                    cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                            case 1:
                                                p3.m mVar3 = (p3.m) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    p3.x1 x1Var2 = p3.n.f135158a;
                                                    xw1.o oVar4 = e3Var2.f66426g;
                                                    boolean z16 = e3Var2.f66445z;
                                                    ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                    String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                    String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                    String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                    fy1.i.a aVar4 = fy1.i.f73924a;
                                                    Context context = (Context) mVar3.A(y3Var);
                                                    String str4 = z16 ? "3-7" : "5-7";
                                                    aVar4.getClass();
                                                    String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                    if (z16) {
                                                        mVar3.C(-2033264162);
                                                        mVar3.f();
                                                        cVarB = j53.l.b();
                                                    } else {
                                                        mVar3.C(-2033266767);
                                                        cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                        mVar3.f();
                                                    }
                                                    i53.c cVar = cVarB;
                                                    if (z16) {
                                                        mVar3.C(-2033258658);
                                                        mVar3.f();
                                                        cVarB2 = j53.l.b();
                                                    } else {
                                                        mVar3.C(-2033260767);
                                                        cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                        mVar3.f();
                                                    }
                                                    i53.c cVar2 = cVarB2;
                                                    i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                    boolean z17 = e3Var2.C;
                                                    e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                    boolean zR2 = mVar3.r(e3Var2);
                                                    Object objQ2 = mVar3.q();
                                                    if (zR2) {
                                                        final int i310 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i310) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ2 == p3.m.a.f135155b) {
                                                            final int i311 = 2;
                                                            objQ2 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i311) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar3.K(objQ2);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 2:
                                                p3.m mVar4 = (p3.m) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    p3.x1 x1Var3 = p3.n.f135158a;
                                                    xw1.o oVar5 = e3Var2.f66425f;
                                                    ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                    String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                    String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                    String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                    y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                    String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                    boolean z18 = e3Var2.C;
                                                    e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                    boolean zR3 = mVar4.r(e3Var2);
                                                    Object objQ3 = mVar4.q();
                                                    if (zR3) {
                                                        final int i312 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i312) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ3 == p3.m.a.f135155b) {
                                                            final int i313 = 3;
                                                            objQ3 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i313) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar4.K(objQ3);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                                } else {
                                                    mVar4.e();
                                                }
                                                break;
                                            case 3:
                                                p3.m mVar5 = (p3.m) obj5;
                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    p3.x1 x1Var4 = p3.n.f135158a;
                                                    xw1.o oVar6 = e3Var2.f66428i;
                                                    ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                    String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                    String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                    String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                    y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                    String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                    i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                    boolean z19 = e3Var2.C;
                                                    boolean z24 = e3Var2.E;
                                                    e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                    boolean zR4 = mVar5.r(e3Var2);
                                                    Object objQ4 = mVar5.q();
                                                    if (zR4) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ4 == p3.m.a.f135155b) {
                                                            objQ4 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i29) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar5.K(objQ4);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                                } else {
                                                    mVar5.e();
                                                }
                                                break;
                                            case 4:
                                                p3.m mVar6 = (p3.m) obj5;
                                                int iIntValue5 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                    p3.x1 x1Var5 = p3.n.f135158a;
                                                    jv1.f fVar2 = e3Var2.f66420a;
                                                    if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                                        mVar6.C(-1833681348);
                                                        strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                                        mVar6.f();
                                                    } else {
                                                        mVar6.C(-1833571019);
                                                        mVar6.f();
                                                        strQ = "";
                                                    }
                                                    if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                                        strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                    } else if (strQ.length() == 0) {
                                                        strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                    } else {
                                                        mVar6.C(-1833180977);
                                                        strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                        mVar6.f();
                                                    }
                                                    String str5 = strP;
                                                    h4.r.a aVar8 = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                                } else {
                                                    mVar6.e();
                                                }
                                                break;
                                            case 5:
                                                p3.m mVar7 = (p3.m) obj5;
                                                int iIntValue6 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                    p3.x1 x1Var6 = p3.n.f135158a;
                                                    cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            case 6:
                                                p3.m mVar8 = (p3.m) obj5;
                                                int iIntValue7 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                    p3.x1 x1Var7 = p3.n.f135158a;
                                                    xw1.o oVar7 = e3Var2.f66427h;
                                                    ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                    String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                    String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                    String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                    y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                    fy1.i.a aVar9 = fy1.i.f73924a;
                                                    Context context2 = (Context) mVar8.A(y3Var4);
                                                    aVar9.getClass();
                                                    String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                    i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                    boolean z25 = e3Var2.C;
                                                    e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                    boolean zR5 = mVar8.r(e3Var2);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR5) {
                                                        final int i314 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i314) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ5 == p3.m.a.f135155b) {
                                                            final int i315 = false ? 1 : 0;
                                                            objQ5 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i315) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                            default:
                                                p3.m mVar9 = (p3.m) obj5;
                                                int iIntValue8 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                    p3.x1 x1Var8 = p3.n.f135158a;
                                                    String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                    h4.r.a aVar11 = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                                } else {
                                                    mVar9.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                            }
                            if (e3Var.D) {
                                f0.b(f0Var, null, new z3.e(-398688503, true, new q() { // from class: ew1.g0
                                    /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                    /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                    /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                    /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                    /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                    @Override // e23.q
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                        i53.c cVarB;
                                        i53.c cVarB2;
                                        String strQ;
                                        String strP;
                                        int i28 = i26;
                                        final int i29 = 4;
                                        p3.m.a aVar2 = p3.m.f135153a;
                                        Object obj7 = null;
                                        final e3 e3Var2 = e3Var;
                                        final int i30 = 1;
                                        switch (i28) {
                                            case 0:
                                                xw1.o oVar2 = e3Var2.f66429j;
                                                p3.m mVar2 = (p3.m) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    p3.x1 x1Var = p3.n.f135158a;
                                                    Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                                    vt1.o oVar3 = vt1.o.f180180k;
                                                    u4.d dVarA = oVar3.a();
                                                    String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                                    c22.x0.f23314a.getClass();
                                                    String strW = gl1.d.W(c22.x0.Mb);
                                                    String strW2 = gl1.d.W(c22.x0.Nb);
                                                    String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                    s62.a.f157643a.getClass();
                                                    i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                    boolean z15 = e3Var2.F;
                                                    e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                    if (oVar2 != null) {
                                                        mVar2.C(-1743304039);
                                                        boolean zR = mVar2.r(e3Var2);
                                                        Object objQ = mVar2.q();
                                                        if (zR) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        } else {
                                                            aVar2.getClass();
                                                            if (objQ == p3.m.a.f135155b) {
                                                                objQ = new e23.a() { // from class: ew1.f0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i30) {
                                                                            case 0:
                                                                                e3 e3Var3 = e3Var2;
                                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var4 = e3Var2;
                                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                                break;
                                                                            case 2:
                                                                                e3 e3Var5 = e3Var2;
                                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                                break;
                                                                            case 3:
                                                                                e3 e3Var6 = e3Var2;
                                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                                break;
                                                                            default:
                                                                                e3 e3Var7 = e3Var2;
                                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar2.K(objQ);
                                                            }
                                                        }
                                                        mVar2.f();
                                                        obj7 = (e23.a) objQ;
                                                    } else {
                                                        mVar2.C(-1743204715);
                                                        mVar2.f();
                                                    }
                                                    cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                            case 1:
                                                p3.m mVar3 = (p3.m) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    p3.x1 x1Var2 = p3.n.f135158a;
                                                    xw1.o oVar4 = e3Var2.f66426g;
                                                    boolean z16 = e3Var2.f66445z;
                                                    ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                    String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                    String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                    String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                    fy1.i.a aVar4 = fy1.i.f73924a;
                                                    Context context = (Context) mVar3.A(y3Var);
                                                    String str4 = z16 ? "3-7" : "5-7";
                                                    aVar4.getClass();
                                                    String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                    if (z16) {
                                                        mVar3.C(-2033264162);
                                                        mVar3.f();
                                                        cVarB = j53.l.b();
                                                    } else {
                                                        mVar3.C(-2033266767);
                                                        cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                        mVar3.f();
                                                    }
                                                    i53.c cVar = cVarB;
                                                    if (z16) {
                                                        mVar3.C(-2033258658);
                                                        mVar3.f();
                                                        cVarB2 = j53.l.b();
                                                    } else {
                                                        mVar3.C(-2033260767);
                                                        cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                        mVar3.f();
                                                    }
                                                    i53.c cVar2 = cVarB2;
                                                    i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                    boolean z17 = e3Var2.C;
                                                    e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                    boolean zR2 = mVar3.r(e3Var2);
                                                    Object objQ2 = mVar3.q();
                                                    if (zR2) {
                                                        final int i311 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i311) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ2 == p3.m.a.f135155b) {
                                                            final int i312 = 2;
                                                            objQ2 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i312) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar3.K(objQ2);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 2:
                                                p3.m mVar4 = (p3.m) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    p3.x1 x1Var3 = p3.n.f135158a;
                                                    xw1.o oVar5 = e3Var2.f66425f;
                                                    ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                    String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                    String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                    String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                    y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                    String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                    boolean z18 = e3Var2.C;
                                                    e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                    boolean zR3 = mVar4.r(e3Var2);
                                                    Object objQ3 = mVar4.q();
                                                    if (zR3) {
                                                        final int i313 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i313) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ3 == p3.m.a.f135155b) {
                                                            final int i314 = 3;
                                                            objQ3 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i314) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar4.K(objQ3);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                                } else {
                                                    mVar4.e();
                                                }
                                                break;
                                            case 3:
                                                p3.m mVar5 = (p3.m) obj5;
                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    p3.x1 x1Var4 = p3.n.f135158a;
                                                    xw1.o oVar6 = e3Var2.f66428i;
                                                    ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                    String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                    String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                    String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                    y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                    String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                    i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                    boolean z19 = e3Var2.C;
                                                    boolean z24 = e3Var2.E;
                                                    e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                    boolean zR4 = mVar5.r(e3Var2);
                                                    Object objQ4 = mVar5.q();
                                                    if (zR4) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ4 == p3.m.a.f135155b) {
                                                            objQ4 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i29) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar5.K(objQ4);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                                } else {
                                                    mVar5.e();
                                                }
                                                break;
                                            case 4:
                                                p3.m mVar6 = (p3.m) obj5;
                                                int iIntValue5 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                    p3.x1 x1Var5 = p3.n.f135158a;
                                                    jv1.f fVar2 = e3Var2.f66420a;
                                                    if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                                        mVar6.C(-1833681348);
                                                        strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                                        mVar6.f();
                                                    } else {
                                                        mVar6.C(-1833571019);
                                                        mVar6.f();
                                                        strQ = "";
                                                    }
                                                    if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                                        strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                    } else if (strQ.length() == 0) {
                                                        strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                    } else {
                                                        mVar6.C(-1833180977);
                                                        strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                        mVar6.f();
                                                    }
                                                    String str5 = strP;
                                                    h4.r.a aVar8 = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                                } else {
                                                    mVar6.e();
                                                }
                                                break;
                                            case 5:
                                                p3.m mVar7 = (p3.m) obj5;
                                                int iIntValue6 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                    p3.x1 x1Var6 = p3.n.f135158a;
                                                    cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            case 6:
                                                p3.m mVar8 = (p3.m) obj5;
                                                int iIntValue7 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                    p3.x1 x1Var7 = p3.n.f135158a;
                                                    xw1.o oVar7 = e3Var2.f66427h;
                                                    ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                    s62.a.f157643a.getClass();
                                                    u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                    String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                    String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                    String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                    y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                    i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                    fy1.i.a aVar9 = fy1.i.f73924a;
                                                    Context context2 = (Context) mVar8.A(y3Var4);
                                                    aVar9.getClass();
                                                    String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                    i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                    boolean z25 = e3Var2.C;
                                                    e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                    boolean zR5 = mVar8.r(e3Var2);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR5) {
                                                        final int i315 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i315) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ5 == p3.m.a.f135155b) {
                                                            final int i316 = false ? 1 : 0;
                                                            objQ5 = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i316) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                            default:
                                                p3.m mVar9 = (p3.m) obj5;
                                                int iIntValue8 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                    p3.x1 x1Var8 = p3.n.f135158a;
                                                    String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                    h4.r.a aVar11 = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                                } else {
                                                    mVar9.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                            }
                            break;
                    }
                } else {
                    f0.b(f0Var, null, new z3.e(-1455601477, true, new q() { // from class: ew1.g0
                        /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                        /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                        /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                        /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                        /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                            i53.c cVarB;
                            i53.c cVarB2;
                            String strQ;
                            String strP;
                            int i28 = i17;
                            final int i29 = 4;
                            p3.m.a aVar2 = p3.m.f135153a;
                            Object obj7 = null;
                            final e3 e3Var2 = e3Var;
                            final int i30 = 1;
                            switch (i28) {
                                case 0:
                                    xw1.o oVar2 = e3Var2.f66429j;
                                    p3.m mVar2 = (p3.m) obj5;
                                    int iIntValue = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p3.x1 x1Var = p3.n.f135158a;
                                        Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.getVideoDuration()) : null;
                                        vt1.o oVar3 = vt1.o.f180180k;
                                        u4.d dVarA = oVar3.a();
                                        String strQ2 = gl1.y.Q(mVar2, oVar3.f180186c);
                                        c22.x0.f23314a.getClass();
                                        String strW = gl1.d.W(c22.x0.Mb);
                                        String strW2 = gl1.d.W(c22.x0.Nb);
                                        String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                        s62.a.f157643a.getClass();
                                        i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                        boolean z15 = e3Var2.F;
                                        e23.a<Unit> aVar3 = e3Var2.f66434o;
                                        if (oVar2 != null) {
                                            mVar2.C(-1743304039);
                                            boolean zR = mVar2.r(e3Var2);
                                            Object objQ = mVar2.q();
                                            if (zR) {
                                                objQ = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i30) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar2.K(objQ);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ == p3.m.a.f135155b) {
                                                    objQ = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i30) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ);
                                                }
                                            }
                                            mVar2.f();
                                            obj7 = (e23.a) objQ;
                                        } else {
                                            mVar2.C(-1743204715);
                                            mVar2.f();
                                        }
                                        cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar3 = (p3.m) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        xw1.o oVar4 = e3Var2.f66426g;
                                        boolean z16 = e3Var2.f66445z;
                                        ?? ValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                        String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                        String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                        String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                        y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                        fy1.i.a aVar4 = fy1.i.f73924a;
                                        Context context = (Context) mVar3.A(y3Var);
                                        String str4 = z16 ? "3-7" : "5-7";
                                        aVar4.getClass();
                                        String strA = fy1.i.a.a(context, "6-52", str4, "6-13");
                                        if (z16) {
                                            mVar3.C(-2033264162);
                                            mVar3.f();
                                            cVarB = j53.l.b();
                                        } else {
                                            mVar3.C(-2033266767);
                                            cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                            mVar3.f();
                                        }
                                        i53.c cVar = cVarB;
                                        if (z16) {
                                            mVar3.C(-2033258658);
                                            mVar3.f();
                                            cVarB2 = j53.l.b();
                                        } else {
                                            mVar3.C(-2033260767);
                                            cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                            mVar3.f();
                                        }
                                        i53.c cVar2 = cVarB2;
                                        i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                        boolean z17 = e3Var2.C;
                                        e23.a<Unit> aVar5 = e3Var2.f66431l;
                                        boolean zR2 = mVar3.r(e3Var2);
                                        Object objQ2 = mVar3.q();
                                        if (zR2) {
                                            final int i312 = 2;
                                            objQ2 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i312) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ2);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                final int i313 = 2;
                                                objQ2 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i313) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ2);
                                            }
                                        }
                                        cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    p3.m mVar4 = (p3.m) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        xw1.o oVar5 = e3Var2.f66425f;
                                        ?? ValueOf2 = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA3 = f3.a(t62.a.f162797a);
                                        String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                        String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                        String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                        y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                        String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                        boolean z18 = e3Var2.C;
                                        e23.a<Unit> aVar6 = e3Var2.f66430k;
                                        boolean zR3 = mVar4.r(e3Var2);
                                        Object objQ3 = mVar4.q();
                                        if (zR3) {
                                            final int i314 = 3;
                                            objQ3 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i314) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar4.K(objQ3);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                final int i315 = 3;
                                                objQ3 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i315) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar4.K(objQ3);
                                            }
                                        }
                                        cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                case 3:
                                    p3.m mVar5 = (p3.m) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        p3.x1 x1Var4 = p3.n.f135158a;
                                        xw1.o oVar6 = e3Var2.f66428i;
                                        ?? ValueOf3 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                        String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                        String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                        String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                        y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                        String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                        i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                        boolean z19 = e3Var2.C;
                                        boolean z24 = e3Var2.E;
                                        e23.a<Unit> aVar7 = e3Var2.f66433n;
                                        boolean zR4 = mVar5.r(e3Var2);
                                        Object objQ4 = mVar5.q();
                                        if (zR4) {
                                            objQ4 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i29) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar5.K(objQ4);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i29) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar5.K(objQ4);
                                            }
                                        }
                                        cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                                case 4:
                                    p3.m mVar6 = (p3.m) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        p3.x1 x1Var5 = p3.n.f135158a;
                                        jv1.f fVar2 = e3Var2.f66420a;
                                        if ((fVar2 != null ? fVar2.f101048b : null) != null) {
                                            mVar6.C(-1833681348);
                                            strQ = gl1.y.Q(mVar6, fVar2.f101048b.intValue());
                                            mVar6.f();
                                        } else {
                                            mVar6.C(-1833571019);
                                            mVar6.f();
                                            strQ = "";
                                        }
                                        if (e3Var2.b(fVar2 != null ? fVar2.f101047a : null)) {
                                            strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                        } else if (strQ.length() == 0) {
                                            strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                        } else {
                                            mVar6.C(-1833180977);
                                            strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                            mVar6.f();
                                        }
                                        String str5 = strP;
                                        h4.r.a aVar8 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                                case 5:
                                    p3.m mVar7 = (p3.m) obj5;
                                    int iIntValue6 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        p3.x1 x1Var6 = p3.n.f135158a;
                                        cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                    } else {
                                        mVar7.e();
                                    }
                                    break;
                                case 6:
                                    p3.m mVar8 = (p3.m) obj5;
                                    int iIntValue7 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        p3.x1 x1Var7 = p3.n.f135158a;
                                        xw1.o oVar7 = e3Var2.f66427h;
                                        ?? ValueOf4 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA5 = c5.a(t62.a.f162797a);
                                        String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                        String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                        String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                        y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                        i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                        fy1.i.a aVar9 = fy1.i.f73924a;
                                        Context context2 = (Context) mVar8.A(y3Var4);
                                        aVar9.getClass();
                                        String strA2 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                        i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                        boolean z25 = e3Var2.C;
                                        e23.a<Unit> aVar10 = e3Var2.f66432m;
                                        boolean zR5 = mVar8.r(e3Var2);
                                        Object objQ5 = mVar8.q();
                                        if (zR5) {
                                            final int i316 = false ? 1 : 0;
                                            objQ5 = new e23.a() { // from class: ew1.f0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i316) {
                                                        case 0:
                                                            e3 e3Var3 = e3Var2;
                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                            break;
                                                        case 1:
                                                            e3 e3Var4 = e3Var2;
                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                            break;
                                                        case 2:
                                                            e3 e3Var5 = e3Var2;
                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                            break;
                                                        case 3:
                                                            e3 e3Var6 = e3Var2;
                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                            break;
                                                        default:
                                                            e3 e3Var7 = e3Var2;
                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ5);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ5 == p3.m.a.f135155b) {
                                                final int i317 = false ? 1 : 0;
                                                objQ5 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i317) {
                                                            case 0:
                                                                e3 e3Var3 = e3Var2;
                                                                e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var4 = e3Var2;
                                                                e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var5 = e3Var2;
                                                                e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var6 = e3Var2;
                                                                e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var7 = e3Var2;
                                                                e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ5);
                                            }
                                        }
                                        cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA2, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                    } else {
                                        mVar8.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar9 = (p3.m) obj5;
                                    int iIntValue8 = ((Integer) obj6).intValue();
                                    ((e2.d) obj4).getClass();
                                    if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        p3.x1 x1Var8 = p3.n.f135158a;
                                        String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                        h4.r.a aVar11 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    jv1.f fVar2 = e3Var.f66420a;
                    o oVar2 = fVar2 != null ? fVar2.f101047a : null;
                    int i28 = oVar2 == null ? -1 : ew1.i0.a.f66512a[oVar2.ordinal()];
                    if (i28 == 1) {
                        final String strA = r.a();
                        jv1.f fVar3 = e3Var.f66421b;
                        if (fVar2 != null && (list = fVar2.f101049c) != null) {
                            for (final xw1.h hVar : list) {
                                final int i29 = 0;
                                f0.b(f0Var, null, new z3.e(-1537429258, true, new q() { // from class: ew1.h0
                                    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
                                    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
                                    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x020b  */
                                    @Override // e23.q
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        Long coachId;
                                        Long coachId2;
                                        int i30 = i29;
                                        e23.a aVar2 = null;
                                        p3.m.a aVar3 = p3.m.f135153a;
                                        androidx.fragment.app.m mVar2 = mVar;
                                        final e3 e3Var2 = e3Var;
                                        final xw1.h hVar2 = hVar;
                                        String str4 = strA;
                                        final int i34 = 0;
                                        final int i35 = 1;
                                        switch (i30) {
                                            case 0:
                                                p3.m mVar3 = (p3.m) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    p3.x1 x1Var = p3.n.f135158a;
                                                    xw1.o oVar3 = hVar2.f192397q;
                                                    jf.d dVarA = jf.s.a(tn.k.g(str4, oVar3 != null ? oVar3.getVideoThumbnailUrl() : null), null, mVar3, 0, 30);
                                                    xw1.o oVar4 = hVar2.f192397q;
                                                    Integer numValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                    u4.d dVarA2 = e3Var2.f66420a.f101047a.a();
                                                    String strQ = gl1.y.Q(mVar3, R.string.lbl_run);
                                                    String coachFirstName = hVar2.getCoachFirstName();
                                                    String strP = gl1.y.P(R.string.coach_name, new Object[]{coachFirstName != null ? coachFirstName : ""}, mVar3);
                                                    fy1.i.a aVar4 = fy1.i.f73924a;
                                                    xw1.f coach = hVar2.getCoach();
                                                    int iLongValue = (coach == null || (coachId = coach.getCoachId()) == null) ? -1 : (int) coachId.longValue();
                                                    aVar4.getClass();
                                                    String strG = fy1.i.a.g(mVar2, iLongValue);
                                                    i53.f fVarA = i53.a.a(gl1.y.Q(mVar3, R.string.workouts_adapt_on_benchmark_runs), gl1.y.Q(mVar3, R.string.additional_coaching_information));
                                                    String strA2 = fy1.i.a.a(mVar2, hVar2.C(), hVar2.I(), null);
                                                    boolean zR = mVar3.r(e3Var2) | mVar3.r(hVar2);
                                                    Object objQ = mVar3.q();
                                                    if (zR) {
                                                        final int i36 = 3;
                                                        objQ = new e23.a() { // from class: ew1.e0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i36) {
                                                                    case 0:
                                                                        e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                        xw1.o oVar5 = hVar2.f192397q;
                                                                        oVar5.getClass();
                                                                        lVar.invoke(oVar5);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                        break;
                                                                    case 2:
                                                                        e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                        xw1.o oVar6 = hVar2.f192397q;
                                                                        oVar6.getClass();
                                                                        lVar2.invoke(oVar6);
                                                                        break;
                                                                    default:
                                                                        e3Var2.f66436q.invoke(hVar2);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ);
                                                    } else {
                                                        aVar3.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            final int i37 = 3;
                                                            objQ = new e23.a() { // from class: ew1.e0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i37) {
                                                                        case 0:
                                                                            e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                            xw1.o oVar5 = hVar2.f192397q;
                                                                            oVar5.getClass();
                                                                            lVar.invoke(oVar5);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                            break;
                                                                        case 2:
                                                                            e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                            xw1.o oVar6 = hVar2.f192397q;
                                                                            oVar6.getClass();
                                                                            lVar2.invoke(oVar6);
                                                                            break;
                                                                        default:
                                                                            e3Var2.f66436q.invoke(hVar2);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar3.K(objQ);
                                                        }
                                                    }
                                                    e23.a aVar5 = (e23.a) objQ;
                                                    if (hVar2.f192397q != null) {
                                                        mVar3.C(-22533619);
                                                        boolean zR2 = mVar3.r(e3Var2) | mVar3.r(hVar2);
                                                        Object objQ2 = mVar3.q();
                                                        if (zR2) {
                                                            objQ2 = new e23.a() { // from class: ew1.e0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i34) {
                                                                        case 0:
                                                                            e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                            xw1.o oVar5 = hVar2.f192397q;
                                                                            oVar5.getClass();
                                                                            lVar.invoke(oVar5);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                            break;
                                                                        case 2:
                                                                            e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                            xw1.o oVar6 = hVar2.f192397q;
                                                                            oVar6.getClass();
                                                                            lVar2.invoke(oVar6);
                                                                            break;
                                                                        default:
                                                                            e3Var2.f66436q.invoke(hVar2);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar3.K(objQ2);
                                                        } else {
                                                            aVar3.getClass();
                                                            if (objQ2 == p3.m.a.f135155b) {
                                                                objQ2 = new e23.a() { // from class: ew1.e0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i34) {
                                                                            case 0:
                                                                                e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                                xw1.o oVar5 = hVar2.f192397q;
                                                                                oVar5.getClass();
                                                                                lVar.invoke(oVar5);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var3 = e3Var2;
                                                                                e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                                break;
                                                                            case 2:
                                                                                e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                                xw1.o oVar6 = hVar2.f192397q;
                                                                                oVar6.getClass();
                                                                                lVar2.invoke(oVar6);
                                                                                break;
                                                                            default:
                                                                                e3Var2.f66436q.invoke(hVar2);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar3.K(objQ2);
                                                            }
                                                        }
                                                        aVar2 = (e23.a) objQ2;
                                                        mVar3.f();
                                                    } else {
                                                        mVar3.C(-22435008);
                                                        mVar3.f();
                                                    }
                                                    cw1.c.c(null, null, dVarA, numValueOf, dVarA2, strQ, strP, strG, fVarA, null, null, null, strA2, false, false, aVar5, aVar2, mVar3, 0, 0, 121867);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                p3.m mVar4 = (p3.m) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((e2.d) obj4).getClass();
                                                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    p3.x1 x1Var2 = p3.n.f135158a;
                                                    xw1.o oVar5 = hVar2.f192397q;
                                                    jf.d dVarA3 = jf.s.a(tn.k.g(str4, oVar5 != null ? oVar5.getVideoThumbnailUrl() : null), null, mVar4, 0, 30);
                                                    u4.d dVarA4 = e3Var2.f66421b.f101047a.a();
                                                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                    String coachFirstName2 = hVar2.getCoachFirstName();
                                                    String strP2 = gl1.y.P(R.string.coach_name, new Object[]{coachFirstName2 != null ? coachFirstName2 : ""}, mVar4);
                                                    fy1.i.a aVar6 = fy1.i.f73924a;
                                                    xw1.f coach2 = hVar2.getCoach();
                                                    int iLongValue2 = (coach2 == null || (coachId2 = coach2.getCoachId()) == null) ? -1 : (int) coachId2.longValue();
                                                    aVar6.getClass();
                                                    String strG2 = fy1.i.a.g(mVar2, iLongValue2);
                                                    String strA3 = fy1.i.a.a(mVar2, androidx.core.view.j.d(hVar2.getMinWeeksPerPlan(), hVar2.getMaxWeeksPerPlan(), "-"), "3-5", null);
                                                    boolean zR3 = mVar4.r(e3Var2) | mVar4.r(hVar2);
                                                    Object objQ3 = mVar4.q();
                                                    if (zR3) {
                                                        objQ3 = new e23.a() { // from class: ew1.e0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i35) {
                                                                    case 0:
                                                                        e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                        xw1.o oVar6 = hVar2.f192397q;
                                                                        oVar6.getClass();
                                                                        lVar.invoke(oVar6);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                        break;
                                                                    case 2:
                                                                        e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                        xw1.o oVar7 = hVar2.f192397q;
                                                                        oVar7.getClass();
                                                                        lVar2.invoke(oVar7);
                                                                        break;
                                                                    default:
                                                                        e3Var2.f66436q.invoke(hVar2);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    } else {
                                                        aVar3.getClass();
                                                        if (objQ3 == p3.m.a.f135155b) {
                                                            objQ3 = new e23.a() { // from class: ew1.e0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i35) {
                                                                        case 0:
                                                                            e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                            xw1.o oVar6 = hVar2.f192397q;
                                                                            oVar6.getClass();
                                                                            lVar.invoke(oVar6);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                            break;
                                                                        case 2:
                                                                            e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                            xw1.o oVar7 = hVar2.f192397q;
                                                                            oVar7.getClass();
                                                                            lVar2.invoke(oVar7);
                                                                            break;
                                                                        default:
                                                                            e3Var2.f66436q.invoke(hVar2);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar4.K(objQ3);
                                                        }
                                                    }
                                                    e23.a aVar7 = (e23.a) objQ3;
                                                    if (hVar2.f192397q != null) {
                                                        mVar4.C(1776177528);
                                                        boolean zR4 = mVar4.r(e3Var2) | mVar4.r(hVar2);
                                                        Object objQ4 = mVar4.q();
                                                        if (zR4) {
                                                            final int i38 = 2;
                                                            objQ4 = new e23.a() { // from class: ew1.e0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i38) {
                                                                        case 0:
                                                                            e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                            xw1.o oVar6 = hVar2.f192397q;
                                                                            oVar6.getClass();
                                                                            lVar.invoke(oVar6);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                            break;
                                                                        case 2:
                                                                            e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                            xw1.o oVar7 = hVar2.f192397q;
                                                                            oVar7.getClass();
                                                                            lVar2.invoke(oVar7);
                                                                            break;
                                                                        default:
                                                                            e3Var2.f66436q.invoke(hVar2);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar4.K(objQ4);
                                                        } else {
                                                            aVar3.getClass();
                                                            if (objQ4 == p3.m.a.f135155b) {
                                                                final int i39 = 2;
                                                                objQ4 = new e23.a() { // from class: ew1.e0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i39) {
                                                                            case 0:
                                                                                e23.l<xw1.o, Unit> lVar = e3Var2.f66435p;
                                                                                xw1.o oVar6 = hVar2.f192397q;
                                                                                oVar6.getClass();
                                                                                lVar.invoke(oVar6);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var3 = e3Var2;
                                                                                e3Var3.f66439t.invoke(hVar2, e3Var3.f66421b.f101053g);
                                                                                break;
                                                                            case 2:
                                                                                e23.l<xw1.o, Unit> lVar2 = e3Var2.f66435p;
                                                                                xw1.o oVar7 = hVar2.f192397q;
                                                                                oVar7.getClass();
                                                                                lVar2.invoke(oVar7);
                                                                                break;
                                                                            default:
                                                                                e3Var2.f66436q.invoke(hVar2);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar4.K(objQ4);
                                                            }
                                                        }
                                                        aVar2 = (e23.a) objQ4;
                                                        mVar4.f();
                                                    } else {
                                                        mVar4.C(1776284075);
                                                        mVar4.f();
                                                    }
                                                    cw1.c.c(null, null, dVarA3, null, dVarA4, strQ2, strP2, strG2, null, null, null, null, strA3, false, false, aVar7, aVar2, mVar4, 0, 0, 122395);
                                                } else {
                                                    mVar4.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                            }
                        }
                        if (e3Var.f66422c) {
                            f0.b(f0Var, null, new z3.e(-863336768, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i210 = i24;
                                    final int i211 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var2 = e3Var;
                                    final int i30 = 1;
                                    switch (i210) {
                                        case 0:
                                            xw1.o oVar3 = e3Var2.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar3 != null ? Integer.valueOf(oVar3.getVideoDuration()) : null;
                                                vt1.o oVar4 = vt1.o.f180180k;
                                                u4.d dVarA = oVar4.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar4.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var2.F;
                                                e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                if (oVar3 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var2);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i30) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var2.f66426g;
                                                boolean z16 = e3Var2.f66445z;
                                                ?? ValueOf = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA2 = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var2.C;
                                                e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                boolean zR2 = mVar3.r(e3Var2);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i313 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i313) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i314 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i314) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA2, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var2.f66425f;
                                                ?? ValueOf2 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var2.C;
                                                e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                boolean zR3 = mVar4.r(e3Var2);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i315 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i315) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i316 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i316) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var2.f66428i;
                                                ?? ValueOf3 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var2.C;
                                                boolean z24 = e3Var2.E;
                                                e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                boolean zR4 = mVar5.r(e3Var2);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i211) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i211) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar4 = e3Var2.f66420a;
                                                if ((fVar4 != null ? fVar4.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar4.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var2.b(fVar4 != null ? fVar4.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar8 = e3Var2.f66427h;
                                                ?? ValueOf4 = oVar8 != null ? Integer.valueOf(oVar8.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA3 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var2.C;
                                                e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                boolean zR5 = mVar8.r(e3Var2);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i317 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i317) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i318 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i318) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA3, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                        }
                        if (fVar2 != null && fVar2.f101051e && fVar3 == null) {
                            f0.b(f0Var, null, new z3.e(1443288126, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i210 = i16;
                                    final int i211 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var2 = e3Var;
                                    final int i30 = 1;
                                    switch (i210) {
                                        case 0:
                                            xw1.o oVar3 = e3Var2.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar3 != null ? Integer.valueOf(oVar3.getVideoDuration()) : null;
                                                vt1.o oVar4 = vt1.o.f180180k;
                                                u4.d dVarA = oVar4.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar4.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var2.F;
                                                e23.a<Unit> aVar3 = e3Var2.f66434o;
                                                if (oVar3 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var2);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i30) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i30) {
                                                                        case 0:
                                                                            e3 e3Var3 = e3Var2;
                                                                            e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var2;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var5 = e3Var2;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var6 = e3Var2;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var7 = e3Var2;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var2.f66426g;
                                                boolean z16 = e3Var2.f66445z;
                                                ?? ValueOf = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA2 = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var2.C;
                                                e23.a<Unit> aVar5 = e3Var2.f66431l;
                                                boolean zR2 = mVar3.r(e3Var2);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i314 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i314) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i315 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i315) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA2, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var2.f66425f;
                                                ?? ValueOf2 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var2.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var2.C;
                                                e23.a<Unit> aVar6 = e3Var2.f66430k;
                                                boolean zR3 = mVar4.r(e3Var2);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i316 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i316) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i317 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i317) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var2.f66428i;
                                                ?? ValueOf3 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var2.C;
                                                boolean z24 = e3Var2.E;
                                                e23.a<Unit> aVar7 = e3Var2.f66433n;
                                                boolean zR4 = mVar5.r(e3Var2);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i211) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i211) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar4 = e3Var2.f66420a;
                                                if ((fVar4 != null ? fVar4.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar4.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var2.b(fVar4 != null ? fVar4.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var2.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar8 = e3Var2.f66427h;
                                                ?? ValueOf4 = oVar8 != null ? Integer.valueOf(oVar8.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA3 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var2.C;
                                                e23.a<Unit> aVar10 = e3Var2.f66432m;
                                                boolean zR5 = mVar8.r(e3Var2);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i318 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i318) {
                                                                case 0:
                                                                    e3 e3Var3 = e3Var2;
                                                                    e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var4 = e3Var2;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var5 = e3Var2;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var6 = e3Var2;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var7 = e3Var2;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i319 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i319) {
                                                                    case 0:
                                                                        e3 e3Var3 = e3Var2;
                                                                        e3Var3.f66435p.invoke(e3Var3.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var4 = e3Var2;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var5 = e3Var2;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var6 = e3Var2;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var7 = e3Var2;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA3, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var2.b(e3Var2.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var2.f66441v, e3Var2.f66442w, e3Var2.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                        }
                        if (fVar3 != null && fVar3.f101052f) {
                            ew1.c.f66345a.getClass();
                            f0.b(f0Var, null, ew1.c.f66346b, 3);
                            List<xw1.h> list3 = fVar3.f101049c;
                            if (list3 != null) {
                                for (final xw1.h hVar2 : list3) {
                                    final int i30 = 1;
                                    final e3 e3Var2 = e3Var;
                                    f0.b(f0Var, null, new z3.e(-740974013, true, new q() { // from class: ew1.h0
                                        /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
                                        /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
                                        /* JADX WARN: Code duplicated, block: B:71:0x01de  */
                                        /* JADX WARN: Code duplicated, block: B:78:0x020b  */
                                        @Override // e23.q
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            Long coachId;
                                            Long coachId2;
                                            int i34 = i30;
                                            e23.a aVar2 = null;
                                            p3.m.a aVar3 = p3.m.f135153a;
                                            androidx.fragment.app.m mVar2 = mVar;
                                            final e3 e3Var3 = e3Var2;
                                            final xw1.h hVar3 = hVar2;
                                            String str4 = strA;
                                            final int i35 = 0;
                                            final int i36 = 1;
                                            switch (i34) {
                                                case 0:
                                                    p3.m mVar3 = (p3.m) obj5;
                                                    int iIntValue = ((Integer) obj6).intValue();
                                                    ((e2.d) obj4).getClass();
                                                    if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        p3.x1 x1Var = p3.n.f135158a;
                                                        xw1.o oVar3 = hVar3.f192397q;
                                                        jf.d dVarA = jf.s.a(tn.k.g(str4, oVar3 != null ? oVar3.getVideoThumbnailUrl() : null), null, mVar3, 0, 30);
                                                        xw1.o oVar4 = hVar3.f192397q;
                                                        Integer numValueOf = oVar4 != null ? Integer.valueOf(oVar4.getVideoDuration()) : null;
                                                        u4.d dVarA2 = e3Var3.f66420a.f101047a.a();
                                                        String strQ = gl1.y.Q(mVar3, R.string.lbl_run);
                                                        String coachFirstName = hVar3.getCoachFirstName();
                                                        String strP = gl1.y.P(R.string.coach_name, new Object[]{coachFirstName != null ? coachFirstName : ""}, mVar3);
                                                        fy1.i.a aVar4 = fy1.i.f73924a;
                                                        xw1.f coach = hVar3.getCoach();
                                                        int iLongValue = (coach == null || (coachId = coach.getCoachId()) == null) ? -1 : (int) coachId.longValue();
                                                        aVar4.getClass();
                                                        String strG = fy1.i.a.g(mVar2, iLongValue);
                                                        i53.f fVarA = i53.a.a(gl1.y.Q(mVar3, R.string.workouts_adapt_on_benchmark_runs), gl1.y.Q(mVar3, R.string.additional_coaching_information));
                                                        String strA2 = fy1.i.a.a(mVar2, hVar3.C(), hVar3.I(), null);
                                                        boolean zR = mVar3.r(e3Var3) | mVar3.r(hVar3);
                                                        Object objQ = mVar3.q();
                                                        if (zR) {
                                                            final int i37 = 3;
                                                            objQ = new e23.a() { // from class: ew1.e0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i37) {
                                                                        case 0:
                                                                            e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                            xw1.o oVar6 = hVar3.f192397q;
                                                                            oVar6.getClass();
                                                                            lVar.invoke(oVar6);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var3;
                                                                            e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                            break;
                                                                        case 2:
                                                                            e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                            xw1.o oVar7 = hVar3.f192397q;
                                                                            oVar7.getClass();
                                                                            lVar2.invoke(oVar7);
                                                                            break;
                                                                        default:
                                                                            e3Var3.f66436q.invoke(hVar3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar3.K(objQ);
                                                        } else {
                                                            aVar3.getClass();
                                                            if (objQ == p3.m.a.f135155b) {
                                                                final int i38 = 3;
                                                                objQ = new e23.a() { // from class: ew1.e0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i38) {
                                                                            case 0:
                                                                                e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                                xw1.o oVar6 = hVar3.f192397q;
                                                                                oVar6.getClass();
                                                                                lVar.invoke(oVar6);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var4 = e3Var3;
                                                                                e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                                break;
                                                                            case 2:
                                                                                e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                                xw1.o oVar7 = hVar3.f192397q;
                                                                                oVar7.getClass();
                                                                                lVar2.invoke(oVar7);
                                                                                break;
                                                                            default:
                                                                                e3Var3.f66436q.invoke(hVar3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar3.K(objQ);
                                                            }
                                                        }
                                                        e23.a aVar5 = (e23.a) objQ;
                                                        if (hVar3.f192397q != null) {
                                                            mVar3.C(-22533619);
                                                            boolean zR2 = mVar3.r(e3Var3) | mVar3.r(hVar3);
                                                            Object objQ2 = mVar3.q();
                                                            if (zR2) {
                                                                objQ2 = new e23.a() { // from class: ew1.e0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i35) {
                                                                            case 0:
                                                                                e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                                xw1.o oVar6 = hVar3.f192397q;
                                                                                oVar6.getClass();
                                                                                lVar.invoke(oVar6);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var4 = e3Var3;
                                                                                e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                                break;
                                                                            case 2:
                                                                                e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                                xw1.o oVar7 = hVar3.f192397q;
                                                                                oVar7.getClass();
                                                                                lVar2.invoke(oVar7);
                                                                                break;
                                                                            default:
                                                                                e3Var3.f66436q.invoke(hVar3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar3.K(objQ2);
                                                            } else {
                                                                aVar3.getClass();
                                                                if (objQ2 == p3.m.a.f135155b) {
                                                                    objQ2 = new e23.a() { // from class: ew1.e0
                                                                        @Override // e23.a
                                                                        public final Object invoke() {
                                                                            switch (i35) {
                                                                                case 0:
                                                                                    e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                                    xw1.o oVar6 = hVar3.f192397q;
                                                                                    oVar6.getClass();
                                                                                    lVar.invoke(oVar6);
                                                                                    break;
                                                                                case 1:
                                                                                    e3 e3Var4 = e3Var3;
                                                                                    e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                                    break;
                                                                                case 2:
                                                                                    e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                                    xw1.o oVar7 = hVar3.f192397q;
                                                                                    oVar7.getClass();
                                                                                    lVar2.invoke(oVar7);
                                                                                    break;
                                                                                default:
                                                                                    e3Var3.f66436q.invoke(hVar3);
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    mVar3.K(objQ2);
                                                                }
                                                            }
                                                            aVar2 = (e23.a) objQ2;
                                                            mVar3.f();
                                                        } else {
                                                            mVar3.C(-22435008);
                                                            mVar3.f();
                                                        }
                                                        cw1.c.c(null, null, dVarA, numValueOf, dVarA2, strQ, strP, strG, fVarA, null, null, null, strA2, false, false, aVar5, aVar2, mVar3, 0, 0, 121867);
                                                    } else {
                                                        mVar3.e();
                                                    }
                                                    break;
                                                default:
                                                    p3.m mVar4 = (p3.m) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    ((e2.d) obj4).getClass();
                                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        p3.x1 x1Var2 = p3.n.f135158a;
                                                        xw1.o oVar5 = hVar3.f192397q;
                                                        jf.d dVarA3 = jf.s.a(tn.k.g(str4, oVar5 != null ? oVar5.getVideoThumbnailUrl() : null), null, mVar4, 0, 30);
                                                        u4.d dVarA4 = e3Var3.f66421b.f101047a.a();
                                                        String strQ2 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                        String coachFirstName2 = hVar3.getCoachFirstName();
                                                        String strP2 = gl1.y.P(R.string.coach_name, new Object[]{coachFirstName2 != null ? coachFirstName2 : ""}, mVar4);
                                                        fy1.i.a aVar6 = fy1.i.f73924a;
                                                        xw1.f coach2 = hVar3.getCoach();
                                                        int iLongValue2 = (coach2 == null || (coachId2 = coach2.getCoachId()) == null) ? -1 : (int) coachId2.longValue();
                                                        aVar6.getClass();
                                                        String strG2 = fy1.i.a.g(mVar2, iLongValue2);
                                                        String strA3 = fy1.i.a.a(mVar2, androidx.core.view.j.d(hVar3.getMinWeeksPerPlan(), hVar3.getMaxWeeksPerPlan(), "-"), "3-5", null);
                                                        boolean zR3 = mVar4.r(e3Var3) | mVar4.r(hVar3);
                                                        Object objQ3 = mVar4.q();
                                                        if (zR3) {
                                                            objQ3 = new e23.a() { // from class: ew1.e0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i36) {
                                                                        case 0:
                                                                            e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                            xw1.o oVar6 = hVar3.f192397q;
                                                                            oVar6.getClass();
                                                                            lVar.invoke(oVar6);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var4 = e3Var3;
                                                                            e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                            break;
                                                                        case 2:
                                                                            e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                            xw1.o oVar7 = hVar3.f192397q;
                                                                            oVar7.getClass();
                                                                            lVar2.invoke(oVar7);
                                                                            break;
                                                                        default:
                                                                            e3Var3.f66436q.invoke(hVar3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar4.K(objQ3);
                                                        } else {
                                                            aVar3.getClass();
                                                            if (objQ3 == p3.m.a.f135155b) {
                                                                objQ3 = new e23.a() { // from class: ew1.e0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i36) {
                                                                            case 0:
                                                                                e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                                xw1.o oVar6 = hVar3.f192397q;
                                                                                oVar6.getClass();
                                                                                lVar.invoke(oVar6);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var4 = e3Var3;
                                                                                e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                                break;
                                                                            case 2:
                                                                                e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                                xw1.o oVar7 = hVar3.f192397q;
                                                                                oVar7.getClass();
                                                                                lVar2.invoke(oVar7);
                                                                                break;
                                                                            default:
                                                                                e3Var3.f66436q.invoke(hVar3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar4.K(objQ3);
                                                            }
                                                        }
                                                        e23.a aVar7 = (e23.a) objQ3;
                                                        if (hVar3.f192397q != null) {
                                                            mVar4.C(1776177528);
                                                            boolean zR4 = mVar4.r(e3Var3) | mVar4.r(hVar3);
                                                            Object objQ4 = mVar4.q();
                                                            if (zR4) {
                                                                final int i39 = 2;
                                                                objQ4 = new e23.a() { // from class: ew1.e0
                                                                    @Override // e23.a
                                                                    public final Object invoke() {
                                                                        switch (i39) {
                                                                            case 0:
                                                                                e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                                xw1.o oVar6 = hVar3.f192397q;
                                                                                oVar6.getClass();
                                                                                lVar.invoke(oVar6);
                                                                                break;
                                                                            case 1:
                                                                                e3 e3Var4 = e3Var3;
                                                                                e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                                break;
                                                                            case 2:
                                                                                e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                                xw1.o oVar7 = hVar3.f192397q;
                                                                                oVar7.getClass();
                                                                                lVar2.invoke(oVar7);
                                                                                break;
                                                                            default:
                                                                                e3Var3.f66436q.invoke(hVar3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar4.K(objQ4);
                                                            } else {
                                                                aVar3.getClass();
                                                                if (objQ4 == p3.m.a.f135155b) {
                                                                    final int i310 = 2;
                                                                    objQ4 = new e23.a() { // from class: ew1.e0
                                                                        @Override // e23.a
                                                                        public final Object invoke() {
                                                                            switch (i310) {
                                                                                case 0:
                                                                                    e23.l<xw1.o, Unit> lVar = e3Var3.f66435p;
                                                                                    xw1.o oVar6 = hVar3.f192397q;
                                                                                    oVar6.getClass();
                                                                                    lVar.invoke(oVar6);
                                                                                    break;
                                                                                case 1:
                                                                                    e3 e3Var4 = e3Var3;
                                                                                    e3Var4.f66439t.invoke(hVar3, e3Var4.f66421b.f101053g);
                                                                                    break;
                                                                                case 2:
                                                                                    e23.l<xw1.o, Unit> lVar2 = e3Var3.f66435p;
                                                                                    xw1.o oVar7 = hVar3.f192397q;
                                                                                    oVar7.getClass();
                                                                                    lVar2.invoke(oVar7);
                                                                                    break;
                                                                                default:
                                                                                    e3Var3.f66436q.invoke(hVar3);
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    mVar4.K(objQ4);
                                                                }
                                                            }
                                                            aVar2 = (e23.a) objQ4;
                                                            mVar4.f();
                                                        } else {
                                                            mVar4.C(1776284075);
                                                            mVar4.f();
                                                        }
                                                        cw1.c.c(null, null, dVarA3, null, dVarA4, strQ2, strP2, strG2, null, null, null, null, strA3, false, false, aVar7, aVar2, mVar4, 0, 0, 122395);
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3);
                                    e3Var = e3Var2;
                                }
                            }
                        }
                    } else if (i28 == 2) {
                        if (e3Var.f66423d) {
                            f0.b(f0Var, null, new z3.e(1763245348, true, new q() { // from class: ew1.g0
                                /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                                /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                                /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                                /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                    i53.c cVarB;
                                    i53.c cVarB2;
                                    String strQ;
                                    String strP;
                                    int i210 = i27;
                                    final int i211 = 4;
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    Object obj7 = null;
                                    final e3 e3Var3 = e3Var;
                                    final int i34 = 1;
                                    switch (i210) {
                                        case 0:
                                            xw1.o oVar3 = e3Var3.f66429j;
                                            p3.m mVar2 = (p3.m) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                p3.x1 x1Var = p3.n.f135158a;
                                                Integer numValueOf = oVar3 != null ? Integer.valueOf(oVar3.getVideoDuration()) : null;
                                                vt1.o oVar4 = vt1.o.f180180k;
                                                u4.d dVarA = oVar4.a();
                                                String strQ2 = gl1.y.Q(mVar2, oVar4.f180186c);
                                                c22.x0.f23314a.getClass();
                                                String strW = gl1.d.W(c22.x0.Mb);
                                                String strW2 = gl1.d.W(c22.x0.Nb);
                                                String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                                s62.a.f157643a.getClass();
                                                i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                                boolean z15 = e3Var3.F;
                                                e23.a<Unit> aVar3 = e3Var3.f66434o;
                                                if (oVar3 != null) {
                                                    mVar2.C(-1743304039);
                                                    boolean zR = mVar2.r(e3Var3);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i34) {
                                                                    case 0:
                                                                        e3 e3Var4 = e3Var3;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var5 = e3Var3;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var6 = e3Var3;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var7 = e3Var3;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var8 = e3Var3;
                                                                        e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar2.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e23.a() { // from class: ew1.f0
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i34) {
                                                                        case 0:
                                                                            e3 e3Var4 = e3Var3;
                                                                            e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                            break;
                                                                        case 1:
                                                                            e3 e3Var5 = e3Var3;
                                                                            e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                            break;
                                                                        case 2:
                                                                            e3 e3Var6 = e3Var3;
                                                                            e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                            break;
                                                                        case 3:
                                                                            e3 e3Var7 = e3Var3;
                                                                            e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                            break;
                                                                        default:
                                                                            e3 e3Var8 = e3Var3;
                                                                            e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    mVar2.f();
                                                    obj7 = (e23.a) objQ;
                                                } else {
                                                    mVar2.C(-1743204715);
                                                    mVar2.f();
                                                }
                                                cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        case 1:
                                            p3.m mVar3 = (p3.m) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                xw1.o oVar5 = e3Var3.f66426g;
                                                boolean z16 = e3Var3.f66445z;
                                                ?? ValueOf = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                                String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                                String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                                fy1.i.a aVar4 = fy1.i.f73924a;
                                                Context context = (Context) mVar3.A(y3Var);
                                                String str4 = z16 ? "3-7" : "5-7";
                                                aVar4.getClass();
                                                String strA2 = fy1.i.a.a(context, "6-52", str4, "6-13");
                                                if (z16) {
                                                    mVar3.C(-2033264162);
                                                    mVar3.f();
                                                    cVarB = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033266767);
                                                    cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                    mVar3.f();
                                                }
                                                i53.c cVar = cVarB;
                                                if (z16) {
                                                    mVar3.C(-2033258658);
                                                    mVar3.f();
                                                    cVarB2 = j53.l.b();
                                                } else {
                                                    mVar3.C(-2033260767);
                                                    cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                    mVar3.f();
                                                }
                                                i53.c cVar2 = cVarB2;
                                                i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                                boolean z17 = e3Var3.C;
                                                e23.a<Unit> aVar5 = e3Var3.f66431l;
                                                boolean zR2 = mVar3.r(e3Var3);
                                                Object objQ2 = mVar3.q();
                                                if (zR2) {
                                                    final int i315 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i315) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        final int i316 = 2;
                                                        objQ2 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i316) {
                                                                    case 0:
                                                                        e3 e3Var4 = e3Var3;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var5 = e3Var3;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var6 = e3Var3;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var7 = e3Var3;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var8 = e3Var3;
                                                                        e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ2);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA2, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                        case 2:
                                            p3.m mVar4 = (p3.m) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                xw1.o oVar6 = e3Var3.f66425f;
                                                ?? ValueOf2 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA3 = f3.a(t62.a.f162797a);
                                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                                String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                                String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                                y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                                String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var3.A ? "3-7" : "5-7");
                                                boolean z18 = e3Var3.C;
                                                e23.a<Unit> aVar6 = e3Var3.f66430k;
                                                boolean zR3 = mVar4.r(e3Var3);
                                                Object objQ3 = mVar4.q();
                                                if (zR3) {
                                                    final int i317 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i317) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        final int i318 = 3;
                                                        objQ3 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i318) {
                                                                    case 0:
                                                                        e3 e3Var4 = e3Var3;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var5 = e3Var3;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var6 = e3Var3;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var7 = e3Var3;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var8 = e3Var3;
                                                                        e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ3);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                            } else {
                                                mVar4.e();
                                            }
                                            break;
                                        case 3:
                                            p3.m mVar5 = (p3.m) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                xw1.o oVar7 = e3Var3.f66428i;
                                                ?? ValueOf3 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                                String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                                String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                                String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                                String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                                i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                                boolean z19 = e3Var3.C;
                                                boolean z24 = e3Var3.E;
                                                e23.a<Unit> aVar7 = e3Var3.f66433n;
                                                boolean zR4 = mVar5.r(e3Var3);
                                                Object objQ4 = mVar5.q();
                                                if (zR4) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i211) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i211) {
                                                                    case 0:
                                                                        e3 e3Var4 = e3Var3;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var5 = e3Var3;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var6 = e3Var3;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var7 = e3Var3;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var8 = e3Var3;
                                                                        e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar5.K(objQ4);
                                                    }
                                                }
                                                cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                            } else {
                                                mVar5.e();
                                            }
                                            break;
                                        case 4:
                                            p3.m mVar6 = (p3.m) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                jv1.f fVar4 = e3Var3.f66420a;
                                                if ((fVar4 != null ? fVar4.f101048b : null) != null) {
                                                    mVar6.C(-1833681348);
                                                    strQ = gl1.y.Q(mVar6, fVar4.f101048b.intValue());
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(-1833571019);
                                                    mVar6.f();
                                                    strQ = "";
                                                }
                                                if (e3Var3.b(fVar4 != null ? fVar4.f101047a : null)) {
                                                    strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                                } else if (strQ.length() == 0) {
                                                    strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                                } else {
                                                    mVar6.C(-1833180977);
                                                    strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                    mVar6.f();
                                                }
                                                String str5 = strP;
                                                h4.r.a aVar8 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var3.f66441v, e3Var3.f66442w, e3Var3.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                            } else {
                                                mVar6.e();
                                            }
                                            break;
                                        case 5:
                                            p3.m mVar7 = (p3.m) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                cw1.n1.a(null, false, e3Var3.f66438s, mVar7, 48, 1);
                                            } else {
                                                mVar7.e();
                                            }
                                            break;
                                        case 6:
                                            p3.m mVar8 = (p3.m) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                xw1.o oVar8 = e3Var3.f66427h;
                                                ?? ValueOf4 = oVar8 != null ? Integer.valueOf(oVar8.getVideoDuration()) : null;
                                                s62.a.f157643a.getClass();
                                                u4.d dVarA5 = c5.a(t62.a.f162797a);
                                                String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                                String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                                String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                                i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                                fy1.i.a aVar9 = fy1.i.f73924a;
                                                Context context2 = (Context) mVar8.A(y3Var4);
                                                aVar9.getClass();
                                                String strA3 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                                i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                                boolean z25 = e3Var3.C;
                                                e23.a<Unit> aVar10 = e3Var3.f66432m;
                                                boolean zR5 = mVar8.r(e3Var3);
                                                Object objQ5 = mVar8.q();
                                                if (zR5) {
                                                    final int i319 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i319) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        final int i3110 = false ? 1 : 0;
                                                        objQ5 = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i3110) {
                                                                    case 0:
                                                                        e3 e3Var4 = e3Var3;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var5 = e3Var3;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var6 = e3Var3;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var7 = e3Var3;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var8 = e3Var3;
                                                                        e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar8.K(objQ5);
                                                    }
                                                }
                                                cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA3, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                            } else {
                                                mVar8.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar9 = (p3.m) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((e2.d) obj4).getClass();
                                            if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                p3.x1 x1Var8 = p3.n.f135158a;
                                                String strH = e3Var3.b(e3Var3.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                                h4.r.a aVar11 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var3.f66441v, e3Var3.f66442w, e3Var3.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                            } else {
                                                mVar9.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                        }
                        if (fVar2 != null && (list2 = fVar2.f101050d) != null) {
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                f0.b(f0Var, null, new z3.e(772048015, true, new c0(i18, (tw1.c) it.next(), e3Var)), 3);
                            }
                        }
                    } else if (i28 == 3) {
                        f0.b(f0Var, null, new z3.e(1000486786, true, new q() { // from class: ew1.g0
                            /* JADX WARN: Code duplicated, block: B:105:0x03de  */
                            /* JADX WARN: Code duplicated, block: B:135:0x052a  */
                            /* JADX WARN: Code duplicated, block: B:155:0x0605  */
                            /* JADX WARN: Code duplicated, block: B:31:0x013e  */
                            /* JADX WARN: Code duplicated, block: B:84:0x0318  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
                            /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Integer] */
                            /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
                            /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
                            /* JADX WARN: Type inference failed for: r36v0, types: [e23.a] */
                            @Override // e23.q
                            public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                                i53.c cVarB;
                                i53.c cVarB2;
                                String strQ;
                                String strP;
                                int i210 = i19;
                                final int i211 = 4;
                                p3.m.a aVar2 = p3.m.f135153a;
                                Object obj7 = null;
                                final e3 e3Var3 = e3Var;
                                final int i34 = 1;
                                switch (i210) {
                                    case 0:
                                        xw1.o oVar3 = e3Var3.f66429j;
                                        p3.m mVar2 = (p3.m) obj5;
                                        int iIntValue = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            p3.x1 x1Var = p3.n.f135158a;
                                            Integer numValueOf = oVar3 != null ? Integer.valueOf(oVar3.getVideoDuration()) : null;
                                            vt1.o oVar4 = vt1.o.f180180k;
                                            u4.d dVarA = oVar4.a();
                                            String strQ2 = gl1.y.Q(mVar2, oVar4.f180186c);
                                            c22.x0.f23314a.getClass();
                                            String strW = gl1.d.W(c22.x0.Mb);
                                            String strW2 = gl1.d.W(c22.x0.Nb);
                                            String strB = fy1.i.a.b(fy1.i.f73924a, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), "4-12", "7");
                                            s62.a.f157643a.getClass();
                                            i53.f fVarA = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar2)}, mVar2)));
                                            boolean z15 = e3Var3.F;
                                            e23.a<Unit> aVar3 = e3Var3.f66434o;
                                            if (oVar3 != null) {
                                                mVar2.C(-1743304039);
                                                boolean zR = mVar2.r(e3Var3);
                                                Object objQ = mVar2.q();
                                                if (zR) {
                                                    objQ = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i34) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new e23.a() { // from class: ew1.f0
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i34) {
                                                                    case 0:
                                                                        e3 e3Var4 = e3Var3;
                                                                        e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                        break;
                                                                    case 1:
                                                                        e3 e3Var5 = e3Var3;
                                                                        e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                        break;
                                                                    case 2:
                                                                        e3 e3Var6 = e3Var3;
                                                                        e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                        break;
                                                                    case 3:
                                                                        e3 e3Var7 = e3Var3;
                                                                        e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                        break;
                                                                    default:
                                                                        e3 e3Var8 = e3Var3;
                                                                        e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                mVar2.f();
                                                obj7 = (e23.a) objQ;
                                            } else {
                                                mVar2.C(-1743204715);
                                                mVar2.f();
                                            }
                                            cw1.c.c(null, null, null, numValueOf, dVarA, strQ2, strW, strW2, null, null, null, fVarA, strB, false, z15, aVar3, obj7, mVar2, 48, 24576, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE);
                                        } else {
                                            mVar2.e();
                                        }
                                        break;
                                    case 1:
                                        p3.m mVar3 = (p3.m) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            p3.x1 x1Var2 = p3.n.f135158a;
                                            xw1.o oVar5 = e3Var3.f66426g;
                                            boolean z16 = e3Var3.f66445z;
                                            ?? ValueOf = oVar5 != null ? Integer.valueOf(oVar5.getVideoDuration()) : null;
                                            s62.a.f157643a.getClass();
                                            u4.d dVarA2 = u62.t.a(t62.a.f162797a);
                                            String strQ3 = gl1.y.Q(mVar3, R.string.lbl_bike);
                                            String strQ4 = gl1.y.Q(mVar3, R.string.garmin_cycling_coach);
                                            String strP2 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar3, R.string.lbl_cycling))}, mVar3);
                                            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                                            i53.f fVarB = i0.b(6, (Context) mVar3.A(y3Var));
                                            fy1.i.a aVar4 = fy1.i.f73924a;
                                            Context context = (Context) mVar3.A(y3Var);
                                            String str4 = z16 ? "3-7" : "5-7";
                                            aVar4.getClass();
                                            String strA2 = fy1.i.a.a(context, "6-52", str4, "6-13");
                                            if (z16) {
                                                mVar3.C(-2033264162);
                                                mVar3.f();
                                                cVarB = j53.l.b();
                                            } else {
                                                mVar3.C(-2033266767);
                                                cVarB = i53.a.a(gl1.y.Q(mVar3, R.string.power_meter_and_heart_rate_monitor));
                                                mVar3.f();
                                            }
                                            i53.c cVar = cVarB;
                                            if (z16) {
                                                mVar3.C(-2033258658);
                                                mVar3.f();
                                                cVarB2 = j53.l.b();
                                            } else {
                                                mVar3.C(-2033260767);
                                                cVarB2 = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_indoor_trainer));
                                                mVar3.f();
                                            }
                                            i53.c cVar2 = cVarB2;
                                            i53.f fVarA2 = i53.a.a(new jv1.k(p13.x.k(f72.d2.a(t62.c.f162799a), v7.a(t62.b.f162798a)), gl1.y.Q(mVar3, R.string.heart_rate_or_power_based)));
                                            boolean z17 = e3Var3.C;
                                            e23.a<Unit> aVar5 = e3Var3.f66431l;
                                            boolean zR2 = mVar3.r(e3Var3);
                                            Object objQ2 = mVar3.q();
                                            if (zR2) {
                                                final int i316 = 2;
                                                objQ2 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i316) {
                                                            case 0:
                                                                e3 e3Var4 = e3Var3;
                                                                e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var5 = e3Var3;
                                                                e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var6 = e3Var3;
                                                                e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var7 = e3Var3;
                                                                e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var8 = e3Var3;
                                                                e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ2);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ2 == p3.m.a.f135155b) {
                                                    final int i317 = 2;
                                                    objQ2 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i317) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ2);
                                                }
                                            }
                                            cw1.c.c(null, 2131232840, null, ValueOf, dVarA2, strQ3, strQ4, strP2, fVarB, cVar, cVar2, fVarA2, strA2, z17, false, aVar5, (e23.a) objQ2, mVar3, 0, 0, 98317);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 2:
                                        p3.m mVar4 = (p3.m) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            p3.x1 x1Var3 = p3.n.f135158a;
                                            xw1.o oVar6 = e3Var3.f66425f;
                                            ?? ValueOf2 = oVar6 != null ? Integer.valueOf(oVar6.getVideoDuration()) : null;
                                            s62.a.f157643a.getClass();
                                            u4.d dVarA3 = f3.a(t62.a.f162797a);
                                            String strQ5 = gl1.y.Q(mVar4, R.string.lbl_run);
                                            String strQ6 = gl1.y.Q(mVar4, R.string.garmin_run_coach);
                                            String strP3 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar4, R.string.lbl_running))}, mVar4);
                                            y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                                            i53.f fVarB2 = i0.b(2, (Context) mVar4.A(y3Var2));
                                            String strB2 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar4.A(y3Var2), "6-52", e3Var3.A ? "3-7" : "5-7");
                                            boolean z18 = e3Var3.C;
                                            e23.a<Unit> aVar6 = e3Var3.f66430k;
                                            boolean zR3 = mVar4.r(e3Var3);
                                            Object objQ3 = mVar4.q();
                                            if (zR3) {
                                                final int i318 = 3;
                                                objQ3 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i318) {
                                                            case 0:
                                                                e3 e3Var4 = e3Var3;
                                                                e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var5 = e3Var3;
                                                                e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var6 = e3Var3;
                                                                e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var7 = e3Var3;
                                                                e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var8 = e3Var3;
                                                                e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar4.K(objQ3);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ3 == p3.m.a.f135155b) {
                                                    final int i319 = 3;
                                                    objQ3 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i319) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ3);
                                                }
                                            }
                                            cw1.c.c(null, 2131232841, null, ValueOf2, dVarA3, strQ5, strQ6, strP3, fVarB2, null, null, null, strB2, z18, false, aVar6, (e23.a) objQ3, mVar4, 0, 0, 105485);
                                        } else {
                                            mVar4.e();
                                        }
                                        break;
                                    case 3:
                                        p3.m mVar5 = (p3.m) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            p3.x1 x1Var4 = p3.n.f135158a;
                                            xw1.o oVar7 = e3Var3.f66428i;
                                            ?? ValueOf3 = oVar7 != null ? Integer.valueOf(oVar7.getVideoDuration()) : null;
                                            s62.a.f157643a.getClass();
                                            u4.d dVarA4 = u62.a.a(t62.a.f162797a);
                                            String strQ7 = gl1.y.Q(mVar5, R.string.namespace_fitness);
                                            String strQ8 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach);
                                            String strQ9 = gl1.y.Q(mVar5, R.string.garmin_fitness_coach_description_short);
                                            y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                                            i53.f fVarB3 = i0.b(6, (Context) mVar5.A(y3Var3));
                                            String strB3 = fy1.i.a.b(fy1.i.f73924a, (Context) mVar5.A(y3Var3), "4-12", "5-7");
                                            i53.f fVarA3 = i53.a.a(new jv1.k(p13.w.c(v62.l1.a(t62.b.f162798a)), gl1.y.P(R.string.maximum_time_for_workout, new Object[]{gl1.y.P(R.string.common_mins_lbl, new Object[]{"60"}, mVar5)}, mVar5)));
                                            boolean z19 = e3Var3.C;
                                            boolean z24 = e3Var3.E;
                                            e23.a<Unit> aVar7 = e3Var3.f66433n;
                                            boolean zR4 = mVar5.r(e3Var3);
                                            Object objQ4 = mVar5.q();
                                            if (zR4) {
                                                objQ4 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i211) {
                                                            case 0:
                                                                e3 e3Var4 = e3Var3;
                                                                e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var5 = e3Var3;
                                                                e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var6 = e3Var3;
                                                                e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var7 = e3Var3;
                                                                e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var8 = e3Var3;
                                                                e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar5.K(objQ4);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ4 == p3.m.a.f135155b) {
                                                    objQ4 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i211) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ4);
                                                }
                                            }
                                            cw1.c.c(null, 2131232838, null, ValueOf3, dVarA4, strQ7, strQ8, strQ9, fVarB3, null, null, fVarA3, strB3, z19, z24, aVar7, (e23.a) objQ4, mVar5, 0, 0, 35853);
                                        } else {
                                            mVar5.e();
                                        }
                                        break;
                                    case 4:
                                        p3.m mVar6 = (p3.m) obj5;
                                        int iIntValue5 = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                            p3.x1 x1Var5 = p3.n.f135158a;
                                            jv1.f fVar4 = e3Var3.f66420a;
                                            if ((fVar4 != null ? fVar4.f101048b : null) != null) {
                                                mVar6.C(-1833681348);
                                                strQ = gl1.y.Q(mVar6, fVar4.f101048b.intValue());
                                                mVar6.f();
                                            } else {
                                                mVar6.C(-1833571019);
                                                mVar6.f();
                                                strQ = "";
                                            }
                                            if (e3Var3.b(fVar4 != null ? fVar4.f101047a : null)) {
                                                strP = sn.a.h(mVar6, -1833414779, R.string.recommended_plan_singular, mVar6);
                                            } else if (strQ.length() == 0) {
                                                strP = sn.a.h(mVar6, -1833285788, R.string.recommended_training_plans, mVar6);
                                            } else {
                                                mVar6.C(-1833180977);
                                                strP = gl1.y.P(R.string.specific_recommended_training_plans, new Object[]{strQ}, mVar6);
                                                mVar6.f();
                                            }
                                            String str5 = strP;
                                            h4.r.a aVar8 = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            g02.b2.a(c2.l.C(aVar8, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var3.f66441v, e3Var3.f66442w, e3Var3.f66443x, str5, null, null, null, null, mVar6, 0, 480);
                                        } else {
                                            mVar6.e();
                                        }
                                        break;
                                    case 5:
                                        p3.m mVar7 = (p3.m) obj5;
                                        int iIntValue6 = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                            p3.x1 x1Var6 = p3.n.f135158a;
                                            cw1.n1.a(null, false, e3Var3.f66438s, mVar7, 48, 1);
                                        } else {
                                            mVar7.e();
                                        }
                                        break;
                                    case 6:
                                        p3.m mVar8 = (p3.m) obj5;
                                        int iIntValue7 = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                            p3.x1 x1Var7 = p3.n.f135158a;
                                            xw1.o oVar8 = e3Var3.f66427h;
                                            ?? ValueOf4 = oVar8 != null ? Integer.valueOf(oVar8.getVideoDuration()) : null;
                                            s62.a.f157643a.getClass();
                                            u4.d dVarA5 = c5.a(t62.a.f162797a);
                                            String strQ10 = gl1.y.Q(mVar8, R.string.lbl_triathlon);
                                            String strQ11 = gl1.y.Q(mVar8, R.string.garmin_triathlon_coach);
                                            String strP4 = gl1.y.P(R.string.most_personalized_plan_for_training, new Object[]{g22.n.e(gl1.y.Q(mVar8, R.string.lbl_triathlon))}, mVar8);
                                            y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                                            i53.f fVarB4 = i0.b(4, (Context) mVar8.A(y3Var4));
                                            fy1.i.a aVar9 = fy1.i.f73924a;
                                            Context context2 = (Context) mVar8.A(y3Var4);
                                            aVar9.getClass();
                                            String strA3 = fy1.i.a.a(context2, "6-52", "6-7", "8-16");
                                            i53.f fVarA4 = i53.a.a(gl1.y.Q(mVar8, R.string.power_meter_or_indoor_trainer));
                                            boolean z25 = e3Var3.C;
                                            e23.a<Unit> aVar10 = e3Var3.f66432m;
                                            boolean zR5 = mVar8.r(e3Var3);
                                            Object objQ5 = mVar8.q();
                                            if (zR5) {
                                                final int i3110 = false ? 1 : 0;
                                                objQ5 = new e23.a() { // from class: ew1.f0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i3110) {
                                                            case 0:
                                                                e3 e3Var4 = e3Var3;
                                                                e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                break;
                                                            case 1:
                                                                e3 e3Var5 = e3Var3;
                                                                e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                break;
                                                            case 2:
                                                                e3 e3Var6 = e3Var3;
                                                                e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                break;
                                                            case 3:
                                                                e3 e3Var7 = e3Var3;
                                                                e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                break;
                                                            default:
                                                                e3 e3Var8 = e3Var3;
                                                                e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ5);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ5 == p3.m.a.f135155b) {
                                                    final int i3111 = false ? 1 : 0;
                                                    objQ5 = new e23.a() { // from class: ew1.f0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i3111) {
                                                                case 0:
                                                                    e3 e3Var4 = e3Var3;
                                                                    e3Var4.f66435p.invoke(e3Var4.f66427h);
                                                                    break;
                                                                case 1:
                                                                    e3 e3Var5 = e3Var3;
                                                                    e3Var5.f66435p.invoke(e3Var5.f66429j);
                                                                    break;
                                                                case 2:
                                                                    e3 e3Var6 = e3Var3;
                                                                    e3Var6.f66435p.invoke(e3Var6.f66426g);
                                                                    break;
                                                                case 3:
                                                                    e3 e3Var7 = e3Var3;
                                                                    e3Var7.f66435p.invoke(e3Var7.f66425f);
                                                                    break;
                                                                default:
                                                                    e3 e3Var8 = e3Var3;
                                                                    e3Var8.f66435p.invoke(e3Var8.f66428i);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar8.K(objQ5);
                                                }
                                            }
                                            cw1.c.c(null, 2131233522, null, ValueOf4, dVarA5, strQ10, strQ11, strP4, fVarB4, null, fVarA4, null, strA3, z25, false, aVar10, (e23.a) objQ5, mVar8, 0, 0, 103437);
                                        } else {
                                            mVar8.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar9 = (p3.m) obj5;
                                        int iIntValue8 = ((Integer) obj6).intValue();
                                        ((e2.d) obj4).getClass();
                                        if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                            p3.x1 x1Var8 = p3.n.f135158a;
                                            String strH = e3Var3.b(e3Var3.f66440u) ? sn.a.h(mVar9, -1665144586, R.string.recommended_plan_singular, mVar9) : sn.a.h(mVar9, -1665065195, R.string.recommended_training_plans, mVar9);
                                            h4.r.a aVar11 = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            g02.b2.a(c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), e3Var3.f66441v, e3Var3.f66442w, e3Var3.f66443x, strH, null, null, null, null, mVar9, 0, 480);
                                        } else {
                                            mVar9.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }), 3);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                ff2.i iVar = (ff2.i) obj3;
                e23.l lVar = (e23.l) obj2;
                List list4 = (List) obj;
                Logger loggerB = iVar.b();
                Context context = iVar.f71157a;
                loggerB.debug("Got " + (list4 != null ? Integer.valueOf(list4.size()) : "0") + " active campaigns");
                if (list4 == null || (aVar = (ff2.a) p13.h0.d0(list4)) == null) {
                    lVar.invoke(null);
                } else {
                    iVar.b().debug("Checking if images are downloaded: ");
                    hf2.a.C1650a c1650a = hf2.a.f83640a;
                    long campaignId = aVar.getCampaignId();
                    c1650a.getClass();
                    if (hf2.a.C1650a.a(context, campaignId)) {
                        iVar.b().debug("Images are downloaded, need to check validation? ");
                        if (z14) {
                            wr.g.v("Validating campaign ", aVar.getCampaignId(), ": ", iVar.b());
                            cf2.f fVar4 = cf2.f.f27037a;
                            long campaignId2 = aVar.getCampaignId();
                            e11.f0 f0Var2 = new e11.f0(iVar, i15, lVar, aVar);
                            fVar4.getClass();
                            cf2.k kVar = new cf2.k(context, campaignId2, null, f0Var2);
                            kVar.m().debug("checkValidity: ");
                            kVar.b(new cf2.i(kVar));
                            com.garmin.android.library.backgroundtaskmanagement.c.d(kVar, null);
                        } else {
                            wr.g.w("NOT checking validity, completing with campaign ", aVar.getCampaignId(), iVar.b());
                            lVar.invoke(aVar);
                        }
                    } else {
                        iVar.b().error("Images for campaign " + aVar.getCampaignId() + " are not downloaded");
                        lVar.invoke(null);
                    }
                }
                return Unit.INSTANCE;
            case 6:
                List<gc0.e> list5 = (List) obj3;
                gc0.l lVar2 = (gc0.l) obj2;
                ArrayList<gc0.e> arrayList = (ArrayList) obj;
                for (gc0.e eVar2 : arrayList) {
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it3 = list5.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                gc0.e eVar3 = (gc0.e) it3.next();
                                com.garmin.android.apps.connectmobile.devices.model.l lVar3 = eVar2.f76846b;
                                if (lVar3 != null && eVar3.f76845a.getUnitID() == lVar3.o()) {
                                }
                                break;
                            }
                        }
                    }
                    list5.add(eVar2);
                }
                for (gc0.e eVar4 : list5) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            com.garmin.android.apps.connectmobile.devices.model.l lVar4 = ((gc0.e) next).f76846b;
                            if (lVar4 == null || lVar4.o() != eVar4.f76845a.getUnitID()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    gc0.e eVar5 = (gc0.e) next;
                    if (eVar5 != null) {
                        eVar4.f76846b = eVar5.f76846b;
                    }
                }
                int i34 = gc0.l.f76879m;
                lVar2.getClass();
                ge1.b.T(v1.a(lVar2), null, null, new gc0.q(lVar2, list5, z14, null), 3);
                return Unit.INSTANCE;
            case 7:
                final j0 j0Var = (j0) obj3;
                final b0 b0Var = (b0) obj2;
                k0 k0Var2 = (k0) obj;
                if (z14) {
                    e23.a aVar2 = new e23.a() { // from class: h2.r
                        @Override // e23.a
                        public final Object invoke() {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            switch (i26) {
                                case 0:
                                    j0 j0Var2 = j0Var;
                                    if (j0Var2.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var2, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    j0 j0Var3 = j0Var;
                                    if (j0Var3.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var3, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    j0 j0Var4 = j0Var;
                                    if (j0Var4.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var4, null), 3);
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    j0 j0Var5 = j0Var;
                                    if (j0Var5.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var5, null), 3);
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    return Boolean.valueOf(z18);
                            }
                        }
                    };
                    k23.l<Object>[] lVarArr = h0.f136016a;
                    p.f136057a.getClass();
                    k0Var2.a(p.f136082z, new p5.a(null, aVar2));
                    k0Var2.a(p.B, new p5.a(null, new e23.a() { // from class: h2.r
                        @Override // e23.a
                        public final Object invoke() {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            switch (i27) {
                                case 0:
                                    j0 j0Var2 = j0Var;
                                    if (j0Var2.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var2, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    j0 j0Var3 = j0Var;
                                    if (j0Var3.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var3, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    j0 j0Var4 = j0Var;
                                    if (j0Var4.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var4, null), 3);
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    j0 j0Var5 = j0Var;
                                    if (j0Var5.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var5, null), 3);
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    return Boolean.valueOf(z18);
                            }
                        }
                    }));
                } else {
                    e23.a aVar3 = new e23.a() { // from class: h2.r
                        @Override // e23.a
                        public final Object invoke() {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            switch (i24) {
                                case 0:
                                    j0 j0Var2 = j0Var;
                                    if (j0Var2.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var2, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    j0 j0Var3 = j0Var;
                                    if (j0Var3.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var3, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    j0 j0Var4 = j0Var;
                                    if (j0Var4.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var4, null), 3);
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    j0 j0Var5 = j0Var;
                                    if (j0Var5.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var5, null), 3);
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    return Boolean.valueOf(z18);
                            }
                        }
                    };
                    k23.l<Object>[] lVarArr2 = h0.f136016a;
                    p.f136057a.getClass();
                    k0Var2.a(p.A, new p5.a(null, aVar3));
                    k0Var2.a(p.C, new p5.a(null, new e23.a() { // from class: h2.r
                        @Override // e23.a
                        public final Object invoke() {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            switch (i25) {
                                case 0:
                                    j0 j0Var2 = j0Var;
                                    if (j0Var2.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var2, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    j0 j0Var3 = j0Var;
                                    if (j0Var3.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var3, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    j0 j0Var4 = j0Var;
                                    if (j0Var4.e()) {
                                        ge1.b.T(b0Var, null, null, new s(j0Var4, null), 3);
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    j0 j0Var5 = j0Var;
                                    if (j0Var5.c()) {
                                        ge1.b.T(b0Var, null, null, new t(j0Var5, null), 3);
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    return Boolean.valueOf(z18);
                            }
                        }
                    }));
                }
                return Unit.INSTANCE;
            case 8:
                CustomLineChart customLineChart = (CustomLineChart) obj3;
                CustomBarChart customBarChart = (CustomBarChart) obj2;
                ((Context) obj).getClass();
                return z14 ? customLineChart : customBarChart;
            case 9:
                zw1.g gVar = (zw1.g) obj;
                gVar.getClass();
                a0.n(gVar.f207267a, (List) obj3, (List) obj2, gVar.f207269c, gVar.f207270d, gVar.f207271e, gVar.f207268b);
                gVar.setSecondaryMuscleLegendVisibility(z14);
                return Unit.INSTANCE;
            case 10:
                ((f5.v1.a) obj).r((f5.v1) obj2, 0, 0, ((Number) ((x3) obj3).getF182175a()).floatValue() + (z14 ? 5.0f : 0.0f));
                return Unit.INSTANCE;
            case 11:
                String str4 = (String) obj3;
                wd wdVar = (wd) obj2;
                k0 k0Var3 = (k0) obj;
                if (z14) {
                    p5.i.f136017b.getClass();
                    h0.s(k0Var3, 0);
                }
                h0.c(k0Var3, null, new zd(wdVar, 0));
                h0.t(k0Var3, str4);
                return Unit.INSTANCE;
            case 12:
                CreateCourseActivity createCourseActivity = (CreateCourseActivity) obj3;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) obj2;
                com.garmin.android.apps.connectmobile.courses.model.g gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CreateCourseActivity.a aVar4 = CreateCourseActivity.f32989g;
                gVar3.getClass();
                z zVarEa = createCourseActivity.ea();
                zVarEa.getClass();
                zVarEa.z4(new n30.c.z(gVar2));
                createCourseActivity.ea().x4();
                createCourseActivity.fa(new n30.a.c(gVar2, gVar3, !z14));
                return Unit.INSTANCE;
            case 13:
                String str5 = (String) obj3;
                mg2.f fVar5 = (mg2.f) obj2;
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                if (z14) {
                    p5.i.f136017b.getClass();
                    h0.s(k0Var4, 0);
                }
                h0.c(k0Var4, null, new v0(fVar5, 29));
                h0.t(k0Var4, str5);
                return Unit.INSTANCE;
            case 14:
                final v vVar = (v) obj3;
                final List list6 = (List) obj2;
                androidx.lifecycle.k0 k0Var5 = new androidx.lifecycle.k0() { // from class: nc.g
                    @Override // androidx.lifecycle.k0
                    public final void onStateChanged(n0 n0Var, androidx.lifecycle.b0.a aVar5) {
                        boolean z15 = z14;
                        List list7 = list6;
                        lc.v vVar2 = vVar;
                        if (z15 && !list7.contains(vVar2)) {
                            list7.add(vVar2);
                        }
                        if (aVar5 == androidx.lifecycle.b0.a.ON_START && !list7.contains(vVar2)) {
                            list7.add(vVar2);
                        }
                        if (aVar5 == androidx.lifecycle.b0.a.ON_STOP) {
                            list7.remove(vVar2);
                        }
                    }
                };
                vVar.f111888h.f144302j.a(k0Var5);
                return new nc.j.c(vVar, k0Var5);
            case 15:
                GearRoute.q qVar = (GearRoute.q) obj3;
                m0 m0Var = (m0) obj2;
                String str6 = (String) obj;
                GearActivity.a aVar5 = GearActivity.f35500b;
                str6.getClass();
                String string2 = w.i0(str6).toString();
                if (string2.length() <= 0) {
                    string2 = null;
                }
                String str7 = qVar.f35678c;
                if (str7 != null && (string = w.i0(str7).toString()) != null && string.length() > 0) {
                    eVar = string;
                }
                String str8 = string2 == null ? eVar : string2;
                if (z14) {
                    pk0.f fVar6 = new pk0.f(qVar.f35677b, str8, false, true, 4, null);
                    k23.d dVarB = s0.f105811a.b(GearRoute.p.class);
                    boolean z15 = y.f111902i;
                    boolean zO = m0Var.o(dVarB, true);
                    qc.h hVar3 = m0Var.f111904b;
                    if (zO) {
                        v vVarI = hVar3.i();
                        if (vVarI != null && (j1VarA2 = vVarI.a()) != null) {
                            j1VarA2.f(fVar6, "BrandModelSelectionResult");
                        }
                    } else {
                        m0Var.n();
                        v vVarI2 = hVar3.i();
                        if (vVarI2 != null && (j1VarA = vVarI2.a()) != null) {
                            j1VarA.f(fVar6, "BrandModelSelectionResult");
                        }
                    }
                } else {
                    m0Var.h(new t(15), new GearRoute.c(qVar.f35676a, qVar.f35677b, str8, false, true, 8, (p005kotlin.jvm.internal.j) null));
                }
                return Unit.INSTANCE;
            case 16:
                s sVar = (s) obj3;
                y0<w61.f<Unit>> y0Var = sVar.N0;
                tj1.e eVar6 = (tj1.e) obj2;
                v2 v2Var = (v2) obj;
                int i35 = s.f137969j1;
                if (v2Var instanceof v2.b) {
                    c22.g.f23056a.getClass();
                    c22.g.a("assistancePlusUpdateSuccess");
                    a2 a2Var = a2.SAFETY_FEATURES;
                    String strH = am.j.h(((v2.b) v2Var).f47387b, "save(), successful response: ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "SafetyFeaturesViewModel", strH);
                    y0<g3<tj1.e>> y0VarC4 = sVar.C4();
                    g3.f35298f.getClass();
                    y0VarC4.j(g3.a.d(eVar6));
                    if (z14) {
                        y0Var.j(new w61.f<>(Unit.INSTANCE));
                    }
                } else if (v2Var != null) {
                    c22.g.f23056a.getClass();
                    c22.g.a("assistancePlusUpdateFailure");
                    if (eVar6 != null ? p005kotlin.jvm.internal.s.g(eVar6.getAssistancePlusEnabled(), Boolean.TRUE) : false) {
                        sVar.f137903e.i(false);
                    }
                    int i36 = sVar.f137978i1;
                    if (i36 == 1) {
                        a2 a2Var2 = a2.SAFETY_FEATURES;
                        String strF = e0.f(i36, "save() failed, saveCallCounter: ", ", leaving safety features.");
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "SafetyFeaturesViewModel", strF);
                        sVar.C4().j(g3.a.a(g3.f35298f, null, null, eVar6, null, 11));
                        if (z14) {
                            y0Var.j(new w61.f<>(Unit.INSTANCE));
                        }
                    } else {
                        a2 a2Var3 = a2.SAFETY_FEATURES;
                        String strF2 = e0.f(i36, "save() failed, saveCallCounter: ", ", waiting 1 more try before kicking out user");
                        i2.f36769a.getClass();
                        i2.a.f(a2Var3, "SafetyFeaturesViewModel", strF2);
                        sVar.C4().j(g3.a.a(g3.f35298f, null, null, eVar6, null, 11));
                        sVar.f137978i1++;
                    }
                } else {
                    a2 a2Var4 = a2.SAFETY_FEATURES;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var4, "SafetyFeaturesViewModel", "save(), argument is null, why?");
                    y0<g3<tj1.e>> y0VarC5 = sVar.C4();
                    g3.a aVar6 = g3.f35298f;
                    g3<tj1.e> g3VarD = sVar.C4().d();
                    y0VarC5.j(g3.a.a(aVar6, null, null, g3VarD != null ? g3VarD.f35301b : null, null, 11));
                    if (z14) {
                        y0Var.j(new w61.f<>(Unit.INSTANCE));
                    }
                }
                return Unit.INSTANCE;
            case 17:
                ITPDashboardActivity iTPDashboardActivity = (ITPDashboardActivity) obj3;
                fg0.k kVar2 = (fg0.k) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ITPDashboardActivity.a aVar7 = ITPDashboardActivity.f45618m;
                pw1.d dVarOa = iTPDashboardActivity.oa();
                pw1.a aVar8 = new pw1.a(iTPDashboardActivity, i24);
                kVar2.getClass();
                dVarOa.a5().m(g3.a.c(g3.f35298f));
                ge1.b.T(v1.a(dVarOa), null, null, new pw1.e(dVarOa, zBooleanValue, this.f2732b, kVar2, aVar8, null), 3);
                return Unit.INSTANCE;
            case 18:
                zc.d dVar = (zc.d) obj3;
                p1 p1Var = (p1) obj2;
                f0 f0Var3 = (f0) obj;
                f0Var3.getClass();
                if (!z14) {
                    f0.f(f0Var3, dVar.b(), null, new z3.e(994722205, true, new r22.h(dVar, i26)), 6);
                } else if (((com.garmin.android.apps.connectmobile.badges.service.model.r) p1Var.getF182175a()) != com.garmin.android.apps.connectmobile.badges.service.model.r.ALL) {
                    r22.w.f149908a.getClass();
                    f0.b(f0Var3, null, r22.w.f149910c, 3);
                } else {
                    f0.b(f0Var3, null, new z3.e(2608815, true, new r22.g(dVar, i26)), 3);
                }
                return Unit.INSTANCE;
            case 19:
                CoursePointListActivity coursePointListActivity = (CoursePointListActivity) obj3;
                com.garmin.android.apps.connectmobile.courses.model.g gVar4 = (com.garmin.android.apps.connectmobile.courses.model.g) obj2;
                com.garmin.android.apps.connectmobile.courses.model.g gVar5 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CoursePointListActivity.a aVar9 = CoursePointListActivity.f33079c;
                gVar5.getClass();
                if (z14) {
                    r50.g gVarDa = coursePointListActivity.da();
                    gVarDa.getClass();
                    gVarDa.y4(new t50.c.m(gVar4));
                    coursePointListActivity.da().z4();
                    coursePointListActivity.ea(new t50.b.a(gVar5));
                } else {
                    androidx.fragment.app.v supportFragmentManager = coursePointListActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    c60.e.c(supportFragmentManager);
                    coursePointListActivity.ea(new t50.b.e(gVar4, gVar5));
                }
                return Unit.INSTANCE;
            case 20:
                e23.a aVar10 = (e23.a) obj3;
                lc.k0 k0Var6 = (lc.k0) obj;
                k0Var6.getClass();
                n.b(k0Var6, "MAIN_SCREEN_HELP", null, null, null, null, null, null, new z3.e(-872157555, true, new ca0.a(aVar10, (m0) obj2)), 254);
                n.b(k0Var6, "DIAGNOSTIC_REPORT", null, null, null, null, null, null, new z3.e(231225526, true, new a3(z14, aVar10)), 254);
                n.b(k0Var6, "PRODUCT_SUPPORT", null, null, null, null, null, null, new z3.e(-453004779, true, new ca0.r(aVar10, i19)), 254);
                return Unit.INSTANCE;
            case 21:
                rs.h hVar4 = (rs.h) obj3;
                ie2.h hVar5 = (ie2.h) obj2;
                ((com.garmin.android.library.mapsdkadapter.i) obj).getClass();
                hVar4.f154318b.setMapType(4);
                GCMMapView gCMMapView = hVar4.f154318b;
                ie2.t tVar = new ie2.t();
                tVar.f93176a = hVar5;
                gCMMapView.getMapProxy().F(tVar);
                if (z14) {
                    com.garmin.android.library.mapsdkadapter.i.a.e(gCMMapView.getMapProxy(), false, false, 24);
                } else {
                    com.garmin.android.library.mapsdkadapter.e eVarA = rs.h.a(hVar4, null, null, hVar5, 1);
                    if (eVarA != null) {
                        gCMMapView.getMapProxy().v(eVarA, -1);
                    }
                }
                return Unit.INSTANCE;
            case 22:
                e23.a aVar11 = (e23.a) obj3;
                e23.a aVar12 = (e23.a) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "EXIT")) {
                    if (z14) {
                        aVar12.invoke();
                    } else {
                        aVar11.invoke();
                    }
                }
                return Unit.INSTANCE;
            case 23:
                e23.l lVar5 = (e23.l) obj2;
                f0 f0Var4 = (f0) obj;
                f0Var4.getClass();
                Iterator<E> it5 = ((i53.c) obj3).iterator();
                while (it5.hasNext()) {
                    f0.b(f0Var4, null, new z3.e(1854669961, true, new p9((l90.k) it5.next(), lVar5, z14, i15)), 3);
                }
                return Unit.INSTANCE;
            case 24:
                RecyclerView recyclerView = (RecyclerView) obj3;
                u40.j jVar = (u40.j) obj2;
                int iIntValue = ((Integer) obj).intValue();
                u40.j.a aVar13 = u40.j.f168573h;
                if (z14) {
                    recyclerView.post(new androidx.camera.camera2.internal.compat.j(jVar, recyclerView, iIntValue, 11));
                }
                return Unit.INSTANCE;
            case 25:
                oe0.d dVar2 = (oe0.d) obj3;
                p1 p1Var2 = (p1) obj2;
                t0.a aVar14 = (t0.a) obj;
                aVar14.getClass();
                if (aVar14 == t0.a.ON_FOCUS_LOST) {
                    l3.a aVar15 = l3.f23124b;
                    Double dF = d53.s.f((String) p1Var2.getF182175a());
                    double dDoubleValue = dF != null ? dF.doubleValue() : 0.0d;
                    aVar15.getClass();
                    double dR1 = l3.a.R1(dDoubleValue, z14);
                    p2 p2Var = dVar2.f131261f;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, pe0.c.a((pe0.c) value, null, null, null, null, null, dR1, null, null, false, null, 991)));
                }
                return Unit.INSTANCE;
            case 26:
                final AllDogsActivity allDogsActivity = (AllDogsActivity) obj3;
                final e23.a aVar16 = (e23.a) obj2;
                lc.k0 k0Var7 = (lc.k0) obj;
                AllDogsActivity.a aVar17 = AllDogsActivity.f34686g;
                k0Var7.getClass();
                z3.e eVar7 = new z3.e(1617304498, true, new bk0.h(allDogsActivity, z14, aVar16, i27));
                p13.k0 k0Var8 = p13.k0.f134949a;
                k0Var8.getClass();
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
                n.a(k0Var7, t0Var.b(xd0.a.f.class), k0Var8, j0Var2, null, null, null, null, eVar7);
                n.a(k0Var7, t0Var.b(xd0.a.e.class), k0Var8, j0Var2, null, null, null, null, new z3.e(-825757015, true, new e23.r() { // from class: vd0.w
                    /* JADX WARN: Code duplicated, block: B:13:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:18:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0111  */
                    /* JADX WARN: Code duplicated, block: B:28:0x0133  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0154  */
                    /* JADX WARN: Code duplicated, block: B:38:0x016f  */
                    /* JADX WARN: Code duplicated, block: B:43:0x018b  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01a8  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0204  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0069  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i26;
                        p3.m.a aVar18 = p3.m.f135153a;
                        e23.a aVar19 = aVar16;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar20 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                zc.d dVarA = zc.g.a(((oe0.f) allDogsActivity2.f34691e.getValue()).f131275a, mVar2);
                                boolean zB = mVar2.B(aVar19);
                                Object objQ = mVar2.q();
                                if (zB) {
                                    objQ = new ux1.g(aVar19, 10);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ux1.g(aVar19, 10);
                                        mVar2.K(objQ);
                                    }
                                }
                                p.e(dVarA, (e23.a) objQ, mVar2, 8);
                                break;
                            default:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar21 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                long j8 = ((xd0.a.h) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.h.class))).f189998b;
                                Boolean bool = (Boolean) s9.c.c(allDogsActivity2.ea().f131293j, mVar3).getF182175a();
                                boolean zBooleanValue2 = bool.booleanValue();
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar3.r(allDogsActivity2) | mVar3.l(j8);
                                Object objQ2 = mVar3.q();
                                int i38 = 0;
                                if (zR) {
                                    objQ2 = new t(allDogsActivity2, j8, i38);
                                    mVar3.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new t(allDogsActivity2, j8, i38);
                                        mVar3.K(objQ2);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ2, mVar3, 0);
                                boolean zH = mVar3.h(zBooleanValue2) | mVar3.r(allDogsActivity2) | mVar3.B(aVar19);
                                Object objQ3 = mVar3.q();
                                if (zH) {
                                    objQ3 = new AllDogsActivity.b(zBooleanValue2, allDogsActivity2, aVar19, null);
                                    mVar3.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new AllDogsActivity.b(zBooleanValue2, allDogsActivity2, aVar19, null);
                                        mVar3.K(objQ3);
                                    }
                                }
                                p3.l0.e((e23.p) objQ3, bool, mVar3);
                                pe0.f fVar7 = (pe0.f) s9.c.c(allDogsActivity2.ea().f131289f, mVar3).getF182175a();
                                boolean zBooleanValue3 = ((Boolean) s9.c.c(allDogsActivity2.ea().f131291h, mVar3).getF182175a()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) s9.c.c(allDogsActivity2.ea().f131295l, mVar3).getF182175a()).booleanValue();
                                zc.d dVarA2 = zc.g.a(allDogsActivity2.ea().f131296m, mVar3);
                                oe0.j jVarEa = allDogsActivity2.ea();
                                boolean zR2 = mVar3.r(jVarEa);
                                Object objQ4 = mVar3.q();
                                if (zR2) {
                                    objQ4 = new AllDogsActivity.c(jVarEa);
                                    mVar3.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new AllDogsActivity.c(jVarEa);
                                        mVar3.K(objQ4);
                                    }
                                }
                                k23.g gVar6 = (k23.g) objQ4;
                                boolean zB2 = mVar3.B(aVar19);
                                Object objQ5 = mVar3.q();
                                if (zB2) {
                                    objQ5 = new ux1.g(aVar19, 9);
                                    mVar3.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new ux1.g(aVar19, 9);
                                        mVar3.K(objQ5);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ5;
                                boolean zR3 = mVar3.r(allDogsActivity2) | mVar3.l(j8);
                                Object objQ6 = mVar3.q();
                                if (zR3) {
                                    objQ6 = new u(allDogsActivity2, j8, 0);
                                    mVar3.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 0);
                                        mVar3.K(objQ6);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ6;
                                boolean zR4 = mVar3.r(allDogsActivity2) | mVar3.l(j8);
                                Object objQ7 = mVar3.q();
                                int i39 = 1;
                                if (zR4) {
                                    objQ7 = new u(allDogsActivity2, j8, 1);
                                    mVar3.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new u(allDogsActivity2, j8, 1);
                                        mVar3.K(objQ7);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ7;
                                boolean zR5 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR5) {
                                    objQ8 = new v(allDogsActivity2, 0);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 0);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar25 = (e23.a) objQ8;
                                boolean zR6 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR6) {
                                    objQ9 = new v(allDogsActivity2, i39);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, i39);
                                        mVar3.K(objQ9);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ9;
                                e23.l lVar6 = (e23.l) gVar6;
                                boolean zR7 = mVar3.r(allDogsActivity2);
                                Object objQ10 = mVar3.q();
                                if (zR7) {
                                    objQ10 = new v(allDogsActivity2, 2);
                                    mVar3.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new v(allDogsActivity2, 2);
                                        mVar3.K(objQ10);
                                    }
                                }
                                b1.a(fVar7, zBooleanValue3, zBooleanValue4, aVar22, aVar23, aVar24, aVar25, aVar26, dVarA2, lVar6, (e23.a) objQ10, mVar3, 134217728);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.h.class), k0Var8, j0Var2, null, null, null, null, new z3.e(218030954, true, new e23.r() { // from class: vd0.w
                    /* JADX WARN: Code duplicated, block: B:13:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:18:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0111  */
                    /* JADX WARN: Code duplicated, block: B:28:0x0133  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0154  */
                    /* JADX WARN: Code duplicated, block: B:38:0x016f  */
                    /* JADX WARN: Code duplicated, block: B:43:0x018b  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01a8  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0204  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0069  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i27;
                        p3.m.a aVar18 = p3.m.f135153a;
                        e23.a aVar19 = aVar16;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar20 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                zc.d dVarA = zc.g.a(((oe0.f) allDogsActivity2.f34691e.getValue()).f131275a, mVar2);
                                boolean zB = mVar2.B(aVar19);
                                Object objQ = mVar2.q();
                                if (zB) {
                                    objQ = new ux1.g(aVar19, 10);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ux1.g(aVar19, 10);
                                        mVar2.K(objQ);
                                    }
                                }
                                p.e(dVarA, (e23.a) objQ, mVar2, 8);
                                break;
                            default:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar21 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                long j8 = ((xd0.a.h) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.h.class))).f189998b;
                                Boolean bool = (Boolean) s9.c.c(allDogsActivity2.ea().f131293j, mVar3).getF182175a();
                                boolean zBooleanValue2 = bool.booleanValue();
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar3.r(allDogsActivity2) | mVar3.l(j8);
                                Object objQ2 = mVar3.q();
                                int i38 = 0;
                                if (zR) {
                                    objQ2 = new t(allDogsActivity2, j8, i38);
                                    mVar3.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new t(allDogsActivity2, j8, i38);
                                        mVar3.K(objQ2);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ2, mVar3, 0);
                                boolean zH = mVar3.h(zBooleanValue2) | mVar3.r(allDogsActivity2) | mVar3.B(aVar19);
                                Object objQ3 = mVar3.q();
                                if (zH) {
                                    objQ3 = new AllDogsActivity.b(zBooleanValue2, allDogsActivity2, aVar19, null);
                                    mVar3.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new AllDogsActivity.b(zBooleanValue2, allDogsActivity2, aVar19, null);
                                        mVar3.K(objQ3);
                                    }
                                }
                                p3.l0.e((e23.p) objQ3, bool, mVar3);
                                pe0.f fVar7 = (pe0.f) s9.c.c(allDogsActivity2.ea().f131289f, mVar3).getF182175a();
                                boolean zBooleanValue3 = ((Boolean) s9.c.c(allDogsActivity2.ea().f131291h, mVar3).getF182175a()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) s9.c.c(allDogsActivity2.ea().f131295l, mVar3).getF182175a()).booleanValue();
                                zc.d dVarA2 = zc.g.a(allDogsActivity2.ea().f131296m, mVar3);
                                oe0.j jVarEa = allDogsActivity2.ea();
                                boolean zR2 = mVar3.r(jVarEa);
                                Object objQ4 = mVar3.q();
                                if (zR2) {
                                    objQ4 = new AllDogsActivity.c(jVarEa);
                                    mVar3.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new AllDogsActivity.c(jVarEa);
                                        mVar3.K(objQ4);
                                    }
                                }
                                k23.g gVar6 = (k23.g) objQ4;
                                boolean zB2 = mVar3.B(aVar19);
                                Object objQ5 = mVar3.q();
                                if (zB2) {
                                    objQ5 = new ux1.g(aVar19, 9);
                                    mVar3.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new ux1.g(aVar19, 9);
                                        mVar3.K(objQ5);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ5;
                                boolean zR3 = mVar3.r(allDogsActivity2) | mVar3.l(j8);
                                Object objQ6 = mVar3.q();
                                if (zR3) {
                                    objQ6 = new u(allDogsActivity2, j8, 0);
                                    mVar3.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 0);
                                        mVar3.K(objQ6);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ6;
                                boolean zR4 = mVar3.r(allDogsActivity2) | mVar3.l(j8);
                                Object objQ7 = mVar3.q();
                                int i39 = 1;
                                if (zR4) {
                                    objQ7 = new u(allDogsActivity2, j8, 1);
                                    mVar3.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new u(allDogsActivity2, j8, 1);
                                        mVar3.K(objQ7);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ7;
                                boolean zR5 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR5) {
                                    objQ8 = new v(allDogsActivity2, 0);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 0);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar25 = (e23.a) objQ8;
                                boolean zR6 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR6) {
                                    objQ9 = new v(allDogsActivity2, i39);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, i39);
                                        mVar3.K(objQ9);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ9;
                                e23.l lVar6 = (e23.l) gVar6;
                                boolean zR7 = mVar3.r(allDogsActivity2);
                                Object objQ10 = mVar3.q();
                                if (zR7) {
                                    objQ10 = new v(allDogsActivity2, 2);
                                    mVar3.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new v(allDogsActivity2, 2);
                                        mVar3.K(objQ10);
                                    }
                                }
                                b1.a(fVar7, zBooleanValue3, zBooleanValue4, aVar22, aVar23, aVar24, aVar25, aVar26, dVarA2, lVar6, (e23.a) objQ10, mVar3, 134217728);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.C3539a.class), k0Var8, j0Var2, null, null, null, null, new z3.e(1261818923, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i19;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.b.class), k0Var8, j0Var2, null, null, null, null, new z3.e(-1989360404, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i18;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.i.class), k0Var8, j0Var2, null, null, null, null, new z3.e(-945572435, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i26;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.j.class), k0Var8, j0Var2, null, null, null, null, new z3.e(98215534, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i27;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.c.class), k0Var8, j0Var2, null, null, null, null, new z3.e(1142003503, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i24;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.d.class), k0Var8, j0Var2, null, null, null, null, new z3.e(-2109175824, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i25;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.k.class), k0Var8, j0Var2, null, null, null, null, new z3.e(-1065387855, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i17;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var7, t0Var.b(xd0.a.l.class), k0Var8, j0Var2, null, null, null, null, new z3.e(-1257488769, true, new e23.r() { // from class: vd0.r
                    /* JADX WARN: Code duplicated, block: B:102:0x03de  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03fc  */
                    /* JADX WARN: Code duplicated, block: B:112:0x041a  */
                    /* JADX WARN: Code duplicated, block: B:117:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:122:0x045a  */
                    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
                    /* JADX WARN: Code duplicated, block: B:66:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02d1  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0325  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i37 = i16;
                        int i38 = 1;
                        int i39 = 8;
                        p3.m.a aVar18 = p3.m.f135153a;
                        AllDogsActivity allDogsActivity2 = allDogsActivity;
                        switch (i37) {
                            case 0:
                                lc.v vVar2 = (lc.v) obj5;
                                p3.m mVar2 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar19 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar2.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                long j8 = ((xd0.a.i) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.i.class))).f190000b;
                                Long lValueOf = Long.valueOf(j8);
                                boolean zR = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new t(allDogsActivity2, j8, i38);
                                    mVar2.K(objQ);
                                } else {
                                    aVar18.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new t(allDogsActivity2, j8, i38);
                                        mVar2.K(objQ);
                                    }
                                }
                                s9.e.b(lValueOf, null, (e23.l) objQ, mVar2, 0);
                                oe0.s sVarFa = allDogsActivity2.fa();
                                boolean zR2 = mVar2.r(allDogsActivity2);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new v(allDogsActivity2, i39);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar18.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new v(allDogsActivity2, i39);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(allDogsActivity2);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new v(allDogsActivity2, 9);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar18.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new v(allDogsActivity2, 9);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ3;
                                boolean zR4 = mVar2.r(allDogsActivity2);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new v(allDogsActivity2, 10);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar18.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new v(allDogsActivity2, 10);
                                        mVar2.K(objQ4);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ4;
                                boolean zR5 = mVar2.r(allDogsActivity2);
                                Object objQ5 = mVar2.q();
                                if (zR5) {
                                    objQ5 = new v(allDogsActivity2, 11);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar18.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new v(allDogsActivity2, 11);
                                        mVar2.K(objQ5);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ5;
                                boolean zR6 = mVar2.r(allDogsActivity2) | mVar2.l(j8);
                                Object objQ6 = mVar2.q();
                                if (zR6) {
                                    objQ6 = new u(allDogsActivity2, j8, 2);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar18.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new u(allDogsActivity2, j8, 2);
                                        mVar2.K(objQ6);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ6;
                                boolean zR7 = mVar2.r(allDogsActivity2);
                                Object objQ7 = mVar2.q();
                                if (zR7) {
                                    objQ7 = new v(allDogsActivity2, 12);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar18.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new v(allDogsActivity2, 12);
                                        mVar2.K(objQ7);
                                    }
                                }
                                n1.a(sVarFa, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ7, mVar2, 8);
                                break;
                            case 1:
                                lc.v vVar3 = (lc.v) obj5;
                                p3.m mVar3 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar25 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                vVar3.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                xd0.a.j jVar2 = (xd0.a.j) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(xd0.a.j.class));
                                oe0.s sVarFa2 = allDogsActivity2.fa();
                                long j14 = jVar2.f190002b;
                                boolean zR8 = mVar3.r(allDogsActivity2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new v(allDogsActivity2, 15);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar18.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new v(allDogsActivity2, 15);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar26 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(allDogsActivity2);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    objQ9 = new v(allDogsActivity2, 16);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar18.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new v(allDogsActivity2, 16);
                                        mVar3.K(objQ9);
                                    }
                                }
                                o1.a(sVarFa2, j14, aVar26, (e23.a) objQ9, mVar3, 8);
                                break;
                            case 2:
                                p3.m mVar4 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar27 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                i53.c cVar = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar4, 0).getF182175a();
                                pe0.c cVar2 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar4, 0).getF182175a();
                                pe0.d dVar3 = cVar2.f137407b;
                                i53.c<pe0.d> cVar3 = cVar2.f137408c;
                                boolean zR10 = mVar4.r(allDogsActivity2);
                                Object objQ10 = mVar4.q();
                                if (zR10) {
                                    objQ10 = new s(allDogsActivity2, 0);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar18.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new s(allDogsActivity2, 0);
                                        mVar4.K(objQ10);
                                    }
                                }
                                x1.a(0, (e23.l) objQ10, cVar, cVar3, mVar4, dVar3);
                                break;
                            case 3:
                                p3.m mVar5 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar28 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                i53.c cVar4 = (i53.c) p3.p0.c(allDogsActivity2.da().f131264i, mVar5, 0).getF182175a();
                                pe0.c cVar5 = (pe0.c) p3.p0.c(allDogsActivity2.da().f131262g, mVar5, 0).getF182175a();
                                i53.c<pe0.d> cVar6 = cVar5.f137408c;
                                pe0.d dVar4 = cVar5.f137407b;
                                boolean zR11 = mVar5.r(allDogsActivity2);
                                Object objQ11 = mVar5.q();
                                if (zR11) {
                                    objQ11 = new s(allDogsActivity2, 3);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar18.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new s(allDogsActivity2, 3);
                                        mVar5.K(objQ11);
                                    }
                                }
                                f2.a(0, (e23.l) objQ11, cVar4, cVar6, mVar5, dVar4);
                                break;
                            case 4:
                                p3.m mVar6 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar29 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                i53.c cVar7 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar6, 0).getF182175a();
                                pe0.j jVar3 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar6, 0).getF182175a();
                                pe0.d dVar5 = jVar3.f137452b;
                                i53.c<pe0.d> cVar8 = jVar3.f137453c;
                                boolean zR12 = mVar6.r(allDogsActivity2);
                                Object objQ12 = mVar6.q();
                                if (zR12) {
                                    objQ12 = new s(allDogsActivity2, 1);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar18.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new s(allDogsActivity2, 1);
                                        mVar6.K(objQ12);
                                    }
                                }
                                x1.a(0, (e23.l) objQ12, cVar7, cVar8, mVar6, dVar5);
                                break;
                            case 5:
                                p3.m mVar7 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar30 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                i53.c cVar9 = (i53.c) p3.p0.c(allDogsActivity2.fa().f131415k, mVar7, 0).getF182175a();
                                pe0.j jVar4 = (pe0.j) p3.p0.c(allDogsActivity2.fa().f131413i, mVar7, 0).getF182175a();
                                i53.c<pe0.d> cVar10 = jVar4.f137453c;
                                pe0.d dVar6 = jVar4.f137452b;
                                boolean zR13 = mVar7.r(allDogsActivity2);
                                Object objQ13 = mVar7.q();
                                if (zR13) {
                                    objQ13 = new s(allDogsActivity2, 4);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar18.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new s(allDogsActivity2, 4);
                                        mVar7.K(objQ13);
                                    }
                                }
                                f2.a(0, (e23.l) objQ13, cVar9, cVar10, mVar7, dVar6);
                                break;
                            case 6:
                                p3.m mVar8 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar31 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                oe0.d dVarDa = allDogsActivity2.da();
                                boolean zR14 = mVar8.r(allDogsActivity2);
                                Object objQ14 = mVar8.q();
                                if (zR14) {
                                    objQ14 = new v(allDogsActivity2, 17);
                                    mVar8.K(objQ14);
                                } else {
                                    aVar18.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new v(allDogsActivity2, 17);
                                        mVar8.K(objQ14);
                                    }
                                }
                                e23.a aVar32 = (e23.a) objQ14;
                                boolean zR15 = mVar8.r(allDogsActivity2);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new v(allDogsActivity2, 18);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar18.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new v(allDogsActivity2, 18);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.a aVar33 = (e23.a) objQ15;
                                boolean zR16 = mVar8.r(allDogsActivity2);
                                Object objQ16 = mVar8.q();
                                if (zR16) {
                                    objQ16 = new v(allDogsActivity2, 19);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar18.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new v(allDogsActivity2, 19);
                                        mVar8.K(objQ16);
                                    }
                                }
                                e23.a aVar34 = (e23.a) objQ16;
                                boolean zR17 = mVar8.r(allDogsActivity2);
                                Object objQ17 = mVar8.q();
                                if (zR17) {
                                    objQ17 = new v(allDogsActivity2, 20);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar18.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new v(allDogsActivity2, 20);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar35 = (e23.a) objQ17;
                                boolean zR18 = mVar8.r(allDogsActivity2);
                                Object objQ18 = mVar8.q();
                                if (zR18) {
                                    objQ18 = new v(allDogsActivity2, 21);
                                    mVar8.K(objQ18);
                                } else {
                                    aVar18.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new v(allDogsActivity2, 21);
                                        mVar8.K(objQ18);
                                    }
                                }
                                e23.a aVar36 = (e23.a) objQ18;
                                boolean zR19 = mVar8.r(allDogsActivity2);
                                Object objQ19 = mVar8.q();
                                if (zR19) {
                                    objQ19 = new v(allDogsActivity2, 22);
                                    mVar8.K(objQ19);
                                } else {
                                    aVar18.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new v(allDogsActivity2, 22);
                                        mVar8.K(objQ19);
                                    }
                                }
                                l.a(dVarDa, aVar32, aVar33, aVar34, aVar35, aVar36, (e23.a) objQ19, mVar8, 8);
                                break;
                            default:
                                p3.m mVar9 = (p3.m) obj6;
                                ((Integer) obj7).getClass();
                                AllDogsActivity.a aVar37 = AllDogsActivity.f34686g;
                                ((r1.l) obj4).getClass();
                                ((lc.v) obj5).getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                oe0.d dVarDa2 = allDogsActivity2.da();
                                boolean zR20 = mVar9.r(allDogsActivity2);
                                Object objQ20 = mVar9.q();
                                if (zR20) {
                                    objQ20 = new v(allDogsActivity2, 13);
                                    mVar9.K(objQ20);
                                } else {
                                    aVar18.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new v(allDogsActivity2, 13);
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar38 = (e23.a) objQ20;
                                boolean zR21 = mVar9.r(allDogsActivity2);
                                Object objQ21 = mVar9.q();
                                if (zR21) {
                                    objQ21 = new v(allDogsActivity2, 14);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar18.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new v(allDogsActivity2, 14);
                                        mVar9.K(objQ21);
                                    }
                                }
                                m.a(dVarDa2, aVar38, (e23.a) objQ21, mVar9, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                HelpActivity.f36653a.getClass();
                lc.b bVar = new lc.b((lc.a) k0Var7.f111792h.b(lc.a.class), t0Var.b(xd0.a.m.class), u0.h(p13.t0.b(HelpActivity.a.c()), k0Var8));
                bVar.f111721i = t0Var.b(HelpActivity.class);
                k0Var7.f111797m.add(bVar.a());
                return Unit.INSTANCE;
            case 27:
                oe0.s sVar2 = (oe0.s) obj3;
                p1 p1Var3 = (p1) obj2;
                t0.a aVar18 = (t0.a) obj;
                aVar18.getClass();
                if (aVar18 == t0.a.ON_FOCUS_LOST) {
                    l3.a aVar19 = l3.f23124b;
                    Double dF2 = d53.s.f((String) p1Var3.getF182175a());
                    double dDoubleValue2 = dF2 != null ? dF2.doubleValue() : 0.0d;
                    aVar19.getClass();
                    double dR2 = l3.a.R1(dDoubleValue2, z14);
                    p2 p2Var2 = sVar2.f131412h;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, pe0.j.a((pe0.j) value2, null, null, null, null, null, dR2, null, null, false, null, null, 2015)));
                }
                return Unit.INSTANCE;
            case 28:
                vn2.m mVar2 = (vn2.m) obj3;
                int[] iArr = (int[]) obj;
                Logger logger2 = vn2.m.f178912c;
                vn2.y0 view2 = mVar2.getView();
                mVar2.f0().getDeviceUnitId();
                iArr.getClass();
                view2.b7(iArr, (pn2.t) obj2, z14);
                return Unit.INSTANCE;
            default:
                FBTDashBoardActivity fBTDashBoardActivity = (FBTDashBoardActivity) obj3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                FBTDashBoardActivity.a aVar20 = FBTDashBoardActivity.f45458n;
                fBTDashBoardActivity.ma().j5(new vd1.c(23));
                vu1.o oVarMa = fBTDashBoardActivity.ma();
                ge1.b.T(v1.a(oVarMa), null, null, new vu1.r(oVarMa, zBooleanValue2, this.f2732b, (fg0.k) obj2, new vu1.j(fBTDashBoardActivity, i26), null), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, boolean z14, Object obj2, int i14) {
        this.f2731a = i14;
        this.f2733c = obj;
        this.f2732b = z14;
        this.f2734d = obj2;
    }

    public /* synthetic */ f(Object obj, Object obj2, boolean z14, int i14) {
        this.f2731a = i14;
        this.f2733c = obj;
        this.f2734d = obj2;
        this.f2732b = z14;
    }

    public /* synthetic */ f(boolean z14, Object obj, Object obj2, int i14) {
        this.f2731a = i14;
        this.f2732b = z14;
        this.f2733c = obj;
        this.f2734d = obj2;
    }
}
