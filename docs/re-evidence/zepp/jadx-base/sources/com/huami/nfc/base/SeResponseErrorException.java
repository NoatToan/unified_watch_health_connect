package com.huami.nfc.base;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\t\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/huami/nfc/base/SeResponseErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "a", "Ljava/lang/String;", "getApdu", "()Ljava/lang/String;", "apdu", "b", "getResponse", AbstractJSONTokenResponse.RESPONSE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "nfc-base_release"}, k = 1, mv = {1, 5, 1})
public final class SeResponseErrorException extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String apdu;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String response;

    public SeResponseErrorException(@NotNull String str, @NotNull String str2) {
        this.apdu = str;
        this.response = str2;
    }

    @NotNull
    public final String getApdu() {
        return this.apdu;
    }

    @NotNull
    public final String getResponse() {
        return this.response;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "SeResponseErrorException(APDU指令执行失败，发送: " + this.apdu + ", 期望返回: 9000, 实际返回: " + this.response + ", " + ApduStatusWordsKt.statusWordsToMessage(this.response) + ')';
    }
}
