package ni1;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.b;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sd2.f;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lni1/a;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2424a f126196a = new C2424a(null);

    /* JADX INFO: renamed from: ni1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lni1/a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2424a {
        public /* synthetic */ C2424a(j jVar) {
            this();
        }

        public static Intent a(Context context, DeviceSettingsActivityTrackerSetupDefault.a aVar, long j8, String str, String str2) {
            context.getClass();
            aVar.getClass();
            str.getClass();
            str2.getClass();
            Intent intentD = l2.d(context, DeviceSettingsActivityTrackerSetupDefault.class, "GCM_deviceUnitID", j8);
            intentD.putExtra("setting_name", aVar);
            intentD.putExtra("GCM_deviceProductNbr", str);
            intentD.putExtra("GCM_deviceName", str2);
            return intentD;
        }

        public static void b(Context context, f fVar, GDIRealtimeSettingsProto.WellKnownCompositionId wellKnownCompositionId) {
            new b(context, fVar).a(wellKnownCompositionId.getNumber(), true, null, null);
        }

        private C2424a() {
        }
    }
}
