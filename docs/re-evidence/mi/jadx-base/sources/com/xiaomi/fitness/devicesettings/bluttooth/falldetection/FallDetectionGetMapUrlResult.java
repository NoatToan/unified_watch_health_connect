package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionGetMapUrlResult;", "", "message_url", "", "<init>", "(Ljava/lang/String;)V", "getMessage_url", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FallDetectionGetMapUrlResult {

    @NotNull
    private final String message_url;

    public FallDetectionGetMapUrlResult(@NotNull String message_url) {
        Intrinsics.checkNotNullParameter(message_url, "message_url");
        this.message_url = message_url;
    }

    public static /* synthetic */ FallDetectionGetMapUrlResult copy$default(FallDetectionGetMapUrlResult fallDetectionGetMapUrlResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fallDetectionGetMapUrlResult.message_url;
        }
        return fallDetectionGetMapUrlResult.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_url() {
        return this.message_url;
    }

    @NotNull
    public final FallDetectionGetMapUrlResult copy(@NotNull String message_url) {
        Intrinsics.checkNotNullParameter(message_url, "message_url");
        return new FallDetectionGetMapUrlResult(message_url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FallDetectionGetMapUrlResult) && Intrinsics.areEqual(this.message_url, ((FallDetectionGetMapUrlResult) other).message_url);
    }

    @NotNull
    public final String getMessage_url() {
        return this.message_url;
    }

    public int hashCode() {
        return this.message_url.hashCode();
    }

    @NotNull
    public String toString() {
        return "FallDetectionGetMapUrlResult(message_url=" + this.message_url + ")";
    }
}
