package com.huami.training.vo;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.DisplayMode;
import com.huami.training.dto.TargetMode;
import com.huami.training.dto.TrainingType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b=\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010Jz\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u0010¨\u0006?"}, d2 = {"Lcom/huami/training/vo/EntranceSubjectVo;", "", "", "component1", "component2", "component3", "component4", "component5", "Lcom/huami/training/dto/TargetMode;", "component6", "Lcom/huami/training/dto/DisplayMode;", "component7", "Lcom/huami/training/dto/TrainingType;", "component8", "", "component9", "()Ljava/lang/Long;", "id", "title", MessengerShareContentUtility.SUBTITLE, "imageUrl", "targetUrl", "targetMode", "displayMode", "trainingType", "trainingId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/dto/TargetMode;Lcom/huami/training/dto/DisplayMode;Lcom/huami/training/dto/TrainingType;Ljava/lang/Long;)Lcom/huami/training/vo/EntranceSubjectVo;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getTitle", "c", "getSubtitle", GoogleApiAvailabilityLight.a, "getImageUrl", "e", "getTargetUrl", "f", "Lcom/huami/training/dto/TargetMode;", "getTargetMode", "()Lcom/huami/training/dto/TargetMode;", "g", "Lcom/huami/training/dto/DisplayMode;", "getDisplayMode", "()Lcom/huami/training/dto/DisplayMode;", "h", "Lcom/huami/training/dto/TrainingType;", "getTrainingType", "()Lcom/huami/training/dto/TrainingType;", "i", "Ljava/lang/Long;", "getTrainingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/dto/TargetMode;Lcom/huami/training/dto/DisplayMode;Lcom/huami/training/dto/TrainingType;Ljava/lang/Long;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EntranceSubjectVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String imageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String targetUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final TargetMode targetMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final DisplayMode displayMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final TrainingType trainingType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long trainingId;

    public EntranceSubjectVo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable TargetMode targetMode, @Nullable DisplayMode displayMode, @Nullable TrainingType trainingType, @Nullable Long l) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.imageUrl = str4;
        this.targetUrl = str5;
        this.targetMode = targetMode;
        this.displayMode = displayMode;
        this.trainingType = trainingType;
        this.trainingId = l;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TargetMode getTargetMode() {
        return this.targetMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getTrainingId() {
        return this.trainingId;
    }

    @NotNull
    public final EntranceSubjectVo copy(@NotNull String id, @Nullable String title, @Nullable String subtitle, @Nullable String imageUrl, @Nullable String targetUrl, @Nullable TargetMode targetMode, @Nullable DisplayMode displayMode, @Nullable TrainingType trainingType, @Nullable Long trainingId) {
        return new EntranceSubjectVo(id, title, subtitle, imageUrl, targetUrl, targetMode, displayMode, trainingType, trainingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntranceSubjectVo)) {
            return false;
        }
        EntranceSubjectVo entranceSubjectVo = (EntranceSubjectVo) other;
        return Intrinsics.areEqual(this.id, entranceSubjectVo.id) && Intrinsics.areEqual(this.title, entranceSubjectVo.title) && Intrinsics.areEqual(this.subtitle, entranceSubjectVo.subtitle) && Intrinsics.areEqual(this.imageUrl, entranceSubjectVo.imageUrl) && Intrinsics.areEqual(this.targetUrl, entranceSubjectVo.targetUrl) && this.targetMode == entranceSubjectVo.targetMode && this.displayMode == entranceSubjectVo.displayMode && this.trainingType == entranceSubjectVo.trainingType && Intrinsics.areEqual(this.trainingId, entranceSubjectVo.trainingId);
    }

    @Nullable
    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final TargetMode getTargetMode() {
        return this.targetMode;
    }

    @Nullable
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Long getTrainingId() {
        return this.trainingId;
    }

    @Nullable
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TargetMode targetMode = this.targetMode;
        int iHashCode6 = (iHashCode5 + (targetMode == null ? 0 : targetMode.hashCode())) * 31;
        DisplayMode displayMode = this.displayMode;
        int iHashCode7 = (iHashCode6 + (displayMode == null ? 0 : displayMode.hashCode())) * 31;
        TrainingType trainingType = this.trainingType;
        int iHashCode8 = (iHashCode7 + (trainingType == null ? 0 : trainingType.hashCode())) * 31;
        Long l = this.trainingId;
        return iHashCode8 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EntranceSubjectVo(id=" + this.id + ", title=" + ((Object) this.title) + ", subtitle=" + ((Object) this.subtitle) + ", imageUrl=" + ((Object) this.imageUrl) + ", targetUrl=" + ((Object) this.targetUrl) + ", targetMode=" + this.targetMode + ", displayMode=" + this.displayMode + ", trainingType=" + this.trainingType + ", trainingId=" + this.trainingId + ')';
    }
}
