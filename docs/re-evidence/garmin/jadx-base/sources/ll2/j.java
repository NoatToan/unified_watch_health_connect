package ll2;

import e23.p;
import ml2.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe$read$3", f = "MLRTransportPipe.kt", l = {329}, m = "invokeSuspend")
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f113479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f113480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, e eVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f113479b = rVar;
        this.f113480c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f113479b, this.f113480c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113478a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                r rVar = this.f113479b;
                this.f113478a = 1;
                if (rVar.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            com.airbnb.lottie.animation.keyframe.a.A("Failed to close service after read failure: ", e4.getMessage(), this.f113480c.f113449b);
        }
        return Unit.INSTANCE;
    }
}
