package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public class ei {
    private final ep a;
    private final ex b;

    public ei() {
        this(new el.a());
    }

    public ei(er erVar) {
        ex exVar = new ex();
        this.b = exVar;
        this.a = erVar.a(exVar);
    }

    public void a(ef efVar, byte[] bArr) {
        try {
            this.b.a(bArr);
            efVar.a(this.a);
        } finally {
            this.a.k();
        }
    }
}
