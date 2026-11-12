package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.EcgDataSourceImpl$saveCache$1", f = "EcgDataSourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f33212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(d1 d1Var, String str, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f33212a = d1Var;
        this.f33213b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g1(this.f33212a, this.f33213b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        d1 d1Var = this.f33212a;
        jw.c cVarD = d1.d(d1Var, d1Var.f33166g);
        Unit unit = Unit.INSTANCE;
        cVarD.d(unit, this.f33213b);
        return unit;
    }
}
