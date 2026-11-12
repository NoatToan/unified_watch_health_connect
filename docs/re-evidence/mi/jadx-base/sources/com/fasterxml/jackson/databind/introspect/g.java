package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public interface g {

    public static class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeFactory f7689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TypeBindings f7690b;

        public a(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.f7689a = typeFactory;
            this.f7690b = typeBindings;
        }

        @Override // com.fasterxml.jackson.databind.introspect.g
        public JavaType a(Type type) {
            return this.f7689a.constructType(type, this.f7690b);
        }
    }

    JavaType a(Type type);
}
