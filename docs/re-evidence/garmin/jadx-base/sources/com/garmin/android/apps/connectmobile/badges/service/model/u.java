package com.garmin.android.apps.connectmobile.badges.service.model;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/u;", "", "", "badgeChallengeUUID", "", "badgeId", "badgeKey", "createdDate", "badgeChallengeName", "", "popupShown", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "J", "d", "()J", JWKParameterNames.RSA_EXPONENT, "f", "Z", "g", "()Z", "h", "(Z)V", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f30680g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeChallengeUUID")
    private final String badgeChallengeUUID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeId")
    private final long badgeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeKey")
    private final String badgeKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    private final String createdDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private final String badgeChallengeName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private boolean popupShown;

    static {
        new a(null);
    }

    public /* synthetic */ u(String str, long j8, String str2, String str3, String str4, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? false : z14);
    }

    public static u a(u uVar, String str) {
        String str2 = uVar.badgeChallengeUUID;
        long j8 = uVar.badgeId;
        String str3 = uVar.badgeKey;
        String str4 = uVar.createdDate;
        boolean z14 = uVar.popupShown;
        str2.getClass();
        str3.getClass();
        return new u(str2, j8, str3, str4, str, z14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBadgeChallengeName() {
        return this.badgeChallengeName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBadgeChallengeUUID() {
        return this.badgeChallengeUUID;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBadgeId() {
        return this.badgeId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBadgeKey() {
        return this.badgeKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.badgeChallengeUUID, uVar.badgeChallengeUUID) && this.badgeId == uVar.badgeId && p005kotlin.jvm.internal.s.g(this.badgeKey, uVar.badgeKey) && p005kotlin.jvm.internal.s.g(this.createdDate, uVar.createdDate) && p005kotlin.jvm.internal.s.g(this.badgeChallengeName, uVar.badgeChallengeName) && this.popupShown == uVar.popupShown;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getPopupShown() {
        return this.popupShown;
    }

    public final void h() {
        this.popupShown = true;
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(this.badgeChallengeUUID.hashCode() * 31, 31, this.badgeId), 31, this.badgeKey);
        String str = this.createdDate;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeChallengeName;
        return Boolean.hashCode(this.popupShown) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.badgeChallengeUUID;
        long j8 = this.badgeId;
        String str2 = this.badgeKey;
        String str3 = this.createdDate;
        String str4 = this.badgeChallengeName;
        boolean z14 = this.popupShown;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "UnredeemedCodePopupDTO(badgeChallengeUUID=", str, ", badgeId=");
        sn.a.t(sbJ, ", badgeKey=", str2, ", createdDate=", str3);
        com.airbnb.lottie.animation.keyframe.a.t(", badgeChallengeName=", str4, ", popupShown=", sbJ, z14);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/u$a;", "", "<init>", "()V", "", "TABLE_NAME", "Ljava/lang/String;", "BADGE_CHALLENGE_UUID", "BADGE_ID", "BADGE_KEY", "BADGE_CREATE_DATE", "BADGE_CHALLENGE_NAME", "POPUP_SHOWN", "CREATE_TABLE", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public u(String str, long j8, String str2, String str3, String str4, boolean z14) {
        str.getClass();
        str2.getClass();
        this.badgeChallengeUUID = str;
        this.badgeId = j8;
        this.badgeKey = str2;
        this.createdDate = str3;
        this.badgeChallengeName = str4;
        this.popupShown = z14;
    }
}
