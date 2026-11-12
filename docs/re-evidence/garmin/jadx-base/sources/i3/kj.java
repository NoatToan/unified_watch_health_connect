package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {1655}, m = "invokeSuspend")
public final class kj extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lj f88772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(lj ljVar, t13.d<? super kj> dVar) {
        super(1, dVar);
        this.f88772b = ljVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new kj(this.f88772b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((kj) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f88771a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f88771a = 1;
            o53.k kVar = new o53.k(u13.f.b(this), 1);
            kVar.q();
            lj ljVar = this.f88772b;
            ljVar.f88924c.f(Boolean.TRUE);
            ljVar.f88925d = kVar;
            if (kVar.p() == aVar) {
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
