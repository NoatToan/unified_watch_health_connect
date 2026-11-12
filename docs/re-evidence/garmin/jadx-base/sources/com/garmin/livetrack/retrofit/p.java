package com.garmin.livetrack.retrofit;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager$isPersonalUrlAvailable$response$1", f = "RetrofitManager.kt", l = {614}, m = "invokeSuspend")
public final class p extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f52473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b bVar, String str, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f52472b = bVar;
        this.f52473c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f52472b, this.f52473c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52471a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Object value = this.f52472b.f52434e.getValue();
        value.getClass();
        this.f52471a = 1;
        Object objB = ((b.c) value).b(this.f52473c, this);
        return objB == aVar ? aVar : objB;
    }
}
