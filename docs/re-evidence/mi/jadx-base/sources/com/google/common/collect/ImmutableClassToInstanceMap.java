package com.google.common.collect;

import defpackage.c6i;
import defpackage.r1a;
import defpackage.y8i;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ImmutableClassToInstanceMap<B> extends r1a<Class<? extends B>, B> implements Map, Serializable {
    private static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    public static final class b<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap.b<Class<? extends B>, B> f9020a = ImmutableMap.builder();

        public static <B, T extends B> T b(Class<T> cls, B b2) {
            return (T) y8i.d(cls).cast(b2);
        }

        public ImmutableClassToInstanceMap<B> a() {
            ImmutableMap<Class<? extends B>, B> immutableMapD = this.f9020a.d();
            return immutableMapD.isEmpty() ? ImmutableClassToInstanceMap.of() : new ImmutableClassToInstanceMap<>(immutableMapD);
        }

        public <T extends B> b<B> c(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class key = entry.getKey();
                T value = entry.getValue();
                this.f9020a.g((Class<? extends B>) key, (B) b(key, value));
            }
            return this;
        }
    }

    public static <B> b<B> builder() {
        return new b<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof ImmutableClassToInstanceMap ? (ImmutableClassToInstanceMap) map : new b().c(map).a();
    }

    public static <B> ImmutableClassToInstanceMap<B> of() {
        return (ImmutableClassToInstanceMap<B>) EMPTY;
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(c6i.o(cls));
    }

    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    public Object readResolve() {
        return isEmpty() ? of() : this;
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    public static <B, T extends B> ImmutableClassToInstanceMap<B> of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.of(cls, t));
    }

    @Override // defpackage.r1a, defpackage.t1a
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }
}
