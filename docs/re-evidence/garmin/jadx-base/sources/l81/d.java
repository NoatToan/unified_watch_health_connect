package l81;

import c83.a0;
import e23.l;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk81/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.data.repository.HillScoreRepoImpl$getLatestHillScore$result$1", f = "HillScoreRepoImpl.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<k81.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f111495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f111496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f111497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, LocalDate localDate, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f111496b = eVar;
        this.f111497c = localDate;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f111496b, this.f111497c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<k81.a>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f111495a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        j81.a aVar2 = this.f111496b.f111498a;
        LocalDate localDate = this.f111497c;
        fz0.c cVarC = localDate != null ? fz0.d.c(localDate) : null;
        this.f111495a = 1;
        Object objA = aVar2.a(cVarC, this);
        return objA == aVar ? aVar : objA;
    }
}
