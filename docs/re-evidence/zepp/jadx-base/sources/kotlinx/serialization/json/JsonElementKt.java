package kotlinx.serialization.json;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Reflection;
import kotlin.text.k;
import kotlin.text.l;
import kotlinx.serialization.json.internal.StringOpsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0006\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0001\"\u0017\u0010\u0010\u001a\u00020\u0002*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0014\u001a\u00020\u0011*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0018\u001a\u00020\u0015*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u001c\u001a\u00020\u0019*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010 \u001a\u00020\u001d*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0019\u0010#\u001a\u0004\u0018\u00010\u001d*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0017\u0010'\u001a\u00020$*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0019\u0010*\u001a\u0004\u0018\u00010$*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0017\u0010.\u001a\u00020+*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0019\u00101\u001a\u0004\u0018\u00010+*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0017\u00105\u001a\u000202*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0019\u00108\u001a\u0004\u0018\u000102*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0017\u0010;\u001a\u00020\u0000*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0019\u0010>\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b<\u0010=\"\u0019\u0010A\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "JsonPrimitive", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "", "Lkotlinx/serialization/json/JsonElement;", "element", "", "a", "key", "expected", "unexpectedJson", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "Lkotlinx/serialization/json/JsonArray;", "getJsonArray", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonArray", "Lkotlinx/serialization/json/JsonNull;", "getJsonNull", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonNull;", "jsonNull", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "", "getLong", "(Lkotlinx/serialization/json/JsonPrimitive;)J", SportAnalytics.ParamValue.PicType.LONG, "getLongOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "getDoubleOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", TypedValues.Custom.S_FLOAT, "getFloatOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Float;", "floatOrNull", "getBoolean", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", TypedValues.Custom.S_BOOLEAN, "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonElementKt {
    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new JsonLiteral(bool, false);
    }

    private static final Void a(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final boolean getBoolean(@NotNull JsonPrimitive jsonPrimitive) {
        Boolean booleanStrictOrNull = StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        return StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    @Nullable
    public static final String getContentOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final double getDouble(@NotNull JsonPrimitive jsonPrimitive) {
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        return k.toDoubleOrNull(jsonPrimitive.getContent());
    }

    public static final float getFloat(@NotNull JsonPrimitive jsonPrimitive) {
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        return k.toFloatOrNull(jsonPrimitive.getContent());
    }

    public static final int getInt(@NotNull JsonPrimitive jsonPrimitive) {
        return Integer.parseInt(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        return l.toIntOrNull(jsonPrimitive.getContent());
    }

    @NotNull
    public static final JsonArray getJsonArray(@NotNull JsonElement jsonElement) {
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        a(jsonElement, "JsonArray");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonNull getJsonNull(@NotNull JsonElement jsonElement) {
        JsonNull jsonNull = jsonElement instanceof JsonNull ? (JsonNull) jsonElement : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        a(jsonElement, "JsonNull");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonObject getJsonObject(@NotNull JsonElement jsonElement) {
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        a(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonPrimitive getJsonPrimitive(@NotNull JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        a(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final long getLong(@NotNull JsonPrimitive jsonPrimitive) {
        return Long.parseLong(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Long getLongOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        return l.toLongOrNull(jsonPrimitive.getContent());
    }

    @PublishedApi
    @NotNull
    public static final Void unexpectedJson(@NotNull String str, @NotNull String str2) {
        throw new IllegalArgumentException("Element " + str + " is not a " + str2);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(number, false);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(str, true);
    }
}
