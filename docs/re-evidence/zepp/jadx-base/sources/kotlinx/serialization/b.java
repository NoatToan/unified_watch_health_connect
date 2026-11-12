package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001c\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a-\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0001*\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aB\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0007*\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00010\u0010H\u0000\u001a\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0007\u001a$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0007\u001a3\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/KSerializer;", GoogleApiAvailabilityLight.a, "Lkotlinx/serialization/modules/SerializersModule;", "g", "Lkotlin/reflect/KType;", "type", "", "f", hl.k, "h", "l", "", "failOnMissingTypeArgSerializer", "i", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KType;Z)Lkotlinx/serialization/KSerializer;", "", "typeArguments", "Lkotlin/reflect/KClass;", "rootClass", "a", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/util/List;Lkotlin/reflect/KClass;Z)Lkotlinx/serialization/KSerializer;", "kClass", "typeArgumentsSerializers", "c", "e", z.j, "shouldBeNullable", "b", "(Lkotlinx/serialization/KSerializer;Z)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 5, mv = {1, 5, 1}, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class b {
    private static final KSerializer<? extends Object> a(SerializersModule serializersModule, List<? extends KType> list, KClass<Object> kClass, boolean z) {
        ArrayList arrayList;
        if (z) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(SerializersKt.serializer(serializersModule, (KType) it2.next()));
            }
        } else {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, (KType) it3.next());
                if (kSerializerSerializerOrNull == null) {
                    return null;
                }
                arrayList.add(kSerializerSerializerOrNull);
            }
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new ArrayListSerializer((KSerializer) arrayList.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer((KSerializer) arrayList.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer((KSerializer) arrayList.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
        }
        if (PlatformKt.isReferenceArray(kClass)) {
            KClassifier classifier = list.get(0).getClassifier();
            Objects.requireNonNull(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return BuiltinSerializersKt.ArraySerializer((KClass) classifier, (KSerializer) arrayList.get(0));
        }
        Object[] array = arrayList.toArray(new KSerializer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        KSerializer[] kSerializerArr = (KSerializer[]) array;
        KSerializer<? extends Object> kSerializerConstructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        return kSerializerConstructSerializerForGivenTypeArgs == null ? SerializersKt.reflectiveOrContextual(serializersModule, kClass, arrayList) : kSerializerConstructSerializerForGivenTypeArgs;
    }

    private static final <T> KSerializer<T> b(KSerializer<T> kSerializer, boolean z) {
        return z ? BuiltinSerializersKt.getNullable(kSerializer) : kSerializer;
    }

    @Nullable
    public static final <T> KSerializer<T> c(@NotNull SerializersModule serializersModule, @NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<Object>> list) {
        KSerializer<T> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(kClass);
        return kSerializerSerializerOrNull == null ? serializersModule.getContextual(kClass, list) : kSerializerSerializerOrNull;
    }

    public static final /* synthetic */ <T> KSerializer<T> d() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (KSerializer<T>) SerializersKt.serializer((KType) null);
    }

    @InternalSerializationApi
    @NotNull
    public static final <T> KSerializer<T> e(@NotNull KClass<T> kClass) {
        KSerializer<T> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(kClass);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final KSerializer<Object> f(@NotNull KType kType) {
        return SerializersKt.serializer(SerializersModuleKt.getEmptySerializersModule(), kType);
    }

    public static final /* synthetic */ <T> KSerializer<T> g(SerializersModule serializersModule) {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (KSerializer<T>) SerializersKt.serializer(serializersModule, (KType) null);
    }

    @NotNull
    public static final KSerializer<Object> h(@NotNull SerializersModule serializersModule, @NotNull KType kType) {
        KSerializer<Object> kSerializerI = i(serializersModule, kType, true);
        if (kSerializerI != null) {
            return kSerializerI;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(kType));
        throw new KotlinNothingValueException();
    }

    private static final KSerializer<Object> i(SerializersModule serializersModule, KType kType, boolean z) {
        KSerializer<? extends Object> kSerializerA;
        KClass<Object> kclass = Platform_commonKt.kclass(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it2 = arguments.iterator();
        while (it2.hasNext()) {
            KType type = ((KTypeProjection) it2.next()).getType();
            if (type == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Star projections in type arguments are not allowed, but had ", kType).toString());
            }
            arrayList.add(type);
        }
        if (arrayList.isEmpty()) {
            kSerializerA = SerializersKt.serializerOrNull(kclass);
            if (kSerializerA == null) {
                kSerializerA = SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null);
            }
        } else {
            kSerializerA = a(serializersModule, arrayList, kclass, z);
        }
        if (kSerializerA == null) {
            kSerializerA = null;
        }
        if (kSerializerA == null) {
            return null;
        }
        return b(kSerializerA, zIsMarkedNullable);
    }

    @InternalSerializationApi
    @Nullable
    public static final <T> KSerializer<T> j(@NotNull KClass<T> kClass) {
        KSerializer<T> kSerializerCompiledSerializerImpl = PlatformKt.compiledSerializerImpl(kClass);
        return kSerializerCompiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull(kClass) : kSerializerCompiledSerializerImpl;
    }

    @Nullable
    public static final KSerializer<Object> k(@NotNull KType kType) {
        return SerializersKt.serializerOrNull(SerializersModuleKt.getEmptySerializersModule(), kType);
    }

    @Nullable
    public static final KSerializer<Object> l(@NotNull SerializersModule serializersModule, @NotNull KType kType) {
        return i(serializersModule, kType, false);
    }
}
