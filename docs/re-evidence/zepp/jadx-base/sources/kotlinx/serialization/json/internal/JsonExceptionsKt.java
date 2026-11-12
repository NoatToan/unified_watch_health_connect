package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000\u001a \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000\u001a \u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\u001a \u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a\u0016\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0018"}, d2 = {"", "offset", "", "message", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "JsonDecodingException", "input", "", "value", "output", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "InvalidFloatingPointEncoded", "key", "InvalidFloatingPointDecoded", "Lkotlinx/serialization/json/internal/JsonLexer;", "result", "", "throwInvalidFloatingPointDecoded", "c", "UnknownKeyException", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "InvalidKeyKindException", "a", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonExceptionsKt {
    @NotNull
    public static final JsonDecodingException InvalidFloatingPointDecoded(@NotNull Number number, @NotNull String str, @NotNull String str2) {
        return JsonDecodingException(-1, c(number, str, str2));
    }

    @NotNull
    public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number number, @NotNull String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + b(str, 0, 1, null));
    }

    @NotNull
    public static final JsonEncodingException InvalidKeyKindException(@NotNull SerialDescriptor serialDescriptor) {
        return new JsonEncodingException("Value of type '" + serialDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getCom.huami.watch.companion.ximalaya.XimalayaConst.KIND java.lang.String() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @NotNull
    public static final JsonDecodingException JsonDecodingException(int i, @NotNull String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    @NotNull
    public static final JsonDecodingException UnknownKeyException(@NotNull String str, @NotNull String str2) {
        return JsonDecodingException(-1, "Encountered unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + b(str2, 0, 1, null));
    }

    private static final String a(String str, int i) {
        if (str.length() < 200) {
            return str;
        }
        if (i == -1) {
            int length = str.length() - 60;
            return length <= 0 ? str : Intrinsics.stringPlus(".....", str.substring(length));
        }
        int i2 = i - 30;
        int i3 = i + 30;
        return (i2 <= 0 ? "" : ".....") + str.substring(kotlin.ranges.e.coerceAtLeast(i2, 0), kotlin.ranges.e.coerceAtMost(i3, str.length())) + (i3 >= str.length() ? "" : ".....");
    }

    public static /* synthetic */ String b(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return a(str, i);
    }

    private static final String c(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + b(str2, 0, 1, null);
    }

    @NotNull
    public static final Void throwInvalidFloatingPointDecoded(@NotNull JsonReader jsonReader, @NotNull Number number) {
        JsonReader.fail$default(jsonReader, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 0, 2, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonDecodingException JsonDecodingException(int i, @NotNull String str, @NotNull String str2) {
        return JsonDecodingException(i, str + "\nJSON input: " + a(str2, i));
    }

    @NotNull
    public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number number, @NotNull String str, @NotNull String str2) {
        return new JsonEncodingException(c(number, str, str2));
    }
}
