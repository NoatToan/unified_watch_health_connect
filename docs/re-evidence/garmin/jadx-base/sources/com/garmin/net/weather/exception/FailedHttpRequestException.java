package com.garmin.net.weather.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/net/weather/exception/FailedHttpRequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "httpStatusCode", "", "msg", "", "(ILjava/lang/String;)V", "getHttpStatusCode", "()I", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FailedHttpRequestException extends Exception {
    private final int httpStatusCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedHttpRequestException(int i14, String str) {
        super(str);
        str.getClass();
        this.httpStatusCode = i14;
    }

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }
}
