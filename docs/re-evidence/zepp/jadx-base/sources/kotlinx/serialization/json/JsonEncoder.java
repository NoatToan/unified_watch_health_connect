package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&R\u0016\u0010\n\u001a\u00020\u00078&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/json/JsonElement;", "element", "", "encodeJsonElement", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public interface JsonEncoder extends Encoder, CompositeEncoder {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static CompositeEncoder beginCollection(@NotNull JsonEncoder jsonEncoder, @NotNull SerialDescriptor serialDescriptor, int i) {
            return Encoder.DefaultImpls.beginCollection(jsonEncoder, serialDescriptor, i);
        }

        @ExperimentalSerializationApi
        public static void encodeNotNullMark(@NotNull JsonEncoder jsonEncoder) {
            Encoder.DefaultImpls.encodeNotNullMark(jsonEncoder);
        }

        @ExperimentalSerializationApi
        public static <T> void encodeNullableSerializableValue(@NotNull JsonEncoder jsonEncoder, @NotNull SerializationStrategy<? super T> serializationStrategy, @Nullable T t) {
            Encoder.DefaultImpls.encodeNullableSerializableValue(jsonEncoder, serializationStrategy, t);
        }

        public static <T> void encodeSerializableValue(@NotNull JsonEncoder jsonEncoder, @NotNull SerializationStrategy<? super T> serializationStrategy, T t) {
            Encoder.DefaultImpls.encodeSerializableValue(jsonEncoder, serializationStrategy, t);
        }

        @ExperimentalSerializationApi
        public static boolean shouldEncodeElementDefault(@NotNull JsonEncoder jsonEncoder, @NotNull SerialDescriptor serialDescriptor, int i) {
            return CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(jsonEncoder, serialDescriptor, i);
        }
    }

    void encodeJsonElement(@NotNull JsonElement element);

    @NotNull
    Json getJson();
}
