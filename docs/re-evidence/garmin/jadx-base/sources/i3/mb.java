package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {1156}, m = "invokeSuspend")
public final class mb extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nb f88989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f88990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(nb nbVar, int i14, t13.d<? super mb> dVar) {
        super(2, dVar);
        this.f88989b = nbVar;
        this.f88990c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new mb(this.f88989b, this.f88990c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((mb) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f88988a;
        if (i14 == 0) {
            o13.r.b(obj);
            nb nbVar = this.f88989b;
            u1.d2 d2Var = nbVar.f89072a;
            s1.f0<Float> f0Var = nbVar.f89074c;
            this.f88988a = 1;
            Object objA = p008y1.m2.a(d2Var, this.f88990c - d2Var.f167433a.getIntValue(), f0Var, this);
            if (objA != obj2) {
                objA = Unit.INSTANCE;
            }
            if (objA == obj2) {
                return obj2;
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
