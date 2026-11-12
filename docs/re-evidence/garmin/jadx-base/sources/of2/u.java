package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifySpecificWorkoutEvent$1", f = "LSVSession.kt", l = {141}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2.c f131921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar, sf2.c cVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f131920b = bVar;
        this.f131921c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f131920b, this.f131921c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        sf2.e.C3005e.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131919a;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) this.f131920b.f131736o.getValue();
            sf2.c.w wVar = sf2.c.w.f158937a;
            sf2.c cVar = this.f131921c;
            if (p005kotlin.jvm.internal.s.g(cVar, wVar)) {
                aVar = sf2.e.C3005e.a.WORKOUT_WARMUP;
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.q.f158925a)) {
                aVar = sf2.e.C3005e.a.WORKOUT_ACTIVE;
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.r.f158926a)) {
                aVar = sf2.e.C3005e.a.WORKOUT_COOLDOWN;
            } else {
                if (!p005kotlin.jvm.internal.s.g(cVar, sf2.c.s.f158927a)) {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("LSVSession", "Invalid event type " + cVar);
                    return Unit.INSTANCE;
                }
                aVar = sf2.e.C3005e.a.WORKOUT_REST;
            }
            sf2.e.C3005e c3005e = new sf2.e.C3005e(aVar);
            this.f131919a = 1;
            if (b0Var.d(c3005e, this) == aVar2) {
                return aVar2;
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
