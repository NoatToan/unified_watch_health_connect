package vu1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import jv1.c0;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardViewModel$getArticleContent$1", f = "FBTDashBoardViewModel.kt", l = {356}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f180376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<g3<c0>> f180377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f180378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f180379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y0<g3<c0>> y0Var, o oVar, String str, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f180377c = y0Var;
        this.f180378d = oVar;
        this.f180379e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f180377c, this.f180378d, this.f180379e, dVar);
        tVar.f180376b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f180376b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180375a;
        y0<g3<c0>> y0Var = this.f180377c;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            kv1.b bVar = this.f180378d.I;
            this.f180376b = b0Var;
            this.f180375a = 1;
            bVar.getClass();
            obj = f0.J(bVar, new kv1.l(bVar, this.f180379e, null), this);
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
            u62.z.h(g3.f35298f, ((v2.b) v2Var).f47386a, y0Var);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "FBTDashBoardViewModel", "Error occurred while fetching article content data");
            y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
