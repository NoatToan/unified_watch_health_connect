package com.xiaomi.fitness.health.ecg.web;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012HÆ\u0003J\u0098\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\tHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/web/EcgServiceData;", "", "nickName", "", "avatarUrl", "height", "", "weight", "age", "", "gender", "avgHr", "sid", "sampleRate", EcgSchemaHandler.PARAM_MEASURE_TIME, "", "measureDuration", "measurePointList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IJILjava/util/List;)V", "getNickName", "()Ljava/lang/String;", "getAvatarUrl", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getWeight", "getAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGender", "getAvgHr", "getSid", "getSampleRate", "()I", "getMeasureTime", "()J", "getMeasureDuration", "getMeasurePointList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IJILjava/util/List;)Lcom/xiaomi/fitness/health/ecg/web/EcgServiceData;", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgServiceData {

    @SerializedName("age")
    @Nullable
    private final Integer age;

    @SerializedName("avatarUrl")
    @Nullable
    private final String avatarUrl;

    @SerializedName("avgHr")
    @Nullable
    private final Integer avgHr;

    @SerializedName("gender")
    @Nullable
    private final Integer gender;

    @SerializedName("height")
    @Nullable
    private final Float height;

    @SerializedName("measureDuration")
    private final int measureDuration;

    @SerializedName("measurePointList")
    @NotNull
    private final List<Float> measurePointList;

    @SerializedName(EcgSchemaHandler.PARAM_MEASURE_TIME)
    private final long measureTime;

    @SerializedName("nickName")
    @NotNull
    private final String nickName;

    @SerializedName("sampleRate")
    private final int sampleRate;

    @SerializedName("sid")
    @NotNull
    private final String sid;

    @SerializedName("weight")
    @Nullable
    private final Float weight;

    public EcgServiceData(@NotNull String nickName, @Nullable String str, @Nullable Float f, @Nullable Float f2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull String sid, int i, long j, int i2, @NotNull List<Float> measurePointList) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(measurePointList, "measurePointList");
        this.nickName = nickName;
        this.avatarUrl = str;
        this.height = f;
        this.weight = f2;
        this.age = num;
        this.gender = num2;
        this.avgHr = num3;
        this.sid = sid;
        this.sampleRate = i;
        this.measureTime = j;
        this.measureDuration = i2;
        this.measurePointList = measurePointList;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMeasureDuration() {
        return this.measureDuration;
    }

    @NotNull
    public final List<Float> component12() {
        return this.measurePointList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public final EcgServiceData copy(@NotNull String nickName, @Nullable String avatarUrl, @Nullable Float height, @Nullable Float weight, @Nullable Integer age, @Nullable Integer gender, @Nullable Integer avgHr, @NotNull String sid, int sampleRate, long measureTime, int measureDuration, @NotNull List<Float> measurePointList) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(measurePointList, "measurePointList");
        return new EcgServiceData(nickName, avatarUrl, height, weight, age, gender, avgHr, sid, sampleRate, measureTime, measureDuration, measurePointList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgServiceData)) {
            return false;
        }
        EcgServiceData ecgServiceData = (EcgServiceData) other;
        return Intrinsics.areEqual(this.nickName, ecgServiceData.nickName) && Intrinsics.areEqual(this.avatarUrl, ecgServiceData.avatarUrl) && Intrinsics.areEqual((Object) this.height, (Object) ecgServiceData.height) && Intrinsics.areEqual((Object) this.weight, (Object) ecgServiceData.weight) && Intrinsics.areEqual(this.age, ecgServiceData.age) && Intrinsics.areEqual(this.gender, ecgServiceData.gender) && Intrinsics.areEqual(this.avgHr, ecgServiceData.avgHr) && Intrinsics.areEqual(this.sid, ecgServiceData.sid) && this.sampleRate == ecgServiceData.sampleRate && this.measureTime == ecgServiceData.measureTime && this.measureDuration == ecgServiceData.measureDuration && Intrinsics.areEqual(this.measurePointList, ecgServiceData.measurePointList);
    }

    @Nullable
    public final Integer getAge() {
        return this.age;
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    public final int getMeasureDuration() {
        return this.measureDuration;
    }

    @NotNull
    public final List<Float> getMeasurePointList() {
        return this.measurePointList;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final Float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.nickName.hashCode() * 31;
        String str = this.avatarUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.height;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.weight;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.age;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.gender;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.avgHr;
        return ((((((((((iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.sid.hashCode()) * 31) + Integer.hashCode(this.sampleRate)) * 31) + Long.hashCode(this.measureTime)) * 31) + Integer.hashCode(this.measureDuration)) * 31) + this.measurePointList.hashCode();
    }

    @NotNull
    public String toString() {
        return "EcgServiceData(nickName=" + this.nickName + ", avatarUrl=" + this.avatarUrl + ", height=" + this.height + ", weight=" + this.weight + ", age=" + this.age + ", gender=" + this.gender + ", avgHr=" + this.avgHr + ", sid=" + this.sid + ", sampleRate=" + this.sampleRate + ", measureTime=" + this.measureTime + ", measureDuration=" + this.measureDuration + ", measurePointList=" + this.measurePointList + ")";
    }
}
