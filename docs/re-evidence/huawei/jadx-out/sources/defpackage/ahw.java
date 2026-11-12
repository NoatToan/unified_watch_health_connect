package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.util.Named;
import com.huawei.health.device.open.data.model.HealthData;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ahw {
    private static final Class<?> e = Object.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Annotation[] f435b = new Annotation[0];
    private static final d[] d = new d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Iterator<?> f434a = Collections.emptyIterator();

    public static <T> T e(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static <T> Iterator<T> d() {
        return (Iterator<T>) f434a;
    }

    public static List<Class<?>> c(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        c(cls, cls2, arrayList, z);
        return arrayList;
    }

    public static List<Class<?>> b(Class<?> cls, Class<?> cls2, boolean z) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    private static void c(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (Class<?> cls3 : y(cls)) {
            c(cls3, cls2, collection, true);
        }
        c(cls.getSuperclass(), cls2, collection, true);
    }

    public static String d(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static String e(Class<?> cls, boolean z) {
        try {
            boolean zIsStatic = Modifier.isStatic(cls.getModifiers());
            if (!zIsStatic && k(cls)) {
                return "local/anonymous";
            }
            if (z || zIsStatic || g(cls) == null) {
                return null;
            }
            return "non-static member class";
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static Class<?> f(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (k(cls)) {
                    return null;
                }
                return g(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static boolean p(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static boolean o(Class<?> cls) {
        return (cls.getModifiers() & HealthData.BLOODPRESURE) == 0;
    }

    public static boolean l(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == yp.class;
    }

    public static boolean s(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        return superclass != null && "java.lang.Record".equals(superclass.getName());
    }

    public static boolean t(Class<?> cls) {
        return cls == e || cls.isPrimitive();
    }

    public static boolean e(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static void c(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    public static Throwable e(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th;
    }

    public static Throwable i(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    public static Throwable c(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        return th;
    }

    public static Throwable b(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static Throwable f(Throwable th) throws IOException {
        return c(b(th));
    }

    public static void d(Throwable th) {
        e(th, th.getMessage());
    }

    public static void e(Throwable th, String str) {
        i(th);
        e(th);
        throw new IllegalArgumentException(str, th);
    }

    public static <T> T b(DeserializationContext deserializationContext, IOException iOException) throws ym {
        if (iOException instanceof ym) {
            throw ((ym) iOException);
        }
        ym ymVarFrom = ym.from(deserializationContext, iOException.getMessage());
        ymVarFrom.initCause(iOException);
        throw ymVarFrom;
    }

    public static void g(Throwable th) {
        d(b(th));
    }

    public static void d(Throwable th, String str) {
        e(b(th), str);
    }

    public static void b(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e2) {
            exc.addSuppressed(e2);
        }
        c((Throwable) exc);
        i(exc);
        throw new RuntimeException(exc);
    }

    public static void c(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e3) {
                exc.addSuppressed(e3);
            }
        }
        c((Throwable) exc);
        i(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T b(Class<T> cls, boolean z) throws IllegalArgumentException {
        Constructor constructorA = a(cls, z);
        if (constructorA == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return (T) constructorA.newInstance(new Object[0]);
        } catch (Exception e2) {
            d(e2, "Failed to instantiate class " + cls.getName() + ", problem: " + e2.getMessage());
            return null;
        }
    }

    public static <T> Constructor<T> a(Class<T> cls, boolean z) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                a(declaredConstructor, z);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e2) {
            d(e2, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e2.getMessage());
            return null;
        }
    }

    public static Class<?> d(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static Class<?> b(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static String e(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static String d(String str) {
        return str == null ? "" : str;
    }

    public static String c(Object obj, String str) {
        return obj == null ? str : String.format("\"%s\"", obj);
    }

    public static String a(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return u(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static String a(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(javaType.toCanonical());
        sb.append('`');
        return sb.toString();
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return u(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static String u(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return b(simpleName);
    }

    public static String e(Named named) {
        if (named == null) {
            return "[null]";
        }
        return c(named.getName());
    }

    public static String e(String str) {
        if (str == null) {
            return "[null]";
        }
        return c(str);
    }

    public static String e(ys ysVar) {
        if (ysVar == null) {
            return "[null]";
        }
        return c(ysVar.b());
    }

    public static String b(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static String a(Throwable th) {
        if (th instanceof wr) {
            return ((wr) th).getOriginalMessage();
        }
        return th.getMessage();
    }

    public static Object b(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static Class<?> w(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static Class<?> v(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e2) {
                if (accessibleObject.isAccessible()) {
                    return;
                }
                throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e2.getMessage());
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static boolean m(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static Class<? extends Enum<?>> e(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return b((Enum<?>) enumSet.iterator().next());
        }
        return e.f438b.a(enumSet);
    }

    public static Class<? extends Enum<?>> e(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return b((Enum<?>) enumMap.keySet().iterator().next());
        }
        return e.f438b.b(enumMap);
    }

    public static Class<? extends Enum<?>> b(Enum<?> r0) {
        return r0.getDeclaringClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> e(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static <T extends Annotation> Enum<?> d(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> r8 : cls.getEnumConstants()) {
                    if (name.equals(r8.name())) {
                        return r8;
                    }
                }
            }
        }
        return null;
    }

    public static boolean c(Object obj) {
        return obj == null || r(obj.getClass());
    }

    public static boolean r(Class<?> cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static boolean n(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean q(Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || g(cls) == null) ? false : true;
    }

    public static boolean k(Class<?> cls) {
        return (t(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    public static Annotation[] a(Class<?> cls) {
        if (t(cls)) {
            return f435b;
        }
        return cls.getDeclaredAnnotations();
    }

    public static Method[] c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return d(cls, e2);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Throwable th) {
                    return d(cls, th);
                }
            } catch (ClassNotFoundException e3) {
                e2.addSuppressed(e3);
                return d(cls, e2);
            }
        } catch (Throwable th2) {
            return d(cls, th2);
        }
    }

    private static Method[] d(Class<?> cls, Throwable th) throws IllegalArgumentException {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), th.getClass().getName(), th.getMessage()), th);
    }

    public static d[] i(Class<?> cls) {
        if (cls.isInterface() || t(cls)) {
            return d;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        d[] dVarArr = new d[length];
        for (int i = 0; i < length; i++) {
            dVarArr[i] = new d(declaredConstructors[i]);
        }
        return dVarArr;
    }

    public static Type j(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Type[] h(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Class<?> g(Class<?> cls) {
        if (t(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    private static Class<?>[] y(Class<?> cls) {
        return cls.getInterfaces();
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f438b = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f439a = e(EnumSet.class, "elementType", Class.class);
        private final Field e = e(EnumMap.class, "elementType", Class.class);

        private e() {
        }

        public Class<? extends Enum<?>> a(EnumSet<?> enumSet) {
            Field field = this.f439a;
            if (field != null) {
                return (Class) a(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> b(EnumMap<?, ?> enumMap) {
            Field field = this.e;
            if (field != null) {
                return (Class) a(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }

        private Object a(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }

        private static Field e(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Annotation[][] f436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f437b = -1;
        public final Constructor<?> d;
        private transient Annotation[] e;

        public d(Constructor<?> constructor) {
            this.d = constructor;
        }

        public Constructor<?> b() {
            return this.d;
        }

        public int a() {
            int i = this.f437b;
            if (i >= 0) {
                return i;
            }
            int length = this.d.getParameterTypes().length;
            this.f437b = length;
            return length;
        }

        public Class<?> d() {
            return this.d.getDeclaringClass();
        }

        public Annotation[] c() {
            Annotation[] annotationArr = this.e;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this.d.getDeclaredAnnotations();
            this.e = declaredAnnotations;
            return declaredAnnotations;
        }

        public Annotation[][] e() {
            Annotation[][] annotationArr = this.f436a;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.d.getParameterAnnotations();
            this.f436a = parameterAnnotations;
            return parameterAnnotations;
        }
    }
}
