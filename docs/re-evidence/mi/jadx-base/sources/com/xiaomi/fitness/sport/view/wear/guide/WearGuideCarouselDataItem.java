package com.xiaomi.fitness.sport.view.wear.guide;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselDataItem;", "", "animatedGifUrl", "", "placeholderResId", "", "instructionResId", "<init>", "(Ljava/lang/String;II)V", "getAnimatedGifUrl", "()Ljava/lang/String;", "getPlaceholderResId", "()I", "getInstructionResId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WearGuideCarouselDataItem {

    @NotNull
    private final String animatedGifUrl;
    private final int instructionResId;
    private final int placeholderResId;

    public WearGuideCarouselDataItem(@NotNull String animatedGifUrl, int i, int i2) {
        Intrinsics.checkNotNullParameter(animatedGifUrl, "animatedGifUrl");
        this.animatedGifUrl = animatedGifUrl;
        this.placeholderResId = i;
        this.instructionResId = i2;
    }

    public static /* synthetic */ WearGuideCarouselDataItem copy$default(WearGuideCarouselDataItem wearGuideCarouselDataItem, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = wearGuideCarouselDataItem.animatedGifUrl;
        }
        if ((i3 & 2) != 0) {
            i = wearGuideCarouselDataItem.placeholderResId;
        }
        if ((i3 & 4) != 0) {
            i2 = wearGuideCarouselDataItem.instructionResId;
        }
        return wearGuideCarouselDataItem.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnimatedGifUrl() {
        return this.animatedGifUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlaceholderResId() {
        return this.placeholderResId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInstructionResId() {
        return this.instructionResId;
    }

    @NotNull
    public final WearGuideCarouselDataItem copy(@NotNull String animatedGifUrl, int placeholderResId, int instructionResId) {
        Intrinsics.checkNotNullParameter(animatedGifUrl, "animatedGifUrl");
        return new WearGuideCarouselDataItem(animatedGifUrl, placeholderResId, instructionResId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WearGuideCarouselDataItem)) {
            return false;
        }
        WearGuideCarouselDataItem wearGuideCarouselDataItem = (WearGuideCarouselDataItem) other;
        return Intrinsics.areEqual(this.animatedGifUrl, wearGuideCarouselDataItem.animatedGifUrl) && this.placeholderResId == wearGuideCarouselDataItem.placeholderResId && this.instructionResId == wearGuideCarouselDataItem.instructionResId;
    }

    @NotNull
    public final String getAnimatedGifUrl() {
        return this.animatedGifUrl;
    }

    public final int getInstructionResId() {
        return this.instructionResId;
    }

    public final int getPlaceholderResId() {
        return this.placeholderResId;
    }

    public int hashCode() {
        return (((this.animatedGifUrl.hashCode() * 31) + Integer.hashCode(this.placeholderResId)) * 31) + Integer.hashCode(this.instructionResId);
    }

    @NotNull
    public String toString() {
        return "WearGuideCarouselDataItem(animatedGifUrl=" + this.animatedGifUrl + ", placeholderResId=" + this.placeholderResId + ", instructionResId=" + this.instructionResId + ")";
    }
}
