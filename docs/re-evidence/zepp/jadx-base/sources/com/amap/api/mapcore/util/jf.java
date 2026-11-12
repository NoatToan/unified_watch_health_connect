package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class jf extends ji {
    private StringBuilder a;
    private boolean b;

    public jf() {
        this.a = new StringBuilder();
        this.b = true;
    }

    @Override // com.amap.api.mapcore.util.ji
    public final byte[] a(byte[] bArr) {
        byte[] bArrA = gu.a(this.a.toString());
        this.d = bArrA;
        this.b = true;
        StringBuilder sb = this.a;
        sb.delete(0, sb.length());
        return bArrA;
    }

    @Override // com.amap.api.mapcore.util.ji
    public final void b(byte[] bArr) {
        String strA = gu.a(bArr);
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

    public jf(ji jiVar) {
        super(jiVar);
        this.a = new StringBuilder();
        this.b = true;
    }
}
