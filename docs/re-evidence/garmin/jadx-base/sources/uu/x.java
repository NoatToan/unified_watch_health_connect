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
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$getEarnedBadges$1", f = "BadgesViewModel.kt", l = {298}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> f172786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f172787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.service.model.b[] f172788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.service.model.d[] f172789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f172791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> y0Var, q qVar, com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr, com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr, int i14, int i15, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f172786b = y0Var;
        this.f172787c = qVar;
        this.f172788d = bVarArr;
        this.f172789e = dVarArr;
        this.f172790f = i14;
        this.f172791g = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f172786b, this.f172787c, this.f172788d, this.f172789e, this.f172790f, this.f172791g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172785a;
        y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> y0Var = this.f172786b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            zu.m mVar = this.f172787c.f172740e;
            this.f172785a = 1;
            obj = mVar.a(this.f172788d, this.f172789e, this.f172790f, this.f172791g, this);
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
