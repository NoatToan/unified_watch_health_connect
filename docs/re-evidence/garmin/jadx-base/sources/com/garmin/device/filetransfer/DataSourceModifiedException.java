package com.garmin.device.filetransfer;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/device/filetransfer/DataSourceModifiedException;", "Lcom/garmin/device/filetransfer/FileTransferException;", "message", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataSourceModifiedException extends FileTransferException {
    public /* synthetic */ DataSourceModifiedException(String str, Exception exc, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSourceModifiedException(String str, Exception exc) {
        super(str, exc);
        str.getClass();
    }
}
