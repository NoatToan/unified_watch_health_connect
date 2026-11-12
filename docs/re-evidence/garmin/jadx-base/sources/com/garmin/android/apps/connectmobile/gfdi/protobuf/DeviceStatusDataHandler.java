package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.s0;
import o53.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.l0;
import v13.i;
import w2.a0;
import zb0.h1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0007¢\u0006\u0004\b(\u0010'J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0007¢\u0006\u0004\b)\u0010'J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0007¢\u0006\u0004\b*\u0010'J\u001d\u0010+\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b+\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u00106R \u00109\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/DeviceStatusDataHandler;", "Ldt2/a;", "Ldt2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbc0/b;", "batteryStatusObserver", "Llc0/h;", "isScreenlessDeviceUseCase", "<init>", "(Landroid/content/Context;Lbc0/b;Llc0/h;)V", "", "Landroid/content/Intent;", "getAction", "()[Landroid/content/Intent;", "", "connectionId", "", "close", "(Ljava/lang/String;)V", "Lrs2/c;", "deviceInfo", "Ldt2/g;", "messenger", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", TtmlNode.START, "(Lrs2/c;Ldt2/g;Lcom/google/protobuf/ExtensionRegistryLite;)V", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "smart", "Ldt2/k;", "responder", "", "onProtobufRequest", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;Ldt2/k;)Z", "Lcom/garmin/proto/generated/GDIDeviceStatus$RemoteDeviceBatteryStatusBatteryStatus;", "status", "deviceName", "handleResponseStatusFullyCharged", "(Lcom/garmin/proto/generated/GDIDeviceStatus$RemoteDeviceBatteryStatusBatteryStatus;Ljava/lang/String;)V", "handleResponseStatusNormal", "handleResponseStatusCritical", "handleResponseStatusLow", "handleResponseStatusLowPulseOx", "Landroid/content/Context;", "Lbc0/b;", "Llc0/h;", "Lo53/t;", "job", "Lo53/t;", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "Lrs2/c;", "Ldt2/g;", "", "", "configuration", "Ljava/util/Set;", "getConfiguration", "()Ljava/util/Set;", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceStatusDataHandler implements dt2.a, h {
    private static final String TAG = "DeviceStatusDataHandler";
    private final bc0.b batteryStatusObserver;
    private final Set<Integer> configuration;
    private final Context context;
    private final b0 coroutineScope;
    private rs2.c deviceInfo;
    private final lc0.h isScreenlessDeviceUseCase;
    private final t job;
    private dt2.g messenger;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusDataHandler$onProtobufRequest$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusDataHandler$onProtobufRequest$1", f = "DeviceStatusDataHandler.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus $status;
        int label;
        final /* synthetic */ DeviceStatusDataHandler this$0;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusDataHandler$onProtobufRequest$1$WhenMappings */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.values().length];
                try {
                    iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.LOW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.CRITICAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.FULLY_CHARGED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.NORMAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.LOW_PULSE_OX.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus, DeviceStatusDataHandler deviceStatusDataHandler, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$status = remoteDeviceBatteryStatusBatteryStatus;
            this.this$0 = deviceStatusDataHandler;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$status, this.this$0, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String f92742f;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.DEVICES;
                String str = "Processing battery status: " + this.$status;
                aVar2.getClass();
                i2.a.b(a2Var, DeviceStatusDataHandler.TAG, str);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1 deviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1 = new DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1(this.this$0, null);
                this.label = 1;
                obj = ge1.b.e0(bVar, deviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            sd2.f fVar = (sd2.f) obj;
            if (!this.this$0.isScreenlessDeviceUseCase.a(fVar)) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.DEVICES;
                rs2.c cVar2 = this.this$0.deviceInfo;
                if (cVar2 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                String str2 = "Ignoring battery status for non-screenless device: " + cVar2.getF92746j();
                aVar3.getClass();
                i2.a.b(a2Var2, DeviceStatusDataHandler.TAG, str2);
                return Unit.INSTANCE;
            }
            if (fVar != null) {
                f92742f = a0.i(fVar);
            } else {
                rs2.c cVar3 = this.this$0.deviceInfo;
                if (cVar3 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                f92742f = cVar3.getF92742f();
            }
            GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus = this.$status;
            int i15 = remoteDeviceBatteryStatusBatteryStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[remoteDeviceBatteryStatusBatteryStatus.ordinal()];
            if (i15 == 1) {
                this.this$0.handleResponseStatusLow(this.$status, f92742f);
            } else if (i15 == 2) {
                this.this$0.handleResponseStatusCritical(this.$status, f92742f);
            } else if (i15 == 3) {
                this.this$0.handleResponseStatusFullyCharged(this.$status, f92742f);
            } else if (i15 == 4) {
                this.this$0.handleResponseStatusNormal(this.$status, f92742f);
            } else if (i15 != 5) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.DEVICES;
                String str3 = "Unhandled battery status received " + this.$status;
                aVar4.getClass();
                i2.a.b(a2Var3, DeviceStatusDataHandler.TAG, str3);
            } else {
                boolean zL = k1.f37122a.L();
                DeviceStatusDataHandler deviceStatusDataHandler = this.this$0;
                if (zL) {
                    deviceStatusDataHandler.handleResponseStatusLow(GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.LOW, f92742f);
                } else {
                    deviceStatusDataHandler.handleResponseStatusLowPulseOx(this.$status, f92742f);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public DeviceStatusDataHandler(Context context, bc0.b bVar, lc0.h hVar) {
        context.getClass();
        bVar.getClass();
        hVar.getClass();
        this.context = context;
        this.batteryStatusObserver = bVar;
        this.isScreenlessDeviceUseCase = hVar;
        e2 e2VarH = ge1.b.h();
        this.job = e2VarH;
        x53.c cVar = s0.f129406a;
        this.coroutineScope = c0.a(x53.b.f189152a.plus(e2VarH));
        this.configuration = l0.f134950a;
    }

    private final Intent[] getAction() {
        Context context = this.context;
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
        intent.addFlags(268468224);
        Context context2 = this.context;
        rs2.c cVar = this.deviceInfo;
        if (cVar != null) {
            return new Intent[]{intent, DeviceDetailsActivity.ma(context2, cVar.getF92746j())};
        }
        s.m("deviceInfo");
        throw null;
    }

    @Override // dt2.a
    public void close(String connectionId) {
        connectionId.getClass();
        this.job.c(null);
    }

    @Override // dt2.a
    public Set<Integer> getConfiguration() {
        return this.configuration;
    }

    public final void handleResponseStatusCritical(GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus status, String deviceName) {
        status.getClass();
        deviceName.getClass();
        String string = this.context.getString(R.string.msg_device_very_low_battery, deviceName);
        string.getClass();
        Context context = this.context;
        String string2 = context.getString(R.string.pn_device_very_low_battery);
        string2.getClass();
        h1.b(context, 43, string2, string, getAction(), true);
        bc0.b bVar = this.batteryStatusObserver;
        rs2.c cVar = this.deviceInfo;
        if (cVar != null) {
            bVar.c(cVar.getF92746j(), deviceName, status);
        } else {
            s.m("deviceInfo");
            throw null;
        }
    }

    public final void handleResponseStatusFullyCharged(GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus status, String deviceName) {
        status.getClass();
        deviceName.getClass();
        Intent intent = new Intent(this.context, (Class<?>) GCMActivityStartup.class);
        String string = this.context.getString(R.string.msg_device_battery_charged, deviceName);
        string.getClass();
        Context context = this.context;
        String string2 = context.getString(R.string.pn_device_battery_charged);
        string2.getClass();
        h1.a(context, 43, string2, string, intent, false);
        bc0.b bVar = this.batteryStatusObserver;
        rs2.c cVar = this.deviceInfo;
        if (cVar != null) {
            bVar.c(cVar.getF92746j(), deviceName, status);
        } else {
            s.m("deviceInfo");
            throw null;
        }
    }

    public final void handleResponseStatusLow(GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus status, String deviceName) {
        status.getClass();
        deviceName.getClass();
        String string = this.context.getString(R.string.msg_device_low_battery, deviceName);
        string.getClass();
        Context context = this.context;
        String string2 = context.getString(R.string.pn_low_device_battery);
        string2.getClass();
        h1.b(context, 43, string2, string, getAction(), true);
        bc0.b bVar = this.batteryStatusObserver;
        rs2.c cVar = this.deviceInfo;
        if (cVar != null) {
            bVar.c(cVar.getF92746j(), deviceName, status);
        } else {
            s.m("deviceInfo");
            throw null;
        }
    }

    public final void handleResponseStatusLowPulseOx(GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus status, String deviceName) {
        status.getClass();
        deviceName.getClass();
        String string = this.context.getString(R.string.msg_device_low_battery_for_pulse_ox, deviceName);
        string.getClass();
        Context context = this.context;
        String string2 = context.getString(R.string.pn_low_device_battery);
        string2.getClass();
        h1.b(context, 43, string2, string, getAction(), false);
        bc0.b bVar = this.batteryStatusObserver;
        rs2.c cVar = this.deviceInfo;
        if (cVar != null) {
            bVar.c(cVar.getF92746j(), deviceName, status);
        } else {
            s.m("deviceInfo");
            throw null;
        }
    }

    public final void handleResponseStatusNormal(GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus status, String deviceName) {
        status.getClass();
        deviceName.getClass();
        sz0.f.a aVar = sz0.f.f161394a;
        Context context = this.context;
        aVar.getClass();
        sz0.f.a.a(43, context);
        bc0.b bVar = this.batteryStatusObserver;
        rs2.c cVar = this.deviceInfo;
        if (cVar != null) {
            bVar.c(cVar.getF92746j(), deviceName, status);
        } else {
            s.m("deviceInfo");
            throw null;
        }
    }

    @Override // dt2.h
    public boolean onProtobufRequest(GDISmartProto.Smart smart, k responder) {
        smart.getClass();
        responder.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceStatus.DeviceStatusService> generatedExtension = GDIDeviceStatusExtension.deviceStatusService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return false;
        }
        GDIDeviceStatus.DeviceStatusService deviceStatusService = (GDIDeviceStatus.DeviceStatusService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (deviceStatusService.hasRemoteDeviceBatteryStatusChangedNotification()) {
            ge1.b.T(this.coroutineScope, null, null, new AnonymousClass1(deviceStatusService.getRemoteDeviceBatteryStatusChangedNotification().getStatus(), this, null), 3);
            return true;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.DEVICES;
        rs2.c cVar = this.deviceInfo;
        if (cVar == null) {
            s.m("deviceInfo");
            throw null;
        }
        String str = "Unhandled DeviceStatusDataHandler service request for device: " + cVar.getF92746j();
        aVar.getClass();
        i2.a.b(a2Var, TAG, str);
        return false;
    }

    @Override // dt2.a
    public void start(rs2.c deviceInfo, dt2.g messenger, ExtensionRegistryLite extensionRegistry) {
        deviceInfo.getClass();
        messenger.getClass();
        extensionRegistry.getClass();
        this.deviceInfo = deviceInfo;
        this.messenger = messenger;
        extensionRegistry.add(GDIDeviceStatusExtension.deviceStatusService);
        messenger.a(this);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.DEVICES;
        String str = "DeviceStatusDataHandler started for device: " + deviceInfo.getF92746j();
        aVar.getClass();
        i2.a.b(a2Var, TAG, str);
    }
}
