package xt2;

import ch.qos.logback.classic.Logger;
import com.garmin.proto.generated.GDIFindMyWatch;
import com.garmin.proto.generated.GDIFindMyWatchExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import e23.p;
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
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Lxt2/a;", "Ldt2/a;", "Lxt2/a$a;", "legacyCallback", "Lt13/g;", "coroutineContext", "<init>", "(Lxt2/a$a;Lt13/g;)V", "(Lt13/g;)V", "a", "b", "c", "d", "find-my-device_release"}, k = 1, mv = {1, 4, 0})
public final class a implements dt2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Logger f192190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u53.d f192191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rs2.c f192192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f192193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t13.g f192194f;

    /* JADX INFO: renamed from: xt2.a$a, reason: collision with other inner class name */
    @o13.e
    public interface InterfaceC3585a extends d, b {
    }

    public interface b {
        void a(rs2.c cVar);

        void b(rs2.c cVar);
    }

    public interface d {
        void c(rs2.c cVar);

        void d(rs2.c cVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @v13.e(c = "com.garmin.net.findmydevice.FindMyWatchDataHandler$cancelFindMyWatch$1", f = "FindMyWatchDataHandler.kt", l = {140}, m = "invokeSuspend")
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0 f192195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b0 f192196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f192197c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f192199e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, t13.d dVar) {
            super(2, dVar);
            this.f192199e = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            dVar.getClass();
            e eVar = a.this.new e(this.f192199e, dVar);
            eVar.f192195a = (b0) obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            GDIFindMyWatch.FindMyWatchService findMyWatchService;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f192197c;
            b bVar = this.f192199e;
            a aVar2 = a.this;
            try {
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        b0 b0Var = this.f192195a;
                        GDIFindMyWatch.FindMyWatchService findMyWatchServiceBuild = GDIFindMyWatch.FindMyWatchService.newBuilder().setCancelRequest(GDIFindMyWatch.FindMyWatchCancelRequest.newBuilder()).build();
                        g gVar = aVar2.f192193e;
                        if (gVar == null) {
                            s.m("messenger");
                            throw null;
                        }
                        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder.setExtension(GDIFindMyWatchExtension.findMyWatchService, findMyWatchServiceBuild);
                        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
                        smartBuild.getClass();
                        this.f192196b = b0Var;
                        this.f192197c = 1;
                        obj = gVar.b(smartBuild, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    GDISmartProto.Smart smart = (GDISmartProto.Smart) obj;
                    if (smart != null) {
                        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIFindMyWatch.FindMyWatchService> generatedExtension = GDIFindMyWatchExtension.findMyWatchService;
                        findMyWatchService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIFindMyWatch.FindMyWatchService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
                    }
                    if (findMyWatchService != null && findMyWatchService.hasCancelResponse()) {
                        GDIFindMyWatch.FindMyWatchResponse cancelResponse = findMyWatchService.getCancelResponse();
                        if ((cancelResponse != null ? cancelResponse.getStatus() : null) == GDIFindMyWatch.ResponseStatus.ERROR) {
                            rs2.c cVar = aVar2.f192192d;
                            if (cVar == null) {
                                s.m("deviceInfo");
                                throw null;
                            }
                            bVar.b(cVar);
                        }
                        return Unit.INSTANCE;
                    }
                    rs2.c cVar2 = aVar2.f192192d;
                    if (cVar2 != null) {
                        bVar.a(cVar2);
                        return Unit.INSTANCE;
                    }
                    s.m("deviceInfo");
                    throw null;
                } catch (Exception e4) {
                    Logger logger = aVar2.f192190b;
                    if (logger == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger.error("Error occurred when calling Cancel Find My Watch callback", (Throwable) e4);
                }
            } catch (Exception e14) {
                Logger logger2 = aVar2.f192190b;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.error("Failed to send Cancel Find My Watch message", (Throwable) e14);
            }
        }
    }

    static {
        new c(null);
    }

    public a(t13.g gVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? s0.f129406a : gVar);
    }

    public final void c(b bVar) {
        u53.d dVar = this.f192191c;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new e(bVar, null), 3);
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f192191c;
        if (dVar != null) {
            c0.d(dVar, "FindMyWatchHandler closed");
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    public final void d(d dVar) {
        u53.d dVar2 = this.f192191c;
        if (dVar2 != null) {
            ge1.b.T(dVar2, null, null, new xt2.b(this, 60, dVar, null), 3);
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return a1.b(9);
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        int i14 = gt2.c.f79010a;
        this.f192190b = gt2.b.f79005a.i("FindMyWatchHandler");
        this.f192191c = zl.a.e("FindMyWatchHandler", this.f192194f.plus(ge1.b.h()));
        this.f192192d = cVar;
        this.f192193e = gVar;
        GDIFindMyWatchExtension.registerAllExtensions(extensionRegistryLite);
        GDIFindMyWatch.registerAllExtensions(extensionRegistryLite);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxt2/a$c;", "", "<init>", "()V", "", "SUPPORTED_CAPABILITY", "I", "", "TAG", "Ljava/lang/String;", "find-my-device_release"}, k = 1, mv = {1, 4, 0})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(j jVar) {
            this();
        }
    }

    public a(InterfaceC3585a interfaceC3585a, t13.g gVar, int i14, j jVar) {
        this(interfaceC3585a, (i14 & 2) != 0 ? s0.f129406a : gVar);
    }

    @o13.e
    public a(InterfaceC3585a interfaceC3585a, t13.g gVar) {
        gVar.getClass();
        this.f192194f = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(t13.g gVar) {
        this(null, gVar);
        gVar.getClass();
    }
}
