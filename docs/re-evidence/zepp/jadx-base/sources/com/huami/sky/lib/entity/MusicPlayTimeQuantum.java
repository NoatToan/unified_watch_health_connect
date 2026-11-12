package com.huami.sky.lib.entity;

import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPlayTimeQuantum;", "", "", "component1", "component2", "startedAt", "endedAt", "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getStartedAt", "()J", "getEndedAt", "<init>", "(JJ)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicPlayTimeQuantum {
    private final long endedAt;
    private final long startedAt;

    public MusicPlayTimeQuantum(long j, long j2) {
        this.startedAt = j;
        this.endedAt = j2;
    }

    public static /* synthetic */ MusicPlayTimeQuantum copy$default(MusicPlayTimeQuantum musicPlayTimeQuantum, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicPlayTimeQuantum.startedAt;
        }
        if ((i & 2) != 0) {
            j2 = musicPlayTimeQuantum.endedAt;
        }
        return musicPlayTimeQuantum.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndedAt() {
        return this.endedAt;
    }

    @NotNull
    public final MusicPlayTimeQuantum copy(long startedAt, long endedAt) {
        return new MusicPlayTimeQuantum(startedAt, endedAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicPlayTimeQuantum)) {
            return false;
        }
        MusicPlayTimeQuantum musicPlayTimeQuantum = (MusicPlayTimeQuantum) other;
        return this.startedAt == musicPlayTimeQuantum.startedAt && this.endedAt == musicPlayTimeQuantum.endedAt;
    }

    public final long getEndedAt() {
        return this.endedAt;
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    public int hashCode() {
        return (b.a(this.startedAt) * 31) + b.a(this.endedAt);
    }

    @NotNull
    public String toString() {
        return "MusicPlayTimeQuantum(startedAt=" + this.startedAt + ", endedAt=" + this.endedAt + ")";
    }
}
