package md;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
public final class c extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.b0 f117812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f117813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t13.d dVar, androidx.room.b0 b0Var, e23.l lVar) {
        super(2, dVar);
        this.f117812b = b0Var;
        this.f117813c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(dVar, this.f117812b, this.f117813c);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117811a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        e23.l lVar = this.f117813c;
        androidx.room.b0 b0Var = this.f117812b;
        f fVar = new f(true, false, b0Var, null, lVar);
        this.f117811a = 1;
        Object objUseConnection = b0Var.useConnection(false, fVar, this);
        return objUseConnection == aVar ? aVar : objUseConnection;
    }
}
