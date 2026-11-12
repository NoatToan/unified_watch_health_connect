package c42;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.onboarding.VO2MaxOnboardingInitialStateCheckScreenKt$VO2MaxOnboardingInitialStateCheckScreen$1$1", f = "VO2MaxOnboardingInitialStateCheckScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<sd2.f> f24403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<Long, String, Unit> f24404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<List<? extends sd2.f>, Unit> f24405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends sd2.f> list, e23.p<? super Long, ? super String, Unit> pVar, e23.l<? super List<? extends sd2.f>, Unit> lVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f24403a = list;
        this.f24404b = pVar;
        this.f24405c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f24403a, this.f24404b, this.f24405c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<sd2.f> list = this.f24403a;
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                this.f24404b.invoke(new Long(((sd2.f) p13.h0.b0(list)).getUnitID()), ((sd2.f) p13.h0.b0(list)).getDisplayName());
            } else {
                this.f24405c.invoke(list);
            }
        }
        return Unit.INSTANCE;
    }
}
