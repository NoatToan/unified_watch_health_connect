package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class gh5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18976a;

    public gh5(byte[] bArr) {
        this.f18976a = vj1.e(bArr);
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof gh5) {
            return vj1.a(this.f18976a, ((gh5) reVar).f18976a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f18976a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(20, this.f18976a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f18976a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f18976a.length) + 1 + this.f18976a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
