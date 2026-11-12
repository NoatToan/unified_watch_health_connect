package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a,\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\n\u0010\u000b\"\u0016\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "Lkotlinx/serialization/json/JsonElement;", "writeJson", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cast", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/JsonElement;", "", "PRIMITIVE_TAG", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class TreeJsonEncoderKt {

    @NotNull
    public static final String PRIMITIVE_TAG = "primitive";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/JsonElement;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JsonElement, Unit> {
        public final /* synthetic */ Ref.ObjectRef<JsonElement> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<JsonElement> objectRef) {
            super(1);
            this.a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NotNull JsonElement jsonElement) {
            this.a.element = jsonElement;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonElement jsonElement) {
            a(jsonElement);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends JsonElement> T cast(JsonElement jsonElement, SerialDescriptor serialDescriptor) {
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (jsonElement instanceof JsonElement) {
            return jsonElement;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb.append(Reflection.getOrCreateKotlinClass(JsonElement.class));
        sb.append(" as the serialized body of ");
        sb.append(serialDescriptor.getSerialName());
        sb.append(", but had ");
        sb.append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString());
    }

    @NotNull
    public static final <T> JsonElement writeJson(@NotNull Json json, T t, @NotNull SerializationStrategy<? super T> serializationStrategy) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new e(json, new a(objectRef)).encodeSerializableValue(serializationStrategy, t);
        T t2 = objectRef.element;
        Objects.requireNonNull(t2);
        return (JsonElement) t2;
    }
}
