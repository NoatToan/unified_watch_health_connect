package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeVisitor {
    private final Set<Type> visited = Sets.a();

    protected void visitClass(Class<?> cls) {
    }

    protected void visitGenericArrayType(GenericArrayType genericArrayType) {
    }

    protected void visitParameterizedType(ParameterizedType parameterizedType) {
    }

    protected void visitTypeVariable(TypeVariable<?> typeVariable) {
    }

    protected void visitWildcardType(WildcardType wildcardType) {
    }

    public final void visit(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.visited.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        visitTypeVariable((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        visitWildcardType((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        visitParameterizedType((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        visitClass((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        visitGenericArrayType((GenericArrayType) type);
                    } else {
                        throw new AssertionError("Unknown type: " + type);
                    }
                } catch (Throwable th) {
                    this.visited.remove(type);
                    throw th;
                }
            }
        }
    }
}
