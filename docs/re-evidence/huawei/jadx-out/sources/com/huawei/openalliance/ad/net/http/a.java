package com.huawei.openalliance.ad.net.http;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.dz;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.kh;
import com.huawei.openalliance.ad.ki;
import com.huawei.openalliance.ad.kj;
import com.huawei.openalliance.ad.kk;
import com.huawei.openalliance.ad.kl;
import com.huawei.openalliance.ad.km;
import com.huawei.openalliance.ad.kn;
import com.huawei.openalliance.ad.ko;
import com.huawei.openalliance.ad.kp;
import com.huawei.openalliance.ad.kq;
import com.huawei.openalliance.ad.kr;
import com.huawei.openalliance.ad.ks;
import com.huawei.openalliance.ad.kt;
import com.huawei.openalliance.ad.ku;
import com.huawei.openalliance.ad.kv;
import com.huawei.openalliance.ad.la;
import com.huawei.openalliance.ad.lf;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.cr;
import com.huawei.openalliance.ad.utils.df;
import com.huawei.openalliance.ad.utils.q;
import com.huawei.operation.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Pattern f19680a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Class<?> f19681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f f19682c;
    final String d;
    final String e;
    final c f;
    final String g;
    final int h;
    final List<String> i;
    final byte[] j;
    final boolean k;
    final int l;
    final lf m;

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.net.http.a$a, reason: collision with other inner class name */
    static class C0223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f19683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f19684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object[] f19685c;
        final String d;
        final c e;
        Class<?> f;
        f g;
        String h;
        String i;
        byte[] l;
        String m;
        lf t;
        final List<String> j = new ArrayList(4);
        final Set<String> k = new LinkedHashSet();
        int n = 0;
        int o = 0;
        int p = 0;
        boolean q = false;
        boolean r = false;
        int s = 0;

        public a a() {
            b();
            d();
            if (TextUtils.isEmpty(this.h)) {
                throw a("Http method annotation is needed! (eg. GET, POST etc.", new Object[0]);
            }
            if (this.i == null) {
                throw a("Url is not specified in @GET or @POST etc.", new Object[0]);
            }
            c();
            if (this.g != null) {
                return new a(this);
            }
            throw a("No url found in the request!", new Object[0]);
        }

        private void f(Object obj, int i) {
            if (obj == null) {
                throw a("Argument %d with @HeaderMap annotation must not be null!", Integer.valueOf(i));
            }
            if (!(obj instanceof Map)) {
                throw a("Argument %d with @HeaderMap annotation can only be Map type!", Integer.valueOf(i));
            }
            for (Object obj2 : ((Map) obj).entrySet()) {
                if (!(obj2 instanceof Map.Entry)) {
                    return;
                }
                Map.Entry entry = (Map.Entry) obj2;
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw a("The key in HeaderMap must be String type [Argument %d]!", Integer.valueOf(i));
                }
                Object value = entry.getValue();
                if (!(value instanceof String)) {
                    throw a("The value in HeaderMap must be String type [Argument %d]!", Integer.valueOf(i));
                }
                this.e.a((String) key, (String) value);
            }
        }

        private void e(Object obj, int i) {
            if (obj == null) {
                throw a("Argument %d with @ResponseEntity annotation must not be null!", Integer.valueOf(i));
            }
            if (!(obj instanceof Class)) {
                throw a("Argument %d with @HeaderMap annotation can only be Class type!", Integer.valueOf(i));
            }
            this.f = (Class) obj;
        }

        private void e() {
            this.e.a(this.f19683a.a((kn) this.f19684b.getAnnotation(kn.class)));
        }

        private void d(Object obj, int i) {
            if (obj == null) {
                throw a("Argument %d with @ResponseConverter annotation must not be null!", Integer.valueOf(i));
            }
            if (!(obj instanceof lf)) {
                throw a("Argument %d with @Url annotation can only be IResponseConversionInterceptor type!", Integer.valueOf(i));
            }
            this.t = (lf) obj;
        }

        private void d() {
            for (Annotation annotation : this.f19684b.getAnnotations()) {
                a(annotation);
            }
        }

        private void c(Object obj, int i) {
            if (obj == null) {
                throw a("Argument %d with @UserAgentSource annotation must not be null!", Integer.valueOf(i));
            }
            if (obj.getClass() != Integer.TYPE && !(obj instanceof Integer)) {
                throw a("Argument %d with @UserAgentSource annotation must be int or Integer", Integer.valueOf(i));
            }
            this.p = ((Integer) obj).intValue();
        }

        private void c() {
            Annotation[][] parameterAnnotations = this.f19684b.getParameterAnnotations();
            int length = parameterAnnotations.length;
            if (length != this.f19685c.length) {
                throw a("Parameter annotation number doesn't equal to parameter number", new Object[0]);
            }
            for (int i = 0; i < length; i++) {
                Annotation[] annotationArr = parameterAnnotations[i];
                if (annotationArr == null || annotationArr.length == 0) {
                    throw a("Argument " + i + " doesn't have annotations!", new Object[0]);
                }
                for (Annotation annotation : annotationArr) {
                    a(annotation, i);
                }
            }
        }

        private void b(Object obj, int i) {
            if (obj == null) {
                throw a("Argument %d with @Gzip annotation must not be null!", Integer.valueOf(i));
            }
            if (obj.getClass() != Boolean.TYPE && !(obj instanceof Boolean)) {
                throw a("Argument %d with @Gzip annotation must be boolean or Boolean", Integer.valueOf(i));
            }
            this.r = ((Boolean) obj).booleanValue();
        }

        private void b() {
            if (this.f19684b.getReturnType() != Response.class) {
                throw a("Return type must be com.huawei.openplatform.baselibrary.net.http.Response!", new Object[0]);
            }
            Type genericReturnType = this.f19684b.getGenericReturnType();
            if (!(genericReturnType instanceof ParameterizedType)) {
                throw a("Return type must be parameterized, eg. Response<Foo>.", new Object[0]);
            }
            this.f = cr.a(cr.a(0, (ParameterizedType) genericReturnType));
        }

        private static byte[] a(byte[] bArr) {
            GZIPOutputStream gZIPOutputStream;
            hw.b("AccessMethod.Builder", "gzip content");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    df.a(gZIPOutputStream);
                    df.a(byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    try {
                        hw.c("AccessMethod.Builder", "gzip fail " + th.getClass().getSimpleName());
                        return null;
                    } finally {
                        df.a(gZIPOutputStream);
                        df.a(byteArrayOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        }

        private void a(Annotation annotation, int i) {
            if (annotation instanceof kp) {
                a((kp) annotation, this.f19685c[i], i);
                return;
            }
            if (annotation instanceof kq) {
                a((kq) annotation, this.f19685c[i], i);
                return;
            }
            if (annotation instanceof kh) {
                a(this.f19685c[i]);
                return;
            }
            if (annotation instanceof kl) {
                a((kl) annotation, this.f19685c[i], i);
                return;
            }
            if (annotation instanceof km) {
                f(this.f19685c[i], i);
                return;
            }
            if (annotation instanceof ks) {
                e(this.f19685c[i], i);
                return;
            }
            if (annotation instanceof kt) {
                a(this.f19685c[i], ((kt) annotation).b(), i);
                return;
            }
            if (annotation instanceof kr) {
                d(this.f19685c[i], i);
                return;
            }
            if (annotation instanceof kv) {
                c(this.f19685c[i], i);
            } else if (annotation instanceof kk) {
                b(this.f19685c[i], i);
            } else if (annotation instanceof ki) {
                a(this.f19685c[i], i);
            }
        }

        private void a(Annotation annotation) {
            if (annotation instanceof kj) {
                a("GET", ((kj) annotation).a());
                return;
            }
            if (annotation instanceof ko) {
                a("POST", ((ko) annotation).a());
                return;
            }
            if (annotation instanceof kn) {
                e();
            } else if (annotation instanceof kt) {
                a((kt) annotation);
            } else if (annotation instanceof ku) {
                a((ku) annotation);
            }
        }

        private void a(String str, String str2) {
            this.h = str;
            this.i = str2;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (a.f19680a.matcher(strSubstring).find()) {
                    throw a("URL query \"%s\" must not have replace block. use @Query instead.", strSubstring);
                }
            }
            this.k.addAll(a(str2));
        }

        private void a(Object obj, boolean z, int i) {
            if (obj == null) {
                throw a("Argument %d with @Url annotation must not be null!", Integer.valueOf(i));
            }
            if (!(obj instanceof String)) {
                throw a("Argument %d with @Url annotation can only be String type!", Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(this.i)) {
                throw a("Relative path in GET/POST annotation must be empty with @Url annotation as parameter!", new Object[0]);
            }
            this.g = new f.a(z).a(this.f19683a.h, (String) obj).a();
        }

        private void a(Object obj, int i) {
            if (obj == null) {
                throw a("Argument %d with @FB annotation must not be null!", Integer.valueOf(i));
            }
            if (obj.getClass() != Integer.TYPE && !(obj instanceof Integer)) {
                throw a("Argument %d with @Fb annotation must be int or Integer", Integer.valueOf(i));
            }
            this.s = ((Integer) obj).intValue();
        }

        private void a(Object obj) {
            byte[] bArr;
            int i = this.o + 1;
            this.o = i;
            if (i > 1) {
                throw a("There are more than one @Body arguments in method!", new Object[0]);
            }
            if (obj == null) {
                bArr = null;
            } else {
                if (!(obj instanceof byte[])) {
                    if (2 == this.s && (obj instanceof AdContentReq)) {
                        try {
                            this.l = dz.a((AdContentReq) obj);
                            if (hw.a()) {
                                hw.a("AccessMethod.Builder", "req in fb, origin body: %s", bk.b((AdContentReq) obj));
                                hw.a("AccessMethod.Builder", "req in fb, base64 body: %s", q.a(this.l));
                                return;
                            }
                            return;
                        } catch (Throwable unused) {
                            throw a("FBtoFlatBufferBytes error", new Object[0]);
                        }
                    }
                    la laVarA = la.a.a(this.f19683a.h, obj.getClass());
                    this.m = laVarA.a();
                    try {
                        try {
                            byte[] bytes = laVarA.a(obj, this.f19683a.e).getBytes("UTF-8");
                            this.l = bytes;
                            if (this.r) {
                                this.l = a(bytes);
                            }
                            this.q = this.r;
                            return;
                        } catch (UnsupportedEncodingException unused2) {
                            throw a("UnsupportedEncodingException in get bytes from content", new Object[0]);
                        }
                    } catch (Exception unused3) {
                        throw a("process body annotation error", new Object[0]);
                    }
                }
                bArr = (byte[]) obj;
            }
            this.l = bArr;
        }

        private void a(ku kuVar) {
            this.p = kuVar.a();
        }

        private void a(kt ktVar) {
            this.g = new f.a(ktVar.b()).a(this.f19683a.h, ktVar.a()).a();
        }

        private void a(kq kqVar, Object obj, int i) {
            String strA;
            if (obj == null) {
                strA = Constants.NULL;
            } else {
                try {
                    strA = la.a.a(this.f19683a.h, obj.getClass()).a(obj, this.f19683a.e);
                } catch (Exception unused) {
                    throw a("process query annotation error", new Object[0]);
                }
            }
            String strA2 = kqVar.a();
            if (TextUtils.isEmpty(strA2)) {
                throw a("Query name of " + i + " arg cannot not be empty!", new Object[0]);
            }
            this.j.add(strA2 + "=" + strA);
        }

        private void a(kp kpVar, Object obj, int i) {
            this.n++;
            String strA = kpVar.a();
            if (!this.k.contains(strA)) {
                throw a("Path name {" + strA + "} (arg " + i + ") not existed in path url!", new Object[0]);
            }
            if (this.n > this.k.size()) {
                throw a("@Path argument number is more than the path param elements in url", new Object[0]);
            }
            if (obj == null) {
                throw a("Path {" + strA + "} argument value cannot be null!", new Object[0]);
            }
            try {
                String strA2 = la.a.a(this.f19683a.h, obj.getClass()).a(obj, this.f19683a.e);
                this.i = this.i.replace("{" + strA + "}", strA2);
            } catch (Exception unused) {
                throw a("process path annotation error", new Object[0]);
            }
        }

        private void a(kl klVar, Object obj, int i) {
            if (obj == null) {
                throw a("Argument %d with @Header annotation must not be null!", Integer.valueOf(i));
            }
            if (!(obj instanceof String)) {
                throw a("Argument %d with @Header annotation can only be String type!", Integer.valueOf(i));
            }
            this.e.a(klVar.a(), (String) obj);
        }

        private Set<String> a(String str) {
            Matcher matcher = a.f19680a.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private RuntimeException a(String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            if (objArr != null && objArr.length != 0) {
                str = String.format(Locale.ENGLISH, str, objArr);
            }
            sb.append(str);
            sb.append(" (method: ");
            sb.append(this.d);
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            String string = sb.toString();
            hw.c("AccessMethod.Builder", string);
            return new IllegalArgumentException(string);
        }

        C0223a(e eVar, Method method, Object[] objArr, c cVar, kt ktVar) {
            this.f19683a = eVar;
            this.f19684b = method;
            this.d = method.getName();
            this.f19685c = objArr == null ? new Object[0] : objArr;
            this.e = cVar;
            this.g = ktVar != null ? new f.a(ktVar.b()).a(eVar.h, ktVar.a()).a() : eVar.f19689a;
        }
    }

    String c() {
        StringBuilder sb = new StringBuilder(this.f19682c.c());
        if (!TextUtils.isEmpty(this.d)) {
            if (!this.d.startsWith("/")) {
                sb.append('/');
            }
            sb.append(this.d);
        }
        return sb.toString();
    }

    String b() {
        return this.f19682c.b();
    }

    boolean a() {
        return this.f19682c.a();
    }

    private a(C0223a c0223a) {
        this.f19681b = c0223a.f;
        this.f19682c = c0223a.g;
        this.d = c0223a.i;
        this.e = c0223a.h;
        this.i = c0223a.j;
        this.j = c0223a.l;
        this.f = c0223a.e;
        this.m = c0223a.t;
        this.g = c0223a.m;
        this.h = c0223a.p;
        this.k = c0223a.q;
        this.l = c0223a.s;
    }
}
