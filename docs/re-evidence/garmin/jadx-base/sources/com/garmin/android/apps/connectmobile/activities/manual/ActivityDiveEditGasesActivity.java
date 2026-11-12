package com.garmin.android.apps.connectmobile.activities.manual;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.newmodel.r;
import com.garmin.android.apps.connectmobile.activities.newmodel.s;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import lo.h;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityDiveEditGasesActivity extends c implements View.OnClickListener, com.garmin.android.apps.connectmobile.activities.manual.a.b, com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29126j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f29127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f29128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f29129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<r> f29130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f29131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f29132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f29133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f29134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f29135i;

    public final void ca() {
        r rVar;
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        if (this.f29130d.get(0).C()) {
            arrayList.add(this.f29130d.get(0));
            for (com.garmin.android.apps.connectmobile.activities.manual.a aVar : this.f29128b) {
                if (aVar != null && !aVar.f29170q && (rVar = aVar.f29167n) != null && rVar.C()) {
                    arrayList.add(aVar.f29167n);
                }
            }
        }
        intent.putParcelableArrayListExtra("extra.activity.dive.gases", new ArrayList<>(arrayList));
        setResult(-1, intent);
        finish();
    }

    public final void da() {
        r rVar;
        List<r> list = this.f29130d;
        if (list == null || list.isEmpty()) {
            rVar = null;
        } else {
            rVar = this.f29130d.get(0);
            for (com.garmin.android.apps.connectmobile.activities.manual.a aVar : this.f29128b) {
                if (aVar != null && !aVar.f29170q) {
                    rVar = aVar.f29167n;
                }
            }
        }
        if (rVar == null || ((rVar.f29643b <= 0.0d && rVar.f29644c <= 0.0d) || this.f29130d.size() == 18)) {
            this.f29127a.setEnabled(false);
            this.f29127a.setAlpha(0.5f);
        } else {
            this.f29127a.setEnabled(true);
            this.f29127a.setAlpha(1.0f);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view2) {
        if (view2.equals(this.f29127a)) {
            if (this.f29128b.size() < 17) {
                this.f29129c.setVisibility(0);
                View viewInflate = getLayoutInflater().inflate(R.layout.activity_additional_gas, (ViewGroup) null);
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = new com.garmin.android.apps.connectmobile.activities.manual.a(viewInflate, this, this);
                r rVar = new r();
                rVar.f29642a = 255;
                rVar.f29646e = this.f29128b.size() + 1;
                rVar.f29655n = Double.NaN;
                rVar.f29649h = -1;
                rVar.f29651j = -1;
                this.f29130d.add(rVar);
                this.f29128b.add(aVar);
                aVar.a(rVar);
                this.f29129c.addView(viewInflate, new LinearLayout.LayoutParams(-1, -2));
                da();
                return;
            }
            return;
        }
        if (view2.equals(this.f29131e)) {
            this.f29134h.removeCallbacks(this.f29135i);
            for (com.garmin.android.apps.connectmobile.activities.manual.a aVar2 : this.f29128b) {
                if (aVar2.f29170q) {
                    aVar2.f29170q = false;
                    aVar2.f29155b.setVisibility(0);
                }
            }
            int i14 = 2;
            for (com.garmin.android.apps.connectmobile.activities.manual.a aVar3 : this.f29128b) {
                if (!aVar3.f29170q) {
                    aVar3.c(i14);
                    i14++;
                }
            }
            this.f29135i = null;
            this.f29133g.setVisibility(8);
            da();
            this.f29127a.setEnabled(true);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<r> arrayList;
        super.onCreate(bundle);
        setContentView(R.layout.activity_gas_edit);
        initActionBar(true, R.string.lbl_edit_gas_details);
        this.f29128b = new ArrayList();
        View viewFindViewById = findViewById(R.id.bottom_gas);
        s sVar = (s) getIntent().getParcelableExtra("extra.activity.dive.info");
        if (sVar == null || (arrayList = sVar.f29669n) == null) {
            arrayList = new ArrayList<>();
        }
        this.f29130d = arrayList;
        this.f29129c = (LinearLayout) findViewById(R.id.additional_gases_container);
        com.garmin.android.apps.connectmobile.activities.manual.a aVar = new com.garmin.android.apps.connectmobile.activities.manual.a(viewFindViewById, this, this);
        List<r> list = this.f29130d;
        if (list == null || list.isEmpty()) {
            this.f29130d = new ArrayList();
            this.f29130d.add(new r(0));
        } else {
            r rVar = this.f29130d.get(0);
            double d14 = rVar.f29644c;
            if (d14 == 0.0d) {
                d14 = -1.0d;
            }
            rVar.f29644c = d14;
            List<r> list2 = this.f29130d;
            for (r rVar2 : list2.subList(1, list2.size())) {
                double d15 = rVar2.f29644c;
                if (d15 == 0.0d) {
                    d15 = -1.0d;
                }
                rVar2.f29644c = d15;
                this.f29129c.setVisibility(0);
                View viewInflate = getLayoutInflater().inflate(R.layout.activity_additional_gas, (ViewGroup) null);
                com.garmin.android.apps.connectmobile.activities.manual.a aVar2 = new com.garmin.android.apps.connectmobile.activities.manual.a(viewInflate, this, this);
                this.f29128b.add(aVar2);
                aVar2.a(rVar2);
                this.f29129c.addView(viewInflate, new LinearLayout.LayoutParams(-1, -2));
            }
        }
        aVar.a(this.f29130d.get(0));
        View viewFindViewById2 = findViewById(R.id.add_gas_button);
        this.f29127a = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        da();
        this.f29134h = new Handler(Looper.getMainLooper());
        ((TextView) findViewById(R.id.bottom_gas_header)).setText(getIntent().getBooleanExtra("extra.activity.is.ccr", false) ? R.string.lbl_diluent_gas : R.string.activity_details_bottom_gas);
        TextView textView = (TextView) findViewById(R.id.undo_button);
        this.f29131e = textView;
        textView.setOnClickListener(this);
        this.f29132f = (TextView) findViewById(R.id.undo_label);
        View viewFindViewById3 = findViewById(R.id.undo_section);
        this.f29133g = viewFindViewById3;
        viewFindViewById3.setTranslationY(viewFindViewById3.getHeight());
        this.f29133g.setVisibility(8);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            ca();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i2.a(a2.ACTIVITIES, "ActivityDiveEditGasesActivity", "RemoveGasRunnable running");
            int i14 = ActivityDiveEditGasesActivity.f29126j;
            ActivityDiveEditGasesActivity activityDiveEditGasesActivity = ActivityDiveEditGasesActivity.this;
            activityDiveEditGasesActivity.getClass();
            ArrayList arrayList = new ArrayList();
            int i15 = 2;
            for (com.garmin.android.apps.connectmobile.activities.manual.a aVar : activityDiveEditGasesActivity.f29128b) {
                if (aVar.f29170q) {
                    arrayList.add(aVar);
                    activityDiveEditGasesActivity.f29129c.removeView(aVar.f29155b);
                    activityDiveEditGasesActivity.f29130d.remove(aVar.f29167n);
                } else {
                    aVar.c(i15);
                    i15++;
                }
            }
            activityDiveEditGasesActivity.da();
            activityDiveEditGasesActivity.f29128b.removeAll(arrayList);
            activityDiveEditGasesActivity.f29135i = null;
            i2.a(a2.ACTIVITIES, "ActivityDiveEditGasesActivity", "hideUndoArea called");
            activityDiveEditGasesActivity.f29133g.animate().setDuration(500L).translationY(activityDiveEditGasesActivity.f29133g.getHeight()).setListener(new h(activityDiveEditGasesActivity)).start();
            activityDiveEditGasesActivity.f29127a.setEnabled(true);
        }

        public /* synthetic */ a(ActivityDiveEditGasesActivity activityDiveEditGasesActivity, int i14) {
            this();
        }
    }
}
