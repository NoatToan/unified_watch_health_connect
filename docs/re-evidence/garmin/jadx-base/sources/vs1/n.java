package vs1;

import android.content.Context;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.PagedReviewsUseCase$updateSortingMethod$1", f = "PagedReviewsUseCase.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f179867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ us1.e f179868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f179869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set<Long> f179870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, us1.e eVar, Context context, Set<Long> set, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f179867b = lVar;
        this.f179868c = eVar;
        this.f179869d = context;
        this.f179870e = set;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f179867b, this.f179868c, this.f179869d, this.f179870e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179866a;
        l lVar = this.f179867b;
        if (i14 == 0) {
            o13.r.b(obj);
            z1<pt1.w> z1Var = lVar.f179850c;
            pt1.w wVar = new pt1.w(false, false, this.f179868c, j53.l.b(), false, false, false, 96, null);
            this.f179866a = 1;
            if (z1Var.emit(wVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        lVar.a(this.f179869d, lVar.f179851d.j(), (qs1.h) lVar.f179852e.getF182175a(), (String) lVar.f179853f.getF182175a(), this.f179870e);
        return Unit.INSTANCE;
    }
}
