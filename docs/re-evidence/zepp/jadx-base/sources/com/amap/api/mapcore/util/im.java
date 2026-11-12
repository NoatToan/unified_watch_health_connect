package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public class im {
    private io a;
    private ir b;
    private long c;
    private long d;

    public interface a {
        void onDownload(byte[] bArr, long j);

        void onException(Throwable th);

        void onFinish();

        void onStop();
    }

    public im(ir irVar) {
        this(irVar, (byte) 0);
    }

    public final void a(a aVar) {
        try {
            io ioVar = new io();
            this.a = ioVar;
            ioVar.b(this.d);
            this.a.a(this.c);
            ik.a();
            if (ik.c(this.b)) {
                this.b.setDegradeType(ir.b.NEVER_GRADE);
                this.a.a(this.b, aVar);
            } else {
                this.b.setDegradeType(ir.b.DEGRADE_ONLY);
                this.a.a(this.b, aVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private im(ir irVar, byte b) {
        this(irVar, 0L, -1L, false);
    }

    public im(ir irVar, long j, long j2, boolean z) {
        this.b = irVar;
        this.c = j;
        this.d = j2;
        irVar.setHttpProtocol(z ? ir.c.HTTPS : ir.c.HTTP);
        this.b.setDegradeAbility(ir.a.SINGLE);
    }

    public final void a() {
        io ioVar = this.a;
        if (ioVar != null) {
            ioVar.a();
        }
    }
}
