package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/t;", "", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardSharedPreferences$getTodayDismissedCards$1", f = "DashboardSharedPreferences.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.p<q53.t<? super List<? extends String>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f33386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(t0 t0Var, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f33386c = t0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w0 w0Var = new w0(this.f33386c, dVar);
        w0Var.f33385b = obj;
        return w0Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super List<? extends String>> tVar, t13.d<? super Unit> dVar) {
        return ((w0) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f33385b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33384a;
        int i15 = 1;
        if (i14 == 0) {
            o13.r.b(obj);
            int i16 = t0.f33354b;
            t0 t0Var = this.f33386c;
            List<String> listK = t0Var.k();
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DashboardPreferences", "getTodayDismissedCards -> " + listK);
            tVar.i(listK);
            u0 u0Var = new u0(t0Var, tVar, i15);
            t0Var.f33355a.u3(u0Var);
            ca0.j1 j1Var = new ca0.j1(8, t0Var, u0Var);
            this.f33385b = null;
            this.f33384a = 1;
            if (q53.r.a(tVar, j1Var, this) == aVar) {
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
