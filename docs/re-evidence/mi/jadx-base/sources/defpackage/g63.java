package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class g63 extends dk4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18636a = true;

    public static final class a implements dk4<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18637a = new a();

        @Override // defpackage.dk4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return kmq.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    public static final class b implements dk4<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18638a = new b();

        @Override // defpackage.dk4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements dk4<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18639a = new c();

        @Override // defpackage.dk4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements dk4<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f18640a = new d();

        @Override // defpackage.dk4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements dk4<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f18641a = new e();

        @Override // defpackage.dk4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit convert(ResponseBody responseBody) {
            responseBody.close();
            return Unit.INSTANCE;
        }
    }

    public static final class f implements dk4<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f18642a = new f();

        @Override // defpackage.dk4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // dk4.a
    public dk4<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, etk etkVar) {
        if (RequestBody.class.isAssignableFrom(kmq.h(type))) {
            return b.f18638a;
        }
        return null;
    }

    @Override // dk4.a
    public dk4<ResponseBody, ?> d(Type type, Annotation[] annotationArr, etk etkVar) {
        if (type == ResponseBody.class) {
            return kmq.l(annotationArr, djo.class) ? c.f18639a : a.f18637a;
        }
        if (type == Void.class) {
            return f.f18642a;
        }
        if (!this.f18636a || type != Unit.class) {
            return null;
        }
        try {
            return e.f18641a;
        } catch (NoClassDefFoundError unused) {
            this.f18636a = false;
            return null;
        }
    }
}
