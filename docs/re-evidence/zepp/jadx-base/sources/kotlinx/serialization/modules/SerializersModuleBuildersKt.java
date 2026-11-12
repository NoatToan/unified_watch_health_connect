package kotlinx.serialization.modules;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u001a#\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b\u001a%\u0010\r\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a'\u0010\u000e\u001a\u00020\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b\u001a[\u0010\u0013\u001a\u00020\n\"\b\b\u0000\u0010\u000f*\u00020\u0000*\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u001f\b\u0002\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModuleOf", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "SerializersModule", "contextual", "Base", "baseClass", "baseSerializer", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "polymorphic", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class SerializersModuleBuildersKt {
    @NotNull
    public static final SerializersModule SerializersModule(@NotNull Function1<? super SerializersModuleBuilder, Unit> function1) {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        function1.invoke(serializersModuleBuilder);
        return serializersModuleBuilder.build();
    }

    public static final /* synthetic */ <T> void contextual(SerializersModuleBuilder serializersModuleBuilder, KSerializer<T> kSerializer) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(Object.class), kSerializer);
    }

    public static final <Base> void polymorphic(@NotNull SerializersModuleBuilder serializersModuleBuilder, @NotNull KClass<Base> kClass, @Nullable KSerializer<Base> kSerializer, @NotNull Function1<? super PolymorphicModuleBuilder<? super Base>, Unit> function1) {
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(kClass, kSerializer);
        function1.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static /* synthetic */ void polymorphic$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KSerializer kSerializer, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            kSerializer = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1<PolymorphicModuleBuilder<? super Base>, Unit>() { // from class: kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke((PolymorphicModuleBuilder) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull PolymorphicModuleBuilder<? super Base> polymorphicModuleBuilder) {
                }
            };
        }
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(kClass, kSerializer);
        function1.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static final /* synthetic */ <T> SerializersModule serializersModuleOf(KSerializer<T> kSerializer) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return serializersModuleOf(Reflection.getOrCreateKotlinClass(Object.class), kSerializer);
    }

    @NotNull
    public static final <T> SerializersModule serializersModuleOf(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer) {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.contextual(kClass, kSerializer);
        return serializersModuleBuilder.build();
    }
}
