package com.huami.training.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.TrainingType;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003Js\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0015\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0016\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\u0017\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0019\u0010\u0018\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(¨\u0006A"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "", "", "component1", "", "component2", "component3", "Lcom/huami/training/dto/Difficulty;", "component4", "", "component5", "component6", "component7", "Lcom/huami/training/dto/TrainingType;", "component8", "component9", "component10", "id", "image", "name", "difficulty", "courseCount", "calorie", "participants", "trainingType", "label", "squareImageUrl", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "c", "getName", GoogleApiAvailabilityLight.a, "Lcom/huami/training/dto/Difficulty;", "getDifficulty", "()Lcom/huami/training/dto/Difficulty;", "e", LogUtil.I, "getCourseCount", "()I", "f", "getCalorie", "g", "getParticipants", "h", "Lcom/huami/training/dto/TrainingType;", "getTrainingType", "()Lcom/huami/training/dto/TrainingType;", "i", "getLabel", z.j, "getSquareImageUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/huami/training/dto/Difficulty;IIILcom/huami/training/dto/TrainingType;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TrainingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Difficulty difficulty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int courseCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int calorie;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int participants;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final TrainingType trainingType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String label;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String squareImageUrl;

    public TrainingVo(long j, @NotNull String str, @NotNull String str2, @Nullable Difficulty difficulty, int i, int i2, int i3, @NotNull TrainingType trainingType, @Nullable String str3, @Nullable String str4) {
        this.id = j;
        this.image = str;
        this.name = str2;
        this.difficulty = difficulty;
        this.courseCount = i;
        this.calorie = i2;
        this.participants = i3;
        this.trainingType = trainingType;
        this.label = str3;
        this.squareImageUrl = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSquareImageUrl() {
        return this.squareImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCourseCount() {
        return this.courseCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getParticipants() {
        return this.participants;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final TrainingVo copy(long id, @NotNull String image, @NotNull String name, @Nullable Difficulty difficulty, int courseCount, int calorie, int participants, @NotNull TrainingType trainingType, @Nullable String label, @Nullable String squareImageUrl) {
        return new TrainingVo(id, image, name, difficulty, courseCount, calorie, participants, trainingType, label, squareImageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingVo)) {
            return false;
        }
        TrainingVo trainingVo = (TrainingVo) other;
        return this.id == trainingVo.id && Intrinsics.areEqual(this.image, trainingVo.image) && Intrinsics.areEqual(this.name, trainingVo.name) && this.difficulty == trainingVo.difficulty && this.courseCount == trainingVo.courseCount && this.calorie == trainingVo.calorie && this.participants == trainingVo.participants && this.trainingType == trainingVo.trainingType && Intrinsics.areEqual(this.label, trainingVo.label) && Intrinsics.areEqual(this.squareImageUrl, trainingVo.squareImageUrl);
    }

    public final int getCalorie() {
        return this.calorie;
    }

    public final int getCourseCount() {
        return this.courseCount;
    }

    @Nullable
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    public final long getId() {
        return this.id;
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

    public final int getParticipants() {
        return this.participants;
    }

    @Nullable
    public final String getSquareImageUrl() {
        return this.squareImageUrl;
    }

    @NotNull
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    public int hashCode() {
        int iA = ((((b.a(this.id) * 31) + this.image.hashCode()) * 31) + this.name.hashCode()) * 31;
        Difficulty difficulty = this.difficulty;
        int iHashCode = (((((((((iA + (difficulty == null ? 0 : difficulty.hashCode())) * 31) + this.courseCount) * 31) + this.calorie) * 31) + this.participants) * 31) + this.trainingType.hashCode()) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.squareImageUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrainingVo(id=" + this.id + ", image=" + this.image + ", name=" + this.name + ", difficulty=" + this.difficulty + ", courseCount=" + this.courseCount + ", calorie=" + this.calorie + ", participants=" + this.participants + ", trainingType=" + this.trainingType + ", label=" + ((Object) this.label) + ", squareImageUrl=" + ((Object) this.squareImageUrl) + ')';
    }
}
