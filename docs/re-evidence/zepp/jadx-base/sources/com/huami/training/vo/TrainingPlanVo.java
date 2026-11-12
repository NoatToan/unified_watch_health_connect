package com.huami.training.vo;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.TrainingPlanState;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bN\u0010OJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u009a\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0017\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u0019\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001a\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0019\u0010\u001b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u0019\u0010\u001c\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R\u0019\u0010\u001d\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bB\u0010:R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u0010R\u0019\u0010\u001f\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010\u0010R\u001b\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bM\u00104¨\u0006P"}, d2 = {"Lcom/huami/training/vo/TrainingPlanVo;", "", "", "component1", "Lcom/huami/training/dto/TrainingPlanState;", "component2", "", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "Lcom/huami/training/dto/Difficulty;", "component11", "component12", "component13", "id", "state", "name", "detailImageUrl", "consumption", "totalDays", "trainingDays", "finishedDays", "waitDays", "dayIndex", "difficulty", "todayTrainingDuration", "todayTrainingName", "copy", "(JLcom/huami/training/dto/TrainingPlanState;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Integer;Lcom/huami/training/dto/Difficulty;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huami/training/vo/TrainingPlanVo;", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "Lcom/huami/training/dto/TrainingPlanState;", "getState", "()Lcom/huami/training/dto/TrainingPlanState;", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getDetailImageUrl", "e", LogUtil.I, "getConsumption", "()I", "f", "getTotalDays", "g", "getTrainingDays", "h", "getFinishedDays", "i", "getWaitDays", z.j, "Ljava/lang/Integer;", "getDayIndex", hl.k, "Lcom/huami/training/dto/Difficulty;", "getDifficulty", "()Lcom/huami/training/dto/Difficulty;", "l", "getTodayTrainingDuration", "m", "getTodayTrainingName", "<init>", "(JLcom/huami/training/dto/TrainingPlanState;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Integer;Lcom/huami/training/dto/Difficulty;Ljava/lang/Integer;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TrainingPlanVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final TrainingPlanState state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String detailImageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int consumption;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int totalDays;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int trainingDays;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int finishedDays;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int waitDays;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer dayIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    private final Difficulty difficulty;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer todayTrainingDuration;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final String todayTrainingName;

    public TrainingPlanVo(long j, @NotNull TrainingPlanState trainingPlanState, @NotNull String str, @Nullable String str2, int i, int i2, int i3, int i4, int i5, @Nullable Integer num, @NotNull Difficulty difficulty, @Nullable Integer num2, @Nullable String str3) {
        this.id = j;
        this.state = trainingPlanState;
        this.name = str;
        this.detailImageUrl = str2;
        this.consumption = i;
        this.totalDays = i2;
        this.trainingDays = i3;
        this.finishedDays = i4;
        this.waitDays = i5;
        this.dayIndex = num;
        this.difficulty = difficulty;
        this.todayTrainingDuration = num2;
        this.todayTrainingName = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getDayIndex() {
        return this.dayIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getTodayTrainingDuration() {
        return this.todayTrainingDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTodayTrainingName() {
        return this.todayTrainingName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrainingPlanState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
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

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalDays() {
        return this.totalDays;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTrainingDays() {
        return this.trainingDays;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFinishedDays() {
        return this.finishedDays;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getWaitDays() {
        return this.waitDays;
    }

    @NotNull
    public final TrainingPlanVo copy(long id, @NotNull TrainingPlanState state, @NotNull String name, @Nullable String detailImageUrl, int consumption, int totalDays, int trainingDays, int finishedDays, int waitDays, @Nullable Integer dayIndex, @NotNull Difficulty difficulty, @Nullable Integer todayTrainingDuration, @Nullable String todayTrainingName) {
        return new TrainingPlanVo(id, state, name, detailImageUrl, consumption, totalDays, trainingDays, finishedDays, waitDays, dayIndex, difficulty, todayTrainingDuration, todayTrainingName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlanVo)) {
            return false;
        }
        TrainingPlanVo trainingPlanVo = (TrainingPlanVo) other;
        return this.id == trainingPlanVo.id && this.state == trainingPlanVo.state && Intrinsics.areEqual(this.name, trainingPlanVo.name) && Intrinsics.areEqual(this.detailImageUrl, trainingPlanVo.detailImageUrl) && this.consumption == trainingPlanVo.consumption && this.totalDays == trainingPlanVo.totalDays && this.trainingDays == trainingPlanVo.trainingDays && this.finishedDays == trainingPlanVo.finishedDays && this.waitDays == trainingPlanVo.waitDays && Intrinsics.areEqual(this.dayIndex, trainingPlanVo.dayIndex) && this.difficulty == trainingPlanVo.difficulty && Intrinsics.areEqual(this.todayTrainingDuration, trainingPlanVo.todayTrainingDuration) && Intrinsics.areEqual(this.todayTrainingName, trainingPlanVo.todayTrainingName);
    }

    public final int getConsumption() {
        return this.consumption;
    }

    @Nullable
    public final Integer getDayIndex() {
        return this.dayIndex;
    }

    @Nullable
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    @NotNull
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    public final int getFinishedDays() {
        return this.finishedDays;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final TrainingPlanState getState() {
        return this.state;
    }

    @Nullable
    public final Integer getTodayTrainingDuration() {
        return this.todayTrainingDuration;
    }

    @Nullable
    public final String getTodayTrainingName() {
        return this.todayTrainingName;
    }

    public final int getTotalDays() {
        return this.totalDays;
    }

    public final int getTrainingDays() {
        return this.trainingDays;
    }

    public final int getWaitDays() {
        return this.waitDays;
    }

    public int hashCode() {
        int iA = ((((b.a(this.id) * 31) + this.state.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.detailImageUrl;
        int iHashCode = (((((((((((iA + (str == null ? 0 : str.hashCode())) * 31) + this.consumption) * 31) + this.totalDays) * 31) + this.trainingDays) * 31) + this.finishedDays) * 31) + this.waitDays) * 31;
        Integer num = this.dayIndex;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.difficulty.hashCode()) * 31;
        Integer num2 = this.todayTrainingDuration;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.todayTrainingName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrainingPlanVo(id=" + this.id + ", state=" + this.state + ", name=" + this.name + ", detailImageUrl=" + ((Object) this.detailImageUrl) + ", consumption=" + this.consumption + ", totalDays=" + this.totalDays + ", trainingDays=" + this.trainingDays + ", finishedDays=" + this.finishedDays + ", waitDays=" + this.waitDays + ", dayIndex=" + this.dayIndex + ", difficulty=" + this.difficulty + ", todayTrainingDuration=" + this.todayTrainingDuration + ", todayTrainingName=" + ((Object) this.todayTrainingName) + ')';
    }

    public /* synthetic */ TrainingPlanVo(long j, TrainingPlanState trainingPlanState, String str, String str2, int i, int i2, int i3, int i4, int i5, Integer num, Difficulty difficulty, Integer num2, String str3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, trainingPlanState, str, (i6 & 8) != 0 ? null : str2, i, i2, i3, i4, i5, num, difficulty, num2, str3);
    }
}
