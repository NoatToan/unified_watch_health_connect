package kotlin.reflect.jvm.internal.calls;

import androidx.exifinterface.media.ExifInterface;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "b", "", "index", "", "name", "expectedJvmType", "", "a", ExifInterface.GPS_DIRECTION_TRUE, "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "createAnnotationInstance", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "kotlin-reflection"}, k = 2, mv = {1, 5, 1})
public final class AnnotationConstructorCallerKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "other", "", "a", "(Ljava/lang/Object;)Z"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Object, Boolean> {
        public final /* synthetic */ Class a;
        public final /* synthetic */ List b;
        public final /* synthetic */ Map c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, List list, Map map) {
            super(1);
            this.a = cls;
            this.b = list;
            this.c = map;
        }

        public final boolean a(@Nullable Object obj) throws IllegalAccessException, InvocationTargetException {
            boolean zAreEqual;
            boolean z;
            KClass annotationClass;
            Class javaClass = null;
            Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
            if (annotation != null && (annotationClass = JvmClassMappingKt.getAnnotationClass(annotation)) != null) {
                javaClass = JvmClassMappingKt.getJavaClass(annotationClass);
            }
            if (Intrinsics.areEqual(javaClass, this.a)) {
                List<Method> list = this.b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = true;
                } else {
                    for (Method method : list) {
                        Object obj2 = this.c.get(method.getName());
                        Object objInvoke = method.invoke(obj, new Object[0]);
                        if (obj2 instanceof boolean[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                            zAreEqual = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                        } else if (obj2 instanceof char[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                            zAreEqual = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                        } else if (obj2 instanceof byte[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                            zAreEqual = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                        } else if (obj2 instanceof short[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                            zAreEqual = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                        } else if (obj2 instanceof int[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                            zAreEqual = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                        } else if (obj2 instanceof float[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                            zAreEqual = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                        } else if (obj2 instanceof long[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                            zAreEqual = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                        } else if (obj2 instanceof double[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                            zAreEqual = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                        } else if (obj2 instanceof Object[]) {
                            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            zAreEqual = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                        } else {
                            zAreEqual = Intrinsics.areEqual(obj2, objInvoke);
                        }
                        if (!zAreEqual) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(a(obj));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()I", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Map a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map) {
            super(0);
            this.a = map;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            int iHashCode;
            int iHashCode2 = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    iHashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    iHashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    iHashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    iHashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    iHashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    iHashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    iHashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    iHashCode = Arrays.hashCode((double[]) value);
                } else {
                    iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                iHashCode2 += iHashCode ^ (str.hashCode() * 127);
            }
            return iHashCode2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00000\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042,\u0010\u0007\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00000\u0000 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements InvocationHandler {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Lazy b;
        public final /* synthetic */ KProperty c;
        public final /* synthetic */ Lazy d;
        public final /* synthetic */ KProperty e;
        public final /* synthetic */ a f;
        public final /* synthetic */ Map g;

        public c(Class cls, Lazy lazy, KProperty kProperty, Lazy lazy2, KProperty kProperty2, a aVar, Map map) {
            this.a = cls;
            this.b = lazy;
            this.c = kProperty;
            this.d = lazy2;
            this.e = kProperty2;
            this.f = aVar;
            this.g = map;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1776922004) {
                    if (iHashCode != 147696667) {
                        if (iHashCode == 1444986633 && name.equals("annotationType")) {
                            return this.a;
                        }
                    } else if (name.equals("hashCode")) {
                        return this.d.getValue();
                    }
                } else if (name.equals("toString")) {
                    return this.b.getValue();
                }
            }
            if (Intrinsics.areEqual(name, "equals") && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(this.f.a(ArraysKt.single(objArr)));
            }
            if (this.g.containsKey(name)) {
                return this.g.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(ArraysKt___ArraysKt.toList(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Map b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull Map.Entry<String, ? extends Object> entry) {
                String string;
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                } else {
                    string = value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
                }
                return key + com.alipay.sdk.m.n.a.h + string;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class cls, Map map) {
            super(0);
            this.a = cls;
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(this.a.getCanonicalName());
            CollectionsKt___CollectionsKt.joinTo(this.b.entrySet(), sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : a.a);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void a(int i, String str, Class<?> cls) {
        KClass orCreateKotlinClass;
        String qualifiedName;
        if (Intrinsics.areEqual(cls, Class.class)) {
            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KClass.class);
        } else {
            orCreateKotlinClass = (cls.isArray() && Intrinsics.areEqual(cls.getComponentType(), Class.class)) ? Reflection.getOrCreateKotlinClass(KClass[].class) : JvmClassMappingKt.getKotlinClass(cls);
        }
        if (Intrinsics.areEqual(orCreateKotlinClass.getQualifiedName(), Reflection.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
            qualifiedName = orCreateKotlinClass.getQualifiedName() + Typography.less + JvmClassMappingKt.getKotlinClass(JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getComponentType()).getQualifiedName() + Typography.greater;
        } else {
            qualifiedName = orCreateKotlinClass.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + i + StringUtil.SPACE + str + " is not of the required type " + qualifiedName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = JvmClassMappingKt.getJavaClass((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(JvmClassMappingKt.getJavaClass(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    @NotNull
    public static final <T> T createAnnotationInstance(@NotNull Class<T> cls, @NotNull Map<String, ? extends Object> map, @NotNull List<Method> list) {
        a aVar = new a(cls, list, map);
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new b(map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c(cls, LazyKt__LazyJVMKt.lazy(new d(cls, map)), null, lazy, null, aVar, map));
        Objects.requireNonNull(t, "null cannot be cast to non-null type T");
        return t;
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it2.next(), new Class[0]));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }
}
