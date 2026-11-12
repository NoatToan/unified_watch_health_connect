package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes14.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    public ApiException(Status status) {
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        StringBuilder sb3 = new StringBuilder(String.valueOf(statusCode).length() + 2 + String.valueOf(statusMessage).length());
        sb3.append(statusCode);
        sb3.append(": ");
        sb3.append(statusMessage);
        super(sb3.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
