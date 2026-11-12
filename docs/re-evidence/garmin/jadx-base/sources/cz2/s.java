package cz2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
@v13.e(c = "com.garmin.util.coroutines.StillAliveMonitor$run$newJob$1", f = "StillAliveMonitor.kt", l = {63}, m = "invokeSuspend")
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.s f56969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<Object> f56971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f56972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(q<Object> qVar, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f56971c = qVar;
        this.f56972d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f56971c, this.f56972d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.s sVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56970b;
        q<Object> qVar = this.f56971c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.s sVar2 = qVar.f56963e;
                e23.l<t13.d<Object>, Object> lVar = this.f56972d;
                this.f56969a = sVar2;
                this.f56970b = 1;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke == aVar) {
                    return aVar;
                }
                sVar = sVar2;
                obj = objInvoke;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sVar = this.f56969a;
                o13.r.b(obj);
            }
            sVar.p(obj);
        } catch (Throwable th3) {
            qVar.f56963e.O(th3);
        }
        return Unit.INSTANCE;
    }
}
