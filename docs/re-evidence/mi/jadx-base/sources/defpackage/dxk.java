package defpackage;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class dxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f16036a = a();

    public static boolean a() {
        String str = Build.TAGS;
        int i = 0;
        boolean z = true;
        boolean z2 = str != null && str.contains("test-keys");
        if (!z2) {
            String[] strArr = {"/system/bin/su", "/system/xbin/su"};
            while (true) {
                if (i >= 2) {
                    z = z2;
                    break;
                }
                if (new File(strArr[i]).exists()) {
                    break;
                }
                i++;
            }
        } else {
            z = z2;
            break;
        }
        if (z) {
            qr5.d("Current device is rooted");
        }
        return z;
    }

    public static boolean b() {
        return f16036a;
    }
}
