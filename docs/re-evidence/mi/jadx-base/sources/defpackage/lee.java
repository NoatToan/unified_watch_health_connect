package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class lee extends te {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24970b;

    public lee(byte[] bArr) throws IOException {
        this.f24970b = bArr;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        byte[] bArr = this.f24970b;
        if (bArr != null) {
            keVar.g(48, bArr);
        } else {
            super.m().h(keVar);
        }
    }

    @Override // defpackage.re
    public int i() throws IOException {
        byte[] bArr = this.f24970b;
        return bArr != null ? yio.a(bArr.length) + 1 + this.f24970b.length : super.m().i();
    }

    @Override // defpackage.te, defpackage.re
    public re l() {
        if (this.f24970b != null) {
            w();
        }
        return super.l();
    }

    @Override // defpackage.te, defpackage.re
    public re m() {
        if (this.f24970b != null) {
            w();
        }
        return super.m();
    }

    @Override // defpackage.te
    public synchronized int size() {
        try {
            if (this.f24970b != null) {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.size();
    }

    @Override // defpackage.te
    public synchronized hd t(int i) {
        try {
            if (this.f24970b != null) {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.t(i);
    }

    @Override // defpackage.te
    public synchronized Enumeration u() {
        byte[] bArr = this.f24970b;
        if (bArr == null) {
            return super.u();
        }
        return new jee(bArr);
    }

    public final void w() {
        jee jeeVar = new jee(this.f24970b);
        while (jeeVar.hasMoreElements()) {
            this.f34611a.addElement(jeeVar.nextElement());
        }
        this.f24970b = null;
    }
}
