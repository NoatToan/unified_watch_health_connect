package mt0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmt0/x3;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/h0;", "challenge", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;", "team", "", "currentUserProfileId", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/h0;Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;J)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x3 extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.leaderboard.model.h0 f120923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.leaderboard.model.j0 f120924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f120925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f120926d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"mt0/x3$a", "Landroidx/lifecycle/y0;", "Lmt0/o3;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.lifecycle.y0<o3> {
        public a() {
        }

        @Override // androidx.lifecycle.s0
        public final void h() {
            o3 o3VarD = d();
            if (o3VarD == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> listB = x3.this.f120924b.b();
                if (listB != null) {
                    for (com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var : listB) {
                        if (p005kotlin.jvm.internal.s.g(i0Var.getIsAcceptedChallenge(), Boolean.TRUE)) {
                            arrayList.add(i0Var);
                        } else {
                            arrayList2.add(i0Var);
                        }
                    }
                }
                o3VarD = new o3(arrayList, arrayList2);
            }
            m(o3VarD);
        }
    }

    public x3(com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var, com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var, long j8) {
        h0Var.getClass();
        j0Var.getClass();
        this.f120923a = h0Var;
        this.f120924b = j0Var;
        this.f120925c = j8;
        this.f120926d = new a();
    }
}
