package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class lqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25361a;
    public boolean c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25362b = 0;
    public String d = "";
    public int e = -1;

    public static lqs m(byte[] bArr) {
        return (lqs) new lqs().c(bArr);
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
        if (o()) {
            cVar.t(1, q());
        }
        if (p()) {
            cVar.x(2, n());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iC = o() ? c.c(1, q()) : 0;
        if (p()) {
            iC += c.g(2, n());
        }
        this.e = iC;
        return iC;
    }

    public lqs j(int i) {
        this.f25361a = true;
        this.f25362b = i;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public lqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 8) {
                j(casVar.p());
            } else if (iB == 18) {
                l(casVar.h());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public lqs l(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public String n() {
        return this.d;
    }

    public boolean o() {
        return this.f25361a;
    }

    public boolean p() {
        return this.c;
    }

    public int q() {
        return this.f25362b;
    }
}
