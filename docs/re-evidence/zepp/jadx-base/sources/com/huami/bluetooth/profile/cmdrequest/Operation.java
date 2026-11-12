package com.huami.bluetooth.profile.cmdrequest;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/cmdrequest/Operation;", "", "operation", TransportUri.ACTION_ADD, "", "toString", "", "a", LogUtil.I, "getOpCode", "()I", "opCode", "b", "getOpCodeByteSize", "opCodeByteSize", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class Operation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int opCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int opCodeByteSize;

    public Operation(int i, int i2) {
        this.opCode = i;
        this.opCodeByteSize = i2;
    }

    @NotNull
    public final Operation add(@NotNull Operation operation) {
        int i = operation.opCodeByteSize;
        int i2 = this.opCodeByteSize;
        if (i != i2) {
            return this;
        }
        return new Operation(operation.opCode | this.opCode, i2);
    }

    public final int getOpCode() {
        return this.opCode;
    }

    public final int getOpCodeByteSize() {
        return this.opCodeByteSize;
    }

    @NotNull
    public String toString() {
        return ((Object) getClass().getSimpleName()) + "(0x" + Integer.toString(this.opCode, a.checkRadix(16)) + ')';
    }

    public /* synthetic */ Operation(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 1 : i2);
    }
}
