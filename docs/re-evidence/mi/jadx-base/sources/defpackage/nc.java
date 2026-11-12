package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nc extends re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27764b;
    public final byte[] c;

    public nc(boolean z, int i, byte[] bArr) {
        this.f27763a = z;
        this.f27764b = i;
        this.c = vj1.e(bArr);
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (!(reVar instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) reVar;
        return this.f27763a == ncVar.f27763a && this.f27764b == ncVar.f27764b && vj1.a(this.c, ncVar.c);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.f(this.f27763a ? 96 : 64, this.f27764b, this.c);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        boolean z = this.f27763a;
        return ((z ? 1 : 0) ^ this.f27764b) ^ vj1.q(this.c);
    }

    @Override // defpackage.re
    public int i() throws IOException {
        return yio.b(this.f27764b) + yio.a(this.c.length) + this.c.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return this.f27763a;
    }

    public int o() {
        return this.f27764b;
    }
}
