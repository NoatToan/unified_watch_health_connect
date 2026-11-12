package mt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeRepoViewModel$acceptInvitation$1", f = "TeamChallengeViewModel.kt", l = {209}, m = "invokeSuspend", v = 2)
public final class d4 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4 f120576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, t13.d<? super d4> dVar) {
        super(2, dVar);
        this.f120576b = f4Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d4(this.f120576b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d4) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120575a;
        f4 f4Var = this.f120576b;
        if (i14 == 0) {
            o13.r.b(obj);
            yt0.f1 f1Var = f4Var.f120605e;
            String str = f4Var.f120603c;
            this.f120575a = 1;
            f1Var.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(f1Var, new yt0.z0(f1Var, str, null), this);
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
        com.garmin.android.apps.connectmobile.v2<Unit> v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            f4Var.getClass();
            f4Var.f120603c = "";
        }
        f4Var.f120610j.m(v2Var);
        return Unit.INSTANCE;
    }
}
