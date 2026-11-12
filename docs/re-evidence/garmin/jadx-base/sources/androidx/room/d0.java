package androidx.room;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2058}, m = "invokeSuspend")
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f10814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f10814c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f10814c, dVar);
        d0Var.f10813b = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f10812a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        if (((o53.b0) this.f10813b).getF7937b().get(r0.f10943b) == null) {
            vb.h.z("Expected a TransactionElement in the CoroutineContext but none was found.");
            return null;
        }
        this.f10812a = 1;
        Object objInvoke = this.f10814c.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
