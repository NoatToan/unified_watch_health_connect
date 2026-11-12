package org.koin.core.qualifier;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.ext.KClassExtKt;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\u00060\u0002j\u0002`\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lorg/koin/core/qualifier/TypeQualifier;", "Lorg/koin/core/qualifier/Qualifier;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "type", "Lorg/koin/core/qualifier/QualifierValue;", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Lkotlin/reflect/KClass;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class TypeQualifier implements Qualifier {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KClass<?> type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String value;

    public TypeQualifier(@NotNull KClass<?> kClass) {
        this.type = kClass;
        this.value = KClassExtKt.getFullName(kClass);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(TypeQualifier.class), Reflection.getOrCreateKotlinClass(other.getClass())) && Intrinsics.areEqual(getValue(), ((TypeQualifier) other).getValue());
    }

    @NotNull
    public final KClass<?> getType() {
        return this.type;
    }

    @Override // org.koin.core.qualifier.Qualifier
    @NotNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @NotNull
    public String toString() {
        return "q:'" + getValue() + '\'';
    }
}
