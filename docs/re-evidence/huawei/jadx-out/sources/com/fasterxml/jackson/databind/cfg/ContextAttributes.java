package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ContextAttributes {
    public abstract Object getAttribute(Object obj);

    public abstract ContextAttributes withPerCallAttribute(Object obj, Object obj2);

    public abstract ContextAttributes withSharedAttribute(Object obj, Object obj2);

    public abstract ContextAttributes withSharedAttributes(Map<?, ?> map);

    public abstract ContextAttributes withoutSharedAttribute(Object obj);

    public static ContextAttributes getEmpty() {
        return d.b();
    }

    public static class d extends ContextAttributes implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected static final d f4104a = new d(Collections.EMPTY_MAP);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected static final Object f4105c = new Object();
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected transient Map<Object, Object> f4106b;
        protected final Map<?, ?> d;

        protected d(Map<?, ?> map) {
            this.d = map;
            this.f4106b = null;
        }

        protected d(Map<?, ?> map, Map<Object, Object> map2) {
            this.d = map;
            this.f4106b = map2;
        }

        public static ContextAttributes b() {
            return f4104a;
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public ContextAttributes withSharedAttribute(Object obj, Object obj2) {
            Map<Object, Object> mapA;
            if (this == f4104a) {
                mapA = new HashMap<>(8);
            } else {
                mapA = a(this.d);
            }
            mapA.put(obj, obj2);
            return new d(mapA);
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public ContextAttributes withSharedAttributes(Map<?, ?> map) {
            return new d(map);
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public ContextAttributes withoutSharedAttribute(Object obj) {
            if (this.d.isEmpty() || !this.d.containsKey(obj)) {
                return this;
            }
            if (this.d.size() == 1) {
                return f4104a;
            }
            Map<Object, Object> mapA = a(this.d);
            mapA.remove(obj);
            return new d(mapA);
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public Object getAttribute(Object obj) {
            Object obj2;
            Map<Object, Object> map = this.f4106b;
            if (map != null && (obj2 = map.get(obj)) != null) {
                if (obj2 == f4105c) {
                    return null;
                }
                return obj2;
            }
            return this.d.get(obj);
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public ContextAttributes withPerCallAttribute(Object obj, Object obj2) {
            if (obj2 == null) {
                if (this.d.containsKey(obj)) {
                    obj2 = f4105c;
                } else {
                    Map<Object, Object> map = this.f4106b;
                    if (map != null && map.containsKey(obj)) {
                        this.f4106b.remove(obj);
                    }
                    return this;
                }
            }
            Map<Object, Object> map2 = this.f4106b;
            if (map2 == null) {
                return d(obj, obj2);
            }
            map2.put(obj, obj2);
            return this;
        }

        protected ContextAttributes d(Object obj, Object obj2) {
            HashMap map = new HashMap();
            if (obj2 == null) {
                obj2 = f4105c;
            }
            map.put(obj, obj2);
            return new d(this.d, map);
        }

        private Map<Object, Object> a(Map<?, ?> map) {
            return new HashMap(map);
        }
    }
}
