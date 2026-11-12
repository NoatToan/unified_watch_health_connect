package com.fitness.banner.export;

import com.example.statistics.export.OneTrackExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/fitness/banner/export/BannerRequestParam;", "", OneTrackExtKt.KEY_BUSINESS, "", "group", "", "limit", "<init>", "(Ljava/lang/String;II)V", "getBusiness", "()Ljava/lang/String;", "getGroup", "()I", "getLimit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerRequestParam {

    @NotNull
    private final String business;
    private final int group;
    private final int limit;

    public BannerRequestParam(@NotNull String business, int i, int i2) {
        Intrinsics.checkNotNullParameter(business, "business");
        this.business = business;
        this.group = i;
        this.limit = i2;
    }

    public static /* synthetic */ BannerRequestParam copy$default(BannerRequestParam bannerRequestParam, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bannerRequestParam.business;
        }
        if ((i3 & 2) != 0) {
            i = bannerRequestParam.group;
        }
        if ((i3 & 4) != 0) {
            i2 = bannerRequestParam.limit;
        }
        return bannerRequestParam.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBusiness() {
        return this.business;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final BannerRequestParam copy(@NotNull String business, int group, int limit) {
        Intrinsics.checkNotNullParameter(business, "business");
        return new BannerRequestParam(business, group, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerRequestParam)) {
            return false;
        }
        BannerRequestParam bannerRequestParam = (BannerRequestParam) other;
        return Intrinsics.areEqual(this.business, bannerRequestParam.business) && this.group == bannerRequestParam.group && this.limit == bannerRequestParam.limit;
    }

    @NotNull
    public final String getBusiness() {
        return this.business;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return (((this.business.hashCode() * 31) + Integer.hashCode(this.group)) * 31) + Integer.hashCode(this.limit);
    }

    @NotNull
    public String toString() {
        return "BannerRequestParam(business=" + this.business + ", group=" + this.group + ", limit=" + this.limit + ")";
    }

    public /* synthetic */ BannerRequestParam(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 2 : i2);
    }
}
