package c83;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f25899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f25900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f25901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers f25904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaType f25905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v<?>[] f25909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f25910l;

    public static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Pattern f25911y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Pattern f25912z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f25913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f25914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f25915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[] f25916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Annotation[][] f25917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Type[] f25918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f25919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f25920h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f25921i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f25922j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f25923k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f25924l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f25925m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f25926n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f25927o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f25928p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f25929q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f25930r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f25931s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Headers f25932t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public MediaType f25933u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public LinkedHashSet f25934v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public v<?>[] f25935w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f25936x;

        public a(b0 b0Var, Class<?> cls, Method method) {
            this.f25913a = b0Var;
            this.f25914b = cls;
            this.f25915c = method;
            this.f25916d = method.getAnnotations();
            this.f25918f = method.getGenericParameterTypes();
            this.f25917e = method.getParameterAnnotations();
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

        public final void b(String str, String str2, boolean z14) {
            String str3 = this.f25927o;
            Method method = this.f25915c;
            if (str3 != null) {
                throw f0.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f25927o = str;
            this.f25928p = z14;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f25911y;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw f0.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f25931s = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f25934v = linkedHashSet;
        }

        public final void c(int i14, Type type) {
            if (f0.g(type)) {
                throw f0.j(this.f25915c, i14, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public z(a aVar) {
        this.f25899a = aVar.f25914b;
        this.f25900b = aVar.f25915c;
        this.f25901c = aVar.f25913a.f25756c;
        this.f25902d = aVar.f25927o;
        this.f25903e = aVar.f25931s;
        this.f25904f = aVar.f25932t;
        this.f25905g = aVar.f25933u;
        this.f25906h = aVar.f25928p;
        this.f25907i = aVar.f25929q;
        this.f25908j = aVar.f25930r;
        this.f25909k = aVar.f25935w;
        this.f25910l = aVar.f25936x;
    }
}
