package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class etk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Method, oyl<?>> f17054a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f17055b;
    public final HttpUrl c;
    public final List<dk4.a> d;
    public final List<la3.a> e;
    public final Executor f;
    public final boolean g;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0i f17056a = e0i.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f17057b = new Object[0];
        public final /* synthetic */ Class c;

        public a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f17057b;
            }
            return this.f17056a.i(method) ? this.f17056a.h(method, this.c, obj, objArr) : etk.this.c(method).a(objArr);
        }
    }

    public etk(Call.Factory factory, HttpUrl httpUrl, List<dk4.a> list, List<la3.a> list2, Executor executor, boolean z) {
        this.f17055b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
        this.g = z;
    }

    public la3<?, ?> a(Type type, Annotation[] annotationArr) {
        return e(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        k(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public oyl<?> c(Method method) {
        oyl<?> oylVarB;
        oyl<?> oylVar = this.f17054a.get(method);
        if (oylVar != null) {
            return oylVar;
        }
        synchronized (this.f17054a) {
            try {
                oylVarB = this.f17054a.get(method);
                if (oylVarB == null) {
                    oylVarB = oyl.b(this, method);
                    this.f17054a.put(method, oylVarB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oylVarB;
    }

    public b d() {
        return new b(this);
    }

    public la3<?, ?> e(la3.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.e.indexOf(aVar) + 1;
        int size = this.e.size();
        for (int i = iIndexOf; i < size; i++) {
            la3<?, ?> la3VarA = this.e.get(i).a(type, annotationArr, this);
            if (la3VarA != null) {
                return la3VarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
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

    public <T> dk4<T, RequestBody> f(dk4.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = iIndexOf; i < size; i++) {
            dk4<T, RequestBody> dk4Var = (dk4<T, RequestBody>) this.d.get(i).c(type, annotationArr, annotationArr2, this);
            if (dk4Var != null) {
                return dk4Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
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

    public <T> dk4<ResponseBody, T> g(dk4.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = iIndexOf; i < size; i++) {
            dk4<ResponseBody, T> dk4Var = (dk4<ResponseBody, T>) this.d.get(i).d(type, annotationArr, this);
            if (dk4Var != null) {
                return dk4Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
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

    public <T> dk4<T, RequestBody> h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return f(null, type, annotationArr, annotationArr2);
    }

    public <T> dk4<ResponseBody, T> i(Type type, Annotation[] annotationArr) {
        return g(null, type, annotationArr);
    }

    public <T> dk4<T, String> j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            dk4<T, String> dk4Var = (dk4<T, String>) this.d.get(i).e(type, annotationArr, this);
            if (dk4Var != null) {
                return dk4Var;
            }
        }
        return g63.d.f18640a;
    }

    public final void k(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.g) {
            e0i e0iVarG = e0i.g();
            for (Method method : cls.getDeclaredMethods()) {
                if (!e0iVarG.i(method) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0i f17058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Call.Factory f17059b;
        public HttpUrl c;
        public final List<dk4.a> d;
        public final List<la3.a> e;
        public Executor f;
        public boolean g;

        public b(e0i e0iVar) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f17058a = e0iVar;
        }

        public b a(la3.a aVar) {
            List<la3.a> list = this.e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(dk4.a aVar) {
            List<dk4.a> list = this.d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(HttpUrl.get(str));
        }

        public b d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                this.c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public etk e() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f17059b;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executorC = this.f;
            if (executorC == null) {
                executorC = this.f17058a.c();
            }
            Executor executor = executorC;
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.addAll(this.f17058a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.f17058a.e());
            arrayList2.add(new g63());
            arrayList2.addAll(this.d);
            arrayList2.addAll(this.f17058a.d());
            return new etk(factory, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.g);
        }

        public b f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f17059b = factory;
            return this;
        }

        public b g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }

        public b() {
            this(e0i.g());
        }

        public b(etk etkVar) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            e0i e0iVarG = e0i.g();
            this.f17058a = e0iVarG;
            this.f17059b = etkVar.f17055b;
            this.c = etkVar.c;
            int size = etkVar.d.size() - e0iVarG.e();
            for (int i = 1; i < size; i++) {
                this.d.add(etkVar.d.get(i));
            }
            int size2 = etkVar.e.size() - this.f17058a.b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.e.add(etkVar.e.get(i2));
            }
            this.f = etkVar.f;
            this.g = etkVar.g;
        }
    }
}
