package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3ReorderableWidgetActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.ReOrderableWidgetActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj31/u1;", "Lj31/z0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u1 implements z0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96936a;

        static {
            int[] iArr = new int[zb0.u0.values().length];
            try {
                iArr[zb0.u0.T1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zb0.u0.f203764l2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zb0.u0.K1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zb0.u0.L1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zb0.u0.M1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[zb0.u0.U1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f96936a = iArr;
        }
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null && km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
            RTSSettingsLauncherActivity.f34352a.getClass();
            context.startActivity(RTSSettingsLauncherActivity.a.a(context, fVarI, GDIRealtimeSettingsProto.WellKnownCompositionId.WIDGETS_SETTINGS_VALUE, true, null, null));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceUnitID", j8);
        zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str2);
        switch (u0Var == null ? -1 : a.f96936a[u0Var.ordinal()]) {
            case 1:
            case 2:
                intent.setClass(context, ReOrderableWidgetActivity.class).getClass();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                intent.setClass(context, Vivomove3ReorderableWidgetActivity.class).getClass();
                break;
            default:
                intent.setClass(context, DeviceDetailsActivity.class);
                intent.setFlags(67108864);
                Unit unit = Unit.INSTANCE;
                break;
        }
        context.startActivity(intent);
    }
}
