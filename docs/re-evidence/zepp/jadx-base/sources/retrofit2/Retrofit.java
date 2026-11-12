package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes23.dex */
public final class Retrofit {
    private final Map<Method, h<?, ?>> a = new ConcurrentHashMap();
    public final okhttp3.Call.Factory b;
    public final HttpUrl c;
    public final List<Converter.Factory> d;
    public final List<CallAdapter.Factory> e;

    @Nullable
    public final Executor f;
    public final boolean g;

    public class a implements InvocationHandler {
        private final f a = f.d();
        public final /* synthetic */ Class b;

        public a(Class cls) {
            this.b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.f(method)) {
                return this.a.e(method, this.b, obj, objArr);
            }
            h<?, ?> hVarB = Retrofit.this.b(method);
            return hVarB.a(new d(hVarB, objArr));
        }
    }

    public Retrofit(okhttp3.Call.Factory factory, HttpUrl httpUrl, List<Converter.Factory> list, List<CallAdapter.Factory> list2, @Nullable Executor executor, boolean z) {
        this.b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
        this.g = z;
    }

    private void a(Class<?> cls) {
        f fVarD = f.d();
        for (Method method : cls.getDeclaredMethods()) {
            if (!fVarD.f(method)) {
                b(method);
            }
        }
    }

    public h<?, ?> b(Method method) {
        h hVarA;
        h<?, ?> hVar = this.a.get(method);
        if (hVar != null) {
            return hVar;
        }
        synchronized (this.a) {
            hVarA = this.a.get(method);
            if (hVarA == null) {
                hVarA = new h.a(this, method).a();
                this.a.put(method, hVarA);
            }
        }
        return hVarA;
    }

    public HttpUrl baseUrl() {
        return this.c;
    }

    public CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.e;
    }

    public okhttp3.Call.Factory callFactory() {
        return this.b;
    }

    @Nullable
    public Executor callbackExecutor() {
        return this.f;
    }

    public List<Converter.Factory> converterFactories() {
        return this.d;
    }

    public <T> T create(Class<T> cls) {
        i.r(cls);
        if (this.g) {
            a(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public CallAdapter<?, ?> nextCallAdapter(@Nullable CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        i.b(type, "returnType == null");
        i.b(annotationArr, "annotations == null");
        int iIndexOf = this.e.indexOf(factory) + 1;
        int size = this.e.size();
        for (int i = iIndexOf; i < size; i++) {
            CallAdapter<?, ?> callAdapter = this.e.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, RequestBody> nextRequestBodyConverter(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        i.b(type, "type == null");
        i.b(annotationArr, "parameterAnnotations == null");
        i.b(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.d.indexOf(factory) + 1;
        int size = this.d.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.d.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<ResponseBody, T> nextResponseBodyConverter(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr) {
        i.b(type, "type == null");
        i.b(annotationArr, "annotations == null");
        int iIndexOf = this.d.indexOf(factory) + 1;
        int size = this.d.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.d.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<ResponseBody, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        i.b(type, "type == null");
        i.b(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> converter = (Converter<T, String>) this.d.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return retrofit2.a.d.a;
    }

    public static final class Builder {
        private final f a;

        @Nullable
        private okhttp3.Call.Factory b;
        private HttpUrl c;
        private final List<Converter.Factory> d;
        private final List<CallAdapter.Factory> e;

        @Nullable
        private Executor f;
        private boolean g;

        public Builder(f fVar) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = fVar;
        }

        public Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            this.e.add((CallAdapter.Factory) i.b(factory, "factory == null"));
            return this;
        }

        public Builder addConverterFactory(Converter.Factory factory) {
            this.d.add((Converter.Factory) i.b(factory, "factory == null"));
            return this;
        }

        public Builder baseUrl(String str) {
            i.b(str, "baseUrl == null");
            HttpUrl httpUrl = HttpUrl.parse(str);
            if (httpUrl != null) {
                return baseUrl(httpUrl);
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        public Retrofit build() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            okhttp3.Call.Factory okHttpClient = this.b;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            okhttp3.Call.Factory factory = okHttpClient;
            Executor executorB = this.f;
            if (executorB == null) {
                executorB = this.a.b();
            }
            Executor executor = executorB;
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.add(this.a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.d.size() + 1);
            arrayList2.add(new retrofit2.a());
            arrayList2.addAll(this.d);
            return new Retrofit(factory, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.g);
        }

        public List<CallAdapter.Factory> callAdapterFactories() {
            return this.e;
        }

        public Builder callFactory(okhttp3.Call.Factory factory) {
            this.b = (okhttp3.Call.Factory) i.b(factory, "factory == null");
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            this.f = (Executor) i.b(executor, "executor == null");
            return this;
        }

        public Builder client(OkHttpClient okHttpClient) {
            return callFactory((okhttp3.Call.Factory) i.b(okHttpClient, "client == null"));
        }

        public List<Converter.Factory> converterFactories() {
            return this.d;
        }

        public Builder validateEagerly(boolean z) {
            this.g = z;
            return this;
        }

        public Builder() {
            this(f.d());
        }

        public Builder baseUrl(HttpUrl httpUrl) {
            i.b(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                this.c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public Builder(Retrofit retrofit) {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            this.a = f.d();
            this.b = retrofit.b;
            this.c = retrofit.c;
            arrayList.addAll(retrofit.d);
            arrayList.remove(0);
            arrayList2.addAll(retrofit.e);
            arrayList2.remove(arrayList2.size() - 1);
            this.f = retrofit.f;
            this.g = retrofit.g;
        }
    }
}
