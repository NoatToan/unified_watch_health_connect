package com.huami.musiccontrol.bean;

import defpackage.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "", "other", "", "equals", "", "hashCode", "Lcom/huami/musiccontrol/bean/MusicState;", "component1", "", "component2", "state", "position", "copy", "", "toString", "a", "Lcom/huami/musiccontrol/bean/MusicState;", "getState", "()Lcom/huami/musiccontrol/bean/MusicState;", "setState", "(Lcom/huami/musiccontrol/bean/MusicState;)V", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "<init>", "(Lcom/huami/musiccontrol/bean/MusicState;J)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class MusicPlayInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private MusicState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private long position;

    public MusicPlayInfo(@NotNull MusicState musicState, long j) {
        this.state = musicState;
        this.position = j;
    }

    public static /* synthetic */ MusicPlayInfo copy$default(MusicPlayInfo musicPlayInfo, MusicState musicState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            musicState = musicPlayInfo.state;
        }
        if ((i & 2) != 0) {
            j = musicPlayInfo.position;
        }
        return musicPlayInfo.copy(musicState, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MusicState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    @NotNull
    public final MusicPlayInfo copy(@NotNull MusicState state, long position) {
        return new MusicPlayInfo(state, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MusicPlayInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.musiccontrol.bean.MusicPlayInfo");
        MusicPlayInfo musicPlayInfo = (MusicPlayInfo) other;
        return this.state == musicPlayInfo.state && this.position == musicPlayInfo.position;
    }

    public final long getPosition() {
        return this.position;
    }

    @NotNull
    public final MusicState getState() {
        return this.state;
    }

    public int hashCode() {
        return (this.state.hashCode() * 31) + b.a(this.position);
    }

    public final void setPosition(long j) {
        this.position = j;
    }

    public final void setState(@NotNull MusicState musicState) {
        this.state = musicState;
    }

    @NotNull
    public String toString() {
        return "MusicPlayInfo(state=" + this.state + ", position=" + this.position + ")";
    }

    public /* synthetic */ MusicPlayInfo(MusicState musicState, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(musicState, (i & 2) != 0 ? -1L : j);
    }
}
