package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3057c;
    private String d;
    private String e;

    public li(Context context, String str, String str2, String str3) throws ik {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new ik("无效的参数 - IllegalArgumentException");
        }
        this.f3055a = context.getApplicationContext();
        this.f3057c = str;
        this.d = str2;
        this.f3056b = str3;
    }

    public final void a(String str) throws ik {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new ik("无效的参数 - IllegalArgumentException");
        }
        this.e = str;
    }

    private static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    private byte[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[]{0, 0};
        }
        byte[] bArrA = iy.a(this.e);
        if (bArrA == null) {
            return new byte[]{0, 0};
        }
        return iy.a(bArrA.length);
    }

    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream;
        int iCurrentTimeMillis = 0;
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                iy.a(byteArrayOutputStream, this.f3057c);
                iy.a(byteArrayOutputStream, this.d);
                iy.a(byteArrayOutputStream, this.f3056b);
                iy.a(byteArrayOutputStream, String.valueOf(ip.j(this.f3055a)));
                try {
                    iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                } catch (Throwable unused) {
                }
                byteArrayOutputStream.write(a(iCurrentTimeMillis));
                byteArrayOutputStream.write(b(this.e));
                byteArrayOutputStream.write(iy.a(this.e));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                try {
                    jv.c(th, "se", "tds");
                    return byteArray;
                } finally {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }
}
