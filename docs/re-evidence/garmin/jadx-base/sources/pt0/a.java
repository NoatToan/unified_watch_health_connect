package pt0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.AdHocChallengesViewModel$deleteAdHocChallengePlayers$1", f = "AdHocChallengesViewModel.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f140609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f140611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, String str, List<String> list, t13.d<? super a> dVar) {
        super(1, dVar);
        this.f140609b = fVar;
        this.f140610c = str;
        this.f140611d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f140609b, this.f140610c, this.f140611d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140608a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yt0.a aVar2 = this.f140609b.f140658a;
        this.f140608a = 1;
        aVar2.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new yt0.f(aVar2, this.f140610c, this.f140611d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
