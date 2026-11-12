package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lj70/k$c;", "activitiesAndWorkouts", "Lj70/k$g;", "ecg", "Lj70/k$h;", "events", "", "showLiveActivityCard", "Lj70/a;", "<anonymous>", "(Lj70/k$c;Lj70/k$g;Lj70/k$h;Z)Lj70/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$1$elements$1$4", f = "GetDashboardItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.s<j70.k.c, j70.k.g, j70.k.h, Boolean, t13.d<? super j70.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.c f124608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.k.g f124609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ j70.k.h f124610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f124611d;

    public u0(t13.d<? super u0> dVar) {
        super(5, dVar);
    }

    @Override // e23.s
    public final Object invoke(j70.k.c cVar, j70.k.g gVar, j70.k.h hVar, Boolean bool, t13.d<? super j70.a> dVar) {
        boolean zBooleanValue = bool.booleanValue();
        u0 u0Var = new u0(dVar);
        u0Var.f124608a = cVar;
        u0Var.f124609b = gVar;
        u0Var.f124610c = hVar;
        u0Var.f124611d = zBooleanValue;
        return u0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        yz1.d dVar;
        j70.k.c cVar = this.f124608a;
        j70.k.g gVar = this.f124609b;
        j70.k.h hVar = this.f124610c;
        boolean z14 = this.f124611d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return new j70.a((cVar == null || (dVar = cVar.f97550a) == null) ? new yz1.d(yz1.u.LOADING, null, false, 6, null) : dVar, cVar != null ? cVar.a() : null, cVar != null ? cVar.f97554e : null, cVar != null ? cVar.f97553d : null, gVar != null ? gVar.f97592b : null, cVar != null ? cVar.f97555f : null, p13.x.k(hVar != null ? hVar.f97594b : null, hVar != null ? hVar.f97596d : null, hVar != null ? hVar.f97597e : null), cVar != null ? cVar.f97557h : null, z14);
    }
}
