package kotlinx.serialization;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import io.netty.util.internal.StringUtil;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "c", "g", "Lkotlinx/serialization/modules/SerializersModule;", GoogleApiAvailabilityLight.a, "h", "", "failOnMissingTypeArgSerializer", "e", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "i", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/reflect/GenericArrayType;", "a", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "b", "(Ljava/lang/reflect/Type;)Lkotlin/reflect/KClass;", "kotlinx-serialization-core"}, k = 5, mv = {1, 5, 1}, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class a {
    private static final KSerializer<Object> a(SerializersModule serializersModule, GenericArrayType genericArrayType, boolean z) {
        KSerializer<Object> kSerializerSerializerOrNull;
        KClass kotlinClass;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            genericComponentType = (Type) ArraysKt.first(((WildcardType) genericComponentType).getUpperBounds());
        }
        if (z) {
            kSerializerSerializerOrNull = SerializersKt.serializer(serializersModule, genericComponentType);
        } else {
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, genericComponentType);
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kotlinClass = JvmClassMappingKt.getKotlinClass((Class) rawType);
        } else {
            if (!(genericComponentType instanceof KClass)) {
                throw new IllegalStateException(Intrinsics.stringPlus("unsupported type in GenericArray: ", Reflection.getOrCreateKotlinClass(genericComponentType.getClass())));
            }
            kotlinClass = (KClass) genericComponentType;
        }
        return BuiltinSerializersKt.ArraySerializer(kotlinClass, kSerializerSerializerOrNull);
    }

    private static final KClass<?> b(Type type) {
        if (type instanceof KClass) {
            return (KClass) type;
        }
        if (type instanceof Class) {
            return JvmClassMappingKt.getKotlinClass((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return b(((ParameterizedType) type).getRawType());
        }
        if (type instanceof WildcardType) {
            return b((Type) ArraysKt.first(((WildcardType) type).getUpperBounds()));
        }
        if (type instanceof GenericArrayType) {
            return b(((GenericArrayType) type).getGenericComponentType());
        }
        throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + StringUtil.SPACE + Reflection.getOrCreateKotlinClass(type.getClass()));
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> c(@NotNull Type type) {
        return SerializersKt.serializer(SerializersModuleKt.getEmptySerializersModule(), type);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> d(@NotNull SerializersModule serializersModule, @NotNull Type type) {
        KSerializer<Object> kSerializerE = e(serializersModule, type, true);
        if (kSerializerE != null) {
            return kSerializerE;
        }
        Platform_commonKt.serializerNotRegistered(b(type));
        throw new KotlinNothingValueException();
    }

    private static final KSerializer<Object> e(SerializersModule serializersModule, Type type, boolean z) {
        ArrayList arrayList;
        if (type instanceof GenericArrayType) {
            return a(serializersModule, (GenericArrayType) type, z);
        }
        if (type instanceof Class) {
            return i(serializersModule, (Class) type, z);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                return f(serializersModule, (Type) ArraysKt.first(((WildcardType) type).getUpperBounds()), false, 2, null);
            }
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + StringUtil.SPACE + Reflection.getOrCreateKotlinClass(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                arrayList.add(SerializersKt.serializer(serializersModule, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, type3);
                if (kSerializerSerializerOrNull == null) {
                    return null;
                }
                arrayList.add(kSerializerSerializerOrNull);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.SetSerializer((KSerializer) arrayList.get(0));
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.ListSerializer((KSerializer) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.MapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.MapEntrySerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Pair.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.PairSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Triple.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.TripleSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((KSerializer) it2.next());
        }
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
        Object[] array = arrayList2.toArray(new KSerializer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        KSerializer[] kSerializerArr = (KSerializer[]) array;
        KSerializer<Object> kSerializerConstructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(kotlinClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (!(kSerializerConstructSerializerForGivenTypeArgs instanceof KSerializer)) {
            kSerializerConstructSerializerForGivenTypeArgs = null;
        }
        return kSerializerConstructSerializerForGivenTypeArgs == null ? SerializersKt.reflectiveOrContextual(serializersModule, JvmClassMappingKt.getKotlinClass(cls), arrayList2) : kSerializerConstructSerializerForGivenTypeArgs;
    }

    public static /* synthetic */ KSerializer f(SerializersModule serializersModule, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return e(serializersModule, type, z);
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final KSerializer<Object> g(@NotNull Type type) {
        return SerializersKt.serializerOrNull(SerializersModuleKt.getEmptySerializersModule(), type);
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final KSerializer<Object> h(@NotNull SerializersModule serializersModule, @NotNull Type type) {
        return e(serializersModule, type, false);
    }

    private static final KSerializer<Object> i(SerializersModule serializersModule, Class<?> cls, boolean z) {
        KSerializer<Object> kSerializerSerializerOrNull;
        if (!cls.isArray()) {
            return SerializersKt.reflectiveOrContextual(serializersModule, JvmClassMappingKt.getKotlinClass(cls), CollectionsKt__CollectionsKt.emptyList());
        }
        Class<?> componentType = cls.getComponentType();
        if (z) {
            kSerializerSerializerOrNull = SerializersKt.serializer(serializersModule, componentType);
        } else {
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, componentType);
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
        }
        return BuiltinSerializersKt.ArraySerializer(JvmClassMappingKt.getKotlinClass(componentType), kSerializerSerializerOrNull);
    }
}
