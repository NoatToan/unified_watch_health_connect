package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010B\u001a\u00020>\u0012\u0006\u0010F\u001a\u00020\u0003¢\u0006\u0004\bN\u0010OJ\b\u0010\u0004\u001a\u00020\u0003H\u0002JA\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0005*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0002\b\u000bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016J#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\bH\u0004J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\bH$J\u0018\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001cH\u0014J\u0012\u0010*\u001a\u0004\u0018\u00010\u000f2\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u0010+\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u0010,\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u00100\u001a\u00020/2\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u00101\u001a\u00020(2\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u00103\u001a\u0002022\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u00105\u001a\u0002042\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u00107\u001a\u0002062\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u00109\u001a\u0002082\u0006\u0010$\u001a\u00020\bH\u0014J\u0010\u0010:\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0014J\u0018\u0010=\u001a\u00020<2\u0006\u0010$\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u001cH\u0014R\u001c\u0010B\u001a\u00020>8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010F\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020G8\u0004@\u0005X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010HR\u0016\u0010M\u001a\u00020J8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0001\u0003PQR¨\u0006S"}, d2 = {"Lkotlinx/serialization/json/internal/a;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/JsonElement;", "e", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/JsonPrimitive;", "", TreeJsonEncoderKt.PRIMITIVE_TAG, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "u", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "v", "type", "Lkotlinx/serialization/json/JsonLiteral;", "c", "decodeJsonElement", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "parentName", "childName", "composeName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "", "endStructure", "", "decodeNotNullMark", "tag", SOAP.XMLNS, GoogleApiAvailabilityLight.a, "enumDescriptor", "", z.j, com.google.android.exoplayer2.text.ttml.b.r, "o", "f", "", "g", "", DTransferConstants.SEARCH_KEY, "m", "", GoogleApiAvailabilityLight.b, "", hl.k, "", "i", "", "h", "r", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "l", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/JsonElement;", "t", "()Lkotlinx/serialization/json/JsonElement;", "value", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/json/internal/b;", "Lkotlinx/serialization/json/internal/d;", "Lkotlinx/serialization/json/internal/f;", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
abstract class a extends NamedValueDecoder implements JsonDecoder {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Json json;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final JsonElement value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final JsonConfiguration configuration;

    private a(Json json, JsonElement jsonElement) {
        this.json = json;
        this.value = jsonElement;
        this.configuration = getJson().getConfiguration();
    }

    public /* synthetic */ a(Json json, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement);
    }

    private final JsonLiteral c(JsonPrimitive jsonPrimitive, String str) {
        JsonLiteral jsonLiteral = jsonPrimitive instanceof JsonLiteral ? (JsonLiteral) jsonPrimitive : null;
        if (jsonLiteral != null) {
            return jsonLiteral;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' when " + str + " was expected");
    }

    private final JsonElement e() {
        String currentTagOrNull = getCurrentTagOrNull();
        JsonElement jsonElementD = currentTagOrNull == null ? null : d(currentTagOrNull);
        return jsonElementD == null ? getValue() : jsonElementD;
    }

    private final <T> T u(JsonPrimitive jsonPrimitive, String str, Function1<? super JsonPrimitive, ? extends T> function1) {
        try {
            T tInvoke = function1.invoke(jsonPrimitive);
            if (tInvoke != null) {
                return tInvoke;
            }
            v(str);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            v(str);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Void v(String primitive) {
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse '" + primitive + '\'', e().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        JsonElement jsonElementE = e();
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) ? true : kind instanceof PolymorphicKind) {
            Json json = getJson();
            if (jsonElementE instanceof JsonArray) {
                return new f(json, (JsonArray) jsonElementE);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementE.getClass()));
        }
        if (!Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json2 = getJson();
            if (jsonElementE instanceof JsonObject) {
                return new d(json2, (JsonObject) jsonElementE, null, null, 12, null);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementE.getClass()));
        }
        Json json3 = getJson();
        SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json3.getSerializersModule());
        SerialKind kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof PrimitiveKind) || Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
            Json json4 = getJson();
            if (jsonElementE instanceof JsonObject) {
                return new h(json4, (JsonObject) jsonElementE);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementE.getClass()));
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
        }
        Json json5 = getJson();
        if (jsonElementE instanceof JsonArray) {
            return new f(json5, (JsonArray) jsonElementE);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementE.getClass()));
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    @NotNull
    public String composeName(@NotNull String parentName, @NotNull String childName) {
        return childName;
    }

    @NotNull
    public abstract JsonElement d(@NotNull String tag);

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return e();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(e() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<T> deserializer) {
        return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean decodeTaggedBoolean(@NotNull String tag) {
        JsonPrimitive jsonPrimitiveS = s(tag);
        if (!getJson().getConfiguration().getIsLenient() && c(jsonPrimitiveS, TypedValues.Custom.S_BOOLEAN).getIsString()) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e().toString());
        }
        try {
            Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitiveS);
            if (booleanOrNull != null) {
                return booleanOrNull.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            v(TypedValues.Custom.S_BOOLEAN);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public byte decodeTaggedByte(@NotNull String tag) {
        try {
            int i = JsonElementKt.getInt(s(tag));
            boolean z = false;
            if (-128 <= i && i <= 127) {
                z = true;
            }
            Byte bValueOf = z ? Byte.valueOf((byte) i) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            v("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            v("byte");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public char decodeTaggedChar(@NotNull String tag) {
        try {
            return StringsKt___StringsKt.single(s(tag).getContent());
        } catch (IllegalArgumentException unused) {
            v("char");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public double decodeTaggedDouble(@NotNull String tag) {
        try {
            double d = JsonElementKt.getDouble(s(tag));
            if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
                    throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d), tag, e().toString());
                }
            }
            return d;
        } catch (IllegalArgumentException unused) {
            v("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int decodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor) {
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, getJson(), s(tag).getContent());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public float decodeTaggedFloat(@NotNull String tag) {
        try {
            float f = JsonElementKt.getFloat(s(tag));
            if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
                    throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f), tag, e().toString());
                }
            }
            return f;
        } catch (IllegalArgumentException unused) {
            v(TypedValues.Custom.S_FLOAT);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Decoder decodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new JsonDecoderForUnsignedTypes(new JsonReader(s(tag).getContent()), getJson()) : super.decodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int decodeTaggedInt(@NotNull String tag) {
        try {
            return JsonElementKt.getInt(s(tag));
        } catch (IllegalArgumentException unused) {
            v("int");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public long decodeTaggedLong(@NotNull String tag) {
        try {
            return JsonElementKt.getLong(s(tag));
        } catch (IllegalArgumentException unused) {
            v(SportAnalytics.ParamValue.PicType.LONG);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean decodeTaggedNotNullMark(@NotNull String tag) {
        return d(tag) != JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    @Nullable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Void decodeTaggedNull(@NotNull String tag) {
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public short decodeTaggedShort(@NotNull String tag) {
        try {
            int i = JsonElementKt.getInt(s(tag));
            boolean z = false;
            if (-32768 <= i && i <= 32767) {
                z = true;
            }
            Short shValueOf = z ? Short.valueOf((short) i) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            v(SportAnalytics.ParamValue.PicType.SHORT);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            v(SportAnalytics.ParamValue.PicType.SHORT);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public String decodeTaggedString(@NotNull String tag) {
        JsonPrimitive jsonPrimitiveS = s(tag);
        if (getJson().getConfiguration().getIsLenient() || c(jsonPrimitiveS, "string").getIsString()) {
            if (jsonPrimitiveS instanceof JsonNull) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' value instead of string literal", e().toString());
            }
            return jsonPrimitiveS.getContent();
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e().toString());
    }

    @NotNull
    public final JsonPrimitive s(@NotNull String tag) {
        JsonElement jsonElementD = d(tag);
        JsonPrimitive jsonPrimitive = jsonElementD instanceof JsonPrimitive ? (JsonPrimitive) jsonElementD : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected JsonPrimitive at " + tag + ", found " + jsonElementD, e().toString());
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public JsonElement getValue() {
        return this.value;
    }
}
