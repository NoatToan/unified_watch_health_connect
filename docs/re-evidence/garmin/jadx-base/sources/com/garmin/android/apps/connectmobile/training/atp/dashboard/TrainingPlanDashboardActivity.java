package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import am.a2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.training.atp.create.edit.ATPEditActivity;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.f;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.j;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.k;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.atp.schedule.WorkoutScheduleActivity;
import cu1.c0;
import fy1.i;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p92.o;
import q92.x;
import ro0.l;
import rt1.r;
import xw1.n;
import zt1.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/TrainingPlanDashboardActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/d$b;", "Lzt1/c;", "Lyt1/d;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingPlanDashboardActivity extends r0 implements com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b, zt1.c, yt1.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f45383n = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f45384e = new w1(s0.f105811a.b(wt1.d.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.training.atp.dashboard.d f45385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f45386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wt1.b f45387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f45389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f45390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f45392m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45393a;

        public b(g gVar) {
            this.f45393a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45393a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45394a;

        public c(g gVar) {
            this.f45394a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45394a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45396b;

        public d(e23.a aVar, g gVar) {
            this.f45395a = aVar;
            this.f45396b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45395a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45396b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // zt1.c
    public final void A1() {
        EditTabBarActivity.f45351e.getClass();
        EditTabBarActivity.f45352f = "GARMIN_COACH";
        startActivityForResult(new Intent(this, (Class<?>) EditTabBarActivity.class), 103);
    }

    @Override // zt1.d
    public final void A3(xw1.c cVar) {
    }

    @Override // zt1.d
    public final void B8(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        g1.b(this, cVar);
    }

    @Override // zt1.d
    public final String C0(int i14) {
        String string = getString(i14);
        string.getClass();
        return string;
    }

    @Override // zt1.c
    public final void C5(String str, String str2) {
        str.getClass();
        q1.b bVar = q1.f41066b;
        c0 c0Var = new c0(this, 2);
        bVar.getClass();
        q1 q1VarC = q1.b.c(str, str2, R.string.common_confirm, R.string.device_action_cancel, c0Var);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // zt1.d
    public final void D7(xw1.c cVar, xw1.h hVar) {
        cVar.getClass();
        k.f45307l.getClass();
        k kVar = new k();
        Bundle bundleU6 = com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1);
        a2.b(bundleU6, "COACH_PLAN_EXTRA", hVar);
        kVar.setArguments(bundleU6);
        ma(kVar);
    }

    @Override // zt1.c
    public final boolean E7() {
        View view2;
        wt1.b bVar = this.f45387h;
        return (bVar == null || (view2 = bVar.f187026a) == null || view2.getVisibility() != 0) ? false : true;
    }

    @Override // zt1.c
    public final void F4() {
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b bVar;
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f45385f;
        if (dVar != null) {
            cu1.b bVar2 = dVar.f45421i;
            if (bVar2 == null) {
                s.m("presenter");
                throw null;
            }
            xw1.d dVarB = bVar2.b();
            if (dVarB == null || (bVar = dVar.f45422j) == null) {
                return;
            }
            cu1.b bVar3 = dVar.f45421i;
            if (bVar3 != null) {
                bVar.P1(dVarB, bVar3.d(), dVar.w6().f187048o, dVar.w6().f187049p);
            } else {
                s.m("presenter");
                throw null;
            }
        }
    }

    @Override // zt1.d
    public final void F8(xw1.c cVar) {
        cVar.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.e.f45264m.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.e eVar = new com.garmin.android.apps.connectmobile.training.atp.create.steps.e();
        eVar.setArguments(com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1));
        ma(eVar);
    }

    @Override // zt1.d
    public final void G1() {
        showProgressOverlay();
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f45385f;
        if (dVar != null) {
            dVar.z6(false);
        }
    }

    @Override // zt1.d
    public final void G4() {
        showProgressOverlay(getString(R.string.lbl_recalculating_atp_plan));
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f45385f;
        if (dVar != null) {
            dVar.z6(false);
        }
    }

    @Override // zt1.d
    public final void G7(e23.a<Unit> aVar) {
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void H() {
        Bundle extras;
        Intent intent = getIntent();
        Long lValueOf = (intent == null || (extras = intent.getExtras()) == null) ? null : Long.valueOf(extras.getLong("EXTRA_ATHLETE_PLAN_ID"));
        if (lValueOf != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("GCM_tp_removed_plan_id", lValueOf.longValue());
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // zt1.d
    public final void I6(xw1.c cVar, boolean z14) {
        cVar.getClass();
        j.f45297p.getClass();
        j jVar = new j();
        Bundle bundleU6 = com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1);
        bundleU6.putBoolean("EXTRAS_PERSONAL_GOAL_CHANGED", z14);
        jVar.setArguments(bundleU6);
        ma(jVar);
    }

    @Override // zt1.c
    public final void J0() {
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f45385f;
        if (dVar != null) {
            getSupportFragmentManager().a0(0, "TrainingPlanDashboardFragment");
            cu1.b bVar = dVar.f45421i;
            if (bVar != null) {
                bVar.c(-1);
            } else {
                s.m("presenter");
                throw null;
            }
        }
    }

    @Override // zt1.c
    public final void J6(String str, String str2) {
        str.getClass();
        q1.b bVar = q1.f41066b;
        c0 c0Var = new c0(this, 1);
        bVar.getClass();
        q1 q1VarC = q1.b.c(str, str2, R.string.common_confirm, R.string.device_action_cancel, c0Var);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void K(fu1.h hVar) {
        String str = hVar.f73517a;
        if (str != null) {
            ArticleContentActivity.f45338g.getClass();
            Intent intent = new Intent(this, (Class<?>) ArticleContentActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("ARTICLE_ID_EXTRA", str);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void L(int i14, Bundle bundle) {
        ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).t(this, i14, bundle);
    }

    @Override // zt1.d
    public final void L0(final int i14) {
        if (i14 != 0 && i14 != 3) {
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "TrainingPlanDashboardA", "Unknown error type");
            return;
        }
        wt1.b bVar = this.f45387h;
        if (bVar != null) {
            final int i15 = 0;
            bVar.c(new e23.a(this) { // from class: cu1.b0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TrainingPlanDashboardActivity f55654b;

                {
                    this.f55654b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            zt1.h hVar = this.f55654b.f45386g;
                            if (hVar != null) {
                                hVar.y(i14);
                                return Unit.INSTANCE;
                            }
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        default:
                            zt1.h hVar2 = this.f55654b.f45386g;
                            if (hVar2 == null) {
                                p005kotlin.jvm.internal.s.m("presenter");
                                throw null;
                            }
                            int i16 = i14;
                            if (i16 == 0 || i16 == 3) {
                                hVar2.f206997q.S4(i16);
                            }
                            return Unit.INSTANCE;
                    }
                }
            });
        }
        wt1.b bVar2 = this.f45387h;
        if (bVar2 != null) {
            final int i16 = 1;
            bVar2.d(new e23.a(this) { // from class: cu1.b0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TrainingPlanDashboardActivity f55654b;

                {
                    this.f55654b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            zt1.h hVar = this.f55654b.f45386g;
                            if (hVar != null) {
                                hVar.y(i14);
                                return Unit.INSTANCE;
                            }
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        default:
                            zt1.h hVar2 = this.f55654b.f45386g;
                            if (hVar2 == null) {
                                p005kotlin.jvm.internal.s.m("presenter");
                                throw null;
                            }
                            int i17 = i14;
                            if (i17 == 0 || i17 == 3) {
                                hVar2.f206997q.S4(i17);
                            }
                            return Unit.INSTANCE;
                    }
                }
            });
        }
        wt1.b bVar3 = this.f45387h;
        if (bVar3 != null) {
            bVar3.g();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final Unit N(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        g1.b(this, cVar);
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void P1(xw1.d dVar, String str, fg0.k kVar, n nVar) {
        ATPEditActivity.f45202g.getClass();
        Intent intent = new Intent(this, (Class<?>) ATPEditActivity.class);
        Bundle bundle = new Bundle();
        a2.b(bundle, "training_plan", new xw1.c(dVar));
        bundle.putLong("athlete_plan_id", dVar.getAthletePlanId());
        bundle.putString("GCM_tp_plan_name", str);
        a2.b(bundle, "GCM_extra_sharable_event_dto", kVar);
        a2.b(bundle, "extra_ti_race_dto", nVar);
        intent.putExtras(bundle);
        startActivityForResult(intent, 102);
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void Q(xw1.d dVar) {
        WorkoutScheduleActivity.f45445f.getClass();
        Intent intent = new Intent(this, (Class<?>) WorkoutScheduleActivity.class);
        intent.putExtra("ATHLETE_PLAN_EXTRA", dVar);
        startActivityForResult(intent, 101);
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void Q2(Integer num) {
        com.garmin.android.apps.connectmobile.training.atp.dashboard.c.f45406k.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_CONFIDENCE_SCORE", num != null ? num.intValue() : 0);
        HelpActivity.a.e(HelpActivity.f36653a, this, l.TRAINING_ACTIVITY, null, bundle, 4);
    }

    @Override // zt1.d
    public final void S4(int i14) {
        if (i14 == -1 || i14 == 0 || i14 == 3) {
            wt1.b bVar = this.f45387h;
            if (bVar != null) {
                bVar.e();
                return;
            }
            return;
        }
        i2.a aVar = i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TrainingPlanDashboardA", "Unknown error type");
    }

    @Override // zt1.d
    public final void S6(xw1.c cVar) {
        cVar.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void U() {
        i.f73924a.getClass();
        i.a.s(500L);
        o oVar = o.f136619a;
        x xVar = x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
        oVar.getClass();
        q92.v vVarN = o.n(xVar);
        if (s3.b() && vVarN != null && !vVarN.b()) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_CLOSE_COACH_SCREEN", true);
            setResult(-1, intent);
            finish();
            return;
        }
        if (this.f45388i) {
            J0();
            return;
        }
        if (getCallingActivity() != null) {
            setResult(-1);
        }
        finish();
    }

    @Override // zt1.d
    public final void X3(xw1.c cVar, xw1.h hVar, List<xw1.h> list) {
        cVar.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.c.f45254m.getClass();
        ma(com.garmin.android.apps.connectmobile.training.atp.create.steps.c.a.a(cVar, hVar, list));
    }

    @Override // zt1.c
    public final void Y8() {
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f45385f;
        if (dVar != null) {
            dVar.v6();
        }
    }

    @Override // yt1.d
    public final yt1.c a9() {
        h hVar = this.f45386g;
        if (hVar != null) {
            return hVar;
        }
        s.m("presenter");
        throw null;
    }

    @Override // zt1.c
    public final void b5() {
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f45385f;
        if (dVar != null) {
            dVar.v6();
        }
        ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).b1(false);
    }

    @Override // zt1.d
    public final void e0(xw1.c cVar, DateTime dateTime, DateTime dateTime2) {
        cVar.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return this.f45390k;
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void g5(xw1.d dVar) {
        fu1.s reaction;
        Long actionId;
        if (dVar != null) {
            xw1.c cVar = new xw1.c(dVar);
            long athletePlanId = dVar.getAthletePlanId();
            w1 w1Var = this.f45384e;
            ((wt1.d) w1Var.getValue()).f187045l = cVar;
            if (s.g(this.f45389j, Boolean.TRUE)) {
                cVar.h0(((wt1.d) w1Var.getValue()).f187049p);
                F4();
                this.f45389j = null;
            }
            h hVar = this.f45386g;
            if (hVar == null) {
                s.m("presenter");
                throw null;
            }
            hVar.f206969b = athletePlanId;
            hVar.f206970c = cVar;
            hVar.f206972e.e(xw1.c.b(cVar, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431));
            hVar.m();
            fu1.i iVar = hVar.f206998r;
            if (iVar == null || (reaction = iVar.getReaction()) == null || (actionId = reaction.getActionId()) == null || actionId.longValue() != 7 || hVar.f206970c.getLongRunDay() == null) {
                return;
            }
            hVar.f206997q.G1();
            hVar.f206973f.add(Long.valueOf(hVar.f206974g.e(iVar, hVar.f207003w)));
        }
    }

    @Override // zt1.d
    public final void i2() {
    }

    @Override // zt1.d
    public final void j2() {
    }

    @Override // cu1.g
    public final void j5(long j8, xw1.j jVar) {
        if (!jVar.q()) {
            h hVar = this.f45386g;
            if (hVar != null) {
                hVar.B(Long.valueOf(j8), jVar);
                return;
            } else {
                s.m("presenter");
                throw null;
            }
        }
        q1.b bVar = q1.f41066b;
        String string = getString(R.string.msg_pause_plan);
        string.getClass();
        String string2 = getString(R.string.msg_pause_plan_info);
        string2.getClass();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.a aVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(this, j8, jVar, 3);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.common_confirm, R.string.device_action_cancel, aVar);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void l() {
        ResumeReasonActivity.f45376g.getClass();
        startActivityForResult(new Intent(this, (Class<?>) ResumeReasonActivity.class), 100);
    }

    @Override // zt1.d
    public final void l9(xw1.c cVar, boolean z14) {
        cVar.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void m(long j8, boolean z14, boolean z15) {
        ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).r(this, j8, z14, z15, 101);
    }

    public final void ma(Fragment fragment) {
        hideProgressOverlay();
        if (isFinishing()) {
            return;
        }
        String strB5 = fragment instanceof com.garmin.android.apps.connectmobile.training.atp.create.steps.b ? ((com.garmin.android.apps.connectmobile.training.atp.create.steps.b) fragment).b5() : "";
        if (fragment instanceof com.garmin.android.apps.connectmobile.training.atp.dashboard.d) {
            strB5 = "TrainingPlanDashboardFragment";
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.content);
        if (fragmentF != null) {
            aVarB.v(fragmentF);
        }
        aVarB.o(R.anim.anim_enter_from_right, R.anim.anim_exit_to_left, R.anim.anim_enter_from_left, R.anim.anim_exit_to_right);
        aVarB.j(R.id.content, fragment, strB5, 1);
        aVarB.d(strB5);
        aVarB.s(true, true);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar;
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (i15 == -1) {
            if (i14 != 150) {
                switch (i14) {
                    case 100:
                        String string = extras != null ? extras.getString("REASON_EXTRA") : null;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar2 = this.f45385f;
                        if (dVar2 != null) {
                            if (string == null) {
                                string = "OTHER";
                            }
                            cu1.b bVar = dVar2.f45421i;
                            if (bVar == null) {
                                s.m("presenter");
                                throw null;
                            }
                            bVar.g(string);
                        }
                        break;
                    case 101:
                    case 102:
                        this.f45391l = i14 == 102;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar3 = this.f45385f;
                        if (dVar3 != null) {
                            cu1.b bVar2 = dVar3.f45421i;
                            if (bVar2 == null) {
                                s.m("presenter");
                                throw null;
                            }
                            bVar2.c(-1);
                        }
                        break;
                    case 103:
                        b5();
                        break;
                }
            } else {
                n nVarG4 = ((wt1.d) this.f45384e.getValue()).G4(intent);
                if (nVarG4 != null && (dVar = this.f45385f) != null) {
                    dVar.f45430r = null;
                    cu1.b bVar3 = dVar.f45421i;
                    if (bVar3 == null) {
                        s.m("presenter");
                        throw null;
                    }
                    xw1.d dVarB = bVar3.b();
                    if (dVarB != null) {
                        wt1.d dVarW6 = dVar.w6();
                        Context contextRequireContext = dVar.requireContext();
                        contextRequireContext.getClass();
                        ge1.b.T(v1.a(dVarW6), null, null, new wt1.k(dVarW6, nVarG4, contextRequireContext, dVar.f45420h, dVarB, null), 3);
                    }
                }
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        int iM = getSupportFragmentManager().M();
        if (iM == 0 || iM == 1) {
            if (this.f45391l && getCallingActivity() != null) {
                setResult(-1);
            }
            finish();
            return;
        }
        super.onBackPressed();
        h hVar = this.f45386g;
        if (hVar == null) {
            s.m("presenter");
            throw null;
        }
        zt1.c cVar = hVar.f206997q;
        if (cVar.E7()) {
            cVar.S4(-1);
        }
        h hVar2 = this.f45386g;
        if (hVar2 != null) {
            hVar2.f206972e.c();
        } else {
            s.m("presenter");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_plan_overview_layout);
        initActionBar(true);
        rt1.l.f154545a.getClass();
        i2.a aVar = i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TrainingDashboardAnalytics", "Initialize training dashboard logging session");
        rt1.l.f154546b.clear();
        Bundle extras = getIntent().getExtras();
        Long lValueOf = extras != null ? Long.valueOf(extras.getLong("EXTRA_ATHLETE_PLAN_ID")) : null;
        if (lValueOf == null) {
            aVar.getClass();
            i2.a.f(a2Var, "TrainingPlanDashboardA", "Missing required parameter - Athlete Plan Id");
            finish();
            return;
        }
        this.f45392m = extras.getString("EXTRA_ATHLETE_PLAN_TITLE");
        this.f45388i = extras.getBoolean("GCM_tp_display_as_genesis_state", false);
        this.f45390k = extras.getString("GCM_tp_sel_navigation_item");
        w1 w1Var = this.f45384e;
        wt1.d dVar = (wt1.d) w1Var.getValue();
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra_ti_race_dto", n.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_ti_race_dto") : null;
            if (!(parcelableExtra instanceof n)) {
                parcelableExtra = null;
            }
            parcelable = (n) parcelableExtra;
        }
        dVar.f187049p = (n) parcelable;
        n nVar = ((wt1.d) w1Var.getValue()).f187049p;
        this.f45389j = nVar != null ? Boolean.valueOf(nVar.f192428d) : null;
        if (isTopNavigation() && (str = this.f45390k) != null) {
            ca(str);
        }
        ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).i(this, true);
        this.f45386g = new h(this, 0L, null, 6, null);
        wt1.b bVar = new wt1.b(findViewById(R.id.training_error_layout));
        this.f45387h = bVar;
        bVar.b();
        wt1.b bVar2 = this.f45387h;
        if (bVar2 != null) {
            bVar2.f();
        }
        wt1.b bVar3 = this.f45387h;
        if (bVar3 != null) {
            bVar3.e();
        }
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar2 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
        long jLongValue = lValueOf.longValue();
        String str2 = this.f45392m;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar2 = new com.garmin.android.apps.connectmobile.training.atp.dashboard.d();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("EXTRA_ATHLETE_PLAN_ID", jLongValue);
        bundle2.putString("EXTRA_ATHLETE_PLAN_TITLE", str2);
        dVar2.setArguments(bundle2);
        this.f45385f = dVar2;
        ma(dVar2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.b(new a61.h(supportFragmentManager, this, 2));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        h hVar = this.f45386g;
        if (hVar == null) {
            s.m("presenter");
            throw null;
        }
        if (hVar.f206971d == null) {
            hVar.m();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        h hVar = this.f45386g;
        if (hVar != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(hVar.f206973f);
        } else {
            s.m("presenter");
            throw null;
        }
    }

    @Override // zt1.d
    public final void p2(String str, String str2) {
        str.getClass();
        q1.b bVar = q1.f41066b;
        String string = getString(R.string.msg_change_goal);
        string.getClass();
        c0 c0Var = new c0(this, 0);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, str2, R.string.common_confirm, R.string.device_action_cancel, c0Var);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.d.b
    public final void r(xw1.o oVar) {
        com.garmin.android.apps.connectmobile.training.atp.create.video.a.f45334d.getClass();
        Intent intentA = com.garmin.android.apps.connectmobile.training.atp.create.video.a.C0871a.a(this, oVar);
        if (intentA != null) {
            startActivity(intentA);
        }
    }

    @Override // zt1.d
    public final void r6(xw1.c cVar) {
        f.f45267k.getClass();
        f fVar = new f();
        fVar.setArguments(com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1));
        ma(fVar);
    }

    @Override // zt1.d
    public final void s0() {
    }

    @Override // zt1.d
    public final void s9(String str, String str2) {
        str.getClass();
    }

    @Override // zt1.d
    public final void t() {
        hideProgressOverlay();
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f45385f;
        if (dVar != null) {
            dVar.z6(true);
        }
    }

    @Override // zt1.d
    public final void w3(xw1.c cVar, DateTime dateTime, DateTime dateTime2) {
        cVar.getClass();
        r.a aVar = r.f154555d;
        Integer planType = cVar.getPlanType();
        planType.getClass();
        int iIntValue = planType.intValue();
        aVar.getClass();
        r rVarB = r.a.b(iIntValue);
        if (rVarB != null) {
            wt1.a.g((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null), this, rVarB.ordinal(), dateTime, dateTime2, null, null, 96);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/TrainingPlanDashboardActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_ATHLETE_PLAN_ID", "EXTRA_ATHLETE_PLAN_TITLE", "", "REASON_REQUEST_CODE", "I", "EDIT_REQUEST_CODE", "EDIT_TAB_BAR_REQUEST_CODE", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, boolean z14, boolean z15, String str, String str2) {
            Intent intentD = sn.a.d(context, context, TrainingPlanDashboardActivity.class);
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_ATHLETE_PLAN_ID", j8);
            bundle.putBoolean("GCM_tp_display_as_genesis_state", z14);
            bundle.putBoolean("GCM_extra_top_navigation", z15);
            bundle.putString("GCM_tp_sel_navigation_item", str);
            bundle.putString("EXTRA_ATHLETE_PLAN_TITLE", str2);
            intentD.putExtras(bundle);
            if (z15) {
                intentD.addFlags(335544320);
            }
            return intentD;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, long j8, String str, int i14) {
            if ((i14 & 16) != 0) {
                str = null;
            }
            aVar.getClass();
            return a(context, j8, false, false, str, null);
        }

        public static void c(a aVar, Activity activity, long j8, boolean z14, String str, String str2, int i14, int i15) {
            if ((i15 & 8) != 0) {
                z14 = false;
            }
            boolean z15 = z14;
            String str3 = (i15 & 16) != 0 ? null : str;
            String str4 = (i15 & 32) != 0 ? null : str2;
            if (activity == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                activity.startActivityForResult(a(activity, j8, false, z15, str3, str4), i14);
            }
        }

        private a() {
        }
    }
}
