package y92;

import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ly92/b;", "Ldt2/a;", "Ldt2/h;", "Lkotlin/Function2;", "Ly92/w;", "Lrs2/c;", "", "onPasscodeStatusNotification", "<init>", "(Le23/p;)V", "a", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements dt2.a, dt2.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<w, rs2.c, Unit> f195292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rs2.c f195293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dt2.g f195294d;

    /* JADX INFO: renamed from: y92.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C3635b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195295a;

        static {
            int[] iArr = new int[GDIDeviceStatus.PasscodeResponseStatus.values().length];
            try {
                iArr[GDIDeviceStatus.PasscodeResponseStatus.PASSCODE_STATUS_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f195295a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.p<? super w, ? super rs2.c, Unit> pVar) {
        pVar.getClass();
        this.f195292b = pVar;
    }

    public final Object c(e eVar, v13.i iVar) {
        x92.a aVar = x92.a.f189663a;
        rs2.c cVar = this.f195293c;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172496d = cVar.getF172496d();
        rs2.c cVar2 = this.f195293c;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        long f172494b = cVar2.getF172494b();
        rs2.c cVar3 = this.f195293c;
        if (cVar3 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172493a = cVar3.getF172493a();
        StringBuilder sb3 = new StringBuilder("sendAppInitiatedPasscodeSetNotification devicePasscodeSource=");
        sb3.append(eVar);
        sb3.append(" deviceInfo=[deviceName ");
        sb3.append(f172496d);
        sb3.append(", unitId ");
        p6.b.k(f172494b, ", connectionId ", f172493a, sb3);
        sb3.append("]");
        String string = sb3.toString();
        aVar.getClass();
        x92.a.a("DevicePasscodeProtobufHandler", string);
        dt2.g gVar = this.f195294d;
        if (gVar == null) {
            p005kotlin.jvm.internal.s.m("messenger");
            throw null;
        }
        GDISmartProto.Smart smartA = ru2.a.a(GDIDeviceStatus.DeviceStatusService.newBuilder().setAppInitiatedPasscodeSetNotification(GDIDeviceStatus.AppInitiatedPasscodeSetNotification.newBuilder().setSource(eVar.f195304a)));
        smartA.getClass();
        Object objC = gVar.c(smartA, iVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    public final Object d(v80.e.a aVar) {
        x92.a aVar2 = x92.a.f189663a;
        rs2.c cVar = this.f195293c;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172496d = cVar.getF172496d();
        rs2.c cVar2 = this.f195293c;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        long f172494b = cVar2.getF172494b();
        rs2.c cVar3 = this.f195293c;
        if (cVar3 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172493a = cVar3.getF172493a();
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f172494b, "sendRegionRequiresPasscodeNotification deviceInfo=[deviceName ", f172496d, ", unitId ");
        sbJ.append(", connectionId ");
        sbJ.append(f172493a);
        sbJ.append("]");
        String string = sbJ.toString();
        aVar2.getClass();
        x92.a.a("DevicePasscodeProtobufHandler", string);
        dt2.g gVar = this.f195294d;
        if (gVar == null) {
            p005kotlin.jvm.internal.s.m("messenger");
            throw null;
        }
        GDISmartProto.Smart smartA = ru2.a.a(GDIDeviceStatus.DeviceStatusService.newBuilder().setRegionRequiresPasscodeNotification(GDIDeviceStatus.RegionRequiresPasscodeNotification.newBuilder()));
        smartA.getClass();
        Object objC = gVar.c(smartA, aVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return a1.b(112);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) {
        c cVar2;
        GDIDeviceStatus.ResetPasscodeResponse resetPasscodeResponse;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f195298c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f195298c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.f195296a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f195298c;
        if (i15 == 0) {
            o13.r.b(objB);
            x92.a aVar2 = x92.a.f189663a;
            rs2.c cVar3 = this.f195293c;
            if (cVar3 == null) {
                p005kotlin.jvm.internal.s.m("deviceInfo");
                throw null;
            }
            String f172496d = cVar3.getF172496d();
            rs2.c cVar4 = this.f195293c;
            if (cVar4 == null) {
                p005kotlin.jvm.internal.s.m("deviceInfo");
                throw null;
            }
            long f172494b = cVar4.getF172494b();
            rs2.c cVar5 = this.f195293c;
            if (cVar5 == null) {
                p005kotlin.jvm.internal.s.m("deviceInfo");
                throw null;
            }
            String f172493a = cVar5.getF172493a();
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f172494b, "sendResetPasscodeRequest deviceInfo=[deviceName ", f172496d, ", unitId ");
            sbJ.append(", connectionId ");
            sbJ.append(f172493a);
            sbJ.append("]");
            String string = sbJ.toString();
            aVar2.getClass();
            x92.a.a("DevicePasscodeProtobufHandler", string);
            GDIDeviceStatus.DeviceStatusService.Builder resetPasscodeRequest = GDIDeviceStatus.DeviceStatusService.newBuilder().setResetPasscodeRequest(GDIDeviceStatus.ResetPasscodeRequest.newBuilder());
            dt2.g gVar = this.f195294d;
            if (gVar == null) {
                p005kotlin.jvm.internal.s.m("messenger");
                throw null;
            }
            GDISmartProto.Smart smartA = ru2.a.a(resetPasscodeRequest);
            smartA.getClass();
            cVar2.f195298c = 1;
            objB = gVar.b(smartA, cVar2);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        GDIDeviceStatus.DeviceStatusService deviceStatusServiceB = ru2.a.b((GDISmartProto.Smart) objB);
        GDIDeviceStatus.PasscodeResponseStatus responseStatus = (deviceStatusServiceB == null || (resetPasscodeResponse = deviceStatusServiceB.getResetPasscodeResponse()) == null) ? null : resetPasscodeResponse.getResponseStatus();
        x92.a aVar3 = x92.a.f189663a;
        rs2.c cVar6 = this.f195293c;
        if (cVar6 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172496d2 = cVar6.getF172496d();
        rs2.c cVar7 = this.f195293c;
        if (cVar7 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        long f172494b2 = cVar7.getF172494b();
        rs2.c cVar8 = this.f195293c;
        if (cVar8 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172493a2 = cVar8.getF172493a();
        StringBuilder sb3 = new StringBuilder("sendResetPasscodeRequest responseStatus=");
        sb3.append(responseStatus);
        sb3.append(" deviceInfo=[deviceName ");
        sb3.append(f172496d2);
        sb3.append(", unitId ");
        p6.b.k(f172494b2, ", connectionId ", f172493a2, sb3);
        sb3.append("]");
        String string2 = sb3.toString();
        aVar3.getClass();
        x92.a.a("DevicePasscodeProtobufHandler", string2);
        return Boolean.valueOf((responseStatus == null ? -1 : C3635b.f195295a[responseStatus.ordinal()]) == 1);
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceStatus.DeviceStatusService> generatedExtension = GDIDeviceStatusExtension.deviceStatusService;
        GDIDeviceStatus.DeviceStatusService deviceStatusService = smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDIDeviceStatus.DeviceStatusService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
        if (deviceStatusService == null) {
            return false;
        }
        boolean zHasDevicePasscodeInvalidAttemptNotification = deviceStatusService.hasDevicePasscodeInvalidAttemptNotification();
        e23.p<w, rs2.c, Unit> pVar = this.f195292b;
        if (!zHasDevicePasscodeInvalidAttemptNotification) {
            if (!deviceStatusService.hasDeviceUnlockedNotification()) {
                return false;
            }
            x92.a aVar = x92.a.f189663a;
            rs2.c cVar = this.f195293c;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("deviceInfo");
                throw null;
            }
            String f172496d = cVar.getF172496d();
            rs2.c cVar2 = this.f195293c;
            if (cVar2 == null) {
                p005kotlin.jvm.internal.s.m("deviceInfo");
                throw null;
            }
            long f172494b = cVar2.getF172494b();
            rs2.c cVar3 = this.f195293c;
            if (cVar3 == null) {
                p005kotlin.jvm.internal.s.m("deviceInfo");
                throw null;
            }
            String f172493a = cVar3.getF172493a();
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f172494b, "devicePasscodeUnlockedNotification deviceInfo=[deviceName ", f172496d, ", unitId ");
            sbJ.append(", connectionId ");
            sbJ.append(f172493a);
            sbJ.append("]");
            String string = sbJ.toString();
            aVar.getClass();
            x92.a.a("DevicePasscodeProtobufHandler", string);
            w.b bVar = w.b.f195388a;
            rs2.c cVar4 = this.f195293c;
            if (cVar4 != null) {
                pVar.invoke(bVar, cVar4);
                return true;
            }
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        GDIDeviceStatus.DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification = deviceStatusService.getDevicePasscodeInvalidAttemptNotification();
        x92.a aVar2 = x92.a.f189663a;
        int attemptsRemaining = devicePasscodeInvalidAttemptNotification.getAttemptsRemaining();
        rs2.c cVar5 = this.f195293c;
        if (cVar5 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172496d2 = cVar5.getF172496d();
        rs2.c cVar6 = this.f195293c;
        if (cVar6 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        long f172494b2 = cVar6.getF172494b();
        rs2.c cVar7 = this.f195293c;
        if (cVar7 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f172493a2 = cVar7.getF172493a();
        StringBuilder sbR = wr.g.r(attemptsRemaining, "devicePasscodeInvalidAttemptNotification attemptsRemaining=", " deviceInfo=[deviceName ", f172496d2, ", unitId ");
        p6.b.k(f172494b2, ", connectionId ", f172493a2, sbR);
        sbR.append("]");
        String string2 = sbR.toString();
        aVar2.getClass();
        x92.a.a("DevicePasscodeProtobufHandler", string2);
        if (devicePasscodeInvalidAttemptNotification.getAttemptsRemaining() == 0) {
            w.a aVar3 = w.a.f195387a;
            rs2.c cVar8 = this.f195293c;
            if (cVar8 != null) {
                pVar.invoke(aVar3, cVar8);
                return true;
            }
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        w.c cVar9 = new w.c(devicePasscodeInvalidAttemptNotification.getAttemptsRemaining());
        rs2.c cVar10 = this.f195293c;
        if (cVar10 != null) {
            pVar.invoke(cVar9, cVar10);
            return true;
        }
        p005kotlin.jvm.internal.s.m("deviceInfo");
        throw null;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f195293c = cVar;
        this.f195294d = gVar;
        GDIDeviceStatusExtension.registerAllExtensions(extensionRegistryLite);
        GDIDeviceStatus.registerAllExtensions(extensionRegistryLite);
        ((dt2.d) gVar).f61154i.add(this);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly92/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEVICE_STATUS_SUPPORT_CONFIG_BIT", "I", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
