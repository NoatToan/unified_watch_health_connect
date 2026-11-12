package kotlinx.serialization.json;

import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.httpsupport.model.DataItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\n\u001a2\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a2\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a-\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003\u001a-\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003\u001a%\u0010\u0011\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u001a\u001b\u0010\u0014\u001a\u00020\u000f*\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0014\u001a\u00020\u000f*\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u000f*\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u001a#\u0010\u0016\u001a\u00020\u000f*\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003\u001a#\u0010\u0017\u001a\u00020\u000f*\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003\"\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObjectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Lkotlinx/serialization/json/JsonObject;", "buildJsonObject", "Lkotlinx/serialization/json/JsonArrayBuilder;", "Lkotlinx/serialization/json/JsonArray;", "buildJsonArray", "", "key", "Lkotlinx/serialization/json/JsonElement;", "putJsonObject", "putJsonArray", "", "value", DataItem.HTTP_METHOD_PUT, "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;", "", TransportUri.ACTION_ADD, "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/Boolean;)Z", "addJsonObject", "addJsonArray", "a", "Ljava/lang/String;", "infixToDeprecated", "b", "unaryPlusDeprecated", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonElementBuildersKt {

    @NotNull
    private static final String a = "Infix 'to' operator is deprecated for removal for the favour of 'add'";

    @NotNull
    private static final String b = "Unary plus is deprecated for removal for the favour of 'add'";

    public static final boolean add(@NotNull JsonArrayBuilder jsonArrayBuilder, @Nullable Boolean bool) {
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(bool));
    }

    public static final boolean addJsonArray(@NotNull JsonArrayBuilder jsonArrayBuilder, @NotNull Function1<? super JsonArrayBuilder, Unit> function1) {
        JsonArrayBuilder jsonArrayBuilder2 = new JsonArrayBuilder();
        function1.invoke(jsonArrayBuilder2);
        return jsonArrayBuilder.add(jsonArrayBuilder2.build());
    }

    public static final boolean addJsonObject(@NotNull JsonArrayBuilder jsonArrayBuilder, @NotNull Function1<? super JsonObjectBuilder, Unit> function1) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        function1.invoke(jsonObjectBuilder);
        return jsonArrayBuilder.add(jsonObjectBuilder.build());
    }

    @NotNull
    public static final JsonArray buildJsonArray(@NotNull Function1<? super JsonArrayBuilder, Unit> function1) {
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        function1.invoke(jsonArrayBuilder);
        return jsonArrayBuilder.build();
    }

    @NotNull
    public static final JsonObject buildJsonObject(@NotNull Function1<? super JsonObjectBuilder, Unit> function1) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        function1.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.build();
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder jsonObjectBuilder, @NotNull String str, @Nullable Boolean bool) {
        return jsonObjectBuilder.put(str, JsonElementKt.JsonPrimitive(bool));
    }

    @Nullable
    public static final JsonElement putJsonArray(@NotNull JsonObjectBuilder jsonObjectBuilder, @NotNull String str, @NotNull Function1<? super JsonArrayBuilder, Unit> function1) {
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        function1.invoke(jsonArrayBuilder);
        return jsonObjectBuilder.put(str, jsonArrayBuilder.build());
    }

    @Nullable
    public static final JsonElement putJsonObject(@NotNull JsonObjectBuilder jsonObjectBuilder, @NotNull String str, @NotNull Function1<? super JsonObjectBuilder, Unit> function1) {
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        function1.invoke(jsonObjectBuilder2);
        return jsonObjectBuilder.put(str, jsonObjectBuilder2.build());
    }

    public static final boolean add(@NotNull JsonArrayBuilder jsonArrayBuilder, @Nullable Number number) {
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(number));
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder jsonObjectBuilder, @NotNull String str, @Nullable Number number) {
        return jsonObjectBuilder.put(str, JsonElementKt.JsonPrimitive(number));
    }

    public static final boolean add(@NotNull JsonArrayBuilder jsonArrayBuilder, @Nullable String str) {
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(str));
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder jsonObjectBuilder, @NotNull String str, @Nullable String str2) {
        return jsonObjectBuilder.put(str, JsonElementKt.JsonPrimitive(str2));
    }
}
