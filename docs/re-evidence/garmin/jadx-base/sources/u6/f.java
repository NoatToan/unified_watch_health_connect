package u6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f168806d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f168808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f168809g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f168803a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f168804b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f168805c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f168807e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f168810h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f168811i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f168812j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f168813k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f168814l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f168806d = pVar;
    }

    @Override // u6.d
    public final void a(d dVar) {
        ArrayList<f> arrayList = this.f168814l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f168812j) {
                return;
            }
        }
        this.f168805c = true;
        p pVar = this.f168803a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f168804b) {
            this.f168806d.a(this);
            return;
        }
        f fVar = null;
        int i14 = 0;
        for (f fVar2 : arrayList) {
            if (!(fVar2 instanceof g)) {
                i14++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i14 == 1 && fVar.f168812j) {
            g gVar = this.f168811i;
            if (gVar != null) {
                if (!gVar.f168812j) {
                    return;
                } else {
                    this.f168808f = this.f168810h * gVar.f168809g;
                }
            }
            d(fVar.f168809g + this.f168808f);
        }
        p pVar2 = this.f168803a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f168813k.add(pVar);
        if (this.f168812j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f168814l.clear();
        this.f168813k.clear();
        this.f168812j = false;
        this.f168809g = 0;
        this.f168805c = false;
        this.f168804b = false;
    }

    public void d(int i14) {
        if (this.f168812j) {
            return;
        }
        this.f168812j = true;
        this.f168809g = i14;
        for (d dVar : this.f168813k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f168806d.f168840b.f162627m0);
        sb3.append(":");
        sb3.append(this.f168807e);
        sb3.append("(");
        sb3.append(this.f168812j ? Integer.valueOf(this.f168809g) : "unresolved");
        sb3.append(") <t=");
        sb3.append(this.f168814l.size());
        sb3.append(":d=");
        sb3.append(this.f168813k.size());
        sb3.append(">");
        return sb3.toString();
    }
}
