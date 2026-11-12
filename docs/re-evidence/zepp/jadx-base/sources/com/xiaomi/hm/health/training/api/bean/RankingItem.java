package com.xiaomi.hm.health.training.api.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/training/api/bean/RankingItem;", "", "", "component1", "component2", "", "component3", "component4", "component5", "userId", "nickname", "value", "icon", "rankNum", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getNickname", "c", LogUtil.I, "getValue", "()I", GoogleApiAvailabilityLight.a, "getIcon", "e", "getRankNum", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "training-cloud-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RankingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String nickname;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int rankNum;

    public RankingItem(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        this.userId = str;
        this.nickname = str2;
        this.value = i;
        this.icon = str3;
        this.rankNum = i2;
    }

    public static /* synthetic */ RankingItem copy$default(RankingItem rankingItem, String str, String str2, int i, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rankingItem.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = rankingItem.nickname;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = rankingItem.value;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str3 = rankingItem.icon;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = rankingItem.rankNum;
        }
        return rankingItem.copy(str, str4, i4, str5, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRankNum() {
        return this.rankNum;
    }

    @NotNull
    public final RankingItem copy(@NotNull String userId, @NotNull String nickname, int value, @NotNull String icon, int rankNum) {
        return new RankingItem(userId, nickname, value, icon, rankNum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingItem)) {
            return false;
        }
        RankingItem rankingItem = (RankingItem) other;
        return Intrinsics.areEqual(this.userId, rankingItem.userId) && Intrinsics.areEqual(this.nickname, rankingItem.nickname) && this.value == rankingItem.value && Intrinsics.areEqual(this.icon, rankingItem.icon) && this.rankNum == rankingItem.rankNum;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getRankNum() {
        return this.rankNum;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.value) * 31) + this.icon.hashCode()) * 31) + this.rankNum;
    }

    @NotNull
    public String toString() {
        return "RankingItem(userId=" + this.userId + ", nickname=" + this.nickname + ", value=" + this.value + ", icon=" + this.icon + ", rankNum=" + this.rankNum + ')';
    }
}
