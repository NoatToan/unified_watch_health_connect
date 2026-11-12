package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.ActiveCampaignDataSourceImpl$triggerCacheCall$1", f = "ActiveCampaignDataSourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f33173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f33173b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f33173b, dVar);
        eVar.f33172a = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f33172a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b bVar = this.f33173b;
        ff2.c cVar = bVar.f33141a;
        cn1.d dVar = new cn1.d(5, b0Var, bVar);
        ff2.c.a aVar2 = ff2.c.f71140c;
        cVar.a(dVar, true);
        return Unit.INSTANCE;
    }
}
