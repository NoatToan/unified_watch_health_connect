package com.huawei.hms.framework.network.restclient.converter.gson;

import com.google.gson.Gson;
import com.huawei.hms.framework.network.restclient.Converter;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes33.dex */
@Deprecated
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Gson gson;

    GsonRequestBodyConverter(Gson gson) {
        this.gson = gson;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.framework.network.restclient.Converter
    public RequestBody convert(T t) {
        return RequestBody.create("application/json; charset=UTF-8", this.gson.toJson(t).getBytes(UTF_8));
    }
}
