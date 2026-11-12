package com.xiaomi.fitness.sleep.behavior.analyze.core;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0002\u001a\u00020\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Score;", "", "isCredible", "", "credibility", "", "<init>", "(ID)V", "()I", "setCredible", "(I)V", "getCredibility", "()D", "", "db", "getDb", "setDb", "(D)V", "time", "", "getTime", "()J", "setTime", "(J)V", "data", "", "getData", "()[B", "setData", "([B)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Score {

    @SerializedName("credibility")
    private final double credibility;

    @Nullable
    private byte[] data;
    private double db;

    @SerializedName("is_credible")
    private int isCredible;
    private long time;

    public Score(int i, double d) {
        this.isCredible = i;
        this.credibility = d;
    }

    public static /* synthetic */ Score copy$default(Score score, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = score.isCredible;
        }
        if ((i2 & 2) != 0) {
            d = score.credibility;
        }
        return score.copy(i, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIsCredible() {
        return this.isCredible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getCredibility() {
        return this.credibility;
    }

    @NotNull
    public final Score copy(int isCredible, double credibility) {
        return new Score(isCredible, credibility);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Score)) {
            return false;
        }
        Score score = (Score) other;
        return this.isCredible == score.isCredible && Double.compare(this.credibility, score.credibility) == 0;
    }

    public final double getCredibility() {
        return this.credibility;
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public final double getDb() {
        return this.db;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Integer.hashCode(this.isCredible) * 31) + Double.hashCode(this.credibility);
    }

    public final int isCredible() {
        return this.isCredible;
    }

    public final void setCredible(int i) {
        this.isCredible = i;
    }

    public final void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void setDb(double d) {
        this.db = d;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "Score(isCredible=" + this.isCredible + ", credibility=" + this.credibility + ")";
    }

    /* JADX INFO: renamed from: isCredible, reason: collision with other method in class */
    public final boolean m562isCredible() {
        return this.isCredible == 1 && this.credibility > 0.5d;
    }

    public /* synthetic */ Score(int i, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, d);
    }
}
