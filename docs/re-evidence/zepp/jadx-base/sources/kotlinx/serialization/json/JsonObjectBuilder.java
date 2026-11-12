package kotlinx.serialization.json;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0007H\u0001R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", DataItem.HTTP_METHOD_PUT, "Lkotlinx/serialization/json/JsonObject;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Ljava/util/Map;", "content", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
@JsonDslMarker
public final class JsonObjectBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, JsonElement> content = new LinkedHashMap();

    @PublishedApi
    public JsonObjectBuilder() {
    }

    @PublishedApi
    @NotNull
    public final JsonObject build() {
        return new JsonObject(this.content);
    }

    @Nullable
    public final JsonElement put(@NotNull String key, @NotNull JsonElement element) {
        return this.content.put(key, element);
    }
}
