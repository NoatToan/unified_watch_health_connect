package kotlinx.serialization.json.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.y;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lkotlinx/serialization/json/internal/d;", "Lkotlinx/serialization/json/internal/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "tag", "", "w", "decodeElementIndex", "desc", "elementName", "Lkotlinx/serialization/json/JsonElement;", GoogleApiAvailabilityLight.a, "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "", "endStructure", "Lkotlinx/serialization/json/JsonObject;", "f", "Lkotlinx/serialization/json/JsonObject;", "x", "()Lkotlinx/serialization/json/JsonObject;", "value", "g", "Ljava/lang/String;", "polyDiscriminator", "h", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "polyDescriptor", "i", LogUtil.I, "position", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
class d extends kotlinx.serialization.json.internal.a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final JsonObject value;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final String polyDiscriminator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final SerialDescriptor polyDescriptor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int position;

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

    public /* synthetic */ d(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean w(SerialDescriptor descriptor, int index, String tag) {
        Json json = getJson();
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (!elementDescriptor.isNullable() && (d(tag) instanceof JsonNull)) {
            return true;
        }
        if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            JsonElement jsonElementD = d(tag);
            JsonPrimitive jsonPrimitive = jsonElementD instanceof JsonPrimitive ? (JsonPrimitive) jsonElementD : null;
            String contentOrNull = jsonPrimitive != null ? JsonElementKt.getContentOrNull(jsonPrimitive) : null;
            if (contentOrNull != null && JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, contentOrNull) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.a, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        return descriptor == this.polyDescriptor ? this : super.beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.json.internal.a
    @NotNull
    public JsonElement d(@NotNull String tag) {
        return (JsonElement) MapsKt.getValue(getValue(), tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        while (this.position < descriptor.getElementsCount()) {
            int i = this.position;
            this.position = i + 1;
            String tag = getTag(descriptor, i);
            if (getValue().containsKey((Object) tag) && (!this.configuration.getCoerceInputValues() || !w(descriptor, this.position - 1, tag))) {
                return this.position - 1;
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    @NotNull
    public String elementName(@NotNull SerialDescriptor desc, int index) {
        Object next;
        Integer num;
        String elementName = desc.getElementName(index);
        if (!this.configuration.getUseAlternativeNames() || getValue().keySet().contains(elementName)) {
            return elementName;
        }
        Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).getOrPut(desc, JsonNamesMapKt.getJsonAlternativeNamesKey(), new a(desc));
        Iterator<T> it2 = getValue().keySet().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            num = (Integer) map.get((String) next);
        } while (!(num != null && num.intValue() == index));
        String str = (String) next;
        return str == null ? elementName : str;
    }

    @Override // kotlinx.serialization.json.internal.a, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Set<String> setPlus;
        if (this.configuration.getIgnoreUnknownKeys() || (descriptor.getKind() instanceof PolymorphicKind)) {
            return;
        }
        if (this.configuration.getUseAlternativeNames()) {
            Set<String> setJsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonAlternativeNamesKey());
            Set setKeySet = map == null ? null : map.keySet();
            if (setKeySet == null) {
                setKeySet = y.emptySet();
            }
            setPlus = z.plus((Set) setJsonCachedSerialNames, (Iterable) setKeySet);
        } else {
            setPlus = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
        }
        for (String str : getValue().keySet()) {
            if (!setPlus.contains(str) && !Intrinsics.areEqual(str, this.polyDiscriminator)) {
                throw JsonExceptionsKt.UnknownKeyException(str, getValue().toString());
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public JsonObject getValue() {
        return this.value;
    }

    public d(@NotNull Json json, @NotNull JsonObject jsonObject, @Nullable String str, @Nullable SerialDescriptor serialDescriptor) {
        super(json, jsonObject, null);
        this.value = jsonObject;
        this.polyDiscriminator = str;
        this.polyDescriptor = serialDescriptor;
    }
}
