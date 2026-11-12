package uf2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice$sendCancelFinalizeTimerRequest$1$1", f = "LiveActivityInteractorAppToDevice.kt", l = {263}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dt2.g f170539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dt2.g gVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f170539b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f170539b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170538a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                GDILiveSessionProto.CancelFinalizeTimerRequest.Builder builderNewBuilder = GDILiveSessionProto.CancelFinalizeTimerRequest.newBuilder();
                GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder2 = GDILiveSessionProto.LiveSessionService.newBuilder();
                builderNewBuilder2.setCancelFinalizeTimerRequest(builderNewBuilder.build());
                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                builderNewBuilder3.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder2.build());
                dt2.g gVar = this.f170539b;
                GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
                smartBuild.getClass();
                this.f170538a = 1;
                if (gVar.c(smartBuild, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (ProtobufException e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityInteractorAppToDevice", "sendCancelFinalizeTimerRequest error - " + e4);
        }
        return Unit.INSTANCE;
    }
}
