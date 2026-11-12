package uf2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice$sendModifyWorkoutRequest$1$1", f = "LiveActivityInteractorAppToDevice.kt", l = {290}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rf2.d f170330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dt2.g f170331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(rf2.d dVar, dt2.g gVar, t13.d<? super e0> dVar2) {
        super(2, dVar2);
        this.f170330b = dVar;
        this.f170331c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f170330b, this.f170331c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170329a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                GDILiveSessionProto.ModifyWorkoutRequest.Builder builderNewBuilder = GDILiveSessionProto.ModifyWorkoutRequest.newBuilder();
                rf2.d dVar = this.f170330b;
                if (dVar instanceof rf2.d.a) {
                    builderNewBuilder.setAddClusterId(dVar.f152463a);
                } else if (dVar instanceof rf2.d.b) {
                    builderNewBuilder.setDeletedClusterId(dVar.f152463a);
                } else if (dVar instanceof rf2.d.c) {
                    builderNewBuilder.setSkippedClusterId(dVar.f152463a);
                } else {
                    if (!(dVar instanceof rf2.d.C2867d)) {
                        lc.u0.r();
                        return null;
                    }
                    builderNewBuilder.setStartNowClusterId(dVar.f152463a);
                }
                GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder2 = GDILiveSessionProto.LiveSessionService.newBuilder();
                builderNewBuilder2.setModifyWorkoutRequest(builderNewBuilder.build());
                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                builderNewBuilder3.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder2.build());
                dt2.g gVar = this.f170331c;
                GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
                smartBuild.getClass();
                this.f170329a = 1;
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
            zg2.c.b("LiveActivityInteractorAppToDevice", "sendModifyWorkoutRequest error - " + e4);
        }
        return Unit.INSTANCE;
    }
}
