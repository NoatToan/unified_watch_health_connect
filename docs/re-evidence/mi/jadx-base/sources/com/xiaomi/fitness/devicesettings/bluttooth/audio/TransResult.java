package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TransResult;", "", "code", "", "segments", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResultItem;", "<init>", "(ILjava/util/List;)V", "getCode", "()I", "getSegments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TransResult {
    private final int code;

    @NotNull
    private final List<AsrResultItem> segments;

    public TransResult(int i, @NotNull List<AsrResultItem> segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.code = i;
        this.segments = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransResult copy$default(TransResult transResult, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transResult.code;
        }
        if ((i2 & 2) != 0) {
            list = transResult.segments;
        }
        return transResult.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final List<AsrResultItem> component2() {
        return this.segments;
    }

    @NotNull
    public final TransResult copy(int code, @NotNull List<AsrResultItem> segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new TransResult(code, segments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransResult)) {
            return false;
        }
        TransResult transResult = (TransResult) other;
        return this.code == transResult.code && Intrinsics.areEqual(this.segments, transResult.segments);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final List<AsrResultItem> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.segments.hashCode();
    }

    @NotNull
    public String toString() {
        return "TransResult(code=" + this.code + ", segments=" + this.segments + ")";
    }
}
