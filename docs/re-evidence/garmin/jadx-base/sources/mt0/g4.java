package mt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeRepoViewModel$leaveChallenge$1$1", f = "TeamChallengeViewModel.kt", l = {235}, m = "invokeSuspend", v = 2)
public final class g4 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4 f120632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f120633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(f4 f4Var, String str, t13.d<? super g4> dVar) {
        super(2, dVar);
        this.f120632b = f4Var;
        this.f120633c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g4(this.f120632b, this.f120633c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g4) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120631a;
        f4 f4Var = this.f120632b;
        if (i14 == 0) {
            o13.r.b(obj);
            yt0.f1 f1Var = f4Var.f120605e;
            String strValueOf = String.valueOf(f4Var.f120604d);
            this.f120631a = 1;
            f1Var.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(f1Var, new yt0.e1(f1Var, this.f120633c, strValueOf, null), this);
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
        f4Var.f120612l.m((com.garmin.android.apps.connectmobile.v2) obj);
        return Unit.INSTANCE;
    }
}
