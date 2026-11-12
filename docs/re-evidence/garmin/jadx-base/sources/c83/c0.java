package c83;

import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c0<T> {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static k b(b0 b0Var, Class cls, Method method) {
        Method method2;
        Type genericReturnType;
        boolean z14;
        boolean z15;
        v<?> vVar;
        int i14;
        Type type;
        Annotation[] annotationArr;
        int i15;
        int i16;
        v<?>[] vVarArr;
        String str;
        v<?> gVar;
        v<?> oVar;
        v<?> uVar;
        v<?> bVar;
        z.a aVar = new z.a(b0Var, cls, method);
        Annotation[] annotationArr2 = aVar.f25916d;
        int length = annotationArr2.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            String str2 = FirebasePerformance.HttpMethod.HEAD;
            boolean z16 = true;
            Method method3 = aVar.f25915c;
            if (i18 >= length) {
                if (aVar.f25927o == null) {
                    throw f0.i(method3, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar.f25928p) {
                    if (aVar.f25930r) {
                        throw f0.i(method3, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar.f25929q) {
                        throw f0.i(method3, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = aVar.f25917e;
                int length2 = annotationArr3.length;
                aVar.f25935w = new v[length2];
                int i19 = length2 - 1;
                int i24 = 0;
                while (i24 < length2) {
                    v<?>[] vVarArr2 = aVar.f25935w;
                    Type type2 = aVar.f25918f[i24];
                    Annotation[] annotationArr4 = annotationArr3[i24];
                    int i25 = i24 == i19 ? 1 : i17;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i26 = i17;
                        vVar = null;
                        while (i26 < length3) {
                            Annotation annotation = annotationArr4[i26];
                            Annotation[][] annotationArr5 = annotationArr3;
                            int i27 = length2;
                            if (annotation instanceof i83.y) {
                                aVar.c(i24, type2);
                                if (aVar.f25926n) {
                                    throw f0.j(method3, i24, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar.f25922j) {
                                    throw f0.j(method3, i24, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.f25923k) {
                                    throw f0.j(method3, i24, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.f25924l) {
                                    throw f0.j(method3, i24, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.f25925m) {
                                    throw f0.j(method3, i24, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.f25931s != null) {
                                    throw f0.j(method3, i24, "@Url cannot be used with @%s URL", aVar.f25927o);
                                }
                                aVar.f25926n = true;
                                if (type2 != HttpUrl.class && type2 != String.class && type2 != URI.class && (!(type2 instanceof Class) || !"android.net.Uri".equals(((Class) type2).getName()))) {
                                    throw f0.j(method3, i24, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                gVar = new v.n(method3, i24);
                                str = str2;
                                i14 = i19;
                                vVarArr = vVarArr2;
                                type = type2;
                                annotationArr = annotationArr4;
                                i15 = length3;
                                i16 = i26;
                            } else {
                                i14 = i19;
                                boolean z17 = annotation instanceof i83.s;
                                b0 b0Var2 = aVar.f25913a;
                                if (z17) {
                                    aVar.c(i24, type2);
                                    if (aVar.f25923k) {
                                        throw f0.j(method3, i24, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar.f25924l) {
                                        throw f0.j(method3, i24, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar.f25925m) {
                                        throw f0.j(method3, i24, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar.f25926n) {
                                        throw f0.j(method3, i24, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar.f25931s == null) {
                                        throw f0.j(method3, i24, "@Path can only be used with relative url on @%s", aVar.f25927o);
                                    }
                                    aVar.f25922j = true;
                                    i83.s sVar = (i83.s) annotation;
                                    String strValue = sVar.value();
                                    if (!z.a.f25912z.matcher(strValue).matches()) {
                                        throw f0.j(method3, i24, "@Path parameter name must match %s. Found: %s", z.a.f25911y.pattern(), strValue);
                                    }
                                    if (!aVar.f25934v.contains(strValue)) {
                                        throw f0.j(method3, i24, "URL \"%s\" does not contain \"{%s}\".", aVar.f25931s, strValue);
                                    }
                                    i15 = length3;
                                    i16 = i26;
                                    vVarArr = vVarArr2;
                                    gVar = new v.i(aVar.f25915c, i24, strValue, b0Var2.f(type2, annotationArr4), sVar.encoded());
                                    type = type2;
                                    annotationArr = annotationArr4;
                                    str = str2;
                                } else {
                                    v<?>[] vVarArr3 = vVarArr2;
                                    type = type2;
                                    annotationArr = annotationArr4;
                                    i15 = length3;
                                    i16 = i26;
                                    vVarArr = vVarArr3;
                                    if (annotation instanceof i83.t) {
                                        aVar.c(i24, type);
                                        i83.t tVar = (i83.t) annotation;
                                        String strValue2 = tVar.value();
                                        boolean zEncoded = tVar.encoded();
                                        Class<?> clsE = f0.e(type);
                                        str = str2;
                                        aVar.f25923k = true;
                                        if (!Iterable.class.isAssignableFrom(clsE)) {
                                            gVar = clsE.isArray() ? new u(new v.j(strValue2, b0Var2.f(z.a.a(clsE.getComponentType()), annotationArr), zEncoded)) : new v.j(strValue2, b0Var2.f(type, annotationArr), zEncoded);
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw f0.j(method3, i24, clsE.getSimpleName() + " must include generic type (e.g., " + clsE.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            gVar = new t(new v.j(strValue2, b0Var2.f(f0.d(0, (ParameterizedType) type), annotationArr), zEncoded));
                                        }
                                    } else {
                                        str = str2;
                                        if (annotation instanceof i83.v) {
                                            aVar.c(i24, type);
                                            boolean zEncoded2 = ((i83.v) annotation).encoded();
                                            Class<?> clsE2 = f0.e(type);
                                            aVar.f25924l = true;
                                            if (Iterable.class.isAssignableFrom(clsE2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw f0.j(method3, i24, clsE2.getSimpleName() + " must include generic type (e.g., " + clsE2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                gVar = new t(new v.l(b0Var2.f(f0.d(0, (ParameterizedType) type), annotationArr), zEncoded2));
                                            } else if (clsE2.isArray()) {
                                                gVar = new u(new v.l(b0Var2.f(z.a.a(clsE2.getComponentType()), annotationArr), zEncoded2));
                                            } else {
                                                bVar = new v.l<>(b0Var2.f(type, annotationArr), zEncoded2);
                                                gVar = bVar;
                                            }
                                        } else {
                                            if (annotation instanceof i83.u) {
                                                aVar.c(i24, type);
                                                Class<?> clsE3 = f0.e(type);
                                                aVar.f25925m = true;
                                                if (!Map.class.isAssignableFrom(clsE3)) {
                                                    throw f0.j(method3, i24, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeF = f0.f(type, clsE3);
                                                if (!(typeF instanceof ParameterizedType)) {
                                                    throw f0.j(method3, i24, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeF;
                                                Type typeD = f0.d(0, parameterizedType);
                                                if (String.class != typeD) {
                                                    throw f0.j(method3, i24, n23.j.h("@QueryMap keys must be of type String: ", typeD), new Object[0]);
                                                }
                                                bVar = new v.k<>(method3, i24, b0Var2.f(f0.d(1, parameterizedType), annotationArr), ((i83.u) annotation).encoded());
                                            } else if (annotation instanceof i83.i) {
                                                aVar.c(i24, type);
                                                i83.i iVar = (i83.i) annotation;
                                                String strValue3 = iVar.value();
                                                Class<?> clsE4 = f0.e(type);
                                                if (Iterable.class.isAssignableFrom(clsE4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw f0.j(method3, i24, clsE4.getSimpleName() + " must include generic type (e.g., " + clsE4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    uVar = new t(new v.d(strValue3, b0Var2.f(f0.d(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()));
                                                } else if (clsE4.isArray()) {
                                                    uVar = new u(new v.d(strValue3, b0Var2.f(z.a.a(clsE4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()));
                                                } else {
                                                    bVar = new v.d<>(strValue3, b0Var2.f(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                                                }
                                                gVar = uVar;
                                            } else if (!(annotation instanceof i83.j)) {
                                                if (annotation instanceof i83.c) {
                                                    aVar.c(i24, type);
                                                    if (!aVar.f25929q) {
                                                        throw f0.j(method3, i24, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                    i83.c cVar = (i83.c) annotation;
                                                    String strValue4 = cVar.value();
                                                    boolean zEncoded3 = cVar.encoded();
                                                    aVar.f25919g = true;
                                                    Class<?> clsE5 = f0.e(type);
                                                    if (Iterable.class.isAssignableFrom(clsE5)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw f0.j(method3, i24, clsE5.getSimpleName() + " must include generic type (e.g., " + clsE5.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        uVar = new t(new v.b(strValue4, b0Var2.f(f0.d(0, (ParameterizedType) type), annotationArr), zEncoded3));
                                                    } else if (clsE5.isArray()) {
                                                        uVar = new u(new v.b(strValue4, b0Var2.f(z.a.a(clsE5.getComponentType()), annotationArr), zEncoded3));
                                                    } else {
                                                        bVar = new v.b<>(strValue4, b0Var2.f(type, annotationArr), zEncoded3);
                                                    }
                                                } else if (annotation instanceof i83.d) {
                                                    aVar.c(i24, type);
                                                    if (!aVar.f25929q) {
                                                        throw f0.j(method3, i24, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                    Class<?> clsE6 = f0.e(type);
                                                    if (!Map.class.isAssignableFrom(clsE6)) {
                                                        throw f0.j(method3, i24, "@FieldMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeF2 = f0.f(type, clsE6);
                                                    if (!(typeF2 instanceof ParameterizedType)) {
                                                        throw f0.j(method3, i24, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeF2;
                                                    Type typeD2 = f0.d(0, parameterizedType2);
                                                    if (String.class != typeD2) {
                                                        throw f0.j(method3, i24, n23.j.h("@FieldMap keys must be of type String: ", typeD2), new Object[0]);
                                                    }
                                                    b.d dVarF = b0Var2.f(f0.d(1, parameterizedType2), annotationArr);
                                                    aVar.f25919g = true;
                                                    gVar = new v.c<>(method3, i24, dVarF, ((i83.d) annotation).encoded());
                                                } else if (annotation instanceof i83.q) {
                                                    aVar.c(i24, type);
                                                    if (!aVar.f25930r) {
                                                        throw f0.j(method3, i24, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    i83.q qVar = (i83.q) annotation;
                                                    aVar.f25920h = true;
                                                    String strValue5 = qVar.value();
                                                    Class<?> clsE7 = f0.e(type);
                                                    if (!strValue5.isEmpty()) {
                                                        Headers headersOf = Headers.of(HttpHeaders.CONTENT_DISPOSITION, am.j.m("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                        if (Iterable.class.isAssignableFrom(clsE7)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw f0.j(method3, i24, clsE7.getSimpleName() + " must include generic type (e.g., " + clsE7.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            Type typeD3 = f0.d(0, (ParameterizedType) type);
                                                            if (MultipartBody.Part.class.isAssignableFrom(f0.e(typeD3))) {
                                                                throw f0.j(method3, i24, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            oVar = new t(new v.g(method3, i24, headersOf, b0Var2.d(null, typeD3, annotationArr, annotationArr2)));
                                                            gVar = oVar;
                                                        } else if (clsE7.isArray()) {
                                                            Class<?> clsA = z.a.a(clsE7.getComponentType());
                                                            if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                                                                throw f0.j(method3, i24, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            uVar = new u(new v.g(method3, i24, headersOf, b0Var2.d(null, clsA, annotationArr, annotationArr2)));
                                                        } else {
                                                            if (MultipartBody.Part.class.isAssignableFrom(clsE7)) {
                                                                throw f0.j(method3, i24, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            gVar = new v.g(method3, i24, headersOf, b0Var2.d(null, type, annotationArr, annotationArr2));
                                                        }
                                                    } else if (Iterable.class.isAssignableFrom(clsE7)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw f0.j(method3, i24, clsE7.getSimpleName() + " must include generic type (e.g., " + clsE7.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!MultipartBody.Part.class.isAssignableFrom(f0.e(f0.d(0, (ParameterizedType) type)))) {
                                                            throw f0.j(method3, i24, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        v.m mVar = v.m.f25877a;
                                                        mVar.getClass();
                                                        gVar = new t(mVar);
                                                    } else if (clsE7.isArray()) {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsE7.getComponentType())) {
                                                            throw f0.j(method3, i24, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        v.m mVar2 = v.m.f25877a;
                                                        mVar2.getClass();
                                                        gVar = new u(mVar2);
                                                    } else {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsE7)) {
                                                            throw f0.j(method3, i24, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        uVar = v.m.f25877a;
                                                    }
                                                } else {
                                                    if (annotation instanceof i83.r) {
                                                        aVar.c(i24, type);
                                                        if (!aVar.f25930r) {
                                                            throw f0.j(method3, i24, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        aVar.f25920h = true;
                                                        Class<?> clsE8 = f0.e(type);
                                                        if (!Map.class.isAssignableFrom(clsE8)) {
                                                            throw f0.j(method3, i24, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeF3 = f0.f(type, clsE8);
                                                        if (!(typeF3 instanceof ParameterizedType)) {
                                                            throw f0.j(method3, i24, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) typeF3;
                                                        Type typeD4 = f0.d(0, parameterizedType3);
                                                        if (String.class != typeD4) {
                                                            throw f0.j(method3, i24, n23.j.h("@PartMap keys must be of type String: ", typeD4), new Object[0]);
                                                        }
                                                        Type typeD5 = f0.d(1, parameterizedType3);
                                                        if (MultipartBody.Part.class.isAssignableFrom(f0.e(typeD5))) {
                                                            throw f0.j(method3, i24, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                        }
                                                        oVar = new v.h<>(method3, i24, b0Var2.d(null, typeD5, annotationArr, annotationArr2), ((i83.r) annotation).encoding());
                                                    } else if (annotation instanceof i83.a) {
                                                        aVar.c(i24, type);
                                                        if (aVar.f25929q || aVar.f25930r) {
                                                            throw f0.j(method3, i24, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                        }
                                                        if (aVar.f25921i) {
                                                            throw f0.j(method3, i24, "Multiple @Body method annotations found.", new Object[0]);
                                                        }
                                                        try {
                                                            h hVarD = b0Var2.d(null, type, annotationArr, annotationArr2);
                                                            aVar.f25921i = true;
                                                            oVar = new v.a<>(method3, i24, hVarD);
                                                        } catch (RuntimeException e4) {
                                                            throw f0.k(method3, e4, i24, "Unable to create @Body converter for %s", type);
                                                        }
                                                    } else if (annotation instanceof i83.x) {
                                                        aVar.c(i24, type);
                                                        Class<?> clsA2 = z.a.a(f0.e(type));
                                                        for (int i28 = i24 - 1; i28 >= 0; i28--) {
                                                            v<?> vVar2 = aVar.f25935w[i28];
                                                            if ((vVar2 instanceof v.o) && ((v.o) vVar2).f25880a.equals(clsA2)) {
                                                                StringBuilder sb3 = new StringBuilder("@Tag type ");
                                                                androidx.core.view.j.o(clsA2, sb3, " is duplicate of ");
                                                                sb3.append(w.f25882b.a(method3, i28));
                                                                sb3.append(" and would always overwrite its value.");
                                                                throw f0.j(method3, i24, sb3.toString(), new Object[0]);
                                                            }
                                                        }
                                                        oVar = new v.o<>(clsA2);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    gVar = oVar;
                                                }
                                                gVar = uVar;
                                            } else if (type == Headers.class) {
                                                uVar = new v.f(method3, i24);
                                                gVar = uVar;
                                            } else {
                                                aVar.c(i24, type);
                                                Class<?> clsE9 = f0.e(type);
                                                if (!Map.class.isAssignableFrom(clsE9)) {
                                                    throw f0.j(method3, i24, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                }
                                                Type typeF4 = f0.f(type, clsE9);
                                                if (!(typeF4 instanceof ParameterizedType)) {
                                                    throw f0.j(method3, i24, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeF4;
                                                Type typeD6 = f0.d(0, parameterizedType4);
                                                if (String.class != typeD6) {
                                                    throw f0.j(method3, i24, n23.j.h("@HeaderMap keys must be of type String: ", typeD6), new Object[0]);
                                                }
                                                gVar = new v.e<>(method3, i24, b0Var2.f(f0.d(1, parameterizedType4), annotationArr), ((i83.j) annotation).allowUnsafeNonAsciiValues());
                                            }
                                            gVar = bVar;
                                        }
                                    }
                                }
                            }
                            if (gVar != null) {
                                if (vVar != null) {
                                    throw f0.j(method3, i24, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                vVar = gVar;
                            }
                            i26 = i16 + 1;
                            annotationArr4 = annotationArr;
                            annotationArr3 = annotationArr5;
                            i19 = i14;
                            length2 = i27;
                            length3 = i15;
                            str2 = str;
                            type2 = type;
                            vVarArr2 = vVarArr;
                        }
                    } else {
                        vVar = null;
                    }
                    Annotation[][] annotationArr6 = annotationArr3;
                    int i29 = length2;
                    String str3 = str2;
                    int i30 = i19;
                    v<?>[] vVarArr4 = vVarArr2;
                    Type type3 = type2;
                    if (vVar == null) {
                        if (i25 != 0) {
                            try {
                                if (f0.e(type3) == t13.d.class) {
                                    aVar.f25936x = true;
                                    vVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw f0.j(method3, i24, "No Retrofit annotation found.", new Object[0]);
                    }
                    vVarArr4[i24] = vVar;
                    i24++;
                    annotationArr3 = annotationArr6;
                    i19 = i30;
                    length2 = i29;
                    str2 = str3;
                    i17 = 0;
                }
                String str4 = str2;
                if (aVar.f25931s == null && !aVar.f25926n) {
                    throw f0.i(method3, null, "Missing either @%s URL or @Url parameter.", aVar.f25927o);
                }
                boolean z18 = aVar.f25929q;
                if (!z18 && !aVar.f25930r && !aVar.f25928p && aVar.f25921i) {
                    throw f0.i(method3, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z18 && !aVar.f25919g) {
                    throw f0.i(method3, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar.f25930r && !aVar.f25920h) {
                    throw f0.i(method3, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                z zVar = new z(aVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (f0.g(genericReturnType2)) {
                    throw f0.i(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw f0.i(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z19 = zVar.f25910l;
                if (z19) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeD7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeD7 instanceof WildcardType) {
                        typeD7 = ((WildcardType) typeD7).getLowerBounds()[0];
                    }
                    if (f0.e(typeD7) == a0.class && (typeD7 instanceof ParameterizedType)) {
                        typeD7 = f0.d(0, (ParameterizedType) typeD7);
                        z14 = true;
                        z15 = false;
                    } else {
                        if (f0.e(typeD7) == d.class) {
                            throw f0.i(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", f0.d(0, (ParameterizedType) typeD7));
                        }
                        z15 = f0.f25774b && typeD7 == Unit.class;
                        z14 = false;
                    }
                    genericReturnType = new f0.b(null, d.class, typeD7);
                    e0 e0Var = e0.f25772c;
                    if (!f0.h(annotations, d0.class)) {
                        Annotation[] annotationArr7 = new Annotation[annotations.length + 1];
                        annotationArr7[0] = e0.f25772c;
                        System.arraycopy(annotations, 0, annotationArr7, 1, annotations.length);
                        annotations = annotationArr7;
                    }
                    method2 = method;
                } else {
                    method2 = method;
                    genericReturnType = method2.getGenericReturnType();
                    z14 = false;
                    z15 = false;
                }
                try {
                    e<?, ?> eVarA = b0Var.a(genericReturnType, annotations);
                    Type typeA = eVarA.getF122006a();
                    if (typeA == Response.class) {
                        throw f0.i(method2, null, "'" + f0.e(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeA == a0.class) {
                        throw f0.i(method2, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (zVar.f25902d.equals(str4) && !Void.class.equals(typeA) && (!f0.f25774b || typeA != Unit.class)) {
                        throw f0.i(method2, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        h<ResponseBody, T> hVarE = b0Var.e(null, typeA, method2.getAnnotations());
                        Call.Factory factory = b0Var.f25755b;
                        if (z19) {
                            return z14 ? new k.c(zVar, factory, hVarE, eVarA) : new k.b(zVar, factory, hVarE, eVarA, false, z15);
                        }
                        return new k.a(zVar, factory, hVarE, eVarA);
                    } catch (RuntimeException e14) {
                        throw f0.i(method2, e14, "Unable to create converter for %s", typeA);
                    }
                } catch (RuntimeException e15) {
                    throw f0.i(method2, e15, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i18];
            if (annotation2 instanceof i83.b) {
                aVar.b(FirebasePerformance.HttpMethod.DELETE, ((i83.b) annotation2).value(), false);
            } else if (annotation2 instanceof i83.f) {
                aVar.b(FirebasePerformance.HttpMethod.GET, ((i83.f) annotation2).value(), false);
            } else if (annotation2 instanceof i83.g) {
                aVar.b(FirebasePerformance.HttpMethod.HEAD, ((i83.g) annotation2).value(), false);
            } else if (annotation2 instanceof i83.n) {
                aVar.b(FirebasePerformance.HttpMethod.PATCH, ((i83.n) annotation2).value(), true);
            } else if (annotation2 instanceof i83.o) {
                aVar.b(FirebasePerformance.HttpMethod.POST, ((i83.o) annotation2).value(), true);
            } else if (annotation2 instanceof i83.p) {
                aVar.b(FirebasePerformance.HttpMethod.PUT, ((i83.p) annotation2).value(), true);
            } else if (annotation2 instanceof i83.m) {
                aVar.b(FirebasePerformance.HttpMethod.OPTIONS, ((i83.m) annotation2).value(), false);
            } else if (annotation2 instanceof i83.h) {
                i83.h hVar = (i83.h) annotation2;
                aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation2 instanceof i83.k) {
                i83.k kVar = (i83.k) annotation2;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw f0.i(method3, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                Headers.Builder builder = new Headers.Builder();
                int length4 = strArrValue.length;
                int i34 = 0;
                while (i34 < length4) {
                    String str5 = strArrValue[i34];
                    boolean z24 = z16;
                    int iIndexOf = str5.indexOf(58);
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        throw f0.i(method3, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                        try {
                            aVar.f25933u = MediaType.get(strTrim);
                        } catch (IllegalArgumentException e16) {
                            throw f0.i(method3, e16, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        builder.addUnsafeNonAscii(strSubstring, strTrim);
                    } else {
                        builder.add(strSubstring, strTrim);
                    }
                    i34++;
                    z16 = z24;
                }
                aVar.f25932t = builder.build();
            } else if (annotation2 instanceof i83.l) {
                if (aVar.f25929q) {
                    throw f0.i(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.f25930r = true;
            } else if (!(annotation2 instanceof i83.e)) {
                continue;
            } else {
                if (aVar.f25930r) {
                    throw f0.i(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.f25929q = true;
            }
            i18++;
        }
    }

    public abstract T a(Object obj, Object[] objArr);
}
