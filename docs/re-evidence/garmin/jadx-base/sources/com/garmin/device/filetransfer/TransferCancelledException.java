package com.garmin.device.filetransfer;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/filetransfer/TransferCancelledException;", "Lcom/garmin/device/filetransfer/FileTransferException;", "<init>", "()V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferCancelledException extends FileTransferException {
    public TransferCancelledException() {
        super("Transfer cancelled", null, 2, null);
    }
}
