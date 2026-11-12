package com.garmin.android.apps.connectmobile.leaderboard.model;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/c;", "", "", "uuid", "adHocChallengeName", "startDate", "endDate", "ownerUserProfileId", "", "playerCount", "socialChallengeActivityTypeId", "", "userRanking", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "c", JWKParameterNames.RSA_EXPONENT, "d", "getOwnerUserProfileId", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", "Ljava/lang/Long;", "()Ljava/lang/Long;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adHocChallengeName")
    private final String adHocChallengeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerUserProfileId")
    private final String ownerUserProfileId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("playerCount")
    private final Integer playerCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("socialChallengeActivityTypeId")
    private final Integer socialChallengeActivityTypeId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userRanking")
    private final Long userRanking;

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : num2, (i14 & 128) != 0 ? null : l14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdHocChallengeName() {
        return this.adHocChallengeName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getPlayerCount() {
        return this.playerCount;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.uuid, cVar.uuid) && p005kotlin.jvm.internal.s.g(this.adHocChallengeName, cVar.adHocChallengeName) && p005kotlin.jvm.internal.s.g(this.startDate, cVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, cVar.endDate) && p005kotlin.jvm.internal.s.g(this.ownerUserProfileId, cVar.ownerUserProfileId) && p005kotlin.jvm.internal.s.g(this.playerCount, cVar.playerCount) && p005kotlin.jvm.internal.s.g(this.socialChallengeActivityTypeId, cVar.socialChallengeActivityTypeId) && p005kotlin.jvm.internal.s.g(this.userRanking, cVar.userRanking);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getUserRanking() {
        return this.userRanking;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
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
        Integer num = this.playerCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.socialChallengeActivityTypeId;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l14 = this.userRanking;
        return iHashCode7 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.uuid;
        String str2 = this.adHocChallengeName;
        String str3 = this.startDate;
        String str4 = this.endDate;
        String str5 = this.ownerUserProfileId;
        Integer num = this.playerCount;
        Integer num2 = this.socialChallengeActivityTypeId;
        Long l14 = this.userRanking;
        StringBuilder sbI = p6.b.i("AdHocChallengeDashboardDTO(uuid=", str, ", adHocChallengeName=", str2, ", startDate=");
        sn.a.t(sbI, str3, ", endDate=", str4, ", ownerUserProfileId=");
        fb1.c.u(num, str5, ", playerCount=", ", socialChallengeActivityTypeId=", sbI);
        sbI.append(num2);
        sbI.append(", userRanking=");
        sbI.append(l14);
        sbI.append(")");
        return sbI.toString();
    }

    public c(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Long l14) {
        this.uuid = str;
        this.adHocChallengeName = str2;
        this.startDate = str3;
        this.endDate = str4;
        this.ownerUserProfileId = str5;
        this.playerCount = num;
        this.socialChallengeActivityTypeId = num2;
        this.userRanking = l14;
    }

    public c() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
