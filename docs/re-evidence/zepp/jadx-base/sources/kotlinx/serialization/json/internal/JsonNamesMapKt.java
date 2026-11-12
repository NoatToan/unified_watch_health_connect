package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001aF\u0010\u0011\u001a\u00020\f*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0080\bø\u0001\u0000\"4\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00128\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "", "buildAlternativeNamesMap", "Lkotlinx/serialization/json/Json;", "json", "name", "getJsonNameIndex", "getJsonNameIndexOrThrow", "elementDescriptor", "Lkotlin/Function0;", "", "peekNull", "peekString", "", "onEnumCoercing", "tryCoerceValue", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "a", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "getJsonAlternativeNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "getJsonAlternativeNamesKey$annotations", "()V", "JsonAlternativeNamesKey", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonNamesMapKt {

    @NotNull
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> a = new DescriptorSchemaCache.Key<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Map<String, ? extends Integer>> {
        public a(SerialDescriptor serialDescriptor) {
            super(0, serialDescriptor, JsonNamesMapKt.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, Integer> invoke() {
            return JsonNamesMapKt.buildAlternativeNamesMap((SerialDescriptor) this.receiver);
        }
    }

    private static final void a(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for property " + serialDescriptor.getElementName(i) + " is already one of the names for property " + serialDescriptor.getElementName(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + serialDescriptor);
    }

    @NotNull
    public static final Map<String, Integer> buildAlternativeNamesMap(@NotNull SerialDescriptor serialDescriptor) {
        String[] a2;
        int elementsCount = serialDescriptor.getElementsCount();
        Map<String, Integer> mapCreateMapForCache = null;
        if (elementsCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i);
                ArrayList arrayList = new ArrayList();
                for (Object obj : elementAnnotations) {
                    if (obj instanceof JsonNames) {
                        arrayList.add(obj);
                    }
                }
                JsonNames jsonNames = (JsonNames) CollectionsKt.singleOrNull((List) arrayList);
                if (jsonNames != null && (a2 = jsonNames.getA()) != null) {
                    for (String str : a2) {
                        if (mapCreateMapForCache == null) {
                            mapCreateMapForCache = CreateMapForCacheKt.createMapForCache(serialDescriptor.getElementsCount());
                        }
                        a(mapCreateMapForCache, serialDescriptor, str, i);
                    }
                }
                if (i2 >= elementsCount) {
                    break;
                }
                i = i2;
            }
        }
        return mapCreateMapForCache == null ? r.emptyMap() : mapCreateMapForCache;
    }

    @NotNull
    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonAlternativeNamesKey() {
        return a;
    }

    public static /* synthetic */ void getJsonAlternativeNamesKey$annotations() {
    }

    public static final int getJsonNameIndex(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull String str) {
        int elementIndex = serialDescriptor.getElementIndex(str);
        if (elementIndex != -3 || !json.getConfiguration().getUseAlternativeNames()) {
            return elementIndex;
        }
        Integer num = (Integer) ((Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, a, new a(serialDescriptor))).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int getJsonNameIndexOrThrow(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull String str) {
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, str);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + str + '\'');
    }

    public static final boolean tryCoerceValue(@NotNull Json json, @NotNull SerialDescriptor serialDescriptor, @NotNull Function0<Boolean> function0, @NotNull Function0<String> function1, @NotNull Function0<Unit> function2) {
        String strInvoke;
        if (!serialDescriptor.isNullable() && function0.invoke().booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || (strInvoke = function1.invoke()) == null || getJsonNameIndex(serialDescriptor, json, strInvoke) != -3) {
            return false;
        }
        function2.invoke();
        return true;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor serialDescriptor, Function0 function0, Function0 function1, Function0 function2, int i, Object obj) {
        String str;
        if ((i & 8) != 0) {
            function2 = new Function0<Unit>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        if (!serialDescriptor.isNullable() && ((Boolean) function0.invoke()).booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || (str = (String) function1.invoke()) == null || getJsonNameIndex(serialDescriptor, json, str) != -3) {
            return false;
        }
        function2.invoke();
        return true;
    }
}
