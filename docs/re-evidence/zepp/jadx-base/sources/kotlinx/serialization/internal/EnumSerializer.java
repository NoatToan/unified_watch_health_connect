package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Typography;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "", "toString", "", "a", "[Ljava/lang/Enum;", "values", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "serialName", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final T[] values;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SerialDescriptor descriptor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
        public final /* synthetic */ EnumSerializer<T> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumSerializer<T> enumSerializer, String str) {
            super(1);
            this.a = enumSerializer;
            this.b = str;
        }

        public final void a(@NotNull ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            Enum[] enumArr = ((EnumSerializer) this.a).values;
            String str = this.b;
            for (Enum r6 : enumArr) {
                ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, r6.name(), SerialDescriptorsKt.buildSerialDescriptor$default(str + '.' + r6.name(), StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            a(classSerialDescriptorBuilder);
            return Unit.INSTANCE;
        }
    }

    public EnumSerializer(@NotNull String str, @NotNull T[] tArr) {
        this.values = tArr;
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor(str, SerialKind.ENUM.INSTANCE, new SerialDescriptor[0], new a(this, str));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + Typography.greater;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        boolean z = false;
        if (iDecodeEnum >= 0 && iDecodeEnum <= this.values.length - 1) {
            z = true;
        }
        if (z) {
            return this.values[iDecodeEnum];
        }
        throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        int iIndexOf = ArraysKt___ArraysKt.indexOf(this.values, value);
        if (iIndexOf != -1) {
            encoder.encodeEnum(getDescriptor(), iIndexOf);
            return;
        }
        throw new SerializationException(value + " is not a valid enum " + getDescriptor().getSerialName() + ", must be one of " + Arrays.toString(this.values));
    }
}
