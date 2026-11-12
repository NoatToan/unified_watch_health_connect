package com.sensetime.senseid.sdk.liveness.silent.common.network;

import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class HttpResult {
    private ResultCode a;
    private String b;
    private Map<String, List<String>> c;
    private AbstractContentType d;

    public HttpResult(ResultCode resultCode, AbstractContentType abstractContentType) {
        this(resultCode, null, null, abstractContentType);
    }

    public HttpResult(ResultCode resultCode, String str, Map<String, List<String>> map, AbstractContentType abstractContentType) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = resultCode;
        this.b = str;
        this.c = map;
        this.d = abstractContentType;
    }

    public final AbstractContentType getContentType() {
        return this.d;
    }

    public final String getHeaderField(String str) {
        List<String> list;
        Map<String, List<String>> map = this.c;
        if (map == null || map.size() <= 0 || (list = this.c.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public final Map<String, List<String>> getHeaderFields() {
        return this.c;
    }

    public final ResultCode getResultCode() {
        return this.a;
    }

    public final String getResultData() {
        return this.b;
    }
}
