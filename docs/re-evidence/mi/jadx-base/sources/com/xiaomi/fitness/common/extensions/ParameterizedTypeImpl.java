package com.xiaomi.fitness.common.extensions;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0006H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/common/extensions/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "raw", "Ljava/lang/Class;", "args", "", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "[Ljava/lang/reflect/Type;", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParameterizedTypeImpl implements ParameterizedType {

    @NotNull
    private final Type[] args;

    @NotNull
    private final Class<?> raw;

    public ParameterizedTypeImpl(@NotNull Class<?> raw, @Nullable Type[] typeArr) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.raw = raw;
        this.args = typeArr == null ? new Type[0] : typeArr;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.args;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type getRawType() {
        return this.raw;
    }
}
