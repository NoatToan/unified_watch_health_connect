package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/t;", "", "Lj70/a0;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardSharedPreferences$getWhatsNewCards$1", f = "DashboardSharedPreferences.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.p<q53.t<? super List<? extends j70.a0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f33389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(t0 t0Var, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f33389c = t0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x0 x0Var = new x0(this.f33389c, dVar);
        x0Var.f33388b = obj;
        return x0Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super List<? extends j70.a0>> tVar, t13.d<? super Unit> dVar) {
        return ((x0) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f33388b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33387a;
        if (i14 == 0) {
            o13.r.b(obj);
            t0 t0Var = this.f33389c;
            Set<String> setL1 = t0Var.f33355a.L1("whats_new_cards");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DashboardPreferences", "getWhatsNewCards -> " + setL1);
            ArrayList arrayList = new ArrayList();
            for (String str : setL1) {
                j70.a0.f97472p.getClass();
                j70.a0 a0VarA = j70.a0.b.a(str);
                if (a0VarA != null) {
                    arrayList.add(a0VarA);
                }
            }
            tVar.i(arrayList);
            u0 u0Var = new u0(t0Var, tVar, 2);
            t0Var.f33355a.u3(u0Var);
            ca0.j1 j1Var = new ca0.j1(9, t0Var, u0Var);
            this.f33388b = null;
            this.f33387a = 1;
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
