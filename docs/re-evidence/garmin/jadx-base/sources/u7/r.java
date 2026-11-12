package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
public final class r extends v13.i implements e23.l<t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f169303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f169303b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f169303b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<Object> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169302a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f169302a = 1;
            Object objInvoke = this.f169303b.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
