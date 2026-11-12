package kotlinx.serialization.json.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/internal/b;", "Lkotlinx/serialization/json/internal/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "decodeElementIndex", "", "tag", "Lkotlinx/serialization/json/JsonElement;", GoogleApiAvailabilityLight.a, "Lkotlinx/serialization/json/JsonPrimitive;", "f", "Lkotlinx/serialization/json/JsonPrimitive;", "w", "()Lkotlinx/serialization/json/JsonPrimitive;", "value", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonPrimitive;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
final class b extends a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final JsonPrimitive value;

    public b(@NotNull Json json, @NotNull JsonPrimitive jsonPrimitive) {
        super(json, jsonPrimitive, null);
        this.value = jsonPrimitive;
        pushTag(TreeJsonEncoderKt.PRIMITIVE_TAG);
    }

    @Override // kotlinx.serialization.json.internal.a
    @NotNull
    public JsonElement d(@NotNull String tag) {
        if (tag == TreeJsonEncoderKt.PRIMITIVE_TAG) {
            return getValue();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.a
    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public JsonPrimitive getValue() {
        return this.value;
    }
}
