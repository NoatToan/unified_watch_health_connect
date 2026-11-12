package bl2;

import java.util.TimerTask;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbl2/u;", "Ljava/util/TimerTask;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f18729a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer$doExecuteWithRetry$3$run$1", f = "ReadActiveTransfer.kt", l = {146}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f18731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f18731b = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f18731b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f18730a;
            r rVar = this.f18731b;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    rVar.d().debug("Upload hasn't completed within 25 seconds. Respond to device anyway to explicitly keep transfer app reservation");
                    a0 a0Var = (a0) rVar.f18606g.getValue();
                    lk2.b bVarC = rVar.f18600a.c(rVar.f18602c.getF92741e());
                    wk2.i iVar = rVar.f18603d;
                    this.f18730a = 1;
                    if (a0Var.a(bVarC, iVar, true, this) == aVar) {
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
                com.airbnb.lottie.animation.keyframe.a.A("Failed sendTransferStatusResponse ", e4.getMessage(), rVar.d());
            }
            return Unit.INSTANCE;
        }
    }

    public u(r rVar) {
        this.f18729a = rVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        r rVar = this.f18729a;
        rVar.f18712n.cancel();
        ge1.b.T(rVar.f18601b, null, null, new a(rVar, null), 3);
    }
}
