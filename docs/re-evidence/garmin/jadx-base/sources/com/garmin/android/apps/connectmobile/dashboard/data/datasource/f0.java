package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.BroadcastHRDataSourceImpl$getDisplayName$2", f = "BroadcastHRDataSourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rs2.c f33192a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(rs2.c cVar, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f33192a = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f33192a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String displayName;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        rd2.j jVar = rd2.f.a().f152045a;
        rs2.c cVar = this.f33192a;
        long f172494b = cVar.getF172494b();
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(f172494b, null);
        return (fVarI == null || (displayName = fVarI.getDisplayName()) == null) ? cVar.getF172496d() : displayName;
    }
}
