package vo1;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lyo1/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getUserSocialGroupRides$2", f = "SocialGroupRideRepo.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super a0<List<? extends yo1.k>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f179103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f179104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f179105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar, LocalDate localDate, LocalDate localDate2, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f179103b = cVar;
        this.f179104c = localDate;
        this.f179105d = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f179103b, this.f179104c, this.f179105d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends yo1.k>>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179102a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<yo1.k>>> i0VarB = this.f179103b.f179029a.b(fz0.d.c(this.f179104c), fz0.d.c(this.f179105d));
        this.f179102a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
