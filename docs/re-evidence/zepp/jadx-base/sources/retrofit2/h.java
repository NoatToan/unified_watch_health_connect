package retrofit2;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes23.dex */
final class h<R, T> {
    private final okhttp3.Call.Factory a;
    private final CallAdapter<R, T> b;
    private final HttpUrl c;
    private final Converter<ResponseBody, R> d;
    private final String e;
    private final String f;
    private final Headers g;
    private final MediaType h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final e<?>[] l;
    public static final Pattern n = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final String m = "[a-zA-Z][a-zA-Z0-9_-]*";
    public static final Pattern o = Pattern.compile(m);

    public static final class a<T, R> {
        public final Retrofit a;
        public final Method b;
        public final Annotation[] c;
        public final Annotation[][] d;
        public final Type[] e;
        public Type f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public String m;
        public boolean n;
        public boolean o;
        public boolean p;
        public String q;
        public Headers r;
        public MediaType s;
        public Set<String> t;
        public e<?>[] u;
        public Converter<ResponseBody, T> v;
        public CallAdapter<T, R> w;

        public a(Retrofit retrofit, Method method) {
            this.a = retrofit;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        private CallAdapter<T, R> b() {
            Type genericReturnType = this.b.getGenericReturnType();
            if (i.k(genericReturnType)) {
                throw d("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            }
            if (genericReturnType == Void.TYPE) {
                throw d("Service methods cannot return void.", new Object[0]);
            }
            try {
                return (CallAdapter<T, R>) this.a.callAdapter(genericReturnType, this.b.getAnnotations());
            } catch (RuntimeException e) {
                throw e(e, "Unable to create call adapter for %s", genericReturnType);
            }
        }

        private Converter<ResponseBody, T> c() {
            try {
                return this.a.responseBodyConverter(this.f, this.b.getAnnotations());
            } catch (RuntimeException e) {
                throw e(e, "Unable to create converter for %s", this.f);
            }
        }

        private RuntimeException d(String str, Object... objArr) {
            return e(null, str, objArr);
        }

        private RuntimeException e(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + this.b.getDeclaringClass().getSimpleName() + "." + this.b.getName(), th);
        }

        private RuntimeException f(int i, String str, Object... objArr) {
            return d(str + " (parameter #" + (i + 1) + ")", objArr);
        }

        private RuntimeException g(Throwable th, int i, String str, Object... objArr) {
            return e(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        private Headers h(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw d("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    MediaType mediaType = MediaType.parse(strTrim);
                    if (mediaType == null) {
                        throw d("Malformed content type: %s", strTrim);
                    }
                    this.s = mediaType;
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        private void i(String str, String str2, boolean z) {
            String str3 = this.m;
            if (str3 != null) {
                throw d("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.m = str;
            this.n = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (h.n.matcher(strSubstring).find()) {
                    throw d("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.q = str2;
            this.t = h.c(str2);
        }

        private void j(Annotation annotation) {
            if (annotation instanceof DELETE) {
                i(FirebasePerformance.HttpMethod.DELETE, ((DELETE) annotation).value(), false);
                return;
            }
            if (annotation instanceof GET) {
                i("GET", ((GET) annotation).value(), false);
                return;
            }
            if (annotation instanceof HEAD) {
                i("HEAD", ((HEAD) annotation).value(), false);
                if (!Void.class.equals(this.f)) {
                    throw d("HEAD method must use Void as response type.", new Object[0]);
                }
                return;
            }
            if (annotation instanceof PATCH) {
                i("PATCH", ((PATCH) annotation).value(), true);
                return;
            }
            if (annotation instanceof POST) {
                i("POST", ((POST) annotation).value(), true);
                return;
            }
            if (annotation instanceof PUT) {
                i(FirebasePerformance.HttpMethod.PUT, ((PUT) annotation).value(), true);
                return;
            }
            if (annotation instanceof OPTIONS) {
                i(FirebasePerformance.HttpMethod.OPTIONS, ((OPTIONS) annotation).value(), false);
                return;
            }
            if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                i(http.method(), http.path(), http.hasBody());
                return;
            }
            if (annotation instanceof retrofit2.http.Headers) {
                String[] strArrValue = ((retrofit2.http.Headers) annotation).value();
                if (strArrValue.length == 0) {
                    throw d("@Headers annotation is empty.", new Object[0]);
                }
                this.r = h(strArrValue);
                return;
            }
            if (annotation instanceof Multipart) {
                if (this.o) {
                    throw d("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.p = true;
            } else if (annotation instanceof FormUrlEncoded) {
                if (this.p) {
                    throw d("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.o = true;
            }
        }

        private e<?> k(int i, Type type, Annotation[] annotationArr) {
            e<?> eVar = null;
            for (Annotation annotation : annotationArr) {
                e<?> eVarL = l(i, type, annotationArr, annotation);
                if (eVarL != null) {
                    if (eVar != null) {
                        throw f(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    eVar = eVarL;
                }
            }
            if (eVar != null) {
                return eVar;
            }
            throw f(i, "No Retrofit annotation found.", new Object[0]);
        }

        private e<?> l(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                if (this.l) {
                    throw f(i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.j) {
                    throw f(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.k) {
                    throw f(i, "A @Url parameter must not come after a @Query", new Object[0]);
                }
                if (this.q != null) {
                    throw f(i, "@Url cannot be used with @%s URL", this.m);
                }
                this.l = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new e.o();
                }
                throw f(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof Path) {
                if (this.k) {
                    throw f(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.l) {
                    throw f(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.q == null) {
                    throw f(i, "@Path can only be used with relative url on @%s", this.m);
                }
                this.j = true;
                Path path = (Path) annotation;
                String strValue = path.value();
                m(i, strValue);
                return new e.j(strValue, this.a.stringConverter(type, annotationArr), path.encoded());
            }
            if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String strValue2 = query.value();
                boolean zEncoded = query.encoded();
                Class<?> clsI = i.i(type);
                this.k = true;
                if (!Iterable.class.isAssignableFrom(clsI)) {
                    return clsI.isArray() ? new e.k(strValue2, this.a.stringConverter(h.b(clsI.getComponentType()), annotationArr), zEncoded).b() : new e.k(strValue2, this.a.stringConverter(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new e.k(strValue2, this.a.stringConverter(i.h(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw f(i, clsI.getSimpleName() + " must include generic type (e.g., " + clsI.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryName) {
                boolean zEncoded2 = ((QueryName) annotation).encoded();
                Class<?> clsI2 = i.i(type);
                this.k = true;
                if (!Iterable.class.isAssignableFrom(clsI2)) {
                    return clsI2.isArray() ? new e.m(this.a.stringConverter(h.b(clsI2.getComponentType()), annotationArr), zEncoded2).b() : new e.m(this.a.stringConverter(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new e.m(this.a.stringConverter(i.h(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw f(i, clsI2.getSimpleName() + " must include generic type (e.g., " + clsI2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryMap) {
                Class<?> clsI3 = i.i(type);
                if (!Map.class.isAssignableFrom(clsI3)) {
                    throw f(i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ = i.j(type, clsI3, Map.class);
                if (!(typeJ instanceof ParameterizedType)) {
                    throw f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeJ;
                Type typeH = i.h(0, parameterizedType);
                if (String.class == typeH) {
                    return new e.l(this.a.stringConverter(i.h(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                }
                throw f(i, "@QueryMap keys must be of type String: " + typeH, new Object[0]);
            }
            if (annotation instanceof Header) {
                String strValue3 = ((Header) annotation).value();
                Class<?> clsI4 = i.i(type);
                if (!Iterable.class.isAssignableFrom(clsI4)) {
                    return clsI4.isArray() ? new e.f(strValue3, this.a.stringConverter(h.b(clsI4.getComponentType()), annotationArr)).b() : new e.f(strValue3, this.a.stringConverter(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new e.f(strValue3, this.a.stringConverter(i.h(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw f(i, clsI4.getSimpleName() + " must include generic type (e.g., " + clsI4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof HeaderMap) {
                Class<?> clsI5 = i.i(type);
                if (!Map.class.isAssignableFrom(clsI5)) {
                    throw f(i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ2 = i.j(type, clsI5, Map.class);
                if (!(typeJ2 instanceof ParameterizedType)) {
                    throw f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeJ2;
                Type typeH2 = i.h(0, parameterizedType2);
                if (String.class == typeH2) {
                    return new e.g(this.a.stringConverter(i.h(1, parameterizedType2), annotationArr));
                }
                throw f(i, "@HeaderMap keys must be of type String: " + typeH2, new Object[0]);
            }
            if (annotation instanceof Field) {
                if (!this.o) {
                    throw f(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Field field = (Field) annotation;
                String strValue4 = field.value();
                boolean zEncoded3 = field.encoded();
                this.g = true;
                Class<?> clsI6 = i.i(type);
                if (!Iterable.class.isAssignableFrom(clsI6)) {
                    return clsI6.isArray() ? new e.d(strValue4, this.a.stringConverter(h.b(clsI6.getComponentType()), annotationArr), zEncoded3).b() : new e.d(strValue4, this.a.stringConverter(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new e.d(strValue4, this.a.stringConverter(i.h(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw f(i, clsI6.getSimpleName() + " must include generic type (e.g., " + clsI6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof FieldMap) {
                if (!this.o) {
                    throw f(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsI7 = i.i(type);
                if (!Map.class.isAssignableFrom(clsI7)) {
                    throw f(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ3 = i.j(type, clsI7, Map.class);
                if (!(typeJ3 instanceof ParameterizedType)) {
                    throw f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeJ3;
                Type typeH3 = i.h(0, parameterizedType3);
                if (String.class == typeH3) {
                    Converter<T, String> converterStringConverter = this.a.stringConverter(i.h(1, parameterizedType3), annotationArr);
                    this.g = true;
                    return new e.C1215e(converterStringConverter, ((FieldMap) annotation).encoded());
                }
                throw f(i, "@FieldMap keys must be of type String: " + typeH3, new Object[0]);
            }
            if (!(annotation instanceof Part)) {
                if (!(annotation instanceof PartMap)) {
                    if (!(annotation instanceof Body)) {
                        return null;
                    }
                    if (this.o || this.p) {
                        throw f(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.i) {
                        throw f(i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        Converter<T, RequestBody> converterRequestBodyConverter = this.a.requestBodyConverter(type, annotationArr, this.c);
                        this.i = true;
                        return new e.c(converterRequestBodyConverter);
                    } catch (RuntimeException e) {
                        throw g(e, i, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!this.p) {
                    throw f(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.h = true;
                Class<?> clsI8 = i.i(type);
                if (!Map.class.isAssignableFrom(clsI8)) {
                    throw f(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ4 = i.j(type, clsI8, Map.class);
                if (!(typeJ4 instanceof ParameterizedType)) {
                    throw f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeJ4;
                Type typeH4 = i.h(0, parameterizedType4);
                if (String.class == typeH4) {
                    Type typeH5 = i.h(1, parameterizedType4);
                    if (MultipartBody.Part.class.isAssignableFrom(i.i(typeH5))) {
                        throw f(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new e.i(this.a.requestBodyConverter(typeH5, annotationArr, this.c), ((PartMap) annotation).encoding());
                }
                throw f(i, "@PartMap keys must be of type String: " + typeH4, new Object[0]);
            }
            if (!this.p) {
                throw f(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            Part part = (Part) annotation;
            this.h = true;
            String strValue5 = part.value();
            Class<?> clsI9 = i.i(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsI9)) {
                    if (clsI9.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsI9.getComponentType())) {
                            return e.n.a.b();
                        }
                        throw f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(clsI9)) {
                        return e.n.a;
                    }
                    throw f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(i.i(i.h(0, (ParameterizedType) type)))) {
                        return e.n.a.c();
                    }
                    throw f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw f(i, clsI9.getSimpleName() + " must include generic type (e.g., " + clsI9.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersOf = Headers.of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", part.encoding());
            if (!Iterable.class.isAssignableFrom(clsI9)) {
                if (!clsI9.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(clsI9)) {
                        throw f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new e.h(headersOf, this.a.requestBodyConverter(type, annotationArr, this.c));
                }
                Class<?> clsB = h.b(clsI9.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(clsB)) {
                    throw f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new e.h(headersOf, this.a.requestBodyConverter(clsB, annotationArr, this.c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeH6 = i.h(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(i.i(typeH6))) {
                    throw f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new e.h(headersOf, this.a.requestBodyConverter(typeH6, annotationArr, this.c)).c();
            }
            throw f(i, clsI9.getSimpleName() + " must include generic type (e.g., " + clsI9.getSimpleName() + "<String>)", new Object[0]);
        }

        private void m(int i, String str) {
            if (!h.o.matcher(str).matches()) {
                throw f(i, "@Path parameter name must match %s. Found: %s", h.n.pattern(), str);
            }
            if (!this.t.contains(str)) {
                throw f(i, "URL \"%s\" does not contain \"{%s}\".", this.q, str);
            }
        }

        public h a() {
            CallAdapter<T, R> callAdapterB = b();
            this.w = callAdapterB;
            Type typeResponseType = callAdapterB.responseType();
            this.f = typeResponseType;
            if (typeResponseType == Response.class || typeResponseType == okhttp3.Response.class) {
                throw d("'" + i.i(this.f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
            }
            this.v = c();
            for (Annotation annotation : this.c) {
                j(annotation);
            }
            if (this.m == null) {
                throw d("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.n) {
                if (this.p) {
                    throw d("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.o) {
                    throw d("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.u = new e[length];
            for (int i = 0; i < length; i++) {
                Type type = this.e[i];
                if (i.k(type)) {
                    throw f(i, "Parameter type must not include a type variable or wildcard: %s", type);
                }
                Annotation[] annotationArr = this.d[i];
                if (annotationArr == null) {
                    throw f(i, "No Retrofit annotation found.", new Object[0]);
                }
                this.u[i] = k(i, type, annotationArr);
            }
            if (this.q == null && !this.l) {
                throw d("Missing either @%s URL or @Url parameter.", this.m);
            }
            boolean z = this.o;
            if (!z && !this.p && !this.n && this.i) {
                throw d("Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.g) {
                throw d("Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.p || this.h) {
                return new h(this);
            }
            throw d("Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    public h(a<R, T> aVar) {
        this.a = aVar.a.callFactory();
        this.b = aVar.w;
        this.c = aVar.a.baseUrl();
        this.d = aVar.v;
        this.e = aVar.m;
        this.f = aVar.q;
        this.g = aVar.r;
        this.h = aVar.s;
        this.i = aVar.n;
        this.j = aVar.o;
        this.k = aVar.p;
        this.l = aVar.u;
    }

    public static Class<?> b(Class<?> cls) {
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

    public static Set<String> c(String str) {
        Matcher matcher = n.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    public T a(Call<R> call) {
        return this.b.adapt(call);
    }

    public okhttp3.Call d(@Nullable Object... objArr) throws IOException {
        g gVar = new g(this.e, this.c, this.f, this.g, this.h, this.i, this.j, this.k);
        e<?>[] eVarArr = this.l;
        int length = objArr != null ? objArr.length : 0;
        if (length == eVarArr.length) {
            for (int i = 0; i < length; i++) {
                eVarArr[i].a(gVar, objArr[i]);
            }
            return this.a.newCall(gVar.g());
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + eVarArr.length + ")");
    }

    public R e(ResponseBody responseBody) throws IOException {
        return this.d.convert(responseBody);
    }
}
