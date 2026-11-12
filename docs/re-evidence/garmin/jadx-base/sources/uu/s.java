package uu;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$getAvailableBadges$1", f = "BadgesViewModel.kt", l = {269}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> f172755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f172756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.service.model.b[] f172757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.service.model.d[] f172758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f172760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f172761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> y0Var, q qVar, com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr, com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr, int i14, int i15, boolean z14, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f172755b = y0Var;
        this.f172756c = qVar;
        this.f172757d = bVarArr;
        this.f172758e = dVarArr;
        this.f172759f = i14;
        this.f172760g = i15;
        this.f172761h = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f172755b, this.f172756c, this.f172757d, this.f172758e, this.f172759f, this.f172760g, this.f172761h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172754a;
        y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> y0Var = this.f172755b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            zu.d dVar = this.f172756c.f172739d;
            this.f172754a = 1;
            obj = dVar.a(this.f172757d, this.f172758e, this.f172759f, this.f172760g, this.f172761h, this);
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
            v2.a aVar2 = (v2.a) v2Var;
            y0Var.j(g3.a.a(g3.f35298f, aVar2.f47383a.toString(), aVar2.f47383a, null, aVar2.f47384b, 4));
        }
        return Unit.INSTANCE;
    }
}
