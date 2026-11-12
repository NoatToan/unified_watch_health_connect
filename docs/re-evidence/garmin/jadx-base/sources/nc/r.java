package nc;

import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m1;
import p3.x3;
import s1.a1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {636}, m = "invokeSuspend")
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1<lc.v> f125329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<List<lc.v>> f125330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f125331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(a1<lc.v> a1Var, x3<? extends List<lc.v>> x3Var, m1 m1Var, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f125329b = a1Var;
        this.f125330c = x3Var;
        this.f125331d = m1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f125329b, this.f125330c, this.f125331d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125328a;
        if (i14 == 0) {
            o13.r.b(obj);
            x3<List<lc.v>> x3Var = this.f125330c;
            if (x3Var.getF182175a().size() > 1) {
                lc.v vVar = x3Var.getF182175a().get(x3Var.getF182175a().size() - 2);
                float floatValue = this.f125331d.getFloatValue();
                this.f125328a = 1;
                if (this.f125329b.n(floatValue, vVar, this) == aVar) {
                    return aVar;
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
