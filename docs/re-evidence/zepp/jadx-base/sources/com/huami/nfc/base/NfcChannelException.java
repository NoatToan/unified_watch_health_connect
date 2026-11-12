package com.huami.nfc.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/huami/nfc/base/NfcChannelException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "", "a", LogUtil.I, "getCode", "()I", "code", "message", "<init>", "(ILjava/lang/String;)V", "Companion", "nfc-base_release"}, k = 1, mv = {1, 5, 1})
public final class NfcChannelException extends Exception {
    public static final int CODE_CLOSE_CHANNEL = 3;
    public static final int CODE_OPEN_CHANNEL = 1;
    public static final int CODE_TRANSMIT = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    public NfcChannelException(int i, @NotNull String str) {
        super(str);
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        int i = this.code;
        if (i == 1) {
            return Intrinsics.stringPlus("打开 NFC 通道失败，", getMessage());
        }
        if (i == 2) {
            return Intrinsics.stringPlus("NFC 传输过程中出错，", getMessage());
        }
        if (i == 3) {
            return Intrinsics.stringPlus("关闭 NFC 通道失败，", getMessage());
        }
        return "打开/传输/关闭 NFC 通道失败。code: " + this.code + ", message: '" + ((Object) getMessage()) + '\'';
    }
}
