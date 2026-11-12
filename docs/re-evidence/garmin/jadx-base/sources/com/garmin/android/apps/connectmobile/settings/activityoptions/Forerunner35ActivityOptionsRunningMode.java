package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import hg1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner35ActivityOptionsRunningMode extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f41632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f41633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f41634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMCheckableRow f41635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMCheckableRow f41636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMCheckableRow f41637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f41638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f41639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f41640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f41641k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f41642l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f41643m = new c();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner35ActivityOptionsRunningMode forerunner35ActivityOptionsRunningMode = Forerunner35ActivityOptionsRunningMode.this;
            com.garmin.android.apps.connectmobile.devices.model.f fVar = forerunner35ActivityOptionsRunningMode.f41631a;
            Boolean bool = Boolean.FALSE;
            fVar.y1("virtualPacerEnabled", bool);
            forerunner35ActivityOptionsRunningMode.f41631a.y1("intervalAlertsEnabled", bool);
            forerunner35ActivityOptionsRunningMode.fa();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner35ActivityOptionsRunningMode forerunner35ActivityOptionsRunningMode = Forerunner35ActivityOptionsRunningMode.this;
            forerunner35ActivityOptionsRunningMode.f41631a.y1("virtualPacerEnabled", Boolean.FALSE);
            forerunner35ActivityOptionsRunningMode.f41631a.y1("intervalAlertsEnabled", Boolean.TRUE);
            forerunner35ActivityOptionsRunningMode.fa();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner35ActivityOptionsRunningMode forerunner35ActivityOptionsRunningMode = Forerunner35ActivityOptionsRunningMode.this;
            forerunner35ActivityOptionsRunningMode.f41631a.y1("virtualPacerEnabled", Boolean.TRUE);
            forerunner35ActivityOptionsRunningMode.f41631a.y1("intervalAlertsEnabled", Boolean.FALSE);
            forerunner35ActivityOptionsRunningMode.fa();
        }
    }

    public class d implements com.garmin.android.apps.connectmobile.settings.activityoptions.d.a {
        public d() {
        }

        @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.d.a
        public final void b(int i14) {
            Forerunner35ActivityOptionsRunningMode forerunner35ActivityOptionsRunningMode = Forerunner35ActivityOptionsRunningMode.this;
            forerunner35ActivityOptionsRunningMode.f41632b.setButtonRightLabel(l3.f23124b.p0(i14, forerunner35ActivityOptionsRunningMode));
            forerunner35ActivityOptionsRunningMode.f41631a.G1(i14);
            forerunner35ActivityOptionsRunningMode.f41631a.y1("intervalAlertsEnabled", Boolean.TRUE);
            forerunner35ActivityOptionsRunningMode.f41631a.y1("virtualPacerEnabled", Boolean.FALSE);
        }
    }

    public class e implements com.garmin.android.apps.connectmobile.settings.activityoptions.d.a {
        public e() {
        }

        @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.d.a
        public final void b(int i14) {
            Forerunner35ActivityOptionsRunningMode forerunner35ActivityOptionsRunningMode = Forerunner35ActivityOptionsRunningMode.this;
            forerunner35ActivityOptionsRunningMode.f41633c.setButtonRightLabel(l3.f23124b.p0(i14, forerunner35ActivityOptionsRunningMode));
            forerunner35ActivityOptionsRunningMode.f41631a.I1(i14);
            forerunner35ActivityOptionsRunningMode.f41631a.y1("intervalAlertsEnabled", Boolean.TRUE);
            forerunner35ActivityOptionsRunningMode.f41631a.y1("virtualPacerEnabled", Boolean.FALSE);
        }
    }

    public class f implements com.garmin.android.apps.connectmobile.settings.activityoptions.d.a {
        public f() {
        }

        @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.d.a
        public final void b(int i14) {
            Forerunner35ActivityOptionsRunningMode forerunner35ActivityOptionsRunningMode = Forerunner35ActivityOptionsRunningMode.this;
            forerunner35ActivityOptionsRunningMode.f41634d.setButtonRightLabel(l3.f23124b.q0(forerunner35ActivityOptionsRunningMode, i14, forerunner35ActivityOptionsRunningMode.f41631a.s1(), true));
            Forerunner35ActivityOptionsRunningMode forerunner35ActivityOptionsRunningMode2 = Forerunner35ActivityOptionsRunningMode.this;
            forerunner35ActivityOptionsRunningMode2.f41631a.b2(i14);
            forerunner35ActivityOptionsRunningMode2.f41631a.y1("virtualPacerEnabled", Boolean.TRUE);
            forerunner35ActivityOptionsRunningMode2.f41631a.y1("intervalAlertsEnabled", Boolean.FALSE);
        }
    }

    public final void ca(boolean z14) {
        GCMCheckableRow gCMCheckableRow = this.f41635e;
        if (!z14) {
            gCMCheckableRow.c(false);
            return;
        }
        gCMCheckableRow.c(true);
        this.f41636f.c(false);
        this.f41637g.c(false);
        this.f41638h.setVisibility(8);
        this.f41639i.setVisibility(8);
    }

    public final void da(boolean z14) {
        if (!z14) {
            this.f41636f.c(false);
            this.f41638h.setVisibility(8);
            return;
        }
        this.f41635e.c(false);
        this.f41636f.c(true);
        this.f41637g.c(false);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41632b;
        int iI0 = this.f41631a.i0();
        l3.a aVar = l3.f23124b;
        gCMComplexOneLineButton.setButtonRightLabel(aVar.p0(iI0, this));
        this.f41633c.setButtonRightLabel(aVar.p0(this.f41631a.j0(), this));
        this.f41638h.setVisibility(0);
        this.f41639i.setVisibility(8);
    }

    public final void ea(boolean z14) {
        if (!z14) {
            this.f41637g.c(false);
            this.f41639i.setVisibility(8);
            return;
        }
        this.f41635e.c(false);
        this.f41636f.c(false);
        this.f41637g.c(true);
        this.f41639i.setVisibility(0);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41634d;
        double dJ0 = this.f41631a.J0();
        boolean zS1 = this.f41631a.s1();
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        gCMComplexOneLineButton.setButtonRightLabel(aVar.r0(this, dJ0, zS1, true, ""));
    }

    public final void fa() {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f41631a;
        if ((!fVar.R0() || !fVar.j1().booleanValue()) && (!fVar.V0() || !fVar.x1().booleanValue())) {
            ca(true);
            da(false);
            ea(false);
            this.f41640j.setText(getString(R.string.activity_options_running_mode_free_description));
            return;
        }
        ca(false);
        if (this.f41631a.R0() && this.f41631a.j1().booleanValue()) {
            da(true);
            ea(false);
            this.f41640j.setText(getString(R.string.activity_options_running_mode_run_or_walk_description_v2));
        } else if (this.f41631a.V0() && this.f41631a.x1().booleanValue()) {
            da(false);
            ea(true);
            this.f41640j.setText(getString(R.string.activity_options_running_mode_virtual_pacer_description));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f41631a != null) {
            getIntent().putExtra("GCM_deviceActivityOptions", this.f41631a);
            setResult(-1, getIntent());
        } else {
            setResult(0);
        }
        super.finish();
    }

    public void onClickComplexOneLineButton(View view2) {
        int id3 = ((View) view2.getParent()).getId();
        if (id3 == R.id.runTimeButton) {
            new com.garmin.android.apps.connectmobile.settings.activityoptions.d(this, getString(R.string.run_mode_alerts_setting_run_time), new d(), j.ALERT_TYPE_RUN_WALK_INTERVALS, this.f41631a.i0());
        } else if (id3 == R.id.walkTimeButton) {
            new com.garmin.android.apps.connectmobile.settings.activityoptions.d(this, getString(R.string.run_mode_alerts_setting_walk_time), new e(), j.ALERT_TYPE_RUN_WALK_INTERVALS, this.f41631a.j0());
        } else if (id3 == R.id.pace_options_btn) {
            new com.garmin.android.apps.connectmobile.settings.activityoptions.d(this, getString(R.string.run_mode_alerts_setting_virtual_pacer), new f(), j.ALERT_TYPE_VIRTUAL_PACER, this.f41631a.J0());
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_running_mode);
        this.f41631a = (com.garmin.android.apps.connectmobile.devices.model.f) getIntent().getParcelableExtra("GCM_deviceActivityOptions");
        initActionBar(true, getString(R.string.activity_options_running_mode_title));
        this.f41632b = (GCMComplexOneLineButton) findViewById(R.id.runTimeButton);
        this.f41633c = (GCMComplexOneLineButton) findViewById(R.id.walkTimeButton);
        this.f41634d = (GCMComplexOneLineButton) findViewById(R.id.pace_options_btn);
        GCMCheckableRow gCMCheckableRow = (GCMCheckableRow) findViewById(R.id.activity_options_run_mode_free);
        this.f41635e = gCMCheckableRow;
        gCMCheckableRow.setOnClickListener(this.f41641k);
        GCMCheckableRow gCMCheckableRow2 = (GCMCheckableRow) findViewById(R.id.activity_options_run_mode_run_or_walk);
        this.f41636f = gCMCheckableRow2;
        gCMCheckableRow2.setOnClickListener(this.f41642l);
        GCMCheckableRow gCMCheckableRow3 = (GCMCheckableRow) findViewById(R.id.activity_options_run_mode_virtual_pacer);
        this.f41637g = gCMCheckableRow3;
        gCMCheckableRow3.setOnClickListener(this.f41643m);
        this.f41638h = (LinearLayout) findViewById(R.id.run_walk_options_layout);
        this.f41639i = (LinearLayout) findViewById(R.id.virtual_pace_options_layout);
        this.f41640j = (TextView) findViewById(R.id.run_mode_description);
        fa();
    }
}
