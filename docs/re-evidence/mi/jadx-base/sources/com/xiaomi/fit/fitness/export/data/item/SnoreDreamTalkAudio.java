package com.xiaomi.fit.fitness.export.data.item;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SnoreDreamTalkAudio;", "Ljava/io/Serializable;", "beginTime", "", "duration", "", "type", "<init>", "(JII)V", "getBeginTime", "()J", "setBeginTime", "(J)V", "getDuration", "()I", "setDuration", "(I)V", "getType", "setType", "wakeupTime", "getWakeupTime", "()Ljava/lang/Long;", "setWakeupTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "tzIn15Min", "getTzIn15Min", "()Ljava/lang/Integer;", "setTzIn15Min", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SnoreDreamTalkAudio implements Serializable {
    private long beginTime;
    private int duration;
    private int type;

    @Nullable
    private Integer tzIn15Min;

    @Nullable
    private Long wakeupTime;

    public SnoreDreamTalkAudio(long j, int i, int i2) {
        this.beginTime = j;
        this.duration = i;
        this.type = i2;
    }

    public static /* synthetic */ SnoreDreamTalkAudio copy$default(SnoreDreamTalkAudio snoreDreamTalkAudio, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = snoreDreamTalkAudio.beginTime;
        }
        if ((i3 & 2) != 0) {
            i = snoreDreamTalkAudio.duration;
        }
        if ((i3 & 4) != 0) {
            i2 = snoreDreamTalkAudio.type;
        }
        return snoreDreamTalkAudio.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBeginTime() {
        return this.beginTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final SnoreDreamTalkAudio copy(long beginTime, int duration, int type) {
        return new SnoreDreamTalkAudio(beginTime, duration, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnoreDreamTalkAudio)) {
            return false;
        }
        SnoreDreamTalkAudio snoreDreamTalkAudio = (SnoreDreamTalkAudio) other;
        return this.beginTime == snoreDreamTalkAudio.beginTime && this.duration == snoreDreamTalkAudio.duration && this.type == snoreDreamTalkAudio.type;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final Integer getTzIn15Min() {
        return this.tzIn15Min;
    }

    @Nullable
    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.beginTime) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.type);
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setTzIn15Min(@Nullable Integer num) {
        this.tzIn15Min = num;
    }

    public final void setWakeupTime(@Nullable Long l) {
        this.wakeupTime = l;
    }

    @NotNull
    public String toString() {
        return "beginTime = " + this.beginTime + ", duration = " + this.duration + ", type = " + this.type + ", wakeupTime = " + this.wakeupTime + ", tzIn15Min = " + this.tzIn15Min;
    }
}
