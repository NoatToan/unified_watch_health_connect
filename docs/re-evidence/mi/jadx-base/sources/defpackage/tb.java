package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tb extends pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34528b;
    public final byte[] c;

    public tb(boolean z, int i, byte[] bArr) {
        this.f34527a = z;
        this.f34528b = i;
        this.c = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (!(peVar instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) peVar;
        return this.f34527a == tbVar.f34527a && this.f34528b == tbVar.f34528b && wj1.a(this.c, tbVar.c);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.f(this.f34527a ? 96 : 64, this.f34528b, this.c);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        boolean z = this.f34527a;
        return ((z ? 1 : 0) ^ this.f34528b) ^ wj1.k(this.c);
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        return zio.b(this.f34528b) + zio.a(this.c.length) + this.c.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return this.f34527a;
    }
}
