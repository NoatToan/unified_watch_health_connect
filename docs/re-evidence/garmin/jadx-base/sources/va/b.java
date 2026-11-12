package va;

import yb.h;
import yb.i;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f176553n;

    public b(String str, n nVar) {
        super(str);
        this.f176553n = nVar;
    }

    @Override // yb.h
    public final i k(int i14, byte[] bArr, boolean z14) {
        n nVar = this.f176553n;
        if (z14) {
            nVar.reset();
        }
        return nVar.b(0, i14, bArr);
    }
}
