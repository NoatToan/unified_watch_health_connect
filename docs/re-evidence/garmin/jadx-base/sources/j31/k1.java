package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import java.util.Arrays;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lj31/k1;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k1 implements z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f96902c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.t f96903d = o13.m.b(new j21.f(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96904b;

    public k1(b31.f fVar) {
        fVar.getClass();
        this.f96904b = fVar;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        Context context2;
        Intent intentA;
        Context context3;
        ds.e0.p(context, str, str2);
        e31.a[] aVarArr = (e31.a[]) k31.c.f102625l1.f102647c.toArray(new e31.a[0]);
        boolean zF = this.f96904b.f(j8, (e31.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        a aVar = f96902c;
        if (zF) {
            a.a(aVar).trace("getIntent() with feature completed. Returns alarm settings intent");
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            boolean zI = km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal());
            if (fVarI == null || !zI) {
                context3 = context;
                intentA = new Intent();
                a.a(aVar).error("Cannot create Intent for Alarms settings because the device does not support RTS.");
            } else {
                RTSSettingsLauncherActivity.f34352a.getClass();
                context3 = context;
                intentA = RTSSettingsLauncherActivity.a.a(context3, fVarI, GDIRealtimeSettingsProto.WellKnownCompositionId.ALARM_SETTINGS_VALUE, true, null, null);
            }
            context2 = context3;
        } else {
            a.a(aVar).trace("getIntent() with feature not completed. Returns add smart wake alarm settings intent");
            rd2.f.a().f152045a.getClass();
            context2 = context;
            sd2.f fVarI2 = rd2.j.i(j8, null);
            boolean zI2 = km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal());
            if (fVarI2 == null || !zI2) {
                Intent intent = new Intent();
                a.a(aVar).error("Cannot create Intent for Add Smart Wake Alarm settings because the device does not support RTS.");
                intentA = intent;
            } else {
                RTSSettingsLauncherActivity.f34352a.getClass();
                intentA = RTSSettingsLauncherActivity.a.a(context2, fVarI2, GDIRealtimeSettingsProto.WellKnownCompositionId.ADD_SMART_WAKE_ALARM_VALUE, true, null, null);
            }
        }
        context2.startActivity(intentA);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj31/k1$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) k1.f96903d.getValue();
        }

        private a() {
        }
    }
}
