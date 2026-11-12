package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/lifecycle/t0;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend", v = 1)
public final class w extends v13.i implements e23.p<t0<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f8059c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t0<T> f8060a;

        public a(t0<T> t0Var) {
            this.f8060a = t0Var;
        }

        @Override // r53.j
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            Object objEmit = this.f8060a.emit(t7, dVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r53.i<Object> iVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f8059c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f8059c, dVar);
        wVar.f8058b = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Object> t0Var, t13.d<? super Unit> dVar) {
        return ((w) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f8057a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a((t0) this.f8058b);
            this.f8057a = 1;
            if (this.f8059c.collect(aVar2, this) == aVar) {
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
