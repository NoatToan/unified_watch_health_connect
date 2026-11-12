package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.cs5;
import defpackage.d7g;
import defpackage.e7g;
import defpackage.f7g;
import defpackage.g7g;
import defpackage.grk;
import defpackage.kqk;
import defpackage.o4d;
import defpackage.pie;
import defpackage.qie;
import defpackage.tqk;
import defpackage.u69;
import defpackage.uqk;
import defpackage.uwp;
import defpackage.x98;
import defpackage.xqk;
import defpackage.yqk;
import defpackage.z98;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7g f6934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z98 f6935b;
    public final uqk c;
    public final yqk d;
    public final com.bumptech.glide.load.data.b e;
    public final uwp f;
    public final o4d g;
    public final g7g h = new g7g();
    public final qie i = new qie();
    public final Pools.Pool<List<Throwable>> j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m, List<d7g<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> poolE = u69.e();
        this.j = poolE;
        this.f6934a = new f7g(poolE);
        this.f6935b = new z98();
        this.c = new uqk();
        this.d = new yqk();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new uwp();
        this.g = new o4d();
        s(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    public <Data> Registry a(Class<Data> cls, x98<Data> x98Var) {
        this.f6935b.a(cls, x98Var);
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, xqk<TResource> xqkVar) {
        this.d.a(cls, xqkVar);
        return this;
    }

    public <Model, Data> Registry c(Class<Model> cls, Class<Data> cls2, e7g<Model, Data> e7gVar) {
        this.f6934a.a(cls, cls2, e7gVar);
        return this;
    }

    public <Data, TResource> Registry d(Class<Data> cls, Class<TResource> cls2, tqk<Data, TResource> tqkVar) {
        e("legacy_append", cls, cls2, tqkVar);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, tqk<Data, TResource> tqkVar) {
        this.c.a(str, tqkVar, cls, cls2);
        return this;
    }

    public final <Data, TResource, Transcode> List<cs5<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.c.d(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new cs5(cls, cls4, cls5, this.c.b(cls, cls4), this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    public <Data, TResource, Transcode> pie<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        pie<Data, TResource, Transcode> pieVarA = this.i.a(cls, cls2, cls3);
        if (this.i.c(pieVarA)) {
            return null;
        }
        if (pieVarA == null) {
            List<cs5<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
            pieVarA = listF.isEmpty() ? null : new pie<>(cls, cls2, cls3, listF, this.j);
            this.i.d(cls, cls2, cls3, pieVarA);
        }
        return pieVarA;
    }

    public <Model> List<d7g<Model, ?>> i(Model model) {
        return this.f6934a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listA = this.h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.f6934a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.c.d(it.next(), cls2)) {
                    if (!this.f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public <X> xqk<X> k(kqk<X> kqkVar) throws NoResultEncoderAvailableException {
        xqk<X> xqkVarB = this.d.b(kqkVar.a());
        if (xqkVarB != null) {
            return xqkVarB;
        }
        throw new NoResultEncoderAvailableException(kqkVar.a());
    }

    public <X> com.bumptech.glide.load.data.a<X> l(X x) {
        return this.e.a(x);
    }

    public <X> x98<X> m(X x) throws NoSourceEncoderAvailableException {
        x98<X> x98VarB = this.f6935b.b(x.getClass());
        if (x98VarB != null) {
            return x98VarB;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    public boolean n(kqk<?> kqkVar) {
        return this.d.b(kqkVar.a()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public Registry p(com.bumptech.glide.load.data.a.InterfaceC0136a<?> interfaceC0136a) {
        this.e.b(interfaceC0136a);
        return this;
    }

    public <TResource, Transcode> Registry q(Class<TResource> cls, Class<Transcode> cls2, grk<TResource, Transcode> grkVar) {
        this.f.c(cls, cls2, grkVar);
        return this;
    }

    public <Model, Data> Registry r(Class<Model> cls, Class<Data> cls2, e7g<? extends Model, ? extends Data> e7gVar) {
        this.f6934a.f(cls, cls2, e7gVar);
        return this;
    }

    public final Registry s(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.c.e(arrayList);
        return this;
    }
}
