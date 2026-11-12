package com.garmin.android.apps.connectmobile.performance.stats;

import android.os.Bundle;
import aq.o3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e12.e;
import ro0.l;
import t61.h;

/* JADX INFO: loaded from: classes9.dex */
public class TrainingEffectSummaryActivity extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o3.b f40025e = o3.b.TRAINING_EFFECT_HELP_AEROBIC;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40026f = false;

    @Override // t61.h
    public final int ca() {
        return 3;
    }

    @Override // t61.h
    public final void da() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("help_mode_key", this.f40025e);
        bundle.putBoolean("has_primary_benefit", this.f40026f);
        HelpActivity.da(this, l.TRAINING_EFFECT, "DEFAULT_ACTION", bundle);
    }

    @Override // t61.h, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.activity_details_training_effect);
        e eVarC = bo1.a.a().c();
        if (eVarC.l() && eVarC.s()) {
            this.f40025e = o3.b.TRAINING_EFFECT_HELP_BOTH;
        }
        this.f40026f = eVarC.s();
    }
}
