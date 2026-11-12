package com.xiaomi.fitness.active.pk.widget;

import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/active/pk/widget/PkChartDataItem;", "", SportConstants.KEY_TIMESTAMP, "", "ownScore", "", "oppScore", "ownExtraScore", "oppExtraScore", "<init>", "(JIIII)V", "getTimeStamp", "()J", "getOwnScore", "()I", "getOppScore", "getOwnExtraScore", "getOppExtraScore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PkChartDataItem {
    private final int oppExtraScore;
    private final int oppScore;
    private final int ownExtraScore;
    private final int ownScore;
    private final long timeStamp;

    public PkChartDataItem(long j, int i, int i2, int i3, int i4) {
        this.timeStamp = j;
        this.ownScore = i;
        this.oppScore = i2;
        this.ownExtraScore = i3;
        this.oppExtraScore = i4;
    }

    public static /* synthetic */ PkChartDataItem copy$default(PkChartDataItem pkChartDataItem, long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = pkChartDataItem.timeStamp;
        }
        long j2 = j;
        if ((i5 & 2) != 0) {
            i = pkChartDataItem.ownScore;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = pkChartDataItem.oppScore;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = pkChartDataItem.ownExtraScore;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = pkChartDataItem.oppExtraScore;
        }
        return pkChartDataItem.copy(j2, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOwnScore() {
        return this.ownScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOppScore() {
        return this.oppScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOwnExtraScore() {
        return this.ownExtraScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOppExtraScore() {
        return this.oppExtraScore;
    }

    @NotNull
    public final PkChartDataItem copy(long timeStamp, int ownScore, int oppScore, int ownExtraScore, int oppExtraScore) {
        return new PkChartDataItem(timeStamp, ownScore, oppScore, ownExtraScore, oppExtraScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PkChartDataItem)) {
            return false;
        }
        PkChartDataItem pkChartDataItem = (PkChartDataItem) other;
        return this.timeStamp == pkChartDataItem.timeStamp && this.ownScore == pkChartDataItem.ownScore && this.oppScore == pkChartDataItem.oppScore && this.ownExtraScore == pkChartDataItem.ownExtraScore && this.oppExtraScore == pkChartDataItem.oppExtraScore;
    }

    public final int getOppExtraScore() {
        return this.oppExtraScore;
    }

    public final int getOppScore() {
        return this.oppScore;
    }

    public final int getOwnExtraScore() {
        return this.ownExtraScore;
    }

    public final int getOwnScore() {
        return this.ownScore;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.timeStamp) * 31) + Integer.hashCode(this.ownScore)) * 31) + Integer.hashCode(this.oppScore)) * 31) + Integer.hashCode(this.ownExtraScore)) * 31) + Integer.hashCode(this.oppExtraScore);
    }

    @NotNull
    public String toString() {
        return "PkChartDataItem(timeStamp=" + this.timeStamp + ", ownScore=" + this.ownScore + ", oppScore=" + this.oppScore + ", ownExtraScore=" + this.ownExtraScore + ", oppExtraScore=" + this.oppExtraScore + ")";
    }
}
