package com.xiaomi.hm.health.device.settings.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.ui.activity.SportItemSortActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportTypeDisplayItem;", "", "", "component1", "", "component2", "type", SportItemSortActivity.KEY_SPORT_NAME, "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "b", "Ljava/lang/String;", "getSportName", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportTypeDisplayItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sportName;

    public SportTypeDisplayItem(int i, @NotNull String str) {
        this.type = i;
        this.sportName = str;
    }

    public static /* synthetic */ SportTypeDisplayItem copy$default(SportTypeDisplayItem sportTypeDisplayItem, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportTypeDisplayItem.type;
        }
        if ((i2 & 2) != 0) {
            str = sportTypeDisplayItem.sportName;
        }
        return sportTypeDisplayItem.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    @NotNull
    public final SportTypeDisplayItem copy(int type, @NotNull String sportName) {
        return new SportTypeDisplayItem(type, sportName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportTypeDisplayItem)) {
            return false;
        }
        SportTypeDisplayItem sportTypeDisplayItem = (SportTypeDisplayItem) other;
        return this.type == sportTypeDisplayItem.type && Intrinsics.areEqual(this.sportName, sportTypeDisplayItem.sportName);
    }

    @NotNull
    public final String getSportName() {
        return this.sportName;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.sportName.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportTypeDisplayItem(type=" + this.type + ", sportName=" + this.sportName + ")";
    }
}
