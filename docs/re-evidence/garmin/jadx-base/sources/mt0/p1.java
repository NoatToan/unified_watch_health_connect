package mt0;

import android.content.Intent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsFragment$handlePremiumAccessRetrieved$1", f = "BadgeChallengeDetailsFragment.kt", l = {804}, m = "invokeSuspend", v = 2)
public final class p1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120805b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar, t13.d<? super p1> dVar) {
        super(2, dVar);
        this.f120805b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p1(this.f120805b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120804a;
        if (i14 == 0) {
            o13.r.b(obj);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f120804a = 1;
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
            com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120805b;
            com.garmin.android.apps.connectmobile.leaderboard.challenges.s.y6(sVar, true);
            androidx.fragment.app.m mVarRequireActivity = sVar.requireActivity();
            Intent intent = sVar.E6().f140764k;
            intent.getClass();
            intent.putExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", true);
            mVarRequireActivity.setResult(-1, intent);
        }
        return Unit.INSTANCE;
    }
}
