package rx1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.SetBenchmarkBottomSheetKt$SetBenchmarkBottomSheet$1$1", f = "SetBenchmarkBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<dy1.d> f155014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<Integer> f155015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p1<dy1.d> p1Var, x3<Integer> x3Var, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f155014a = p1Var;
        this.f155015b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f155014a, this.f155015b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<dy1.d> p1Var = this.f155014a;
        dy1.d f182175a = p1Var.getF182175a();
        dy1.d dVarA = null;
        if (f182175a != null) {
            dVarA = dy1.d.a(f182175a, this.f155015b.getF182175a().intValue() == 0, null, null, 125);
        }
        p1Var.setValue(dVarA);
        return Unit.INSTANCE;
    }
}
