package com.garmin.android.apps.connectmobile.training.atp.create.edit;

import am.a2;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.e;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.i;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.j;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.k;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import rt1.r;
import wd2.h0;
import xw1.h;
import xw1.n;
import zt1.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/edit/ATPEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lzt1/d;", "Lyt1/d;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ATPEditActivity extends com.garmin.android.apps.connectmobile.c implements zt1.d, yt1.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45202g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f45204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f45205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f45206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wt1.b f45207e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45203a = new w1(s0.f105811a.b(wt1.d.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f45208f = new h0(this, 20);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45209a;

        public b(g gVar) {
            this.f45209a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45209a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45210a;

        public c(g gVar) {
            this.f45210a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45210a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45212b;

        public d(e23.a aVar, g gVar) {
            this.f45211a = aVar;
            this.f45212b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45211a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45212b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // zt1.d
    public final void A3(xw1.c cVar) {
        com.garmin.android.apps.connectmobile.training.atp.create.steps.g.f45268m.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.g gVar = new com.garmin.android.apps.connectmobile.training.atp.create.steps.g();
        gVar.setArguments(com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1));
        da(gVar);
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

    @Override // zt1.d
    public final void D7(xw1.c cVar, h hVar) {
        cVar.getClass();
        k.f45307l.getClass();
        k kVar = new k();
        Bundle bundleU6 = com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1);
        a2.b(bundleU6, "COACH_PLAN_EXTRA", hVar);
        kVar.setArguments(bundleU6);
        da(kVar);
    }

    @Override // zt1.d
    public final void F8(xw1.c cVar) {
        cVar.getClass();
        e.f45264m.getClass();
        e eVar = new e();
        eVar.setArguments(com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1));
        da(eVar);
    }

    @Override // zt1.d
    public final void G1() {
        MenuItem menuItem = this.f45206d;
        if (menuItem != null) {
            menuItem.setEnabled(false);
        }
        showProgressOverlay();
    }

    @Override // zt1.d
    public final void G4() {
        MenuItem menuItem = this.f45206d;
        if (menuItem != null) {
            menuItem.setEnabled(false);
        }
        showProgressOverlay(getString(R.string.lbl_recalculating_atp_plan));
    }

    @Override // zt1.d
    public final void G7(e23.a<Unit> aVar) {
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(this);
        aVar2.setTitle(R.string.changes_to_race_required);
        aVar2.setMessage(R.string.race_window_changed_find_new_race);
        aVar2.setCancelable(false);
        aVar2.setPositiveButton(R.string.lbl_ok, new c32.a(aVar, 19));
        aVar2.create().show();
    }

    @Override // zt1.d
    public final void I6(xw1.c cVar, boolean z14) {
        cVar.getClass();
        j.f45297p.getClass();
        j jVar = new j();
        Bundle bundleU6 = com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1);
        bundleU6.putBoolean("EXTRAS_PERSONAL_GOAL_CHANGED", z14);
        jVar.setArguments(bundleU6);
        da(jVar);
    }

    @Override // zt1.d
    public final void L0(int i14) {
        if (i14 == 0) {
            wt1.b bVar = this.f45207e;
            if (bVar != null) {
                bVar.g();
            }
            wt1.b bVar2 = this.f45207e;
            if (bVar2 != null) {
                bVar2.c(new zt1.a(this, 1));
                return;
            }
            return;
        }
        if (i14 == 1) {
            wt1.b bVar3 = this.f45207e;
            if (bVar3 != null) {
                bVar3.g();
            }
            wt1.b bVar4 = this.f45207e;
            if (bVar4 != null) {
                bVar4.c(new zt1.a(this, 2));
                return;
            }
            return;
        }
        if (i14 == 2) {
            Fragment fragmentF = getSupportFragmentManager().F(R.id.content);
            if (fragmentF instanceof com.garmin.android.apps.connectmobile.training.atp.create.steps.g) {
                com.garmin.android.apps.connectmobile.training.atp.create.steps.g gVar = (com.garmin.android.apps.connectmobile.training.atp.create.steps.g) fragmentF;
                wt1.b bVar5 = gVar.f45252e;
                if (bVar5 != null) {
                    bVar5.g();
                }
                au1.e eVar = new au1.e(gVar, 1);
                wt1.b bVar6 = gVar.f45252e;
                if (bVar6 != null) {
                    bVar6.c(eVar);
                    return;
                }
                return;
            }
            return;
        }
        wt1.b bVar7 = this.f45207e;
        if (i14 != 4) {
            if (bVar7 != null) {
                bVar7.g();
            }
            wt1.b bVar8 = this.f45207e;
            if (bVar8 != null) {
                bVar8.c(new ag0.a(this, i14, 16));
                return;
            }
            return;
        }
        if (bVar7 != null) {
            bVar7.g();
        }
        wt1.b bVar9 = this.f45207e;
        if (bVar9 != null) {
            bVar9.c(new zt1.a(this, 3));
        }
    }

    @Override // zt1.d
    public final void S4(int i14) {
        wt1.b bVar;
        if (i14 == 0) {
            wt1.b bVar2 = this.f45207e;
            if (bVar2 != null) {
                bVar2.e();
                return;
            }
            return;
        }
        if (i14 == 1) {
            wt1.b bVar3 = this.f45207e;
            if (bVar3 != null) {
                bVar3.e();
                return;
            }
            return;
        }
        if (i14 == 2) {
            Fragment fragmentF = getSupportFragmentManager().F(R.id.content);
            if (!(fragmentF instanceof com.garmin.android.apps.connectmobile.training.atp.create.steps.g) || (bVar = ((com.garmin.android.apps.connectmobile.training.atp.create.steps.g) fragmentF).f45252e) == null) {
                return;
            }
            bVar.e();
            return;
        }
        wt1.b bVar4 = this.f45207e;
        if (i14 != 4) {
            if (bVar4 != null) {
                bVar4.e();
            }
        } else if (bVar4 != null) {
            bVar4.e();
        }
    }

    @Override // zt1.d
    public final void S6(xw1.c cVar) {
        cVar.getClass();
        i.f45283r.getClass();
        i iVar = new i();
        iVar.setArguments(com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 0));
        da(iVar);
        this.f45205c = iVar;
    }

    @Override // zt1.d
    public final void X3(xw1.c cVar, h hVar, List<h> list) {
        cVar.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.c.f45254m.getClass();
        da(com.garmin.android.apps.connectmobile.training.atp.create.steps.c.a.a(cVar, hVar, list));
    }

    @Override // yt1.d
    public final yt1.c a9() {
        f fVar = this.f45204b;
        if (fVar != null) {
            return fVar;
        }
        s.m("presenter");
        throw null;
    }

    public final wt1.d ca() {
        return (wt1.d) this.f45203a.getValue();
    }

    public final void da(com.garmin.android.apps.connectmobile.training.atp.create.steps.b bVar) {
        hideProgressOverlay();
        if (isFinishing()) {
            return;
        }
        String strB5 = bVar.b5();
        if (strB5.equals("ReviewEditInformationFragment")) {
            ea();
        } else {
            MenuItem menuItem = this.f45206d;
            if (menuItem != null) {
                menuItem.setVisible(false);
            }
        }
        if (bVar instanceof i) {
            i iVar = (i) bVar;
            f fVar = this.f45204b;
            if (fVar == null) {
                s.m("presenter");
                throw null;
            }
            iVar.f45284h = fVar;
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.content);
        if (fragmentF != null) {
            aVarB.v(fragmentF);
        }
        aVarB.o(R.anim.anim_enter_from_right, R.anim.anim_exit_to_left, R.anim.anim_enter_from_left, R.anim.anim_exit_to_right);
        aVarB.j(R.id.content, bVar, strB5, 1);
        aVarB.d(strB5);
        aVarB.s(true, true);
    }

    @Override // zt1.d
    public final void e0(xw1.c cVar, DateTime dateTime, DateTime dateTime2) {
        cVar.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.h.f45276k.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.h hVar = new com.garmin.android.apps.connectmobile.training.atp.create.steps.h();
        Bundle bundleU6 = com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1);
        a2.f3853a.getClass();
        bundleU6.putSerializable("EXTRAS_RACE_START_DATE", dateTime);
        bundleU6.putSerializable("EXTRAS_RACE_END_DATE", dateTime2);
        hVar.setArguments(bundleU6);
        da(hVar);
    }

    public final void ea() {
        MenuItem menuItem = this.f45206d;
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
        MenuItem menuItem2 = this.f45206d;
        if (menuItem2 != null) {
            f fVar = this.f45204b;
            if (fVar != null) {
                menuItem2.setEnabled(true ^ s.g(fVar.f206972e.d().f206993a, fVar.f206970c));
            } else {
                s.m("presenter");
                throw null;
            }
        }
    }

    @Override // zt1.d
    public final void i2() {
        n nVar;
        if (getSupportFragmentManager().M() <= 0 || (nVar = ca().f187049p) == null) {
            return;
        }
        ca().f187049p = null;
        f fVar = this.f45204b;
        if (fVar != null) {
            fVar.u(nVar);
        } else {
            s.m("presenter");
            throw null;
        }
    }

    @Override // zt1.d
    public final void j2() {
        fy1.i.a.t(fy1.i.f73924a);
        setResult(-1, new Intent());
        finish();
    }

    @Override // zt1.d
    public final void l9(xw1.c cVar, boolean z14) {
        cVar.getClass();
        i iVar = this.f45205c;
        if (iVar == null) {
            S6(cVar);
            return;
        }
        if (z14) {
            getSupportFragmentManager().a0(0, "ReviewEditInformationFragment");
        }
        iVar.E6(cVar);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n nVarG4;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 150 && (nVarG4 = ca().G4(intent)) != null) {
            f fVar = this.f45204b;
            if (fVar != null) {
                fVar.u(nVarG4);
            } else {
                s.m("presenter");
                throw null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        int iM = getSupportFragmentManager().M();
        if (iM == 0) {
            finish();
            return;
        }
        if (iM == 1) {
            s0();
            return;
        }
        if (iM != 2) {
            f fVar = this.f45204b;
            if (fVar == null) {
                s.m("presenter");
                throw null;
            }
            fVar.f206972e.c();
            super.onBackPressed();
            return;
        }
        ea();
        f fVar2 = this.f45204b;
        if (fVar2 == null) {
            s.m("presenter");
            throw null;
        }
        fVar2.f206972e.c();
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_plan_overview_layout);
        initActionBar(true);
        xw1.c cVar = (xw1.c) a2.c(getIntent().getExtras(), "training_plan");
        Intent intent = getIntent();
        long j8 = (intent == null || (extras = intent.getExtras()) == null) ? 1L : extras.getLong("athlete_plan_id", 1L);
        fg0.k kVar = (fg0.k) a2.c(getIntent().getExtras(), "GCM_extra_sharable_event_dto");
        ca().f187049p = (n) a2.c(getIntent().getExtras(), "extra_ti_race_dto");
        n nVar = ca().f187049p;
        if ((nVar != null ? Boolean.valueOf(nVar.f192428d) : null) != null) {
            if (cVar != null) {
                cVar.h0(null);
            }
            if (cVar != null) {
                cVar.e0(null);
            }
        } else if (cVar != null) {
            cVar.h0(new n(null, kVar, null, false, 13, null));
        }
        ca().f187046m = Long.valueOf(j8);
        if (cVar == null || j8 == 1) {
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ATPEditActivity", "Missing required training plan or athlete plan id");
            finish();
            return;
        }
        wt1.b bVar = new wt1.b(findViewById(R.id.training_error_layout));
        this.f45207e = bVar;
        bVar.b();
        wt1.b bVar2 = this.f45207e;
        if (bVar2 != null) {
            bVar2.f();
        }
        wt1.b bVar3 = this.f45207e;
        if (bVar3 != null) {
            bVar3.d(new zt1.a(this, 0));
        }
        wt1.b bVar4 = this.f45207e;
        if (bVar4 != null) {
            bVar4.e();
        }
        this.f45204b = new f(this, j8, cVar);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.b(new a61.h(supportFragmentManager, this, 3));
        ((androidx.lifecycle.s0) ca().f187038e.getValue()).f(this, this.f45208f);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.training_plan_edit_menu, menu);
        this.f45206d = menu != null ? menu.findItem(R.id.menu_item_save) : null;
        if (getSupportFragmentManager().M() == 1) {
            ea();
        } else {
            MenuItem menuItem = this.f45206d;
            if (menuItem != null) {
                menuItem.setVisible(false);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_save) {
            return super.onOptionsItemSelected(menuItem);
        }
        f fVar = this.f45204b;
        if (fVar == null) {
            s.m("presenter");
            throw null;
        }
        boolean zG = s.g(fVar.f206976i, Boolean.TRUE);
        f fVar2 = this.f45204b;
        if (zG) {
            if (fVar2 != null) {
                fVar2.f206968a.G7(new zt1.e(fVar2, 0));
                return true;
            }
            s.m("presenter");
            throw null;
        }
        if (fVar2 == null) {
            s.m("presenter");
            throw null;
        }
        p pVar = new p(fVar2.f206970c, fVar2.f206972e.d().f206993a);
        xw1.c cVar = (xw1.c) pVar.f128594a;
        xw1.c cVar2 = (xw1.c) pVar.f128595b;
        wt1.d dVarCa = ca();
        cVar.getClass();
        cVar2.getClass();
        dVarCa.f187045l = cVar2;
        ge1.b.T(v1.a(dVarCa), null, null, new wt1.e(cVar, cVar2, dVarCa, this, null), 3);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        f fVar = this.f45204b;
        if (fVar == null) {
            s.m("presenter");
            throw null;
        }
        if (fVar.f206971d == null) {
            fVar.m();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        f fVar = this.f45204b;
        if (fVar != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(fVar.f206973f);
        } else {
            s.m("presenter");
            throw null;
        }
    }

    @Override // zt1.d
    public final void p2(String str, String str2) {
        str.getClass();
        q1.b bVar = q1.f41066b;
        zt1.b bVar2 = new zt1.b(this, 0);
        bVar.getClass();
        q1 q1VarC = q1.b.c(str, str2, R.string.common_confirm, R.string.device_action_cancel, bVar2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // zt1.d
    public final void r6(xw1.c cVar) {
        com.garmin.android.apps.connectmobile.training.atp.create.steps.f.f45267k.getClass();
        com.garmin.android.apps.connectmobile.training.atp.create.steps.f fVar = new com.garmin.android.apps.connectmobile.training.atp.create.steps.f();
        fVar.setArguments(com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1));
        da(fVar);
    }

    @Override // zt1.d
    public final void s0() {
        f fVar = this.f45204b;
        if (fVar == null) {
            s.m("presenter");
            throw null;
        }
        if (s.g(fVar.f206972e.d().f206993a, fVar.f206970c)) {
            finish();
            return;
        }
        String string = getString(R.string.msg_training_exit_plan_edit_title);
        string.getClass();
        String string2 = getString(R.string.msg_training_exit_plan_info);
        string2.getClass();
        q1.b bVar = q1.f41066b;
        zt1.b bVar2 = new zt1.b(this, 1);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.common_confirm, R.string.device_action_cancel, bVar2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // zt1.d
    public final void s9(String str, String str2) {
        str.getClass();
        q1.b bVar = q1.f41066b;
        zt1.b bVar2 = new zt1.b(this, 2);
        bVar.getClass();
        q1 q1VarC = q1.b.c(str, str2, R.string.common_confirm, R.string.device_action_cancel, bVar2);
        q1VarC.setCancelable(false);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // zt1.d
    public final void t() {
        if (getSupportFragmentManager().M() == 1) {
            ea();
        }
        hideProgressOverlay();
    }

    @Override // zt1.d
    public final void w3(xw1.c cVar, DateTime dateTime, DateTime dateTime2) {
        Bundle extras;
        cVar.getClass();
        Integer planType = cVar.getPlanType();
        if (planType != null) {
            int iIntValue = planType.intValue();
            r.f154555d.getClass();
            r rVarB = r.a.b(iIntValue);
            if (rVarB != null) {
                Intent intent = getIntent();
                wt1.a.g((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null), this, rVarB.ordinal(), dateTime, dateTime2, (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("GCM_tp_plan_name"), cVar.getSelectedRace(), 64);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/edit/ATPEditActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "NO_ATHLETE_PLAN_ID", "J", "TRAINING_PLAN_EXTRA", "ATHLETE_PLAN_ID_EXTRA", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
