package com.huami.stress.domain.data.remote.net;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huami/stress/domain/data/remote/net/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "a", LogUtil.I, "getHttpCode", "()I", "httpCode", "", "url", "<init>", "(ILjava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int httpCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(int i, @NotNull String str) {
        super(String.format(Locale.CHINA, "http请求返回不正确的结果, code: %d, url: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str}, 2)));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.httpCode = i;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
