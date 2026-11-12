package kotlinx.serialization.encoding;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a>\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "decodeStructure", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "decodeMethodDeprecated", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class DecodingKt {

    @NotNull
    private static final String a = "Please migrate to decodeElement method which accepts old value.Feel free to ignore it if your format does not support updates.";

    public static final <T> T decodeStructure(@NotNull Decoder decoder, @NotNull SerialDescriptor serialDescriptor, @NotNull Function1<? super CompositeDecoder, ? extends T> function1) {
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        try {
            T tInvoke = function1.invoke(compositeDecoderBeginStructure);
            InlineMarker.finallyStart(1);
            compositeDecoderBeginStructure.endStructure(serialDescriptor);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }
}
