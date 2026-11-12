package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class mqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l3s f27114b = l3s.c;
    public int c = -1;

    public static mqs m(byte[] bArr) {
        return (mqs) new mqs().c(bArr);
    }

    @Override // defpackage.qns
    public int a() {
        if (this.c < 0) {
            i();
        }
        return this.c;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (n()) {
            cVar.v(1, j());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iE = n() ? c.e(1, j()) : 0;
        this.c = iE;
        return iE;
    }

    public l3s j() {
        return this.f27114b;
    }

    public mqs k(l3s l3sVar) {
        this.f27113a = true;
        this.f27114b = l3sVar;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public mqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 10) {
                k(casVar.e());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public boolean n() {
        return this.f27113a;
    }
}
