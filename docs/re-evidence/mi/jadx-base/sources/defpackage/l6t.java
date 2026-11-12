package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class l6t extends o6t {
    public StringBuilder c;
    public boolean d;

    public l6t(o6t o6tVar) {
        super(o6tVar);
        this.c = new StringBuilder();
        this.d = true;
    }

    @Override // defpackage.o6t
    public final byte[] b(byte[] bArr) {
        byte[] bArrN = p0t.n(this.c.toString());
        this.f28806b = bArrN;
        this.d = true;
        StringBuilder sb = this.c;
        sb.delete(0, sb.length());
        return bArrN;
    }

    @Override // defpackage.o6t
    public final void c(byte[] bArr) {
        String strG = p0t.g(bArr);
        if (this.d) {
            this.d = false;
        } else {
            this.c.append(",");
        }
        StringBuilder sb = this.c;
        sb.append("{\"log\":\"");
        sb.append(strG);
        sb.append("\"}");
    }
}
