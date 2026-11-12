package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    private static final LoadingCache<Class<?>, ImmutableList<Method>> c = CacheBuilder.newBuilder().weakKeys().build(new a());
    private static final LoadingCache<Class<?>, ImmutableSet<Class<?>>> d = CacheBuilder.newBuilder().weakKeys().build(new b());
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<com.google.common.eventbus.b>> a = Maps.newConcurrentMap();

    @Weak
    private final EventBus b;

    public static class a extends CacheLoader<Class<?>, ImmutableList<Method>> {
        @Override // com.google.common.cache.CacheLoader
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableList<Method> load(Class<?> cls) throws Exception {
            return c.e(cls);
        }
    }

    public static class b extends CacheLoader<Class<?>, ImmutableSet<Class<?>>> {
        @Override // com.google.common.cache.CacheLoader
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<Class<?>> load(Class<?> cls) {
            return ImmutableSet.copyOf((Collection) TypeToken.of((Class) cls).getTypes().rawTypes());
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.c$c, reason: collision with other inner class name */
    public static final class C0210c {
        private final String a;
        private final List<Class<?>> b;

        public C0210c(Method method) {
            this.a = method.getName();
            this.b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof C0210c)) {
                return false;
            }
            C0210c c0210c = (C0210c) obj;
            return this.a.equals(c0210c.a) && this.b.equals(c0210c.b);
        }

        public int hashCode() {
            return Objects.hashCode(this.a, this.b);
        }
    }

    public c(EventBus eventBus) {
        this.b = (EventBus) Preconditions.checkNotNull(eventBus);
    }

    private Multimap<Class<?>, com.google.common.eventbus.b> b(Object obj) {
        HashMultimap hashMultimapCreate = HashMultimap.create();
        UnmodifiableIterator<Method> it2 = d(obj.getClass()).iterator();
        while (it2.hasNext()) {
            Method next = it2.next();
            hashMultimapCreate.put(next.getParameterTypes()[0], com.google.common.eventbus.b.d(this.b, obj, next));
        }
        return hashMultimapCreate;
    }

    @VisibleForTesting
    public static ImmutableSet<Class<?>> c(Class<?> cls) {
        try {
            return d.getUnchecked(cls);
        } catch (UncheckedExecutionException e) {
            throw Throwables.propagate(e.getCause());
        }
    }

    private static ImmutableList<Method> d(Class<?> cls) {
        return c.getUnchecked(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<Method> e(Class<?> cls) {
        Set setRawTypes = TypeToken.of((Class) cls).getTypes().rawTypes();
        HashMap mapNewHashMap = Maps.newHashMap();
        Iterator it2 = setRawTypes.iterator();
        while (it2.hasNext()) {
            for (Method method : ((Class) it2.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Preconditions.checkArgument(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters.Subscriber methods must have exactly 1 parameter.", (Object) method, parameterTypes.length);
                    C0210c c0210c = new C0210c(method);
                    if (!mapNewHashMap.containsKey(c0210c)) {
                        mapNewHashMap.put(c0210c, method);
                    }
                }
            }
        }
        return ImmutableList.copyOf(mapNewHashMap.values());
    }

    public Iterator<com.google.common.eventbus.b> f(Object obj) {
        ImmutableSet<Class<?>> immutableSetC = c(obj.getClass());
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(immutableSetC.size());
        UnmodifiableIterator<Class<?>> it2 = immutableSetC.iterator();
        while (it2.hasNext()) {
            CopyOnWriteArraySet<com.google.common.eventbus.b> copyOnWriteArraySet = this.a.get(it2.next());
            if (copyOnWriteArraySet != null) {
                arrayListNewArrayListWithCapacity.add(copyOnWriteArraySet.iterator());
            }
        }
        return Iterators.concat(arrayListNewArrayListWithCapacity.iterator());
    }

    @VisibleForTesting
    public Set<com.google.common.eventbus.b> g(Class<?> cls) {
        return (Set) MoreObjects.firstNonNull(this.a.get(cls), ImmutableSet.of());
    }

    public void h(Object obj) {
        for (Map.Entry<Class<?>, Collection<com.google.common.eventbus.b>> entry : b(obj).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<com.google.common.eventbus.b> value = entry.getValue();
            CopyOnWriteArraySet<com.google.common.eventbus.b> copyOnWriteArraySet = this.a.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<com.google.common.eventbus.b> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) MoreObjects.firstNonNull(this.a.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    public void i(Object obj) {
        for (Map.Entry<Class<?>, Collection<com.google.common.eventbus.b>> entry : b(obj).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<com.google.common.eventbus.b> value = entry.getValue();
            CopyOnWriteArraySet<com.google.common.eventbus.b> copyOnWriteArraySet = this.a.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + obj + " registered?");
            }
        }
    }
}
