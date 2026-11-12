package pt0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.BadgeChallengesViewModel$getBadgeChallengeDetailsWithTranslations$1", f = "BadgeChallengesViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f140788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, String str, t13.d<? super u> dVar) {
        super(1, dVar);
        this.f140788b = pVar;
        this.f140789c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f140788b, this.f140789c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140787a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        r0 r0Var = this.f140788b.f140755b;
        this.f140787a = 1;
        Object objF = r0Var.f(this.f140789c, this);
        return objF == aVar ? aVar : objF;
    }
}
