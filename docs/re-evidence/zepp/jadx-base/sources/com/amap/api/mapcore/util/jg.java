package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class jg extends ji {
    public static int a = 13;
    public static int b = 6;
    private Context e;

    public jg(Context context, ji jiVar) {
        super(jiVar);
        this.e = context;
    }

    @Override // com.amap.api.mapcore.util.ji
    public final byte[] a(byte[] bArr) {
        byte[] bArrA = a(this.e);
        byte[] bArr2 = new byte[bArrA.length + bArr.length];
        System.arraycopy(bArrA, 0, bArr2, 0, bArrA.length);
        System.arraycopy(bArr, 0, bArr2, bArrA.length, bArr.length);
        return bArr2;
    }

    private static byte[] a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = new byte[0];
        try {
            try {
                gu.a(byteArrayOutputStream, "1.2." + a + "." + b);
                gu.a(byteArrayOutputStream, "Android");
                gu.a(byteArrayOutputStream, gn.u(context));
                gu.a(byteArrayOutputStream, gn.m(context));
                gu.a(byteArrayOutputStream, gn.h(context));
                gu.a(byteArrayOutputStream, Build.MANUFACTURER);
                gu.a(byteArrayOutputStream, Build.MODEL);
                gu.a(byteArrayOutputStream, Build.DEVICE);
                gu.a(byteArrayOutputStream, gn.x(context));
                gu.a(byteArrayOutputStream, gj.c(context));
                gu.a(byteArrayOutputStream, gj.d(context));
                gu.a(byteArrayOutputStream, gj.f(context));
                byteArrayOutputStream.write(new byte[]{0});
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                hn.c(th2, "sm", "gh");
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                throw th3;
            }
        }
        return byteArray;
    }
}
