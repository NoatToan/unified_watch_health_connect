package rv0;

import c83.a0;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$updateDailyBehaviourLog$2", f = "LifestyleLoggingRepositoryImpl.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pv0.h f154695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f154696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar, pv0.h hVar, b63.o oVar, t13.d<? super u> dVar) {
        super(1, dVar);
        this.f154694b = bVar;
        this.f154695c = hVar;
        this.f154696d = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f154694b, this.f154695c, this.f154696d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154693a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        nv0.a aVar2 = this.f154694b.f154625a;
        pv0.h hVar = this.f154695c;
        Long l14 = hVar.f141374a;
        i0<a0<Unit>> i0VarC = aVar2.c(l14 != null ? l14.longValue() : -1L, fz0.d.a(this.f154696d), pv0.h.a(hVar, null, null, DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.SSS"), 127));
        this.f154693a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
