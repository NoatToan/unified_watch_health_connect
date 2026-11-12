package com.garmin.android.music;

import p005kotlin.Metadata;
import q6.f;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/music/EntityPlayerStateData;", "", "playbackState", "", "playbackSpeed", "", "playbackPositionInSeconds", "(IFF)V", "getPlaybackPositionInSeconds", "()F", "getPlaybackSpeed", "getPlaybackState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EntityPlayerStateData {
    private final float playbackPositionInSeconds;
    private final float playbackSpeed;
    private final int playbackState;

    public EntityPlayerStateData(int i14, float f14, float f15) {
        this.playbackState = i14;
        this.playbackSpeed = f14;
        this.playbackPositionInSeconds = f15;
    }

    public static /* synthetic */ EntityPlayerStateData copy$default(EntityPlayerStateData entityPlayerStateData, int i14, float f14, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i14 = entityPlayerStateData.playbackState;
        }
        if ((i15 & 2) != 0) {
            f14 = entityPlayerStateData.playbackSpeed;
        }
        if ((i15 & 4) != 0) {
            f15 = entityPlayerStateData.playbackPositionInSeconds;
        }
        return entityPlayerStateData.copy(i14, f14, f15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPlaybackState() {
        return this.playbackState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPlaybackPositionInSeconds() {
        return this.playbackPositionInSeconds;
    }

    public final EntityPlayerStateData copy(int playbackState, float playbackSpeed, float playbackPositionInSeconds) {
        return new EntityPlayerStateData(playbackState, playbackSpeed, playbackPositionInSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntityPlayerStateData)) {
            return false;
        }
        EntityPlayerStateData entityPlayerStateData = (EntityPlayerStateData) other;
        return this.playbackState == entityPlayerStateData.playbackState && Float.compare(this.playbackSpeed, entityPlayerStateData.playbackSpeed) == 0 && Float.compare(this.playbackPositionInSeconds, entityPlayerStateData.playbackPositionInSeconds) == 0;
    }

    public final float getPlaybackPositionInSeconds() {
        return this.playbackPositionInSeconds;
    }

    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final int getPlaybackState() {
        return this.playbackState;
    }

    public int hashCode() {
        return Float.hashCode(this.playbackPositionInSeconds) + f.d(this.playbackSpeed, Integer.hashCode(this.playbackState) * 31, 31);
    }

    public String toString() {
        int i14 = this.playbackState;
        float f14 = this.playbackSpeed;
        float f15 = this.playbackPositionInSeconds;
        StringBuilder sb3 = new StringBuilder("EntityPlayerStateData(playbackState=");
        sb3.append(i14);
        sb3.append(", playbackSpeed=");
        sb3.append(f14);
        sb3.append(", playbackPositionInSeconds=");
        return e0.e(f15, ")", sb3);
    }
}
