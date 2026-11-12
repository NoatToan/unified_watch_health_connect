package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ig5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21110a;

    public ig5(byte[] bArr) {
        this.f21110a = vj1.e(bArr);
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof ig5) {
            return vj1.a(this.f21110a, ((ig5) reVar).f21110a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f21110a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(25, this.f21110a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f21110a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f21110a.length) + 1 + this.f21110a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }
}
