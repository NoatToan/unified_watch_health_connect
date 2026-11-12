package com.garmin.device.filetransfer.core.util;

import ok2.e;
import p005kotlin.Metadata;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/device/filetransfer/core/util/DeviceDataTypeException;", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "", "source", "code", "<init>", "(II)V", "I", "getSource", "()I", "getCode", "Companion", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DeviceDataTypeException extends CoreTransferException {
    public static final int CIQ_APP_CODE_NO_SLOTS = 2;
    public static final int CIQ_APP_CODE_NO_SPACE = 1;
    public static final int CIQ_APP_SOURCE = 1;
    public static final int SW_UPDATE_CODE_DISABLED = 1;
    public static final int SW_UPDATE_SOURCE = 2;
    private final int code;
    private final int source;

    public DeviceDataTypeException(int i14, int i15) {
        super(e.f132647o, k.e(i14, i15, "Data specific device exception, source=", ", code="), null, 4, null);
        this.source = i14;
        this.code = i15;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getSource() {
        return this.source;
    }
}
