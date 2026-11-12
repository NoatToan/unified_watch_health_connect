package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ovg implements Comparable<ovg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xb8 f29733b;
    public ovg f;
    public double i;
    public List<uz7> c = new ArrayList();
    public List<uz7> d = new ArrayList();
    public ovg e = null;
    public float g = 0.0f;
    public boolean h = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29734k = new String();

    public ovg(xb8 xb8Var, int i) {
        this.f29733b = xb8Var;
        this.f29732a = i;
    }

    public void A(float f) {
        this.g = f;
    }

    public void a(uz7 uz7Var) {
        this.c.add(uz7Var);
    }

    public void b(uz7 uz7Var) {
        this.d.add(uz7Var);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(ovg ovgVar) {
        int iCompare = Float.compare(ovgVar.g, this.g);
        if (iCompare != 0) {
            return iCompare;
        }
        if (this.f29733b.f().equals(ovgVar.f29733b.f())) {
            return 0;
        }
        return this.f29733b.f().equals("eps") ? 1 : -1;
    }

    public ovg d() {
        return this.e;
    }

    public ovg e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f29732a == ((ovg) obj).f29732a;
    }

    public List<uz7> h() {
        return this.c;
    }

    public int hashCode() {
        return this.f29732a;
    }

    public xb8 i() {
        return this.f29733b;
    }

    public List<uz7> k() {
        return this.d;
    }

    public int l() {
        return this.f29732a;
    }

    public List<ovg> m() {
        ArrayList arrayList = new ArrayList();
        Iterator<uz7> it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    public double n() {
        return this.i;
    }

    public List<ovg> o() {
        ArrayList arrayList = new ArrayList();
        Iterator<uz7> it = this.d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }

    public float p() {
        return this.g;
    }

    public boolean r() {
        return this.j;
    }

    public boolean s() {
        return this.h;
    }

    public ovg u(ovg ovgVar) {
        this.e = ovgVar;
        return this;
    }

    public ovg w(ovg ovgVar) {
        this.f = ovgVar;
        return this;
    }

    public void x(boolean z) {
        this.j = z;
    }

    public void y(double d) {
        this.i = d;
    }

    public void z(boolean z) {
        this.h = z;
    }
}
