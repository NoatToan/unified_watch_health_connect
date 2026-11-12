package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class iz {
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;

    public iz(Context context, String str, String str2, String str3) throws gi {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new gi(AMapException.ERROR_INVALID_PARAMETER);
        }
        this.a = context.getApplicationContext();
        this.c = str;
        this.d = str2;
        this.b = str3;
    }

    public final void a(String str) throws gi {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new gi(AMapException.ERROR_INVALID_PARAMETER);
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
                    gu.a(byteArrayOutputStream2, this.c);
                    gu.a(byteArrayOutputStream2, this.d);
                    gu.a(byteArrayOutputStream2, this.b);
                    gu.a(byteArrayOutputStream2, String.valueOf(gn.p(this.a)));
                    try {
                        iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    } catch (Throwable unused) {
                        iCurrentTimeMillis = 0;
                    }
                    byteArrayOutputStream2.write(new byte[]{(byte) ((iCurrentTimeMillis >> 24) & 255), (byte) ((iCurrentTimeMillis >> 16) & 255), (byte) ((iCurrentTimeMillis >> 8) & 255), (byte) (iCurrentTimeMillis & 255)});
                    byte[] bArrA2 = (TextUtils.isEmpty(this.e) || (bArrA = gu.a(this.e)) == null) ? new byte[]{0, 0} : gu.a(bArrA.length);
                    byteArrayOutputStream2.write(bArrA2);
                    byteArrayOutputStream2.write(gu.a(this.e));
                    byteArray = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        hn.c(th, com.twitter.sdk.android.core.internal.scribe.b.b, "tds");
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
