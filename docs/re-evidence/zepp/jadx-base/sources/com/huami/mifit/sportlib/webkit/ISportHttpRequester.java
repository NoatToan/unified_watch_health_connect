package com.huami.mifit.sportlib.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface ISportHttpRequester {
    public static final int METHOD_GET = 27;
    public static final int METHOD_POST = 26;
    public static final int METHOD_PUT = 28;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    void doHttpRequest(String str, Map<String, Object> map, int i, ISportHttpResponseHandler iSportHttpResponseHandler);

    boolean doHttpRequestSync(String str, Map<String, Object> map, int i, ISportHttpResponseHandler iSportHttpResponseHandler);

    boolean isSportDataUploadEnable();
}
