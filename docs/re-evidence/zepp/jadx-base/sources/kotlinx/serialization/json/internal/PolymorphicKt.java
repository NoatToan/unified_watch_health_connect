package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001aA\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0004\u001a\u00020\nH\u0002\u001a*\u0010\u000f\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u001a'\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "Lkotlin/Function0;", "", "ifPolymorphic", "encodePolymorphically", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "", "a", "actualSerializer", "", "classDiscriminator", "c", "Lkotlinx/serialization/descriptors/SerialKind;", XimalayaConst.KIND, "checkKind", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValuePolymorphic", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "type", "Lkotlinx/serialization/json/JsonObject;", "jsonTree", "", "b", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class PolymorphicKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SerializationStrategy<Object> a(JsonEncoder jsonEncoder, SerializationStrategy<Object> serializationStrategy, Object obj) {
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializationStrategy;
        SerializationStrategy<Object> serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer<Object>) abstractPolymorphicSerializer, jsonEncoder, obj);
        c(abstractPolymorphicSerializer, serializationStrategyFindPolymorphicSerializer, jsonEncoder.getJson().getConfiguration().getClassDiscriminator());
        checkKind(serializationStrategyFindPolymorphicSerializer.getDescriptor().getKind());
        return serializationStrategyFindPolymorphicSerializer;
    }

    private static final Void b(String str, JsonObject jsonObject) {
        String str2;
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + ((Object) str) + '\'';
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, Intrinsics.stringPlus("Polymorphic serializer was not found for ", str2), jsonObject.toString());
    }

    private static final void c(SerializationStrategy<?> serializationStrategy, SerializationStrategy<Object> serializationStrategy2, String str) {
        if ((serializationStrategy instanceof SealedClassSerializer) && JsonInternalDependenciesKt.jsonCachedSerialNames(serializationStrategy2.getDescriptor()).contains(str)) {
            String serialName = serializationStrategy.getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + serializationStrategy2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final void checkKind(@NotNull SerialKind serialKind) {
        if (serialKind instanceof SerialKind.ENUM) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (serialKind instanceof PrimitiveKind) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (serialKind instanceof PolymorphicKind) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final <T> T decodeSerializableValuePolymorphic(@NotNull JsonDecoder jsonDecoder, @NotNull DeserializationStrategy<T> deserializationStrategy) {
        JsonPrimitive jsonPrimitive;
        if (!(deserializationStrategy instanceof AbstractPolymorphicSerializer) || jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializationStrategy.deserialize(jsonDecoder);
        }
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        SerialDescriptor descriptor = deserializationStrategy.getDescriptor();
        if (!(jsonElementDecodeJsonElement instanceof JsonObject)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementDecodeJsonElement.getClass()));
        }
        JsonObject jsonObject = (JsonObject) jsonElementDecodeJsonElement;
        String classDiscriminator = jsonDecoder.getJson().getConfiguration().getClassDiscriminator();
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) classDiscriminator);
        String content = null;
        if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
            content = jsonPrimitive.getContent();
        }
        DeserializationStrategy<? extends T> deserializationStrategyFindPolymorphicSerializerOrNull = ((AbstractPolymorphicSerializer) deserializationStrategy).findPolymorphicSerializerOrNull(jsonDecoder, content);
        if (deserializationStrategyFindPolymorphicSerializerOrNull != null) {
            return (T) TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), classDiscriminator, jsonObject, deserializationStrategyFindPolymorphicSerializerOrNull);
        }
        b(content, jsonObject);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void encodePolymorphically(@NotNull JsonEncoder jsonEncoder, @NotNull SerializationStrategy<? super T> serializationStrategy, T t, @NotNull Function0<Unit> function0) {
        if (!(serializationStrategy instanceof AbstractPolymorphicSerializer) || jsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializationStrategy.serialize(jsonEncoder, t);
            return;
        }
        Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.Any");
        SerializationStrategy serializationStrategyA = a(jsonEncoder, serializationStrategy, t);
        function0.invoke();
        serializationStrategyA.serialize(jsonEncoder, t);
    }
}
