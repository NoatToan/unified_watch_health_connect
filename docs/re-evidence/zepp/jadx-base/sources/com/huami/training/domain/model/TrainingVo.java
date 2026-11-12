package com.huami.training.domain.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bD\u0010EJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J~\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0004R\u0019\u0010\u0014\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0016\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b@\u0010*R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u0012¨\u0006F"}, d2 = {"Lcom/huami/training/domain/model/TrainingVo;", "", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "component4", "Lcom/huami/training/domain/model/DomainDifficulty;", "component5", "", "component6", "component7", "Lcom/huami/training/domain/model/DomainTrainingType;", "component8", "component9", "component10", "()Ljava/lang/Integer;", "trainingId", "image", "squareImageUrl", "name", "difficulty", "courseCount", "calorie", "trainingType", "label", "number", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/domain/model/DomainDifficulty;IJLcom/huami/training/domain/model/DomainTrainingType;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/training/domain/model/TrainingVo;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Long;", "getTrainingId", "b", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "c", "getSquareImageUrl", GoogleApiAvailabilityLight.a, "getName", "e", "Lcom/huami/training/domain/model/DomainDifficulty;", "getDifficulty", "()Lcom/huami/training/domain/model/DomainDifficulty;", "f", LogUtil.I, "getCourseCount", "()I", "g", "J", "getCalorie", "()J", "h", "Lcom/huami/training/domain/model/DomainTrainingType;", "getTrainingType", "()Lcom/huami/training/domain/model/DomainTrainingType;", "i", "getLabel", z.j, "Ljava/lang/Integer;", "getNumber", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/domain/model/DomainDifficulty;IJLcom/huami/training/domain/model/DomainTrainingType;Ljava/lang/String;Ljava/lang/Integer;)V", "com.huami.training.domain"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TrainingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long trainingId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String squareImageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final DomainDifficulty difficulty;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int courseCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final long calorie;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final DomainTrainingType trainingType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String label;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer number;

    public TrainingVo(@Nullable Long l, @NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable DomainDifficulty domainDifficulty, int i, long j, @NotNull DomainTrainingType domainTrainingType, @Nullable String str4, @Nullable Integer num) {
        this.trainingId = l;
        this.image = str;
        this.squareImageUrl = str2;
        this.name = str3;
        this.difficulty = domainDifficulty;
        this.courseCount = i;
        this.calorie = j;
        this.trainingType = domainTrainingType;
        this.label = str4;
        this.number = num;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTrainingId() {
        return this.trainingId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSquareImageUrl() {
        return this.squareImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DomainDifficulty getDifficulty() {
        return this.difficulty;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCourseCount() {
        return this.courseCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCalorie() {
        return this.calorie;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DomainTrainingType getTrainingType() {
        return this.trainingType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final TrainingVo copy(@Nullable Long trainingId, @NotNull String image, @Nullable String squareImageUrl, @NotNull String name, @Nullable DomainDifficulty difficulty, int courseCount, long calorie, @NotNull DomainTrainingType trainingType, @Nullable String label, @Nullable Integer number) {
        return new TrainingVo(trainingId, image, squareImageUrl, name, difficulty, courseCount, calorie, trainingType, label, number);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingVo)) {
            return false;
        }
        TrainingVo trainingVo = (TrainingVo) other;
        return Intrinsics.areEqual(this.trainingId, trainingVo.trainingId) && Intrinsics.areEqual(this.image, trainingVo.image) && Intrinsics.areEqual(this.squareImageUrl, trainingVo.squareImageUrl) && Intrinsics.areEqual(this.name, trainingVo.name) && this.difficulty == trainingVo.difficulty && this.courseCount == trainingVo.courseCount && this.calorie == trainingVo.calorie && this.trainingType == trainingVo.trainingType && Intrinsics.areEqual(this.label, trainingVo.label) && Intrinsics.areEqual(this.number, trainingVo.number);
    }

    public final long getCalorie() {
        return this.calorie;
    }

    public final int getCourseCount() {
        return this.courseCount;
    }

    @Nullable
    public final DomainDifficulty getDifficulty() {
        return this.difficulty;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    public final String getSquareImageUrl() {
        return this.squareImageUrl;
    }

    @Nullable
    public final Long getTrainingId() {
        return this.trainingId;
    }

    @NotNull
    public final DomainTrainingType getTrainingType() {
        return this.trainingType;
    }

    public int hashCode() {
        Long l = this.trainingId;
        int iHashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.image.hashCode()) * 31;
        String str = this.squareImageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        DomainDifficulty domainDifficulty = this.difficulty;
        int iHashCode3 = (((((((iHashCode2 + (domainDifficulty == null ? 0 : domainDifficulty.hashCode())) * 31) + this.courseCount) * 31) + b.a(this.calorie)) * 31) + this.trainingType.hashCode()) * 31;
        String str2 = this.label;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.number;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrainingVo(trainingId=" + this.trainingId + ", image=" + this.image + ", squareImageUrl=" + ((Object) this.squareImageUrl) + ", name=" + this.name + ", difficulty=" + this.difficulty + ", courseCount=" + this.courseCount + ", calorie=" + this.calorie + ", trainingType=" + this.trainingType + ", label=" + ((Object) this.label) + ", number=" + this.number + ')';
    }
}
