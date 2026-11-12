package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class fg5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17756a;

    public fg5(byte[] bArr) {
        this.f17756a = bArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof fg5) {
            return vj1.a(this.f17756a, ((fg5) reVar).f17756a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f17756a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(27, this.f17756a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f17756a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f17756a.length) + 1 + this.f17756a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
