package pt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.ConnectionLeaderBoardDTO;
import com.garmin.android.apps.connectmobile.v2;
import mt0.k4;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.t0;
import yt0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/ConnectionLeaderBoardDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.LeaderboardViewModel$getActivityLeaderboard$1", f = "LeaderboardViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.l<t13.d<? super v2<? extends ConnectionLeaderBoardDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f140723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f140724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, int i14, t13.d<? super k0> dVar) {
        super(1, dVar);
        this.f140723b = j0Var;
        this.f140724c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k0(this.f140723b, this.f140724c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends ConnectionLeaderBoardDTO>> dVar) {
        return ((k0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140722a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        j0 j0Var = this.f140723b;
        k4 k4VarD = j0Var.f140718d.d();
        if (k4VarD == null) {
            k4VarD = k4.CurrentWeek;
        }
        String strB = c22.j0.b(gg.b.D(k4VarD), "yyyy-MM-dd", null);
        String str = strB == null ? "" : strB;
        k4 k4VarD2 = j0Var.f140718d.d();
        if (k4VarD2 == null) {
            k4VarD2 = k4.CurrentWeek;
        }
        String strB2 = c22.j0.b(gg.b.u(k4VarD2), "yyyy-MM-dd", null);
        String str2 = strB2 == null ? "" : strB2;
        t0 t0Var = j0Var.f140715a;
        String strValueOf = String.valueOf(this.f140724c);
        String str3 = j0Var.f140716b;
        String str4 = j0Var.f140717c;
        this.f140722a = 1;
        t0Var.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(t0Var, new u0(t0Var, strValueOf, str, str2, str3, str4, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
