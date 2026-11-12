package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ld extends pe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ld[] f24919b = new ld[12];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24920a;

    public ld(byte[] bArr) {
        this.f24920a = bArr;
    }

    public static ld o(byte[] bArr) {
        if (bArr.length > 1) {
            return new ld(wj1.d(bArr));
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        ld[] ldVarArr = f24919b;
        if (i >= ldVarArr.length) {
            return new ld(wj1.d(bArr));
        }
        ld ldVar = ldVarArr[i];
        if (ldVar != null) {
            return ldVar;
        }
        ld ldVar2 = new ld(wj1.d(bArr));
        ldVarArr[i] = ldVar2;
        return ldVar2;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof ld) {
            return wj1.a(this.f24920a, ((ld) peVar).f24920a);
        }
        return false;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(10, this.f24920a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f24920a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f24920a.length) + 1 + this.f24920a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }
}
