package fe2;

import java.util.LinkedList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$addEventType$2", f = "DefaultDataUploader.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f70657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ae2.t f70658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, ae2.t tVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f70657a = a0Var;
        this.f70658b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f70657a, this.f70658b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int size;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a0 a0Var = this.f70657a;
        LinkedList linkedList = a0Var.f70594h;
        ae2.t tVar = this.f70658b;
        synchronized (linkedList) {
            a0Var.f70594h.add(tVar);
            size = a0Var.f70594h.size();
            Unit unit = Unit.INSTANCE;
        }
        this.f70657a.f70591e.debug("Added event type " + this.f70658b);
        u62.z.i("Event buffer size ", size, this.f70657a.f70591e);
        return Unit.INSTANCE;
    }
}
