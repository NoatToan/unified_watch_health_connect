package com.xiaomi.push;

import android.text.TextUtils;
import com.huami.nfc.applet.EntityKt;
import com.xiaomi.push.service.bh;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes22.dex */
class f0 {
    private ByteBuffer a = ByteBuffer.allocate(2048);
    private ByteBuffer b = ByteBuffer.allocate(4);
    private Adler32 c = new Adler32();
    private bn d = new bn();
    private InputStream e;
    private bp f;
    private volatile boolean g;
    private byte[] h;

    public f0(InputStream inputStream, bp bpVar) {
        this.e = new BufferedInputStream(inputStream);
        this.f = bpVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00be  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x00cf, please report this as an issue */
    private ByteBuffer b() throws IOException {
        ByteBuffer byteBufferAllocate;
        int i;
        byte[] bArr;
        this.a.clear();
        d(this.a, 8);
        short s = this.a.getShort(0);
        short s2 = this.a.getShort(2);
        if (s != -15618 || s2 != 5) {
            throw new IOException("Malformed Input");
        }
        int i2 = this.a.getInt(4);
        int iPosition = this.a.position();
        if (i2 > 32768) {
            throw new IOException("Blob size too large");
        }
        if (i2 + 4 <= this.a.remaining()) {
            if (this.a.capacity() > 4096 && i2 < 2048) {
                byteBufferAllocate = ByteBuffer.allocate(2048);
                byteBufferAllocate.put(this.a.array(), 0, this.a.arrayOffset() + this.a.position());
            }
            d(this.a, i2);
            this.b.clear();
            d(this.b, 4);
            this.b.position(0);
            i = this.b.getInt();
            this.c.reset();
            this.c.update(this.a.array(), 0, this.a.position());
            if (i == ((int) this.c.getValue())) {
                bArr = this.h;
                if (bArr != null) {
                    bh.a(bArr, this.a.array(), true, iPosition, i2);
                }
                return this.a;
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("CRC = " + ((int) this.c.getValue()) + " and " + i);
            throw new IOException("Corrupted Blob bad CRC");
        }
        byteBufferAllocate = ByteBuffer.allocate(i2 + 2048);
        byteBufferAllocate.put(this.a.array(), 0, this.a.arrayOffset() + this.a.position());
        this.a = byteBufferAllocate;
        d(this.a, i2);
        this.b.clear();
        d(this.b, 4);
        this.b.position(0);
        i = this.b.getInt();
        this.c.reset();
        this.c.update(this.a.array(), 0, this.a.position());
        if (i == ((int) this.c.getValue())) {
            bArr = this.h;
            if (bArr != null) {
                bh.a(bArr, this.a.array(), true, iPosition, i2);
            }
            return this.a;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("CRC = " + ((int) this.c.getValue()) + " and " + i);
        throw new IOException("Corrupted Blob bad CRC");
    }

    private void d(ByteBuffer byteBuffer, int i) throws IOException {
        int iPosition = byteBuffer.position();
        do {
            int i2 = this.e.read(byteBuffer.array(), iPosition, i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i -= i2;
            iPosition += i2;
        } while (i > 0);
        byteBuffer.position(iPosition);
    }

    private void f() throws IOException {
        String string;
        StringBuilder sb;
        boolean z = false;
        this.g = false;
        bi biVarA = a();
        if ("CONN".equals(biVarA.m3595a())) {
            au.f fVarA = au.f.a(biVarA.m3598a());
            if (fVarA.m3557a()) {
                this.f.a(fVarA.m3556a());
                z = true;
            }
            if (fVarA.c()) {
                au.b bVarM3555a = fVarA.m3555a();
                bi biVar = new bi();
                biVar.a(EntityKt.FETCH_APDU_MODE_SYNC, "CONF");
                biVar.a(bVarM3555a.m3755a(), (String) null);
                this.f.j(biVar);
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("[Slim] CONN: host = " + fVarA.m3558b());
        }
        if (!z) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("[Slim] Invalid CONN");
            throw new IOException("Invalid Connection");
        }
        this.h = this.f.k();
        while (!this.g) {
            bi biVarA2 = a();
            this.f.c();
            short sM3596a = biVarA2.m3596a();
            if (sM3596a != 1) {
                if (sM3596a != 2) {
                    if (sM3596a != 3) {
                        string = "[Slim] unknow blob type " + ((int) biVarA2.m3596a());
                        com.xiaomi.channel.commonutils.logger.b.m3434a(string);
                    } else {
                        try {
                            this.f.l(this.d.a(biVarA2.m3598a(), this.f));
                        } catch (Exception e) {
                            e = e;
                            sb = new StringBuilder();
                            sb.append("[Slim] Parse packet from Blob chid=");
                            sb.append(biVarA2.a());
                            sb.append("; Id=");
                            sb.append(biVarA2.e());
                            sb.append(" failure:");
                            sb.append(e.getMessage());
                            string = sb.toString();
                            com.xiaomi.channel.commonutils.logger.b.m3434a(string);
                        }
                    }
                } else if ("SECMSG".equals(biVarA2.m3595a()) && ((biVarA2.a() == 2 || biVarA2.a() == 3) && TextUtils.isEmpty(biVarA2.m3600b()))) {
                    try {
                        this.f.l(this.d.a(biVarA2.m3599a(com.xiaomi.push.service.az.a().a(Integer.valueOf(biVarA2.a()).toString(), biVarA2.g()).h), this.f));
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("[Slim] Parse packet from Blob chid=");
                        sb.append(biVarA2.a());
                        sb.append("; Id=");
                        sb.append(biVarA2.e());
                        sb.append(" failure:");
                        sb.append(e.getMessage());
                        string = sb.toString();
                        com.xiaomi.channel.commonutils.logger.b.m3434a(string);
                    }
                }
            }
            this.f.j(biVarA2);
        }
    }

    public bi a() throws IOException {
        int iPosition;
        try {
            ByteBuffer byteBufferB = b();
            iPosition = byteBufferB.position();
            try {
                byteBufferB.flip();
                byteBufferB.position(8);
                bi boVar = iPosition == 8 ? new bo() : bi.b(byteBufferB.slice());
                com.xiaomi.channel.commonutils.logger.b.c("[Slim] Read {cmd=" + boVar.m3595a() + ";chid=" + boVar.a() + ";len=" + iPosition + com.alipay.sdk.m.u.i.d);
                return boVar;
            } catch (IOException e) {
                e = e;
                if (iPosition == 0) {
                    iPosition = this.a.position();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[Slim] read Blob [");
                byte[] bArrArray = this.a.array();
                if (iPosition > 128) {
                    iPosition = 128;
                }
                sb.append(m.a(bArrArray, 0, iPosition));
                sb.append("] Err:");
                sb.append(e.getMessage());
                com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            iPosition = 0;
        }
    }

    public void c() throws IOException {
        try {
            f();
        } catch (IOException e) {
            if (!this.g) {
                throw e;
            }
        }
    }

    public void e() {
        this.g = true;
    }
}
