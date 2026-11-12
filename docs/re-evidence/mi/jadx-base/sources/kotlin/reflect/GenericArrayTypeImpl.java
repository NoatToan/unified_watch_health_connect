package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalStdlibApi
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {

    @NotNull
    private final Type elementType;

    public GenericArrayTypeImpl(@NotNull Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.elementType = elementType;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.areEqual(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.elementType;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @NotNull
    public String getTypeName() {
        return TypesJVMKt.typeToString(this.elementType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
