package defpackage;

import android.os.Build;
import com.xiaomi.push.g;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes11.dex */
public class svs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f34044a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f34045b = ByteBuffer.allocate(4);
    public Adler32 c = new Adler32();
    public zvs d;
    public OutputStream e;
    public int f;
    public int g;
    public byte[] h;

    public svs(OutputStream outputStream, zvs zvsVar) {
        this.e = new BufferedOutputStream(outputStream);
        this.d = zvsVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f = timeZone.getRawOffset() / 3600000;
        this.g = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(mvs mvsVar) {
        int iX = mvsVar.x();
        if (iX > 32768) {
            x9s.o("Blob size=" + iX + " should be less than 32768 Drop blob chid=" + mvsVar.a() + " id=" + mvsVar.D());
            return 0;
        }
        this.f34044a.clear();
        int i = iX + 12;
        if (i > this.f34044a.capacity() || this.f34044a.capacity() > 4096) {
            this.f34044a = ByteBuffer.allocate(i);
        }
        this.f34044a.putShort((short) -15618);
        this.f34044a.putShort((short) 5);
        this.f34044a.putInt(iX);
        int iPosition = this.f34044a.position();
        this.f34044a = mvsVar.f(this.f34044a);
        if (!"CONN".equals(mvsVar.e())) {
            if (this.h == null) {
                this.h = this.d.X();
            }
            rcs.j(this.h, this.f34044a.array(), true, iPosition, iX);
        }
        this.c.reset();
        this.c.update(this.f34044a.array(), 0, this.f34044a.position());
        this.f34045b.putInt(0, (int) this.c.getValue());
        this.e.write(this.f34044a.array(), 0, this.f34044a.position());
        this.e.write(this.f34045b.array(), 0, 4);
        this.e.flush();
        int iPosition2 = this.f34044a.position() + 4;
        x9s.B("[Slim] Wrote {cmd=" + mvsVar.e() + ";chid=" + mvsVar.a() + ";len=" + iPosition2 + "}");
        return iPosition2;
    }

    public void b() {
        iqs iqsVar = new iqs();
        iqsVar.l(106);
        String str = Build.MODEL;
        iqsVar.p(str);
        iqsVar.v(odt.d());
        iqsVar.A(rds.g());
        iqsVar.t(48);
        iqsVar.F(this.d.t());
        iqsVar.J(this.d.d());
        iqsVar.N(Locale.getDefault().toString());
        int i = Build.VERSION.SDK_INT;
        iqsVar.z(i);
        iqsVar.E(g.b(this.d.F(), "com.xiaomi.xmsf"));
        byte[] bArrG = this.d.c().g();
        if (bArrG != null) {
            iqsVar.o(fqs.m(bArrG));
        }
        mvs mvsVar = new mvs();
        mvsVar.h(0);
        mvsVar.l("CONN", null);
        mvsVar.j(0L, "xiaomi.com", null);
        mvsVar.n(iqsVar.h(), null);
        a(mvsVar);
        x9s.o("[slim] open conn: andver=" + i + " sdk=48 tz=" + this.f + ":" + this.g + " Model=" + str + " os=" + Build.VERSION.INCREMENTAL);
    }

    public void c() throws IOException {
        mvs mvsVar = new mvs();
        mvsVar.l("CLOSE", null);
        a(mvsVar);
        this.e.close();
    }
}
