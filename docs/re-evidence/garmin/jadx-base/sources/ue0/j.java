package ue0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b8\u0010\u0018\u001a\u0004\b2\u0010\u001a¨\u00069"}, d2 = {"Lue0/j;", "Lue0/d;", "", "inviteId", "inviteeUserId", "Lorg/joda/time/DateTime;", "inviteDate", "Lue0/c;", "status", "acceptedDate", "", "Lue0/a;", "grantTypes", "", "displayName", "fullName", FirebaseAnalytics.Param.LOCATION, "profileImageUrlSmall", "profileImageUrlMedium", "profileImageUrlLarge", "userLevel", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;Lue0/c;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/Long;", "H2", "()Ljava/lang/Long;", "b", "c", "Lorg/joda/time/DateTime;", "f0", "()Lorg/joda/time/DateTime;", "d", "Lue0/c;", "getStatus", "()Lue0/c;", JWKParameterNames.RSA_EXPONENT, "C", "f", "Ljava/util/List;", "getGrantTypes", "()Ljava/util/List;", "g", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "h", "getFullName", IntegerTokenConverter.CONVERTER_KEY, "getLocation", "j", "l2", JWKParameterNames.OCT_KEY_VALUE, "H3", "l", "f4", "m", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteId")
    private final Long inviteId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeUserId")
    private final Long inviteeUserId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteDate")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime inviteDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final c status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acceptedDate")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime acceptedDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accountDelegationTypes")
    private final List<a> grantTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeDisplayName")
    private final String displayName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeFullName")
    private final String fullName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeLocation")
    private final String location;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeProfileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeProfileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeProfileImageUrlLarge")
    private final String profileImageUrlLarge;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeUserLevel")
    private final Long userLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Long l14, Long l15, DateTime dateTime, c cVar, DateTime dateTime2, List<? extends a> list, String str, String str2, String str3, String str4, String str5, String str6, Long l16) {
        this.inviteId = l14;
        this.inviteeUserId = l15;
        this.inviteDate = dateTime;
        this.status = cVar;
        this.acceptedDate = dateTime2;
        this.grantTypes = list;
        this.displayName = str;
        this.fullName = str2;
        this.location = str3;
        this.profileImageUrlSmall = str4;
        this.profileImageUrlMedium = str5;
        this.profileImageUrlLarge = str6;
        this.userLevel = l16;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final DateTime getAcceptedDate() {
        return this.acceptedDate;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: H2, reason: from getter */
    public final Long getInviteId() {
        return this.inviteId;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: H3, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getInviteeUserId() {
        return this.inviteeUserId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.inviteId, jVar.inviteId) && s.g(this.inviteeUserId, jVar.inviteeUserId) && s.g(this.inviteDate, jVar.inviteDate) && this.status == jVar.status && s.g(this.acceptedDate, jVar.acceptedDate) && s.g(this.grantTypes, jVar.grantTypes) && s.g(this.displayName, jVar.displayName) && s.g(this.fullName, jVar.fullName) && s.g(this.location, jVar.location) && s.g(this.profileImageUrlSmall, jVar.profileImageUrlSmall) && s.g(this.profileImageUrlMedium, jVar.profileImageUrlMedium) && s.g(this.profileImageUrlLarge, jVar.profileImageUrlLarge) && s.g(this.userLevel, jVar.userLevel);
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final DateTime getInviteDate() {
        return this.inviteDate;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: f4, reason: from getter */
    public final String getProfileImageUrlLarge() {
        return this.profileImageUrlLarge;
    }

    @Override // ue0.d
    public final String getLocation() {
        return this.location;
    }

    @Override // ue0.d
    public final String getName() {
        String str = this.fullName;
        return str == null ? this.displayName : str;
    }

    @Override // ue0.d
    public final c getStatus() {
        return this.status;
    }

    @Override // ue0.d
    public final Long getUserId() {
        return this.inviteeUserId;
    }

    public final int hashCode() {
        Long l14 = this.inviteId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.inviteeUserId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        DateTime dateTime = this.inviteDate;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        c cVar = this.status;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        DateTime dateTime2 = this.acceptedDate;
        int iHashCode5 = (iHashCode4 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        List<a> list = this.grantTypes;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.displayName;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlSmall;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileImageUrlMedium;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.profileImageUrlLarge;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l16 = this.userLevel;
        return iHashCode12 + (l16 != null ? l16.hashCode() : 0);
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getUserLevel() {
        return this.userLevel;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: l2, reason: from getter */
    public final String getProfileImageUrlSmall() {
        return this.profileImageUrlSmall;
    }

    public final String toString() {
        Long l14 = this.inviteId;
        Long l15 = this.inviteeUserId;
        DateTime dateTime = this.inviteDate;
        c cVar = this.status;
        DateTime dateTime2 = this.acceptedDate;
        List<a> list = this.grantTypes;
        String str = this.displayName;
        String str2 = this.fullName;
        String str3 = this.location;
        String str4 = this.profileImageUrlSmall;
        String str5 = this.profileImageUrlMedium;
        String str6 = this.profileImageUrlLarge;
        Long l16 = this.userLevel;
        StringBuilder sbJ = f3.j(l14, l15, "IssuedInviteDTO(inviteId=", ", inviteeUserId=", ", inviteDate=");
        sbJ.append(dateTime);
        sbJ.append(", status=");
        sbJ.append(cVar);
        sbJ.append(", acceptedDate=");
        sbJ.append(dateTime2);
        sbJ.append(", grantTypes=");
        sbJ.append(list);
        sbJ.append(", displayName=");
        sn.a.t(sbJ, str, ", fullName=", str2, ", location=");
        sn.a.t(sbJ, str3, ", profileImageUrlSmall=", str4, ", profileImageUrlMedium=");
        sn.a.t(sbJ, str5, ", profileImageUrlLarge=", str6, ", userLevel=");
        return p6.b.g(sbJ, l16, ")");
    }
}
