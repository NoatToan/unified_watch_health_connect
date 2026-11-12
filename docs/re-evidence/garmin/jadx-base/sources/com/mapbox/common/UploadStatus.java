package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class UploadStatus implements Serializable {
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long sentBytes;
    private TransferState state;
    private Long totalBytes;
    private long totalSentBytes;
    private long uploadId;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public UploadStatus(TransferError transferError, Long l14, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l14;
        this.httpResult = expected;
        this.uploadId = 0L;
        this.state = TransferState.PENDING;
        this.sentBytes = 0L;
        this.totalSentBytes = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadStatus uploadStatus = (UploadStatus) obj;
        return this.uploadId == uploadStatus.uploadId && Objects.equals(this.state, uploadStatus.state) && Objects.equals(this.error, uploadStatus.error) && Objects.equals(this.totalBytes, uploadStatus.totalBytes) && this.sentBytes == uploadStatus.sentBytes && this.totalSentBytes == uploadStatus.totalSentBytes && Objects.equals(this.httpResult, uploadStatus.httpResult);
    }

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getSentBytes() {
        return this.sentBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTotalSentBytes() {
        return this.totalSentBytes;
    }

    public long getUploadId() {
        return this.uploadId;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.uploadId), this.state, this.error, this.totalBytes, Long.valueOf(this.sentBytes), Long.valueOf(this.totalSentBytes), this.httpResult);
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setSentBytes(long j8) {
        this.sentBytes = j8;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l14) {
        this.totalBytes = l14;
    }

    public void setTotalSentBytes(long j8) {
        this.totalSentBytes = j8;
    }

    public void setUploadId(long j8) {
        this.uploadId = j8;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[uploadId: ");
        com.google.protobuf.a.h(this.uploadId, ", state: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.state));
        sb3.append(", error: ");
        sb3.append(RecordUtils.fieldToString(this.error));
        sb3.append(", totalBytes: ");
        sb3.append(RecordUtils.fieldToString(this.totalBytes));
        sb3.append(", sentBytes: ");
        com.google.protobuf.a.h(this.sentBytes, ", totalSentBytes: ", sb3);
        com.google.protobuf.a.h(this.totalSentBytes, ", httpResult: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.httpResult));
        sb3.append("]");
        return sb3.toString();
    }

    public UploadStatus(long j8, TransferState transferState, TransferError transferError, Long l14, long j14, long j15, Expected<HttpRequestError, HttpResponseData> expected) {
        this.uploadId = j8;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l14;
        this.sentBytes = j14;
        this.totalSentBytes = j15;
        this.httpResult = expected;
    }
}
