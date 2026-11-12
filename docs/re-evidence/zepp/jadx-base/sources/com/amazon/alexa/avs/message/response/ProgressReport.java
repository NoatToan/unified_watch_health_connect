package com.amazon.alexa.avs.message.response;

/* JADX INFO: loaded from: classes2.dex */
public class ProgressReport {
    private long progressReportDelayInMilliseconds;
    private long progressReportIntervalInMilliseconds;

    public long getProgressReportDelayInMilliseconds() {
        return this.progressReportDelayInMilliseconds;
    }

    public long getProgressReportIntervalInMilliseconds() {
        return this.progressReportIntervalInMilliseconds;
    }

    public boolean isRequired() {
        return this.progressReportDelayInMilliseconds > 0 || this.progressReportIntervalInMilliseconds > 0;
    }

    public void setProgressReportDelayInMilliseconds(long j) {
        this.progressReportDelayInMilliseconds = j;
    }

    public void setProgressReportIntervalInMilliseconds(long j) {
        this.progressReportIntervalInMilliseconds = j;
    }
}
