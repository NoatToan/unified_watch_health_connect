package ml2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.multilink.MLRWatchdog$resetConnection$1", f = "MLRWatchdog.kt", l = {}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f119338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.C2269d f119340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str, d.C2269d c2269d, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f119338a = dVar;
        this.f119339b = str;
        this.f119340c = c2269d;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f119338a, this.f119339b, this.f119340c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d dVar = this.f119338a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            dVar.f119317d.warn("Resetting connection due to " + this.f119339b + ". Failures: " + this.f119340c.f119322b.get());
            dVar.f119314a.invoke();
        } catch (Throwable th3) {
            dVar.f119317d.error("Failed to reset connection", th3);
        }
        return Unit.INSTANCE;
    }
}
