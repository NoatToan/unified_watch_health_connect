package com.huami.module.homepage.cards.business.weight;

import com.huami.ecg.core.db.entity.EcgData;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J0\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/huami/module/homepage/cards/business/weight/BodyScoreEntry;", "", "", "component1", "()Ljava/lang/Integer;", "", "component2", "", "component3", "score", "status", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "(Ljava/lang/Integer;Ljava/lang/String;J)Lcom/huami/module/homepage/cards/business/weight/BodyScoreEntry;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getScore", "setScore", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "c", "J", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;J)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BodyScoreEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer score;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private long updateTime;

    public BodyScoreEntry() {
        this(null, null, 0L, 7, null);
    }

    public BodyScoreEntry(@Nullable Integer num, @NotNull String str, long j) {
        this.score = num;
        this.status = str;
        this.updateTime = j;
    }

    public static /* synthetic */ BodyScoreEntry copy$default(BodyScoreEntry bodyScoreEntry, Integer num, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bodyScoreEntry.score;
        }
        if ((i & 2) != 0) {
            str = bodyScoreEntry.status;
        }
        if ((i & 4) != 0) {
            j = bodyScoreEntry.updateTime;
        }
        return bodyScoreEntry.copy(num, str, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final BodyScoreEntry copy(@Nullable Integer score, @NotNull String status, long updateTime) {
        return new BodyScoreEntry(score, status, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyScoreEntry)) {
            return false;
        }
        BodyScoreEntry bodyScoreEntry = (BodyScoreEntry) other;
        return Intrinsics.areEqual(this.score, bodyScoreEntry.score) && Intrinsics.areEqual(this.status, bodyScoreEntry.status) && this.updateTime == bodyScoreEntry.updateTime;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        Integer num = this.score;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.status.hashCode()) * 31) + b.a(this.updateTime);
    }

    public final void setScore(@Nullable Integer num) {
        this.score = num;
    }

    public final void setStatus(@NotNull String str) {
        this.status = str;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "BodyScoreEntry(score=" + this.score + ", status=" + this.status + ", updateTime=" + this.updateTime + ")";
    }

    public /* synthetic */ BodyScoreEntry(Integer num, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? "--" : str, (i & 4) != 0 ? 0L : j);
    }
}
