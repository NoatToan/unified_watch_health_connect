package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class vf5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f36838a;

    public vf5(char[] cArr) {
        this.f36838a = cArr;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof vf5) {
            return vj1.b(this.f36838a, ((vf5) reVar).f36838a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return new String(this.f36838a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.c(30);
        keVar.i(this.f36838a.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.f36838a;
            if (i == cArr.length) {
                return;
            }
            char c = cArr[i];
            keVar.c((byte) (c >> '\b'));
            keVar.c((byte) c);
            i++;
        }
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.r(this.f36838a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f36838a.length * 2) + 1 + (this.f36838a.length * 2);
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
