package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lu7/h1;", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
public final class u1 extends v13.i implements e23.q<h1<Object>, Boolean, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ h1 f169325b;

    public u1(t13.d<? super u1> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(h1<Object> h1Var, Boolean bool, t13.d<Object> dVar) {
        bool.getClass();
        u1 u1Var = new u1(dVar);
        u1Var.f169325b = h1Var;
        return u1Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169324a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        h1 h1Var = this.f169325b;
        this.f169324a = 1;
        Object objE = h1Var.e(this);
        return objE == aVar ? aVar : objE;
    }
}
