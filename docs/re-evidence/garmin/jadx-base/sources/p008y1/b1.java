package p008y1;

import e23.l;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;
import x9.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/v0;", "", "<anonymous>", "(Ly1/v0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {317}, m = "invokeSuspend", v = 1)
public final class b1 extends i implements p<v0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<l<? super e0.b, Unit>, d<? super Unit>, Object> f193103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f193104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1(p<? super l<? super e0.b, Unit>, ? super d<? super Unit>, ? extends Object> pVar, c1 c1Var, d<? super b1> dVar) {
        super(2, dVar);
        this.f193103c = pVar;
        this.f193104d = c1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b1 b1Var = new b1(this.f193103c, this.f193104d, dVar);
        b1Var.f193102b = obj;
        return b1Var;
    }

    @Override // e23.p
    public final Object invoke(v0 v0Var, d<? super Unit> dVar) {
        return ((b1) create(v0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193101a;
        if (i14 == 0) {
            r.b(obj);
            b bVar = new b(11, (v0) this.f193102b, this.f193104d);
            this.f193101a = 1;
            if (this.f193103c.invoke(bVar, this) == aVar) {
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
