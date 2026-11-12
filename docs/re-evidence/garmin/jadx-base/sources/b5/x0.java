package b5;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {882, 883}, m = "invokeSuspend", v = 1)
public final class x0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0.b<Object> f15939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(long j8, v0.b<Object> bVar, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f15938b = j8;
        this.f15939c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x0(this.f15938b, this.f15939c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (o53.m0.b(8, r10) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15937a;
        long j8 = this.f15938b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f15937a = 1;
            if (o53.m0.b(j8 - 8, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o53.k kVar = this.f15939c.f15920c;
        if (kVar != null) {
            int i15 = o13.q.f128596b;
            kVar.resumeWith(new o13.q.b(new PointerEventTimeoutCancellationException(j8)));
        }
        return Unit.INSTANCE;
        this.f15937a = 2;
    }
}
