package com.garmin.livetrack.retrofit;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lst2/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager$getProfilePasscode$response$1", f = "RetrofitManager.kt", l = {905}, m = "invokeSuspend")
public final class l extends v13.i implements e23.l<t13.d<? super a0<st2.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f52462b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f52462b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<st2.e>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52461a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.e eVarB = b.b(this.f52462b);
        this.f52461a = 1;
        Object objF = eVarB.f(this);
        return objF == aVar ? aVar : objF;
    }
}
