package com.garmin.android.apps.connectmobile.settings.devices.quartz;

import ch1.v5;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u0;
import sd2.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/quartz/QuartzWatchFaceSettings;", "Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3SportWatchFaceSettings;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QuartzWatchFaceSettings extends Vivomove3SportWatchFaceSettings {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f43140j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f43141k = u0.e(new p(DeviceSettingsDTO.q.ANALOG_GENERIC_1, 2131233649), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_2, 2131233651), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_3, 2131233653), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_4, 2131233655), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_5, 2131233657), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_6, 2131233659), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_7, 2131233661), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_8, 2131233663), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_9, 2131233665), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_10, 2131233643), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_11, 2131233645), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_12, 2131233647));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$q, java.lang.Integer>] */
    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings
    public final Map<DeviceSettingsDTO.q, Integer> ca() {
        return f43141k;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings
    public final v5 da() {
        return new vh1.a(this);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings
    public final String ea(f fVar) {
        String strT0;
        return (fVar == null || (strT0 = fVar.t0()) == null) ? super.ea(fVar) : strT0;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/quartz/QuartzWatchFaceSettings$a;", "", "<init>", "()V", "", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$q;", "", "WATCH_FACE_DICTIONARY", "Ljava/util/Map;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
