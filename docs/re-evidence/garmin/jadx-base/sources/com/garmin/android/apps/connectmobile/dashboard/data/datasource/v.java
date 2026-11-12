package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lj70/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.AvailableEssentialsStatsDataSourceImpl$getAvailableEssentialsStats$2", f = "AvailableEssentialsStatsDataSourceImpl.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends j70.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f33377b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, t13.d<? super v> dVar) {
        super(1, dVar);
        this.f33377b = wVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f33377b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends j70.b>>> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33376a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        k0 k0Var = this.f33377b.f33383a;
        this.f33376a = 1;
        Object objG = k0Var.g(this);
        return objG == aVar ? aVar : objG;
    }
}
