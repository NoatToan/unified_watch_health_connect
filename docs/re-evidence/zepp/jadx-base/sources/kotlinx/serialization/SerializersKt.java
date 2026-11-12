package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/serialization/a", "kotlinx/serialization/b"}, d2 = {}, k = 4, mv = {1, 5, 1})
public final class SerializersKt {
    @Nullable
    public static final <T> KSerializer<T> reflectiveOrContextual(@NotNull SerializersModule serializersModule, @NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<Object>> list) {
        return b.c(serializersModule, kClass, list);
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull Type type) {
        return a.g(type);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull Type type) {
        return a.c(type);
    }

    @InternalSerializationApi
    @Nullable
    public static final <T> KSerializer<T> serializerOrNull(@NotNull KClass<T> kClass) {
        return b.j(kClass);
    }

    @InternalSerializationApi
    @NotNull
    public static final <T> KSerializer<T> serializer(@NotNull KClass<T> kClass) {
        return b.e(kClass);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull KType kType) {
        return b.k(kType);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull KType kType) {
        return b.f(kType);
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule serializersModule, @NotNull Type type) {
        return a.h(serializersModule, type);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule serializersModule, @NotNull KType kType) {
        return b.l(serializersModule, kType);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule serializersModule, @NotNull Type type) {
        return a.d(serializersModule, type);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule serializersModule, @NotNull KType kType) {
        return b.h(serializersModule, kType);
    }
}
