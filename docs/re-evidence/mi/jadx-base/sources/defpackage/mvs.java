package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class mvs {
    public static String g = uys.a(5) + "-";
    public static long h = 0;
    public static final byte[] i = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dqs f27270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f27271b;
    public byte[] c;
    public String d;
    public int e;
    public final long f;

    public mvs() {
        this.f27271b = (short) 2;
        this.c = i;
        this.d = null;
        this.f = System.currentTimeMillis();
        this.f27270a = new dqs();
        this.e = 1;
    }

    public static synchronized String C() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(g);
        long j = h;
        h = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    @Deprecated
    public static mvs c(fys fysVar, String str) {
        int i2;
        mvs mvsVar = new mvs();
        try {
            i2 = Integer.parseInt(fysVar.m());
        } catch (Exception e) {
            x9s.o("Blob parse chid err " + e.getMessage());
            i2 = 1;
        }
        mvsVar.h(i2);
        mvsVar.k(fysVar.l());
        mvsVar.B(fysVar.q());
        mvsVar.v(fysVar.s());
        mvsVar.l("XMLMSG", null);
        try {
            mvsVar.n(fysVar.f().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                mvsVar.m((short) 3);
            } else {
                mvsVar.m((short) 2);
                mvsVar.l("SECMSG", null);
            }
        } catch (UnsupportedEncodingException e2) {
            x9s.o("Blob setPayload err： " + e2.getMessage());
        }
        return mvsVar;
    }

    public static mvs d(ByteBuffer byteBuffer) throws IOException {
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            short s = byteBufferSlice.getShort(0);
            short s2 = byteBufferSlice.getShort(2);
            int i2 = byteBufferSlice.getInt(4);
            dqs dqsVar = new dqs();
            dqsVar.d(byteBufferSlice.array(), byteBufferSlice.arrayOffset() + 8, s2);
            byte[] bArr = new byte[i2];
            byteBufferSlice.position(s2 + 8);
            byteBufferSlice.get(bArr, 0, i2);
            return new mvs(dqsVar, s, bArr);
        } catch (Exception e) {
            x9s.o("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    public void A(long j) {
        this.f27270a.A(j);
    }

    public void B(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf(gv5.CONNECT_VALUE_STR);
        try {
            long j = Long.parseLong(str.substring(0, iIndexOf));
            int iIndexOf2 = str.indexOf("/", iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 1);
            this.f27270a.m(j);
            this.f27270a.o(strSubstring);
            this.f27270a.u(strSubstring2);
        } catch (Exception e) {
            x9s.o("Blob parse user err " + e.getMessage());
        }
    }

    public String D() {
        String strL = this.f27270a.L();
        if ("ID_NOT_AVAILABLE".equals(strL)) {
            return null;
        }
        if (this.f27270a.R()) {
            return strL;
        }
        String strC = C();
        this.f27270a.K(strC);
        return strC;
    }

    public String E() {
        return this.d;
    }

    public String F() {
        if (!this.f27270a.w()) {
            return null;
        }
        return Long.toString(this.f27270a.j()) + gv5.CONNECT_VALUE_STR + this.f27270a.p() + "/" + this.f27270a.v();
    }

    public int a() {
        return this.f27270a.x();
    }

    public long b() {
        return this.f;
    }

    public String e() {
        return this.f27270a.C();
    }

    public ByteBuffer f(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(x());
        }
        byteBuffer.putShort(this.f27271b);
        byteBuffer.putShort((short) this.f27270a.a());
        byteBuffer.putInt(this.c.length);
        int iPosition = byteBuffer.position();
        this.f27270a.f(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, this.f27270a.a());
        byteBuffer.position(iPosition + this.f27270a.a());
        byteBuffer.put(this.c);
        return byteBuffer;
    }

    public short g() {
        return this.f27271b;
    }

    public void h(int i2) {
        this.f27270a.l(i2);
    }

    public void i(long j) {
        this.f27270a.m(j);
    }

    public void j(long j, String str, String str2) {
        if (j != 0) {
            this.f27270a.m(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f27270a.o(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f27270a.u(str2);
    }

    public void k(String str) {
        this.f27270a.K(str);
    }

    public void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f27270a.B(str);
        this.f27270a.k();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f27270a.G(str2);
    }

    public void m(short s) {
        this.f27271b = s;
    }

    public void n(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f27270a.z(0);
            this.c = bArr;
        } else {
            this.f27270a.z(1);
            this.c = rcs.i(rcs.g(str, D()), bArr);
        }
    }

    public boolean o() {
        return this.f27270a.U();
    }

    public byte[] p() {
        return nvs.a(this, this.c);
    }

    public byte[] q(String str) {
        if (this.f27270a.J() == 1) {
            return nvs.a(this, rcs.i(rcs.g(str, D()), this.c));
        }
        if (this.f27270a.J() == 0) {
            return nvs.a(this, this.c);
        }
        x9s.o("unknow cipher = " + this.f27270a.J());
        return nvs.a(this, this.c);
    }

    public int r() {
        return this.f27270a.N();
    }

    public long s() {
        return this.f27270a.r();
    }

    public String t() {
        return this.f27270a.H();
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + gbs.b(D()) + "; cmd=" + e() + "; type=" + ((int) g()) + "; from=" + F() + " ]";
    }

    public void u(long j) {
        this.f27270a.t(j);
    }

    public void v(String str) {
        this.d = str;
    }

    public boolean w() {
        return this.f27270a.W();
    }

    public int x() {
        return this.f27270a.i() + 8 + this.c.length;
    }

    public long y() {
        return this.f27270a.j();
    }

    public String z() {
        return this.f27270a.P();
    }

    public mvs(dqs dqsVar, short s, byte[] bArr) {
        this.f27271b = (short) 2;
        this.c = i;
        this.d = null;
        this.f = System.currentTimeMillis();
        this.f27270a = dqsVar;
        this.f27271b = s;
        this.c = bArr;
        this.e = 2;
    }
}
