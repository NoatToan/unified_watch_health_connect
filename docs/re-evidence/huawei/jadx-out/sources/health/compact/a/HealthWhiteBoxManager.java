package health.compact.a;

import android.content.Context;
import com.huawei.whitebox.NdkJniUtils;

/* JADX INFO: loaded from: classes3.dex */
public class HealthWhiteBoxManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HealthWhiteBoxManager f36576b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NdkJniUtils f36577a = new NdkJniUtils();
    private Context e;

    private HealthWhiteBoxManager(Context context) {
        this.e = context;
    }

    public static HealthWhiteBoxManager c(Context context) {
        HealthWhiteBoxManager healthWhiteBoxManager;
        synchronized (d) {
            if (f36576b == null) {
                f36576b = new HealthWhiteBoxManager(context);
            }
            healthWhiteBoxManager = f36576b;
        }
        return healthWhiteBoxManager;
    }

    public byte[] d(String str) {
        if (!this.f36577a.isAuthChecked()) {
            this.f36577a.executeAuth(this.e);
        }
        return this.f36577a.encrypt(str);
    }

    public byte[] a(byte[] bArr) {
        if (!this.f36577a.isAuthChecked()) {
            this.f36577a.executeAuth(this.e);
        }
        return this.f36577a.decrypt(bArr);
    }

    public String c(int i, int i2) {
        if (!this.f36577a.isAuthChecked()) {
            this.f36577a.executeAuth(this.e);
        }
        return this.f36577a.getStorageInfo(i, i2);
    }

    public byte[] e(int i, byte[] bArr, byte[] bArr2) {
        if (!this.f36577a.isAuthChecked()) {
            this.f36577a.executeAuth(this.e);
        }
        return this.f36577a.b(i, bArr, bArr2);
    }
}
