package f11;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateMealException;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomMealImageUploadFailed;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import y22.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateMealViewModel$saveCustomMeal$1", f = "CreateMealViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f67961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f67962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d11.b f67963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, Context context, d11.b bVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f67961c = gVar;
        this.f67962d = context;
        this.f67963e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f67961c, this.f67962d, this.f67963e, dVar);
        iVar.f67960b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f67960b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67959a;
        d11.b bVar = this.f67963e;
        g gVar = this.f67961c;
        if (i14 == 0) {
            r.b(obj);
            gVar.f67936h.setValue(g.c.LOADING);
            v01.h hVar = gVar.f67931c;
            d11.d dVar = bVar.f57044a;
            x xVar = bVar.f57046c;
            x xVar2 = bVar.f57045b;
            this.f67960b = b0Var;
            this.f67959a = 1;
            obj = ge1.b.e0(hVar.f174390c, new v01.g(dVar, xVar, xVar2, hVar, this.f67962d, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            Exception exc = ((v2.a) v2Var).f47383a;
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "Failed to create food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CreateMealViewModel", strD);
            if (exc instanceof CreateMealException) {
                gVar.f67934f.setValue(((CreateMealException) exc).getErrors());
                gVar.f67936h.setValue(g.c.LOADED);
            } else if (exc instanceof CustomMealImageUploadFailed) {
                CustomMealImageUploadFailed customMealImageUploadFailed = (CustomMealImageUploadFailed) exc;
                d11.d dVarA = d11.d.a(bVar.f57044a, new Long(customMealImageUploadFailed.getMealId()), null, null, 6);
                x xVar3 = bVar.f57045b;
                x xVarB = xVar3 != null ? x.b(xVar3) : null;
                g.b.C1412b c1412b = new g.b.C1412b(customMealImageUploadFailed.getMealId());
                gVar.getClass();
                gVar.f67929a = c1412b;
                gVar.f67938j = true;
                p2 p2Var = gVar.f67932d;
                d11.b bVar2 = (d11.b) p2Var.getValue();
                p2Var.setValue(bVar2 != null ? d11.b.a(bVar2, dVarA, xVarB, 12) : null);
                gVar.f67936h.setValue(g.c.LOADED);
            } else {
                gVar.f67934f.setValue(j53.l.b());
                gVar.f67936h.setValue(g.c.ERROR);
            }
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            gVar.f67938j = true;
            gVar.f67936h.setValue(g.c.SAVED);
        }
        return Unit.INSTANCE;
    }
}
