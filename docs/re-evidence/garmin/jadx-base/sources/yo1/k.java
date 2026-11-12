package yo1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0011\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006'"}, d2 = {"Lyo1/k;", "", "", TtmlNode.ATTR_ID, "", "gcsUuid", "joinCode", "name", "startDateTime", "endDateTime", "expirationDateTime", "", "completed", "activityId", "activityName", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;)V", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "getJoinCode", JWKParameterNames.RSA_EXPONENT, "f", "getEndDateTime", "g", "getExpirationDateTime", "h", "Z", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "j", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gcsUuid")
    private final String gcsUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("joinCode")
    private final String joinCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDateTime")
    private final String startDateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDateTime")
    private final String endDateTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expirationDateTime")
    private final String expirationDateTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completed")
    private final boolean completed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    public k(long j8, String str, String str2, String str3, String str4, String str5, String str6, boolean z14, Long l14, String str7) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.id = j8;
        this.gcsUuid = str;
        this.joinCode = str2;
        this.name = str3;
        this.startDateTime = str4;
        this.endDateTime = str5;
        this.expirationDateTime = str6;
        this.completed = z14;
        this.activityId = l14;
        this.activityName = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGcsUuid() {
        return this.gcsUuid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.id == kVar.id && s.g(this.gcsUuid, kVar.gcsUuid) && s.g(this.joinCode, kVar.joinCode) && s.g(this.name, kVar.name) && s.g(this.startDateTime, kVar.startDateTime) && s.g(this.endDateTime, kVar.endDateTime) && s.g(this.expirationDateTime, kVar.expirationDateTime) && this.completed == kVar.completed && s.g(this.activityId, kVar.activityId) && s.g(this.activityName, kVar.activityName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStartDateTime() {
        return this.startDateTime;
    }

    public final int hashCode() {
        int iG = q6.f.g(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(Long.hashCode(this.id) * 31, 31, this.gcsUuid), 31, this.joinCode), 31, this.name), 31, this.startDateTime), 31, this.endDateTime), 31, this.expirationDateTime), 31, this.completed);
        Long l14 = this.activityId;
        int iHashCode = (iG + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.activityName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.id;
        String str = this.gcsUuid;
        String str2 = this.joinCode;
        String str3 = this.name;
        String str4 = this.startDateTime;
        String str5 = this.endDateTime;
        String str6 = this.expirationDateTime;
        boolean z14 = this.completed;
        Long l14 = this.activityId;
        String str7 = this.activityName;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "SocialGroupRideWithActivityDTO(id=", ", gcsUuid=", str);
        sn.a.t(sbK, ", joinCode=", str2, ", name=", str3);
        sn.a.t(sbK, ", startDateTime=", str4, ", endDateTime=", str5);
        com.airbnb.lottie.animation.keyframe.a.t(", expirationDateTime=", str6, ", completed=", sbK, z14);
        sbK.append(", activityId=");
        sbK.append(l14);
        sbK.append(", activityName=");
        sbK.append(str7);
        sbK.append(")");
        return sbK.toString();
    }
}
