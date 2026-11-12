package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll3/f;", "Ll3/o0;", "it", "", "<anonymous>", "(Ll3/f;Ll3/o0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
public final class p extends v13.i implements e23.q<f, o0<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m.e f109379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p008y1.v0, t13.d<? super Unit>, Object> f109380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(m.e eVar, e23.p<? super p008y1.v0, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super p> dVar) {
        super(3, dVar);
        this.f109379b = eVar;
        this.f109380c = pVar;
    }

    @Override // e23.q
    public final Object invoke(f fVar, o0<Object> o0Var, t13.d<? super Unit> dVar) {
        return new p(this.f109379b, this.f109380c, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f109378a;
        if (i14 == 0) {
            o13.r.b(obj);
            m.e.a aVar2 = this.f109379b.f109345a;
            this.f109378a = 1;
            if (this.f109380c.invoke(aVar2, this) == aVar) {
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
