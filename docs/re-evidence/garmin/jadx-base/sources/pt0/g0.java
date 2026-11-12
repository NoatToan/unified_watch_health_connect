package pt0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.LeaderboardChallengesViewModel$badgeChallengeOptIn$1", f = "LeaderboardChallengesViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f140681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f140683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f140684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f140685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DateTime f140686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, String str, DateTime dateTime, long j8, boolean z14, DateTime dateTime2, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f140681b = f0Var;
        this.f140682c = str;
        this.f140683d = dateTime;
        this.f140684e = j8;
        this.f140685f = z14;
        this.f140686g = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f140681b, this.f140682c, this.f140683d, this.f140684e, this.f140685f, this.f140686g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140680a;
        String str = this.f140682c;
        f0 f0Var = this.f140681b;
        if (i14 == 0) {
            o13.r.b(obj);
            f0Var.f140665f.j(new com.garmin.android.apps.connectmobile.y<>(g3.a.c(g3.f35298f)));
            r0 r0Var = f0Var.f140662c;
            this.f140680a = 1;
            obj = r0Var.c(str, this.f140683d, this);
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
            long j8 = this.f140684e;
            f0.x4(f0Var, j8);
            y0<com.garmin.android.apps.connectmobile.y<g3<f0.b>>> y0Var = f0Var.f140665f;
            g3.a aVar2 = g3.f35298f;
            f0.b bVar = new f0.b(str, new d62.s(f0Var, str, j8, 5), this.f140685f, this.f140686g);
            aVar2.getClass();
            y0Var.j(new com.garmin.android.apps.connectmobile.y<>(g3.a.d(bVar)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            f0Var.f140665f.j(new com.garmin.android.apps.connectmobile.y<>(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14)));
        }
        return Unit.INSTANCE;
    }
}
