package com.huawei.networkclient.repository;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import defpackage.ofo;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DataConverterRepository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ofo f18085c = new ofo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Class, DataConverter> f18086a = new HashMap();

    public interface DataConverter<Output> {
        Output convert(ResponseBody responseBody, Headers headers, Class<Output> cls);

        Output convert(String str, Class<Output> cls);

        String revert(Output output);
    }

    public DataConverter d(Class<?> cls) {
        if (this.f18086a.containsKey(cls)) {
            return this.f18086a.get(cls);
        }
        return f18085c;
    }

    public boolean d(Class<?> cls, DataConverter dataConverter) {
        if (this.f18086a.containsKey(cls)) {
            LogUtil.e("DataConverterRepository", "converterFactory already defined in repository:", cls);
            return false;
        }
        this.f18086a.put(cls, dataConverter);
        return true;
    }
}
