package com.garmin.android.apps.connectmobile.performance.dto;

import am.j;
import c22.l3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001a\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/dto/d;", "", "", "category", "subCategory", "", "totalReps", "totalSets", "activeSets", "", "totalTimeInSeconds", "totalVolume", "avgDailyTimeInSeconds", "avgSets", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIDDLjava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "b", "getSubCategory", "c", "I", "()I", "d", JWKParameterNames.RSA_EXPONENT, "getActiveSets", "f", "D", "getTotalTimeInSeconds", "()D", "g", "h", "Ljava/lang/Double;", "getAvgDailyTimeInSeconds", "()Ljava/lang/Double;", IntegerTokenConverter.CONVERTER_KEY, "getAvgSets", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subCategory")
    private final String subCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalReps")
    private final int totalReps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalSets")
    private final int totalSets;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeSets")
    private final int activeSets;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalTimeInSeconds")
    private final double totalTimeInSeconds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalVolume")
    private final double totalVolume;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgDailyTimeInSeconds")
    private final Double avgDailyTimeInSeconds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSets")
    private final Double avgSets;

    public d(String str, String str2, int i14, int i15, int i16, double d14, double d15, Double d16, Double d17) {
        str.getClass();
        this.category = str;
        this.subCategory = str2;
        this.totalReps = i14;
        this.totalSets = i15;
        this.activeSets = i16;
        this.totalTimeInSeconds = d14;
        this.totalVolume = d15;
        this.avgDailyTimeInSeconds = d16;
        this.avgSets = d17;
    }

    public final double a() {
        if (j.z(l.f68084a)) {
            return this.totalVolume;
        }
        l3.a aVar = l3.f23124b;
        double d14 = this.totalVolume;
        aVar.getClass();
        return d14 * 2.20462d;
    }

    public final c b() {
        return new c(this.category, this.subCategory);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTotalReps() {
        return this.totalReps;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalSets() {
        return this.totalSets;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getTotalVolume() {
        return this.totalVolume;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.category, dVar.category) && s.g(this.subCategory, dVar.subCategory) && this.totalReps == dVar.totalReps && this.totalSets == dVar.totalSets && this.activeSets == dVar.activeSets && Double.compare(this.totalTimeInSeconds, dVar.totalTimeInSeconds) == 0 && Double.compare(this.totalVolume, dVar.totalVolume) == 0 && s.g(this.avgDailyTimeInSeconds, dVar.avgDailyTimeInSeconds) && s.g(this.avgSets, dVar.avgSets);
    }

    public final int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        String str = this.subCategory;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.activeSets, q2.d(this.totalSets, q2.d(this.totalReps, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.totalTimeInSeconds), 31, this.totalVolume);
        Double d14 = this.avgDailyTimeInSeconds;
        int iHashCode2 = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.avgSets;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        String str = this.category;
        String str2 = this.subCategory;
        int i14 = this.totalReps;
        int i15 = this.totalSets;
        int i16 = this.activeSets;
        double d14 = this.totalTimeInSeconds;
        double d15 = this.totalVolume;
        Double d16 = this.avgDailyTimeInSeconds;
        Double d17 = this.avgSets;
        StringBuilder sbI = p6.b.i("ExerciseSummaryDto(category=", str, ", subCategory=", str2, ", totalReps=");
        e0.m(i14, i15, ", totalSets=", ", activeSets=", sbI);
        sbI.append(i16);
        sbI.append(", totalTimeInSeconds=");
        sbI.append(d14);
        j.x(sbI, ", totalVolume=", d15, ", avgDailyTimeInSeconds=");
        return sn.a.f(d16, d17, ", avgSets=", ")", sbI);
    }
}
