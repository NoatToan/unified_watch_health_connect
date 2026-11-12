package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001\u001a \u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¨\u0006\u0007"}, d2 = {"", "subClassName", "Lkotlin/reflect/KClass;", "baseClass", "", "throwSubtypeNotRegistered", "subClass", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class AbstractPolymorphicSerializerKt {
    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@Nullable String str, @NotNull KClass<?> kClass) {
        String strStringPlus;
        String str2 = "in the scope of '" + ((Object) kClass.getSimpleName()) + '\'';
        if (str == null) {
            strStringPlus = Intrinsics.stringPlus("Class discriminator was missing and no default polymorphic serializers were registered ", str2);
        } else {
            strStringPlus = "Class '" + ((Object) str) + "' is not registered for polymorphic serialization " + str2 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new SerializationException(strStringPlus);
    }

    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@NotNull KClass<?> kClass, @NotNull KClass<?> kClass2) {
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(kClass);
        }
        throwSubtypeNotRegistered(simpleName, kClass2);
        throw new KotlinNothingValueException();
    }
}
