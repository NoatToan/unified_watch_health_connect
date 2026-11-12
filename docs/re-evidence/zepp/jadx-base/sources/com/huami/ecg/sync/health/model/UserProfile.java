package com.huami.ecg.sync.health.model;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b=\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0001LB]\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\bJ\u0010KJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003Jc\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0010HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010!\u001a\u0004\bB\u0010#\"\u0004\bC\u0010%R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/huami/ecg/sync/health/model/UserProfile;", "", "", "isMeasureHandMarked", "", "component1", "Lcom/huami/ecg/sync/health/model/HealthInfo;", "component2", "component3", "", "component4", "component5", "component6", "", "component7", "component8", "", "component9", "userId", "healthInfo", "birthday", "age", "gender", "height", "weight", "wearingWay", "measuretime", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "b", "Lcom/huami/ecg/sync/health/model/HealthInfo;", "getHealthInfo", "()Lcom/huami/ecg/sync/health/model/HealthInfo;", "setHealthInfo", "(Lcom/huami/ecg/sync/health/model/HealthInfo;)V", "c", "getBirthday", "setBirthday", GoogleApiAvailabilityLight.a, LogUtil.I, "getAge", "()I", "setAge", "(I)V", "e", "getGender", "setGender", "f", "getHeight", "setHeight", "g", "F", "getWeight", "()F", "setWeight", "(F)V", "h", "getWearingWay", "setWearingWay", "i", "J", "getMeasuretime", "()J", "setMeasuretime", "(J)V", "<init>", "(Ljava/lang/String;Lcom/huami/ecg/sync/health/model/HealthInfo;Ljava/lang/String;IIIFLjava/lang/String;J)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class UserProfile {
    public static final int GENDER_FEMALE = 0;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNDEFINE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private HealthInfo healthInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String birthday;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int age;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int gender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int height;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private float weight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private String wearingWay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private long measuretime;

    public UserProfile(@NotNull String str, @NotNull HealthInfo healthInfo, @NotNull String str2, int i, int i2, int i3, float f, @NotNull String str3, long j) {
        this.userId = str;
        this.healthInfo = healthInfo;
        this.birthday = str2;
        this.age = i;
        this.gender = i2;
        this.height = i3;
        this.weight = f;
        this.wearingWay = str3;
        this.measuretime = j;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthInfo getHealthInfo() {
        return this.healthInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWearingWay() {
        return this.wearingWay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getMeasuretime() {
        return this.measuretime;
    }

    @NotNull
    public final UserProfile copy(@NotNull String userId, @NotNull HealthInfo healthInfo, @NotNull String birthday, int age, int gender, int height, float weight, @NotNull String wearingWay, long measuretime) {
        return new UserProfile(userId, healthInfo, birthday, age, gender, height, weight, wearingWay, measuretime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return Intrinsics.areEqual(this.userId, userProfile.userId) && Intrinsics.areEqual(this.healthInfo, userProfile.healthInfo) && Intrinsics.areEqual(this.birthday, userProfile.birthday) && this.age == userProfile.age && this.gender == userProfile.gender && this.height == userProfile.height && Float.compare(this.weight, userProfile.weight) == 0 && Intrinsics.areEqual(this.wearingWay, userProfile.wearingWay) && this.measuretime == userProfile.measuretime;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getGender() {
        return this.gender;
    }

    @NotNull
    public final HealthInfo getHealthInfo() {
        return this.healthInfo;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getMeasuretime() {
        return this.measuretime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getWearingWay() {
        return this.wearingWay;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        HealthInfo healthInfo = this.healthInfo;
        int iHashCode2 = (iHashCode + (healthInfo != null ? healthInfo.hashCode() : 0)) * 31;
        String str2 = this.birthday;
        int iHashCode3 = (((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.age) * 31) + this.gender) * 31) + this.height) * 31) + Float.floatToIntBits(this.weight)) * 31;
        String str3 = this.wearingWay;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.measuretime;
        return iHashCode4 + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isMeasureHandMarked() {
        return !TextUtils.isEmpty(this.wearingWay) && this.measuretime > 0;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setBirthday(@NotNull String str) {
        this.birthday = str;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final void setHealthInfo(@NotNull HealthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMeasuretime(long j) {
        this.measuretime = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setWearingWay(@NotNull String str) {
        this.wearingWay = str;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "UserProfile(userId=" + this.userId + ", healthInfo=" + this.healthInfo + ", birthday=" + this.birthday + ", age=" + this.age + ", gender=" + this.gender + ", height=" + this.height + ", weight=" + this.weight + ", wearingWay=" + this.wearingWay + ", measuretime=" + this.measuretime + ")";
    }

    public /* synthetic */ UserProfile(String str, HealthInfo healthInfo, String str2, int i, int i2, int i3, float f, String str3, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, healthInfo, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? -1 : i, (i4 & 16) != 0 ? -1 : i2, (i4 & 32) != 0 ? -1 : i3, (i4 & 64) != 0 ? -1.0f : f, (i4 & 128) != 0 ? "LEFT_HAND" : str3, (i4 & 256) != 0 ? -1L : j);
    }
}
