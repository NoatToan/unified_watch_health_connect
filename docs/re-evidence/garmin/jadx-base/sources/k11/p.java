package k11;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.screen.FoodReportIssueBottomSheetKt$FoodReportIssueBottomSheet$1$1", f = "FoodReportIssueBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l11.k f102254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f102255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<String, Unit> f102256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f102257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<l11.i> f102258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(l11.k kVar, e23.a<Unit> aVar, e23.l<? super String, Unit> lVar, String str, x3<l11.i> x3Var, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f102254a = kVar;
        this.f102255b = aVar;
        this.f102256c = lVar;
        this.f102257d = str;
        this.f102258e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f102254a, this.f102255b, this.f102256c, this.f102257d, this.f102258e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f102258e.getF182175a().f108169f) {
            l11.k kVar = this.f102254a;
            kVar.x4();
            this.f102255b.invoke();
            this.f102256c.invoke(this.f102257d);
            kVar.f108177b.k(null, new l11.i(null, null, null, false, false, false, false, 127, null));
        }
        return Unit.INSTANCE;
    }
}
