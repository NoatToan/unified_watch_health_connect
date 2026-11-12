package com.loc;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes18.dex */
public final class bh extends bj {
    public static int a = 13;
    public static int b = 6;
    private Context e;

    public bh(Context context, bj bjVar) {
        super(bjVar);
        this.e = context;
    }

    private static byte[] a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = new byte[0];
        try {
            try {
                u.a(byteArrayOutputStream, "1.2." + a + "." + b);
                u.a(byteArrayOutputStream, "Android");
                u.a(byteArrayOutputStream, n.w(context));
                u.a(byteArrayOutputStream, n.m(context));
                u.a(byteArrayOutputStream, n.h(context));
                u.a(byteArrayOutputStream, Build.MANUFACTURER);
                u.a(byteArrayOutputStream, Build.MODEL);
                u.a(byteArrayOutputStream, Build.DEVICE);
                u.a(byteArrayOutputStream, n.z(context));
                u.a(byteArrayOutputStream, k.c(context));
                u.a(byteArrayOutputStream, k.d(context));
                u.a(byteArrayOutputStream, k.f(context));
                byteArrayOutputStream.write(new byte[]{0});
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                ab.b(th2, "sm", "gh");
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

    @Override // com.loc.bj
    public final byte[] a(byte[] bArr) {
        byte[] bArrA = a(this.e);
        byte[] bArr2 = new byte[bArrA.length + bArr.length];
        System.arraycopy(bArrA, 0, bArr2, 0, bArrA.length);
        System.arraycopy(bArr, 0, bArr2, bArrA.length, bArr.length);
        return bArr2;
    }
}
