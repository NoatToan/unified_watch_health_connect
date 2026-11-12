package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0082\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/internal/JsonLexer;", "", "expectedType", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "a", "(Lkotlinx/serialization/json/internal/JsonLexer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class StreamingJsonDecoderKt {
    private static final <T> T a(JsonReader jsonReader, String str, Function1<? super String, ? extends T> function1) {
        String strConsumeStringLenient = jsonReader.consumeStringLenient();
        try {
            return function1.invoke(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            JsonReader.fail$default(jsonReader, "Failed to parse type '" + str + "' for input '" + strConsumeStringLenient + '\'', 0, 2, null);
            throw new KotlinNothingValueException();
        }
    }
}
