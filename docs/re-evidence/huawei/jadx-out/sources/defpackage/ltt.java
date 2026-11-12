package defpackage;

import android.content.Context;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class ltt {
    private static final Object d = new Object();

    public static void a(Context context) {
        synchronized (d) {
            try {
                try {
                    System.loadLibrary("sqlcipher");
                } catch (UnsatisfiedLinkError e) {
                    ReleaseLogUtil.b("R_DatabaseLoadUtils", "loadLibs exception ", ExceptionUtils.c(e));
                    throw new UnsatisfiedLinkError("loadLib：libsqlcipher.so throw exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
