package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class jqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23039a;
    public boolean c;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23040b = "";
    public String d = "";
    public fqs f = null;
    public int g = -1;

    public static jqs n(byte[] bArr) {
        return (jqs) new jqs().c(bArr);
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
        if (p()) {
            cVar.x(1, o());
        }
        if (s()) {
            cVar.x(2, r());
        }
        if (t()) {
            cVar.w(3, j());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iG = p() ? c.g(1, o()) : 0;
        if (s()) {
            iG += c.g(2, r());
        }
        if (t()) {
            iG += c.f(3, j());
        }
        this.g = iG;
        return iG;
    }

    public fqs j() {
        return this.f;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public jqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 10) {
                m(casVar.h());
            } else if (iB == 18) {
                q(casVar.h());
            } else if (iB == 26) {
                fqs fqsVar = new fqs();
                casVar.k(fqsVar);
                l(fqsVar);
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public jqs l(fqs fqsVar) {
        fqsVar.getClass();
        this.e = true;
        this.f = fqsVar;
        return this;
    }

    public jqs m(String str) {
        this.f23039a = true;
        this.f23040b = str;
        return this;
    }

    public String o() {
        return this.f23040b;
    }

    public boolean p() {
        return this.f23039a;
    }

    public jqs q(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public String r() {
        return this.d;
    }

    public boolean s() {
        return this.c;
    }

    public boolean t() {
        return this.e;
    }
}
