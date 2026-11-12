package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {96}, m = "invokeSuspend", v = 1)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<n4.c, s1.o> f201530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f201531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(s1.b<n4.c, s1.o> bVar, long j8, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f201530b = bVar;
        this.f201531c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f201530b, this.f201531c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201529a;
        if (i14 == 0) {
            o13.r.b(obj);
            n4.c cVarA = n4.c.a(this.f201531c);
            s1.j1<n4.c> j1Var = d1.f201562d;
            this.f201529a = 1;
            if (s1.b.c(this.f201530b, cVarA, j1Var, null, this, 12) == aVar) {
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
