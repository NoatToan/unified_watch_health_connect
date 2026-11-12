package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public abstract class TypeParameter<T> extends b<T> {
    public final TypeVariable<?> a;

    public TypeParameter() {
        Type typeA = a();
        Preconditions.checkArgument(typeA instanceof TypeVariable, "%s should be a type variable.", typeA);
        this.a = (TypeVariable) typeA;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof TypeParameter) {
            return this.a.equals(((TypeParameter) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
