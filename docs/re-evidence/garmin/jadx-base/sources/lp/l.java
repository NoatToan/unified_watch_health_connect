package lp;

import e23.p;
import l30.i0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.domain.HistoricalActivitiesChangedUseCase$invoke$1", f = "HistoricalActivitiesChangedUseCase.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f114123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f114123c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f114123c, dVar);
        lVar.f114122b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((l) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f114122b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114121a;
        if (i14 == 0) {
            r.b(obj);
            j jVar = this.f114123c;
            tVar.i(Boolean.valueOf(jVar.f114117a.K4()));
            k kVar = new k(jVar, tVar, 0);
            jVar.f114117a.u3(kVar);
            i0 i0Var = new i0(14, jVar, kVar);
            this.f114122b = null;
            this.f114121a = 1;
            if (q53.r.a(tVar, i0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
