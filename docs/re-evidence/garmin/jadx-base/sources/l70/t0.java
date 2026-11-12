package l70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.UserFocusRepositoryImpl$setUserFocus$result$1", f = "UserFocusRepositoryImpl.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f110808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j70.y f110809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, j70.y yVar, t13.d<? super t0> dVar) {
        super(1, dVar);
        this.f110808b = u0Var;
        this.f110809c = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t0(this.f110808b, this.f110809c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((t0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110807a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.dashboard.data.datasource.k0 k0Var = this.f110808b.f110814a;
        this.f110807a = 1;
        Object objF = k0Var.f(this.f110809c, this);
        return objF == aVar ? aVar : objF;
    }
}
