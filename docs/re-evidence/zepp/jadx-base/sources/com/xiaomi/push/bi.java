package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.bh;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public class bi {
    private static String f = cu.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    private static long g = 0;
    private static final byte[] h = new byte[0];
    private au.a a;
    private short b;
    private byte[] c;
    public String d;
    public int e;

    public bi() {
        this.b = (short) 2;
        this.c = h;
        this.d = null;
        this.a = new au.a();
        this.e = 1;
    }

    public bi(au.a aVar, short s, byte[] bArr) {
        this.b = (short) 2;
        this.c = h;
        this.d = null;
        this.a = aVar;
        this.b = s;
        this.c = bArr;
        this.e = 2;
    }

    @Deprecated
    public static bi a(cj cjVar, String str) {
        int i;
        bi biVar = new bi();
        try {
            i = Integer.parseInt(cjVar.k());
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        biVar.a(i);
        biVar.a(cjVar.j());
        biVar.c(cjVar.m());
        biVar.b(cjVar.n());
        biVar.a("XMLMSG", (String) null);
        try {
            biVar.a(cjVar.mo3639a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                biVar.a((short) 3);
            } else {
                biVar.a((short) 2);
                biVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Blob setPayload err： " + e2.getMessage());
        }
        return biVar;
    }

    public static bi b(ByteBuffer byteBuffer) throws IOException {
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            short s = byteBufferSlice.getShort(0);
            short s2 = byteBufferSlice.getShort(2);
            int i = byteBufferSlice.getInt(4);
            au.a aVar = new au.a();
            aVar.a(byteBufferSlice.array(), byteBufferSlice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            byteBufferSlice.position(s2 + 8);
            byteBufferSlice.get(bArr, 0, i);
            return new bi(aVar, s, bArr);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    public static synchronized String d() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(f);
        long j = g;
        g = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    public int a() {
        return this.a.c();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3595a() {
        return this.a.m3517c();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public short m3596a() {
        return this.b;
    }

    public void a(int i) {
        this.a.a(i);
    }

    public void a(long j, String str, String str2) {
        if (j != 0) {
            this.a.a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.a.a(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.b(str2);
    }

    public void a(String str) {
        this.a.e(str);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.a.c(str);
        this.a.m3512a();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.d(str2);
    }

    public void a(short s) {
        this.b = s;
    }

    public void a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            this.a.c(0);
            this.c = bArr;
        } else {
            this.a.c(1);
            this.c = bh.a(bh.a(str, e()), bArr);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3597a() {
        return this.a.j();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m3598a() {
        return e0.a(this, this.c);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m3599a(String str) {
        if (this.a.e() == 1) {
            return e0.a(this, bh.a(bh.a(str, e()), this.c));
        }
        if (this.a.e() == 0) {
            return e0.a(this, this.c);
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("unknow cipher = " + this.a.e());
        return e0.a(this, this.c);
    }

    public int b() {
        return this.a.f();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m3600b() {
        return this.a.m3519d();
    }

    public void b(String str) {
        this.d = str;
    }

    public int c() {
        return this.a.b() + 8 + this.c.length;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public String m3601c() {
        return this.a.m3523f();
    }

    public ByteBuffer c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.b);
        byteBuffer.putShort((short) this.a.a());
        byteBuffer.putInt(this.c.length);
        int iPosition = byteBuffer.position();
        this.a.m3754a(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, this.a.a());
        byteBuffer.position(iPosition + this.a.a());
        byteBuffer.put(this.c);
        return byteBuffer;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("@");
        try {
            long j = Long.parseLong(str.substring(0, iIndexOf));
            int iIndexOf2 = str.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 1);
            this.a.a(j);
            this.a.a(strSubstring);
            this.a.b(strSubstring2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Blob parse user err " + e.getMessage());
        }
    }

    public String e() {
        String strM3521e = this.a.m3521e();
        if ("ID_NOT_AVAILABLE".equals(strM3521e)) {
            return null;
        }
        if (this.a.g()) {
            return strM3521e;
        }
        String strD = d();
        this.a.e(strD);
        return strD;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        if (!this.a.m3516b()) {
            return null;
        }
        return Long.toString(this.a.m3511a()) + "@" + this.a.m3513a() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.a.m3515b();
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + com.xiaomi.push.service.aw.a(e()) + "; cmd=" + m3595a() + "; type=" + ((int) m3596a()) + "; from=" + g() + " ]";
    }
}
