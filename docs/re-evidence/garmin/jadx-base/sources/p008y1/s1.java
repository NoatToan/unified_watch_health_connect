package p008y1;

import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.b;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ly1/n1$a;", "<anonymous>", "(Lo53/b0;)Ly1/n1$a;"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", l = {266}, m = "invokeSuspend", v = 1)
public final class s1 extends i implements p<b0, d<? super n1.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f193630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(n1 n1Var, d<? super s1> dVar) {
        super(2, dVar);
        this.f193630b = n1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new s1(this.f193630b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super n1.a> dVar) {
        return ((s1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193629a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b bVar = this.f193630b.f193441e;
        this.f193629a = 1;
        Object objE = c0.e(new o1(bVar, null), this);
        return objE == aVar ? aVar : objE;
    }
}
