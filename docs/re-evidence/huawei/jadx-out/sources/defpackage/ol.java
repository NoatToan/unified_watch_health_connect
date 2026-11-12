package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ol {
    public static ol d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44352a;

    public static boolean a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static ol e() {
        if (d == null) {
            d = new ol();
        }
        return d;
    }

    public String b() {
        return pd.c(null, this.f44352a);
    }

    public void b(Context context) {
        my.a();
        this.f44352a = context.getApplicationContext();
    }

    public Context c() {
        return this.f44352a;
    }

    public my d() {
        return my.a();
    }
}
