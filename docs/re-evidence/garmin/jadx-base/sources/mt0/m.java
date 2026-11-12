package mt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsViewModel$leaveChallenge$1", f = "AdHocChallengeDetailsViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f120706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f120707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f120708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f120709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, String str, String str2, boolean z14, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f120706b = qVar;
        this.f120707c = str;
        this.f120708d = str2;
        this.f120709e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f120706b, this.f120707c, this.f120708d, this.f120709e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120705a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yt0.a aVar2 = this.f120706b.f120814a;
        this.f120705a = 1;
        aVar2.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new yt0.n(this.f120709e, aVar2, this.f120707c, this.f120708d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
