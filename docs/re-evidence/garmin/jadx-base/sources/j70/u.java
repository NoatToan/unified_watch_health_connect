package j70;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lj70/u;", "", "", "message", "upcomingMessage", "ongoingMessage", "", "durationMillis", "startDateTime", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", JWKParameterNames.RSA_EXPONENT, "c", "d", "J", "()J", "f", "Z", "()Z", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("upcomingMessage")
    private final String upcomingMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ongoingMessage")
    private final String ongoingMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationMillis")
    private final long durationMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDateTime")
    private final String startDateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enabled")
    private final boolean enabled;

    public /* synthetic */ u(String str, String str2, String str3, long j8, String str4, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? 0L : j8, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? false : z14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOngoingMessage() {
        return this.ongoingMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStartDateTime() {
        return this.startDateTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUpcomingMessage() {
        return this.upcomingMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.message, uVar.message) && p005kotlin.jvm.internal.s.g(this.upcomingMessage, uVar.upcomingMessage) && p005kotlin.jvm.internal.s.g(this.ongoingMessage, uVar.ongoingMessage) && this.durationMillis == uVar.durationMillis && p005kotlin.jvm.internal.s.g(this.startDateTime, uVar.startDateTime) && this.enabled == uVar.enabled;
    }

    public final int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.upcomingMessage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ongoingMessage;
        int iE = q6.f.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.durationMillis);
        String str4 = this.startDateTime;
        return Boolean.hashCode(this.enabled) + ((iE + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.message;
        String str2 = this.upcomingMessage;
        String str3 = this.ongoingMessage;
        long j8 = this.durationMillis;
        String str4 = this.startDateTime;
        boolean z14 = this.enabled;
        StringBuilder sbI = p6.b.i("RemoteConfigMessage(message=", str, ", upcomingMessage=", str2, ", ongoingMessage=");
        e5.s(j8, str3, ", durationMillis=", sbI);
        com.airbnb.lottie.animation.keyframe.a.t(", startDateTime=", str4, ", enabled=", sbI, z14);
        sbI.append(")");
        return sbI.toString();
    }

    public u(String str, String str2, String str3, long j8, String str4, boolean z14) {
        this.message = str;
        this.upcomingMessage = str2;
        this.ongoingMessage = str3;
        this.durationMillis = j8;
        this.startDateTime = str4;
        this.enabled = z14;
    }

    public u() {
        this(null, null, null, 0L, null, false, 63, null);
    }
}
