package gx2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljx2/b;", "<anonymous>", "(Lo53/b0;)Ljx2/b;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.SaMDHelper$createAccountManager$2", f = "SaMDHelper.kt", l = {}, m = "invokeSuspend")
public final class d extends v13.i implements p<b0, t13.d<? super jx2.b>, Object> {
    public d(t13.d<? super d> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super jx2.b> dVar) {
        return new d(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        return new jx2.b();
    }
}
