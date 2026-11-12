package kotlinx.serialization.encoding;

import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "encodeStructure", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class EncodingKt {
    public static final void encodeStructure(@NotNull Encoder encoder, @NotNull SerialDescriptor serialDescriptor, @NotNull Function1<? super CompositeEncoder, Unit> function1) {
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        try {
            function1.invoke(compositeEncoderBeginStructure);
            InlineMarker.finallyStart(1);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
            InlineMarker.finallyEnd(1);
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
