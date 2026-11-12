package zr0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyr0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.data.repository.JetLagRepositoryImpl$getDailyStatus$2", f = "JetLagRepositoryImpl.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<yr0.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f206758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f206759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, LocalDate localDate, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f206758b = gVar;
        this.f206759c = localDate;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f206758b, this.f206759c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<yr0.f>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206757a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<yr0.f>> i0VarC = this.f206758b.f206765a.c(fz0.d.c(this.f206759c));
        this.f206757a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
