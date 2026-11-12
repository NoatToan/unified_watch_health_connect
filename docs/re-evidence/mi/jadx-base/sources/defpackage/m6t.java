package defpackage;

import android.content.Context;
import android.os.Build;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class m6t extends o6t {
    public static int d = 13;
    public static int e = 6;
    public Context c;

    public m6t(Context context, o6t o6tVar) {
        super(o6tVar);
        this.c = context;
    }

    public static byte[] d(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = new byte[0];
        try {
            try {
                p0t.k(byteArrayOutputStream, "1.2." + d + "." + e);
                p0t.k(byteArrayOutputStream, YRNConstants.PLATFORM);
                p0t.k(byteArrayOutputStream, h0t.N());
                p0t.k(byteArrayOutputStream, h0t.G());
                p0t.k(byteArrayOutputStream, h0t.D(context));
                p0t.k(byteArrayOutputStream, Build.MANUFACTURER);
                p0t.k(byteArrayOutputStream, Build.MODEL);
                p0t.k(byteArrayOutputStream, Build.DEVICE);
                p0t.k(byteArrayOutputStream, h0t.R());
                p0t.k(byteArrayOutputStream, e0t.g(context));
                p0t.k(byteArrayOutputStream, e0t.i(context));
                p0t.k(byteArrayOutputStream, e0t.k(context));
                byteArrayOutputStream.write(new byte[]{0});
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                m2t.r(th2, "sm", "gh");
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

    @Override // defpackage.o6t
    public final byte[] b(byte[] bArr) {
        byte[] bArrD = d(this.c);
        byte[] bArr2 = new byte[bArrD.length + bArr.length];
        System.arraycopy(bArrD, 0, bArr2, 0, bArrD.length);
        System.arraycopy(bArr, 0, bArr2, bArrD.length, bArr.length);
        return bArr2;
    }
}
