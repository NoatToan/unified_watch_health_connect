package ak2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.proto.generated.GDIDeepLinkingProto;
import com.garmin.proto.generated.GDIDeepLinkingProtoExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.ProtocolStringList;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.h0;
import p13.u;
import p13.x;
import p13.y;
import t13.g;
import u53.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\n\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\t¨\u0006\f"}, d2 = {"Lak2/a;", "Ldt2/a;", "Ldt2/h;", "Lak2/a$a;", "callback", "Lt13/g;", "coroutineContext", "<init>", "(Lak2/a$a;Lt13/g;)V", "(Lak2/a$a;)V", "a", "b", "deep-linking_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements dt2.a, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0062a f3696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f3697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f3698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f3699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rs2.c f3700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Integer> f3701g;

    /* JADX INFO: renamed from: ak2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0062a {
        void a(Uri uri, rs2.c cVar);

        Context getContext();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.garmin.device.deeplinking.DeepLinkingDataHandler$onProtobufRequest$1", f = "DeepLinkingDataHandler.kt", l = {117}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3702a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIDeepLinkingProto.OpenDeepLinkingRequest f3704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f3705d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GDIDeepLinkingProto.OpenDeepLinkingRequest openDeepLinkingRequest, k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f3704c = openDeepLinkingRequest;
            this.f3705d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f3704c, this.f3705d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3702a;
            if (i14 == 0) {
                r.b(obj);
                this.f3702a = 1;
                if (a.this.c(this.f3704c, this.f3705d, this) == aVar) {
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
        new b(null);
    }

    public a(InterfaceC0062a interfaceC0062a, g gVar) {
        interfaceC0062a.getClass();
        gVar.getClass();
        this.f3696b = interfaceC0062a;
        this.f3697c = gVar;
        this.f3701g = a1.b(96);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    public final Object c(GDIDeepLinkingProto.OpenDeepLinkingRequest openDeepLinkingRequest, k kVar, v13.c cVar) {
        ak2.b bVar;
        Logger logger;
        if (cVar instanceof ak2.b) {
            bVar = (ak2.b) cVar;
            int i14 = bVar.f3709d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f3709d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new ak2.b(this, cVar);
            }
        } else {
            bVar = new ak2.b(this, cVar);
        }
        Object obj = bVar.f3707b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f3709d;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    a aVar = bVar.f3706a;
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a aVar2 = bVar.f3706a;
                r.b(obj);
                return Unit.INSTANCE;
            }
            r.b(obj);
            try {
                try {
                    ProtocolStringList schemasList = openDeepLinkingRequest.getSchemasList();
                    schemasList.getClass();
                    ArrayList arrayList = new ArrayList(y.r(schemasList, 10));
                    Iterator<String> it = schemasList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse(it.next()));
                    }
                    Iterator it3 = arrayList.iterator();
                    int i16 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i16 = -1;
                            break;
                        }
                        Uri uri = (Uri) it3.next();
                        uri.getClass();
                        if (l(uri)) {
                            break;
                        }
                        i16++;
                    }
                    GDIDeepLinkingProto.OpenDeepLinkingResponse.Builder builderNewBuilder = GDIDeepLinkingProto.OpenDeepLinkingResponse.newBuilder();
                    if (i16 >= 0) {
                        builderNewBuilder.setStatus(GDIDeepLinkingProto.OpenDeepLinkingResponse.ResponseStatus.OK);
                        builderNewBuilder.setUsedSchemaIndex(i16);
                    } else {
                        builderNewBuilder.setStatus(GDIDeepLinkingProto.OpenDeepLinkingResponse.ResponseStatus.UNHANDLED);
                    }
                    GDIDeepLinkingProto.DeepLinkingService.Builder deepLinkingResponse = GDIDeepLinkingProto.DeepLinkingService.newBuilder().setDeepLinkingResponse(builderNewBuilder);
                    try {
                        GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder2.setExtension(GDIDeepLinkingProtoExtension.deeplinkingService, deepLinkingResponse.build());
                        GDISmartProto.Smart smartBuild = builderNewBuilder2.build();
                        smartBuild.getClass();
                        bVar.f3706a = this;
                        bVar.f3709d = 2;
                        if (kVar.a(smartBuild, bVar) == obj2) {
                            return obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        openDeepLinkingRequest = this;
                        logger = openDeepLinkingRequest.f3698d;
                        if (logger != null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.error("Error occurred when sending response to open links", th);
                    }
                } catch (Throwable th4) {
                    Logger logger2 = this.f3698d;
                    if (logger2 == null) {
                        try {
                            s.m("logger");
                            throw null;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            openDeepLinkingRequest = this;
                            logger = openDeepLinkingRequest.f3698d;
                            if (logger != null) {
                                logger.error("Error occurred when sending response to open links", th);
                                return Unit.INSTANCE;
                            }
                            s.m("logger");
                            throw null;
                        }
                    }
                    logger2.error("Error occurred when trying to open links", th4);
                    GDIDeepLinkingProto.DeepLinkingService.Builder deepLinkingResponse2 = GDIDeepLinkingProto.DeepLinkingService.newBuilder().setDeepLinkingResponse(GDIDeepLinkingProto.OpenDeepLinkingResponse.newBuilder().setStatus(GDIDeepLinkingProto.OpenDeepLinkingResponse.ResponseStatus.UNKNOWN_ERROR));
                    try {
                        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder3.setExtension(GDIDeepLinkingProtoExtension.deeplinkingService, deepLinkingResponse2.build());
                        GDISmartProto.Smart smartBuild2 = builderNewBuilder3.build();
                        smartBuild2.getClass();
                        bVar.f3706a = this;
                        bVar.f3709d = 1;
                        if (kVar.a(smartBuild2, bVar) != obj2) {
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        openDeepLinkingRequest = this;
                        logger = openDeepLinkingRequest.f3698d;
                        if (logger != null) {
                            logger.error("Error occurred when sending response to open links", th);
                            return Unit.INSTANCE;
                        }
                        s.m("logger");
                        throw null;
                    }
                    th = th;
                }
            } catch (Throwable th7) {
                th = th7;
                openDeepLinkingRequest = this;
                logger = openDeepLinkingRequest.f3698d;
                if (logger != null) {
                    s.m("logger");
                    throw null;
                }
                logger.error("Error occurred when sending response to open links", th);
            }
            return Unit.INSTANCE;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        d dVar = this.f3699e;
        if (dVar != null) {
            c0.d(dVar, "DeepLinkingDataHandler closed");
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    public final boolean d(Uri uri) {
        rs2.c cVar = this.f3700f;
        if (cVar != null) {
            this.f3696b.a(uri, cVar);
            return true;
        }
        s.m("deviceInfo");
        throw null;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f3701g;
    }

    public final boolean l(Uri uri) {
        if (s.g(uri.toString(), "https://connect.garmin.com/payment/add")) {
            uri = Uri.parse("connectagent://launch/payment/add");
            uri.getClass();
        }
        if (h0.R(x.k("connectagent", "connectiq", "exploreagent"), uri.getScheme())) {
            d(uri);
            return true;
        }
        if (s.g(uri.getScheme(), "https") && h0.R(u.m0(new String[]{"connect.garmin.com", "connecttest.garmin.com", "connect.garmin.cn"}), uri.getHost())) {
            d(uri);
            return true;
        }
        try {
            Context context = this.f3696b.getContext();
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(uri);
            context.startActivity(intent);
            return true;
        } catch (Throwable th3) {
            Logger logger = this.f3698d;
            if (logger != null) {
                logger.error("Could not open the link", th3);
                return false;
            }
            s.m("logger");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        GDIDeepLinkingProto.OpenDeepLinkingRequest deepLinkingRequest;
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeepLinkingProto.DeepLinkingService> generatedExtension = GDIDeepLinkingProtoExtension.deeplinkingService;
        GDIDeepLinkingProto.DeepLinkingService deepLinkingService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIDeepLinkingProto.DeepLinkingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (deepLinkingService == null) {
            deepLinkingRequest = null;
        } else {
            if (!deepLinkingService.hasDeepLinkingRequest()) {
                deepLinkingService = null;
            }
            if (deepLinkingService != null) {
                deepLinkingRequest = deepLinkingService.getDeepLinkingRequest();
            } else {
                deepLinkingRequest = null;
            }
        }
        if (deepLinkingRequest == null) {
            return false;
        }
        d dVar = this.f3699e;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new c(deepLinkingRequest, kVar, null), 3);
            return true;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        GDIDeepLinkingProtoExtension.registerAllExtensions(extensionRegistryLite);
        GDIDeepLinkingProto.registerAllExtensions(extensionRegistryLite);
        this.f3700f = cVar;
        Logger logger = LoggerFactory.getLogger("DeepLinkingDataHandler");
        logger.getClass();
        this.f3698d = logger;
        this.f3699e = zl.a.e("DeepLinkingDataHandler", this.f3697c.plus(ge1.b.h()));
        ((dt2.d) gVar).f61154i.add(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lak2/a$b;", "", "<init>", "()V", "", "CONNECT_CHINA_HOST", "Ljava/lang/String;", "CONNECT_HOST", "CONNECT_SCHEME", "CONNECT_TEST_HOST", "EXPLORE_SCHEME", "HTTPS_SCHEME", "TAG", "TOYSTORE_SCHEME", "deep-linking_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC0062a interfaceC0062a) {
        this(interfaceC0062a, s0.f129406a);
        interfaceC0062a.getClass();
    }
}
