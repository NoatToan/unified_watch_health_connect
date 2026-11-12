package com.garmin.android.apps.connectmobile.bikesensors.orca;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import rv.b;
import rv.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/WheelCircumferenceActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lrv/e$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WheelCircumferenceActivity extends c implements e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30899c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f30900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f30901b;

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        int i14;
        b bVar = this.f30901b;
        if (bVar != null) {
            int i15 = bVar.f154598l;
            if (i15 > 0) {
                x7(i15, true);
            }
        } else {
            e eVar = this.f30900a;
            if (eVar != null && (i14 = eVar.f154613e) > 0) {
                x7(i14, eVar.f154614f);
            }
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z14;
        int i14;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(true, R.string.lbl_tire_circumference);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            i14 = extras.getInt("GCM_extra_bike_wheel_circumference_information");
            z14 = extras.getBoolean("GCM_extra_bike_wheel_displayed_in_metric");
        } else {
            z14 = true;
            i14 = 0;
        }
        e.f154612o.getClass();
        Bundle bundle2 = new Bundle();
        e eVar = new e();
        bundle2.putInt("GCM_extra_bike_wheel_circumference_information", i14);
        bundle2.putBoolean("GCM_extra_bike_wheel_displayed_in_metric", z14);
        bundle2.putBoolean("EXTRA_IS_BIC_FLOW", false);
        eVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.j(R.id.content_frame_layout, eVar, null, 1);
        aVar.e();
        this.f30900a = eVar;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // rv.e.b
    public final void v1() {
        b.f154590r.getClass();
        Bundle bundle = new Bundle();
        b bVar = new b();
        bundle.putBoolean("EXTRA_IS_BIC_FLOW", false);
        bVar.setArguments(bundle);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame_layout, bVar, null);
        aVar.d(null);
        aVar.e();
        this.f30901b = bVar;
    }

    @Override // rv.e.b
    public final void x7(int i14, boolean z14) {
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_bike_wheel_circumference_information", i14);
        intent.putExtra("GCM_extra_bike_wheel_displayed_in_metric", z14);
        setResult(-1, intent);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/WheelCircumferenceActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
