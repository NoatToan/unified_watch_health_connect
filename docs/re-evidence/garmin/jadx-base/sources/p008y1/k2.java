package p008y1;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
public final class k2 extends i implements p<o2, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f193355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f193356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f193357c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(o0 o0Var, float f14, d<? super k2> dVar) {
        super(2, dVar);
        this.f193356b = o0Var;
        this.f193357c = f14;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        k2 k2Var = new k2(this.f193356b, this.f193357c, dVar);
        k2Var.f193355a = obj;
        return k2Var;
    }

    @Override // e23.p
    public final Object invoke(o2 o2Var, d<? super Unit> dVar) {
        return ((k2) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f193356b.f105806a = ((o2) this.f193355a).f(this.f193357c);
        return Unit.INSTANCE;
    }
}
