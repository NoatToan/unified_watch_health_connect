package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ModelLoaderRegistry {
    private final MultiModelLoaderFactory a;
    private final a b;

    public static class a {
        private final Map<Class<?>, C0126a<?>> a = new HashMap();

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.ModelLoaderRegistry$a$a, reason: collision with other inner class name */
        public static class C0126a<Model> {
            public final List<ModelLoader<Model, ?>> a;

            public C0126a(List<ModelLoader<Model, ?>> list) {
                this.a = list;
            }
        }

        public void a() {
            this.a.clear();
        }

        @Nullable
        public <Model> List<ModelLoader<Model, ?>> b(Class<Model> cls) {
            C0126a<?> c0126a = this.a.get(cls);
            if (c0126a == null) {
                return null;
            }
            return (List<ModelLoader<Model, ?>>) c0126a.a;
        }

        public <Model> void c(Class<Model> cls, List<ModelLoader<Model, ?>> list) {
            if (this.a.put(cls, new C0126a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public ModelLoaderRegistry(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new MultiModelLoaderFactory(pool));
    }

    @NonNull
    private static <A> Class<A> a(@NonNull A a2) {
        return (Class<A>) a2.getClass();
    }

    @NonNull
    private synchronized <A> List<ModelLoader<A, ?>> b(@NonNull Class<A> cls) {
        List<ModelLoader<A, ?>> listB;
        listB = this.b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.a.d(cls));
            this.b.c(cls, listB);
        }
        return listB;
    }

    private <Model, Data> void c(@NonNull List<ModelLoaderFactory<? extends Model, ? extends Data>> list) {
        Iterator<ModelLoaderFactory<? extends Model, ? extends Data>> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().teardown();
        }
    }

    public synchronized <Model, Data> void append(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.a.b(cls, cls2, modelLoaderFactory);
        this.b.a();
    }

    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.a.build(cls, cls2);
    }

    @NonNull
    public synchronized List<Class<?>> getDataClasses(@NonNull Class<?> cls) {
        return this.a.f(cls);
    }

    @NonNull
    public <A> List<ModelLoader<A, ?>> getModelLoaders(@NonNull A a2) {
        List<ModelLoader<A, ?>> listB = b(a(a2));
        int size = listB.size();
        List<ModelLoader<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ModelLoader<A, ?> modelLoader = listB.get(i);
            if (modelLoader.handles(a2)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(modelLoader);
            }
        }
        return listEmptyList;
    }

    public synchronized <Model, Data> void prepend(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.a.h(cls, cls2, modelLoaderFactory);
        this.b.a();
    }

    public synchronized <Model, Data> void remove(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        c(this.a.i(cls, cls2));
        this.b.a();
    }

    public synchronized <Model, Data> void replace(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        c(this.a.j(cls, cls2, modelLoaderFactory));
        this.b.a();
    }

    private ModelLoaderRegistry(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
        this.b = new a();
        this.a = multiModelLoaderFactory;
    }
}
