package kotlinx.serialization.modules;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001B)\b\u0001\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\"J,\u0010\u0005\u001a\u00020\b\"\b\b\u0001\u0010\u0003*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006J5\u0010\u0010\u001a\u00020\b2-\u0010\u000f\u001a)\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u000e0\tJ\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\b@\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\b@\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R8\u0010\u001e\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\u001b0\u001a8\b@\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010\u000f\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u000e\u0018\u00010\t8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "", "Base", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "subclass", "Lkotlinx/serialization/KSerializer;", "serializer", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultSerializerProvider", "default", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "builder", "buildTo", "a", "Lkotlin/reflect/KClass;", "baseClass", "b", "Lkotlinx/serialization/KSerializer;", "baseSerializer", "", "Lkotlin/Pair;", "c", "Ljava/util/List;", "subclasses", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
public final class PolymorphicModuleBuilder<Base> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KClass<Base> baseClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final KSerializer<Base> baseSerializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Pair<KClass<? extends Base>, KSerializer<? extends Base>>> subclasses;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultSerializerProvider;

    @PublishedApi
    public PolymorphicModuleBuilder(@NotNull KClass<Base> kClass, @Nullable KSerializer<Base> kSerializer) {
        this.baseClass = kClass;
        this.baseSerializer = kSerializer;
        this.subclasses = new ArrayList();
    }

    @PublishedApi
    public final void buildTo(@NotNull SerializersModuleBuilder builder) {
        KSerializer<Base> kSerializer = this.baseSerializer;
        if (kSerializer != null) {
            KClass<Base> kClass = this.baseClass;
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, kClass, kClass, kSerializer, false, 8, null);
        }
        Iterator<T> it2 = this.subclasses.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, this.baseClass, (KClass) pair.component1(), (KSerializer) pair.component2(), false, 8, null);
        }
        Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1 = this.defaultSerializerProvider;
        if (function1 != null) {
            builder.registerDefaultPolymorphicSerializer(this.baseClass, function1, false);
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m4491default(@NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultSerializerProvider) {
        if (this.defaultSerializerProvider == null) {
            this.defaultSerializerProvider = defaultSerializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default serializer provider is already registered for class " + this.baseClass + ": " + this.defaultSerializerProvider).toString());
    }

    public final <T extends Base> void subclass(@NotNull KClass<T> subclass, @NotNull KSerializer<T> serializer) {
        this.subclasses.add(TuplesKt.to(subclass, serializer));
    }

    public /* synthetic */ PolymorphicModuleBuilder(KClass kClass, KSerializer kSerializer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i & 2) != 0 ? null : kSerializer);
    }
}
