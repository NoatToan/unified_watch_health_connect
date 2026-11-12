package c33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f24290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f24292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f24293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f24294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24295g;

    public w(int i14) {
        this.f24289a = i14;
        this.f24291c = new ArrayList(0);
        e33.k.f62827a.getClass();
        List listA = e33.k.a.a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e33.k) it.next()).b());
        }
        this.f24295g = arrayList;
    }

    public final g a() {
        g gVar = this.f24290b;
        if (gVar != null) {
            return gVar;
        }
        p005kotlin.jvm.internal.s.m("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        w wVar = (w) obj;
        return this.f24289a == wVar.f24289a && a().equals(wVar.a()) && p005kotlin.jvm.internal.s.g(this.f24291c, wVar.f24291c) && p005kotlin.jvm.internal.s.g(this.f24293e, wVar.f24293e) && p005kotlin.jvm.internal.s.g(this.f24292d, wVar.f24292d) && p005kotlin.jvm.internal.s.g(this.f24294f, wVar.f24294f) && p005kotlin.jvm.internal.s.g(this.f24295g, wVar.f24295g);
    }

    public final int hashCode() {
        return this.f24291c.hashCode() + ((a().hashCode() + (this.f24289a * 31)) * 31);
    }

    public w() {
        this(0);
    }
}
