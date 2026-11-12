package com.garmin.android.apps.connectmobile.leaderboard.model;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u000e\u0010(¨\u0006)"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/d;", "", "", "userProfileId", "", "totalNumber", "ranking", "", "profileImageSmall", "profileImageMedium", "fullName", "displayName", "todayNumber", "", "isAcceptedChallenge", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/Double;", "getTotalNumber", "()Ljava/lang/Double;", "c", "getRanking", "d", "Ljava/lang/String;", "getProfileImageSmall", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "getProfileImageMedium", "f", "getFullName", "g", "getDisplayName", "h", "getTodayNumber", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Integer userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalNumber")
    private final Double totalNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ranking")
    private final Integer ranking;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageSmall")
    private final String profileImageSmall;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageMedium")
    private final String profileImageMedium;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("todayNumber")
    private final Double todayNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isAcceptedChallenge")
    private final Boolean isAcceptedChallenge;

    public /* synthetic */ d(Integer num, Double d14, Integer num2, String str, String str2, String str3, String str4, Double d15, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getUserProfileId() {
        return this.userProfileId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfileId, dVar.userProfileId) && p005kotlin.jvm.internal.s.g(this.totalNumber, dVar.totalNumber) && p005kotlin.jvm.internal.s.g(this.ranking, dVar.ranking) && p005kotlin.jvm.internal.s.g(this.profileImageSmall, dVar.profileImageSmall) && p005kotlin.jvm.internal.s.g(this.profileImageMedium, dVar.profileImageMedium) && p005kotlin.jvm.internal.s.g(this.fullName, dVar.fullName) && p005kotlin.jvm.internal.s.g(this.displayName, dVar.displayName) && p005kotlin.jvm.internal.s.g(this.todayNumber, dVar.todayNumber) && p005kotlin.jvm.internal.s.g(this.isAcceptedChallenge, dVar.isAcceptedChallenge);
    }

    public final int hashCode() {
        Integer num = this.userProfileId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.totalNumber;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num2 = this.ranking;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.profileImageSmall;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.profileImageMedium;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullName;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d15 = this.todayNumber;
        int iHashCode8 = (iHashCode7 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Boolean bool = this.isAcceptedChallenge;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.userProfileId;
        Double d14 = this.totalNumber;
        Integer num2 = this.ranking;
        String str = this.profileImageSmall;
        String str2 = this.profileImageMedium;
        String str3 = this.fullName;
        String str4 = this.displayName;
        Double d15 = this.todayNumber;
        Boolean bool = this.isAcceptedChallenge;
        StringBuilder sbM = u0.m("AdHocChallengePendingInviteConnectionsDTO(userProfileId=", num, ", totalNumber=", d14, ", ranking=");
        p6.b.l(num2, ", profileImageSmall=", str, ", profileImageMedium=", sbM);
        sn.a.t(sbM, str2, ", fullName=", str3, ", displayName=");
        b71.i.x(sbM, str4, ", todayNumber=", d15, ", isAcceptedChallenge=");
        return p6.b.f(sbM, bool, ")");
    }

    public d(Integer num, Double d14, Integer num2, String str, String str2, String str3, String str4, Double d15, Boolean bool) {
        this.userProfileId = num;
        this.totalNumber = d14;
        this.ranking = num2;
        this.profileImageSmall = str;
        this.profileImageMedium = str2;
        this.fullName = str3;
        this.displayName = str4;
        this.todayNumber = d15;
        this.isAcceptedChallenge = bool;
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
