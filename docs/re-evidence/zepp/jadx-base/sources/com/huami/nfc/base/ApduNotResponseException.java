package com.huami.nfc.base;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/nfc/base/ApduNotResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "<init>", "()V", "nfc-base_release"}, k = 1, mv = {1, 5, 1})
public final class ApduNotResponseException extends Exception {
    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "ApduNotResponseException(发送的APDU指令没有结果返回，可能是蓝牙60s超时，也可能是蓝牙断链导致)";
    }
}
