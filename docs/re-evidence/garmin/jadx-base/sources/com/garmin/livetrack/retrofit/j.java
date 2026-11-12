package com.garmin.livetrack.retrofit;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lst2/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager$getPersonalUrl$response$1", f = "RetrofitManager.kt", l = {585}, m = "invokeSuspend")
public final class j extends v13.i implements e23.l<t13.d<? super a0<st2.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f52457b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f52457b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<st2.d>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52456a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Object value = this.f52457b.f52434e.getValue();
        value.getClass();
        this.f52456a = 1;
        Object objA = ((b.c) value).a(this);
        return objA == aVar ? aVar : objA;
    }
}
