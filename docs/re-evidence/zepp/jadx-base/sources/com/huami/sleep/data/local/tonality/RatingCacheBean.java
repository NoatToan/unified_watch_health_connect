package com.huami.sleep.data.local.tonality;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity(primaryKeys = {"uid", "cache_day"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/sleep/data/local/tonality/RatingCacheBean;", "", "", "component1", "component2", "", "component3", "userId", "cacheDay", "ratingScore", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getCacheDay", "c", LogUtil.I, "getRatingScore", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RatingCacheBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "uid")
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "cache_day")
    @NotNull
    private final String cacheDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "rating_score")
    private final int ratingScore;

    public RatingCacheBean(@NotNull String str, @NotNull String str2, int i) {
        this.userId = str;
        this.cacheDay = str2;
        this.ratingScore = i;
    }

    public static /* synthetic */ RatingCacheBean copy$default(RatingCacheBean ratingCacheBean, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ratingCacheBean.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = ratingCacheBean.cacheDay;
        }
        if ((i2 & 4) != 0) {
            i = ratingCacheBean.ratingScore;
        }
        return ratingCacheBean.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCacheDay() {
        return this.cacheDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRatingScore() {
        return this.ratingScore;
    }

    @NotNull
    public final RatingCacheBean copy(@NotNull String userId, @NotNull String cacheDay, int ratingScore) {
        return new RatingCacheBean(userId, cacheDay, ratingScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingCacheBean)) {
            return false;
        }
        RatingCacheBean ratingCacheBean = (RatingCacheBean) other;
        return Intrinsics.areEqual(this.userId, ratingCacheBean.userId) && Intrinsics.areEqual(this.cacheDay, ratingCacheBean.cacheDay) && this.ratingScore == ratingCacheBean.ratingScore;
    }

    @NotNull
    public final String getCacheDay() {
        return this.cacheDay;
    }

    public final int getRatingScore() {
        return this.ratingScore;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.cacheDay.hashCode()) * 31) + this.ratingScore;
    }

    @NotNull
    public String toString() {
        return "RatingCacheBean(userId=" + this.userId + ", cacheDay=" + this.cacheDay + ", ratingScore=" + this.ratingScore + ")";
    }
}
