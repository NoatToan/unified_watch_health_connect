package com.garmin.android.apps.connectmobile.live.activity;

import am.b2;
import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lto/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.live.activity.DefaultLiveActivityActivityInfoDataSource$getActivityTypeKey$result$1", f = "DefaultLiveActivityActivityInfoDataSource.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super a0<to.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f38397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, int i14, int i15, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f38397b = bVar;
        this.f38398c = i14;
        this.f38399d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f38397b, this.f38398c, this.f38399d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<to.b>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f38396a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b2 b2Var = this.f38397b.f38390a;
        this.f38396a = 1;
        Object objR = b2Var.r(this.f38398c, this.f38399d, this);
        return objR == aVar ? aVar : objR;
    }
}
