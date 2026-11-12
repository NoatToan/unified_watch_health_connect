package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.util.TypeUtils;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.RestClient;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes34.dex */
public final class d6 extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14701a = "BuiltInConverters";

    public static final class a extends Converter<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14702a = new a();

        @Override // com.huawei.hms.network.restclient.Converter
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class b extends Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14703a = new b();

        @Override // com.huawei.hms.network.restclient.Converter
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class c extends Converter<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14704a = new c();

        @Override // com.huawei.hms.network.restclient.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class d extends Converter<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f14705a = new d();

        @Override // com.huawei.hms.network.restclient.Converter
        public Void convert(ResponseBody responseBody) {
            try {
                responseBody.close();
                return null;
            } catch (IOException unused) {
                Logger.i(d6.f14701a, "VoidResponseBodyConverter iOException");
                return null;
            }
        }
    }

    @Override // com.huawei.hms.network.restclient.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, RestClient restClient) {
        if (type == ResponseBody.class) {
            return b.f14703a;
        }
        if (type == Void.class) {
            return d.f14705a;
        }
        return null;
    }

    @Override // com.huawei.hms.network.restclient.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, RestClient restClient) {
        if (RequestBody.class.isAssignableFrom(TypeUtils.getRawType(type))) {
            return a.f14702a;
        }
        return null;
    }
}
