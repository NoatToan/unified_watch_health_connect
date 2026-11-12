package com.amazon.alexa.avs.message.response.audioplayer;

import com.amazon.alexa.avs.message.response.ProgressReport;
import com.google.gson.annotations.Expose;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class Stream {

    @Expose(serialize = false)
    private InputStream attachedContent;
    private String expectedPreviousToken;
    private String expiryTime;
    private long offsetInMilliseconds;
    private ProgressReport progressReport;
    private String token;
    private String url;
    private boolean urlIsAContentId;

    public InputStream getAttachedContent() {
        return this.attachedContent;
    }

    public String getExpectedPreviousToken() {
        return this.expectedPreviousToken;
    }

    public String getExpiryTime() {
        return this.expiryTime;
    }

    public long getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    public ProgressReport getProgressReport() {
        return this.progressReport;
    }

    public boolean getProgressReportRequired() {
        ProgressReport progressReport = this.progressReport;
        return progressReport != null && progressReport.isRequired();
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean hasAttachedContent() {
        return this.attachedContent != null;
    }

    public boolean requiresAttachedContent() {
        return this.urlIsAContentId && !hasAttachedContent();
    }

    public void setAttachedContent(InputStream inputStream) {
        this.attachedContent = inputStream;
    }

    public void setExpectedPreviousToken(String str) {
        this.expectedPreviousToken = str;
    }

    public void setExpiryTime(String str) {
        this.expiryTime = str;
    }

    public void setOffsetInMilliseconds(long j) {
        this.offsetInMilliseconds = j;
    }

    public void setProgressReport(ProgressReport progressReport) {
        this.progressReport = progressReport;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUrl(String str) {
        boolean zStartsWith = str.startsWith("cid");
        this.urlIsAContentId = zStartsWith;
        if (zStartsWith) {
            this.url = str.substring(4);
        } else {
            this.url = str;
        }
    }
}
