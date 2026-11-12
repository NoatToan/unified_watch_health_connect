package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class oh5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f29166a;

    public oh5(byte[] bArr) {
        this.f29166a = vj1.e(bArr);
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof oh5) {
            return vj1.a(this.f29166a, ((oh5) reVar).f29166a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f29166a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(21, this.f29166a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f29166a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f29166a.length) + 1 + this.f29166a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }
}
