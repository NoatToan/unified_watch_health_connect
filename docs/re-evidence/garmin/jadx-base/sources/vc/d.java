package vc;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.a1;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$7$1", f = "NavDisplay.kt", l = {477}, m = "invokeSuspend", v = 1)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1<uc.c<Object>> f176952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f176953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.c<Object> f176954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a1<uc.c<Object>> a1Var, float f14, uc.c<Object> cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f176952b = a1Var;
        this.f176953c = f14;
        this.f176954d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f176952b, this.f176953c, this.f176954d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176951a;
        if (i14 == 0) {
            r.b(obj);
            this.f176951a = 1;
            if (this.f176952b.n(this.f176953c, this.f176954d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
