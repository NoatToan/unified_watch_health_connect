package uf2;

import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice$sendAppInitiatedCommandWithResponse$2", f = "LiveActivityInteractorAppToDevice.kt", l = {118}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super o13.q<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command f170532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f170533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.g f170534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command, GDISmartProto.Smart smart, dt2.g gVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f170532b = command;
        this.f170533c = smart;
        this.f170534d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f170532b, this.f170533c, this.f170534d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.q<? extends Unit>> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        GDISmartProto.Smart smart = this.f170533c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170531a;
        GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command = this.f170532b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivityInteractorAppToDevice", "sendAppInitiatedCommand - command: " + command + " request: " + smart);
                dt2.g gVar = this.f170534d;
                smart.getClass();
                this.f170531a = 1;
                obj = gVar.b(smart, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            GDISmartProto.Smart smart2 = (GDISmartProto.Smart) obj;
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityInteractorAppToDevice", "sendAppInitiatedCommand - command: " + command + " response: " + smart2);
            GDILiveSessionProto.AppInitiatedActivityCommandResponse appInitiatedActivityCommandResponse = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) GDILiveSessionExtension.liveSessionService)).getAppInitiatedActivityCommandResponse();
            if (appInitiatedActivityCommandResponse.hasFailure()) {
                zg2.c.b("LiveActivityInteractorAppToDevice", "sendAppInitiatedCommand - command: " + command + " failure: " + appInitiatedActivityCommandResponse.getFailure());
                int i15 = o13.q.f128596b;
                bVar = new o13.q.b(new Exception("Command " + command + " failed with reason: " + appInitiatedActivityCommandResponse.getFailure()));
            } else {
                int i16 = o13.q.f128596b;
                bVar = Unit.INSTANCE;
            }
        } catch (Exception e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityInteractorAppToDevice", "sendAppInitiatedCommand - command: " + command + " error: " + e4);
            int i17 = o13.q.f128596b;
            bVar = new o13.q.b(e4);
        }
        return o13.q.a(bVar);
    }
}
