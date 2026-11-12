package v01;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.ReportFoodIssueUseCase$invoke$2", f = "ReportFoodIssueUseCase.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class t1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l11.h f174540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g01.l f174541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f174542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1 f174543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(l11.h hVar, g01.l lVar, String str, u1 u1Var, t13.d<? super t1> dVar) {
        super(2, dVar);
        this.f174540b = hVar;
        this.f174541c = lVar;
        this.f174542d = str;
        this.f174543e = u1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t1(this.f174540b, this.f174541c, this.f174542d, this.f174543e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((t1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174539a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        l11.h hVar = this.f174540b;
        g01.k kVar = new g01.k(hVar.f108160a, hVar.f108161b, hVar.f108162c, hVar.f108163d, b63.a.C0229a.f16171a.a(), this.f174541c, this.f174542d);
        m01.g gVar = this.f174543e.f174551a;
        this.f174539a = 1;
        Object objT = gVar.t(kVar, this);
        return objT == aVar ? aVar : objT;
    }
}
