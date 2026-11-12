package v01;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetDailySummaryUseCase$invoke$2", f = "GetDailySummaryUseCase.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f174353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f174354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f174355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z14, g0 g0Var, b63.o oVar, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f174353b = z14;
        this.f174354c = g0Var;
        this.f174355d = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f174353b, this.f174354c, this.f174355d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        k01.b bVarC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174352a;
        b63.o oVar = this.f174355d;
        g0 g0Var = this.f174354c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f174353b && (bVarC = g0Var.f174380b.c(oVar)) != null) {
                return new v2.b(bVarC, 200, null, null, 12, null);
            }
            m01.g gVar = g0Var.f174379a;
            this.f174352a = 1;
            obj = gVar.L0(oVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            g0Var.f174380b.b(oVar, (k01.b) ((v2.b) v2Var).f47386a);
        }
        return v2Var;
    }
}
