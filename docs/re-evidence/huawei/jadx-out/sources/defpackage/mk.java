package defpackage;

import com.alipay.sdk.m.j.b;

/* JADX INFO: loaded from: classes4.dex */
public final class mk extends b {
    public final String i;

    public mk(String str) {
        this.i = str;
    }

    @Override // com.alipay.sdk.m.j.b
    public void a() throws Exception {
        this.f2105a = (byte) 1;
        byte[] bytes = this.i.getBytes("UTF-8");
        this.f2107c = bytes;
        this.f2106b = (byte) bytes.length;
    }
}
