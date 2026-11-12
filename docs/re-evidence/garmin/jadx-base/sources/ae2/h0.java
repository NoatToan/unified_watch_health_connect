package ae2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\b\u0080\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b \u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0017\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001aR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lae2/h0;", "", "", "sessionId", "Lae2/n0;", "subscriber", "url", "token", "Lorg/joda/time/DateTime;", TtmlNode.START, TtmlNode.END, "Lae2/z;", ModelSourceWrapper.POSITION, "Lae2/e0;", "publisher", "publisherState", "sessionName", "subscriberState", "userDisplayName", "Lorg/joda/time/Period;", "viewable", "<init>", "(Ljava/lang/String;Lae2/n0;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lae2/z;Lae2/e0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/Period;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lae2/n0;", JWKParameterNames.RSA_EXPONENT, "()Lae2/n0;", "g", "d", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "Lae2/z;", "getPosition", "()Lae2/z;", "h", "Lae2/e0;", "()Lae2/e0;", IntegerTokenConverter.CONVERTER_KEY, "getPublisherState", "j", "getSessionName", JWKParameterNames.OCT_KEY_VALUE, "getSubscriberState", "l", "getUserDisplayName", "m", "Lorg/joda/time/Period;", "getViewable", "()Lorg/joda/time/Period;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionId")
    private final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subscriber")
    private final n0 subscriber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("token")
    private final String token;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.START)
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime start;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.END)
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime end;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ModelSourceWrapper.POSITION)
    private final z position;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisher")
    private final e0 publisher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisherState")
    private final String publisherState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionName")
    private final String sessionName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subscriberState")
    private final String subscriberState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userDisplayName")
    private final String userDisplayName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewable")
    @JsonAdapter(PeriodAdapter.class)
    private final Period viewable;

    public /* synthetic */ h0(String str, n0 n0Var, String str2, String str3, DateTime dateTime, DateTime dateTime2, z zVar, e0 e0Var, String str4, String str5, String str6, String str7, Period period, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : n0Var, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : dateTime, (i14 & 32) != 0 ? null : dateTime2, (i14 & 64) != 0 ? null : zVar, (i14 & 128) != 0 ? null : e0Var, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? null : str6, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? null : period);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DateTime getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n0 getSubscriber() {
        return this.subscriber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return p005kotlin.jvm.internal.s.g(this.sessionId, h0Var.sessionId) && p005kotlin.jvm.internal.s.g(this.subscriber, h0Var.subscriber) && p005kotlin.jvm.internal.s.g(this.url, h0Var.url) && p005kotlin.jvm.internal.s.g(this.token, h0Var.token) && p005kotlin.jvm.internal.s.g(this.start, h0Var.start) && p005kotlin.jvm.internal.s.g(this.end, h0Var.end) && p005kotlin.jvm.internal.s.g(this.position, h0Var.position) && p005kotlin.jvm.internal.s.g(this.publisher, h0Var.publisher) && p005kotlin.jvm.internal.s.g(this.publisherState, h0Var.publisherState) && p005kotlin.jvm.internal.s.g(this.sessionName, h0Var.sessionName) && p005kotlin.jvm.internal.s.g(this.subscriberState, h0Var.subscriberState) && p005kotlin.jvm.internal.s.g(this.userDisplayName, h0Var.userDisplayName) && p005kotlin.jvm.internal.s.g(this.viewable, h0Var.viewable);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.sessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        n0 n0Var = this.subscriber;
        int iHashCode2 = (iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DateTime dateTime = this.start;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.end;
        int iHashCode6 = (iHashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        z zVar = this.position;
        int iHashCode7 = (iHashCode6 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        e0 e0Var = this.publisher;
        int iHashCode8 = (iHashCode7 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        String str4 = this.publisherState;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sessionName;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subscriberState;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userDisplayName;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Period period = this.viewable;
        return iHashCode12 + (period != null ? period.hashCode() : 0);
    }

    public final String toString() {
        String str = this.sessionId;
        n0 n0Var = this.subscriber;
        String str2 = this.url;
        String str3 = this.token;
        DateTime dateTime = this.start;
        DateTime dateTime2 = this.end;
        z zVar = this.position;
        e0 e0Var = this.publisher;
        String str4 = this.publisherState;
        String str5 = this.sessionName;
        String str6 = this.subscriberState;
        String str7 = this.userDisplayName;
        Period period = this.viewable;
        StringBuilder sb3 = new StringBuilder("Session(sessionId=");
        sb3.append(str);
        sb3.append(", subscriber=");
        sb3.append(n0Var);
        sb3.append(", url=");
        sn.a.t(sb3, str2, ", token=", str3, ", start=");
        sb3.append(dateTime);
        sb3.append(", end=");
        sb3.append(dateTime2);
        sb3.append(", position=");
        sb3.append(zVar);
        sb3.append(", publisher=");
        sb3.append(e0Var);
        sb3.append(", publisherState=");
        sn.a.t(sb3, str4, ", sessionName=", str5, ", subscriberState=");
        sn.a.t(sb3, str6, ", userDisplayName=", str7, ", viewable=");
        sb3.append(period);
        sb3.append(")");
        return sb3.toString();
    }

    public h0(String str, n0 n0Var, String str2, String str3, DateTime dateTime, DateTime dateTime2, z zVar, e0 e0Var, String str4, String str5, String str6, String str7, Period period) {
        this.sessionId = str;
        this.subscriber = n0Var;
        this.url = str2;
        this.token = str3;
        this.start = dateTime;
        this.end = dateTime2;
        this.position = zVar;
        this.publisher = e0Var;
        this.publisherState = str4;
        this.sessionName = str5;
        this.subscriberState = str6;
        this.userDisplayName = str7;
        this.viewable = period;
    }

    public h0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
