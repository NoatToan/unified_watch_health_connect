package kotlinx.serialization.json.internal;

import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/i;", "Lkotlinx/serialization/json/internal/e;", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "g", "Ljava/lang/String;", "tag", "", "h", "Z", "isKey", "Lkotlinx/serialization/json/Json;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
final class i extends e {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String tag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isKey;

    public i(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> function1) {
        super(json, function1);
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.e, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    @NotNull
    public JsonElement p() {
        return new JsonObject(r());
    }

    @Override // kotlinx.serialization.json.internal.e, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void q(@NotNull String key, @NotNull JsonElement element) {
        if (!this.isKey) {
            Map<String, JsonElement> mapR = r();
            String str = this.tag;
            Objects.requireNonNull(str);
            mapR.put(str, element);
            this.isKey = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.tag = ((JsonPrimitive) element).getContent();
            this.isKey = false;
        } else {
            if (element instanceof JsonObject) {
                throw JsonExceptionsKt.InvalidKeyKindException(JsonObjectSerializer.INSTANCE.getDescriptor());
            }
            if (!(element instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw JsonExceptionsKt.InvalidKeyKindException(JsonArraySerializer.INSTANCE.getDescriptor());
        }
    }
}
