package kotlinx.serialization.json.internal;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u001c\u0010\u0014\u001a\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\""}, d2 = {"Lkotlinx/serialization/json/internal/h;", "Lkotlinx/serialization/json/internal/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "", "index", "", "elementName", "descriptor", "decodeElementIndex", "tag", "Lkotlinx/serialization/json/JsonElement;", GoogleApiAvailabilityLight.a, "", "endStructure", "Lkotlinx/serialization/json/JsonObject;", z.j, "Lkotlinx/serialization/json/JsonObject;", "x", "()Lkotlinx/serialization/json/JsonObject;", "value", "", hl.k, "Ljava/util/List;", "keys", "l", LogUtil.I, "size", "m", "position", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
final class h extends d {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final JsonObject value;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final List<String> keys;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int position;

    public h(@NotNull Json json, @NotNull JsonObject jsonObject) {
        super(json, jsonObject, null, null, 12, null);
        this.value = jsonObject;
        List<String> list = CollectionsKt___CollectionsKt.toList(getValue().keySet());
        this.keys = list;
        this.size = list.size() * 2;
        this.position = -1;
    }

    @Override // kotlinx.serialization.json.internal.d, kotlinx.serialization.json.internal.a
    @NotNull
    public JsonElement d(@NotNull String tag) {
        return this.position % 2 == 0 ? JsonElementKt.JsonPrimitive(tag) : (JsonElement) MapsKt.getValue(getValue(), tag);
    }

    @Override // kotlinx.serialization.json.internal.d, kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        int i = this.position;
        if (i >= this.size - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.position = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.d, kotlinx.serialization.internal.NamedValueDecoder
    @NotNull
    public String elementName(@NotNull SerialDescriptor desc, int index) {
        return this.keys.get(index / 2);
    }

    @Override // kotlinx.serialization.json.internal.d, kotlinx.serialization.json.internal.a, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
    }

    @Override // kotlinx.serialization.json.internal.d, kotlinx.serialization.json.internal.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter and merged with bridge method [inline-methods] */
    public JsonObject getValue() {
        return this.value;
    }
}
