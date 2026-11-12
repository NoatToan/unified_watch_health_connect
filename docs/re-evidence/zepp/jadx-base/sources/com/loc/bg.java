package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class bg extends bj {
    private StringBuilder a;
    private boolean b;

    public bg() {
        this.a = new StringBuilder();
        this.b = true;
    }

    public bg(bj bjVar) {
        super(bjVar);
        this.a = new StringBuilder();
        this.b = true;
    }

    @Override // com.loc.bj
    public final byte[] a(byte[] bArr) {
        byte[] bArrA = u.a(this.a.toString());
        this.d = bArrA;
        this.b = true;
        StringBuilder sb = this.a;
        sb.delete(0, sb.length());
        return bArrA;
    }

    @Override // com.loc.bj
    public final void b(byte[] bArr) {
        String strA = u.a(bArr);
        if (this.b) {
            this.b = false;
        } else {
            this.a.append(",");
        }
        StringBuilder sb = this.a;
        sb.append("{\"log\":\"");
        sb.append(strA);
        sb.append("\"}");
    }
}
