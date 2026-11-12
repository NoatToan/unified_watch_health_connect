package com.huami.watch.companion.ecg.media;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/watch/companion/ecg/media/VoiceRecord;", "", "", "component1", "", "component2", "path", "duration", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "b", "J", "getDuration", "()J", "<init>", "(Ljava/lang/String;J)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceRecord {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long duration;

    public VoiceRecord(@NotNull String str, long j) {
        this.path = str;
        this.duration = j;
    }

    public static /* synthetic */ VoiceRecord copy$default(VoiceRecord voiceRecord, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceRecord.path;
        }
        if ((i & 2) != 0) {
            j = voiceRecord.duration;
        }
        return voiceRecord.copy(str, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final VoiceRecord copy(@NotNull String path, long duration) {
        return new VoiceRecord(path, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceRecord)) {
            return false;
        }
        VoiceRecord voiceRecord = (VoiceRecord) other;
        return Intrinsics.areEqual(this.path, voiceRecord.path) && this.duration == voiceRecord.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + b.a(this.duration);
    }

    @NotNull
    public String toString() {
        return "VoiceRecord(path=" + this.path + ", duration=" + this.duration + ')';
    }
}
