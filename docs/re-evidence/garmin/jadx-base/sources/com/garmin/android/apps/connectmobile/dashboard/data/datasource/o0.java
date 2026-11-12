package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj70/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardConfigDataSourceImpl$fetchDashboardConfig$dashboardConfigServerResult$1", f = "DashboardConfigDataSourceImpl.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.l<t13.d<? super c83.a0<j70.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f33305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m0 m0Var, t13.d<? super o0> dVar) {
        super(1, dVar);
        this.f33305b = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o0(this.f33305b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<j70.f>> dVar) {
        return ((o0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33304a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        k0 k0Var = this.f33305b.f33270a;
        this.f33304a = 1;
        Object objB = k0Var.b(true, this);
        return objB == aVar ? aVar : objB;
    }
}
