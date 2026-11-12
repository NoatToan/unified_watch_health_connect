package ts2;

import androidx.room.a0;
import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import com.garmin.proto.generated.GDIConnectedDevicesReportingExtension;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.h0;
import p13.j0;
import p13.y;
import zy2.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lts2/b;", "Ldt2/c;", "Ldt2/a;", "Ldt2/h;", "<init>", "()V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements dt2.c, dt2.a, dt2.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final az2.a<Long, Set<GDIConnectedDevicesReporting.ConnectedDevice>> f166194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final az2.b<Long> f166195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final az2.a<Long, b> f166196k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f166197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f166198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f166199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dt2.g f166200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f166201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Integer> f166202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GDIConnectedDevicesReporting.CapabilitiesResponse f166203h;

    /* JADX INFO: renamed from: ts2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler$onProtobufRequest$1$1", f = "ConnectedDevicesHandler.kt", l = {169}, m = "invokeSuspend")
    public static final class C3127b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166204a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIConnectedDevicesReporting.Service f166206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f166207d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3127b(GDIConnectedDevicesReporting.Service service, dt2.k kVar, t13.d<? super C3127b> dVar) {
            super(2, dVar);
            this.f166206c = service;
            this.f166207d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C3127b(this.f166206c, this.f166207d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3127b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166204a;
            if (i14 == 0) {
                r.b(obj);
                GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest = this.f166206c.getConnectionAlertRegistrationRequest();
                connectionAlertRegistrationRequest.getClass();
                this.f166204a = 1;
                if (b.this.r(connectionAlertRegistrationRequest, this.f166207d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler$onProtobufRequest$1$2", f = "ConnectedDevicesHandler.kt", l = {175}, m = "invokeSuspend")
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166208a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dt2.k f166210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(dt2.k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f166210c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(this.f166210c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166208a;
            if (i14 == 0) {
                r.b(obj);
                this.f166208a = 1;
                if (b.this.q(this.f166210c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler$receiveCapabilities$2$1", f = "ConnectedDevicesHandler.kt", l = {156}, m = "invokeSuspend")
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f166212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f166213c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z14, b bVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f166212b = z14;
            this.f166213c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f166212b, this.f166213c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166211a;
            if (i14 == 0) {
                r.b(obj);
                if (this.f166212b) {
                    b bVar = this.f166213c;
                    String strF = a0.f(bVar.f166199d, "receiveCapabilities(", ")");
                    this.f166211a = 1;
                    if (bVar.p(strF, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f166194i = new az2.a<>();
        f166195j = new az2.b<>();
        f166196k = new az2.a<>();
    }

    public b() {
        x53.c cVar = s0.f129406a;
        this.f166198c = zl.a.e("ConnectedDevicesHandler", x53.b.f189152a.plus(ge1.b.h()));
        this.f166199d = -1L;
        this.f166202g = a1.b(117);
    }

    public final GDIConnectedDevicesReporting.ConnectedDevice c() {
        GDIConnectedDevicesReporting.ConnectedDevice self;
        GDIConnectedDevicesReporting.CapabilitiesResponse capabilitiesResponse = this.f166203h;
        if (capabilitiesResponse != null) {
            if (!capabilitiesResponse.hasSelf() || !capabilitiesResponse.getSelf().hasUnitId()) {
                capabilitiesResponse = null;
            }
            if (capabilitiesResponse != null && (self = capabilitiesResponse.getSelf()) != null) {
                return self;
            }
        }
        try {
            return GDIConnectedDevicesReporting.ConnectedDevice.newBuilder().setUnitId((int) this.f166199d).build();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        GDIConnectedDevicesReporting.ConnectedDevice connectedDeviceC;
        str.getClass();
        rs2.d.f154380a.getClass();
        b bVarRemove = f166196k.f13782a.remove(Long.valueOf(this.f166199d));
        if (bVarRemove != null && (connectedDeviceC = bVarRemove.c()) != null) {
            ArrayList<b> arrayListD = d();
            if (arrayListD.isEmpty()) {
                l().debug("notifyDisconnectedDevices: No devices track this device");
            } else {
                for (b bVar : arrayListD) {
                    bVar.getClass();
                    ge1.b.T(zl.a.e("ConnectedDevicesHandler-disconnect", s0.f129406a.plus(ge1.b.h())), null, null, new e(connectedDeviceC, bVar, null), 3);
                }
            }
        }
        f166195j.remove(Long.valueOf(this.f166199d));
        c0.d(this.f166198c, "ConnectedDevicesHandler closed");
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        zy2.c cVar2 = zy2.c.f207527a;
        rs2.d dVar = rs2.d.f154380a;
        String f172493a = cVar.getF172493a();
        long f172494b = cVar.getF172494b();
        dVar.getClass();
        this.f166197b = cVar2.a(rs2.d.a("ConnectedDevicesHandler", f172494b, null, f172493a));
        this.f166199d = cVar.getF172494b();
        GDIConnectedDevicesReportingExtension.registerAllExtensions(extensionRegistryLite);
        GDIConnectedDevicesReporting.registerAllExtensions(extensionRegistryLite);
        builder.setExtension(GDIConnectedDevicesReporting.CapabilitiesRequest.featuresRequest, GDIConnectedDevicesReporting.CapabilitiesRequest.newBuilder().setDeviceConnectionAlertsSupported(true).setRequestsSupported(true).build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    public final ArrayList d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, b> entry : f166196k.entrySet()) {
            Set<GDIConnectedDevicesReporting.ConnectedDevice> set = f166194i.f13782a.get(Long.valueOf(entry.getKey().longValue()));
            if (set != null) {
                Set<GDIConnectedDevicesReporting.ConnectedDevice> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator<T> it = set2.iterator();
                    while (it.hasNext()) {
                        if (ts2.a.b((GDIConnectedDevicesReporting.ConnectedDevice) it.next()) == this.f166199d) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.add((b) ((Map.Entry) it3.next()).getValue());
        }
        return arrayList;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f166202g;
    }

    public final k l() {
        k kVar = this.f166197b;
        if (kVar != null) {
            return kVar;
        }
        s.m("logger");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0119, please report this as an issue */
    public final Object m(String str, v13.c cVar) {
        ts2.c cVar2;
        List list;
        List list2;
        GDISmartProto.Smart smart;
        GDIConnectedDevicesReporting.Service serviceA;
        GDIConnectedDevicesReporting.DevicesConnectedResponse deviceConnectedResponse;
        ArrayList arrayList;
        Iterator it;
        GDIConnectedDevicesReporting.ConnectedDevice connectedDeviceC;
        if (cVar instanceof ts2.c) {
            cVar2 = (ts2.c) cVar;
            int i14 = cVar2.f166217d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f166217d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new ts2.c(this, cVar);
            }
        } else {
            cVar2 = new ts2.c(this, cVar);
        }
        Object obj = cVar2.f166215b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f166217d;
        if (i15 == 0) {
            r.b(obj);
            rs2.d.f154380a.getClass();
            Set<GDIConnectedDevicesReporting.ConnectedDevice> set = f166194i.f13782a.get(Long.valueOf(this.f166199d));
            if (set != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    b bVar = f166196k.f13782a.get(Long.valueOf(ts2.a.b((GDIConnectedDevicesReporting.ConnectedDevice) it3.next())));
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                }
                list = arrayList2;
            } else {
                list = j0.f134944a;
            }
            if (!list.isEmpty()) {
                GDIConnectedDevicesReporting.Service.Builder builderNewBuilder = GDIConnectedDevicesReporting.Service.newBuilder();
                GDIConnectedDevicesReporting.DevicesConnectedRequest.Builder builderNewBuilder2 = GDIConnectedDevicesReporting.DevicesConnectedRequest.newBuilder();
                List list3 = list;
                ArrayList arrayList3 = new ArrayList(y.r(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((b) it4.next()).c());
                }
                GDIConnectedDevicesReporting.Service.Builder deviceConnectedRequest = builderNewBuilder.setDeviceConnectedRequest(builderNewBuilder2.addAllOther(arrayList3));
                deviceConnectedRequest.getClass();
                cVar2.f166214a = list;
                cVar2.f166217d = 1;
                Object objS = s(deviceConnectedRequest, cVar2);
                if (objS != obj2) {
                    List list4 = list;
                    obj = objS;
                    list2 = list4;
                    smart = (GDISmartProto.Smart) obj;
                    if (smart != null) {
                        serviceA = ou2.a.a(smart);
                        if (serviceA == null) {
                            deviceConnectedResponse = null;
                        } else {
                            deviceConnectedResponse = null;
                        }
                        k kVarL = l();
                        arrayList = new ArrayList();
                        it = list2.iterator();
                        while (it.hasNext()) {
                            connectedDeviceC = ((b) it.next()).c();
                            if (connectedDeviceC != null) {
                                arrayList.add(connectedDeviceC);
                            }
                        }
                        kVarL.info("notifyConnectedDevices: ".concat(ts2.a.a(arrayList, deviceConnectedResponse != null ? deviceConnectedResponse.getStatusList() : null)));
                    }
                }
                return obj2;
            }
            l().debug("notifyConnectedDevices(" + str + "): No devices relevant to this device");
        } else if (i15 == 1) {
            list2 = (List) cVar2.f166214a;
            r.b(obj);
            smart = (GDISmartProto.Smart) obj;
            if (smart != null) {
                serviceA = ou2.a.a(smart);
                if (serviceA == null && serviceA.hasDeviceConnectedResponse()) {
                    deviceConnectedResponse = serviceA.getDeviceConnectedResponse();
                } else {
                    deviceConnectedResponse = null;
                }
                k kVarL2 = l();
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    connectedDeviceC = ((b) it.next()).c();
                    if (connectedDeviceC != null) {
                        arrayList.add(connectedDeviceC);
                    }
                }
                kVarL2.info("notifyConnectedDevices: ".concat(ts2.a.a(arrayList, deviceConnectedResponse != null ? deviceConnectedResponse.getStatusList() : null)));
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Iterator it5 = (Iterator) cVar2.f166214a;
            r.b(obj);
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                String strF = a0.f(this.f166199d, "notifyAboutConnection(", ")");
                cVar2.f166214a = it5;
                cVar2.f166217d = 2;
                if (bVar2.m(strF, cVar2) == obj2) {
                    return obj2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        smart.getClass();
        GDIConnectedDevicesReporting.Service serviceA = ou2.a.a(smart);
        if (serviceA == null) {
            return false;
        }
        boolean zHasConnectionAlertRegistrationRequest = serviceA.hasConnectionAlertRegistrationRequest();
        u53.d dVar = this.f166198c;
        if (zHasConnectionAlertRegistrationRequest) {
            ge1.b.T(dVar, null, null, new C3127b(serviceA, kVar, null), 3);
            return true;
        }
        if (!serviceA.hasConnectedDevicesRequest()) {
            return false;
        }
        ge1.b.T(dVar, null, null, new c(kVar, null), 3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(String str, v13.c cVar) {
        ts2.d dVar;
        List list;
        String str2;
        Iterator it;
        if (cVar instanceof ts2.d) {
            dVar = (ts2.d) cVar;
            int i14 = dVar.f166223f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f166223f = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new ts2.d(this, cVar);
            }
        } else {
            dVar = new ts2.d(this, cVar);
        }
        Object obj = dVar.f166221d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f166223f;
        if (i15 == 0) {
            r.b(obj);
            ArrayList arrayListD = d();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListD) {
                if (((b) obj2).f166199d != this.f166199d) {
                    arrayList.add(obj2);
                }
            }
            if (str == null) {
                str = a0.f(this.f166199d, "notifyAboutConnection(", ")");
            }
            Iterator it3 = arrayList.iterator();
            list = arrayList;
            str2 = str;
            it = it3;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = dVar.f166220c;
            str2 = dVar.f166219b;
            list = dVar.f166218a;
            r.b(obj);
        }
        while (it.hasNext()) {
            b bVar = (b) it.next();
            dVar.f166218a = list;
            dVar.f166219b = str2;
            dVar.f166220c = it;
            dVar.f166223f = 1;
            if (bVar.m(str2, dVar) == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(dt2.k kVar, v13.c cVar) {
        f fVar;
        GDIConnectedDevicesReporting.ConnectedDevice.Builder unitId;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f166229c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f166229c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f166227a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f166229c;
        try {
            if (i15 == 0) {
                r.b(obj);
                l().info("onConnectedDevicesRequest: Received request for currently connected devices");
                GDIConnectedDevicesReporting.ConnectedDevicesResponse.Builder builderNewBuilder = GDIConnectedDevicesReporting.ConnectedDevicesResponse.newBuilder();
                Iterator<Long> it = f166195j.iterator();
                while (it.hasNext()) {
                    try {
                        unitId = GDIConnectedDevicesReporting.ConnectedDevice.newBuilder().setUnitId((int) it.next().longValue());
                    } catch (Throwable unused) {
                        unitId = null;
                    }
                    if (unitId != null) {
                        builderNewBuilder.addConnectedDevices(unitId);
                    }
                }
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIConnectedDevicesReportingExtension.connectedDevicesReportingService, GDIConnectedDevicesReporting.Service.newBuilder().setConnectedDevicesResponse(builderNewBuilder).build()).build();
                smartBuild.getClass();
                fVar.f166229c = 1;
                if (kVar.a(smartBuild, fVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Throwable th3) {
            l().error("onConnectedDevicesRequest: Failed to send response: " + th3.getMessage(), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest, dt2.k kVar, v13.c cVar) {
        g gVar;
        b bVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f166233d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f166233d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objP = gVar.f166231b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f166233d;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objP);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = gVar.f166230a;
                r.b(objP);
            }
            bVar.f166201f = ((Boolean) objP).booleanValue();
            return Unit.INSTANCE;
        }
        r.b(objP);
        az2.a<Long, Set<GDIConnectedDevicesReporting.ConnectedDevice>> aVar2 = f166194i;
        Long l14 = new Long(this.f166199d);
        List<GDIConnectedDevicesReporting.ConnectedDevice> trackedDevicesList = connectionAlertRegistrationRequest.getTrackedDevicesList();
        trackedDevicesList.getClass();
        aVar2.put(l14, h0.g1(trackedDevicesList));
        k kVarL = l();
        List<GDIConnectedDevicesReporting.ConnectedDevice> trackedDevicesList2 = connectionAlertRegistrationRequest.getTrackedDevicesList();
        trackedDevicesList2.getClass();
        kVarL.info("onConnectionAlert: Registered for devices: [" + ts2.a.a(trackedDevicesList2, null) + "]");
        ge1.b.T(this.f166198c, null, null, new h(kVar, this, null), 3);
        String strF = a0.f(this.f166199d, "onConnectionAlert(", ")");
        gVar.f166233d = 1;
        if (m(strF, gVar) != aVar) {
        }
        return aVar;
        if (!this.f166201f) {
            String strF2 = a0.f(this.f166199d, "onConnectionAlert(", ")");
            gVar.f166230a = this;
            gVar.f166233d = 2;
            objP = p(strF2, gVar);
            if (objP != aVar) {
                bVar = this;
                bVar.f166201f = ((Boolean) objP).booleanValue();
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIConnectedDevicesReporting.CapabilitiesResponse> generatedExtension = GDIConnectedDevicesReporting.CapabilitiesResponse.featuresResponse;
        this.f166203h = featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDIConnectedDevicesReporting.CapabilitiesResponse) featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
        k kVarL = l();
        GDIConnectedDevicesReporting.CapabilitiesResponse capabilitiesResponse = this.f166203h;
        kVarL.info("Received feature capabilities: device[" + (capabilitiesResponse != null ? capabilitiesResponse.getSelf() : null) + "]");
        GDIConnectedDevicesReporting.CapabilitiesResponse capabilitiesResponse2 = this.f166203h;
        if (capabilitiesResponse2 != null) {
            if (!capabilitiesResponse2.hasSelf()) {
                capabilitiesResponse2 = null;
            }
            if (capabilitiesResponse2 == null || capabilitiesResponse2.getSelf() == null) {
                return;
            }
            f166196k.put(Long.valueOf(this.f166199d), this);
            ArrayList arrayListD = d();
            boolean z14 = false;
            if (!arrayListD.isEmpty()) {
                Iterator it = arrayListD.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()).f166199d != this.f166199d) {
                        z14 = true;
                        break;
                    }
                }
            }
            if (z14) {
                this.f166201f = true;
            }
            ge1.b.T(this.f166198c, null, null, new d(z14, this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(GDIConnectedDevicesReporting.Service.Builder builder, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f166239c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f166239c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f166237a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f166239c;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            GDIConnectedDevicesReporting.CapabilitiesResponse capabilitiesResponse = this.f166203h;
            if ((capabilitiesResponse != null ? capabilitiesResponse.getSelf() : null) == null) {
                return null;
            }
            dt2.g gVar = this.f166200e;
            if (gVar == null) {
                s.m("messenger");
                throw null;
            }
            GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIConnectedDevicesReportingExtension.connectedDevicesReportingService, builder.build()).build();
            smartBuild.getClass();
            iVar.f166239c = 1;
            Object objB = gVar.b(smartBuild, iVar);
            return objB == aVar ? aVar : objB;
        } catch (Throwable th3) {
            l().error("sendRequest: Failed to send: " + th3.getMessage(), null);
            return null;
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f166200e = gVar;
        ((dt2.d) gVar).f61154i.add(this);
        f166195j.add(Long.valueOf(((us2.f) cVar).f172494b));
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lts2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Laz2/a;", "", "", "Lcom/garmin/proto/generated/GDIConnectedDevicesReporting$ConnectedDevice;", "TRACKED_DEVICES", "Laz2/a;", "Laz2/b;", "ALL_AVAILABLE_DEVICES", "Laz2/b;", "", "CONNECTED_DEVICES_REPORTING_FLAG", "I", "Lts2/b;", "AVAILABLE_DEVICES", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
