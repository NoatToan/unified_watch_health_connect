package com.bumptech.glide;

import aj.o;
import aj.p;
import aj.q;
import aj.s;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f28441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj.a f28442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lj.e f28443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lj.f f28444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f28445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ij.f f28446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lj.b f28447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lj.d f28448h = new lj.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lj.c f28449i = new lj.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rj.a.c f28450j;

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

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super(androidx.core.view.j.i(cls, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super(androidx.core.view.j.h(cls, "Failed to find source encoder for data class: "));
        }
    }

    public Registry() {
        rj.a.C2889a c2889a = rj.a.f152952a;
        rj.a.c cVar = new rj.a.c(new k7.g(20), new rj.b(), new rj.c());
        this.f28450j = cVar;
        this.f28441a = new q(cVar);
        this.f28442b = new lj.a();
        this.f28443c = new lj.e();
        this.f28444d = new lj.f();
        this.f28445e = new com.bumptech.glide.load.data.f();
        this.f28446f = new ij.f();
        this.f28447g = new lj.b();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        lj.e eVar = this.f28443c;
        synchronized (eVar) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(eVar.f112927a);
                eVar.f112927a.clear();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    eVar.f112927a.add((String) it3.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        eVar.f112927a.add(str);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a(Class cls, Class cls2, p pVar) {
        q qVar = this.f28441a;
        synchronized (qVar) {
            qVar.f3373a.a(cls, cls2, pVar);
            qVar.f3374b.f3375a.clear();
        }
    }

    public final void b(Class cls, ui.d dVar) {
        lj.a aVar = this.f28442b;
        synchronized (aVar) {
            aVar.f112918a.add(new lj.a.C2163a(cls, dVar));
        }
    }

    public final void c(Class cls, ui.k kVar) {
        lj.f fVar = this.f28444d;
        synchronized (fVar) {
            fVar.f112932a.add(new lj.f.a(cls, kVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, ui.j jVar) {
        lj.e eVar = this.f28443c;
        synchronized (eVar) {
            eVar.a(str).add(new lj.e.a<>(cls, cls2, jVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        lj.b bVar = this.f28447g;
        synchronized (bVar) {
            arrayList = bVar.f112921a;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    public final <Model> List<o<Model, ?>> f(Model model) {
        List<o<Model, ?>> listUnmodifiableList;
        q qVar = this.f28441a;
        qVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (qVar) {
            q.a.C0060a c0060a = (q.a.C0060a) qVar.f3374b.f3375a.get(cls);
            listUnmodifiableList = c0060a == null ? null : c0060a.f3376a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(qVar.f3373a.d(cls));
                if (((q.a.C0060a) qVar.f3374b.f3375a.put(cls, new q.a.C0060a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        int size = listUnmodifiableList.size();
        List<o<Model, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z14 = true;
        for (int i14 = 0; i14 < size; i14++) {
            o<Model, ?> oVar = listUnmodifiableList.get(i14);
            if (oVar.b(model)) {
                if (z14) {
                    arrayList = new ArrayList<>(size - i14);
                    z14 = false;
                }
                arrayList.add(oVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model, listUnmodifiableList);
        }
        return arrayList;
    }

    public final <X> com.bumptech.glide.load.data.e<X> g(X x14) {
        com.bumptech.glide.load.data.e<X> eVarB;
        com.bumptech.glide.load.data.f fVar = this.f28445e;
        synchronized (fVar) {
            try {
                qj.l.b(x14);
                com.bumptech.glide.load.data.e.a aVar = (com.bumptech.glide.load.data.e.a) fVar.f28543a.get(x14.getClass());
                if (aVar == null) {
                    for (com.bumptech.glide.load.data.e.a aVar2 : fVar.f28543a.values()) {
                        if (aVar2.a().isAssignableFrom(x14.getClass())) {
                            aVar = aVar2;
                            break;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = com.bumptech.glide.load.data.f.f28542b;
                }
                eVarB = aVar.b(x14);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return eVarB;
    }

    public final void h(com.bumptech.glide.load.data.e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.f28445e;
        synchronized (fVar) {
            fVar.f28543a.put(aVar.a(), aVar);
        }
    }

    public final void i(Class cls, Class cls2, ij.e eVar) {
        ij.f fVar = this.f28446f;
        synchronized (fVar) {
            fVar.f93802a.add(new ij.f.a(cls, cls2, eVar));
        }
    }

    public final void j(com.bumptech.glide.integration.okhttp3.b.a aVar) {
        ArrayList arrayListF;
        q qVar = this.f28441a;
        synchronized (qVar) {
            s sVar = qVar.f3373a;
            synchronized (sVar) {
                arrayListF = sVar.f();
                sVar.a(aj.h.class, InputStream.class, aVar);
            }
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                ((p) it.next()).getClass();
            }
            qVar.f3374b.f3375a.clear();
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public <M> NoModelLoaderAvailableException(M m14, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m14);
        }

        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
