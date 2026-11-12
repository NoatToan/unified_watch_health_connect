package ey0;

import ch.qos.logback.core.net.SyslogConstants;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcy0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$createMultiDayActivity$2", f = "MultiDayActivitiesRepository.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.l<t13.d<? super c83.a0<cy0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sy0.j f67130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g0 g0Var, sy0.j jVar, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f67129b = g0Var;
        this.f67130c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f67129b, this.f67130c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<cy0.k>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67128a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<cy0.k>> i0VarC = g0.b(this.f67129b).c(oe2.f.c0(this.f67130c));
        this.f67128a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
