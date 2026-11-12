package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.o0.b;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class nb {
    public static String d() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bArrE = nd.e(iCurrentTimeMillis);
        byte[] bArrE2 = nd.e(iNanoTime);
        byte[] bArrE3 = nd.e(iNextInt);
        byte[] bArrE4 = nd.e(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrE, 0, bArr, 0, 4);
        System.arraycopy(bArrE2, 0, bArr, 4, 4);
        System.arraycopy(bArrE3, 0, bArr, 8, 4);
        System.arraycopy(bArrE4, 0, bArr, 12, 4);
        return b.c(bArr, 2);
    }

    public static String e() {
        String strB = nh.b("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(strB)) {
            strB = nh.b("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(strB) ? b() : strB;
    }

    public static String b() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        return "";
    }

    public static String a(Context context) {
        String strE = nf.b(null) ? e() : null;
        return nf.b(strE) ? d() : strE;
    }
}
