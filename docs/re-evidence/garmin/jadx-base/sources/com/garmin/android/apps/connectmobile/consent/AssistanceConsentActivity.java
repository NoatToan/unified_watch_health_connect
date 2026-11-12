package com.garmin.android.apps.connectmobile.consent;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactsMigrationActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q92.x;
import z10.y0;
import zb0.n0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/AssistanceConsentActivity;", "Lz10/y0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AssistanceConsentActivity extends y0 {
    @Override // z10.y0
    public final x[] Aa() {
        return new x[]{x.DI_CONNECT_LIVETRACK};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z10.y0
    public final void Ba() {
        Bundle extras = getIntent().getExtras();
        Parcelable parcelable = null;
        Boolean boolValueOf = extras != null ? Boolean.valueOf(extras.getBoolean("GCM_OpenAssistanceTypeScreen", false)) : null;
        Boolean boolValueOf2 = extras != null ? Boolean.valueOf(extras.getBoolean("GCM_open_myinfo_Screen", false)) : null;
        Boolean boolValueOf3 = extras != null ? Boolean.valueOf(extras.getBoolean("GCM_open_existing_assistance", false)) : null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = extras != null ? extras.getParcelable("GCM_extra_screen_access_role") : null;
            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
        } else if (extras != null) {
            parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
        }
        Parcelable parcelable3 = (hl.a) parcelable;
        if (parcelable3 == null) {
            parcelable3 = hl.a.c.f84256b;
        }
        Boolean bool = Boolean.TRUE;
        Class cls = SafetyFeatureSetupWizardActivity.class;
        if (!s.g(boolValueOf, bool) && !s.g(boolValueOf2, bool) && s.g(boolValueOf3, bool)) {
            cls = SafetyFeaturesActivity.class;
        }
        Intent intent = new Intent(this, (Class<?>) cls);
        if (extras != null) {
            intent.putExtras(extras);
            Bundle bundle = extras.getBundle("GCM_extra_activity_extras");
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        }
        Intent intent2 = new Intent(this, (Class<?>) cls);
        if (extras != null) {
            intent2.putExtras(extras);
            Bundle bundle2 = extras.getBundle("GCM_extra_activity_extras");
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
        }
        intent2.putExtra("EXTRA_STARTED_AFTER_CONTACTS_MIGRATION", true);
        Intent intent3 = new Intent(this, (Class<?>) ContactActivity.class);
        intent3.putExtra("EXTRA_STARTED_AS_PART_OF_MIGRATION", true);
        intent3.putExtra("GCM_extra_screen_access_role", parcelable3);
        p pVar = new p(intent, new Intent[]{intent2, intent3});
        ContactsMigrationActivity.a aVar = ContactsMigrationActivity.f32322j;
        Intent intent4 = (Intent) pVar.f128594a;
        Intent[] intentArr = (Intent[]) pVar.f128595b;
        hl.a aVar2 = this.f32249g;
        aVar.getClass();
        startActivity(ContactsMigrationActivity.a.a(this, intent4, intentArr, aVar2));
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void xa() {
        String string;
        if (this.f32249g instanceof hl.a.b) {
            string = getString(R.string.title_live_track);
        } else if (km2.a.g(SupportedCapability.INCIDENT_DETECT_AND_ASSISTANCE.ordinal(), n0.f203579c)) {
            string = s3.b() ? getString(R.string.title_live_track) : getString(R.string.incident_detection_and_assistance);
        } else {
            string = getString(R.string.incident_detection_concept);
        }
        setTitle(string);
    }
}
