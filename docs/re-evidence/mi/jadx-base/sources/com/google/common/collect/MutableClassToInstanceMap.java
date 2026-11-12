package com.google.common.collect;

import defpackage.c6i;
import defpackage.pyp;
import defpackage.r1a;
import defpackage.s1a;
import defpackage.w1a;
import defpackage.y8i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class MutableClassToInstanceMap<B> extends r1a<Class<? extends B>, B> implements Map, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    public class a extends s1a<Class<? extends B>, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f9108a;

        public a(Map.Entry entry) {
            this.f9108a = entry;
        }

        @Override // defpackage.t1a
        /* JADX INFO: renamed from: f */
        public Map.Entry<Class<? extends B>, B> delegate() {
            return this.f9108a;
        }

        @Override // defpackage.s1a, java.util.Map.Entry
        public B setValue(B b2) {
            return (B) super.setValue(MutableClassToInstanceMap.cast(getKey(), b2));
        }
    }

    public class b extends w1a<Map.Entry<Class<? extends B>, B>> {

        public class a extends pyp<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public a(b bVar, Iterator it) {
                super(it);
            }

            @Override // defpackage.pyp
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> a(Map.Entry<Class<? extends B>, B> entry) {
                return MutableClassToInstanceMap.checkedEntry(entry);
            }
        }

        public b() {
        }

        @Override // defpackage.i1a, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(this, delegate().iterator());
        }

        @Override // defpackage.i1a, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<Map.Entry<Class<? extends B>, B>> delegate() {
            return MutableClassToInstanceMap.this.delegate().entrySet();
        }
    }

    public static final class c<B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends B>, B> f9110a;

        public c(Map<Class<? extends B>, B> map) {
            this.f9110a = map;
        }

        public Object readResolve() {
            return MutableClassToInstanceMap.create(this.f9110a);
        }
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) c6i.o(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <B, T extends B> T cast(Class<T> cls, B b2) {
        return (T) y8i.d(cls).cast(b2);
    }

    public static <B> Map.Entry<Class<? extends B>, B> checkedEntry(Map.Entry<Class<? extends B>, B> entry) {
        return new a(entry);
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    private Object writeReplace() {
        return new c(delegate());
    }

    @Override // defpackage.r1a, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new b();
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return (T) cast(cls, get(cls));
    }

    @Override // defpackage.r1a, java.util.Map
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends B> T putInstance(Class<T> cls, T t) {
        return (T) cast(cls, put((Class<? extends T>) cls, t));
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }

    @Override // defpackage.r1a, defpackage.t1a
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    @Override // defpackage.r1a, java.util.Map
    public B put(Class<? extends B> cls, B b2) {
        return (B) super.put(cls, cast(cls, b2));
    }
}
