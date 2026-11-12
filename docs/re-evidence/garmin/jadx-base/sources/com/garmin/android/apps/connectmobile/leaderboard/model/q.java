package com.garmin.android.apps.connectmobile.leaderboard.model;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\"\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b'\u0010\u001b¨\u0006("}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/q;", "", "", "uuid", "badgeChallengeName", "", "challengeCategoryId", "startDate", "endDate", "badgeUnitId", "", "progressValue", "targetValue", "badgeKey", "", "premium", "earnedMultiplier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "h", JWKParameterNames.RSA_EXPONENT, "f", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "j", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "getPremium", "()Ljava/lang/Boolean;", "getEarnedMultiplier", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeChallengeName")
    private final String badgeChallengeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("challengeCategoryId")
    private final Integer challengeCategoryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final Integer badgeUnitId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("progressValue")
    private final Double progressValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targetValue")
    private final Double targetValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeKey")
    private final String badgeKey;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("premium")
    private final Boolean premium;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("earnedMultiplier")
    private final Integer earnedMultiplier;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.g f38300l;

    public /* synthetic */ q(String str, String str2, Integer num, String str3, String str4, Integer num2, Double d14, Double d15, String str5, Boolean bool, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : bool, (i14 & 1024) != 0 ? null : num3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBadgeChallengeName() {
        return this.badgeChallengeName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBadgeKey() {
        return this.badgeKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getBadgeUnitId() {
        return this.badgeUnitId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getChallengeCategoryId() {
        return this.challengeCategoryId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.uuid, qVar.uuid) && p005kotlin.jvm.internal.s.g(this.badgeChallengeName, qVar.badgeChallengeName) && p005kotlin.jvm.internal.s.g(this.challengeCategoryId, qVar.challengeCategoryId) && p005kotlin.jvm.internal.s.g(this.startDate, qVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, qVar.endDate) && p005kotlin.jvm.internal.s.g(this.badgeUnitId, qVar.badgeUnitId) && p005kotlin.jvm.internal.s.g(this.progressValue, qVar.progressValue) && p005kotlin.jvm.internal.s.g(this.targetValue, qVar.targetValue) && p005kotlin.jvm.internal.s.g(this.badgeKey, qVar.badgeKey) && p005kotlin.jvm.internal.s.g(this.premium, qVar.premium) && p005kotlin.jvm.internal.s.g(this.earnedMultiplier, qVar.earnedMultiplier);
    }

    public final boolean f() {
        return (p005kotlin.jvm.internal.s.g(this.premium, Boolean.TRUE) || this.earnedMultiplier == null) ? false : true;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getProgressValue() {
        return this.progressValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.badgeChallengeName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.challengeCategoryId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.startDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.badgeUnitId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.progressValue;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.targetValue;
        int iHashCode8 = (iHashCode7 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str5 = this.badgeKey;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.premium;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.earnedMultiplier;
        return iHashCode10 + (num3 != null ? num3.hashCode() : 0);
    }

    public final DateTime i() {
        return g22.k.q(this.startDate, "yyyy-MM-dd'T'HH:mm:ss.S", null);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getTargetValue() {
        return this.targetValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final String toString() {
        String str = this.uuid;
        String str2 = this.badgeChallengeName;
        Integer num = this.challengeCategoryId;
        String str3 = this.startDate;
        String str4 = this.endDate;
        Integer num2 = this.badgeUnitId;
        Double d14 = this.progressValue;
        Double d15 = this.targetValue;
        String str5 = this.badgeKey;
        Boolean bool = this.premium;
        Integer num3 = this.earnedMultiplier;
        StringBuilder sbI = p6.b.i("BadgeChallengeDashboardDTO(uuid=", str, ", badgeChallengeName=", str2, ", challengeCategoryId=");
        p6.b.l(num, ", startDate=", str3, ", endDate=", sbI);
        fb1.c.u(num2, str4, ", badgeUnitId=", ", progressValue=", sbI);
        b71.i.p(d14, d15, ", targetValue=", ", badgeKey=", sbI);
        b71.i.w(sbI, str5, ", premium=", bool, ", earnedMultiplier=");
        return f3.i(sbI, num3, ")");
    }

    public q(String str, String str2, Integer num, String str3, String str4, Integer num2, Double d14, Double d15, String str5, Boolean bool, Integer num3) {
        this.uuid = str;
        this.badgeChallengeName = str2;
        this.challengeCategoryId = num;
        this.startDate = str3;
        this.endDate = str4;
        this.badgeUnitId = num2;
        this.progressValue = d14;
        this.targetValue = d15;
        this.badgeKey = str5;
        this.premium = bool;
        this.earnedMultiplier = num3;
    }

    public q() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
