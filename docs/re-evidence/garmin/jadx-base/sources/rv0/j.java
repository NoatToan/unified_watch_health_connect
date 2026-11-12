package rv0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pv0.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lpv0/z;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$getWeeklyLoggingDetails$2", f = "LifestyleLoggingRepositoryImpl.kt", l = {161}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super a0<z>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f154659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f154660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b63.o f154661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f154662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, long j8, String str, b63.o oVar, int i14, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f154658b = bVar;
        this.f154659c = j8;
        this.f154660d = str;
        this.f154661e = oVar;
        this.f154662f = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f154658b, this.f154659c, this.f154660d, this.f154661e, this.f154662f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<z>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154657a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<z>> i0VarH = this.f154658b.f154625a.h(this.f154659c, this.f154660d, fz0.d.a(this.f154661e), this.f154662f);
        this.f154657a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
