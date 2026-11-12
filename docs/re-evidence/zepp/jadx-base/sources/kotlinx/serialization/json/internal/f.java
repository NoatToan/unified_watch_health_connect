package kotlinx.serialization.json.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u001c\u0010\u0012\u001a\u00020\r8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/f;", "Lkotlinx/serialization/json/internal/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "", "index", "", "elementName", "tag", "Lkotlinx/serialization/json/JsonElement;", GoogleApiAvailabilityLight.a, "descriptor", "decodeElementIndex", "Lkotlinx/serialization/json/JsonArray;", "f", "Lkotlinx/serialization/json/JsonArray;", "w", "()Lkotlinx/serialization/json/JsonArray;", "value", "g", LogUtil.I, "size", "h", "currentIndex", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonArray;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
final class f extends a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final JsonArray value;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int currentIndex;

    public f(@NotNull Json json, @NotNull JsonArray jsonArray) {
        super(json, jsonArray, null);
        this.value = jsonArray;
        this.size = getValue().size();
        this.currentIndex = -1;
    }

    @Override // kotlinx.serialization.json.internal.a
    @NotNull
    public JsonElement d(@NotNull String tag) {
        return getValue().get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        int i = this.currentIndex;
        if (i >= this.size - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.currentIndex = i2;
        return i2;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    @NotNull
    public String elementName(@NotNull SerialDescriptor desc, int index) {
        return String.valueOf(index);
    }

    @Override // kotlinx.serialization.json.internal.a
    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public JsonArray getValue() {
        return this.value;
    }
}
