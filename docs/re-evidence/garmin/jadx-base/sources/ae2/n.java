package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lae2/n;", "", "", "messageId", "", "messageText", "Lorg/joda/time/DateTime;", "timestamp", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageId")
    private final Long messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageText")
    private final String messageText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime timestamp;

    public /* synthetic */ n(Long l14, String str, DateTime dateTime, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : dateTime);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.messageId, nVar.messageId) && p005kotlin.jvm.internal.s.g(this.messageText, nVar.messageText) && p005kotlin.jvm.internal.s.g(this.timestamp, nVar.timestamp);
    }

    public final int hashCode() {
        Long l14 = this.messageId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.messageText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.timestamp;
        return iHashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.messageId;
        String str = this.messageText;
        DateTime dateTime = this.timestamp;
        StringBuilder sbJ = b71.i.j("GrouptrackMessageBody(messageId=", ", messageText=", str, l14, ", timestamp=");
        sbJ.append(dateTime);
        sbJ.append(")");
        return sbJ.toString();
    }

    public n(Long l14, String str, DateTime dateTime) {
        this.messageId = l14;
        this.messageText = str;
        this.timestamp = dateTime;
    }

    public n() {
        this(null, null, null, 7, null);
    }
}
