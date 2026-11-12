package oz0;

import am.j;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Loz0/b;", "", "Lorg/joda/time/DateTime;", "lastUnreadPostExpirationTimeGMT", "", "numberOfConnections", "numberOfFollowings", "<init>", "(Lorg/joda/time/DateTime;II)V", "a", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "b", "I", "getNumberOfConnections", "()I", "c", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUnreadPostExpirationTimeGMT")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime lastUnreadPostExpirationTimeGMT;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfConnections")
    private final int numberOfConnections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfFollowings")
    private final int numberOfFollowings;

    public b(DateTime dateTime, int i14, int i15) {
        this.lastUnreadPostExpirationTimeGMT = dateTime;
        this.numberOfConnections = i14;
        this.numberOfFollowings = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getLastUnreadPostExpirationTimeGMT() {
        return this.lastUnreadPostExpirationTimeGMT;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNumberOfFollowings() {
        return this.numberOfFollowings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.lastUnreadPostExpirationTimeGMT, bVar.lastUnreadPostExpirationTimeGMT) && this.numberOfConnections == bVar.numberOfConnections && this.numberOfFollowings == bVar.numberOfFollowings;
    }

    public final int hashCode() {
        DateTime dateTime = this.lastUnreadPostExpirationTimeGMT;
        return Integer.hashCode(this.numberOfFollowings) + q2.d(this.numberOfConnections, (dateTime == null ? 0 : dateTime.hashCode()) * 31, 31);
    }

    public final String toString() {
        DateTime dateTime = this.lastUnreadPostExpirationTimeGMT;
        int i14 = this.numberOfConnections;
        int i15 = this.numberOfFollowings;
        StringBuilder sb3 = new StringBuilder("NewsfeedStatusDTO(lastUnreadPostExpirationTimeGMT=");
        sb3.append(dateTime);
        sb3.append(", numberOfConnections=");
        sb3.append(i14);
        sb3.append(", numberOfFollowings=");
        return j.q(sb3, i15, ")");
    }
}
