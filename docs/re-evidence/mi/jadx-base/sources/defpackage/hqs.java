package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class hqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20356a;
    public boolean c;
    public boolean e;
    public boolean g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20357b = false;
    public String d = "";
    public String f = "";
    public String h = "";
    public int i = -1;

    public static hqs m(byte[] bArr) {
        return (hqs) new hqs().c(bArr);
    }

    @Override // defpackage.qns
    public int a() {
        if (this.i < 0) {
            i();
        }
        return this.i;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (r()) {
            cVar.y(1, o());
        }
        if (u()) {
            cVar.x(2, n());
        }
        if (v()) {
            cVar.x(3, q());
        }
        if (w()) {
            cVar.x(4, t());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iH = r() ? c.h(1, o()) : 0;
        if (u()) {
            iH += c.g(2, n());
        }
        if (v()) {
            iH += c.g(3, q());
        }
        if (w()) {
            iH += c.g(4, t());
        }
        this.i = iH;
        return iH;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public hqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 8) {
                l(casVar.l());
            } else if (iB == 18) {
                k(casVar.h());
            } else if (iB == 26) {
                p(casVar.h());
            } else if (iB == 34) {
                s(casVar.h());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public hqs k(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public hqs l(boolean z) {
        this.f20356a = true;
        this.f20357b = z;
        return this;
    }

    public String n() {
        return this.d;
    }

    public boolean o() {
        return this.f20357b;
    }

    public hqs p(String str) {
        this.e = true;
        this.f = str;
        return this;
    }

    public String q() {
        return this.f;
    }

    public boolean r() {
        return this.f20356a;
    }

    public hqs s(String str) {
        this.g = true;
        this.h = str;
        return this;
    }

    public String t() {
        return this.h;
    }

    public boolean u() {
        return this.c;
    }

    public boolean v() {
        return this.e;
    }

    public boolean w() {
        return this.g;
    }
}
