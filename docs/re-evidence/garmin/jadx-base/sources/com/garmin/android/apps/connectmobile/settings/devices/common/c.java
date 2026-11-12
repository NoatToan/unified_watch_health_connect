package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.compat.j;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/c;", "", "", "deviceId", "Lcom/garmin/android/apps/connectmobile/settings/devices/common/c$a;", "bikeAlarmProtoCallback", "<init>", "(JLcom/garmin/android/apps/connectmobile/settings/devices/common/c$a;)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f42824b;

    public interface a {
        void i5(b bVar, GDISmartProto.Smart smart);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        SUCCESS,
        FAILURE
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.common.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/common/c$c", "Lwm2/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0799c implements wm2.b {
        public C0799c() {
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            new Handler(Looper.getMainLooper()).post(new androidx.media3.exoplayer.d(c.this, this, i14));
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            smart.getClass();
            new Handler(Looper.getMainLooper()).post(new j(c.this, smart, this, i14));
        }
    }

    public /* synthetic */ c(long j8, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : aVar);
    }

    public final void a() {
        GDIAntiTheftAlarmProto.SettingRequest.Builder builderNewBuilder = GDIAntiTheftAlarmProto.SettingRequest.newBuilder();
        GDIAntiTheftAlarmProto.AntiTheftAlarmService.Builder builderNewBuilder2 = GDIAntiTheftAlarmProto.AntiTheftAlarmService.newBuilder();
        builderNewBuilder2.setSettingRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.getClass();
        vg1.f.b(builderNewBuilder3, builderNewBuilder2);
        b(builderNewBuilder3);
    }

    public final void b(GDISmartProto.Smart.Builder builder) {
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builder.build();
        smartBuild.getClass();
        protobufRequestManager.initiateRequest(smartBuild, this.f42823a, new C0799c());
    }

    public c(long j8, a aVar) {
        this.f42823a = j8;
        this.f42824b = aVar;
    }
}
