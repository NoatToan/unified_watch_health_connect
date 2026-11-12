package defpackage;

import com.huawei.haf.application.BaseApplication;
import health.compact.a.HealthWhiteBoxManager;

/* JADX INFO: loaded from: classes4.dex */
public class cqh {
    public static byte[] e(byte[] bArr) {
        return HealthWhiteBoxManager.c(BaseApplication.b()).a(bArr);
    }

    public static String c(int i, int i2) {
        return HealthWhiteBoxManager.c(BaseApplication.b()).c(i, i2);
    }
}
