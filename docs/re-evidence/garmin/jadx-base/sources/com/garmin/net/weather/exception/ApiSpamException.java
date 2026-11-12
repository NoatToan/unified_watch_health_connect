package com.garmin.net.weather.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/net/weather/exception/ApiSpamException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "(Ljava/lang/String;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ApiSpamException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiSpamException(String str) {
        super(str);
        str.getClass();
    }
}
