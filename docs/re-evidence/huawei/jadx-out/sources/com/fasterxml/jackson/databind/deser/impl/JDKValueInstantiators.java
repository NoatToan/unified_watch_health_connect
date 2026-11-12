package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import defpackage.aba;
import defpackage.wq;
import defpackage.yi;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class JDKValueInstantiators {
    public static ValueInstantiator findStdValueInstantiator(yi yiVar, Class<?> cls) {
        if (cls == wq.class) {
            return new aba();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return a.f4115b;
            }
            if (Collections.EMPTY_SET.getClass() == cls) {
                return new d(Collections.EMPTY_SET);
            }
            if (Collections.EMPTY_LIST.getClass() == cls) {
                return new d(Collections.EMPTY_LIST);
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return c.f4116c;
        }
        if (cls == HashMap.class) {
            return b.d;
        }
        if (Collections.EMPTY_MAP.getClass() == cls) {
            return new d(Collections.EMPTY_MAP);
        }
        return null;
    }

    static class a extends ValueInstantiator.b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f4115b = new a();
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        public a() {
            super((Class<?>) ArrayList.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new ArrayList();
        }
    }

    static class b extends ValueInstantiator.b implements Serializable {
        public static final b d = new b();
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        public b() {
            super((Class<?>) HashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new HashMap();
        }
    }

    static class c extends ValueInstantiator.b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f4116c = new c();
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        public c() {
            super((Class<?>) LinkedHashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new LinkedHashMap();
        }
    }

    static class d extends ValueInstantiator.b implements Serializable {
        private static final long serialVersionUID = 2;
        protected final Object e;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        public d(Object obj) {
            super(obj.getClass());
            this.e = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return this.e;
        }
    }
}
