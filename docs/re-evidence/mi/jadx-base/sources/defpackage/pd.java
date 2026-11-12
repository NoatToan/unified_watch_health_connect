package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class pd extends re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f30276a;

    public pd(byte[] bArr) {
        this.f30276a = bArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof pd) {
            return vj1.a(this.f30276a, ((pd) reVar).f30276a);
        }
        return false;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(24, this.f30276a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f30276a);
    }

    @Override // defpackage.re
    public int i() {
        int length = this.f30276a.length;
        return yio.a(length) + 1 + length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    @Override // defpackage.re
    public re l() {
        return new gg5(this.f30276a);
    }

    public boolean o() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f30276a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public boolean q() {
        return t(10) && t(11);
    }

    public boolean r() {
        return t(12) && t(13);
    }

    public final boolean t(int i) {
        byte b2;
        byte[] bArr = this.f30276a;
        return bArr.length > i && (b2 = bArr[i]) >= 48 && b2 <= 57;
    }
}
