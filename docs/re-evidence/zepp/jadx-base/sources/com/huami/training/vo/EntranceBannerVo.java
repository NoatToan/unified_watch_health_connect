package com.huami.training.vo;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.TrainingType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003JR\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\tR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/huami/training/vo/EntranceBannerVo;", "", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Long;", "Lcom/huami/training/dto/TrainingType;", "component6", "title", MessengerShareContentUtility.SUBTITLE, "imageUrl", "targetUrl", "trainingId", "trainingType", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/huami/training/dto/TrainingType;)Lcom/huami/training/vo/EntranceBannerVo;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getSubtitle", "c", "getImageUrl", GoogleApiAvailabilityLight.a, "getTargetUrl", "e", "Ljava/lang/Long;", "getTrainingId", "f", "Lcom/huami/training/dto/TrainingType;", "getTrainingType", "()Lcom/huami/training/dto/TrainingType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/huami/training/dto/TrainingType;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EntranceBannerVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String targetUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long trainingId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final TrainingType trainingType;

    public EntranceBannerVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable Long l, @Nullable TrainingType trainingType) {
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
        this.targetUrl = str4;
        this.trainingId = l;
        this.trainingType = trainingType;
    }

    public static /* synthetic */ EntranceBannerVo copy$default(EntranceBannerVo entranceBannerVo, String str, String str2, String str3, String str4, Long l, TrainingType trainingType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entranceBannerVo.title;
        }
        if ((i & 2) != 0) {
            str2 = entranceBannerVo.subtitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = entranceBannerVo.imageUrl;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = entranceBannerVo.targetUrl;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            l = entranceBannerVo.trainingId;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            trainingType = entranceBannerVo.trainingType;
        }
        return entranceBannerVo.copy(str, str5, str6, str7, l2, trainingType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTrainingId() {
        return this.trainingId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    @NotNull
    public final EntranceBannerVo copy(@NotNull String title, @NotNull String subtitle, @NotNull String imageUrl, @Nullable String targetUrl, @Nullable Long trainingId, @Nullable TrainingType trainingType) {
        return new EntranceBannerVo(title, subtitle, imageUrl, targetUrl, trainingId, trainingType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntranceBannerVo)) {
            return false;
        }
        EntranceBannerVo entranceBannerVo = (EntranceBannerVo) other;
        return Intrinsics.areEqual(this.title, entranceBannerVo.title) && Intrinsics.areEqual(this.subtitle, entranceBannerVo.subtitle) && Intrinsics.areEqual(this.imageUrl, entranceBannerVo.imageUrl) && Intrinsics.areEqual(this.targetUrl, entranceBannerVo.targetUrl) && Intrinsics.areEqual(this.trainingId, entranceBannerVo.trainingId) && this.trainingType == entranceBannerVo.trainingType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @NotNull
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
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        String str = this.targetUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.trainingId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        TrainingType trainingType = this.trainingType;
        return iHashCode3 + (trainingType != null ? trainingType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EntranceBannerVo(title=" + this.title + ", subtitle=" + this.subtitle + ", imageUrl=" + this.imageUrl + ", targetUrl=" + ((Object) this.targetUrl) + ", trainingId=" + this.trainingId + ", trainingType=" + this.trainingType + ')';
    }
}
