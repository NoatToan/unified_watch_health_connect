package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&R\u0016\u0010\b\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Lkotlinx/serialization/json/JsonElement;", "decodeJsonElement", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public interface JsonDecoder extends Decoder, CompositeDecoder {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static int decodeCollectionSize(@NotNull JsonDecoder jsonDecoder, @NotNull SerialDescriptor serialDescriptor) {
            return CompositeDecoder.DefaultImpls.decodeCollectionSize(jsonDecoder, serialDescriptor);
        }

        @ExperimentalSerializationApi
        @Nullable
        public static <T> T decodeNullableSerializableValue(@NotNull JsonDecoder jsonDecoder, @NotNull DeserializationStrategy<T> deserializationStrategy) {
            return (T) Decoder.DefaultImpls.decodeNullableSerializableValue(jsonDecoder, deserializationStrategy);
        }

        @ExperimentalSerializationApi
        public static boolean decodeSequentially(@NotNull JsonDecoder jsonDecoder) {
            return CompositeDecoder.DefaultImpls.decodeSequentially(jsonDecoder);
        }

        public static <T> T decodeSerializableValue(@NotNull JsonDecoder jsonDecoder, @NotNull DeserializationStrategy<T> deserializationStrategy) {
            return (T) Decoder.DefaultImpls.decodeSerializableValue(jsonDecoder, deserializationStrategy);
        }
    }

    @NotNull
    JsonElement decodeJsonElement();

    @NotNull
    Json getJson();
}
