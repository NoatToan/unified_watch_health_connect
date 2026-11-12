package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.ahn;
import defpackage.ahp;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public interface TypeResolutionContext {
    JavaType resolveType(Type type);

    public static class e implements TypeResolutionContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ahp f4168a;
        private final ahn e;

        public e(ahp ahpVar, ahn ahnVar) {
            this.f4168a = ahpVar;
            this.e = ahnVar;
        }

        @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
        public JavaType resolveType(Type type) {
            return this.f4168a.a(type, this.e);
        }
    }
}
