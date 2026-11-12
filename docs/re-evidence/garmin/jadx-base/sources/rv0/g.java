package rv0;

import c83.a0;
import ch.qos.logback.core.net.SyslogConstants;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pv0.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lpv0/z;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$getDailyLoggingDetails$2", f = "LifestyleLoggingRepositoryImpl.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super a0<z>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f154645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f154646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b63.o f154647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b63.o f154648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, long j8, String str, b63.o oVar, b63.o oVar2, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f154644b = bVar;
        this.f154645c = j8;
        this.f154646d = str;
        this.f154647e = oVar;
        this.f154648f = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f154644b, this.f154645c, this.f154646d, this.f154647e, this.f154648f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<z>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154643a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<z>> i0VarK = this.f154644b.f154625a.k(this.f154645c, this.f154646d, fz0.d.a(this.f154647e), fz0.d.a(this.f154648f));
        this.f154643a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
