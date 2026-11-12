package kotlinx.serialization.json;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.watch.notification.TransportUri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/JsonArrayBuilder;", "", "Lkotlinx/serialization/json/JsonElement;", "element", "", TransportUri.ACTION_ADD, "Lkotlinx/serialization/json/JsonArray;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Ljava/util/List;", "content", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
@JsonDslMarker
public final class JsonArrayBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<JsonElement> content = new ArrayList();

    @PublishedApi
    public JsonArrayBuilder() {
    }

    public final boolean add(@NotNull JsonElement element) {
        this.content.add(element);
        return true;
    }

    @PublishedApi
    @NotNull
    public final JsonArray build() {
        return new JsonArray(this.content);
    }
}
