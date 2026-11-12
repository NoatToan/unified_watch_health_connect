package kotlinx.serialization.json.internal;

import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/e;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "", "f", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "content", "Lkotlinx/serialization/json/Json;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
class e extends AbstractJsonTreeEncoder {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<String, JsonElement> content;

    public e(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> function1) {
        super(json, function1, null);
        this.content = new LinkedHashMap();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    @NotNull
    public JsonElement p() {
        return new JsonObject(this.content);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void q(@NotNull String key, @NotNull JsonElement element) {
        this.content.put(key, element);
    }

    @NotNull
    public final Map<String, JsonElement> r() {
        return this.content;
    }
}
