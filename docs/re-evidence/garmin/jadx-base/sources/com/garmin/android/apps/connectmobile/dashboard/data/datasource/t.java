package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.ActivityTrendsPreferencesDataSourceImpl$setPromptSeen$2", f = "ActivityTrendsPreferencesDataSourceImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f33351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o70.c f33352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f33353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, o70.c cVar, b2 b2Var, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f33351b = pVar;
        this.f33352c = cVar;
        this.f33353d = b2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f33351b, this.f33352c, this.f33353d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33350a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Unit>> i0VarB = this.f33351b.f33306a.b(p.d(this.f33352c), this.f33353d);
        this.f33350a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
