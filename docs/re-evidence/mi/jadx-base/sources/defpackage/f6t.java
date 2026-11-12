package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ik;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class f6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17476b;
    public String c;
    public String d;
    public String e;

    public f6t(Context context, String str, String str2, String str3) throws ik {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new ik("无效的参数 - IllegalArgumentException");
        }
        this.f17475a = context.getApplicationContext();
        this.c = str;
        this.d = str2;
        this.f17476b = str3;
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public final void a(String str) throws ik {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new ik("无效的参数 - IllegalArgumentException");
        }
        this.e = str;
    }

    public final byte[] b() {
        int iCurrentTimeMillis = 0;
        byte[] byteArray = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    p0t.k(byteArrayOutputStream2, this.c);
                    p0t.k(byteArrayOutputStream2, this.d);
                    p0t.k(byteArrayOutputStream2, this.f17476b);
                    p0t.k(byteArrayOutputStream2, String.valueOf(h0t.K(this.f17475a)));
                    try {
                        iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    } catch (Throwable unused) {
                    }
                    byteArrayOutputStream2.write(c(iCurrentTimeMillis));
                    byteArrayOutputStream2.write(d(this.e));
                    byteArrayOutputStream2.write(p0t.n(this.e));
                    byteArray = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        m2t.r(th, "se", "tds");
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return byteArray;
                    } catch (Throwable th2) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        return byteArray;
    }

    public final byte[] d(String str) {
        byte[] bArrN;
        if (!TextUtils.isEmpty(str) && (bArrN = p0t.n(this.e)) != null) {
            return p0t.m(bArrN.length);
        }
        return new byte[]{0, 0};
    }
}
