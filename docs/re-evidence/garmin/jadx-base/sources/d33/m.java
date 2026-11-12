package d33;

import java.util.LinkedHashMap;
import java.util.List;
import p13.j0;
import s33.u;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u33.d f57410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33.h f57411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u33.j f57412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f57414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Object> f57415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f57416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e33.k> f57417h;

    public m(u33.d dVar, u33.h hVar, u33.j jVar, boolean z14, m mVar, List<? extends Object> list) {
        dVar.getClass();
        hVar.getClass();
        jVar.getClass();
        list.getClass();
        this.f57410a = dVar;
        this.f57411b = hVar;
        this.f57412c = jVar;
        this.f57413d = z14;
        this.f57414e = mVar;
        this.f57415f = list;
        this.f57416g = new LinkedHashMap();
        e33.k.f62827a.getClass();
        this.f57417h = e33.k.a.a();
    }

    public final Integer a(int i14) {
        Integer num = (Integer) this.f57416g.get(Integer.valueOf(i14));
        if (num != null) {
            return num;
        }
        m mVar = this.f57414e;
        if (mVar != null) {
            return mVar.a(i14);
        }
        return null;
    }

    public final m b(List<u> list) {
        list.getClass();
        m mVar = new m(this.f57410a, this.f57411b, this.f57412c, this.f57413d, this, this.f57415f);
        for (u uVar : list) {
            mVar.f57416g.put(Integer.valueOf(uVar.f156938e), Integer.valueOf(uVar.f156937d));
        }
        return mVar;
    }

    public m(u33.d dVar, u33.h hVar, u33.j jVar, boolean z14, m mVar, List list, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(dVar, hVar, jVar, z14, (i14 & 16) != 0 ? null : mVar, (i14 & 32) != 0 ? j0.f134944a : list);
    }
}
