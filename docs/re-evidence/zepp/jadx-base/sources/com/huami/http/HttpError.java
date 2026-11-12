package com.huami.http;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/http/HttpError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "", "message", "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "a", "Lokhttp3/Response;", "b", LogUtil.I, "c", "Ljava/lang/String;", "_message", "<init>", "(Lokhttp3/Response;)V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class HttpError extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Response response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String _message;

    public HttpError(@NotNull Response response) {
        super("HTTP " + response.code() + " " + response.message());
        this.response = response;
        this.code = response.code();
        this._message = response.message();
    }

    /* JADX INFO: renamed from: code, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: message, reason: from getter */
    public final String get_message() {
        return this._message;
    }

    @NotNull
    /* JADX INFO: renamed from: response, reason: from getter */
    public final Response getResponse() {
        return this.response;
    }
}
