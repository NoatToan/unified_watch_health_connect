package com.garmin.android.apps.connectmobile.livetracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.android.apps.connectmobile.livetracking.SetupSafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetracking/SetupSafetyFeaturesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SetupSafetyFeaturesActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38636a = 0;

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.set_up_safety_features);
        super.initActionBar(true, R.string.device_settings_safety_features);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        intent.getLongExtra("GCM_deviceUnitID", -1L);
        final int i14 = 0;
        ((GCMComplexOneLineButton) findViewById(R.id.setup_incident_detection)).setOnClickListener(new View.OnClickListener(this) { // from class: nu0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetupSafetyFeaturesActivity f127914b;

            {
                this.f127914b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                SetupSafetyFeaturesActivity setupSafetyFeaturesActivity = this.f127914b;
                switch (i15) {
                    case 0:
                        int i16 = SetupSafetyFeaturesActivity.f38636a;
                        setupSafetyFeaturesActivity.startActivity(new Intent(setupSafetyFeaturesActivity, (Class<?>) IncidentDetectionTermsActivity.class));
                        break;
                    default:
                        int i17 = SetupSafetyFeaturesActivity.f38636a;
                        setupSafetyFeaturesActivity.startActivity(new Intent(setupSafetyFeaturesActivity, (Class<?>) LiveTrackActivity.class));
                        break;
                }
            }
        });
        final int i15 = 1;
        ((GCMComplexOneLineButton) findViewById(R.id.setup_livetrack)).setOnClickListener(new View.OnClickListener(this) { // from class: nu0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetupSafetyFeaturesActivity f127914b;

            {
                this.f127914b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                SetupSafetyFeaturesActivity setupSafetyFeaturesActivity = this.f127914b;
                switch (i16) {
                    case 0:
                        int i17 = SetupSafetyFeaturesActivity.f38636a;
                        setupSafetyFeaturesActivity.startActivity(new Intent(setupSafetyFeaturesActivity, (Class<?>) IncidentDetectionTermsActivity.class));
                        break;
                    default:
                        int i18 = SetupSafetyFeaturesActivity.f38636a;
                        setupSafetyFeaturesActivity.startActivity(new Intent(setupSafetyFeaturesActivity, (Class<?>) LiveTrackActivity.class));
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetracking/SetupSafetyFeaturesActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
