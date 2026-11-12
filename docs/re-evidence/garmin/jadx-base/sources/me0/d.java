package me0;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$deleteDog$2", f = "DogsRepository.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f117995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f117996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar, long j8, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f117995b = wVar;
        this.f117996c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f117995b, this.f117996c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117994a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.c cVarB = w.b(this.f117995b);
        this.f117994a = 1;
        Object objH = cVarB.h(this.f117996c, this);
        return objH == aVar ? aVar : objH;
    }
}
