package bu0;

import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasActiveSession", "Lrs2/c;", "deviceInfo", "Lbu0/k;", "<anonymous>", "(ZLrs2/c;)Lbu0/k;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.domain.GetLiveActivitySessionStateUseCase$invoke$1", f = "GetLiveActivitySessionStateUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements q<Boolean, rs2.c, t13.d<? super k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f21192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ rs2.c f21193b;

    public c(t13.d<? super c> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(Boolean bool, rs2.c cVar, t13.d<? super k> dVar) {
        boolean zBooleanValue = bool.booleanValue();
        c cVar2 = new c(dVar);
        cVar2.f21192a = zBooleanValue;
        cVar2.f21193b = cVar;
        return cVar2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14 = this.f21192a;
        rs2.c cVar = this.f21193b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        return (!z14 || cVar == null) ? k.b.f21213a : new k.a(cVar.getF172494b());
    }
}
