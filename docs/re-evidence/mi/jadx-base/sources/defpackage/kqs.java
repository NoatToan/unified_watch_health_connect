package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class kqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24201a;
    public boolean c;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24202b = "";
    public String d = "";
    public String f = "";
    public int g = -1;

    public static kqs l(byte[] bArr) {
        return (kqs) new kqs().c(bArr);
    }

    @Override // defpackage.qns
    public int a() {
        if (this.g < 0) {
            i();
        }
        return this.g;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (n()) {
            cVar.x(1, m());
        }
        if (q()) {
            cVar.x(2, p());
        }
        if (t()) {
            cVar.x(3, s());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iG = n() ? c.g(1, m()) : 0;
        if (q()) {
            iG += c.g(2, p());
        }
        if (t()) {
            iG += c.g(3, s());
        }
        this.g = iG;
        return iG;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public kqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 10) {
                k(casVar.h());
            } else if (iB == 18) {
                o(casVar.h());
            } else if (iB == 26) {
                r(casVar.h());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public kqs k(String str) {
        this.f24201a = true;
        this.f24202b = str;
        return this;
    }

    public String m() {
        return this.f24202b;
    }

    public boolean n() {
        return this.f24201a;
    }

    public kqs o(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public String p() {
        return this.d;
    }

    public boolean q() {
        return this.c;
    }

    public kqs r(String str) {
        this.e = true;
        this.f = str;
        return this;
    }

    public String s() {
        return this.f;
    }

    public boolean t() {
        return this.e;
    }
}
