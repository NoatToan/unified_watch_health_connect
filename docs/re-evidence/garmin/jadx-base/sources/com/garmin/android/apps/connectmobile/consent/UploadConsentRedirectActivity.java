package com.garmin.android.apps.connectmobile.consent;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q92.x;
import xk1.v;
import z10.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/UploadConsentRedirectActivity;", "Lz10/y0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UploadConsentRedirectActivity extends y0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f32243t = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f32244v = "UploadConsentRedirectActivity";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f32245r;

    @Override // z10.y0
    public final x[] Aa() {
        return new x[]{x.DI_CONNECT_UPLOAD};
    }

    @Override // z10.y0
    public final void Ba() {
        DisplayWiFiNetworksActivity.a aVar = DisplayWiFiNetworksActivity.f43230m;
        l lVar = this.f32245r;
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) DisplayWiFiNetworksActivity.class);
        if (lVar != null) {
            intent.putExtra("GCM_deviceDTO", lVar);
            intent.putExtra("GCM_deviceUnitID", lVar.getF143511a());
        }
        intent.putExtra("GCM_extra_in_pairing_mode", true);
        startActivity(intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f32245r != null) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.smart_scale_device_setup_abandon_setup_message_a).setPositiveButton(R.string.lbl_resume, new v(20)).setNegativeButton(R.string.lbl_cancel, new xg1.l(this, 18)).setCancelable(false).show();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // z10.y0, com.garmin.android.apps.connectmobile.consent.a
    public final void ua() {
        Ba();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
        if (getIntent().getExtras() != null) {
            Intent intent2 = getIntent();
            Parcelable parcelable = null;
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable parcelableExtra = intent2 != null ? intent2.getParcelableExtra("GCM_deviceDTO") : null;
                parcelable = (l) (parcelableExtra instanceof l ? parcelableExtra : null);
            } else if (intent2 != null) {
                parcelable = (Parcelable) intent2.getParcelableExtra("GCM_deviceDTO", l.class);
            }
            this.f32245r = (l) parcelable;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void xa() {
        setTitle(getString(R.string.device_index_smart_scale));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/UploadConsentRedirectActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
