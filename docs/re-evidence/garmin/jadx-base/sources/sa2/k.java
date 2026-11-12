package sa2;

import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$getReportID$1", f = "ReportsDownloadPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f158368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f158369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<qa2.b, Unit> f158370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(h hVar, e23.l<? super qa2.b, Unit> lVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f158369b = hVar;
        this.f158370c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f158369b, this.f158370c, dVar);
        kVar.f158368a = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f158368a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        h hVar = this.f158369b;
        qa2.e eVar = hVar.f158337c;
        i iVar = new i(b0Var, hVar, this.f158370c, 2);
        qa2.e.f143900h.getClass();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new qa2.h(eVar, iVar, null), 3);
        return Unit.INSTANCE;
    }
}
