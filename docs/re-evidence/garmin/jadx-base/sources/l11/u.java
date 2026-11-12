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
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.RecipeDetailsViewModel$deleteLoggedRecipe$1", f = "RecipeDetailsViewModel.kt", l = {416}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f108302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f108303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f108304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b11.i.b f108305f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, b63.o oVar, String str, b11.i.b bVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f108302c = tVar;
        this.f108303d = oVar;
        this.f108304e = str;
        this.f108305f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f108302c, this.f108303d, this.f108304e, this.f108305f, dVar);
        uVar.f108301b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f108301b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108300a;
        b63.o oVar = this.f108303d;
        t tVar = this.f108302c;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.g gVar = tVar.f108263k;
            i01.d dVar = new i01.d(i53.a.a(this.f108304e));
            this.f108301b = b0Var;
            this.f108300a = 1;
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
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete recipe log. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "RecipeDetailsViewModel", strD);
            tVar.f108268p.setValue(t.c.C2081c.f108282a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            tVar.f108268p.k(null, new t.c.b(oVar, this.f108305f));
        }
        return Unit.INSTANCE;
    }
}
