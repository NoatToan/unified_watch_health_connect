package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class iz5 implements fz5 {
    public njr d;
    public int f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz5 f22240a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22241b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public ex6 i = null;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<fz5> f22242k = new ArrayList();
    public List<iz5> l = new ArrayList();

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

    public iz5(njr njrVar) {
        this.d = njrVar;
    }

    @Override // defpackage.fz5
    public void a(fz5 fz5Var) {
        Iterator<iz5> it = this.l.iterator();
        while (it.hasNext()) {
            if (!it.next().j) {
                return;
            }
        }
        this.c = true;
        fz5 fz5Var2 = this.f22240a;
        if (fz5Var2 != null) {
            fz5Var2.a(this);
        }
        if (this.f22241b) {
            this.d.a(this);
            return;
        }
        iz5 iz5Var = null;
        int i = 0;
        for (iz5 iz5Var2 : this.l) {
            if (!(iz5Var2 instanceof ex6)) {
                i++;
                iz5Var = iz5Var2;
            }
        }
        if (iz5Var != null && i == 1 && iz5Var.j) {
            ex6 ex6Var = this.i;
            if (ex6Var != null) {
                if (!ex6Var.j) {
                    return;
                } else {
                    this.f = this.h * ex6Var.g;
                }
            }
            d(iz5Var.g + this.f);
        }
        fz5 fz5Var3 = this.f22240a;
        if (fz5Var3 != null) {
            fz5Var3.a(this);
        }
    }

    public void b(fz5 fz5Var) {
        this.f22242k.add(fz5Var);
        if (this.j) {
            fz5Var.a(fz5Var);
        }
    }

    public void c() {
        this.l.clear();
        this.f22242k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.f22241b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (fz5 fz5Var : this.f22242k) {
            fz5Var.a(fz5Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f27993b.v());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.f22242k.size());
        sb.append(">");
        return sb.toString();
    }
}
