package com.garmin.android.apps.connectmobile.devices.settings.realtime;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import bz0.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import uc0.d;
import zh2.e;
import zh2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/RTSDynamicSettingsLauncherActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RTSDynamicSettingsLauncherActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34350a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f34351b;

    static {
        int i14 = gt2.c.f79010a;
        f34351b = gt2.b.f79005a.h("RTS-RTSDynamicSettingsLauncherActivity");
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        RTSDynamicSettingsLauncherActivity rTSDynamicSettingsLauncherActivity;
        OkHttpClient okHttpClientB;
        super.onCreate(bundle);
        Intent intent = getIntent();
        f fVar = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("DEVICE_DATABASE_RECORD", sd2.f.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("DEVICE_DATABASE_RECORD") : null;
            if (!(parcelableExtra instanceof sd2.f)) {
                parcelableExtra = null;
            }
            parcelable = (sd2.f) parcelableExtra;
        }
        sd2.f fVar2 = (sd2.f) parcelable;
        String stringExtra = getIntent().getStringExtra("SECTION");
        Logger logger = f34351b;
        if (fVar2 == null || stringExtra == null) {
            rTSDynamicSettingsLauncherActivity = this;
            logger.error("Unable to get start settings for device record " + fVar2 + " and section " + stringExtra);
        } else {
            d dVar = new d(this, fVar2, null, 4, null);
            logger.debug("frameDeviceSettingsConfiguration:");
            logger.debug("frameOkHttpClient:");
            if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
                o.f22274a.getClass();
                okHttpClientB = o.b();
            } else {
                okHttpClientB = null;
            }
            if (okHttpClientB != null) {
                fVar = new f(R.layout.settings_loading_view, null, 0, null, null, false, false, null, null, 0, new li2.d(okHttpClientB, GCMSettingManager.k().a(), GCMSettingManager.k().d()), new li2.a(fVar2.getUnitID(), "RealTimeSettings_cd2695a2-9f8d-435b-8209-e527a1462041", fVar2.getSoftwareVersion(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName(), null, null, null, km2.a.i(fVar2.getUnitID(), null, SupportedCapability.CIQ_AUDIO_CONTENT_PROVIDER.ordinal()), fVar2.L2(), 112, null), 1022, null);
            } else {
                logger.error("No GCM credentials.");
            }
            if (fVar != null) {
                e eVar = e.f204807a;
                m80.a.C2223a c2223a = m80.a.f117132a;
                String productNumber = fVar2.getProductNumber();
                c2223a.getClass();
                boolean zA = m80.a.C2223a.a(productNumber);
                eVar.getClass();
                rTSDynamicSettingsLauncherActivity = this;
                e.c(rTSDynamicSettingsLauncherActivity, stringExtra, dVar, zA, fVar);
            } else {
                rTSDynamicSettingsLauncherActivity = this;
                logger.error("Unable to frame settings data object");
            }
        }
        rTSDynamicSettingsLauncherActivity.finish();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/RTSDynamicSettingsLauncherActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "RTS_LAUNCHER_DEVICE_DATABASE_RECORD", "Ljava/lang/String;", "RTS_LAUNCHER_SECTION", "RTS_SETTINGS_FILENAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, sd2.f fVar, String str) {
            fVar.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) RTSDynamicSettingsLauncherActivity.class);
            intent.putExtra("DEVICE_DATABASE_RECORD", fVar);
            intent.putExtra("SECTION", str);
            return intent;
        }

        private a() {
        }
    }
}
