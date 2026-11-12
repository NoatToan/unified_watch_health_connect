package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class gqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19252a;
    public boolean c;
    public boolean e;
    public boolean g;
    public boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19254k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19253b = "";
    public String d = "";
    public String f = "";
    public String h = "";
    public String j = "";
    public String l = "";
    public int m = -1;

    public String A() {
        return this.l;
    }

    public boolean B() {
        return this.f19254k;
    }

    @Override // defpackage.qns
    public int a() {
        if (this.m < 0) {
            i();
        }
        return this.m;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (m()) {
            cVar.x(1, l());
        }
        if (p()) {
            cVar.x(2, o());
        }
        if (s()) {
            cVar.x(3, r());
        }
        if (v()) {
            cVar.x(4, u());
        }
        if (y()) {
            cVar.x(5, x());
        }
        if (B()) {
            cVar.x(6, A());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iG = m() ? c.g(1, l()) : 0;
        if (p()) {
            iG += c.g(2, o());
        }
        if (s()) {
            iG += c.g(3, r());
        }
        if (v()) {
            iG += c.g(4, u());
        }
        if (y()) {
            iG += c.g(5, x());
        }
        if (B()) {
            iG += c.g(6, A());
        }
        this.m = iG;
        return iG;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public gqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 10) {
                k(casVar.h());
            } else if (iB == 18) {
                n(casVar.h());
            } else if (iB == 26) {
                q(casVar.h());
            } else if (iB == 34) {
                t(casVar.h());
            } else if (iB == 42) {
                w(casVar.h());
            } else if (iB == 50) {
                z(casVar.h());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public gqs k(String str) {
        this.f19252a = true;
        this.f19253b = str;
        return this;
    }

    public String l() {
        return this.f19253b;
    }

    public boolean m() {
        return this.f19252a;
    }

    public gqs n(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public String o() {
        return this.d;
    }

    public boolean p() {
        return this.c;
    }

    public gqs q(String str) {
        this.e = true;
        this.f = str;
        return this;
    }

    public String r() {
        return this.f;
    }

    public boolean s() {
        return this.e;
    }

    public gqs t(String str) {
        this.g = true;
        this.h = str;
        return this;
    }

    public String u() {
        return this.h;
    }

    public boolean v() {
        return this.g;
    }

    public gqs w(String str) {
        this.i = true;
        this.j = str;
        return this;
    }

    public String x() {
        return this.j;
    }

    public boolean y() {
        return this.i;
    }

    public gqs z(String str) {
        this.f19254k = true;
        this.l = str;
        return this;
    }
}
