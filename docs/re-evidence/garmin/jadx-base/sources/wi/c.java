package wi;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class c implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ui.e> f185281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<?> f185282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.a f185283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f185284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ui.e f185285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<aj.o<File, ?>> f185286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f185287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile aj.o.a<?> f185288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f185289i;

    public c(List<ui.e> list, g<?> gVar, f.a aVar) {
        this.f185284d = -1;
        this.f185281a = list;
        this.f185282b = gVar;
        this.f185283c = aVar;
    }

    @Override // wi.f
    public final boolean a() {
        while (true) {
            List<aj.o<File, ?>> list = this.f185286f;
            boolean z14 = false;
            if (list != null && this.f185287g < list.size()) {
                this.f185288h = null;
                while (!z14 && this.f185287g < this.f185286f.size()) {
                    List<aj.o<File, ?>> list2 = this.f185286f;
                    int i14 = this.f185287g;
                    this.f185287g = i14 + 1;
                    aj.o<File, ?> oVar = list2.get(i14);
                    File file = this.f185289i;
                    g<?> gVar = this.f185282b;
                    this.f185288h = oVar.a(file, gVar.f185299e, gVar.f185300f, gVar.f185303i);
                    if (this.f185288h != null && this.f185282b.c(this.f185288h.f3372c.a()) != null) {
                        this.f185288h.f3372c.d(this.f185282b.f185309o, this);
                        z14 = true;
                    }
                }
                return z14;
            }
            int i15 = this.f185284d + 1;
            this.f185284d = i15;
            if (i15 >= this.f185281a.size()) {
                return false;
            }
            ui.e eVar = this.f185281a.get(this.f185284d);
            File fileA = ((k.c) this.f185282b.f185302h).a().a(new d(eVar, this.f185282b.f185308n));
            this.f185289i = fileA;
            if (fileA != null) {
                this.f185285e = eVar;
                this.f185286f = this.f185282b.f185297c.a().f(fileA);
                this.f185287g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Object obj) {
        this.f185283c.d(this.f185285e, obj, this.f185288h.f3372c, ui.a.DATA_DISK_CACHE, this.f185285e);
    }

    @Override // wi.f
    public final void cancel() {
        aj.o.a<?> aVar = this.f185288h;
        if (aVar != null) {
            aVar.f3372c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void e(Exception exc) {
        this.f185283c.c(this.f185285e, exc, this.f185288h.f3372c, ui.a.DATA_DISK_CACHE);
    }

    public c(g<?> gVar, f.a aVar) {
        this(gVar.a(), gVar, aVar);
    }
}
