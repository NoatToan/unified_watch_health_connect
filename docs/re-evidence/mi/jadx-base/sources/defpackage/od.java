package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class od extends pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f29021a;

    public od(byte[] bArr) {
        this.f29021a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof od) {
            return wj1.a(this.f29021a, ((od) peVar).f29021a);
        }
        return false;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(24, this.f29021a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f29021a);
    }

    @Override // defpackage.pe
    public int i() {
        int length = this.f29021a.length;
        return zio.a(length) + 1 + length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }
}
