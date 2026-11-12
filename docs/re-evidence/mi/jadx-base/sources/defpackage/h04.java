package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
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
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class h04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f19523a = Object.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Annotation[] f19524b = new Annotation[0];
    public static final a[] c = new a[0];
    public static final Iterator<?> d = Collections.emptyIterator();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Constructor<?> f19525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Annotation[][] f19526b;
        public int c = -1;

        public a(Constructor<?> constructor) {
            this.f19525a = constructor;
        }

        public Constructor<?> a() {
            return this.f19525a;
        }

        public Class<?> b() {
            return this.f19525a.getDeclaringClass();
        }

        public int c() {
            int i = this.c;
            if (i >= 0) {
                return i;
            }
            int length = this.f19525a.getParameterTypes().length;
            this.c = length;
            return length;
        }

        public Annotation[][] d() {
            Annotation[][] annotationArr = this.f19526b;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.f19525a.getParameterAnnotations();
            this.f19526b = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    public static class b {
        public static final b c = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f19527a = d(EnumSet.class, "elementType", Class.class);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f19528b = d(EnumMap.class, "elementType", Class.class);

        public static Field d(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] fieldArrA = h04.A(cls);
            int length = fieldArrA.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = fieldArrA[i];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i++;
            }
            if (field == null) {
                for (Field field2 : fieldArrA) {
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

        public Class<? extends Enum<?>> a(EnumMap<?, ?> enumMap) {
            Field field = this.f19528b;
            if (field != null) {
                return (Class) c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> b(EnumSet<?> enumSet) {
            Field field = this.f19527a;
            if (field != null) {
                return (Class) c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public final Object c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static Field[] A(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    public static Method[] B(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Class<?> C(Class<?> cls) {
        if (Q(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] D(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type E(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> F(Class<?> cls) {
        try {
            if (!J(cls) && !Modifier.isStatic(cls.getModifiers())) {
                return C(cls);
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public static String G(Class<?> cls) {
        Package r0 = cls.getPackage();
        if (r0 == null) {
            return null;
        }
        return r0.getName();
    }

    public static Throwable H(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static boolean I(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean J(Class<?> cls) {
        return (Q(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    public static boolean K(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == lug.class;
    }

    public static boolean L(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean M(Class<?> cls) {
        return cls.getAnnotation(qqd.class) != null;
    }

    public static boolean N(Object obj) {
        return obj == null || M(obj.getClass());
    }

    public static String O(Class<?> cls, boolean z) {
        try {
            if (J(cls)) {
                return "local/anonymous";
            }
            if (z || Modifier.isStatic(cls.getModifiers()) || C(cls) == null) {
                return null;
            }
            return "non-static member class";
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean P(Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || C(cls) == null) ? false : true;
    }

    public static boolean Q(Class<?> cls) {
        return cls == f19523a || cls.isPrimitive();
    }

    public static boolean R(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static String S(ogg oggVar) {
        return oggVar == null ? "[null]" : d(oggVar.getName());
    }

    public static String T(Class<?> cls) {
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
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return d(simpleName);
    }

    public static <T> T U(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String V(String str) {
        return str == null ? "" : str;
    }

    public static String W(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Class<?> X(Class<?> cls) {
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

    public static String Y(Object obj, String str) {
        return obj == null ? str : String.format("\"%s\"", obj);
    }

    public static Class<?> Z(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static void a(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
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
        for (Class<?> cls3 : c(cls)) {
            a(cls3, cls2, collection, true);
        }
        a(cls.getSuperclass(), cls2, collection, true);
    }

    public static void a0(Throwable th) {
        b0(th, th.getMessage());
    }

    public static void b(JavaType javaType, Class<?> cls, Collection<JavaType> collection, boolean z) {
        Class<?> rawClass;
        if (javaType == null || (rawClass = javaType.getRawClass()) == cls || rawClass == Object.class) {
            return;
        }
        if (z) {
            if (collection.contains(javaType)) {
                return;
            } else {
                collection.add(javaType);
            }
        }
        Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            b(it.next(), cls, collection, true);
        }
        b(javaType.getSuperClass(), cls, collection, true);
    }

    public static void b0(Throwable th, String str) {
        f0(th);
        d0(th);
        throw new IllegalArgumentException(str, th);
    }

    public static Class<?>[] c(Class<?> cls) {
        return cls.getInterfaces();
    }

    public static <T> T c0(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException jsonMappingExceptionFrom = JsonMappingException.from(deserializationContext, iOException.getMessage());
        jsonMappingExceptionFrom.initCause(iOException);
        throw jsonMappingExceptionFrom;
    }

    public static String d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static Throwable d0(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th;
    }

    public static String e(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return TreeJsonEncoderKt.PRIMITIVE_TAG;
        }
        return null;
    }

    public static Throwable e0(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        return th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e) {
                if (accessibleObject.isAccessible()) {
                    return;
                }
                throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e.getMessage());
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static Throwable f0(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    public static String g(Object obj) {
        return obj == null ? "[null]" : T(obj.getClass());
    }

    public static Throwable g0(Throwable th) throws IOException {
        return e0(H(th));
    }

    public static Class<?> h(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static void h0(Throwable th) {
        a0(H(th));
    }

    public static void i(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.p(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        e0(exc);
        f0(exc);
        throw new RuntimeException(exc);
    }

    public static void i0(Throwable th, String str) {
        b0(H(th), str);
    }

    public static void j(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.p(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e) {
            exc.addSuppressed(e);
        }
        e0(exc);
        f0(exc);
        throw new RuntimeException(exc);
    }

    public static void j0(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    public static <T> T k(Class<T> cls, boolean z) throws IllegalArgumentException {
        Constructor constructorP = p(cls, z);
        if (constructorP == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return (T) constructorP.newInstance(new Object[0]);
        } catch (Exception e) {
            i0(e, "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    public static Class<?> k0(Class<?> cls) {
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

    public static Object l(Class<?> cls) {
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

    public static <T> Iterator<T> m() {
        return (Iterator<T>) d;
    }

    public static String n(Throwable th) {
        return th instanceof JsonProcessingException ? ((JsonProcessingException) th).getOriginalMessage() : th.getMessage();
    }

    public static Annotation[] o(Class<?> cls) {
        return Q(cls) ? f19524b : cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> p(Class<T> cls, boolean z) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                f(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            i0(e, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> q(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Class<? extends Enum<?>> r(Enum<?> r2) {
        Class cls = r2.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Class<? extends Enum<?>> s(EnumMap<?, ?> enumMap) {
        return !enumMap.isEmpty() ? r((Enum) enumMap.keySet().iterator().next()) : b.c.a(enumMap);
    }

    public static Class<? extends Enum<?>> t(EnumSet<?> enumSet) {
        return !enumSet.isEmpty() ? r((Enum) enumSet.iterator().next()) : b.c.b(enumSet);
    }

    public static <T extends Annotation> Enum<?> u(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : A(cls)) {
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

    public static List<Class<?>> v(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        a(cls, cls2, arrayList, z);
        return arrayList;
    }

    public static List<Class<?>> w(Class<?> cls, Class<?> cls2, boolean z) {
        LinkedList linkedList = new LinkedList();
        if (cls != null && cls != cls2) {
            if (z) {
                linkedList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                linkedList.add(cls);
            }
        }
        return linkedList;
    }

    public static List<JavaType> x(JavaType javaType, Class<?> cls, boolean z) {
        if (javaType == null || javaType.hasRawClass(cls) || javaType.hasRawClass(Object.class)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        b(javaType, cls, arrayList, z);
        return arrayList;
    }

    public static Method[] y(Class<?> cls) {
        try {
            return B(cls);
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                throw e;
            }
            try {
                return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
            } catch (ClassNotFoundException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    public static a[] z(Class<?> cls) {
        if (cls.isInterface() || Q(cls)) {
            return c;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            aVarArr[i] = new a(declaredConstructors[i]);
        }
        return aVarArr;
    }
}
