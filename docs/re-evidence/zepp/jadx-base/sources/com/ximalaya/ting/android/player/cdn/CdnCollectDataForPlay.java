package com.ximalaya.ting.android.player.cdn;

/* JADX INFO: loaded from: classes22.dex */
public class CdnCollectDataForPlay {
    private long audioBytes;
    private String audioUrl;
    private String cdnDomain;
    private String cdnIP;
    private float connectedTime;
    private String downloadResult;
    private String downloadSpeed;
    private String downloadTime;
    private String downloaded;
    private String errorType;
    private String exceptionReason;
    private String fileSize;
    private boolean isTimeout;
    private String range;
    private String requestUUID;
    private String statusCode;
    private long timestamp;
    private String type;
    private String viaInfo;

    public long getAudioBytes() {
        return this.audioBytes;
    }

    public String getAudioUrl() {
        return this.audioUrl;
    }

    public String getCdnDomain() {
        return this.cdnDomain;
    }

    public String getCdnIP() {
        return this.cdnIP;
    }

    public float getConnectedTime() {
        return this.connectedTime;
    }

    public String getDownloadResult() {
        return this.downloadResult;
    }

    public String getDownloadSpeed() {
        return this.downloadSpeed;
    }

    public String getDownloadTime() {
        return this.downloadTime;
    }

    public String getDownloaded() {
        return this.downloaded;
    }

    public String getErrorType() {
        return this.errorType;
    }

    public String getExceptionReason() {
        return this.exceptionReason;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public String getRange() {
        return this.range;
    }

    public String getRequestUUID() {
        return this.requestUUID;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public String getViaInfo() {
        return this.viaInfo;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setAudioBytes(long j) {
        this.audioBytes = j;
    }

    public void setAudioUrl(String str) {
        this.audioUrl = str;
    }

    public void setCdnDomain(String str) {
        this.cdnDomain = str;
    }

    public void setCdnIP(String str) {
        this.cdnIP = str;
    }

    public void setConnectedTime(float f) {
        this.connectedTime = f;
    }

    public void setDownloadResult(String str) {
        this.downloadResult = str;
    }

    public void setDownloadSpeed(String str) {
        this.downloadSpeed = str;
    }

    public void setDownloadTime(String str) {
        this.downloadTime = str;
    }

    public void setDownloaded(String str) {
        this.downloaded = str;
    }

    public void setErrorType(String str) {
        this.errorType = str;
    }

    public void setExceptionReason(String str) {
        this.exceptionReason = str;
    }

    public void setFileSize(String str) {
        this.fileSize = str;
    }

    public void setRange(String str) {
        this.range = str;
    }

    public void setRequestUUID(String str) {
        this.requestUUID = str;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public void setTimeout(boolean z) {
        this.isTimeout = z;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setViaInfo(String str) {
        this.viaInfo = str;
    }

    public String toString() {
        return "CdnCollectDataForPlay{audioUrl='" + this.audioUrl + "', audioBytes=" + this.audioBytes + ", cdnIP='" + this.cdnIP + "', isTimeout=" + this.isTimeout + ", downloadSpeed='" + this.downloadSpeed + "', exceptionReason='" + this.exceptionReason + "', errorType='" + this.errorType + "', statusCode='" + this.statusCode + "', viaInfo='" + this.viaInfo + "', connectedTime=" + this.connectedTime + ", timestamp=" + this.timestamp + ", type='" + this.type + "', range='" + this.range + "', fileSize='" + this.fileSize + "', downloaded='" + this.downloaded + "', downloadTime='" + this.downloadTime + "', downloadResult='" + this.downloadResult + "', cdnDomain=" + this.cdnDomain + "', requestUUID=" + this.requestUUID + "'}";
    }
}
