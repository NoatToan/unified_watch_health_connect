package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b\u001a$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\tH\u0000\u001aM\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\b\"\n\b\u0001\u0010\f*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\rj\b\u0012\u0004\u0012\u00028\u0001`\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0013\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\tH\u0000\u001aO\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\t2\"\u0010\u0014\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002\u001a$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001a$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001aQ\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0000*\u00020\b2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00172\"\u0010\u0014\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0012\u0010\u001e\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u0017H\u0002\u001a$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002\u001a(\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0000*\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002\u001a\u0018\u0010\"\u001a\u00020\u0007*\u00020\b2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\tH\u0000\u001a\u0016\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\tH\u0000¨\u0006%"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "", "index", "getChecked", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "compiledSerializerImpl", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "toNativeArrayImpl", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "", "platformSpecificSerializerNotRegistered", "args", "constructSerializerForGivenTypeArgs", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "f", "g", GoogleApiAvailabilityLight.a, "jClass", "e", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "a", "b", "c", "kclass", "isInstanceOf", "rootClass", "isReferenceArray", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class PlatformKt {
    private static final Object a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final <T> KSerializer<T> b(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Objects.requireNonNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    private static final <T> KSerializer<T> c(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                if (!z2) {
                    break;
                }
                break;
            }
            Field field2 = declaredFields[i];
            if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                if (!z2) {
                    field = field2;
                    z2 = true;
                }
            }
            i++;
            field = null;
            break;
        }
        Field field3 = field;
        if (field3 == null) {
            return null;
        }
        Object obj = field3.get(null);
        Method[] methods = cls.getMethods();
        int length2 = methods.length;
        Method method = null;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= length2) {
                if (!z3) {
                    break;
                }
                break;
            }
            Method method2 = methods[i2];
            if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                if ((method2.getParameterTypes().length == 0) && Intrinsics.areEqual(method2.getReturnType(), KSerializer.class)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                if (!z3) {
                    method = method2;
                    z3 = true;
                }
            }
            i2++;
            method = null;
            break;
        }
        Method method3 = method;
        if (method3 == null) {
            return null;
        }
        Object objInvoke = method3.invoke(obj, new Object[0]);
        if (objInvoke instanceof KSerializer) {
            return (KSerializer) objInvoke;
        }
        return null;
    }

    @Nullable
    public static final <T> KSerializer<T> compiledSerializerImpl(@NotNull KClass<T> kClass) {
        return constructSerializerForGivenTypeArgs(kClass, new KSerializer[0]);
    }

    @Nullable
    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(@NotNull KClass<T> kClass, @NotNull KSerializer<Object>... kSerializerArr) {
        Field field;
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass);
        if (javaClass.isEnum() && f(javaClass)) {
            return b(javaClass);
        }
        if (javaClass.isInterface()) {
            return d(kClass);
        }
        KSerializer<T> kSerializerE = e(javaClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerE != null) {
            return kSerializerE;
        }
        KSerializer<T> kSerializerC = c(javaClass);
        if (kSerializerC != null) {
            return kSerializerC;
        }
        KSerializer<T> kSerializer = null;
        try {
            Class<?>[] declaredClasses = javaClass.getDeclaredClasses();
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls = null;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Class<?> cls2 = declaredClasses[i];
                if (Intrinsics.areEqual(cls2.getSimpleName(), "$serializer")) {
                    if (!z) {
                        z = true;
                        cls = cls2;
                    }
                }
                i++;
                cls = null;
                break;
            }
            Class<?> cls3 = cls;
            Object obj = (cls3 == null || (field = cls3.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                kSerializer = (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return kSerializer != null ? kSerializer : g(kClass);
    }

    private static final <T> KSerializer<T> d(KClass<T> kClass) {
        Serializable serializable = (Serializable) JvmClassMappingKt.getJavaClass((KClass) kClass).getAnnotation(Serializable.class);
        if (serializable == null || Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer(kClass);
        }
        return null;
    }

    private static final <T> KSerializer<T> e(Class<?> cls, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Object objA = a(cls);
        if (objA == null) {
            return null;
        }
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = objA.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(objA, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> boolean f(Class<T> cls) {
        return cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null;
    }

    private static final <T> KSerializer<T> g(KClass<T> kClass) {
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass);
        if (javaClass.getAnnotation(Polymorphic.class) != null) {
            return new PolymorphicSerializer(kClass);
        }
        Serializable serializable = (Serializable) javaClass.getAnnotation(Serializable.class);
        if (serializable == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return null;
        }
        return new PolymorphicSerializer(kClass);
    }

    public static final <T> T getChecked(@NotNull T[] tArr, int i) {
        return tArr[i];
    }

    public static final boolean isInstanceOf(@NotNull Object obj, @NotNull KClass<?> kClass) {
        return JvmClassMappingKt.getJavaObjectType(kClass).isInstance(obj);
    }

    public static final boolean isReferenceArray(@NotNull KClass<Object> kClass) {
        return JvmClassMappingKt.getJavaClass((KClass) kClass).isArray();
    }

    @NotNull
    public static final Void platformSpecificSerializerNotRegistered(@NotNull KClass<?> kClass) {
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final <T, E extends T> E[] toNativeArrayImpl(@NotNull ArrayList<E> arrayList, @NotNull KClass<T> kClass) {
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass((KClass) kClass), arrayList.size());
        Objects.requireNonNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        return (E[]) arrayList.toArray((Object[]) objNewInstance);
    }

    public static final boolean getChecked(@NotNull boolean[] zArr, int i) {
        return zArr[i];
    }
}
