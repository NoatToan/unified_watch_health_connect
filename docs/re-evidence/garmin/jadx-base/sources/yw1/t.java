package yw1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lyw1/t;", "", "", "category", "subCategory", "", "totalReps", "totalSets", "activeSets", "", "totalTimeInSeconds", "totalVolume", "maxWeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "f", "Ljava/lang/Double;", "()Ljava/lang/Double;", "g", "h", "getMaxWeight", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subCategory")
    private final String subCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalReps")
    private final Integer totalReps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalSets")
    private final Integer totalSets;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeSets")
    private final Integer activeSets;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalTimeInSeconds")
    private final Double totalTimeInSeconds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalVolume")
    private final Double totalVolume;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxWeight")
    private final Double maxWeight;

    public t(String str, String str2, Integer num, Integer num2, Integer num3, Double d14, Double d15, Double d16) {
        this.category = str;
        this.subCategory = str2;
        this.totalReps = num;
        this.totalSets = num2;
        this.activeSets = num3;
        this.totalTimeInSeconds = d14;
        this.totalVolume = d15;
        this.maxWeight = d16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getActiveSets() {
        return this.activeSets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubCategory() {
        return this.subCategory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getTotalReps() {
        return this.totalReps;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getTotalSets() {
        return this.totalSets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.category, tVar.category) && p005kotlin.jvm.internal.s.g(this.subCategory, tVar.subCategory) && p005kotlin.jvm.internal.s.g(this.totalReps, tVar.totalReps) && p005kotlin.jvm.internal.s.g(this.totalSets, tVar.totalSets) && p005kotlin.jvm.internal.s.g(this.activeSets, tVar.activeSets) && p005kotlin.jvm.internal.s.g(this.totalTimeInSeconds, tVar.totalTimeInSeconds) && p005kotlin.jvm.internal.s.g(this.totalVolume, tVar.totalVolume) && p005kotlin.jvm.internal.s.g(this.maxWeight, tVar.maxWeight);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getTotalTimeInSeconds() {
        return this.totalTimeInSeconds;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getTotalVolume() {
        return this.totalVolume;
    }

    public final int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subCategory;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.totalReps;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalSets;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.activeSets;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d14 = this.totalTimeInSeconds;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.totalVolume;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.maxWeight;
        return iHashCode7 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        String str = this.category;
        String str2 = this.subCategory;
        Integer num = this.totalReps;
        Integer num2 = this.totalSets;
        Integer num3 = this.activeSets;
        Double d14 = this.totalTimeInSeconds;
        Double d15 = this.totalVolume;
        Double d16 = this.maxWeight;
        StringBuilder sbI = p6.b.i("StrengthExerciseSummaryDTO(category=", str, ", subCategory=", str2, ", totalReps=");
        x.m(sbI, num, ", totalSets=", num2, ", activeSets=");
        b71.i.v(sbI, num3, ", totalTimeInSeconds=", d14, ", totalVolume=");
        return sn.a.f(d15, d16, ", maxWeight=", ")", sbI);
    }
}
