package com.garmin.android.apps.connectmobile.workouts.presentation.schedule;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.lifecycle.m;
import androidx.lifecycle.x1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import java.util.ArrayList;
import lp2.h;
import m62.a;
import m62.b;
import m62.d;
import m62.g;
import org.joda.time.DateTime;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
public class ScheduleWorkoutTypeActivity extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f49542g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f49543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkoutDTO f49545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f49546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatCheckedTextView f49547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuItem f49548f;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49543a = (d) new x1(this).b(s0.f105811a.b(d.class));
        setContentView(R.layout.schedule_workout_to_training_plan_list_view);
        initActionBar(true, R.string.lbl_add_workout);
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) findViewById(R.id.workout_to_add);
        this.f49547e = appCompatCheckedTextView;
        appCompatCheckedTextView.setOnClickListener(new js0.d(this, 22));
        long longExtra = getIntent().getLongExtra("extra.date.time", -1L);
        this.f49544b = longExtra;
        if (longExtra == -1) {
            displayFailedMessage();
            finish();
        }
        this.f49545c = (WorkoutDTO) getIntent().getParcelableExtra("GCM_workout_dto");
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("GCM_tp_active_plans");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        g gVar = new g(parcelableArrayListExtra);
        this.f49546d = gVar;
        gVar.f116907b = new h(this, 23);
        recyclerView.setAdapter(gVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.schedule_workout_type_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_item_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f49548f.setEnabled(false);
        WorkoutDTO workoutDTO = this.f49545c;
        long j8 = this.f49544b;
        showProgressOverlay();
        d dVar = this.f49543a;
        long j14 = workoutDTO.f48040a;
        DateTime dateTime = new DateTime(j8);
        dVar.getClass();
        m.a(null, new b(dateTime, dVar, j14, null), 3).f(this, new a(this, 0));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        AppCompatCheckedTextView appCompatCheckedTextView;
        this.f49548f = menu.findItem(R.id.menu_item_done);
        g gVar = this.f49546d;
        if (gVar == null || (appCompatCheckedTextView = this.f49547e) == null || (gVar.f116908c == -1 && !appCompatCheckedTextView.isChecked())) {
            this.f49548f.setEnabled(false);
        } else {
            this.f49548f.setEnabled(true);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
