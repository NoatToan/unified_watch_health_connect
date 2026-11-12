package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class cqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14629a;
    public boolean c;
    public boolean e;
    public boolean g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14630b = 0;
    public boolean d = false;
    public int f = 0;
    public boolean h = false;
    public List<String> i = Collections.emptyList();
    public int j = -1;

    public static cqs n(byte[] bArr) {
        return (cqs) new cqs().c(bArr);
    }

    public static cqs r(cas casVar) {
        return new cqs().b(casVar);
    }

    public boolean A() {
        return this.g;
    }

    @Override // defpackage.qns
    public int a() {
        if (this.j < 0) {
            i();
        }
        return this.j;
    }

    @Override // defpackage.qns
    public void e(c cVar) {
        if (p()) {
            cVar.M(1, u());
        }
        if (v()) {
            cVar.y(2, t());
        }
        if (x()) {
            cVar.t(3, w());
        }
        if (A()) {
            cVar.y(4, z());
        }
        Iterator<String> it = o().iterator();
        while (it.hasNext()) {
            cVar.x(5, it.next());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iL = 0;
        int iH = p() ? c.H(1, u()) : 0;
        if (v()) {
            iH += c.h(2, t());
        }
        if (x()) {
            iH += c.c(3, w());
        }
        if (A()) {
            iH += c.h(4, z());
        }
        Iterator<String> it = o().iterator();
        while (it.hasNext()) {
            iL += c.l(it.next());
        }
        int size = iH + iL + o().size();
        this.j = size;
        return size;
    }

    public cqs j(int i) {
        this.f14629a = true;
        this.f14630b = i;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public cqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 8) {
                j(casVar.u());
            } else if (iB == 16) {
                m(casVar.l());
            } else if (iB == 24) {
                q(casVar.p());
            } else if (iB == 32) {
                s(casVar.l());
            } else if (iB == 42) {
                l(casVar.h());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public cqs l(String str) {
        str.getClass();
        if (this.i.isEmpty()) {
            this.i = new ArrayList();
        }
        this.i.add(str);
        return this;
    }

    public cqs m(boolean z) {
        this.c = true;
        this.d = z;
        return this;
    }

    public List<String> o() {
        return this.i;
    }

    public boolean p() {
        return this.f14629a;
    }

    public cqs q(int i) {
        this.e = true;
        this.f = i;
        return this;
    }

    public cqs s(boolean z) {
        this.g = true;
        this.h = z;
        return this;
    }

    public boolean t() {
        return this.d;
    }

    public int u() {
        return this.f14630b;
    }

    public boolean v() {
        return this.c;
    }

    public int w() {
        return this.f;
    }

    public boolean x() {
        return this.e;
    }

    public int y() {
        return this.i.size();
    }

    public boolean z() {
        return this.h;
    }
}
