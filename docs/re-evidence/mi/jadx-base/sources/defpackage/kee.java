package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class kee extends se {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f23773b;

    public kee(byte[] bArr) throws IOException {
        this.f23773b = bArr;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        byte[] bArr = this.f23773b;
        if (bArr != null) {
            oeVar.g(48, bArr);
        } else {
            super.m().h(oeVar);
        }
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        byte[] bArr = this.f23773b;
        return bArr != null ? zio.a(bArr.length) + 1 + this.f23773b.length : super.m().i();
    }

    @Override // defpackage.se, defpackage.pe
    public pe l() {
        if (this.f23773b != null) {
            w();
        }
        return super.l();
    }

    @Override // defpackage.se, defpackage.pe
    public pe m() {
        if (this.f23773b != null) {
            w();
        }
        return super.m();
    }

    @Override // defpackage.se
    public synchronized int size() {
        try {
            if (this.f23773b != null) {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.size();
    }

    @Override // defpackage.se
    public synchronized gd t(int i) {
        try {
            if (this.f23773b != null) {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.t(i);
    }

    @Override // defpackage.se
    public synchronized Enumeration u() {
        byte[] bArr = this.f23773b;
        if (bArr == null) {
            return super.u();
        }
        return new iee(bArr);
    }

    public final void w() {
        iee ieeVar = new iee(this.f23773b);
        while (ieeVar.hasMoreElements()) {
            this.f33552a.addElement(ieeVar.nextElement());
        }
        this.f23773b = null;
    }
}
