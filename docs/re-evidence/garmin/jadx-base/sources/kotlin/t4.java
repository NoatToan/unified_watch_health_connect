package kotlin;

import e23.p;
import o13.r;
import o53.b0;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$2$1$1", f = "Wrapper.android.kt", l = {127}, m = "invokeSuspend", v = 1)
public final class t4 extends i implements p<b0, d<? super p005kotlin.Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f91541b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(w4 w4Var, d<? super t4> dVar) {
        super(2, dVar);
        this.f91541b = w4Var;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        return new t4(this.f91541b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super p005kotlin.Unit> dVar) {
        return ((t4) create(b0Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f91540a;
        if (i14 == 0) {
            r.b(obj);
            m mVar = this.f91541b.f91634a;
            this.f91540a = 1;
            Object objC = mVar.B.c(this);
            if (objC != aVar) {
                objC = p005kotlin.Unit.INSTANCE;
            }
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return p005kotlin.Unit.INSTANCE;
    }
}
