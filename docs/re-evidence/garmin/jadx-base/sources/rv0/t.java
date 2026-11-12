package rv0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lpv0/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$updateCustomBehaviour$2", f = "LifestyleLoggingRepositoryImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super a0<pv0.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f154691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.d f154692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b bVar, long j8, pv0.d dVar, t13.d<? super t> dVar2) {
        super(1, dVar2);
        this.f154690b = bVar;
        this.f154691c = j8;
        this.f154692d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f154690b, this.f154691c, this.f154692d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<pv0.d>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154689a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<pv0.d>> i0VarI = this.f154690b.f154625a.i(this.f154691c, this.f154692d);
        this.f154689a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
