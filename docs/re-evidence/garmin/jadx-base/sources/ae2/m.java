package ae2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lae2/m;", "", "", "senderSessionId", "senderDisplayName", "", "messageSeq", "Lae2/n;", "messageBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lae2/n;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lae2/n;", "()Lae2/n;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("senderSessionId")
    private final String senderSessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("senderDisplayName")
    private final String senderDisplayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageSeq")
    private final Long messageSeq;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageBody")
    private final n messageBody;

    public /* synthetic */ m(String str, String str2, Long l14, n nVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : nVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getMessageBody() {
        return this.messageBody;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getMessageSeq() {
        return this.messageSeq;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSenderSessionId() {
        return this.senderSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.senderSessionId, mVar.senderSessionId) && p005kotlin.jvm.internal.s.g(this.senderDisplayName, mVar.senderDisplayName) && p005kotlin.jvm.internal.s.g(this.messageSeq, mVar.messageSeq) && p005kotlin.jvm.internal.s.g(this.messageBody, mVar.messageBody);
    }

    public final int hashCode() {
        String str = this.senderSessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.senderDisplayName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.messageSeq;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        n nVar = this.messageBody;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.senderSessionId;
        String str2 = this.senderDisplayName;
        Long l14 = this.messageSeq;
        n nVar = this.messageBody;
        StringBuilder sbI = p6.b.i("GrouptrackMessage(senderSessionId=", str, ", senderDisplayName=", str2, ", messageSeq=");
        sbI.append(l14);
        sbI.append(", messageBody=");
        sbI.append(nVar);
        sbI.append(")");
        return sbI.toString();
    }

    public m(String str, String str2, Long l14, n nVar) {
        this.senderSessionId = str;
        this.senderDisplayName = str2;
        this.messageSeq = l14;
        this.messageBody = nVar;
    }

    public m() {
        this(null, null, null, null, 15, null);
    }
}
