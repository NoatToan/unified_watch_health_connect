package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import fb2.g;
import ig1.u0;
import ig1.z0;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/activityoptions/StrokeRateAlertsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StrokeRateAlertsActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41693b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41694a;

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = getIntent();
        com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f41694a;
        if (fVar == null) {
            s.m("deviceActivityOptionsDTO");
            throw null;
        }
        intent.putExtra("GCM_deviceActivityOptions", fVar);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        initActionBar(true, R.string.lbl_stroke_rate_alerts);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_deviceActivityOptions", com.garmin.android.apps.connectmobile.devices.model.f.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_deviceActivityOptions");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.devices.model.f)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.devices.model.f) parcelable2;
            }
            fVar = (com.garmin.android.apps.connectmobile.devices.model.f) parcelable;
        } else {
            fVar = null;
        }
        if (fVar == null) {
            setResult(0);
            super.finish();
        } else {
            this.f41694a = fVar;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.addView(g.a(this));
        u0 u0Var = new u0(this);
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = this.f41694a;
        if (fVar2 == null) {
            s.m("deviceActivityOptionsDTO");
            throw null;
        }
        u0Var.g(this, fVar2);
        linearLayout.addView(u0Var.f93321d);
        z0 z0Var = new z0(this);
        com.garmin.android.apps.connectmobile.devices.model.f fVar3 = this.f41694a;
        if (fVar3 == null) {
            s.m("deviceActivityOptionsDTO");
            throw null;
        }
        z0Var.g(this, fVar3);
        linearLayout.addView(z0Var.f93321d);
    }

    @Override // java.util.Observer
    @o13.e
    public final void update(Observable observable, Object obj) {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/activityoptions/StrokeRateAlertsActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
