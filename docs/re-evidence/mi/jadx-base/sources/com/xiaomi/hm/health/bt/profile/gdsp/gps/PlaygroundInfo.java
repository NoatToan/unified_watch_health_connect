package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.PlaygroundTemplatePara;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/PlaygroundInfo;", "", "time", "", "gpsDistance", "", "loopDistance", "toleranceDistance", "playgroundTemplatePara", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "(JFFFLcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;)V", "getGpsDistance", "()F", "getLoopDistance", "getPlaygroundTemplatePara", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "getTime", "()J", "getToleranceDistance", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PlaygroundInfo {
    private final float gpsDistance;
    private final float loopDistance;

    @NotNull
    private final PlaygroundTemplatePara playgroundTemplatePara;
    private final long time;
    private final float toleranceDistance;

    public PlaygroundInfo(long j, float f, float f2, float f3, @NotNull PlaygroundTemplatePara playgroundTemplatePara) {
        Intrinsics.checkNotNullParameter(playgroundTemplatePara, "playgroundTemplatePara");
        this.time = j;
        this.gpsDistance = f;
        this.loopDistance = f2;
        this.toleranceDistance = f3;
        this.playgroundTemplatePara = playgroundTemplatePara;
    }

    public static /* synthetic */ PlaygroundInfo copy$default(PlaygroundInfo playgroundInfo, long j, float f, float f2, float f3, PlaygroundTemplatePara playgroundTemplatePara, int i, Object obj) {
        if ((i & 1) != 0) {
            j = playgroundInfo.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = playgroundInfo.gpsDistance;
        }
        float f4 = f;
        if ((i & 4) != 0) {
            f2 = playgroundInfo.loopDistance;
        }
        float f5 = f2;
        if ((i & 8) != 0) {
            f3 = playgroundInfo.toleranceDistance;
        }
        float f6 = f3;
        if ((i & 16) != 0) {
            playgroundTemplatePara = playgroundInfo.playgroundTemplatePara;
        }
        return playgroundInfo.copy(j2, f4, f5, f6, playgroundTemplatePara);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getGpsDistance() {
        return this.gpsDistance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getLoopDistance() {
        return this.loopDistance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getToleranceDistance() {
        return this.toleranceDistance;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PlaygroundTemplatePara getPlaygroundTemplatePara() {
        return this.playgroundTemplatePara;
    }

    @NotNull
    public final PlaygroundInfo copy(long time, float gpsDistance, float loopDistance, float toleranceDistance, @NotNull PlaygroundTemplatePara playgroundTemplatePara) {
        Intrinsics.checkNotNullParameter(playgroundTemplatePara, "playgroundTemplatePara");
        return new PlaygroundInfo(time, gpsDistance, loopDistance, toleranceDistance, playgroundTemplatePara);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaygroundInfo)) {
            return false;
        }
        PlaygroundInfo playgroundInfo = (PlaygroundInfo) other;
        return this.time == playgroundInfo.time && Float.compare(this.gpsDistance, playgroundInfo.gpsDistance) == 0 && Float.compare(this.loopDistance, playgroundInfo.loopDistance) == 0 && Float.compare(this.toleranceDistance, playgroundInfo.toleranceDistance) == 0 && Intrinsics.areEqual(this.playgroundTemplatePara, playgroundInfo.playgroundTemplatePara);
    }

    public final float getGpsDistance() {
        return this.gpsDistance;
    }

    public final float getLoopDistance() {
        return this.loopDistance;
    }

    @NotNull
    public final PlaygroundTemplatePara getPlaygroundTemplatePara() {
        return this.playgroundTemplatePara;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getToleranceDistance() {
        return this.toleranceDistance;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.time) * 31) + Float.hashCode(this.gpsDistance)) * 31) + Float.hashCode(this.loopDistance)) * 31) + Float.hashCode(this.toleranceDistance)) * 31) + this.playgroundTemplatePara.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlaygroundInfo(time=" + this.time + ", gpsDistance=" + this.gpsDistance + ", loopDistance=" + this.loopDistance + ", toleranceDistance=" + this.toleranceDistance + ", playgroundTemplatePara=" + this.playgroundTemplatePara + ')';
    }
}
