package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {164}, m = "invokeSuspend")
public final class v8 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f89999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f90000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(mc mcVar, float f14, t13.d<? super v8> dVar) {
        super(2, dVar);
        this.f89999b = mcVar;
        this.f90000c = f14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v8(this.f89999b, this.f90000c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v8) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f89998a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f89998a = 1;
            Object objJ = this.f89999b.f88996e.j(this.f90000c, this);
            if (objJ != obj2) {
                objJ = Unit.INSTANCE;
            }
            if (objJ == obj2) {
                return obj2;
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
