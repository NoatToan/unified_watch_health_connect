package mt0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmt0/o3;", "", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/i0;", "participants", "invitees", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> f120784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> f120785b;

    public o3(List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> list, List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> list2) {
        list.getClass();
        list2.getClass();
        this.f120784a = list;
        this.f120785b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return this.f120784a.equals(o3Var.f120784a) && this.f120785b.equals(o3Var.f120785b);
    }

    public final int hashCode() {
        return this.f120785b.hashCode() + (this.f120784a.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.f("PlayerList(participants=", ", invitees=", ")", this.f120784a, this.f120785b);
    }
}
