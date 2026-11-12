package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/c;", "clickLocation", "", "<anonymous>", "(Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1", f = "SelectionManager.kt", l = {187}, m = "invokeSuspend", v = 1)
public final class f1 extends v13.i implements e23.p<n4.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f201576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f201577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(o1 o1Var, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f201577c = o1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f1 f1Var = new f1(this.f201577c, dVar);
        f1Var.f201576b = ((n4.c) obj).f123544a;
        return f1Var;
    }

    @Override // e23.p
    public final Object invoke(n4.c cVar, t13.d<? super Unit> dVar) {
        return ((f1) create(n4.c.a(cVar.f123544a), dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201575a;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f201576b;
            o1 o1Var = this.f201577c;
            o13.p<s5.c, s5.w0> pVarE = o1Var.e();
            if (pVarE != null) {
                s5.c cVar = pVarE.f128594a;
                long j14 = pVarE.f128595b.f157317a;
                q qVar = o1Var.f201733x;
                if (qVar != null) {
                    n4.c.a(j8);
                    this.f201575a = 1;
                    if (qVar.b(cVar, j14, this) == aVar) {
                        return aVar;
                    }
                }
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
