package sj2;

import am.j;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIConnectIQHTTPExtension;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.Set;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import us2.f;
import v13.i;
import vj2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsj2/b;", "Ldt2/h;", "Ldt2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzj2/e;", "dataTransfer", "Lsj2/a;", "delegate", "<init>", "(Landroid/content/Context;Lzj2/e;Lsj2/a;)V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements h, dt2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj2.a f159443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f159444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f159445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rs2.c f159446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u53.d f159447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f159448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f159449h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.ciq.http.CIQNetworkManager$onProtobufRequest$1", f = "CIQNetworkManager.kt", l = {96}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159450a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIConnectIQHTTPProto.ConnectIQHTTPService f159452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f159453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f159454e;

        /* JADX INFO: renamed from: sj2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.device.ciq.http.CIQNetworkManager$onProtobufRequest$1$1", f = "CIQNetworkManager.kt", l = {}, m = "invokeSuspend")
        public static final class C3021a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f159455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f159456b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GDIConnectIQHTTPProto.ConnectIQHTTPService f159457c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f159458d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f159459e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3021a(b bVar, GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPService, k kVar, GDISmartProto.Smart smart, t13.d<? super C3021a> dVar) {
                super(2, dVar);
                this.f159456b = bVar;
                this.f159457c = connectIQHTTPService;
                this.f159458d = kVar;
                this.f159459e = smart;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3021a c3021a = new C3021a(this.f159456b, this.f159457c, this.f159458d, this.f159459e, dVar);
                c3021a.f159455a = obj;
                return c3021a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3021a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b bVar = this.f159456b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                b0 b0Var = (b0) this.f159455a;
                try {
                    if (!this.f159457c.hasRawResourceRequest()) {
                        b0Var = null;
                    }
                    k kVar = this.f159458d;
                    if (b0Var != null) {
                        bVar.f159449h.onProtobufRequest(this.f159459e, kVar);
                    } else {
                        Context context = bVar.f159444c;
                        rs2.c cVar = bVar.f159446e;
                        if (cVar == null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        long f92746j = cVar.getF92746j();
                        rs2.c cVar2 = bVar.f159446e;
                        if (cVar2 == null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        String f92741e = cVar2.getF92741e();
                        GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPService = this.f159457c;
                        sj2.a aVar2 = bVar.f159443b;
                        u53.d dVar = bVar.f159447f;
                        if (dVar == null) {
                            s.m("coroutineScope");
                            throw null;
                        }
                        Logger logger = bVar.f159445d;
                        if (logger == null) {
                            s.m("logger");
                            throw null;
                        }
                        new uj2.c(context, f92746j, f92741e, connectIQHTTPService, aVar2, new uj2.d(kVar, dVar, logger)).z();
                    }
                } catch (Exception e4) {
                    Logger logger2 = bVar.f159445d;
                    if (logger2 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger2.error("Failed to process RawResourceRequest or handle a HttpProtobufRequest", (Throwable) e4);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPService, k kVar, GDISmartProto.Smart smart, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159452c = connectIQHTTPService;
            this.f159453d = kVar;
            this.f159454e = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new a(this.f159452c, this.f159453d, this.f159454e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159450a;
            if (i14 == 0) {
                r.b(obj);
                C3021a c3021a = new C3021a(b.this, this.f159452c, this.f159453d, this.f159454e, null);
                this.f159450a = 1;
                if (ge1.b.Y(c3021a, this) == aVar) {
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

    public b(Context context, zj2.e eVar, sj2.a aVar) {
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        this.f159443b = aVar;
        this.f159444c = context.getApplicationContext();
        this.f159449h = new e(context, eVar);
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f159447f;
        if (dVar != null) {
            c0.d(dVar, "CIQNetworkManager closed");
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
        this.f159449h.configure(cVar, extensionRegistryLite, builder);
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return u.m0(new Integer[]{10, 88});
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQHTTPProto.ConnectIQHTTPService> generatedExtension = GDIConnectIQHTTPExtension.connectIqHttpService;
        GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIConnectIQHTTPProto.ConnectIQHTTPService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (connectIQHTTPService == null) {
            return false;
        }
        if (!connectIQHTTPService.hasConnectIqHttpRequest() && !connectIQHTTPService.hasRawResourceRequest() && !connectIQHTTPService.hasOpenWebpageNotification() && !connectIQHTTPService.hasConnectIqOauthRequest() && !connectIQHTTPService.hasConnectIqImageRequest()) {
            return false;
        }
        connectIQHTTPService.hasConnectIqOauthRequest();
        u53.d dVar = this.f159447f;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new a(connectIQHTTPService, kVar, smart, null), 3);
            return true;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        String strM = j.m("CIQReq#CIQNetworkManager[", ((f) cVar).f172493a, "]");
        a0 a0Var = new a0(strM);
        x53.c cVar2 = s0.f129406a;
        this.f159447f = c0.a(a0Var.plus(x53.b.f189152a));
        this.f159445d = LoggerFactory.getLogger(strM);
        ((dt2.d) gVar).f61154i.add(this);
        this.f159446e = cVar;
        this.f159448g = gVar;
        this.f159449h.start(cVar, gVar, extensionRegistryLite);
    }
}
