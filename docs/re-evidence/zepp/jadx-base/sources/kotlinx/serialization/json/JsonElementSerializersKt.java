package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "c", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "Lkotlinx/serialization/json/JsonDecoder;", "asJsonDecoder", "Lkotlinx/serialization/json/JsonEncoder;", "asJsonEncoder", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "a", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonElementSerializersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor a(final Function0<? extends SerialDescriptor> function0) {
        return new SerialDescriptor(function0) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final Lazy original;
            public final /* synthetic */ Function0<SerialDescriptor> b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.b = function0;
                this.original = LazyKt__LazyJVMKt.lazy(function0);
            }

            private final SerialDescriptor a() {
                return (SerialDescriptor) this.original.getValue();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public List<Annotation> getAnnotations() {
                return SerialDescriptor.DefaultImpls.getAnnotations(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public List<Annotation> getElementAnnotations(int index) {
                return a().getElementAnnotations(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public SerialDescriptor getElementDescriptor(int index) {
                return a().getElementDescriptor(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementIndex(@NotNull String name) {
                return a().getElementIndex(name);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public String getElementName(int index) {
                return a().getElementName(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementsCount() {
                return a().getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public SerialKind getKind() {
                return a().getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public String getSerialName() {
                return a().getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isElementOptional(int index) {
                return a().isElementOptional(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            /* JADX INFO: renamed from: isInline */
            public boolean getIsInline() {
                return SerialDescriptor.DefaultImpls.isInline(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isNullable() {
                return SerialDescriptor.DefaultImpls.isNullable(this);
            }
        };
    }

    @NotNull
    public static final JsonDecoder asJsonDecoder(@NotNull Decoder decoder) {
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ", Reflection.getOrCreateKotlinClass(decoder.getClass())));
    }

    @NotNull
    public static final JsonEncoder asJsonEncoder(@NotNull Encoder encoder) {
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ", Reflection.getOrCreateKotlinClass(encoder.getClass())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Decoder decoder) {
        asJsonDecoder(decoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Encoder encoder) {
        asJsonEncoder(encoder);
    }
}
