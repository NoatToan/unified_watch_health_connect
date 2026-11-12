package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public final class lo extends lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f3068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3069b;

    public lo() {
        this.f3068a = new StringBuilder();
        this.f3069b = true;
    }

    public lo(lr lrVar) {
        super(lrVar);
        this.f3068a = new StringBuilder();
        this.f3069b = true;
    }

    @Override // com.amap.api.col.p0003sl.lr
    protected final byte[] a(byte[] bArr) {
        byte[] bArrA = iy.a(this.f3068a.toString());
        this.d = bArrA;
        this.f3069b = true;
        StringBuilder sb = this.f3068a;
        sb.delete(0, sb.length());
        return bArrA;
    }

    @Override // com.amap.api.col.p0003sl.lr
    public final void b(byte[] bArr) {
        String strA = iy.a(bArr);
        if (this.f3069b) {
            this.f3069b = false;
        } else {
            this.f3068a.append(",");
        }
        StringBuilder sb = this.f3068a;
        sb.append("{\"log\":\"");
        sb.append(strA);
        sb.append("\"}");
    }
}
