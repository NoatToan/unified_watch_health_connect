package v01;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/z;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetMealsUseCase$invoke$2", f = "GetMealsUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.z>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f174493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f174494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f174495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f174496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z14, p0 p0Var, b63.o oVar, boolean z15, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f174493b = z14;
        this.f174494c = p0Var;
        this.f174495d = oVar;
        this.f174496e = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o0(this.f174493b, this.f174494c, this.f174495d, this.f174496e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.z>> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g01.z zVarG;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174492a;
        boolean z14 = this.f174496e;
        b63.o oVar = this.f174495d;
        p0 p0Var = this.f174494c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f174493b && (zVarG = p0Var.f174499b.g(oVar, z14)) != null) {
                return new v2.b(zVarG, 200, null, null, 12, null);
            }
            m01.g gVar = p0Var.f174498a;
            boolean zE = p0Var.f174500c.e();
            this.f174492a = 1;
            obj = gVar.v(oVar, z14, zE, this);
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
            p0Var.f174499b.l(oVar, z14, (g01.z) ((v2.b) v2Var).f47386a);
        }
        return v2Var;
    }
}
