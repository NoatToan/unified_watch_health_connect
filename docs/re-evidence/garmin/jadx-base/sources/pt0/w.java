package pt0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.ChallengeViewModelDelegateImpl$checkAutoChallengeParticipant$1", f = "ChallengeViewModelDelegateImpl.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super v2<? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140791a;

    public w(t13.d<? super w> dVar) {
        super(1, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Boolean>> dVar) {
        return new w(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140791a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yt0.q.f199578b.getClass();
        yt0.q qVarA = yt0.q.a.a();
        this.f140791a = 1;
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(qVarA, new yt0.s(qVarA, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
