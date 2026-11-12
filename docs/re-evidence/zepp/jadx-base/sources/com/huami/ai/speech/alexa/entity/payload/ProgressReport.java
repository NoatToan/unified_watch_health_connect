package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/ProgressReport;", "", "", "component1", "component2", "progressReportDelayInMilliseconds", "progressReportIntervalInMilliseconds", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getProgressReportDelayInMilliseconds", "()J", "b", "getProgressReportIntervalInMilliseconds", "<init>", "(JJ)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProgressReport {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("progressReportDelayInMilliseconds")
    private final long progressReportDelayInMilliseconds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("progressReportIntervalInMilliseconds")
    private final long progressReportIntervalInMilliseconds;

    public ProgressReport(long j, long j2) {
        this.progressReportDelayInMilliseconds = j;
        this.progressReportIntervalInMilliseconds = j2;
    }

    public static /* synthetic */ ProgressReport copy$default(ProgressReport progressReport, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = progressReport.progressReportDelayInMilliseconds;
        }
        if ((i & 2) != 0) {
            j2 = progressReport.progressReportIntervalInMilliseconds;
        }
        return progressReport.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getProgressReportDelayInMilliseconds() {
        return this.progressReportDelayInMilliseconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getProgressReportIntervalInMilliseconds() {
        return this.progressReportIntervalInMilliseconds;
    }

    @NotNull
    public final ProgressReport copy(long progressReportDelayInMilliseconds, long progressReportIntervalInMilliseconds) {
        return new ProgressReport(progressReportDelayInMilliseconds, progressReportIntervalInMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressReport)) {
            return false;
        }
        ProgressReport progressReport = (ProgressReport) other;
        return this.progressReportDelayInMilliseconds == progressReport.progressReportDelayInMilliseconds && this.progressReportIntervalInMilliseconds == progressReport.progressReportIntervalInMilliseconds;
    }

    public final long getProgressReportDelayInMilliseconds() {
        return this.progressReportDelayInMilliseconds;
    }

    public final long getProgressReportIntervalInMilliseconds() {
        return this.progressReportIntervalInMilliseconds;
    }

    public int hashCode() {
        return (b.a(this.progressReportDelayInMilliseconds) * 31) + b.a(this.progressReportIntervalInMilliseconds);
    }

    @NotNull
    public String toString() {
        return "ProgressReport(progressReportDelayInMilliseconds=" + this.progressReportDelayInMilliseconds + ", progressReportIntervalInMilliseconds=" + this.progressReportIntervalInMilliseconds + ')';
    }
}
