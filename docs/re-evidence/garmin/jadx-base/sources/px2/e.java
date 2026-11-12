package px2;

import com.garmin.proto.generated.GDISaMD;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.SaMDEcg;
import o13.r;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpx2/e;", "Lpx2/a;", "Ldt2/g;", "messenger", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ldt2/g;Lorg/slf4j/Logger;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f141793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dt2.g gVar, Logger logger) {
        super(gVar);
        gVar.getClass();
        logger.getClass();
        this.f141793b = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum d(v13.c cVar) {
        b bVar;
        e eVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f141784d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f141784d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objB = bVar.f141782b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f141784d;
        if (i15 == 0) {
            r.b(objB);
            SaMDEcg.Service.Builder appStatusRequest = SaMDEcg.Service.newBuilder().setAppStatusRequest(SaMDEcg.AppStatusRequest.newBuilder());
            appStatusRequest.getClass();
            bVar.f141781a = this;
            bVar.f141784d = 1;
            objB = b(appStatusRequest, bVar);
            if (objB == aVar) {
                return aVar;
            }
            eVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = bVar.f141781a;
            r.b(objB);
        }
        GDISaMD.Service serviceB = tu2.a.b((GDISmartProto.Smart) objB);
        if (serviceB != null && serviceB.hasEcgService() && !serviceB.getEcgService().isEmpty()) {
            SaMDEcg.Service from = SaMDEcg.Service.parseFrom(serviceB.getEcgService());
            if (from.hasAppStatusResponse() && from.getAppStatusResponse().hasStatus()) {
                eVar.f141793b.debug("sendAppStatusRequest: response -> " + from.getAppStatusResponse().getStatus());
                return from.getAppStatusResponse().getStatus();
            }
        }
        eVar.f141793b.error("sendAppStatusRequest: response -> null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum e(String str, v13.c cVar) {
        c cVar2;
        e eVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f141788d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f141788d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.f141786b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f141788d;
        if (i15 == 0) {
            r.b(objB);
            SaMDEcg.Service.Builder builderNewBuilder = SaMDEcg.Service.newBuilder();
            SaMDEcg.EnableRequest.Builder builderNewBuilder2 = SaMDEcg.EnableRequest.newBuilder();
            if (str != null && str.length() != 0) {
                builderNewBuilder2.setSamdId(str);
            }
            Unit unit = Unit.INSTANCE;
            SaMDEcg.Service.Builder enableRequest = builderNewBuilder.setEnableRequest(builderNewBuilder2);
            enableRequest.getClass();
            cVar2.f141785a = this;
            cVar2.f141788d = 1;
            objB = b(enableRequest, cVar2);
            if (objB == aVar) {
                return aVar;
            }
            eVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = cVar2.f141785a;
            r.b(objB);
        }
        GDISaMD.Service serviceB = tu2.a.b((GDISmartProto.Smart) objB);
        if (serviceB != null && serviceB.hasEcgService() && !serviceB.getEcgService().isEmpty()) {
            SaMDEcg.Service from = SaMDEcg.Service.parseFrom(serviceB.getEcgService());
            if (from.hasEnableResponse() && from.getEnableResponse().hasStatus()) {
                eVar.f141793b.debug("sendEnable: response -> " + from.getEnableResponse().getStatus());
                return from.getEnableResponse().getStatus();
            }
        }
        eVar.f141793b.error("sendEnable: response -> null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum f(v13.c cVar) {
        d dVar;
        e eVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f141792d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f141792d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objB = dVar.f141790b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f141792d;
        if (i15 == 0) {
            r.b(objB);
            SaMDEcg.Service.Builder launchRequest = SaMDEcg.Service.newBuilder().setLaunchRequest(SaMDEcg.LaunchRequest.newBuilder());
            launchRequest.getClass();
            dVar.f141789a = this;
            dVar.f141792d = 1;
            objB = b(launchRequest, dVar);
            if (objB == aVar) {
                return aVar;
            }
            eVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = dVar.f141789a;
            r.b(objB);
        }
        GDISaMD.Service serviceB = tu2.a.b((GDISmartProto.Smart) objB);
        if (serviceB != null && serviceB.hasEcgService() && !serviceB.getEcgService().isEmpty()) {
            SaMDEcg.Service from = SaMDEcg.Service.parseFrom(serviceB.getEcgService());
            if (from.hasLaunchResponse() && from.getLaunchResponse().hasStatus()) {
                eVar.f141793b.debug("sendLaunch: response -> " + from.getLaunchResponse().getStatus());
                return from.getLaunchResponse().getStatus();
            }
        }
        eVar.f141793b.error("sendLaunch: response -> null");
        return null;
    }
}
