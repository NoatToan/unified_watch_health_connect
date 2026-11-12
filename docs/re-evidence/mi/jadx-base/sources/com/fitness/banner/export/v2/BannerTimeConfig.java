package com.fitness.banner.export.v2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/fitness/banner/export/v2/BannerTimeConfig;", "", "clickTimeInSecond", "", "closeTimeInSecond", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getClickTimeInSecond", "()Ljava/lang/Long;", "setClickTimeInSecond", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCloseTimeInSecond", "setCloseTimeInSecond", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/fitness/banner/export/v2/BannerTimeConfig;", "equals", "", "other", "hashCode", "", "toString", "", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerTimeConfig {

    @Nullable
    private Long clickTimeInSecond;

    @Nullable
    private Long closeTimeInSecond;

    /* JADX WARN: Multi-variable type inference failed */
    public BannerTimeConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BannerTimeConfig copy$default(BannerTimeConfig bannerTimeConfig, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = bannerTimeConfig.clickTimeInSecond;
        }
        if ((i & 2) != 0) {
            l2 = bannerTimeConfig.closeTimeInSecond;
        }
        return bannerTimeConfig.copy(l, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getClickTimeInSecond() {
        return this.clickTimeInSecond;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCloseTimeInSecond() {
        return this.closeTimeInSecond;
    }

    @NotNull
    public final BannerTimeConfig copy(@Nullable Long clickTimeInSecond, @Nullable Long closeTimeInSecond) {
        return new BannerTimeConfig(clickTimeInSecond, closeTimeInSecond);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerTimeConfig)) {
            return false;
        }
        BannerTimeConfig bannerTimeConfig = (BannerTimeConfig) other;
        return Intrinsics.areEqual(this.clickTimeInSecond, bannerTimeConfig.clickTimeInSecond) && Intrinsics.areEqual(this.closeTimeInSecond, bannerTimeConfig.closeTimeInSecond);
    }

    @Nullable
    public final Long getClickTimeInSecond() {
        return this.clickTimeInSecond;
    }

    @Nullable
    public final Long getCloseTimeInSecond() {
        return this.closeTimeInSecond;
    }

    public int hashCode() {
        Long l = this.clickTimeInSecond;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.closeTimeInSecond;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final void setClickTimeInSecond(@Nullable Long l) {
        this.clickTimeInSecond = l;
    }

    public final void setCloseTimeInSecond(@Nullable Long l) {
        this.closeTimeInSecond = l;
    }

    @NotNull
    public String toString() {
        return "BannerTimeConfig(clickTimeInSecond=" + this.clickTimeInSecond + ", closeTimeInSecond=" + this.closeTimeInSecond + ")";
    }

    public BannerTimeConfig(@Nullable Long l, @Nullable Long l2) {
        this.clickTimeInSecond = l;
        this.closeTimeInSecond = l2;
    }

    public /* synthetic */ BannerTimeConfig(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
