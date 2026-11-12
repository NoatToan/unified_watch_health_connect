package defpackage;

import android.hardware.SensorEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider;

/* JADX INFO: loaded from: classes5.dex */
public class vuk implements IRnEventProvider {
    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendAccelerometerEvent(SensorEvent sensorEvent) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendAudioPlayerFinishedEvent(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendAudioPlayerStartEvent(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendAudioPlayerUpdateEvent(String str, int i) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendColorSchemeChangedEvent(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendCompressEvent(double d) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendDownloadProgressEvent(String str, String str2, long j, long j2) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendGyroscopeEvent(SensorEvent sensorEvent) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendLicenseRevokeEvent() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(i.d, "packageAuthorizationCancel_36621");
        mvk.e().g().sendEvent("packageAuthorizationCancel_36621", writableMapCreateMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendShakeEvent() {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendUploadProgressEvent(String str, String str2, long j, long j2) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider
    public void sendVolumeChangeEvent(double d) {
    }
}
