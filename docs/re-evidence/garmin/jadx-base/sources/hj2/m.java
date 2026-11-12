package hj2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lhj2/e;", "<anonymous>", "(Lo53/b0;)Lhj2/e;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.source.network.RetrofitApiProvider$provideLoqateService$1", f = "RetrofitApiProvider.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements p<b0, t13.d<? super e>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84042a;

    public m(t13.d<? super m> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super e> dVar) {
        return new m(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84042a;
        if (i14 == 0) {
            r.b(obj);
            i iVar = i.f84029a;
            this.f84042a = 1;
            iVar.getClass();
            obj = ge1.b.e0(i.f84031c.f168725a, new h(null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        Object objB = ((c83.b0) obj).b(e.class);
        objB.getClass();
        return objB;
    }
}
