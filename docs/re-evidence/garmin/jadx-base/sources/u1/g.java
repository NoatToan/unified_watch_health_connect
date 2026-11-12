package u1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1", f = "Clickable.kt", l = {1461}, m = "invokeSuspend", v = 1)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f167492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.l.b f167493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, a2.l.b bVar2, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f167492b = bVar;
        this.f167493c = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f167492b, this.f167493c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167491a;
        if (i14 == 0) {
            o13.r.b(obj);
            a2.j jVar = this.f167492b.f167348c;
            if (jVar != null) {
                a2.l.a aVar2 = new a2.l.a(this.f167493c);
                this.f167491a = 1;
                if (jVar.b(aVar2, this) == aVar) {
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
