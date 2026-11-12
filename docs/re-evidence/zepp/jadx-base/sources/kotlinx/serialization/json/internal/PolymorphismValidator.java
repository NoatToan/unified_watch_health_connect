package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002JQ\u0010\u0013\u001a\u00020\u0006\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042/\u0010\u0012\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016JF\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0014*\u00020\t\"\b\b\u0001\u0010\u0015*\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016JO\u0010\u001d\u001a\u00020\u0006\"\b\b\u0000\u0010\u0014*\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042-\u0010\u001c\u001a)\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u001b0\fH\u0016R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006%"}, d2 = {"Lkotlinx/serialization/json/internal/PolymorphismValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/reflect/KClass;", "actualClass", "", "b", "a", "", ExifInterface.GPS_DIRECTION_TRUE, "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "contextual", "Base", "Sub", "baseClass", "actualSerializer", "polymorphic", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultSerializerProvider", "polymorphicDefault", "", "Z", "useArrayPolymorphism", "Ljava/lang/String;", "discriminator", "<init>", "(ZLjava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class PolymorphismValidator implements SerializersModuleCollector {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String discriminator;

    public PolymorphismValidator(boolean z, @NotNull String str) {
        this.useArrayPolymorphism = z;
        this.discriminator = str;
    }

    private final void a(SerialDescriptor descriptor, KClass<?> actualClass) {
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            String elementName = descriptor.getElementName(i);
            if (Intrinsics.areEqual(elementName, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
            if (i2 >= elementsCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final void b(SerialDescriptor descriptor, KClass<?> actualClass) {
        SerialKind kind = descriptor.getKind();
        if ((kind instanceof PolymorphicKind) || Intrinsics.areEqual(kind, SerialKind.CONTEXTUAL.INSTANCE)) {
            throw new IllegalArgumentException("Serializer for " + ((Object) actualClass.getSimpleName()) + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.useArrayPolymorphism) {
            return;
        }
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) || Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE) || (kind instanceof PrimitiveKind) || (kind instanceof SerialKind.ENUM)) {
            throw new IllegalArgumentException("Serializer for " + ((Object) actualClass.getSimpleName()) + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer) {
        SerializersModuleCollector.DefaultImpls.contextual(this, kClass, kSerializer);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        b(descriptor, actualClass);
        if (this.useArrayPolymorphism) {
            return;
        }
        a(descriptor, actualClass);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefault(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultSerializerProvider) {
    }
}
