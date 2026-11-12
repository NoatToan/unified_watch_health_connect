package com.xiaomi.fitness.health.sleep.ui.setting.baseui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepDetectionGuideCarouselItem;", "", "title", "", "description", "drawableId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getDrawableId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepDetectionGuideCarouselItem {

    @NotNull
    private final String description;
    private final int drawableId;

    @NotNull
    private final String title;

    public SleepDetectionGuideCarouselItem(@NotNull String title, @NotNull String description, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.description = description;
        this.drawableId = i;
    }

    public static /* synthetic */ SleepDetectionGuideCarouselItem copy$default(SleepDetectionGuideCarouselItem sleepDetectionGuideCarouselItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sleepDetectionGuideCarouselItem.title;
        }
        if ((i2 & 2) != 0) {
            str2 = sleepDetectionGuideCarouselItem.description;
        }
        if ((i2 & 4) != 0) {
            i = sleepDetectionGuideCarouselItem.drawableId;
        }
        return sleepDetectionGuideCarouselItem.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    @NotNull
    public final SleepDetectionGuideCarouselItem copy(@NotNull String title, @NotNull String description, int drawableId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new SleepDetectionGuideCarouselItem(title, description, drawableId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDetectionGuideCarouselItem)) {
            return false;
        }
        SleepDetectionGuideCarouselItem sleepDetectionGuideCarouselItem = (SleepDetectionGuideCarouselItem) other;
        return Intrinsics.areEqual(this.title, sleepDetectionGuideCarouselItem.title) && Intrinsics.areEqual(this.description, sleepDetectionGuideCarouselItem.description) && this.drawableId == sleepDetectionGuideCarouselItem.drawableId;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getDrawableId() {
        return this.drawableId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.drawableId);
    }

    @NotNull
    public String toString() {
        return "SleepDetectionGuideCarouselItem(title=" + this.title + ", description=" + this.description + ", drawableId=" + this.drawableId + ")";
    }
}
