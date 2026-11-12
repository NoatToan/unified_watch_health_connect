package c83;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h.a {

    public static final class a implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25748a = new a();

        @Override // c83.h
        public final ResponseBody convert(ResponseBody responseBody) {
            ResponseBody responseBody2 = responseBody;
            try {
                w63.e eVar = new w63.e();
                responseBody2.getBodySource().V3(eVar);
                return ResponseBody.create(responseBody2.get$contentType(), responseBody2.getContentLength(), eVar);
            } finally {
                responseBody2.close();
            }
        }
    }

    /* JADX INFO: renamed from: c83.b$b, reason: collision with other inner class name */
    public static final class C0379b implements h<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0379b f25749a = new C0379b();

        @Override // c83.h
        public final RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25750a = new c();

        @Override // c83.h
        public final ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25751a = new d();

        @Override // c83.h
        public final String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements h<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f25752a = new e();

        @Override // c83.h
        public final Unit convert(ResponseBody responseBody) {
            responseBody.close();
            return Unit.INSTANCE;
        }
    }

    public static final class f implements h<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25753a = new f();

        @Override // c83.h
        public final Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // c83.h.a
    public final h<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        if (RequestBody.class.isAssignableFrom(f0.e(type))) {
            return C0379b.f25749a;
        }
        return null;
    }

    @Override // c83.h.a
    public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (type == ResponseBody.class) {
            return f0.h(annotationArr, i83.w.class) ? c.f25750a : a.f25748a;
        }
        if (type == Void.class) {
            return f.f25753a;
        }
        if (f0.f25774b && type == Unit.class) {
            return e.f25752a;
        }
        return null;
    }
}
