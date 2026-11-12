package l3;

import com.google.mlkit.common.MlKitException;
import i3.ij;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend")
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.g0 f109500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ij f109501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m4.g0 g0Var, ij ijVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f109500b = g0Var;
        this.f109501c = ijVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f109500b, this.f109501c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f109499a;
        m4.g0 g0Var = this.f109500b;
        ij ijVar = this.f109501c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (g0Var.a()) {
                u1.k1 k1Var = u1.k1.PreventUserInput;
                this.f109499a = 1;
                if (ijVar.b(k1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (ijVar.isVisible() && !g0Var.a()) {
            ijVar.dismiss();
        }
        return Unit.INSTANCE;
    }
}
