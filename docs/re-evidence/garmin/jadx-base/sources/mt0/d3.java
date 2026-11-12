package mt0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.LeaderboardChallengesFragment$handlePremiumAccessRetrieved$1", f = "LeaderboardChallengesFragment.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class d3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var, t13.d<? super d3> dVar) {
        super(2, dVar);
        this.f120574b = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d3(this.f120574b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120573a;
        if (i14 == 0) {
            o13.r.b(obj);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f120573a = 1;
            obj = j1Var.l(qVar, this);
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
        if (((Boolean) obj).booleanValue()) {
            com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
            com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120574b;
            h0Var.J6().f140669j = true;
            com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f0Var = h0Var.f37566k;
            if (f0Var == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
            boolean z14 = h0Var.J6().f140669j;
            f0Var.f37471g = z14;
            com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h hVar = f0Var.f37469e;
            if (hVar != null) {
                hVar.e(z14);
            }
            com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o oVar = f0Var.f37470f;
            if (oVar != null) {
                oVar.e(z14);
            }
        }
        return Unit.INSTANCE;
    }
}
