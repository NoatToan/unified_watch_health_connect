package vj2;

import android.content.Context;
import androidx.room.a0;
import com.garmin.proto.generated.GDIConnectIQHTTPExtension;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.k;
import e23.p;
import java.security.NoSuchAlgorithmException;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.a1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lvj2/e;", "Ldt2/h;", "Ldt2/c;", "Landroid/content/Context;", "ctx", "Lzj2/e;", "dataTransfer", "<init>", "(Landroid/content/Context;Lzj2/e;)V", "a", "ciq-http-raw-resource-request_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements dt2.h, dt2.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f178498j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f178499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zj2.e f178500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecretKey f178501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rs2.c f178502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Logger f178503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u53.d f178504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<Integer> f178505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExtensionRegistryLite f178506i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.ciq.http.rawresourcerequest.RawResourceRequestHandler$onProtobufRequest$1", f = "RawResourceRequestHandler.kt", l = {150}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178507a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<GDIConnectIQHTTPProto.RawResourceRequest> f178509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f178510d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0<GDIConnectIQHTTPProto.RawResourceRequest> r0Var, k kVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f178509c = r0Var;
            this.f178510d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(this.f178509c, this.f178510d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178507a;
            e eVar = e.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    Context applicationContext = eVar.f178499b.getApplicationContext();
                    applicationContext.getClass();
                    zj2.e eVar2 = eVar.f178500c;
                    GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest = this.f178509c.f105810a;
                    rawResourceRequest.getClass();
                    GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest2 = rawResourceRequest;
                    k kVar = this.f178510d;
                    rs2.c cVar = eVar.f178502e;
                    if (cVar == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    g gVar = new g(applicationContext, eVar2, rawResourceRequest2, kVar, cVar, "ciq-raw");
                    this.f178507a = 1;
                    x53.c cVar2 = s0.f129406a;
                    Object objE0 = ge1.b.e0(x53.b.f189152a, new i(gVar, null, null), this);
                    if (objE0 != obj2) {
                        objE0 = Unit.INSTANCE;
                    }
                    if (objE0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                Logger logger = eVar.f178503f;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.error("", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.ciq.http.rawresourcerequest.RawResourceRequestHandler$sendDecryptionFailureResponse$1", f = "RawResourceRequestHandler.kt", l = {162}, m = "invokeSuspend")
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f178512b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f178512b = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f178512b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178511a;
            if (i14 == 0) {
                r.b(obj);
                GDISmartProto.Smart smartA = nu2.a.a(GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder().setRawResourceResponse(GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.DECRYPTION_FAILURE)));
                smartA.getClass();
                this.f178511a = 1;
                if (this.f178512b.a(smartA, this) == aVar) {
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

    public e(Context context, zj2.e eVar) throws NoSuchAlgorithmException {
        context.getClass();
        eVar.getClass();
        this.f178499b = context;
        this.f178500c = eVar;
        f178498j.getClass();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        this.f178501d = secretKeyGenerateKey;
        this.f178505h = a1.b(88);
    }

    public final void c(k kVar) {
        u53.d dVar = this.f178504g;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new c(kVar, null), 3);
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f178504g;
        if (dVar != null) {
            c0.d(dVar, "device connection closed");
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        GDIConnectIQHTTPProto.registerAllExtensions(extensionRegistryLite);
        GDIConnectIQHTTPExtension.registerAllExtensions(extensionRegistryLite);
        builder.setExtension(GDIConnectIQHTTPProto.CapabilitiesRequest.connectIqRequest, GDIConnectIQHTTPProto.CapabilitiesRequest.newBuilder().setServiceVersion(2).setEncryptionKey(ByteString.copyFrom(this.f178501d.getEncoded())).build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f178505h;
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [T, com.garmin.proto.generated.GDIConnectIQHTTPProto$RawResourceRequest] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.garmin.proto.generated.GDIConnectIQHTTPProto$RawResourceRequest] */
    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        kVar.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQHTTPProto.ConnectIQHTTPService> generatedExtension = GDIConnectIQHTTPExtension.connectIqHttpService;
        GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIConnectIQHTTPProto.ConnectIQHTTPService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (connectIQHTTPService == null || !connectIQHTTPService.hasRawResourceRequest()) {
            return false;
        }
        r0 r0Var = new r0();
        r0Var.f105810a = connectIQHTTPService.getRawResourceRequest();
        if (connectIQHTTPService.getRawResourceRequest().hasEncryptedRequest()) {
            Logger logger = this.f178503f;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.debug("Received encrypted RawResourceRequest");
            try {
                if (!connectIQHTTPService.getRawResourceRequest().getEncryptedRequest().hasTag()) {
                    Logger logger2 = this.f178503f;
                    if (logger2 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger2.error("Missing required tag field in EncryptedRequest");
                    c(kVar);
                    return true;
                }
                if (!connectIQHTTPService.getRawResourceRequest().getEncryptedRequest().hasIv()) {
                    Logger logger3 = this.f178503f;
                    if (logger3 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger3.error("Missing required iv field in EncryptedRequest");
                    c(kVar);
                    return true;
                }
                if (!connectIQHTTPService.getRawResourceRequest().getEncryptedRequest().hasCipherText()) {
                    Logger logger4 = this.f178503f;
                    if (logger4 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger4.error("Missing required cipherText field in EncryptedRequest");
                    c(kVar);
                    return true;
                }
                byte[] byteArray = connectIQHTTPService.getRawResourceRequest().getEncryptedRequest().getIv().toByteArray();
                byte[] byteArray2 = connectIQHTTPService.getRawResourceRequest().getEncryptedRequest().getCipherText().toByteArray();
                byte[] byteArray3 = connectIQHTTPService.getRawResourceRequest().getEncryptedRequest().getTag().toByteArray();
                byte[] bArr = new byte[byteArray2.length + byteArray3.length];
                System.arraycopy(byteArray2, 0, bArr, 0, byteArray2.length);
                System.arraycopy(byteArray3, 0, bArr, byteArray2.length, byteArray3.length);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, byteArray);
                Logger logger5 = this.f178503f;
                if (logger5 == null) {
                    s.m("logger");
                    throw null;
                }
                logger5.debug("Decrypting RawResourceRequest");
                cipher.init(2, this.f178501d, gCMParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                ExtensionRegistryLite extensionRegistryLite = this.f178506i;
                if (extensionRegistryLite == null) {
                    s.m("extensionRegistry");
                    throw null;
                }
                r0Var.f105810a = GDIConnectIQHTTPProto.RawResourceRequest.parseFrom(bArrDoFinal, extensionRegistryLite);
                Logger logger6 = this.f178503f;
                if (logger6 == null) {
                    s.m("logger");
                    throw null;
                }
                logger6.debug("Successfully decrypted RawResourceRequest");
            } catch (Throwable th3) {
                Logger logger7 = this.f178503f;
                if (logger7 == null) {
                    s.m("logger");
                    throw null;
                }
                logger7.error("Error decrypting RawResourceRequest, failing request", th3);
                c(kVar);
                return true;
            }
        }
        u53.d dVar = this.f178504g;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new b(r0Var, kVar, null), 3);
            return true;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f178502e = cVar;
        this.f178506i = extensionRegistryLite;
        String strF = a0.f(cVar.getF92746j(), "CIQReq#RawResourceRequestHandler(", ")");
        o53.a0 a0Var = new o53.a0(strF);
        x53.c cVar2 = s0.f129406a;
        this.f178504g = c0.a(a0Var.plus(x53.b.f189152a).plus(ge1.b.h()));
        this.f178503f = LoggerFactory.getLogger(strF);
        gVar.a(this);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lvj2/e$a;", "", "<init>", "()V", "", "CIQ_SERVICE_VERSION", "I", "", "ENCRYPTED_TEXT_ALGORITHM", "Ljava/lang/String;", "ENCRYPTED_TEXT_CIPHER", "ciq-http-raw-resource-request_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
