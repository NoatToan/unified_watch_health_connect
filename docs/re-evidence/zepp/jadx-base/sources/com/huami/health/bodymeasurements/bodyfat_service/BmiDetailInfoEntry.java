package com.huami.health.bodymeasurements.bodyfat_service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u0084\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\fHÖ\u0001J\u0013\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0015\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\nR%\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R%\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u0019\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u0010)R\u0019\u0010\u001a\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010)R\u0019\u0010\u001b\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "", "", "component1", "", "component2", "Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", "component3", "", "component4", "()Ljava/lang/Float;", "Lkotlin/Pair;", "", "component5", "component6", "component7", "component8", "", "component9", "lastTime", "weight", "weightUnit", "bmi", StepsInfo.KEY_STAGE, "bmiStage", "weightStateText", "bmiStateText", "canAnalyze", "copy", "(JLjava/lang/String;Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;Ljava/lang/Float;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Z)Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "toString", "hashCode", "other", "equals", "a", "J", "getLastTime", "()J", "b", "Ljava/lang/String;", "getWeight", "()Ljava/lang/String;", "c", "Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", "getWeightUnit", "()Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", GoogleApiAvailabilityLight.a, "Ljava/lang/Float;", "getBmi", "e", "Lkotlin/Pair;", "getStage", "()Lkotlin/Pair;", "f", "getBmiStage", "g", "getWeightStateText", "h", "getBmiStateText", "i", "Z", "getCanAnalyze", "()Z", "<init>", "(JLjava/lang/String;Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;Ljava/lang/Float;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Z)V", "bodyfat-service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BmiDetailInfoEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long lastTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final WeightUnit weightUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float bmi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Integer, Integer> stage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Integer, Integer> bmiStage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String weightStateText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String bmiStateText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final boolean canAnalyze;

    public BmiDetailInfoEntry(long j, @NotNull String str, @NotNull WeightUnit weightUnit, @Nullable Float f, @NotNull Pair<Integer, Integer> pair, @NotNull Pair<Integer, Integer> pair2, @NotNull String str2, @NotNull String str3, boolean z) {
        this.lastTime = j;
        this.weight = str;
        this.weightUnit = weightUnit;
        this.bmi = f;
        this.stage = pair;
        this.bmiStage = pair2;
        this.weightStateText = str2;
        this.bmiStateText = str3;
        this.canAnalyze = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastTime() {
        return this.lastTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WeightUnit getWeightUnit() {
        return this.weightUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getBmi() {
        return this.bmi;
    }

    @NotNull
    public final Pair<Integer, Integer> component5() {
        return this.stage;
    }

    @NotNull
    public final Pair<Integer, Integer> component6() {
        return this.bmiStage;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWeightStateText() {
        return this.weightStateText;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBmiStateText() {
        return this.bmiStateText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getCanAnalyze() {
        return this.canAnalyze;
    }

    @NotNull
    public final BmiDetailInfoEntry copy(long lastTime, @NotNull String weight, @NotNull WeightUnit weightUnit, @Nullable Float bmi, @NotNull Pair<Integer, Integer> stage, @NotNull Pair<Integer, Integer> bmiStage, @NotNull String weightStateText, @NotNull String bmiStateText, boolean canAnalyze) {
        return new BmiDetailInfoEntry(lastTime, weight, weightUnit, bmi, stage, bmiStage, weightStateText, bmiStateText, canAnalyze);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BmiDetailInfoEntry)) {
            return false;
        }
        BmiDetailInfoEntry bmiDetailInfoEntry = (BmiDetailInfoEntry) other;
        return this.lastTime == bmiDetailInfoEntry.lastTime && Intrinsics.areEqual(this.weight, bmiDetailInfoEntry.weight) && Intrinsics.areEqual(this.weightUnit, bmiDetailInfoEntry.weightUnit) && Intrinsics.areEqual((Object) this.bmi, (Object) bmiDetailInfoEntry.bmi) && Intrinsics.areEqual(this.stage, bmiDetailInfoEntry.stage) && Intrinsics.areEqual(this.bmiStage, bmiDetailInfoEntry.bmiStage) && Intrinsics.areEqual(this.weightStateText, bmiDetailInfoEntry.weightStateText) && Intrinsics.areEqual(this.bmiStateText, bmiDetailInfoEntry.bmiStateText) && this.canAnalyze == bmiDetailInfoEntry.canAnalyze;
    }

    @Nullable
    public final Float getBmi() {
        return this.bmi;
    }

    @NotNull
    public final Pair<Integer, Integer> getBmiStage() {
        return this.bmiStage;
    }

    @NotNull
    public final String getBmiStateText() {
        return this.bmiStateText;
    }

    public final boolean getCanAnalyze() {
        return this.canAnalyze;
    }

    public final long getLastTime() {
        return this.lastTime;
    }

    @NotNull
    public final Pair<Integer, Integer> getStage() {
        return this.stage;
    }

    @NotNull
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    public final String getWeightStateText() {
        return this.weightStateText;
    }

    @NotNull
    public final WeightUnit getWeightUnit() {
        return this.weightUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v28 */
    public int hashCode() {
        int iA = b.a(this.lastTime) * 31;
        String str = this.weight;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        WeightUnit weightUnit = this.weightUnit;
        int iHashCode2 = (iHashCode + (weightUnit != null ? weightUnit.hashCode() : 0)) * 31;
        Float f = this.bmi;
        int iHashCode3 = (iHashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        Pair<Integer, Integer> pair = this.stage;
        int iHashCode4 = (iHashCode3 + (pair != null ? pair.hashCode() : 0)) * 31;
        Pair<Integer, Integer> pair2 = this.bmiStage;
        int iHashCode5 = (iHashCode4 + (pair2 != null ? pair2.hashCode() : 0)) * 31;
        String str2 = this.weightStateText;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bmiStateText;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.canAnalyze;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode7 + r1;
    }

    @NotNull
    public String toString() {
        return "BmiDetailInfoEntry(lastTime=" + this.lastTime + ", weight=" + this.weight + ", weightUnit=" + this.weightUnit + ", bmi=" + this.bmi + ", stage=" + this.stage + ", bmiStage=" + this.bmiStage + ", weightStateText=" + this.weightStateText + ", bmiStateText=" + this.bmiStateText + ", canAnalyze=" + this.canAnalyze + ")";
    }
}
