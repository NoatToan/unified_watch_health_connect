package zz2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.bottomsheet.material3.FlexibleBottomSheetKt$FlexibleBottomSheet$5$2$6$1$1$1$3$1", f = "FlexibleBottomSheet.kt", l = {332}, m = "invokeSuspend")
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a03.p pVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f207705b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f207705b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207704a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f207704a = 1;
            if (this.f207705b.e(this) == aVar) {
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
