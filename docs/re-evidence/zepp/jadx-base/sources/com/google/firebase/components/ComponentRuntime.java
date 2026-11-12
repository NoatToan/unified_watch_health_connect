package com.google.firebase.components;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class ComponentRuntime extends com.google.firebase.components.a implements ComponentLoader {
    private static final Provider<Set<Object>> g = new Provider() { // from class: by0
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.emptySet();
        }
    };
    private final Map<Component<?>, Provider<?>> a;
    private final Map<Class<?>, Provider<?>> b;
    private final Map<Class<?>, g<?>> c;
    private final List<Provider<ComponentRegistrar>> d;
    private final f e;
    private final AtomicReference<Boolean> f;

    public static final class Builder {
        private final Executor a;
        private final List<Provider<ComponentRegistrar>> b = new ArrayList();
        private final List<Component<?>> c = new ArrayList();

        public Builder(Executor executor) {
            this.a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar b(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public Builder addComponent(Component<?> component) {
            this.c.add(component);
            return this;
        }

        public Builder addComponentRegistrar(final ComponentRegistrar componentRegistrar) {
            this.b.add(new Provider() { // from class: cy0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.Builder.b(componentRegistrar);
                }
            });
            return this;
        }

        public Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public ComponentRuntime build() {
            return new ComponentRuntime(this.a, this.b, this.c);
        }
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    private void e(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<Provider<ComponentRegistrar>> it2 = this.d.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it2.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(componentRegistrar.getComponents());
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it2.remove();
                    Log.w(ComponentDiscovery.c, "Invalid component registrar.", e);
                }
            }
            if (this.a.isEmpty()) {
                d.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                d.a(arrayList2);
            }
            for (final Component<?> component : list) {
                this.a.put(component, new Lazy(new Provider() { // from class: ay0
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return this.a.h(component);
                    }
                }));
            }
            arrayList.addAll(n(list));
            arrayList.addAll(o());
            m();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        l();
    }

    private void f(Map<Component<?>, Provider<?>> map, boolean z) {
        for (Map.Entry<Component<?>, Provider<?>> entry : map.entrySet()) {
            Component<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z)) {
                value.get();
            }
        }
        this.e.b();
    }

    private static <T> List<T> g(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h(Component component) {
        return component.getFactory().create(new l(component, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ComponentRegistrar k(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    private void l() {
        Boolean bool = this.f.get();
        if (bool != null) {
            f(this.a, bool.booleanValue());
        }
    }

    private void m() {
        for (Component<?> component : this.a.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.c.containsKey(dependency.getInterface())) {
                    this.c.put(dependency.getInterface(), g.b(Collections.emptySet()));
                } else if (this.b.containsKey(dependency.getInterface())) {
                    continue;
                } else {
                    if (dependency.isRequired()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                    }
                    if (!dependency.isSet()) {
                        this.b.put(dependency.getInterface(), k.d());
                    }
                }
            }
        }
    }

    private List<Runnable> n(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component<?> component : list) {
            if (component.isValue()) {
                final Provider<?> provider = this.a.get(component);
                for (Class<? super Object> cls : component.getProvidedInterfaces()) {
                    if (this.b.containsKey(cls)) {
                        final k kVar = (k) this.b.get(cls);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                kVar.i(provider);
                            }
                        });
                    } else {
                        this.b.put(cls, provider);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> o() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<Component<?>, Provider<?>> entry : this.a.entrySet()) {
            Component<?> key = entry.getKey();
            if (!key.isValue()) {
                Provider<?> value = entry.getValue();
                for (Class<? super Object> cls : key.getProvidedInterfaces()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                final g<?> gVar = this.c.get(entry2.getKey());
                for (final Provider provider : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            gVar.a(provider);
                        }
                    });
                }
            } else {
                this.c.put((Class) entry2.getKey(), g.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    private static Iterable<Provider<ComponentRegistrar>> p(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new Provider() { // from class: zx0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.k(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            if (this.d.isEmpty()) {
                return;
            }
            e(new ArrayList());
        }
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Class<T> cls) {
        Provider<T> provider = getProvider(cls);
        if (provider == null) {
            return k.d();
        }
        return provider instanceof k ? (k) provider : k.h(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<T> getProvider(Class<T> cls) {
        Preconditions.checkNotNull(cls, "Null interface requested.");
        return (Provider) this.b.get(cls);
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public void initializeAllComponentsForTests() {
        Iterator<Provider<?>> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            it2.next().get();
        }
    }

    public void initializeEagerComponents(boolean z) {
        HashMap map;
        if (this.f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.a);
            }
            f(map, z);
        }
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return super.setOf(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        g<?> gVar = this.c.get(cls);
        if (gVar != null) {
            return gVar;
        }
        return (Provider<Set<T>>) g;
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, p(iterable), Arrays.asList(componentArr));
    }

    private ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<Component<?>> collection) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = new AtomicReference<>();
        f fVar = new f(executor);
        this.e = fVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.of(fVar, f.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.of(this, ComponentLoader.class, new Class[0]));
        for (Component<?> component : collection) {
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.d = g(iterable);
        e(arrayList);
    }
}
