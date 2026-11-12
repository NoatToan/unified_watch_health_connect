package kp0;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ljp0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.hydration.data.repo.HydrationRepository$getHydrationDailySummary$2", f = "HydrationRepository.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements l<t13.d<? super a0<List<? extends jp0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f105980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f105981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f105982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, DateTime dateTime, DateTime dateTime2, t13.d<? super a> dVar) {
        super(1, dVar);
        this.f105980b = jVar;
        this.f105981c = dateTime;
        this.f105982d = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f105980b, this.f105981c, this.f105982d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends jp0.a>>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105979a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<jp0.a>>> i0VarC = this.f105980b.f106008a.c(fz0.d.b(this.f105981c).toString(), fz0.d.b(this.f105982d).toString());
        this.f105979a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
