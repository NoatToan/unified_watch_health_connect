package sg0;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$updateChild$2", f = "ManageChildViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f159121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f159122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f0 f0Var, long j8, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f159121a = f0Var;
        this.f159122b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m0(this.f159121a, this.f159122b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = f0.f159081i;
        f0 f0Var = this.f159121a;
        f0Var.getClass();
        w9.a aVarA = v1.a(f0Var);
        long j8 = this.f159122b;
        ge1.b.T(aVarA, null, null, new j0(f0Var, j8, null), 3);
        ge1.b.T(v1.a(f0Var), null, null, new g0(f0Var, j8, null), 3);
        f0Var.x4(j8);
        ge1.b.T(v1.a(f0Var), null, null, new k0(f0Var, j8, null), 3);
        return Unit.INSTANCE;
    }
}
