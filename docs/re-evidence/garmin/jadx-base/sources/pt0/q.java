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
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.BadgeChallengesViewModel$badgeChallengeOptIn$1", f = "BadgeChallengesViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f140770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f140772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f140773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f140774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DateTime f140775g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, String str, DateTime dateTime, long j8, boolean z14, DateTime dateTime2, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f140770b = pVar;
        this.f140771c = str;
        this.f140772d = dateTime;
        this.f140773e = j8;
        this.f140774f = z14;
        this.f140775g = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f140770b, this.f140771c, this.f140772d, this.f140773e, this.f140774f, this.f140775g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140769a;
        p pVar = this.f140770b;
        if (i14 == 0) {
            o13.r.b(obj);
            pVar.f140758e.j(new com.garmin.android.apps.connectmobile.y<>(g3.a.c(g3.f35298f)));
            r0 r0Var = pVar.f140755b;
            this.f140769a = 1;
            obj = r0Var.c(this.f140771c, this.f140772d, this);
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
            p.x4(pVar, this.f140773e);
            y0<com.garmin.android.apps.connectmobile.y<g3<p.b>>> y0Var = pVar.f140758e;
            g3.a aVar2 = g3.f35298f;
            p.b bVar = new p.b(this.f140771c, this.f140773e, this.f140774f, this.f140775g);
            aVar2.getClass();
            y0Var.j(new com.garmin.android.apps.connectmobile.y<>(g3.a.d(bVar)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            pVar.f140758e.j(new com.garmin.android.apps.connectmobile.y<>(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14)));
        }
        return Unit.INSTANCE;
    }
}
