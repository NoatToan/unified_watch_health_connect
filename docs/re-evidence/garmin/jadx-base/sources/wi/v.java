package wi;

import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class v implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f185449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<?> f185450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f185451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f185452d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ui.e f185453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<aj.o<File, ?>> f185454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f185455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile aj.o.a<?> f185456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f185457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f185458j;

    public v(g<?> gVar, f.a aVar) {
        this.f185450b = gVar;
        this.f185449a = aVar;
    }

    @Override // wi.f
    public final boolean a() {
        List<Class<?>> list;
        ArrayList arrayListE;
        ArrayList arrayListA = this.f185450b.a();
        boolean z14 = false;
        if (!arrayListA.isEmpty()) {
            g<?> gVar = this.f185450b;
            Registry registryA = gVar.f185297c.a();
            Class<?> cls = gVar.f185298d.getClass();
            Class<?> cls2 = gVar.f185301g;
            Class<?> cls3 = gVar.f185305k;
            lj.d dVar = registryA.f28448h;
            qj.k andSet = dVar.f112925a.getAndSet(null);
            if (andSet == null) {
                andSet = new qj.k(cls, cls2, cls3);
            } else {
                andSet.f144979a = cls;
                andSet.f144980b = cls2;
                andSet.f144981c = cls3;
            }
            synchronized (dVar.f112926b) {
                list = dVar.f112926b.get(andSet);
            }
            dVar.f112925a.set(andSet);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                aj.q qVar = registryA.f28441a;
                synchronized (qVar) {
                    arrayListE = qVar.f3373a.e(cls);
                }
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : registryA.f28443c.b((Class) it.next(), cls2)) {
                        if (!registryA.f28446f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                lj.d dVar2 = registryA.f28448h;
                List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (dVar2.f112926b) {
                    dVar2.f112926b.put(new qj.k(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List<aj.o<File, ?>> list3 = this.f185454f;
                    if (list3 != null && this.f185455g < list3.size()) {
                        this.f185456h = null;
                        while (!z14 && this.f185455g < this.f185454f.size()) {
                            List<aj.o<File, ?>> list4 = this.f185454f;
                            int i14 = this.f185455g;
                            this.f185455g = i14 + 1;
                            aj.o<File, ?> oVar = list4.get(i14);
                            File file = this.f185457i;
                            g<?> gVar2 = this.f185450b;
                            this.f185456h = oVar.a(file, gVar2.f185299e, gVar2.f185300f, gVar2.f185303i);
                            if (this.f185456h != null && this.f185450b.c(this.f185456h.f3372c.a()) != null) {
                                this.f185456h.f3372c.d(this.f185450b.f185309o, this);
                                z14 = true;
                            }
                        }
                        return z14;
                    }
                    int i15 = this.f185452d + 1;
                    this.f185452d = i15;
                    if (i15 >= list2.size()) {
                        int i16 = this.f185451c + 1;
                        this.f185451c = i16;
                        if (i16 >= arrayListA.size()) {
                            break;
                        }
                        this.f185452d = 0;
                    }
                    ui.e eVar = (ui.e) arrayListA.get(this.f185451c);
                    Class cls5 = (Class) list2.get(this.f185452d);
                    ui.l<Z> lVarE = this.f185450b.e(cls5);
                    g<?> gVar3 = this.f185450b;
                    this.f185458j = new w(gVar3.f185297c.f28477a, eVar, gVar3.f185308n, gVar3.f185299e, gVar3.f185300f, lVarE, cls5, gVar3.f185303i);
                    File fileA = ((k.c) this.f185450b.f185302h).a().a(this.f185458j);
                    this.f185457i = fileA;
                    if (fileA != null) {
                        this.f185453e = eVar;
                        this.f185454f = this.f185450b.f185297c.a().f(fileA);
                        this.f185455g = 0;
                    }
                }
            } else if (!File.class.equals(this.f185450b.f185305k)) {
                StringBuilder sb3 = new StringBuilder("Failed to find any load path from ");
                sb3.append(this.f185450b.f185298d.getClass());
                o2.c.t(sb3, " to ", this.f185450b.f185305k);
                return false;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Object obj) {
        this.f185449a.d(this.f185453e, obj, this.f185456h.f3372c, ui.a.RESOURCE_DISK_CACHE, this.f185458j);
    }

    @Override // wi.f
    public final void cancel() {
        aj.o.a<?> aVar = this.f185456h;
        if (aVar != null) {
            aVar.f3372c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void e(Exception exc) {
        this.f185449a.c(this.f185458j, exc, this.f185456h.f3372c, ui.a.RESOURCE_DISK_CACHE);
    }
}
