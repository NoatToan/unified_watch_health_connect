package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class nqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28271a;
    public boolean c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l3s f28272b = l3s.c;
    public fqs d = null;
    public int e = -1;

    public static nqs o(byte[] bArr) {
        return (nqs) new nqs().c(bArr);
    }

    @Override // defpackage.qns
    public int a() {
        if (this.e < 0) {
            i();
        }
        return this.e;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (p()) {
            cVar.v(1, j());
        }
        if (q()) {
            cVar.w(2, k());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iE = p() ? c.e(1, j()) : 0;
        if (q()) {
            iE += c.f(2, k());
        }
        this.e = iE;
        return iE;
    }

    public l3s j() {
        return this.f28272b;
    }

    public fqs k() {
        return this.d;
    }

    public nqs l(l3s l3sVar) {
        this.f28271a = true;
        this.f28272b = l3sVar;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public nqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 10) {
                l(casVar.e());
            } else if (iB == 18) {
                fqs fqsVar = new fqs();
                casVar.k(fqsVar);
                n(fqsVar);
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public nqs n(fqs fqsVar) {
        fqsVar.getClass();
        this.c = true;
        this.d = fqsVar;
        return this;
    }

    public boolean p() {
        return this.f28271a;
    }

    public boolean q() {
        return this.c;
    }
}
