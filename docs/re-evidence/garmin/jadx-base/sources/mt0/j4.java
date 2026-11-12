package mt0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmt0/j4;", "", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;", "myTeam", "opposingTeam", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.j0> f120675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.j0> f120676b;

    public j4(List<com.garmin.android.apps.connectmobile.leaderboard.model.j0> list, List<com.garmin.android.apps.connectmobile.leaderboard.model.j0> list2) {
        list.getClass();
        list2.getClass();
        this.f120675a = list;
        this.f120676b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return this.f120675a.equals(j4Var.f120675a) && this.f120676b.equals(j4Var.f120676b);
    }

    public final int hashCode() {
        return this.f120676b.hashCode() + (this.f120675a.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.f("TeamList(myTeam=", ", opposingTeam=", ")", this.f120675a, this.f120676b);
    }
}
