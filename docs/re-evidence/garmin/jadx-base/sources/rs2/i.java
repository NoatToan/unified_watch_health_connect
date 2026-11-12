package rs2;

import com.garmin.gfdi.GfdiException;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o53.c2;
import o53.j2;
import o53.l1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0015\u0016BU\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lrs2/i;", "", "Lrs2/c;", "deviceInfo", "Lus2/b;", "dispatcher", "Ldt2/d;", "protobufHandler", "", "Lrs2/h;", "dataHandlers", "Ldt2/a;", "protobufHandlers", "Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesResponse;", "featureCapabilitiesResponse", "Lrs2/p;", "gfdiWatchdog", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lrs2/c;Lus2/b;Ldt2/d;Ljava/util/List;Ljava/util/List;Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesResponse;Lrs2/p;Lorg/slf4j/Logger;)V", "b", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f154387h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f154388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us2.b f154389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt2.d f154390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h> f154391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<dt2.a> f154392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f154393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f154394g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrs2/i$b;", "", "<init>", "(Ljava/lang/String;I)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        SKIP_GUID_CHECK,
        AUTO_OVERWRITE_MISMATCH,
        NOTIFY_MISMATCH
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i(c cVar, us2.b bVar, dt2.d dVar, List<? extends h> list, List<? extends dt2.a> list2, GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse, p pVar, Logger logger) {
        this.f154388a = cVar;
        this.f154389b = bVar;
        this.f154390c = dVar;
        this.f154391d = list;
        this.f154392e = list2;
        this.f154393f = pVar;
        this.f154394g = logger;
    }

    public final void a() {
        Iterator<T> it;
        c cVar;
        Logger logger = this.f154394g;
        try {
            try {
                this.f154389b.f();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    cVar = this.f154388a;
                    if (!zHasNext) {
                        break;
                    }
                    try {
                        ((h) it.next()).close(cVar.getF92741e());
                    } catch (Throwable th3) {
                        com.airbnb.lottie.animation.keyframe.a.A("Failure closing GfdiDataHandler: ", th3.getMessage(), logger);
                    }
                }
            } catch (Throwable th4) {
                com.airbnb.lottie.animation.keyframe.a.A("Failure closing Dispatcher: ", th4.getMessage(), logger);
            }
            this.f154390c.e();
        } catch (Throwable th5) {
            com.airbnb.lottie.animation.keyframe.a.A("Failure closing ProtoHandler: ", th5.getMessage(), logger);
        }
        it = this.f154391d.iterator();
        Iterator<T> it3 = this.f154392e.iterator();
        while (it3.hasNext()) {
            try {
                ((dt2.a) it3.next()).close(cVar.getF92741e());
            } catch (Throwable th6) {
                com.airbnb.lottie.animation.keyframe.a.A("Failure closing ProtoDataHandler: ", th6.getMessage(), logger);
            }
        }
    }

    public final <T> T b(Class<T> cls) {
        if (this.f154389b.f172464g.get() == us2.b.a.ENDED) {
            return null;
        }
        Iterator<h> it = this.f154391d.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (cls.isInstance(t7)) {
                if (t7 != null) {
                    return t7;
                }
                return null;
            }
        }
        Iterator<dt2.a> it3 = this.f154392e.iterator();
        while (it3.hasNext()) {
            T t14 = (T) it3.next();
            if (cls.isInstance(t14)) {
                if (t14 != null) {
                    return t14;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r22v0, types: [dt2.d] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.List] */
    public final Object c(dt2.d dVar, dt2.c[] cVarArr, v13.c cVar) {
        o oVar;
        ?? I0;
        ?? r14;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f154443d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f154443d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objB = oVar.f154441b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f154443d;
        int i16 = 1;
        Logger logger = this.f154394g;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                if (cVarArr.length == 0) {
                    I0 = new ArrayList();
                    for (Object obj : this.f154392e) {
                        if (obj instanceof dt2.c) {
                            I0.add(obj);
                        }
                    }
                } else {
                    I0 = p13.u.i0(cVarArr);
                }
                ?? r15 = I0;
                if (!r15.isEmpty()) {
                    c cVar2 = this.f154388a;
                    if (cVar2.getConfigurationFlags().contains(new Integer(95))) {
                        GDICore.FeatureCapabilitiesRequest.Builder builderNewBuilder = GDICore.FeatureCapabilitiesRequest.newBuilder();
                        p0 p0Var = new p0();
                        for (dt2.c cVar3 : r15) {
                            try {
                                ExtensionRegistryLite extensionRegistryLite = dVar.f61148c;
                                builderNewBuilder.getClass();
                                cVar3.configure(cVar2, extensionRegistryLite, builderNewBuilder);
                            } catch (Throwable th3) {
                                logger.warn("Failed configure() " + cVar3 + " [" + h0.k0(cVar3.getConfiguration(), null, null, null, null, 63) + "] - " + th3.getMessage());
                                p0Var.f105807a = p0Var.f105807a + 1;
                            }
                            i16 = i16;
                        }
                        int i17 = i16;
                        if (p0Var.f105807a == r15.size()) {
                            logger.warn("All selected handlers failed configure()");
                            return Unit.INSTANCE;
                        }
                        GDISmartProto.Smart smartA = pu2.a.a(GDICore.CoreService.newBuilder().setFeatureCapabilitiesRequest(builderNewBuilder));
                        smartA.getClass();
                        oVar.f154440a = r15;
                        oVar.f154443d = i17;
                        objB = dVar.b(smartA, oVar);
                        if (objB == aVar) {
                            return aVar;
                        }
                        r14 = r15;
                    }
                }
                logger.debug("No updates to protobuf feature capabilities");
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = oVar.f154440a;
            o13.r.b(objB);
            r14 = list;
            GDICore.CoreService coreServiceB = pu2.a.b((GDISmartProto.Smart) objB);
            if (coreServiceB == null) {
                return Unit.INSTANCE;
            }
            if (coreServiceB.hasFeatureCapabilitiesResponse()) {
                GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse = coreServiceB.getFeatureCapabilitiesResponse();
                for (dt2.c cVar4 : r14) {
                    try {
                        featureCapabilitiesResponse.getClass();
                        cVar4.receiveCapabilities(featureCapabilitiesResponse);
                    } catch (Throwable unused) {
                        logger.warn("Failed receiveCapabilities() " + cVar4 + " [" + h0.k0(cVar4.getConfiguration(), null, null, null, null, 63) + "]");
                    }
                }
            }
            logger.debug("Updated protobuf feature capabilities");
            return Unit.INSTANCE;
        } catch (Exception e4) {
            com.airbnb.lottie.animation.keyframe.a.A("Failed to update protobuf feature capabilities: ", e4.getMessage(), logger);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Lrs2/i$a;", "", "<init>", "()V", "", "COMMUNICATION_START_TIMEOUT", "J", "HANDSHAKE_TIMEOUT", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: rs2.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrs2/i$a$a;", "Ldt2/h;", "Ldt2/d;", "protoHandler", "", "Ldt2/c;", "protobufDataHandlers", "<init>", "(Ldt2/d;Ljava/util/List;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2924a implements dt2.h {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dt2.d f154395b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List<dt2.c> f154396c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final u53.d f154397d;

            /* JADX INFO: renamed from: rs2.i$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
            @v13.e(c = "com.garmin.gfdi.GfdiDevice$Companion$ConnectionReadyListener$onProtobufRequest$1$1", f = "GfdiDevice.kt", l = {}, m = "invokeSuspend")
            public static final class C2925a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ dt2.c f154398a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GDICore.CoreService f154399b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2925a(dt2.c cVar, GDICore.CoreService coreService, t13.d<? super C2925a> dVar) {
                    super(2, dVar);
                    this.f154398a = cVar;
                    this.f154399b = coreService;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C2925a(this.f154398a, this.f154399b, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C2925a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    o13.r.b(obj);
                    try {
                        dt2.c cVar = this.f154398a;
                        GDICore.ConnectionReadyNotification connectionReadyNotification = this.f154399b.getConnectionReadyNotification();
                        connectionReadyNotification.getClass();
                        cVar.connectionReady(connectionReadyNotification);
                    } catch (Throwable unused) {
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C2924a(dt2.d dVar, List<? extends dt2.c> list) {
                dVar.getClass();
                list.getClass();
                this.f154395b = dVar;
                this.f154396c = list;
                this.f154397d = q2.l("ConnectionReadyListener");
            }

            @Override // dt2.h
            public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
                smart.getClass();
                GDICore.CoreService coreServiceB = pu2.a.b(smart);
                if (coreServiceB == null || !coreServiceB.hasConnectionReadyNotification()) {
                    return false;
                }
                this.f154395b.f61154i.remove(this);
                Iterator<T> it = this.f154396c.iterator();
                while (it.hasNext()) {
                    ft2.d.b(this.f154397d, new C2925a((dt2.c) it.next(), coreServiceB, null));
                }
                return true;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0289, code lost:
        
            if (r0 == r7) goto L92;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Serializable a(us2.f fVar, dt2.d dVar, ArrayList arrayList, u uVar, ExtensionRegistryLite extensionRegistryLite, b bVar, Logger logger, v13.c cVar) throws Exception {
            j jVar;
            c cVar2;
            dt2.g gVar;
            byte[] bArr;
            m0 m0Var;
            u uVar2;
            GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse;
            b bVar2 = bVar;
            Logger logger2 = logger;
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i14 = jVar.f154413j;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    jVar.f154413j = i14 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(this, cVar);
                }
            } else {
                jVar = new j(this, cVar);
            }
            Object obj = jVar.f154411h;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = jVar.f154413j;
            try {
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            featureCapabilitiesResponse = (GDICore.FeatureCapabilitiesResponse) jVar.f154404a;
                        } else {
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            featureCapabilitiesResponse = (GDICore.FeatureCapabilitiesResponse) jVar.f154407d;
                        }
                        o13.r.b(obj);
                    } else {
                        m0Var = jVar.f154410g;
                        bArr = jVar.f154409f;
                        Logger logger3 = jVar.f154408e;
                        b bVar3 = (b) jVar.f154407d;
                        uVar2 = jVar.f154406c;
                        dt2.g gVar2 = jVar.f154405b;
                        cVar2 = (c) jVar.f154404a;
                        o13.r.b(obj);
                        logger2 = logger3;
                        bVar2 = bVar3;
                        gVar = gVar2;
                    }
                    return featureCapabilitiesResponse;
                }
                o13.r.b(obj);
                byte[] bArrC = uVar.c();
                m0 m0Var2 = new m0();
                GDICore.FeatureCapabilitiesRequest.Builder builderNewBuilder = GDICore.FeatureCapabilitiesRequest.newBuilder();
                if (bVar2 == b.SKIP_GUID_CHECK) {
                    logger2.warn("skip customer GUID based on app request " + bVar2);
                } else if (bArrC == null) {
                    m0Var2.f105804a = true;
                    logger2.warn("null customer GUID, from host config, will not be sent to device (app request " + bVar2 + ")");
                } else if (d53.w.J(new String(bArrC, d53.c.f57666b))) {
                    m0Var2.f105804a = true;
                    logger2.warn("empty or blank customer GUID, from host config, will not be sent to device (app request " + bVar2 + ")");
                } else {
                    builderNewBuilder.setGarminGuid(ByteString.copyFrom(bArrC));
                    logger2.debug("customer GUID set on FeatureCapabilitiesRequest (app request " + bVar2 + ")");
                }
                String strE = uVar.e();
                if (strE == null || d53.w.J(strE)) {
                    logger2.debug("no app display name provided by host config");
                } else {
                    builderNewBuilder.setDisplayName(strE);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dt2.a aVar2 = (dt2.a) it.next();
                    if (aVar2 instanceof dt2.c) {
                        try {
                            dt2.c cVar3 = (dt2.c) aVar2;
                            builderNewBuilder.getClass();
                            try {
                                cVar3.configure(fVar, extensionRegistryLite, builderNewBuilder);
                            } catch (Throwable unused) {
                                logger2.warn("Failed configure() " + aVar2 + " [" + h0.k0(aVar2.getConfiguration(), null, null, null, null, 63) + "]");
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                if (!fVar.f172500h.contains(new Integer(95))) {
                    logger2.warn(fVar.f172496d + "(" + fVar.f172494b + ") does not support bit 95 FEATURE_CAPABILITIES");
                    GDICore.FeatureCapabilitiesResponse defaultInstance = GDICore.FeatureCapabilitiesResponse.getDefaultInstance();
                    defaultInstance.getClass();
                    return defaultInstance;
                }
                GDISmartProto.Smart smartA = pu2.a.a(GDICore.CoreService.newBuilder().setFeatureCapabilitiesRequest(builderNewBuilder));
                smartA.getClass();
                jVar.f154404a = fVar;
                jVar.f154405b = dVar;
                jVar.f154406c = uVar;
                jVar.f154407d = bVar2;
                jVar.f154408e = logger2;
                jVar.f154409f = bArrC;
                jVar.f154410g = m0Var2;
                jVar.f154413j = 1;
                Object objB = dVar.b(smartA, jVar);
                if (objB != aVar) {
                    cVar2 = fVar;
                    gVar = dVar;
                    bArr = bArrC;
                    obj = objB;
                    m0Var = m0Var2;
                    uVar2 = uVar;
                }
                return aVar;
                GDICore.CoreService coreServiceB = pu2.a.b((GDISmartProto.Smart) obj);
                GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse2 = (coreServiceB == null || !coreServiceB.hasFeatureCapabilitiesResponse()) ? null : coreServiceB.getFeatureCapabilitiesResponse();
                if (featureCapabilitiesResponse2 == null) {
                    throw new GfdiException("device failed to return 'FeatureCapabilitiesResponse'", null, 2, null);
                }
                if (m0Var.f105804a || bVar2 == b.SKIP_GUID_CHECK) {
                    return featureCapabilitiesResponse2;
                }
                if (!featureCapabilitiesResponse2.hasGuidStatus()) {
                    throw new GfdiException("device failed to return customer GUID status", null, 2, null);
                }
                if (featureCapabilitiesResponse2.getGuidStatus() == GDICore.FeatureCapabilitiesResponse.GuidStatus.MATCH) {
                    logger2.debug("customer GUID status match");
                    return featureCapabilitiesResponse2;
                }
                logger2.warn("customer GUID status does not match (app request " + bVar2 + ")");
                if (bVar2 == b.AUTO_OVERWRITE_MISMATCH) {
                    logger2.debug("overwriting customer GUID (app request " + bVar2 + ")");
                    t tVar = new t(gVar, null);
                    if (bArr == null) {
                        throw new IllegalStateException("empty getCustomerGUID");
                    }
                    jVar.f154404a = featureCapabilitiesResponse2;
                    jVar.f154405b = null;
                    jVar.f154406c = null;
                    jVar.f154407d = null;
                    jVar.f154408e = null;
                    jVar.f154409f = null;
                    jVar.f154410g = null;
                    jVar.f154413j = 2;
                    if (tVar.a(bArr, jVar) == aVar) {
                        return aVar;
                    }
                    featureCapabilitiesResponse = featureCapabilitiesResponse2;
                } else {
                    if (bVar2 != b.NOTIFY_MISMATCH) {
                        return featureCapabilitiesResponse2;
                    }
                    jVar.f154404a = cVar2;
                    jVar.f154405b = gVar;
                    jVar.f154406c = uVar2;
                    jVar.f154407d = featureCapabilitiesResponse2;
                    jVar.f154408e = null;
                    jVar.f154409f = null;
                    jVar.f154410g = null;
                    jVar.f154413j = 3;
                    t13.i iVar = new t13.i(u13.f.b(jVar));
                    GDICore.FeatureCapabilitiesResponse.GuidStatus guidStatus = featureCapabilitiesResponse2.getGuidStatus();
                    guidStatus.getClass();
                    uVar2.b(cVar2, guidStatus, new t(gVar, iVar));
                    Object objA = iVar.a();
                    u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                }
                return featureCapabilitiesResponse;
            } catch (Exception e4) {
                if (e4 instanceof GfdiException) {
                    throw e4;
                }
                throw new GfdiException("device feature capabilities", e4);
            }
        }

        public final Object b(InputStream inputStream, OutputStream outputStream, String str, u uVar, b bVar, e eVar, v13.c cVar) {
            z a0Var;
            f fVarG = uVar.g(str);
            if (fVarG != null) {
                a0Var = fVarG instanceof z ? (z) fVarG : new a0((g) fVarG, null, 2, null);
            } else {
                a0Var = null;
            }
            p pVar = new p(null, 1, null);
            return c(str, new us2.b(new ct2.b(inputStream, pVar), new ct2.f(outputStream, a0Var, pVar), str, eVar, a0Var, pVar, null, 64, null), bVar, uVar, pVar, a0Var instanceof g ? (g) a0Var : null, cVar);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x031b  */
        /* JADX WARN: Code duplicated, block: B:104:0x032a  */
        /* JADX WARN: Code duplicated, block: B:111:0x034d  */
        /* JADX WARN: Code duplicated, block: B:114:0x035a  */
        /* JADX WARN: Code duplicated, block: B:117:0x0364  */
        /* JADX WARN: Code duplicated, block: B:129:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:138:0x0416  */
        /* JADX WARN: Code duplicated, block: B:141:0x0436  */
        /* JADX WARN: Code duplicated, block: B:146:0x0444 A[LOOP:6: B:144:0x043e->B:146:0x0444, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:152:0x0399 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:160:0x02ab A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:161:0x02eb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:0x02ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:165:0x02b6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:172:0x0332 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:174:0x0324 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x0269  */
        /* JADX WARN: Code duplicated, block: B:63:0x0273  */
        /* JADX WARN: Code duplicated, block: B:64:0x0277  */
        /* JADX WARN: Code duplicated, block: B:66:0x027b  */
        /* JADX WARN: Code duplicated, block: B:68:0x0280  */
        /* JADX WARN: Code duplicated, block: B:70:0x0284  */
        /* JADX WARN: Code duplicated, block: B:71:0x0288  */
        /* JADX WARN: Code duplicated, block: B:73:0x028c  */
        /* JADX WARN: Code duplicated, block: B:76:0x0293  */
        /* JADX WARN: Code duplicated, block: B:77:0x0297  */
        /* JADX WARN: Code duplicated, block: B:79:0x029b  */
        /* JADX WARN: Code duplicated, block: B:84:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Code duplicated, block: B:90:0x02d4  */
        /* JADX WARN: Code duplicated, block: B:98:0x02f1  */
        /* JADX WARN: Instruction removed from duplicated block: B:98:0x02f1, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17, types: [vs2.i] */
        /* JADX WARN: Type inference failed for: r11v21 */
        /* JADX WARN: Type inference failed for: r11v22, types: [bt2.a] */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r31v0, types: [rs2.i$a] */
        public final Object c(String str, us2.b bVar, b bVar2, u uVar, p pVar, g gVar, v13.c cVar) throws Exception {
            k kVar;
            bt2.b bVar3;
            at2.a aVar;
            ArrayList arrayList;
            ss2.q yVar;
            u uVar2;
            String str2;
            us2.b bVar4;
            p pVar2;
            g gVar2;
            Logger logger;
            rs2.a aVar2;
            zs2.h hVar;
            b bVar5;
            List list;
            c2 c2VarF;
            String str3;
            List list2;
            us2.b bVar6;
            List list3;
            List list4;
            ExtensionRegistryLite extensionRegistryLiteNewInstance;
            ExtensionRegistryLite extensionRegistryLite;
            p pVar3;
            ArrayList<dt2.a> arrayList2;
            ArrayList<h> arrayList3;
            List<h> list5;
            byte[] bArr;
            us2.b bVar7;
            vs2.l lVar;
            Logger logger2;
            g gVar3;
            us2.f fVar;
            dt2.d dVar;
            List list6;
            Iterator it;
            GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse;
            Iterator it3;
            Object next;
            h hVar2;
            String str4;
            ArrayList arrayList4;
            h hVar3;
            bt2.b bVar8;
            ?? r14;
            vs2.i iVar;
            ?? r15;
            bt2.a aVar3;
            String str5 = str;
            us2.b bVar9 = bVar;
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i14 = kVar.f154429p;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    kVar.f154429p = i14 - Integer.MIN_VALUE;
                } else {
                    kVar = new k(this, cVar);
                }
            } else {
                kVar = new k(this, cVar);
            }
            k kVar2 = kVar;
            Object objD = kVar2.f154427n;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            int i15 = kVar2.f154429p;
            String str6 = "]";
            try {
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            bVar3 = null;
                            List list7 = (List) kVar2.f154423j;
                            zs2.h hVar4 = (zs2.h) kVar2.f154422i;
                            aVar2 = (rs2.a) kVar2.f154421h;
                            Logger logger3 = (Logger) kVar2.f154420g;
                            g gVar4 = (g) kVar2.f154419f;
                            p pVar4 = (p) kVar2.f154418e;
                            u uVar3 = (u) kVar2.f154417d;
                            b bVar10 = (b) kVar2.f154416c;
                            bVar6 = (us2.b) kVar2.f154415b;
                            String str7 = (String) kVar2.f154414a;
                            try {
                                o13.r.b(objD);
                                logger = logger3;
                                uVar2 = uVar3;
                                gVar2 = gVar4;
                                str6 = "]";
                                str2 = str7;
                                bVar4 = bVar6;
                                hVar = hVar4;
                                list4 = list7;
                                pVar2 = pVar4;
                                bVar5 = bVar10;
                            } catch (Exception e4) {
                                e = e4;
                                list3 = list7;
                                str5 = str7;
                                bVar9 = bVar6;
                                list = list3;
                                c2VarF = bVar9.f();
                                list6 = list;
                                if (c2VarF != null) {
                                    kVar2.f154414a = str5;
                                    kVar2.f154415b = list;
                                    kVar2.f154416c = e;
                                    bt2.b bVar11 = bVar3;
                                    kVar2.f154417d = bVar11;
                                    kVar2.f154418e = bVar11;
                                    kVar2.f154419f = bVar11;
                                    kVar2.f154420g = bVar11;
                                    kVar2.f154421h = bVar11;
                                    kVar2.f154422i = bVar11;
                                    kVar2.f154423j = bVar11;
                                    kVar2.f154429p = 2;
                                    if (c2VarF.P(kVar2) == aVar4) {
                                        return aVar4;
                                    }
                                    str3 = str5;
                                    list2 = list;
                                    list6 = list2;
                                    str5 = str3;
                                }
                                it = list6.iterator();
                                while (it.hasNext()) {
                                    ((h) it.next()).close(str5);
                                }
                                throw e;
                            }
                        } else {
                            if (i15 == 2) {
                                e = (Exception) kVar2.f154416c;
                                List list8 = (List) kVar2.f154415b;
                                str3 = (String) kVar2.f154414a;
                                o13.r.b(objD);
                                list2 = list8;
                                list6 = list2;
                                str5 = str3;
                                it = list6.iterator();
                                while (it.hasNext()) {
                                    ((h) it.next()).close(str5);
                                }
                                throw e;
                            }
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ArrayList arrayList5 = kVar2.f154426m;
                            lVar = kVar2.f154425l;
                            arrayList3 = kVar2.f154424k;
                            dVar = (dt2.d) kVar2.f154423j;
                            extensionRegistryLite = (ExtensionRegistryLite) kVar2.f154422i;
                            bArr = (byte[]) kVar2.f154421h;
                            fVar = (us2.f) kVar2.f154420g;
                            List list9 = (List) kVar2.f154419f;
                            hVar = (zs2.h) kVar2.f154418e;
                            logger2 = (Logger) kVar2.f154417d;
                            bVar3 = null;
                            gVar3 = (g) kVar2.f154416c;
                            p pVar5 = (p) kVar2.f154415b;
                            bVar7 = (us2.b) kVar2.f154414a;
                            o13.r.b(objD);
                            arrayList2 = arrayList5;
                            str6 = "]";
                            pVar3 = pVar5;
                            list5 = list9;
                        }
                        featureCapabilitiesResponse = (GDICore.FeatureCapabilitiesResponse) objD;
                        for (h hVar5 : arrayList3) {
                            if (hVar5 instanceof bt2.b) {
                                bVar8 = (bt2.b) hVar5;
                            } else {
                                bVar8 = bVar3;
                            }
                            if (bVar8 != null) {
                                bVar8.m(hVar);
                            }
                            if (bArr != null) {
                                if (hVar5 instanceof bt2.a) {
                                    aVar3 = (bt2.a) hVar5;
                                } else {
                                    r15 = bVar3;
                                }
                                if (r15 != 0) {
                                    r15 = aVar3;
                                    r15.setSessionKey(bArr);
                                }
                            }
                            r15 = aVar3;
                            if (hVar5 instanceof vs2.i) {
                                iVar = (vs2.i) hVar5;
                            } else {
                                r14 = bVar3;
                            }
                            if (r14 != 0) {
                                r14 = iVar;
                                lVar.f179985e = r14;
                                extensionRegistryLite.getClass();
                                dVar.getClass();
                                r14.f179954e = dVar;
                                GDICoreExtension.registerAllExtensions(extensionRegistryLite);
                                GDICore.registerAllExtensions(extensionRegistryLite);
                            } else {
                                r14 = iVar;
                            }
                            hVar5.start(fVar, bVar7);
                        }
                        list5.addAll(arrayList3);
                        it3 = list5.iterator();
                        loop1: while (true) {
                            if (it3.hasNext()) {
                                next = bVar3;
                                break;
                            }
                            next = it3.next();
                            hVar3 = (h) next;
                            if (list5.isEmpty()) {
                                for (h hVar6 : list5) {
                                    if (p005kotlin.jvm.internal.s.g(hVar3, hVar6) && hVar3.getClass() == hVar6.getClass()) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                        hVar2 = (h) next;
                        if (hVar2 != null) {
                            logger2.warn("detected multiple GFDI handler instances of " + s0.f105811a.b(hVar2.getClass()));
                        }
                        dt2.c.f61142a.getClass();
                        featureCapabilitiesResponse.getClass();
                        if (featureCapabilitiesResponse.getVersion() >= 1) {
                            arrayList4 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (obj instanceof dt2.c) {
                                    arrayList4.add(obj);
                                }
                            }
                            C2924a c2924a = new C2924a(dVar, arrayList4);
                            dVar.getClass();
                            dVar.f61154i.add(c2924a);
                        }
                        for (dt2.a aVar5 : arrayList2) {
                            if (!arrayList2.isEmpty()) {
                                for (dt2.a aVar6 : arrayList2) {
                                    if (p005kotlin.jvm.internal.s.g(aVar5, aVar6) && aVar5.getClass() == aVar6.getClass()) {
                                        logger2.warn("detected multiple protobuf handler instances of " + s0.f105811a.b(aVar5.getClass()));
                                        break;
                                    }
                                }
                            }
                            if (aVar5 instanceof dt2.c) {
                                try {
                                    ((dt2.c) aVar5).receiveCapabilities(featureCapabilitiesResponse);
                                } catch (Throwable unused) {
                                    String strK0 = h0.k0(aVar5.getConfiguration(), null, null, null, null, 63);
                                    StringBuilder sb3 = new StringBuilder("Failed receiveCapabilities() ");
                                    sb3.append(aVar5);
                                    sb3.append(" [");
                                    sb3.append(strK0);
                                    str4 = str6;
                                    sb3.append(str4);
                                    logger2.warn(sb3.toString());
                                }
                            }
                            str4 = str6;
                            extensionRegistryLite.getClass();
                            aVar5.start(fVar, dVar, extensionRegistryLite);
                            str6 = str4;
                        }
                        if (gVar3 != null) {
                            extensionRegistryLite.getClass();
                            gVar3.onExtensionsRegistered(extensionRegistryLite);
                        }
                        logger2.getClass();
                        return new i(fVar, bVar7, dVar, list5, arrayList2, featureCapabilitiesResponse, pVar3, logger2, null);
                    }
                    bVar3 = null;
                    o13.r.b(objD);
                    Logger logger4 = LoggerFactory.getLogger("GFDI#GfdiDevice [" + str5 + "]");
                    rs2.a aVar7 = new rs2.a(uVar);
                    zs2.h hVar7 = new zs2.h(bVar9);
                    at2.a aVar8 = new at2.a(str5, bVar9, hVar7, aVar7);
                    ArrayList arrayListM = p13.x.m(hVar7, aVar8);
                    ss2.b bVarH = uVar.h(str5);
                    if (bVarH.isGarminAuthAllowed(str5)) {
                        aVar = aVar8;
                        arrayList = arrayListM;
                        yVar = new ss2.c(str5, bVar9, bVarH, null, 8, null);
                    } else {
                        aVar = aVar8;
                        arrayList = arrayListM;
                        yVar = new ss2.y(bVar9);
                    }
                    arrayList.add(yVar);
                    try {
                        o53.s sVar = aVar.f12803i;
                        kVar2.f154414a = str5;
                        kVar2.f154415b = bVar9;
                        kVar2.f154416c = bVar2;
                        kVar2.f154417d = uVar;
                        kVar2.f154418e = pVar;
                        kVar2.f154419f = gVar;
                        kVar2.f154420g = logger4;
                        kVar2.f154421h = aVar7;
                        kVar2.f154422i = hVar7;
                        kVar2.f154423j = arrayList;
                        kVar2.f154429p = 1;
                        objD = d(bVar9, yVar, sVar, kVar2);
                        if (objD == aVar4) {
                            return aVar4;
                        }
                        uVar2 = uVar;
                        str2 = str5;
                        bVar4 = bVar9;
                        pVar2 = pVar;
                        gVar2 = gVar;
                        logger = logger4;
                        aVar2 = aVar7;
                        hVar = hVar7;
                        bVar5 = bVar2;
                        list4 = arrayList;
                    } catch (Exception e14) {
                        e = e14;
                        aVar4 = aVar4;
                        list = arrayList;
                        c2VarF = bVar9.f();
                        list6 = list;
                        if (c2VarF != null) {
                            kVar2.f154414a = str5;
                            kVar2.f154415b = list;
                            kVar2.f154416c = e;
                            bt2.b bVar12 = bVar3;
                            kVar2.f154417d = bVar12;
                            kVar2.f154418e = bVar12;
                            kVar2.f154419f = bVar12;
                            kVar2.f154420g = bVar12;
                            kVar2.f154421h = bVar12;
                            kVar2.f154422i = bVar12;
                            kVar2.f154423j = bVar12;
                            kVar2.f154429p = 2;
                            if (c2VarF.P(kVar2) == aVar4) {
                                return aVar4;
                            }
                            str3 = str5;
                            list2 = list;
                            list6 = list2;
                            str5 = str3;
                        }
                        it = list6.iterator();
                        while (it.hasNext()) {
                            ((h) it.next()).close(str5);
                        }
                        throw e;
                    }
                    extensionRegistryLiteNewInstance = ExtensionRegistry.newInstance();
                } catch (NoClassDefFoundError unused2) {
                    extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
                }
                o13.p pVar6 = (o13.p) objD;
                us2.f fVar2 = (us2.f) pVar6.f128594a;
                byte[] bArr2 = (byte[]) pVar6.f128595b;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLiteNewInstance;
                extensionRegistryLite2.getClass();
                dt2.d dVar2 = new dt2.d(str2, bVar4, extensionRegistryLite2, gVar2, 0L, null, 48, null);
                String str8 = str2;
                us2.b bVar13 = bVar4;
                extensionRegistryLite = extensionRegistryLite2;
                g gVar5 = gVar2;
                GDICoreExtension.registerAllExtensions(extensionRegistryLite);
                GDICore.registerAllExtensions(extensionRegistryLite);
                b bVar14 = bVar5;
                ArrayList arrayList6 = new ArrayList(aVar2.f(fVar2));
                vs2.l lVar2 = new vs2.l(uVar2.a(fVar2));
                arrayList6.add(lVar2);
                if (fVar2.f172498f) {
                    arrayList6.add(new ss2.v(uVar2.h(str8)));
                }
                ArrayList arrayList7 = new ArrayList(aVar2.j(fVar2));
                ArrayList<dt2.c> arrayList8 = new ArrayList();
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    Iterator it5 = it4;
                    Object next2 = it5.next();
                    u uVar4 = uVar2;
                    if (next2 instanceof dt2.c) {
                        arrayList8.add(next2);
                    }
                    it4 = it5;
                    uVar2 = uVar4;
                }
                u uVar5 = uVar2;
                for (dt2.c cVar2 : arrayList8) {
                    if (!arrayList7.contains(cVar2)) {
                        arrayList7.add(cVar2);
                    }
                }
                logger.getClass();
                kVar2.f154414a = bVar13;
                kVar2.f154415b = pVar2;
                kVar2.f154416c = gVar5;
                kVar2.f154417d = logger;
                kVar2.f154418e = hVar;
                kVar2.f154419f = list4;
                kVar2.f154420g = fVar2;
                kVar2.f154421h = bArr2;
                kVar2.f154422i = extensionRegistryLite;
                kVar2.f154423j = dVar2;
                kVar2.f154424k = arrayList6;
                kVar2.f154425l = lVar2;
                kVar2.f154426m = arrayList7;
                kVar2.f154429p = 3;
                Object objA = a(fVar2, dVar2, arrayList7, uVar5, extensionRegistryLite, bVar14, logger, kVar2);
                if (objA == aVar4) {
                    return aVar4;
                }
                pVar3 = pVar2;
                arrayList2 = arrayList7;
                arrayList3 = arrayList6;
                list5 = list4;
                bArr = bArr2;
                bVar7 = bVar13;
                lVar = lVar2;
                logger2 = logger;
                gVar3 = gVar5;
                fVar = fVar2;
                objD = objA;
                dVar = dVar2;
                featureCapabilitiesResponse = (GDICore.FeatureCapabilitiesResponse) objD;
                while (r0.hasNext()) {
                    if (hVar5 instanceof bt2.b) {
                        bVar8 = (bt2.b) hVar5;
                    } else {
                        bVar8 = bVar3;
                    }
                    if (bVar8 != null) {
                        bVar8.m(hVar);
                    }
                    if (bArr != null) {
                        if (hVar5 instanceof bt2.a) {
                            aVar3 = (bt2.a) hVar5;
                        } else {
                            r15 = bVar3;
                        }
                        if (r15 != 0) {
                            r15 = aVar3;
                            r15.setSessionKey(bArr);
                        }
                    }
                    r15 = aVar3;
                    if (hVar5 instanceof vs2.i) {
                        iVar = (vs2.i) hVar5;
                    } else {
                        r14 = bVar3;
                    }
                    if (r14 != 0) {
                        r14 = iVar;
                        lVar.f179985e = r14;
                        extensionRegistryLite.getClass();
                        dVar.getClass();
                        r14.f179954e = dVar;
                        GDICoreExtension.registerAllExtensions(extensionRegistryLite);
                        GDICore.registerAllExtensions(extensionRegistryLite);
                    } else {
                        r14 = iVar;
                    }
                    hVar5.start(fVar, bVar7);
                }
                list5.addAll(arrayList3);
                it3 = list5.iterator();
                loop1: while (true) {
                    if (it3.hasNext()) {
                        next = bVar3;
                        break;
                    }
                    next = it3.next();
                    hVar3 = (h) next;
                    if (list5.isEmpty()) {
                        while (r4.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(hVar3, hVar6)) {
                            }
                        }
                    }
                }
                hVar2 = (h) next;
                if (hVar2 != null) {
                    logger2.warn("detected multiple GFDI handler instances of " + s0.f105811a.b(hVar2.getClass()));
                }
                dt2.c.f61142a.getClass();
                featureCapabilitiesResponse.getClass();
                if (featureCapabilitiesResponse.getVersion() >= 1) {
                    arrayList4 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj instanceof dt2.c) {
                            arrayList4.add(obj);
                        }
                    }
                    C2924a c2924a2 = new C2924a(dVar, arrayList4);
                    dVar.getClass();
                    dVar.f61154i.add(c2924a2);
                }
                while (r0.hasNext()) {
                    if (!arrayList2.isEmpty()) {
                        while (r3.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(aVar5, aVar6)) {
                            }
                        }
                    }
                    if (aVar5 instanceof dt2.c) {
                        ((dt2.c) aVar5).receiveCapabilities(featureCapabilitiesResponse);
                    }
                    str4 = str6;
                    extensionRegistryLite.getClass();
                    aVar5.start(fVar, dVar, extensionRegistryLite);
                    str6 = str4;
                }
                if (gVar3 != null) {
                    extensionRegistryLite.getClass();
                    gVar3.onExtensionsRegistered(extensionRegistryLite);
                }
                logger2.getClass();
                return new i(fVar, bVar7, dVar, list5, arrayList2, featureCapabilitiesResponse, pVar3, logger2, null);
            } catch (Exception e15) {
                e = e15;
                bVar6 = bVar4;
                str5 = str2;
                list3 = list4;
                bVar9 = bVar6;
                list = list3;
                c2VarF = bVar9.f();
                list6 = list;
                if (c2VarF != null) {
                    kVar2.f154414a = str5;
                    kVar2.f154415b = list;
                    kVar2.f154416c = e;
                    bt2.b bVar15 = bVar3;
                    kVar2.f154417d = bVar15;
                    kVar2.f154418e = bVar15;
                    kVar2.f154419f = bVar15;
                    kVar2.f154420g = bVar15;
                    kVar2.f154421h = bVar15;
                    kVar2.f154422i = bVar15;
                    kVar2.f154423j = bVar15;
                    kVar2.f154429p = 2;
                    if (c2VarF.P(kVar2) == aVar4) {
                        return aVar4;
                    }
                    str3 = str5;
                    list2 = list;
                    list6 = list2;
                    str5 = str3;
                }
                it = list6.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).close(str5);
                }
                throw e;
            }
        }

        /* JADX WARN: Code duplicated, block: B:57:0x011b  */
        /* JADX WARN: Code duplicated, block: B:60:0x0122 A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:58:0x011e, B:60:0x0122, B:63:0x012a, B:64:0x0131, B:67:0x013a, B:69:0x013e, B:70:0x013f, B:71:0x0146, B:23:0x0047), top: B:74:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x012a A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:58:0x011e, B:60:0x0122, B:63:0x012a, B:64:0x0131, B:67:0x013a, B:69:0x013e, B:70:0x013f, B:71:0x0146, B:23:0x0047), top: B:74:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x013e A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:58:0x011e, B:60:0x0122, B:63:0x012a, B:64:0x0131, B:67:0x013a, B:69:0x013e, B:70:0x013f, B:71:0x0146, B:23:0x0047), top: B:74:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x013f A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:58:0x011e, B:60:0x0122, B:63:0x012a, B:64:0x0131, B:67:0x013a, B:69:0x013e, B:70:0x013f, B:71:0x0146, B:23:0x0047), top: B:74:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v2 */
        public final Serializable d(us2.b bVar, ss2.q qVar, o53.r rVar, v13.c cVar) throws Throwable {
            l lVar;
            Throwable th3;
            Exception e4;
            ss2.q qVar2;
            byte[] bArr;
            byte[] bArr2;
            byte[] bArr3;
            us2.b bVar2;
            byte[] bArr4;
            us2.f fVar;
            if (cVar instanceof l) {
                lVar = (l) cVar;
                int i14 = lVar.f154435f;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    lVar.f154435f = i14 - Integer.MIN_VALUE;
                } else {
                    lVar = new l(this, cVar);
                }
            } else {
                lVar = new l(this, cVar);
            }
            Object objC = lVar.f154433d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = lVar.f154435f;
            try {
                try {
                    try {
                        if (i15 == 0) {
                            o13.r.b(objC);
                            o53.s sVar = new o53.s((l1) lVar.getF157466b().get(l1.f129368i0));
                            bVar.f172471n = new rk0.g(6, sVar, qVar);
                            AtomicReference<us2.b.a> atomicReference = bVar.f172464g;
                            us2.b.a aVar2 = us2.b.a.NOT_STARTED;
                            us2.b.a aVar3 = us2.b.a.RUNNING;
                            while (true) {
                                if (atomicReference.compareAndSet(aVar2, aVar3)) {
                                    ct2.b bVar3 = bVar.f172458a;
                                    bVar3.getClass();
                                    if (!bVar3.f55530d.compareAndSet(false, true)) {
                                        bVar3.f55528b.error("open() can only be called once.");
                                        break;
                                    }
                                    bVar3.f55532f = bVar;
                                    Thread thread = new Thread(new cd0.h0(bVar3, 26), "MessageReader");
                                    bVar3.f55531e = thread;
                                    thread.start();
                                    break;
                                }
                                if (atomicReference.get() != aVar2) {
                                    bVar.f172463f.warn("Ignoring duplicate call to open()");
                                    break;
                                }
                            }
                            m mVar = new m(sVar, null);
                            lVar.f154430a = bVar;
                            lVar.f154431b = qVar;
                            lVar.f154432c = rVar;
                            lVar.f154435f = 1;
                            objC = j2.c(15000L, mVar, lVar);
                            qVar2 = qVar;
                            if (objC == aVar) {
                            }
                            return aVar;
                        }
                        if (i15 == 1) {
                            rVar = lVar.f154432c;
                            ss2.q qVar3 = (ss2.q) lVar.f154431b;
                            bVar = lVar.f154430a;
                            o13.r.b(objC);
                            qVar2 = qVar3;
                        } else {
                            if (i15 == 2) {
                                o53.r rVar2 = (o53.r) lVar.f154431b;
                                us2.b bVar4 = lVar.f154430a;
                                o13.r.b(objC);
                                rVar = rVar2;
                                bVar = bVar4;
                                ss2.x xVar = (ss2.x) objC;
                                bArr = xVar.f160837a;
                                bArr2 = xVar.f160838b;
                                bArr3 = xVar.f160839c;
                                if (bArr != null && bArr2 != null && bArr3 != null) {
                                    bVar.g(bArr, bArr2, bArr3);
                                }
                                n nVar = new n(rVar, null);
                                lVar.f154430a = bVar;
                                lVar.f154431b = bArr;
                                lVar.f154435f = 3;
                                objC = j2.c(30000L, nVar, lVar);
                                if (objC != aVar) {
                                    bVar2 = bVar;
                                    bArr4 = bArr;
                                }
                                return aVar;
                            }
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bArr4 = (byte[]) lVar.f154431b;
                            bVar2 = lVar.f154430a;
                            o13.r.b(objC);
                        }
                        fVar = (us2.f) objC;
                        if (fVar != null) {
                            throw new GfdiException("GFDI handshake timed out", null, 2, null);
                        }
                        o13.p pVar = new o13.p(fVar, bArr4);
                        bVar2.f172471n = null;
                        return pVar;
                        if (objC == null) {
                            throw new GfdiException("device failed to start sending messages", null, 2, null);
                        }
                        o53.s sVarC = qVar2.getF160841c();
                        lVar.f154430a = bVar;
                        lVar.f154431b = rVar;
                        lVar.f154432c = null;
                        lVar.f154435f = 2;
                        objC = sVarC.C(lVar);
                        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
                        if (objC != aVar) {
                            ss2.x xVar2 = (ss2.x) objC;
                            bArr = xVar2.f160837a;
                            bArr2 = xVar2.f160838b;
                            bArr3 = xVar2.f160839c;
                            if (bArr != null) {
                                bVar.g(bArr, bArr2, bArr3);
                            }
                            n nVar2 = new n(rVar, null);
                            lVar.f154430a = bVar;
                            lVar.f154431b = bArr;
                            lVar.f154435f = 3;
                            objC = j2.c(30000L, nVar2, lVar);
                            if (objC != aVar) {
                                bVar2 = bVar;
                                bArr4 = bArr;
                                fVar = (us2.f) objC;
                                if (fVar != null) {
                                    throw new GfdiException("GFDI handshake timed out", null, 2, null);
                                }
                                o13.p pVar2 = new o13.p(fVar, bArr4);
                                bVar2.f172471n = null;
                                return pVar2;
                            }
                        }
                        return aVar;
                    } catch (Throwable th4) {
                        th3 = th4;
                        qVar.f172471n = null;
                        throw th3;
                    }
                } catch (Exception e14) {
                    e4 = e14;
                    if (e4 instanceof GfdiException) {
                        throw e4;
                    }
                    throw new GfdiException("GFDI initialization failed", e4);
                }
            } catch (Exception e15) {
                e4 = e15;
                if (e4 instanceof GfdiException) {
                    throw e4;
                }
                throw new GfdiException("GFDI initialization failed", e4);
            } catch (Throwable th5) {
                qVar = bVar;
                th3 = th5;
                qVar.f172471n = null;
                throw th3;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ i(c cVar, us2.b bVar, dt2.d dVar, List list, List list2, GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse, p pVar, Logger logger, p005kotlin.jvm.internal.j jVar) {
        this(cVar, bVar, dVar, list, list2, featureCapabilitiesResponse, pVar, logger);
    }
}
