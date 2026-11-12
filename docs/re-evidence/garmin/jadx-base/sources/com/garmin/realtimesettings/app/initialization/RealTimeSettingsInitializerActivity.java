package com.garmin.realtimesettings.app.initialization;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import cx2.h;
import g8.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/realtimesettings/app/initialization/RealTimeSettingsInitializerActivity;", "Lcom/garmin/realtimesettings/app/presentationlayer/a;", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealTimeSettingsInitializerActivity extends com.garmin.realtimesettings.app.presentationlayer.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f52581r = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f52582t = new h("RealTimeSettingsInitializerActivity", null, 2, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f52583p = GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f52584q = true;

    @Override // android.app.Activity
    public final void finish() {
        b.f52589a.getClass();
        b.a().c(this.f52583p, true);
        b.f52590b.getClass();
        i.s(b.f52593e.f168725a);
        super.finish();
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        finish();
    }

    @Override // com.garmin.realtimesettings.app.presentationlayer.a, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.f52583p = extras != null ? extras.getInt("RealTimeSettingInitializer_Composition_Id") : GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE;
        this.f52584q = extras != null ? extras.getBoolean("RealTimeSettingInitializer_Initialize_Settings", false) : false;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        f52582t.getClass();
        super.onRestoreInstanceState(bundle);
        this.f52584q = false;
    }

    @Override // com.garmin.realtimesettings.app.presentationlayer.a, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z14 = this.f52584q;
        h hVar = f52582t;
        if (!z14) {
            hVar.getClass();
            finish();
            return;
        }
        hVar.getClass();
        int i14 = this.f52583p;
        SettingsDeviceActivity.f52599w.getClass();
        SettingsDeviceActivity.a.a(this, i14, -1, false);
        this.f52584q = false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/initialization/RealTimeSettingsInitializerActivity$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(a aVar, Context context, int i14, boolean z14, int i15) {
            if ((i15 & 8) != 0) {
                z14 = true;
            }
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) RealTimeSettingsInitializerActivity.class);
            intent.putExtra("RealTimeSettingInitializer_Composition_Id", i14);
            intent.putExtra("RealTimeSettingInitializer_Initialize_Settings", true);
            intent.setFlags(268435456);
            if (z14) {
                intent.setFlags(67108864);
            }
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
