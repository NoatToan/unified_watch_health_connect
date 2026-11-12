package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionGetMapUrlRequest;", "", "report_id", "", "<init>", "(Ljava/lang/String;)V", "getReport_id", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FallDetectionGetMapUrlRequest {

    @NotNull
    private final String report_id;

    public FallDetectionGetMapUrlRequest(@NotNull String report_id) {
        Intrinsics.checkNotNullParameter(report_id, "report_id");
        this.report_id = report_id;
    }

    public static /* synthetic */ FallDetectionGetMapUrlRequest copy$default(FallDetectionGetMapUrlRequest fallDetectionGetMapUrlRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fallDetectionGetMapUrlRequest.report_id;
        }
        return fallDetectionGetMapUrlRequest.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReport_id() {
        return this.report_id;
    }

    @NotNull
    public final FallDetectionGetMapUrlRequest copy(@NotNull String report_id) {
        Intrinsics.checkNotNullParameter(report_id, "report_id");
        return new FallDetectionGetMapUrlRequest(report_id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FallDetectionGetMapUrlRequest) && Intrinsics.areEqual(this.report_id, ((FallDetectionGetMapUrlRequest) other).report_id);
    }

    @NotNull
    public final String getReport_id() {
        return this.report_id;
    }

    public int hashCode() {
        return this.report_id.hashCode();
    }

    @NotNull
    public String toString() {
        return "FallDetectionGetMapUrlRequest(report_id=" + this.report_id + ")";
    }
}
