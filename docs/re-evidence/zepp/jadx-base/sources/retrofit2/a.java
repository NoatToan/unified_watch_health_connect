package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes23.dex */
final class a extends Converter.Factory {

    /* JADX INFO: renamed from: retrofit2.a$a, reason: collision with other inner class name */
    public static final class C1212a implements Converter<ResponseBody, ResponseBody> {
        public static final C1212a a = new C1212a();

        @Override // retrofit2.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return i.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    public static final class b implements Converter<RequestBody, RequestBody> {
        public static final b a = new b();

        @Override // retrofit2.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements Converter<ResponseBody, ResponseBody> {
        public static final c a = new c();

        @Override // retrofit2.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements Converter<Object, String> {
        public static final d a = new d();

        @Override // retrofit2.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements Converter<ResponseBody, Void> {
        public static final e a = new e();

        @Override // retrofit2.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(i.i(type))) {
            return b.a;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            return i.m(annotationArr, Streaming.class) ? c.a : C1212a.a;
        }
        if (type == Void.class) {
            return e.a;
        }
        return null;
    }
}
