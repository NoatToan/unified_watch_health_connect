package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class wg5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37934a;

    public wg5(byte[] bArr) {
        this.f37934a = bArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof wg5) {
            return vj1.a(this.f37934a, ((wg5) reVar).f37934a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f37934a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(19, this.f37934a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f37934a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f37934a.length) + 1 + this.f37934a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
