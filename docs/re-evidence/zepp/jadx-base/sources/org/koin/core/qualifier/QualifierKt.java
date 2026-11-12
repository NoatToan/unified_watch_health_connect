package org.koin.core.qualifier;

import androidx.exifinterface.media.ExifInterface;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a$\u0010\u0003\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u001a\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a$\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u001a\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0011\u0010\u0003\u001a\u00020\u000b\"\u0006\b\u0000\u0010\n\u0018\u0001H\u0086\b\u001a\u0011\u0010\b\u001a\u00020\u000b\"\u0006\b\u0000\u0010\n\u0018\u0001H\u0086\b\u001a\u0011\u0010\t\u001a\u00020\u000b\"\u0006\b\u0000\u0010\n\u0018\u0001H\u0086\b\"-\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000e\"\u00020\u00002\u00020\u0000¨\u0006\u000f"}, d2 = {"", "name", "Lorg/koin/core/qualifier/StringQualifier;", "named", "", "E", "enum", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "_q", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/TypeQualifier;", "getQualifier", "(Ljava/lang/Enum;)Lorg/koin/core/qualifier/Qualifier;", "QualifierValue", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class QualifierKt {
    @NotNull
    public static final StringQualifier _q(@NotNull String str) {
        return new StringQualifier(str);
    }

    @NotNull
    public static final <E extends Enum<E>> Qualifier getQualifier(@NotNull Enum<E> r2) {
        String string = r2.toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        return new StringQualifier(string.toLowerCase());
    }

    @NotNull
    public static final StringQualifier named(@NotNull String str) {
        return new StringQualifier(str);
    }

    @NotNull
    public static final StringQualifier qualifier(@NotNull String str) {
        return new StringQualifier(str);
    }

    public static final /* synthetic */ <T> TypeQualifier _q() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
    }

    @NotNull
    public static final <E extends Enum<E>> Qualifier named(@NotNull Enum<E> r0) {
        return getQualifier(r0);
    }

    @NotNull
    public static final <E extends Enum<E>> Qualifier qualifier(@NotNull Enum<E> r0) {
        return getQualifier(r0);
    }

    public static final /* synthetic */ <T> TypeQualifier named() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public static final /* synthetic */ <T> TypeQualifier qualifier() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
    }
}
