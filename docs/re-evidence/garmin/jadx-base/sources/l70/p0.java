package l70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj70/y;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.UserFocusRepositoryImpl$getUserFocus$result$1", f = "UserFocusRepositoryImpl.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.l<t13.d<? super c83.a0<j70.y>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f110761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u0 u0Var, t13.d<? super p0> dVar) {
        super(1, dVar);
        this.f110761b = u0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p0(this.f110761b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<j70.y>> dVar) {
        return ((p0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110760a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.dashboard.data.datasource.k0 k0Var = this.f110761b.f110814a;
        this.f110760a = 1;
        Object objE = k0Var.e(this);
        return objE == aVar ? aVar : objE;
    }
}
