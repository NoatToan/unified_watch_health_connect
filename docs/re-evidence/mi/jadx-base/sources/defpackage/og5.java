package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class og5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f29131a;

    public og5(byte[] bArr) {
        this.f29131a = bArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof og5) {
            return vj1.a(this.f29131a, ((og5) reVar).f29131a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f29131a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(18, this.f29131a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f29131a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f29131a.length) + 1 + this.f29131a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
