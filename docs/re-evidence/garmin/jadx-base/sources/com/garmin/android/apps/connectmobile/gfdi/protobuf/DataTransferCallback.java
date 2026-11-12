package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/DataTransferCallback;", "", "onDataTransferStarted", "", "deviceId", "", "onDataTransferComplete", "data", "", "onDataTransferProgress", "percentComplete", "", "onDataTransferFailed", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface DataTransferCallback {
    void onDataTransferComplete(long deviceId, byte[] data);

    void onDataTransferFailed(long deviceId);

    void onDataTransferProgress(long deviceId, int percentComplete);

    void onDataTransferStarted(long deviceId);
}
