package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {80}, m = "invokeSuspend", v = 1)
public final class r3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f135265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<k2<Object>, t13.d<? super Unit>, Object> f135266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Object> f135267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r3(e23.p<? super k2<Object>, ? super t13.d<? super Unit>, ? extends Object> pVar, p1<Object> p1Var, t13.d<? super r3> dVar) {
        super(2, dVar);
        this.f135266c = pVar;
        this.f135267d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r3 r3Var = new r3(this.f135266c, this.f135267d, dVar);
        r3Var.f135265b = obj;
        return r3Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f135264a;
        if (i14 == 0) {
            o13.r.b(obj);
            l2 l2Var = new l2(this.f135267d, ((o53.b0) this.f135265b).getF135150b());
            this.f135264a = 1;
            if (this.f135266c.invoke(l2Var, this) == aVar) {
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
