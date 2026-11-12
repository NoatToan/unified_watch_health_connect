package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.push.service.bh;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes22.dex */
public class bl {
    public ByteBuffer a = ByteBuffer.allocate(2048);
    private ByteBuffer b = ByteBuffer.allocate(4);
    private Adler32 c = new Adler32();
    private bp d;
    private OutputStream e;
    private int f;
    private int g;
    private byte[] h;

    public bl(OutputStream outputStream, bp bpVar) {
        this.e = new BufferedOutputStream(outputStream);
        this.d = bpVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f = timeZone.getRawOffset() / 3600000;
        this.g = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(bi biVar) {
        int iC = biVar.c();
        if (iC > 32768) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Blob size=" + iC + " should be less than 32768 Drop blob chid=" + biVar.a() + " id=" + biVar.e());
            return 0;
        }
        this.a.clear();
        int i = iC + 8 + 4;
        if (i > this.a.capacity() || this.a.capacity() > 4096) {
            this.a = ByteBuffer.allocate(i);
        }
        this.a.putShort((short) -15618);
        this.a.putShort((short) 5);
        this.a.putInt(iC);
        int iPosition = this.a.position();
        this.a = biVar.c(this.a);
        if (!"CONN".equals(biVar.m3595a())) {
            if (this.h == null) {
                this.h = this.d.k();
            }
            bh.a(this.h, this.a.array(), true, iPosition, iC);
        }
        this.c.reset();
        this.c.update(this.a.array(), 0, this.a.position());
        this.b.putInt(0, (int) this.c.getValue());
        this.e.write(this.a.array(), 0, this.a.position());
        this.e.write(this.b.array(), 0, 4);
        this.e.flush();
        int iPosition2 = this.a.position() + 4;
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] Wrote {cmd=" + biVar.m3595a() + ";chid=" + biVar.a() + ";len=" + iPosition2 + com.alipay.sdk.m.u.i.d);
        return iPosition2;
    }

    public void a() {
        au.e eVar = new au.e();
        eVar.a(106);
        eVar.c(com.xiaomi.push.service.bn.m3832a());
        eVar.b(48);
        eVar.d(this.d.b());
        int i = Build.VERSION.SDK_INT;
        eVar.c(i);
        byte[] bArrMo3613a = this.d.m3605a().mo3613a();
        if (bArrMo3613a != null) {
            eVar.a(au.b.a(bArrMo3613a));
        }
        bi biVar = new bi();
        biVar.a(0);
        biVar.a("CONN", (String) null);
        biVar.a(0L, "xiaomi.com", null);
        biVar.a(eVar.m3755a(), (String) null);
        a(biVar);
        com.xiaomi.channel.commonutils.logger.b.m3434a("[slim] open conn: andver=" + i + " sdk=48 tz=" + this.f + ":" + this.g + " Model=" + Build.MODEL);
    }

    public void b() throws IOException {
        bi biVar = new bi();
        biVar.a("CLOSE", (String) null);
        a(biVar);
        this.e.close();
    }
}
