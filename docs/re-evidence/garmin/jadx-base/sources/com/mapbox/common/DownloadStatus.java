package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadStatus implements Serializable {
    private long downloadId;
    private DownloadOptions downloadOptions;
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long receivedBytes;
    private TransferState state;
    private Long totalBytes;
    private long transferredBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadStatus(TransferError transferError, Long l14, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l14;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
        this.downloadId = 0L;
        this.state = TransferState.PENDING;
        this.receivedBytes = 0L;
        this.transferredBytes = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStatus downloadStatus = (DownloadStatus) obj;
        return this.downloadId == downloadStatus.downloadId && Objects.equals(this.state, downloadStatus.state) && Objects.equals(this.error, downloadStatus.error) && Objects.equals(this.totalBytes, downloadStatus.totalBytes) && this.receivedBytes == downloadStatus.receivedBytes && this.transferredBytes == downloadStatus.transferredBytes && Objects.equals(this.downloadOptions, downloadStatus.downloadOptions) && Objects.equals(this.httpResult, downloadStatus.httpResult);
    }

    public long getDownloadId() {
        return this.downloadId;
    }

    public DownloadOptions getDownloadOptions() {
        return this.downloadOptions;
    }

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getReceivedBytes() {
        return this.receivedBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.downloadId), this.state, this.error, this.totalBytes, Long.valueOf(this.receivedBytes), Long.valueOf(this.transferredBytes), this.downloadOptions, this.httpResult);
    }

    public void setDownloadId(long j8) {
        this.downloadId = j8;
    }

    public void setDownloadOptions(DownloadOptions downloadOptions) {
        this.downloadOptions = downloadOptions;
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setReceivedBytes(long j8) {
        this.receivedBytes = j8;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l14) {
        this.totalBytes = l14;
    }

    public void setTransferredBytes(long j8) {
        this.transferredBytes = j8;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[downloadId: ");
        com.google.protobuf.a.h(this.downloadId, ", state: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.state));
        sb3.append(", error: ");
        sb3.append(RecordUtils.fieldToString(this.error));
        sb3.append(", totalBytes: ");
        sb3.append(RecordUtils.fieldToString(this.totalBytes));
        sb3.append(", receivedBytes: ");
        com.google.protobuf.a.h(this.receivedBytes, ", transferredBytes: ", sb3);
        com.google.protobuf.a.h(this.transferredBytes, ", downloadOptions: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.downloadOptions));
        sb3.append(", httpResult: ");
        sb3.append(RecordUtils.fieldToString(this.httpResult));
        sb3.append("]");
        return sb3.toString();
    }

    public DownloadStatus(long j8, TransferState transferState, TransferError transferError, Long l14, long j14, long j15, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.downloadId = j8;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l14;
        this.receivedBytes = j14;
        this.transferredBytes = j15;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
    }
}
