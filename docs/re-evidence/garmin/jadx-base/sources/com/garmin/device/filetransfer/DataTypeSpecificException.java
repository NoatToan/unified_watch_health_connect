package com.garmin.device.filetransfer;

import com.garmin.proto.generated.GDIFileAccess;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/device/filetransfer/DataTypeSpecificException;", "Lcom/garmin/device/filetransfer/ItemAccessException;", "source", "", "code", "msgPrefix", "", "<init>", "(IILjava/lang/String;)V", "getSource", "()I", "getCode", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataTypeSpecificException extends ItemAccessException {
    private final int code;
    private final int source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataTypeSpecificException(int i14, int i15, String str) {
        super(GDIFileAccess.ItemAccessResult.DATA_TYPE_ERROR, str + "Data specific device exception, source=" + i14 + ", code=" + i15);
        str.getClass();
        this.source = i14;
        this.code = i15;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getSource() {
        return this.source;
    }

    public /* synthetic */ DataTypeSpecificException(int i14, int i15, String str, int i16, j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? "" : str);
    }
}
