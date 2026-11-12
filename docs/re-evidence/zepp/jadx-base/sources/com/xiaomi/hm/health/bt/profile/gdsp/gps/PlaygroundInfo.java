package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.PlaygroundTemplatePara;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/PlaygroundInfo;", "", "", "component1", "", "component2", "component3", "component4", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "component5", "time", "gpsDistance", "loopDistance", "toleranceDistance", "playgroundTemplatePara", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", "F", "getGpsDistance", "()F", "c", "getLoopDistance", GoogleApiAvailabilityLight.a, "getToleranceDistance", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "getPlaygroundTemplatePara", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "<init>", "(JFFFLcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlaygroundInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float gpsDistance;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float loopDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float toleranceDistance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final PlaygroundTemplatePara playgroundTemplatePara;

    public PlaygroundInfo(long j, float f, float f2, float f3, @NotNull PlaygroundTemplatePara playgroundTemplatePara) {
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
        return this.time == playgroundInfo.time && Intrinsics.areEqual((Object) Float.valueOf(this.gpsDistance), (Object) Float.valueOf(playgroundInfo.gpsDistance)) && Intrinsics.areEqual((Object) Float.valueOf(this.loopDistance), (Object) Float.valueOf(playgroundInfo.loopDistance)) && Intrinsics.areEqual((Object) Float.valueOf(this.toleranceDistance), (Object) Float.valueOf(playgroundInfo.toleranceDistance)) && Intrinsics.areEqual(this.playgroundTemplatePara, playgroundInfo.playgroundTemplatePara);
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
        return (((((((defpackage.b.a(this.time) * 31) + Float.floatToIntBits(this.gpsDistance)) * 31) + Float.floatToIntBits(this.loopDistance)) * 31) + Float.floatToIntBits(this.toleranceDistance)) * 31) + this.playgroundTemplatePara.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlaygroundInfo(time=" + this.time + ", gpsDistance=" + this.gpsDistance + ", loopDistance=" + this.loopDistance + ", toleranceDistance=" + this.toleranceDistance + ", playgroundTemplatePara=" + this.playgroundTemplatePara + ')';
    }
}
