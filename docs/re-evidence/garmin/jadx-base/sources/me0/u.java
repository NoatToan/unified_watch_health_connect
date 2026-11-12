package me0;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$updateDogStatus$2", f = "DogsRepository.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je0.t f118060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, long j8, je0.t tVar, t13.d<? super u> dVar) {
        super(1, dVar);
        this.f118058b = wVar;
        this.f118059c = j8;
        this.f118060d = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f118058b, this.f118059c, this.f118060d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118057a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.c cVarB = w.b(this.f118058b);
        this.f118057a = 1;
        Object objG = cVarB.g(this.f118059c, this.f118060d, this);
        return objG == aVar ? aVar : objG;
    }
}
