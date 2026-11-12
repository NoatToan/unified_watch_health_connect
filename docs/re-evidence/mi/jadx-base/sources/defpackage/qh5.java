package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class qh5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f31515a;

    public qh5(byte[] bArr) {
        this.f31515a = bArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof qh5) {
            return vj1.a(this.f31515a, ((qh5) reVar).f31515a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f31515a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(26, this.f31515a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f31515a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f31515a.length) + 1 + this.f31515a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
