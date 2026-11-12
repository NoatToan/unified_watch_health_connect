package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.TrainingType;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\bC\u0010DJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u0090\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\fHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R!\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u000eR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u000eR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010\u000eR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/R!\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u00103¨\u0006E"}, d2 = {"Lcom/huami/training/db/po/Training;", "", "", "component1", "Lcom/huami/training/dto/TrainingType;", "component2", "", "component3", "Lcom/huami/training/dto/GenderPair;", "component4", "Lcom/huami/training/dto/Difficulty;", "component5", "", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "id", "type", "name", "listImage", "difficulty", "consumption", "participants", "contentCount", "label", "squareImage", "copy", "(JLcom/huami/training/dto/TrainingType;Ljava/lang/String;Lcom/huami/training/dto/GenderPair;Lcom/huami/training/dto/Difficulty;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/huami/training/dto/GenderPair;)Lcom/huami/training/db/po/Training;", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "Lcom/huami/training/dto/TrainingType;", "getType", "()Lcom/huami/training/dto/TrainingType;", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/dto/GenderPair;", "getListImage", "()Lcom/huami/training/dto/GenderPair;", "e", "Lcom/huami/training/dto/Difficulty;", "getDifficulty", "()Lcom/huami/training/dto/Difficulty;", "f", "Ljava/lang/Integer;", "getConsumption", "g", "getParticipants", "h", "getContentCount", "i", "getLabel", z.j, "getSquareImage", "<init>", "(JLcom/huami/training/dto/TrainingType;Ljava/lang/String;Lcom/huami/training/dto/GenderPair;Lcom/huami/training/dto/Difficulty;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/huami/training/dto/GenderPair;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Training {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final TrainingType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final GenderPair<String> listImage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Difficulty difficulty;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer consumption;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer participants;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer contentCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String label;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final GenderPair<String> squareImage;

    public Training(long j, @NotNull TrainingType trainingType, @Nullable String str, @Nullable GenderPair<String> genderPair, @Nullable Difficulty difficulty, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable GenderPair<String> genderPair2) {
        this.id = j;
        this.type = trainingType;
        this.name = str;
        this.listImage = genderPair;
        this.difficulty = difficulty;
        this.consumption = num;
        this.participants = num2;
        this.contentCount = num3;
        this.label = str2;
        this.squareImage = genderPair2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    public final GenderPair<String> component10() {
        return this.squareImage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrainingType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final GenderPair<String> component4() {
        return this.listImage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getConsumption() {
        return this.consumption;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getParticipants() {
        return this.participants;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getContentCount() {
        return this.contentCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final Training copy(long id, @NotNull TrainingType type, @Nullable String name, @Nullable GenderPair<String> listImage, @Nullable Difficulty difficulty, @Nullable Integer consumption, @Nullable Integer participants, @Nullable Integer contentCount, @Nullable String label, @Nullable GenderPair<String> squareImage) {
        return new Training(id, type, name, listImage, difficulty, consumption, participants, contentCount, label, squareImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Training)) {
            return false;
        }
        Training training = (Training) other;
        return this.id == training.id && this.type == training.type && Intrinsics.areEqual(this.name, training.name) && Intrinsics.areEqual(this.listImage, training.listImage) && this.difficulty == training.difficulty && Intrinsics.areEqual(this.consumption, training.consumption) && Intrinsics.areEqual(this.participants, training.participants) && Intrinsics.areEqual(this.contentCount, training.contentCount) && Intrinsics.areEqual(this.label, training.label) && Intrinsics.areEqual(this.squareImage, training.squareImage);
    }

    @Nullable
    public final Integer getConsumption() {
        return this.consumption;
    }

    @Nullable
    public final Integer getContentCount() {
        return this.contentCount;
    }

    @Nullable
    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final GenderPair<String> getListImage() {
        return this.listImage;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getParticipants() {
        return this.participants;
    }

    @Nullable
    public final GenderPair<String> getSquareImage() {
        return this.squareImage;
    }

    @NotNull
    public final TrainingType getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + this.type.hashCode()) * 31;
        String str = this.name;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        GenderPair<String> genderPair = this.listImage;
        int iHashCode2 = (iHashCode + (genderPair == null ? 0 : genderPair.hashCode())) * 31;
        Difficulty difficulty = this.difficulty;
        int iHashCode3 = (iHashCode2 + (difficulty == null ? 0 : difficulty.hashCode())) * 31;
        Integer num = this.consumption;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.participants;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.contentCount;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GenderPair<String> genderPair2 = this.squareImage;
        return iHashCode7 + (genderPair2 != null ? genderPair2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Training(id=" + this.id + ", type=" + this.type + ", name=" + ((Object) this.name) + ", listImage=" + this.listImage + ", difficulty=" + this.difficulty + ", consumption=" + this.consumption + ", participants=" + this.participants + ", contentCount=" + this.contentCount + ", label=" + ((Object) this.label) + ", squareImage=" + this.squareImage + ')';
    }

    public /* synthetic */ Training(long j, TrainingType trainingType, String str, GenderPair genderPair, Difficulty difficulty, Integer num, Integer num2, Integer num3, String str2, GenderPair genderPair2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, trainingType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : genderPair, (i & 16) != 0 ? null : difficulty, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : genderPair2);
    }
}
