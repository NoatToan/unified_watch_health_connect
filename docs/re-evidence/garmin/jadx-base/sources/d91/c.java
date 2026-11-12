package d91;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.adapters.LocalDateAdapter;
import com.garmin.android.apps.connectmobile.util.adapters.LocalDateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0017\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b-\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b*\u0010\u001a¨\u00062"}, d2 = {"Ld91/c;", "", "", "referenceId", "Lorg/joda/time/LocalDate;", "messageLocalDate", "Lorg/joda/time/LocalDateTime;", "dataAsOfTimestampUtc", "Ld91/n;", "currentStatus", "Ld91/g;", "currentFeedback", "language", "message", "", "Ld91/i;", "messageLinks", "messageGreeting", "", "viewed", "version", "<init>", "(Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDateTime;Ld91/n;Ld91/g;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "Lorg/joda/time/LocalDate;", "getMessageLocalDate", "()Lorg/joda/time/LocalDate;", "c", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "d", "Ld91/n;", "()Ld91/n;", JWKParameterNames.RSA_EXPONENT, "Ld91/g;", "()Ld91/g;", "f", "getLanguage", "h", "Ljava/util/List;", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", JWKParameterNames.OCT_KEY_VALUE, "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("refId")
    private final String referenceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageLocalDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate messageLocalDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dataAsOfTimestampUtc")
    @JsonAdapter(LocalDateTimeAdapter.class)
    private final LocalDateTime dataAsOfTimestampUtc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentStatus")
    private final n currentStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentFeedback")
    private final g currentFeedback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("language")
    private final String language;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageLinks")
    private final List<i> messageLinks;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageGreeting")
    private final String messageGreeting;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewed")
    private final Boolean viewed;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private final String version;

    public c(String str, LocalDate localDate, LocalDateTime localDateTime, n nVar, g gVar, String str2, String str3, List<i> list, String str4, Boolean bool, String str5) {
        this.referenceId = str;
        this.messageLocalDate = localDate;
        this.dataAsOfTimestampUtc = localDateTime;
        this.currentStatus = nVar;
        this.currentFeedback = gVar;
        this.language = str2;
        this.message = str3;
        this.messageLinks = list;
        this.messageGreeting = str4;
        this.viewed = bool;
        this.version = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getCurrentFeedback() {
        return this.currentFeedback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getCurrentStatus() {
        return this.currentStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDateTime getDataAsOfTimestampUtc() {
        return this.dataAsOfTimestampUtc;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMessageGreeting() {
        return this.messageGreeting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.referenceId, cVar.referenceId) && p005kotlin.jvm.internal.s.g(this.messageLocalDate, cVar.messageLocalDate) && p005kotlin.jvm.internal.s.g(this.dataAsOfTimestampUtc, cVar.dataAsOfTimestampUtc) && p005kotlin.jvm.internal.s.g(this.currentStatus, cVar.currentStatus) && p005kotlin.jvm.internal.s.g(this.currentFeedback, cVar.currentFeedback) && p005kotlin.jvm.internal.s.g(this.language, cVar.language) && p005kotlin.jvm.internal.s.g(this.message, cVar.message) && p005kotlin.jvm.internal.s.g(this.messageLinks, cVar.messageLinks) && p005kotlin.jvm.internal.s.g(this.messageGreeting, cVar.messageGreeting) && p005kotlin.jvm.internal.s.g(this.viewed, cVar.viewed) && p005kotlin.jvm.internal.s.g(this.version, cVar.version);
    }

    public final List<i> f() {
        return this.messageLinks;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        String str = this.referenceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.messageLocalDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDateTime localDateTime = this.dataAsOfTimestampUtc;
        int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        n nVar = this.currentStatus;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        g gVar = this.currentFeedback;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.language;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<i> list = this.messageLinks;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.messageGreeting;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.viewed;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.version;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getViewed() {
        return this.viewed;
    }

    public final String toString() {
        String str = this.referenceId;
        LocalDate localDate = this.messageLocalDate;
        LocalDateTime localDateTime = this.dataAsOfTimestampUtc;
        n nVar = this.currentStatus;
        g gVar = this.currentFeedback;
        String str2 = this.language;
        String str3 = this.message;
        List<i> list = this.messageLinks;
        String str4 = this.messageGreeting;
        Boolean bool = this.viewed;
        String str5 = this.version;
        StringBuilder sb3 = new StringBuilder("GlobalMessageDTO(referenceId=");
        sb3.append(str);
        sb3.append(", messageLocalDate=");
        sb3.append(localDate);
        sb3.append(", dataAsOfTimestampUtc=");
        sb3.append(localDateTime);
        sb3.append(", currentStatus=");
        sb3.append(nVar);
        sb3.append(", currentFeedback=");
        sb3.append(gVar);
        sb3.append(", language=");
        sb3.append(str2);
        sb3.append(", message=");
        e0.o(str3, ", messageLinks=", ", messageGreeting=", sb3, list);
        b71.i.w(sb3, str4, ", viewed=", bool, ", version=");
        return am.j.o(str5, ")", sb3);
    }
}
