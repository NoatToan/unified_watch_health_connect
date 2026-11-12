package com.google.firebase.components;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Component<T> {
    private final Set<Class<? super T>> a;
    private final Set<Dependency> b;
    private final int c;
    private final int d;
    private final ComponentFactory<T> e;
    private final Set<Class<?>> f;

    public static class Builder<T> {
        private final Set<Class<? super T>> a;
        private final Set<Dependency> b;
        private int c;
        private int d;
        private ComponentFactory<T> e;
        private Set<Class<?>> f;

        /* JADX INFO: Access modifiers changed from: private */
        public Builder<T> b() {
            this.d = 1;
            return this;
        }

        private Builder<T> c(int i) {
            Preconditions.checkState(this.c == 0, "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        private void d(Class<?> cls) {
            Preconditions.checkArgument(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            d(dependency.getInterface());
            this.b.add(dependency);
            return this;
        }

        public Builder<T> alwaysEager() {
            return c(1);
        }

        public Component<T> build() {
            Preconditions.checkState(this.e != null, "Missing required property: factory.");
            return new Component<>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
        }

        public Builder<T> eagerInDefaultApp() {
            return c(2);
        }

        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.e = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> publishes(Class<?> cls) {
            this.f.add(cls);
            return this;
        }

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static <T> Component<T> intoSet(final T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(new ComponentFactory() { // from class: tx0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.d(t, componentContainer);
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).b();
    }

    @Deprecated
    public static <T> Component<T> of(Class<T> cls, final T t) {
        return builder(cls).factory(new ComponentFactory() { // from class: ux0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.e(t, componentContainer);
            }
        }).build();
    }

    public Set<Dependency> getDependencies() {
        return this.b;
    }

    public ComponentFactory<T> getFactory() {
        return this.e;
    }

    public Set<Class<? super T>> getProvidedInterfaces() {
        return this.a;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f;
    }

    public boolean isAlwaysEager() {
        return this.c == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.c == 2;
    }

    public boolean isLazy() {
        return this.c == 0;
    }

    public boolean isValue() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + com.alipay.sdk.m.u.i.d;
    }

    private Component(Set<Class<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = i2;
        this.e = componentFactory;
        this.f = Collections.unmodifiableSet(set3);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    @SafeVarargs
    public static <T> Component<T> of(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new ComponentFactory() { // from class: vx0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.f(t, componentContainer);
            }
        }).build();
    }
}
