package defpackage;

import android.text.TextUtils;
import com.xiaomi.push.service.bg;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes11.dex */
public class qvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f31896a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f31897b = ByteBuffer.allocate(4);
    public Adler32 c = new Adler32();
    public xvs d = new xvs();
    public InputStream e;
    public zvs f;
    public volatile boolean g;
    public byte[] h;

    public qvs(InputStream inputStream, zvs zvsVar) {
        this.e = new BufferedInputStream(inputStream);
        this.f = zvsVar;
    }

    public mvs a() throws IOException {
        int iPosition;
        try {
            ByteBuffer byteBufferB = b();
            iPosition = byteBufferB.position();
            try {
                byteBufferB.flip();
                byteBufferB.position(8);
                mvs yvsVar = iPosition == 8 ? new yvs() : mvs.d(byteBufferB.slice());
                x9s.B("[Slim] Read {cmd=" + yvsVar.e() + ";chid=" + yvsVar.a() + ";len=" + iPosition + "}");
                return yvsVar;
            } catch (IOException e) {
                e = e;
                if (iPosition == 0) {
                    iPosition = this.f31896a.position();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[Slim] read Blob [");
                byte[] bArrArray = this.f31896a.array();
                if (iPosition > 128) {
                    iPosition = 128;
                }
                sb.append(s4s.a(bArrArray, 0, iPosition));
                sb.append("] Err:");
                sb.append(e.getMessage());
                x9s.o(sb.toString());
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            iPosition = 0;
        }
    }

    public final ByteBuffer b() throws IOException {
        this.f31896a.clear();
        d(this.f31896a, 8);
        short s = this.f31896a.getShort(0);
        short s2 = this.f31896a.getShort(2);
        if (s != -15618 || s2 != 5) {
            throw new IOException("Malformed Input");
        }
        int i = this.f31896a.getInt(4);
        int iPosition = this.f31896a.position();
        if (i > 32768) {
            throw new IOException("Blob size too large");
        }
        if (i + 4 > this.f31896a.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 2048);
            byteBufferAllocate.put(this.f31896a.array(), 0, this.f31896a.arrayOffset() + this.f31896a.position());
            this.f31896a = byteBufferAllocate;
        } else if (this.f31896a.capacity() > 4096 && i < 2048) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.put(this.f31896a.array(), 0, this.f31896a.arrayOffset() + this.f31896a.position());
            this.f31896a = byteBufferAllocate2;
        }
        d(this.f31896a, i);
        this.f31897b.clear();
        d(this.f31897b, 4);
        this.f31897b.position(0);
        int i2 = this.f31897b.getInt();
        this.c.reset();
        this.c.update(this.f31896a.array(), 0, this.f31896a.position());
        if (i2 == ((int) this.c.getValue())) {
            byte[] bArr = this.h;
            if (bArr != null) {
                rcs.j(bArr, this.f31896a.array(), true, iPosition, i);
            }
            return this.f31896a;
        }
        x9s.o("CRC = " + ((int) this.c.getValue()) + " and " + i2);
        throw new IOException("Corrupted Blob bad CRC");
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

    public final void d(ByteBuffer byteBuffer, int i) throws IOException {
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

    public void e() {
        this.g = true;
    }

    public final void f() throws IOException {
        boolean z = false;
        this.g = false;
        mvs mvsVarA = a();
        if ("CONN".equals(mvsVarA.e())) {
            jqs jqsVarN = jqs.n(mvsVarA.p());
            if (jqsVarN.p()) {
                this.f.n(jqsVarN.o());
                z = true;
            }
            if (jqsVarN.t()) {
                fqs fqsVarJ = jqsVarN.j();
                mvs mvsVar = new mvs();
                mvsVar.l("SYNC", "CONF");
                mvsVar.n(fqsVarJ.h(), null);
                this.f.W(mvsVar);
            }
            x9s.o("[Slim] CONN: host = " + jqsVarN.r());
            if (z) {
                this.h = this.f.X();
                while (!this.g) {
                    mvs mvsVarA2 = a();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f.C();
                    short sG = mvsVarA2.g();
                    if (sG == 1) {
                        this.f.W(mvsVarA2);
                    } else if (sG != 2) {
                        if (sG != 3) {
                            x9s.o("[Slim] unknow blob type " + ((int) mvsVarA2.g()));
                        } else {
                            try {
                                this.f.Y(this.d.a(mvsVarA2.p(), this.f));
                            } catch (Exception e) {
                                x9s.o("[Slim] Parse packet from Blob chid=" + mvsVarA2.a() + "; Id=" + mvsVarA2.D() + " failure:" + e.getMessage());
                            }
                        }
                    } else if ("SECMSG".equals(mvsVarA2.e()) && ((mvsVarA2.a() == 2 || mvsVarA2.a() == 3) && TextUtils.isEmpty(mvsVarA2.t()))) {
                        try {
                            fys fysVarA = this.d.a(mvsVarA2.q(bg.c().b(Integer.valueOf(mvsVarA2.a()).toString(), mvsVarA2.F()).i), this.f);
                            fysVarA.j = jCurrentTimeMillis;
                            this.f.Y(fysVarA);
                        } catch (Exception e2) {
                            x9s.o("[Slim] Parse packet from Blob chid=" + mvsVarA2.a() + "; Id=" + mvsVarA2.D() + " failure:" + e2.getMessage());
                        }
                    } else {
                        this.f.W(mvsVarA2);
                    }
                }
                return;
            }
        }
        x9s.o("[Slim] Invalid CONN");
        throw new IOException("Invalid Connection");
    }
}
