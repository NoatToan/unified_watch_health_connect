package z70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcz0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.data.PromosStoreImpl$load$2$promos$2$result$1", f = "PromosStore.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.l<t13.d<? super c83.a0<cz0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f202822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f202823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c0 c0Var, String str, t13.d<? super g0> dVar) {
        super(1, dVar);
        this.f202822b = c0Var;
        this.f202823c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g0(this.f202822b, this.f202823c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<cz0.a>> dVar) {
        return ((g0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f202821a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        zy0.n nVarInvoke = this.f202822b.f202784a.invoke();
        this.f202821a = 1;
        Object objB = nVarInvoke.b(this.f202823c, this);
        return objB == aVar ? aVar : objB;
    }
}
