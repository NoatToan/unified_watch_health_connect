package com.garmin.device.filetransfer;

import com.garmin.proto.generated.GDIFileAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/device/filetransfer/ItemAccessException;", "Lcom/garmin/device/filetransfer/FileTransferException;", "itemAccessResult", "Lcom/garmin/proto/generated/GDIFileAccess$ItemAccessResult;", "message", "", "<init>", "(Lcom/garmin/proto/generated/GDIFileAccess$ItemAccessResult;Ljava/lang/String;)V", "getItemAccessResult", "()Lcom/garmin/proto/generated/GDIFileAccess$ItemAccessResult;", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ItemAccessException extends FileTransferException {
    private final GDIFileAccess.ItemAccessResult itemAccessResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemAccessException(GDIFileAccess.ItemAccessResult itemAccessResult, String str) {
        super(str, null, 2, null);
        itemAccessResult.getClass();
        str.getClass();
        this.itemAccessResult = itemAccessResult;
    }

    public final GDIFileAccess.ItemAccessResult getItemAccessResult() {
        return this.itemAccessResult;
    }
}
