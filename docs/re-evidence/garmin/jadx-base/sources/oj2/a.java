package oj2;

import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import dt2.g;
import dt2.h;
import dt2.k;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p13.l0;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Loj2/a;", "Ldt2/a;", "Ldt2/h;", "<init>", "()V", "a", "b", "bt-connected-services_battery-status_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class a implements dt2.a, h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f132395d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rs2.c f132397f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f132393b = m.b(new d());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f132394c = m.b(c.f132398a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet<b> f132396e = new CopyOnWriteArraySet<>();

    public interface b {
        void a();
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo53/b0;", "invoke", "()Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends w implements e23.a<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f132398a = new c();

        public c() {
            super(0);
        }

        @Override // e23.a
        public final b0 invoke() {
            return q2.l("BatteryStatusHandler");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends w implements e23.a<Logger> {
        public d() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            StringBuilder sb3 = new StringBuilder("BatteryStatusHandler@");
            rs2.c cVar = a.this.f132397f;
            sb3.append(cVar != null ? cVar.getF172493a() : null);
            return LoggerFactory.getLogger(sb3.toString());
        }
    }

    static {
        new C2515a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(v13.c cVar) throws Exception {
        oj2.c cVar2;
        a aVar;
        GDIDeviceStatus.DeviceStatusService deviceStatusServiceB;
        if (cVar instanceof oj2.c) {
            cVar2 = (oj2.c) cVar;
            int i14 = cVar2.f132405d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f132405d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new oj2.c(this, cVar);
            }
        } else {
            cVar2 = new oj2.c(this, cVar);
        }
        Object objB = cVar2.f132403b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f132405d;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = cVar2.f132402a;
            try {
                r.b(objB);
                deviceStatusServiceB = ru2.a.b((GDISmartProto.Smart) objB);
                if (deviceStatusServiceB != null || !deviceStatusServiceB.hasRemoteDeviceBatteryStatusResponse()) {
                    throw new IllegalStateException("Missing DeviceBatteryStatusResponse");
                }
                if (deviceStatusServiceB.getRemoteDeviceBatteryStatusResponse().hasCurrentBatteryLevel()) {
                    o72.t.k(deviceStatusServiceB.getRemoteDeviceBatteryStatusResponse().getCurrentBatteryLevel());
                    aVar.getClass();
                }
                GDIDeviceStatus.RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse = deviceStatusServiceB.getRemoteDeviceBatteryStatusResponse();
                remoteDeviceBatteryStatusResponse.getClass();
                return remoteDeviceBatteryStatusResponse;
            } catch (Exception e4) {
                e = e4;
                Object value = aVar.f132393b.getValue();
                value.getClass();
                ((Logger) value).error("requestBatteryStatus: " + e.getMessage(), (Throwable) e);
                throw e;
            }
        }
        r.b(objB);
        try {
            GDIDeviceStatus.DeviceStatusService.Builder remoteDeviceBatteryStatusRequest = GDIDeviceStatus.DeviceStatusService.newBuilder().setRemoteDeviceBatteryStatusRequest(GDIDeviceStatus.RemoteDeviceBatteryStatusRequest.newBuilder());
            g gVar = this.f132395d;
            if (gVar == null) {
                throw new IllegalStateException("Handler not started");
            }
            GDISmartProto.Smart smartA = ru2.a.a(remoteDeviceBatteryStatusRequest);
            smartA.getClass();
            cVar2.f132402a = this;
            cVar2.f132405d = 1;
            objB = gVar.b(smartA, cVar2);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = this;
            deviceStatusServiceB = ru2.a.b((GDISmartProto.Smart) objB);
            if (deviceStatusServiceB != null) {
            }
            throw new IllegalStateException("Missing DeviceBatteryStatusResponse");
        } catch (Exception e14) {
            e = e14;
            aVar = this;
            Object value2 = aVar.f132393b.getValue();
            value2.getClass();
            ((Logger) value2).error("requestBatteryStatus: " + e.getMessage(), (Throwable) e);
            throw e;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        c0.d((b0) this.f132394c.getValue(), "closed");
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        GDIDeviceStatus.DeviceStatusService deviceStatusServiceB = ru2.a.b(smart);
        if (deviceStatusServiceB == null || !deviceStatusServiceB.hasRemoteDeviceBatteryStatusChangedNotification()) {
            return false;
        }
        GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification = deviceStatusServiceB.getRemoteDeviceBatteryStatusChangedNotification();
        remoteDeviceBatteryStatusChangedNotification.getClass();
        Iterator<b> it = this.f132396e.iterator();
        while (it.hasNext()) {
            ge1.b.T((b0) this.f132394c.getValue(), null, null, new oj2.b(it.next(), remoteDeviceBatteryStatusChangedNotification, null), 3);
        }
        return true;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        GDIDeviceStatusExtension.registerAllExtensions(extensionRegistryLite);
        GDIDeviceStatus.registerAllExtensions(extensionRegistryLite);
        this.f132397f = cVar;
        Object value = this.f132393b.getValue();
        value.getClass();
        ((Logger) value).debug("start()");
        ((dt2.d) gVar).f61154i.add(this);
        this.f132395d = gVar;
    }

    /* JADX INFO: renamed from: oj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loj2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "bt-connected-services_battery-status_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class C2515a {
        public /* synthetic */ C2515a(j jVar) {
            this();
        }

        private C2515a() {
        }
    }
}
