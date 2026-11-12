package com.xiaomi.fitness.milink.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/milink/bean/ExtraAudioData;", "", "volume", "", "position", "", "<init>", "(IJ)V", "getVolume", "()I", "setVolume", "(I)V", "getPosition", "()J", "setPosition", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExtraAudioData {
    private long position;
    private int volume;

    public ExtraAudioData() {
        this(0, 0L, 3, null);
    }

    public static /* synthetic */ ExtraAudioData copy$default(ExtraAudioData extraAudioData, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = extraAudioData.volume;
        }
        if ((i2 & 2) != 0) {
            j = extraAudioData.position;
        }
        return extraAudioData.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVolume() {
        return this.volume;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    @NotNull
    public final ExtraAudioData copy(int volume, long position) {
        return new ExtraAudioData(volume, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraAudioData)) {
            return false;
        }
        ExtraAudioData extraAudioData = (ExtraAudioData) other;
        return this.volume == extraAudioData.volume && this.position == extraAudioData.position;
    }

    public final long getPosition() {
        return this.position;
    }

    public final int getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return (Integer.hashCode(this.volume) * 31) + Long.hashCode(this.position);
    }

    public final void setPosition(long j) {
        this.position = j;
    }

    public final void setVolume(int i) {
        this.volume = i;
    }

    @NotNull
    public String toString() {
        return "ExtraAudioData(volume=" + this.volume + ", position=" + this.position + ")";
    }

    public ExtraAudioData(int i, long j) {
        this.volume = i;
        this.position = j;
    }

    public /* synthetic */ ExtraAudioData(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }
}
