package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\"\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0004\u0010\u0005\" \u0010\b\u001a\u00020\u0007*\u00020\u00018@@\u0001X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Ljava/util/Set;", "getUnsignedNumberDescriptors$annotations", "()V", "unsignedNumberDescriptors", "", "isUnsignedNumber", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnsignedNumber$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class StreamingJsonEncoderKt {

    @NotNull
    private static final Set<SerialDescriptor> a = y.setOf((Object[]) new SerialDescriptor[]{BuiltinSerializersKt.serializer(UInt.Companion).getDescriptor(), BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UByte.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UShort.Companion).getDescriptor()});

    @ExperimentalSerializationApi
    private static /* synthetic */ void a() {
    }

    public static final boolean isUnsignedNumber(@NotNull SerialDescriptor serialDescriptor) {
        return serialDescriptor.getIsInline() && a.contains(serialDescriptor);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void isUnsignedNumber$annotations(SerialDescriptor serialDescriptor) {
    }
}
