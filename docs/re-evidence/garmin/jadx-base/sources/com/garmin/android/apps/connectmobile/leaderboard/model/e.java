package com.garmin.android.apps.connectmobile.leaderboard.model;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/e;", "", "", "uuid", "adHocChallengeName", "startDate", "endDate", "ownerUserProfileId", "adHocChallengeInviteId", "", "socialChallengeActivityTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", JWKParameterNames.RSA_EXPONENT, "d", "getOwnerUserProfileId", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adHocChallengeUuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adHocChallengeName")
    private final String adHocChallengeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adHocChallengeStartDate")
    private final String startDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adHocChallengeEndDate")
    private final String endDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerUserProfileId")
    private final String ownerUserProfileId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adHocChallengeInviteId")
    private final String adHocChallengeInviteId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("socialChallengeActivityTypeId")
    private final Integer socialChallengeActivityTypeId;

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdHocChallengeInviteId() {
        return this.adHocChallengeInviteId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdHocChallengeName() {
        return this.adHocChallengeName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSocialChallengeActivityTypeId() {
        return this.socialChallengeActivityTypeId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.uuid, eVar.uuid) && p005kotlin.jvm.internal.s.g(this.adHocChallengeName, eVar.adHocChallengeName) && p005kotlin.jvm.internal.s.g(this.startDate, eVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, eVar.endDate) && p005kotlin.jvm.internal.s.g(this.ownerUserProfileId, eVar.ownerUserProfileId) && p005kotlin.jvm.internal.s.g(this.adHocChallengeInviteId, eVar.adHocChallengeInviteId) && p005kotlin.jvm.internal.s.g(this.socialChallengeActivityTypeId, eVar.socialChallengeActivityTypeId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adHocChallengeName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ownerUserProfileId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.adHocChallengeInviteId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.socialChallengeActivityTypeId;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.uuid;
        String str2 = this.adHocChallengeName;
        String str3 = this.startDate;
        String str4 = this.endDate;
        String str5 = this.ownerUserProfileId;
        String str6 = this.adHocChallengeInviteId;
        Integer num = this.socialChallengeActivityTypeId;
        StringBuilder sbI = p6.b.i("AdHocChallengePendingInviteDashboardDTO(uuid=", str, ", adHocChallengeName=", str2, ", startDate=");
        sn.a.t(sbI, str3, ", endDate=", str4, ", ownerUserProfileId=");
        sn.a.t(sbI, str5, ", adHocChallengeInviteId=", str6, ", socialChallengeActivityTypeId=");
        return f3.i(sbI, num, ")");
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.uuid = str;
        this.adHocChallengeName = str2;
        this.startDate = str3;
        this.endDate = str4;
        this.ownerUserProfileId = str5;
        this.adHocChallengeInviteId = str6;
        this.socialChallengeActivityTypeId = num;
    }

    public e() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
