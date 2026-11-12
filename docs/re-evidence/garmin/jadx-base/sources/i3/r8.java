package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$3", f = "ModalBottomSheet.kt", l = {181}, m = "invokeSuspend")
public final class r8 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f89507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(mc mcVar, t13.d<? super r8> dVar) {
        super(2, dVar);
        this.f89507b = mcVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r8(this.f89507b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r8) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f89506a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f89506a = 1;
            if (this.f89507b.d(this) == aVar) {
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
