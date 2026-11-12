package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "readJson", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "", "discriminator", "Lkotlinx/serialization/json/JsonObject;", "readPolymorphicJson", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class TreeJsonDecoderKt {
    public static final <T> T readJson(@NotNull Json json, @NotNull JsonElement jsonElement, @NotNull DeserializationStrategy<T> deserializationStrategy) {
        Decoder bVar;
        if (jsonElement instanceof JsonObject) {
            bVar = new d(json, (JsonObject) jsonElement, null, null, 12, null);
        } else if (jsonElement instanceof JsonArray) {
            bVar = new f(json, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof JsonLiteral ? true : Intrinsics.areEqual(jsonElement, JsonNull.INSTANCE))) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new b(json, (JsonPrimitive) jsonElement);
        }
        return (T) bVar.decodeSerializableValue(deserializationStrategy);
    }

    public static final <T> T readPolymorphicJson(@NotNull Json json, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull DeserializationStrategy<T> deserializationStrategy) {
        return (T) new d(json, jsonObject, str, deserializationStrategy.getDescriptor()).decodeSerializableValue(deserializationStrategy);
    }
}
