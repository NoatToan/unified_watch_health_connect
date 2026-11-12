package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.PlanType;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\bG\u0010HJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\u0087\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u0002HÆ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0019\u0010\u0017\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u0019\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001a\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u0010(R\u0019\u0010\u001c\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00104R\u0019\u0010\u001d\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104R\u0019\u0010\u001e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010&\u001a\u0004\bF\u0010(¨\u0006I"}, d2 = {"Lcom/huami/training/db/po/TrainingPlan;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "Lcom/huami/training/dto/PlanType;", "component7", "Lcom/huami/training/dto/Difficulty;", "component8", "component9", "component10", "component11", "component12", "id", "name", "listImageUrl", "detailImageUrl", "consumption", "introduction", "type", "difficulty", "duration", "trainingDays", "totalDays", "startDay", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "getListImageUrl", GoogleApiAvailabilityLight.a, "getDetailImageUrl", "e", LogUtil.I, "getConsumption", "()I", "f", "getIntroduction", "g", "Lcom/huami/training/dto/PlanType;", "getType", "()Lcom/huami/training/dto/PlanType;", "h", "Lcom/huami/training/dto/Difficulty;", "getDifficulty", "()Lcom/huami/training/dto/Difficulty;", "i", "getDuration", z.j, "getTrainingDays", hl.k, "getTotalDays", "l", "getStartDay", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/huami/training/dto/PlanType;Lcom/huami/training/dto/Difficulty;JIIJ)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TrainingPlan {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String listImageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String detailImageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int consumption;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String introduction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final PlanType type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final Difficulty difficulty;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final long duration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int trainingDays;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int totalDays;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final long startDay;

    public TrainingPlan(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, int i, @Nullable String str4, @NotNull PlanType planType, @NotNull Difficulty difficulty, long j2, int i2, int i3, long j3) {
        this.id = j;
        this.name = str;
        this.listImageUrl = str2;
        this.detailImageUrl = str3;
        this.consumption = i;
        this.introduction = str4;
        this.type = planType;
        this.difficulty = difficulty;
        this.duration = j2;
        this.trainingDays = i2;
        this.totalDays = i3;
        this.startDay = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTrainingDays() {
        return this.trainingDays;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTotalDays() {
        return this.totalDays;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getStartDay() {
        return this.startDay;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getListImageUrl() {
        return this.listImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConsumption() {
        return this.consumption;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PlanType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final TrainingPlan copy(long id, @NotNull String name, @Nullable String listImageUrl, @Nullable String detailImageUrl, int consumption, @Nullable String introduction, @NotNull PlanType type, @NotNull Difficulty difficulty, long duration, int trainingDays, int totalDays, long startDay) {
        return new TrainingPlan(id, name, listImageUrl, detailImageUrl, consumption, introduction, type, difficulty, duration, trainingDays, totalDays, startDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlan)) {
            return false;
        }
        TrainingPlan trainingPlan = (TrainingPlan) other;
        return this.id == trainingPlan.id && Intrinsics.areEqual(this.name, trainingPlan.name) && Intrinsics.areEqual(this.listImageUrl, trainingPlan.listImageUrl) && Intrinsics.areEqual(this.detailImageUrl, trainingPlan.detailImageUrl) && this.consumption == trainingPlan.consumption && Intrinsics.areEqual(this.introduction, trainingPlan.introduction) && this.type == trainingPlan.type && this.difficulty == trainingPlan.difficulty && this.duration == trainingPlan.duration && this.trainingDays == trainingPlan.trainingDays && this.totalDays == trainingPlan.totalDays && this.startDay == trainingPlan.startDay;
    }

    public final int getConsumption() {
        return this.consumption;
    }

    @Nullable
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    @NotNull
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    public final String getListImageUrl() {
        return this.listImageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getStartDay() {
        return this.startDay;
    }

    public final int getTotalDays() {
        return this.totalDays;
    }

    public final int getTrainingDays() {
        return this.trainingDays;
    }

    @NotNull
    public final PlanType getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + this.name.hashCode()) * 31;
        String str = this.listImageUrl;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.detailImageUrl;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.consumption) * 31;
        String str3 = this.introduction;
        return ((((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.type.hashCode()) * 31) + this.difficulty.hashCode()) * 31) + b.a(this.duration)) * 31) + this.trainingDays) * 31) + this.totalDays) * 31) + b.a(this.startDay);
    }

    @NotNull
    public String toString() {
        return "TrainingPlan(id=" + this.id + ", name=" + this.name + ", listImageUrl=" + ((Object) this.listImageUrl) + ", detailImageUrl=" + ((Object) this.detailImageUrl) + ", consumption=" + this.consumption + ", introduction=" + ((Object) this.introduction) + ", type=" + this.type + ", difficulty=" + this.difficulty + ", duration=" + this.duration + ", trainingDays=" + this.trainingDays + ", totalDays=" + this.totalDays + ", startDay=" + this.startDay + ')';
    }

    public /* synthetic */ TrainingPlan(long j, String str, String str2, String str3, int i, String str4, PlanType planType, Difficulty difficulty, long j2, int i2, int i3, long j3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, i, (i4 & 32) != 0 ? null : str4, planType, difficulty, j2, i2, i3, j3);
    }
}
