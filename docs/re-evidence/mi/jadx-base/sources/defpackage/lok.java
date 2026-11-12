package defpackage;

import com.miui.tsmclient.common.net.request.BaseRequest;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class lok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f25274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f25275b;
    public final String c;
    public final String d;
    public final Headers e;
    public final MediaType f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final zjh<?>[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f25276k;

    public static final class a {
        public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final etk f25277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f25278b;
        public final Annotation[] c;
        public final Annotation[][] d;
        public final Type[] e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f25279k;
        public boolean l;
        public boolean m;
        public String n;
        public boolean o;
        public boolean p;
        public boolean q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f25280r;
        public Headers s;
        public MediaType t;
        public Set<String> u;
        public zjh<?>[] v;
        public boolean w;

        public a(etk etkVar, Method method) {
            this.f25277a = etkVar;
            this.f25278b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public lok b() {
            for (Annotation annotation : this.c) {
                e(annotation);
            }
            if (this.n == null) {
                throw kmq.m(this.f25278b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.o) {
                if (this.q) {
                    throw kmq.m(this.f25278b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.p) {
                    throw kmq.m(this.f25278b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.v = new zjh[length];
            int i = length - 1;
            int i2 = 0;
            while (i2 < length) {
                this.v[i2] = f(i2, this.e[i2], this.d[i2], i2 == i);
                i2++;
            }
            if (this.f25280r == null && !this.m) {
                throw kmq.m(this.f25278b, "Missing either @%s URL or @Url parameter.", this.n);
            }
            boolean z = this.p;
            if (!z && !this.q && !this.o && this.h) {
                throw kmq.m(this.f25278b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f) {
                throw kmq.m(this.f25278b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.q || this.g) {
                return new lok(this);
            }
            throw kmq.m(this.f25278b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final Headers c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw kmq.m(this.f25278b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.t = MediaType.get(strTrim);
                    } catch (IllegalArgumentException e) {
                        throw kmq.n(this.f25278b, e, "Malformed content type: %s", strTrim);
                    }
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        public final void d(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 != null) {
                throw kmq.m(this.f25278b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (x.matcher(strSubstring).find()) {
                    throw kmq.m(this.f25278b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f25280r = str2;
            this.u = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof rf5) {
                d("DELETE", ((rf5) annotation).value(), false);
                return;
            }
            if (annotation instanceof uua) {
                d("GET", ((uua) annotation).value(), false);
                return;
            }
            if (annotation instanceof tcb) {
                d("HEAD", ((tcb) annotation).value(), false);
                return;
            }
            if (annotation instanceof qfh) {
                d(BaseRequest.Method.PATCH, ((qfh) annotation).value(), true);
                return;
            }
            if (annotation instanceof ngh) {
                d("POST", ((ngh) annotation).value(), true);
                return;
            }
            if (annotation instanceof ygh) {
                d("PUT", ((ygh) annotation).value(), true);
                return;
            }
            if (annotation instanceof c3h) {
                d("OPTIONS", ((c3h) annotation).value(), false);
                return;
            }
            if (annotation instanceof wdb) {
                wdb wdbVar = (wdb) annotation;
                d(wdbVar.method(), wdbVar.path(), wdbVar.hasBody());
                return;
            }
            if (annotation instanceof emb) {
                String[] strArrValue = ((emb) annotation).value();
                if (strArrValue.length == 0) {
                    throw kmq.m(this.f25278b, "@Headers annotation is empty.", new Object[0]);
                }
                this.s = c(strArrValue);
                return;
            }
            if (annotation instanceof pag) {
                if (this.p) {
                    throw kmq.m(this.f25278b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.q = true;
            } else if (annotation instanceof u0a) {
                if (this.q) {
                    throw kmq.m(this.f25278b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.p = true;
            }
        }

        public final zjh<?> f(int i, Type type, Annotation[] annotationArr, boolean z) {
            zjh<?> zjhVar;
            if (annotationArr != null) {
                zjhVar = null;
                for (Annotation annotation : annotationArr) {
                    zjh<?> zjhVarG = g(i, type, annotationArr, annotation);
                    if (zjhVarG != null) {
                        if (zjhVar != null) {
                            throw kmq.o(this.f25278b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        zjhVar = zjhVarG;
                    }
                }
            } else {
                zjhVar = null;
            }
            if (zjhVar != null) {
                return zjhVar;
            }
            if (z) {
                try {
                    if (kmq.h(type) == Continuation.class) {
                        this.w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw kmq.o(this.f25278b, i, "No Retrofit annotation found.", new Object[0]);
        }

        public final zjh<?> g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof kdq) {
                j(i, type);
                if (this.m) {
                    throw kmq.o(this.f25278b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.i) {
                    throw kmq.o(this.f25278b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.j) {
                    throw kmq.o(this.f25278b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f25279k) {
                    throw kmq.o(this.f25278b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw kmq.o(this.f25278b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f25280r != null) {
                    throw kmq.o(this.f25278b, i, "@Url cannot be used with @%s URL", this.n);
                }
                this.m = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new zjh.p(this.f25278b, i);
                }
                throw kmq.o(this.f25278b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof plh) {
                j(i, type);
                if (this.j) {
                    throw kmq.o(this.f25278b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f25279k) {
                    throw kmq.o(this.f25278b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw kmq.o(this.f25278b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.m) {
                    throw kmq.o(this.f25278b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f25280r == null) {
                    throw kmq.o(this.f25278b, i, "@Path can only be used with relative url on @%s", this.n);
                }
                this.i = true;
                plh plhVar = (plh) annotation;
                String strValue = plhVar.value();
                i(i, strValue);
                return new zjh.k(this.f25278b, i, strValue, this.f25277a.j(type, annotationArr), plhVar.encoded());
            }
            if (annotation instanceof xfi) {
                j(i, type);
                xfi xfiVar = (xfi) annotation;
                String strValue2 = xfiVar.value();
                boolean zEncoded = xfiVar.encoded();
                Class<?> clsH = kmq.h(type);
                this.j = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new zjh.l(strValue2, this.f25277a.j(type, annotationArr), zEncoded);
                    }
                    return new zjh.l(strValue2, this.f25277a.j(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new zjh.l(strValue2, this.f25277a.j(kmq.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw kmq.o(this.f25278b, i, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof zfi) {
                j(i, type);
                boolean zEncoded2 = ((zfi) annotation).encoded();
                Class<?> clsH2 = kmq.h(type);
                this.f25279k = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new zjh.n(this.f25277a.j(type, annotationArr), zEncoded2);
                    }
                    return new zjh.n(this.f25277a.j(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new zjh.n(this.f25277a.j(kmq.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw kmq.o(this.f25278b, i, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof yfi) {
                j(i, type);
                Class<?> clsH3 = kmq.h(type);
                this.l = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw kmq.o(this.f25278b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = kmq.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw kmq.o(this.f25278b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = kmq.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new zjh.m(this.f25278b, i, this.f25277a.j(kmq.g(1, parameterizedType), annotationArr), ((yfi) annotation).encoded());
                }
                throw kmq.o(this.f25278b, i, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof zlb) {
                j(i, type);
                String strValue3 = ((zlb) annotation).value();
                Class<?> clsH4 = kmq.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new zjh.f(strValue3, this.f25277a.j(type, annotationArr));
                    }
                    return new zjh.f(strValue3, this.f25277a.j(a(clsH4.getComponentType()), annotationArr)).b();
                }
                if (type instanceof ParameterizedType) {
                    return new zjh.f(strValue3, this.f25277a.j(kmq.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw kmq.o(this.f25278b, i, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof bmb) {
                if (type == Headers.class) {
                    return new zjh.h(this.f25278b, i);
                }
                j(i, type);
                Class<?> clsH5 = kmq.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw kmq.o(this.f25278b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeI2 = kmq.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw kmq.o(this.f25278b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = kmq.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new zjh.g(this.f25278b, i, this.f25277a.j(kmq.g(1, parameterizedType2), annotationArr));
                }
                throw kmq.o(this.f25278b, i, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof zk9) {
                j(i, type);
                if (!this.p) {
                    throw kmq.o(this.f25278b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                zk9 zk9Var = (zk9) annotation;
                String strValue4 = zk9Var.value();
                boolean zEncoded3 = zk9Var.encoded();
                this.f = true;
                Class<?> clsH6 = kmq.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new zjh.d(strValue4, this.f25277a.j(type, annotationArr), zEncoded3);
                    }
                    return new zjh.d(strValue4, this.f25277a.j(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new zjh.d(strValue4, this.f25277a.j(kmq.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw kmq.o(this.f25278b, i, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof dl9) {
                j(i, type);
                if (!this.p) {
                    throw kmq.o(this.f25278b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = kmq.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw kmq.o(this.f25278b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = kmq.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw kmq.o(this.f25278b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = kmq.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    dk4 dk4VarJ = this.f25277a.j(kmq.g(1, parameterizedType3), annotationArr);
                    this.f = true;
                    return new zjh.e(this.f25278b, i, dk4VarJ, ((dl9) annotation).encoded());
                }
                throw kmq.o(this.f25278b, i, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof dlh)) {
                if (annotation instanceof elh) {
                    j(i, type);
                    if (!this.q) {
                        throw kmq.o(this.f25278b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.g = true;
                    Class<?> clsH8 = kmq.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw kmq.o(this.f25278b, i, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = kmq.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw kmq.o(this.f25278b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = kmq.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = kmq.g(1, parameterizedType4);
                        if (MultipartBody.Part.class.isAssignableFrom(kmq.h(typeG5))) {
                            throw kmq.o(this.f25278b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new zjh.j(this.f25278b, i, this.f25277a.h(typeG5, annotationArr, this.c), ((elh) annotation).encoding());
                    }
                    throw kmq.o(this.f25278b, i, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof g43) {
                    j(i, type);
                    if (this.p || this.q) {
                        throw kmq.o(this.f25278b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.h) {
                        throw kmq.o(this.f25278b, i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        dk4 dk4VarH = this.f25277a.h(type, annotationArr, this.c);
                        this.h = true;
                        return new zjh.c(this.f25278b, i, dk4VarH);
                    } catch (RuntimeException e) {
                        throw kmq.p(this.f25278b, e, i, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof szo)) {
                    return null;
                }
                j(i, type);
                Class<?> clsH9 = kmq.h(type);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    zjh<?> zjhVar = this.v[i2];
                    if ((zjhVar instanceof zjh.q) && ((zjh.q) zjhVar).f41377a.equals(clsH9)) {
                        throw kmq.o(this.f25278b, i, "@Tag type " + clsH9.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new zjh.q(clsH9);
            }
            j(i, type);
            if (!this.q) {
                throw kmq.o(this.f25278b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            dlh dlhVar = (dlh) annotation;
            this.g = true;
            String strValue5 = dlhVar.value();
            Class<?> clsH10 = kmq.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH10)) {
                    if (clsH10.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsH10.getComponentType())) {
                            return zjh.o.f41374a.b();
                        }
                        throw kmq.o(this.f25278b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(clsH10)) {
                        return zjh.o.f41374a;
                    }
                    throw kmq.o(this.f25278b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(kmq.h(kmq.g(0, (ParameterizedType) type)))) {
                        return zjh.o.f41374a.c();
                    }
                    throw kmq.o(this.f25278b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw kmq.o(this.f25278b, i, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersOf = Headers.of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", dlhVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH10)) {
                if (!clsH10.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(clsH10)) {
                        throw kmq.o(this.f25278b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new zjh.i(this.f25278b, i, headersOf, this.f25277a.h(type, annotationArr, this.c));
                }
                Class<?> clsA = a(clsH10.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                    throw kmq.o(this.f25278b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new zjh.i(this.f25278b, i, headersOf, this.f25277a.h(clsA, annotationArr, this.c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = kmq.g(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(kmq.h(typeG6))) {
                    throw kmq.o(this.f25278b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new zjh.i(this.f25278b, i, headersOf, this.f25277a.h(typeG6, annotationArr, this.c)).c();
            }
            throw kmq.o(this.f25278b, i, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void i(int i, String str) {
            if (!y.matcher(str).matches()) {
                throw kmq.o(this.f25278b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), str);
            }
            if (!this.u.contains(str)) {
                throw kmq.o(this.f25278b, i, "URL \"%s\" does not contain \"{%s}\".", this.f25280r, str);
            }
        }

        public final void j(int i, Type type) {
            if (kmq.j(type)) {
                throw kmq.o(this.f25278b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public lok(a aVar) {
        this.f25274a = aVar.f25278b;
        this.f25275b = aVar.f25277a.c;
        this.c = aVar.n;
        this.d = aVar.f25280r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.f25276k = aVar.w;
    }

    public static lok b(etk etkVar, Method method) {
        return new a(etkVar, method).b();
    }

    public Request a(Object[] objArr) throws IOException {
        zjh<?>[] zjhVarArr = this.j;
        int length = objArr.length;
        if (length != zjhVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + zjhVarArr.length + ")");
        }
        dnk dnkVar = new dnk(this.c, this.f25275b, this.d, this.e, this.f, this.g, this.h, this.i);
        if (this.f25276k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            zjhVarArr[i].a(dnkVar, objArr[i]);
        }
        return dnkVar.k().tag(yhd.class, new yhd(this.f25274a, arrayList)).build();
    }
}
