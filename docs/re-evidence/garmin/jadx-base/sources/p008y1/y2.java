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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/y1;", "", "<anonymous>", "(Ly1/y1;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {371}, m = "invokeSuspend", v = 1)
public final class y2 extends i implements p<y1, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<l<? super e0.b, Unit>, d<? super Unit>, Object> f193722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3 f193723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y2(p<? super l<? super e0.b, Unit>, ? super d<? super Unit>, ? extends Object> pVar, h3 h3Var, d<? super y2> dVar) {
        super(2, dVar);
        this.f193722c = pVar;
        this.f193723d = h3Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        y2 y2Var = new y2(this.f193722c, this.f193723d, dVar);
        y2Var.f193721b = obj;
        return y2Var;
    }

    @Override // e23.p
    public final Object invoke(y1 y1Var, d<? super Unit> dVar) {
        return ((y2) create(y1Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193720a;
        if (i14 == 0) {
            r.b(obj);
            b bVar = new b(12, (y1) this.f193721b, this.f193723d);
            this.f193720a = 1;
            if (this.f193722c.invoke(bVar, this) == aVar) {
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
