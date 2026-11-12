package com.garmin.device.filetransfer;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/device/filetransfer/FileTransferException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FileTransferException extends Exception {
    public /* synthetic */ FileTransferException(String str, Exception exc, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileTransferException(String str, Exception exc) {
        super(str, exc);
        str.getClass();
    }
}
