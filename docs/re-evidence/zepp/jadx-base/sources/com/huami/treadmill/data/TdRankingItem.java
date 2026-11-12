package com.huami.treadmill.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003JA\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\r\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/treadmill/data/TdRankingItem;", "", "", "component1", "component2", "", "component3", "component4", "component5", "userId", "nickName", "value", "icon", WatchFaceDetailActivity.FROM_RANK, "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getNickName", LogUtil.I, "getValue", "()I", "getIcon", "getRank", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdRankingItem {

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("nickName")
    @Nullable
    private final String nickName;

    @SerializedName(WatchFaceDetailActivity.FROM_RANK)
    private final int rank;

    @SerializedName("userId")
    @Nullable
    private final String userId;

    @SerializedName("value")
    private final int value;

    public TdRankingItem() {
        this(null, null, 0, null, 0, 31, null);
    }

    public TdRankingItem(@Nullable String str, @Nullable String str2, int i, @Nullable String str3, int i2) {
        this.userId = str;
        this.nickName = str2;
        this.value = i;
        this.icon = str3;
        this.rank = i2;
    }

    public static /* synthetic */ TdRankingItem copy$default(TdRankingItem tdRankingItem, String str, String str2, int i, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tdRankingItem.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = tdRankingItem.nickName;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = tdRankingItem.value;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str3 = tdRankingItem.icon;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = tdRankingItem.rank;
        }
        return tdRankingItem.copy(str, str4, i4, str5, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final TdRankingItem copy(@Nullable String userId, @Nullable String nickName, int value, @Nullable String icon, int rank) {
        return new TdRankingItem(userId, nickName, value, icon, rank);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdRankingItem)) {
            return false;
        }
        TdRankingItem tdRankingItem = (TdRankingItem) other;
        return Intrinsics.areEqual(this.userId, tdRankingItem.userId) && Intrinsics.areEqual(this.nickName, tdRankingItem.nickName) && this.value == tdRankingItem.value && Intrinsics.areEqual(this.icon, tdRankingItem.icon) && this.rank == tdRankingItem.rank;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final int getRank() {
        return this.rank;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickName;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.value) * 31;
        String str3 = this.icon;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.rank;
    }

    @NotNull
    public String toString() {
        return "TdRankingItem(userId=" + ((Object) this.userId) + ", nickName=" + ((Object) this.nickName) + ", value=" + this.value + ", icon=" + ((Object) this.icon) + ", rank=" + this.rank + ')';
    }

    public /* synthetic */ TdRankingItem(String str, String str2, int i, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? str3 : null, (i3 & 16) != 0 ? 0 : i2);
    }
}
