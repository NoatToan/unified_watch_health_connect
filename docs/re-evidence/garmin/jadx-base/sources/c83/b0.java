package c83;

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
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Method, Object> f25754a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f25755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f25756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h.a> f25757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e.a> f25759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f25761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25762i;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f25763a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f25764b;

        public a(Class cls) {
            this.f25764b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f25763a;
            }
            x xVar = w.f25882b;
            boolean zC = xVar.c(method);
            Class<?> cls = this.f25764b;
            return zC ? xVar.b(method, cls, obj, objArr) : b0.this.c(cls, method).a(obj, objArr);
        }
    }

    public b0(Call.Factory factory, HttpUrl httpUrl, List<h.a> list, int i14, List<e.a> list2, int i15, Executor executor, boolean z14) {
        this.f25755b = factory;
        this.f25756c = httpUrl;
        this.f25757d = list;
        this.f25758e = i14;
        this.f25759f = list2;
        this.f25760g = i15;
        this.f25761h = executor;
        this.f25762i = z14;
    }

    public final e<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<e.a> list = this.f25759f;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i14 = iIndexOf; i14 < size; i14++) {
            e<?, ?> eVarA = list.get(i14).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate call adapter for ");
        sb3.append(type);
        sb3.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (!cls.isInterface()) {
            vb.h.s("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb3 = new StringBuilder("Type parameters are unsupported on ");
                sb3.append(cls2.getName());
                if (cls2 != cls) {
                    sb3.append(" which is an interface of ");
                    sb3.append(cls.getName());
                }
                throw new IllegalArgumentException(sb3.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f25762i) {
            x xVar = w.f25882b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!xVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final c0<?> c(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f25754a.get(method);
            if (objPutIfAbsent instanceof c0) {
                return (c0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f25754a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                k kVarB = c0.b(this, cls, method);
                                this.f25754a.put(method, kVarB);
                                return kVarB;
                            } catch (Throwable th3) {
                                this.f25754a.remove(method);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f25754a.get(method);
                    if (obj2 != null) {
                        return (c0) obj2;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    public final h d(sd1.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<h.a> list = this.f25757d;
        int iIndexOf = list.indexOf(aVar) + 1;
        int size = list.size();
        for (int i14 = iIndexOf; i14 < size; i14++) {
            h<?, RequestBody> hVarA = list.get(i14).a(type, annotationArr, annotationArr2, this);
            if (hVarA != null) {
                return hVarA;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate RequestBody converter for ");
        sb3.append(type);
        sb3.append(".\n");
        if (aVar != null) {
            sb3.append("  Skipped:");
            for (int i15 = 0; i15 < iIndexOf; i15++) {
                sb3.append("\n   * ");
                sb3.append(list.get(i15).getClass().getName());
            }
            sb3.append('\n');
        }
        sb3.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public final <T> h<ResponseBody, T> e(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<h.a> list = this.f25757d;
        int iIndexOf = list.indexOf(aVar) + 1;
        int size = list.size();
        for (int i14 = iIndexOf; i14 < size; i14++) {
            h<ResponseBody, T> hVar = (h<ResponseBody, T>) list.get(i14).b(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb3.append(type);
        sb3.append(".\n");
        if (aVar != null) {
            sb3.append("  Skipped:");
            for (int i15 = 0; i15 < iIndexOf; i15++) {
                sb3.append("\n   * ");
                sb3.append(list.get(i15).getClass().getName());
            }
            sb3.append('\n');
        }
        sb3.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public final c83.b.d f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<h.a> list = this.f25757d;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            list.get(i14).getClass();
        }
        return c83.b.d.f25751a;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Call.Factory f25766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HttpUrl f25767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f25768c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f25769d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Executor f25770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f25771f;

        public b(b0 b0Var) {
            Call.Factory factory = b0Var.f25755b;
            List<e.a> list = b0Var.f25759f;
            this.f25766a = factory;
            this.f25767b = b0Var.f25756c;
            List<h.a> list2 = b0Var.f25757d;
            int size = list2.size() - b0Var.f25758e;
            for (int i14 = 1; i14 < size; i14++) {
                this.f25768c.add(list2.get(i14));
            }
            int size2 = list.size() - b0Var.f25760g;
            for (int i15 = 0; i15 < size2; i15++) {
                this.f25769d.add(list.get(i15));
            }
            this.f25770e = b0Var.f25761h;
            this.f25771f = b0Var.f25762i;
        }

        public final void a(h.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f25768c.add(aVar);
        }

        public final void b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            HttpUrl httpUrl = HttpUrl.get(str);
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                this.f25767b = httpUrl;
            } else {
                com.google.firebase.messaging.l.j(httpUrl, "baseUrl must end in /: ");
            }
        }

        public final b0 c() {
            if (this.f25767b == null) {
                vb.h.z("Base URL required.");
                return null;
            }
            Call.Factory okHttpClient = this.f25766a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = this.f25770e;
            if (executor == null) {
                executor = w.f25881a;
            }
            Executor executor2 = executor;
            c cVar = w.f25883c;
            ArrayList arrayList = new ArrayList(this.f25769d);
            List<? extends e.a> listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List<? extends h.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = this.f25768c;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
            arrayList3.add(new c83.b());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(listB);
            return new b0(factory, this.f25767b, Collections.unmodifiableList(arrayList3), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f25771f);
        }

        public final void d(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            this.f25766a = okHttpClient;
        }

        public b() {
        }
    }
}
