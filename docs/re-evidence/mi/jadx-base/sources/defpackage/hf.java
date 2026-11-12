package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class hf extends re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f20001a;

    public hf(byte[] bArr) {
        this.f20001a = bArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof hf) {
            return vj1.a(this.f20001a, ((hf) reVar).f20001a);
        }
        return false;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.c(23);
        int length = this.f20001a.length;
        keVar.i(length);
        for (int i = 0; i != length; i++) {
            keVar.c(this.f20001a[i]);
        }
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f20001a);
    }

    @Override // defpackage.re
    public int i() {
        int length = this.f20001a.length;
        return yio.a(length) + 1 + length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return olo.b(this.f20001a);
    }
}
