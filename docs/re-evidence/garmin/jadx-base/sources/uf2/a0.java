package uf2;

import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice$sendCompleteSkippedWorkoutStepsResponse$2", f = "LiveActivityInteractorAppToDevice.kt", l = {157}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super o13.q<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f170292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dt2.g f170293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(GDISmartProto.Smart smart, dt2.g gVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f170292b = smart;
        this.f170293c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f170292b, this.f170293c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.q<? extends Unit>> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        GDISmartProto.Smart smart = this.f170292b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170291a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivityInteractorAppToDevice", "sendCompleteSkippedWorkoutStepsResponse - request: " + smart);
                dt2.g gVar = this.f170293c;
                smart.getClass();
                this.f170291a = 1;
                if (gVar.c(smart, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityInteractorAppToDevice", "sendCompleteSkippedWorkoutStepsResponse - response sent successfully");
            int i15 = o13.q.f128596b;
            bVar = Unit.INSTANCE;
        } catch (Exception e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityInteractorAppToDevice", "sendCompleteSkippedWorkoutStepsResponse - error: " + e4);
            int i16 = o13.q.f128596b;
            bVar = new o13.q.b(e4);
        }
        return o13.q.a(bVar);
    }
}
