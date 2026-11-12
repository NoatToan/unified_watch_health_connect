package pt0;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.BadgeChallengesViewModel$getBadgeChallengeDetails$1", f = "BadgeChallengesViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f140785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, String str, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f140785b = pVar;
        this.f140786c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f140785b, this.f140786c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140784a;
        p pVar = this.f140785b;
        if (i14 == 0) {
            o13.r.b(obj);
            r0 r0Var = pVar.f140755b;
            this.f140784a = 1;
            obj = r0Var.f(this.f140786c, this);
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
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.p) ((v2.b) v2Var).f47386a;
            int i15 = p.f140753l;
            pVar.getClass();
            if (pVar2.P0() && pVar2.getBadgePromotionCode() != null) {
                w9.a aVarA = v1.a(pVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new v(pVar2, null), 2);
            }
        }
        return v2Var;
    }
}
