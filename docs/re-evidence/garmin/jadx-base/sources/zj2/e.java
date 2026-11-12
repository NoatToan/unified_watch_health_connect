package zj2;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.datatransfer.DataTransferException;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIDataTransferExtension;
import com.garmin.proto.generated.GDIDataTransferProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import e23.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o13.q;
import o13.r;
import o53.b0;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB'\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0015\b\u0017\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lzj2/e;", "Ldt2/c;", "Ldt2/h;", "Lcz2/a;", "clock", "", "timeout", "Lmk2/d;", "adHocService", "<init>", "(Lcz2/a;JLmk2/d;)V", "(Lmk2/d;)V", "a", "data-transfer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements dt2.c, dt2.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f204964l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cz2.a f204965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f204966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mk2.d f204967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f204968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f204969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f204970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u53.d f204971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Logger f204972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dt2.g f204973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, mk2.a> f204974k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.device.datatransfer.DataTransferService$send$2", f = "DataTransferService.kt", l = {99}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f204976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<q<Unit>, Unit> f204977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f204978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f204979e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "com.garmin.device.datatransfer.DataTransferService$send$2$1", f = "DataTransferService.kt", l = {101}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f204980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f204981b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.l<q<Unit>, Unit> f204982c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f204983d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f204984e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d dVar, e23.l<? super q<Unit>, Unit> lVar, e eVar, int i14, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f204981b = dVar;
                this.f204982c = lVar;
                this.f204983d = eVar;
                this.f204984e = i14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f204981b, this.f204982c, this.f204983d, this.f204984e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                LinkedHashMap linkedHashMap;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f204980a;
                try {
                    try {
                        if (i14 == 0) {
                            r.b(obj);
                            d dVar = this.f204981b;
                            this.f204980a = 1;
                            if (dVar.f(this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i14 != 1) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r.b(obj);
                        }
                        e23.l<q<Unit>, Unit> lVar = this.f204982c;
                        if (lVar != null) {
                            int i15 = q.f128596b;
                            lVar.invoke(q.a(Unit.INSTANCE));
                        }
                        e eVar = this.f204983d;
                        linkedHashMap = eVar.f204968e;
                        int i16 = this.f204984e;
                        synchronized (linkedHashMap) {
                            return Unit.INSTANCE;
                        }
                    } catch (DataTransferException e4) {
                        e23.l<q<Unit>, Unit> lVar2 = this.f204982c;
                        if (lVar2 != null) {
                            int i17 = q.f128596b;
                            lVar2.invoke(q.a(new q.b(e4)));
                        }
                        e eVar2 = this.f204983d;
                        linkedHashMap = eVar2.f204968e;
                        int i18 = this.f204984e;
                        synchronized (linkedHashMap) {
                        }
                    }
                } catch (Throwable th3) {
                    e eVar3 = this.f204983d;
                    LinkedHashMap linkedHashMap2 = eVar3.f204968e;
                    int i19 = this.f204984e;
                    synchronized (linkedHashMap2) {
                        throw th3;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d dVar, e23.l<? super q<Unit>, Unit> lVar, e eVar, int i14, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f204976b = dVar;
            this.f204977c = lVar;
            this.f204978d = eVar;
            this.f204979e = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f204976b, this.f204977c, this.f204978d, this.f204979e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204975a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(this.f204976b, this.f204977c, this.f204978d, this.f204979e, null);
                this.f204975a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
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
        new a(null);
    }

    public e(cz2.a aVar, long j8, mk2.d dVar) {
        aVar.getClass();
        this.f204965b = aVar;
        this.f204966c = j8;
        this.f204967d = dVar;
        this.f204968e = new LinkedHashMap();
        this.f204969f = new LinkedHashMap();
        this.f204970g = new AtomicInteger();
        this.f204974k = new HashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(int i14, int i15, p pVar, String str, v13.c cVar) throws Throwable {
        i iVar;
        e eVar;
        int i16;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i17 = iVar.f205013e;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                iVar.f205013e = i17 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        i iVar2 = iVar;
        Object objB = iVar2.f205011c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = iVar2.f205013e;
        if (i18 != 0) {
            if (i18 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i16 = iVar2.f205010b;
            eVar = iVar2.f205009a;
            try {
                r.b(objB);
                synchronized (eVar.f204969f) {
                }
                return objB;
            } catch (Throwable th3) {
                th = th3;
                synchronized (eVar.f204969f) {
                }
                throw th;
            }
        }
        r.b(objB);
        dt2.g gVar = this.f204973j;
        if (gVar == null) {
            s.m("messenger");
            throw null;
        }
        l lVar = new l(i14, gVar, i15, this.f204966c, this.f204965b, pVar, str);
        synchronized (this.f204969f) {
            this.f204969f.put(new Integer(i14), lVar);
            Unit unit = Unit.INSTANCE;
        }
        try {
            iVar2.f205009a = this;
            iVar2.f205010b = i14;
            iVar2.f205013e = 1;
            objB = lVar.b(iVar2);
            if (objB == aVar) {
                return aVar;
            }
            eVar = this;
            i16 = i14;
            synchronized (eVar.f204969f) {
                return objB;
            }
        } catch (Throwable th4) {
            th = th4;
            eVar = this;
            i16 = i14;
            synchronized (eVar.f204969f) {
                throw th;
            }
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        List<d> listB1;
        List<l> listB2;
        str.getClass();
        synchronized (this.f204968e) {
            listB1 = h0.b1(this.f204968e.values());
            this.f204968e.clear();
            Unit unit = Unit.INSTANCE;
        }
        for (d dVar : listB1) {
            dVar.f204961f.debug("transfer cancelled");
            cz2.g<Unit> gVar = dVar.f204962g;
            DataTransferException dataTransferException = new DataTransferException("transfer cancelled", null, 2, null);
            gVar.getClass();
            gVar.f56901e.O(dataTransferException);
        }
        synchronized (this.f204969f) {
            listB2 = h0.b1(this.f204969f.values());
            this.f204969f.clear();
            Unit unit2 = Unit.INSTANCE;
        }
        for (l lVar : listB2) {
            lVar.f205026e.debug("transfer cancelled");
            cz2.g<byte[]> gVar2 = lVar.f205027f;
            DataTransferException dataTransferException2 = new DataTransferException("Transfer cancelled", null, 2, null);
            gVar2.getClass();
            gVar2.f56901e.O(dataTransferException2);
        }
        u53.d dVar2 = this.f204971h;
        if (dVar2 == null) {
            s.m("coroutineScope");
            throw null;
        }
        c0.d(dVar2, "DataTransferService closed");
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        Logger logger = LoggerFactory.getLogger("DT#DataTransferService [" + cVar.getF172493a() + ']');
        logger.getClass();
        this.f204972i = logger;
        GDIDataTransferExtension.registerAllExtensions(extensionRegistryLite);
        GDIDataTransferProto.registerAllExtensions(extensionRegistryLite);
        GDIDataTransferProto.CapabilitiesRequest.Builder builderNewBuilder = GDIDataTransferProto.CapabilitiesRequest.newBuilder();
        if (this.f204967d == null || !cVar.getConfigurationFlags().contains(90)) {
            builderNewBuilder.setServiceVersion(0);
        } else {
            builderNewBuilder.setServiceVersion(1);
        }
        Logger logger2 = this.f204972i;
        if (logger2 == null) {
            s.m("logger");
            throw null;
        }
        logger2.debug("configure(serviceVersion=" + builderNewBuilder.getServiceVersion() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        builder.setExtension(GDIDataTransferProto.CapabilitiesRequest.dataXferRequest, builderNewBuilder.build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    public final int d(byte[] bArr, e23.l<? super q<Unit>, Unit> lVar, p<? super Integer, ? super Integer, Unit> pVar, String str) {
        bArr.getClass();
        int andIncrement = this.f204970g.getAndIncrement();
        d dVar = new d(andIncrement, bArr, this.f204966c, this.f204965b, pVar, str, str != null ? this.f204974k.get(str) : null);
        synchronized (this.f204968e) {
            this.f204968e.put(Integer.valueOf(andIncrement), dVar);
            Unit unit = Unit.INSTANCE;
        }
        u53.d dVar2 = this.f204971h;
        if (dVar2 != null) {
            ge1.b.T(dVar2, null, null, new b(dVar, lVar, this, andIncrement, null), 3);
            return andIncrement;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        Set<Integer> set = Collections.EMPTY_SET;
        set.getClass();
        return set;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest;
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDataTransferProto.DataTransferService> generatedExtension = GDIDataTransferExtension.dataTransferService;
        GDIDataTransferProto.DataTransferService dataTransferService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIDataTransferProto.DataTransferService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (dataTransferService != null && dataTransferService.hasDataDownloadRequest()) {
            GDIDataTransferProto.DataDownloadRequest dataDownloadRequest = dataTransferService.getDataDownloadRequest();
            dataDownloadRequest.getClass();
            u53.d dVar = this.f204971h;
            if (dVar != null) {
                ge1.b.T(dVar, null, null, new f(this, dataDownloadRequest, kVar, null), 3);
                return true;
            }
            s.m("coroutineScope");
            throw null;
        }
        if (dataTransferService != null && dataTransferService.hasDataUploadRequest()) {
            GDIDataTransferProto.DataUploadRequest dataUploadRequest = dataTransferService.getDataUploadRequest();
            dataUploadRequest.getClass();
            u53.d dVar2 = this.f204971h;
            if (dVar2 != null) {
                ge1.b.T(dVar2, null, null, new g(this, dataUploadRequest, kVar, null), 3);
                return true;
            }
            s.m("coroutineScope");
            throw null;
        }
        if (dataTransferService == null || !dataTransferService.hasFileAccessItemRequest() || (fileAccessItemRequest = dataTransferService.getFileAccessItemRequest()) == null || !fileAccessItemRequest.hasDataXferId()) {
            return false;
        }
        GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest2 = dataTransferService.getFileAccessItemRequest();
        fileAccessItemRequest2.getClass();
        u53.d dVar3 = this.f204971h;
        if (dVar3 != null) {
            ge1.b.T(dVar3, null, null, new h(this, fileAccessItemRequest2, kVar, null), 3);
            return true;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIDataTransferProto.CapabilitiesResponse> generatedExtension = GDIDataTransferProto.CapabilitiesResponse.dataXferResponse;
        if (featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        String strM = a0.m(new StringBuilder("DT#DataTransferService ["), ((us2.f) cVar).f172493a, ']');
        this.f204971h = q2.l(strM);
        Logger logger = LoggerFactory.getLogger(strM);
        logger.getClass();
        this.f204972i = logger;
        this.f204973j = gVar;
        ((dt2.d) gVar).f61154i.add(this);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzj2/e$a;", "", "<init>", "()V", "", "DEFAULT_TIMEOUT", "J", "", "TAG", "Ljava/lang/String;", "data-transfer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this((mk2.d) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public /* synthetic */ e(cz2.a aVar, long j8, mk2.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? 30000L : j8, (i14 & 4) != 0 ? null : dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(mk2.d dVar) {
        this(cz2.a.C1219a.f56881b, 30000L, dVar);
        cz2.a.f56879a.getClass();
    }

    public /* synthetic */ e(mk2.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar);
    }
}
