package dq1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshCoordinator$awaitRefresh$refresh$1$2", f = "GraduationConsentRefreshCoordinator.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f60745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f60747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, String str, boolean z14, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f60745b = dVar;
        this.f60746c = str;
        this.f60747d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f60745b, this.f60746c, this.f60747d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60744a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f60744a = 1;
            if (d.a(this.f60745b, this.f60746c, this.f60747d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
