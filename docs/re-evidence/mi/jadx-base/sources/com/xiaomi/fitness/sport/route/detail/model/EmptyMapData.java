package com.xiaomi.fitness.sport.route.detail.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0005H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/EmptyMapData;", "", "strategyId", "", "name", "", "pixelData", "icon", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStrategyId", "()I", "getName", "()Ljava/lang/String;", "getPixelData", "getIcon", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EmptyMapData {

    @NotNull
    private final String icon;

    @NotNull
    private final String name;

    @NotNull
    private final String pixelData;
    private final int strategyId;

    public EmptyMapData(int i, @NotNull String name, @NotNull String pixelData, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pixelData, "pixelData");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.strategyId = i;
        this.name = name;
        this.pixelData = pixelData;
        this.icon = icon;
    }

    public static /* synthetic */ EmptyMapData copy$default(EmptyMapData emptyMapData, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = emptyMapData.strategyId;
        }
        if ((i2 & 2) != 0) {
            str = emptyMapData.name;
        }
        if ((i2 & 4) != 0) {
            str2 = emptyMapData.pixelData;
        }
        if ((i2 & 8) != 0) {
            str3 = emptyMapData.icon;
        }
        return emptyMapData.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStrategyId() {
        return this.strategyId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPixelData() {
        return this.pixelData;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final EmptyMapData copy(int strategyId, @NotNull String name, @NotNull String pixelData, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pixelData, "pixelData");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new EmptyMapData(strategyId, name, pixelData, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyMapData)) {
            return false;
        }
        EmptyMapData emptyMapData = (EmptyMapData) other;
        return this.strategyId == emptyMapData.strategyId && Intrinsics.areEqual(this.name, emptyMapData.name) && Intrinsics.areEqual(this.pixelData, emptyMapData.pixelData) && Intrinsics.areEqual(this.icon, emptyMapData.icon);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPixelData() {
        return this.pixelData;
    }

    public final int getStrategyId() {
        return this.strategyId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.strategyId) * 31) + this.name.hashCode()) * 31) + this.pixelData.hashCode()) * 31) + this.icon.hashCode();
    }

    @NotNull
    public String toString() {
        return "{strategyId:" + this.strategyId + ",name:" + this.name + ",pixelData:" + this.pixelData + ",icon:" + this.icon + "}";
    }
}
