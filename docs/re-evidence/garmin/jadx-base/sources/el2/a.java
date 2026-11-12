package el2;

import android.os.SystemClock;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIGarminConnect;
import com.garmin.proto.generated.GDIGarminConnectExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import ok2.a0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u;
import us2.f;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lel2/a;", "Ldt2/c;", "Ldt2/h;", "Lel2/e;", "delegate", "<init>", "(Lel2/e;)V", "a", "b", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements dt2.c, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f64539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f64540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f64541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rs2.c f64542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f64543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f64544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GDIGarminConnect.ServerFeatureCapabilities f64545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f64546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set<Integer> f64547j;

    public interface b {
        void a();

        void b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.gc.device.ConnectTransferService$onProtobufRequest$1", f = "ConnectTransferService.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64548a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f64550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GDIGarminConnect.CheckDownloadQueueRequest f64551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f64552e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GDISmartProto.Smart smart, GDIGarminConnect.CheckDownloadQueueRequest checkDownloadQueueRequest, k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f64550c = smart;
            this.f64551d = checkDownloadQueueRequest;
            this.f64552e = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f64550c, this.f64551d, this.f64552e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64548a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                b bVar = aVar2.f64544g;
                if (bVar != null) {
                    bVar.b();
                }
                GDIGarminConnect.CheckDownloadQueueRequest checkDownloadQueueRequest = this.f64551d;
                checkDownloadQueueRequest.getClass();
                this.f64548a = 1;
                if (a.c(aVar2, checkDownloadQueueRequest, this.f64552e, this) == aVar) {
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
    @v13.e(c = "com.garmin.device.filetransfer.gc.device.ConnectTransferService$onProtobufRequest$2", f = "ConnectTransferService.kt", l = {190}, m = "invokeSuspend")
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64553a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f64555c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GDISmartProto.Smart smart, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f64555c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new d(this.f64555c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64553a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                b bVar = aVar2.f64544g;
                if (bVar != null) {
                    bVar.b();
                }
                GDIGarminConnect.Priority priority = GDIGarminConnect.Priority.STANDARD;
                this.f64553a = 1;
                if (aVar2.d(priority, this) == aVar) {
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

    static {
        new C1369a(null);
    }

    public a(e eVar) {
        eVar.getClass();
        this.f64539b = eVar;
        x53.c cVar = s0.f129406a;
        this.f64540c = zl.a.e("ConnectTransferService", x53.b.f189152a.plus(ge1.b.h()));
        this.f64544g = eVar instanceof b ? (b) eVar : null;
        this.f64547j = u.m0(new Integer[]{90, 97});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object c(a aVar, GDIGarminConnect.CheckDownloadQueueRequest checkDownloadQueueRequest, k kVar, v13.c cVar) {
        el2.b bVar;
        GDIGarminConnect.CheckDownloadQueueResponse.Status status;
        aVar.getClass();
        if (cVar instanceof el2.b) {
            bVar = (el2.b) cVar;
            int i14 = bVar.f64559d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f64559d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new el2.b(aVar, cVar);
            }
        } else {
            bVar = new el2.b(aVar, cVar);
        }
        Object obj = bVar.f64557b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f64559d;
        try {
            if (i15 == 0) {
                r.b(obj);
                if (aVar.f64539b.a()) {
                    status = GDIGarminConnect.CheckDownloadQueueResponse.Status.SUCCESS;
                    long j8 = checkDownloadQueueRequest.getPriority() == GDIGarminConnect.Priority.USER_INITIATED ? 60000L : 600000L;
                    long j14 = aVar.f64546i;
                    if (j14 != 0) {
                        long j15 = j14 + j8;
                        a0.f132585h.getClass();
                        a0.f132587j.getClass();
                        if (j15 <= SystemClock.elapsedRealtime()) {
                            a0.f132585h.getClass();
                            a0.f132587j.getClass();
                            aVar.f64546i = SystemClock.elapsedRealtime();
                            ge1.b.T(aVar.f64540c, null, null, new el2.c(aVar, checkDownloadQueueRequest, null), 3);
                        } else {
                            Logger logger = aVar.f64541d;
                            if (logger == null) {
                                s.m("logger");
                                throw null;
                            }
                            logger.debug("Skip CheckDownloadRequest since last check within " + (j8 / ((long) 1000)) + " seconds");
                        }
                    } else {
                        a0.f132585h.getClass();
                        a0.f132587j.getClass();
                        aVar.f64546i = SystemClock.elapsedRealtime();
                        ge1.b.T(aVar.f64540c, null, null, new el2.c(aVar, checkDownloadQueueRequest, null), 3);
                    }
                } else {
                    status = GDIGarminConnect.CheckDownloadQueueResponse.Status.FAIL_NO_CONNECTIVITY;
                }
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGarminConnectExtension.garminConnectService, GDIGarminConnect.Service.newBuilder().setCheckDownloadQueueResponse(GDIGarminConnect.CheckDownloadQueueResponse.newBuilder().setStatus(status)).build()).build();
                smartBuild.getClass();
                b bVar2 = aVar.f64544g;
                if (bVar2 != null) {
                    bVar2.a();
                }
                bVar.f64556a = aVar;
                bVar.f64559d = 1;
                if (kVar.a(smartBuild, bVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a aVar2 = bVar.f64556a;
                r.b(obj);
            }
        } catch (Exception e4) {
            Logger logger2 = aVar.f64541d;
            if (logger2 == null) {
                s.m("logger");
                throw null;
            }
            logger2.error("Failed to respond to CheckDownloadQueueRequest", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        c0.d(this.f64540c, "ConnectTransferService closed");
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        GDIGarminConnectExtension.registerAllExtensions(extensionRegistryLite);
        GDIGarminConnect.registerAllExtensions(extensionRegistryLite);
        GDIGarminConnect.ClientFeatureCapabilities.Builder builderNewBuilder = GDIGarminConnect.ClientFeatureCapabilities.newBuilder();
        e eVar = this.f64539b;
        eVar.getClass();
        builder.setExtension(GDIGarminConnect.requestGarminConnectCapabilites, builderNewBuilder.setVersion(2).setWellnessThresholdMetSupport(eVar.b()).build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:54:0x00ce, B:56:0x00d2, B:59:0x00db, B:62:0x00e5, B:64:0x00eb, B:66:0x00ef, B:68:0x010f, B:69:0x0112, B:70:0x0113, B:72:0x0117, B:74:0x011d, B:75:0x0120, B:46:0x00a1, B:48:0x00ba, B:49:0x00bd, B:51:0x00c1, B:76:0x0121, B:77:0x0126), top: B:85:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:54:0x00ce, B:56:0x00d2, B:59:0x00db, B:62:0x00e5, B:64:0x00eb, B:66:0x00ef, B:68:0x010f, B:69:0x0112, B:70:0x0113, B:72:0x0117, B:74:0x011d, B:75:0x0120, B:46:0x00a1, B:48:0x00ba, B:49:0x00bd, B:51:0x00c1, B:76:0x0121, B:77:0x0126), top: B:85:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0121 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:54:0x00ce, B:56:0x00d2, B:59:0x00db, B:62:0x00e5, B:64:0x00eb, B:66:0x00ef, B:68:0x010f, B:69:0x0112, B:70:0x0113, B:72:0x0117, B:74:0x011d, B:75:0x0120, B:46:0x00a1, B:48:0x00ba, B:49:0x00bd, B:51:0x00c1, B:76:0x0121, B:77:0x0126), top: B:85:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cb, code lost:
    
        if (r10 == r2) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.garmin.proto.generated.GDIGarminConnect$Priority] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.garmin.proto.generated.GDIGarminConnect$CutWellnessFilesRequest$Builder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.garmin.proto.generated.GDIGarminConnect$Priority, el2.a] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum d(GDIGarminConnect.Priority priority, v13.c cVar) {
        el2.d dVar;
        GDIGarminConnect.ServerFeatureCapabilities serverFeatureCapabilities;
        ?? r14;
        a aVar;
        a aVar2;
        GDISmartProto.Smart smartBuild;
        b bVar;
        g gVar;
        ?? r15;
        GDIGarminConnect.Service service;
        if (cVar instanceof el2.d) {
            dVar = (el2.d) cVar;
            int i14 = dVar.f64567e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f64567e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new el2.d(this, cVar);
            }
        } else {
            dVar = new el2.d(this, cVar);
        }
        Object objB = dVar.f64565c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f64567e;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    GDIGarminConnect.Priority priority2 = dVar.f64564b;
                    aVar2 = dVar.f64563a;
                    r.b(objB);
                    r15 = priority2;
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = dVar.f64563a;
                    r.b(objB);
                }
                GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
                if (smart != null) {
                    GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGarminConnect.Service> generatedExtension = GDIGarminConnectExtension.garminConnectService;
                    service = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIGarminConnect.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
                }
                if (service == null || !service.hasCutWellnessFilesResponse()) {
                    Logger logger = aVar.f64541d;
                    if (logger != null) {
                        logger.warn("sendCutWellnessFilesRequest missing response status");
                        return null;
                    }
                    s.m("logger");
                    throw null;
                }
                Logger logger2 = aVar.f64541d;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.debug("sendCutWellnessFilesRequest status=" + service.getCutWellnessFilesResponse().getStatus());
                return service.getCutWellnessFilesResponse().getStatus();
            }
            r.b(objB);
            e eVar = this.f64539b;
            if (eVar.b() && (serverFeatureCapabilities = this.f64545h) != null && serverFeatureCapabilities.getWellnessSupport()) {
                if (!eVar.a()) {
                    Logger logger3 = this.f64541d;
                    if (logger3 != null) {
                        logger3.debug("sendCutWellnessFilesRequest skipped because network not available");
                        return null;
                    }
                    s.m("logger");
                    throw null;
                }
                if (eVar instanceof dl2.b) {
                    dVar.f64563a = this;
                    dVar.f64564b = priority;
                    dVar.f64567e = 1;
                    if (hl2.b.c((dl2.b) eVar, dVar, 3) != aVar3) {
                        aVar2 = this;
                        r15 = priority;
                    }
                } else {
                    r14 = priority;
                    aVar = this;
                    if (aVar.f64539b.d()) {
                        smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGarminConnectExtension.garminConnectService, GDIGarminConnect.Service.newBuilder().setCutWellnessFilesRequest(GDIGarminConnect.CutWellnessFilesRequest.newBuilder().setPriority(r14)).build()).build();
                        smartBuild.getClass();
                        bVar = aVar.f64544g;
                        if (bVar != null) {
                            bVar.a();
                        }
                        gVar = aVar.f64543f;
                        if (gVar != null) {
                            s.m("messenger");
                            throw null;
                        }
                        dVar.f64563a = aVar;
                        dVar.f64564b = null;
                        dVar.f64567e = 2;
                        objB = gVar.b(smartBuild, dVar);
                    }
                }
                return aVar3;
            }
            return null;
            r14 = r15;
            aVar = aVar2;
            if (aVar.f64539b.d()) {
                smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGarminConnectExtension.garminConnectService, GDIGarminConnect.Service.newBuilder().setCutWellnessFilesRequest(GDIGarminConnect.CutWellnessFilesRequest.newBuilder().setPriority(r14)).build()).build();
                smartBuild.getClass();
                bVar = aVar.f64544g;
                if (bVar != null) {
                    bVar.a();
                }
                gVar = aVar.f64543f;
                if (gVar != null) {
                    s.m("messenger");
                    throw null;
                }
                dVar.f64563a = aVar;
                dVar.f64564b = null;
                dVar.f64567e = 2;
                objB = gVar.b(smartBuild, dVar);
            }
            return null;
        } catch (Exception e4) {
            Logger logger4 = priority.f64541d;
            if (logger4 != null) {
                logger4.error("Failed sendCutWellnessFilesRequest", (Throwable) e4);
                return null;
            }
            s.m("logger");
            throw null;
        }
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f64547j;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGarminConnect.Service> generatedExtension = GDIGarminConnectExtension.garminConnectService;
        GDIGarminConnect.Service service = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIGarminConnect.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (service != null) {
            try {
                boolean zHasCheckDownloadQueueRequest = service.hasCheckDownloadQueueRequest();
                u53.d dVar = this.f64540c;
                try {
                    if (zHasCheckDownloadQueueRequest) {
                        ge1.b.T(dVar, null, null, new c(smart, service.getCheckDownloadQueueRequest(), kVar, null), 3);
                        return true;
                    }
                    if (service.hasWellnessThresholdMetNotification()) {
                        ge1.b.T(dVar, null, null, new d(smart, null), 3);
                        return true;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            Throwable th5 = th;
            Logger logger = this.f64541d;
            if (logger != null) {
                logger.error("Error parsing notification", th5);
                return false;
            }
            s.m("logger");
            throw null;
        }
        return false;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIGarminConnect.ServerFeatureCapabilities> generatedExtension = GDIGarminConnect.responseGarminConnectCapabilites;
        this.f64545h = featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDIGarminConnect.ServerFeatureCapabilities) featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f64541d = LoggerFactory.getLogger("GCFT#ConnectTransferService[" + ((f) cVar).f172493a + "]");
        this.f64542e = cVar;
        this.f64543f = gVar;
        ((dt2.d) gVar).f61154i.add(this);
    }

    /* JADX INFO: renamed from: el2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lel2/a$a;", "", "<init>", "()V", "", "CONNECT_TRANSFER_VERSION", "I", "CONNECT_TRANSFER_SERVICE_CONFIG_FLAG", "", "DOWNLOAD_QUEUE_STANDARD_INTERVAL", "J", "DOWNLOAD_QUEUE_USER_INTERVAL", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1369a {
        public /* synthetic */ C1369a(j jVar) {
            this();
        }

        private C1369a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? hl2.b.a(a0.f132585h.a()) : eVar);
    }
}
