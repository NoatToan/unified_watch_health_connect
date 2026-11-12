package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Build;
import com.huawei.agconnect.apms.Agent;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class lp extends lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3070a = 13;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f3071b = 6;
    private Context e;

    public lp(Context context, lr lrVar) {
        super(lrVar);
        this.e = context;
    }

    @Override // com.amap.api.col.p0003sl.lr
    protected final byte[] a(byte[] bArr) {
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
            iy.a(byteArrayOutputStream, "1.2." + f3070a + "." + f3071b);
            iy.a(byteArrayOutputStream, Agent.OS_NAME);
            iy.a(byteArrayOutputStream, ip.k());
            iy.a(byteArrayOutputStream, ip.h());
            iy.a(byteArrayOutputStream, ip.f(context));
            iy.a(byteArrayOutputStream, Build.MANUFACTURER);
            iy.a(byteArrayOutputStream, Build.MODEL);
            iy.a(byteArrayOutputStream, Build.DEVICE);
            iy.a(byteArrayOutputStream, ip.n());
            iy.a(byteArrayOutputStream, il.c(context));
            iy.a(byteArrayOutputStream, il.d(context));
            iy.a(byteArrayOutputStream, il.f(context));
            byteArrayOutputStream.write(new byte[]{0});
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                jv.c(th, "sm", "gh");
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return byteArray;
    }
}
