package com.garmin.android.apps.connectmobile.devices.settings.realtime;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sd2.f;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/RTSSettingsLauncherActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RTSSettingsLauncherActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34352a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f34353b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/devices/settings/realtime/RTSSettingsLauncherActivity$b", "Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/b$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b
        public final void a() {
            RTSSettingsLauncherActivity.this.finish();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f34353b = gt2.b.f79005a.h("RTS-RTSSettingsLauncherActivity");
    }

    public final void a() {
        Parcelable parcelable;
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("DEVICE_DATABASE_RECORD", f.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("DEVICE_DATABASE_RECORD") : null;
            if (!(parcelableExtra instanceof f)) {
                parcelableExtra = null;
            }
            parcelable = (f) parcelableExtra;
        }
        f fVar = (f) parcelable;
        int intExtra = getIntent().getIntExtra("COMPOSITION_ID", GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE);
        boolean booleanExtra = getIntent().getBooleanExtra("NEW_INSTANCE", false);
        Logger logger = f34353b;
        if (fVar != null) {
            StringBuilder sbW = h.w(intExtra, "Device:", ", CompositionId: ", fVar.getUnitID());
            sbW.append(". Starting Real Time Settings.");
            logger.debug(sbW.toString());
            new com.garmin.android.apps.connectmobile.devices.settings.realtime.b(this, fVar).a(intExtra, booleanExtra, null, new b());
            return;
        }
        logger.error("Unable to start settings with no device record and compositionId " + intExtra);
        finish();
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        String stringExtra = getIntent().getStringExtra("DIALOG_TITLE");
        String stringExtra2 = getIntent().getStringExtra("DIALOG_MESSAGE");
        if (stringExtra == null || stringExtra2 == null) {
            a();
            return;
        }
        e.a aVar = new e.a(new ContextThemeWrapper(this, R.style.AlertDialogTheme));
        aVar.setTitle(stringExtra);
        aVar.setMessage(stringExtra2);
        final int i14 = 0;
        aVar.setPositiveButton(R.string.lbl_open, new DialogInterface.OnClickListener(this) { // from class: xc0.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RTSSettingsLauncherActivity f189945b;

            {
                this.f189945b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                int i16 = i14;
                RTSSettingsLauncherActivity rTSSettingsLauncherActivity = this.f189945b;
                switch (i16) {
                    case 0:
                        RTSSettingsLauncherActivity.a aVar2 = RTSSettingsLauncherActivity.f34352a;
                        rTSSettingsLauncherActivity.a();
                        break;
                    default:
                        RTSSettingsLauncherActivity.a aVar3 = RTSSettingsLauncherActivity.f34352a;
                        rTSSettingsLauncherActivity.finish();
                        break;
                }
            }
        });
        final int i15 = 1;
        aVar.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener(this) { // from class: xc0.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RTSSettingsLauncherActivity f189945b;

            {
                this.f189945b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                int i17 = i15;
                RTSSettingsLauncherActivity rTSSettingsLauncherActivity = this.f189945b;
                switch (i17) {
                    case 0:
                        RTSSettingsLauncherActivity.a aVar2 = RTSSettingsLauncherActivity.f34352a;
                        rTSSettingsLauncherActivity.a();
                        break;
                    default:
                        RTSSettingsLauncherActivity.a aVar3 = RTSSettingsLauncherActivity.f34352a;
                        rTSSettingsLauncherActivity.finish();
                        break;
                }
            }
        });
        f34353b.trace("Show RTS deep linking dialog");
        aVar.show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/RTSSettingsLauncherActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "RTS_LAUNCHER_DEVICE_DATABASE_RECORD", "Ljava/lang/String;", "RTS_LAUNCHER_COMPOSITION_ID", "RTS_LAUNCHER_NEW_INSTANCE", "RTS_LAUNCHER_DIALOG_TITLE", "RTS_LAUNCHER_DIALOG_MESSAGE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, f fVar, int i14, boolean z14, String str, String str2) {
            context.getClass();
            fVar.getClass();
            Intent intent = new Intent(context, (Class<?>) RTSSettingsLauncherActivity.class);
            intent.putExtra("DEVICE_DATABASE_RECORD", fVar);
            intent.putExtra("COMPOSITION_ID", i14);
            intent.putExtra("NEW_INSTANCE", z14);
            intent.putExtra("DIALOG_TITLE", str);
            intent.putExtra("DIALOG_MESSAGE", str2);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, f fVar, int i14, boolean z14) {
            aVar.getClass();
            return a(context, fVar, i14, z14, null, null);
        }

        private a() {
        }
    }
}
