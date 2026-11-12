package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<zxk> f19499a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19500b = 0;
    public int c = -1;

    public gzk a(zxk zxkVar) {
        this.f19499a.add(zxkVar);
        if (zxkVar.b() != -1) {
            this.f19500b = 0;
            this.c = zxkVar.b();
        } else {
            this.f19500b++;
        }
        return this;
    }

    public gzk b() {
        gzk gzkVar = new gzk();
        gzkVar.f19499a = new ArrayList();
        for (zxk zxkVar : this.f19499a) {
            if (zxkVar.b() != 0) {
                gzkVar.f19499a.add(zxkVar);
            }
        }
        gzkVar.c = this.c;
        gzkVar.f19500b = this.f19500b;
        return gzkVar;
    }

    public int c() {
        return this.f19500b;
    }

    public List<zxk> d() {
        return this.f19499a;
    }

    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gzk gzkVar = (gzk) obj;
        if (d().size() != gzkVar.d().size()) {
            return false;
        }
        for (int i = 0; i < d().size(); i++) {
            if (!d().get(i).equals(gzkVar.d().get(i))) {
                return false;
            }
        }
        return true;
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        Iterator<zxk> it = this.f19499a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().a());
            sb.append(",");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public int hashCode() {
        return this.f19499a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (zxk zxkVar : this.f19499a) {
            sb.append("<");
            sb.append(zxkVar.a());
            sb.append(",");
            sb.append(zxkVar.b());
            sb.append(">");
        }
        return sb.toString();
    }
}
