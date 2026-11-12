package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$deleteLoggedFood$1", f = "FoodDetailsViewModel.kt", l = {445}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f108137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f108138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f108139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b11.i.a f108140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, b63.o oVar, String str, b11.i.a aVar2, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f108137c = aVar;
        this.f108138d = oVar;
        this.f108139e = str;
        this.f108140f = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f108137c, this.f108138d, this.f108139e, this.f108140f, dVar);
        cVar.f108136b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f108136b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108135a;
        b63.o oVar = this.f108138d;
        a aVar2 = this.f108137c;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.g gVar = aVar2.f108061j;
            i01.d dVar = new i01.d(i53.a.a(this.f108139e));
            this.f108136b = b0Var;
            this.f108135a = 1;
            obj = gVar.R(oVar, dVar, this);
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
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete food log. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            aVar2.f108073x.setValue(a.d.c.f108099a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            aVar2.f108073x.k(null, new a.d.b(oVar, this.f108140f));
        }
        return Unit.INSTANCE;
    }
}
