package pt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.AdHocChallengesViewModel$getAdHocChallengeLeaderboard$1", f = "AdHocChallengesViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends AdHocChallengePlayerDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f140617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f140619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f140620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f140621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, String str, DateTime dateTime, int i14, int i15, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f140617b = fVar;
        this.f140618c = str;
        this.f140619d = dateTime;
        this.f140620e = i14;
        this.f140621f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f140617b, this.f140618c, this.f140619d, this.f140620e, this.f140621f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends List<? extends AdHocChallengePlayerDTO>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140616a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yt0.a aVar2 = this.f140617b.f140658a;
        String string = this.f140619d.toString();
        string.getClass();
        this.f140616a = 1;
        aVar2.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new yt0.i(aVar2, this.f140618c, string, this.f140620e, this.f140621f, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
