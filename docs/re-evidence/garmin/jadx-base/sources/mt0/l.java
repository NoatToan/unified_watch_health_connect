package mt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsViewModel$getVivokidChallengeDetails$1", f = "AdHocChallengeDetailsViewModel.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends AdHocChallengeDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f120693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f120694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f120695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, String str, String str2, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f120693b = qVar;
        this.f120694c = str;
        this.f120695d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f120693b, this.f120694c, this.f120695d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends AdHocChallengeDTO>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120692a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yt0.a aVar2 = this.f120693b.f120814a;
        this.f120692a = 1;
        aVar2.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new yt0.m(aVar2, this.f120694c, this.f120695d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
