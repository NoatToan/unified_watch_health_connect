package xt2;

import ch.qos.logback.classic.Logger;
import com.garmin.proto.generated.GDIFindMyWatch;
import com.garmin.proto.generated.GDIFindMyWatchExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.c;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@e(c = "com.garmin.net.findmydevice.FindMyWatchDataHandler$findMyWatch$1", f = "FindMyWatchDataHandler.kt", l = {101}, m = "invokeSuspend")
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f192200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f192201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f192202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f192203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a.d f192205f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, int i14, a.d dVar, d dVar2) {
        super(2, dVar2);
        this.f192203d = aVar;
        this.f192204e = i14;
        this.f192205f = dVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        dVar.getClass();
        b bVar = new b(this.f192203d, this.f192204e, this.f192205f, dVar);
        bVar.f192200a = (b0) obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        GDIFindMyWatch.FindMyWatchService findMyWatchService;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192202c;
        a.d dVar = this.f192205f;
        a aVar2 = this.f192203d;
        try {
            try {
                if (i14 == 0) {
                    r.b(obj);
                    b0 b0Var = this.f192200a;
                    GDIFindMyWatch.FindMyWatchService findMyWatchServiceBuild = GDIFindMyWatch.FindMyWatchService.newBuilder().setFindRequest(GDIFindMyWatch.FindMyWatchRequest.newBuilder().setTimeout(this.f192204e)).build();
                    g gVar = aVar2.f192193e;
                    if (gVar == null) {
                        s.m("messenger");
                        throw null;
                    }
                    GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder.setExtension(GDIFindMyWatchExtension.findMyWatchService, findMyWatchServiceBuild);
                    GDISmartProto.Smart smartBuild = builderNewBuilder.build();
                    smartBuild.getClass();
                    this.f192201b = b0Var;
                    this.f192202c = 1;
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
                if (findMyWatchService != null && findMyWatchService.hasFindResponse()) {
                    GDIFindMyWatch.FindMyWatchResponse findResponse = findMyWatchService.getFindResponse();
                    if ((findResponse != null ? findResponse.getStatus() : null) == GDIFindMyWatch.ResponseStatus.ERROR) {
                        c cVar = aVar2.f192192d;
                        if (cVar == null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        dVar.c(cVar);
                    }
                    return Unit.INSTANCE;
                }
                c cVar2 = aVar2.f192192d;
                if (cVar2 != null) {
                    dVar.d(cVar2);
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
                logger.error("Error occurred when calling Find My Watch callback", (Throwable) e4);
            }
        } catch (Exception e14) {
            Logger logger2 = aVar2.f192190b;
            if (logger2 == null) {
                s.m("logger");
                throw null;
            }
            logger2.error("Failed to send Find My Watch message", (Throwable) e14);
        }
    }
}
