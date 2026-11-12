package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class e<Transcode> {
    private final List<ModelLoader.LoadData<?>> a = new ArrayList();
    private final List<Key> b = new ArrayList();
    private GlideContext c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private f.e h;
    private Options i;
    private Map<Class<?>, Transformation<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private Key n;
    private Priority o;
    private DiskCacheStrategy p;
    private boolean q;
    private boolean r;

    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    public ArrayPool b() {
        return this.c.getArrayPool();
    }

    public List<Key> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<ModelLoader.LoadData<?>> listG = g();
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData<?> loadData = listG.get(i);
                if (!this.b.contains(loadData.sourceKey)) {
                    this.b.add(loadData.sourceKey);
                }
                for (int i2 = 0; i2 < loadData.alternateKeys.size(); i2++) {
                    if (!this.b.contains(loadData.alternateKeys.get(i2))) {
                        this.b.add(loadData.alternateKeys.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    public DiskCache d() {
        return this.h.a();
    }

    public DiskCacheStrategy e() {
        return this.p;
    }

    public int f() {
        return this.f;
    }

    public List<ModelLoader.LoadData<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List modelLoaders = this.c.getRegistry().getModelLoaders(this.d);
            int size = modelLoaders.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData<?> loadDataBuildLoadData = ((ModelLoader) modelLoaders.get(i)).buildLoadData(this.d, this.e, this.f, this.i);
                if (loadDataBuildLoadData != null) {
                    this.a.add(loadDataBuildLoadData);
                }
            }
        }
        return this.a;
    }

    public <Data> LoadPath<Data, ?, Transcode> h(Class<Data> cls) {
        return this.c.getRegistry().getLoadPath(cls, this.g, this.k);
    }

    public Class<?> i() {
        return this.d.getClass();
    }

    public List<ModelLoader<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.c.getRegistry().getModelLoaders(file);
    }

    public Options k() {
        return this.i;
    }

    public Priority l() {
        return this.o;
    }

    public List<Class<?>> m() {
        return this.c.getRegistry().getRegisteredResourceClasses(this.d.getClass(), this.g, this.k);
    }

    public <Z> ResourceEncoder<Z> n(Resource<Z> resource) {
        return this.c.getRegistry().getResultEncoder(resource);
    }

    public Key o() {
        return this.n;
    }

    public <X> Encoder<X> p(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.c.getRegistry().getSourceEncoder(x);
    }

    public Class<?> q() {
        return this.k;
    }

    public <Z> Transformation<Z> r(Class<Z> cls) {
        Transformation<Z> transformation = (Transformation) this.j.get(cls);
        if (transformation == null) {
            for (Map.Entry<Class<?>, Transformation<?>> entry : this.j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.j.isEmpty() || !this.q) {
            return UnitTransformation.get();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public int s() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void u(GlideContext glideContext, Object obj, Key key, int i, int i2, DiskCacheStrategy diskCacheStrategy, Class<?> cls, Class<R> cls2, Priority priority, Options options, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, f.e eVar) {
        this.c = glideContext;
        this.d = obj;
        this.n = key;
        this.e = i;
        this.f = i2;
        this.p = diskCacheStrategy;
        this.g = cls;
        this.h = eVar;
        this.k = cls2;
        this.o = priority;
        this.i = options;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    public boolean v(Resource<?> resource) {
        return this.c.getRegistry().isResourceEncoderAvailable(resource);
    }

    public boolean w() {
        return this.r;
    }

    public boolean x(Key key) {
        List<ModelLoader.LoadData<?>> listG = g();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            if (listG.get(i).sourceKey.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
