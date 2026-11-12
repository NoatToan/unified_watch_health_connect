package com.xiaomi.fitness.media;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/media/MusicInfo;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "artist", "getArtist", "setArtist", "state", "", "getState", "()I", "setState", "(I)V", "duration", "getDuration", "setDuration", "currentPosition", "", "getCurrentPosition", "()J", "setCurrentPosition", "(J)V", "systemTime", "getSystemTime", "setSystemTime", "toString", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicInfo {

    @Nullable
    private String artist;
    private long currentPosition;
    private int duration;
    private int state;
    private long systemTime;

    @Nullable
    private String title;

    @Nullable
    public final String getArtist() {
        return this.artist;
    }

    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getState() {
        return this.state;
    }

    public final long getSystemTime() {
        return this.systemTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setArtist(@Nullable String str) {
        this.artist = str;
    }

    public final void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSystemTime(long j) {
        this.systemTime = j;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "MusicInfo(title=" + this.title + ", artist=" + this.artist + ", state=" + this.state + ", duration=" + this.duration + ", currentPosition=" + this.currentPosition + ", systemTime=" + this.systemTime + ")";
    }
}
