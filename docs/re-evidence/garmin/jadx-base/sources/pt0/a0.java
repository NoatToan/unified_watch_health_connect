package pt0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.CompletedChallengesViewModel$getBadgeTranslations$1", f = "CompletedChallengesViewModel.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f140613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> f140614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Unit>> f140615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> list, y0<g3<Unit>> y0Var, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f140613b = zVar;
        this.f140614c = list;
        this.f140615d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f140613b, this.f140614c, this.f140615d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140612a;
        if (i14 == 0) {
            o13.r.b(obj);
            yt0.i0 i0Var = this.f140613b.f140795b;
            this.f140612a = 1;
            obj = i0Var.a(this);
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
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) obj;
        for (com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var : this.f140614c) {
            a0Var.k0(iVar != null ? iVar.b(a0Var.getBadgeKey()) : null);
        }
        this.f140615d.j(g3.a.e(g3.f35298f));
        return Unit.INSTANCE;
    }
}
