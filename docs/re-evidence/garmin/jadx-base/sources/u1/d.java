package u1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", l = {1795}, m = "invokeSuspend", v = 1)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.j f167425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.f f167426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a2.j jVar, a2.f fVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f167425b = jVar;
        this.f167426c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f167425b, this.f167426c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167424a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f167424a = 1;
            if (this.f167425b.b(this.f167426c, this) == aVar) {
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
