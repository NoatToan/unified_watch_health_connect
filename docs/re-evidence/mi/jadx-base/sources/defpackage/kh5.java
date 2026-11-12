package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class kh5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23844a;

    public kh5(byte[] bArr) {
        this.f23844a = bArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof kh5) {
            return vj1.a(this.f23844a, ((kh5) reVar).f23844a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.c(this.f23844a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(12, this.f23844a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f23844a);
    }

    @Override // defpackage.re
    public int i() throws IOException {
        return yio.a(this.f23844a.length) + 1 + this.f23844a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
