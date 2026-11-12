package zz2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.bottomsheet.material3.FlexibleBottomSheetKt$FlexibleBottomSheet$anchorChangeHandler$1$1$1", f = "FlexibleBottomSheet.kt", l = {133}, m = "invokeSuspend")
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a03.y f207750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f207751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a03.p pVar, a03.y yVar, float f14, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f207749b = pVar;
        this.f207750c = yVar;
        this.f207751d = f14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f207749b, this.f207750c, this.f207751d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207748a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f207748a = 1;
            if (a03.p.a(this.f207749b, this.f207750c, this.f207751d, null, this, 4) == aVar) {
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
