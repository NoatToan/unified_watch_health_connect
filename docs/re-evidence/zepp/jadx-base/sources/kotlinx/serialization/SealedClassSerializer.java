package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.Grouping;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f0#\u0012\u0014\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c0#¢\u0006\u0004\b&\u0010'J$\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J'\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u000eR\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R2\u0010\u001f\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006("}, d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "baseClass", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "Lkotlinx/serialization/KSerializer;", "c", "Ljava/util/Map;", "class2Serializer", GoogleApiAvailabilityLight.a, "serialName2Serializer", "serialName", "", "subclasses", "subclassSerializers", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
@InternalSerializationApi
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KClass<T> baseClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SerialDescriptor descriptor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<KClass<? extends T>, KSerializer<? extends T>> class2Serializer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
        public final /* synthetic */ SealedClassSerializer<T> a;
        public final /* synthetic */ KSerializer<? extends T>[] b;

        /* JADX INFO: renamed from: kotlinx.serialization.SealedClassSerializer$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1186a extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
            public final /* synthetic */ KSerializer<? extends T>[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1186a(KSerializer<? extends T>[] kSerializerArr) {
                super(1);
                this.a = kSerializerArr;
            }

            public final void a(@NotNull ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                for (KSerializer<? extends T> kSerializer : this.a) {
                    SerialDescriptor descriptor = kSerializer.getDescriptor();
                    ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, descriptor.getSerialName(), descriptor, null, false, 12, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                a(classSerialDescriptorBuilder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SealedClassSerializer<T> sealedClassSerializer, KSerializer<? extends T>[] kSerializerArr) {
            super(1);
            this.a = sealedClassSerializer;
            this.b = kSerializerArr;
        }

        public final void a(@NotNull ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
            ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "value", SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + ((Object) this.a.getBaseClass().getSimpleName()) + Typography.greater, SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new C1186a(this.b)), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            a(classSerialDescriptorBuilder);
            return Unit.INSTANCE;
        }
    }

    public SealedClassSerializer(@NotNull String str, @NotNull KClass<T> kClass, @NotNull KClass<? extends T>[] kClassArr, @NotNull KSerializer<? extends T>[] kSerializerArr) {
        this.baseClass = kClass;
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor(str, PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], new a(this, kSerializerArr));
        if (kClassArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + ((Object) getBaseClass().getSimpleName()) + " should be marked @Serializable");
        }
        Map<KClass<? extends T>, KSerializer<? extends T>> map = r.toMap(ArraysKt___ArraysKt.zip(kClassArr, kSerializerArr));
        this.class2Serializer = map;
        final Set<Map.Entry<KClass<? extends T>, KSerializer<? extends T>>> setEntrySet = map.entrySet();
        Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> grouping = new Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String>() { // from class: kotlinx.serialization.SealedClassSerializer$special$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public String keyOf(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> element) {
                return element.getValue().getDescriptor().getSerialName();
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
                return setEntrySet.iterator();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> next = itSourceIterator.next();
            String strKeyOf = grouping.keyOf(next);
            Object obj = linkedHashMap.get(strKeyOf);
            if (obj == null) {
                linkedHashMap.containsKey(strKeyOf);
            }
            Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry = next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = strKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strKeyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @Nullable
    public DeserializationStrategy<? extends T> findPolymorphicSerializerOrNull(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
        KSerializer<? extends T> kSerializer = this.serialName2Serializer.get(klassName);
        return kSerializer == null ? super.findPolymorphicSerializerOrNull(decoder, klassName) : kSerializer;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @NotNull
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @Nullable
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull Encoder encoder, @NotNull T value) {
        KSerializer<? extends T> kSerializerFindPolymorphicSerializerOrNull = this.class2Serializer.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        if (kSerializerFindPolymorphicSerializerOrNull == null) {
            kSerializerFindPolymorphicSerializerOrNull = super.findPolymorphicSerializerOrNull(encoder, value);
        }
        if (kSerializerFindPolymorphicSerializerOrNull == null) {
            return null;
        }
        return kSerializerFindPolymorphicSerializerOrNull;
    }
}
