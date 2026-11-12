package v01;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls21/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetMicronutrientsSettingsUseCase$invoke$2", f = "GetMicronutrientsSettingsUseCase.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s21.o>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f174530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f174531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, b63.o oVar, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f174530b = t0Var;
        this.f174531c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s0(this.f174530b, this.f174531c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s21.o>> dVar) {
        return ((s0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        s21.o oVarA0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174529a;
        b63.o oVar = this.f174531c;
        t0 t0Var = this.f174530b;
        if (i14 == 0) {
            o13.r.b(obj);
            s21.o oVarI = t0Var.f174537b.i(oVar);
            if (oVarI != null) {
                return new v2.b(oVarI, 200, null, null, 12, null);
            }
            m01.g gVar = t0Var.f174536a;
            this.f174529a = 1;
            obj = gVar.Y(oVar, this);
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
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            lc.u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        l01.h hVar = ((l01.k) bVar.f47386a).f107886i;
        if (hVar != null) {
            oVarA0 = o72.t.a0(hVar);
            t0Var.f174537b.j(oVar, oVarA0);
        } else {
            oVarA0 = null;
        }
        return new v2.b(oVarA0, bVar.f47387b, null, null, 12, null);
    }
}
