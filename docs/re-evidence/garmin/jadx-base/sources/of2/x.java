package of2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyWorkoutStepStartedRequest$1", f = "LSVSession.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2.c.u f131952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b bVar, sf2.c.u uVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f131951b = bVar;
        this.f131952c = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f131951b, this.f131952c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131950a;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) this.f131951b.f131736o.getValue();
            sf2.c.u uVar = this.f131952c;
            sf2.e.l lVar = new sf2.e.l(uVar.f158932a, uVar.f158933b, uVar.f158934c);
            this.f131950a = 1;
            if (b0Var.d(lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
