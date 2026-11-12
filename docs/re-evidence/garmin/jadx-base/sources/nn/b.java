package nn;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.BaseViewModel$setAction$1", f = "BaseViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c<k, l, j> f126655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f126656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c<k, l, j> cVar, j jVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f126655b = cVar;
        this.f126656c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f126655b, this.f126656c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126654a;
        if (i14 == 0) {
            r.b(obj);
            q53.b bVar = this.f126655b.f126661e;
            this.f126654a = 1;
            if (bVar.h(this.f126656c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
