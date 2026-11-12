package defpackage;

import android.content.Context;
import android.os.Build;
import com.xiaomi.push.ig;

/* JADX INFO: loaded from: classes11.dex */
public class qps {
    public static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    public static boolean b(Context context, String str, long j) {
        if (vas.d(context).m(ig.DCJobMutualSwitch.a(), false)) {
            return (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !w4s.a(context, str, j);
        }
        return false;
    }

    public static byte[] c(String str, byte[] bArr) {
        byte[] bArrB = ecs.b(str);
        try {
            a(bArrB);
            return hxs.b(bArrB, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(String str, byte[] bArr) {
        byte[] bArrB = ecs.b(str);
        try {
            a(bArrB);
            return hxs.c(bArrB, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
