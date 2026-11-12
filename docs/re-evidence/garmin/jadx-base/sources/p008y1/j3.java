package p008y1;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {914}, m = "invokeSuspend", v = 1)
public final class j3 extends i implements p<o2, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f193340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p<y1, d<? super Unit>, Object> f193341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j3(h3 h3Var, p<? super y1, ? super d<? super Unit>, ? extends Object> pVar, d<? super j3> dVar) {
        super(2, dVar);
        this.f193340c = h3Var;
        this.f193341d = pVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        j3 j3Var = new j3(this.f193340c, this.f193341d, dVar);
        j3Var.f193339b = obj;
        return j3Var;
    }

    @Override // e23.p
    public final Object invoke(o2 o2Var, d<? super Unit> dVar) {
        return ((j3) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193338a;
        if (i14 == 0) {
            r.b(obj);
            o2 o2Var = (o2) this.f193339b;
            h3 h3Var = this.f193340c;
            h3Var.f193264k = o2Var;
            h3.a aVar2 = h3Var.f193265l;
            this.f193338a = 1;
            if (this.f193341d.invoke(aVar2, this) == aVar) {
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
