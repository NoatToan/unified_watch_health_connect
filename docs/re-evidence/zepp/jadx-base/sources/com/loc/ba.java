package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes18.dex */
public final class ba {
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;

    public ba(Context context, String str, String str2, String str3) throws j {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new j(AMapException.ERROR_INVALID_PARAMETER);
        }
        this.a = context.getApplicationContext();
        this.c = str;
        this.d = str2;
        this.b = str3;
    }

    public final void a(String str) throws j {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new j(AMapException.ERROR_INVALID_PARAMETER);
        }
        this.e = str;
    }

    public final byte[] a() {
        int iCurrentTimeMillis;
        byte[] bArrA;
        byte[] byteArray = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    u.a(byteArrayOutputStream2, this.c);
                    u.a(byteArrayOutputStream2, this.d);
                    u.a(byteArrayOutputStream2, this.b);
                    u.a(byteArrayOutputStream2, String.valueOf(n.q(this.a)));
                    try {
                        iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    } catch (Throwable unused) {
                        iCurrentTimeMillis = 0;
                    }
                    byteArrayOutputStream2.write(new byte[]{(byte) ((iCurrentTimeMillis >> 24) & 255), (byte) ((iCurrentTimeMillis >> 16) & 255), (byte) ((iCurrentTimeMillis >> 8) & 255), (byte) (iCurrentTimeMillis & 255)});
                    byte[] bArrA2 = (TextUtils.isEmpty(this.e) || (bArrA = u.a(this.e)) == null) ? new byte[]{0, 0} : u.a(bArrA.length);
                    byteArrayOutputStream2.write(bArrA2);
                    byteArrayOutputStream2.write(u.a(this.e));
                    byteArray = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        ab.b(th, com.twitter.sdk.android.core.internal.scribe.b.b, "tds");
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
}
