package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/PkScoreItem;", "", "timeStampInZeroTz", "", "score", "", "bonusScore", "<init>", "(JII)V", "getTimeStampInZeroTz", "()J", "getScore", "()I", "getBonusScore", SportConstants.KEY_TIMESTAMP, "getTimeStamp", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PkScoreItem {

    @SerializedName("bonus_score")
    private final int bonusScore;

    @SerializedName("score")
    private final int score;

    @SerializedName("key")
    private final long timeStampInZeroTz;

    public PkScoreItem(long j, int i, int i2) {
        this.timeStampInZeroTz = j;
        this.score = i;
        this.bonusScore = i2;
    }

    public static /* synthetic */ PkScoreItem copy$default(PkScoreItem pkScoreItem, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = pkScoreItem.timeStampInZeroTz;
        }
        if ((i3 & 2) != 0) {
            i = pkScoreItem.score;
        }
        if ((i3 & 4) != 0) {
            i2 = pkScoreItem.bonusScore;
        }
        return pkScoreItem.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStampInZeroTz() {
        return this.timeStampInZeroTz;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBonusScore() {
        return this.bonusScore;
    }

    @NotNull
    public final PkScoreItem copy(long timeStampInZeroTz, int score, int bonusScore) {
        return new PkScoreItem(timeStampInZeroTz, score, bonusScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PkScoreItem)) {
            return false;
        }
        PkScoreItem pkScoreItem = (PkScoreItem) other;
        return this.timeStampInZeroTz == pkScoreItem.timeStampInZeroTz && this.score == pkScoreItem.score && this.bonusScore == pkScoreItem.bonusScore;
    }

    public final int getBonusScore() {
        return this.bonusScore;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getTimeStamp() {
        return FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(this.timeStampInZeroTz, 0);
    }

    public final long getTimeStampInZeroTz() {
        return this.timeStampInZeroTz;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timeStampInZeroTz) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.bonusScore);
    }

    @NotNull
    public String toString() {
        return "PkScoreItem(timeStampInZeroTz=" + this.timeStampInZeroTz + ", score=" + this.score + ", bonusScore=" + this.bonusScore + ")";
    }
}
