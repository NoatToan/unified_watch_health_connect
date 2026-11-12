package com.huami.sky.lib.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/sky/lib/entity/SkyPromotionExtensions;", "", "Lcom/huami/sky/lib/entity/AssetInfo;", "component1", "assets", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/sky/lib/entity/AssetInfo;", "getAssets", "()Lcom/huami/sky/lib/entity/AssetInfo;", "<init>", "(Lcom/huami/sky/lib/entity/AssetInfo;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SkyPromotionExtensions {

    @Nullable
    private final AssetInfo assets;

    public SkyPromotionExtensions(@Nullable AssetInfo assetInfo) {
        this.assets = assetInfo;
    }

    public static /* synthetic */ SkyPromotionExtensions copy$default(SkyPromotionExtensions skyPromotionExtensions, AssetInfo assetInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            assetInfo = skyPromotionExtensions.assets;
        }
        return skyPromotionExtensions.copy(assetInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AssetInfo getAssets() {
        return this.assets;
    }

    @NotNull
    public final SkyPromotionExtensions copy(@Nullable AssetInfo assets) {
        return new SkyPromotionExtensions(assets);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SkyPromotionExtensions) && Intrinsics.areEqual(this.assets, ((SkyPromotionExtensions) other).assets);
    }

    @Nullable
    public final AssetInfo getAssets() {
        return this.assets;
    }

    public int hashCode() {
        AssetInfo assetInfo = this.assets;
        if (assetInfo == null) {
            return 0;
        }
        return assetInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkyPromotionExtensions(assets=" + this.assets + ")";
    }
}
