package health.compact.a;

import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes3.dex */
public class WhiteBoxManager {
    private static WhiteBoxManager d;
    private static final Object e = new Object();

    public static WhiteBoxManager b() {
        WhiteBoxManager whiteBoxManager;
        synchronized (e) {
            if (d == null) {
                d = new WhiteBoxManager();
            }
            whiteBoxManager = d;
        }
        return whiteBoxManager;
    }

    public byte[] e(String str) {
        return HealthWhiteBoxManager.c(BaseApplication.getContext()).d(str);
    }

    public byte[] a(byte[] bArr) {
        return HealthWhiteBoxManager.c(BaseApplication.getContext()).a(bArr);
    }

    public String a(int i, int i2) {
        return HealthWhiteBoxManager.c(BaseApplication.getContext()).c(i, i2);
    }

    public byte[] d(int i, byte[] bArr, byte[] bArr2) {
        return HealthWhiteBoxManager.c(BaseApplication.getContext()).e(i, bArr, bArr2);
    }
}
