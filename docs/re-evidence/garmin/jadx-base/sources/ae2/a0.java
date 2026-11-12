package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lae2/a0;", "", "", "messageId", "Lorg/joda/time/DateTime;", "messageSentTime", "", "messageText", "", "recipientSessionIds", "senderSessionId", "<init>", "(Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "getMessageId", "()Ljava/lang/Long;", "b", "Lorg/joda/time/DateTime;", "getMessageSentTime", "()Lorg/joda/time/DateTime;", "c", "Ljava/lang/String;", "getMessageText", "()Ljava/lang/String;", "d", "Ljava/util/List;", "getRecipientSessionIds", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "getSenderSessionId", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageId")
    private final Long messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageSentTime")
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime messageSentTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageText")
    private final String messageText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recipientSessionIds")
    private final List<String> recipientSessionIds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("senderSessionId")
    private final String senderSessionId;

    public /* synthetic */ a0(Long l14, DateTime dateTime, String str, List list, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : dateTime, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.messageId, a0Var.messageId) && p005kotlin.jvm.internal.s.g(this.messageSentTime, a0Var.messageSentTime) && p005kotlin.jvm.internal.s.g(this.messageText, a0Var.messageText) && p005kotlin.jvm.internal.s.g(this.recipientSessionIds, a0Var.recipientSessionIds) && p005kotlin.jvm.internal.s.g(this.senderSessionId, a0Var.senderSessionId);
    }

    public final int hashCode() {
        Long l14 = this.messageId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        DateTime dateTime = this.messageSentTime;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str = this.messageText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.recipientSessionIds;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.senderSessionId;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.messageId;
        DateTime dateTime = this.messageSentTime;
        String str = this.messageText;
        List<String> list = this.recipientSessionIds;
        String str2 = this.senderSessionId;
        StringBuilder sb3 = new StringBuilder("PostGrouptrackMessagesRequest(messageId=");
        sb3.append(l14);
        sb3.append(", messageSentTime=");
        sb3.append(dateTime);
        sb3.append(", messageText=");
        v.e0.o(str, ", recipientSessionIds=", ", senderSessionId=", sb3, list);
        return am.j.o(str2, ")", sb3);
    }

    public a0(Long l14, DateTime dateTime, String str, List<String> list, String str2) {
        this.messageId = l14;
        this.messageSentTime = dateTime;
        this.messageText = str;
        this.recipientSessionIds = list;
        this.senderSessionId = str2;
    }

    public a0() {
        this(null, null, null, null, null, 31, null);
    }
}
